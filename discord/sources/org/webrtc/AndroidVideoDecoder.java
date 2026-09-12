package org.webrtc;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.SystemClock;
import android.view.Surface;
import com.discord.DiscordDecoderStreamManager;
import com.discord.jank_stats.JankRecordStore;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes4.dex */
public class AndroidVideoDecoder implements VideoDecoder, VideoSink {
    private static final int DEQUEUE_INPUT_TIMEOUT_US = 500000;
    private static final int DEQUEUE_OUTPUT_BUFFER_TIMEOUT_US = 100000;
    private static final int MEDIA_CODEC_RELEASE_TIMEOUT_MS = 5000;
    private static final String TAG = "AndroidVideoDecoder";
    private VideoDecoder.Callback callback;
    private MediaCodecWrapper codec;
    private final String codecName;
    private final VideoCodecMimeType codecType;
    private int colorFormat;
    private ThreadUtils.ThreadChecker decoderThreadChecker;
    private Consumer<Surface> externalSurfaceConsumerListener;
    private final BlockingDeque<FrameInfo> frameInfos;
    private boolean hasDecodedFirstFrame;
    private boolean hasExternalConsumer;
    private int height;
    private boolean keyFrameRequired;
    private final MediaCodecWrapperFactory mediaCodecWrapperFactory;
    private Thread outputThread;
    private ThreadUtils.ThreadChecker outputThreadChecker;
    private DecodedTextureMetadata renderedTextureMetadata;
    private volatile boolean running;
    private final EglBase.Context sharedContext;
    private volatile Exception shutdownException;
    private int sliceHeight;
    private String streamId;
    private int stride;
    private Surface surface;
    private SurfaceTextureHelper surfaceTextureHelper;
    private int width;
    private final Object dimensionLock = new Object();
    private final Object renderedTextureMetadataLock = new Object();

    public static class DecodedTextureMetadata {
        final Integer decodeTimeMs;
        final long presentationTimestampUs;

        public DecodedTextureMetadata(long j, Integer num) {
            this.presentationTimestampUs = j;
            this.decodeTimeMs = num;
        }
    }

    public static class FrameInfo {
        final long decodeStartTimeMs;
        final int rotation;

        public FrameInfo(long j, int i7) {
            this.decodeStartTimeMs = j;
            this.rotation = i7;
        }
    }

    public AndroidVideoDecoder(MediaCodecWrapperFactory mediaCodecWrapperFactory, String str, VideoCodecMimeType videoCodecMimeType, int i7, EglBase.Context context) {
        if (!isSupportedColorFormat(i7)) {
            throw new IllegalArgumentException(kk.b.h(i7, "Unsupported color format: "));
        }
        this.mediaCodecWrapperFactory = mediaCodecWrapperFactory;
        this.codecName = str;
        this.codecType = videoCodecMimeType;
        this.colorFormat = i7;
        this.sharedContext = context;
        this.frameInfos = new LinkedBlockingDeque();
    }

    private VideoFrame.Buffer copyI420Buffer(ByteBuffer byteBuffer, int i7, int i10, int i11, int i12) {
        if (i7 % 2 != 0) {
            throw new AssertionError(kk.b.h(i7, "Stride is not divisible by two: "));
        }
        int i13 = (i11 + 1) / 2;
        int i14 = i10 % 2;
        int i15 = i14 == 0 ? (i12 + 1) / 2 : i12 / 2;
        int i16 = i7 / 2;
        int i17 = i7 * i10;
        int i18 = i16 * i15;
        int i19 = ((i16 * i10) / 2) + i17;
        int i20 = i19 + i18;
        VideoFrame.I420Buffer i420BufferAllocateI420Buffer = allocateI420Buffer(i11, i12);
        copyPlane(byteBuffer.slice(), i7, i420BufferAllocateI420Buffer.getDataY(), i420BufferAllocateI420Buffer.getStrideY(), i11, i12);
        copyPlane(byteBuffer.slice(), i16, i420BufferAllocateI420Buffer.getDataU(), i420BufferAllocateI420Buffer.getStrideU(), i13, i15);
        if (i14 == 1) {
            ByteBuffer dataU = i420BufferAllocateI420Buffer.getDataU();
            dataU.put(byteBuffer);
        }
        copyPlane(byteBuffer.slice(), i16, i420BufferAllocateI420Buffer.getDataV(), i420BufferAllocateI420Buffer.getStrideV(), i13, i15);
        if (i14 == 1) {
            ByteBuffer dataV = i420BufferAllocateI420Buffer.getDataV();
            dataV.put(byteBuffer);
        }
        return i420BufferAllocateI420Buffer;
    }

    private VideoFrame.Buffer copyNV12ToI420Buffer(ByteBuffer byteBuffer, int i7, int i10, int i11, int i12) {
        return new NV12Buffer(i11, i12, i7, i10, byteBuffer, null).toI420();
    }

    private Thread createOutputThread() {
        return new Thread("AndroidVideoDecoder.outputThread") { // from class: org.webrtc.AndroidVideoDecoder.1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() throws Throwable {
                AndroidVideoDecoder.this.outputThreadChecker = new ThreadUtils.ThreadChecker();
                while (AndroidVideoDecoder.this.running) {
                    AndroidVideoDecoder.this.deliverDecodedFrame();
                }
                AndroidVideoDecoder.this.releaseCodecOnOutputThread();
            }
        };
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x008a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void deliverByteFrame(int r9, android.media.MediaCodec.BufferInfo r10, int r11, java.lang.Integer r12) throws java.lang.Throwable {
        /*
            r8 = this;
            java.lang.Object r1 = r8.dimensionLock
            monitor-enter(r1)
            int r6 = r8.width     // Catch: java.lang.Throwable -> L85
            int r7 = r8.height     // Catch: java.lang.Throwable -> L85
            int r0 = r8.stride     // Catch: java.lang.Throwable -> L85
            int r5 = r8.sliceHeight     // Catch: java.lang.Throwable -> L85
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L85
            int r1 = r10.size
            int r2 = r6 * r7
            int r2 = r2 * 3
            int r2 = r2 / 2
            if (r1 >= r2) goto L2a
            java.lang.String r9 = "AndroidVideoDecoder"
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "Insufficient output buffer size: "
            r10.<init>(r11)
            r10.append(r1)
            java.lang.String r10 = r10.toString()
            org.webrtc.Logging.e(r9, r10)
            return
        L2a:
            int r2 = r0 * r7
            int r2 = r2 * 3
            int r2 = r2 / 2
            if (r1 >= r2) goto L3c
            if (r5 != r7) goto L3c
            if (r0 <= r6) goto L3c
            int r1 = r1 * 2
            int r0 = r7 * 3
            int r0 = r1 / r0
        L3c:
            r4 = r0
            org.webrtc.MediaCodecWrapper r0 = r8.codec
            java.nio.ByteBuffer r0 = r0.getOutputBuffer(r9)
            int r1 = r10.offset
            java.nio.Buffer r1 = r0.position(r1)
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
            int r1 = r10.offset
            int r2 = r10.size
            int r1 = r1 + r2
            java.nio.Buffer r1 = r0.limit(r1)
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
            java.nio.ByteBuffer r3 = r0.slice()
            int r0 = r8.colorFormat
            r1 = 19
            if (r0 != r1) goto L66
            r2 = r8
            org.webrtc.VideoFrame$Buffer r0 = r2.copyI420Buffer(r3, r4, r5, r6, r7)
            goto L6b
        L66:
            r2 = r8
            org.webrtc.VideoFrame$Buffer r0 = r2.copyNV12ToI420Buffer(r3, r4, r5, r6, r7)
        L6b:
            org.webrtc.MediaCodecWrapper r1 = r2.codec
            r3 = 0
            r1.releaseOutputBuffer(r9, r3)
            long r9 = r10.presentationTimeUs
            r3 = 1000(0x3e8, double:4.94E-321)
            long r9 = r9 * r3
            org.webrtc.VideoFrame r1 = new org.webrtc.VideoFrame
            r1.<init>(r0, r11, r9)
            org.webrtc.VideoDecoder$Callback r9 = r2.callback
            r10 = 0
            r9.onDecodedFrame(r1, r12, r10)
            r1.release()
            return
        L85:
            r0 = move-exception
            r2 = r8
        L87:
            r9 = r0
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8a
            throw r9
        L8a:
            r0 = move-exception
            goto L87
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.AndroidVideoDecoder.deliverByteFrame(int, android.media.MediaCodec$BufferInfo, int, java.lang.Integer):void");
    }

    private void deliverTextureFrame(int i7, MediaCodec.BufferInfo bufferInfo, int i10, Integer num) {
        int i11;
        int i12;
        synchronized (this.dimensionLock) {
            i11 = this.width;
            i12 = this.height;
        }
        synchronized (this.renderedTextureMetadataLock) {
            try {
                if (this.hasExternalConsumer) {
                    this.codec.releaseOutputBuffer(i7, true);
                    VideoFrame videoFrame = new VideoFrame(new MockBuffer(i11, i12), i10, bufferInfo.presentationTimeUs * 1000);
                    VideoDecoder.Callback callback = this.callback;
                    if (callback != null) {
                        callback.onDecodedFrame(videoFrame, num, null);
                    }
                    videoFrame.release();
                    return;
                }
                if (this.renderedTextureMetadata != null) {
                    this.codec.releaseOutputBuffer(i7, false);
                    return;
                }
                if (i11 > 0 && i12 > 0) {
                    this.surfaceTextureHelper.setTextureSize(i11, i12);
                    this.surfaceTextureHelper.setFrameRotation(i10);
                    this.renderedTextureMetadata = new DecodedTextureMetadata(bufferInfo.presentationTimeUs, num);
                    this.codec.releaseOutputBuffer(i7, true);
                    return;
                }
                this.codec.releaseOutputBuffer(i7, false);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private VideoCodecStatus initDecodeInternal(int i7, int i10) {
        this.decoderThreadChecker.checkIsOnValidThread();
        String str = this.codecName;
        String strValueOf = String.valueOf(this.codecType);
        int i11 = this.colorFormat;
        StringBuilder sbU = a3.e.u("initDecodeInternal name: ", str, " type: ", strValueOf, " width: ");
        a3.e.z(sbU, i7, " height: ", i10, " color format: ");
        sbU.append(i11);
        Logging.d(TAG, sbU.toString());
        if (this.outputThread != null) {
            Logging.e(TAG, "initDecodeInternal called while the codec is already running");
            return VideoCodecStatus.FALLBACK_SOFTWARE;
        }
        this.width = i7;
        this.height = i10;
        this.stride = i7;
        this.sliceHeight = i10;
        this.hasDecodedFirstFrame = false;
        this.keyFrameRequired = true;
        try {
            this.codec = this.mediaCodecWrapperFactory.createByCodecName(this.codecName);
            try {
                MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(this.codecType.mimeType(), i7, i10);
                if (this.sharedContext == null) {
                    mediaFormatCreateVideoFormat.setInteger("color-format", this.colorFormat);
                }
                this.codec.configure(mediaFormatCreateVideoFormat, this.surface, null, 0);
                this.codec.start();
                this.running = true;
                Thread threadCreateOutputThread = createOutputThread();
                this.outputThread = threadCreateOutputThread;
                threadCreateOutputThread.start();
                Logging.d(TAG, "initDecodeInternal done");
                return VideoCodecStatus.OK;
            } catch (IllegalArgumentException e10) {
                e = e10;
                Logging.e(TAG, "initDecode failed", e);
                release();
                return VideoCodecStatus.FALLBACK_SOFTWARE;
            } catch (IllegalStateException e11) {
                e = e11;
                Logging.e(TAG, "initDecode failed", e);
                release();
                return VideoCodecStatus.FALLBACK_SOFTWARE;
            }
        } catch (IOException | IllegalArgumentException | IllegalStateException unused) {
            Logging.e(TAG, "Cannot create media decoder " + this.codecName);
            return VideoCodecStatus.FALLBACK_SOFTWARE;
        }
    }

    private boolean isSupportedColorFormat(int i7) {
        for (int i10 : MediaCodecUtils.DECODER_COLOR_FORMATS) {
            if (i10 == i7) {
                return true;
            }
        }
        return false;
    }

    private void maybeBindCodecOutputSurfaceUnderLock() {
        Surface surface;
        if (this.codec == null || (surface = this.surface) == null || !surface.isValid()) {
            return;
        }
        try {
            this.codec.setOutputSurface(this.surface);
        } catch (IllegalArgumentException | IllegalStateException e10) {
            Logging.e(TAG, "maybeBindCodecOutputSurfaceUnderLock setOutputSurface failed streamId=" + this.streamId, e10);
        }
    }

    private VideoCodecStatus maybeInitDecodeDeferredSurfaceDirect() {
        String str;
        Surface streamConsumer;
        int i7;
        int i10;
        if (this.codec != null) {
            return VideoCodecStatus.OK;
        }
        if (!DiscordDecoderStreamManager.isSurfaceDirectPathEnabled() || (str = this.streamId) == null || str.isEmpty() || !this.hasExternalConsumer) {
            return VideoCodecStatus.OK;
        }
        synchronized (this.renderedTextureMetadataLock) {
            try {
                Surface surface = this.surface;
                streamConsumer = (surface == null || !surface.isValid()) ? null : this.surface;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (streamConsumer == null) {
            streamConsumer = DiscordDecoderStreamManager.getStreamConsumer(this.streamId);
        }
        if (streamConsumer == null || !streamConsumer.isValid()) {
            return VideoCodecStatus.NO_OUTPUT;
        }
        synchronized (this.dimensionLock) {
            i7 = this.width;
            i10 = this.height;
        }
        if (i7 > 0 && i10 > 0) {
            synchronized (this.renderedTextureMetadataLock) {
                this.surface = streamConsumer;
            }
            return initDecodeInternal(i7, i10);
        }
        Logging.e(TAG, "maybeInitDecodeDeferredSurfaceDirect invalid dimensions w=" + i7 + " h=" + i10);
        return VideoCodecStatus.ERROR;
    }

    private void reformat(MediaFormat mediaFormat) {
        int integer;
        int integer2;
        this.outputThreadChecker.checkIsOnValidThread();
        Logging.d(TAG, "Decoder format changed: ".concat(String.valueOf(mediaFormat)));
        if (mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top")) {
            integer = (mediaFormat.getInteger("crop-right") + 1) - mediaFormat.getInteger("crop-left");
            integer2 = (mediaFormat.getInteger("crop-bottom") + 1) - mediaFormat.getInteger("crop-top");
        } else {
            integer = mediaFormat.getInteger("width");
            integer2 = mediaFormat.getInteger("height");
        }
        synchronized (this.dimensionLock) {
            try {
                int i7 = this.width;
                if (integer != i7 || integer2 != this.height) {
                    if (this.hasDecodedFirstFrame) {
                        stopOnOutputThread(new RuntimeException("Unexpected size change. Configured " + this.width + "*" + this.height + ". New " + integer + "*" + integer2));
                        return;
                    }
                    if (integer > 0 && integer2 > 0) {
                        this.width = integer;
                        this.height = integer2;
                    }
                    Logging.w(TAG, "Unexpected format dimensions. Configured " + i7 + "*" + this.height + ". New " + integer + "*" + integer2 + ". Skip it");
                    return;
                }
                if (this.surface == null && mediaFormat.containsKey("color-format")) {
                    int integer3 = mediaFormat.getInteger("color-format");
                    this.colorFormat = integer3;
                    Logging.d(TAG, "Color: 0x" + Integer.toHexString(integer3));
                    if (!isSupportedColorFormat(this.colorFormat)) {
                        stopOnOutputThread(new IllegalStateException(kk.b.h(this.colorFormat, "Unsupported color format: ")));
                        return;
                    }
                }
                synchronized (this.dimensionLock) {
                    try {
                        if (mediaFormat.containsKey("stride")) {
                            this.stride = mediaFormat.getInteger("stride");
                        }
                        if (mediaFormat.containsKey("slice-height")) {
                            this.sliceHeight = mediaFormat.getInteger("slice-height");
                        }
                        Logging.d(TAG, "Frame stride and slice height: " + this.stride + " x " + this.sliceHeight);
                        this.stride = Math.max(this.width, this.stride);
                        this.sliceHeight = Math.max(this.height, this.sliceHeight);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    private VideoCodecStatus reinitDecode(int i7, int i10) {
        this.decoderThreadChecker.checkIsOnValidThread();
        VideoCodecStatus videoCodecStatusReleaseInternal = releaseInternal();
        return videoCodecStatusReleaseInternal != VideoCodecStatus.OK ? videoCodecStatusReleaseInternal : initDecodeInternal(i7, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void releaseCodecOnOutputThread() {
        this.outputThreadChecker.checkIsOnValidThread();
        Logging.d(TAG, "Releasing MediaCodec on output thread");
        try {
            this.codec.stop();
        } catch (Exception e10) {
            Logging.e(TAG, "Media decoder stop failed", e10);
        }
        try {
            this.codec.release();
        } catch (Exception e11) {
            Logging.e(TAG, "Media decoder release failed", e11);
            this.shutdownException = e11;
        }
        Logging.d(TAG, "Release on output thread done");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private VideoCodecStatus releaseInternal() {
        if (!this.running) {
            Logging.d(TAG, "release: Decoder is not running.");
            return VideoCodecStatus.OK;
        }
        try {
            this.running = false;
            if (!ThreadUtils.joinUninterruptibly(this.outputThread, JankRecordStore.FIRST_FLUSH_DELAY_MS)) {
                Logging.e(TAG, "Media decoder release timeout", new RuntimeException());
                return VideoCodecStatus.TIMEOUT;
            }
            if (this.shutdownException == null) {
                Object[] objArr = objArr == true ? 1 : 0;
                return VideoCodecStatus.OK;
            }
            Logging.e(TAG, "Media decoder release error", new RuntimeException(this.shutdownException));
            this.shutdownException = null;
            return VideoCodecStatus.ERROR;
        } finally {
            this.codec = null;
            this.outputThread = null;
            this.frameInfos.clear();
        }
    }

    private void stopOnOutputThread(Exception exc) {
        this.outputThreadChecker.checkIsOnValidThread();
        this.running = false;
        this.shutdownException = exc;
    }

    public VideoFrame.I420Buffer allocateI420Buffer(int i7, int i10) {
        return JavaI420Buffer.allocate(i7, i10);
    }

    public void copyPlane(ByteBuffer byteBuffer, int i7, ByteBuffer byteBuffer2, int i10, int i11, int i12) {
        YuvHelper.copyPlane(byteBuffer, i7, byteBuffer2, i10, i11, i12);
    }

    public SurfaceTextureHelper createSurfaceTextureHelper() {
        return SurfaceTextureHelper.create("decoder-texture-thread", this.sharedContext);
    }

    @Override // org.webrtc.VideoDecoder
    public VideoCodecStatus decode(EncodedImage encodedImage, VideoDecoder.DecodeInfo decodeInfo) {
        int i7;
        int i10;
        VideoCodecStatus videoCodecStatusReinitDecode;
        this.decoderThreadChecker.checkIsOnValidThread();
        if (this.callback == null) {
            Logging.d(TAG, "decode uninitialized, callback null");
            return VideoCodecStatus.UNINITIALIZED;
        }
        VideoCodecStatus videoCodecStatusMaybeInitDecodeDeferredSurfaceDirect = maybeInitDecodeDeferredSurfaceDirect();
        VideoCodecStatus videoCodecStatus = VideoCodecStatus.OK;
        if (videoCodecStatusMaybeInitDecodeDeferredSurfaceDirect != videoCodecStatus) {
            return videoCodecStatusMaybeInitDecodeDeferredSurfaceDirect;
        }
        if (this.codec == null) {
            Logging.d(TAG, "decode uninitialized, codec null after deferred surface-direct init");
            return VideoCodecStatus.UNINITIALIZED;
        }
        ByteBuffer byteBuffer = encodedImage.buffer;
        if (byteBuffer == null) {
            Logging.e(TAG, "decode() - no input data");
            return VideoCodecStatus.ERR_PARAMETER;
        }
        int iRemaining = byteBuffer.remaining();
        if (iRemaining == 0) {
            Logging.e(TAG, "decode() - input buffer empty");
            return VideoCodecStatus.ERR_PARAMETER;
        }
        synchronized (this.dimensionLock) {
            i7 = this.width;
            i10 = this.height;
        }
        int i11 = encodedImage.encodedWidth;
        int i12 = encodedImage.encodedHeight;
        if (i11 * i12 > 0 && ((i11 != i7 || i12 != i10) && (videoCodecStatusReinitDecode = reinitDecode(i11, i12)) != videoCodecStatus)) {
            return videoCodecStatusReinitDecode;
        }
        if (this.keyFrameRequired && encodedImage.frameType != EncodedImage.FrameType.VideoFrameKey) {
            Logging.e(TAG, "decode() - key frame required first");
            return VideoCodecStatus.NO_OUTPUT;
        }
        try {
            int iDequeueInputBuffer = this.codec.dequeueInputBuffer(500000L);
            if (iDequeueInputBuffer < 0) {
                Logging.e(TAG, "decode() - no HW buffers available; decoder falling behind");
                return VideoCodecStatus.ERROR;
            }
            try {
                ByteBuffer inputBuffer = this.codec.getInputBuffer(iDequeueInputBuffer);
                if (inputBuffer.capacity() < iRemaining) {
                    Logging.e(TAG, "decode() - HW buffer too small");
                    return VideoCodecStatus.ERROR;
                }
                inputBuffer.put(encodedImage.buffer);
                this.frameInfos.offer(new FrameInfo(SystemClock.elapsedRealtime(), encodedImage.rotation));
                try {
                    this.codec.queueInputBuffer(iDequeueInputBuffer, 0, iRemaining, TimeUnit.NANOSECONDS.toMicros(encodedImage.captureTimeNs), 0);
                    if (this.keyFrameRequired) {
                        this.keyFrameRequired = false;
                    }
                    return videoCodecStatus;
                } catch (IllegalStateException e10) {
                    Logging.e(TAG, "queueInputBuffer failed", e10);
                    this.frameInfos.pollLast();
                    return VideoCodecStatus.ERROR;
                }
            } catch (IllegalStateException e11) {
                Logging.e(TAG, "getInputBuffer with index=" + iDequeueInputBuffer + " failed", e11);
                return VideoCodecStatus.ERROR;
            }
        } catch (IllegalStateException e12) {
            Logging.e(TAG, "dequeueInputBuffer failed", e12);
            return VideoCodecStatus.ERROR;
        }
    }

    public void deliverDecodedFrame() throws Throwable {
        Integer numValueOf;
        int i7;
        this.outputThreadChecker.checkIsOnValidThread();
        try {
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            int iDequeueOutputBuffer = this.codec.dequeueOutputBuffer(bufferInfo, 100000L);
            if (iDequeueOutputBuffer == -2) {
                reformat(this.codec.getOutputFormat());
                return;
            }
            if (iDequeueOutputBuffer < 0) {
                Logging.v(TAG, "dequeueOutputBuffer returned " + iDequeueOutputBuffer);
                return;
            }
            FrameInfo frameInfoPoll = this.frameInfos.poll();
            if (frameInfoPoll != null) {
                numValueOf = Integer.valueOf((int) (SystemClock.elapsedRealtime() - frameInfoPoll.decodeStartTimeMs));
                i7 = frameInfoPoll.rotation;
            } else {
                numValueOf = null;
                i7 = 0;
            }
            this.hasDecodedFirstFrame = true;
            if (this.surface != null) {
                deliverTextureFrame(iDequeueOutputBuffer, bufferInfo, i7, numValueOf);
            } else {
                deliverByteFrame(iDequeueOutputBuffer, bufferInfo, i7, numValueOf);
            }
        } catch (IllegalStateException e10) {
            Logging.e(TAG, "deliverDecodedFrame failed", e10);
        }
    }

    @Override // org.webrtc.VideoDecoder
    public String getImplementationName() {
        return this.codecName;
    }

    @Override // org.webrtc.VideoDecoder
    public VideoCodecStatus initDecode(VideoDecoder.Settings settings, VideoDecoder.Callback callback) {
        String str;
        this.decoderThreadChecker = new ThreadUtils.ThreadChecker();
        this.callback = callback;
        this.hasExternalConsumer = false;
        if (!DiscordDecoderStreamManager.isSurfaceDirectPathEnabled() || (str = this.streamId) == null || str.isEmpty()) {
            if (this.sharedContext != null) {
                try {
                    this.surfaceTextureHelper = createSurfaceTextureHelper();
                    this.surface = new Surface(this.surfaceTextureHelper.getSurfaceTexture());
                    this.surfaceTextureHelper.startListening(this);
                } catch (Throwable th2) {
                    Logging.e(TAG, "Error creating SurfaceTextureHelper", th2);
                    Surface surface = this.surface;
                    if (surface != null) {
                        surface.release();
                        this.surface = null;
                    }
                    SurfaceTextureHelper surfaceTextureHelper = this.surfaceTextureHelper;
                    if (surfaceTextureHelper != null) {
                        surfaceTextureHelper.dispose();
                        this.surfaceTextureHelper = null;
                    }
                    return VideoCodecStatus.FALLBACK_SOFTWARE;
                }
            }
            return initDecodeInternal(settings.width, settings.height);
        }
        Surface streamConsumer = DiscordDecoderStreamManager.getStreamConsumer(this.streamId);
        if (streamConsumer != null && streamConsumer.isValid()) {
            this.surface = streamConsumer;
            this.hasExternalConsumer = true;
            return initDecodeInternal(settings.width, settings.height);
        }
        this.hasExternalConsumer = true;
        Consumer<Surface> consumer = new Consumer() { // from class: org.webrtc.a
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.f17659a.lambda$initDecode$0((Surface) obj);
            }
        };
        this.externalSurfaceConsumerListener = consumer;
        DiscordDecoderStreamManager.addOnConsumerReadyListener(this.streamId, consumer);
        synchronized (this.dimensionLock) {
            int i7 = settings.width;
            this.width = i7;
            int i10 = settings.height;
            this.height = i10;
            this.stride = i7;
            this.sliceHeight = i10;
        }
        return VideoCodecStatus.OK;
    }

    @Override // org.webrtc.VideoSink
    public void onFrame(VideoFrame videoFrame) {
        long j;
        Integer num;
        synchronized (this.renderedTextureMetadataLock) {
            DecodedTextureMetadata decodedTextureMetadata = this.renderedTextureMetadata;
            if (decodedTextureMetadata == null) {
                throw new IllegalStateException("Rendered texture metadata was null in onTextureFrameAvailable.");
            }
            j = decodedTextureMetadata.presentationTimestampUs * 1000;
            num = decodedTextureMetadata.decodeTimeMs;
            this.renderedTextureMetadata = null;
        }
        this.callback.onDecodedFrame(new VideoFrame(videoFrame.getBuffer(), videoFrame.getRotation(), j), num, null);
    }

    @Override // org.webrtc.VideoDecoder
    public VideoCodecStatus release() {
        boolean z5;
        String str;
        Consumer<Surface> consumer;
        Logging.d(TAG, "release");
        VideoCodecStatus videoCodecStatusReleaseInternal = releaseInternal();
        if (DiscordDecoderStreamManager.isSurfaceDirectPathEnabled() && (str = this.streamId) != null && !str.isEmpty() && (consumer = this.externalSurfaceConsumerListener) != null) {
            DiscordDecoderStreamManager.removeOnConsumerReadyListener(this.streamId, consumer);
            this.externalSurfaceConsumerListener = null;
        }
        if (this.surface != null) {
            synchronized (this.renderedTextureMetadataLock) {
                z5 = this.hasExternalConsumer;
                this.hasExternalConsumer = false;
            }
            if (z5) {
                this.surface = null;
                SurfaceTextureHelper surfaceTextureHelper = this.surfaceTextureHelper;
                if (surfaceTextureHelper != null) {
                    surfaceTextureHelper.stopListening();
                    this.surfaceTextureHelper.dispose();
                    this.surfaceTextureHelper = null;
                }
            } else {
                releaseSurface();
                this.surface = null;
                this.surfaceTextureHelper.stopListening();
                this.surfaceTextureHelper.dispose();
                this.surfaceTextureHelper = null;
            }
        }
        synchronized (this.renderedTextureMetadataLock) {
            this.renderedTextureMetadata = null;
        }
        this.callback = null;
        return videoCodecStatusReleaseInternal;
    }

    public void releaseSurface() {
        this.surface.release();
    }

    @Override // org.webrtc.VideoDecoder
    @CalledByNative
    public void setStreamId(String str) {
        this.streamId = str;
        if (!DiscordDecoderStreamManager.isSurfaceDirectPathEnabled() || str == null || str.isEmpty()) {
            return;
        }
        DiscordDecoderStreamManager.registerStreamProducer(str, this);
    }

    /* JADX INFO: renamed from: tryUpdateSurface, reason: merged with bridge method [inline-methods] */
    public void lambda$initDecode$0(Surface surface) {
        synchronized (this.renderedTextureMetadataLock) {
            this.hasExternalConsumer = true;
            this.surface = surface;
            maybeBindCodecOutputSurfaceUnderLock();
        }
    }
}

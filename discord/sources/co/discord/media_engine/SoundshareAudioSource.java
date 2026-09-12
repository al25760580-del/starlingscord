package co.discord.media_engine;

import android.media.AudioRecord;
import android.os.Process;
import android.util.Log;
import com.facebook.react.devsupport.StackTraceHelper;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.webrtc.ThreadUtils;
import org.webrtc.TimestampAligner;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000 '2\u00020\u0001:\u0002&'B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\nH\u0002J\u001b\u0010\u0016\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0082 J\t\u0010\u0017\u001a\u00020\nH\u0082 J!\u0010\u0018\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\nH\u0082 J\u0011\u0010\u0019\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\nH\u0082 J)\u0010\u001a\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0082 J\u0006\u0010\u001d\u001a\u00020\u0013J\u0010\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0010\u0010!\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0010\u0010\"\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020 H\u0002J\u001e\u0010#\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010J\u000e\u0010$\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010%\u001a\u00020\u000eR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0018\u00010\u0006R\u00020\u0000X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lco/discord/media_engine/SoundshareAudioSource;", "", "()V", "audioRecord", "Landroid/media/AudioRecord;", "audioThread", "Lco/discord/media_engine/SoundshareAudioSource$AudioRecordThread;", "byteBuffer", "Ljava/nio/ByteBuffer;", "nativeInstance", "", "getNativeInstance", "()J", "released", "", "channelCountToConfiguration", "", "channels", "dataIsRecorded", "", "bytes", "timestampNanos", "nativeCacheDirectBufferAddress", "nativeCreateInstance", "nativeDataIsRecorded", "nativeDestroyInstance", "nativeSetSampleFormat", "sampleRate", "bitDepth", "release", "reportSoundshareAudioSourceError", "errorMessage", "", "reportSoundshareAudioSourceInitError", "reportSoundshareAudioSourceStartError", "setSampleFormat", "startRecording", "stopRecording", "AudioRecordThread", "Companion", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SoundshareAudioSource {
    private static final long AUDIO_RECORD_THREAD_JOIN_TIMEOUT_MS = 2000;
    private static final int BITS_PER_SAMPLE = 16;
    private static final int BUFFERS_PER_SECOND = 100;
    private static final int BUFFER_SIZE_FACTOR = 2;
    private static final int CALLBACK_BUFFER_SIZE_MS = 10;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String TAG = "SoundshareAudioSource";
    private static volatile boolean microphoneMute;
    private AudioRecord audioRecord;
    private AudioRecordThread audioThread;
    private ByteBuffer byteBuffer;
    private final long nativeInstance = nativeCreateInstance();
    private boolean released;

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0006\u0010\u0011\u001a\u00020\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lco/discord/media_engine/SoundshareAudioSource$AudioRecordThread;", "Ljava/lang/Thread;", StackTraceHelper.NAME_KEY, "", "audioRecord", "Landroid/media/AudioRecord;", "byteBuffer", "Ljava/nio/ByteBuffer;", "timestamp", "", "(Lco/discord/media_engine/SoundshareAudioSource;Ljava/lang/String;Landroid/media/AudioRecord;Ljava/nio/ByteBuffer;J)V", "emptyBytes", "", "keepAlive", "", "run", "", "stopThread", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class AudioRecordThread extends Thread {

        @NotNull
        private final AudioRecord audioRecord;

        @NotNull
        private final ByteBuffer byteBuffer;

        @NotNull
        private final byte[] emptyBytes;
        private volatile boolean keepAlive;
        final /* synthetic */ SoundshareAudioSource this$0;
        private long timestamp;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AudioRecordThread(@NotNull SoundshareAudioSource soundshareAudioSource, @NotNull String name, @NotNull AudioRecord audioRecord, ByteBuffer byteBuffer, long j) {
            super(name);
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(audioRecord, "audioRecord");
            Intrinsics.checkNotNullParameter(byteBuffer, "byteBuffer");
            this.this$0 = soundshareAudioSource;
            this.audioRecord = audioRecord;
            this.byteBuffer = byteBuffer;
            this.timestamp = j;
            this.keepAlive = true;
            this.emptyBytes = new byte[byteBuffer.capacity()];
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() throws Throwable {
            Process.setThreadPriority(-19);
            SoundshareAudioSource.INSTANCE.assertTrue(this.audioRecord.getRecordingState() == 3);
            while (this.keepAlive) {
                AudioRecord audioRecord = this.audioRecord;
                ByteBuffer byteBuffer = this.byteBuffer;
                int i7 = audioRecord.read(byteBuffer, byteBuffer.capacity());
                this.timestamp = TimestampAligner.getRtcTimeNanos();
                if (i7 == this.byteBuffer.capacity()) {
                    if (SoundshareAudioSource.microphoneMute) {
                        this.byteBuffer.clear();
                        this.byteBuffer.put(this.emptyBytes);
                    }
                    if (this.keepAlive) {
                        this.this$0.dataIsRecorded(i7, this.timestamp);
                    }
                } else {
                    String str = "AudioRecord.read failed: " + i7;
                    Log.e(SoundshareAudioSource.TAG, str);
                    if (i7 == -3) {
                        this.keepAlive = false;
                        this.this$0.reportSoundshareAudioSourceError(str);
                    }
                }
            }
            try {
                this.audioRecord.stop();
            } catch (IllegalStateException e10) {
                Log.e(SoundshareAudioSource.TAG, "AudioRecord.stop failed: " + e10.getMessage());
            }
        }

        public final void stopThread() {
            this.keepAlive = false;
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\rH\u0002J\u000e\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lco/discord/media_engine/SoundshareAudioSource$Companion;", "", "()V", "AUDIO_RECORD_THREAD_JOIN_TIMEOUT_MS", "", "BITS_PER_SAMPLE", "", "BUFFERS_PER_SECOND", "BUFFER_SIZE_FACTOR", "CALLBACK_BUFFER_SIZE_MS", "TAG", "", "microphoneMute", "", "assertTrue", "", "condition", "setMicrophoneMute", "mute", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void assertTrue(boolean condition) {
            if (!condition) {
                throw new AssertionError("Expected condition to be true");
            }
        }

        public final void setMicrophoneMute(boolean mute) {
            Log.w(SoundshareAudioSource.TAG, "setMicrophoneMute(" + mute + ")");
            SoundshareAudioSource.microphoneMute = mute;
        }

        private Companion() {
        }
    }

    private final int channelCountToConfiguration(int channels) {
        return channels == 1 ? 16 : 12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void dataIsRecorded(int bytes, long timestampNanos) throws Throwable {
        try {
            try {
                if (!this.released) {
                    nativeDataIsRecorded(this.nativeInstance, bytes, timestampNanos);
                }
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private final native synchronized void nativeCacheDirectBufferAddress(long nativeInstance, ByteBuffer byteBuffer);

    private final native synchronized long nativeCreateInstance();

    private final native void nativeDataIsRecorded(long nativeInstance, int bytes, long timestampNanos);

    private final native synchronized void nativeDestroyInstance(long nativeInstance);

    private final native void nativeSetSampleFormat(long nativeInstance, int sampleRate, int bitDepth, int channels);

    /* JADX INFO: Access modifiers changed from: private */
    public final void reportSoundshareAudioSourceError(String errorMessage) {
        Log.e(TAG, "Run-time recording error: " + errorMessage);
    }

    private final void reportSoundshareAudioSourceInitError(String errorMessage) {
        Log.e(TAG, "Init recording error: " + errorMessage);
    }

    private final void reportSoundshareAudioSourceStartError(String errorMessage) {
        Log.e(TAG, "Start recording error: " + errorMessage);
    }

    public final long getNativeInstance() {
        return this.nativeInstance;
    }

    public final synchronized void release() {
        try {
            if (!this.released) {
                AudioRecord audioRecord = this.audioRecord;
                if (audioRecord != null) {
                    audioRecord.release();
                }
                this.audioRecord = null;
                nativeDestroyInstance(this.nativeInstance);
                this.released = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void setSampleFormat(int sampleRate, int bitDepth, int channels) {
        nativeSetSampleFormat(this.nativeInstance, sampleRate, bitDepth, channels);
    }

    public final boolean startRecording(@NotNull AudioRecord audioRecord) {
        Intrinsics.checkNotNullParameter(audioRecord, "audioRecord");
        int channelCount = audioRecord.getChannelCount();
        int sampleRate = audioRecord.getSampleRate();
        if (this.audioRecord != null) {
            reportSoundshareAudioSourceInitError("StartRecording called twice without StopRecording.");
            return false;
        }
        this.audioRecord = audioRecord;
        setSampleFormat(sampleRate, 16, channelCount);
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect((sampleRate / 100) * channelCount * 2);
        this.byteBuffer = byteBufferAllocateDirect;
        nativeCacheDirectBufferAddress(this.nativeInstance, byteBufferAllocateDirect);
        int minBufferSize = AudioRecord.getMinBufferSize(sampleRate, channelCountToConfiguration(channelCount), 2);
        if (minBufferSize == -2 || minBufferSize == -1) {
            reportSoundshareAudioSourceInitError(kk.b.h(minBufferSize, "AudioRecord.getMinBufferSize failed: "));
            return false;
        }
        Math.max(minBufferSize * 2, byteBufferAllocateDirect.capacity());
        if (audioRecord.getState() != 1) {
            reportSoundshareAudioSourceInitError("Failed to create a new AudioRecord instance");
            release();
            return false;
        }
        try {
            try {
                INSTANCE.assertTrue(this.audioThread == null);
                long rtcTimeNanos = TimestampAligner.getRtcTimeNanos();
                try {
                    audioRecord.startRecording();
                    if (audioRecord.getRecordingState() != 3) {
                        reportSoundshareAudioSourceStartError("AudioRecord.startRecording failed - incorrect state :" + audioRecord.getRecordingState());
                        return false;
                    }
                    Intrinsics.checkNotNull(byteBufferAllocateDirect);
                    AudioRecordThread audioRecordThread = new AudioRecordThread(this, "SoundshareThread", audioRecord, byteBufferAllocateDirect, rtcTimeNanos);
                    this.audioThread = audioRecordThread;
                    Intrinsics.checkNotNull(audioRecordThread);
                    audioRecordThread.start();
                    return true;
                } catch (IllegalStateException e10) {
                    reportSoundshareAudioSourceStartError("AudioRecord.startRecording failed: " + e10.getMessage());
                    return false;
                }
            } catch (Throwable th2) {
                Log.e(TAG, "WebrtcAudioRecord.startRecording: audioThread != null!", th2);
                throw th2;
            }
        } catch (Throwable th3) {
            Log.e(TAG, "SoundshareAudioSource.startRecording fail hard!", th3);
            throw th3;
        }
    }

    public final boolean stopRecording() {
        AudioRecordThread audioRecordThread = this.audioThread;
        if (audioRecordThread == null) {
            return false;
        }
        audioRecordThread.stopThread();
        if (!ThreadUtils.joinUninterruptibly(audioRecordThread, AUDIO_RECORD_THREAD_JOIN_TIMEOUT_MS)) {
            Log.e(TAG, "Join of SoundshareThread timed out");
        }
        this.audioThread = null;
        return true;
    }
}

package com.linecorp.apng.decoder;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Trace;
import com.facebook.react.devsupport.StackTraceHelper;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 <2\u00020\u0001:\u0002=<BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\t\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0010J7\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010!R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010!R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010\u001f\u001a\u0004\b+\u0010!R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001a\u00102\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010\u001f\u001a\u0004\b1\u0010!R\u0011\u00104\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b3\u0010!R\u0011\u00106\u001a\u0002058F¢\u0006\u0006\u001a\u0004\b6\u00107R\u0011\u0010;\u001a\u0002088F¢\u0006\u0006\u001a\u0004\b9\u0010:¨\u0006>"}, d2 = {"Lcom/linecorp/apng/decoder/Apng;", "", "", StackTraceHelper.ID_KEY, "width", "height", "frameCount", "", "frameDurations", "loopCount", "", "allFrameByteCount", "<init>", "(IIII[IIJ)V", "", "recycle", "()V", "copy", "()Lcom/linecorp/apng/decoder/Apng;", "finalize", "frameIndex", "Landroid/graphics/Canvas;", "canvas", "Landroid/graphics/Rect;", "src", "dst", "Landroid/graphics/Paint;", "paint", "drawWithIndex", "(ILandroid/graphics/Canvas;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V", "b", "I", "getWidth", "()I", "c", "getHeight", "d", "getFrameCount", "e", "[I", "getFrameDurations", "()[I", "f", "getLoopCount", "g", "J", "getAllFrameByteCount", "()J", "i", "getDuration", "duration", "getByteCount", "byteCount", "", "isRecycled", "()Z", "Landroid/graphics/Bitmap$Config;", "getConfig", "()Landroid/graphics/Bitmap$Config;", "config", "Companion", "DecodeResult", "apng-drawable_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Apng {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final int width;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final int height;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final int frameCount;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final int[] frameDurations;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final int loopCount;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final long allFrameByteCount;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Bitmap f6882h;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public final int duration;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/linecorp/apng/decoder/Apng$Companion;", "", "Ljava/io/InputStream;", "stream", "Lcom/linecorp/apng/decoder/Apng;", "decode", "(Ljava/io/InputStream;)Lcom/linecorp/apng/decoder/Apng;", "", "isApng", "(Ljava/io/InputStream;)Z", "apng", "copy", "(Lcom/linecorp/apng/decoder/Apng;)Lcom/linecorp/apng/decoder/Apng;", "apng-drawable_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public final Apng copy(@NotNull Apng apng) throws ApngException {
            Intrinsics.checkNotNullParameter(apng, "apng");
            DecodeResult decodeResult = new DecodeResult();
            Trace.beginSection("Apng#copy");
            try {
                int iCopy = ApngDecoderJni.copy(apng.f6875a, decodeResult);
                Trace.endSection();
                if (iCopy < 0) {
                    throw new ApngException(ApngException.ErrorCode.INSTANCE.fromErrorCode$apng_drawable_release(iCopy), null, 2, 0 == true ? 1 : 0);
                }
                try {
                    return new Apng(iCopy, decodeResult.getWidth(), decodeResult.getHeight(), decodeResult.getFrameCount(), decodeResult.getFrameDurations(), decodeResult.getLoopCount(), decodeResult.getAllFrameByteCount());
                } catch (Throwable th2) {
                    throw new ApngException(th2);
                }
            } catch (Throwable th3) {
                try {
                    throw new ApngException(th3);
                } catch (Throwable th4) {
                    Trace.endSection();
                    throw th4;
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public final Apng decode(@NotNull InputStream stream) throws ApngException {
            Intrinsics.checkNotNullParameter(stream, "stream");
            DecodeResult decodeResult = new DecodeResult();
            Trace.beginSection("Apng#decode");
            try {
                int iDecode = ApngDecoderJni.decode(stream, decodeResult);
                Trace.endSection();
                if (iDecode < 0) {
                    throw new ApngException(ApngException.ErrorCode.INSTANCE.fromErrorCode$apng_drawable_release(iDecode), null, 2, 0 == true ? 1 : 0);
                }
                try {
                    return new Apng(iDecode, decodeResult.getWidth(), decodeResult.getHeight(), decodeResult.getFrameCount(), decodeResult.getFrameDurations(), decodeResult.getLoopCount(), decodeResult.getAllFrameByteCount());
                } catch (Throwable th2) {
                    throw new ApngException(th2);
                }
            } catch (Throwable th3) {
                try {
                    throw new ApngException(th3);
                } catch (Throwable th4) {
                    Trace.endSection();
                    throw th4;
                }
            }
        }

        public final boolean isApng(@NotNull InputStream stream) throws ApngException {
            Intrinsics.checkNotNullParameter(stream, "stream");
            try {
                return ApngDecoderJni.isApng(stream);
            } catch (Throwable th2) {
                throw new ApngException(th2);
            }
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001a\u0010\r\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001a\u0010\u0010\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/linecorp/apng/decoder/Apng$DecodeResult;", "", "<init>", "()V", "width", "", "getWidth", "()I", "setWidth", "(I)V", "height", "getHeight", "setHeight", "frameCount", "getFrameCount", "setFrameCount", "loopCount", "getLoopCount", "setLoopCount", "frameDurations", "", "getFrameDurations", "()[I", "setFrameDurations", "([I)V", "allFrameByteCount", "", "getAllFrameByteCount", "()J", "setAllFrameByteCount", "(J)V", "apng-drawable_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DecodeResult {
        private long allFrameByteCount;
        private int frameCount;

        @NotNull
        private int[] frameDurations = new int[0];
        private int height;
        private int loopCount;
        private int width;

        public final long getAllFrameByteCount() {
            return this.allFrameByteCount;
        }

        public final int getFrameCount() {
            return this.frameCount;
        }

        @NotNull
        public final int[] getFrameDurations() {
            return this.frameDurations;
        }

        public final int getHeight() {
            return this.height;
        }

        public final int getLoopCount() {
            return this.loopCount;
        }

        public final int getWidth() {
            return this.width;
        }

        public final void setAllFrameByteCount(long j) {
            this.allFrameByteCount = j;
        }

        public final void setFrameCount(int i7) {
            this.frameCount = i7;
        }

        public final void setFrameDurations(@NotNull int[] iArr) {
            Intrinsics.checkNotNullParameter(iArr, "<set-?>");
            this.frameDurations = iArr;
        }

        public final void setHeight(int i7) {
            this.height = i7;
        }

        public final void setLoopCount(int i7) {
            this.loopCount = i7;
        }

        public final void setWidth(int i7) {
            this.width = i7;
        }
    }

    public Apng(int i7, int i10, int i11, int i12, @NotNull int[] frameDurations, int i13, long j) {
        Intrinsics.checkNotNullParameter(frameDurations, "frameDurations");
        this.f6875a = i7;
        this.width = i10;
        this.height = i11;
        this.frameCount = i12;
        this.frameDurations = frameDurations;
        this.loopCount = i13;
        this.allFrameByteCount = j;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        this.f6882h = bitmapCreateBitmap;
        Trace.beginSection("Apng#draw");
        ApngDecoderJni.draw(i7, 0, bitmapCreateBitmap);
        Trace.endSection();
        Intrinsics.checkNotNullParameter(frameDurations, "<this>");
        int i14 = 0;
        for (int i15 : frameDurations) {
            i14 += i15;
        }
        this.duration = i14;
    }

    @NotNull
    public final Apng copy() {
        return INSTANCE.copy(this);
    }

    public final void drawWithIndex(int frameIndex, @NotNull Canvas canvas, Rect src, @NotNull Rect dst, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(dst, "dst");
        Intrinsics.checkNotNullParameter(paint, "paint");
        Trace.beginSection("Apng#draw");
        int i7 = this.f6875a;
        Bitmap bitmap = this.f6882h;
        ApngDecoderJni.draw(i7, frameIndex, bitmap);
        Trace.endSection();
        canvas.drawBitmap(bitmap, src, dst, paint);
    }

    public final void finalize() {
        recycle();
    }

    public final long getAllFrameByteCount() {
        return this.allFrameByteCount;
    }

    public final int getByteCount() {
        return this.f6882h.getAllocationByteCount();
    }

    @NotNull
    public final Bitmap.Config getConfig() {
        Bitmap.Config config = this.f6882h.getConfig();
        Intrinsics.checkNotNullExpressionValue(config, "getConfig(...)");
        return config;
    }

    public final int getDuration() {
        return this.duration;
    }

    public final int getFrameCount() {
        return this.frameCount;
    }

    @NotNull
    public final int[] getFrameDurations() {
        return this.frameDurations;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getLoopCount() {
        return this.loopCount;
    }

    public final int getWidth() {
        return this.width;
    }

    public final boolean isRecycled() {
        return this.f6882h.isRecycled();
    }

    public final void recycle() {
        ApngDecoderJni.recycle(this.f6875a);
    }
}

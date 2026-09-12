package app.rive.runtime.kotlin.core;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import com.rnlineargradient.LinearGradientManager;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import rn.d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0003H\u0096 ¨\u0006\t"}, d2 = {"Lapp/rive/runtime/kotlin/core/RiveRenderImage;", "Lapp/rive/runtime/kotlin/core/NativeObject;", "address", "", "(J)V", "cppDelete", "", "pointer", "Companion", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class RiveRenderImage extends NativeObject {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J1\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fH\u0082 J\u0011\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000fH\u0082 J\u0019\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\fH\u0082 J1\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fH\u0082 J2\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u000b\u001a\u00020\fJ\u0018\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0017\u001a\u00020\u0018J\u0018\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u00132\b\b\u0002\u0010\u0017\u001a\u00020\u0018J2\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u000b\u001a\u00020\fJ\u001a\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0017\u001a\u00020\u0018H\u0007¨\u0006\u001f"}, d2 = {"Lapp/rive/runtime/kotlin/core/RiveRenderImage$Companion;", "", "()V", "cppFromARGBInts", "", LinearGradientManager.PROP_COLORS, "", "width", "", "height", "rendererTypeIdx", "premultiplied", "", "cppFromBitmapCanvas", "bitmap", "Landroid/graphics/Bitmap;", "cppFromBitmapRive", "cppFromRGBABytes", "bytes", "", "fromARGBInts", "Lapp/rive/runtime/kotlin/core/RiveRenderImage;", "pixels", "rendererType", "Lapp/rive/runtime/kotlin/core/RendererType;", "fromBitmap", "fromEncoded", "encodedBytes", "fromRGBABytes", "pixelBytes", "make", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nFileAsset.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileAsset.kt\napp/rive/runtime/kotlin/core/RiveRenderImage$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,367:1\n1#2:368\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native long cppFromARGBInts(int[] colors, int width, int height, int rendererTypeIdx, boolean premultiplied);

        private final native long cppFromBitmapCanvas(Bitmap bitmap);

        private final native long cppFromBitmapRive(Bitmap bitmap, boolean premultiplied);

        private final native long cppFromRGBABytes(byte[] bytes, int width, int height, int rendererTypeIdx, boolean premultiplied);

        public static /* synthetic */ RiveRenderImage fromARGBInts$default(Companion companion, int[] iArr, int i7, int i10, RendererType rendererType, boolean z5, int i11, Object obj) {
            if ((i11 & 8) != 0) {
                rendererType = Rive.INSTANCE.getDefaultRendererType();
            }
            RendererType rendererType2 = rendererType;
            if ((i11 & 16) != 0) {
                z5 = false;
            }
            return companion.fromARGBInts(iArr, i7, i10, rendererType2, z5);
        }

        public static /* synthetic */ RiveRenderImage fromBitmap$default(Companion companion, Bitmap bitmap, RendererType rendererType, int i7, Object obj) {
            if ((i7 & 2) != 0) {
                rendererType = Rive.INSTANCE.getDefaultRendererType();
            }
            return companion.fromBitmap(bitmap, rendererType);
        }

        public static /* synthetic */ RiveRenderImage fromEncoded$default(Companion companion, byte[] bArr, RendererType rendererType, int i7, Object obj) {
            if ((i7 & 2) != 0) {
                rendererType = Rive.INSTANCE.getDefaultRendererType();
            }
            return companion.fromEncoded(bArr, rendererType);
        }

        public static /* synthetic */ RiveRenderImage fromRGBABytes$default(Companion companion, byte[] bArr, int i7, int i10, RendererType rendererType, boolean z5, int i11, Object obj) {
            if ((i11 & 8) != 0) {
                rendererType = Rive.INSTANCE.getDefaultRendererType();
            }
            RendererType rendererType2 = rendererType;
            if ((i11 & 16) != 0) {
                z5 = true;
            }
            return companion.fromRGBABytes(bArr, i7, i10, rendererType2, z5);
        }

        public static /* synthetic */ RiveRenderImage make$default(Companion companion, byte[] bArr, RendererType rendererType, int i7, Object obj) {
            if ((i7 & 2) != 0) {
                rendererType = Rive.INSTANCE.getDefaultRendererType();
            }
            return companion.make(bArr, rendererType);
        }

        @NotNull
        public final RiveRenderImage fromARGBInts(@NotNull int[] pixels, int width, int height, @NotNull RendererType rendererType, boolean premultiplied) {
            Intrinsics.checkNotNullParameter(pixels, "pixels");
            Intrinsics.checkNotNullParameter(rendererType, "rendererType");
            if (width <= 0 || height <= 0) {
                throw new IllegalArgumentException("Width and height must be > 0");
            }
            if (pixels.length != width * height) {
                throw new IllegalArgumentException("Colors must have size = width * height");
            }
            if (rendererType != RendererType.Canvas || premultiplied) {
                return new RiveRenderImage(cppFromARGBInts(pixels, width, height, rendererType.getValue(), premultiplied));
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(pixels, width, height, Bitmap.Config.ARGB_8888);
            Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
            bitmapCreateBitmap.setPremultiplied(true);
            return new RiveRenderImage(cppFromBitmapCanvas(bitmapCreateBitmap));
        }

        @NotNull
        public final RiveRenderImage fromBitmap(@NotNull Bitmap bitmap, @NotNull RendererType rendererType) {
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
            Intrinsics.checkNotNullParameter(rendererType, "rendererType");
            if (bitmap.isRecycled()) {
                throw new IllegalArgumentException("Bitmap must not be recycled");
            }
            boolean z5 = Build.VERSION.SDK_INT >= 26 && bitmap.getConfig() == Bitmap.Config.HARDWARE;
            Bitmap.Config config = bitmap.getConfig();
            Bitmap.Config config2 = Bitmap.Config.ARGB_8888;
            if ((config != config2 || z5) && (bitmap = bitmap.copy(config2, false)) == null) {
                throw new IllegalStateException("Failed to copy bitmap to ARGB_8888");
            }
            return rendererType == RendererType.Rive ? new RiveRenderImage(cppFromBitmapRive(bitmap, bitmap.isPremultiplied())) : new RiveRenderImage(cppFromBitmapCanvas(bitmap));
        }

        @NotNull
        public final RiveRenderImage fromEncoded(@NotNull byte[] encodedBytes, @NotNull RendererType rendererType) {
            Intrinsics.checkNotNullParameter(encodedBytes, "encodedBytes");
            Intrinsics.checkNotNullParameter(rendererType, "rendererType");
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            options.inPremultiplied = true;
            Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(encodedBytes, 0, encodedBytes.length, options);
            if (bitmapDecodeByteArray == null) {
                throw new IllegalArgumentException("Failed to decode image from encoded bytes");
            }
            if (bitmapDecodeByteArray.isPremultiplied() || !bitmapDecodeByteArray.hasAlpha()) {
                return fromBitmap(bitmapDecodeByteArray, rendererType);
            }
            throw new IllegalStateException("Decoded bitmap was not premultiplied");
        }

        @NotNull
        public final RiveRenderImage fromRGBABytes(@NotNull byte[] pixelBytes, int width, int height, @NotNull RendererType rendererType, boolean premultiplied) {
            Intrinsics.checkNotNullParameter(pixelBytes, "pixelBytes");
            Intrinsics.checkNotNullParameter(rendererType, "rendererType");
            if (width <= 0 || height <= 0) {
                throw new IllegalArgumentException("Width and height must be > 0");
            }
            if (pixelBytes.length == width * height * 4) {
                return new RiveRenderImage(cppFromRGBABytes(pixelBytes, width, height, rendererType.getValue(), premultiplied));
            }
            throw new IllegalArgumentException("Bytes must have size = width * height * 4");
        }

        @NotNull
        @d
        public final RiveRenderImage make(@NotNull byte[] bytes, @NotNull RendererType rendererType) {
            Intrinsics.checkNotNullParameter(bytes, "bytes");
            Intrinsics.checkNotNullParameter(rendererType, "rendererType");
            return fromEncoded(bytes, rendererType);
        }

        private Companion() {
        }
    }

    public RiveRenderImage(long j) {
        super(j);
    }

    @Override // app.rive.runtime.kotlin.core.NativeObject
    public native void cppDelete(long pointer);
}

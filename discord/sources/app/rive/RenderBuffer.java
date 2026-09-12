package app.rive;

import android.graphics.Bitmap;
import android.os.Trace;
import app.rive.core.CheckableAutoCloseable;
import app.rive.core.CloseOnce;
import app.rive.core.CommandQueue;
import app.rive.core.RenderingDefaults;
import app.rive.core.RiveSurface;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import rn.d;
import rn.l;
import rn.m;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u001e\u001a\u00020\u001fH\u0016J\u000e\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020!J*\u0010#\u001a\u00020\u00002\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\b\b\u0002\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020\u0003J,\u0010+\u001a\u00020\u00002\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\b\b\u0002\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020\u0003H\u0007J\u0006\u0010,\u001a\u00020!R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0019\u001a\u00020\u001a¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016¨\u0006-"}, d2 = {"Lapp/rive/RenderBuffer;", "Lapp/rive/core/CheckableAutoCloseable;", "width", "", "height", "riveWorker", "Lapp/rive/core/CommandQueue;", "Lapp/rive/core/RiveWorker;", "(IILapp/rive/core/CommandQueue;)V", "argbScratch", "", "getArgbScratch", "()[I", "argbScratch$delegate", "Lkotlin/Lazy;", "closed", "", "getClosed", "()Z", "closer", "Lapp/rive/core/CloseOnce;", "getHeight", "()I", "pixels", "", "surface", "Lapp/rive/core/RiveSurface;", "getSurface", "()Lapp/rive/core/RiveSurface;", "getWidth", "close", "", "copyInto", "Landroid/graphics/Bitmap;", "bitmap", "render", "artboard", "Lapp/rive/Artboard;", "stateMachine", "Lapp/rive/StateMachine;", "fit", "Lapp/rive/Fit;", "clearColor", "snapshot", "toBitmap", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRenderBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RenderBuffer.kt\napp/rive/RenderBuffer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Tracing.kt\napp/rive/core/TracingKt\n+ 4 Bitmap.kt\nandroidx/core/graphics/BitmapKt\n*L\n1#1,161:1\n1#2:162\n12#3,3:163\n12#3,6:166\n16#3,2:172\n12#3,3:174\n12#3,6:177\n12#3,6:183\n16#3,2:189\n12#3,3:191\n16#3,2:195\n88#4:194\n*S KotlinDebug\n*F\n+ 1 RenderBuffer.kt\napp/rive/RenderBuffer\n*L\n85#1:163,3\n86#1:166,6\n85#1:172,2\n130#1:174,3\n138#1:177,6\n150#1:183,6\n130#1:189,2\n157#1:191,3\n157#1:195,2\n158#1:194\n*E\n"})
@d
public final class RenderBuffer implements CheckableAutoCloseable {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: argbScratch$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy argbScratch;

    @NotNull
    private final CloseOnce closer;
    private final int height;

    @NotNull
    private final byte[] pixels;

    @NotNull
    private final CommandQueue riveWorker;

    @NotNull
    private final RiveSurface surface;
    private final int width;

    public RenderBuffer(int i7, int i10, @NotNull CommandQueue riveWorker) {
        Intrinsics.checkNotNullParameter(riveWorker, "riveWorker");
        this.width = i7;
        this.height = i10;
        this.riveWorker = riveWorker;
        if (i7 <= 0 || i10 <= 0) {
            throw new IllegalArgumentException("RenderBuffer width/height must be > 0");
        }
        this.surface = riveWorker.createImageSurface(i7, i10);
        this.closer = new CloseOnce("RenderBuffer", new Function0<Unit>() { // from class: app.rive.RenderBuffer$closer$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m23invoke();
                return Unit.f14616a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m23invoke() {
                this.this$0.getSurface().close();
            }
        });
        this.pixels = new byte[i7 * i10 * 4];
        this.argbScratch = l.a(m.f19487i, new Function0<int[]>() { // from class: app.rive.RenderBuffer$argbScratch$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final int[] invoke() {
                return new int[this.this$0.getHeight() * this.this$0.getWidth()];
            }
        });
    }

    private final int[] getArgbScratch() {
        return (int[]) this.argbScratch.getValue();
    }

    public static /* synthetic */ RenderBuffer render$default(RenderBuffer renderBuffer, Artboard artboard, StateMachine stateMachine, Fit fit, int i7, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            fit = RenderingDefaults.INSTANCE.defaultFit();
        }
        if ((i10 & 8) != 0) {
            i7 = 0;
        }
        return renderBuffer.render(artboard, stateMachine, fit, i7);
    }

    public static /* synthetic */ RenderBuffer snapshot$default(RenderBuffer renderBuffer, Artboard artboard, StateMachine stateMachine, Fit fit, int i7, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            fit = RenderingDefaults.INSTANCE.defaultFit();
        }
        if ((i10 & 8) != 0) {
            i7 = 0;
        }
        return renderBuffer.snapshot(artboard, stateMachine, fit, i7);
    }

    @Override // app.rive.core.CheckableAutoCloseable, java.lang.AutoCloseable
    public void close() {
        this.closer.close();
    }

    @NotNull
    public final Bitmap copyInto(@NotNull Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Trace.beginSection("Rive/RenderBuffer/CopyInto");
        try {
            if (bitmap.getWidth() != this.width || bitmap.getHeight() != this.height || bitmap.getConfig() != Bitmap.Config.ARGB_8888) {
                throw new IllegalArgumentException(("Bitmap must be " + this.width + "x" + this.height + " ARGB_8888").toString());
            }
            int[] argbScratch = getArgbScratch();
            Trace.beginSection("Rive/RenderBuffer/Software/ConvertRgbaToArgb");
            int i7 = 0;
            int i10 = 0;
            while (true) {
                try {
                    byte[] bArr = this.pixels;
                    if (i7 >= bArr.length) {
                        Unit unit = Unit.f14616a;
                        Trace.endSection();
                        Trace.beginSection("Rive/RenderBuffer/Software/SetPixels");
                        try {
                            int i11 = this.width;
                            bitmap.setPixels(argbScratch, 0, i11, 0, 0, i11, this.height);
                            Trace.endSection();
                            return bitmap;
                        } finally {
                            Trace.endSection();
                        }
                    }
                    argbScratch[i10] = ((bArr[i7 + 3] & 255) << 24) | ((bArr[i7] & 255) << 16) | ((bArr[i7 + 1] & 255) << 8) | (bArr[i7 + 2] & 255);
                    i7 += 4;
                    i10++;
                } catch (Throwable th2) {
                    Trace.endSection();
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            Trace.endSection();
            throw th3;
        }
    }

    @Override // app.rive.core.CheckableAutoCloseable
    public boolean getClosed() {
        return this.closer.getClosed();
    }

    public final int getHeight() {
        return this.height;
    }

    @NotNull
    public final RiveSurface getSurface() {
        return this.surface;
    }

    public final int getWidth() {
        return this.width;
    }

    @NotNull
    public final RenderBuffer render(@NotNull Artboard artboard, @NotNull StateMachine stateMachine, @NotNull Fit fit, int clearColor) {
        Intrinsics.checkNotNullParameter(artboard, "artboard");
        Intrinsics.checkNotNullParameter(stateMachine, "stateMachine");
        Intrinsics.checkNotNullParameter(fit, "fit");
        if (!artboard.isOwnedBy$kotlin_release(this.riveWorker)) {
            throw new IllegalArgumentException("RenderBuffer and Artboard must use the same RiveWorker");
        }
        if (!stateMachine.isOwnedBy$kotlin_release(this.riveWorker)) {
            throw new IllegalArgumentException("RenderBuffer and StateMachine must use the same RiveWorker");
        }
        if (!stateMachine.isFromArtboard$kotlin_release(artboard)) {
            throw new IllegalArgumentException("RenderBuffer StateMachine must be created from the supplied Artboard");
        }
        Trace.beginSection("Rive/RenderBuffer/Render");
        try {
            Trace.beginSection("Rive/RenderBuffer/Software/DrawToBuffer");
            try {
                artboard.getRiveWorker().m142drawToBufferfS7xHJs(artboard.getArtboardHandle(), stateMachine.getStateMachineHandle(), this.surface, this.pixels, this.width, this.height, fit, clearColor);
                Unit unit = Unit.f14616a;
                Trace.endSection();
                return this;
            } finally {
                Trace.endSection();
            }
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    @NotNull
    @d
    public final RenderBuffer snapshot(@NotNull Artboard artboard, @NotNull StateMachine stateMachine, @NotNull Fit fit, int clearColor) {
        Intrinsics.checkNotNullParameter(artboard, "artboard");
        Intrinsics.checkNotNullParameter(stateMachine, "stateMachine");
        Intrinsics.checkNotNullParameter(fit, "fit");
        return render(artboard, stateMachine, fit, clearColor);
    }

    @NotNull
    public final Bitmap toBitmap() {
        Trace.beginSection("Rive/RenderBuffer/ToBitmap");
        try {
            return copyInto(Bitmap.createBitmap(this.width, this.height, Bitmap.Config.ARGB_8888));
        } finally {
            Trace.endSection();
        }
    }
}

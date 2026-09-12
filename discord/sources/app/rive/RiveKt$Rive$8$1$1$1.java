package app.rive;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
import app.rive.core.CommandQueue;
import app.rive.core.SurfaceTextureSurface;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import s0.g;
import u.k;
import u.l;
import u.x;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0005H\u0016J \u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0005H\u0016¨\u0006\u000f"}, d2 = {"app/rive/RiveKt$Rive$8$1$1$1", "Landroid/view/TextureView$SurfaceTextureListener;", "onSurfaceTextureAvailable", "", "newSurfaceTexture", "Landroid/graphics/SurfaceTexture;", "width", "", "height", "onSurfaceTextureDestroyed", "", "destroyedSurfaceTexture", "onSurfaceTextureSizeChanged", "surfaceTexture", "onSurfaceTextureUpdated", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRive.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Rive.kt\napp/rive/RiveKt$Rive$8$1$1$1\n+ 2 RiveLog.kt\napp/rive/RiveLog\n*L\n1#1,521:1\n57#2:522\n57#2:523\n57#2:524\n*S KotlinDebug\n*F\n+ 1 Rive.kt\napp/rive/RiveKt$Rive$8$1$1$1\n*L\n468#1:522\n479#1:523\n492#1:524\n*E\n"})
public final class RiveKt$Rive$8$1$1$1 implements TextureView.SurfaceTextureListener {
    final /* synthetic */ l $bitmapCallbackSent$delegate;
    final /* synthetic */ x $currentOnBitmapAvailable$delegate;
    final /* synthetic */ CommandQueue $riveWorker;
    final /* synthetic */ l $surface$delegate;
    final /* synthetic */ k $surfaceHeight$delegate;
    final /* synthetic */ k $surfaceWidth$delegate;
    final /* synthetic */ TextureView $this_apply;

    public RiveKt$Rive$8$1$1$1(CommandQueue commandQueue, l lVar, k kVar, k kVar2, l lVar2, TextureView textureView, x xVar) {
        this.$riveWorker = commandQueue;
        this.$surface$delegate = lVar;
        this.$surfaceWidth$delegate = kVar;
        this.$surfaceHeight$delegate = kVar2;
        this.$bitmapCallbackSent$delegate = lVar2;
        this.$this_apply = textureView;
        this.$currentOnBitmapAvailable$delegate = xVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onSurfaceTextureUpdated$lambda$0(x currentOnBitmapAvailable$delegate, final TextureView this_apply) {
        Intrinsics.checkNotNullParameter(currentOnBitmapAvailable$delegate, "$currentOnBitmapAvailable$delegate");
        Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
        Function1 function1Rive$lambda$13 = RiveKt.Rive$lambda$13(currentOnBitmapAvailable$delegate);
        if (function1Rive$lambda$13 != null) {
            function1Rive$lambda$13.invoke(new Function0<Bitmap>() { // from class: app.rive.RiveKt$Rive$8$1$1$1$onSurfaceTextureUpdated$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final Bitmap invoke() {
                    Bitmap bitmap = this_apply.getBitmap();
                    if (bitmap != null) {
                        return bitmap;
                    }
                    throw new IllegalStateException("Bitmap no longer available; surface may have been destroyed");
                }
            });
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(@NotNull SurfaceTexture newSurfaceTexture, final int width, final int height) {
        Intrinsics.checkNotNullParameter(newSurfaceTexture, "newSurfaceTexture");
        RiveLog.INSTANCE.getLogger().d("Rive/UI", new Function0<String>() { // from class: app.rive.RiveKt$Rive$8$1$1$1$onSurfaceTextureAvailable$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final String invoke() {
                return g.c(width, "Surface texture available (", height, " x ", ")");
            }
        });
        this.$surface$delegate.setValue(this.$riveWorker.createRiveSurface(new SurfaceTextureSurface(newSurfaceTexture)));
        RiveKt.Rive$lambda$8(this.$surfaceWidth$delegate, width);
        RiveKt.Rive$lambda$11(this.$surfaceHeight$delegate, height);
        RiveKt.Rive$lambda$16(this.$bitmapCallbackSent$delegate, false);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(@NotNull SurfaceTexture destroyedSurfaceTexture) {
        Intrinsics.checkNotNullParameter(destroyedSurfaceTexture, "destroyedSurfaceTexture");
        RiveLog.INSTANCE.getLogger().d("Rive/UI", new Function0<String>() { // from class: app.rive.RiveKt$Rive$8$1$1$1$onSurfaceTextureDestroyed$1
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final String invoke() {
                return "Surface texture destroyed (final release deferred to RenderContext disposal)";
            }
        });
        this.$surface$delegate.setValue(null);
        RiveKt.Rive$lambda$16(this.$bitmapCallbackSent$delegate, false);
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(@NotNull SurfaceTexture surfaceTexture, final int width, final int height) {
        Intrinsics.checkNotNullParameter(surfaceTexture, "surfaceTexture");
        RiveLog.INSTANCE.getLogger().d("Rive/UI", new Function0<String>() { // from class: app.rive.RiveKt$Rive$8$1$1$1$onSurfaceTextureSizeChanged$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final String invoke() {
                return g.c(width, "Surface texture size changed (", height, " x ", ")");
            }
        });
        RiveKt.Rive$lambda$8(this.$surfaceWidth$delegate, width);
        RiveKt.Rive$lambda$11(this.$surfaceHeight$delegate, height);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(@NotNull SurfaceTexture surfaceTexture) {
        Intrinsics.checkNotNullParameter(surfaceTexture, "surfaceTexture");
        if (RiveKt.Rive$lambda$15(this.$bitmapCallbackSent$delegate) || this.$this_apply.getBitmap() == null) {
            return;
        }
        RiveKt.Rive$lambda$16(this.$bitmapCallbackSent$delegate, true);
        TextureView textureView = this.$this_apply;
        textureView.post(new a1.k(1, this.$currentOnBitmapAvailable$delegate, textureView));
    }
}

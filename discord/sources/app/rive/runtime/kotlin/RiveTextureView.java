package app.rive.runtime.kotlin;

import a3.e;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import androidx.lifecycle.u;
import app.rive.RiveLog;
import app.rive.runtime.kotlin.renderers.Renderer;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import rn.l;
import rn.m;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000 :2\u00020\u00012\u00020\u0002:\u0001:B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH$¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH$¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u000f\u0018\u0001H\u0084\b¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0014H\u0015¢\u0006\u0004\b\u001c\u0010\u001dJ'\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017H\u0017¢\u0006\u0004\b\u001f\u0010\u001bJ\u000f\u0010 \u001a\u00020\u0014H\u0015¢\u0006\u0004\b \u0010\u001dJ\u001f\u0010$\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u0017H\u0014¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020&2\u0006\u0010\u0013\u001a\u00020\u0012H\u0017¢\u0006\u0004\b'\u0010(R\u001b\u0010.\u001a\u00020)8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001b\u00101\u001a\u00020\f8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b/\u0010+\u001a\u0004\b0\u0010\u000eR$\u00102\u001a\u0004\u0018\u00010\t8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u0010\u000b\"\u0004\b5\u00106R\u0018\u00108\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109¨\u0006;"}, d2 = {"Lapp/rive/runtime/kotlin/RiveTextureView;", "Landroid/view/TextureView;", "Landroid/view/TextureView$SurfaceTextureListener;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lapp/rive/runtime/kotlin/renderers/Renderer;", "createRenderer", "()Lapp/rive/runtime/kotlin/renderers/Renderer;", "Landroidx/lifecycle/u;", "createObserver", "()Landroidx/lifecycle/u;", "T", "getContextAsType", "()Ljava/lang/Object;", "Landroid/graphics/SurfaceTexture;", "surface", "", "onSurfaceTextureUpdated", "(Landroid/graphics/SurfaceTexture;)V", "", "width", "height", "onSurfaceTextureSizeChanged", "(Landroid/graphics/SurfaceTexture;II)V", "onAttachedToWindow", "()V", "surfaceTexture", "onSurfaceTextureAvailable", "onDetachedFromWindow", "Landroid/view/View;", "changedView", "visibility", "onVisibilityChanged", "(Landroid/view/View;I)V", "", "onSurfaceTextureDestroyed", "(Landroid/graphics/SurfaceTexture;)Z", "Landroid/app/Activity;", "activity$delegate", "Lkotlin/Lazy;", "getActivity", "()Landroid/app/Activity;", "activity", "lifecycleObserver$delegate", "getLifecycleObserver", "lifecycleObserver", "renderer", "Lapp/rive/runtime/kotlin/renderers/Renderer;", "getRenderer", "setRenderer", "(Lapp/rive/runtime/kotlin/renderers/Renderer;)V", "Lapp/rive/runtime/kotlin/SharedSurface;", "sharedSurface", "Lapp/rive/runtime/kotlin/SharedSurface;", "Companion", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRiveTextureView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RiveTextureView.kt\napp/rive/runtime/kotlin/RiveTextureView\n+ 2 RiveLog.kt\napp/rive/RiveLog\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,140:1\n57#2:141\n57#2:142\n57#2:144\n57#2:145\n57#2:146\n57#2:147\n1#3:143\n*S KotlinDebug\n*F\n+ 1 RiveTextureView.kt\napp/rive/runtime/kotlin/RiveTextureView\n*L\n79#1:141\n85#1:142\n101#1:144\n113#1:145\n123#1:146\n133#1:147\n*E\n"})
public abstract class RiveTextureView extends TextureView implements TextureView.SurfaceTextureListener {

    @NotNull
    private static final String TAG = "RiveL/RiveTextureView";

    /* JADX INFO: renamed from: activity$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy activity;

    /* JADX INFO: renamed from: lifecycleObserver$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy lifecycleObserver;
    private Renderer renderer;
    private SharedSurface sharedSurface;
    public static final int $stable = 8;

    public /* synthetic */ RiveTextureView(Context context, AttributeSet attributeSet, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i7 & 2) != 0 ? null : attributeSet);
    }

    @NotNull
    public abstract u createObserver();

    @NotNull
    public abstract Renderer createRenderer();

    @NotNull
    public final Activity getActivity() {
        return (Activity) this.activity.getValue();
    }

    public final /* synthetic */ <T> T getContextAsType() {
        T t5 = (T) getContext();
        if (!(t5 instanceof ContextWrapper)) {
            return null;
        }
        Intrinsics.reifiedOperationMarker(3, "T");
        return t5;
    }

    @NotNull
    public final u getLifecycleObserver() {
        return (u) this.lifecycleObserver.getValue();
    }

    public final Renderer getRenderer() {
        return this.renderer;
    }

    @Override // android.view.TextureView, android.view.View
    public void onAttachedToWindow() {
        RiveLog.INSTANCE.getLogger().d(TAG, new Function0<String>() { // from class: app.rive.runtime.kotlin.RiveTextureView.onAttachedToWindow.1
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final String invoke() {
                return "onAttachedToWindow";
            }
        });
        super.onAttachedToWindow();
        setSurfaceTextureListener(this);
        setOpaque(false);
        Renderer rendererCreateRenderer = createRenderer();
        rendererCreateRenderer.make();
        this.renderer = rendererCreateRenderer;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        RiveLog.INSTANCE.getLogger().d(TAG, new Function0<String>() { // from class: app.rive.runtime.kotlin.RiveTextureView.onDetachedFromWindow.1
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final String invoke() {
                return "onDetachedFromWindow";
            }
        });
        SharedSurface sharedSurface = this.sharedSurface;
        if (sharedSurface != null) {
            sharedSurface.release();
        }
        this.sharedSurface = null;
        Renderer renderer = this.renderer;
        Intrinsics.checkNotNull(renderer);
        renderer.delete();
        this.renderer = null;
        super.onDetachedFromWindow();
    }

    public void onSurfaceTextureAvailable(@NotNull SurfaceTexture surfaceTexture, final int width, final int height) {
        Intrinsics.checkNotNullParameter(surfaceTexture, "surfaceTexture");
        RiveLog.INSTANCE.getLogger().d(TAG, new Function0<String>() { // from class: app.rive.runtime.kotlin.RiveTextureView.onSurfaceTextureAvailable.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final String invoke() {
                return e.g(width, height, "onSurfaceTextureAvailable: ", " x ");
            }
        });
        SharedSurface sharedSurface = this.sharedSurface;
        if (sharedSurface != null) {
            sharedSurface.release();
        }
        Renderer renderer = this.renderer;
        if (renderer != null) {
            renderer.stop();
            SharedSurface sharedSurface2 = new SharedSurface(new Surface(surfaceTexture));
            this.sharedSurface = sharedSurface2;
            Intrinsics.checkNotNull(sharedSurface2);
            renderer.setSurface$kotlin_release(sharedSurface2);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(@NotNull SurfaceTexture surface) {
        Intrinsics.checkNotNullParameter(surface, "surface");
        RiveLog.INSTANCE.getLogger().d(TAG, new Function0<String>() { // from class: app.rive.runtime.kotlin.RiveTextureView.onSurfaceTextureDestroyed.1
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final String invoke() {
                return "onSurfaceTextureDestroyed";
            }
        });
        Renderer renderer = this.renderer;
        if (renderer != null) {
            renderer.destroySurfaceAsync$kotlin_release();
        }
        SharedSurface sharedSurface = this.sharedSurface;
        if (sharedSurface != null) {
            sharedSurface.release();
        }
        this.sharedSurface = null;
        return false;
    }

    public void onSurfaceTextureSizeChanged(@NotNull SurfaceTexture surface, final int width, final int height) {
        Intrinsics.checkNotNullParameter(surface, "surface");
        RiveLog.INSTANCE.getLogger().d(TAG, new Function0<String>() { // from class: app.rive.runtime.kotlin.RiveTextureView.onSurfaceTextureSizeChanged.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final String invoke() {
                return e.g(width, height, "onSurfaceTextureSizeChanged: ", " x ");
            }
        });
        onSurfaceTextureAvailable(surface, width, height);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(@NotNull SurfaceTexture surface) {
        Intrinsics.checkNotNullParameter(surface, "surface");
    }

    @Override // android.view.TextureView, android.view.View
    public void onVisibilityChanged(@NotNull View changedView, final int visibility) {
        Intrinsics.checkNotNullParameter(changedView, "changedView");
        RiveLog.INSTANCE.getLogger().d(TAG, new Function0<String>() { // from class: app.rive.runtime.kotlin.RiveTextureView.onVisibilityChanged.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final String invoke() {
                return kk.b.h(visibility, "onVisibilityChanged: ");
            }
        });
        super.onVisibilityChanged(changedView, visibility);
        if (visibility == 0) {
            Renderer renderer = this.renderer;
            if (renderer != null) {
                renderer.start();
                return;
            }
            return;
        }
        Renderer renderer2 = this.renderer;
        if (renderer2 != null) {
            renderer2.stop();
        }
    }

    public final void setRenderer(Renderer renderer) {
        this.renderer = renderer;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RiveTextureView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.activity = l.a(m.f19487i, new Function0<Activity>() { // from class: app.rive.runtime.kotlin.RiveTextureView$activity$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Activity invoke() {
                Context context2 = this.this$0.getContext();
                while (context2 instanceof ContextWrapper) {
                    if (context2 instanceof Activity) {
                        Intrinsics.checkNotNull(context2);
                        return (Activity) context2;
                    }
                    context2 = ((ContextWrapper) context2).getBaseContext();
                }
                context2 = null;
                Intrinsics.checkNotNull(context2);
                return (Activity) context2;
            }
        });
        this.lifecycleObserver = l.b(new Function0<u>() { // from class: app.rive.runtime.kotlin.RiveTextureView$lifecycleObserver$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final u invoke() {
                return this.this$0.createObserver();
            }
        });
    }
}

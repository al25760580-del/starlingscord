package nm;

import android.animation.Animator;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.swmansion.rnscreens.Screen;
import com.swmansion.rnscreens.e0;
import k4.k;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import rn.n;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e0 f16968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u4.c f16969b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f16970c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b f16971d;

    public c(e0 wrapper, u4.c cVar, a animationType) {
        Intrinsics.checkNotNullParameter(wrapper, "wrapper");
        Intrinsics.checkNotNullParameter(animationType, "animationType");
        this.f16968a = wrapper;
        this.f16969b = cVar;
        this.f16970c = animationType;
        this.f16971d = b.f16964d;
    }

    public final void a() {
        b bVar;
        int iOrdinal = this.f16971d.ordinal();
        if (iOrdinal == 0) {
            bVar = b.f16965e;
        } else {
            if (iOrdinal != 1 && iOrdinal != 2) {
                throw new n();
            }
            bVar = b.f16966i;
        }
        this.f16971d = bVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        u4.c cVar = this.f16969b;
        Screen screen = (Screen) cVar.f20946d;
        Intrinsics.checkNotNullParameter(animation, "animation");
        if (this.f16971d == b.f16965e) {
            a();
            animation.removeListener(this);
            a aVar = this.f16970c;
            int iOrdinal = aVar.ordinal();
            if (iOrdinal == 0) {
                EventDispatcher reactEventDispatcher = screen.getReactEventDispatcher();
                if (reactEventDispatcher != null) {
                    reactEventDispatcher.dispatchEvent(new k(UIManagerHelper.getSurfaceId(screen), screen.getId(), 4));
                    Unit unit = Unit.f14616a;
                }
            } else {
                if (iOrdinal != 1) {
                    throw new n();
                }
                EventDispatcher reactEventDispatcher2 = screen.getReactEventDispatcher();
                if (reactEventDispatcher2 != null) {
                    reactEventDispatcher2.dispatchEvent(new k(UIManagerHelper.getSurfaceId(screen), screen.getId(), 5));
                    Unit unit2 = Unit.f14616a;
                }
            }
            boolean z5 = aVar == a.f16962e;
            cVar.b(1.0f, z5, z5);
            this.f16968a.a().endRemovalTransition();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animation) {
        Screen screen;
        EventDispatcher reactEventDispatcher;
        Screen screen2;
        EventDispatcher reactEventDispatcher2;
        Intrinsics.checkNotNullParameter(animation, "animation");
        if (this.f16971d == b.f16964d) {
            a();
            a aVar = this.f16970c;
            int iOrdinal = aVar.ordinal();
            u4.c cVar = this.f16969b;
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    throw new n();
                }
                if (cVar != null && (reactEventDispatcher2 = (screen2 = (Screen) cVar.f20946d).getReactEventDispatcher()) != null) {
                    reactEventDispatcher2.dispatchEvent(new k(UIManagerHelper.getSurfaceId(screen2), screen2.getId(), 8));
                    Unit unit = Unit.f14616a;
                }
            } else if (cVar != null && (reactEventDispatcher = (screen = (Screen) cVar.f20946d).getReactEventDispatcher()) != null) {
                reactEventDispatcher.dispatchEvent(new k(UIManagerHelper.getSurfaceId(screen), screen.getId(), 7));
                Unit unit2 = Unit.f14616a;
            }
            boolean z5 = aVar == a.f16962e;
            if (cVar != null) {
                cVar.b(0.0f, z5, z5);
            }
        }
    }
}

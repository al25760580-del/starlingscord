package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.discord.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class g extends l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f2141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f2142c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public k0 f2143d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(x1 operation, boolean z5) {
        super(operation);
        Intrinsics.checkNotNullParameter(operation, "operation");
        this.f2141b = z5;
    }

    /* JADX WARN: Code duplicated, block: B:74:0x00fa A[Catch: RuntimeException -> 0x0100, TRY_LEAVE, TryCatch #1 {RuntimeException -> 0x0100, blocks: (B:72:0x00f4, B:74:0x00fa), top: B:85:0x00f4 }] */
    public final k0 b(Context context) {
        int enterAnim;
        k0 k0Var;
        Animator animatorLoadAnimator;
        int iF;
        Intrinsics.checkNotNullParameter(context, "context");
        if (this.f2142c) {
            return this.f2143d;
        }
        x1 x1Var = this.f2178a;
        Fragment fragment = x1Var.f2274c;
        boolean z5 = x1Var.f2272a == z1.f2290e;
        int nextTransition = fragment.getNextTransition();
        if (this.f2141b) {
            enterAnim = z5 ? fragment.getPopEnterAnim() : fragment.getPopExitAnim();
        } else {
            enterAnim = z5 ? fragment.getEnterAnim() : fragment.getExitAnim();
        }
        fragment.setAnimations(0, 0, 0, 0);
        ViewGroup viewGroup = fragment.mContainer;
        k0 k0Var2 = null;
        if (viewGroup != null && viewGroup.getTag(R.id.visible_removing_fragment_view_tag) != null) {
            fragment.mContainer.setTag(R.id.visible_removing_fragment_view_tag, null);
        }
        ViewGroup viewGroup2 = fragment.mContainer;
        if (viewGroup2 == null || viewGroup2.getLayoutTransition() == null) {
            Animation animationOnCreateAnimation = fragment.onCreateAnimation(nextTransition, z5, enterAnim);
            if (animationOnCreateAnimation != null) {
                k0Var2 = new k0(animationOnCreateAnimation);
            } else {
                Animator animatorOnCreateAnimator = fragment.onCreateAnimator(nextTransition, z5, enterAnim);
                if (animatorOnCreateAnimator != null) {
                    k0Var2 = new k0(animatorOnCreateAnimator);
                } else {
                    if (enterAnim == 0 && nextTransition != 0) {
                        if (nextTransition == 4097) {
                            iF = z5 ? R.animator.fragment_open_enter : R.animator.fragment_open_exit;
                        } else if (nextTransition == 8194) {
                            iF = z5 ? R.animator.fragment_close_enter : R.animator.fragment_close_exit;
                        } else if (nextTransition == 8197) {
                            iF = z5 ? yk.a.F(context, android.R.attr.activityCloseEnterAnimation) : yk.a.F(context, android.R.attr.activityCloseExitAnimation);
                        } else if (nextTransition == 4099) {
                            iF = z5 ? R.animator.fragment_fade_enter : R.animator.fragment_fade_exit;
                        } else if (nextTransition != 4100) {
                            iF = -1;
                        } else {
                            iF = z5 ? yk.a.F(context, android.R.attr.activityOpenEnterAnimation) : yk.a.F(context, android.R.attr.activityOpenExitAnimation);
                        }
                        enterAnim = iF;
                    }
                    if (enterAnim != 0) {
                        boolean zEquals = "anim".equals(context.getResources().getResourceTypeName(enterAnim));
                        if (zEquals) {
                            try {
                                Animation animationLoadAnimation = AnimationUtils.loadAnimation(context, enterAnim);
                                if (animationLoadAnimation != null) {
                                    k0Var = new k0(animationLoadAnimation);
                                    k0Var2 = k0Var;
                                }
                            } catch (Resources.NotFoundException e10) {
                                throw e10;
                            } catch (RuntimeException unused) {
                                try {
                                    animatorLoadAnimator = AnimatorInflater.loadAnimator(context, enterAnim);
                                    if (animatorLoadAnimator != null) {
                                        k0Var = new k0(animatorLoadAnimator);
                                        k0Var2 = k0Var;
                                    }
                                } catch (RuntimeException e11) {
                                    if (zEquals) {
                                        throw e11;
                                    }
                                    Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(context, enterAnim);
                                    if (animationLoadAnimation2 != null) {
                                        k0Var2 = new k0(animationLoadAnimation2);
                                    }
                                }
                            }
                        } else {
                            animatorLoadAnimator = AnimatorInflater.loadAnimator(context, enterAnim);
                            if (animatorLoadAnimator != null) {
                                k0Var = new k0(animatorLoadAnimator);
                                k0Var2 = k0Var;
                            }
                        }
                    }
                }
            }
        }
        this.f2143d = k0Var2;
        this.f2142c = true;
        return k0Var2;
    }
}

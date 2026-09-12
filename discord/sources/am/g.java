package am;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.CancellationSignal;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.Window;
import android.view.WindowManager;
import android.view.WindowMetrics;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import androidx.core.view.m0;
import androidx.core.view.q0;
import androidx.core.view.q1;
import androidx.core.view.u0;
import androidx.dynamicanimation.animation.SpringAnimation;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.views.view.ReactViewGroup;
import io.sentry.h4;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rn.u;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends ReactViewGroup {
    public ul.a E;
    public boolean F;
    public boolean G;
    public final Rect H;
    public final h4 I;
    public VelocityTracker J;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ThemedReactContext f652d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f653e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f654i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f655v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f656w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f657x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f658y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(ThemedReactContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.f652d = reactContext;
        this.E = new ul.a(1);
        this.G = true;
        this.H = new Rect();
        this.I = new h4();
    }

    private final int getWindowHeight() {
        Rect bounds;
        WindowManager windowManager;
        if (Build.VERSION.SDK_INT >= 30) {
            Activity currentActivity = this.f652d.getCurrentActivity();
            WindowMetrics currentWindowMetrics = (currentActivity == null || (windowManager = currentActivity.getWindowManager()) == null) ? null : windowManager.getCurrentWindowMetrics();
            if (currentWindowMetrics != null && (bounds = currentWindowMetrics.getBounds()) != null) {
                return bounds.height();
            }
        }
        return 0;
    }

    public final void c() {
        this.f653e = false;
        this.f654i = 0.0f;
        this.f655v = 0.0f;
        this.f656w = 0;
        this.f657x = 0;
        this.H.setEmpty();
        VelocityTracker velocityTracker = this.J;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.J = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.J == null) {
            this.J = VelocityTracker.obtain();
        }
        WindowInsetsControllerCompat windowInsetsControllerCompat = null;
        Integer numValueOf = motionEvent != null ? Integer.valueOf(motionEvent.getAction()) : null;
        Rect rect = this.H;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            VelocityTracker velocityTracker = this.J;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            this.f654i = motionEvent.getX();
            this.f655v = motionEvent.getY();
            sl.c.a(this, rect);
            this.f656w = rect.top;
        } else {
            z = false;
            boolean z5 = false;
            h4 h4Var = this.I;
            if (numValueOf != null && numValueOf.intValue() == 2) {
                sl.c.a(this, rect);
                int i7 = rect.top - this.f656w;
                MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                motionEventObtain.offsetLocation(0.0f, i7);
                VelocityTracker velocityTracker2 = this.J;
                if (velocityTracker2 != null) {
                    velocityTracker2.addMovement(motionEventObtain);
                }
                float x5 = motionEventObtain.getX() - this.f654i;
                float y5 = motionEventObtain.getY() - this.f655v;
                if (!this.f653e) {
                    this.f653e = Math.abs(y5) > Math.abs(x5) && Math.abs(y5) >= ((float) ViewConfiguration.get(getContext()).getScaledTouchSlop());
                }
                if (this.f653e) {
                    if (((fj.c) h4Var.f12711b) != null) {
                        if (this.f657x == 0) {
                            this.f657x = h4Var.s();
                        }
                        ul.a aVar = this.E;
                        int iB = ho.c.b(y5);
                        int windowHeight = getWindowHeight() - ((int) motionEvent.getRawY());
                        int iS = h4Var.s();
                        int i10 = this.f658y;
                        switch (aVar.f21184a) {
                            case 0:
                                iB = (windowHeight <= iS + i10 || iB <= 0) ? iB : 0;
                                break;
                        }
                        if (iB != 0) {
                            fj.c cVar = (fj.c) h4Var.f12711b;
                            if (cVar == null) {
                                throw new IllegalStateException("Current WindowInsetsAnimationController is null.This should only be called if isAnimationInProgress() returns true");
                            }
                            gn.h.f10142a = true;
                            h4Var.u(((q1) cVar.f9267e).F().f1559d - iB);
                        }
                    } else if (((CancellationSignal) h4Var.f12712c) == null) {
                        WeakHashMap weakHashMap = u0.f1729a;
                        WindowInsetsCompat windowInsetsCompatA = m0.a(this);
                        Object[] objArr = windowInsetsCompatA != null && windowInsetsCompatA.f1605a.p(8);
                        if (y5 >= 0.0f ? !(y5 <= 0.0f || objArr == false || !this.G) : !(objArr != false || !this.F)) {
                            h4Var.getClass();
                            Intrinsics.checkNotNullParameter(this, "view");
                            if (((fj.c) h4Var.f12711b) != null) {
                                throw new IllegalStateException("Animation in progress. Can not start a new request to controlWindowInsetsAnimation()");
                            }
                            WeakHashMap weakHashMap2 = u0.f1729a;
                            WindowInsetsCompat windowInsetsCompatA2 = m0.a(this);
                            if (windowInsetsCompatA2 != null && windowInsetsCompatA2.f1605a.p(8)) {
                                z5 = true;
                            }
                            h4Var.f12710a = z5;
                            h4Var.f12712c = new CancellationSignal();
                            h4Var.f12713d = null;
                            gn.h.f10142a = true;
                            if (Build.VERSION.SDK_INT >= 30) {
                                windowInsetsControllerCompat = q0.c(this);
                            } else {
                                for (Context context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
                                    if (context instanceof Activity) {
                                        Window window = ((Activity) context).getWindow();
                                        if (window == null) {
                                            break;
                                        }
                                        windowInsetsControllerCompat = new WindowInsetsControllerCompat(window, this);
                                        break;
                                    }
                                }
                            }
                            if (windowInsetsControllerCompat != null) {
                                windowInsetsControllerCompat.f1606a.j(tl.b.f20830a, (CancellationSignal) h4Var.f12712c, (tl.a) ((u) h4Var.f12714e).getValue());
                            }
                        }
                    }
                    this.f655v = motionEvent.getY();
                    this.f654i = motionEvent.getX();
                    this.f656w = rect.top;
                }
            } else if (numValueOf != null && numValueOf.intValue() == 1) {
                VelocityTracker velocityTracker3 = this.J;
                if (velocityTracker3 != null) {
                    velocityTracker3.addMovement(motionEvent);
                }
                VelocityTracker velocityTracker4 = this.J;
                if (velocityTracker4 != null) {
                    velocityTracker4.computeCurrentVelocity(500);
                }
                VelocityTracker velocityTracker5 = this.J;
                Float fValueOf = velocityTracker5 != null ? Float.valueOf(velocityTracker5.getYVelocity()) : null;
                if (((fj.c) h4Var.f12711b) != null && this.f657x == h4Var.s()) {
                    fValueOf = null;
                }
                fj.c cVar2 = (fj.c) h4Var.f12711b;
                if (cVar2 == null) {
                    CancellationSignal cancellationSignal = (CancellationSignal) h4Var.f12712c;
                    if (cancellationSignal != null) {
                        cancellationSignal.cancel();
                    }
                } else {
                    q1 q1Var = (q1) cVar2.f9267e;
                    gn.h.f10142a = false;
                    int i11 = q1Var.F().f1559d;
                    int i12 = q1Var.H().f1559d;
                    int i13 = q1Var.G().f1559d;
                    if (fValueOf != null) {
                        h4Var.l(fValueOf, fValueOf.floatValue() < 0.0f);
                    } else if (i11 == i12) {
                        cVar2.s(true);
                    } else if (i11 == i13) {
                        cVar2.s(false);
                    } else if (q1Var.E() >= 0.15f) {
                        h4Var.l(null, !h4Var.f12710a);
                    } else {
                        h4Var.l(null, h4Var.f12710a);
                    }
                }
                c();
            } else if (numValueOf != null && numValueOf.intValue() == 3) {
                fj.c cVar3 = (fj.c) h4Var.f12711b;
                if (cVar3 != null) {
                    cVar3.s(h4Var.f12710a);
                }
                CancellationSignal cancellationSignal2 = (CancellationSignal) h4Var.f12712c;
                if (cancellationSignal2 != null) {
                    cancellationSignal2.cancel();
                }
                SpringAnimation springAnimation = (SpringAnimation) h4Var.f12715f;
                if (springAnimation != null) {
                    springAnimation.b();
                }
                h4Var.x();
                c();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final void setInterpolator(@NotNull String interpolator) {
        Intrinsics.checkNotNullParameter(interpolator, "interpolator");
        ul.a aVar = (ul.a) h.f659a.get(interpolator);
        if (aVar == null) {
            aVar = new ul.a(1);
        }
        this.E = aVar;
    }

    public final void setOffset(double d6) {
        this.f658y = (int) (((float) d6) * Resources.getSystem().getDisplayMetrics().density);
    }

    public final void setScrollKeyboardOffScreenWhenVisible(boolean z5) {
        this.G = z5;
    }

    public final void setScrollKeyboardOnScreenWhenNotVisible(boolean z5) {
        this.F = z5;
    }
}

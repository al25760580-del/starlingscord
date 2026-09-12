package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.widget.TextView;
import com.discord.R;
import com.reactnativecommunity.webview.RNCWebViewManager;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class a4 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {
    public static a4 H;
    public static a4 I;
    public b4 E;
    public boolean F;
    public boolean G;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f894d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CharSequence f895e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f896i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final z3 f897v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final z3 f898w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f899x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f900y;

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.appcompat.widget.z3] */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.appcompat.widget.z3] */
    public a4(View view, CharSequence charSequence) {
        final int i7 = 0;
        this.f897v = new Runnable(this) { // from class: androidx.appcompat.widget.z3

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ a4 f1193e;

            {
                this.f1193e = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i7) {
                    case 0:
                        this.f1193e.c(false);
                        break;
                    default:
                        this.f1193e.a();
                        break;
                }
            }
        };
        final int i10 = 1;
        this.f898w = new Runnable(this) { // from class: androidx.appcompat.widget.z3

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ a4 f1193e;

            {
                this.f1193e = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        this.f1193e.c(false);
                        break;
                    default:
                        this.f1193e.a();
                        break;
                }
            }
        };
        this.f894d = view;
        this.f895e = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = androidx.core.view.v0.f1735a;
        this.f896i = Build.VERSION.SDK_INT >= 28 ? androidx.core.view.h.m(viewConfiguration) : viewConfiguration.getScaledTouchSlop() / 2;
        this.G = true;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void b(a4 a4Var) {
        a4 a4Var2 = H;
        if (a4Var2 != null) {
            a4Var2.f894d.removeCallbacks(a4Var2.f897v);
        }
        H = a4Var;
        if (a4Var != null) {
            a4Var.f894d.postDelayed(a4Var.f897v, ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        a4 a4Var = I;
        View view = this.f894d;
        if (a4Var == this) {
            I = null;
            b4 b4Var = this.E;
            if (b4Var != null) {
                View view2 = (View) b4Var.f910e;
                if (view2.getParent() != null) {
                    ((WindowManager) ((Context) b4Var.f909d).getSystemService("window")).removeView(view2);
                }
                this.E = null;
                this.G = true;
                view.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (H == this) {
            b(null);
        }
        view.removeCallbacks(this.f898w);
    }

    public final void c(boolean z5) {
        int height;
        int i7;
        int i10;
        int i11;
        long longPressTimeout;
        long j;
        long j5;
        View view = this.f894d;
        if (view.isAttachedToWindow()) {
            b(null);
            a4 a4Var = I;
            if (a4Var != null) {
                a4Var.a();
            }
            I = this;
            this.F = z5;
            Context context = view.getContext();
            b4 b4Var = new b4();
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            b4Var.f912v = layoutParams;
            b4Var.f913w = new Rect();
            b4Var.f914x = new int[2];
            b4Var.f915y = new int[2];
            b4Var.f909d = context;
            View viewInflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
            b4Var.f910e = viewInflate;
            b4Var.f911i = (TextView) viewInflate.findViewById(R.id.message);
            layoutParams.setTitle(b4.class.getSimpleName());
            layoutParams.packageName = context.getPackageName();
            layoutParams.type = RNCWebViewManager.COMMAND_CLEAR_HISTORY;
            layoutParams.width = -2;
            layoutParams.height = -2;
            layoutParams.format = -3;
            layoutParams.windowAnimations = R.style.Animation_AppCompat_Tooltip;
            layoutParams.flags = 24;
            View view2 = (View) b4Var.f910e;
            Context context2 = (Context) b4Var.f909d;
            this.E = b4Var;
            int width = this.f899x;
            int i12 = this.f900y;
            boolean z6 = this.F;
            WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) b4Var.f912v;
            if (view2.getParent() != null && view2.getParent() != null) {
                ((WindowManager) context2.getSystemService("window")).removeView(view2);
            }
            ((TextView) b4Var.f911i).setText(this.f895e);
            int[] iArr = (int[]) b4Var.f915y;
            int[] iArr2 = (int[]) b4Var.f914x;
            Rect rect = (Rect) b4Var.f913w;
            layoutParams2.token = view.getApplicationWindowToken();
            int dimensionPixelOffset = context2.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
            if (view.getWidth() < dimensionPixelOffset) {
                width = view.getWidth() / 2;
            }
            if (view.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = context2.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
                height = i12 + dimensionPixelOffset2;
                i7 = i12 - dimensionPixelOffset2;
            } else {
                height = view.getHeight();
                i7 = 0;
            }
            layoutParams2.gravity = 49;
            int dimensionPixelOffset3 = context2.getResources().getDimensionPixelOffset(z6 ? R.dimen.tooltip_y_offset_touch : R.dimen.tooltip_y_offset_non_touch);
            View rootView = view.getRootView();
            ViewGroup.LayoutParams layoutParams3 = rootView.getLayoutParams();
            int i13 = width;
            if (!(layoutParams3 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams3).type != 2) {
                for (Context context3 = view.getContext(); context3 instanceof ContextWrapper; context3 = ((ContextWrapper) context3).getBaseContext()) {
                    if (context3 instanceof Activity) {
                        rootView = ((Activity) context3).getWindow().getDecorView();
                        break;
                    }
                }
            }
            if (rootView == null) {
                Log.e("TooltipPopup", "Cannot find app view");
                i11 = 1;
            } else {
                rootView.getWindowVisibleDisplayFrame(rect);
                if (rect.left >= 0 || rect.top >= 0) {
                    i10 = 0;
                    i11 = 1;
                } else {
                    Resources resources = context2.getResources();
                    i11 = 1;
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    i10 = 0;
                    rect.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                rootView.getLocationOnScreen(iArr);
                view.getLocationOnScreen(iArr2);
                int i14 = iArr2[i10] - iArr[i10];
                iArr2[i10] = i14;
                iArr2[i11] = iArr2[i11] - iArr[i11];
                layoutParams2.x = (i14 + i13) - (rootView.getWidth() / 2);
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i10, i10);
                view2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredHeight = view2.getMeasuredHeight();
                int i15 = iArr2[i11];
                int i16 = ((i15 + i7) - dimensionPixelOffset3) - measuredHeight;
                int i17 = i15 + height + dimensionPixelOffset3;
                if (z6) {
                    if (i16 >= 0) {
                        layoutParams2.y = i16;
                    } else {
                        layoutParams2.y = i17;
                    }
                } else if (measuredHeight + i17 <= rect.height()) {
                    layoutParams2.y = i17;
                } else {
                    layoutParams2.y = i16;
                }
            }
            ((WindowManager) context2.getSystemService("window")).addView(view2, layoutParams2);
            view.addOnAttachStateChangeListener(this);
            if (this.F) {
                j5 = 2500;
            } else {
                WeakHashMap weakHashMap = androidx.core.view.u0.f1729a;
                if ((view.getWindowSystemUiVisibility() & 1) == i11) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j = 3000;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j = 15000;
                }
                j5 = j - longPressTimeout;
            }
            z3 z3Var = this.f898w;
            view.removeCallbacks(z3Var);
            view.postDelayed(z3Var, j5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0066  */
    @Override // android.view.View.OnHoverListener
    public final boolean onHover(View view, MotionEvent motionEvent) {
        if (this.E == null || !this.F) {
            View view2 = this.f894d;
            AccessibilityManager accessibilityManager = (AccessibilityManager) view2.getContext().getSystemService("accessibility");
            if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled()) {
                int action = motionEvent.getAction();
                if (action != 7) {
                    if (action == 10) {
                        this.G = true;
                        a();
                        return false;
                    }
                } else if (view2.isEnabled() && this.E == null) {
                    int x5 = (int) motionEvent.getX();
                    int y5 = (int) motionEvent.getY();
                    if (this.G) {
                        this.f899x = x5;
                        this.f900y = y5;
                        this.G = false;
                        b(this);
                    } else {
                        int iAbs = Math.abs(x5 - this.f899x);
                        int i7 = this.f896i;
                        if (iAbs > i7 || Math.abs(y5 - this.f900y) > i7) {
                            this.f899x = x5;
                            this.f900y = y5;
                            this.G = false;
                            b(this);
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.f899x = view.getWidth() / 2;
        this.f900y = view.getHeight() / 2;
        c(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        a();
    }
}

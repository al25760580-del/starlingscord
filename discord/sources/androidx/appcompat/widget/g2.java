package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import com.reactnativecommunity.webview.RNCWebViewManager;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class g2 implements n.z {
    public static final Method X;
    public static final Method Y;
    public boolean F;
    public boolean G;
    public boolean H;
    public d2 K;
    public View L;
    public AdapterView.OnItemClickListener M;
    public AdapterView.OnItemSelectedListener N;
    public final Handler S;
    public Rect U;
    public boolean V;
    public final a0 W;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f988d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ListAdapter f989e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public t1 f990i;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f993x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f994y;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f991v = -2;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f992w = -2;
    public final int E = RNCWebViewManager.COMMAND_CLEAR_HISTORY;
    public int I = 0;
    public final int J = Integer.MAX_VALUE;
    public final c2 O = new c2(this, 1);
    public final f2 P = new f2(this);
    public final e2 Q = new e2(this);
    public final c2 R = new c2(this, 0);
    public final Rect T = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                X = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                Y = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public g2(Context context, AttributeSet attributeSet, int i7, int i10) {
        int resourceId;
        this.f988d = context;
        this.S = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.a.f10265o, i7, 0);
        this.f993x = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f994y = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.F = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        a0 a0Var = new a0(context, attributeSet, i7, 0);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, h.a.f10269s, i7, 0);
        if (typedArrayObtainStyledAttributes2.hasValue(2)) {
            a0Var.setOverlapAnchor(typedArrayObtainStyledAttributes2.getBoolean(2, false));
        }
        a0Var.setBackgroundDrawable((!typedArrayObtainStyledAttributes2.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes2.getDrawable(0) : mf.f.u(context, resourceId));
        typedArrayObtainStyledAttributes2.recycle();
        this.W = a0Var;
        a0Var.setInputMethodMode(1);
    }

    public final int a() {
        return this.f993x;
    }

    public final void b(int i7) {
        this.f993x = i7;
    }

    @Override // n.z
    public final void dismiss() {
        a0 a0Var = this.W;
        a0Var.dismiss();
        a0Var.setContentView(null);
        this.f990i = null;
        this.S.removeCallbacks(this.O);
    }

    public final Drawable e() {
        return this.W.getBackground();
    }

    @Override // n.z
    public final t1 g() {
        return this.f990i;
    }

    public final void h(Drawable drawable) {
        this.W.setBackgroundDrawable(drawable);
    }

    public final void i(int i7) {
        this.f994y = i7;
        this.F = true;
    }

    @Override // n.z
    public final boolean isShowing() {
        return this.W.isShowing();
    }

    public final int l() {
        if (this.F) {
            return this.f994y;
        }
        return 0;
    }

    public void n(ListAdapter listAdapter) {
        d2 d2Var = this.K;
        if (d2Var == null) {
            this.K = new d2(0, this);
        } else {
            ListAdapter listAdapter2 = this.f989e;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(d2Var);
            }
        }
        this.f989e = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.K);
        }
        t1 t1Var = this.f990i;
        if (t1Var != null) {
            t1Var.setAdapter(this.f989e);
        }
    }

    public t1 o(Context context, boolean z5) {
        return new t1(context, z5);
    }

    public final void p(int i7) {
        Drawable background = this.W.getBackground();
        if (background == null) {
            this.f992w = i7;
            return;
        }
        Rect rect = this.T;
        background.getPadding(rect);
        this.f992w = rect.left + rect.right + i7;
    }

    @Override // n.z
    public final void show() {
        int i7;
        int iMakeMeasureSpec;
        int paddingBottom;
        t1 t1Var;
        t1 t1Var2 = this.f990i;
        Context context = this.f988d;
        a0 a0Var = this.W;
        if (t1Var2 == null) {
            t1 t1VarO = o(context, !this.V);
            this.f990i = t1VarO;
            t1VarO.setAdapter(this.f989e);
            this.f990i.setOnItemClickListener(this.M);
            this.f990i.setFocusable(true);
            this.f990i.setFocusableInTouchMode(true);
            this.f990i.setOnItemSelectedListener(new z1(0, this));
            this.f990i.setOnScrollListener(this.Q);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.N;
            if (onItemSelectedListener != null) {
                this.f990i.setOnItemSelectedListener(onItemSelectedListener);
            }
            a0Var.setContentView(this.f990i);
        }
        Drawable background = a0Var.getBackground();
        Rect rect = this.T;
        if (background != null) {
            background.getPadding(rect);
            int i10 = rect.top;
            i7 = rect.bottom + i10;
            if (!this.F) {
                this.f994y = -i10;
            }
        } else {
            rect.setEmpty();
            i7 = 0;
        }
        int iA = a2.a(a0Var, this.L, this.f994y, a0Var.getInputMethodMode() == 2);
        int i11 = this.f991v;
        if (i11 == -1) {
            paddingBottom = iA + i7;
        } else {
            int i12 = this.f992w;
            if (i12 != -2) {
                iMakeMeasureSpec = i12 != -1 ? View.MeasureSpec.makeMeasureSpec(i12, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824);
            } else {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE);
            }
            int iA2 = this.f990i.a(iMakeMeasureSpec, iA);
            paddingBottom = iA2 + (iA2 > 0 ? this.f990i.getPaddingBottom() + this.f990i.getPaddingTop() + i7 : 0);
        }
        boolean z5 = a0Var.getInputMethodMode() == 2;
        a0Var.setWindowLayoutType(this.E);
        if (a0Var.isShowing()) {
            if (this.L.isAttachedToWindow()) {
                int width = this.f992w;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = this.L.getWidth();
                }
                if (i11 == -1) {
                    i11 = z5 ? paddingBottom : -1;
                    if (z5) {
                        a0Var.setWidth(this.f992w == -1 ? -1 : 0);
                        a0Var.setHeight(0);
                    } else {
                        a0Var.setWidth(this.f992w == -1 ? -1 : 0);
                        a0Var.setHeight(-1);
                    }
                } else if (i11 == -2) {
                    i11 = paddingBottom;
                }
                a0Var.setOutsideTouchable(true);
                int i13 = width;
                View view = this.L;
                int i14 = this.f993x;
                int i15 = this.f994y;
                int i16 = i13 < 0 ? -1 : i13;
                if (i11 < 0) {
                    i11 = -1;
                }
                a0Var.update(view, i14, i15, i16, i11);
                return;
            }
            return;
        }
        int width2 = this.f992w;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = this.L.getWidth();
        }
        if (i11 == -1) {
            i11 = -1;
        } else if (i11 == -2) {
            i11 = paddingBottom;
        }
        a0Var.setWidth(width2);
        a0Var.setHeight(i11);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = X;
            if (method != null) {
                try {
                    method.invoke(a0Var, Boolean.TRUE);
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            b2.b(a0Var, true);
        }
        a0Var.setOutsideTouchable(true);
        a0Var.setTouchInterceptor(this.P);
        if (this.H) {
            a0Var.setOverlapAnchor(this.G);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = Y;
            if (method2 != null) {
                try {
                    method2.invoke(a0Var, this.U);
                } catch (Exception e10) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e10);
                }
            }
        } else {
            b2.a(a0Var, this.U);
        }
        a0Var.showAsDropDown(this.L, this.f993x, this.f994y, this.I);
        this.f990i.setSelection(-1);
        if ((!this.V || this.f990i.isInTouchMode()) && (t1Var = this.f990i) != null) {
            t1Var.setListSelectionHidden(true);
            t1Var.requestLayout();
        }
        if (this.V) {
            return;
        }
        this.S.post(this.R);
    }
}

package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.discord.R;

/* JADX INFO: loaded from: classes.dex */
public final class x3 implements j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Toolbar f1164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f1166c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Drawable f1167d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Drawable f1168e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Drawable f1169f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f1170g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public CharSequence f1171h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final CharSequence f1172i;
    public final CharSequence j;
    public Window.Callback k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f1173l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public n f1174m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f1175n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Drawable f1176o;

    public x3(Toolbar toolbar, boolean z5) {
        Drawable drawable;
        this.f1175n = 0;
        this.f1164a = toolbar;
        this.f1171h = toolbar.getTitle();
        this.f1172i = toolbar.getSubtitle();
        this.f1170g = this.f1171h != null;
        this.f1169f = toolbar.getNavigationIcon();
        e4.m mVarE = e4.m.E(toolbar.getContext(), null, h.a.f10253a, R.attr.actionBarStyle);
        TypedArray typedArray = (TypedArray) mVarE.f7994i;
        int i7 = 15;
        this.f1176o = mVarE.x(15);
        if (z5) {
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                this.f1170g = true;
                this.f1171h = text;
                if ((this.f1165b & 8) != 0) {
                    toolbar.setTitle(text);
                    if (this.f1170g) {
                        androidx.core.view.u0.q(toolbar.getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                this.f1172i = text2;
                if ((this.f1165b & 8) != 0) {
                    toolbar.setSubtitle(text2);
                }
            }
            Drawable drawableX = mVarE.x(20);
            if (drawableX != null) {
                this.f1168e = drawableX;
                c();
            }
            Drawable drawableX2 = mVarE.x(17);
            if (drawableX2 != null) {
                this.f1167d = drawableX2;
                c();
            }
            if (this.f1169f == null && (drawable = this.f1176o) != null) {
                this.f1169f = drawable;
                if ((this.f1165b & 4) != 0) {
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            a(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View viewInflate = LayoutInflater.from(toolbar.getContext()).inflate(resourceId, (ViewGroup) toolbar, false);
                View view = this.f1166c;
                if (view != null && (this.f1165b & 16) != 0) {
                    toolbar.removeView(view);
                }
                this.f1166c = viewInflate;
                if (viewInflate != null && (this.f1165b & 16) != 0) {
                    toolbar.addView(viewInflate);
                }
                a(this.f1165b | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
                layoutParams.height = layoutDimension;
                toolbar.setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(7, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(3, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                int iMax = Math.max(dimensionPixelOffset, 0);
                int iMax2 = Math.max(dimensionPixelOffset2, 0);
                toolbar.d();
                toolbar.Q.a(iMax, iMax2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = toolbar.getContext();
                toolbar.I = resourceId2;
                AppCompatTextView appCompatTextView = toolbar.f867e;
                if (appCompatTextView != null) {
                    appCompatTextView.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = toolbar.getContext();
                toolbar.J = resourceId3;
                AppCompatTextView appCompatTextView2 = toolbar.f871i;
                if (appCompatTextView2 != null) {
                    appCompatTextView2.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                toolbar.setPopupTheme(resourceId4);
            }
        } else {
            if (toolbar.getNavigationIcon() != null) {
                this.f1176o = toolbar.getNavigationIcon();
            } else {
                i7 = 11;
            }
            this.f1165b = i7;
        }
        mVarE.H();
        if (R.string.abc_action_bar_up_description != this.f1175n) {
            this.f1175n = R.string.abc_action_bar_up_description;
            if (TextUtils.isEmpty(toolbar.getNavigationContentDescription())) {
                int i10 = this.f1175n;
                this.j = i10 != 0 ? toolbar.getContext().getString(i10) : null;
                b();
            }
        }
        this.j = toolbar.getNavigationContentDescription();
        toolbar.setNavigationOnClickListener(new v3(this));
    }

    public final void a(int i7) {
        View view;
        int i10 = this.f1165b ^ i7;
        this.f1165b = i7;
        if (i10 != 0) {
            int i11 = i10 & 4;
            Toolbar toolbar = this.f1164a;
            if (i11 != 0) {
                if ((i7 & 4) != 0) {
                    b();
                }
                if ((this.f1165b & 4) != 0) {
                    Drawable drawable = this.f1169f;
                    if (drawable == null) {
                        drawable = this.f1176o;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i10 & 3) != 0) {
                c();
            }
            if ((i10 & 8) != 0) {
                if ((i7 & 8) != 0) {
                    toolbar.setTitle(this.f1171h);
                    toolbar.setSubtitle(this.f1172i);
                } else {
                    toolbar.setTitle((CharSequence) null);
                    toolbar.setSubtitle((CharSequence) null);
                }
            }
            if ((i10 & 16) == 0 || (view = this.f1166c) == null) {
                return;
            }
            if ((i7 & 16) != 0) {
                toolbar.addView(view);
            } else {
                toolbar.removeView(view);
            }
        }
    }

    public final void b() {
        if ((this.f1165b & 4) != 0) {
            boolean zIsEmpty = TextUtils.isEmpty(this.j);
            Toolbar toolbar = this.f1164a;
            if (zIsEmpty) {
                toolbar.setNavigationContentDescription(this.f1175n);
            } else {
                toolbar.setNavigationContentDescription(this.j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i7 = this.f1165b;
        if ((i7 & 2) == 0) {
            drawable = null;
        } else if ((i7 & 1) == 0 || (drawable = this.f1168e) == null) {
            drawable = this.f1167d;
        }
        this.f1164a.setLogo(drawable);
    }
}

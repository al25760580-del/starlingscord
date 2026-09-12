package eh;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.util.StateSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.internal.BaselineLayout;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e extends FrameLayout implements h {
    public static final int[] G0 = {R.attr.state_checked};
    public static final vi.d H0;
    public static final d I0;
    public int A0;
    public boolean B0;
    public boolean C0;
    public boolean D0;
    public float E;
    public boolean E0;
    public float F;
    public Rect F0;
    public float G;
    public float H;
    public float I;
    public float J;
    public int K;
    public boolean L;
    public final LinearLayout M;
    public final LinearLayout N;
    public final View O;
    public final FrameLayout P;
    public final ImageView Q;
    public final BaselineLayout R;
    public final TextView S;
    public final TextView T;
    public final BaselineLayout U;
    public final TextView V;
    public final TextView W;
    public BaselineLayout a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public int f8194b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public int f8195c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f8196d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public int f8197d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ColorStateList f8198e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public int f8199e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public int f8200f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public ColorStateList f8201g0;
    public boolean h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Drawable f8202i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public n.l f8203i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public ColorStateList f8204j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public Drawable f8205k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public Drawable f8206l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public ValueAnimator f8207m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public vi.d f8208n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public float f8209o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public boolean f8210p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f8211q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f8212r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f8213s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f8214t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public boolean f8215u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f8216v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public int f8217v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f8218w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public int f8219w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f8220x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public ng.a f8221x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f8222y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public int f8223y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public int f8224z0;

    static {
        int i7 = 5;
        byte b10 = 0;
        H0 = new vi.d(i7, b10);
        I0 = new d(i7, b10);
    }

    public e(Context context) {
        super(context);
        this.f8196d = false;
        this.f8194b0 = -1;
        this.f8195c0 = 0;
        this.f8197d0 = 0;
        this.f8199e0 = 0;
        this.f8200f0 = 0;
        this.h0 = false;
        this.f8208n0 = H0;
        this.f8209o0 = 0.0f;
        this.f8210p0 = false;
        this.f8211q0 = 0;
        this.f8212r0 = 0;
        this.f8213s0 = -2;
        this.f8214t0 = 0;
        this.f8215u0 = false;
        this.f8217v0 = 0;
        this.f8219w0 = 0;
        this.f8224z0 = 0;
        this.A0 = 49;
        this.B0 = false;
        this.C0 = false;
        this.D0 = false;
        this.E0 = false;
        this.F0 = new Rect();
        LayoutInflater.from(context).inflate(getItemLayoutResId(), (ViewGroup) this, true);
        this.M = (LinearLayout) findViewById(com.discord.R.id.navigation_bar_item_content_container);
        LinearLayout linearLayout = (LinearLayout) findViewById(com.discord.R.id.navigation_bar_item_inner_content_container);
        this.N = linearLayout;
        this.O = findViewById(com.discord.R.id.navigation_bar_item_active_indicator_view);
        this.P = (FrameLayout) findViewById(com.discord.R.id.navigation_bar_item_icon_container);
        this.Q = (ImageView) findViewById(com.discord.R.id.navigation_bar_item_icon_view);
        BaselineLayout baselineLayout = (BaselineLayout) findViewById(com.discord.R.id.navigation_bar_item_labels_group);
        this.R = baselineLayout;
        TextView textView = (TextView) findViewById(com.discord.R.id.navigation_bar_item_small_label_view);
        this.S = textView;
        TextView textView2 = (TextView) findViewById(com.discord.R.id.navigation_bar_item_large_label_view);
        this.T = textView2;
        float dimension = getResources().getDimension(com.discord.R.dimen.default_navigation_text_size);
        float dimension2 = getResources().getDimension(com.discord.R.dimen.default_navigation_active_text_size);
        BaselineLayout baselineLayout2 = new BaselineLayout(getContext(), null, 0);
        baselineLayout2.f6401d = -1;
        this.U = baselineLayout2;
        baselineLayout2.setVisibility(8);
        this.U.setDuplicateParentStateEnabled(true);
        this.U.setMeasurePaddingFromBaseline(this.D0);
        TextView textView3 = new TextView(getContext());
        this.V = textView3;
        textView3.setMaxLines(1);
        TextView textView4 = this.V;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView4.setEllipsize(truncateAt);
        this.V.setDuplicateParentStateEnabled(true);
        this.V.setIncludeFontPadding(false);
        this.V.setGravity(16);
        this.V.setTextSize(dimension);
        TextView textView5 = new TextView(getContext());
        this.W = textView5;
        textView5.setMaxLines(1);
        this.W.setEllipsize(truncateAt);
        this.W.setDuplicateParentStateEnabled(true);
        this.W.setVisibility(4);
        this.W.setIncludeFontPadding(false);
        this.W.setGravity(16);
        this.W.setTextSize(dimension2);
        this.U.addView(this.V);
        this.U.addView(this.W);
        this.a0 = baselineLayout;
        setBackgroundResource(getItemBackgroundResId());
        this.f8216v = getResources().getDimensionPixelSize(getItemDefaultMarginResId());
        this.f8218w = baselineLayout.getPaddingBottom();
        this.f8220x = 0;
        this.f8222y = 0;
        textView.setImportantForAccessibility(2);
        textView2.setImportantForAccessibility(2);
        this.V.setImportantForAccessibility(2);
        this.W.setImportantForAccessibility(2);
        setFocusable(true);
        b();
        this.f8214t0 = getResources().getDimensionPixelSize(com.discord.R.dimen.m3_navigation_item_expanded_active_indicator_height_default);
        linearLayout.addOnLayoutChangeListener(new com.discord.channel_spine.a(4, (qg.a) this));
    }

    private int getItemVisiblePosition() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        int iIndexOfChild = viewGroup.indexOfChild(this);
        int i7 = 0;
        for (int i10 = 0; i10 < iIndexOfChild; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if ((childAt instanceof e) && childAt.getVisibility() == 0) {
                i7++;
            }
        }
        return i7;
    }

    private int getSuggestedIconWidth() {
        ng.a aVar = this.f8221x0;
        int minimumWidth = aVar == null ? 0 : aVar.getMinimumWidth() - this.f8221x0.f16809w.f16821b.T.intValue();
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.P.getLayoutParams();
        return Math.max(minimumWidth, layoutParams.rightMargin) + this.Q.getMeasuredWidth() + Math.max(minimumWidth, layoutParams.leftMargin);
    }

    public static void i(int i7, int i10, int i11, View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i7;
        layoutParams.bottomMargin = i10;
        layoutParams.gravity = i11;
        view.setLayoutParams(layoutParams);
    }

    private void setLabelPivots(TextView textView) {
        textView.setPivotX(textView.getWidth() / 2);
        textView.setPivotY(textView.getBaseline());
    }

    @Override // n.w
    public final void a(n.l lVar) {
        this.f8203i0 = lVar;
        setCheckable(lVar.isCheckable());
        setChecked(lVar.isChecked());
        setEnabled(lVar.isEnabled());
        setIcon(lVar.getIcon());
        setTitle(lVar.f16171e);
        setId(lVar.f16167a);
        if (!TextUtils.isEmpty(lVar.f16181q)) {
            setContentDescription(lVar.f16181q);
        }
        ib.a.I(this, !TextUtils.isEmpty(lVar.f16182r) ? lVar.f16182r : lVar.f16171e);
        m();
        this.f8196d = true;
    }

    public final void b() {
        float textSize = this.S.getTextSize();
        float textSize2 = this.T.getTextSize();
        this.E = textSize - textSize2;
        this.F = (textSize2 * 1.0f) / textSize;
        this.G = (textSize * 1.0f) / textSize2;
        float textSize3 = this.V.getTextSize();
        float textSize4 = this.W.getTextSize();
        this.H = textSize3 - textSize4;
        this.I = (textSize4 * 1.0f) / textSize3;
        this.J = (textSize3 * 1.0f) / textSize4;
    }

    public final void c() {
        Drawable rippleDrawable = this.f8202i;
        RippleDrawable rippleDrawable2 = null;
        boolean z5 = true;
        if (this.f8198e != null) {
            Drawable activeIndicatorDrawable = getActiveIndicatorDrawable();
            if (this.f8210p0 && getActiveIndicatorDrawable() != null && activeIndicatorDrawable != null) {
                rippleDrawable2 = new RippleDrawable(ih.a.b(this.f8198e), null, activeIndicatorDrawable);
                z5 = false;
            } else if (rippleDrawable == null) {
                ColorStateList colorStateList = this.f8198e;
                int[] iArr = ih.a.f11783d;
                int iA = ih.a.a(colorStateList, ih.a.f11782c);
                int[] iArr2 = ih.a.f11781b;
                rippleDrawable = new RippleDrawable(new ColorStateList(new int[][]{iArr, iArr2, StateSet.NOTHING}, new int[]{iA, ih.a.a(colorStateList, iArr2), ih.a.a(colorStateList, ih.a.f11780a)}), null, null);
            }
        }
        FrameLayout frameLayout = this.P;
        frameLayout.setPadding(0, 0, 0, 0);
        frameLayout.setForeground(rippleDrawable2);
        setBackground(rippleDrawable);
        if (Build.VERSION.SDK_INT >= 26) {
            setDefaultFocusHighlightEnabled(z5);
        }
    }

    public final void d(float f2, float f7) {
        vi.d dVar = this.f8208n0;
        dVar.getClass();
        float fA = lg.a.a(0.4f, 1.0f, f2);
        View view = this.O;
        view.setScaleX(fA);
        view.setScaleY(dVar.n(f2));
        view.setAlpha(lg.a.b(0.0f, 1.0f, f7 == 0.0f ? 0.8f : 0.0f, f7 == 0.0f ? 1.0f : 0.2f, f2));
        this.f8209o0 = f2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f8210p0) {
            this.P.dispatchTouchEvent(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e() {
        int i7 = this.Q.getLayoutParams().width > 0 ? this.f8222y : 0;
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.U.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.rightMargin = getLayoutDirection() == 1 ? i7 : 0;
            layoutParams.leftMargin = getLayoutDirection() != 1 ? i7 : 0;
        }
    }

    public final void f(TextView textView, TextView textView2, float f2, float f7) {
        i(this.f8223y0 == 0 ? (int) (this.f8216v + f7) : 0, 0, this.A0, this.M);
        int i7 = this.f8223y0;
        i(i7 == 0 ? 0 : this.F0.top, i7 == 0 ? 0 : this.F0.bottom, i7 == 0 ? 17 : 8388627, this.N);
        int i10 = this.f8218w;
        BaselineLayout baselineLayout = this.R;
        baselineLayout.setPadding(baselineLayout.getPaddingLeft(), baselineLayout.getPaddingTop(), baselineLayout.getPaddingRight(), i10);
        this.a0.setVisibility(0);
        textView.setScaleX(1.0f);
        textView.setScaleY(1.0f);
        textView.setVisibility(0);
        textView2.setScaleX(f2);
        textView2.setScaleY(f2);
        textView2.setVisibility(4);
    }

    public final void g() {
        int i7 = this.f8216v;
        i(i7, i7, this.f8223y0 == 0 ? 17 : this.A0, this.M);
        i(0, 0, 17, this.N);
        BaselineLayout baselineLayout = this.R;
        baselineLayout.setPadding(baselineLayout.getPaddingLeft(), baselineLayout.getPaddingTop(), baselineLayout.getPaddingRight(), 0);
        this.a0.setVisibility(8);
    }

    public Drawable getActiveIndicatorDrawable() {
        return this.O.getBackground();
    }

    public ng.a getBadge() {
        return this.f8221x0;
    }

    @NonNull
    public BaselineLayout getExpandedLabelGroup() {
        return this.U;
    }

    public int getItemBackgroundResId() {
        return com.discord.R.drawable.mtrl_navigation_bar_item_background;
    }

    @Override // n.w
    public n.l getItemData() {
        return this.f8203i0;
    }

    public int getItemDefaultMarginResId() {
        return com.discord.R.dimen.mtrl_navigation_bar_item_default_margin;
    }

    public abstract int getItemLayoutResId();

    public int getItemPosition() {
        return this.f8194b0;
    }

    @NonNull
    public BaselineLayout getLabelGroup() {
        return this.R;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        LinearLayout linearLayout = this.M;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
        return linearLayout.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        if (this.f8223y0 == 1) {
            LinearLayout linearLayout = this.N;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
            return linearLayout.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
        }
        BaselineLayout baselineLayout = this.R;
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) baselineLayout.getLayoutParams();
        return Math.max(getSuggestedIconWidth(), baselineLayout.getMeasuredWidth() + layoutParams2.leftMargin + layoutParams2.rightMargin);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0027  */
    public final void h(int i7, TextView textView) {
        int iRound;
        if (this.E0) {
            textView.setTextAppearance(i7);
            return;
        }
        textView.setTextAppearance(i7);
        Context context = textView.getContext();
        if (i7 == 0) {
            iRound = 0;
        } else {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i7, h.a.f10274x);
            TypedValue typedValue = new TypedValue();
            boolean value = typedArrayObtainStyledAttributes.getValue(0, typedValue);
            typedArrayObtainStyledAttributes.recycle();
            if (value) {
                iRound = typedValue.getComplexUnit() == 2 ? Math.round(TypedValue.complexToFloat(typedValue.data) * context.getResources().getDisplayMetrics().density) : TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics());
            } else {
                iRound = 0;
            }
        }
        if (iRound != 0) {
            textView.setTextSize(0, iRound);
        }
    }

    public final void j(View view) {
        if (this.f8221x0 != null) {
            if (view != null) {
                setClipChildren(true);
                setClipToPadding(true);
                ng.a aVar = this.f8221x0;
                if (aVar != null) {
                    if (aVar.d() != null) {
                        aVar.d().setForeground(null);
                    } else {
                        view.getOverlay().remove(aVar);
                    }
                }
            }
            this.f8221x0 = null;
        }
    }

    public final void k(int i7) {
        if (i7 > 0 || getVisibility() != 0) {
            int iMin = Math.min(this.f8211q0, i7 - (this.f8217v0 * 2));
            int iMax = this.f8212r0;
            if (this.f8223y0 == 1) {
                int measuredWidth = i7 - (this.f8219w0 * 2);
                int i10 = this.f8213s0;
                if (i10 != -1) {
                    measuredWidth = i10 == -2 ? this.M.getMeasuredWidth() : Math.min(i10, measuredWidth);
                }
                iMin = measuredWidth;
                iMax = Math.max(this.f8214t0, this.N.getMeasuredHeight());
            }
            View view = this.O;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            if (this.f8215u0 && this.K == 2) {
                iMax = iMin;
            }
            layoutParams.height = iMax;
            layoutParams.width = Math.max(0, iMin);
            view.setLayoutParams(layoutParams);
        }
    }

    public final void l(int i7, TextView textView) {
        if (textView == null) {
            return;
        }
        h(i7, textView);
        b();
        textView.setMinimumHeight(com.facebook.imagepipeline.nativecode.c.z(textView.getContext(), i7));
        ColorStateList colorStateList = this.f8201g0;
        if (colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
        TextView textView2 = this.T;
        textView2.setTypeface(textView2.getTypeface(), this.h0 ? 1 : 0);
        TextView textView3 = this.W;
        textView3.setTypeface(textView3.getTypeface(), this.h0 ? 1 : 0);
    }

    public final void m() {
        n.l lVar = this.f8203i0;
        if (lVar != null) {
            setVisibility((!lVar.isVisible() || (!this.B0 && this.C0)) ? 8 : 0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i7) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i7 + 1);
        n.l lVar = this.f8203i0;
        if (lVar != null && lVar.isCheckable() && this.f8203i0.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, G0);
        }
        return iArrOnCreateDrawableState;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x007c  */
    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        Context context;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        ng.a aVar = this.f8221x0;
        if (aVar != null && aVar.isVisible()) {
            n.l lVar = this.f8203i0;
            CharSequence charSequence = lVar.f16171e;
            if (!TextUtils.isEmpty(lVar.f16181q)) {
                charSequence = this.f8203i0.f16181q;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append((Object) charSequence);
            sb2.append(", ");
            ng.a aVar2 = this.f8221x0;
            ng.c cVar = aVar2.f16809w;
            Object quantityString = null;
            if (aVar2.isVisible()) {
                boolean zA = cVar.a();
                ng.b bVar = cVar.f16821b;
                if (zA) {
                    quantityString = bVar.L;
                    if (quantityString == null) {
                        quantityString = aVar2.f16809w.f16821b.G;
                    }
                } else if (!aVar2.g()) {
                    quantityString = bVar.M;
                } else if (bVar.N != 0 && (context = (Context) aVar2.f16805d.get()) != null) {
                    if (aVar2.E != -2) {
                        int iE = aVar2.e();
                        int i7 = aVar2.E;
                        if (iE <= i7) {
                            quantityString = context.getResources().getQuantityString(bVar.N, aVar2.e(), Integer.valueOf(aVar2.e()));
                        } else {
                            quantityString = context.getString(bVar.O, Integer.valueOf(i7));
                        }
                    } else {
                        quantityString = context.getResources().getQuantityString(bVar.N, aVar2.e(), Integer.valueOf(aVar2.e()));
                    }
                }
            }
            sb2.append(quantityString);
            accessibilityNodeInfo.setContentDescription(sb2.toString());
        }
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat = new AccessibilityNodeInfoCompat(accessibilityNodeInfo);
        accessibilityNodeInfoCompat.r(g.a.a(0, 1, getItemVisiblePosition(), 1, isSelected()));
        if (isSelected()) {
            accessibilityNodeInfoCompat.p(false);
            accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) androidx.core.view.accessibility.a.f1618g.f1627a);
        }
        accessibilityNodeInfoCompat.w(getResources().getString(com.discord.R.string.item_view_role_description));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        post(new com.google.android.material.datepicker.g(i7, 2, this));
    }

    public void setActiveIndicatorDrawable(Drawable drawable) {
        this.O.setBackground(drawable);
        c();
    }

    public void setActiveIndicatorEnabled(boolean z5) {
        this.f8210p0 = z5;
        c();
        this.O.setVisibility(z5 ? 0 : 8);
        requestLayout();
    }

    public void setActiveIndicatorExpandedHeight(int i7) {
        this.f8214t0 = i7;
        k(getWidth());
    }

    public void setActiveIndicatorExpandedMarginHorizontal(int i7) {
        this.f8219w0 = i7;
        if (this.f8223y0 == 1) {
            setPadding(i7, 0, i7, 0);
        }
        k(getWidth());
    }

    public void setActiveIndicatorExpandedPadding(@NonNull Rect rect) {
        this.F0 = rect;
    }

    public void setActiveIndicatorExpandedWidth(int i7) {
        this.f8213s0 = i7;
        k(getWidth());
    }

    public void setActiveIndicatorHeight(int i7) {
        this.f8212r0 = i7;
        k(getWidth());
    }

    public void setActiveIndicatorLabelPadding(int i7) {
        if (this.f8220x != i7) {
            this.f8220x = i7;
            ((LinearLayout.LayoutParams) this.R.getLayoutParams()).topMargin = i7;
            if (this.U.getLayoutParams() != null) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.U.getLayoutParams();
                layoutParams.rightMargin = getLayoutDirection() == 1 ? i7 : 0;
                if (getLayoutDirection() == 1) {
                    i7 = 0;
                }
                layoutParams.leftMargin = i7;
                requestLayout();
            }
        }
    }

    public void setActiveIndicatorMarginHorizontal(int i7) {
        this.f8217v0 = i7;
        k(getWidth());
    }

    public void setActiveIndicatorResizeable(boolean z5) {
        this.f8215u0 = z5;
    }

    public void setActiveIndicatorWidth(int i7) {
        this.f8211q0 = i7;
        k(getWidth());
    }

    public void setBadge(@NonNull ng.a aVar) {
        ng.a aVar2 = this.f8221x0;
        if (aVar2 == aVar) {
            return;
        }
        ImageView imageView = this.Q;
        if (aVar2 != null && imageView != null) {
            Log.w("NavigationBar", "Multiple badges shouldn't be attached to one item.");
            j(imageView);
        }
        this.f8221x0 = aVar;
        int i7 = this.f8224z0;
        ng.c cVar = aVar.f16809w;
        if (cVar.f16829l != i7) {
            cVar.f16829l = i7;
            aVar.l();
        }
        if (imageView == null || this.f8221x0 == null) {
            return;
        }
        setClipChildren(false);
        setClipToPadding(false);
        ng.a aVar3 = this.f8221x0;
        Rect rect = new Rect();
        imageView.getDrawingRect(rect);
        aVar3.setBounds(rect);
        aVar3.k(imageView, null);
        if (aVar3.d() != null) {
            aVar3.d().setForeground(aVar3);
        } else {
            imageView.getOverlay().add(aVar3);
        }
    }

    public void setCheckable(boolean z5) {
        refreshDrawableState();
    }

    public void setChecked(boolean z5) {
        TextView textView = this.T;
        setLabelPivots(textView);
        TextView textView2 = this.S;
        setLabelPivots(textView2);
        TextView textView3 = this.W;
        setLabelPivots(textView3);
        TextView textView4 = this.V;
        setLabelPivots(textView4);
        float f2 = z5 ? 1.0f : 0.0f;
        if (this.f8210p0 && this.f8196d && isAttachedToWindow()) {
            ValueAnimator valueAnimator = this.f8207m0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f8207m0 = null;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f8209o0, f2);
            this.f8207m0 = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new c(this, f2));
            this.f8207m0.setInterpolator(io.sentry.config.a.T(getContext(), com.discord.R.attr.motionEasingEmphasizedInterpolator, lg.a.f15072b));
            this.f8207m0.setDuration(io.sentry.config.a.S(getContext(), com.discord.R.attr.motionDurationLong2, getResources().getInteger(com.discord.R.integer.material_motion_duration_long_1)));
            this.f8207m0.start();
        } else {
            d(f2, f2);
        }
        float f7 = this.E;
        float f10 = this.F;
        float f11 = this.G;
        if (this.f8223y0 == 1) {
            f7 = this.H;
            f10 = this.I;
            f11 = this.J;
            textView = textView3;
            textView2 = textView4;
        }
        int i7 = this.K;
        if (i7 != -1) {
            if (i7 != 0) {
                if (i7 != 1) {
                    if (i7 == 2) {
                        g();
                    }
                } else if (z5) {
                    f(textView, textView2, f10, f7);
                } else {
                    f(textView2, textView, f11, 0.0f);
                }
            } else if (z5) {
                f(textView, textView2, f10, 0.0f);
            } else {
                g();
            }
        } else if (this.L) {
            if (z5) {
                f(textView, textView2, f10, 0.0f);
            } else {
                g();
            }
        } else if (z5) {
            f(textView, textView2, f10, f7);
        } else {
            f(textView2, textView, f11, 0.0f);
        }
        refreshDrawableState();
        setSelected(z5);
    }

    @Override // android.view.View
    public void setEnabled(boolean z5) {
        super.setEnabled(z5);
        this.S.setEnabled(z5);
        this.T.setEnabled(z5);
        this.V.setEnabled(z5);
        this.W.setEnabled(z5);
        this.Q.setEnabled(z5);
    }

    @Override // eh.h
    public void setExpanded(boolean z5) {
        this.B0 = z5;
        m();
    }

    public void setHorizontalTextAppearanceActive(int i7) {
        this.f8199e0 = i7;
        if (i7 == 0) {
            i7 = this.f8195c0;
        }
        l(i7, this.W);
    }

    public void setHorizontalTextAppearanceInactive(int i7) {
        this.f8200f0 = i7;
        if (i7 == 0) {
            i7 = this.f8197d0;
        }
        TextView textView = this.V;
        if (textView == null) {
            return;
        }
        h(i7, textView);
        b();
        textView.setMinimumHeight(com.facebook.imagepipeline.nativecode.c.z(textView.getContext(), i7));
        ColorStateList colorStateList = this.f8201g0;
        if (colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setIcon(Drawable drawable) {
        if (drawable == this.f8205k0) {
            return;
        }
        this.f8205k0 = drawable;
        if (drawable != null) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            drawable = drawable.mutate();
            this.f8206l0 = drawable;
            ColorStateList colorStateList = this.f8204j0;
            if (colorStateList != null) {
                drawable.setTintList(colorStateList);
            }
        }
        this.Q.setImageDrawable(drawable);
    }

    public void setIconLabelHorizontalSpacing(int i7) {
        if (this.f8222y != i7) {
            this.f8222y = i7;
            e();
            requestLayout();
        }
    }

    public void setIconSize(int i7) {
        ImageView imageView = this.Q;
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) imageView.getLayoutParams();
        layoutParams.width = i7;
        layoutParams.height = i7;
        imageView.setLayoutParams(layoutParams);
        e();
    }

    public void setIconTintList(ColorStateList colorStateList) {
        Drawable drawable;
        this.f8204j0 = colorStateList;
        if (this.f8203i0 == null || (drawable = this.f8206l0) == null) {
            return;
        }
        drawable.setTintList(colorStateList);
        this.f8206l0.invalidateSelf();
    }

    public void setItemBackground(int i7) {
        setItemBackground(i7 == 0 ? null : getContext().getDrawable(i7));
    }

    public void setItemGravity(int i7) {
        this.A0 = i7;
        requestLayout();
    }

    public void setItemIconGravity(int i7) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        if (this.f8223y0 != i7) {
            this.f8223y0 = i7;
            this.f8224z0 = 0;
            BaselineLayout baselineLayout = this.R;
            this.a0 = baselineLayout;
            LinearLayout linearLayout = this.N;
            int i16 = 8;
            if (i7 == 1) {
                if (this.U.getParent() == null) {
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 17;
                    linearLayout.addView(this.U, layoutParams);
                    e();
                }
                Rect rect = this.F0;
                int i17 = rect.left;
                int i18 = rect.right;
                int i19 = rect.top;
                i10 = rect.bottom;
                this.f8224z0 = 1;
                int i20 = this.f8219w0;
                this.a0 = this.U;
                i14 = i19;
                i13 = i18;
                i12 = i17;
                i11 = i20;
                i15 = 0;
            } else {
                i10 = 0;
                i11 = 0;
                i12 = 0;
                i13 = 0;
                i14 = 0;
                i15 = 8;
                i16 = 0;
            }
            baselineLayout.setVisibility(i16);
            this.U.setVisibility(i15);
            ((FrameLayout.LayoutParams) this.M.getLayoutParams()).gravity = this.A0;
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
            layoutParams2.leftMargin = i12;
            layoutParams2.rightMargin = i13;
            layoutParams2.topMargin = i14;
            layoutParams2.bottomMargin = i10;
            setPadding(i11, 0, i11, 0);
            k(getWidth());
            c();
        }
    }

    public void setItemPaddingBottom(int i7) {
        if (this.f8218w != i7) {
            this.f8218w = i7;
            n.l lVar = this.f8203i0;
            if (lVar != null) {
                setChecked(lVar.isChecked());
            }
        }
    }

    public void setItemPaddingTop(int i7) {
        if (this.f8216v != i7) {
            this.f8216v = i7;
            n.l lVar = this.f8203i0;
            if (lVar != null) {
                setChecked(lVar.isChecked());
            }
        }
    }

    public void setItemPosition(int i7) {
        this.f8194b0 = i7;
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.f8198e = colorStateList;
        c();
    }

    public void setLabelFontScalingEnabled(boolean z5) {
        this.E0 = z5;
        setTextAppearanceActive(this.f8195c0);
        setTextAppearanceInactive(this.f8197d0);
        setHorizontalTextAppearanceActive(this.f8199e0);
        setHorizontalTextAppearanceInactive(this.f8200f0);
    }

    public void setLabelMaxLines(int i7) {
        TextView textView = this.S;
        textView.setMaxLines(i7);
        TextView textView2 = this.T;
        textView2.setMaxLines(i7);
        this.V.setMaxLines(i7);
        this.W.setMaxLines(i7);
        if (Build.VERSION.SDK_INT > 34) {
            textView.setGravity(17);
            textView2.setGravity(17);
        } else if (i7 > 1) {
            textView.setEllipsize(null);
            textView2.setEllipsize(null);
            textView.setGravity(17);
            textView2.setGravity(17);
        } else {
            textView.setGravity(16);
            textView2.setGravity(16);
        }
        requestLayout();
    }

    public void setLabelVisibilityMode(int i7) {
        if (this.K != i7) {
            this.K = i7;
            if (this.f8215u0 && i7 == 2) {
                this.f8208n0 = I0;
            } else {
                this.f8208n0 = H0;
            }
            k(getWidth());
            n.l lVar = this.f8203i0;
            if (lVar != null) {
                setChecked(lVar.isChecked());
            }
        }
    }

    public void setMeasureBottomPaddingFromLabelBaseline(boolean z5) {
        this.D0 = z5;
        this.R.setMeasurePaddingFromBaseline(z5);
        this.S.setIncludeFontPadding(z5);
        this.T.setIncludeFontPadding(z5);
        this.U.setMeasurePaddingFromBaseline(z5);
        this.V.setIncludeFontPadding(z5);
        this.W.setIncludeFontPadding(z5);
        requestLayout();
    }

    @Override // eh.h
    public void setOnlyShowWhenExpanded(boolean z5) {
        this.C0 = z5;
        m();
    }

    public void setShifting(boolean z5) {
        if (this.L != z5) {
            this.L = z5;
            n.l lVar = this.f8203i0;
            if (lVar != null) {
                setChecked(lVar.isChecked());
            }
        }
    }

    public void setTextAppearanceActive(int i7) {
        this.f8195c0 = i7;
        l(i7, this.T);
    }

    public void setTextAppearanceActiveBoldEnabled(boolean z5) {
        this.h0 = z5;
        setTextAppearanceActive(this.f8195c0);
        setHorizontalTextAppearanceActive(this.f8199e0);
        TextView textView = this.T;
        textView.setTypeface(textView.getTypeface(), this.h0 ? 1 : 0);
        TextView textView2 = this.W;
        textView2.setTypeface(textView2.getTypeface(), this.h0 ? 1 : 0);
    }

    public void setTextAppearanceInactive(int i7) {
        this.f8197d0 = i7;
        TextView textView = this.S;
        if (textView == null) {
            return;
        }
        h(i7, textView);
        b();
        textView.setMinimumHeight(com.facebook.imagepipeline.nativecode.c.z(textView.getContext(), i7));
        ColorStateList colorStateList = this.f8201g0;
        if (colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f8201g0 = colorStateList;
        if (colorStateList != null) {
            this.S.setTextColor(colorStateList);
            this.T.setTextColor(colorStateList);
            this.V.setTextColor(colorStateList);
            this.W.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        this.S.setText(charSequence);
        this.T.setText(charSequence);
        this.V.setText(charSequence);
        this.W.setText(charSequence);
        n.l lVar = this.f8203i0;
        if (lVar == null || TextUtils.isEmpty(lVar.f16181q)) {
            setContentDescription(charSequence);
        }
        n.l lVar2 = this.f8203i0;
        if (lVar2 != null && !TextUtils.isEmpty(lVar2.f16182r)) {
            charSequence = this.f8203i0.f16182r;
        }
        ib.a.I(this, charSequence);
    }

    public void setItemBackground(Drawable drawable) {
        if (drawable != null && drawable.getConstantState() != null) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        this.f8202i = drawable;
        c();
    }
}

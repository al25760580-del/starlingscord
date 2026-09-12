package gk;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.animation.DecelerateInterpolator;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Scroller;
import androidx.appcompat.widget.t2;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.views.image.ReactImageView;
import com.henninghall.date_picker.pickers.AndroidNative;
import e4.p;
import fk.o;
import ga.l;
import java.util.Formatter;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public abstract class i extends LinearLayout {
    public static final h E0 = new h();
    public static final char[] F0 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 1632, 1633, 1634, 1635, 1636, 1637, 1638, 1639, 1640, 1641, 1776, 1777, 1778, 1779, 1780, 1781, 1782, 1783, 1784, 1785, 2406, 2407, 2408, 2409, 2410, 2411, 2412, 2413, 2414, 2415, 2534, 2535, 2536, 2537, 2538, 2539, 2540, 2541, 2542, 2543, 3302, 3303, 3304, 3305, 3306, 3307, 3308, 3309, 3310, 3311};
    public final f A0;
    public int B0;
    public final boolean C0;
    public long D0;
    public final boolean E;
    public final int F;
    public int G;
    public String[] H;
    public int I;
    public int J;
    public int K;
    public e L;
    public d M;
    public b N;
    public long O;
    public final SparseArray P;
    public final int[] Q;
    public final Paint R;
    public final Drawable S;
    public int T;
    public int U;
    public int V;
    public final Scroller W;
    public final Scroller a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public int f10063b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public g f10064c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f10065d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public ge.b f10066d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final EditText f10067e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public a3.h f10068e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public float f10069f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public long f10070g0;
    public float h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f10071i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public VelocityTracker f10072i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public final int f10073j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final int f10074k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public final int f10075l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public boolean f10076m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public final int f10077n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public final boolean f10078o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Drawable f10079p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f10080q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f10081r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public boolean f10082s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public boolean f10083t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f10084u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f10085v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public int f10086v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f10087w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public int f10088w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f10089x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public boolean f10090x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f10091y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public boolean f10092y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public a f10093z0;

    public i(Context context, AttributeSet attributeSet) {
        i iVar;
        Context context2;
        super(context, attributeSet, R.attr.numberPickerStyle, 0);
        int i7 = 1;
        this.f10065d = true;
        this.O = 300L;
        this.P = new SparseArray();
        this.Q = new int[3];
        this.U = Integer.MIN_VALUE;
        this.f10081r0 = 0;
        this.B0 = -1;
        this.D0 = 0L;
        int[] iArr = o.f9288a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.numberPickerStyle, 0);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            iVar = this;
            context2 = context;
            iVar.saveAttributeDataForStyleable(context2, iArr, attributeSet, typedArrayObtainStyledAttributes, R.attr.numberPickerStyle, 0);
        } else {
            iVar = this;
            context2 = context;
        }
        iVar.f10078o0 = true;
        iVar.C0 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        iVar.f10077n0 = typedArrayObtainStyledAttributes.getColor(9, 0);
        Drawable drawable = getResources().getDrawable(com.discord.R.drawable.number_picker_divider_material);
        if (drawable != null) {
            drawable.setCallback(this);
            drawable.setLayoutDirection(getLayoutDirection());
            if (drawable.isStateful()) {
                drawable.setState(getDrawableState());
            }
        }
        iVar.f10079p0 = drawable;
        iVar.f10080q0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, (int) TypedValue.applyDimension(1, 2.0f, getResources().getDisplayMetrics()));
        iVar.f10071i = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, (int) TypedValue.applyDimension(1, 48.0f, getResources().getDisplayMetrics()));
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, -1);
        iVar.f10085v = dimensionPixelSize;
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, -1);
        iVar.f10087w = dimensionPixelSize2;
        if (dimensionPixelSize != -1 && dimensionPixelSize2 != -1 && dimensionPixelSize > dimensionPixelSize2) {
            throw new IllegalArgumentException("minHeight > maxHeight");
        }
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, -1);
        iVar.f10089x = dimensionPixelSize3;
        int dimensionPixelSize4 = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, -1);
        iVar.f10091y = dimensionPixelSize4;
        if (dimensionPixelSize3 != -1 && dimensionPixelSize4 != -1 && dimensionPixelSize3 > dimensionPixelSize4) {
            throw new IllegalArgumentException("minWidth > maxWidth");
        }
        iVar.E = dimensionPixelSize4 == -1;
        iVar.S = typedArrayObtainStyledAttributes.getDrawable(10);
        typedArrayObtainStyledAttributes.recycle();
        AndroidNative androidNative = (AndroidNative) iVar;
        iVar.A0 = new f(androidNative);
        setWillNotDraw(false);
        ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(com.discord.R.layout.number_picker_material, (ViewGroup) this, true);
        EditText editText = (EditText) findViewById(com.discord.R.id.numberpicker_input);
        iVar.f10067e = editText;
        editText.setOnFocusChangeListener(new t2(androidNative, i7));
        editText.setFilters(new InputFilter[]{new c(androidNative)});
        editText.setRawInputType(2);
        editText.setImeOptions(6);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context2);
        iVar.f10073j0 = viewConfiguration.getScaledTouchSlop();
        iVar.f10074k0 = viewConfiguration.getScaledMinimumFlingVelocity();
        iVar.f10075l0 = viewConfiguration.getScaledMaximumFlingVelocity();
        int textSize = (int) editText.getTextSize();
        iVar.F = textSize;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setTextSize(textSize);
        paint.setTypeface(editText.getTypeface());
        paint.setColor(editText.getTextColors().getColorForState(LinearLayout.ENABLED_STATE_SET, -1));
        iVar.R = paint;
        iVar.W = new Scroller(getContext(), null, true);
        iVar.a0 = new Scroller(getContext(), new DecelerateInterpolator(2.5f));
        q();
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        if (i10 < 26 || getFocusable() != 16) {
            return;
        }
        setFocusable(1);
        setFocusableInTouchMode(true);
    }

    public static final b getTwoDigitFormatter() {
        return E0;
    }

    public static int i(int i7, int i10) {
        if (i10 != -1) {
            int size = View.MeasureSpec.getSize(i7);
            int mode = View.MeasureSpec.getMode(i7);
            if (mode == Integer.MIN_VALUE) {
                return View.MeasureSpec.makeMeasureSpec(Math.min(size, i10), 1073741824);
            }
            if (mode == 0) {
                return View.MeasureSpec.makeMeasureSpec(i10, 1073741824);
            }
            if (mode != 1073741824) {
                throw new IllegalArgumentException(kk.b.h(mode, "Unknown measure mode: "));
            }
        }
        return i7;
    }

    public final void a(boolean z5) {
        if (!this.f10078o0) {
            if (z5) {
                n(this.K + 1, true);
                return;
            } else {
                n(this.K - 1, true);
                return;
            }
        }
        g();
        Scroller scroller = this.W;
        if (!j(scroller)) {
            j(this.a0);
        }
        this.f10063b0 = 0;
        if (z5) {
            scroller.startScroll(0, 0, 0, -this.T, ReactImageView.REMOTE_IMAGE_FADE_DURATION_MS);
        } else {
            scroller.startScroll(0, 0, 0, this.T, ReactImageView.REMOTE_IMAGE_FADE_DURATION_MS);
        }
        invalidate();
    }

    public final void b(int i7) {
        String strD;
        SparseArray sparseArray = this.P;
        if (((String) sparseArray.get(i7)) != null) {
            return;
        }
        int i10 = this.I;
        if (i7 < i10 || i7 > this.J) {
            strD = "";
        } else {
            String[] strArr = this.H;
            strD = strArr != null ? strArr[i7 - i10] : d(i7);
        }
        sparseArray.put(i7, strD);
    }

    public final void c() {
        int i7 = this.U - this.V;
        if (i7 != 0) {
            this.f10063b0 = 0;
            int iAbs = Math.abs(i7);
            int i10 = this.T;
            if (iAbs > i10 / 2) {
                if (i7 > 0) {
                    i10 = -i10;
                }
                i7 += i10;
            }
            this.a0.startScroll(0, 0, 0, i7, 800);
            invalidate();
        }
    }

    @Override // android.view.View
    public final void computeScroll() {
        Scroller scroller = this.W;
        if (scroller.isFinished()) {
            scroller = this.a0;
            if (scroller.isFinished()) {
                return;
            }
        }
        scroller.computeScrollOffset();
        int currY = scroller.getCurrY();
        if (this.f10063b0 == 0) {
            this.f10063b0 = scroller.getStartY();
        }
        scrollBy(0, currY - this.f10063b0);
        this.f10063b0 = currY;
        if (scroller.isFinished()) {
            l(scroller);
        } else {
            invalidate();
        }
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        return getHeight();
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        return this.V;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        return ((this.J - this.I) + 1) * this.T;
    }

    public final String d(int i7) {
        b bVar = this.N;
        if (bVar == null) {
            return String.format(Locale.getDefault(), "%d", Integer.valueOf(i7));
        }
        h hVar = (h) bVar;
        StringBuilder sb2 = hVar.f10059a;
        Object[] objArr = hVar.f10062d;
        Locale locale = Locale.getDefault();
        if (hVar.f10060b != DecimalFormatSymbols.getInstance(locale).getZeroDigit()) {
            hVar.f10061c = new Formatter(sb2, locale);
            hVar.f10060b = DecimalFormatSymbols.getInstance(locale).getZeroDigit();
        }
        objArr[0] = Integer.valueOf(i7);
        sb2.delete(0, sb2.length());
        hVar.f10061c.format("%02d", objArr);
        return hVar.f10061c.toString();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int i7;
        if (!this.f10078o0) {
            return super.dispatchHoverEvent(motionEvent);
        }
        if (!((AccessibilityManager) getContext().getSystemService("accessibility")).isEnabled()) {
            return false;
        }
        int y5 = (int) motionEvent.getY();
        if (y5 < this.f10084u0) {
            i7 = 3;
        } else {
            i7 = y5 > this.f10086v0 ? 1 : 2;
        }
        int actionMasked = motionEvent.getActionMasked();
        a aVar = (a) getAccessibilityNodeProvider();
        if (actionMasked == 7) {
            int i10 = this.f10088w0;
            if (i10 == i7 || i10 == -1) {
                return false;
            }
            aVar.f(i10, IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER);
            aVar.f(i7, IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
            this.f10088w0 = i7;
            aVar.performAction(i7, 64, null);
            return false;
        }
        if (actionMasked == 9) {
            aVar.f(i7, IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
            this.f10088w0 = i7;
            aVar.performAction(i7, 64, null);
            return false;
        }
        if (actionMasked != 10) {
            return false;
        }
        aVar.f(i7, IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER);
        this.f10088w0 = -1;
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 19 || keyCode == 20) {
            if (this.f10078o0) {
                int action = keyEvent.getAction();
                if (action == 0) {
                    if (!this.f10076m0) {
                        if (keyCode == 20) {
                        }
                    }
                    requestFocus();
                    this.B0 = keyCode;
                    m();
                    if (this.W.isFinished()) {
                        a(keyCode == 20);
                    }
                    return true;
                }
                if (action == 1 && this.B0 == keyCode) {
                    this.B0 = -1;
                    return true;
                }
            }
        } else if (keyCode == 23 || keyCode == 66 || keyCode == 160) {
            m();
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 3) {
            m();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 3) {
            m();
        }
        return super.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f10079p0;
        if (drawable != null && drawable.isStateful() && drawable.setState(getDrawableState())) {
            invalidateDrawable(drawable);
        }
    }

    public final int e(String str) {
        try {
            if (this.H == null) {
                return Integer.parseInt(str);
            }
            for (int i7 = 0; i7 < this.H.length; i7++) {
                str = str.toLowerCase();
                if (this.H[i7].toLowerCase().startsWith(str)) {
                    return this.I + i7;
                }
            }
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return this.I;
        }
    }

    public final int f(int i7) {
        int i10 = this.J;
        if (i7 > i10) {
            int i11 = this.I;
            return (((i7 - i10) % (i10 - i11)) + i11) - 1;
        }
        int i12 = this.I;
        return i7 < i12 ? (i10 - ((i12 - i7) % (i10 - i12))) + 1 : i7;
    }

    public final void g() {
        InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService(InputMethodManager.class);
        EditText editText = this.f10067e;
        if (inputMethodManager != null && inputMethodManager.isActive(editText)) {
            inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
        }
        if (this.f10078o0) {
            editText.setVisibility(4);
        }
    }

    @Override // android.view.View
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        if (!this.f10078o0) {
            return super.getAccessibilityNodeProvider();
        }
        if (this.f10093z0 == null) {
            this.f10093z0 = new a(this);
        }
        return this.f10093z0;
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        return 0.9f;
    }

    public CharSequence getDisplayedValueForCurrentSelection() {
        return (CharSequence) this.P.get(getValue());
    }

    public String[] getDisplayedValues() {
        return this.H;
    }

    public int getMaxValue() {
        return this.J;
    }

    public int getMinValue() {
        return this.I;
    }

    public int getSelectionDividerHeight() {
        return this.f10080q0;
    }

    @Override // android.view.View
    public int getSolidColor() {
        return this.f10077n0;
    }

    public int getTextColor() {
        return this.R.getColor();
    }

    public float getTextSize() {
        return this.R.getTextSize();
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        return 0.9f;
    }

    public int getValue() {
        return this.K;
    }

    public boolean getWrapSelectorWheel() {
        return this.f10076m0;
    }

    public final void h() {
        this.P.clear();
        int value = getValue();
        int i7 = 0;
        while (true) {
            int[] iArr = this.Q;
            if (i7 >= iArr.length) {
                return;
            }
            int iF = (i7 - 1) + value;
            if (this.f10076m0) {
                iF = f(iF);
            }
            iArr[i7] = iF;
            b(iF);
            i7++;
        }
    }

    public final boolean j(Scroller scroller) {
        scroller.forceFinished(true);
        int finalY = scroller.getFinalY() - scroller.getCurrY();
        int i7 = this.U - ((this.V + finalY) % this.T);
        if (i7 == 0) {
            return false;
        }
        int iAbs = Math.abs(i7);
        int i10 = this.T;
        if (iAbs > i10 / 2) {
            i7 = i7 > 0 ? i7 - i10 : i7 + i10;
        }
        scrollBy(0, finalY + i7);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f10079p0;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public final void k(int i7) {
        if (this.f10081r0 == i7) {
            return;
        }
        this.f10081r0 = i7;
        d dVar = this.M;
        if (dVar != null) {
            AndroidNative androidNative = (AndroidNative) ((ue.i) dVar).f21117d;
            if (androidNative.H0 != 0 && i7 == 0) {
                androidNative.s();
            }
            androidNative.H0 = i7;
            if (i7 != 0) {
                androidNative.L0 = true;
                ((ue.i) androidNative.G0).o();
            }
        }
    }

    public final void l(Scroller scroller) {
        if (scroller == this.W) {
            c();
            q();
            k(0);
        } else if (this.f10081r0 != 1) {
            q();
        }
    }

    public final void m() {
        ge.b bVar = this.f10066d0;
        if (bVar != null) {
            removeCallbacks(bVar);
        }
        g gVar = this.f10064c0;
        if (gVar != null && gVar.f10058v) {
            gVar.f10055d.removeCallbacks(gVar);
            gVar.f10058v = false;
        }
        a3.h hVar = this.f10068e0;
        if (hVar != null) {
            removeCallbacks(hVar);
        }
        this.A0.a();
    }

    public final void n(int i7, boolean z5) {
        e eVar;
        if (this.K == i7) {
            return;
        }
        int iF = this.f10076m0 ? f(i7) : Math.min(Math.max(i7, this.I), this.J);
        int i10 = this.K;
        this.K = iF;
        if (this.f10081r0 != 2) {
            q();
        }
        if (z5 && (eVar = this.L) != null) {
            int i11 = this.K;
            AndroidNative androidNative = (AndroidNative) ((u4.c) eVar).f20946d;
            ik.d dVar = androidNative.I0;
            if (dVar != null) {
                kk.c cVar = (kk.c) ((l) dVar).f9547e;
                p pVar = cVar.f14557a;
                mk.d dVar2 = cVar.f14558b;
                if (((l) pVar.f8030n).t()) {
                    String str = (String) dVar2.f15870c.get(i10);
                    String str2 = (String) dVar2.f15870c.get(i11);
                    if ((str.equals("12") && str2.equals("11")) || (str.equals("11") && str2.equals("12"))) {
                        ik.e eVar2 = cVar.f14561e.f15871d;
                        ((AndroidNative) eVar2).t((eVar2.getValue() + 1) % 2);
                    }
                }
            }
            if (androidNative.H0 == 0) {
                androidNative.s();
            }
        }
        h();
        invalidate();
    }

    public final void o() {
        InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService(InputMethodManager.class);
        if (inputMethodManager != null) {
            boolean z5 = this.f10078o0;
            EditText editText = this.f10067e;
            if (z5) {
                editText.setVisibility(0);
            }
            editText.requestFocus();
            inputMethodManager.showSoftInput(editText, 0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable drawable;
        Drawable drawable2;
        if (!this.f10078o0) {
            super.onDraw(canvas);
            return;
        }
        boolean zHasFocus = this.C0 ? hasFocus() : true;
        float right = (getRight() - getLeft()) / 2;
        float f2 = this.V;
        if (zHasFocus && (drawable2 = this.S) != null && this.f10081r0 == 0) {
            boolean z5 = this.f10092y0;
            int[] iArr = LinearLayout.PRESSED_STATE_SET;
            if (z5) {
                drawable2.setState(iArr);
                drawable2.setBounds(0, 0, getRight(), this.f10084u0);
                drawable2.draw(canvas);
            }
            if (this.f10090x0) {
                drawable2.setState(iArr);
                drawable2.setBounds(0, this.f10086v0, getRight(), getBottom());
                drawable2.draw(canvas);
            }
        }
        int i7 = 0;
        while (true) {
            int[] iArr2 = this.Q;
            if (i7 >= iArr2.length) {
                break;
            }
            String str = (String) this.P.get(iArr2[i7]);
            if ((zHasFocus && i7 != 1) || (i7 == 1 && this.f10067e.getVisibility() != 0)) {
                canvas.drawText(str, right, f2, this.R);
            }
            f2 += this.T;
            i7++;
        }
        if (!zHasFocus || (drawable = this.f10079p0) == null) {
            return;
        }
        int i10 = this.f10084u0;
        drawable.setBounds(0, i10, getRight(), this.f10080q0 + i10);
        drawable.draw(canvas);
        int i11 = this.f10086v0;
        drawable.setBounds(0, i11 - this.f10080q0, getRight(), i11);
        drawable.draw(canvas);
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if (!this.f10078o0 || !isEnabled()) {
            return super.onGenericMotionEvent(motionEvent);
        }
        if (motionEvent.getActionMasked() == 8) {
            float axisValue = motionEvent.getAxisValue(9);
            if (axisValue != 0.0f) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - this.D0 >= 150) {
                    this.D0 = jCurrentTimeMillis;
                    if (axisValue < 0.0f) {
                        if (this.f10076m0 || getValue() < getMaxValue()) {
                            a(true);
                            return true;
                        }
                    } else if (this.f10076m0 || getValue() > getMinValue()) {
                        a(false);
                        return true;
                    }
                }
                return true;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f10078o0 || !isEnabled() || motionEvent.getActionMasked() != 0) {
            return false;
        }
        m();
        g();
        float y5 = motionEvent.getY();
        this.f10069f0 = y5;
        this.h0 = y5;
        this.f10070g0 = motionEvent.getEventTime();
        this.f10082s0 = false;
        this.f10083t0 = false;
        float f2 = this.f10069f0;
        float f7 = this.f10084u0;
        f fVar = this.A0;
        if (f2 < f7) {
            if (this.f10081r0 == 0) {
                fVar.a();
                fVar.f10053e = 1;
                fVar.f10052d = 2;
                fVar.f10054i.postDelayed(fVar, ViewConfiguration.getTapTimeout());
            }
        } else if (f2 > this.f10086v0 && this.f10081r0 == 0) {
            fVar.a();
            fVar.f10053e = 1;
            fVar.f10052d = 1;
            fVar.f10054i.postDelayed(fVar, ViewConfiguration.getTapTimeout());
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        Scroller scroller = this.W;
        boolean zIsFinished = scroller.isFinished();
        Scroller scroller2 = this.a0;
        if (!zIsFinished) {
            scroller.forceFinished(true);
            scroller2.forceFinished(true);
            l(scroller);
            k(0);
            return true;
        }
        if (!scroller2.isFinished()) {
            scroller.forceFinished(true);
            scroller2.forceFinished(true);
            l(scroller2);
            return true;
        }
        float f10 = this.f10069f0;
        if (f10 < this.f10084u0) {
            long longPressTimeout = ViewConfiguration.getLongPressTimeout();
            Runnable runnable = this.f10066d0;
            if (runnable == null) {
                this.f10066d0 = new ge.b(this, 1);
            } else {
                removeCallbacks(runnable);
            }
            ge.b bVar = this.f10066d0;
            bVar.f9965e = false;
            postDelayed(bVar, longPressTimeout);
            return true;
        }
        if (f10 <= this.f10086v0) {
            this.f10083t0 = true;
            Runnable runnable2 = this.f10068e0;
            if (runnable2 == null) {
                this.f10068e0 = new a3.h(16, this);
            } else {
                removeCallbacks(runnable2);
            }
            postDelayed(this.f10068e0, ViewConfiguration.getLongPressTimeout());
            return true;
        }
        long longPressTimeout2 = ViewConfiguration.getLongPressTimeout();
        Runnable runnable3 = this.f10066d0;
        if (runnable3 == null) {
            this.f10066d0 = new ge.b(this, 1);
        } else {
            removeCallbacks(runnable3);
        }
        ge.b bVar2 = this.f10066d0;
        bVar2.f9965e = true;
        postDelayed(bVar2, longPressTimeout2);
        return true;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i7, int i10, int i11, int i12) {
        if (!this.f10078o0) {
            super.onLayout(z5, i7, i10, i11, i12);
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        EditText editText = this.f10067e;
        int measuredWidth2 = editText.getMeasuredWidth();
        int measuredHeight2 = editText.getMeasuredHeight();
        int i13 = (measuredWidth - measuredWidth2) / 2;
        int i14 = (measuredHeight - measuredHeight2) / 2;
        editText.layout(i13, i14, measuredWidth2 + i13, measuredHeight2 + i14);
        if (z5) {
            h();
            int[] iArr = this.Q;
            int length = iArr.length;
            int i15 = this.F;
            int bottom = (int) ((((getBottom() - getTop()) - (length * i15)) / iArr.length) + 0.5f);
            this.G = bottom;
            this.T = bottom + i15;
            int top = (editText.getTop() + editText.getBaseline()) - this.T;
            this.U = top;
            this.V = top;
            q();
            setVerticalFadingEdgeEnabled(true);
            setFadingEdgeLength(((getBottom() - getTop()) - i15) / 2);
            int height = getHeight();
            int i16 = this.f10071i;
            int i17 = this.f10080q0;
            int i18 = ((height - i16) / 2) - i17;
            this.f10084u0 = i18;
            this.f10086v0 = (i17 * 2) + i18 + i16;
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        if (!this.f10078o0) {
            super.onMeasure(i7, i10);
            return;
        }
        super.onMeasure(i(i7, this.f10091y), i(i10, this.f10087w));
        int measuredWidth = getMeasuredWidth();
        int i11 = this.f10089x;
        if (i11 != -1) {
            measuredWidth = View.resolveSizeAndState(Math.max(i11, measuredWidth), i7, 0);
        }
        int measuredHeight = getMeasuredHeight();
        int i12 = this.f10085v;
        if (i12 != -1) {
            measuredHeight = View.resolveSizeAndState(Math.max(i12, measuredHeight), i10, 0);
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled() || !this.f10078o0) {
            return false;
        }
        if (this.f10072i0 == null) {
            this.f10072i0 = VelocityTracker.obtain();
        }
        this.f10072i0.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int i7 = this.f10073j0;
        if (actionMasked != 1) {
            if (actionMasked != 2 || this.f10082s0) {
                return true;
            }
            float y5 = motionEvent.getY();
            if (this.f10081r0 == 1) {
                scrollBy(0, (int) (y5 - this.h0));
                invalidate();
            } else if (((int) Math.abs(y5 - this.f10069f0)) > i7) {
                m();
                k(1);
            }
            this.h0 = y5;
            return true;
        }
        a3.h hVar = this.f10068e0;
        if (hVar != null) {
            removeCallbacks(hVar);
        }
        ge.b bVar = this.f10066d0;
        if (bVar != null) {
            removeCallbacks(bVar);
        }
        f fVar = this.A0;
        fVar.a();
        AndroidNative androidNative = fVar.f10054i;
        VelocityTracker velocityTracker = this.f10072i0;
        velocityTracker.computeCurrentVelocity(1000, this.f10075l0);
        int yVelocity = (int) velocityTracker.getYVelocity();
        if (Math.abs(yVelocity) > this.f10074k0) {
            this.f10063b0 = 0;
            Scroller scroller = this.W;
            if (yVelocity > 0) {
                scroller.fling(0, 0, 0, yVelocity, 0, 0, 0, Integer.MAX_VALUE);
            } else {
                scroller.fling(0, Integer.MAX_VALUE, 0, yVelocity, 0, 0, 0, Integer.MAX_VALUE);
            }
            invalidate();
            k(2);
        } else {
            int y8 = (int) motionEvent.getY();
            int iAbs = (int) Math.abs(y8 - this.f10069f0);
            long eventTime = motionEvent.getEventTime() - this.f10070g0;
            if (iAbs > i7 || eventTime >= ViewConfiguration.getTapTimeout()) {
                c();
            } else if (this.f10083t0) {
                this.f10083t0 = false;
                performClick();
            } else {
                int i10 = (y8 / this.T) - 1;
                if (i10 > 0) {
                    a(true);
                    fVar.a();
                    fVar.f10053e = 2;
                    fVar.f10052d = 1;
                    androidNative.post(fVar);
                } else if (i10 < 0) {
                    a(false);
                    fVar.a();
                    fVar.f10053e = 2;
                    fVar.f10052d = 2;
                    androidNative.post(fVar);
                }
            }
            k(0);
        }
        this.f10072i0.recycle();
        this.f10072i0 = null;
        return true;
    }

    public final void p() {
        int i7;
        if (this.E) {
            String[] strArr = this.H;
            Paint paint = this.R;
            int i10 = 0;
            if (strArr == null) {
                float f2 = 0.0f;
                for (int i11 = 0; i11 <= 9; i11++) {
                    float fMeasureText = paint.measureText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i11)));
                    if (fMeasureText > f2) {
                        f2 = fMeasureText;
                    }
                }
                for (int i12 = this.J; i12 > 0; i12 /= 10) {
                    i10++;
                }
                i7 = (int) (i10 * f2);
            } else {
                int length = strArr.length;
                int i13 = 0;
                while (i10 < length) {
                    float fMeasureText2 = paint.measureText(this.H[i10]);
                    if (fMeasureText2 > i13) {
                        i13 = (int) fMeasureText2;
                    }
                    i10++;
                }
                i7 = i13;
            }
            EditText editText = this.f10067e;
            int paddingRight = editText.getPaddingRight() + editText.getPaddingLeft() + i7;
            if (this.f10091y != paddingRight) {
                int i14 = this.f10089x;
                if (paddingRight > i14) {
                    this.f10091y = paddingRight;
                } else {
                    this.f10091y = i14;
                }
                invalidate();
            }
        }
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (!this.f10078o0) {
            return super.performClick();
        }
        if (super.performClick()) {
            return true;
        }
        o();
        return true;
    }

    @Override // android.view.View
    public final boolean performLongClick() {
        if (!this.f10078o0) {
            return super.performLongClick();
        }
        if (!super.performLongClick()) {
            o();
            this.f10082s0 = true;
        }
        return true;
    }

    public final void q() {
        String[] strArr = this.H;
        String strD = strArr == null ? d(this.K) : strArr[this.K - this.I];
        if (TextUtils.isEmpty(strD)) {
            return;
        }
        EditText editText = this.f10067e;
        Editable text = editText.getText();
        if (strD.equals(text.toString())) {
            return;
        }
        editText.setText(strD);
        if (((AccessibilityManager) getContext().getSystemService("accessibility")).isEnabled()) {
            AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(16);
            editText.onInitializeAccessibilityEvent(accessibilityEventObtain);
            editText.onPopulateAccessibilityEvent(accessibilityEventObtain);
            accessibilityEventObtain.setFromIndex(0);
            accessibilityEventObtain.setRemovedCount(text.length());
            accessibilityEventObtain.setAddedCount(strD.length());
            accessibilityEventObtain.setBeforeText(text);
            accessibilityEventObtain.setSource(this, 2);
            requestSendAccessibilityEvent(this, accessibilityEventObtain);
        }
    }

    public final void r() {
        this.f10076m0 = this.J - this.I >= this.Q.length && this.f10065d;
    }

    @Override // android.view.View
    public final void scrollBy(int i7, int i10) {
        int i11;
        int i12 = this.V;
        boolean z5 = this.f10076m0;
        int[] iArr = this.Q;
        if (!z5 && i10 > 0 && iArr[1] <= this.I) {
            this.V = this.U;
            return;
        }
        if (!z5 && i10 < 0 && iArr[1] >= this.J) {
            this.V = this.U;
            return;
        }
        this.V = i10 + i12;
        while (true) {
            int i13 = this.V;
            if (i13 - this.U <= this.G) {
                break;
            }
            this.V = i13 - this.T;
            for (int length = iArr.length - 1; length > 0; length--) {
                iArr[length] = iArr[length - 1];
            }
            int i14 = iArr[1] - 1;
            if (this.f10076m0 && i14 < this.I) {
                i14 = this.J;
            }
            iArr[0] = i14;
            b(i14);
            n(iArr[1], true);
            if (!this.f10076m0 && iArr[1] <= this.I) {
                this.V = this.U;
            }
        }
        while (true) {
            i11 = this.V;
            if (i11 - this.U >= (-this.G)) {
                break;
            }
            this.V = i11 + this.T;
            int i15 = 0;
            while (i15 < iArr.length - 1) {
                int i16 = i15 + 1;
                iArr[i15] = iArr[i16];
                i15 = i16;
            }
            int i17 = iArr[iArr.length - 2] + 1;
            if (this.f10076m0 && i17 > this.J) {
                i17 = this.I;
            }
            iArr[iArr.length - 1] = i17;
            b(i17);
            n(iArr[1], true);
            if (!this.f10076m0 && iArr[1] >= this.J) {
                this.V = this.U;
            }
        }
        if (i12 != i11) {
            onScrollChanged(0, i11, 0, i12);
        }
    }

    public void setDisplayedValues(String[] strArr) {
        if (this.H == strArr) {
            return;
        }
        this.H = strArr;
        EditText editText = this.f10067e;
        if (strArr != null) {
            editText.setRawInputType(524289);
        } else {
            editText.setRawInputType(2);
        }
        q();
        h();
        p();
    }

    public void setDividerTint(int i7) {
        this.f10079p0.setTint(i7);
    }

    @Override // android.view.View
    public void setEnabled(boolean z5) {
        super.setEnabled(z5);
        boolean z6 = this.f10078o0;
        if (!z6 || !z6) {
            throw null;
        }
        this.f10067e.setEnabled(z5);
    }

    public void setFormatter(b bVar) {
        if (bVar == this.N) {
            return;
        }
        this.N = bVar;
        h();
        q();
    }

    public void setMaxValue(int i7) {
        if (this.J == i7) {
            return;
        }
        if (i7 < 0) {
            throw new IllegalArgumentException("maxValue must be >= 0");
        }
        this.J = i7;
        if (i7 < this.K) {
            this.K = i7;
        }
        r();
        h();
        q();
        p();
        invalidate();
    }

    public void setMinValue(int i7) {
        if (this.I == i7) {
            return;
        }
        if (i7 < 0) {
            throw new IllegalArgumentException("minValue must be >= 0");
        }
        this.I = i7;
        if (i7 > this.K) {
            this.K = i7;
        }
        r();
        h();
        q();
        p();
        invalidate();
    }

    public void setOnLongPressUpdateInterval(long j) {
        this.O = j;
    }

    public void setOnScrollListener(d dVar) {
        this.M = dVar;
    }

    public void setOnValueChangedListener(e eVar) {
        this.L = eVar;
    }

    public void setSelectionDividerHeight(int i7) {
        this.f10080q0 = i7;
        invalidate();
    }

    public void setTextColor(int i7) {
        this.R.setColor(i7);
        this.f10067e.setTextColor(i7);
        invalidate();
    }

    public void setTextSize(float f2) {
        this.R.setTextSize(f2);
        this.f10067e.setTextSize(0, f2);
        invalidate();
    }

    public void setValue(int i7) {
        n(i7, false);
    }

    public void setWrapSelectorWheel(boolean z5) {
        this.f10065d = z5;
        r();
    }
}

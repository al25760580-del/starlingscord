package nh;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.discord.R;
import com.google.android.material.textfield.TextInputLayout;
import kotlin.jvm.internal.LongCompanionObject;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends o {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f16848e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f16849f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TimeInterpolator f16850g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public AutoCompleteTextView f16851h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final com.discord.chat.presentation.list.delegate.b f16852i;
    public final com.discord.chat.input.views.b j;
    public final j k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f16853l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f16854m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f16855n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f16856o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public AccessibilityManager f16857p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ValueAnimator f16858q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ValueAnimator f16859r;

    /* JADX WARN: Type inference failed for: r0v2, types: [nh.j] */
    public k(n nVar) {
        super(nVar);
        this.f16852i = new com.discord.chat.presentation.list.delegate.b(12, this);
        this.j = new com.discord.chat.input.views.b(3, this);
        this.k = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: nh.j
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z5) {
                k kVar = this.f16847a;
                AutoCompleteTextView autoCompleteTextView = kVar.f16851h;
                if (autoCompleteTextView == null || autoCompleteTextView.getInputType() != 0) {
                    return;
                }
                kVar.f16872d.setImportantForAccessibility(z5 ? 2 : 1);
            }
        };
        this.f16856o = LongCompanionObject.MAX_VALUE;
        this.f16849f = io.sentry.config.a.S(nVar.getContext(), R.attr.motionDurationShort3, 67);
        this.f16848e = io.sentry.config.a.S(nVar.getContext(), R.attr.motionDurationShort3, 50);
        this.f16850g = io.sentry.config.a.T(nVar.getContext(), R.attr.motionEasingLinearInterpolator, lg.a.f15071a);
    }

    @Override // nh.o
    public final void a() {
        if (this.f16857p.isTouchExplorationEnabled() && this.f16851h.getInputType() != 0 && !this.f16872d.hasFocus()) {
            this.f16851h.dismissDropDown();
        }
        this.f16851h.post(new io.sentry.android.core.p(26, this));
    }

    @Override // nh.o
    public final int c() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    @Override // nh.o
    public final int d() {
        return R.drawable.mtrl_dropdown_arrow;
    }

    @Override // nh.o
    public final View.OnFocusChangeListener e() {
        return this.j;
    }

    @Override // nh.o
    public final View.OnClickListener f() {
        return this.f16852i;
    }

    @Override // nh.o
    public final AccessibilityManager.TouchExplorationStateChangeListener h() {
        return this.k;
    }

    @Override // nh.o
    public final boolean i(int i7) {
        return i7 != 0;
    }

    @Override // nh.o
    public final boolean k() {
        return this.f16855n;
    }

    @Override // nh.o
    public final void l(EditText editText) {
        if (!(editText instanceof AutoCompleteTextView)) {
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        this.f16851h = autoCompleteTextView;
        autoCompleteTextView.setOnTouchListener(new View.OnTouchListener() { // from class: nh.h
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 1) {
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    k kVar = this.f16845d;
                    long j = jUptimeMillis - kVar.f16856o;
                    if (j < 0 || j > 300) {
                        kVar.f16854m = false;
                    }
                    kVar.t();
                    kVar.f16854m = true;
                    kVar.f16856o = SystemClock.uptimeMillis();
                }
                return false;
            }
        });
        this.f16851h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: nh.i
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                k kVar = this.f16846a;
                kVar.f16854m = true;
                kVar.f16856o = SystemClock.uptimeMillis();
                kVar.s(false);
            }
        });
        this.f16851h.setThreshold(0);
        TextInputLayout textInputLayout = this.f16869a;
        textInputLayout.setErrorIconDrawable((Drawable) null);
        if (editText.getInputType() == 0 && this.f16857p.isTouchExplorationEnabled()) {
            this.f16872d.setImportantForAccessibility(2);
        }
        textInputLayout.setEndIconVisible(true);
    }

    @Override // nh.o
    public final void m(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        if (this.f16851h.getInputType() == 0) {
            accessibilityNodeInfoCompat.o(Spinner.class.getName());
        }
        if (accessibilityNodeInfoCompat.k()) {
            accessibilityNodeInfoCompat.u(null);
        }
    }

    @Override // nh.o
    public final void n(AccessibilityEvent accessibilityEvent) {
        if (this.f16857p.isEnabled() && this.f16851h.getInputType() == 0) {
            boolean z5 = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.f16855n && !this.f16851h.isPopupShowing();
            if (accessibilityEvent.getEventType() == 1 || z5) {
                t();
                this.f16854m = true;
                this.f16856o = SystemClock.uptimeMillis();
            }
        }
    }

    @Override // nh.o
    public final void q() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f16850g;
        valueAnimatorOfFloat.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat.setDuration(this.f16849f);
        int i7 = 8;
        valueAnimatorOfFloat.addUpdateListener(new com.discord.chat.presentation.list.c(i7, this));
        this.f16859r = valueAnimatorOfFloat;
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat2.setDuration(this.f16848e);
        valueAnimatorOfFloat2.addUpdateListener(new com.discord.chat.presentation.list.c(i7, this));
        this.f16858q = valueAnimatorOfFloat2;
        valueAnimatorOfFloat2.addListener(new androidx.appcompat.widget.c(5, this));
        this.f16857p = (AccessibilityManager) this.f16871c.getSystemService("accessibility");
    }

    @Override // nh.o
    public final void r() {
        AutoCompleteTextView autoCompleteTextView = this.f16851h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.f16851h.setOnDismissListener(null);
        }
    }

    public final void s(boolean z5) {
        if (this.f16855n != z5) {
            this.f16855n = z5;
            this.f16859r.cancel();
            this.f16858q.start();
        }
    }

    public final void t() {
        if (this.f16851h == null) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis() - this.f16856o;
        if (jUptimeMillis < 0 || jUptimeMillis > 300) {
            this.f16854m = false;
        }
        if (this.f16854m) {
            this.f16854m = false;
            return;
        }
        s(!this.f16855n);
        if (!this.f16855n) {
            this.f16851h.dismissDropDown();
        } else {
            this.f16851h.requestFocus();
            this.f16851h.showDropDown();
        }
    }
}

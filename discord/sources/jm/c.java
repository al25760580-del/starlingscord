package jm;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.PaintDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.provider.Settings;
import android.util.TypedValue;
import android.view.Choreographer;
import android.view.Display;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.x0;
import androidx.core.view.y0;
import com.facebook.react.R;
import com.facebook.react.uimanager.BackgroundStyleApplicator;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.PointerEvents;
import com.facebook.react.uimanager.ReactPointerEventsView;
import com.facebook.react.uimanager.ViewProps;
import im.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends ViewGroup implements im.o, ReactPointerEventsView {

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static c f13922n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static c f13923o0;
    public int E;
    public int F;
    public float G;
    public float H;
    public float I;
    public float J;
    public int K;
    public int L;
    public float M;
    public float N;
    public float O;
    public Integer P;
    public float Q;
    public float R;
    public boolean S;
    public PointerEvents T;
    public boolean U;
    public long V;
    public int W;
    public boolean a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public AnimatorSet f13926b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public PaintDrawable f13927c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Integer f13928d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public long f13929d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Integer f13930e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public com.discord.media.engine.video.egl_renderer.b f13931e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public com.facebook.react.modules.core.b f13932f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public boolean f13933g0;
    public boolean h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f13934i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public boolean f13935i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public RippleDrawable f13936j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public boolean f13937k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public boolean f13938l0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f13939v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f13940w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f13941x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f13942y;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final TypedValue f13921m0 = new TypedValue();

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final com.discord.chat.presentation.message.system.b f13924p0 = new com.discord.chat.presentation.message.system.b(5);

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final b f13925q0 = new b();

    private final float getAnimatorDurationScale() {
        if (Build.VERSION.SDK_INT >= 33) {
            return ValueAnimator.getDurationScale();
        }
        try {
            return Settings.Global.getFloat(getContext().getContentResolver(), "animator_duration_scale");
        } catch (Settings.SettingNotFoundException unused) {
            return 1.0f;
        }
    }

    private final boolean getHasOpacityAnimation() {
        return (this.G == 1.0f && this.H == 1.0f && getHoverOpacity() == 1.0f) ? false : true;
    }

    private final boolean getHasScaleAnimation() {
        return (this.I == 1.0f && this.J == 1.0f && getHoverScale() == 1.0f) ? false : true;
    }

    private final boolean getHasUnderlayAnimation() {
        if (this.f13927c0 != null) {
            return (this.Q == this.R && getHoverUnderlayOpacity() == this.R) ? false : true;
        }
        return false;
    }

    private final float getRestingOpacity() {
        return getShouldAnimateHover() ? getHoverOpacity() : this.H;
    }

    private final float getRestingScale() {
        return getShouldAnimateHover() ? getHoverScale() : this.J;
    }

    private final float getRestingUnderlayOpacity() {
        return getShouldAnimateHover() ? getHoverUnderlayOpacity() : this.R;
    }

    private final boolean getShouldAnimateHover() {
        return this.h0 && isEnabled();
    }

    public static void j(c cVar, long j) {
        cVar.f13931e0 = null;
        cVar.m(cVar.getRestingOpacity(), cVar.getRestingScale(), cVar.getRestingUnderlayOpacity(), j);
    }

    public static boolean p(x0 x0Var) {
        Iterator it = x0Var.iterator();
        while (true) {
            y0 y0Var = (y0) it;
            if (!y0Var.hasNext()) {
                return false;
            }
            View view = (View) y0Var.next();
            if (view instanceof c) {
                c cVar = (c) view;
                if (cVar.f13938l0 || cVar.isPressed()) {
                    return true;
                }
            }
            if ((view instanceof ViewGroup) && p(new x0((ViewGroup) view))) {
                return true;
            }
        }
    }

    @Override // im.o
    public final boolean a() {
        return false;
    }

    @Override // im.o
    public final boolean b(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        boolean z5 = false;
        if (event.getAction() != 3 && event.getAction() != 1 && event.getActionMasked() != 6) {
            if (!p(new x0(this))) {
                c cVar = f13922n0;
                if (cVar == null) {
                    f13922n0 = this;
                } else if (!this.f13940w) {
                    if (!(cVar != null ? cVar.f13940w : false)) {
                    }
                } else if (cVar == this) {
                }
                z5 = true;
            }
            if (z5) {
                this.f13938l0 = true;
            }
        }
        return z5;
    }

    @Override // im.o
    public final boolean c() {
        return false;
    }

    @Override // im.o
    public final boolean d(List recorded, q handler) {
        Intrinsics.checkNotNullParameter(recorded, "recorded");
        Intrinsics.checkNotNullParameter(handler, "handler");
        if (recorded != null && recorded.isEmpty()) {
            return true;
        }
        Iterator it = recorded.iterator();
        while (it.hasNext()) {
            im.f fVar = (im.f) it.next();
            if (!fVar.I(handler) && !handler.I(fVar) && !Intrinsics.areEqual(fVar.f11894f, this) && !(fVar instanceof im.h)) {
                return false;
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        PaintDrawable paintDrawable = this.f13927c0;
        if (paintDrawable != null) {
            canvas.save();
            BackgroundStyleApplicator.clipToPaddingBox(this, canvas);
            paintDrawable.setBounds(0, 0, getWidth(), getHeight());
            paintDrawable.draw(canvas);
            canvas.restore();
        }
        RippleDrawable rippleDrawable = this.f13936j0;
        if (rippleDrawable != null) {
            if (!this.f13939v) {
                canvas.save();
                BackgroundStyleApplicator.clipToPaddingBox(this, canvas);
            }
            rippleDrawable.setBounds(0, 0, getWidth(), getHeight());
            rippleDrawable.draw(canvas);
            if (!this.f13939v) {
                canvas.restore();
            }
        }
        if (!this.f13937k0) {
            super.dispatchDraw(canvas);
            return;
        }
        canvas.save();
        BackgroundStyleApplicator.clipToPaddingBox(this, canvas);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final void drawableHotspotChanged(float f2, float f7) {
        c cVar = f13922n0;
        if (cVar == null || cVar == this) {
            super.drawableHotspotChanged(f2, f7);
            RippleDrawable rippleDrawable = this.f13936j0;
            if (rippleDrawable != null) {
                rippleDrawable.setHotspot(f2, f7);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        RippleDrawable rippleDrawable = this.f13936j0;
        if (rippleDrawable == null || !rippleDrawable.isStateful()) {
            return;
        }
        rippleDrawable.setState(getDrawableState());
    }

    @Override // im.o
    public final boolean e(View view) {
        return gn.h.j(view);
    }

    @Override // im.o
    public final void f(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
    }

    @Override // im.o
    public final Boolean g(View view, MotionEvent motionEvent) {
        return gn.h.R(view, motionEvent);
    }

    public final float getActiveOpacity() {
        return this.G;
    }

    public final float getActiveScale() {
        return this.I;
    }

    public final float getActiveUnderlayOpacity() {
        return this.Q;
    }

    public final float getDefaultOpacity() {
        return this.H;
    }

    public final float getDefaultScale() {
        return this.J;
    }

    public final float getDefaultUnderlayOpacity() {
        return this.R;
    }

    public final boolean getExclusive() {
        return this.f13940w;
    }

    public final int getHoverAnimationInDuration() {
        return this.K;
    }

    public final int getHoverAnimationOutDuration() {
        return this.L;
    }

    public final float getHoverOpacity() {
        float f2 = this.M;
        return f2 < 0.0f ? this.H : f2;
    }

    public final float getHoverScale() {
        float f2 = this.N;
        return f2 < 0.0f ? this.J : f2;
    }

    public final float getHoverUnderlayOpacity() {
        float f2 = this.O;
        return f2 < 0.0f ? this.R : f2;
    }

    public final int getLongPressAnimationOutDuration() {
        int i7 = this.F;
        return i7 < 0 ? this.f13942y : i7;
    }

    public final int getLongPressDuration() {
        return this.E;
    }

    public final boolean getNeedsOffscreenAlphaCompositing() {
        return this.S;
    }

    @Override // com.facebook.react.uimanager.ReactPointerEventsView
    @NotNull
    public PointerEvents getPointerEvents() {
        return this.T;
    }

    public final Integer getRippleColor() {
        return this.f13928d;
    }

    public final Integer getRippleRadius() {
        return this.f13930e;
    }

    public final int getTapAnimationInDuration() {
        return this.f13941x;
    }

    public final int getTapAnimationOutDuration() {
        return this.f13942y;
    }

    public final Integer getUnderlayColor() {
        return this.P;
    }

    public final boolean getUseBorderlessDrawable() {
        return this.f13939v;
    }

    public final boolean getUseDrawableOnForeground() {
        return this.f13934i;
    }

    @Override // im.o
    public final Boolean h(im.f handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        return null;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.S;
    }

    @Override // im.o
    public final void i(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (f13922n0 == this) {
            f13922n0 = null;
            f13923o0 = this;
        }
        this.f13938l0 = false;
    }

    public final void k() {
        if (isPressed()) {
            return;
        }
        if (getShouldAnimateHover()) {
            m(getHoverOpacity(), getHoverScale(), getHoverUnderlayOpacity(), this.K);
        } else {
            m(this.H, this.J, this.R, this.L);
        }
    }

    public final void l() {
        Handler handler;
        com.discord.media.engine.video.egl_renderer.b bVar = this.f13931e0;
        if (bVar != null && (handler = getHandler()) != null) {
            handler.removeCallbacks(bVar);
        }
        long j = this.f13941x;
        long j5 = this.f13942y;
        long j7 = this.E;
        long longPressAnimationOutDuration = getLongPressAnimationOutDuration();
        long jUptimeMillis = SystemClock.uptimeMillis() - this.f13929d0;
        if (j7 >= 0 && jUptimeMillis >= j7) {
            m(getRestingOpacity(), getRestingScale(), getRestingUnderlayOpacity(), longPressAnimationOutDuration);
            return;
        }
        if (jUptimeMillis >= j) {
            m(getRestingOpacity(), getRestingScale(), getRestingUnderlayOpacity(), j5);
            return;
        }
        if (((long) 2) * jUptimeMillis >= j5) {
            m(getRestingOpacity(), getRestingScale(), getRestingUnderlayOpacity(), jUptimeMillis);
            return;
        }
        long j10 = j - jUptimeMillis;
        m(this.G, this.I, this.Q, j10);
        com.discord.media.engine.video.egl_renderer.b bVar2 = new com.discord.media.engine.video.egl_renderer.b(this, j5, 3);
        this.f13931e0 = bVar2;
        Handler handler2 = getHandler();
        if (handler2 != null) {
            handler2.postDelayed(bVar2, (long) (j10 * getAnimatorDurationScale()));
        }
    }

    public final void m(float f2, float f7, float f10, long j) {
        float f11;
        if (getHasOpacityAnimation() || getHasScaleAnimation() || getHasUnderlayAnimation()) {
            AnimatorSet animatorSet = this.f13926b0;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            this.f13926b0 = null;
            float animatorDurationScale = (long) (j * getAnimatorDurationScale());
            Display display = getDisplay();
            if (display != null) {
                Intrinsics.checkNotNullParameter(display, "<this>");
                Display.Mode[] supportedModes = display.getSupportedModes();
                Intrinsics.checkNotNull(supportedModes);
                float refreshRate = 0.0f;
                for (Display.Mode mode : supportedModes) {
                    if (mode.getRefreshRate() > refreshRate) {
                        refreshRate = mode.getRefreshRate();
                    }
                }
                if (refreshRate <= 0.0f) {
                    refreshRate = display.getRefreshRate() > 0.0f ? display.getRefreshRate() : 60.0f;
                }
                f11 = 1000.0f / refreshRate;
            } else {
                f11 = 16.0f;
            }
            if (animatorDurationScale < f11) {
                if (getHasOpacityAnimation()) {
                    setAlpha(f2);
                }
                if (getHasScaleAnimation()) {
                    setScaleX(f7);
                    setScaleY(f7);
                }
                if (getHasUnderlayAnimation()) {
                    PaintDrawable paintDrawable = this.f13927c0;
                    Intrinsics.checkNotNull(paintDrawable);
                    paintDrawable.setAlpha((int) (f10 * 255));
                    return;
                }
                return;
            }
            ArrayList arrayList = new ArrayList();
            if (getHasOpacityAnimation()) {
                arrayList.add(ObjectAnimator.ofFloat(this, "alpha", f2));
            }
            if (getHasScaleAnimation()) {
                arrayList.add(ObjectAnimator.ofFloat(this, ViewProps.SCALE_X, f7));
                arrayList.add(ObjectAnimator.ofFloat(this, ViewProps.SCALE_Y, f7));
            }
            if (getHasUnderlayAnimation()) {
                PaintDrawable paintDrawable2 = this.f13927c0;
                Intrinsics.checkNotNull(paintDrawable2);
                arrayList.add(ObjectAnimator.ofInt(paintDrawable2, "alpha", (int) (f10 * 255)));
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playTogether(arrayList);
            animatorSet2.setDuration(j);
            animatorSet2.setInterpolator(new q2.a(1));
            animatorSet2.start();
            this.f13926b0 = animatorSet2;
        }
    }

    public final void n() {
        if (getHasOpacityAnimation()) {
            setAlpha(this.H);
        }
        if (getHasScaleAnimation()) {
            setScaleX(this.J);
            setScaleY(this.J);
        }
        PaintDrawable paintDrawable = this.f13927c0;
        if (paintDrawable != null) {
            paintDrawable.setAlpha((int) (this.R * 255));
        }
    }

    public final void o() {
        com.facebook.react.modules.core.b bVar = this.f13932f0;
        if (bVar != null) {
            Choreographer.getInstance().removeFrameCallback(bVar);
        }
        this.f13932f0 = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        Handler handler;
        com.discord.media.engine.video.egl_renderer.b bVar = this.f13931e0;
        if (bVar != null && (handler = getHandler()) != null) {
            handler.removeCallbacks(bVar);
        }
        this.f13931e0 = null;
        o();
        AnimatorSet animatorSet = this.f13926b0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.f13926b0 = null;
        this.h0 = false;
        n();
        if (f13922n0 == this) {
            f13922n0 = null;
        }
        if (f13923o0 == this) {
            f13923o0 = null;
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        int actionMasked = event.getActionMasked();
        if (actionMasked == 9) {
            o();
            if (!this.h0) {
                this.h0 = true;
                k();
            }
        } else if (actionMasked == 10) {
            if (isPressed()) {
                this.h0 = false;
            } else {
                o();
                com.facebook.react.modules.core.b bVar = new com.facebook.react.modules.core.b(2, this);
                this.f13932f0 = bVar;
                Choreographer.getInstance().postFrameCallback(bVar);
            }
        }
        return super.onHoverEvent(event);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info) {
        Intrinsics.checkNotNullParameter(info, "info");
        super.onInitializeAccessibilityNodeInfo(info);
        Object tag = getTag(R.id.react_test_id);
        if (tag instanceof String) {
            info.setViewIdResourceName((String) tag);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (super.onInterceptTouchEvent(event)) {
            return true;
        }
        onTouchEvent(event);
        return isPressed();
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i7, KeyEvent keyEvent) {
        this.a0 = true;
        return super.onKeyUp(i7, keyEvent);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        this.U = true;
        r();
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0072  */
    /* JADX WARN: Code duplicated, block: B:40:0x0076  */
    /* JADX WARN: Code duplicated, block: B:41:0x007d  */
    /* JADX WARN: Code duplicated, block: B:48:0x008f  */
    /* JADX WARN: Code duplicated, block: B:49:0x0091  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c8  */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00ae, code lost:
    
        if (r7 != 6) goto L76;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jm.c.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (!p(new x0(this))) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Intrinsics.checkNotNullParameter(context, "<this>");
            Object systemService = context.getSystemService("accessibility");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
            if (((AccessibilityManager) systemService).isTouchExplorationEnabled() && !isPressed()) {
                int i7 = n.f13968w;
                Intrinsics.checkNotNullParameter(this, "viewGroup");
                n nVar = null;
                for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
                    if (parent instanceof n) {
                        nVar = (n) parent;
                    }
                }
                if (nVar != null) {
                    nVar.c(this);
                }
            } else if (this.a0) {
                int i10 = n.f13968w;
                Intrinsics.checkNotNullParameter(this, "viewGroup");
                n nVar2 = null;
                for (ViewParent parent2 = getParent(); parent2 != null; parent2 = parent2.getParent()) {
                    if (parent2 instanceof n) {
                        nVar2 = (n) parent2;
                    }
                }
                if (nVar2 != null) {
                    nVar2.c(this);
                }
                this.a0 = false;
            }
            if (f13923o0 == this) {
                if (f13922n0 == this) {
                    f13922n0 = null;
                    f13923o0 = this;
                }
                f13923o0 = null;
                return super.performClick();
            }
        }
        return false;
    }

    public final boolean q(MotionEvent motionEvent) {
        return motionEvent.getX() >= 0.0f && motionEvent.getY() >= 0.0f && motionEvent.getX() < ((float) getWidth()) && motionEvent.getY() < ((float) getHeight());
    }

    public final void r() {
        ColorStateList colorStateList;
        RippleDrawable rippleDrawable;
        if (this.U) {
            this.U = false;
            setForeground(null);
            Integer num = this.f13928d;
            if (num != null && num.intValue() == 0) {
                rippleDrawable = null;
            } else {
                int[][] iArr = {new int[]{android.R.attr.state_enabled}};
                Integer num2 = this.f13930e;
                Integer num3 = this.f13928d;
                if (num3 != null) {
                    Intrinsics.checkNotNull(num3);
                    colorStateList = new ColorStateList(iArr, new int[]{num3.intValue()});
                } else {
                    Resources.Theme theme = getContext().getTheme();
                    TypedValue typedValue = f13921m0;
                    theme.resolveAttribute(android.R.attr.colorControlHighlight, typedValue, true);
                    colorStateList = new ColorStateList(iArr, new int[]{typedValue.data});
                }
                rippleDrawable = new RippleDrawable(colorStateList, null, this.f13939v ? null : new ShapeDrawable(new RectShape()));
                if (num2 != null) {
                    rippleDrawable.setRadius((int) PixelUtil.toPixelFromDIP(num2.intValue()));
                }
            }
            Integer num4 = this.P;
            PaintDrawable paintDrawable = new PaintDrawable(num4 != null ? num4.intValue() : -16777216);
            paintDrawable.setAlpha((int) (this.R * 255));
            this.f13927c0 = paintDrawable;
            paintDrawable.setCallback(this);
            if (!this.f13934i || rippleDrawable == null) {
                this.f13936j0 = rippleDrawable;
                if (rippleDrawable != null) {
                    rippleDrawable.setCallback(this);
                }
            } else {
                setForeground(rippleDrawable);
                this.f13936j0 = null;
            }
            n();
        }
    }

    public final void setActiveOpacity(float f2) {
        this.G = f2;
    }

    public final void setActiveScale(float f2) {
        this.I = f2;
    }

    public final void setActiveUnderlayOpacity(float f2) {
        this.Q = f2;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i7) {
        BackgroundStyleApplicator.setBackgroundColor(this, Integer.valueOf(i7));
    }

    public final void setDefaultOpacity(float f2) {
        this.H = f2;
    }

    public final void setDefaultScale(float f2) {
        this.J = f2;
    }

    public final void setDefaultUnderlayOpacity(float f2) {
        this.R = f2;
        this.U = true;
    }

    @Override // android.view.View
    public void setEnabled(boolean z5) {
        boolean z6 = z5 != isEnabled();
        super.setEnabled(z5);
        if (z6 && this.h0) {
            k();
        }
    }

    public final void setExclusive(boolean z5) {
        this.f13940w = z5;
    }

    public final void setHoverAnimationInDuration(int i7) {
        this.K = i7;
    }

    public final void setHoverAnimationOutDuration(int i7) {
        this.L = i7;
    }

    public final void setHoverOpacity(float f2) {
        this.M = f2;
    }

    public final void setHoverScale(float f2) {
        this.N = f2;
    }

    public final void setHoverUnderlayOpacity(float f2) {
        this.O = f2;
    }

    public final void setLongPressAnimationOutDuration(int i7) {
        this.F = i7;
    }

    public final void setLongPressDuration(int i7) {
        this.E = i7;
    }

    public final void setNeedsOffscreenAlphaCompositing(boolean z5) {
        this.S = z5;
    }

    public final void setOverflow(String str) {
        this.f13937k0 = Intrinsics.areEqual(str, ViewProps.HIDDEN);
        invalidate();
    }

    public void setPointerEvents(@NotNull PointerEvents pointerEvents) {
        Intrinsics.checkNotNullParameter(pointerEvents, "<set-?>");
        this.T = pointerEvents;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001b  */
    @Override // android.view.View
    public void setPressed(boolean z5) {
        boolean z6;
        c cVar;
        if (!this.f13940w) {
            c cVar2 = f13922n0;
            z6 = (cVar2 == null || !cVar2.f13940w) && !p(new x0(this));
        }
        if (!z5 || f13922n0 == this || z6) {
            this.f13938l0 = z5;
            super.setPressed(z5);
            if (z5) {
                com.discord.media.engine.video.egl_renderer.b bVar = this.f13931e0;
                if (bVar != null) {
                    Handler handler = getHandler();
                    if (handler != null) {
                        handler.removeCallbacks(bVar);
                    }
                    this.f13931e0 = null;
                }
                this.f13929d0 = SystemClock.uptimeMillis();
                cVar = this;
                cVar.m(this.G, this.I, this.Q, this.f13941x);
            } else {
                cVar = this;
                l();
            }
        } else {
            cVar = this;
        }
        if (z5 || f13922n0 != cVar) {
            return;
        }
        cVar.f13938l0 = false;
    }

    public final void setRippleColor(Integer num) {
        this.f13928d = num;
        this.U = true;
    }

    public final void setRippleRadius(Integer num) {
        this.f13930e = num;
        this.U = true;
    }

    public final void setTapAnimationInDuration(int i7) {
        this.f13941x = i7;
    }

    public final void setTapAnimationOutDuration(int i7) {
        this.f13942y = i7;
    }

    public final void setTouched(boolean z5) {
        this.f13938l0 = z5;
    }

    public final void setUnderlayColor(Integer num) {
        this.P = num;
        this.U = true;
    }

    public final void setUseBorderlessDrawable(boolean z5) {
        this.f13939v = z5;
    }

    public final void setUseDrawableOnForeground(boolean z5) {
        this.f13934i = z5;
        this.U = true;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable who) {
        Intrinsics.checkNotNullParameter(who, "who");
        return super.verifyDrawable(who) || Intrinsics.areEqual(who, this.f13927c0) || Intrinsics.areEqual(who, this.f13936j0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDrawableHotspotChanged(float f2, float f7) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i7, int i10, int i11, int i12) {
    }
}

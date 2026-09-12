package com.google.android.exoplayer2.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.chat.presentation.list.c;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.Timeline;
import com.google.firebase.messaging.s;
import ge.g;
import ge.k;
import ge.q;
import ge.r;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;
import je.b;
import je.e0;
import kotlin.jvm.internal.LongCompanionObject;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class DefaultTimeBar extends View implements r {

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final /* synthetic */ int f5764n0 = 0;
    public final Paint E;
    public final Paint F;
    public final Paint G;
    public final Drawable H;
    public final int I;
    public final int J;
    public final int K;
    public final int L;
    public final int M;
    public final int N;
    public final int O;
    public final int P;
    public final int Q;
    public final StringBuilder R;
    public final Formatter S;
    public final s T;
    public final CopyOnWriteArraySet U;
    public final Point V;
    public final float W;
    public int a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public long f5765b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public int f5766c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f5767d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public Rect f5768d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Rect f5769e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public float f5770e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public boolean f5771f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public long f5772g0;
    public long h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Rect f5773i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public long f5774i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public long f5775j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public int f5776k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public long[] f5777l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public boolean[] f5778m0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Rect f5779v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Paint f5780w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Paint f5781x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Paint f5782y;

    public DefaultTimeBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, attributeSet);
    }

    public static int a(float f2, int i7) {
        return (int) ((i7 * f2) + 0.5f);
    }

    private long getPositionIncrement() {
        long j = this.f5765b0;
        if (j != -9223372036854775807L) {
            return j;
        }
        long j5 = this.h0;
        if (j5 == -9223372036854775807L) {
            return 0L;
        }
        return j5 / ((long) this.a0);
    }

    private String getProgressText() {
        return e0.z(this.R, this.S, this.f5774i0);
    }

    private long getScrubberPosition() {
        Rect rect = this.f5769e;
        if (rect.width() <= 0 || this.h0 == -9223372036854775807L) {
            return 0L;
        }
        return (((long) this.f5779v.width()) * this.h0) / ((long) rect.width());
    }

    public final boolean b(long j) {
        long j5 = this.h0;
        if (j5 <= 0) {
            return false;
        }
        long j7 = this.f5771f0 ? this.f5772g0 : this.f5774i0;
        long j10 = e0.j(j7 + j, 0L, j5);
        if (j10 == j7) {
            return false;
        }
        if (this.f5771f0) {
            f(j10);
        } else {
            c(j10);
        }
        e();
        return true;
    }

    public final void c(long j) {
        this.f5772g0 = j;
        this.f5771f0 = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator it = this.U.iterator();
        while (it.hasNext()) {
            PlayerControlView playerControlView = ((g) ((q) it.next())).f9981d;
            playerControlView.f5794k0 = true;
            TextView textView = playerControlView.J;
            if (textView != null) {
                textView.setText(e0.z(playerControlView.L, playerControlView.M, j));
            }
        }
    }

    public final void d(boolean z5) {
        Player player;
        int iD;
        removeCallbacks(this.T);
        this.f5771f0 = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        for (q qVar : this.U) {
            long j = this.f5772g0;
            PlayerControlView playerControlView = ((g) qVar).f9981d;
            playerControlView.f5794k0 = false;
            if (!z5 && (player = playerControlView.f5790g0) != null) {
                Timeline timelineJ = player.J();
                if (playerControlView.f5793j0 && !timelineJ.p()) {
                    int iO = timelineJ.o();
                    iD = 0;
                    while (true) {
                        long jU = e0.U(timelineJ.m(iD, playerControlView.O, 0L).K);
                        if (j < jU) {
                            break;
                        }
                        if (iD == iO - 1) {
                            j = jU;
                            break;
                        } else {
                            j -= jU;
                            iD++;
                        }
                    }
                } else {
                    iD = player.D();
                }
                player.e(iD, j);
                playerControlView.i();
            }
        }
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.H;
        if (drawable != null && drawable.isStateful() && drawable.setState(getDrawableState())) {
            invalidate();
        }
    }

    public final void e() {
        Rect rect = this.f5773i;
        Rect rect2 = this.f5769e;
        rect.set(rect2);
        Rect rect3 = this.f5779v;
        rect3.set(rect2);
        long j = this.f5771f0 ? this.f5772g0 : this.f5774i0;
        if (this.h0 > 0) {
            rect.right = Math.min(rect2.left + ((int) ((((long) rect2.width()) * this.f5775j0) / this.h0)), rect2.right);
            rect3.right = Math.min(rect2.left + ((int) ((((long) rect2.width()) * j) / this.h0)), rect2.right);
        } else {
            int i7 = rect2.left;
            rect.right = i7;
            rect3.right = i7;
        }
        invalidate(this.f5767d);
    }

    public final void f(long j) {
        if (this.f5772g0 == j) {
            return;
        }
        this.f5772g0 = j;
        Iterator it = this.U.iterator();
        while (it.hasNext()) {
            PlayerControlView playerControlView = ((g) ((q) it.next())).f9981d;
            TextView textView = playerControlView.J;
            if (textView != null) {
                textView.setText(e0.z(playerControlView.L, playerControlView.M, j));
            }
        }
    }

    @Override // ge.r
    public long getPreferredUpdateDelay() {
        int iWidth = (int) (this.f5769e.width() / this.W);
        if (iWidth == 0) {
            return LongCompanionObject.MAX_VALUE;
        }
        long j = this.h0;
        return (j == 0 || j == -9223372036854775807L) ? LongCompanionObject.MAX_VALUE : j / ((long) iWidth);
    }

    @Override // android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.H;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        int i7;
        canvas.save();
        Rect rect = this.f5769e;
        int iHeight = rect.height();
        int iCenterY = rect.centerY() - (iHeight / 2);
        int i10 = iCenterY + iHeight;
        long j = this.h0;
        Paint paint = this.f5782y;
        Rect rect2 = this.f5779v;
        if (j <= 0) {
            canvas2 = canvas;
            canvas2.drawRect(rect.left, iCenterY, rect.right, i10, paint);
        } else {
            Rect rect3 = this.f5773i;
            int i11 = rect3.left;
            int i12 = rect3.right;
            int iMax = Math.max(Math.max(rect.left, i12), rect2.right);
            int i13 = rect.right;
            if (iMax < i13) {
                canvas.drawRect(iMax, iCenterY, i13, i10, paint);
            }
            int iMax2 = Math.max(i11, rect2.right);
            if (i12 > iMax2) {
                canvas.drawRect(iMax2, iCenterY, i12, i10, this.f5781x);
            }
            if (rect2.width() > 0) {
                canvas.drawRect(rect2.left, iCenterY, rect2.right, i10, this.f5780w);
            }
            if (this.f5776k0 != 0) {
                long[] jArr = this.f5777l0;
                jArr.getClass();
                boolean[] zArr = this.f5778m0;
                zArr.getClass();
                int i14 = this.L;
                int i15 = i14 / 2;
                int i16 = 0;
                int i17 = 0;
                while (i17 < this.f5776k0) {
                    int iMin = Math.min(rect.width() - i14, Math.max(i16, ((int) ((((long) rect.width()) * e0.j(jArr[i17], 0L, this.h0)) / this.h0)) - i15)) + rect.left;
                    int i18 = i17;
                    canvas.drawRect(iMin, iCenterY, iMin + i14, i10, zArr[i17] ? this.F : this.E);
                    i17 = i18 + 1;
                    i16 = i16;
                }
            }
            canvas2 = canvas;
        }
        if (this.h0 > 0) {
            int i19 = e0.i(rect2.right, rect2.left, rect.right);
            int iCenterY2 = rect2.centerY();
            Drawable drawable = this.H;
            if (drawable == null) {
                if (this.f5771f0 || isFocused()) {
                    i7 = this.O;
                } else {
                    i7 = isEnabled() ? this.M : this.N;
                }
                canvas2.drawCircle(i19, iCenterY2, (int) ((i7 * this.f5770e0) / 2.0f), this.G);
            } else {
                int intrinsicWidth = ((int) (drawable.getIntrinsicWidth() * this.f5770e0)) / 2;
                int intrinsicHeight = ((int) (drawable.getIntrinsicHeight() * this.f5770e0)) / 2;
                drawable.setBounds(i19 - intrinsicWidth, iCenterY2 - intrinsicHeight, i19 + intrinsicWidth, iCenterY2 + intrinsicHeight);
                drawable.draw(canvas2);
            }
        }
        canvas2.restore();
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z5, int i7, Rect rect) {
        super.onFocusChanged(z5, i7, rect);
        if (!this.f5771f0 || z5) {
            return;
        }
        d(false);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 4) {
            accessibilityEvent.getText().add(getProgressText());
        }
        accessibilityEvent.setClassName("android.widget.SeekBar");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.SeekBar");
        accessibilityNodeInfo.setContentDescription(getProgressText());
        if (this.h0 <= 0) {
            return;
        }
        if (e0.f13788a >= 21) {
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
        } else {
            accessibilityNodeInfo.addAction(RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT);
            accessibilityNodeInfo.addAction(8192);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:11:0x001a  */
    /* JADX WARN: Code duplicated, block: B:13:0x0025  */
    /* JADX WARN: Code duplicated, block: B:15:0x0029  */
    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i7, KeyEvent keyEvent) {
        if (isEnabled()) {
            long positionIncrement = getPositionIncrement();
            if (i7 != 66) {
                switch (i7) {
                    case 21:
                        positionIncrement = -positionIncrement;
                        if (b(positionIncrement)) {
                            s sVar = this.T;
                            removeCallbacks(sVar);
                            postDelayed(sVar, 1000L);
                            return true;
                        }
                        break;
                    case 22:
                        if (b(positionIncrement)) {
                            s sVar2 = this.T;
                            removeCallbacks(sVar2);
                            postDelayed(sVar2, 1000L);
                            return true;
                        }
                        break;
                    case 23:
                        if (this.f5771f0) {
                            d(false);
                            return true;
                        }
                        break;
                }
            } else if (this.f5771f0) {
                d(false);
                return true;
            }
        }
        return super.onKeyDown(i7, keyEvent);
    }

    @Override // android.view.View
    public final void onLayout(boolean z5, int i7, int i10, int i11, int i12) {
        int paddingBottom;
        int paddingBottom2;
        Rect rect;
        int i13 = i11 - i7;
        int i14 = i12 - i10;
        int paddingLeft = getPaddingLeft();
        int paddingRight = i13 - getPaddingRight();
        int i15 = this.K;
        int i16 = this.I;
        int i17 = this.J;
        int i18 = this.P;
        if (i15 == 1) {
            paddingBottom = (i14 - getPaddingBottom()) - i17;
            paddingBottom2 = ((i14 - getPaddingBottom()) - i16) - Math.max(i18 - (i16 / 2), 0);
        } else {
            paddingBottom = (i14 - i17) / 2;
            paddingBottom2 = (i14 - i16) / 2;
        }
        Rect rect2 = this.f5767d;
        rect2.set(paddingLeft, paddingBottom, paddingRight, i17 + paddingBottom);
        this.f5769e.set(rect2.left + i18, paddingBottom2, rect2.right - i18, i16 + paddingBottom2);
        if (e0.f13788a >= 29 && ((rect = this.f5768d0) == null || rect.width() != i13 || this.f5768d0.height() != i14)) {
            Rect rect3 = new Rect(0, 0, i13, i14);
            this.f5768d0 = rect3;
            setSystemGestureExclusionRects(Collections.singletonList(rect3));
        }
        e();
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int i11 = this.J;
        if (mode == 0) {
            size = i11;
        } else if (mode != 1073741824) {
            size = Math.min(i11, size);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i7), size);
        Drawable drawable = this.H;
        if (drawable != null && drawable.isStateful() && drawable.setState(getDrawableState())) {
            invalidate();
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i7) {
        Drawable drawable = this.H;
        if (drawable == null || e0.f13788a < 23 || !drawable.setLayoutDirection(i7)) {
            return;
        }
        invalidate();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x006e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0072  */
    /* JADX WARN: Code duplicated, block: B:27:0x0078  */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (isEnabled() && this.h0 > 0) {
            int x5 = (int) motionEvent.getX();
            int y5 = (int) motionEvent.getY();
            Point point = this.V;
            point.set(x5, y5);
            int i7 = point.x;
            int i10 = point.y;
            int action = motionEvent.getAction();
            Rect rect = this.f5769e;
            Rect rect2 = this.f5779v;
            if (action == 0) {
                int i11 = i7;
                if (this.f5767d.contains(i11, i10)) {
                    rect2.right = e0.i(i11, rect.left, rect.right);
                    c(getScrubberPosition());
                    e();
                    invalidate();
                    return true;
                }
            } else if (action == 1) {
                if (this.f5771f0) {
                    d(motionEvent.getAction() == 3);
                    return true;
                }
            } else if (action != 2) {
                if (action == 3) {
                    if (this.f5771f0) {
                        d(motionEvent.getAction() == 3);
                        return true;
                    }
                }
            } else if (this.f5771f0) {
                if (i10 < this.Q) {
                    int i12 = this.f5766c0;
                    rect2.right = e0.i(((i7 - i12) / 3) + i12, rect.left, rect.right);
                } else {
                    this.f5766c0 = i7;
                    rect2.right = e0.i(i7, rect.left, rect.right);
                }
                f(getScrubberPosition());
                e();
                invalidate();
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i7, Bundle bundle) {
        if (super.performAccessibilityAction(i7, bundle)) {
            return true;
        }
        if (this.h0 <= 0) {
            return false;
        }
        if (i7 == 8192) {
            if (b(-getPositionIncrement())) {
                d(false);
            }
        } else {
            if (i7 != 4096) {
                return false;
            }
            if (b(getPositionIncrement())) {
                d(false);
            }
        }
        sendAccessibilityEvent(4);
        return true;
    }

    public void setAdMarkerColor(int i7) {
        this.E.setColor(i7);
        invalidate(this.f5767d);
    }

    public void setBufferedColor(int i7) {
        this.f5781x.setColor(i7);
        invalidate(this.f5767d);
    }

    @Override // ge.r
    public void setBufferedPosition(long j) {
        if (this.f5775j0 == j) {
            return;
        }
        this.f5775j0 = j;
        e();
    }

    @Override // ge.r
    public void setDuration(long j) {
        if (this.h0 == j) {
            return;
        }
        this.h0 = j;
        if (this.f5771f0 && j == -9223372036854775807L) {
            d(true);
        }
        e();
    }

    @Override // android.view.View, ge.r
    public void setEnabled(boolean z5) {
        super.setEnabled(z5);
        if (!this.f5771f0 || z5) {
            return;
        }
        d(true);
    }

    public void setKeyCountIncrement(int i7) {
        b.g(i7 > 0);
        this.a0 = i7;
        this.f5765b0 = -9223372036854775807L;
    }

    public void setKeyTimeIncrement(long j) {
        b.g(j > 0);
        this.a0 = -1;
        this.f5765b0 = j;
    }

    public void setPlayedAdMarkerColor(int i7) {
        this.F.setColor(i7);
        invalidate(this.f5767d);
    }

    public void setPlayedColor(int i7) {
        this.f5780w.setColor(i7);
        invalidate(this.f5767d);
    }

    @Override // ge.r
    public void setPosition(long j) {
        if (this.f5774i0 == j) {
            return;
        }
        this.f5774i0 = j;
        setContentDescription(getProgressText());
        e();
    }

    public void setScrubberColor(int i7) {
        this.G.setColor(i7);
        invalidate(this.f5767d);
    }

    public void setUnplayedColor(int i7) {
        this.f5782y.setColor(i7);
        invalidate(this.f5767d);
    }

    public DefaultTimeBar(Context context, AttributeSet attributeSet, AttributeSet attributeSet2) {
        Paint paint;
        super(context, attributeSet, 0);
        this.f5767d = new Rect();
        this.f5769e = new Rect();
        this.f5773i = new Rect();
        this.f5779v = new Rect();
        Paint paint2 = new Paint();
        this.f5780w = paint2;
        Paint paint3 = new Paint();
        this.f5781x = paint3;
        Paint paint4 = new Paint();
        this.f5782y = paint4;
        Paint paint5 = new Paint();
        this.E = paint5;
        Paint paint6 = new Paint();
        this.F = paint6;
        Paint paint7 = new Paint();
        this.G = paint7;
        paint7.setAntiAlias(true);
        this.U = new CopyOnWriteArraySet();
        this.V = new Point();
        float f2 = context.getResources().getDisplayMetrics().density;
        this.W = f2;
        this.Q = a(f2, -50);
        int iA = a(f2, 4);
        int iA2 = a(f2, 26);
        int iA3 = a(f2, 4);
        int iA4 = a(f2, 12);
        int iA5 = a(f2, 0);
        int iA6 = a(f2, 16);
        if (attributeSet2 != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, k.f9986b, 0, 0);
            try {
                Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(10);
                this.H = drawable;
                if (drawable != null) {
                    int i7 = e0.f13788a;
                    if (i7 >= 23) {
                        paint = paint5;
                        int layoutDirection = getLayoutDirection();
                        if (i7 < 23 || drawable.setLayoutDirection(layoutDirection)) {
                        }
                    } else {
                        paint = paint5;
                    }
                    iA2 = Math.max(drawable.getMinimumHeight(), iA2);
                } else {
                    paint = paint5;
                }
                this.I = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, iA);
                this.J = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, iA2);
                this.K = typedArrayObtainStyledAttributes.getInt(2, 0);
                this.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, iA3);
                this.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(11, iA4);
                this.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, iA5);
                this.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, iA6);
                int i10 = typedArrayObtainStyledAttributes.getInt(6, -1);
                int i11 = typedArrayObtainStyledAttributes.getInt(7, -1);
                int i12 = typedArrayObtainStyledAttributes.getInt(4, -855638017);
                int i13 = typedArrayObtainStyledAttributes.getInt(13, 872415231);
                int i14 = typedArrayObtainStyledAttributes.getInt(0, -1291845888);
                int i15 = typedArrayObtainStyledAttributes.getInt(5, 872414976);
                paint2.setColor(i10);
                paint7.setColor(i11);
                paint3.setColor(i12);
                paint4.setColor(i13);
                paint.setColor(i14);
                paint6.setColor(i15);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th2) {
                typedArrayObtainStyledAttributes.recycle();
                throw th2;
            }
        } else {
            this.I = iA;
            this.J = iA2;
            this.K = 0;
            this.L = iA3;
            this.M = iA4;
            this.N = iA5;
            this.O = iA6;
            paint2.setColor(-1);
            paint7.setColor(-1);
            paint3.setColor(-855638017);
            paint4.setColor(872415231);
            paint5.setColor(-1291845888);
            paint6.setColor(872414976);
            this.H = null;
        }
        StringBuilder sb2 = new StringBuilder();
        this.R = sb2;
        this.S = new Formatter(sb2, Locale.getDefault());
        this.T = new s(14, this);
        Drawable drawable2 = this.H;
        if (drawable2 != null) {
            this.P = (drawable2.getMinimumWidth() + 1) / 2;
        } else {
            this.P = (Math.max(this.N, Math.max(this.M, this.O)) + 1) / 2;
        }
        this.f5770e0 = 1.0f;
        new ValueAnimator().addUpdateListener(new c(4, this));
        this.h0 = -9223372036854775807L;
        this.f5765b0 = -9223372036854775807L;
        this.a0 = 20;
        setFocusable(true);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }
}

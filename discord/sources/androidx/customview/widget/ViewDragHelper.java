package androidx.customview.widget;

import a3.h;
import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.OverScroller;
import androidx.core.view.u0;
import java.util.Arrays;
import java.util.WeakHashMap;
import xr.m;

/* JADX INFO: loaded from: classes.dex */
public final class ViewDragHelper {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final c f1791x = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1793b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float[] f1795d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float[] f1796e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float[] f1797f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float[] f1798g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int[] f1799h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int[] f1800i;
    public int[] j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public VelocityTracker f1801l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final float f1802m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f1803n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1804o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f1805p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f1806q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final OverScroller f1807r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final m f1808s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public View f1809t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f1810u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ViewGroup f1811v;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1794c = -1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final h f1812w = new h(6, this);

    public ViewDragHelper(Context context, ViewGroup viewGroup, m mVar) {
        if (mVar == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f1811v = viewGroup;
        this.f1808s = mVar;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        int i7 = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f1805p = i7;
        this.f1804o = i7;
        this.f1793b = viewConfiguration.getScaledTouchSlop();
        this.f1802m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f1803n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f1807r = new OverScroller(context, f1791x);
    }

    public final void a() {
        this.f1794c = -1;
        float[] fArr = this.f1795d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f1796e, 0.0f);
            Arrays.fill(this.f1797f, 0.0f);
            Arrays.fill(this.f1798g, 0.0f);
            Arrays.fill(this.f1799h, 0);
            Arrays.fill(this.f1800i, 0);
            Arrays.fill(this.j, 0);
            this.k = 0;
        }
        VelocityTracker velocityTracker = this.f1801l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f1801l = null;
        }
    }

    public final void b(int i7, View view) {
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = this.f1811v;
        if (parent != viewGroup) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + viewGroup + ")");
        }
        this.f1809t = view;
        this.f1794c = i7;
        this.f1808s.I(i7, view);
        p(1);
    }

    public final boolean c(float f2, float f7, int i7, int i10) {
        float fAbs = Math.abs(f2);
        float fAbs2 = Math.abs(f7);
        if ((this.f1799h[i7] & i10) != i10 || (this.f1806q & i10) == 0 || (this.j[i7] & i10) == i10 || (this.f1800i[i7] & i10) == i10) {
            return false;
        }
        float f10 = this.f1793b;
        if (fAbs <= f10 && fAbs2 <= f10) {
            return false;
        }
        if (fAbs < fAbs2 * 0.5f) {
            this.f1808s.getClass();
        }
        return (this.f1800i[i7] & i10) == 0 && fAbs > ((float) this.f1793b);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0044 A[RETURN] */
    public final boolean d(float f2, float f7, View view) {
        if (view != null) {
            m mVar = this.f1808s;
            boolean z5 = mVar.w(view) > 0;
            boolean z6 = mVar.x() > 0;
            if (z5 && z6) {
                float f10 = (f7 * f7) + (f2 * f2);
                int i7 = this.f1793b;
                if (f10 > i7 * i7) {
                    return true;
                }
            } else if (!z5 ? !(!z6 || Math.abs(f7) <= this.f1793b) : Math.abs(f2) > this.f1793b) {
                return true;
            }
        }
        return false;
    }

    public final void e(int i7) {
        float[] fArr = this.f1795d;
        if (fArr != null) {
            int i10 = this.k;
            int i11 = 1 << i7;
            if ((i10 & i11) != 0) {
                fArr[i7] = 0.0f;
                this.f1796e[i7] = 0.0f;
                this.f1797f[i7] = 0.0f;
                this.f1798g[i7] = 0.0f;
                this.f1799h[i7] = 0;
                this.f1800i[i7] = 0;
                this.j[i7] = 0;
                this.k = (~i11) & i10;
            }
        }
    }

    public final int f(int i7, int i10, int i11) {
        if (i7 == 0) {
            return 0;
        }
        int width = this.f1811v.getWidth();
        float f2 = width / 2;
        float fSin = (((float) Math.sin((Math.min(1.0f, Math.abs(i7) / width) - 0.5f) * 0.47123894f)) * f2) + f2;
        int iAbs = Math.abs(i10);
        return Math.min(iAbs > 0 ? Math.round(Math.abs(fSin / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i7) / i11) + 1.0f) * 256.0f), 600);
    }

    public final boolean g() {
        if (this.f1792a == 2) {
            OverScroller overScroller = this.f1807r;
            boolean zComputeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.f1809t.getLeft();
            int top = currY - this.f1809t.getTop();
            if (left != 0) {
                View view = this.f1809t;
                WeakHashMap weakHashMap = u0.f1729a;
                view.offsetLeftAndRight(left);
            }
            if (top != 0) {
                View view2 = this.f1809t;
                WeakHashMap weakHashMap2 = u0.f1729a;
                view2.offsetTopAndBottom(top);
            }
            if (left != 0 || top != 0) {
                this.f1808s.K(this.f1809t, currX, currY);
            }
            if (zComputeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                zComputeScrollOffset = false;
            }
            if (!zComputeScrollOffset) {
                this.f1811v.post(this.f1812w);
            }
        }
        return this.f1792a == 2;
    }

    public final View h(int i7, int i10) {
        ViewGroup viewGroup = this.f1811v;
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            this.f1808s.getClass();
            View childAt = viewGroup.getChildAt(childCount);
            if (i7 >= childAt.getLeft() && i7 < childAt.getRight() && i10 >= childAt.getTop() && i10 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final boolean i(int i7, int i10, int i11, int i12) {
        float f2;
        float f7;
        float f10;
        float f11;
        int left = this.f1809t.getLeft();
        int top = this.f1809t.getTop();
        int i13 = i7 - left;
        int i14 = i10 - top;
        OverScroller overScroller = this.f1807r;
        if (i13 == 0 && i14 == 0) {
            overScroller.abortAnimation();
            p(0);
            return false;
        }
        View view = this.f1809t;
        int i15 = (int) this.f1803n;
        int i16 = (int) this.f1802m;
        int iAbs = Math.abs(i11);
        if (iAbs < i15) {
            i11 = 0;
        } else if (iAbs > i16) {
            i11 = i11 > 0 ? i16 : -i16;
        }
        int i17 = (int) this.f1803n;
        int iAbs2 = Math.abs(i12);
        if (iAbs2 < i17) {
            i12 = 0;
        } else if (iAbs2 > i16) {
            i12 = i12 > 0 ? i16 : -i16;
        }
        int iAbs3 = Math.abs(i13);
        int iAbs4 = Math.abs(i14);
        int iAbs5 = Math.abs(i11);
        int iAbs6 = Math.abs(i12);
        int i18 = iAbs5 + iAbs6;
        int i19 = iAbs3 + iAbs4;
        if (i11 != 0) {
            f2 = iAbs5;
            f7 = i18;
        } else {
            f2 = iAbs3;
            f7 = i19;
        }
        float f12 = f2 / f7;
        if (i12 != 0) {
            f10 = iAbs6;
            f11 = i18;
        } else {
            f10 = iAbs4;
            f11 = i19;
        }
        float f13 = f10 / f11;
        m mVar = this.f1808s;
        overScroller.startScroll(left, top, i13, i14, (int) ((f(i14, i12, mVar.x()) * f13) + (f(i13, i11, mVar.w(view)) * f12)));
        p(2);
        return true;
    }

    public final boolean j(int i7) {
        if ((this.k & (1 << i7)) != 0) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i7 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    public final void k(MotionEvent motionEvent) {
        int i7;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f1801l == null) {
            this.f1801l = VelocityTracker.obtain();
        }
        this.f1801l.addMovement(motionEvent);
        m mVar = this.f1808s;
        int i10 = 0;
        if (actionMasked == 0) {
            float x5 = motionEvent.getX();
            float y5 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View viewH = h((int) x5, (int) y5);
            n(pointerId, x5, y5);
            t(pointerId, viewH);
            if ((this.f1799h[pointerId] & this.f1806q) != 0) {
                mVar.H();
                return;
            }
            return;
        }
        if (actionMasked == 1) {
            if (this.f1792a == 1) {
                l();
            }
            a();
            return;
        }
        if (actionMasked == 2) {
            if (this.f1792a != 1) {
                int pointerCount = motionEvent.getPointerCount();
                while (i10 < pointerCount) {
                    int pointerId2 = motionEvent.getPointerId(i10);
                    if (j(pointerId2)) {
                        float x6 = motionEvent.getX(i10);
                        float y8 = motionEvent.getY(i10);
                        float f2 = x6 - this.f1795d[pointerId2];
                        float f7 = y8 - this.f1796e[pointerId2];
                        m(pointerId2, f2, f7);
                        if (this.f1792a != 1) {
                            View viewH2 = h((int) x6, (int) y8);
                            if (d(f2, f7, viewH2) && t(pointerId2, viewH2)) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    i10++;
                }
                o(motionEvent);
                return;
            }
            if (j(this.f1794c)) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f1794c);
                float x10 = motionEvent.getX(iFindPointerIndex);
                float y10 = motionEvent.getY(iFindPointerIndex);
                float[] fArr = this.f1797f;
                int i11 = this.f1794c;
                int i12 = (int) (x10 - fArr[i11]);
                int i13 = (int) (y10 - this.f1798g[i11]);
                int left = this.f1809t.getLeft() + i12;
                int top = this.f1809t.getTop() + i13;
                int left2 = this.f1809t.getLeft();
                int top2 = this.f1809t.getTop();
                if (i12 != 0) {
                    left = mVar.d(left, this.f1809t);
                    WeakHashMap weakHashMap = u0.f1729a;
                    this.f1809t.offsetLeftAndRight(left - left2);
                }
                if (i13 != 0) {
                    top = mVar.e(top, this.f1809t);
                    WeakHashMap weakHashMap2 = u0.f1729a;
                    this.f1809t.offsetTopAndBottom(top - top2);
                }
                if (i12 != 0 || i13 != 0) {
                    mVar.K(this.f1809t, left, top);
                }
                o(motionEvent);
                return;
            }
            return;
        }
        if (actionMasked == 3) {
            if (this.f1792a == 1) {
                this.f1810u = true;
                mVar.L(0.0f, 0.0f, this.f1809t);
                this.f1810u = false;
                if (this.f1792a == 1) {
                    p(0);
                }
            }
            a();
            return;
        }
        if (actionMasked != 5) {
            if (actionMasked != 6) {
                return;
            }
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            if (this.f1792a == 1 && pointerId3 == this.f1794c) {
                int pointerCount2 = motionEvent.getPointerCount();
                while (true) {
                    if (i10 >= pointerCount2) {
                        i7 = -1;
                        break;
                    }
                    int pointerId4 = motionEvent.getPointerId(i10);
                    if (pointerId4 != this.f1794c) {
                        View viewH3 = h((int) motionEvent.getX(i10), (int) motionEvent.getY(i10));
                        View view = this.f1809t;
                        if (viewH3 == view && t(pointerId4, view)) {
                            i7 = this.f1794c;
                            break;
                        }
                    }
                    i10++;
                }
                if (i7 == -1) {
                    l();
                }
            }
            e(pointerId3);
            return;
        }
        int pointerId5 = motionEvent.getPointerId(actionIndex);
        float x11 = motionEvent.getX(actionIndex);
        float y11 = motionEvent.getY(actionIndex);
        n(pointerId5, x11, y11);
        if (this.f1792a == 0) {
            t(pointerId5, h((int) x11, (int) y11));
            if ((this.f1799h[pointerId5] & this.f1806q) != 0) {
                mVar.H();
                return;
            }
            return;
        }
        int i14 = (int) x11;
        int i15 = (int) y11;
        View view2 = this.f1809t;
        if (view2 != null && i14 >= view2.getLeft() && i14 < view2.getRight() && i15 >= view2.getTop() && i15 < view2.getBottom()) {
            i10 = 1;
        }
        if (i10 != 0) {
            t(pointerId5, this.f1809t);
        }
    }

    public final void l() {
        VelocityTracker velocityTracker = this.f1801l;
        float f2 = this.f1802m;
        velocityTracker.computeCurrentVelocity(1000, f2);
        float xVelocity = this.f1801l.getXVelocity(this.f1794c);
        float f7 = this.f1803n;
        float fAbs = Math.abs(xVelocity);
        if (fAbs < f7) {
            xVelocity = 0.0f;
        } else if (fAbs > f2) {
            xVelocity = xVelocity > 0.0f ? f2 : -f2;
        }
        float yVelocity = this.f1801l.getYVelocity(this.f1794c);
        float f10 = this.f1803n;
        float fAbs2 = Math.abs(yVelocity);
        if (fAbs2 < f10) {
            f2 = 0.0f;
        } else if (fAbs2 <= f2) {
            f2 = yVelocity;
        } else if (yVelocity <= 0.0f) {
            f2 = -f2;
        }
        this.f1810u = true;
        this.f1808s.L(xVelocity, f2, this.f1809t);
        this.f1810u = false;
        if (this.f1792a == 1) {
            p(0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r4v3, types: [xr.m] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void m(int i7, float f2, float f7) {
        int i10;
        boolean zC = c(f2, f7, i7, 1);
        ?? r5 = zC;
        if (c(f7, f2, i7, 4)) {
            r5 = (zC ? 1 : 0) | 4;
        }
        ?? r6 = r5;
        if (c(f2, f7, i7, 2)) {
            r6 = (r5 == true ? 1 : 0) | 2;
        }
        ?? r7 = r6;
        if (c(f7, f2, i7, 8)) {
            i10 = (r6 == true ? 1 : 0) | 8;
        }
        if (r7 == 0) {
            r7 = i10;
            return;
        }
        r7 = i10;
        int[] iArr = this.f1800i;
        iArr[i7] = (iArr[i7] | r7) == true ? 1 : 0;
        this.f1808s.G(r7, i7);
    }

    public final void n(int i7, float f2, float f7) {
        float[] fArr = this.f1795d;
        if (fArr == null || fArr.length <= i7) {
            int i10 = i7 + 1;
            float[] fArr2 = new float[i10];
            float[] fArr3 = new float[i10];
            float[] fArr4 = new float[i10];
            float[] fArr5 = new float[i10];
            int[] iArr = new int[i10];
            int[] iArr2 = new int[i10];
            int[] iArr3 = new int[i10];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f1796e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f1797f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f1798g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f1799h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f1800i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f1795d = fArr2;
            this.f1796e = fArr3;
            this.f1797f = fArr4;
            this.f1798g = fArr5;
            this.f1799h = iArr;
            this.f1800i = iArr2;
            this.j = iArr3;
        }
        float[] fArr9 = this.f1795d;
        this.f1797f[i7] = f2;
        fArr9[i7] = f2;
        float[] fArr10 = this.f1796e;
        this.f1798g[i7] = f7;
        fArr10[i7] = f7;
        int[] iArr7 = this.f1799h;
        int i11 = (int) f2;
        int i12 = (int) f7;
        ViewGroup viewGroup = this.f1811v;
        int i13 = i11 < viewGroup.getLeft() + this.f1804o ? 1 : 0;
        if (i12 < viewGroup.getTop() + this.f1804o) {
            i13 |= 4;
        }
        if (i11 > viewGroup.getRight() - this.f1804o) {
            i13 |= 2;
        }
        if (i12 > viewGroup.getBottom() - this.f1804o) {
            i13 |= 8;
        }
        iArr7[i7] = i13;
        this.k = (1 << i7) | this.k;
    }

    public final void o(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i7 = 0; i7 < pointerCount; i7++) {
            int pointerId = motionEvent.getPointerId(i7);
            if (j(pointerId)) {
                float x5 = motionEvent.getX(i7);
                float y5 = motionEvent.getY(i7);
                this.f1797f[pointerId] = x5;
                this.f1798g[pointerId] = y5;
            }
        }
    }

    public final void p(int i7) {
        this.f1811v.removeCallbacks(this.f1812w);
        if (this.f1792a != i7) {
            this.f1792a = i7;
            this.f1808s.J(i7);
            if (this.f1792a == 0) {
                this.f1809t = null;
            }
        }
    }

    public final boolean q(int i7, int i10) {
        if (this.f1810u) {
            return i(i7, i10, (int) this.f1801l.getXVelocity(this.f1794c), (int) this.f1801l.getYVelocity(this.f1794c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f5  */
    public final boolean r(MotionEvent motionEvent) {
        View viewH;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f1801l == null) {
            this.f1801l = VelocityTracker.obtain();
        }
        this.f1801l.addMovement(motionEvent);
        m mVar = this.f1808s;
        if (actionMasked == 0) {
            float x5 = motionEvent.getX();
            float y5 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            n(pointerId, x5, y5);
            View viewH2 = h((int) x5, (int) y5);
            if (viewH2 == this.f1809t && this.f1792a == 2) {
                t(pointerId, viewH2);
            }
            if ((this.f1799h[pointerId] & this.f1806q) != 0) {
                mVar.H();
            }
        } else if (actionMasked == 1) {
            a();
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                a();
            } else if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x6 = motionEvent.getX(actionIndex);
                float y8 = motionEvent.getY(actionIndex);
                n(pointerId2, x6, y8);
                int i7 = this.f1792a;
                if (i7 == 0) {
                    if ((this.f1799h[pointerId2] & this.f1806q) != 0) {
                        mVar.H();
                    }
                } else if (i7 == 2 && (viewH = h((int) x6, (int) y8)) == this.f1809t) {
                    t(pointerId2, viewH);
                }
            } else if (actionMasked == 6) {
                e(motionEvent.getPointerId(actionIndex));
            }
        } else if (this.f1795d != null && this.f1796e != null) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i10 = 0; i10 < pointerCount; i10++) {
                int pointerId3 = motionEvent.getPointerId(i10);
                if (j(pointerId3)) {
                    float x10 = motionEvent.getX(i10);
                    float y10 = motionEvent.getY(i10);
                    float f2 = x10 - this.f1795d[pointerId3];
                    float f7 = y10 - this.f1796e[pointerId3];
                    View viewH3 = h((int) x10, (int) y10);
                    boolean z5 = viewH3 != null && d(f2, f7, viewH3);
                    if (!z5) {
                        m(pointerId3, f2, f7);
                        if (this.f1792a != 1) {
                            break;
                        }
                    } else {
                        int left = viewH3.getLeft();
                        int iD = mVar.d(((int) f2) + left, viewH3);
                        int top = viewH3.getTop();
                        int iE = mVar.e(((int) f7) + top, viewH3);
                        int iW = mVar.w(viewH3);
                        int iX = mVar.x();
                        if ((iW == 0 || (iW > 0 && iD == left)) && (iX == 0 || (iX > 0 && iE == top))) {
                            break;
                        }
                        m(pointerId3, f2, f7);
                        if (this.f1792a != 1 || (z5 && t(pointerId3, viewH3))) {
                            break;
                        }
                    }
                }
            }
            o(motionEvent);
        }
        return this.f1792a == 1;
    }

    public final boolean s(View view, int i7, int i10) {
        this.f1809t = view;
        this.f1794c = -1;
        boolean zI = i(i7, i10, 0, 0);
        if (!zI && this.f1792a == 0 && this.f1809t != null) {
            this.f1809t = null;
        }
        return zI;
    }

    public final boolean t(int i7, View view) {
        if (view == this.f1809t && this.f1794c == i7) {
            return true;
        }
        if (view == null || !this.f1808s.W(i7, view)) {
            return false;
        }
        this.f1794c = i7;
        b(i7, view);
        return true;
    }
}

package androidx.recyclerview.widget;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import com.discord.js_watchdog.JSWatchdogManagerKt;

/* JADX INFO: loaded from: classes.dex */
public final class c0 extends RecyclerView.ItemDecoration implements RecyclerView.OnItemTouchListener {
    public static final int[] C = {R.attr.state_pressed};
    public static final int[] D = new int[0];
    public int A;
    public final v0 B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StateListDrawable f2567c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Drawable f2568d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f2569e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f2570f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final StateListDrawable f2571g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Drawable f2572h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f2573i;
    public final int j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f2574l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f2575m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f2576n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f2577o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f2578p;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final RecyclerView f2581s;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final ValueAnimator f2588z;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f2579q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f2580r = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f2582t = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f2583u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f2584v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f2585w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int[] f2586x = new int[2];

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int[] f2587y = new int[2];

    public c0(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i7, int i10, int i11) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f2588z = valueAnimatorOfFloat;
        this.A = 0;
        v0 v0Var = new v0(1, this);
        this.B = v0Var;
        z zVar = new z(this);
        this.f2567c = stateListDrawable;
        this.f2568d = drawable;
        this.f2571g = stateListDrawable2;
        this.f2572h = drawable2;
        this.f2569e = Math.max(i7, stateListDrawable.getIntrinsicWidth());
        this.f2570f = Math.max(i7, drawable.getIntrinsicWidth());
        this.f2573i = Math.max(i7, stateListDrawable2.getIntrinsicWidth());
        this.j = Math.max(i7, drawable2.getIntrinsicWidth());
        this.f2565a = i10;
        this.f2566b = i11;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        valueAnimatorOfFloat.addListener(new a0(this));
        valueAnimatorOfFloat.addUpdateListener(new b0(this));
        RecyclerView recyclerView2 = this.f2581s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            recyclerView2.removeItemDecoration(this);
            this.f2581s.removeOnItemTouchListener(this);
            this.f2581s.removeOnScrollListener(zVar);
            this.f2581s.removeCallbacks(v0Var);
        }
        this.f2581s = recyclerView;
        recyclerView.addItemDecoration(this);
        this.f2581s.addOnItemTouchListener(this);
        this.f2581s.addOnScrollListener(zVar);
    }

    public static int c(float f2, float f7, int[] iArr, int i7, int i10, int i11) {
        int i12 = iArr[1] - iArr[0];
        if (i12 != 0) {
            int i13 = i7 - i11;
            int i14 = (int) (((f7 - f2) / i12) * i13);
            int i15 = i10 + i14;
            if (i15 < i13 && i15 >= 0) {
                return i14;
            }
        }
        return 0;
    }

    public final boolean a(float f2, float f7) {
        if (f7 < this.f2580r - this.f2573i) {
            return false;
        }
        int i7 = this.f2577o;
        int i10 = this.f2576n;
        return f2 >= ((float) (i7 - (i10 / 2))) && f2 <= ((float) ((i10 / 2) + i7));
    }

    public final boolean b(float f2, float f7) {
        int layoutDirection = this.f2581s.getLayoutDirection();
        int i7 = this.f2569e;
        if (layoutDirection == 1) {
            if (f2 > i7) {
                return false;
            }
        } else if (f2 < this.f2579q - i7) {
            return false;
        }
        int i10 = this.f2574l;
        int i11 = this.k / 2;
        return f7 >= ((float) (i10 - i11)) && f7 <= ((float) (i11 + i10));
    }

    public final void d(int i7) {
        v0 v0Var = this.B;
        StateListDrawable stateListDrawable = this.f2567c;
        if (i7 == 2 && this.f2584v != 2) {
            stateListDrawable.setState(C);
            this.f2581s.removeCallbacks(v0Var);
        }
        if (i7 == 0) {
            this.f2581s.invalidate();
        } else {
            e();
        }
        if (this.f2584v == 2 && i7 != 2) {
            stateListDrawable.setState(D);
            this.f2581s.removeCallbacks(v0Var);
            this.f2581s.postDelayed(v0Var, 1200);
        } else if (i7 == 1) {
            this.f2581s.removeCallbacks(v0Var);
            this.f2581s.postDelayed(v0Var, JSWatchdogManagerKt.FREEZE_CHECK_DELAY_MS);
        }
        this.f2584v = i7;
    }

    public final void e() {
        int i7 = this.A;
        ValueAnimator valueAnimator = this.f2588z;
        if (i7 != 0) {
            if (i7 != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.A = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        if (this.f2579q != this.f2581s.getWidth() || this.f2580r != this.f2581s.getHeight()) {
            this.f2579q = this.f2581s.getWidth();
            this.f2580r = this.f2581s.getHeight();
            d(0);
            return;
        }
        if (this.A != 0) {
            if (this.f2582t) {
                int i7 = this.f2579q;
                int i10 = this.f2569e;
                int i11 = i7 - i10;
                int i12 = this.f2574l;
                int i13 = this.k;
                int i14 = i12 - (i13 / 2);
                StateListDrawable stateListDrawable = this.f2567c;
                stateListDrawable.setBounds(0, 0, i10, i13);
                int i15 = this.f2570f;
                int i16 = this.f2580r;
                Drawable drawable = this.f2568d;
                drawable.setBounds(0, 0, i15, i16);
                if (this.f2581s.getLayoutDirection() == 1) {
                    drawable.draw(canvas);
                    canvas.translate(i10, i14);
                    canvas.scale(-1.0f, 1.0f);
                    stateListDrawable.draw(canvas);
                    canvas.scale(-1.0f, 1.0f);
                    canvas.translate(-i10, -i14);
                } else {
                    canvas.translate(i11, 0.0f);
                    drawable.draw(canvas);
                    canvas.translate(0.0f, i14);
                    stateListDrawable.draw(canvas);
                    canvas.translate(-i11, -i14);
                }
            }
            if (this.f2583u) {
                int i17 = this.f2580r;
                int i18 = this.f2573i;
                int i19 = i17 - i18;
                int i20 = this.f2577o;
                int i21 = this.f2576n;
                int i22 = i20 - (i21 / 2);
                StateListDrawable stateListDrawable2 = this.f2571g;
                stateListDrawable2.setBounds(0, 0, i21, i18);
                int i23 = this.f2579q;
                int i24 = this.j;
                Drawable drawable2 = this.f2572h;
                drawable2.setBounds(0, 0, i23, i24);
                canvas.translate(0.0f, i19);
                drawable2.draw(canvas);
                canvas.translate(i22, 0.0f);
                stateListDrawable2.draw(canvas);
                canvas.translate(-i22, -i19);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public final boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i7 = this.f2584v;
        if (i7 != 1) {
            return i7 == 2;
        }
        boolean zB = b(motionEvent.getX(), motionEvent.getY());
        boolean zA = a(motionEvent.getX(), motionEvent.getY());
        if (motionEvent.getAction() != 0) {
            return false;
        }
        if (!zB && !zA) {
            return false;
        }
        if (zA) {
            this.f2585w = 1;
            this.f2578p = (int) motionEvent.getX();
        } else if (zB) {
            this.f2585w = 2;
            this.f2575m = (int) motionEvent.getY();
        }
        d(2);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public final void onRequestDisallowInterceptTouchEvent(boolean z5) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public final void onTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f2584v == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean zB = b(motionEvent.getX(), motionEvent.getY());
            boolean zA = a(motionEvent.getX(), motionEvent.getY());
            if (zB || zA) {
                if (zA) {
                    this.f2585w = 1;
                    this.f2578p = (int) motionEvent.getX();
                } else if (zB) {
                    this.f2585w = 2;
                    this.f2575m = (int) motionEvent.getY();
                }
                d(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.f2584v == 2) {
            this.f2575m = 0.0f;
            this.f2578p = 0.0f;
            d(1);
            this.f2585w = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.f2584v == 2) {
            e();
            int i7 = this.f2585w;
            int i10 = this.f2566b;
            if (i7 == 1) {
                float x5 = motionEvent.getX();
                int[] iArr = this.f2587y;
                iArr[0] = i10;
                int i11 = this.f2579q - i10;
                iArr[1] = i11;
                float fMax = Math.max(i10, Math.min(i11, x5));
                if (Math.abs(this.f2577o - fMax) >= 2.0f) {
                    int iC = c(this.f2578p, fMax, iArr, this.f2581s.computeHorizontalScrollRange(), this.f2581s.computeHorizontalScrollOffset(), this.f2579q);
                    if (iC != 0) {
                        this.f2581s.scrollBy(iC, 0);
                    }
                    this.f2578p = fMax;
                }
            }
            if (this.f2585w == 2) {
                float y5 = motionEvent.getY();
                int[] iArr2 = this.f2586x;
                iArr2[0] = i10;
                int i12 = this.f2580r - i10;
                iArr2[1] = i12;
                float fMax2 = Math.max(i10, Math.min(i12, y5));
                if (Math.abs(this.f2574l - fMax2) < 2.0f) {
                    return;
                }
                int iC2 = c(this.f2575m, fMax2, iArr2, this.f2581s.computeVerticalScrollRange(), this.f2581s.computeVerticalScrollOffset(), this.f2580r);
                if (iC2 != 0) {
                    this.f2581s.scrollBy(0, iC2);
                }
                this.f2575m = fMax2;
            }
        }
    }
}

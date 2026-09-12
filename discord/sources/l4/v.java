package l4;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class v extends Drawable implements Drawable.Callback, Animatable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final boolean f14912p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final List f14913q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final ThreadPoolExecutor f14914r0;
    public String E;
    public af.c F;
    public Map G;
    public String H;
    public b I;
    public h0 J;
    public final ga.l K;
    public boolean L;
    public boolean M;
    public t4.c N;
    public int O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public f0 T;
    public boolean U;
    public final Matrix V;
    public Bitmap W;
    public Canvas X;
    public Rect Y;
    public RectF Z;
    public m4.a a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public Rect f14915b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public Rect f14916c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public i f14917d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public RectF f14918d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final x4.e f14919e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public RectF f14920e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public Matrix f14921f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public Matrix f14922g0;
    public boolean h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f14923i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public a f14924i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public final Semaphore f14925j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public Handler f14926k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public s f14927l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public final s f14928m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public float f14929n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public int f14930o0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f14931v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f14932w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ArrayList f14933x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public p4.a f14934y;

    static {
        f14912p0 = Build.VERSION.SDK_INT <= 25;
        f14913q0 = Arrays.asList("reduced motion", "reduced_motion", "reduced-motion", "reducedmotion");
        f14914r0 = new ThreadPoolExecutor(0, 2, 35L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new x4.d());
    }

    public v() {
        x4.e eVar = new x4.e();
        eVar.f22630v = 1.0f;
        eVar.f22631w = false;
        eVar.f22632x = 0L;
        eVar.f22633y = 0.0f;
        eVar.E = 0.0f;
        eVar.F = 0;
        eVar.G = -2.14748365E9f;
        eVar.H = 2.14748365E9f;
        eVar.J = false;
        eVar.K = false;
        this.f14919e = eVar;
        this.f14923i = true;
        this.f14931v = false;
        this.f14932w = false;
        this.f14930o0 = 1;
        this.f14933x = new ArrayList();
        this.K = new ga.l(21);
        this.L = false;
        this.M = true;
        this.O = 255;
        this.S = false;
        this.T = f0.f14847d;
        this.U = false;
        this.V = new Matrix();
        this.h0 = false;
        com.discord.chat.presentation.list.c cVar = new com.discord.chat.presentation.list.c(5, this);
        this.f14925j0 = new Semaphore(1);
        this.f14928m0 = new s(this, 1);
        this.f14929n0 = -3.4028235E38f;
        eVar.addUpdateListener(cVar);
    }

    public static void f(Rect rect, RectF rectF) {
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    public final void a(final q4.e eVar, final Object obj, final e4.c cVar) {
        t4.c cVar2 = this.N;
        if (cVar2 == null) {
            this.f14933x.add(new u() { // from class: l4.q
                @Override // l4.u
                public final void run() {
                    this.f14901a.a(eVar, obj, cVar);
                }
            });
            return;
        }
        boolean zIsEmpty = true;
        if (eVar == q4.e.f18621c) {
            cVar2.h(cVar, obj);
        } else {
            q4.f fVar = eVar.f18623b;
            if (fVar != null) {
                fVar.h(cVar, obj);
            } else {
                ArrayList arrayList = new ArrayList();
                this.N.c(eVar, 0, arrayList, new q4.e(new String[0]));
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    ((q4.e) arrayList.get(i7)).f18623b.h(cVar, obj);
                }
                zIsEmpty = true ^ arrayList.isEmpty();
            }
        }
        if (zIsEmpty) {
            invalidateSelf();
            if (obj == z.f14966z) {
                v(this.f14919e.d());
            }
        }
    }

    public final boolean b(Context context) {
        if (this.f14931v) {
            return true;
        }
        if (!this.f14923i) {
            return false;
        }
        if (context == null) {
            return true;
        }
        hs.c cVar = x4.h.f22636a;
        return Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f) != 0.0f;
    }

    public final void c() {
        i iVar = this.f14917d;
        if (iVar == null) {
            return;
        }
        io.sentry.internal.debugmeta.c cVar = v4.q.f21485a;
        Rect rect = iVar.k;
        List list = Collections.EMPTY_LIST;
        t4.c cVar2 = new t4.c(this, new t4.e(list, iVar, "__container", -1L, 1, -1L, null, list, new r4.d(), 0, 0, 0, 0.0f, 0.0f, rect.width(), rect.height(), null, null, list, 1, null, false, null, null, 1), iVar.j, iVar);
        this.N = cVar2;
        if (this.Q) {
            cVar2.r(true);
        }
        this.N.J = this.M;
    }

    public final void d() {
        x4.e eVar = this.f14919e;
        if (eVar.J) {
            eVar.cancel();
            if (!isVisible()) {
                this.f14930o0 = 1;
            }
        }
        this.f14917d = null;
        this.N = null;
        this.f14934y = null;
        this.f14929n0 = -3.4028235E38f;
        eVar.I = null;
        eVar.G = -2.14748365E9f;
        eVar.H = 2.14748365E9f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float f2;
        float fD;
        i iVar;
        t4.c cVar = this.N;
        if (cVar == null) {
            return;
        }
        a aVar = this.f14924i0;
        if (aVar == null) {
            aVar = a.f14817d;
        }
        boolean z5 = aVar == a.f14818e;
        s sVar = this.f14928m0;
        ThreadPoolExecutor threadPoolExecutor = f14914r0;
        Semaphore semaphore = this.f14925j0;
        x4.e eVar = this.f14919e;
        if (z5) {
            try {
                semaphore.acquire();
            } catch (InterruptedException unused) {
                if (!z5) {
                    return;
                } else {
                    if ((f2 > fD ? 1 : (f2 == fD ? 0 : -1)) == 0) {
                        return;
                    }
                }
            } finally {
                if (z5) {
                    semaphore.release();
                    if (cVar.I != eVar.d()) {
                        threadPoolExecutor.execute(sVar);
                    }
                }
            }
        }
        if (z5 && (iVar = this.f14917d) != null) {
            float f7 = this.f14929n0;
            float fD2 = eVar.d();
            this.f14929n0 = fD2;
            if (Math.abs(fD2 - f7) * iVar.b() >= 50.0f) {
                v(eVar.d());
            }
        }
        if (this.f14932w) {
            try {
                if (this.U) {
                    m(canvas, cVar);
                } else {
                    g(canvas);
                }
            } catch (Throwable unused2) {
                x4.c.f22625a.getClass();
            }
        } else if (this.U) {
            m(canvas, cVar);
        } else {
            g(canvas);
        }
        this.h0 = false;
    }

    public final void e() {
        i iVar = this.f14917d;
        if (iVar == null) {
            return;
        }
        f0 f0Var = this.T;
        int i7 = Build.VERSION.SDK_INT;
        boolean z5 = iVar.f14875o;
        int i10 = iVar.f14876p;
        int iOrdinal = f0Var.ordinal();
        boolean z6 = false;
        if (iOrdinal != 1 && (iOrdinal == 2 || ((z5 && i7 < 28) || i10 > 4 || i7 <= 25))) {
            z6 = true;
        }
        this.U = z6;
    }

    public final void g(Canvas canvas) {
        t4.c cVar = this.N;
        i iVar = this.f14917d;
        if (cVar == null || iVar == null) {
            return;
        }
        Matrix matrix = this.V;
        matrix.reset();
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            matrix.preScale(bounds.width() / iVar.k.width(), bounds.height() / iVar.k.height());
            matrix.preTranslate(bounds.left, bounds.top);
        }
        cVar.f(canvas, matrix, this.O);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.O;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        i iVar = this.f14917d;
        if (iVar == null) {
            return -1;
        }
        return iVar.k.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        i iVar = this.f14917d;
        if (iVar == null) {
            return -1;
        }
        return iVar.k.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final Context h() {
        Drawable.Callback callback = getCallback();
        if (callback != null && (callback instanceof View)) {
            return ((View) callback).getContext();
        }
        return null;
    }

    public final af.c i() {
        if (getCallback() == null) {
            return null;
        }
        if (this.F == null) {
            Drawable.Callback callback = getCallback();
            b bVar = this.I;
            af.c cVar = new af.c();
            cVar.f393d = new a5.l(1);
            cVar.f394e = new HashMap();
            cVar.f396v = new HashMap();
            cVar.f395i = ".ttf";
            cVar.f398x = bVar;
            if (callback instanceof View) {
                cVar.f397w = ((View) callback).getContext().getAssets();
            } else {
                x4.c.b("LottieDrawable must be inside of a view for images to work.");
                cVar.f397w = null;
            }
            this.F = cVar;
            String str = this.H;
            if (str != null) {
                cVar.f395i = str;
            }
        }
        return this.F;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable.Callback callback;
        if (this.h0) {
            return;
        }
        this.h0 = true;
        if ((!f14912p0 || Looper.getMainLooper() == Looper.myLooper()) && (callback = getCallback()) != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return j();
    }

    public final boolean j() {
        x4.e eVar = this.f14919e;
        if (eVar == null) {
            return false;
        }
        return eVar.J;
    }

    public final void k() {
        this.f14933x.clear();
        x4.e eVar = this.f14919e;
        eVar.h(true);
        Iterator it = eVar.f22623i.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorPauseListener) it.next()).onAnimationPause(eVar);
        }
        if (isVisible()) {
            return;
        }
        this.f14930o0 = 1;
    }

    public final void l() {
        if (this.N == null) {
            this.f14933x.add(new t(this, 1));
            return;
        }
        e();
        boolean zB = b(h());
        x4.e eVar = this.f14919e;
        if (zB || eVar.getRepeatCount() == 0) {
            if (isVisible()) {
                eVar.J = true;
                eVar.b(eVar.g());
                eVar.j((int) (eVar.g() ? eVar.e() : eVar.f()));
                eVar.f22632x = 0L;
                eVar.F = 0;
                if (eVar.J) {
                    eVar.h(false);
                    Choreographer.getInstance().postFrameCallback(eVar);
                }
                this.f14930o0 = 1;
            } else {
                this.f14930o0 = 2;
            }
        }
        if (b(h())) {
            return;
        }
        Iterator it = f14913q0.iterator();
        q4.h hVarD = null;
        while (it.hasNext()) {
            hVarD = this.f14917d.d((String) it.next());
            if (hVarD != null) {
                break;
            }
        }
        if (hVarD != null) {
            o((int) hVarD.f18627b);
        } else {
            o((int) (eVar.f22630v < 0.0f ? eVar.f() : eVar.e()));
        }
        eVar.h(true);
        eVar.a(eVar.g());
        if (isVisible()) {
            return;
        }
        this.f14930o0 = 1;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x00d5  */
    public final void m(Canvas canvas, t4.c cVar) {
        boolean z5;
        if (this.f14917d == null || cVar == null) {
            return;
        }
        if (this.X == null) {
            this.X = new Canvas();
            this.f14920e0 = new RectF();
            this.f14921f0 = new Matrix();
            this.f14922g0 = new Matrix();
            this.Y = new Rect();
            this.Z = new RectF();
            this.a0 = new m4.a();
            this.f14915b0 = new Rect();
            this.f14916c0 = new Rect();
            this.f14918d0 = new RectF();
        }
        canvas.getMatrix(this.f14921f0);
        canvas.getClipBounds(this.Y);
        Rect rect = this.Y;
        this.Z.set(rect.left, rect.top, rect.right, rect.bottom);
        this.f14921f0.mapRect(this.Z);
        f(this.Y, this.Z);
        if (this.M) {
            this.f14920e0.set(0.0f, 0.0f, getIntrinsicWidth(), getIntrinsicHeight());
        } else {
            cVar.d(this.f14920e0, null, false);
        }
        this.f14921f0.mapRect(this.f14920e0);
        Rect bounds = getBounds();
        float fWidth = bounds.width() / getIntrinsicWidth();
        float fHeight = bounds.height() / getIntrinsicHeight();
        RectF rectF = this.f14920e0;
        rectF.set(rectF.left * fWidth, rectF.top * fHeight, rectF.right * fWidth, rectF.bottom * fHeight);
        Drawable.Callback callback = getCallback();
        if (callback instanceof View) {
            ViewParent parent = ((View) callback).getParent();
            if (parent instanceof ViewGroup) {
                z5 = !((ViewGroup) parent).getClipChildren();
            } else {
                z5 = false;
            }
        } else {
            z5 = false;
        }
        if (!z5) {
            RectF rectF2 = this.f14920e0;
            Rect rect2 = this.Y;
            rectF2.intersect(rect2.left, rect2.top, rect2.right, rect2.bottom);
        }
        int iCeil = (int) Math.ceil(this.f14920e0.width());
        int iCeil2 = (int) Math.ceil(this.f14920e0.height());
        if (iCeil <= 0 || iCeil2 <= 0) {
            return;
        }
        Bitmap bitmap = this.W;
        if (bitmap == null || bitmap.getWidth() < iCeil || this.W.getHeight() < iCeil2) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iCeil, iCeil2, Bitmap.Config.ARGB_8888);
            this.W = bitmapCreateBitmap;
            this.X.setBitmap(bitmapCreateBitmap);
            this.h0 = true;
        } else if (this.W.getWidth() > iCeil || this.W.getHeight() > iCeil2) {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(this.W, 0, 0, iCeil, iCeil2);
            this.W = bitmapCreateBitmap2;
            this.X.setBitmap(bitmapCreateBitmap2);
            this.h0 = true;
        }
        if (this.h0) {
            Matrix matrix = this.f14921f0;
            Matrix matrix2 = this.V;
            matrix2.set(matrix);
            matrix2.preScale(fWidth, fHeight);
            RectF rectF3 = this.f14920e0;
            matrix2.postTranslate(-rectF3.left, -rectF3.top);
            this.W.eraseColor(0);
            cVar.f(this.X, matrix2, this.O);
            this.f14921f0.invert(this.f14922g0);
            this.f14922g0.mapRect(this.f14918d0, this.f14920e0);
            f(this.f14916c0, this.f14918d0);
        }
        this.f14915b0.set(0, 0, iCeil, iCeil2);
        canvas.drawBitmap(this.W, this.f14915b0, this.f14916c0, this.a0);
    }

    public final void n() {
        if (this.N == null) {
            this.f14933x.add(new t(this, 0));
            return;
        }
        e();
        boolean zB = b(h());
        x4.e eVar = this.f14919e;
        if (zB || eVar.getRepeatCount() == 0) {
            if (isVisible()) {
                eVar.J = true;
                eVar.h(false);
                Choreographer.getInstance().postFrameCallback(eVar);
                eVar.f22632x = 0L;
                if (eVar.g() && eVar.E == eVar.f()) {
                    eVar.j(eVar.e());
                } else if (!eVar.g() && eVar.E == eVar.e()) {
                    eVar.j(eVar.f());
                }
                Iterator it = eVar.f22623i.iterator();
                while (it.hasNext()) {
                    ((Animator.AnimatorPauseListener) it.next()).onAnimationResume(eVar);
                }
                this.f14930o0 = 1;
            } else {
                this.f14930o0 = 3;
            }
        }
        if (b(h())) {
            return;
        }
        o((int) (eVar.f22630v < 0.0f ? eVar.f() : eVar.e()));
        eVar.h(true);
        eVar.a(eVar.g());
        if (isVisible()) {
            return;
        }
        this.f14930o0 = 1;
    }

    public final void o(int i7) {
        if (this.f14917d != null) {
            this.f14919e.j(i7);
        } else {
            this.f14933x.add(new p(this, i7, 2));
        }
    }

    public final void p(int i7) {
        if (this.f14917d == null) {
            this.f14933x.add(new p(this, i7, 0));
        } else {
            x4.e eVar = this.f14919e;
            eVar.k(eVar.G, i7 + 0.99f);
        }
    }

    public final void q(String str) {
        i iVar = this.f14917d;
        if (iVar == null) {
            this.f14933x.add(new n(this, str, 1));
        } else {
            q4.h hVarD = iVar.d(str);
            if (hVarD == null) {
                throw new IllegalArgumentException(s0.g.e("Cannot find marker with name ", str, "."));
            }
            p((int) (hVarD.f18627b + hVarD.f18628c));
        }
    }

    public final void r(final int i7, final int i10) {
        if (this.f14917d == null) {
            this.f14933x.add(new u() { // from class: l4.o
                @Override // l4.u
                public final void run() {
                    this.f14895a.r(i7, i10);
                }
            });
        } else {
            this.f14919e.k(i7, i10 + 0.99f);
        }
    }

    public final void s(String str) {
        i iVar = this.f14917d;
        if (iVar == null) {
            this.f14933x.add(new n(this, str, 0));
            return;
        }
        q4.h hVarD = iVar.d(str);
        if (hVarD == null) {
            throw new IllegalArgumentException(s0.g.e("Cannot find marker with name ", str, "."));
        }
        int i7 = (int) hVarD.f18627b;
        r(i7, ((int) hVarD.f18628c) + i7);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
        this.O = i7;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        x4.c.b("Use addColorFilter instead.");
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z5, boolean z6) {
        boolean zIsVisible = isVisible();
        boolean visible = super.setVisible(z5, z6);
        if (z5) {
            int i7 = this.f14930o0;
            if (i7 == 2) {
                l();
                return visible;
            }
            if (i7 == 3) {
                n();
                return visible;
            }
        } else {
            if (this.f14919e.J) {
                k();
                this.f14930o0 = 3;
                return visible;
            }
            if (zIsVisible) {
                this.f14930o0 = 1;
            }
        }
        return visible;
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && ((View) callback).isInEditMode()) {
            return;
        }
        l();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f14933x.clear();
        x4.e eVar = this.f14919e;
        eVar.h(true);
        eVar.a(eVar.g());
        if (isVisible()) {
            return;
        }
        this.f14930o0 = 1;
    }

    public final void t(int i7) {
        if (this.f14917d == null) {
            this.f14933x.add(new p(this, i7, 1));
        } else {
            x4.e eVar = this.f14919e;
            eVar.k(i7, (int) eVar.H);
        }
    }

    public final void u(String str) {
        i iVar = this.f14917d;
        if (iVar == null) {
            this.f14933x.add(new n(this, str, 2));
        } else {
            q4.h hVarD = iVar.d(str);
            if (hVarD == null) {
                throw new IllegalArgumentException(s0.g.e("Cannot find marker with name ", str, "."));
            }
            t((int) hVarD.f18627b);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }

    public final void v(float f2) {
        i iVar = this.f14917d;
        if (iVar == null) {
            this.f14933x.add(new r(this, f2, 2));
        } else {
            this.f14919e.j(x4.g.e(iVar.f14872l, iVar.f14873m, f2));
        }
    }
}

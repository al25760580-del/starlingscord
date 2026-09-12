package kh;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import android.util.StateSet;
import androidx.dynamicanimation.animation.SpringAnimation;
import gc.g1;
import java.util.BitSet;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public class i extends Drawable implements w {

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final Paint f14479c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final h[] f14480d0;
    public final Matrix E;
    public final Path F;
    public final Path G;
    public final RectF H;
    public final RectF I;
    public final Region J;
    public final Region K;
    public final Paint L;
    public final Paint M;
    public final jh.a N;
    public final u4.c O;
    public final g1 P;
    public PorterDuffColorFilter Q;
    public PorterDuffColorFilter R;
    public int S;
    public final RectF T;
    public boolean U;
    public boolean V;
    public m W;
    public j2.i X;
    public final SpringAnimation[] Y;
    public float[] Z;
    public float[] a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public mi.a f14481b0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u4.b f14482d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public g f14483e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final u[] f14484i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final u[] f14485v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final BitSet f14486w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f14487x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f14488y;

    static {
        Paint paint = new Paint(1);
        f14479c0 = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        f14480d0 = new h[4];
        int i7 = 0;
        while (true) {
            h[] hVarArr = f14480d0;
            if (i7 >= hVarArr.length) {
                return;
            }
            hVarArr[i7] = new h(i7);
            i7++;
        }
    }

    public i() {
        this(new m());
    }

    public static float c(RectF rectF, m mVar, float[] fArr) {
        if (fArr == null) {
            if (mVar.f(rectF)) {
                return mVar.f14504e.a(rectF);
            }
            return -1.0f;
        }
        if (fArr.length > 1) {
            float f2 = fArr[0];
            for (int i7 = 1; i7 < fArr.length; i7++) {
                if (fArr[i7] != f2) {
                    return -1.0f;
                }
            }
        }
        if (mVar.e()) {
            return fArr[0];
        }
        return -1.0f;
    }

    public final void b(Path path, RectF rectF) {
        g gVar = this.f14483e;
        this.P.b(gVar.f14463a, this.Z, gVar.j, rectF, this.O, path);
        if (this.f14483e.f14471i != 1.0f) {
            Matrix matrix = this.E;
            matrix.reset();
            float f2 = this.f14483e.f14471i;
            matrix.setScale(f2, f2, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.T, true);
    }

    public final int d(int i7) {
        int i10;
        g gVar = this.f14483e;
        float f2 = gVar.f14474n + 0.0f + gVar.f14473m;
        ah.a aVar = gVar.f14465c;
        if (aVar == null || !aVar.f605a || b1.c.e(i7, 255) != aVar.f608d) {
            return i7;
        }
        float f7 = aVar.f609e;
        float fMin = (f7 <= 0.0f || f2 <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f2 / f7)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int iAlpha = Color.alpha(i7);
        int iN = io.sentry.config.a.N(b1.c.e(i7, 255), aVar.f606b, fMin);
        if (fMin > 0.0f && (i10 = aVar.f607c) != 0) {
            iN = b1.c.c(b1.c.e(i10, ah.a.f604f), iN);
        }
        return b1.c.e(iN, iAlpha);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Paint paint;
        PorterDuffColorFilter porterDuffColorFilter = this.Q;
        Paint paint2 = this.L;
        paint2.setColorFilter(porterDuffColorFilter);
        int alpha = paint2.getAlpha();
        int i7 = this.f14483e.f14472l;
        paint2.setAlpha(((i7 + (i7 >>> 7)) * alpha) >>> 8);
        PorterDuffColorFilter porterDuffColorFilter2 = this.R;
        Paint paint3 = this.M;
        paint3.setColorFilter(porterDuffColorFilter2);
        paint3.setStrokeWidth(this.f14483e.k);
        int alpha2 = paint3.getAlpha();
        int i10 = this.f14483e.f14472l;
        paint3.setAlpha(((i10 + (i10 >>> 7)) * alpha2) >>> 8);
        Paint.Style style = this.f14483e.f14477q;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            boolean z5 = this.f14487x;
            paint = paint2;
            Path path = this.F;
            if (z5) {
                b(path, h());
                this.f14487x = false;
            }
            g gVar = this.f14483e;
            gVar.getClass();
            if (gVar.f14475o > 0 && !n() && !path.isConvex() && Build.VERSION.SDK_INT < 29) {
                canvas.save();
                double d6 = 0;
                canvas.translate((int) (Math.sin(Math.toRadians(d6)) * ((double) this.f14483e.f14476p)), (int) (Math.cos(Math.toRadians(d6)) * ((double) this.f14483e.f14476p)));
                if (this.U) {
                    RectF rectF = this.T;
                    int iWidth = (int) (rectF.width() - getBounds().width());
                    int iHeight = (int) (rectF.height() - getBounds().height());
                    if (iWidth < 0 || iHeight < 0) {
                        throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                    }
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap((this.f14483e.f14475o * 2) + ((int) rectF.width()) + iWidth, (this.f14483e.f14475o * 2) + ((int) rectF.height()) + iHeight, Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(bitmapCreateBitmap);
                    float f2 = (getBounds().left - this.f14483e.f14475o) - iWidth;
                    float f7 = (getBounds().top - this.f14483e.f14475o) - iHeight;
                    canvas2.translate(-f2, -f7);
                    e(canvas2);
                    canvas.drawBitmap(bitmapCreateBitmap, f2, f7, (Paint) null);
                    bitmapCreateBitmap.recycle();
                    canvas.restore();
                } else {
                    e(canvas);
                    canvas.restore();
                }
            }
            f(canvas, paint, path, this.f14483e.f14463a, this.Z, h());
        } else {
            paint = paint2;
        }
        if (l()) {
            if (this.f14488y) {
                m mVar = this.f14483e.f14463a;
                l lVarG = mVar.g();
                d dVar = mVar.f14504e;
                u4.b bVar = this.f14482d;
                lVarG.f14494e = bVar.Y(dVar);
                lVarG.f14495f = bVar.Y(mVar.f14505f);
                lVarG.f14497h = bVar.Y(mVar.f14507h);
                lVarG.f14496g = bVar.Y(mVar.f14506g);
                this.W = lVarG.a();
                float[] fArr = this.Z;
                if (fArr != null) {
                    if (this.a0 == null) {
                        this.a0 = new float[fArr.length];
                    }
                    float fJ = j();
                    int i11 = 0;
                    while (true) {
                        float[] fArr2 = this.Z;
                        if (i11 >= fArr2.length) {
                            break;
                        }
                        this.a0[i11] = Math.max(0.0f, fArr2[i11] - fJ);
                        i11++;
                    }
                } else {
                    this.a0 = null;
                }
                m mVar2 = this.W;
                float[] fArr3 = this.a0;
                float f10 = this.f14483e.j;
                RectF rectFH = h();
                RectF rectF2 = this.I;
                rectF2.set(rectFH);
                float fJ2 = j();
                rectF2.inset(fJ2, fJ2);
                this.P.b(mVar2, fArr3, f10, rectF2, null, this.G);
                this.f14488y = false;
            }
            g(canvas);
        }
        paint.setAlpha(alpha);
        paint3.setAlpha(alpha2);
    }

    public final void e(Canvas canvas) {
        if (this.f14486w.cardinality() > 0) {
            Log.w("i", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i7 = this.f14483e.f14476p;
        Path path = this.F;
        jh.a aVar = this.N;
        if (i7 != 0) {
            canvas.drawPath(path, aVar.f13872a);
        }
        for (int i10 = 0; i10 < 4; i10++) {
            u uVar = this.f14484i[i10];
            int i11 = this.f14483e.f14475o;
            Matrix matrix = u.f14527b;
            uVar.a(matrix, aVar, i11, canvas);
            this.f14485v[i10].a(matrix, aVar, this.f14483e.f14475o, canvas);
        }
        if (this.U) {
            double d6 = 0;
            int iSin = (int) (Math.sin(Math.toRadians(d6)) * ((double) this.f14483e.f14476p));
            int iCos = (int) (Math.cos(Math.toRadians(d6)) * ((double) this.f14483e.f14476p));
            canvas.translate(-iSin, -iCos);
            canvas.drawPath(path, f14479c0);
            canvas.translate(iSin, iCos);
        }
    }

    public final void f(Canvas canvas, Paint paint, Path path, m mVar, float[] fArr, RectF rectF) {
        float fC = c(rectF, mVar, fArr);
        if (fC < 0.0f) {
            canvas.drawPath(path, paint);
        } else {
            float f2 = fC * this.f14483e.j;
            canvas.drawRoundRect(rectF, f2, f2, paint);
        }
    }

    public void g(Canvas canvas) {
        m mVar = this.W;
        float[] fArr = this.a0;
        RectF rectFH = h();
        RectF rectF = this.I;
        rectF.set(rectFH);
        float fJ = j();
        rectF.inset(fJ, fJ);
        f(canvas, this.M, this.G, mVar, fArr, rectF);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f14483e.f14472l;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f14483e;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        this.f14483e.getClass();
        RectF rectFH = h();
        if (rectFH.isEmpty()) {
            return;
        }
        float fC = c(rectFH, this.f14483e.f14463a, this.Z);
        if (fC >= 0.0f) {
            outline.setRoundRect(getBounds(), fC * this.f14483e.j);
            return;
        }
        boolean z5 = this.f14487x;
        Path path = this.F;
        if (z5) {
            b(path, rectFH);
            this.f14487x = false;
        }
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 30) {
            zg.b.a(outline, path);
            return;
        }
        if (i7 >= 29) {
            try {
                zg.a.a(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            zg.a.a(outline, path);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.f14483e.f14470h;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.J;
        region.set(bounds);
        RectF rectFH = h();
        Path path = this.F;
        b(path, rectFH);
        Region region2 = this.K;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final RectF h() {
        Rect bounds = getBounds();
        RectF rectF = this.H;
        rectF.set(bounds);
        return rectF;
    }

    public final float i() {
        float[] fArr = this.Z;
        if (fArr != null) {
            return (((fArr[3] + fArr[2]) - fArr[1]) - fArr[0]) / 2.0f;
        }
        RectF rectFH = h();
        m mVar = this.f14483e.f14463a;
        g1 g1Var = this.P;
        g1Var.getClass();
        float fA = mVar.f14504e.a(rectFH);
        m mVar2 = this.f14483e.f14463a;
        g1Var.getClass();
        float fA2 = mVar2.f14507h.a(rectFH) + fA;
        m mVar3 = this.f14483e.f14463a;
        g1Var.getClass();
        float fA3 = fA2 - mVar3.f14506g.a(rectFH);
        m mVar4 = this.f14483e.f14463a;
        g1Var.getClass();
        return (fA3 - mVar4.f14505f.a(rectFH)) / 2.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.f14487x = true;
        this.f14488y = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.f14483e.f14468f;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        this.f14483e.getClass();
        ColorStateList colorStateList2 = this.f14483e.f14467e;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList3 = this.f14483e.f14466d;
        if (colorStateList3 != null && colorStateList3.isStateful()) {
            return true;
        }
        y yVar = this.f14483e.f14464b;
        return yVar != null && yVar.d();
    }

    public final float j() {
        if (l()) {
            return this.M.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    public final float k() {
        float[] fArr = this.Z;
        return fArr != null ? fArr[3] : this.f14483e.f14463a.f14504e.a(h());
    }

    public final boolean l() {
        Paint.Style style = this.f14483e.f14477q;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.M.getStrokeWidth() > 0.0f;
    }

    public final void m(Context context) {
        this.f14483e.f14465c = new ah.a(context);
        x();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f14483e = new g(this.f14483e);
        return this;
    }

    public final boolean n() {
        if (!this.f14483e.f14463a.f(h())) {
            float[] fArr = this.Z;
            if (fArr != null) {
                if (fArr.length > 1) {
                    float f2 = fArr[0];
                    for (int i7 = 1; i7 < fArr.length; i7++) {
                        if (fArr[i7] == f2) {
                        }
                    }
                    if (this.f14483e.f14463a.e()) {
                    }
                } else if (this.f14483e.f14463a.e()) {
                }
            }
            return false;
        }
        return true;
    }

    public final void o(j2.i iVar) {
        if (this.X == iVar) {
            return;
        }
        this.X = iVar;
        int i7 = 0;
        while (true) {
            SpringAnimation[] springAnimationArr = this.Y;
            if (i7 >= springAnimationArr.length) {
                v(getState(), true);
                invalidateSelf();
                return;
            }
            if (springAnimationArr[i7] == null) {
                springAnimationArr[i7] = new SpringAnimation(this, f14480d0[i7]);
            }
            SpringAnimation springAnimation = springAnimationArr[i7];
            j2.i iVar2 = new j2.i();
            iVar2.a((float) iVar.f13632b);
            double d6 = iVar.f13631a;
            iVar2.b((float) (d6 * d6));
            springAnimation.f2009m = iVar2;
            i7++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f14487x = true;
        this.f14488y = true;
        super.onBoundsChange(rect);
        if (this.f14483e.f14464b != null && !rect.isEmpty()) {
            v(getState(), this.V);
        }
        this.V = rect.isEmpty();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        if (this.f14483e.f14464b != null) {
            v(iArr, false);
        }
        boolean z5 = u(iArr) || w();
        if (z5) {
            invalidateSelf();
        }
        return z5;
    }

    public final void p(float f2) {
        g gVar = this.f14483e;
        if (gVar.f14474n != f2) {
            gVar.f14474n = f2;
            x();
        }
    }

    public final void q(ColorStateList colorStateList) {
        g gVar = this.f14483e;
        if (gVar.f14466d != colorStateList) {
            gVar.f14466d = colorStateList;
            onStateChange(getState());
        }
    }

    public final void r(float f2) {
        g gVar = this.f14483e;
        if (gVar.j != f2) {
            gVar.j = f2;
            this.f14487x = true;
            this.f14488y = true;
            invalidateSelf();
        }
    }

    public final void s() {
        this.N.a(-12303292);
        this.f14483e.getClass();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i7) {
        g gVar = this.f14483e;
        if (gVar.f14472l != i7) {
            gVar.f14472l = i7;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f14483e.getClass();
        super.invalidateSelf();
    }

    @Override // kh.w
    public final void setShapeAppearanceModel(m mVar) {
        g gVar = this.f14483e;
        gVar.f14463a = mVar;
        gVar.f14464b = null;
        this.Z = null;
        this.a0 = null;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i7) {
        setTintList(ColorStateList.valueOf(i7));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f14483e.f14468f = colorStateList;
        w();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        g gVar = this.f14483e;
        if (gVar.f14469g != mode) {
            gVar.f14469g = mode;
            w();
            super.invalidateSelf();
        }
    }

    public final void t(y yVar) {
        g gVar = this.f14483e;
        if (gVar.f14464b != yVar) {
            gVar.f14464b = yVar;
            v(getState(), true);
            invalidateSelf();
        }
    }

    public final boolean u(int[] iArr) {
        boolean z5;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.f14483e.f14466d == null || color2 == (colorForState2 = this.f14483e.f14466d.getColorForState(iArr, (color2 = (paint2 = this.L).getColor())))) {
            z5 = false;
        } else {
            paint2.setColor(colorForState2);
            z5 = true;
        }
        if (this.f14483e.f14467e == null || color == (colorForState = this.f14483e.f14467e.getColorForState(iArr, (color = (paint = this.M).getColor())))) {
            return z5;
        }
        paint.setColor(colorForState);
        return true;
    }

    public final void v(int[] iArr, boolean z5) {
        m mVarA;
        d dVar;
        int i7;
        RectF rectFH = h();
        if (this.f14483e.f14464b == null || rectFH.isEmpty()) {
            return;
        }
        boolean z6 = z5 | (this.X == null);
        if (this.Z == null) {
            this.Z = new float[4];
        }
        y yVar = this.f14483e.f14464b;
        m[] mVarArr = yVar.f14543d;
        int i10 = yVar.f14540a;
        int[][] iArr2 = yVar.f14542c;
        x xVar = yVar.f14547h;
        x xVar2 = yVar.f14546g;
        x xVar3 = yVar.f14545f;
        x xVar4 = yVar.f14544e;
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                i11 = -1;
                break;
            } else if (StateSet.stateSetMatches(iArr2[i11], iArr)) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 < 0) {
            int[] iArr3 = StateSet.WILD_CARD;
            int i12 = 0;
            while (true) {
                if (i12 >= i10) {
                    i7 = -1;
                    break;
                } else {
                    if (StateSet.stateSetMatches(iArr2[i12], iArr3)) {
                        i7 = i12;
                        break;
                    }
                    i12++;
                }
            }
            i11 = i7;
        }
        if (xVar4 == null && xVar3 == null && xVar2 == null && xVar == null) {
            mVarA = mVarArr[i11];
        } else {
            l lVarG = mVarArr[i11].g();
            if (xVar4 != null) {
                lVarG.f14494e = xVar4.c(iArr);
            }
            if (xVar3 != null) {
                lVarG.f14495f = xVar3.c(iArr);
            }
            if (xVar2 != null) {
                lVarG.f14497h = xVar2.c(iArr);
            }
            if (xVar != null) {
                lVarG.f14496g = xVar.c(iArr);
            }
            mVarA = lVarG.a();
        }
        int i13 = 0;
        while (i13 < 4) {
            this.P.getClass();
            if (i13 == 1) {
                dVar = mVarA.f14506g;
            } else if (i13 != 2) {
                dVar = i13 != 3 ? mVarA.f14505f : mVarA.f14504e;
            } else {
                dVar = mVarA.f14507h;
            }
            float fA = dVar.a(rectFH);
            if (z6) {
                this.Z[i13] = fA;
            }
            SpringAnimation[] springAnimationArr = this.Y;
            SpringAnimation springAnimation = springAnimationArr[i13];
            if (springAnimation != null) {
                springAnimation.a(fA);
                if (z6) {
                    springAnimationArr[i13].f();
                }
            }
            i13++;
        }
        if (z6) {
            invalidateSelf();
        }
    }

    public final boolean w() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.Q;
        PorterDuffColorFilter porterDuffColorFilter3 = this.R;
        g gVar = this.f14483e;
        ColorStateList colorStateList = gVar.f14468f;
        PorterDuff.Mode mode = gVar.f14469g;
        if (colorStateList == null || mode == null) {
            int color = this.L.getColor();
            int iD = d(color);
            this.S = iD;
            porterDuffColorFilter = iD != color ? new PorterDuffColorFilter(iD, PorterDuff.Mode.SRC_IN) : null;
        } else {
            int iD2 = d(colorStateList.getColorForState(getState(), 0));
            this.S = iD2;
            porterDuffColorFilter = new PorterDuffColorFilter(iD2, mode);
        }
        this.Q = porterDuffColorFilter;
        this.f14483e.getClass();
        this.R = null;
        this.f14483e.getClass();
        return (Objects.equals(porterDuffColorFilter2, this.Q) && Objects.equals(porterDuffColorFilter3, this.R)) ? false : true;
    }

    public final void x() {
        g gVar = this.f14483e;
        float f2 = gVar.f14474n + 0.0f;
        gVar.f14475o = (int) Math.ceil(0.75f * f2);
        this.f14483e.f14476p = (int) Math.ceil(f2 * 0.25f);
        w();
        super.invalidateSelf();
    }

    public i(Context context, AttributeSet attributeSet, int i7, int i10) {
        this(m.c(context, attributeSet, i7, i10).a());
    }

    public i(m mVar) {
        this(new g(mVar));
    }

    public i(g gVar) {
        g1 g1Var;
        this.f14482d = new u4.b(20, this);
        this.f14484i = new u[4];
        this.f14485v = new u[4];
        this.f14486w = new BitSet(8);
        this.E = new Matrix();
        this.F = new Path();
        this.G = new Path();
        this.H = new RectF();
        this.I = new RectF();
        this.J = new Region();
        this.K = new Region();
        Paint paint = new Paint(1);
        this.L = paint;
        Paint paint2 = new Paint(1);
        this.M = paint2;
        this.N = new jh.a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            g1Var = n.f14510a;
        } else {
            g1Var = new g1();
        }
        this.P = g1Var;
        this.T = new RectF();
        this.U = true;
        this.V = true;
        this.Y = new SpringAnimation[4];
        this.f14483e = gVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        w();
        u(getState());
        this.O = new u4.c(this);
    }
}

package ng;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import bh.k;
import bh.l;
import bh.p;
import com.discord.R;
import hh.d;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import kh.i;
import kh.m;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends Drawable implements k {
    public final int E;
    public float F;
    public float G;
    public float H;
    public WeakReference I;
    public WeakReference J;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final WeakReference f16805d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i f16806e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final l f16807i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Rect f16808v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final c f16809w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f16810x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public float f16811y;

    public a(Context context, b bVar) {
        d dVar;
        WeakReference weakReference = new WeakReference(context);
        this.f16805d = weakReference;
        p.c(context, p.f3295b, "Theme.MaterialComponents");
        this.f16808v = new Rect();
        l lVar = new l(this);
        this.f16807i = lVar;
        Paint.Align align = Paint.Align.CENTER;
        TextPaint textPaint = lVar.f3285a;
        textPaint.setTextAlign(align);
        c cVar = new c(context, bVar);
        this.f16809w = cVar;
        boolean zF = f();
        b bVar2 = cVar.f16821b;
        i iVar = new i(m.a(context, zF ? bVar2.f16819y.intValue() : bVar2.f16817w.intValue(), f() ? bVar2.E.intValue() : bVar2.f16818x.intValue()).a());
        this.f16806e = iVar;
        i();
        Context context2 = (Context) weakReference.get();
        if (context2 != null && lVar.f3291g != (dVar = new d(context2, bVar2.f16816v.intValue()))) {
            lVar.b(dVar, context2);
            j();
            l();
            invalidateSelf();
        }
        int i7 = bVar2.I;
        if (i7 != -2) {
            this.E = ((int) Math.pow(10.0d, ((double) i7) - 1.0d)) - 1;
        } else {
            this.E = bVar2.J;
        }
        lVar.f3289e = true;
        l();
        invalidateSelf();
        h();
        textPaint.setAlpha(getAlpha());
        invalidateSelf();
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(bVar2.f16814e.intValue());
        if (iVar.f14483e.f14466d != colorStateListValueOf) {
            iVar.q(colorStateListValueOf);
            invalidateSelf();
        }
        j();
        WeakReference weakReference2 = this.I;
        if (weakReference2 != null && weakReference2.get() != null) {
            View view = (View) this.I.get();
            WeakReference weakReference3 = this.J;
            k(view, weakReference3 != null ? (FrameLayout) weakReference3.get() : null);
        }
        l();
        setVisible(bVar2.Q.booleanValue(), false);
    }

    @Override // bh.k
    public final void a() {
        invalidateSelf();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(View view, View view2) {
        float y5;
        float x5;
        ViewParent parent;
        boolean z5;
        FrameLayout frameLayoutD = d();
        if (frameLayoutD == null) {
            float y8 = view.getY();
            x5 = view.getX();
            parent = view.getParent();
            y5 = y8;
        } else {
            y5 = 0.0f;
            x5 = 0.0f;
            parent = frameLayoutD;
        }
        while (true) {
            z5 = parent instanceof View;
            if (!z5 || parent == view2) {
                break;
            }
            ViewParent parent2 = parent.getParent();
            if (!(parent2 instanceof ViewGroup) || ((ViewGroup) parent2).getClipChildren()) {
                break;
            }
            View view3 = (View) parent;
            y5 += view3.getY();
            x5 += view3.getX();
            parent = parent.getParent();
        }
        if (z5) {
            float f2 = (this.f16811y - this.H) + y5;
            float f7 = (this.f16810x - this.G) + x5;
            View view4 = (View) parent;
            float height = ((this.f16811y + this.H) - view4.getHeight()) + y5;
            float width = ((this.f16810x + this.G) - view4.getWidth()) + x5;
            if (f2 < 0.0f) {
                this.f16811y = Math.abs(f2) + this.f16811y;
            }
            if (f7 < 0.0f) {
                this.f16810x = Math.abs(f7) + this.f16810x;
            }
            if (height > 0.0f) {
                this.f16811y -= Math.abs(height);
            }
            if (width > 0.0f) {
                this.f16810x -= Math.abs(width);
            }
        }
    }

    public final String c() {
        c cVar = this.f16809w;
        boolean zA = cVar.a();
        b bVar = cVar.f16821b;
        WeakReference weakReference = this.f16805d;
        if (!zA) {
            if (!g()) {
                return null;
            }
            if (this.E == -2 || e() <= this.E) {
                return NumberFormat.getInstance(bVar.K).format(e());
            }
            Context context = (Context) weakReference.get();
            return context == null ? "" : String.format(bVar.K, context.getString(R.string.mtrl_exceed_max_badge_number_suffix), Integer.valueOf(this.E), "+");
        }
        b bVar2 = cVar.f16821b;
        String str = bVar2.G;
        int i7 = bVar2.I;
        if (i7 == -2 || str == null || str.length() <= i7) {
            return str;
        }
        Context context2 = (Context) weakReference.get();
        if (context2 == null) {
            return "";
        }
        return String.format(context2.getString(R.string.m3_exceed_max_badge_text_suffix), str.substring(0, i7 - 1), "…");
    }

    public final FrameLayout d() {
        WeakReference weakReference = this.J;
        if (weakReference != null) {
            return (FrameLayout) weakReference.get();
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        String strC;
        if (getBounds().isEmpty() || getAlpha() == 0 || !isVisible()) {
            return;
        }
        this.f16806e.draw(canvas);
        if (!f() || (strC = c()) == null) {
            return;
        }
        Rect rect = new Rect();
        l lVar = this.f16807i;
        lVar.f3285a.getTextBounds(strC, 0, strC.length(), rect);
        float fExactCenterY = this.f16811y - rect.exactCenterY();
        canvas.drawText(strC, this.f16810x, rect.bottom <= 0 ? (int) fExactCenterY : Math.round(fExactCenterY), lVar.f3285a);
    }

    public final int e() {
        int i7 = this.f16809w.f16821b.H;
        if (i7 != -1) {
            return i7;
        }
        return 0;
    }

    public final boolean f() {
        return this.f16809w.a() || g();
    }

    public final boolean g() {
        c cVar = this.f16809w;
        return (cVar.a() || cVar.f16821b.H == -1) ? false : true;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f16809w.f16821b.F;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f16808v.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f16808v.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final void h() {
        this.f16807i.f3289e = true;
        i();
        l();
        invalidateSelf();
    }

    public final void i() {
        Context context = (Context) this.f16805d.get();
        if (context == null) {
            return;
        }
        boolean zF = f();
        c cVar = this.f16809w;
        this.f16806e.setShapeAppearanceModel(m.a(context, zF ? cVar.f16821b.f16819y.intValue() : cVar.f16821b.f16817w.intValue(), f() ? cVar.f16821b.E.intValue() : cVar.f16821b.f16818x.intValue()).a());
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return false;
    }

    public final void j() {
        this.f16807i.f3285a.setColor(this.f16809w.f16821b.f16815i.intValue());
        invalidateSelf();
    }

    public final void k(View view, FrameLayout frameLayout) {
        this.I = new WeakReference(view);
        this.J = new WeakReference(frameLayout);
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
        l();
        invalidateSelf();
    }

    /* JADX WARN: Code duplicated, block: B:49:0x011a A[PHI: r13
      0x011a: PHI (r13v2 int) = (r13v1 int), (r13v8 int) binds: [B:45:0x00e6, B:47:0x00f4] A[DONT_GENERATE, DONT_INLINE]] */
    public final void l() {
        float f2;
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        WeakReference weakReference = this.f16805d;
        Context context = (Context) weakReference.get();
        WeakReference weakReference2 = this.I;
        View view = weakReference2 != null ? (View) weakReference2.get() : null;
        if (context == null || view == null) {
            return;
        }
        Rect rect = new Rect();
        Rect rect2 = this.f16808v;
        rect.set(rect2);
        Rect rect3 = new Rect();
        view.getDrawingRect(rect3);
        WeakReference weakReference3 = this.J;
        ViewGroup viewGroup = weakReference3 != null ? (ViewGroup) weakReference3.get() : null;
        if (viewGroup != null) {
            viewGroup.offsetDescendantRectToMyCoords(view, rect3);
        }
        boolean zF = f();
        c cVar = this.f16809w;
        float f16 = zF ? cVar.f16823d : cVar.f16822c;
        this.F = f16;
        if (f16 != -1.0f) {
            this.G = f16;
            this.H = f16;
        } else {
            this.G = Math.round((f() ? cVar.f16826g : cVar.f16824e) / 2.0f);
            this.H = Math.round((f() ? cVar.f16827h : cVar.f16825f) / 2.0f);
        }
        if (f()) {
            String strC = c();
            float f17 = this.G;
            l lVar = this.f16807i;
            if (lVar.f3289e) {
                lVar.a(strC);
                f14 = lVar.f3287c;
            } else {
                f14 = lVar.f3287c;
            }
            this.G = Math.max(f17, (f14 / 2.0f) + cVar.f16821b.R.intValue());
            float f18 = this.H;
            if (lVar.f3289e) {
                lVar.a(strC);
                f15 = lVar.f3288d;
            } else {
                f15 = lVar.f3288d;
            }
            float fMax = Math.max(f18, (f15 / 2.0f) + cVar.f16821b.S.intValue());
            this.H = fMax;
            this.G = Math.max(this.G, fMax);
        }
        b bVar = cVar.f16821b;
        b bVar2 = cVar.f16821b;
        int i7 = cVar.k;
        int iIntValue = bVar.U.intValue();
        if (f()) {
            iIntValue = bVar.W.intValue();
            Context context2 = (Context) weakReference.get();
            if (context2 != null) {
                iIntValue = lg.a.c(iIntValue, iIntValue - bVar.Z.intValue(), lg.a.b(0.0f, 1.0f, 0.3f, 1.0f, context2.getResources().getConfiguration().fontScale - 1.0f));
            }
        }
        if (i7 == 0) {
            iIntValue -= Math.round(this.H);
        }
        int iIntValue2 = bVar.Y.intValue() + iIntValue;
        int iIntValue3 = bVar2.P.intValue();
        if (iIntValue3 == 8388691 || iIntValue3 == 8388693) {
            this.f16811y = rect3.bottom - iIntValue2;
        } else {
            this.f16811y = rect3.top + iIntValue2;
        }
        int iIntValue4 = f() ? bVar.V.intValue() : bVar2.T.intValue();
        if (i7 == 1) {
            iIntValue4 += f() ? cVar.j : cVar.f16828i;
        }
        int iIntValue5 = bVar.X.intValue() + iIntValue4;
        int iIntValue6 = bVar2.P.intValue();
        if (iIntValue6 == 8388659 || iIntValue6 == 8388691) {
            if (cVar.f16829l == 0) {
                if (view.getLayoutDirection() == 0) {
                    f2 = rect3.left + this.G;
                    f7 = (this.H * 2.0f) - iIntValue5;
                    f10 = f2 - f7;
                } else {
                    f10 = (rect3.right - this.G) + ((this.H * 2.0f) - iIntValue5);
                }
            } else if (view.getLayoutDirection() == 0) {
                f10 = (rect3.left - this.G) + iIntValue5;
            } else {
                f2 = rect3.right + this.G;
                f7 = iIntValue5;
                f10 = f2 - f7;
            }
            this.f16810x = f10;
        } else {
            if (cVar.f16829l == 0) {
                if (view.getLayoutDirection() == 0) {
                    f11 = rect3.right + this.G;
                    f12 = iIntValue5;
                    f13 = f11 - f12;
                } else {
                    f13 = (rect3.left - this.G) + iIntValue5;
                }
            } else if (view.getLayoutDirection() == 0) {
                f13 = (rect3.right - this.G) + ((this.H * 2.0f) - iIntValue5);
            } else {
                f11 = rect3.left + this.G;
                f12 = (this.H * 2.0f) - iIntValue5;
                f13 = f11 - f12;
            }
            this.f16810x = f13;
        }
        if (bVar.a0.booleanValue()) {
            ViewParent viewParentD = d();
            if (viewParentD == null) {
                viewParentD = view.getParent();
            }
            if ((viewParentD instanceof View) && (viewParentD.getParent() instanceof View)) {
                b(view, (View) viewParentD.getParent());
            }
        } else {
            b(view, null);
        }
        float f19 = this.f16810x;
        float f20 = this.f16811y;
        float f21 = this.G;
        float f22 = this.H;
        rect2.set((int) (f19 - f21), (int) (f20 - f22), (int) (f19 + f21), (int) (f20 + f22));
        float f23 = this.F;
        i iVar = this.f16806e;
        if (f23 != -1082130432) {
            kh.l lVarG = iVar.f14483e.f14463a.g();
            lVarG.b(f23);
            iVar.setShapeAppearanceModel(lVarG.a());
        }
        if (rect.equals(rect2)) {
            return;
        }
        iVar.setBounds(rect2);
    }

    @Override // android.graphics.drawable.Drawable, bh.k
    public final boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
        c cVar = this.f16809w;
        cVar.f16820a.F = i7;
        cVar.f16821b.F = i7;
        this.f16807i.f3285a.setAlpha(getAlpha());
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}

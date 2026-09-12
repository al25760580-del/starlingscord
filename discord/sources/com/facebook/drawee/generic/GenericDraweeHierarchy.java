package com.facebook.drawee.generic;

import android.content.res.Resources;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import com.facebook.drawee.drawable.ScalingUtils$ScaleType;
import com.facebook.drawee.drawable.d;
import com.facebook.drawee.drawable.e;
import com.facebook.drawee.drawable.g;
import com.facebook.drawee.drawable.h;
import com.facebook.drawee.drawable.j;
import com.facebook.drawee.drawable.m;
import com.facebook.drawee.drawable.o;
import com.facebook.drawee.interfaces.DraweeHierarchy;
import i9.a;
import i9.b;
import i9.c;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import n8.i;

/* JADX INFO: loaded from: classes3.dex */
public final class GenericDraweeHierarchy implements DraweeHierarchy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ColorDrawable f4697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Resources f4698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f4699c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f4700d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d f4701e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e f4702f;

    public GenericDraweeHierarchy(GenericDraweeHierarchyBuilder genericDraweeHierarchyBuilder) {
        int i7;
        ColorDrawable colorDrawable = new ColorDrawable(0);
        this.f4697a = colorDrawable;
        sa.a.w();
        this.f4698b = genericDraweeHierarchyBuilder.f4705a;
        this.f4699c = genericDraweeHierarchyBuilder.f4719q;
        e eVar = new e(colorDrawable);
        this.f4702f = eVar;
        List list = genericDraweeHierarchyBuilder.f4717o;
        int size = list != null ? list.size() : 1;
        int i10 = (size == 0 ? 1 : size) + (genericDraweeHierarchyBuilder.f4718p != null ? 1 : 0);
        Drawable[] drawableArr = new Drawable[i10 + 6];
        drawableArr[0] = b(genericDraweeHierarchyBuilder.f4716n, null);
        drawableArr[1] = b(genericDraweeHierarchyBuilder.f4708d, genericDraweeHierarchyBuilder.f4709e);
        ScalingUtils$ScaleType scalingUtils$ScaleType = genericDraweeHierarchyBuilder.f4714l;
        eVar.setColorFilter(genericDraweeHierarchyBuilder.f4715m);
        drawableArr[2] = c.e(eVar, scalingUtils$ScaleType);
        drawableArr[3] = b(genericDraweeHierarchyBuilder.j, genericDraweeHierarchyBuilder.k);
        drawableArr[4] = b(genericDraweeHierarchyBuilder.f4710f, genericDraweeHierarchyBuilder.f4711g);
        drawableArr[5] = b(genericDraweeHierarchyBuilder.f4712h, genericDraweeHierarchyBuilder.f4713i);
        if (i10 > 0) {
            List list2 = genericDraweeHierarchyBuilder.f4717o;
            if (list2 != null) {
                Iterator it = list2.iterator();
                i7 = 0;
                while (it.hasNext()) {
                    drawableArr[i7 + 6] = b((Drawable) it.next(), null);
                    i7++;
                }
            } else {
                i7 = 1;
            }
            StateListDrawable stateListDrawable = genericDraweeHierarchyBuilder.f4718p;
            if (stateListDrawable != null) {
                drawableArr[i7 + 6] = b(stateListDrawable, null);
            }
        }
        d dVar = new d(drawableArr);
        this.f4701e = dVar;
        dVar.I = genericDraweeHierarchyBuilder.f4706b;
        if (dVar.H == 1) {
            dVar.H = 0;
        }
        a aVar = new a(c.d(dVar, this.f4699c));
        aVar.f11400d = null;
        this.f4700d = aVar;
        aVar.mutate();
        i();
        sa.a.w();
    }

    @Override // com.facebook.drawee.interfaces.DraweeHierarchy
    public final a a() {
        return this.f4700d;
    }

    public final Drawable b(Drawable drawable, ScalingUtils$ScaleType scalingUtils$ScaleType) {
        return c.e(c.c(drawable, this.f4699c, this.f4698b), scalingUtils$ScaleType);
    }

    public final void c(int i7) {
        if (i7 >= 0) {
            d dVar = this.f4701e;
            dVar.H = 0;
            dVar.N[i7] = true;
            dVar.invalidateSelf();
        }
    }

    public final void d() {
        e(1);
        e(2);
        e(3);
        e(4);
        e(5);
    }

    public final void e(int i7) {
        if (i7 >= 0) {
            d dVar = this.f4701e;
            dVar.H = 0;
            dVar.N[i7] = false;
            dVar.invalidateSelf();
        }
    }

    public final ScalingUtils$ScaleType f() {
        if (g(2) instanceof m) {
            return h(2).f4683d;
        }
        return null;
    }

    public final com.facebook.drawee.drawable.c g(int i7) {
        d dVar = this.f4701e;
        com.facebook.drawee.drawable.c[] cVarArr = dVar.f4653v;
        if (!(i7 >= 0)) {
            throw new IllegalArgumentException();
        }
        if (!(i7 < cVarArr.length)) {
            throw new IllegalArgumentException();
        }
        if (cVarArr[i7] == null) {
            cVarArr[i7] = new com.facebook.drawee.drawable.a(dVar, i7);
        }
        com.facebook.drawee.drawable.c cVar = cVarArr[i7];
        cVar.getDrawable();
        return cVar.getDrawable() instanceof m ? (m) cVar.getDrawable() : cVar;
    }

    public final m h(int i7) {
        com.facebook.drawee.drawable.c cVarG = g(i7);
        if (cVarG instanceof m) {
            return (m) cVarG;
        }
        Drawable drawableE = c.e(cVarG.setDrawable(c.f11410a), o.f4695i);
        cVarG.setDrawable(drawableE);
        i.d(drawableE, "Parent has no child drawable!");
        return (m) drawableE;
    }

    public final void i() {
        d dVar = this.f4701e;
        if (dVar != null) {
            dVar.O++;
            dVar.H = 0;
            Arrays.fill(dVar.N, true);
            dVar.invalidateSelf();
            d();
            c(1);
            dVar.b();
            dVar.a();
        }
    }

    public final void j(ScalingUtils$ScaleType scaleType) {
        scaleType.getClass();
        m mVarH = h(2);
        Intrinsics.checkNotNullParameter(scaleType, "scaleType");
        if (i.f(mVarH.f4683d, scaleType)) {
            return;
        }
        mVarH.f4683d = scaleType;
        mVarH.h();
        mVarH.invalidateSelf();
    }

    public final void k(Drawable drawable, int i7) {
        if (drawable == null) {
            this.f4701e.d(null, i7);
        } else {
            g(i7).setDrawable(c.c(drawable, this.f4699c, this.f4698b));
        }
    }

    public final void l(int i7) {
        d dVar = this.f4701e;
        dVar.I = i7;
        if (dVar.H == 1) {
            dVar.H = 0;
        }
    }

    public final void m(Drawable drawable, float f2, boolean z5) {
        Drawable drawableC = c.c(drawable, this.f4699c, this.f4698b);
        drawableC.mutate();
        this.f4702f.setDrawable(drawableC);
        d dVar = this.f4701e;
        dVar.O++;
        d();
        c(2);
        o(f2);
        if (z5) {
            dVar.b();
        }
        dVar.a();
    }

    public final void n(Drawable drawable) {
        i.b("The given index does not correspond to an overlay image.", 6 < this.f4701e.f4652i.length);
        k(drawable, 6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void o(float f2) {
        Drawable drawableC = this.f4701e.c(3);
        if (drawableC == 0) {
            return;
        }
        if (f2 >= 0.999f) {
            if (drawableC instanceof Animatable) {
                ((Animatable) drawableC).stop();
            }
            e(3);
        } else {
            if (drawableC instanceof Animatable) {
                ((Animatable) drawableC).start();
            }
            c(3);
        }
        drawableC.setLevel(Math.round(f2 * 10000.0f));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void p(b bVar) {
        this.f4699c = bVar;
        ColorDrawable colorDrawable = c.f11410a;
        a aVar = this.f4700d;
        Drawable drawable = aVar.getDrawable();
        if (bVar == null || bVar.f11402a != 1) {
            if (drawable instanceof j) {
                aVar.setDrawable(((j) drawable).setCurrent(colorDrawable));
                colorDrawable.setCallback(null);
            }
        } else if (drawable instanceof j) {
            j jVar = (j) drawable;
            c.b(jVar, bVar);
            jVar.F = bVar.f11405d;
            jVar.invalidateSelf();
        } else {
            aVar.setDrawable(c.d(aVar.setDrawable(colorDrawable), bVar));
        }
        for (int i7 = 0; i7 < this.f4701e.f4652i.length; i7++) {
            com.facebook.drawee.drawable.c cVarG = g(i7);
            b bVar2 = this.f4699c;
            while (true) {
                Object drawable2 = cVarG.getDrawable();
                if (drawable2 == cVarG || !(drawable2 instanceof com.facebook.drawee.drawable.c)) {
                    break;
                } else {
                    cVarG = (com.facebook.drawee.drawable.c) drawable2;
                }
            }
            Drawable drawable3 = cVarG.getDrawable();
            if (bVar2 == null || bVar2.f11402a != 2) {
                if (drawable3 instanceof g) {
                    g gVar = (g) drawable3;
                    gVar.a(false);
                    gVar.b();
                    gVar.setBorder(0, 0.0f);
                    gVar.e(0.0f);
                    gVar.f();
                    gVar.c(false);
                    int i10 = h.a0;
                    gVar.d();
                }
            } else if (drawable3 instanceof g) {
                c.b((g) drawable3, bVar2);
            } else if (drawable3 != 0) {
                cVarG.setDrawable(c.f11410a);
                cVarG.setDrawable(c.a(drawable3, bVar2, this.f4698b));
            }
        }
    }
}

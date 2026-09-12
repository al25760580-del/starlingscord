package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import androidx.collection.SparseArrayCompat;
import com.discord.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class n2 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static n2 f1049g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakHashMap f1051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakHashMap f1052b = new WeakHashMap(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TypedValue f1053c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f1054d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public af.c f1055e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final PorterDuff.Mode f1048f = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final m2 f1050h = new m2(6);

    public static synchronized n2 b() {
        try {
            if (f1049g == null) {
                f1049g = new n2();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f1049g;
    }

    public static synchronized PorterDuffColorFilter e(int i7, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        m2 m2Var = f1050h;
        m2Var.getClass();
        int i10 = (31 + i7) * 31;
        porterDuffColorFilter = (PorterDuffColorFilter) m2Var.a(Integer.valueOf(mode.hashCode() + i10));
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter = new PorterDuffColorFilter(i7, mode);
        }
        return porterDuffColorFilter;
    }

    public final Drawable a(Context context, int i7) {
        Drawable drawableNewDrawable;
        WeakReference weakReference;
        if (this.f1053c == null) {
            this.f1053c = new TypedValue();
        }
        TypedValue typedValue = this.f1053c;
        context.getResources().getValue(i7, typedValue, true);
        long j = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        synchronized (this) {
            s.k kVar = (s.k) this.f1052b.get(context);
            drawableNewDrawable = null;
            if (kVar != null && (weakReference = (WeakReference) kVar.b(j)) != null) {
                Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
                if (constantState != null) {
                    drawableNewDrawable = constantState.newDrawable(context.getResources());
                } else {
                    int iB = t.a.b(kVar.f19637e, kVar.f19639v, j);
                    if (iB >= 0) {
                        Object[] objArr = kVar.f19638i;
                        Object obj = objArr[iB];
                        Object obj2 = s.l.f19640a;
                        if (obj != obj2) {
                            objArr[iB] = obj2;
                            kVar.f19636d = true;
                        }
                    }
                }
            }
        }
        if (drawableNewDrawable != null) {
            return drawableNewDrawable;
        }
        LayerDrawable layerDrawableB = null;
        if (this.f1055e != null) {
            if (i7 == R.drawable.abc_cab_background_top_material) {
                layerDrawableB = new LayerDrawable(new Drawable[]{c(context, R.drawable.abc_cab_background_internal_bg), c(context, 2131230813)});
            } else if (i7 == R.drawable.abc_ratingbar_material) {
                layerDrawableB = af.c.B(this, context, R.dimen.abc_star_big);
            } else if (i7 == R.drawable.abc_ratingbar_indicator_material) {
                layerDrawableB = af.c.B(this, context, R.dimen.abc_star_medium);
            } else if (i7 == R.drawable.abc_ratingbar_small_material) {
                layerDrawableB = af.c.B(this, context, R.dimen.abc_star_small);
            }
        }
        if (layerDrawableB == null) {
            return layerDrawableB;
        }
        layerDrawableB.setChangingConfigurations(typedValue.changingConfigurations);
        synchronized (this) {
            try {
                Drawable.ConstantState constantState2 = layerDrawableB.getConstantState();
                if (constantState2 != null) {
                    s.k kVar2 = (s.k) this.f1052b.get(context);
                    if (kVar2 == null) {
                        kVar2 = new s.k();
                        this.f1052b.put(context, kVar2);
                    }
                    kVar2.e(j, new WeakReference(constantState2));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return layerDrawableB;
    }

    public final synchronized Drawable c(Context context, int i7) {
        return d(context, i7, false);
    }

    public final synchronized Drawable d(Context context, int i7, boolean z5) {
        Drawable drawableA;
        try {
            if (!this.f1054d) {
                this.f1054d = true;
                Drawable drawableC = c(context, R.drawable.abc_vector_test);
                if (drawableC == null || (!(drawableC instanceof n3.p) && !"android.graphics.drawable.VectorDrawable".equals(drawableC.getClass().getName()))) {
                    this.f1054d = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            drawableA = a(context, i7);
            if (drawableA == null) {
                drawableA = context.getDrawable(i7);
            }
            if (drawableA != null) {
                drawableA = g(context, i7, z5, drawableA);
            }
            if (drawableA != null) {
                n1.a(drawableA);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return drawableA;
    }

    public final synchronized ColorStateList f(Context context, int i7) {
        ColorStateList colorStateList;
        SparseArrayCompat sparseArrayCompat;
        WeakHashMap weakHashMap = this.f1051a;
        ColorStateList colorStateListC = null;
        colorStateList = (weakHashMap == null || (sparseArrayCompat = (SparseArrayCompat) weakHashMap.get(context)) == null) ? null : (ColorStateList) sparseArrayCompat.c(i7);
        if (colorStateList == null) {
            af.c cVar = this.f1055e;
            if (cVar != null) {
                colorStateListC = cVar.C(context, i7);
            }
            if (colorStateListC != null) {
                if (this.f1051a == null) {
                    this.f1051a = new WeakHashMap();
                }
                SparseArrayCompat sparseArrayCompat2 = (SparseArrayCompat) this.f1051a.get(context);
                if (sparseArrayCompat2 == null) {
                    sparseArrayCompat2 = new SparseArrayCompat(0);
                    this.f1051a.put(context, sparseArrayCompat2);
                }
                sparseArrayCompat2.a(i7, colorStateListC);
            }
            colorStateList = colorStateListC;
        }
        return colorStateList;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:51:0x00fc  */
    public final Drawable g(Context context, int i7, boolean z5, Drawable drawable) {
        int i10;
        boolean z6;
        int iRound;
        Drawable drawableMutate;
        ColorStateList colorStateListF = f(context, i7);
        PorterDuff.Mode mode = null;
        if (colorStateListF != null) {
            Drawable drawableMutate2 = drawable.mutate();
            drawableMutate2.setTintList(colorStateListF);
            if (this.f1055e != null && i7 == R.drawable.abc_switch_thumb_material) {
                mode = PorterDuff.Mode.MULTIPLY;
            }
            if (mode != null) {
                drawableMutate2.setTintMode(mode);
            }
            return drawableMutate2;
        }
        if (this.f1055e != null) {
            if (i7 == R.drawable.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.background);
                int iC = k3.c(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode2 = w.f1146b;
                af.c.M(drawableFindDrawableByLayerId, iC, mode2);
                af.c.M(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), k3.c(context, R.attr.colorControlNormal), mode2);
                af.c.M(layerDrawable.findDrawableByLayerId(android.R.id.progress), k3.c(context, R.attr.colorControlActivated), mode2);
                return drawable;
            }
            if (i7 == R.drawable.abc_ratingbar_material || i7 == R.drawable.abc_ratingbar_indicator_material || i7 == R.drawable.abc_ratingbar_small_material) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(android.R.id.background);
                int iB = k3.b(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode3 = w.f1146b;
                af.c.M(drawableFindDrawableByLayerId2, iB, mode3);
                af.c.M(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), k3.c(context, R.attr.colorControlActivated), mode3);
                af.c.M(layerDrawable2.findDrawableByLayerId(android.R.id.progress), k3.c(context, R.attr.colorControlActivated), mode3);
                return drawable;
            }
        }
        af.c cVar = this.f1055e;
        boolean z7 = false;
        if (cVar != null) {
            PorterDuff.Mode mode4 = w.f1146b;
            if (af.c.k(i7, (int[]) cVar.f393d)) {
                i10 = R.attr.colorControlNormal;
            } else if (af.c.k(i7, (int[]) cVar.f395i)) {
                i10 = R.attr.colorControlActivated;
            } else {
                if (af.c.k(i7, (int[]) cVar.f396v)) {
                    mode4 = PorterDuff.Mode.MULTIPLY;
                } else {
                    if (i7 == 2131230833) {
                        iRound = Math.round(40.8f);
                        i10 = 16842800;
                        z6 = true;
                    } else {
                        if (i7 != R.drawable.abc_dialog_material_background) {
                            i10 = 0;
                            z6 = false;
                        }
                        iRound = -1;
                    }
                    if (z6) {
                        drawableMutate = drawable.mutate();
                        drawableMutate.setColorFilter(w.c(k3.c(context, i10), mode4));
                        if (iRound != -1) {
                            drawableMutate.setAlpha(iRound);
                        }
                        z7 = true;
                    }
                }
                i10 = 16842801;
            }
            z6 = true;
            iRound = -1;
            if (z6) {
                drawableMutate = drawable.mutate();
                drawableMutate.setColorFilter(w.c(k3.c(context, i10), mode4));
                if (iRound != -1) {
                    drawableMutate.setAlpha(iRound);
                }
                z7 = true;
            }
        }
        if (z7 || !z5) {
            return drawable;
        }
        return null;
    }
}

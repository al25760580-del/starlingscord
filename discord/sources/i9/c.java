package i9;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import com.facebook.drawee.drawable.ScalingUtils$ScaleType;
import com.facebook.drawee.drawable.e;
import com.facebook.drawee.drawable.g;
import com.facebook.drawee.drawable.h;
import com.facebook.drawee.drawable.i;
import com.facebook.drawee.drawable.j;
import com.facebook.drawee.drawable.l;
import com.facebook.drawee.drawable.m;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ColorDrawable f11410a = new ColorDrawable(0);

    public static Drawable a(Drawable drawable, b bVar, Resources resources) {
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            Paint paint = bitmapDrawable.getPaint();
            bVar.getClass();
            h hVar = new h(resources, bitmap, paint);
            b(hVar, bVar);
            return hVar;
        }
        if (drawable instanceof NinePatchDrawable) {
            NinePatchDrawable ninePatchDrawable = (NinePatchDrawable) drawable;
            Intrinsics.checkNotNullParameter(ninePatchDrawable, "ninePatchDrawable");
            l lVar = new l(ninePatchDrawable);
            b(lVar, bVar);
            return lVar;
        }
        if (!(drawable instanceof ColorDrawable)) {
            o8.a.x("WrappingUtils", "Don't know how to round that drawable: %s", drawable);
            return drawable;
        }
        i iVar = new i(((ColorDrawable) drawable).getColor());
        b(iVar, bVar);
        return iVar;
    }

    public static void b(g gVar, b bVar) {
        gVar.a(bVar.f11403b);
        gVar.g(bVar.f11404c);
        gVar.setBorder(bVar.f11407f, bVar.f11406e);
        gVar.e(bVar.f11408g);
        gVar.f();
        gVar.c(bVar.f11409h);
        gVar.d();
    }

    public static Drawable c(Drawable drawable, b bVar, Resources resources) {
        try {
            sa.a.w();
            if (drawable != null && bVar != null && bVar.f11402a == 2) {
                if (!(drawable instanceof e)) {
                    return a(drawable, bVar, resources);
                }
                com.facebook.drawee.drawable.c cVar = (e) drawable;
                while (true) {
                    Object drawable2 = cVar.getDrawable();
                    if (drawable2 == cVar || !(drawable2 instanceof com.facebook.drawee.drawable.c)) {
                        break;
                        break;
                    }
                    cVar = (com.facebook.drawee.drawable.c) drawable2;
                }
                cVar.setDrawable(a(cVar.setDrawable(f11410a), bVar, resources));
                return drawable;
            }
            return drawable;
        } finally {
            sa.a.w();
        }
    }

    public static Drawable d(Drawable drawable, b bVar) {
        try {
            sa.a.w();
            if (drawable != null && bVar != null && bVar.f11402a == 1) {
                j jVar = new j(drawable);
                b(jVar, bVar);
                jVar.F = bVar.f11405d;
                jVar.invalidateSelf();
                return jVar;
            }
            return drawable;
        } finally {
            sa.a.w();
        }
    }

    public static Drawable e(Drawable drawable, ScalingUtils$ScaleType scalingUtils$ScaleType) {
        sa.a.w();
        if (drawable == null || scalingUtils$ScaleType == null) {
            sa.a.w();
            return drawable;
        }
        m mVar = new m(drawable, scalingUtils$ScaleType);
        sa.a.w();
        return mVar;
    }
}

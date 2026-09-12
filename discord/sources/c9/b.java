package c9;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.facebook.cache.common.CacheKey;
import com.facebook.common.internal.Supplier;
import com.facebook.common.references.CloseableReference;
import com.facebook.drawee.drawable.d;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.drawee.interfaces.DraweeController;
import com.facebook.drawee.interfaces.DraweeHierarchy;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.react.uimanager.ViewProps;
import e4.m;
import ga.i;
import l8.e;
import n8.f;
import sh.t1;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends f9.c {
    public ImageRequest A;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final m f3538u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final i f3539v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public CacheKey f3540w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Supplier f3541x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f3542y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ImageRequest f3543z;

    public b(Resources resources, e9.b bVar, t1 t1Var, k8.a aVar, e eVar, i iVar) {
        super(bVar, eVar);
        this.f3538u = new m(resources, t1Var, aVar, 11);
        this.f3539v = iVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static com.facebook.drawee.drawable.m p(Drawable drawable) {
        if (drawable == 0) {
            return null;
        }
        if (drawable instanceof com.facebook.drawee.drawable.m) {
            return (com.facebook.drawee.drawable.m) drawable;
        }
        if (drawable instanceof com.facebook.drawee.drawable.c) {
            return p(((com.facebook.drawee.drawable.c) drawable).getDrawable());
        }
        if (!(drawable instanceof d)) {
            return null;
        }
        d dVar = (d) drawable;
        int length = dVar.f4652i.length;
        for (int i7 = 0; i7 < length; i7++) {
            com.facebook.drawee.drawable.m mVarP = p(dVar.c(i7));
            if (mVarP != null) {
                return mVarP;
            }
        }
        return null;
    }

    @Override // f9.c
    public final Drawable b(Object obj) {
        CloseableReference closeableReference = (CloseableReference) obj;
        try {
            sa.a.w();
            n8.i.e(CloseableReference.z(closeableReference));
            na.c cVar = (na.c) closeableReference.q();
            q(cVar);
            Drawable drawableB = this.f3538u.b(cVar);
            if (drawableB != null) {
                sa.a.w();
                return drawableB;
            }
            throw new UnsupportedOperationException("Unrecognized image class: " + cVar);
        } catch (Throwable th2) {
            sa.a.w();
            throw th2;
        }
    }

    @Override // f9.c
    public final na.i d(Object obj) {
        CloseableReference closeableReference = (CloseableReference) obj;
        n8.i.e(CloseableReference.z(closeableReference));
        na.a aVar = (na.a) ((na.c) closeableReference.q());
        if (aVar.f16524e == null) {
            int width = aVar.getWidth();
            int height = aVar.getHeight();
            aVar.j();
            aVar.G();
            aVar.f16524e = new na.i(width, height, aVar.f16523d);
        }
        return aVar.f16524e;
    }

    @Override // com.facebook.drawee.interfaces.DraweeController
    public final boolean isSameImageRequest(DraweeController draweeController) {
        CacheKey cacheKey = this.f3540w;
        if (cacheKey == null || !(draweeController instanceof b)) {
            return false;
        }
        return n8.i.f(cacheKey, ((b) draweeController).f3540w);
    }

    public final void q(na.c cVar) {
        com.facebook.drawee.drawable.m mVarP;
        if (this.f3542y) {
            if (this.f9033g == null) {
                g9.a aVar = new g9.a();
                a(new h9.a(aVar));
                this.f9033g = aVar;
                GenericDraweeHierarchy genericDraweeHierarchy = this.f9032f;
                if (genericDraweeHierarchy != null) {
                    i9.a aVar2 = genericDraweeHierarchy.f4700d;
                    aVar2.f11400d = aVar;
                    aVar2.invalidateSelf();
                }
            }
            g9.a aVar3 = this.f9033g;
            if (aVar3 != null) {
                String str = this.f9034h;
                if (str == null) {
                    str = ViewProps.NONE;
                }
                aVar3.f9499a = str;
                aVar3.invalidateSelf();
                GenericDraweeHierarchy genericDraweeHierarchy2 = this.f9032f;
                aVar3.f9503e = (genericDraweeHierarchy2 == null || (mVarP = p(genericDraweeHierarchy2.f4700d)) == null) ? null : mVarP.f4683d;
                Object obj = this.f9035i;
                String string = obj != null ? obj.toString() : null;
                if (string != null) {
                    aVar3.f9504f.put("cc", string);
                }
                if (cVar == null) {
                    aVar3.b();
                    return;
                }
                int width = cVar.getWidth();
                int height = cVar.getHeight();
                aVar3.f9500b = width;
                aVar3.f9501c = height;
                aVar3.invalidateSelf();
                aVar3.f9502d = cVar.j();
            }
        }
    }

    @Override // com.facebook.drawee.interfaces.DraweeController
    public final void setHierarchy(DraweeHierarchy draweeHierarchy) {
        if (o8.a.f17171a.isLoggable(2)) {
            o8.a.p(f9.c.f9026t, "controller %x %s: setHierarchy: %s", Integer.valueOf(System.identityHashCode(this)), this.f9034h, draweeHierarchy);
        }
        this.f9027a.a(draweeHierarchy != null ? e9.c.f8114d : e9.c.f8115e);
        if (this.k) {
            this.f9028b.b(this);
            m();
        }
        GenericDraweeHierarchy genericDraweeHierarchy = this.f9032f;
        if (genericDraweeHierarchy != null) {
            i9.a aVar = genericDraweeHierarchy.f4700d;
            aVar.f11400d = null;
            aVar.invalidateSelf();
            this.f9032f = null;
        }
        if (draweeHierarchy != null) {
            if (!(draweeHierarchy instanceof GenericDraweeHierarchy)) {
                throw new IllegalArgumentException();
            }
            GenericDraweeHierarchy genericDraweeHierarchy2 = (GenericDraweeHierarchy) draweeHierarchy;
            this.f9032f = genericDraweeHierarchy2;
            g9.a aVar2 = this.f9033g;
            i9.a aVar3 = genericDraweeHierarchy2.f4700d;
            aVar3.f11400d = aVar2;
            aVar3.invalidateSelf();
        }
        q(null);
    }

    @Override // f9.c
    public final String toString() {
        f fVarJ = n8.i.j(this);
        fVarJ.H(super.toString(), "super");
        fVarJ.H(this.f3541x, "dataSourceSupplier");
        return fVarJ.toString();
    }
}

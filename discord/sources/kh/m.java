package kh;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* JADX INFO: loaded from: classes3.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.facebook.imagepipeline.nativecode.b f14500a = new k();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.facebook.imagepipeline.nativecode.b f14501b = new k();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.facebook.imagepipeline.nativecode.b f14502c = new k();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.facebook.imagepipeline.nativecode.b f14503d = new k();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public d f14504e = new a(0.0f);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public d f14505f = new a(0.0f);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public d f14506g = new a(0.0f);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public d f14507h = new a(0.0f);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public f f14508i;
    public f j;
    public f k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public f f14509l;

    public m() {
        int i7 = 0;
        this.f14508i = new f(i7);
        this.j = new f(i7);
        this.k = new f(i7);
        this.f14509l = new f(i7);
    }

    public static l a(Context context, int i7, int i10) {
        return b(context, i7, i10, new a(0));
    }

    public static l b(Context context, int i7, int i10, a aVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i7);
        if (i10 != 0) {
            contextThemeWrapper.getTheme().applyStyle(i10, true);
        }
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(kg.a.H);
        try {
            int i11 = typedArrayObtainStyledAttributes.getInt(0, 0);
            int i12 = typedArrayObtainStyledAttributes.getInt(3, i11);
            int i13 = typedArrayObtainStyledAttributes.getInt(4, i11);
            int i14 = typedArrayObtainStyledAttributes.getInt(2, i11);
            int i15 = typedArrayObtainStyledAttributes.getInt(1, i11);
            d dVarD = d(typedArrayObtainStyledAttributes, 5, aVar);
            d dVarD2 = d(typedArrayObtainStyledAttributes, 8, dVarD);
            d dVarD3 = d(typedArrayObtainStyledAttributes, 9, dVarD);
            d dVarD4 = d(typedArrayObtainStyledAttributes, 7, dVarD);
            d dVarD5 = d(typedArrayObtainStyledAttributes, 6, dVarD);
            l lVar = new l();
            lVar.f14490a = com.facebook.imagepipeline.nativecode.c.o(i12);
            lVar.f14494e = dVarD2;
            lVar.f14491b = com.facebook.imagepipeline.nativecode.c.o(i13);
            lVar.f14495f = dVarD3;
            lVar.f14492c = com.facebook.imagepipeline.nativecode.c.o(i14);
            lVar.f14496g = dVarD4;
            lVar.f14493d = com.facebook.imagepipeline.nativecode.c.o(i15);
            lVar.f14497h = dVarD5;
            return lVar;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static l c(Context context, AttributeSet attributeSet, int i7, int i10) {
        a aVar = new a(0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, kg.a.f14452y, i7, i10);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        return b(context, resourceId, resourceId2, aVar);
    }

    public static d d(TypedArray typedArray, int i7, d dVar) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i7);
        if (typedValuePeekValue != null) {
            int i10 = typedValuePeekValue.type;
            if (i10 == 5) {
                return new a(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i10 == 6) {
                return new j(typedValuePeekValue.getFraction(1.0f, 1.0f));
            }
        }
        return dVar;
    }

    public final boolean e() {
        return (this.f14501b instanceof k) && (this.f14500a instanceof k) && (this.f14502c instanceof k) && (this.f14503d instanceof k);
    }

    public final boolean f(RectF rectF) {
        boolean z5 = this.f14509l.getClass().equals(f.class) && this.j.getClass().equals(f.class) && this.f14508i.getClass().equals(f.class) && this.k.getClass().equals(f.class);
        float fA = this.f14504e.a(rectF);
        return z5 && ((this.f14505f.a(rectF) > fA ? 1 : (this.f14505f.a(rectF) == fA ? 0 : -1)) == 0 && (this.f14507h.a(rectF) > fA ? 1 : (this.f14507h.a(rectF) == fA ? 0 : -1)) == 0 && (this.f14506g.a(rectF) > fA ? 1 : (this.f14506g.a(rectF) == fA ? 0 : -1)) == 0) && e();
    }

    public final l g() {
        l lVar = new l();
        lVar.f14490a = this.f14500a;
        lVar.f14491b = this.f14501b;
        lVar.f14492c = this.f14502c;
        lVar.f14493d = this.f14503d;
        lVar.f14494e = this.f14504e;
        lVar.f14495f = this.f14505f;
        lVar.f14496g = this.f14506g;
        lVar.f14497h = this.f14507h;
        lVar.f14498i = this.f14508i;
        lVar.j = this.j;
        lVar.k = this.k;
        lVar.f14499l = this.f14509l;
        return lVar;
    }

    public final String toString() {
        return "[" + this.f14504e + ", " + this.f14505f + ", " + this.f14506g + ", " + this.f14507h + "]";
    }
}

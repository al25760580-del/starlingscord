package n3;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class j extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Matrix f16317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f16318b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f16319c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f16320d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f16321e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f16322f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f16323g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f16324h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f16325i;
    public final Matrix j;
    public String k;

    public j() {
        this.f16317a = new Matrix();
        this.f16318b = new ArrayList();
        this.f16319c = 0.0f;
        this.f16320d = 0.0f;
        this.f16321e = 0.0f;
        this.f16322f = 1.0f;
        this.f16323g = 1.0f;
        this.f16324h = 0.0f;
        this.f16325i = 0.0f;
        this.j = new Matrix();
        this.k = null;
    }

    @Override // n3.k
    public final boolean a() {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f16318b;
            if (i7 >= arrayList.size()) {
                return false;
            }
            if (((k) arrayList.get(i7)).a()) {
                return true;
            }
            i7++;
        }
    }

    @Override // n3.k
    public final boolean b(int[] iArr) {
        int i7 = 0;
        boolean zB = false;
        while (true) {
            ArrayList arrayList = this.f16318b;
            if (i7 >= arrayList.size()) {
                return zB;
            }
            zB |= ((k) arrayList.get(i7)).b(iArr);
            i7++;
        }
    }

    public final void c() {
        Matrix matrix = this.j;
        matrix.reset();
        matrix.postTranslate(-this.f16320d, -this.f16321e);
        matrix.postScale(this.f16322f, this.f16323g);
        matrix.postRotate(this.f16319c, 0.0f, 0.0f);
        matrix.postTranslate(this.f16324h + this.f16320d, this.f16325i + this.f16321e);
    }

    public String getGroupName() {
        return this.k;
    }

    public Matrix getLocalMatrix() {
        return this.j;
    }

    public float getPivotX() {
        return this.f16320d;
    }

    public float getPivotY() {
        return this.f16321e;
    }

    public float getRotation() {
        return this.f16319c;
    }

    public float getScaleX() {
        return this.f16322f;
    }

    public float getScaleY() {
        return this.f16323g;
    }

    public float getTranslateX() {
        return this.f16324h;
    }

    public float getTranslateY() {
        return this.f16325i;
    }

    public void setPivotX(float f2) {
        if (f2 != this.f16320d) {
            this.f16320d = f2;
            c();
        }
    }

    public void setPivotY(float f2) {
        if (f2 != this.f16321e) {
            this.f16321e = f2;
            c();
        }
    }

    public void setRotation(float f2) {
        if (f2 != this.f16319c) {
            this.f16319c = f2;
            c();
        }
    }

    public void setScaleX(float f2) {
        if (f2 != this.f16322f) {
            this.f16322f = f2;
            c();
        }
    }

    public void setScaleY(float f2) {
        if (f2 != this.f16323g) {
            this.f16323g = f2;
            c();
        }
    }

    public void setTranslateX(float f2) {
        if (f2 != this.f16324h) {
            this.f16324h = f2;
            c();
        }
    }

    public void setTranslateY(float f2) {
        if (f2 != this.f16325i) {
            this.f16325i = f2;
            c();
        }
    }

    public j(j jVar, s.e eVar) {
        l hVar;
        this.f16317a = new Matrix();
        this.f16318b = new ArrayList();
        this.f16319c = 0.0f;
        this.f16320d = 0.0f;
        this.f16321e = 0.0f;
        this.f16322f = 1.0f;
        this.f16323g = 1.0f;
        this.f16324h = 0.0f;
        this.f16325i = 0.0f;
        Matrix matrix = new Matrix();
        this.j = matrix;
        this.k = null;
        this.f16319c = jVar.f16319c;
        this.f16320d = jVar.f16320d;
        this.f16321e = jVar.f16321e;
        this.f16322f = jVar.f16322f;
        this.f16323g = jVar.f16323g;
        this.f16324h = jVar.f16324h;
        this.f16325i = jVar.f16325i;
        String str = jVar.k;
        this.k = str;
        if (str != null) {
            eVar.put(str, this);
        }
        matrix.set(jVar.j);
        ArrayList arrayList = jVar.f16318b;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            Object obj = arrayList.get(i7);
            if (obj instanceof j) {
                this.f16318b.add(new j((j) obj, eVar));
            } else {
                if (obj instanceof i) {
                    i iVar = (i) obj;
                    i iVar2 = new i(iVar);
                    iVar2.f16309e = 0.0f;
                    iVar2.f16311g = 1.0f;
                    iVar2.f16312h = 1.0f;
                    iVar2.f16313i = 0.0f;
                    iVar2.j = 1.0f;
                    iVar2.k = 0.0f;
                    iVar2.f16314l = Paint.Cap.BUTT;
                    iVar2.f16315m = Paint.Join.MITER;
                    iVar2.f16316n = 4.0f;
                    iVar2.f16308d = iVar.f16308d;
                    iVar2.f16309e = iVar.f16309e;
                    iVar2.f16311g = iVar.f16311g;
                    iVar2.f16310f = iVar.f16310f;
                    iVar2.f16328c = iVar.f16328c;
                    iVar2.f16312h = iVar.f16312h;
                    iVar2.f16313i = iVar.f16313i;
                    iVar2.j = iVar.j;
                    iVar2.k = iVar.k;
                    iVar2.f16314l = iVar.f16314l;
                    iVar2.f16315m = iVar.f16315m;
                    iVar2.f16316n = iVar.f16316n;
                    hVar = iVar2;
                } else if (obj instanceof h) {
                    hVar = new h((h) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f16318b.add(hVar);
                Object obj2 = hVar.f16327b;
                if (obj2 != null) {
                    eVar.put(obj2, hVar);
                }
            }
        }
    }
}

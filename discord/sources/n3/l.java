package n3;

/* JADX INFO: loaded from: classes.dex */
public abstract class l extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b1.e[] f16326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f16327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f16328c;

    public l() {
        this.f16326a = null;
        this.f16328c = 0;
    }

    public b1.e[] getPathData() {
        return this.f16326a;
    }

    public String getPathName() {
        return this.f16327b;
    }

    public void setPathData(b1.e[] eVarArr) {
        b1.e[] eVarArr2 = this.f16326a;
        boolean z5 = false;
        if (eVarArr2 != null && eVarArr != null && eVarArr2.length == eVarArr.length) {
            int i7 = 0;
            while (true) {
                if (i7 >= eVarArr2.length) {
                    z5 = true;
                    break;
                }
                b1.e eVar = eVarArr2[i7];
                char c8 = eVar.f3026a;
                b1.e eVar2 = eVarArr[i7];
                if (c8 != eVar2.f3026a || eVar.f3027b.length != eVar2.f3027b.length) {
                    break;
                } else {
                    i7++;
                }
            }
        }
        if (!z5) {
            this.f16326a = e4.f.w(eVarArr);
            return;
        }
        b1.e[] eVarArr3 = this.f16326a;
        for (int i10 = 0; i10 < eVarArr.length; i10++) {
            eVarArr3[i10].f3026a = eVarArr[i10].f3026a;
            int i11 = 0;
            while (true) {
                float[] fArr = eVarArr[i10].f3027b;
                if (i11 < fArr.length) {
                    eVarArr3[i10].f3027b[i11] = fArr[i11];
                    i11++;
                }
            }
        }
    }

    public l(l lVar) {
        this.f16326a = null;
        this.f16328c = 0;
        this.f16327b = lVar.f16327b;
        this.f16326a = e4.f.w(lVar.f16326a);
    }
}

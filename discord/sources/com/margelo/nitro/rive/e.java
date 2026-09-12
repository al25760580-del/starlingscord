package com.margelo.nitro.rive;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e f6930b = new e(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f6931c = new e(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e f6932d = new e(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e f6933e = new e(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6934a;

    public /* synthetic */ e(int i7) {
        this.f6934a = i7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.margelo.nitro.rive.g
    public final Object a(p pVar, xn.h hVar) throws i {
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        switch (this.f6934a) {
            case 0:
                l lVar = pVar instanceof l ? (l) pVar : null;
                if (lVar != null) {
                    return lVar.f6950a;
                }
                throw i.f6942d;
            case 1:
                m mVar = pVar instanceof m ? (m) pVar : null;
                if (mVar == null) {
                    throw i.f6942d;
                }
                String str = mVar.f6956a;
                hr.e eVar = ar.k0.f2938a;
                return ar.b0.A(hr.d.f11103i, new t(str, objArr == true ? 1 : 0, 0), hVar);
            case 2:
                n nVar = pVar instanceof n ? (n) pVar : null;
                if (nVar == null) {
                    throw i.f6942d;
                }
                String str2 = nVar.f6960a;
                hr.e eVar2 = ar.k0.f2938a;
                return ar.b0.A(hr.d.f11103i, new t(str2, objArr2 == true ? 1 : 0, 1), hVar);
            default:
                o oVar = pVar instanceof o ? (o) pVar : null;
                if (oVar == null) {
                    throw i.f6942d;
                }
                String str3 = oVar.f6964a;
                hr.e eVar3 = ar.k0.f2938a;
                return ar.b0.A(hr.d.f11103i, new t(str3, objArr3 == true ? 1 : 0, 3), hVar);
        }
    }
}

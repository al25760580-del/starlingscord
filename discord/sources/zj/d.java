package zj;

import e4.r;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends r {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f24030v;

    public d(b bVar, boolean z5) {
        super(bVar);
        this.f24030v = z5;
    }

    public final ae.b c0() {
        ae.b[] bVarArr = (ae.b[]) this.f8035i;
        a aVar = new a();
        a aVar2 = new a();
        a aVar3 = new a();
        a aVar4 = new a();
        for (ae.b bVar : bVarArr) {
            if (bVar != null) {
                bVar.d();
                int i7 = bVar.f364e % 30;
                int i10 = bVar.f365f;
                if (!this.f24030v) {
                    i10 += 2;
                }
                int i11 = i10 % 3;
                if (i11 == 0) {
                    aVar2.b((i7 * 3) + 1);
                } else if (i11 == 1) {
                    aVar4.b(i7 / 3);
                    aVar3.b(i7 % 3);
                } else if (i11 == 2) {
                    aVar.b(i7 + 1);
                }
            }
        }
        if (aVar.a().length == 0 || aVar2.a().length == 0 || aVar3.a().length == 0 || aVar4.a().length == 0 || aVar.a()[0] <= 0 || aVar2.a()[0] + aVar3.a()[0] < 3 || aVar2.a()[0] + aVar3.a()[0] > 90) {
            return null;
        }
        ae.b bVar2 = new ae.b(aVar.a()[0], aVar2.a()[0], aVar3.a()[0], aVar4.a()[0], 2, (byte) 0);
        d0(bVarArr, bVar2);
        return bVar2;
    }

    public final void d0(ae.b[] bVarArr, ae.b bVar) {
        for (int i7 = 0; i7 < bVarArr.length; i7++) {
            ae.b bVar2 = bVarArr[i7];
            if (bVar2 != null) {
                int i10 = bVar2.f364e % 30;
                int i11 = bVar2.f365f;
                if (i11 > bVar.f365f) {
                    bVarArr[i7] = null;
                } else {
                    if (!this.f24030v) {
                        i11 += 2;
                    }
                    int i12 = i11 % 3;
                    if (i12 != 0) {
                        if (i12 != 1) {
                            if (i12 == 2 && i10 + 1 != bVar.f361b) {
                                bVarArr[i7] = null;
                            }
                        } else if (i10 / 3 != bVar.f362c || i10 % 3 != bVar.f364e) {
                            bVarArr[i7] = null;
                        }
                    } else if ((i10 * 3) + 1 != bVar.f363d) {
                        bVarArr[i7] = null;
                    }
                }
            }
        }
    }

    @Override // e4.r
    public final String toString() {
        return "IsLeft: " + this.f24030v + '\n' + super.toString();
    }
}

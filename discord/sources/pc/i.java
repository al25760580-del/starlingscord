package pc;

import ei.c0;
import ei.e0;
import ei.r0;
import java.util.ArrayList;
import java.util.Collections;
import zc.b0;

/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f17899b = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e4.l f17900c = new e4.l(new mc.q(23));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e4.l f17901d = new e4.l(new mc.q(24));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r0 f17902a;

    public final void a(int i7, ArrayList arrayList) {
        switch (i7) {
            case 0:
                arrayList.add(new zc.a());
                break;
            case 1:
                arrayList.add(new zc.c());
                break;
            case 2:
                arrayList.add(new zc.d(0));
                break;
            case 3:
                arrayList.add(new qc.a());
                break;
            case 4:
                k kVarN = f17900c.n(0);
                if (kVarN == null) {
                    arrayList.add(new sc.c());
                } else {
                    arrayList.add(kVarN);
                }
                break;
            case 5:
                arrayList.add(new tc.b());
                break;
            case 6:
                arrayList.add(new vc.d(0));
                break;
            case 7:
                arrayList.add(new wc.d(0));
                break;
            case 8:
                arrayList.add(new xc.i(0, null, null, Collections.EMPTY_LIST, null));
                arrayList.add(new xc.l(0));
                break;
            case 9:
                arrayList.add(new yc.d());
                break;
            case 10:
                arrayList.add(new zc.y());
                break;
            case 11:
                if (this.f17902a == null) {
                    c0 c0Var = e0.f8303e;
                    this.f17902a = r0.f8352w;
                }
                arrayList.add(new b0(1, new je.b0(0L), new i1.g(0, this.f17902a)));
                break;
            case 12:
                ad.d dVar = new ad.d();
                dVar.f337c = 0;
                dVar.f338d = -1L;
                dVar.f340f = -1;
                dVar.f341g = -1L;
                arrayList.add(dVar);
                break;
            case 14:
                arrayList.add(new uc.a());
                break;
            case 15:
                k kVarN2 = f17901d.n(new Object[0]);
                if (kVarN2 != null) {
                    arrayList.add(kVarN2);
                }
                break;
            case 16:
                arrayList.add(new rc.b());
                break;
        }
    }
}

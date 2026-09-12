package i1;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.android.exoplayer2.Format;
import gc.g0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import je.w;
import zc.a0;
import zc.e0;
import zc.m;
import zc.p;
import zc.r;
import zc.s;
import zc.t;
import zc.v;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f11373b;

    public g(int i7, List list) {
        this.f11372a = i7;
        this.f11373b = list;
    }

    public e0 a(int i7, n8.f fVar) {
        String str = (String) fVar.f16510e;
        if (i7 != 2) {
            if (i7 == 3 || i7 == 4) {
                return new v(new t(str));
            }
            if (i7 == 21) {
                return new v(new zc.g());
            }
            if (i7 == 27) {
                if (c(4)) {
                    return null;
                }
                return new v(new p(new e4.e(b(fVar)), c(1), c(8)));
            }
            if (i7 == 36) {
                return new v(new r(new e4.e(b(fVar))));
            }
            if (i7 == 89) {
                return new v(new zc.g((List) fVar.f16512v));
            }
            if (i7 != 138) {
                if (i7 == 172) {
                    return new v(new zc.b(str, 1));
                }
                if (i7 == 257) {
                    return new a0(new n8.f("application/vnd.dvb.ait", 26));
                }
                if (i7 == 134) {
                    if (c(16)) {
                        return null;
                    }
                    return new a0(new n8.f("application/x-scte35", 26));
                }
                if (i7 != 135) {
                    switch (i7) {
                        case 15:
                            if (c(2)) {
                                return null;
                            }
                            return new v(new zc.e(false, str));
                        case 16:
                            return new v(new m(new e4.r(b(fVar))));
                        case 17:
                            if (c(2)) {
                                return null;
                            }
                            return new v(new s(str));
                        default:
                            switch (i7) {
                                case IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT /* 128 */:
                                    break;
                                case 129:
                                    break;
                                case 130:
                                    if (!c(64)) {
                                        return null;
                                    }
                                    break;
                                default:
                                    return null;
                            }
                            break;
                    }
                }
                return new v(new zc.b(str, 0));
            }
            return new v(new zc.f(str));
        }
        return new v(new zc.j(new e4.r(b(fVar))));
    }

    public List b(n8.f fVar) {
        String str;
        int i7;
        boolean zC = c(32);
        List list = this.f11373b;
        if (zC) {
            return list;
        }
        w wVar = new w((byte[]) fVar.f16511i);
        while (wVar.a() > 0) {
            int iU = wVar.u();
            int iU2 = wVar.f13861b + wVar.u();
            if (iU == 134) {
                ArrayList arrayList = new ArrayList();
                int iU3 = wVar.u() & 31;
                for (int i10 = 0; i10 < iU3; i10++) {
                    String strS = wVar.s(3, di.d.f7631c);
                    int iU4 = wVar.u();
                    boolean z5 = (iU4 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0;
                    if (z5) {
                        i7 = iU4 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i7 = 1;
                    }
                    byte bU = (byte) wVar.u();
                    wVar.G(1);
                    List listSingletonList = z5 ? Collections.singletonList((bU & 64) != 0 ? new byte[]{1} : new byte[]{0}) : null;
                    g0 g0Var = new g0();
                    g0Var.k = str;
                    g0Var.f9637c = strS;
                    g0Var.C = i7;
                    g0Var.f9645m = listSingletonList;
                    arrayList.add(new Format(g0Var));
                }
                list = arrayList;
            }
            wVar.F(iU2);
        }
        return list;
    }

    public boolean c(int i7) {
        return (i7 & this.f11372a) != 0;
    }

    public g() {
        this.f11372a = 1;
        this.f11373b = Collections.singletonList(null);
    }

    public g(ArrayList arrayList) {
        this.f11372a = 0;
        this.f11373b = arrayList;
    }
}

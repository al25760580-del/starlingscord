package so;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashMap;
import kotlin.jvm.functions.Function0;
import lq.d0;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements Function0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f20336d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i f20337e;

    public /* synthetic */ f(i iVar, int i7) {
        this.f20336d = i7;
        this.f20337e = iVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i7 = this.f20336d;
        i iVar = this.f20337e;
        switch (i7) {
            case 0:
                return Arrays.asList(iVar.l().O(p.f20402l), iVar.l().O(p.f20404n), iVar.l().O(p.f20405o), iVar.l().O(p.f20403m));
            default:
                EnumMap enumMap = new EnumMap(k.class);
                HashMap map = new HashMap();
                HashMap map2 = new HashMap();
                for (k kVar : k.values()) {
                    String strB = kVar.f20352d.b();
                    if (strB == null) {
                        i.a(47);
                        throw null;
                    }
                    d0 d0VarJ = iVar.k(strB).j();
                    if (d0VarJ == null) {
                        i.a(48);
                        throw null;
                    }
                    String strB2 = kVar.f20353e.b();
                    if (strB2 == null) {
                        i.a(47);
                        throw null;
                    }
                    d0 d0VarJ2 = iVar.k(strB2).j();
                    if (d0VarJ2 == null) {
                        i.a(48);
                        throw null;
                    }
                    enumMap.put(kVar, d0VarJ2);
                    map.put(d0VarJ, d0VarJ2);
                    map2.put(d0VarJ2, d0VarJ);
                }
                return new h(enumMap, map, map2);
        }
    }
}

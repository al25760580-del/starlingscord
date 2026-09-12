package yr;

import java.util.EnumMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class o0 extends j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m0 f23555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j0 f23556b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e0 f23557c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f23558d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f23559e;

    public o0(Enum r5, String str, e0 e0Var, EnumMap enumMap) {
        this.f23555a = new m0(1, 18, r5);
        this.f23556b = new l0(str, true);
        this.f23557c = e0Var;
        this.f23558d = enumMap;
        int length = Integer.MAX_VALUE;
        for (String str2 : enumMap.values()) {
            if (str2.length() < length) {
                length = str2.length();
            }
        }
        this.f23559e = length;
    }

    @Override // yr.j0
    public final int a() {
        return this.f23559e;
    }

    @Override // yr.j0
    public final j0 b(int i7) {
        return new o0(this.f23555a, this.f23556b, this.f23557c, this.f23558d, this.f23559e);
    }

    public o0(m0 m0Var, j0 j0Var, e0 e0Var, Map map, int i7) {
        this.f23555a = m0Var;
        this.f23556b = j0Var;
        this.f23557c = e0Var;
        this.f23558d = map;
        this.f23559e = i7;
    }
}

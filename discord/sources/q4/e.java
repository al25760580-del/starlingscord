package q4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f18621c = new e("COMPOSITION");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f18622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public f f18623b;

    public e(String... strArr) {
        this.f18622a = Arrays.asList(strArr);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x007e A[RETURN] */
    public final boolean a(int i7, String str) {
        List list = this.f18622a;
        if (i7 < list.size()) {
            boolean z5 = i7 == list.size() - 1;
            String str2 = (String) list.get(i7);
            if (!str2.equals("**")) {
                boolean z6 = str2.equals(str) || str2.equals("*");
                if ((z5 || (i7 == list.size() - 2 && ((String) kk.b.f(1, list)).equals("**"))) && z6) {
                    return true;
                }
            } else {
                if (z5 || !((String) list.get(i7 + 1)).equals(str)) {
                    if (!z5) {
                        int i10 = i7 + 1;
                        if (i10 >= list.size() - 1) {
                            return ((String) list.get(i10)).equals(str);
                        }
                    }
                    return true;
                }
                if (i7 == list.size() - 2 || (i7 == list.size() - 3 && ((String) kk.b.f(1, list)).equals("**"))) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int b(int i7, String str) {
        if ("__container".equals(str)) {
            return 0;
        }
        List list = this.f18622a;
        if (((String) list.get(i7)).equals("**")) {
            return (i7 != list.size() - 1 && ((String) list.get(i7 + 1)).equals(str)) ? 2 : 0;
        }
        return 1;
    }

    public final boolean c(int i7, String str) {
        if ("__container".equals(str)) {
            return true;
        }
        List list = this.f18622a;
        if (i7 >= list.size()) {
            return false;
        }
        return ((String) list.get(i7)).equals(str) || ((String) list.get(i7)).equals("**") || ((String) list.get(i7)).equals("*");
    }

    public final boolean d(int i7, String str) {
        if ("__container".equals(str)) {
            return true;
        }
        List list = this.f18622a;
        return i7 < list.size() - 1 || ((String) list.get(i7)).equals("**");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (!this.f18622a.equals(eVar.f18622a)) {
                return false;
            }
            f fVar = this.f18623b;
            f fVar2 = eVar.f18623b;
            if (fVar != null) {
                return fVar.equals(fVar2);
            }
            if (fVar2 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f18622a.hashCode() * 31;
        f fVar = this.f18623b;
        return iHashCode + (fVar != null ? fVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("KeyPath{keys=");
        sb2.append(this.f18622a);
        sb2.append(",resolved=");
        sb2.append(this.f18623b != null);
        sb2.append('}');
        return sb2.toString();
    }

    public e(e eVar) {
        this.f18622a = new ArrayList(eVar.f18622a);
        this.f18623b = eVar.f18623b;
    }
}

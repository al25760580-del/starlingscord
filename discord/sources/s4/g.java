package s4;

import java.util.HashSet;
import l4.v;
import l4.w;

/* JADX INFO: loaded from: classes.dex */
public final class g implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f19747b;

    public g(String str, int i7, boolean z5) {
        this.f19746a = i7;
        this.f19747b = z5;
    }

    @Override // s4.b
    public final n4.c a(v vVar, l4.i iVar, t4.b bVar) {
        if (((HashSet) vVar.K.f9547e).contains(w.f14935d)) {
            return new n4.l(this);
        }
        x4.c.b("Animation contains merge paths but they are disabled.");
        return null;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("MergePaths{mode=");
        int i7 = this.f19746a;
        if (i7 == 1) {
            str = "MERGE";
        } else if (i7 == 2) {
            str = "ADD";
        } else if (i7 == 3) {
            str = "SUBTRACT";
        } else if (i7 != 4) {
            str = i7 != 5 ? "null" : "EXCLUDE_INTERSECTIONS";
        } else {
            str = "INTERSECT";
        }
        sb2.append(str);
        sb2.append('}');
        return sb2.toString();
    }
}

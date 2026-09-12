package yr;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class l0 extends j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23549a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f23550b;

    public l0(String str) {
        this.f23550b = str;
    }

    @Override // yr.j0
    public final int a() {
        switch (this.f23549a) {
            case 0:
                return ((String) this.f23550b).length();
            default:
                return 0;
        }
    }

    @Override // yr.j0
    public final j0 b(int i7) {
        switch (this.f23549a) {
            case 0:
                return new l0((String) this.f23550b);
            default:
                ArrayList arrayList = new ArrayList((List) this.f23550b);
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    j0 j0Var = (j0) arrayList.get(size);
                    arrayList.set(size, j0Var.b(i7));
                    i7 += j0Var.a();
                }
                return new l0(arrayList);
        }
    }

    public l0(String str, boolean z5) {
        if (!z5 && str.isEmpty()) {
            throw new IllegalArgumentException("Literal is empty.");
        }
        this.f23550b = str;
    }

    public l0(List list) {
        if (!list.isEmpty()) {
            Object obj = list.get(0);
            n0 n0Var = n0.f23554a;
            if (obj != n0Var && kk.b.f(1, list) != n0Var) {
                this.f23550b = Collections.unmodifiableList(list);
                return;
            }
            throw new IllegalArgumentException("Optional section must not start or end with an or-operator.");
        }
        throw new IllegalArgumentException("Optional section is empty.");
    }
}

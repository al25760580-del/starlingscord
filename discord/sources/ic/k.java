package ic;

import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ei.e0 f11556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f11557b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ByteBuffer[] f11558c = new ByteBuffer[0];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f11559d;

    public k(ei.e0 e0Var) {
        this.f11556a = e0Var;
        l lVar = l.f11561e;
        this.f11559d = false;
    }

    public final void a() {
        ArrayList arrayList = this.f11557b;
        arrayList.clear();
        this.f11559d = false;
        int i7 = 0;
        while (true) {
            ei.e0 e0Var = this.f11556a;
            if (i7 >= e0Var.size()) {
                break;
            }
            n nVar = (n) e0Var.get(i7);
            nVar.flush();
            if (nVar.c()) {
                arrayList.add(nVar);
            }
            i7++;
        }
        this.f11558c = new ByteBuffer[arrayList.size()];
        for (int i10 = 0; i10 <= b(); i10++) {
            this.f11558c[i10] = ((n) arrayList.get(i10)).a();
        }
    }

    public final int b() {
        return this.f11558c.length - 1;
    }

    public final boolean c() {
        return this.f11559d && ((n) this.f11557b.get(b())).f() && !this.f11558c[b()].hasRemaining();
    }

    public final boolean d() {
        return !this.f11557b.isEmpty();
    }

    public final void e(ByteBuffer byteBuffer) {
        boolean z5;
        for (boolean z6 = true; z6; z6 = z5) {
            z5 = false;
            for (int i7 = 0; i7 <= b(); i7++) {
                if (!this.f11558c[i7].hasRemaining()) {
                    ArrayList arrayList = this.f11557b;
                    n nVar = (n) arrayList.get(i7);
                    if (!nVar.f()) {
                        ByteBuffer byteBuffer2 = i7 > 0 ? this.f11558c[i7 - 1] : byteBuffer.hasRemaining() ? byteBuffer : n.f11577a;
                        long jRemaining = byteBuffer2.remaining();
                        nVar.d(byteBuffer2);
                        this.f11558c[i7] = nVar.a();
                        z5 |= jRemaining - ((long) byteBuffer2.remaining()) > 0 || this.f11558c[i7].hasRemaining();
                    } else if (!this.f11558c[i7].hasRemaining() && i7 < b()) {
                        ((n) arrayList.get(i7 + 1)).e();
                    }
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        ei.e0 e0Var = ((k) obj).f11556a;
        ei.e0 e0Var2 = this.f11556a;
        if (e0Var2.size() != e0Var.size()) {
            return false;
        }
        for (int i7 = 0; i7 < e0Var2.size(); i7++) {
            if (e0Var2.get(i7) != e0Var.get(i7)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.f11556a.hashCode();
    }
}

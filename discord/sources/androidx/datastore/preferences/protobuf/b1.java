package androidx.datastore.preferences.protobuf;

import com.google.android.gms.internal.play_billing.a3;
import com.google.android.gms.internal.play_billing.z2;
import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class b1 implements Iterator {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1822d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1823e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f1824i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Iterator f1825v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ AbstractMap f1826w;

    public /* synthetic */ b1(AbstractMap abstractMap, int i7) {
        this.f1822d = i7;
        this.f1826w = abstractMap;
        this.f1823e = -1;
    }

    public Iterator a() {
        switch (this.f1822d) {
            case 0:
                if (this.f1825v == null) {
                    this.f1825v = ((x0) this.f1826w).f1969i.entrySet().iterator();
                }
                break;
            default:
                if (this.f1825v == null) {
                    this.f1825v = ((vp.y) this.f1826w).f21933i.entrySet().iterator();
                }
                break;
        }
        return this.f1825v;
    }

    public Iterator b() {
        if (this.f1825v == null) {
            this.f1825v = ((z2) this.f1826w).f6200i.entrySet().iterator();
        }
        return this.f1825v;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f1822d) {
            case 0:
                int i7 = this.f1823e + 1;
                x0 x0Var = (x0) this.f1826w;
                if (i7 >= x0Var.f1968e.size()) {
                    return !x0Var.f1969i.isEmpty() && a().hasNext();
                }
                return true;
            case 1:
                int i10 = this.f1823e + 1;
                z2 z2Var = (z2) this.f1826w;
                if (i10 >= z2Var.f6199e) {
                    return !z2Var.f6200i.isEmpty() && b().hasNext();
                }
                return true;
            default:
                return this.f1823e + 1 < ((vp.y) this.f1826w).f21932e.size() || a().hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f1822d) {
            case 0:
                this.f1824i = true;
                int i7 = this.f1823e + 1;
                this.f1823e = i7;
                x0 x0Var = (x0) this.f1826w;
                return i7 < x0Var.f1968e.size() ? (Map.Entry) x0Var.f1968e.get(this.f1823e) : (Map.Entry) a().next();
            case 1:
                this.f1824i = true;
                int i10 = this.f1823e + 1;
                this.f1823e = i10;
                z2 z2Var = (z2) this.f1826w;
                return i10 < z2Var.f6199e ? (a3) z2Var.f6198d[i10] : (Map.Entry) b().next();
            default:
                this.f1824i = true;
                int i11 = this.f1823e + 1;
                this.f1823e = i11;
                vp.y yVar = (vp.y) this.f1826w;
                return i11 < yVar.f21932e.size() ? (Map.Entry) yVar.f21932e.get(this.f1823e) : (Map.Entry) a().next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i7 = this.f1822d;
        AbstractMap abstractMap = this.f1826w;
        switch (i7) {
            case 0:
                x0 x0Var = (x0) abstractMap;
                if (!this.f1824i) {
                    throw new IllegalStateException("remove() was called before next()");
                }
                this.f1824i = false;
                int i10 = x0.f1966y;
                x0Var.b();
                if (this.f1823e >= x0Var.f1968e.size()) {
                    a().remove();
                    return;
                }
                int i11 = this.f1823e;
                this.f1823e = i11 - 1;
                x0Var.g(i11);
                return;
            case 1:
                if (!this.f1824i) {
                    throw new IllegalStateException("remove() was called before next()");
                }
                this.f1824i = false;
                z2 z2Var = (z2) abstractMap;
                int i12 = z2.f6197y;
                z2Var.f();
                int i13 = this.f1823e;
                if (i13 >= z2Var.f6199e) {
                    b().remove();
                    return;
                }
                this.f1823e = i13 - 1;
                z2Var.f();
                Object[] objArr = z2Var.f6198d;
                Object obj = ((a3) objArr[i13]).f5971d;
                System.arraycopy(objArr, i13 + 1, objArr, i13, (z2Var.f6199e - i13) - 1);
                z2Var.f6199e--;
                if (z2Var.f6200i.isEmpty()) {
                    return;
                }
                Iterator it = z2Var.e().entrySet().iterator();
                Object[] objArr2 = z2Var.f6198d;
                int i14 = z2Var.f6199e;
                Map.Entry entry = (Map.Entry) it.next();
                if (entry.getKey() != null) {
                    throw new ClassCastException();
                }
                objArr2[i14] = new a3(z2Var, entry.getValue());
                z2Var.f6199e++;
                it.remove();
                return;
            default:
                vp.y yVar = (vp.y) abstractMap;
                if (!this.f1824i) {
                    throw new IllegalStateException("remove() was called before next()");
                }
                this.f1824i = false;
                int i15 = vp.y.f21930x;
                yVar.b();
                if (this.f1823e >= yVar.f21932e.size()) {
                    a().remove();
                    return;
                }
                int i16 = this.f1823e;
                this.f1823e = i16 - 1;
                yVar.f(i16);
                return;
        }
    }

    public /* synthetic */ b1(z2 z2Var) {
        this.f1822d = 1;
        Objects.requireNonNull(z2Var);
        this.f1826w = z2Var;
        this.f1823e = -1;
    }
}

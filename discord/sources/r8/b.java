package r8;

import com.facebook.common.references.CloseableReference;
import n8.i;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends CloseableReference {
    @Override // com.facebook.common.references.CloseableReference
    /* JADX INFO: renamed from: c */
    public final CloseableReference clone() {
        i.e(u());
        return new b(this.f4625e, this.f4626i, this.f4627v != null ? new Throwable() : null);
    }

    public final void finalize() throws Throwable {
        try {
            synchronized (this) {
                if (this.f4624d) {
                    super.finalize();
                    return;
                }
                Object objA = this.f4625e.a();
                o8.a.x("DefaultCloseableReference", "Finalized without closing: %x %x (type = %s)", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(this.f4625e)), objA == null ? null : objA.getClass().getName());
                a aVar = this.f4626i;
                if (aVar != null) {
                    aVar.L(this.f4625e, this.f4627v);
                }
                close();
                super.finalize();
            }
        } catch (Throwable th2) {
            super.finalize();
            throw th2;
        }
    }
}

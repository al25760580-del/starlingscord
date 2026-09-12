package ze;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes3.dex */
public final class y extends r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ig.g f23983b;

    public y(ig.g gVar) {
        super(4);
        this.f23983b = gVar;
    }

    @Override // ze.z
    public final void a(Status status) {
        this.f23983b.c(new ye.e(status));
    }

    @Override // ze.z
    public final void b(Exception exc) {
        this.f23983b.c(exc);
    }

    @Override // ze.z
    public final void c(m mVar) throws DeadObjectException {
        try {
            h(mVar);
        } catch (DeadObjectException e10) {
            a(z.e(e10));
            throw e10;
        } catch (RemoteException e11) {
            a(z.e(e11));
        } catch (RuntimeException e12) {
            this.f23983b.c(e12);
        }
    }

    @Override // ze.r
    public final boolean f(m mVar) {
        if (mVar.k.get(null) == null) {
            return false;
        }
        throw new ClassCastException();
    }

    @Override // ze.r
    public final xe.d[] g(m mVar) {
        if (mVar.k.get(null) == null) {
            return null;
        }
        throw new ClassCastException();
    }

    public final void h(m mVar) {
        if (mVar.k.remove(null) != null) {
            throw new ClassCastException();
        }
        this.f23983b.d(Boolean.FALSE);
    }

    @Override // ze.z
    public final /* bridge */ /* synthetic */ void d(e4.c cVar, boolean z5) {
    }
}

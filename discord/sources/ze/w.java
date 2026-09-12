package ze;

import android.os.DeadObjectException;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class w extends z {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ue.g f23979b;

    public w(ue.g gVar) {
        super(1);
        this.f23979b = gVar;
    }

    @Override // ze.z
    public final void a(Status status) {
        try {
            this.f23979b.G(status);
        } catch (IllegalStateException e10) {
            Log.w("ApiCallRunner", "Exception reporting failure", e10);
        }
    }

    @Override // ze.z
    public final void b(Exception exc) {
        try {
            this.f23979b.G(new Status(10, kk.b.k(exc.getClass().getSimpleName(), ": ", exc.getLocalizedMessage()), null, null));
        } catch (IllegalStateException e10) {
            Log.w("ApiCallRunner", "Exception reporting failure", e10);
        }
    }

    @Override // ze.z
    public final void c(m mVar) throws DeadObjectException {
        try {
            ue.g gVar = this.f23979b;
            ye.c cVar = mVar.f23946g;
            gVar.getClass();
            try {
                gVar.F(cVar);
            } catch (DeadObjectException e10) {
                gVar.G(new Status(8, e10.getLocalizedMessage(), null, null));
                throw e10;
            } catch (RemoteException e11) {
                gVar.G(new Status(8, e11.getLocalizedMessage(), null, null));
            }
        } catch (RuntimeException e12) {
            b(e12);
        }
    }

    @Override // ze.z
    public final void d(e4.c cVar, boolean z5) {
        Boolean boolValueOf = Boolean.valueOf(z5);
        Map map = (Map) cVar.f7966e;
        ue.g gVar = this.f23979b;
        map.put(gVar, boolValueOf);
        gVar.addStatusListener(new af.r(cVar, gVar));
    }
}

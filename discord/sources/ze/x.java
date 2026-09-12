package ze;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class x extends r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lh.d f23980b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ig.g f23981c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final kh.f f23982d;

    public x(int i7, lh.d dVar, ig.g gVar, kh.f fVar) {
        super(i7);
        this.f23981c = gVar;
        this.f23980b = dVar;
        this.f23982d = fVar;
        if (i7 == 2 && dVar.f15090c) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // ze.z
    public final void a(Status status) {
        this.f23982d.getClass();
        this.f23981c.c(status.f5938i != null ? new ph.a(status) : new ye.e(status));
    }

    @Override // ze.z
    public final void b(Exception exc) {
        this.f23981c.c(exc);
    }

    @Override // ze.z
    public final void c(m mVar) throws DeadObjectException {
        ig.g gVar = this.f23981c;
        try {
            lh.d dVar = this.f23980b;
            ((i) ((lh.d) dVar.f15092e).f15091d).accept(mVar.f23946g, gVar);
        } catch (DeadObjectException e10) {
            throw e10;
        } catch (RemoteException e11) {
            a(z.e(e11));
        } catch (RuntimeException e12) {
            gVar.c(e12);
        }
    }

    @Override // ze.z
    public final void d(e4.c cVar, boolean z5) {
        Boolean boolValueOf = Boolean.valueOf(z5);
        Map map = (Map) cVar.f7967i;
        ig.g gVar = this.f23981c;
        map.put(gVar, boolValueOf);
        gVar.f11763a.addOnCompleteListener(new io.sentry.internal.debugmeta.c(27, cVar, gVar));
    }

    @Override // ze.r
    public final boolean f(m mVar) {
        return this.f23980b.f15090c;
    }

    @Override // ze.r
    public final xe.d[] g(m mVar) {
        return (xe.d[]) this.f23980b.f15091d;
    }
}

package gs;

import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Response;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Interceptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f10182a = new a();

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) throws IOException {
        Intrinsics.checkNotNullParameter(chain, "chain");
        hs.g chain2 = (hs.g) chain;
        i iVar = chain2.f11130a;
        Intrinsics.checkNotNullParameter(chain2, "chain");
        synchronized (iVar) {
            if (!iVar.K) {
                throw new IllegalStateException("released");
            }
            if (iVar.J) {
                throw new IllegalStateException("Check failed.");
            }
            if (iVar.I) {
                throw new IllegalStateException("Check failed.");
            }
            Unit unit = Unit.f14616a;
        }
        e eVar = iVar.E;
        Intrinsics.checkNotNull(eVar);
        OkHttpClient client = iVar.f10212d;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(chain2, "chain");
        try {
            gc.k kVar = new gc.k(iVar, eVar, eVar.a(chain2.f11135f, chain2.f11136g, chain2.f11137h, client.f17342x, !Intrinsics.areEqual(chain2.f11134e.f17369b, "GET")).j(client, chain2));
            iVar.H = kVar;
            iVar.M = kVar;
            synchronized (iVar) {
                iVar.I = true;
                iVar.J = true;
            }
            if (iVar.L) {
                throw new IOException("Canceled");
            }
            return hs.g.b(chain2, 0, kVar, null, 61).a(chain2.f11134e);
        } catch (n e10) {
            eVar.c(e10.f10244e);
            throw e10;
        } catch (IOException e11) {
            eVar.c(e11);
            throw new n(e11);
        }
    }
}

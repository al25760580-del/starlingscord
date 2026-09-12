package w1;

import android.content.Context;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import n1.h;
import n1.i;
import n1.o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements ig.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f21985d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h f21986e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Executor f21987i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ CancellationSignal f21988v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f21989w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ t1.d f21990x;

    public /* synthetic */ c(Object obj, t1.d dVar, h hVar, Executor executor, CancellationSignal cancellationSignal, int i7) {
        this.f21985d = i7;
        this.f21989w = obj;
        this.f21990x = dVar;
        this.f21986e = hVar;
        this.f21987i = executor;
        this.f21988v = cancellationSignal;
    }

    @Override // ig.c
    public final void onFailure(Exception e10) {
        switch (this.f21985d) {
            case 0:
                n1.e eVar = (n1.e) this.f21989w;
                e eVar2 = (e) this.f21990x;
                Intrinsics.checkNotNullParameter(e10, "e");
                eVar.getClass();
                Log.w("CreatePublicKey", "Pre-u credman PK create flow failed " + e10 + "; retrying with gis flow");
                Context context = eVar2.f21993e;
                Intrinsics.checkNotNullParameter(context, "context");
                new v1.h(context).g(eVar, this.f21986e, this.f21987i, this.f21988v);
                break;
            default:
                o request = (o) this.f21989w;
                x1.a aVar = (x1.a) this.f21990x;
                Intrinsics.checkNotNullParameter(e10, "e");
                CredentialProviderPlayServicesImpl.Companion.getClass();
                Intrinsics.checkNotNullParameter(request, "request");
                for (i iVar : request.f16230a) {
                }
                Log.w("GetCredentialController", "Pre-u credman get flow failed; retrying with gis flow");
                new u1.d(aVar.f22587e).h(request, this.f21988v, this.f21987i, this.f21986e);
                break;
        }
    }
}

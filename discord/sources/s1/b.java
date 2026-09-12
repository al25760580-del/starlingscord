package s1;

import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import n1.h;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f19701d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Executor f19702e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ h f19703i;

    public /* synthetic */ b(Executor executor, h hVar, int i7) {
        this.f19701d = i7;
        this.f19702e = executor;
        this.f19703i = hVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f19701d) {
            case 0:
                return CredentialProviderPlayServicesImpl.onGetCredential$lambda$0(this.f19702e, this.f19703i);
            case 1:
                return CredentialProviderPlayServicesImpl.onClearCredential$lambda$4$0(this.f19702e, this.f19703i);
            case 2:
                return CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$0$0(this.f19702e, this.f19703i);
            case 3:
                return CredentialProviderPlayServicesImpl.onClearCredential$lambda$1$0(this.f19702e, this.f19703i);
            case 4:
                this.f19702e.execute(new c(this.f19703i, 8));
                return Unit.f14616a;
            case 5:
                this.f19702e.execute(new c(this.f19703i, 10));
                return Unit.f14616a;
            case 6:
                this.f19702e.execute(new c(this.f19703i, 9));
                return Unit.f14616a;
            default:
                this.f19702e.execute(new c(this.f19703i, 11));
                return Unit.f14616a;
        }
    }
}

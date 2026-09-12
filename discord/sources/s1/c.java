package s1;

import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import n1.h;
import o1.o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f19704d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h f19705e;

    public /* synthetic */ c(h hVar, int i7) {
        this.f19704d = i7;
        this.f19705e = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.f19704d;
        h hVar = this.f19705e;
        switch (i7) {
            case 0:
                hVar.onResult(null);
                break;
            case 1:
                CredentialProviderPlayServicesImpl.onSignalCredentialState$lambda$0(hVar);
                break;
            case 2:
                CredentialProviderPlayServicesImpl.onClearCredential$lambda$0$0(hVar);
                break;
            case 3:
                CredentialProviderPlayServicesImpl.onCreateCredential$lambda$0$0(hVar);
                break;
            case 4:
                hVar.onResult(null);
                break;
            case 5:
                hVar.onResult(null);
                break;
            case 6:
                CredentialProviderPlayServicesImpl.onGetCredential$lambda$1$0(hVar);
                break;
            case 7:
                CredentialProviderPlayServicesImpl.onGetCredential$lambda$0$0(hVar);
                break;
            case 8:
                hVar.h(new o("No provider data returned."));
                break;
            case 9:
                hVar.h(new o1.h(null));
                break;
            case 10:
                hVar.h(new o1.h(null));
                break;
            case 11:
                hVar.h(new o("Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context."));
                break;
            default:
                int i10 = q1.c.f18584d;
                hVar.h(new q1.c("androidx.credentials.SignalCredentialStateException.TYPE_UNKNOWN", "No SignalCredentialStateResponse received"));
                break;
        }
    }
}

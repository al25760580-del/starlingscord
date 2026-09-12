package s1;

import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import kotlin.jvm.internal.Ref;
import n1.h;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f19709d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h f19710e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f19711i;

    public /* synthetic */ e(h hVar, Ref.ObjectRef objectRef, int i7) {
        this.f19709d = i7;
        this.f19710e = hVar;
        this.f19711i = objectRef;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f19709d) {
            case 0:
                CredentialProviderPlayServicesImpl.onClearCredential$lambda$3$0$0(this.f19710e, this.f19711i);
                break;
            default:
                this.f19710e.h(this.f19711i.element);
                break;
        }
    }
}

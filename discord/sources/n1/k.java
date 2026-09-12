package n1;

import android.credentials.CreateCredentialException;
import android.credentials.CreateCredentialResponse;
import android.credentials.Credential;
import android.credentials.GetCredentialException;
import android.credentials.GetCredentialResponse;
import android.os.Bundle;
import android.os.OutcomeReceiver;
import android.util.Log;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class k implements OutcomeReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16226a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f16227b;

    public k(u4.b bVar, l lVar) {
        this.f16227b = bVar;
    }

    public final void onError(Throwable th2) {
        switch (this.f16226a) {
            case 0:
                CreateCredentialException error = (CreateCredentialException) th2;
                Intrinsics.checkNotNullParameter(error, "error");
                Log.i("CredManProvService", "CreateCredentialResponse error returned from framework");
                ga.l lVar = (ga.l) this.f16227b;
                Intrinsics.checkNotNullParameter(error, "error");
                String type = error.getType();
                Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                lVar.h(com.facebook.imagepipeline.nativecode.c.L(error.getMessage(), type));
                break;
            default:
                GetCredentialException error2 = (GetCredentialException) th2;
                Intrinsics.checkNotNullParameter(error2, "error");
                Log.i("CredManProvService", "GetCredentialResponse error returned from framework");
                u4.b bVar = (u4.b) this.f16227b;
                Intrinsics.checkNotNullParameter(error2, "error");
                String type2 = error2.getType();
                Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
                bVar.h(com.facebook.imagepipeline.nativecode.c.M(error2.getMessage(), type2));
                break;
        }
    }

    public final void onResult(Object obj) {
        switch (this.f16226a) {
            case 0:
                CreateCredentialResponse response = (CreateCredentialResponse) obj;
                Intrinsics.checkNotNullParameter(response, "response");
                Log.i("CredManProvService", "Create Result returned from framework: ");
                ga.l lVar = (ga.l) this.f16227b;
                Bundle data = response.getData();
                Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
                lVar.onResult(ls.l.o("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", data));
                break;
            default:
                GetCredentialResponse response2 = (GetCredentialResponse) obj;
                Intrinsics.checkNotNullParameter(response2, "response");
                Log.i("CredManProvService", "GetCredentialResponse returned from framework");
                u4.b bVar = (u4.b) this.f16227b;
                Intrinsics.checkNotNullParameter(response2, "response");
                Credential credential = response2.getCredential();
                Intrinsics.checkNotNullExpressionValue(credential, "getCredential(...)");
                String type = credential.getType();
                Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                Bundle data2 = credential.getData();
                Intrinsics.checkNotNullExpressionValue(data2, "getData(...)");
                bVar.onResult(new p(mf.f.o(type, data2)));
                break;
        }
    }

    public k(ga.l lVar, e eVar, l lVar2) {
        this.f16227b = lVar;
    }
}

package ag;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class p1 extends zs.a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f566n;

    public /* synthetic */ p1(int i7) {
        this.f566n = i7;
    }

    @Override // zs.a
    public ye.c d(Context context, Looper looper, af.c cVar, Object obj, ye.j jVar, ye.k kVar) {
        switch (this.f566n) {
            case 0:
                return new q1(context, looper, 148, cVar, jVar, kVar, 0);
            case 1:
            case 4:
            default:
                return super.d(context, looper, cVar, obj, jVar, kVar);
            case 2:
                cVar.getClass();
                Integer num = (Integer) cVar.f398x;
                Bundle bundle = new Bundle();
                bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", null);
                if (num != null) {
                    bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
                }
                bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
                bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
                bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
                bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
                bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
                bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
                return new gg.a(context, looper, cVar, bundle, jVar, kVar);
            case 3:
                obj.getClass();
                throw new ClassCastException();
            case 5:
                return new uf.g(context, looper, cVar, (qe.b) obj, (ze.m) jVar, (ze.m) kVar);
            case 6:
                return new ue.e(context, looper, cVar, (GoogleSignInOptions) obj, (ze.m) jVar, (ze.m) kVar);
        }
    }

    @Override // zs.a
    public ye.c e(Context context, Looper looper, af.c clientSettings, Object obj, ze.m connectionCallbacks, ze.m connectionFailedListener) {
        switch (this.f566n) {
            case 1:
                return new cf.c(context, looper, clientSettings, (af.l) obj, connectionCallbacks, connectionFailedListener);
            case 2:
            case 3:
            case 5:
            case 6:
            default:
                return super.e(context, looper, clientSettings, obj, connectionCallbacks, connectionFailedListener);
            case 4:
                ye.a apiOptions = (ye.a) obj;
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(looper, "looper");
                Intrinsics.checkNotNullParameter(clientSettings, "commonSettings");
                Intrinsics.checkNotNullParameter(apiOptions, "apiOptions");
                Intrinsics.checkNotNullParameter(connectionCallbacks, "connectedListener");
                Intrinsics.checkNotNullParameter(connectionFailedListener, "connectionFailedListener");
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(looper, "looper");
                Intrinsics.checkNotNullParameter(clientSettings, "clientSettings");
                Intrinsics.checkNotNullParameter(connectionCallbacks, "connectionCallbacks");
                Intrinsics.checkNotNullParameter(connectionFailedListener, "connectionFailedListener");
                return new kf.e(context, looper, 322, clientSettings, connectionCallbacks, connectionFailedListener, 0);
            case 7:
                return new vf.e(context, looper, 126, clientSettings, connectionCallbacks, connectionFailedListener, 0);
            case 8:
                ye.a apiOptions2 = (ye.a) obj;
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(looper, "looper");
                Intrinsics.checkNotNullParameter(clientSettings, "commonSettings");
                Intrinsics.checkNotNullParameter(apiOptions2, "apiOptions");
                Intrinsics.checkNotNullParameter(connectionCallbacks, "connectedListener");
                Intrinsics.checkNotNullParameter(connectionFailedListener, "connectionFailedListener");
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(looper, "looper");
                Intrinsics.checkNotNullParameter(clientSettings, "clientSettings");
                Intrinsics.checkNotNullParameter(connectionCallbacks, "connectionCallbacks");
                Intrinsics.checkNotNullParameter(connectionFailedListener, "connectionFailedListener");
                return new sf.e(context, looper, 352, clientSettings, connectionCallbacks, connectionFailedListener, 0);
            case 9:
                return new uf.c(context, looper, clientSettings, connectionCallbacks, connectionFailedListener);
        }
    }
}

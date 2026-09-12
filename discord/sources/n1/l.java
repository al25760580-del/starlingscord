package n1;

import android.content.Context;
import android.credentials.CreateCredentialRequest;
import android.credentials.CredentialManager;
import android.credentials.CredentialOption;
import android.credentials.GetCredentialRequest;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.text.TextUtils;
import com.discord.R;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class l implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CredentialManager f16228a;

    public l(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f16228a = (CredentialManager) context.getSystemService("credential");
    }

    @Override // n1.j
    public final boolean isAvailableOnDevice() {
        return Build.VERSION.SDK_INT >= 34 && this.f16228a != null;
    }

    @Override // n1.j
    public final void onCreateCredential(Context context, b request, CancellationSignal cancellationSignal, Executor executor, h callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(callback, "callback");
        ga.l lVar = (ga.l) callback;
        CredentialManager credentialManager = this.f16228a;
        if (credentialManager == null) {
            lVar.h(new o1.i("Your device doesn't support credential manager"));
            Unit unit = Unit.f14616a;
            return;
        }
        k kVar = new k(lVar, (e) request, this);
        Intrinsics.checkNotNull(credentialManager);
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(context, "context");
        Bundle bundle = request.f16214a;
        io.sentry.internal.debugmeta.c cVar = request.f16216c;
        Bundle bundle2 = new Bundle();
        bundle2.putCharSequence("androidx.credentials.BUNDLE_KEY_USER_ID", (CharSequence) cVar.f12759e);
        CharSequence charSequence = (CharSequence) cVar.f12760i;
        if (!TextUtils.isEmpty(charSequence)) {
            bundle2.putCharSequence("androidx.credentials.BUNDLE_KEY_USER_DISPLAY_NAME", charSequence);
        }
        if (!TextUtils.isEmpty(null)) {
            bundle2.putString("androidx.credentials.BUNDLE_KEY_DEFAULT_PROVIDER", null);
        }
        bundle2.putParcelable("androidx.credentials.BUNDLE_KEY_CREDENTIAL_TYPE_ICON", Icon.createWithResource(context, R.drawable.adx_ic_passkey));
        bundle.putBundle("androidx.credentials.BUNDLE_KEY_REQUEST_DISPLAY_INFO", bundle2);
        CreateCredentialRequest.Builder alwaysSendAppInfoToProvider = new CreateCredentialRequest.Builder("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", bundle, request.f16215b).setIsSystemProviderRequired(false).setAlwaysSendAppInfoToProvider(true);
        Intrinsics.checkNotNullExpressionValue(alwaysSendAppInfoToProvider, "setAlwaysSendAppInfoToProvider(...)");
        CreateCredentialRequest createCredentialRequestBuild = alwaysSendAppInfoToProvider.build();
        Intrinsics.checkNotNullExpressionValue(createCredentialRequestBuild, "build(...)");
        credentialManager.createCredential(context, createCredentialRequestBuild, cancellationSignal, executor, kVar);
    }

    @Override // n1.j
    public final void onGetCredential(Context context, o request, CancellationSignal cancellationSignal, Executor executor, h callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(callback, "callback");
        u4.b bVar = (u4.b) callback;
        CredentialManager credentialManager = this.f16228a;
        if (credentialManager == null) {
            bVar.h(new o1.p("Your device doesn't support credential manager"));
            Unit unit = Unit.f14616a;
            return;
        }
        k kVar = new k(bVar, this);
        Intrinsics.checkNotNull(credentialManager);
        Intrinsics.checkNotNullParameter(request, "request");
        Bundle bundle = new Bundle();
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IDENTITY_DOC_UI", false);
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", false);
        bundle.putParcelable("androidx.credentials.BUNDLE_KEY_PREFER_UI_BRANDING_COMPONENT_NAME", null);
        GetCredentialRequest.Builder builder = new GetCredentialRequest.Builder(bundle);
        for (i iVar : request.f16230a) {
            builder.addCredentialOption(new CredentialOption.Builder(iVar.f16222a, iVar.f16223b, iVar.f16224c).setIsSystemProviderRequired(false).setAllowedProviders(iVar.f16225d).build());
        }
        GetCredentialRequest getCredentialRequestBuild = builder.build();
        Intrinsics.checkNotNullExpressionValue(getCredentialRequestBuild, "build(...)");
        credentialManager.getCredential(context, getCredentialRequestBuild, cancellationSignal, executor, kVar);
    }
}

package u1;

import a3.e;
import af.w;
import ag.y0;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import com.facebook.react.devsupport.StackTraceHelper;
import ig.l;
import io.sentry.android.core.x;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import n1.h;
import n1.m;
import n1.p;
import n1.r;
import n1.t;
import o1.j;
import o1.o;
import org.json.JSONException;
import org.json.JSONObject;
import qf.f;
import qf.k;
import qf.q;
import qf.u;
import re.g;
import v1.i;

/* JADX INFO: loaded from: classes.dex */
public final class d extends t1.d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f20917e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public h f20918f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Executor f20919g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public CancellationSignal f20920h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final c f20921i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f20917e = context;
        this.f20921i = new c(this, new Handler(Looper.getMainLooper()), 0);
    }

    public final p e(g cred) throws o, q1.b, j {
        fq.a tVar;
        String authenticationResponseJson;
        String str = "response";
        Intrinsics.checkNotNullParameter(cred, "response");
        String password = cred.f19386x;
        u uVar = cred.F;
        boolean z5 = true;
        if (password != null) {
            String id2 = cred.f19381d;
            Intrinsics.checkNotNullExpressionValue(id2, "getId(...)");
            Intrinsics.checkNotNull(password);
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(password, "password");
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(password, "password");
            Bundle bundle = new Bundle();
            bundle.putString("androidx.credentials.BUNDLE_KEY_ID", id2);
            bundle.putString("androidx.credentials.BUNDLE_KEY_PASSWORD", password);
            tVar = new m(1, password, bundle);
        } else {
            JSONObject jSONObject = null;
            if (cred.f19387y != null) {
                String id3 = cred.f19381d;
                Intrinsics.checkNotNullExpressionValue(id3, "getId(...)");
                Intrinsics.checkNotNullParameter(id3, "id");
                String idToken = cred.f19387y;
                Intrinsics.checkNotNull(idToken);
                Intrinsics.checkNotNullParameter(idToken, "idToken");
                String str2 = cred.f19382e;
                if (str2 == null) {
                    str2 = null;
                }
                String str3 = cred.f19383i;
                if (str3 == null) {
                    str3 = null;
                }
                String str4 = cred.f19384v;
                if (str4 == null) {
                    str4 = null;
                }
                String str5 = cred.E;
                if (str5 == null) {
                    str5 = null;
                }
                Uri uri = cred.f19385w;
                Uri uri2 = uri != null ? uri : null;
                Intrinsics.checkNotNullParameter(id3, "id");
                Intrinsics.checkNotNullParameter(idToken, "idToken");
                Intrinsics.checkNotNullParameter(id3, "id");
                Intrinsics.checkNotNullParameter(idToken, "idToken");
                Bundle bundle2 = new Bundle();
                bundle2.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID", id3);
                bundle2.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID_TOKEN", idToken);
                bundle2.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_DISPLAY_NAME", str2);
                bundle2.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_FAMILY_NAME", str4);
                bundle2.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_GIVEN_NAME", str3);
                bundle2.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PHONE_NUMBER", str5);
                bundle2.putParcelable("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PROFILE_PICTURE_URI", uri2);
                jg.a aVar = new jg.a(0, "com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL", bundle2);
                if (id3.length() <= 0) {
                    throw new IllegalArgumentException("id should not be empty");
                }
                if (idToken.length() <= 0) {
                    throw new IllegalArgumentException("idToken should not be empty");
                }
                tVar = aVar;
            } else if (uVar != null) {
                LinkedHashMap linkedHashMap = i.f21367a;
                Intrinsics.checkNotNullParameter(cred, "cred");
                JSONObject jSONObject2 = new JSONObject();
                k kVarH = uVar.h();
                Intrinsics.checkNotNull(kVarH);
                if (kVarH instanceof qf.j) {
                    qf.j jVar = (qf.j) kVarH;
                    q code = jVar.f18826d;
                    Intrinsics.checkNotNullExpressionValue(code, "getErrorCode(...)");
                    String str6 = jVar.f18827e;
                    Intrinsics.checkNotNullParameter(code, "code");
                    p1.a aVar2 = (p1.a) i.f21367a.get(code);
                    if (aVar2 == null) {
                        throw new q1.b(new p1.a(26), e.l("unknown fido gms exception - ", str6));
                    }
                    if (code == q.NOT_ALLOWED_ERR && str6 != null && StringsKt.D(str6, "Unable to get sync account", false)) {
                        throw new j("Passkey retrieval was cancelled by the user.");
                    }
                    throw new q1.b(aVar2, str6);
                }
                if (kVarH instanceof qf.h) {
                    try {
                        qf.j jVar2 = uVar.f18868x;
                        y0 y0Var = uVar.f18865i;
                        try {
                            JSONObject jSONObject3 = new JSONObject();
                            if (y0Var != null && y0Var.m().length > 0) {
                                jSONObject3.put("rawId", ff.c.b(y0Var.m()));
                            }
                            String str7 = uVar.E;
                            if (str7 != null) {
                                jSONObject3.put("authenticatorAttachment", str7);
                            }
                            String str8 = uVar.f18864e;
                            if (str8 != null && jVar2 == null) {
                                jSONObject3.put("type", str8);
                            }
                            String str9 = uVar.f18863d;
                            if (str9 != null) {
                                jSONObject3.put(StackTraceHelper.ID_KEY, str9);
                            }
                            qf.h hVar = uVar.f18867w;
                            if (hVar != null) {
                                jSONObject = hVar.h();
                            } else {
                                qf.i iVar = uVar.f18866v;
                                if (iVar != null) {
                                    jSONObject = iVar.h();
                                } else {
                                    if (jVar2 != null) {
                                        try {
                                            jSONObject = new JSONObject();
                                            jSONObject.put("code", jVar2.f18826d.f18855d);
                                            String str10 = jVar2.f18827e;
                                            if (str10 != null) {
                                                jSONObject.put("message", str10);
                                            }
                                            str = "error";
                                        } catch (JSONException e10) {
                                            throw new RuntimeException("Error encoding AuthenticatorErrorResponse to JSON object", e10);
                                        }
                                    }
                                    z5 = false;
                                }
                            }
                            if (jSONObject != null) {
                                jSONObject3.put(str, jSONObject);
                            }
                            f fVar = uVar.f18869y;
                            if (fVar != null) {
                                jSONObject3.put("clientExtensionResults", fVar.h());
                            } else if (z5) {
                                jSONObject3.put("clientExtensionResults", new JSONObject());
                            }
                            authenticationResponseJson = jSONObject3.toString();
                            Intrinsics.checkNotNullExpressionValue(authenticationResponseJson, "toJson(...)");
                        } catch (JSONException e11) {
                            throw new RuntimeException("Error encoding PublicKeyCredential to JSON object", e11);
                        }
                    } catch (Throwable th2) {
                        throw new o("The PublicKeyCredential response json had an unexpected exception when parsing: " + th2.getMessage());
                    }
                } else {
                    Log.e("PublicKeyUtility", "AuthenticatorResponse expected assertion response but got: ".concat(kVarH.getClass().getName()));
                    authenticationResponseJson = jSONObject2.toString();
                    Intrinsics.checkNotNullExpressionValue(authenticationResponseJson, "toString(...)");
                }
                Intrinsics.checkNotNullParameter(authenticationResponseJson, "authenticationResponseJson");
                Intrinsics.checkNotNullParameter(authenticationResponseJson, "authenticationResponseJson");
                Bundle bundle3 = new Bundle();
                bundle3.putString("androidx.credentials.BUNDLE_KEY_AUTHENTICATION_RESPONSE_JSON", authenticationResponseJson);
                tVar = new t(authenticationResponseJson, bundle3);
            } else {
                Log.w("BeginSignIn", "Credential returned but no google Id or password or passkey found");
                tVar = null;
            }
        }
        if (tVar != null) {
            return new p(tVar);
        }
        throw new o("When attempting to convert get response, null credential found");
    }

    public final h f() {
        h hVar = this.f20918f;
        if (hVar != null) {
            return hVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("callback");
        return null;
    }

    public final Executor g() {
        Executor executor = this.f20919g;
        if (executor != null) {
            return executor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("executor");
        return null;
    }

    public final void h(n1.o request, CancellationSignal cancellationSignal, Executor executor, h callback) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.f20920h = cancellationSignal;
        Intrinsics.checkNotNullParameter(callback, "<set-?>");
        this.f20918f = callback;
        Intrinsics.checkNotNullParameter(executor, "<set-?>");
        this.f20919g = executor;
        CredentialProviderPlayServicesImpl.Companion.getClass();
        if (s1.f.a(cancellationSignal)) {
            return;
        }
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(request, "request");
        Context context = this.f20917e;
        Intrinsics.checkNotNullParameter(context, "context");
        re.d dVar = new re.d(false);
        re.a aVar = new re.a(false, null, null, true, null, null, false);
        re.c cVar = new re.c(false, null, null);
        re.b bVar = new re.b(false, null);
        PackageManager packageManager = context.getPackageManager();
        Intrinsics.checkNotNullExpressionValue(packageManager, "getPackageManager(...)");
        long j = packageManager.getPackageInfo("com.google.android.gms", 0).versionCode;
        boolean z5 = false;
        re.b bVar2 = bVar;
        for (n1.i iVar : request.f16230a) {
            if ((iVar instanceof r) && !z5) {
                if (j >= 231815000) {
                    LinkedHashMap linkedHashMap = i.f21367a;
                    r option = (r) iVar;
                    Intrinsics.checkNotNullParameter(option, "option");
                    re.b bVar3 = new re.b(true, option.f16233e);
                    Intrinsics.checkNotNullExpressionValue(bVar3, "build(...)");
                    bVar2 = bVar3;
                } else {
                    LinkedHashMap linkedHashMap2 = i.f21367a;
                    r option2 = (r) iVar;
                    Intrinsics.checkNotNullParameter(option2, "option");
                    JSONObject jSONObject = new JSONObject(option2.f16233e);
                    String strOptString = jSONObject.optString("rpId", "");
                    Intrinsics.checkNotNull(strOptString);
                    if (strOptString.length() == 0) {
                        throw new JSONException("GetPublicKeyCredentialOption - rpId not specified in the request or is unexpectedly empty");
                    }
                    re.c cVar2 = new re.c(true, c9.a.p(jSONObject), strOptString);
                    Intrinsics.checkNotNullExpressionValue(cVar2, "build(...)");
                    cVar = cVar2;
                }
                z5 = true;
            }
        }
        re.e eVar = new re.e(dVar, aVar, null, false, 0, cVar, bVar2, false);
        Intrinsics.checkNotNullExpressionValue(eVar, "build(...)");
        uf.b bVarE = e4.f.E(context);
        new re.a(false, null, null, true, null, null, false);
        re.a aVar2 = eVar.f19374e;
        w.g(aVar2);
        re.d dVar2 = eVar.f19373d;
        w.g(dVar2);
        re.c cVar3 = eVar.f19378x;
        w.g(cVar3);
        re.b bVar4 = eVar.f19379y;
        w.g(bVar4);
        re.e eVar2 = new re.e(dVar2, aVar2, bVarE.k, eVar.f19376v, eVar.f19377w, cVar3, bVar4, eVar.E);
        lh.d dVarF = lh.d.f();
        dVarF.f15092e = new xe.d[]{new xe.d("auth_api_credentials_begin_sign_in", 8L)};
        dVarF.f15091d = new op.c(bVarE, eVar2, 9);
        dVarF.f15090c = false;
        dVarF.f15089b = 1553;
        l lVarB = bVarE.b(0, dVarF.e());
        mi.a aVar3 = new mi.a(7, new com.facebook.react.runtime.p(11, cancellationSignal, this));
        lVarB.getClass();
        lVarB.e(ig.h.f11764a, aVar3);
        lVarB.o(new x(8, this, cancellationSignal));
    }
}

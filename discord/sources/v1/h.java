package v1;

import af.w;
import ag.y0;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import bc.k;
import com.appsflyer.AppsFlyerProperties;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.runtime.p;
import com.facebook.react.uimanager.ViewProps;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import qf.b0;
import qf.e0;
import qf.i0;
import qf.j;
import qf.l;
import qf.n;
import qf.r;
import qf.s;
import qf.u;
import qf.v;
import qf.x;
import qf.y;

/* JADX INFO: loaded from: classes.dex */
public final class h extends t1.d {
    public static final /* synthetic */ int j = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f21362e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public n1.h f21363f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Executor f21364g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public CancellationSignal f21365h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final u1.c f21366i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f21362e = context;
        this.f21366i = new u1.c(this, new Handler(Looper.getMainLooper()), 1);
    }

    public static n1.f f(u response) throws o1.h {
        JSONObject jSONObjectH;
        String str = "response";
        Intrinsics.checkNotNullParameter(response, "response");
        try {
            j jVar = response.f18868x;
            y0 y0Var = response.f18865i;
            try {
                JSONObject jSONObject = new JSONObject();
                if (y0Var != null && y0Var.m().length > 0) {
                    jSONObject.put("rawId", ff.c.b(y0Var.m()));
                }
                String str2 = response.E;
                if (str2 != null) {
                    jSONObject.put("authenticatorAttachment", str2);
                }
                String str3 = response.f18864e;
                if (str3 != null && jVar == null) {
                    jSONObject.put("type", str3);
                }
                String str4 = response.f18863d;
                if (str4 != null) {
                    jSONObject.put(StackTraceHelper.ID_KEY, str4);
                }
                qf.h hVar = response.f18867w;
                boolean z5 = true;
                if (hVar != null) {
                    jSONObjectH = hVar.h();
                } else {
                    qf.i iVar = response.f18866v;
                    if (iVar != null) {
                        jSONObjectH = iVar.h();
                    } else {
                        z5 = false;
                        if (jVar != null) {
                            try {
                                JSONObject jSONObject2 = new JSONObject();
                                jSONObject2.put("code", jVar.f18826d.f18855d);
                                String str5 = jVar.f18827e;
                                if (str5 != null) {
                                    jSONObject2.put("message", str5);
                                }
                                jSONObjectH = jSONObject2;
                                str = "error";
                            } catch (JSONException e10) {
                                throw new RuntimeException("Error encoding AuthenticatorErrorResponse to JSON object", e10);
                            }
                        } else {
                            jSONObjectH = null;
                        }
                    }
                }
                if (jSONObjectH != null) {
                    jSONObject.put(str, jSONObjectH);
                }
                qf.f fVar = response.f18869y;
                if (fVar != null) {
                    jSONObject.put("clientExtensionResults", fVar.h());
                } else if (z5) {
                    jSONObject.put("clientExtensionResults", new JSONObject());
                }
                String registrationResponseJson = jSONObject.toString();
                Intrinsics.checkNotNullExpressionValue(registrationResponseJson, "toJson(...)");
                Intrinsics.checkNotNullParameter(registrationResponseJson, "registrationResponseJson");
                Intrinsics.checkNotNullParameter(registrationResponseJson, "registrationResponseJson");
                Bundle bundle = new Bundle();
                bundle.putString("androidx.credentials.BUNDLE_KEY_REGISTRATION_RESPONSE_JSON", registrationResponseJson);
                return new n1.f(registrationResponseJson, bundle);
            } catch (JSONException e11) {
                throw new RuntimeException("Error encoding PublicKeyCredential to JSON object", e11);
            }
        } catch (Throwable th2) {
            throw new o1.h("The PublicKeyCredential response json had an unexpected exception when parsing: " + th2.getMessage());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final v e(n1.e request) throws JSONException, PackageManager.NameNotFoundException, q1.a {
        String str;
        ArrayList arrayList;
        long jQ;
        Intrinsics.checkNotNullParameter(request, "request");
        LinkedHashMap linkedHashMap = i.f21367a;
        Intrinsics.checkNotNullParameter(request, "request");
        Context context = this.f21362e;
        Intrinsics.checkNotNullParameter(context, "context");
        if (xe.e.f22922d.b(context, xe.f.f22923a) == 0) {
            PackageManager packageManager = context.getPackageManager();
            Intrinsics.checkNotNullExpressionValue(packageManager, "getPackageManager(...)");
            if (Build.VERSION.SDK_INT >= 28) {
                PackageInfo packageInfo = packageManager.getPackageInfo("com.google.android.gms", 0);
                Intrinsics.checkNotNullExpressionValue(packageInfo, "getPackageInfo(...)");
                jQ = androidx.core.view.h.q(packageInfo);
            } else {
                jQ = packageManager.getPackageInfo("com.google.android.gms", 0).versionCode;
            }
            if (jQ > 241217000) {
                return new v(request.f16218d);
            }
        }
        JSONObject json = new JSONObject(request.f16218d);
        Intrinsics.checkNotNullParameter(json, "json");
        k builder = new k();
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(builder, "builder");
        byte[] bArrP = c9.a.p(json);
        w.g(bArrP);
        builder.f3124v = bArrP;
        JSONObject jSONObject = json.getJSONObject("user");
        String str2 = StackTraceHelper.ID_KEY;
        String str3 = jSONObject.getString(StackTraceHelper.ID_KEY);
        Intrinsics.checkNotNullExpressionValue(str3, "getString(...)");
        Intrinsics.checkNotNullParameter(str3, "str");
        byte[] bArrDecode = Base64.decode(str3, 11);
        String str4 = "decode(...)";
        Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
        String string = jSONObject.getString(StackTraceHelper.NAME_KEY);
        String string2 = jSONObject.getString("displayName");
        String strOptString = jSONObject.optString("icon", "");
        Intrinsics.checkNotNull(string2);
        if (string2.length() == 0) {
            throw new JSONException("PublicKeyCredentialCreationOptions UserEntity missing displayName or they are unexpectedly empty");
        }
        if (bArrDecode.length == 0) {
            throw new JSONException("PublicKeyCredentialCreationOptions UserEntity missing user id or they are unexpectedly empty");
        }
        Intrinsics.checkNotNull(string);
        if (string.length() == 0) {
            throw new JSONException("PublicKeyCredentialCreationOptions UserEntity missing user name or they are unexpectedly empty");
        }
        builder.f3123i = new b0(string, strOptString, string2, bArrDecode);
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(builder, "builder");
        JSONObject jSONObject2 = json.getJSONObject("rp");
        String string3 = jSONObject2.getString(StackTraceHelper.ID_KEY);
        String strOptString2 = jSONObject2.optString(StackTraceHelper.NAME_KEY, "");
        String strOptString3 = jSONObject2.optString("icon", "");
        Intrinsics.checkNotNull(strOptString3);
        if (strOptString3.length() == 0) {
            strOptString3 = null;
        }
        Intrinsics.checkNotNull(strOptString2);
        if (strOptString2.length() == 0) {
            throw new JSONException("PublicKeyCredentialCreationOptions rp name is missing or unexpectedly empty");
        }
        Intrinsics.checkNotNull(string3);
        if (string3.length() == 0) {
            throw new JSONException("PublicKeyCredentialCreationOptions rp ID is missing or unexpectedly empty");
        }
        builder.f3122e = new y(string3, strOptString2, strOptString3);
        JSONArray jSONArray = json.getJSONArray("pubKeyCredParams");
        ArrayList arrayList2 = new ArrayList();
        int length = jSONArray.length();
        int i7 = 0;
        while (i7 < length) {
            JSONObject jSONObject3 = jSONArray.getJSONObject(i7);
            LinkedHashMap linkedHashMap2 = i.f21367a;
            String str5 = str4;
            int i10 = (int) jSONObject3.getLong("alg");
            String strOptString4 = jSONObject3.optString("type", "");
            Intrinsics.checkNotNull(strOptString4);
            if (strOptString4.length() == 0) {
                throw new JSONException("PublicKeyCredentialCreationOptions PublicKeyCredentialParameter type missing or unexpectedly empty");
            }
            try {
                n.a(i10);
                arrayList2.add(new x(strOptString4, i10));
            } catch (Throwable unused) {
            }
            i7++;
            str4 = str5;
        }
        String str6 = str4;
        builder.f3125w = arrayList2;
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(builder, "builder");
        ArrayList arrayList3 = new ArrayList();
        LinkedHashMap linkedHashMap3 = i.f21367a;
        if (json.has("excludeCredentials")) {
            JSONArray jSONArray2 = json.getJSONArray("excludeCredentials");
            int length2 = jSONArray2.length();
            int i11 = 0;
            while (i11 < length2) {
                JSONObject jSONObject4 = jSONArray2.getJSONObject(i11);
                LinkedHashMap linkedHashMap4 = i.f21367a;
                String str7 = jSONObject4.getString(str2);
                Intrinsics.checkNotNullExpressionValue(str7, "getString(...)");
                Intrinsics.checkNotNullParameter(str7, "str");
                byte[] bArrDecode2 = Base64.decode(str7, 11);
                String str8 = str6;
                Intrinsics.checkNotNullExpressionValue(bArrDecode2, str8);
                JSONArray jSONArray3 = jSONArray2;
                String string4 = jSONObject4.getString("type");
                Intrinsics.checkNotNull(string4);
                if (string4.length() == 0) {
                    throw new JSONException("PublicKeyCredentialDescriptor type value is not found or unexpectedly empty");
                }
                int i12 = length2;
                if (bArrDecode2.length == 0) {
                    throw new JSONException("PublicKeyCredentialDescriptor id value is not found or unexpectedly empty");
                }
                if (jSONObject4.has("transports")) {
                    arrayList = new ArrayList();
                    JSONArray jSONArray4 = jSONObject4.getJSONArray("transports");
                    int length3 = jSONArray4.length();
                    int i13 = 0;
                    while (i13 < length3) {
                        try {
                            JSONArray jSONArray5 = jSONArray4;
                            arrayList.add(Transport.a(jSONArray4.getString(i13)));
                            i13++;
                            jSONArray4 = jSONArray5;
                        } catch (of.a e10) {
                            throw new q1.a(new p1.a(4), e10.getMessage());
                        }
                    }
                } else {
                    arrayList = null;
                }
                arrayList3.add(new qf.w(string4, bArrDecode2, arrayList));
                i11++;
                jSONArray2 = jSONArray3;
                length2 = i12;
                str2 = str2;
                str6 = str8;
            }
        }
        builder.f3127y = arrayList3;
        LinkedHashMap linkedHashMap5 = i.f21367a;
        String str9 = ViewProps.NONE;
        String strOptString5 = json.optString("attestation", ViewProps.NONE);
        Intrinsics.checkNotNull(strOptString5);
        if (strOptString5.length() != 0) {
            str9 = strOptString5;
        }
        builder.F = qf.e.a(str9);
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(builder, "builder");
        if (json.has("timeout")) {
            builder.f3126x = Double.valueOf(json.getLong("timeout") / ((double) 1000));
        }
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(builder, "builder");
        if (json.has("authenticatorSelection")) {
            JSONObject jSONObject5 = json.getJSONObject("authenticatorSelection");
            boolean zOptBoolean = jSONObject5.optBoolean("requireResidentKey", false);
            String strOptString6 = jSONObject5.optString("residentKey", "");
            Intrinsics.checkNotNull(strOptString6);
            e0 e0VarA = strOptString6.length() > 0 ? e0.a(strOptString6) : null;
            Boolean boolValueOf = Boolean.valueOf(zOptBoolean);
            String strOptString7 = jSONObject5.optString("authenticatorAttachment", "");
            Intrinsics.checkNotNull(strOptString7);
            qf.c cVarA = strOptString7.length() > 0 ? qf.c.a(strOptString7) : null;
            str = null;
            builder.E = new l(cVarA == null ? null : cVarA.f18795d, boolValueOf, null, e0VarA == null ? null : e0VarA.f18805d);
        } else {
            str = null;
        }
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(builder, "builder");
        if (json.has("extensions")) {
            JSONObject jSONObject6 = json.getJSONObject("extensions");
            String strOptString8 = jSONObject6.optString(AppsFlyerProperties.APP_ID, "");
            Intrinsics.checkNotNull(strOptString8);
            builder.G = new AuthenticationExtensions(strOptString8.length() > 0 ? new r(strOptString8) : str, null, jSONObject6.optBoolean("uvm", false) ? new i0(true) : str, null, null, null, null, null, jSONObject6.optBoolean("thirdPartyPayment", false) ? new s(true) : str, null, null, null, null);
        }
        y yVar = (y) builder.f3122e;
        b0 b0Var = (b0) builder.f3123i;
        byte[] bArr = (byte[]) builder.f3124v;
        ArrayList arrayList4 = (ArrayList) builder.f3125w;
        Double d6 = (Double) builder.f3126x;
        ArrayList arrayList5 = (ArrayList) builder.f3127y;
        l lVar = (l) builder.E;
        qf.e eVar = (qf.e) builder.F;
        v vVar = new v(yVar, b0Var, bArr, arrayList4, d6, arrayList5, lVar, null, null, eVar == null ? str : eVar.f18801d, (AuthenticationExtensions) builder.G, null, null, null);
        Intrinsics.checkNotNullExpressionValue(vVar, "build(...)");
        return vVar;
    }

    public final void g(n1.e request, n1.h callback, Executor executor, CancellationSignal cancellationSignal) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.f21365h = cancellationSignal;
        this.f21363f = callback;
        this.f21364g = executor;
        try {
            v vVarE = e(request);
            CredentialProviderPlayServicesImpl.Companion.getClass();
            if (s1.f.a(cancellationSignal)) {
                return;
            }
            pf.a aVar = new pf.a(this.f21362e, null, pf.a.k, ye.b.D, new ye.h(new kh.f(21), Looper.getMainLooper()));
            lh.d dVarF = lh.d.f();
            dVarF.f15091d = new pf.b(aVar, vVarE);
            dVarF.f15089b = 5407;
            ig.l lVarB = aVar.b(0, dVarF.e());
            mi.a aVar2 = new mi.a(8, new p(12, cancellationSignal, this));
            lVarB.getClass();
            lVarB.e(ig.h.f11764a, aVar2);
            lVarB.o(new io.sentry.android.core.x(9, this, cancellationSignal));
        } catch (JSONException e10) {
            f onResultOrException = new f(this, e10, 1);
            Intrinsics.checkNotNullParameter(onResultOrException, "onResultOrException");
            CredentialProviderPlayServicesImpl.Companion.getClass();
            if (s1.f.a(cancellationSignal)) {
                return;
            }
            onResultOrException.invoke();
        } catch (Throwable th2) {
            g onResultOrException2 = new g(this, th2, 1);
            Intrinsics.checkNotNullParameter(onResultOrException2, "onResultOrException");
            CredentialProviderPlayServicesImpl.Companion.getClass();
            if (s1.f.a(cancellationSignal)) {
                return;
            }
            onResultOrException2.invoke();
        }
    }
}

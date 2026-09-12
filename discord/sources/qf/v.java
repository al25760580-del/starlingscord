package qf;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.util.Base64;
import android.util.Log;
import androidx.annotation.NonNull;
import com.appsflyer.AppsFlyerProperties;
import com.facebook.react.devsupport.StackTraceHelper;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class v extends k {

    @NonNull
    public static final Parcelable.Creator<v> CREATOR = new jf.b(21);
    public final Integer E;
    public final h0 F;
    public final e G;
    public final AuthenticationExtensions H;
    public final String I;
    public final ResultReceiver J;
    public final List K;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y f18872d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b0 f18873e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final byte[] f18874i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final List f18875v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Double f18876w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final List f18877x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final l f18878y;

    public v(String str) {
        try {
            v vVarH = h(new JSONObject(str));
            this.f18872d = vVarH.f18872d;
            this.f18873e = vVarH.f18873e;
            this.f18874i = vVarH.f18874i;
            this.f18875v = vVarH.f18875v;
            this.f18876w = vVarH.f18876w;
            this.f18877x = vVarH.f18877x;
            this.f18878y = vVarH.f18878y;
            this.E = vVarH.E;
            this.F = vVarH.F;
            this.G = vVarH.G;
            this.H = vVarH.H;
            this.K = vVarH.K;
            this.I = str;
        } catch (JSONException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0261  */
    /* JADX WARN: Code duplicated, block: B:104:0x026b  */
    /* JADX WARN: Code duplicated, block: B:105:0x027d  */
    /* JADX WARN: Code duplicated, block: B:108:0x0287  */
    /* JADX WARN: Code duplicated, block: B:109:0x0299  */
    /* JADX WARN: Code duplicated, block: B:112:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:113:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:116:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:117:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:120:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:121:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:124:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:125:0x0309  */
    /* JADX WARN: Code duplicated, block: B:128:0x0313  */
    /* JADX WARN: Code duplicated, block: B:129:0x0325  */
    /* JADX WARN: Code duplicated, block: B:132:0x032f  */
    /* JADX WARN: Code duplicated, block: B:133:0x0341  */
    /* JADX WARN: Code duplicated, block: B:136:0x034b  */
    /* JADX WARN: Code duplicated, block: B:137:0x0357  */
    /* JADX WARN: Code duplicated, block: B:96:0x0212  */
    /* JADX WARN: Code duplicated, block: B:99:0x0222 A[LOOP:3: B:97:0x021c->B:99:0x0222, LOOP_END] */
    public static v h(JSONObject jSONObject) throws JSONException {
        ArrayList arrayList;
        l lVar;
        int i7;
        AuthenticationExtensions authenticationExtensions;
        e eVarA;
        ArrayList arrayList2;
        q0 q0Var;
        q0 q0VarH;
        x0 x0Var;
        i0 i0Var;
        z0 z0Var;
        m0 m0Var;
        n0 n0Var;
        y0 y0Var;
        o0 o0Var;
        s sVar;
        t tVar;
        r0 r0Var;
        JSONArray jSONArray;
        ArrayList arrayList3;
        int i10;
        String str;
        ArrayList arrayList4;
        JSONArray jSONArray2;
        String str2;
        ag.f gVar;
        JSONObject jSONObject2 = jSONObject.getJSONObject("rp");
        String str3 = StackTraceHelper.ID_KEY;
        y yVar = new y(jSONObject2.getString(StackTraceHelper.ID_KEY), jSONObject2.getString(StackTraceHelper.NAME_KEY), jSONObject2.has("icon") ? jSONObject2.optString("icon") : null);
        JSONObject jSONObject3 = jSONObject.getJSONObject("user");
        b0 b0Var = new b0(jSONObject3.getString(StackTraceHelper.NAME_KEY), jSONObject3.has("icon") ? jSONObject3.optString("icon") : null, jSONObject3.optString("displayName"), ff.c.a(jSONObject3.getString(StackTraceHelper.ID_KEY)));
        byte[] bArrA = ff.c.a(jSONObject.getString("challenge"));
        af.w.g(bArrA);
        JSONArray jSONArray3 = jSONObject.getJSONArray("pubKeyCredParams");
        ArrayList arrayList5 = new ArrayList();
        for (int i11 = 0; i11 < jSONArray3.length(); i11++) {
            JSONObject jSONObject4 = jSONArray3.getJSONObject(i11);
            try {
                gVar = new ag.g(new x(jSONObject4.getString("type"), jSONObject4.getInt("alg")));
            } catch (IllegalArgumentException unused) {
                gVar = ag.d.f514d;
            }
            if (gVar.b()) {
                arrayList5.add((x) gVar.a());
            }
        }
        Double dValueOf = jSONObject.has("timeout") ? Double.valueOf(jSONObject.getDouble("timeout") / 1000.0d) : null;
        int i12 = 11;
        if (jSONObject.has("excludeCredentials")) {
            JSONArray jSONArray4 = jSONObject.getJSONArray("excludeCredentials");
            ArrayList arrayList6 = new ArrayList();
            int i13 = 0;
            while (i13 < jSONArray4.length()) {
                JSONObject jSONObject5 = jSONArray4.getJSONObject(i13);
                Parcelable.Creator<w> creator = w.CREATOR;
                String string = jSONObject5.getString("type");
                byte[] bArrDecode = Base64.decode(jSONObject5.getString(str3), i12);
                if (!jSONObject5.has("transports") || (jSONArray2 = jSONObject5.getJSONArray("transports")) == null) {
                    str = str3;
                    arrayList4 = null;
                } else {
                    HashSet hashSet = new HashSet(jSONArray2.length());
                    int i14 = 0;
                    while (i14 < jSONArray2.length()) {
                        String string2 = jSONArray2.getString(i14);
                        if (string2 == null || string2.isEmpty()) {
                            str2 = str3;
                        } else {
                            str2 = str3;
                            try {
                                hashSet.add(Transport.a(string2));
                            } catch (of.a unused2) {
                                Log.w("Transport", "Ignoring unrecognized transport ".concat(string2));
                            }
                        }
                        i14++;
                        str3 = str2;
                    }
                    str = str3;
                    arrayList4 = new ArrayList(hashSet);
                }
                arrayList6.add(new w(string, bArrDecode, arrayList4));
                i13++;
                jSONArray4 = jSONArray4;
                str3 = str;
                i12 = 11;
            }
            arrayList = arrayList6;
        } else {
            arrayList = null;
        }
        if (jSONObject.has("authenticatorSelection")) {
            JSONObject jSONObject6 = jSONObject.getJSONObject("authenticatorSelection");
            lVar = new l(jSONObject6.has("authenticatorAttachment") ? jSONObject6.optString("authenticatorAttachment") : null, jSONObject6.has("requireResidentKey") ? Boolean.valueOf(jSONObject6.optBoolean("requireResidentKey")) : null, jSONObject6.has("userVerification") ? jSONObject6.optString("userVerification") : null, jSONObject6.has("residentKey") ? jSONObject6.optString("residentKey") : null);
        } else {
            lVar = null;
        }
        if (jSONObject.has("extensions")) {
            JSONObject jSONObject7 = jSONObject.getJSONObject("extensions");
            r rVar = jSONObject7.has("fidoAppIdExtension") ? new r(jSONObject7.getJSONObject("fidoAppIdExtension").getString(AppsFlyerProperties.APP_ID)) : null;
            if (jSONObject7.has(AppsFlyerProperties.APP_ID)) {
                rVar = new r(jSONObject7.getString(AppsFlyerProperties.APP_ID));
            }
            r rVar2 = rVar;
            if (!jSONObject7.has("prf")) {
                i7 = 0;
                if (jSONObject7.has("prfAlreadyHashed")) {
                    q0VarH = q0.h(jSONObject7.getJSONObject("prfAlreadyHashed"), true);
                } else {
                    q0Var = null;
                }
                if (jSONObject7.has("cableAuthenticationExtension")) {
                    jSONArray = jSONObject7.getJSONArray("cableAuthenticationExtension");
                    arrayList3 = new ArrayList();
                    for (i10 = i7; i10 < jSONArray.length(); i10++) {
                        JSONObject jSONObject8 = jSONArray.getJSONObject(i10);
                        arrayList3.add(new w0(jSONObject8.getLong("version"), Base64.decode(jSONObject8.getString("clientEid"), 11), Base64.decode(jSONObject8.getString("authenticatorEid"), 11), Base64.decode(jSONObject8.getString("sessionPreKey"), 11)));
                    }
                    x0Var = new x0(arrayList3);
                } else {
                    x0Var = null;
                }
                if (jSONObject7.has("userVerificationMethodExtension")) {
                    i0Var = new i0(jSONObject7.getJSONObject("userVerificationMethodExtension").getBoolean("uvm"));
                } else {
                    i0Var = null;
                }
                if (jSONObject7.has("google_multiAssertionExtension")) {
                    z0Var = new z0(jSONObject7.getJSONObject("google_multiAssertionExtension").getBoolean("requestForMultiAssertion"));
                } else {
                    z0Var = null;
                }
                if (jSONObject7.has("google_sessionIdExtension")) {
                    m0Var = new m0(jSONObject7.getJSONObject("google_sessionIdExtension").getInt("sessionId"));
                } else {
                    m0Var = null;
                }
                if (jSONObject7.has("google_silentVerificationExtension")) {
                    n0Var = new n0(jSONObject7.getJSONObject("google_silentVerificationExtension").getBoolean("silentVerification"));
                } else {
                    n0Var = null;
                }
                if (jSONObject7.has("devicePublicKeyExtension")) {
                    jSONObject7.getJSONObject("devicePublicKeyExtension").getBoolean("devicePublicKey");
                    y0Var = new y0();
                } else {
                    y0Var = null;
                }
                if (jSONObject7.has("google_tunnelServerIdExtension")) {
                    o0Var = new o0(jSONObject7.getJSONObject("google_tunnelServerIdExtension").getString("tunnelServerId"));
                } else {
                    o0Var = null;
                }
                if (jSONObject7.has("google_thirdPartyPaymentExtension")) {
                    sVar = new s(jSONObject7.getJSONObject("google_thirdPartyPaymentExtension").getBoolean("thirdPartyPayment"));
                } else {
                    sVar = null;
                }
                if (jSONObject7.has("payment")) {
                    tVar = new t(jSONObject7.getJSONObject("payment").getBoolean("isPayment"));
                } else {
                    tVar = null;
                }
                if (jSONObject7.has("txAuthSimple")) {
                    r0Var = new r0(jSONObject7.getString("txAuthSimple"));
                } else {
                    r0Var = null;
                }
                authenticationExtensions = new AuthenticationExtensions(rVar2, x0Var, i0Var, z0Var, m0Var, n0Var, y0Var, o0Var, sVar, q0Var, r0Var, null, tVar);
            } else {
                if (jSONObject7.has("prfAlreadyHashed")) {
                    throw new JSONException("both prf and prfAlreadyHashed extensions found");
                }
                i7 = 0;
                q0VarH = q0.h(jSONObject7.getJSONObject("prf"), false);
            }
            q0Var = q0VarH;
            if (jSONObject7.has("cableAuthenticationExtension")) {
                jSONArray = jSONObject7.getJSONArray("cableAuthenticationExtension");
                arrayList3 = new ArrayList();
                while (i10 < jSONArray.length()) {
                    JSONObject jSONObject9 = jSONArray.getJSONObject(i10);
                    arrayList3.add(new w0(jSONObject9.getLong("version"), Base64.decode(jSONObject9.getString("clientEid"), 11), Base64.decode(jSONObject9.getString("authenticatorEid"), 11), Base64.decode(jSONObject9.getString("sessionPreKey"), 11)));
                }
                x0Var = new x0(arrayList3);
            } else {
                x0Var = null;
            }
            if (jSONObject7.has("userVerificationMethodExtension")) {
                i0Var = new i0(jSONObject7.getJSONObject("userVerificationMethodExtension").getBoolean("uvm"));
            } else {
                i0Var = null;
            }
            if (jSONObject7.has("google_multiAssertionExtension")) {
                z0Var = new z0(jSONObject7.getJSONObject("google_multiAssertionExtension").getBoolean("requestForMultiAssertion"));
            } else {
                z0Var = null;
            }
            if (jSONObject7.has("google_sessionIdExtension")) {
                m0Var = new m0(jSONObject7.getJSONObject("google_sessionIdExtension").getInt("sessionId"));
            } else {
                m0Var = null;
            }
            if (jSONObject7.has("google_silentVerificationExtension")) {
                n0Var = new n0(jSONObject7.getJSONObject("google_silentVerificationExtension").getBoolean("silentVerification"));
            } else {
                n0Var = null;
            }
            if (jSONObject7.has("devicePublicKeyExtension")) {
                jSONObject7.getJSONObject("devicePublicKeyExtension").getBoolean("devicePublicKey");
                y0Var = new y0();
            } else {
                y0Var = null;
            }
            if (jSONObject7.has("google_tunnelServerIdExtension")) {
                o0Var = new o0(jSONObject7.getJSONObject("google_tunnelServerIdExtension").getString("tunnelServerId"));
            } else {
                o0Var = null;
            }
            if (jSONObject7.has("google_thirdPartyPaymentExtension")) {
                sVar = new s(jSONObject7.getJSONObject("google_thirdPartyPaymentExtension").getBoolean("thirdPartyPayment"));
            } else {
                sVar = null;
            }
            if (jSONObject7.has("payment")) {
                tVar = new t(jSONObject7.getJSONObject("payment").getBoolean("isPayment"));
            } else {
                tVar = null;
            }
            if (jSONObject7.has("txAuthSimple")) {
                r0Var = new r0(jSONObject7.getString("txAuthSimple"));
            } else {
                r0Var = null;
            }
            authenticationExtensions = new AuthenticationExtensions(rVar2, x0Var, i0Var, z0Var, m0Var, n0Var, y0Var, o0Var, sVar, q0Var, r0Var, null, tVar);
        } else {
            i7 = 0;
            authenticationExtensions = null;
        }
        if (jSONObject.has("attestation")) {
            try {
                eVarA = e.a(jSONObject.getString("attestation"));
            } catch (d e10) {
                Log.w("PKCCreationOptions", "Invalid AttestationConveyancePreference", e10);
                eVarA = e.NONE;
            }
        } else {
            eVarA = null;
        }
        if (jSONObject.has("attestationFormats")) {
            JSONArray jSONArray5 = jSONObject.getJSONArray("attestationFormats");
            ArrayList arrayList7 = new ArrayList();
            while (i7 < jSONArray5.length()) {
                arrayList7.add(jSONArray5.getString(i7));
                i7++;
            }
            arrayList2 = arrayList7;
        } else {
            arrayList2 = null;
        }
        return new v(yVar, b0Var, bArrA, arrayList5, dValueOf, arrayList, lVar, null, null, eVarA == null ? null : eVarA.f18801d, authenticationExtensions, null, null, arrayList2);
    }

    public final boolean equals(Object obj) {
        List list;
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        List list2 = vVar.f18875v;
        List list3 = vVar.K;
        List list4 = vVar.f18877x;
        if (af.w.j(this.f18872d, vVar.f18872d) && af.w.j(this.f18873e, vVar.f18873e) && Arrays.equals(this.f18874i, vVar.f18874i) && af.w.j(this.f18876w, vVar.f18876w)) {
            List list5 = this.f18875v;
            if (list5.containsAll(list2) && list2.containsAll(list5) && ((((list = this.f18877x) == null && list4 == null) || (list != null && list4 != null && list.containsAll(list4) && list4.containsAll(list))) && af.w.j(this.f18878y, vVar.f18878y) && af.w.j(this.E, vVar.E) && af.w.j(this.F, vVar.F) && af.w.j(this.G, vVar.G) && af.w.j(this.H, vVar.H) && af.w.j(this.I, vVar.I))) {
                List list6 = this.K;
                if (list6 == null && list3 == null) {
                    return true;
                }
                return list6 != null && list3 != null && list6.containsAll(list3) && list3.containsAll(list6);
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f18872d, this.f18873e, Integer.valueOf(Arrays.hashCode(this.f18874i)), this.f18875v, this.f18876w, this.f18877x, this.f18878y, this.E, this.F, this.G, this.H, this.I, this.K});
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f18872d);
        String strValueOf2 = String.valueOf(this.f18873e);
        String strB = ff.c.b(this.f18874i);
        String strValueOf3 = String.valueOf(this.f18875v);
        String strValueOf4 = String.valueOf(this.f18877x);
        String strValueOf5 = String.valueOf(this.f18878y);
        String strValueOf6 = String.valueOf(this.F);
        String strValueOf7 = String.valueOf(this.G);
        String strValueOf8 = String.valueOf(this.H);
        String strValueOf9 = String.valueOf(this.K);
        StringBuilder sbU = a3.e.u("PublicKeyCredentialCreationOptions{\n rp=", strValueOf, ", \n user=", strValueOf2, ", \n challenge=");
        a3.e.A(sbU, strB, ", \n parameters=", strValueOf3, ", \n timeoutSeconds=");
        sbU.append(this.f18876w);
        sbU.append(", \n excludeList=");
        sbU.append(strValueOf4);
        sbU.append(", \n authenticatorSelection=");
        sbU.append(strValueOf5);
        sbU.append(", \n requestId=");
        kk.b.r(this.E, ", \n tokenBinding=", strValueOf6, ", \n attestationConveyancePreference=", sbU);
        a3.e.A(sbU, strValueOf7, ", \n authenticationExtensions=", strValueOf8, ", \n attestationFormats=");
        return com.discord.chat.presentation.list.a.k(sbU, strValueOf9, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iT = ls.d.T(20293, parcel);
        ls.d.N(parcel, 2, this.f18872d, i7);
        ls.d.N(parcel, 3, this.f18873e, i7);
        ls.d.L(parcel, 4, this.f18874i);
        ls.d.R(parcel, 5, this.f18875v);
        Double d6 = this.f18876w;
        if (d6 != null) {
            ls.d.S(parcel, 6, 8);
            parcel.writeDouble(d6.doubleValue());
        }
        ls.d.R(parcel, 7, this.f18877x);
        ls.d.N(parcel, 8, this.f18878y, i7);
        ls.d.M(parcel, 9, this.E);
        ls.d.N(parcel, 10, this.F, i7);
        e eVar = this.G;
        ls.d.O(eVar == null ? null : eVar.f18801d, parcel, 11);
        ls.d.N(parcel, 12, this.H, i7);
        ls.d.O(this.I, parcel, 13);
        ls.d.N(parcel, 14, this.J, i7);
        ls.d.P(parcel, 15, this.K);
        ls.d.U(iT, parcel);
    }

    public v(y yVar, b0 b0Var, byte[] bArr, ArrayList arrayList, Double d6, ArrayList arrayList2, l lVar, Integer num, h0 h0Var, String str, AuthenticationExtensions authenticationExtensions, String str2, ResultReceiver resultReceiver, ArrayList arrayList3) {
        this.J = resultReceiver;
        if (str2 != null) {
            try {
                v vVarH = h(new JSONObject(str2));
                this.f18872d = vVarH.f18872d;
                this.f18873e = vVarH.f18873e;
                this.f18874i = vVarH.f18874i;
                this.f18875v = vVarH.f18875v;
                this.f18876w = vVarH.f18876w;
                this.f18877x = vVarH.f18877x;
                this.f18878y = vVarH.f18878y;
                this.E = vVarH.E;
                this.F = vVarH.F;
                this.G = vVarH.G;
                this.H = vVarH.H;
                this.K = vVarH.K;
                this.I = str2;
                return;
            } catch (JSONException e10) {
                throw new IllegalArgumentException(e10);
            }
        }
        af.w.g(yVar);
        this.f18872d = yVar;
        af.w.g(b0Var);
        this.f18873e = b0Var;
        af.w.g(bArr);
        this.f18874i = bArr;
        af.w.g(arrayList);
        this.f18875v = arrayList;
        this.f18876w = d6;
        this.f18877x = arrayList2;
        this.f18878y = lVar;
        this.E = num;
        this.F = h0Var;
        if (str != null) {
            try {
                this.G = e.a(str);
            } catch (d e11) {
                throw new IllegalArgumentException(e11);
            }
        } else {
            this.G = null;
        }
        this.H = authenticationExtensions;
        this.I = null;
        this.K = arrayList3;
    }
}

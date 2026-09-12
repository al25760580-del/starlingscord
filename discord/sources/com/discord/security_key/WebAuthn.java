package com.discord.security_key;

import ag.y0;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.util.Base64;
import android.util.JsonReader;
import com.appsflyer.AppsFlyerProperties;
import com.discord.logging.Log;
import com.facebook.react.devsupport.StackTraceHelper;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions;
import e4.e;
import ff.c;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import ls.d;
import ls.l;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;
import qf.f;
import qf.h;
import qf.i;
import qf.i0;
import qf.j;
import qf.k;
import qf.r;
import qf.u;
import qf.v;
import qf.w;
import s0.g;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 <2\u00020\u0001:\u0001<B?\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\"\u0010\b\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\u000eJ\u001f\u0010\b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\b\u0010\u0010J!\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0017\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010!\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020#2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b$\u0010%J\u001d\u0010(\u001a\b\u0012\u0004\u0012\u00020'0&2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b(\u0010)J\u0013\u0010+\u001a\u00020**\u00020\u0003H\u0002¢\u0006\u0004\b+\u0010,J'\u0010.\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b.\u0010/J\u001f\u00103\u001a\u00020\u00042\u0006\u00100\u001a\u00020\u00032\b\u00102\u001a\u0004\u0018\u000101¢\u0006\u0004\b3\u00104J\u001f\u00105\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00032\b\u00102\u001a\u0004\u0018\u000101¢\u0006\u0004\b5\u00104R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00106\u001a\u0004\b7\u00108R3\u0010\b\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\u00040\u00068\u0006¢\u0006\f\n\u0004\b\b\u00109\u001a\u0004\b:\u0010;¨\u0006="}, d2 = {"Lcom/discord/security_key/WebAuthn;", "", "Lkotlin/Function1;", "", "", "resolve", "Lkotlin/Function3;", "", "reject", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;)V", "Lcom/discord/security_key/WebAuthnDOMException;", "code", "throwable", "(Lcom/discord/security_key/WebAuthnDOMException;Ljava/lang/Throwable;)V", "message", "(Lcom/discord/security_key/WebAuthnDOMException;Ljava/lang/String;)V", "", "resultCode", "Landroid/content/Intent;", "data", "handleActivityResult", "(ILandroid/content/Intent;)V", "handleActivityOk", "(Landroid/content/Intent;)V", "requestOptions", "Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialRequestOptions;", "parsePublicKeyCredentialRequestOptions", "(Ljava/lang/String;)Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialRequestOptions;", "Landroid/util/JsonReader;", "reader", "Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialRequestOptions$Builder;", "builder", "parseRequestOptions", "(Landroid/util/JsonReader;Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialRequestOptions$Builder;)V", "Lcom/google/android/gms/fido/fido2/api/common/AuthenticationExtensions;", "parseAuthenticationExtensions", "(Landroid/util/JsonReader;)Lcom/google/android/gms/fido/fido2/api/common/AuthenticationExtensions;", "", "Lqf/w;", "parseCredentialDescriptors", "(Landroid/util/JsonReader;)Ljava/util/List;", "", "decodeBase64", "(Ljava/lang/String;)[B", "requestCode", "onActivityResult", "(IILandroid/content/Intent;)V", "creationOptionsJSON", "Landroid/app/Activity;", "currentActivity", "registerSecurityKey", "(Ljava/lang/String;Landroid/app/Activity;)V", "authenticateSecurityKey", "Lkotlin/jvm/functions/Function1;", "getResolve", "()Lkotlin/jvm/functions/Function1;", "Lkotlin/jvm/functions/Function3;", "getReject", "()Lkotlin/jvm/functions/Function3;", "Companion", "security_key_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class WebAuthn {
    private static final int BASE64_FLAG = 11;
    private static final int REQUEST_CODE_AUTHENTICATE_SK = 4002;
    private static final int REQUEST_CODE_REGISTER_SK = 4001;

    @NotNull
    private static final String TAG = "DCDSecurityKeyManager.WebAuthn";

    @NotNull
    private final Function3 reject;

    @NotNull
    private final Function1<String, Unit> resolve;

    /* JADX WARN: Multi-variable type inference failed */
    public WebAuthn(@NotNull Function1<? super String, Unit> resolve, @NotNull Function3 reject) {
        Intrinsics.checkNotNullParameter(resolve, "resolve");
        Intrinsics.checkNotNullParameter(reject, "reject");
        this.resolve = resolve;
        this.reject = reject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit authenticateSecurityKey$lambda$3(Activity activity, PendingIntent pendingIntent) throws IntentSender.SendIntentException {
        activity.startIntentSenderForResult(pendingIntent.getIntentSender(), REQUEST_CODE_AUTHENTICATE_SK, null, 0, 0, 0);
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void authenticateSecurityKey$lambda$5(WebAuthn webAuthn, Exception it) {
        Intrinsics.checkNotNullParameter(it, "it");
        webAuthn.reject(WebAuthnDOMException.UnknownError, it);
    }

    private final byte[] decodeBase64(String str) {
        byte[] bArrDecode = Base64.decode(str, 11);
        Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
        return bArrDecode;
    }

    private final void handleActivityOk(Intent data) {
        JSONObject jSONObject = null;
        byte[] byteArrayExtra = data != null ? data.getByteArrayExtra("FIDO2_CREDENTIAL_EXTRA") : null;
        if (byteArrayExtra == null) {
            reject(WebAuthnDOMException.SyntaxError, "credential data missing in response");
            return;
        }
        u uVar = (u) l.p(byteArrayExtra, u.CREATOR);
        Intrinsics.checkNotNullExpressionValue(uVar, "deserializeFromBytes(...)");
        k kVarH = uVar.h();
        if (!(kVarH instanceof h) && !(kVarH instanceof i)) {
            if (kVarH instanceof j) {
                WebAuthnDOMException webAuthnDOMException = WebAuthnDOMException.UnknownError;
                k kVarH2 = uVar.h();
                Intrinsics.checkNotNull(kVarH2, "null cannot be cast to non-null type com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse");
                String str = ((j) kVarH2).f18827e;
                if (str == null) {
                    str = "Unknown error";
                }
                reject(webAuthnDOMException, str);
                return;
            }
            return;
        }
        Function1<String, Unit> function1 = this.resolve;
        j jVar = uVar.f18868x;
        y0 y0Var = uVar.f18865i;
        try {
            JSONObject jSONObject2 = new JSONObject();
            if (y0Var != null && y0Var.m().length > 0) {
                jSONObject2.put("rawId", c.b(y0Var.m()));
            }
            String str2 = uVar.E;
            if (str2 != null) {
                jSONObject2.put("authenticatorAttachment", str2);
            }
            String str3 = uVar.f18864e;
            if (str3 != null && jVar == null) {
                jSONObject2.put("type", str3);
            }
            String str4 = uVar.f18863d;
            if (str4 != null) {
                jSONObject2.put(StackTraceHelper.ID_KEY, str4);
            }
            String str5 = "response";
            h hVar = uVar.f18867w;
            boolean z5 = true;
            if (hVar != null) {
                jSONObject = hVar.h();
            } else {
                i iVar = uVar.f18866v;
                if (iVar != null) {
                    jSONObject = iVar.h();
                } else {
                    z5 = false;
                    if (jVar != null) {
                        try {
                            jSONObject = new JSONObject();
                            jSONObject.put("code", jVar.f18826d.f18855d);
                            String str6 = jVar.f18827e;
                            if (str6 != null) {
                                jSONObject.put("message", str6);
                            }
                            str5 = "error";
                        } catch (JSONException e10) {
                            throw new RuntimeException("Error encoding AuthenticatorErrorResponse to JSON object", e10);
                        }
                    }
                }
            }
            if (jSONObject != null) {
                jSONObject2.put(str5, jSONObject);
            }
            f fVar = uVar.f18869y;
            if (fVar != null) {
                jSONObject2.put("clientExtensionResults", fVar.h());
            } else if (z5) {
                jSONObject2.put("clientExtensionResults", new JSONObject());
            }
            String string = jSONObject2.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toJson(...)");
            function1.invoke(string);
        } catch (JSONException e11) {
            throw new RuntimeException("Error encoding PublicKeyCredential to JSON object", e11);
        }
    }

    private final void handleActivityResult(int resultCode, Intent data) {
        if (resultCode == -1) {
            handleActivityOk(data);
        } else {
            if (resultCode != 0) {
                return;
            }
            reject(WebAuthnDOMException.NotAllowedError, "User cancelled the activity");
        }
    }

    private final AuthenticationExtensions parseAuthenticationExtensions(JsonReader reader) throws IOException {
        Log.i$default(Log.INSTANCE, TAG, "parseAuthenticationExtensions: Parsing authentication extensions...", (Throwable) null, 4, (Object) null);
        e eVar = new e((char) 0, 19);
        reader.beginObject();
        while (reader.hasNext()) {
            String strNextName = reader.nextName();
            if (strNextName != null) {
                int iHashCode = strNextName.hashCode();
                if (iHashCode != 116204) {
                    if (iHashCode != 93029116) {
                        if (iHashCode == 757680504 && strNextName.equals("largeBlob")) {
                            Log.w$default(Log.INSTANCE, TAG, "parseAuthenticationExtensions: ... largeBlob extension: unsupported, skipping", (Throwable) null, 4, (Object) null);
                            reader.skipValue();
                        }
                    } else if (strNextName.equals(AppsFlyerProperties.APP_ID)) {
                        String strNextString = reader.nextString();
                        Log.i$default(Log.INSTANCE, TAG, g.e("parseAuthenticationExtensions: ... appid extension: `", strNextString, "`"), (Throwable) null, 4, (Object) null);
                        eVar.f7971e = new r(strNextString);
                        Intrinsics.checkNotNull(eVar);
                    }
                } else if (strNextName.equals("uvm")) {
                    i0 i0Var = new i0(reader.nextBoolean());
                    Log.i$default(Log.INSTANCE, TAG, "parseAuthenticationExtensions: ... uvm extension: `" + i0Var + "`", (Throwable) null, 4, (Object) null);
                    eVar.f7972i = i0Var;
                    Intrinsics.checkNotNull(eVar);
                }
            }
            Log.w$default(Log.INSTANCE, TAG, g.e("parseAuthenticationExtensions: Found unrecognized extension: `", strNextName, "`"), (Throwable) null, 4, (Object) null);
            reader.skipValue();
        }
        reader.endObject();
        AuthenticationExtensions authenticationExtensions = new AuthenticationExtensions((r) eVar.f7971e, null, (i0) eVar.f7972i, null, null, null, null, null, null, null, null, null, null);
        Intrinsics.checkNotNullExpressionValue(authenticationExtensions, "build(...)");
        return authenticationExtensions;
    }

    private final List<w> parseCredentialDescriptors(JsonReader reader) throws IOException {
        Log.i$default(Log.INSTANCE, TAG, "parseCredentialDescriptors: Processing credential descriptors...", (Throwable) null, 4, (Object) null);
        ArrayList arrayList = new ArrayList();
        reader.beginArray();
        while (reader.hasNext()) {
            Log.i$default(Log.INSTANCE, TAG, "parseCredentialDescriptors: Found new descriptor", (Throwable) null, 4, (Object) null);
            reader.beginObject();
            byte[] bArrDecodeBase64 = null;
            while (reader.hasNext()) {
                String strNextName = reader.nextName();
                if (strNextName != null) {
                    int iHashCode = strNextName.hashCode();
                    if (iHashCode != -1717834134) {
                        if (iHashCode != 3355) {
                            if (iHashCode == 3575610 && strNextName.equals("type")) {
                                Log.w$default(Log.INSTANCE, TAG, "parseCredentialDescriptors: ... skipping unsupported field `type`", (Throwable) null, 4, (Object) null);
                                reader.skipValue();
                            }
                        } else if (strNextName.equals(StackTraceHelper.ID_KEY)) {
                            String strNextString = reader.nextString();
                            Log.i$default(Log.INSTANCE, TAG, g.e("parseCredentialDescriptors: ... id: `", strNextString, "`"), (Throwable) null, 4, (Object) null);
                            Intrinsics.checkNotNull(strNextString);
                            bArrDecodeBase64 = decodeBase64(strNextString);
                        }
                    } else if (strNextName.equals("transports")) {
                        Log.w$default(Log.INSTANCE, TAG, "parseCredentialDescriptors: ... skipping unsupported field `transports`", (Throwable) null, 4, (Object) null);
                        reader.skipValue();
                    } else {
                        Log.w$default(Log.INSTANCE, TAG, g.e("parseCredentialDescriptors: ... skipping unrecognized field `", strNextName, "`"), (Throwable) null, 4, (Object) null);
                        reader.skipValue();
                    }
                }
                Log.w$default(Log.INSTANCE, TAG, g.e("parseCredentialDescriptors: ... skipping unrecognized field `", strNextName, "`"), (Throwable) null, 4, (Object) null);
                reader.skipValue();
            }
            reader.endObject();
            Intrinsics.checkNotNull(bArrDecodeBase64);
            arrayList.add(new w("public-key", bArrDecodeBase64, null));
        }
        reader.endArray();
        Log.i$default(Log.INSTANCE, TAG, g.d(arrayList.size(), "parseCredentialDescriptors: Processed ", " descriptors"), (Throwable) null, 4, (Object) null);
        return arrayList;
    }

    private final PublicKeyCredentialRequestOptions parsePublicKeyCredentialRequestOptions(String requestOptions) throws IOException {
        Log.i$default(Log.INSTANCE, TAG, a3.e.l("parsePublicKeyCredentialRequestOptions: ", requestOptions), (Throwable) null, 4, (Object) null);
        PublicKeyCredentialRequestOptions.Builder builder = new PublicKeyCredentialRequestOptions.Builder();
        JsonReader jsonReader = new JsonReader(new StringReader(requestOptions));
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                if (Intrinsics.areEqual(strNextName, "publicKey")) {
                    parseRequestOptions(jsonReader, builder);
                } else {
                    Log.w$default(Log.INSTANCE, TAG, "parsePublicKeyCredentialRequestOptions: Found unexpected key in request options: `" + strNextName + "`, skipping", (Throwable) null, 4, (Object) null);
                    jsonReader.skipValue();
                }
            }
            jsonReader.endObject();
            Unit unit = Unit.f14616a;
            jsonReader.close();
            PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions = new PublicKeyCredentialRequestOptions(builder.f5956a, builder.f5957b, builder.f5958c, builder.f5959d, null, null, null, builder.f5960e, null, null, null);
            Intrinsics.checkNotNullExpressionValue(publicKeyCredentialRequestOptions, "build(...)");
            return publicKeyCredentialRequestOptions;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                d.k(jsonReader, th2);
                throw th3;
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final void parseRequestOptions(JsonReader reader, PublicKeyCredentialRequestOptions.Builder builder) throws IOException {
        reader.beginObject();
        Log.i$default(Log.INSTANCE, TAG, "Processing request options...", (Throwable) null, 4, (Object) null);
        while (reader.hasNext()) {
            String strNextName = reader.nextName();
            if (strNextName != null) {
                switch (strNextName.hashCode()) {
                    case -1809421292:
                        if (strNextName.equals("extensions")) {
                            builder.f5960e = parseAuthenticationExtensions(reader);
                            Intrinsics.checkNotNullExpressionValue(builder, "setAuthenticationExtensions(...)");
                        }
                        break;
                    case -1313911455:
                        if (strNextName.equals("timeout")) {
                            double dNextDouble = reader.nextDouble();
                            Log.i$default(Log.INSTANCE, TAG, "parseRequestOptions: timeout: `" + dNextDouble + "`", (Throwable) null, 4, (Object) null);
                            builder.f5957b = Double.valueOf(dNextDouble / ((double) 1000));
                            Intrinsics.checkNotNull(builder);
                        }
                        break;
                    case 3506169:
                        if (strNextName.equals("rpId")) {
                            String strNextString = reader.nextString();
                            Log.i$default(Log.INSTANCE, TAG, g.e("parseRequestOptions: rpId: `", strNextString, "`"), (Throwable) null, 4, (Object) null);
                            builder.getClass();
                            af.w.g(strNextString);
                            builder.f5958c = strNextString;
                            Intrinsics.checkNotNull(builder);
                        }
                        break;
                    case 493711347:
                        if (strNextName.equals("allowCredentials")) {
                            builder.f5959d = parseCredentialDescriptors(reader);
                            Intrinsics.checkNotNullExpressionValue(builder, "setAllowList(...)");
                        }
                        break;
                    case 1402633315:
                        if (strNextName.equals("challenge")) {
                            String strNextString2 = reader.nextString();
                            Log.i$default(Log.INSTANCE, TAG, g.e("parseRequestOptions: challenge: `", strNextString2, "`"), (Throwable) null, 4, (Object) null);
                            Intrinsics.checkNotNull(strNextString2);
                            byte[] bArrDecodeBase64 = decodeBase64(strNextString2);
                            builder.getClass();
                            af.w.g(bArrDecodeBase64);
                            builder.f5956a = bArrDecodeBase64;
                            Intrinsics.checkNotNull(builder);
                        }
                        break;
                    case 2036710790:
                        if (strNextName.equals("userVerification")) {
                            Log.w$default(Log.INSTANCE, TAG, g.e("parseRequestOptions: userVerification: `", reader.nextString(), "`, skipping"), (Throwable) null, 4, (Object) null);
                            Unit unit = Unit.f14616a;
                        }
                        break;
                    default:
                        break;
                }
            }
            Log.w$default(Log.INSTANCE, TAG, g.e("parseRequestOptions: Found unrecognized option: `", strNextName, "`, skipping"), (Throwable) null, 4, (Object) null);
            reader.skipValue();
            Unit unit2 = Unit.f14616a;
        }
        reader.endObject();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit registerSecurityKey$lambda$0(Activity activity, PendingIntent pendingIntent) throws IntentSender.SendIntentException {
        activity.startIntentSenderForResult(pendingIntent.getIntentSender(), 4001, null, 0, 0, 0);
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void registerSecurityKey$lambda$2(WebAuthn webAuthn, Exception it) {
        Intrinsics.checkNotNullParameter(it, "it");
        webAuthn.reject(WebAuthnDOMException.UnknownError, it);
    }

    private final void reject(WebAuthnDOMException code, Throwable throwable) {
        this.reject.invoke(code.name(), null, throwable);
    }

    public final void authenticateSecurityKey(@NotNull String requestOptions, Activity currentActivity) throws IOException {
        Intrinsics.checkNotNullParameter(requestOptions, "requestOptions");
        if (currentActivity == null) {
            reject(WebAuthnDOMException.UnknownError, "authenticateSecurityKey called with null activity");
            return;
        }
        pf.a aVarA = nf.a.a(currentActivity);
        Intrinsics.checkNotNullExpressionValue(aVarA, "getFido2ApiClient(...)");
        PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions = parsePublicKeyCredentialRequestOptions(requestOptions);
        lh.d dVarF = lh.d.f();
        dVarF.f15091d = new op.c(aVarA, publicKeyCredentialRequestOptions, 3);
        dVarF.f15089b = 5408;
        ig.l lVarB = aVarA.b(0, dVarF.e());
        Intrinsics.checkNotNullExpressionValue(lVarB, "getSignPendingIntent(...)");
        lVarB.d(new app.rive.runtime.kotlin.core.a(14, new a(currentActivity, 0)));
        lVarB.o(new b(this, 0));
    }

    @NotNull
    public final Function3 getReject() {
        return this.reject;
    }

    @NotNull
    public final Function1<String, Unit> getResolve() {
        return this.resolve;
    }

    public final void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == 4001 || requestCode == REQUEST_CODE_AUTHENTICATE_SK) {
            handleActivityResult(resultCode, data);
        }
    }

    public final void registerSecurityKey(@NotNull String creationOptionsJSON, Activity currentActivity) {
        Intrinsics.checkNotNullParameter(creationOptionsJSON, "creationOptionsJSON");
        if (currentActivity == null) {
            reject(WebAuthnDOMException.UnknownError, "registerSecurityKey called with null activity");
            return;
        }
        pf.a aVarA = nf.a.a(currentActivity);
        Intrinsics.checkNotNullExpressionValue(aVarA, "getFido2ApiClient(...)");
        String string = new JSONObject(new JSONTokener(creationOptionsJSON)).getJSONObject("publicKey").toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        v vVar = new v(string);
        lh.d dVarF = lh.d.f();
        dVarF.f15091d = new pf.b(aVarA, vVar);
        dVarF.f15089b = 5407;
        ig.l lVarB = aVarA.b(0, dVarF.e());
        Intrinsics.checkNotNullExpressionValue(lVarB, "getRegisterPendingIntent(...)");
        lVarB.d(new app.rive.runtime.kotlin.core.a(15, new a(currentActivity, 1)));
        lVarB.o(new b(this, 1));
    }

    private final void reject(WebAuthnDOMException code, String message) {
        this.reject.invoke(code.name(), message, null);
    }
}

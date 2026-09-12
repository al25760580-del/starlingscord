package u1;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.ResultReceiver;
import android.util.Log;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import e4.f;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import mq.t;
import n1.h;
import o1.j;
import o1.l;
import o1.m;
import o1.o;
import org.json.JSONException;
import qf.k;
import qf.q;
import qf.u;
import re.g;
import v1.i;
import ye.e;

/* JADX INFO: loaded from: classes.dex */
public final class c extends ResultReceiver {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f20915d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t1.d f20916e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(t1.d dVar, Handler handler, int i7) {
        super(handler);
        this.f20915d = i7;
        this.f20916e = dVar;
    }

    /* JADX WARN: Code duplicated, block: B:77:0x017b  */
    /* JADX WARN: Type inference failed for: r4v11, types: [T, o1.m] */
    /* JADX WARN: Type inference failed for: r4v13, types: [T, o1.j] */
    /* JADX WARN: Type inference failed for: r4v6, types: [T, o1.o] */
    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i7, Bundle resultData) {
        o1.d bVar;
        Executor executor;
        n1.c cVarO;
        Bundle bundle;
        o1.d dVarL;
        Executor executor2;
        h hVar;
        Executor executor3;
        h hVar2;
        int i10 = this.f20915d;
        int i11 = 7;
        int i12 = 8;
        t1.d dVar = this.f20916e;
        switch (i10) {
            case 0:
                Intrinsics.checkNotNullParameter(resultData, "resultData");
                t1.a aVar = t1.d.f20573a;
                d dVar2 = (d) dVar;
                if (t1.d.b(resultData, new t(4), dVar2.g(), dVar2.f(), dVar2.f20920h)) {
                    return;
                }
                int i13 = resultData.getInt("ACTIVITY_REQUEST_CODE");
                Intent intent = (Intent) resultData.getParcelable("RESULT_DATA");
                int i14 = t1.d.f20575c;
                if (i13 != i14) {
                    Log.w("BeginSignIn", "Returned request code " + i14 + " which  does not match what was given " + i13);
                    return;
                }
                if (t1.c.b(i7, new ol.c(2), new kotlin.collections.a(15, dVar2), dVar2.f20920h)) {
                    return;
                }
                try {
                    g gVarC = f.E(dVar2.f20917e).c(intent);
                    Intrinsics.checkNotNullExpressionValue(gVarC, "getSignInCredentialFromIntent(...)");
                    t1.c.a(dVar2.f20920h, new m7.a(i11, dVar2, dVar2.e(gVarC)));
                    return;
                } catch (l e10) {
                    CancellationSignal cancellationSignal = dVar2.f20920h;
                    a onResultOrException = new a(dVar2, e10, 1);
                    Intrinsics.checkNotNullParameter(onResultOrException, "onResultOrException");
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (s1.f.a(cancellationSignal)) {
                        return;
                    }
                    onResultOrException.invoke();
                    return;
                } catch (e e11) {
                    Ref.ObjectRef objectRef = new Ref.ObjectRef();
                    objectRef.element = new o(e11.getMessage());
                    int i15 = e11.f23289d.f5936d;
                    if (i15 == 16) {
                        objectRef.element = new j(e11.getMessage());
                    } else if (t1.d.f20574b.contains(Integer.valueOf(i15))) {
                        objectRef.element = new m(e11.getMessage());
                    }
                    CancellationSignal cancellationSignal2 = dVar2.f20920h;
                    m7.a onResultOrException2 = new m7.a(i12, dVar2, objectRef);
                    Intrinsics.checkNotNullParameter(onResultOrException2, "onResultOrException");
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (s1.f.a(cancellationSignal2)) {
                        return;
                    }
                    onResultOrException2.invoke();
                    return;
                } catch (Throwable th2) {
                    o oVar = new o(th2.getMessage());
                    CancellationSignal cancellationSignal3 = dVar2.f20920h;
                    m7.a onResultOrException3 = new m7.a(9, dVar2, oVar);
                    Intrinsics.checkNotNullParameter(onResultOrException3, "onResultOrException");
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (s1.f.a(cancellationSignal3)) {
                        return;
                    }
                    onResultOrException3.invoke();
                    return;
                }
            case 1:
                Intrinsics.checkNotNullParameter(resultData, "resultData");
                t1.a aVar2 = t1.d.f20573a;
                t tVar = new t(5);
                v1.h hVar3 = (v1.h) dVar;
                Executor executor4 = hVar3.f21364g;
                if (executor4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("executor");
                    executor4 = null;
                }
                h hVar4 = hVar3.f21363f;
                if (hVar4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("callback");
                    hVar4 = null;
                }
                if (t1.d.b(resultData, tVar, executor4, hVar4, hVar3.f21365h)) {
                    return;
                }
                int i16 = resultData.getInt("ACTIVITY_REQUEST_CODE");
                Intent intent2 = (Intent) resultData.getParcelable("RESULT_DATA");
                int i17 = t1.d.f20575c;
                if (i16 != i17) {
                    Log.w("CreatePublicKey", "Returned request code " + i17 + " does not match what was given " + i16);
                    return;
                }
                if (t1.d.c(i7, new ol.c(3), new kotlin.collections.a(16, hVar3), hVar3.f21365h)) {
                    return;
                }
                byte[] byteArrayExtra = intent2 != null ? intent2.getByteArrayExtra("FIDO2_CREDENTIAL_EXTRA") : null;
                if (byteArrayExtra == null) {
                    s1.f fVar = CredentialProviderPlayServicesImpl.Companion;
                    CancellationSignal cancellationSignal4 = hVar3.f21365h;
                    fVar.getClass();
                    if (s1.f.a(cancellationSignal4)) {
                        return;
                    }
                    Executor executor5 = hVar3.f21364g;
                    if (executor5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("executor");
                        executor = null;
                    } else {
                        executor = executor5;
                    }
                    executor.execute(new v1.e(hVar3, 1));
                    return;
                }
                u cred = (u) ls.l.p(byteArrayExtra, u.CREATOR);
                Intrinsics.checkNotNullExpressionValue(cred, "deserializeFromBytes(...)");
                LinkedHashMap linkedHashMap = i.f21367a;
                Intrinsics.checkNotNullParameter(cred, "cred");
                k kVarH = cred.h();
                Intrinsics.checkNotNullExpressionValue(kVarH, "getResponse(...)");
                if (kVarH instanceof qf.j) {
                    qf.j jVar = (qf.j) kVarH;
                    q qVar = jVar.f18826d;
                    Intrinsics.checkNotNullExpressionValue(qVar, "getErrorCode(...)");
                    p1.a aVar3 = (p1.a) i.f21367a.get(qVar);
                    String str = jVar.f18827e;
                    if (aVar3 == null) {
                        bVar = new q1.a(new p1.a(26), a3.e.l("unknown fido gms exception - ", str));
                    } else {
                        bVar = (qVar == q.NOT_ALLOWED_ERR && str != null && StringsKt.D(str, "Unable to get sync account", false)) ? new o1.b("Passkey registration was cancelled by the user.") : new q1.a(aVar3, str);
                    }
                } else {
                    bVar = null;
                }
                if (bVar != null) {
                    CancellationSignal cancellationSignal5 = hVar3.f21365h;
                    v1.d onResultOrException4 = new v1.d(hVar3, bVar, 1);
                    Intrinsics.checkNotNullParameter(onResultOrException4, "onResultOrException");
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (s1.f.a(cancellationSignal5)) {
                        return;
                    }
                    onResultOrException4.invoke();
                    return;
                }
                try {
                    n1.f fVarF = v1.h.f(cred);
                    CancellationSignal cancellationSignal6 = hVar3.f21365h;
                    m7.a onResultOrException5 = new m7.a(10, hVar3, fVarF);
                    Intrinsics.checkNotNullParameter(onResultOrException5, "onResultOrException");
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (s1.f.a(cancellationSignal6)) {
                        return;
                    }
                    onResultOrException5.invoke();
                    return;
                } catch (JSONException e12) {
                    CancellationSignal cancellationSignal7 = hVar3.f21365h;
                    v1.f onResultOrException6 = new v1.f(hVar3, e12, 0);
                    Intrinsics.checkNotNullParameter(onResultOrException6, "onResultOrException");
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (s1.f.a(cancellationSignal7)) {
                        return;
                    }
                    onResultOrException6.invoke();
                    return;
                } catch (Throwable th3) {
                    CancellationSignal cancellationSignal8 = hVar3.f21365h;
                    v1.g onResultOrException7 = new v1.g(hVar3, th3, 0);
                    Intrinsics.checkNotNullParameter(onResultOrException7, "onResultOrException");
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (s1.f.a(cancellationSignal8)) {
                        return;
                    }
                    onResultOrException7.invoke();
                    return;
                }
            case 2:
                Intrinsics.checkNotNullParameter(resultData, "resultData");
                t1.a aVar4 = t1.d.f20573a;
                int i18 = 6;
                t tVar2 = new t(6);
                w1.e eVar = (w1.e) dVar;
                Executor executor6 = eVar.f21995g;
                if (executor6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("executor");
                    executor6 = null;
                }
                h hVar5 = eVar.f21994f;
                if (hVar5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("callback");
                    hVar5 = null;
                }
                if (t1.d.b(resultData, tVar2, executor6, hVar5, eVar.f21996h)) {
                    return;
                }
                int i19 = resultData.getInt("ACTIVITY_REQUEST_CODE");
                Intent intent3 = (Intent) yk.a.p(resultData, "RESULT_DATA", Intent.class);
                int i20 = t1.d.f20575c;
                if (i19 != i20) {
                    Log.w("CreatePublicKey", "Returned request code " + i20 + " does not match what was given " + i19);
                    return;
                }
                if (t1.d.c(i7, new ol.c(i18), new kotlin.collections.a(19, eVar), eVar.f21996h)) {
                    return;
                }
                if (intent3 == null) {
                    CancellationSignal cancellationSignal9 = eVar.f21996h;
                    w1.d onResultOrException8 = new w1.d(eVar, 0);
                    Intrinsics.checkNotNullParameter(onResultOrException8, "onResultOrException");
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (s1.f.a(cancellationSignal9)) {
                        return;
                    }
                    onResultOrException8.invoke();
                    return;
                }
                Intrinsics.checkNotNullParameter("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", "type");
                Intrinsics.checkNotNullParameter(intent3, "intent");
                int i21 = Build.VERSION.SDK_INT;
                if (i21 >= 34) {
                    cVarO = a2.a.b(intent3, "androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL");
                } else {
                    Intrinsics.checkNotNullParameter(intent3, "intent");
                    Bundle bundle2 = intent3.getBundleExtra("android.service.credentials.extra.CREATE_CREDENTIAL_RESPONSE");
                    if (bundle2 == null) {
                        cVarO = null;
                    } else {
                        Intrinsics.checkNotNullParameter(bundle2, "bundle");
                        String string = bundle2.getString("androidx.credentials.provider.extra.CREATE_CREDENTIAL_RESPONSE_TYPE");
                        if (string == null || (bundle = bundle2.getBundle("androidx.credentials.provider.extra.CREATE_CREDENTIAL_REQUEST_DATA")) == null) {
                            cVarO = null;
                        } else {
                            cVarO = ls.l.o(string, bundle);
                        }
                    }
                }
                if (cVarO != null) {
                    CancellationSignal cancellationSignal10 = eVar.f21996h;
                    m7.a onResultOrException9 = new m7.a(11, eVar, cVarO);
                    Intrinsics.checkNotNullParameter(onResultOrException9, "onResultOrException");
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (s1.f.a(cancellationSignal10)) {
                        return;
                    }
                    onResultOrException9.invoke();
                    return;
                }
                Intrinsics.checkNotNullParameter(intent3, "intent");
                if (i21 >= 34) {
                    dVarL = a2.a.a(intent3);
                } else {
                    Intrinsics.checkNotNullParameter(intent3, "intent");
                    int i22 = o1.d.f17099d;
                    Bundle bundle3 = intent3.getBundleExtra("android.service.credentials.extra.CREATE_CREDENTIAL_EXCEPTION");
                    if (bundle3 == null) {
                        dVarL = null;
                    } else {
                        Intrinsics.checkNotNullParameter(bundle3, "bundle");
                        String string2 = bundle3.getString("androidx.credentials.provider.extra.CREATE_CREDENTIAL_EXCEPTION_TYPE");
                        if (string2 == null) {
                            throw new IllegalArgumentException("Bundle was missing exception type.");
                        }
                        dVarL = com.facebook.imagepipeline.nativecode.c.L(bundle3.getCharSequence("androidx.credentials.provider.extra.CREATE_CREDENTIAL_EXCEPTION_MESSAGE"), string2);
                    }
                }
                CancellationSignal cancellationSignal11 = eVar.f21996h;
                m7.a onResultOrException10 = new m7.a(12, eVar, dVarL);
                Intrinsics.checkNotNullParameter(onResultOrException10, "onResultOrException");
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (s1.f.a(cancellationSignal11)) {
                    return;
                }
                onResultOrException10.invoke();
                return;
            case 3:
                Intrinsics.checkNotNullParameter(resultData, "resultData");
                t1.a aVar5 = t1.d.f20573a;
                t tVar3 = new t(7);
                x1.a aVar6 = (x1.a) dVar;
                Executor executor7 = aVar6.f22589g;
                if (executor7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("executor");
                    executor7 = null;
                }
                h hVar6 = aVar6.f22588f;
                if (hVar6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("callback");
                    hVar6 = null;
                }
                if (t1.d.b(resultData, tVar3, executor7, hVar6, aVar6.f22590h)) {
                    return;
                }
                int i23 = resultData.getInt("ACTIVITY_REQUEST_CODE");
                Intent intent4 = (Intent) yk.a.p(resultData, "RESULT_DATA", Intent.class);
                Executor executor8 = aVar6.f22589g;
                if (executor8 != null) {
                    executor2 = executor8;
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("executor");
                    executor2 = null;
                }
                h hVar7 = aVar6.f22588f;
                if (hVar7 != null) {
                    hVar = hVar7;
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("callback");
                    hVar = null;
                }
                a.a.p(i23, i7, intent4, executor2, hVar, aVar6.f22590h);
                return;
            default:
                Intrinsics.checkNotNullParameter(resultData, "resultData");
                t1.a aVar7 = t1.d.f20573a;
                t tVar4 = new t(8);
                y1.a aVar8 = (y1.a) dVar;
                Executor executor9 = aVar8.f23131g;
                if (executor9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("executor");
                    executor9 = null;
                }
                h hVar8 = aVar8.f23130f;
                if (hVar8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("callback");
                    hVar8 = null;
                }
                if (t1.d.b(resultData, tVar4, executor9, hVar8, aVar8.f23132h)) {
                    return;
                }
                int i24 = resultData.getInt("ACTIVITY_REQUEST_CODE");
                Intent intent5 = (Intent) yk.a.p(resultData, "RESULT_DATA", Intent.class);
                Executor executor10 = aVar8.f23131g;
                if (executor10 != null) {
                    executor3 = executor10;
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("executor");
                    executor3 = null;
                }
                h hVar9 = aVar8.f23130f;
                if (hVar9 != null) {
                    hVar2 = hVar9;
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("callback");
                    hVar2 = null;
                }
                a.a.p(i24, i7, intent5, executor3, hVar2, aVar8.f23132h);
                return;
        }
    }
}

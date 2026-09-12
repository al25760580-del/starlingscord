package io.sentry.android.core;

import android.os.CancellationSignal;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import com.facebook.react.bridge.ReadableMap;
import io.sentry.Hint;
import io.sentry.IScope;
import io.sentry.SentryEvent;
import io.sentry.b4;
import io.sentry.j5;
import io.sentry.m3;
import io.sentry.o3;
import io.sentry.r3;
import io.sentry.react.RNSentryModuleImpl;
import io.sentry.w5;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.MatchGroup;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class x implements r3, o3, j5, b4, m3, ig.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f12440d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f12441e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f12442i;

    public /* synthetic */ x(int i7, Object obj, Object obj2) {
        this.f12440d = i7;
        this.f12441e = obj;
        this.f12442i = obj2;
    }

    @Override // io.sentry.j5
    public SentryEvent a(SentryEvent sentryEvent, Hint hint) {
        return ((RNSentryModuleImpl) this.f12441e).lambda$getSentryAndroidOptions$3((SentryAndroidOptions) this.f12442i, sentryEvent, hint);
    }

    @Override // io.sentry.o3
    public void b(io.sentry.f1 f1Var) {
        io.sentry.android.core.internal.gestures.f fVar = (io.sentry.android.core.internal.gestures.f) this.f12441e;
        IScope iScope = (IScope) this.f12442i;
        if (f1Var == fVar.f12238w) {
            iScope.r();
        }
    }

    @Override // io.sentry.b4
    public void c(w5 w5Var) {
        ((RNSentryModuleImpl) this.f12441e).lambda$initNativeSdk$1((ReadableMap) this.f12442i, (SentryAndroidOptions) w5Var);
    }

    @Override // io.sentry.m3
    public void d(e4.m mVar) {
        IScope iScope = (IScope) this.f12441e;
        w5 w5Var = (w5) this.f12442i;
        io.sentry.c cVar = (io.sentry.c) mVar.f7995v;
        if (cVar.f12506e) {
            e4.m mVarZ = iScope.z();
            io.sentry.protocol.v vVarY = iScope.y();
            cVar.b("sentry-trace_id", ((io.sentry.protocol.v) mVarZ.f7993e).toString());
            cVar.b("sentry-public_key", w5Var.retrieveParsedDsn().f13285b);
            cVar.b("sentry-release", w5Var.getRelease());
            cVar.b("sentry-environment", w5Var.getEnvironment());
            if (!io.sentry.protocol.v.f13055e.equals(vVarY)) {
                cVar.b("sentry-replay_id", vVarY.toString());
            }
            cVar.b("sentry-transaction", null);
            if (cVar.f12506e) {
                cVar.f12504c = null;
            }
            cVar.b("sentry-sampled", null);
            cVar.f12506e = false;
        }
    }

    @Override // io.sentry.r3
    public void g(IScope iScope) {
        switch (this.f12440d) {
            case 1:
                iScope.M(new ac.b((io.sentry.android.core.internal.gestures.f) this.f12441e, iScope, (io.sentry.f1) this.f12442i, 10));
                break;
            case 2:
            default:
                RNSentryModuleImpl.lambda$setContext$9((ReadableMap) this.f12441e, (String) this.f12442i, iScope);
                break;
            case 3:
                RNSentryModuleImpl.lambda$setUser$5((ReadableMap) this.f12441e, (ReadableMap) this.f12442i, iScope);
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:67:0x0161  */
    /* JADX WARN: Type inference failed for: r1v10, types: [T, q1.c] */
    /* JADX WARN: Type inference failed for: r3v5, types: [T, q1.c] */
    @Override // ig.c
    public void onFailure(Exception e10) {
        o1.l jVar;
        o1.d eVar;
        String message;
        kotlin.text.m mVarB;
        MatchGroup matchGroupB;
        String str;
        int i7 = this.f12440d;
        int i10 = 0;
        Object obj = this.f12442i;
        Object obj2 = this.f12441e;
        switch (i7) {
            case 8:
                u1.d dVar = (u1.d) obj2;
                CancellationSignal cancellationSignal = (CancellationSignal) obj;
                Intrinsics.checkNotNullParameter(e10, "e");
                String str2 = ((e10 instanceof ye.e) && t1.d.f20574b.contains(Integer.valueOf(((ye.e) e10).f23289d.f5936d))) ? "GET_INTERRUPTED" : "GET_NO_CREDENTIALS";
                String str3 = "During begin sign in, failure response from one tap: " + e10.getMessage();
                int iHashCode = str2.hashCode();
                if (iHashCode != -1567968963) {
                    if (iHashCode != -154594663) {
                        if (iHashCode == 1996705159 && str2.equals("GET_NO_CREDENTIALS")) {
                            jVar = new o1.q(str3);
                        } else {
                            jVar = new o1.o(str3);
                        }
                    } else if (str2.equals("GET_INTERRUPTED")) {
                        jVar = new o1.m(str3);
                    } else {
                        jVar = new o1.o(str3);
                    }
                } else if (str2.equals("GET_CANCELED_TAG")) {
                    jVar = new o1.j(str3);
                } else {
                    jVar = new o1.o(str3);
                }
                u1.a onResultOrException = new u1.a(dVar, jVar, i10);
                Intrinsics.checkNotNullParameter(onResultOrException, "onResultOrException");
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!s1.f.a(cancellationSignal)) {
                    onResultOrException.invoke();
                    break;
                }
                break;
            case 9:
                v1.h hVar = (v1.h) obj2;
                CancellationSignal cancellationSignal2 = (CancellationSignal) obj;
                Intrinsics.checkNotNullParameter(e10, "e");
                String str4 = ((e10 instanceof ye.e) && t1.d.f20574b.contains(Integer.valueOf(((ye.e) e10).f23289d.f5936d))) ? "CREATE_INTERRUPTED" : "CREATE_UNKNOWN";
                String str5 = "During create public key credential, fido registration failure: " + e10.getMessage();
                if (Intrinsics.areEqual(str4, "CREATE_CANCELED")) {
                    eVar = new o1.b(str5);
                } else {
                    eVar = Intrinsics.areEqual(str4, "CREATE_INTERRUPTED") ? new o1.e(str5) : new o1.h(str5);
                }
                v1.d onResultOrException2 = new v1.d(hVar, eVar, i10);
                Intrinsics.checkNotNullParameter(onResultOrException2, "onResultOrException");
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!s1.f.a(cancellationSignal2)) {
                    onResultOrException2.invoke();
                    break;
                }
                break;
            default:
                Executor executor = (Executor) obj2;
                n1.h hVar2 = (n1.h) obj;
                Intrinsics.checkNotNullParameter(e10, "e");
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                int i11 = q1.c.f18584d;
                objectRef.element = new q1.c("androidx.credentials.SignalCredentialStateException.TYPE_UNKNOWN", e10.getMessage());
                if ((e10 instanceof ye.e) && ((ye.e) e10).f23289d.f5936d == 16 && (message = e10.getMessage()) != null && StringsKt.D(message, "called too frequently", false)) {
                    String message2 = e10.getMessage();
                    if (message2 != null && (mVarB = new Regex("^SignalCredentialState has been called too frequently\\. Please retry later after (\\d+) minutes\\.$").b(message2)) != null && (matchGroupB = mVarB.f14736c.b(1)) != null && (str = matchGroupB.f14703a) != null) {
                        StringsKt.toIntOrNull(str);
                    }
                    objectRef.element = new q1.c("androidx.credentials.SignalCredentialStateException.RATE_LIMIT_EXCEEDED", e10.getMessage());
                }
                executor.execute(new s1.e(hVar2, objectRef, 1));
                break;
        }
    }
}

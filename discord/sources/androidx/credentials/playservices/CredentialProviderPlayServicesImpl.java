package androidx.credentials.playservices;

import android.content.Context;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ResultReceiver;
import android.util.Log;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import com.facebook.react.runtime.p;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import io.sentry.android.core.x;
import io.sentry.x3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import lh.d;
import n1.h;
import n1.i;
import n1.j;
import n1.o;
import n1.q;
import n1.s;
import n1.v;
import o1.a;
import o1.g;
import o1.n;
import org.jetbrains.annotations.NotNull;
import rf.r;
import s1.b;
import s1.c;
import s1.f;
import xe.e;
import ye.l;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 52\u00020\u0001:\u00016B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JE\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH\u0017¢\u0006\u0004\b\u0011\u0010\u0012JE\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00132\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\fH\u0017¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u0019\u0010\u001dJ?\u0010!\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u001e2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0014\u0010\u000f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001f\u0012\u0004\u0012\u00020 0\fH\u0016¢\u0006\u0004\b!\u0010\"J3\u0010&\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020#2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%0\fH\u0016¢\u0006\u0004\b&\u0010'J\u001f\u0010(\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b(\u0010)J?\u0010*\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u001e2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0014\u0010\u000f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001f\u0012\u0004\u0012\u00020 0\fH\u0002¢\u0006\u0004\b*\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010+R(\u0010-\u001a\u00020,8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b-\u0010.\u0012\u0004\b3\u00104\u001a\u0004\b/\u00100\"\u0004\b1\u00102¨\u00067"}, d2 = {"Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl;", "Ln1/j;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Ln1/o;", "request", "Landroid/os/CancellationSignal;", "cancellationSignal", "Ljava/util/concurrent/Executor;", "executor", "Ln1/h;", "Ln1/p;", "Lo1/l;", "callback", "", "onGetCredential", "(Landroid/content/Context;Ln1/o;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Ln1/h;)V", "Ln1/b;", "Ln1/c;", "Lo1/d;", "onCreateCredential", "(Landroid/content/Context;Ln1/b;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Ln1/h;)V", "", "isAvailableOnDevice", "()Z", "", "minApkVersion", "(I)Z", "Ln1/a;", "Ljava/lang/Void;", "Lcom/margelo/nitro/rive/k;", "onClearCredential", "(Ln1/a;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Ln1/h;)V", "Ln1/v;", "Ln1/w;", "Lq1/c;", "onSignalCredentialState", "(Ln1/v;Ljava/util/concurrent/Executor;Ln1/h;)V", "isGooglePlayServicesAvailable", "(Landroid/content/Context;I)I", "runFallbackClearCredFlow", "Landroid/content/Context;", "Lxe/e;", "googleApiAvailability", "Lxe/e;", "getGoogleApiAvailability", "()Lxe/e;", "setGoogleApiAvailability", "(Lxe/e;)V", "getGoogleApiAvailability$annotations", "()V", "Companion", "s1/f", "credentials-play-services-auth"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CredentialProviderPlayServicesImpl implements j {

    @NotNull
    public static final f Companion = new f();
    public static final int MIN_GMS_APK_VERSION = 230815045;
    public static final int MIN_GMS_APK_VERSION_DIGITAL_CRED = 243100000;
    public static final int MIN_GMS_APK_VERSION_RESTORE_CRED = 242200000;
    public static final int MIN_GMS_APK_VERSION_SIGNAL_API = 254625000;
    public static final int PRE_U_MIN_GMS_APK_VERSION = 252400000;

    @NotNull
    private static final String TAG = "PlayServicesImpl";

    @NotNull
    private final Context context;

    @NotNull
    private e googleApiAvailability;

    public CredentialProviderPlayServicesImpl(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        e eVar = e.f22922d;
        Intrinsics.checkNotNullExpressionValue(eVar, "getInstance(...)");
        this.googleApiAvailability = eVar;
    }

    public static /* synthetic */ void getGoogleApiAvailability$annotations() {
    }

    private final int isGooglePlayServicesAvailable(Context context, int minApkVersion) {
        return this.googleApiAvailability.b(context, minApkVersion);
    }

    private static final Unit onClearCredential$lambda$0(Executor executor, h hVar) {
        executor.execute(new c(hVar, 2));
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onClearCredential$lambda$0$0(h hVar) {
        hVar.h(new a("clearCredentialStateAsync no provider dependencies found - please ensure the desired provider dependencies are added", "androidx.credentials.TYPE_CLEAR_CREDENTIAL_PROVIDER_CONFIGURATION_EXCEPTION"));
    }

    private static final Unit onClearCredential$lambda$1(CancellationSignal cancellationSignal, Executor executor, h hVar, Boolean bool) {
        f fVar = Companion;
        b bVar = new b(executor, hVar, 3);
        fVar.getClass();
        f.b(cancellationSignal, bVar);
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onClearCredential$lambda$1$0(Executor executor, h hVar) {
        Log.i(TAG, "Cleared restore credential successfully!");
        executor.execute(new c(hVar, 4));
        return Unit.f14616a;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, o1.a] */
    /* JADX WARN: Type inference failed for: r6v5, types: [T, o1.a] */
    private static final void onClearCredential$lambda$3(CancellationSignal cancellationSignal, Executor executor, h hVar, Exception e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        Log.w(TAG, "Clearing restore credential failed", e10);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = new a("Clear restore credential failed for unknown reason.");
        if ((e10 instanceof ye.e) && ((ye.e) e10).f23289d.f5936d == 40201) {
            objectRef.element = new a("The restore credential internal service had a failure.");
        }
        f fVar = Companion;
        com.discord.chat.presentation.list.delegate.c cVar = new com.discord.chat.presentation.list.delegate.c(executor, hVar, objectRef, 4);
        fVar.getClass();
        f.b(cancellationSignal, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onClearCredential$lambda$3$0(Executor executor, h hVar, Ref.ObjectRef objectRef) {
        executor.execute(new s1.e(hVar, objectRef, 0));
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onClearCredential$lambda$3$0$0(h hVar, Ref.ObjectRef objectRef) {
        hVar.h(objectRef.element);
    }

    private static final Unit onClearCredential$lambda$4(CancellationSignal cancellationSignal, Executor executor, h hVar, rf.c cVar) {
        f fVar = Companion;
        b bVar = new b(executor, hVar, 1);
        fVar.getClass();
        f.b(cancellationSignal, bVar);
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onClearCredential$lambda$4$0(Executor executor, h hVar) {
        Log.i(TAG, "During clear credential, signed out successfully!");
        executor.execute(new c(hVar, 0));
        return Unit.f14616a;
    }

    private static final void onClearCredential$lambda$6(CredentialProviderPlayServicesImpl credentialProviderPlayServicesImpl, n1.a aVar, CancellationSignal cancellationSignal, Executor executor, h hVar, Exception it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Log.e(TAG, "GMS Clear credential flow failed, calling fallback");
        credentialProviderPlayServicesImpl.runFallbackClearCredFlow(aVar, cancellationSignal, executor, hVar);
    }

    private static final Unit onCreateCredential$lambda$0(Executor executor, h hVar) {
        executor.execute(new c(hVar, 3));
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreateCredential$lambda$0$0(h hVar) {
        hVar.h(new g("createCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onGetCredential$lambda$0(Executor executor, h hVar) {
        executor.execute(new c(hVar, 7));
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onGetCredential$lambda$0$0(h hVar) {
        hVar.h(new n("this device requires a Google Play Services update for the given feature to be supported"));
    }

    private static final Unit onGetCredential$lambda$1(Executor executor, h hVar) {
        executor.execute(new c(hVar, 6));
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onGetCredential$lambda$1$0(h hVar) {
        hVar.h(new n("getCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onSignalCredentialState$lambda$0(h hVar) {
        hVar.h(new q1.c("this device requires a Google Play Services update for the given feature to be supported"));
    }

    private final void runFallbackClearCredFlow(n1.a request, final CancellationSignal cancellationSignal, final Executor executor, final h callback) {
        uf.b bVarE = e4.f.E(this.context);
        bVarE.f23301a.getSharedPreferences("com.google.android.gms.signin", 0).edit().clear().apply();
        Set set = l.f23310a;
        synchronized (set) {
        }
        Iterator it = set.iterator();
        if (it.hasNext()) {
            ((l) it.next()).getClass();
            throw new UnsupportedOperationException();
        }
        ze.e.a();
        d dVarF = d.f();
        dVarF.f15092e = new xe.d[]{uf.d.f21122a};
        dVarF.f15091d = new pf.b(9, bVarE);
        dVarF.f15090c = false;
        dVarF.f15089b = 1554;
        ig.l lVarB = bVarE.b(1, dVarF.e());
        mi.a aVar = new mi.a(2, new Function1() { // from class: s1.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$0(cancellationSignal, executor, callback, (Void) obj);
            }
        });
        lVarB.getClass();
        lVarB.e(ig.h.f11764a, aVar);
        lVarB.o(new x3(this, cancellationSignal, executor, callback));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit runFallbackClearCredFlow$lambda$0(CancellationSignal cancellationSignal, Executor executor, h hVar, Void r5) {
        f fVar = Companion;
        b bVar = new b(executor, hVar, 2);
        fVar.getClass();
        f.b(cancellationSignal, bVar);
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit runFallbackClearCredFlow$lambda$0$0(Executor executor, h hVar) {
        Log.i(TAG, "During clear credential, signed out successfully!");
        executor.execute(new c(hVar, 5));
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void runFallbackClearCredFlow$lambda$2(CredentialProviderPlayServicesImpl credentialProviderPlayServicesImpl, CancellationSignal cancellationSignal, Executor executor, h hVar, Exception e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        f fVar = Companion;
        com.discord.chat.presentation.list.delegate.c cVar = new com.discord.chat.presentation.list.delegate.c(e10, executor, hVar, 5);
        fVar.getClass();
        f.b(cancellationSignal, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit runFallbackClearCredFlow$lambda$2$0$0(Exception exc, Executor executor, h hVar) {
        Log.w(TAG, "During clear credential sign out failed with " + exc);
        executor.execute(new io.sentry.react.d(14, hVar, exc));
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void runFallbackClearCredFlow$lambda$2$0$0$0(h hVar, Exception exc) {
        hVar.h(new a(exc.getMessage()));
    }

    @NotNull
    public final e getGoogleApiAvailability() {
        return this.googleApiAvailability;
    }

    @Override // n1.j
    public boolean isAvailableOnDevice() {
        return isAvailableOnDevice(MIN_GMS_APK_VERSION);
    }

    public void onClearCredential(@NotNull n1.a request, CancellationSignal cancellationSignal, @NotNull Executor executor, @NotNull h callback) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Companion.getClass();
        if (!f.a(cancellationSignal)) {
            throw null;
        }
    }

    @Override // n1.j
    public void onCreateCredential(@NotNull Context context, @NotNull n1.b request, CancellationSignal cancellationSignal, @NotNull Executor executor, @NotNull h callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(callback, "callback");
        f fVar = Companion;
        fVar.getClass();
        if (f.a(cancellationSignal)) {
            return;
        }
        if (!(request instanceof n1.e)) {
            throw new UnsupportedOperationException("Create Credential request is unsupported, not password or publickeycredential");
        }
        if (!isAvailableOnDevice(PRE_U_MIN_GMS_APK_VERSION)) {
            int i7 = v1.h.j;
            Intrinsics.checkNotNullParameter(context, "context");
            new v1.h(context).g((n1.e) request, callback, executor, cancellationSignal);
            return;
        }
        int i10 = w1.e.j;
        Intrinsics.checkNotNullParameter(context, "context");
        w1.e eVar = new w1.e(context);
        n1.e request2 = (n1.e) request;
        Intrinsics.checkNotNullParameter(request2, "request");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(executor, "executor");
        eVar.f21996h = cancellationSignal;
        eVar.f21994f = callback;
        eVar.f21995g = executor;
        fVar.getClass();
        if (f.a(cancellationSignal)) {
            return;
        }
        Intrinsics.checkNotNullParameter(request2, "request");
        rf.g request3 = new rf.g("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", request2.f16214a, request2.f16215b, null, request2.f16218d, null);
        Context context2 = eVar.f21993e;
        Intrinsics.checkNotNullParameter(context2, "context");
        Intrinsics.checkNotNullParameter(context2, "context");
        sf.g gVar = new sf.g(context2, null, sf.g.k, ye.b.D, ye.h.f23298c);
        Intrinsics.checkNotNullParameter(request3, "request");
        d dVarF = d.f();
        dVarF.f15092e = new xe.d[]{bg.c.f3231b};
        dVarF.f15091d = new ph.c(request3);
        dVarF.f15089b = 32704;
        ig.l lVarB = gVar.b(1, dVarF.e());
        Intrinsics.checkNotNullExpressionValue(lVarB, "doWrite(...)");
        mi.a aVar = new mi.a(10, new com.discord.media.engine.video.a(2, cancellationSignal, eVar, executor, callback));
        lVarB.getClass();
        lVarB.e(ig.h.f11764a, aVar);
        lVarB.o(new w1.c(request2, eVar, callback, executor, cancellationSignal, 0));
    }

    public void onGetCredential(@NotNull Context context, @NotNull s pendingGetCredentialHandle, CancellationSignal cancellationSignal, @NotNull Executor executor, @NotNull h callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pendingGetCredentialHandle, "pendingGetCredentialHandle");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    public void onPrepareCredential(@NotNull o request, CancellationSignal cancellationSignal, @NotNull Executor executor, @NotNull h callback) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    @Override // n1.j
    public void onSignalCredentialState(@NotNull v request, @NotNull Executor executor, @NotNull h callback) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(callback, "callback");
        int i7 = 1;
        if (!isAvailableOnDevice(MIN_GMS_APK_VERSION_SIGNAL_API)) {
            executor.execute(new c(callback, i7));
            return;
        }
        int i10 = z1.a.f23585f;
        Context context = this.context;
        Intrinsics.checkNotNullParameter(context, "context");
        z1.a aVar = new z1.a(context);
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(request, "request");
        r request2 = new r(request.f16236a, null, request.f16237b);
        Context context2 = aVar.f23586e;
        Intrinsics.checkNotNullParameter(context2, "context");
        Intrinsics.checkNotNullParameter(context2, "context");
        sf.g gVar = new sf.g(context2, null, sf.g.k, ye.b.D, ye.h.f23298c);
        Intrinsics.checkNotNullParameter(request2, "request");
        d dVarF = d.f();
        dVarF.f15092e = new xe.d[]{bg.c.f3232c};
        dVarF.f15091d = new pc.r(request2);
        dVarF.f15089b = 32709;
        ig.l lVarB = gVar.b(1, dVarF.e());
        Intrinsics.checkNotNullExpressionValue(lVarB, "doWrite(...)");
        mi.a aVar2 = new mi.a(15, new t1.e(executor, aVar, callback));
        lVarB.getClass();
        lVarB.e(ig.h.f11764a, aVar2);
        lVarB.o(new x(10, executor, callback));
    }

    public final void setGoogleApiAvailability(@NotNull e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<set-?>");
        this.googleApiAvailability = eVar;
    }

    public final boolean isAvailableOnDevice(int minApkVersion) {
        int iIsGooglePlayServicesAvailable = isGooglePlayServicesAvailable(this.context, minApkVersion);
        boolean z5 = iIsGooglePlayServicesAvailable == 0;
        if (!z5) {
            Log.w(TAG, "Connection with Google Play Services was not successful. Connection result is: " + new xe.b(iIsGooglePlayServicesAvailable, null, null));
        }
        return z5;
    }

    @Override // n1.j
    public void onGetCredential(@NotNull Context context, @NotNull o request, CancellationSignal cancellationSignal, @NotNull Executor executor, @NotNull h callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Companion.getClass();
        if (f.a(cancellationSignal)) {
            return;
        }
        Intrinsics.checkNotNullParameter(request, "request");
        List list = request.f16230a;
        List<i> list2 = request.f16230a;
        Iterator it = list.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            ye.a aVar = ye.b.D;
            Iterator it2 = it;
            if (!zHasNext) {
                Companion.getClass();
                Intrinsics.checkNotNullParameter(request, "request");
                for (i iVar : list2) {
                }
                if (!isAvailableOnDevice(PRE_U_MIN_GMS_APK_VERSION)) {
                    Companion.getClass();
                    Intrinsics.checkNotNullParameter(request, "request");
                    for (i iVar2 : list2) {
                    }
                    new u1.d(context).h(request, cancellationSignal, executor, callback);
                    return;
                }
                x1.a aVar2 = new x1.a(context);
                Intrinsics.checkNotNullParameter(request, "request");
                Intrinsics.checkNotNullParameter(callback, "callback");
                Intrinsics.checkNotNullParameter(executor, "executor");
                aVar2.f22590h = cancellationSignal;
                Intrinsics.checkNotNullParameter(callback, "<set-?>");
                aVar2.f22588f = callback;
                Intrinsics.checkNotNullParameter(executor, "<set-?>");
                aVar2.f22589g = executor;
                Companion.getClass();
                if (f.a(cancellationSignal)) {
                    return;
                }
                Intrinsics.checkNotNullParameter(request, "request");
                Intrinsics.checkNotNullParameter(request, "request");
                Bundle bundle = new Bundle();
                bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IDENTITY_DOC_UI", false);
                bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", false);
                bundle.putParcelable("androidx.credentials.BUNDLE_KEY_PREFER_UI_BRANDING_COMPONENT_NAME", null);
                ArrayList arrayList = new ArrayList(e0.l(list2, 10));
                for (i iVar3 : list2) {
                    arrayList.add(new rf.i(iVar3.f16222a, iVar3.f16223b, iVar3.f16224c, "", "", ""));
                }
                GetCredentialRequest getCredentialRequest = new GetCredentialRequest(arrayList, bundle, null, new ResultReceiver(null));
                Context context2 = aVar2.f22587e;
                Intrinsics.checkNotNullParameter(context2, "context");
                Intrinsics.checkNotNullParameter(context2, "context");
                ig.l lVarC = new sf.g(context2, null, sf.g.k, aVar, ye.h.f23298c).c(getCredentialRequest);
                mi.a aVar3 = new mi.a(12, new com.discord.media.engine.video.a(3, cancellationSignal, aVar2, executor, callback));
                lVarC.getClass();
                lVarC.e(ig.h.f11764a, aVar3);
                lVarC.o(new w1.c(request, aVar2, callback, executor, cancellationSignal, 1));
                return;
            }
            if (((i) it2.next()) instanceof q) {
                if (!isAvailableOnDevice(MIN_GMS_APK_VERSION_DIGITAL_CRED)) {
                    f fVar = Companion;
                    b bVar = new b(executor, callback, 0);
                    fVar.getClass();
                    f.b(cancellationSignal, bVar);
                    return;
                }
                y1.a aVar4 = new y1.a(context);
                Intrinsics.checkNotNullParameter(request, "request");
                Intrinsics.checkNotNullParameter(callback, "callback");
                Intrinsics.checkNotNullParameter(executor, "executor");
                aVar4.f23132h = cancellationSignal;
                Intrinsics.checkNotNullParameter(callback, "<set-?>");
                aVar4.f23130f = callback;
                Intrinsics.checkNotNullParameter(executor, "<set-?>");
                aVar4.f23131g = executor;
                Companion.getClass();
                if (f.a(cancellationSignal)) {
                    return;
                }
                Intrinsics.checkNotNullParameter(request, "request");
                ArrayList arrayList2 = new ArrayList();
                Iterator it3 = list2.iterator();
                while (it3.hasNext()) {
                    i iVar4 = (i) it3.next();
                    if (iVar4 instanceof q) {
                        arrayList2.add(new rf.i(iVar4.f16222a, iVar4.f16223b, iVar4.f16224c, ((q) iVar4).f16232e, "", ""));
                        it3 = it3;
                    }
                }
                Intrinsics.checkNotNullParameter(request, "request");
                Bundle bundle2 = new Bundle();
                bundle2.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IDENTITY_DOC_UI", false);
                bundle2.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", false);
                bundle2.putParcelable("androidx.credentials.BUNDLE_KEY_PREFER_UI_BRANDING_COMPONENT_NAME", null);
                GetCredentialRequest getCredentialRequest2 = new GetCredentialRequest(arrayList2, bundle2, null, new ResultReceiver(null));
                Context context3 = aVar4.f23129e;
                Intrinsics.checkNotNullParameter(context3, "context");
                Intrinsics.checkNotNullParameter(context3, "context");
                ig.l lVarC2 = new sf.g(context3, null, sf.g.k, aVar, ye.h.f23298c).c(getCredentialRequest2);
                mi.a aVar5 = new mi.a(14, new p(14, cancellationSignal, aVar4));
                lVarC2.getClass();
                lVarC2.e(ig.h.f11764a, aVar5);
                lVarC2.o(new ac.b(aVar4, cancellationSignal, executor, callback));
                return;
            }
            it = it2;
        }
    }
}

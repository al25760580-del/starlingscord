package com.discord.security_key;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Intent;
import android.os.Build;
import androidx.credentials.CredentialManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.b1;
import ar.b0;
import com.discord.codegen.NativeSecurityKeyManagerModuleSpec;
import com.discord.logging.Log;
import com.facebook.react.bridge.BaseActivityEventListener;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.devsupport.StackTraceHelper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import n1.c;
import n1.r;
import n1.t;
import n1.u;
import n1.x;
import n1.y;
import o1.e;
import o1.f;
import o1.g;
import o1.i;
import o1.j;
import o1.l;
import o1.m;
import o1.n;
import o1.o;
import o1.p;
import o1.q;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;
import xn.d;
import xn.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000O\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0019\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0018\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0018\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\rH\u0002J(\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\r2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0002J\b\u0010\u001b\u001a\u00020\u000bH\u0016J\b\u0010\u001c\u001a\u00020\u000bH\u0016J\u0018\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\tH\u0016J\u0018\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\tH\u0016J\u0018\u0010 \u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\tH\u0016J\u0018\u0010!\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\tH\u0016J\u0018\u0010\"\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\tH\u0016J\u0018\u0010$\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\tH\u0016J(\u0010%\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\r2\u0006\u0010'\u001a\u00020\r2\u0006\u0010(\u001a\u00020)2\u0006\u0010\u001e\u001a\u00020\tH\u0016J0\u0010*\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\r2\u0006\u0010'\u001a\u00020\r2\u0006\u0010+\u001a\u00020\r2\u0006\u0010,\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\tH\u0016J \u0010-\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\r2\u0006\u0010.\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\tH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001a¨\u0006/"}, d2 = {"Lcom/discord/security_key/SecurityKeyManagerModule;", "Lcom/discord/codegen/NativeSecurityKeyManagerModuleSpec;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "getReactContext", "()Lcom/facebook/react/bridge/ReactApplicationContext;", "currentPromise", "Lcom/facebook/react/bridge/Promise;", "resolve", "", "data", "", "reject", "code", "Lcom/discord/security_key/WebAuthnDOMException;", "throwable", "", "message", "webauthn", "Lcom/discord/security_key/WebAuthn;", "credentialManager", "Landroidx/credentials/CredentialManager;", "activityEventListener", "com/discord/security_key/SecurityKeyManagerModule$activityEventListener$1", "Lcom/discord/security_key/SecurityKeyManagerModule$activityEventListener$1;", "initialize", "invalidate", "register", BaseJavaModule.METHOD_TYPE_PROMISE, "authenticate", "registerSecurityKey", "authenticateSecurityKey", "registerPasskey", "requestJson", "authenticatePasskey", "signalAllAcceptedCredentials", "rpId", "userId", "allAcceptedCredentialIds", "Lcom/facebook/react/bridge/ReadableArray;", "signalCurrentUserDetails", StackTraceHelper.NAME_KEY, "displayName", "signalUnknownCredential", "credentialId", "security_key_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SecurityKeyManagerModule extends NativeSecurityKeyManagerModuleSpec {

    @NotNull
    private final SecurityKeyManagerModule$activityEventListener$1 activityEventListener;

    @NotNull
    private final CredentialManager credentialManager;
    private Promise currentPromise;

    @NotNull
    private final ReactApplicationContext reactContext;

    @NotNull
    private final WebAuthn webauthn;

    /* JADX INFO: renamed from: com.discord.security_key.SecurityKeyManagerModule$authenticatePasskey$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @d(c = "com.discord.security_key.SecurityKeyManagerModule$authenticatePasskey$1", f = "SecurityKeyManagerModule.kt", l = {282}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends h implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ String $requestJson;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ SecurityKeyManagerModule this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, SecurityKeyManagerModule securityKeyManagerModule, Continuation continuation) {
            super(2, continuation);
            this.$requestJson = str;
            this.this$0 = securityKeyManagerModule;
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$requestJson, this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX WARN: Code duplicated, block: B:36:0x00af A[Catch: all -> 0x001a, l -> 0x001e, o -> 0x0022, p -> 0x0026, n -> 0x002a, q -> 0x002e, b -> 0x0032, m -> 0x0036, j -> 0x003a, TryCatch #14 {all -> 0x001a, blocks: (B:6:0x0015, B:34:0x00a3, B:36:0x00af, B:63:0x0154, B:37:0x00b8, B:55:0x0101, B:56:0x010c, B:57:0x0117, B:58:0x011d, B:59:0x0128, B:60:0x0135, B:61:0x0149, B:62:0x014f, B:29:0x0051, B:30:0x0088), top: B:74:0x000d }] */
        /* JADX WARN: Code duplicated, block: B:37:0x00b8 A[Catch: all -> 0x001a, l -> 0x001e, o -> 0x0022, p -> 0x0026, n -> 0x002a, q -> 0x002e, b -> 0x0032, m -> 0x0036, j -> 0x003a, TRY_LEAVE, TryCatch #14 {all -> 0x001a, blocks: (B:6:0x0015, B:34:0x00a3, B:36:0x00af, B:63:0x0154, B:37:0x00b8, B:55:0x0101, B:56:0x010c, B:57:0x0117, B:58:0x011d, B:59:0x0128, B:60:0x0135, B:61:0x0149, B:62:0x014f, B:29:0x0051, B:30:0x0088), top: B:74:0x000d }] */
        /* JADX WARN: Instruction removed from duplicated block: B:37:0x00b8, please report this as an issue */
        @Override // xn.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objO;
            l lVar;
            SecurityKeyManagerModule securityKeyManagerModule;
            q1.b bVar;
            q qVar;
            p pVar;
            o oVar;
            n nVar;
            m mVar;
            j jVar;
            fq.a aVar;
            String str;
            wn.a aVar2 = wn.a.f22354d;
            int i7 = this.label;
            try {
                if (i7 == 0) {
                    ib.a.L(obj);
                    String str2 = this.$requestJson;
                    SecurityKeyManagerModule securityKeyManagerModule2 = this.this$0;
                    rn.q qVar2 = Result.f14614e;
                    String string = new JSONObject(new JSONTokener(str2)).getJSONObject("publicKey").toString();
                    Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                    r credentialOption = new r(string);
                    ArrayList arrayList = new ArrayList();
                    Intrinsics.checkNotNullParameter(credentialOption, "credentialOption");
                    arrayList.add(credentialOption);
                    n1.o oVar2 = new n1.o(CollectionsKt.i0(arrayList));
                    try {
                        CredentialManager credentialManager = securityKeyManagerModule2.credentialManager;
                        Activity currentActivity = securityKeyManagerModule2.getReactContext().getCurrentActivity();
                        Intrinsics.checkNotNull(currentActivity);
                        this.L$0 = securityKeyManagerModule2;
                        this.label = 1;
                        obj = credentialManager.b(currentActivity, oVar2, this);
                        if (obj == aVar2) {
                            return aVar2;
                        }
                        securityKeyManagerModule = securityKeyManagerModule2;
                        aVar = ((n1.p) obj).f16231a;
                        str = (String) aVar.f9357e;
                        if (aVar instanceof t) {
                            securityKeyManagerModule.resolve(((t) aVar).f16234i);
                        } else {
                            Log.e$default(Log.INSTANCE, NativeSecurityKeyManagerModuleSpec.NAME, "Unsupported credential type returned: " + str, (Throwable) null, 4, (Object) null);
                            securityKeyManagerModule.reject(WebAuthnDOMException.UnknownError, "Unknown credential type " + str);
                        }
                    } catch (j e10) {
                        jVar = e10;
                        securityKeyManagerModule = securityKeyManagerModule2;
                        securityKeyManagerModule.reject(WebAuthnDOMException.NotAllowedError, jVar);
                    } catch (m e11) {
                        mVar = e11;
                        securityKeyManagerModule = securityKeyManagerModule2;
                        securityKeyManagerModule.reject(WebAuthnDOMException.NotAllowedError, mVar);
                    } catch (n e12) {
                        nVar = e12;
                        securityKeyManagerModule = securityKeyManagerModule2;
                        Log.INSTANCE.e(NativeSecurityKeyManagerModuleSpec.NAME, "authenticatePasskey error", nVar);
                        securityKeyManagerModule.reject(WebAuthnDOMException.NotSupportedError, nVar);
                    } catch (o e13) {
                        oVar = e13;
                        securityKeyManagerModule = securityKeyManagerModule2;
                        Log.INSTANCE.e(NativeSecurityKeyManagerModuleSpec.NAME, "authenticatePasskey error", oVar);
                        securityKeyManagerModule.reject(WebAuthnDOMException.UnknownError, oVar);
                    } catch (p e14) {
                        pVar = e14;
                        securityKeyManagerModule = securityKeyManagerModule2;
                        securityKeyManagerModule.reject(WebAuthnDOMException.NotSupportedError, pVar);
                    } catch (q e15) {
                        qVar = e15;
                        securityKeyManagerModule = securityKeyManagerModule2;
                        Log.INSTANCE.i(NativeSecurityKeyManagerModuleSpec.NAME, "No credential found", qVar);
                        securityKeyManagerModule.reject(WebAuthnDOMException.NotAllowedError, qVar);
                    } catch (q1.b e16) {
                        bVar = e16;
                        securityKeyManagerModule = securityKeyManagerModule2;
                        String simpleName = bVar.f18583v.getClass().getSimpleName();
                        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
                        securityKeyManagerModule.reject(simpleName, null, bVar);
                    } catch (l e17) {
                        lVar = e17;
                        securityKeyManagerModule = securityKeyManagerModule2;
                        Log.INSTANCE.e(NativeSecurityKeyManagerModuleSpec.NAME, "authenticatePasskey error", lVar);
                        securityKeyManagerModule.reject(WebAuthnDOMException.UnknownError, lVar);
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    securityKeyManagerModule = (SecurityKeyManagerModule) this.L$0;
                    try {
                        ib.a.L(obj);
                        aVar = ((n1.p) obj).f16231a;
                        str = (String) aVar.f9357e;
                        if (aVar instanceof t) {
                            securityKeyManagerModule.resolve(((t) aVar).f16234i);
                        } else {
                            Log.e$default(Log.INSTANCE, NativeSecurityKeyManagerModuleSpec.NAME, "Unsupported credential type returned: " + str, (Throwable) null, 4, (Object) null);
                            securityKeyManagerModule.reject(WebAuthnDOMException.UnknownError, "Unknown credential type " + str);
                        }
                    } catch (j e18) {
                        jVar = e18;
                        securityKeyManagerModule.reject(WebAuthnDOMException.NotAllowedError, jVar);
                    } catch (m e19) {
                        mVar = e19;
                        securityKeyManagerModule.reject(WebAuthnDOMException.NotAllowedError, mVar);
                    } catch (n e20) {
                        nVar = e20;
                        Log.INSTANCE.e(NativeSecurityKeyManagerModuleSpec.NAME, "authenticatePasskey error", nVar);
                        securityKeyManagerModule.reject(WebAuthnDOMException.NotSupportedError, nVar);
                    } catch (o e21) {
                        oVar = e21;
                        Log.INSTANCE.e(NativeSecurityKeyManagerModuleSpec.NAME, "authenticatePasskey error", oVar);
                        securityKeyManagerModule.reject(WebAuthnDOMException.UnknownError, oVar);
                    } catch (p e22) {
                        pVar = e22;
                        securityKeyManagerModule.reject(WebAuthnDOMException.NotSupportedError, pVar);
                    } catch (q e23) {
                        qVar = e23;
                        Log.INSTANCE.i(NativeSecurityKeyManagerModuleSpec.NAME, "No credential found", qVar);
                        securityKeyManagerModule.reject(WebAuthnDOMException.NotAllowedError, qVar);
                    } catch (q1.b e24) {
                        bVar = e24;
                        String simpleName2 = bVar.f18583v.getClass().getSimpleName();
                        Intrinsics.checkNotNullExpressionValue(simpleName2, "getSimpleName(...)");
                        securityKeyManagerModule.reject(simpleName2, null, bVar);
                    } catch (l e25) {
                        lVar = e25;
                        Log.INSTANCE.e(NativeSecurityKeyManagerModuleSpec.NAME, "authenticatePasskey error", lVar);
                        securityKeyManagerModule.reject(WebAuthnDOMException.UnknownError, lVar);
                    }
                }
                objO = Unit.f14616a;
                rn.q qVar3 = Result.f14614e;
            } catch (Throwable th2) {
                rn.q qVar4 = Result.f14614e;
                objO = ib.a.o(th2);
            }
            SecurityKeyManagerModule securityKeyManagerModule3 = this.this$0;
            Throwable thA = Result.a(objO);
            if (thA != null) {
                if (thA instanceof CancellationException) {
                    throw thA;
                }
                securityKeyManagerModule3.reject(WebAuthnDOMException.UnknownError, thA);
            }
            return Unit.f14616a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    /* JADX INFO: renamed from: com.discord.security_key.SecurityKeyManagerModule$registerPasskey$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @d(c = "com.discord.security_key.SecurityKeyManagerModule$registerPasskey$1", f = "SecurityKeyManagerModule.kt", l = {150}, m = "invokeSuspend")
    public static final class C02081 extends h implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ String $requestJson;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ SecurityKeyManagerModule this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C02081(String str, SecurityKeyManagerModule securityKeyManagerModule, Continuation continuation) {
            super(2, continuation);
            this.$requestJson = str;
            this.this$0 = securityKeyManagerModule;
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            C02081 c02081 = new C02081(this.$requestJson, this.this$0, continuation);
            c02081.L$0 = obj;
            return c02081;
        }

        /* JADX WARN: Code duplicated, block: B:36:0x008f A[Catch: all -> 0x0016, d -> 0x001a, h -> 0x001e, i -> 0x0022, g -> 0x0026, a -> 0x002a, f -> 0x002e, e -> 0x0032, b -> 0x0036, TryCatch #10 {all -> 0x0016, blocks: (B:6:0x0011, B:34:0x0089, B:36:0x008f, B:63:0x0122, B:37:0x0098, B:55:0x00e5, B:56:0x00eb, B:57:0x00f1, B:58:0x00f7, B:59:0x00fd, B:60:0x0111, B:61:0x0117, B:62:0x011d, B:29:0x004d, B:30:0x006e), top: B:74:0x0009 }] */
        /* JADX WARN: Code duplicated, block: B:37:0x0098 A[Catch: all -> 0x0016, d -> 0x001a, h -> 0x001e, i -> 0x0022, g -> 0x0026, a -> 0x002a, f -> 0x002e, e -> 0x0032, b -> 0x0036, TRY_LEAVE, TryCatch #10 {all -> 0x0016, blocks: (B:6:0x0011, B:34:0x0089, B:36:0x008f, B:63:0x0122, B:37:0x0098, B:55:0x00e5, B:56:0x00eb, B:57:0x00f1, B:58:0x00f7, B:59:0x00fd, B:60:0x0111, B:61:0x0117, B:62:0x011d, B:29:0x004d, B:30:0x006e), top: B:74:0x0009 }] */
        /* JADX WARN: Instruction removed from duplicated block: B:37:0x0098, please report this as an issue */
        @Override // xn.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objO;
            o1.d dVar;
            SecurityKeyManagerModule securityKeyManagerModule;
            q1.a aVar;
            i iVar;
            o1.h hVar;
            g gVar;
            f fVar;
            e eVar;
            o1.b bVar;
            c cVar;
            wn.a aVar2 = wn.a.f22354d;
            int i7 = this.label;
            try {
                if (i7 == 0) {
                    ib.a.L(obj);
                    String str = this.$requestJson;
                    SecurityKeyManagerModule securityKeyManagerModule2 = this.this$0;
                    rn.q qVar = Result.f14614e;
                    String string = new JSONObject(new JSONTokener(str)).getJSONObject("publicKey").toString();
                    Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                    n1.e eVar2 = new n1.e(string);
                    try {
                        CredentialManager credentialManager = securityKeyManagerModule2.credentialManager;
                        Activity currentActivity = securityKeyManagerModule2.getReactContext().getCurrentActivity();
                        Intrinsics.checkNotNull(currentActivity);
                        this.L$0 = securityKeyManagerModule2;
                        this.label = 1;
                        obj = credentialManager.d(currentActivity, eVar2, this);
                        if (obj == aVar2) {
                            return aVar2;
                        }
                        securityKeyManagerModule = securityKeyManagerModule2;
                        cVar = (c) obj;
                        if (cVar instanceof n1.f) {
                            securityKeyManagerModule.resolve(((n1.f) cVar).f16219b);
                        } else {
                            Log.e$default(Log.INSTANCE, NativeSecurityKeyManagerModuleSpec.NAME, "Received unsupported response type: " + cVar.f16217a, (Throwable) null, 4, (Object) null);
                            securityKeyManagerModule.reject(WebAuthnDOMException.UnknownError, "Unknown credential type " + cVar.f16217a);
                        }
                    } catch (o1.b e10) {
                        bVar = e10;
                        securityKeyManagerModule = securityKeyManagerModule2;
                        securityKeyManagerModule.reject(WebAuthnDOMException.NotAllowedError, bVar);
                    } catch (e e11) {
                        eVar = e11;
                        securityKeyManagerModule = securityKeyManagerModule2;
                        securityKeyManagerModule.reject(WebAuthnDOMException.NotAllowedError, eVar);
                    } catch (f e12) {
                        fVar = e12;
                        securityKeyManagerModule = securityKeyManagerModule2;
                        securityKeyManagerModule.reject(WebAuthnDOMException.NotAllowedError, fVar);
                    } catch (g e13) {
                        gVar = e13;
                        securityKeyManagerModule = securityKeyManagerModule2;
                        securityKeyManagerModule.reject(WebAuthnDOMException.NotSupportedError, gVar);
                    } catch (o1.h e14) {
                        hVar = e14;
                        securityKeyManagerModule = securityKeyManagerModule2;
                        securityKeyManagerModule.reject(WebAuthnDOMException.UnknownError, hVar);
                    } catch (i e15) {
                        iVar = e15;
                        securityKeyManagerModule = securityKeyManagerModule2;
                        securityKeyManagerModule.reject(WebAuthnDOMException.NotSupportedError, iVar);
                    } catch (q1.a e16) {
                        aVar = e16;
                        securityKeyManagerModule = securityKeyManagerModule2;
                        String simpleName = aVar.f18579e.getClass().getSimpleName();
                        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
                        securityKeyManagerModule.reject(simpleName, null, aVar);
                    } catch (o1.d e17) {
                        dVar = e17;
                        securityKeyManagerModule = securityKeyManagerModule2;
                        securityKeyManagerModule.reject(WebAuthnDOMException.UnknownError, dVar);
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    securityKeyManagerModule = (SecurityKeyManagerModule) this.L$0;
                    try {
                        ib.a.L(obj);
                        cVar = (c) obj;
                        if (cVar instanceof n1.f) {
                            securityKeyManagerModule.resolve(((n1.f) cVar).f16219b);
                        } else {
                            Log.e$default(Log.INSTANCE, NativeSecurityKeyManagerModuleSpec.NAME, "Received unsupported response type: " + cVar.f16217a, (Throwable) null, 4, (Object) null);
                            securityKeyManagerModule.reject(WebAuthnDOMException.UnknownError, "Unknown credential type " + cVar.f16217a);
                        }
                    } catch (o1.b e18) {
                        bVar = e18;
                        securityKeyManagerModule.reject(WebAuthnDOMException.NotAllowedError, bVar);
                    } catch (e e19) {
                        eVar = e19;
                        securityKeyManagerModule.reject(WebAuthnDOMException.NotAllowedError, eVar);
                    } catch (f e20) {
                        fVar = e20;
                        securityKeyManagerModule.reject(WebAuthnDOMException.NotAllowedError, fVar);
                    } catch (g e21) {
                        gVar = e21;
                        securityKeyManagerModule.reject(WebAuthnDOMException.NotSupportedError, gVar);
                    } catch (o1.h e22) {
                        hVar = e22;
                        securityKeyManagerModule.reject(WebAuthnDOMException.UnknownError, hVar);
                    } catch (i e23) {
                        iVar = e23;
                        securityKeyManagerModule.reject(WebAuthnDOMException.NotSupportedError, iVar);
                    } catch (q1.a e24) {
                        aVar = e24;
                        String simpleName2 = aVar.f18579e.getClass().getSimpleName();
                        Intrinsics.checkNotNullExpressionValue(simpleName2, "getSimpleName(...)");
                        securityKeyManagerModule.reject(simpleName2, null, aVar);
                    } catch (o1.d e25) {
                        dVar = e25;
                        securityKeyManagerModule.reject(WebAuthnDOMException.UnknownError, dVar);
                    }
                }
                objO = Unit.f14616a;
                rn.q qVar2 = Result.f14614e;
            } catch (Throwable th2) {
                rn.q qVar3 = Result.f14614e;
                objO = ib.a.o(th2);
            }
            SecurityKeyManagerModule securityKeyManagerModule3 = this.this$0;
            Throwable thA = Result.a(objO);
            if (thA != null) {
                if (thA instanceof CancellationException) {
                    throw thA;
                }
                securityKeyManagerModule3.reject(WebAuthnDOMException.UnknownError, thA);
            }
            return Unit.f14616a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C02081) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    /* JADX INFO: renamed from: com.discord.security_key.SecurityKeyManagerModule$signalAllAcceptedCredentials$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @d(c = "com.discord.security_key.SecurityKeyManagerModule$signalAllAcceptedCredentials$1", f = "SecurityKeyManagerModule.kt", l = {398}, m = "invokeSuspend")
    public static final class C02091 extends h implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ ReadableArray $allAcceptedCredentialIds;
        final /* synthetic */ Promise $promise;
        final /* synthetic */ String $rpId;
        final /* synthetic */ String $userId;
        int label;
        final /* synthetic */ SecurityKeyManagerModule this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C02091(ReadableArray readableArray, SecurityKeyManagerModule securityKeyManagerModule, Promise promise, String str, String str2, Continuation continuation) {
            super(2, continuation);
            this.$allAcceptedCredentialIds = readableArray;
            this.this$0 = securityKeyManagerModule;
            this.$promise = promise;
            this.$rpId = str;
            this.$userId = str2;
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new C02091(this.$allAcceptedCredentialIds, this.this$0, this.$promise, this.$rpId, this.$userId, continuation);
        }

        @Override // xn.a
        public final Object invokeSuspend(Object obj) {
            wn.a aVar = wn.a.f22354d;
            int i7 = this.label;
            try {
                if (i7 == 0) {
                    ib.a.L(obj);
                    JSONArray jSONArray = new JSONArray();
                    int size = this.$allAcceptedCredentialIds.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        jSONArray.put(this.$allAcceptedCredentialIds.getString(i10));
                    }
                    JSONObject jSONObject = new JSONObject();
                    String str = this.$rpId;
                    String str2 = this.$userId;
                    jSONObject.put("rpId", str);
                    jSONObject.put("userId", str2);
                    jSONObject.put("allAcceptedCredentialIds", jSONArray);
                    String string = jSONObject.toString();
                    Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                    CredentialManager credentialManager = this.this$0.credentialManager;
                    u uVar = new u(string);
                    this.label = 1;
                    if (credentialManager.f(uVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ib.a.L(obj);
                }
            } catch (Exception e10) {
                Log.INSTANCE.w(NativeSecurityKeyManagerModuleSpec.NAME, "signalAllAcceptedCredentials failed", e10);
            }
            this.$promise.resolve(null);
            return Unit.f14616a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C02091) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    /* JADX INFO: renamed from: com.discord.security_key.SecurityKeyManagerModule$signalCurrentUserDetails$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @d(c = "com.discord.security_key.SecurityKeyManagerModule$signalCurrentUserDetails$1", f = "SecurityKeyManagerModule.kt", l = {417}, m = "invokeSuspend")
    public static final class C02101 extends h implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ String $displayName;
        final /* synthetic */ String $name;
        final /* synthetic */ Promise $promise;
        final /* synthetic */ String $rpId;
        final /* synthetic */ String $userId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C02101(Promise promise, String str, String str2, String str3, String str4, Continuation continuation) {
            super(2, continuation);
            this.$promise = promise;
            this.$rpId = str;
            this.$userId = str2;
            this.$name = str3;
            this.$displayName = str4;
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            return SecurityKeyManagerModule.this.new C02101(this.$promise, this.$rpId, this.$userId, this.$name, this.$displayName, continuation);
        }

        @Override // xn.a
        public final Object invokeSuspend(Object obj) {
            wn.a aVar = wn.a.f22354d;
            int i7 = this.label;
            try {
                if (i7 == 0) {
                    ib.a.L(obj);
                    JSONObject jSONObject = new JSONObject();
                    String str = this.$rpId;
                    String str2 = this.$userId;
                    String str3 = this.$name;
                    String str4 = this.$displayName;
                    jSONObject.put("rpId", str);
                    jSONObject.put("userId", str2);
                    jSONObject.put(StackTraceHelper.NAME_KEY, str3);
                    jSONObject.put("displayName", str4);
                    String string = jSONObject.toString();
                    Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                    CredentialManager credentialManager = SecurityKeyManagerModule.this.credentialManager;
                    x xVar = new x(string);
                    this.label = 1;
                    if (credentialManager.f(xVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ib.a.L(obj);
                }
            } catch (Exception e10) {
                Log.INSTANCE.w(NativeSecurityKeyManagerModuleSpec.NAME, "signalCurrentUserDetails failed", e10);
            }
            this.$promise.resolve(null);
            return Unit.f14616a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C02101) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    /* JADX INFO: renamed from: com.discord.security_key.SecurityKeyManagerModule$signalUnknownCredential$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @d(c = "com.discord.security_key.SecurityKeyManagerModule$signalUnknownCredential$1", f = "SecurityKeyManagerModule.kt", l = {434}, m = "invokeSuspend")
    public static final class C02111 extends h implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ String $credentialId;
        final /* synthetic */ Promise $promise;
        final /* synthetic */ String $rpId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C02111(Promise promise, String str, String str2, Continuation continuation) {
            super(2, continuation);
            this.$promise = promise;
            this.$rpId = str;
            this.$credentialId = str2;
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            return SecurityKeyManagerModule.this.new C02111(this.$promise, this.$rpId, this.$credentialId, continuation);
        }

        @Override // xn.a
        public final Object invokeSuspend(Object obj) {
            wn.a aVar = wn.a.f22354d;
            int i7 = this.label;
            try {
                if (i7 == 0) {
                    ib.a.L(obj);
                    JSONObject jSONObject = new JSONObject();
                    String str = this.$rpId;
                    String str2 = this.$credentialId;
                    jSONObject.put("rpId", str);
                    jSONObject.put("credentialId", str2);
                    String string = jSONObject.toString();
                    Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                    CredentialManager credentialManager = SecurityKeyManagerModule.this.credentialManager;
                    y yVar = new y(string);
                    this.label = 1;
                    if (credentialManager.f(yVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ib.a.L(obj);
                }
            } catch (Exception e10) {
                Log.INSTANCE.w(NativeSecurityKeyManagerModuleSpec.NAME, "signalUnknownCredential failed", e10);
            }
            this.$promise.resolve(null);
            return Unit.f14616a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C02111) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r3v3, types: [com.discord.security_key.SecurityKeyManagerModule$activityEventListener$1] */
    public SecurityKeyManagerModule(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.reactContext = reactContext;
        this.webauthn = new WebAuthn(new SecurityKeyManagerModule$webauthn$1(this), new SecurityKeyManagerModule$webauthn$2(this));
        ReactApplicationContext context = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(context, "getReactApplicationContext(...)");
        Intrinsics.checkNotNullParameter(context, "context");
        this.credentialManager = new ci.q(context);
        this.activityEventListener = new BaseActivityEventListener() { // from class: com.discord.security_key.SecurityKeyManagerModule$activityEventListener$1
            @Override // com.facebook.react.bridge.BaseActivityEventListener, com.facebook.react.bridge.ActivityEventListener
            public void onActivityResult(Activity activity, int requestCode, int resultCode, Intent data) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                this.this$0.webauthn.onActivityResult(requestCode, resultCode, data);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void reject(WebAuthnDOMException code, Throwable throwable) {
        reject(code.name(), null, throwable);
    }

    public static /* synthetic */ void reject$default(SecurityKeyManagerModule securityKeyManagerModule, String str, String str2, Throwable th2, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            str2 = null;
        }
        if ((i7 & 4) != 0) {
            th2 = null;
        }
        securityKeyManagerModule.reject(str, str2, th2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void resolve(String data) {
        Promise promise = this.currentPromise;
        if (promise != null) {
            promise.resolve(data);
        }
        this.currentPromise = null;
    }

    @Override // com.discord.codegen.NativeSecurityKeyManagerModuleSpec
    public void authenticate(@NotNull String data, @NotNull Promise promise) throws IOException {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(promise, "promise");
        authenticateSecurityKey(data, promise);
    }

    @Override // com.discord.codegen.NativeSecurityKeyManagerModuleSpec
    public void authenticatePasskey(@NotNull String requestJson, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(requestJson, "requestJson");
        Intrinsics.checkNotNullParameter(promise, "promise");
        if (this.currentPromise != null) {
            promise.reject("UnknownError", new WebAuthnAlreadyActiveException());
            return;
        }
        if (Build.VERSION.SDK_INT < 28) {
            promise.reject("NotSupportedError", new PasskeyNotSupportedException());
            return;
        }
        this.currentPromise = promise;
        ComponentCallbacks2 currentActivity = this.reactContext.getCurrentActivity();
        Intrinsics.checkNotNull(currentActivity, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
        b0.t(b1.c((LifecycleOwner) currentActivity), null, new AnonymousClass1(requestJson, this, null), 3);
    }

    @Override // com.discord.codegen.NativeSecurityKeyManagerModuleSpec
    public void authenticateSecurityKey(@NotNull String data, @NotNull Promise promise) throws IOException {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(promise, "promise");
        if (this.currentPromise != null) {
            promise.reject("UnknownError", new WebAuthnAlreadyActiveException());
        } else {
            this.currentPromise = promise;
            this.webauthn.authenticateSecurityKey(data, this.reactContext.getCurrentActivity());
        }
    }

    @NotNull
    public final ReactApplicationContext getReactContext() {
        return this.reactContext;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        super.initialize();
        getReactApplicationContext().addActivityEventListener(this.activityEventListener);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        super.invalidate();
        getReactApplicationContext().removeActivityEventListener(this.activityEventListener);
    }

    @Override // com.discord.codegen.NativeSecurityKeyManagerModuleSpec
    public void register(@NotNull String data, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(promise, "promise");
        registerSecurityKey(data, promise);
    }

    @Override // com.discord.codegen.NativeSecurityKeyManagerModuleSpec
    public void registerPasskey(@NotNull String requestJson, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(requestJson, "requestJson");
        Intrinsics.checkNotNullParameter(promise, "promise");
        if (this.currentPromise != null) {
            promise.reject("UnknownError", new WebAuthnAlreadyActiveException());
            return;
        }
        if (Build.VERSION.SDK_INT < 28) {
            promise.reject("NotSupportedError", new PasskeyNotSupportedException());
            return;
        }
        this.currentPromise = promise;
        ComponentCallbacks2 currentActivity = this.reactContext.getCurrentActivity();
        Intrinsics.checkNotNull(currentActivity, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
        b0.t(b1.c((LifecycleOwner) currentActivity), null, new C02081(requestJson, this, null), 3);
    }

    @Override // com.discord.codegen.NativeSecurityKeyManagerModuleSpec
    public void registerSecurityKey(@NotNull String data, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(promise, "promise");
        if (this.currentPromise != null) {
            promise.reject("UnknownError", new WebAuthnAlreadyActiveException());
        } else {
            this.currentPromise = promise;
            this.webauthn.registerSecurityKey(data, this.reactContext.getCurrentActivity());
        }
    }

    @Override // com.discord.codegen.NativeSecurityKeyManagerModuleSpec
    public void signalAllAcceptedCredentials(@NotNull String rpId, @NotNull String userId, @NotNull ReadableArray allAcceptedCredentialIds, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(rpId, "rpId");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(allAcceptedCredentialIds, "allAcceptedCredentialIds");
        Intrinsics.checkNotNullParameter(promise, "promise");
        ComponentCallbacks2 currentActivity = this.reactContext.getCurrentActivity();
        LifecycleOwner lifecycleOwner = currentActivity instanceof LifecycleOwner ? (LifecycleOwner) currentActivity : null;
        if (lifecycleOwner != null) {
            b0.t(b1.c(lifecycleOwner), null, new C02091(allAcceptedCredentialIds, this, promise, rpId, userId, null), 3);
        } else {
            promise.resolve(null);
            Unit unit = Unit.f14616a;
        }
    }

    @Override // com.discord.codegen.NativeSecurityKeyManagerModuleSpec
    public void signalCurrentUserDetails(@NotNull String rpId, @NotNull String userId, @NotNull String name, @NotNull String displayName, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(rpId, "rpId");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(promise, "promise");
        ComponentCallbacks2 currentActivity = this.reactContext.getCurrentActivity();
        LifecycleOwner lifecycleOwner = currentActivity instanceof LifecycleOwner ? (LifecycleOwner) currentActivity : null;
        if (lifecycleOwner != null) {
            b0.t(b1.c(lifecycleOwner), null, new C02101(promise, rpId, userId, name, displayName, null), 3);
        } else {
            promise.resolve(null);
            Unit unit = Unit.f14616a;
        }
    }

    @Override // com.discord.codegen.NativeSecurityKeyManagerModuleSpec
    public void signalUnknownCredential(@NotNull String rpId, @NotNull String credentialId, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(rpId, "rpId");
        Intrinsics.checkNotNullParameter(credentialId, "credentialId");
        Intrinsics.checkNotNullParameter(promise, "promise");
        ComponentCallbacks2 currentActivity = this.reactContext.getCurrentActivity();
        LifecycleOwner lifecycleOwner = currentActivity instanceof LifecycleOwner ? (LifecycleOwner) currentActivity : null;
        if (lifecycleOwner != null) {
            b0.t(b1.c(lifecycleOwner), null, new C02111(promise, rpId, credentialId, null), 3);
        } else {
            promise.resolve(null);
            Unit unit = Unit.f14616a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void reject(WebAuthnDOMException code, String message) {
        reject(code.name(), message, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void reject(String code, String message, Throwable throwable) {
        Promise promise = this.currentPromise;
        if (promise != null) {
            promise.reject(code, message, throwable, null);
        }
        this.currentPromise = null;
    }
}

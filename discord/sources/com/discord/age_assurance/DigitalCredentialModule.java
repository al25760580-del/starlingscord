package com.discord.age_assurance;

import android.app.Activity;
import android.os.Build;
import androidx.credentials.CredentialManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.b1;
import ar.b0;
import com.discord.codegen.NativeDigitalCredentialModuleSpec;
import com.discord.logging.Log;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.c0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import n1.n;
import n1.o;
import n1.p;
import o1.j;
import o1.l;
import o1.m;
import org.jetbrains.annotations.NotNull;
import rn.q;
import xn.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/discord/age_assurance/DigitalCredentialModule;", "Lcom/discord/codegen/NativeDigitalCredentialModuleSpec;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "credentialManager", "Landroidx/credentials/CredentialManager;", "isAvailable", "", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "getCredential", "requestJson", "", "Companion", "age_assurance_androidRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DigitalCredentialModule extends NativeDigitalCredentialModuleSpec {

    @Deprecated
    @NotNull
    public static final String CODE_CANCELLED = "CANCELLED";

    @Deprecated
    @NotNull
    public static final String CODE_FAILED = "FAILED";

    @Deprecated
    @NotNull
    public static final String CODE_NOT_AVAILABLE = "NOT_AVAILABLE";

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final int MINIMUM_API_LEVEL = 34;

    @Deprecated
    @NotNull
    public static final String TAG = "DigitalCredentialModule";

    @NotNull
    private final CredentialManager credentialManager;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/discord/age_assurance/DigitalCredentialModule$Companion;", "", "<init>", "()V", "TAG", "", "MINIMUM_API_LEVEL", "", "CODE_CANCELLED", "CODE_NOT_AVAILABLE", "CODE_FAILED", "age_assurance_androidRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.discord.age_assurance.DigitalCredentialModule$getCredential$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @xn.d(c = "com.discord.age_assurance.DigitalCredentialModule$getCredential$1", f = "DigitalCredentialModule.kt", l = {62}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends h implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ Promise $promise;
        final /* synthetic */ String $requestJson;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ DigitalCredentialModule this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, DigitalCredentialModule digitalCredentialModule, Activity activity, Promise promise, Continuation continuation) {
            super(2, continuation);
            this.$requestJson = str;
            this.this$0 = digitalCredentialModule;
            this.$activity = activity;
            this.$promise = promise;
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$requestJson, this.this$0, this.$activity, this.$promise, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX WARN: Code duplicated, block: B:34:0x007e A[Catch: all -> 0x0023, l -> 0x0026, o -> 0x0029, m -> 0x002c, p -> 0x002f, n -> 0x0032, q -> 0x0035, j -> 0x0038, TryCatch #4 {all -> 0x0023, blocks: (B:6:0x001d, B:32:0x0072, B:34:0x007e, B:58:0x0126, B:35:0x0087, B:51:0x00c4, B:52:0x00ed, B:53:0x00f6, B:54:0x00ff, B:55:0x010c, B:56:0x0119, B:57:0x011f, B:27:0x0052, B:28:0x0062), top: B:69:0x0015 }] */
        /* JADX WARN: Code duplicated, block: B:35:0x0087 A[Catch: all -> 0x0023, l -> 0x0026, o -> 0x0029, m -> 0x002c, p -> 0x002f, n -> 0x0032, q -> 0x0035, j -> 0x0038, TRY_LEAVE, TryCatch #4 {all -> 0x0023, blocks: (B:6:0x001d, B:32:0x0072, B:34:0x007e, B:58:0x0126, B:35:0x0087, B:51:0x00c4, B:52:0x00ed, B:53:0x00f6, B:54:0x00ff, B:55:0x010c, B:56:0x0119, B:57:0x011f, B:27:0x0052, B:28:0x0062), top: B:69:0x0015 }] */
        /* JADX WARN: Instruction removed from duplicated block: B:35:0x0087, please report this as an issue */
        @Override // xn.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objO;
            Promise promise;
            Object objB;
            fq.a aVar;
            String str;
            wn.a aVar2 = wn.a.f22354d;
            int i7 = this.label;
            try {
                if (i7 == 0) {
                    ib.a.L(obj);
                    String str2 = this.$requestJson;
                    DigitalCredentialModule digitalCredentialModule = this.this$0;
                    Activity activity = this.$activity;
                    Promise promise2 = this.$promise;
                    q qVar = Result.f14614e;
                    o oVar = new o(c0.c(new n1.q(str2)));
                    try {
                        CredentialManager credentialManager = digitalCredentialModule.credentialManager;
                        this.L$0 = promise2;
                        this.label = 1;
                        objB = credentialManager.b(activity, oVar, this);
                        if (objB == aVar2) {
                            return aVar2;
                        }
                        promise = promise2;
                        aVar = ((p) objB).f16231a;
                        str = (String) aVar.f9357e;
                        if (aVar instanceof n) {
                            promise.resolve(((n) aVar).f16229i);
                        } else {
                            Log.e$default(Log.INSTANCE, DigitalCredentialModule.TAG, "Unexpected credential type: " + str, (Throwable) null, 4, (Object) null);
                            promise.reject(DigitalCredentialModule.CODE_FAILED, "Unexpected credential type: " + str);
                        }
                    } catch (j e10) {
                        e = e10;
                        promise = promise2;
                        promise.reject(DigitalCredentialModule.CODE_CANCELLED, "User cancelled the credential request", e);
                    } catch (m e11) {
                        e = e11;
                        promise = promise2;
                        Log.INSTANCE.e(DigitalCredentialModule.TAG, "Credential request was interrupted", e);
                        promise.reject(DigitalCredentialModule.CODE_FAILED, "Credential request was interrupted", e);
                    } catch (o1.n e12) {
                        e = e12;
                        promise = promise2;
                        Log.INSTANCE.e(DigitalCredentialModule.TAG, "Provider configuration error", e);
                        promise.reject(DigitalCredentialModule.CODE_NOT_AVAILABLE, "Credential provider not configured", e);
                    } catch (o1.o e13) {
                        e = e13;
                        promise = promise2;
                        Log.INSTANCE.e(DigitalCredentialModule.TAG, "Unknown credential error", e);
                        promise.reject(DigitalCredentialModule.CODE_FAILED, "Unknown credential error", e);
                    } catch (o1.p e14) {
                        e = e14;
                        promise = promise2;
                        Log.INSTANCE.e(DigitalCredentialModule.TAG, "Credential manager not supported", e);
                        promise.reject(DigitalCredentialModule.CODE_NOT_AVAILABLE, "Credential manager not supported on this device", e);
                    } catch (o1.q e15) {
                        e = e15;
                        promise = promise2;
                        promise.reject(DigitalCredentialModule.CODE_NOT_AVAILABLE, "No matching credential available", e);
                    } catch (l e16) {
                        e = e16;
                        promise = promise2;
                        Log.INSTANCE.e(DigitalCredentialModule.TAG, "Credential error: " + e.a(), e);
                        promise.reject(DigitalCredentialModule.CODE_FAILED, "Credential error: " + e.a(), e);
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    promise = (Promise) this.L$0;
                    try {
                        ib.a.L(obj);
                        objB = obj;
                        aVar = ((p) objB).f16231a;
                        str = (String) aVar.f9357e;
                        if (aVar instanceof n) {
                            promise.resolve(((n) aVar).f16229i);
                        } else {
                            Log.e$default(Log.INSTANCE, DigitalCredentialModule.TAG, "Unexpected credential type: " + str, (Throwable) null, 4, (Object) null);
                            promise.reject(DigitalCredentialModule.CODE_FAILED, "Unexpected credential type: " + str);
                        }
                    } catch (j e17) {
                        e = e17;
                        promise.reject(DigitalCredentialModule.CODE_CANCELLED, "User cancelled the credential request", e);
                    } catch (m e18) {
                        e = e18;
                        Log.INSTANCE.e(DigitalCredentialModule.TAG, "Credential request was interrupted", e);
                        promise.reject(DigitalCredentialModule.CODE_FAILED, "Credential request was interrupted", e);
                    } catch (o1.n e19) {
                        e = e19;
                        Log.INSTANCE.e(DigitalCredentialModule.TAG, "Provider configuration error", e);
                        promise.reject(DigitalCredentialModule.CODE_NOT_AVAILABLE, "Credential provider not configured", e);
                    } catch (o1.o e20) {
                        e = e20;
                        Log.INSTANCE.e(DigitalCredentialModule.TAG, "Unknown credential error", e);
                        promise.reject(DigitalCredentialModule.CODE_FAILED, "Unknown credential error", e);
                    } catch (o1.p e21) {
                        e = e21;
                        Log.INSTANCE.e(DigitalCredentialModule.TAG, "Credential manager not supported", e);
                        promise.reject(DigitalCredentialModule.CODE_NOT_AVAILABLE, "Credential manager not supported on this device", e);
                    } catch (o1.q e22) {
                        e = e22;
                        promise.reject(DigitalCredentialModule.CODE_NOT_AVAILABLE, "No matching credential available", e);
                    } catch (l e23) {
                        e = e23;
                        Log.INSTANCE.e(DigitalCredentialModule.TAG, "Credential error: " + e.a(), e);
                        promise.reject(DigitalCredentialModule.CODE_FAILED, "Credential error: " + e.a(), e);
                    }
                }
                objO = Unit.f14616a;
                q qVar2 = Result.f14614e;
            } catch (Throwable th2) {
                q qVar3 = Result.f14614e;
                objO = ib.a.o(th2);
            }
            Promise promise3 = this.$promise;
            Throwable thA = Result.a(objO);
            if (thA != null) {
                if (thA instanceof CancellationException) {
                    throw thA;
                }
                Log.INSTANCE.e(DigitalCredentialModule.TAG, "Unexpected error during credential request", thA);
                promise3.reject(DigitalCredentialModule.CODE_FAILED, "Unexpected error during credential request", thA);
            }
            return Unit.f14616a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DigitalCredentialModule(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        ReactApplicationContext context = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(context, "getReactApplicationContext(...)");
        Intrinsics.checkNotNullParameter(context, "context");
        this.credentialManager = new ci.q(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.discord.codegen.NativeDigitalCredentialModuleSpec
    public void getCredential(@NotNull String requestJson, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(requestJson, "requestJson");
        Intrinsics.checkNotNullParameter(promise, "promise");
        if (Build.VERSION.SDK_INT < 34) {
            promise.reject(CODE_NOT_AVAILABLE, "Digital credentials require API level 34+");
            return;
        }
        Activity currentActivity = getReactApplicationContext().getCurrentActivity();
        if (currentActivity == 0) {
            promise.reject(CODE_FAILED, "No current activity");
        } else {
            b0.t(b1.c((LifecycleOwner) currentActivity), null, new AnonymousClass1(requestJson, this, currentActivity, promise, null), 3);
        }
    }

    @Override // com.discord.codegen.NativeDigitalCredentialModuleSpec
    public void isAvailable(@NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        promise.resolve(Boolean.valueOf(Build.VERSION.SDK_INT >= 34));
    }
}

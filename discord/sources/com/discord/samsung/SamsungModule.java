package com.discord.samsung;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.b1;
import ar.b0;
import ar.k0;
import com.discord.misc.utilities.activity.ActivityUtilities;
import com.discord.react.utilities.NativeArrayExtensionsKt;
import com.facebook.react.bridge.BaseActivityEventListener;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import hr.e;
import java.util.concurrent.CancellationException;
import java.util.function.Function;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.x;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;
import rn.n;
import rn.q;
import xn.d;
import xn.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000S\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u000b\u0018\u0000 (2\u00020\u0001:\u0001(B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\tH\u0007J\u0010\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\tH\u0007J\u0010\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\tH\u0007J,\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u000e2\b\u0010\u0017\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0018\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0012\u001a\u00020\tH\u0007J\u0014\u0010\u0019\u001a\u00020\u00102\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0002J\u0010\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u0010\u0010\u001f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020!H\u0002J\u0010\u0010\"\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u000eH\u0002J\u0012\u0010$\u001a\u0004\u0018\u00010%2\u0006\u0010&\u001a\u00020'H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\f¨\u0006)"}, d2 = {"Lcom/discord/samsung/SamsungModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "getReactContext", "()Lcom/facebook/react/bridge/ReactApplicationContext;", "connectionPromise", "Lcom/facebook/react/bridge/Promise;", "samsungActivityEventListener", "com/discord/samsung/SamsungModule$samsungActivityEventListener$1", "Lcom/discord/samsung/SamsungModule$samsungActivityEventListener$1;", "getName", "", "checkIfOAuthRequest", "", "clientId", BaseJavaModule.METHOD_TYPE_PROMISE, "showConnectionDisclaimer", "getAccountUrlAndAuthCode", "finishSamsungAuthorization", "authCode", "location", "state", "resolveConnection", "what", "", "rejectConnection", "throwable", "", "handleAuthResult", "result", "Lcom/discord/samsung/SamsungConnectActivity$Result;", "getAccountUrlFromAuthServerUrl", "authServerUrl", "handleSamsungCallback", "Landroid/net/Uri;", "response", "Lokhttp3/Response;", "Companion", "samsung_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSamsungModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SamsungModule.kt\ncom/discord/samsung/SamsungModule\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,303:1\n29#2:304\n*S KotlinDebug\n*F\n+ 1 SamsungModule.kt\ncom/discord/samsung/SamsungModule\n*L\n273#1:304\n*E\n"})
public final class SamsungModule extends ReactContextBaseJavaModule {

    @NotNull
    private static final Intent disclaimerIntent;
    private Promise connectionPromise;

    @NotNull
    private final ReactApplicationContext reactContext;

    @NotNull
    private final SamsungModule$samsungActivityEventListener$1 samsungActivityEventListener;

    /* JADX INFO: renamed from: com.discord.samsung.SamsungModule$finishSamsungAuthorization$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @d(c = "com.discord.samsung.SamsungModule$finishSamsungAuthorization$1", f = "SamsungModule.kt", l = {176}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends h implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ String $authCode;
        final /* synthetic */ String $location;
        final /* synthetic */ String $state;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ SamsungModule this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, SamsungModule samsungModule, String str2, String str3, Continuation continuation) {
            super(2, continuation);
            this.$location = str;
            this.this$0 = samsungModule;
            this.$state = str2;
            this.$authCode = str3;
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$location, this.this$0, this.$state, this.$authCode, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // xn.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objO;
            wn.a aVar = wn.a.f22354d;
            int i7 = this.label;
            try {
                if (i7 == 0) {
                    ib.a.L(obj);
                    String str = this.$location;
                    SamsungModule samsungModule = this.this$0;
                    String str2 = this.$state;
                    String str3 = this.$authCode;
                    q qVar = Result.f14614e;
                    OkHttpClient.Builder builder = new OkHttpClient.Builder();
                    builder.f17351h = false;
                    OkHttpClient okHttpClient = new OkHttpClient(builder);
                    e eVar = k0.f2938a;
                    hr.d dVar = hr.d.f11103i;
                    SamsungModule$finishSamsungAuthorization$1$1$1 samsungModule$finishSamsungAuthorization$1$1$1 = new SamsungModule$finishSamsungAuthorization$1$1$1(str, samsungModule, okHttpClient, str2, str3, null);
                    this.label = 1;
                    if (b0.A(dVar, samsungModule$finishSamsungAuthorization$1$1$1, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ib.a.L(obj);
                }
                objO = Unit.f14616a;
                q qVar2 = Result.f14614e;
            } catch (Throwable th2) {
                q qVar3 = Result.f14614e;
                objO = ib.a.o(th2);
            }
            SamsungModule samsungModule2 = this.this$0;
            Throwable thA = Result.a(objO);
            if (thA != null) {
                if (thA instanceof CancellationException) {
                    throw thA;
                }
                samsungModule2.rejectConnection(thA);
            }
            return Unit.f14616a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    static {
        Intent intentPutExtra = new Intent("com.msc.action.samsungaccount.REQUEST_NEW_THIRD_PARTY_INTEGRATION_WITH_SAMSUNG_ACCOUNT").putExtra("client_id", BuildConfig.SAMSUNGxDISCORD_CLIENT_ID).putExtra("progress_theme", "dark");
        Intrinsics.checkNotNullExpressionValue(intentPutExtra, "putExtra(...)");
        disclaimerIntent = intentPutExtra;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.discord.samsung.SamsungModule$samsungActivityEventListener$1, com.facebook.react.bridge.ActivityEventListener] */
    public SamsungModule(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.reactContext = reactContext;
        ?? r5 = new BaseActivityEventListener() { // from class: com.discord.samsung.SamsungModule$samsungActivityEventListener$1
            @Override // com.facebook.react.bridge.BaseActivityEventListener, com.facebook.react.bridge.ActivityEventListener
            public void onActivityResult(Activity activity, int requestCode, int resultCode, Intent data) {
                Bundle extras;
                Bundle extras2;
                Intrinsics.checkNotNullParameter(activity, "activity");
                String string = null;
                if (requestCode == 100) {
                    if (resultCode == -1) {
                        SamsungModule.resolveConnection$default(this.this$0, null, 1, null);
                        return;
                    }
                    String string2 = (data == null || (extras2 = data.getExtras()) == null) ? null : extras2.getString("error_message");
                    if (data != null && (extras = data.getExtras()) != null) {
                        string = extras.getString("error_code");
                    }
                    this.this$0.rejectConnection(new Throwable(a3.e.m("Connection requires disclaimer acceptance. [", string, "] ", string2)));
                    return;
                }
                if (requestCode != 101) {
                    super.onActivityResult(activity, requestCode, resultCode, data);
                    return;
                }
                if (resultCode == 500) {
                    this.this$0.handleAuthResult(new SamsungConnectActivity.Result.Failure(true, data != null ? data.getIntExtra(SamsungConnectActivity.EXTRA_ATTEMPT_COUNT, 0) : 0));
                    return;
                }
                if (data == null) {
                    this.this$0.handleAuthResult(new SamsungConnectActivity.Result.Failure(false, 0, 2, null));
                    return;
                }
                String stringExtra = data.getStringExtra(SamsungConnectActivity.EXTRA_REQ_AUTH_PARAM_AUTH_CODE);
                if (stringExtra == null) {
                    stringExtra = "";
                }
                String stringExtra2 = data.getStringExtra(SamsungConnectActivity.EXTRA_REQ_AUTH_PARAM_AUTH_SERVER_URL);
                this.this$0.handleAuthResult(new SamsungConnectActivity.Result.Success(stringExtra, stringExtra2 != null ? stringExtra2 : ""));
            }
        };
        this.samsungActivityEventListener = r5;
        getReactApplicationContext().addActivityEventListener(r5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getAccountUrlAndAuthCode$lambda$1(SamsungModule samsungModule, Throwable th2) {
        Intrinsics.checkNotNull(th2);
        samsungModule.rejectConnection(th2);
        return Unit.f14616a;
    }

    private final String getAccountUrlFromAuthServerUrl(String authServerUrl) {
        String strB = kotlin.text.b0.B(2, authServerUrl);
        int iHashCode = strB.hashCode();
        if (iHashCode == 3179) {
            return !strB.equals("cn") ? "https://account.samsung.com" : "https://account.samsung.cn";
        }
        if (iHashCode != 3248) {
            return (iHashCode == 3742 && strB.equals("us")) ? "https://us.account.samsung.com" : "https://account.samsung.com";
        }
        strB.equals("eu");
        return "https://account.samsung.com";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleAuthResult(SamsungConnectActivity.Result result) {
        if (result instanceof SamsungConnectActivity.Result.Success) {
            SamsungConnectActivity.Result.Success success = (SamsungConnectActivity.Result.Success) result;
            resolveConnection(NativeArrayExtensionsKt.nativeArrayOf(getAccountUrlFromAuthServerUrl(success.getServerUrl()), success.getAuthCode()));
            return;
        }
        if (!(result instanceof SamsungConnectActivity.Result.Failure)) {
            throw new n();
        }
        SamsungConnectActivity.Result.Failure failure = (SamsungConnectActivity.Result.Failure) result;
        if (failure.isRetryAllowed() && failure.getAttemptCount() < 2) {
            Activity currentActivity = this.reactContext.getCurrentActivity();
            if (currentActivity == null) {
                rejectConnection(new Throwable("No current activity to retry Samsung auth"));
                return;
            } else {
                ActivityUtilities.startActivityForResultAsyncWithFuture$default(ActivityUtilities.INSTANCE, currentActivity, SamsungConnectActivity.INSTANCE.getIntent(currentActivity, failure.getAttemptCount()), 101, null, 8, null).exceptionally((Function) new a(this, 1));
                return;
            }
        }
        rejectConnection(new Throwable("Attempts: " + failure.getAttemptCount() + ", Retry: " + failure.isRetryAllowed()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleAuthResult$lambda$2(SamsungModule samsungModule, Throwable th2) {
        Intrinsics.checkNotNull(th2);
        samsungModule.rejectConnection(th2);
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:21:0x0036  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0037, code lost:
    
        if (r3 != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.net.Uri handleSamsungCallback(okhttp3.Response r6) {
        /*
            r5 = this;
            java.lang.String r0 = "Location"
            r1 = 0
            java.lang.String r0 = r6.f(r0, r1)
            if (r0 == 0) goto Le
            android.net.Uri r0 = android.net.Uri.parse(r0)
            goto Lf
        Le:
            r0 = r1
        Lf:
            java.lang.String r2 = "error"
            r3 = 0
            if (r0 == 0) goto L1f
            java.lang.String r4 = r0.getQuery()
            if (r4 == 0) goto L1f
            boolean r4 = kotlin.text.StringsKt.D(r4, r2, r3)
            goto L20
        L1f:
            r4 = r3
        L20:
            if (r4 != 0) goto L3a
            boolean r4 = r6.g()
            if (r4 != 0) goto L39
            int r6 = r6.f17382v
            r4 = 307(0x133, float:4.3E-43)
            if (r6 == r4) goto L36
            r4 = 308(0x134, float:4.32E-43)
            if (r6 == r4) goto L36
            switch(r6) {
                case 300: goto L36;
                case 301: goto L36;
                case 302: goto L36;
                case 303: goto L36;
                default: goto L35;
            }
        L35:
            goto L37
        L36:
            r3 = 1
        L37:
            if (r3 == 0) goto L3a
        L39:
            return r0
        L3a:
            com.discord.samsung.SamsungModule$Companion$SamsungCallbackException r6 = new com.discord.samsung.SamsungModule$Companion$SamsungCallbackException
            if (r0 == 0) goto L44
            java.lang.String r2 = r0.getQueryParameter(r2)
            if (r2 != 0) goto L47
        L44:
            java.lang.String r2 = "unknown"
        L47:
            if (r0 == 0) goto L4f
            java.lang.String r1 = "error_description"
            java.lang.String r1 = r0.getQueryParameter(r1)
        L4f:
            r6.<init>(r2, r1)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.samsung.SamsungModule.handleSamsungCallback(okhttp3.Response):android.net.Uri");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void rejectConnection(Throwable throwable) {
        Promise promise = this.connectionPromise;
        if (promise != null) {
            promise.reject(throwable);
        }
        this.connectionPromise = null;
    }

    private final void resolveConnection(Object what) {
        Promise promise = this.connectionPromise;
        if (promise != null) {
            promise.resolve(what);
        }
        this.connectionPromise = null;
    }

    public static /* synthetic */ void resolveConnection$default(SamsungModule samsungModule, Object obj, int i7, Object obj2) {
        if ((i7 & 1) != 0) {
            obj = null;
        }
        samsungModule.resolveConnection(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showConnectionDisclaimer$lambda$0(SamsungModule samsungModule, Throwable th2) {
        Intrinsics.checkNotNull(th2);
        samsungModule.rejectConnection(th2);
        return Unit.f14616a;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
    @ReactMethod
    public final void checkIfOAuthRequest(@NotNull String clientId, @NotNull Promise promise) {
        boolean z5;
        Intrinsics.checkNotNullParameter(clientId, "clientId");
        Intrinsics.checkNotNullParameter(promise, "promise");
        if (Intrinsics.areEqual(clientId, BuildConfig.SAMSUNG_CLIENT_ID) && Build.VERSION.SDK_INT >= 28) {
            z5 = x.i(Build.MANUFACTURER, "samsung", true);
        }
        promise.resolve(Boolean.valueOf(z5));
    }

    @ReactMethod
    public final void finishSamsungAuthorization(@NotNull String authCode, String location, String state, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(authCode, "authCode");
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.connectionPromise = promise;
        ComponentCallbacks2 currentActivity = this.reactContext.getCurrentActivity();
        Intrinsics.checkNotNull(currentActivity, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
        b0.t(b1.c((LifecycleOwner) currentActivity), null, new AnonymousClass1(location, this, state, authCode, null), 3);
    }

    @ReactMethod
    public final void getAccountUrlAndAuthCode(@NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.connectionPromise = promise;
        Activity currentActivity = getReactApplicationContext().getCurrentActivity();
        if (currentActivity == null) {
            rejectConnection(new IllegalStateException("No current activity to start Samsung auth"));
        } else {
            ActivityUtilities.INSTANCE.startActivityForResultAsyncWithFuture(currentActivity, SamsungConnectActivity.Companion.getIntent$default(SamsungConnectActivity.INSTANCE, currentActivity, 0, 2, null), 101, Bundle.EMPTY).exceptionally((Function<Throwable, ? extends Unit>) new a(this, 0));
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return "Samsung";
    }

    @NotNull
    public final ReactApplicationContext getReactContext() {
        return this.reactContext;
    }

    @ReactMethod
    public final void showConnectionDisclaimer(@NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.connectionPromise = promise;
        Activity currentActivity = getReactApplicationContext().getCurrentActivity();
        if (currentActivity == null) {
            rejectConnection(new IllegalStateException("No current activity to start Samsung disclaimer"));
        } else {
            ActivityUtilities.INSTANCE.startActivityForResultAsyncWithFuture(currentActivity, disclaimerIntent, 100, Bundle.EMPTY).exceptionally((Function<Throwable, ? extends Unit>) new a(this, 2));
        }
    }
}

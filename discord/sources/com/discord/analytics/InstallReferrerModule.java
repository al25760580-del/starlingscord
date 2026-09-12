package com.discord.analytics;

import android.content.SharedPreferences;
import ar.b0;
import ar.x1;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.ReferrerDetails;
import com.discord.misc.utilities.chat_view_types.ChatViewRecyclerTypes;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import rn.q;
import wn.a;
import xn.d;
import xn.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007¨\u0006\r"}, d2 = {"Lcom/discord/analytics/InstallReferrerModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "context", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "getName", "", "get", "", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "Companion", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class InstallReferrerModule extends ReactContextBaseJavaModule {
    private static final int MAX_ATTEMPTS = 10;

    /* JADX INFO: renamed from: com.discord.analytics.InstallReferrerModule$get$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @d(c = "com.discord.analytics.InstallReferrerModule$get$1", f = "InstallReferrerModule.kt", l = {ChatViewRecyclerTypes.POLL_TEXT_AND_IMAGE}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends h implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ int $attempts;
        final /* synthetic */ Ref.ObjectRef<InstallReferrerClient> $client;
        final /* synthetic */ SharedPreferences $prefs;
        final /* synthetic */ Promise $promise;
        final /* synthetic */ Ref.ObjectRef<String> $referrer;
        int label;
        final /* synthetic */ InstallReferrerModule this$0;

        /* JADX INFO: renamed from: com.discord.analytics.InstallReferrerModule$get$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @d(c = "com.discord.analytics.InstallReferrerModule$get$1$1", f = "InstallReferrerModule.kt", l = {41}, m = "invokeSuspend")
        @SourceDebugExtension({"SMAP\nInstallReferrerModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InstallReferrerModule.kt\ncom/discord/analytics/InstallReferrerModule$get$1$1\n+ 2 SharedPreferences.kt\nandroidx/core/content/SharedPreferencesKt\n*L\n1#1,98:1\n40#2,13:99\n40#2,13:112\n*S KotlinDebug\n*F\n+ 1 InstallReferrerModule.kt\ncom/discord/analytics/InstallReferrerModule$get$1$1\n*L\n45#1:99,13\n48#1:112,13\n*E\n"})
        public static final class C00161 extends h implements Function2<CoroutineScope, Continuation, Object> {
            final /* synthetic */ int $attempts;
            final /* synthetic */ Ref.ObjectRef<InstallReferrerClient> $client;
            final /* synthetic */ SharedPreferences $prefs;
            final /* synthetic */ Promise $promise;
            final /* synthetic */ Ref.ObjectRef<String> $referrer;
            private /* synthetic */ Object L$0;
            Object L$1;
            Object L$2;
            Object L$3;
            Object L$4;
            int label;
            final /* synthetic */ InstallReferrerModule this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00161(Ref.ObjectRef<InstallReferrerClient> objectRef, InstallReferrerModule installReferrerModule, Ref.ObjectRef<String> objectRef2, SharedPreferences sharedPreferences, Promise promise, int i7, Continuation continuation) {
                super(2, continuation);
                this.$client = objectRef;
                this.this$0 = installReferrerModule;
                this.$referrer = objectRef2;
                this.$prefs = sharedPreferences;
                this.$promise = promise;
                this.$attempts = i7;
            }

            @Override // xn.a
            public final Continuation create(Object obj, Continuation continuation) {
                C00161 c00161 = new C00161(this.$client, this.this$0, this.$referrer, this.$prefs, this.$promise, this.$attempts, continuation);
                c00161.L$0 = obj;
                return c00161;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v5, types: [T, com.android.installreferrer.api.InstallReferrerClient] */
            @Override // xn.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objO;
                Ref.ObjectRef<InstallReferrerClient> objectRef;
                Ref.ObjectRef<String> objectRef2;
                SharedPreferences sharedPreferences;
                Promise promise;
                Integer num;
                SharedPreferences sharedPreferences2;
                Promise promise2;
                ReferrerDetails installReferrer;
                a aVar = a.f22354d;
                int i7 = this.label;
                try {
                    if (i7 == 0) {
                        ib.a.L(obj);
                        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                        objectRef = this.$client;
                        InstallReferrerModule installReferrerModule = this.this$0;
                        objectRef2 = this.$referrer;
                        sharedPreferences = this.$prefs;
                        promise = this.$promise;
                        q qVar = Result.f14614e;
                        ?? Build = InstallReferrerClient.newBuilder(installReferrerModule.getReactApplicationContext()).build();
                        objectRef.element = Build;
                        if (Build != 0) {
                            this.L$0 = coroutineScope;
                            this.L$1 = objectRef;
                            this.L$2 = objectRef2;
                            this.L$3 = sharedPreferences;
                            this.L$4 = promise;
                            this.label = 1;
                            obj = InstallReferrerModuleKt.await(Build, this);
                            if (obj == aVar) {
                                return aVar;
                            }
                            sharedPreferences2 = sharedPreferences;
                            promise2 = promise;
                        } else {
                            num = null;
                        }
                        if (num != null || num.intValue() != 0) {
                            throw new IllegalStateException("Check failed.");
                        }
                        InstallReferrerClient installReferrerClient = objectRef.element;
                        objectRef2.element = (installReferrerClient == null || (installReferrer = installReferrerClient.getInstallReferrer()) == null) ? 0 : installReferrer.getInstallReferrer();
                        Intrinsics.checkNotNull(sharedPreferences);
                        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                        editorEdit.putString("referrer", objectRef2.element);
                        editorEdit.apply();
                        promise.resolve(objectRef2.element);
                        objO = Unit.f14616a;
                        q qVar2 = Result.f14614e;
                        SharedPreferences sharedPreferences3 = this.$prefs;
                        Promise promise3 = this.$promise;
                        int i10 = this.$attempts;
                        Throwable thA = Result.a(objO);
                        if (thA != null) {
                            Intrinsics.checkNotNull(sharedPreferences3);
                            SharedPreferences.Editor editorEdit2 = sharedPreferences3.edit();
                            editorEdit2.putInt("attempts", i10 + 1);
                            editorEdit2.apply();
                            promise3.resolve(null);
                            if (thA instanceof CancellationException) {
                                throw thA;
                            }
                        }
                        try {
                            InstallReferrerClient installReferrerClient2 = this.$client.element;
                            if (installReferrerClient2 != null) {
                                installReferrerClient2.endConnection();
                                Unit unit = Unit.f14616a;
                            }
                        } catch (Throwable th2) {
                            q qVar3 = Result.f14614e;
                            ib.a.o(th2);
                        }
                        return Unit.f14616a;
                    }
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    promise2 = (Promise) this.L$4;
                    sharedPreferences2 = (SharedPreferences) this.L$3;
                    objectRef2 = (Ref.ObjectRef) this.L$2;
                    objectRef = (Ref.ObjectRef) this.L$1;
                    ib.a.L(obj);
                    num = (Integer) obj;
                    promise = promise2;
                    sharedPreferences = sharedPreferences2;
                    if (num != null) {
                    }
                    throw new IllegalStateException("Check failed.");
                } catch (Throwable th3) {
                    q qVar4 = Result.f14614e;
                    objO = ib.a.o(th3);
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((C00161) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Ref.ObjectRef<InstallReferrerClient> objectRef, InstallReferrerModule installReferrerModule, Ref.ObjectRef<String> objectRef2, SharedPreferences sharedPreferences, Promise promise, int i7, Continuation continuation) {
            super(2, continuation);
            this.$client = objectRef;
            this.this$0 = installReferrerModule;
            this.$referrer = objectRef2;
            this.$prefs = sharedPreferences;
            this.$promise = promise;
            this.$attempts = i7;
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.$client, this.this$0, this.$referrer, this.$prefs, this.$promise, this.$attempts, continuation);
        }

        @Override // xn.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f22354d;
            int i7 = this.label;
            if (i7 == 0) {
                ib.a.L(obj);
                C00161 c00161 = new C00161(this.$client, this.this$0, this.$referrer, this.$prefs, this.$promise, this.$attempts, null);
                this.label = 1;
                if (x1.b(1000L, c00161, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ib.a.L(obj);
            }
            return Unit.f14616a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstallReferrerModule(@NotNull ReactApplicationContext context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.String] */
    @ReactMethod
    public final void get(@NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        SharedPreferences sharedPreferences = getReactApplicationContext().getSharedPreferences("InstallReferrer", 0);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = sharedPreferences.getString("referrer", null);
        int i7 = sharedPreferences.getInt("attempts", 0);
        Object obj = objectRef.element;
        if (obj != null) {
            promise.resolve(obj);
        } else if (i7 >= 10) {
            promise.resolve(null);
        } else {
            b0.t(b0.c(), null, new AnonymousClass1(new Ref.ObjectRef(), this, objectRef, sharedPreferences, promise, i7, null), 3);
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return "InstallReferrer";
    }
}

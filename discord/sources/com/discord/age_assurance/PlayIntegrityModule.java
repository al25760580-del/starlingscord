package com.discord.age_assurance;

import android.content.Context;
import ci.k;
import ci.m;
import ci.o;
import com.discord.codegen.NativePlayIntegrityModuleSpec;
import com.discord.logging.Log;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.google.android.play.core.integrity.StandardIntegrityManager;
import ig.h;
import ig.l;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import pc.r;
import wh.j;
import wh.s;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 (2\u00020\u0001:\u0001(B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J(\u0010\u001f\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u0010H\u0002J<\u0010\"\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u000b2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00140\u00132\u0016\u0010$\u001a\u0012\u0012\b\u0012\u00060\u0016j\u0002`\u0017\u0012\u0004\u0012\u00020\u00140\u0013H\u0002J\b\u0010%\u001a\u00020\u0014H\u0002J\u0014\u0010&\u001a\u00020\u00142\n\u0010'\u001a\u00060\u0016j\u0002`\u0017H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R \u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00140\u00130\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0015\u001a\u0018\u0012\u0014\u0012\u0012\u0012\b\u0012\u00060\u0016j\u0002`\u0017\u0012\u0004\u0012\u00020\u00140\u00130\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/discord/age_assurance/PlayIntegrityModule;", "Lcom/discord/codegen/NativePlayIntegrityModuleSpec;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "integrityManager", "Lcom/google/android/play/core/integrity/StandardIntegrityManager;", "tokenProvider", "Lcom/google/android/play/core/integrity/StandardIntegrityManager$StandardIntegrityTokenProvider;", "preparedCloudProjectNumber", "", "Ljava/lang/Long;", "prepareLock", "", "preparing", "", "pendingReady", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lkotlin/Function1;", "", "pendingError", "Ljava/lang/Exception;", "Lkotlin/Exception;", "requestIntegrityToken", "requestHashPayload", "", "cloudProjectNumber", "", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "requestWithProvider", "requestHash", "allowProviderRefresh", "withTokenProvider", "onReady", "onError", "invalidateTokenProvider", "failPrepare", "e", "Companion", "age_assurance_androidRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPlayIntegrityModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlayIntegrityModule.kt\ncom/discord/age_assurance/PlayIntegrityModule\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,186:1\n1869#2,2:187\n1869#2,2:189\n*S KotlinDebug\n*F\n+ 1 PlayIntegrityModule.kt\ncom/discord/age_assurance/PlayIntegrityModule\n*L\n171#1:187,2\n150#1:189,2\n*E\n"})
public final class PlayIntegrityModule extends NativePlayIntegrityModuleSpec {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Deprecated
    @NotNull
    public static final String ERROR_CODE = "PLAY_INTEGRITY_ERROR";

    @Deprecated
    @NotNull
    public static final String TAG = "PlayIntegrityModule";

    @NotNull
    private final StandardIntegrityManager integrityManager;

    @NotNull
    private final CopyOnWriteArrayList<Function1<Exception, Unit>> pendingError;

    @NotNull
    private final CopyOnWriteArrayList<Function1<StandardIntegrityManager.StandardIntegrityTokenProvider, Unit>> pendingReady;

    @NotNull
    private final Object prepareLock;
    private volatile Long preparedCloudProjectNumber;
    private boolean preparing;
    private volatile StandardIntegrityManager.StandardIntegrityTokenProvider tokenProvider;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/discord/age_assurance/PlayIntegrityModule$Companion;", "", "<init>", "()V", "TAG", "", "ERROR_CODE", "age_assurance_androidRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayIntegrityModule(@NotNull ReactApplicationContext reactContext) {
        r rVar;
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        Context reactApplicationContext = getReactApplicationContext();
        synchronized (j.class) {
            try {
                if (j.f22285a == null) {
                    Context applicationContext = reactApplicationContext.getApplicationContext();
                    j.f22285a = new r(applicationContext != null ? applicationContext : reactApplicationContext);
                }
                rVar = j.f22285a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        StandardIntegrityManager standardIntegrityManager = (StandardIntegrityManager) ((o) rVar.f17922d).a();
        Intrinsics.checkNotNullExpressionValue(standardIntegrityManager, "createStandard(...)");
        this.integrityManager = standardIntegrityManager;
        this.prepareLock = new Object();
        this.pendingReady = new CopyOnWriteArrayList<>();
        this.pendingError = new CopyOnWriteArrayList<>();
    }

    private final void failPrepare(Exception e10) {
        List listI0;
        synchronized (this.prepareLock) {
            this.preparing = false;
            listI0 = CollectionsKt.i0(this.pendingError);
            this.pendingReady.clear();
            this.pendingError.clear();
            Unit unit = Unit.f14616a;
        }
        Iterator it = listI0.iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke(e10);
        }
    }

    private final void invalidateTokenProvider() {
        synchronized (this.prepareLock) {
            this.tokenProvider = null;
            this.preparedCloudProjectNumber = null;
            Unit unit = Unit.f14616a;
        }
    }

    private final void requestWithProvider(final String requestHash, final long cloudProjectNumber, final Promise promise, final boolean allowProviderRefresh) {
        withTokenProvider(cloudProjectNumber, new Function1() { // from class: com.discord.age_assurance.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PlayIntegrityModule.requestWithProvider$lambda$3(requestHash, promise, allowProviderRefresh, this, cloudProjectNumber, (StandardIntegrityManager.StandardIntegrityTokenProvider) obj);
            }
        }, new c(promise, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestWithProvider$lambda$3(final String str, final Promise promise, final boolean z5, final PlayIntegrityModule playIntegrityModule, final long j, StandardIntegrityManager.StandardIntegrityTokenProvider provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        int i7 = k.f3709i;
        m mVar = m.f3714y;
        if (mVar == null) {
            throw new NullPointerException("Null verdictOptOut");
        }
        l lVarA = provider.a(new s(str, mVar));
        app.rive.runtime.kotlin.core.a aVar = new app.rive.runtime.kotlin.core.a(9, new c(promise, 2));
        lVarA.getClass();
        lVarA.e(h.f11764a, aVar);
        lVarA.o(new ig.c() { // from class: com.discord.age_assurance.e
            @Override // ig.c
            public final void onFailure(Exception exc) {
                PlayIntegrityModule.requestWithProvider$lambda$3$lambda$2(z5, playIntegrityModule, str, j, promise, exc);
            }
        });
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestWithProvider$lambda$3$lambda$0(Promise promise, StandardIntegrityManager.StandardIntegrityToken standardIntegrityToken) {
        promise.resolve(standardIntegrityToken.a());
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void requestWithProvider$lambda$3$lambda$2(boolean z5, PlayIntegrityModule playIntegrityModule, String str, long j, Promise promise, Exception e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        if (!z5 || !PlayIntegrityModuleKt.isTokenProviderInvalid(e10)) {
            Log.INSTANCE.e(TAG, "requestIntegrityToken failed", e10);
            promise.reject(ERROR_CODE, e10.getMessage(), e10);
        } else {
            Log.INSTANCE.w(TAG, "token provider invalid; re-preparing and retrying once", e10);
            playIntegrityModule.invalidateTokenProvider();
            playIntegrityModule.requestWithProvider(str, j, promise, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestWithProvider$lambda$4(Promise promise, Exception e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        Log.INSTANCE.e(TAG, "prepareIntegrityToken failed", e10);
        promise.reject(ERROR_CODE, e10.getMessage(), e10);
        return Unit.f14616a;
    }

    private final void withTokenProvider(final long cloudProjectNumber, Function1<? super StandardIntegrityManager.StandardIntegrityTokenProvider, Unit> onReady, Function1<? super Exception, Unit> onError) {
        Long l6;
        Long l7;
        Long l10;
        StandardIntegrityManager.StandardIntegrityTokenProvider standardIntegrityTokenProvider = this.tokenProvider;
        if (standardIntegrityTokenProvider != null && (l10 = this.preparedCloudProjectNumber) != null && l10.longValue() == cloudProjectNumber) {
            onReady.invoke(standardIntegrityTokenProvider);
            return;
        }
        synchronized (this.prepareLock) {
            StandardIntegrityManager.StandardIntegrityTokenProvider standardIntegrityTokenProvider2 = this.tokenProvider;
            if (standardIntegrityTokenProvider2 != null && (l7 = this.preparedCloudProjectNumber) != null && l7.longValue() == cloudProjectNumber) {
                onReady.invoke(standardIntegrityTokenProvider2);
                return;
            }
            if (this.preparedCloudProjectNumber != null && ((l6 = this.preparedCloudProjectNumber) == null || l6.longValue() != cloudProjectNumber)) {
                this.tokenProvider = null;
                this.preparedCloudProjectNumber = null;
            }
            this.pendingReady.add(onReady);
            this.pendingError.add(onError);
            if (this.preparing) {
                return;
            }
            this.preparing = true;
            Unit unit = Unit.f14616a;
            StandardIntegrityManager standardIntegrityManager = this.integrityManager;
            byte b10 = (byte) (1 | ((byte) 2));
            if (b10 == 3) {
                l lVarA = standardIntegrityManager.a(new wh.r(cloudProjectNumber));
                lVarA.e(h.f11764a, new app.rive.runtime.kotlin.core.a(10, new Function1() { // from class: com.discord.age_assurance.f
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return PlayIntegrityModule.withTokenProvider$lambda$8(this.f3949d, cloudProjectNumber, (StandardIntegrityManager.StandardIntegrityTokenProvider) obj);
                    }
                }));
                lVarA.o(new app.rive.runtime.kotlin.core.a(11, this));
            } else {
                StringBuilder sb2 = new StringBuilder();
                if ((b10 & 1) == 0) {
                    sb2.append(" cloudProjectNumber");
                }
                if ((b10 & 2) == 0) {
                    sb2.append(" webViewRequestMode");
                }
                throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void withTokenProvider$lambda$10(PlayIntegrityModule playIntegrityModule, Exception e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        playIntegrityModule.failPrepare(e10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit withTokenProvider$lambda$8(PlayIntegrityModule playIntegrityModule, long j, StandardIntegrityManager.StandardIntegrityTokenProvider standardIntegrityTokenProvider) {
        List<Function1> listI0;
        playIntegrityModule.tokenProvider = standardIntegrityTokenProvider;
        playIntegrityModule.preparedCloudProjectNumber = Long.valueOf(j);
        synchronized (playIntegrityModule.prepareLock) {
            playIntegrityModule.preparing = false;
            listI0 = CollectionsKt.i0(playIntegrityModule.pendingReady);
            playIntegrityModule.pendingReady.clear();
            playIntegrityModule.pendingError.clear();
            Unit unit = Unit.f14616a;
        }
        for (Function1 function1 : listI0) {
            Intrinsics.checkNotNull(standardIntegrityTokenProvider);
            function1.invoke(standardIntegrityTokenProvider);
        }
        return Unit.f14616a;
    }

    @Override // com.discord.codegen.NativePlayIntegrityModuleSpec
    public void requestIntegrityToken(@NotNull String requestHashPayload, double cloudProjectNumber, @NotNull Promise promise) {
        Promise promise2;
        Intrinsics.checkNotNullParameter(requestHashPayload, "requestHashPayload");
        Intrinsics.checkNotNullParameter(promise, "promise");
        try {
            promise2 = promise;
            try {
                requestWithProvider(PlayIntegrityModuleKt.sha256Hex(requestHashPayload), (long) cloudProjectNumber, promise2, true);
            } catch (Exception e10) {
                e = e10;
                Exception exc = e;
                Log.INSTANCE.e(TAG, "Failed to request integrity token", exc);
                promise2.reject(ERROR_CODE, exc.getMessage(), exc);
            }
        } catch (Exception e11) {
            e = e11;
            promise2 = promise;
        }
    }
}

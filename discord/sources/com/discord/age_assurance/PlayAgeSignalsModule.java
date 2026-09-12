package com.discord.age_assurance;

import android.app.Activity;
import com.discord.codegen.NativePlayAgeSignalsModuleSpec;
import com.discord.logging.Log;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.google.android.play.agesignals.AgeSignalsAccessResult;
import com.google.android.play.agesignals.AgeSignalsManager;
import com.google.android.play.agesignals.AgeSignalsResult;
import e4.i;
import ig.h;
import ig.l;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import ph.g;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0002¨\u0006\u0012"}, d2 = {"Lcom/discord/age_assurance/PlayAgeSignalsModule;", "Lcom/discord/codegen/NativePlayAgeSignalsModuleSpec;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "setFakeAgeSignalsScenario", "", "scenario", "", "getAgeSignals", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "retrieveAgeSignals", "manager", "Lcom/google/android/play/agesignals/AgeSignalsManager;", "createManager", "Companion", "age_assurance_androidRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PlayAgeSignalsModule extends NativePlayAgeSignalsModuleSpec {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Deprecated
    @NotNull
    public static final String TAG = "PlayAgeSignalsModule";
    private static volatile String fakeScenario;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/discord/age_assurance/PlayAgeSignalsModule$Companion;", "", "<init>", "()V", "TAG", "", "fakeScenario", "getFakeScenario", "()Ljava/lang/String;", "setFakeScenario", "(Ljava/lang/String;)V", "age_assurance_androidRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String getFakeScenario() {
            return PlayAgeSignalsModule.fakeScenario;
        }

        public final void setFakeScenario(String str) {
            PlayAgeSignalsModule.fakeScenario = str;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayAgeSignalsModule(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
    }

    private final AgeSignalsManager createManager() {
        String str = fakeScenario;
        if (str == null) {
            ph.c cVar = new ph.c(new g(getReactApplicationContext()));
            Intrinsics.checkNotNullExpressionValue(cVar, "create(...)");
            return cVar;
        }
        i iVar = new i(14);
        Log.i$default(Log.INSTANCE, TAG, "Using FakeAgeSignalsManager scenario=".concat(str), (Throwable) null, 4, (Object) null);
        if (Intrinsics.areEqual(str, "error")) {
            iVar.f7982v = new ph.a(-1, 0);
            iVar.f7983w = null;
            return iVar;
        }
        if (Intrinsics.areEqual(str, "check_error")) {
            AgeSignalsAccessResult ageSignalsAccessResultFakeAccessResult = PlayAgeSignalsModuleKt.fakeAccessResult(1);
            iVar.f7982v = null;
            iVar.f7983w = ageSignalsAccessResultFakeAccessResult;
            iVar.f7980e = new ph.a(-1, 0);
            iVar.f7981i = null;
            return iVar;
        }
        AgeSignalsAccessResult ageSignalsAccessResultFakeAccessResult2 = PlayAgeSignalsModuleKt.fakeAccessResult(PlayAgeSignalsModuleKt.accessStatusFor(str));
        iVar.f7982v = null;
        iVar.f7983w = ageSignalsAccessResultFakeAccessResult2;
        AgeSignalsResult ageSignalsResultBuildFakeResult = PlayAgeSignalsModuleKt.buildFakeResult(str);
        iVar.f7980e = null;
        iVar.f7981i = ageSignalsResultBuildFakeResult;
        return iVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getAgeSignals$lambda$0(PlayAgeSignalsModule playAgeSignalsModule, AgeSignalsManager ageSignalsManager, Promise promise, AgeSignalsAccessResult ageSignalsAccessResult) {
        Integer numA = ageSignalsAccessResult.a();
        if (numA != null && numA.intValue() == 1) {
            playAgeSignalsModule.retrieveAgeSignals(ageSignalsManager, promise);
        } else {
            promise.resolve(PlayAgeSignalsModuleKt.statusOnlyMap(numA));
        }
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getAgeSignals$lambda$2(Promise promise, Exception e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        Log log = Log.INSTANCE;
        String str = fakeScenario;
        if (str == null) {
            str = "off";
        }
        log.e(TAG, s0.g.e("requestAgeSignalsAccess failed (scenario=", str, ")"), e10);
        promise.reject("PLAY_AGE_SIGNALS_ERROR", e10.getMessage(), e10);
    }

    private final void retrieveAgeSignals(AgeSignalsManager manager, Promise promise) {
        l lVarH = manager.h(new kh.f(14));
        app.rive.runtime.kotlin.core.a aVar = new app.rive.runtime.kotlin.core.a(8, new c(promise, 0));
        lVarH.getClass();
        lVarH.e(h.f11764a, aVar);
        lVarH.o(new b(promise, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit retrieveAgeSignals$lambda$3(Promise promise, AgeSignalsResult ageSignalsResult) {
        Intrinsics.checkNotNull(ageSignalsResult);
        promise.resolve(PlayAgeSignalsModuleKt.toWritableMap(ageSignalsResult));
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void retrieveAgeSignals$lambda$5(Promise promise, Exception e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        Log log = Log.INSTANCE;
        String str = fakeScenario;
        if (str == null) {
            str = "off";
        }
        log.e(TAG, s0.g.e("checkAgeSignals failed (scenario=", str, ")"), e10);
        promise.reject("PLAY_AGE_SIGNALS_ERROR", e10.getMessage(), e10);
    }

    @Override // com.discord.codegen.NativePlayAgeSignalsModuleSpec
    public void getAgeSignals(@NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        Activity currentActivity = getReactApplicationContext().getCurrentActivity();
        if (currentActivity == null) {
            promise.reject("PLAY_AGE_SIGNALS_NO_ACTIVITY", "No foreground Activity to host the sharing prompt");
            return;
        }
        try {
            AgeSignalsManager ageSignalsManagerCreateManager = createManager();
            l lVarG = ageSignalsManagerCreateManager.g(new ph.h(currentActivity));
            app.rive.runtime.kotlin.core.a aVar = new app.rive.runtime.kotlin.core.a(7, new a(this, ageSignalsManagerCreateManager, promise, 0));
            lVarG.getClass();
            h4.a aVar2 = h.f11764a;
            lVarG.e(aVar2, aVar);
            lVarG.c(aVar2, new b(promise, 0));
            Intrinsics.checkNotNull(lVarG);
        } catch (Exception e10) {
            Log.INSTANCE.e(TAG, "Failed to request age signals access", e10);
            promise.reject("PLAY_AGE_SIGNALS_ERROR", e10.getMessage(), e10);
        }
    }

    @Override // com.discord.codegen.NativePlayAgeSignalsModuleSpec
    public void setFakeAgeSignalsScenario(@NotNull String scenario) {
        Intrinsics.checkNotNullParameter(scenario, "scenario");
        String string = StringsKt.b0(scenario).toString();
        if (string.length() == 0 || Intrinsics.areEqual(string, "off")) {
            string = null;
        }
        fakeScenario = string;
        Log log = Log.INSTANCE;
        String str = fakeScenario;
        Log.i$default(log, TAG, "setFakeAgeSignalsScenario=".concat(str != null ? str : "off"), (Throwable) null, 4, (Object) null);
    }
}

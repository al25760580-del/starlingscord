package com.discord.image.fresco;

import android.content.Context;
import c9.a;
import com.discord.chat.presentation.message.view.voicemessages.f;
import com.discord.image.fresco.config.FrescoConfigKt;
import com.discord.image.fresco.config.FrescoMemoryTrimmer;
import com.discord.native_experiments.FrescoMemoryCacheExperimentConfig;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.modules.fresco.FrescoModule;
import com.facebook.react.uimanager.ViewProps;
import java.util.concurrent.CountDownLatch;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import w3.q;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0002J\b\u0010\b\u001a\u00020\tH\u0016¨\u0006\u000b"}, d2 = {"Lcom/discord/image/fresco/FrescoModuleDiscord;", "Lcom/facebook/react/modules/fresco/FrescoModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "initializeSkinny", "", "canOverrideExistingModule", "", "Companion", "fresco_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FrescoModuleDiscord extends FrescoModule {
    private static volatile boolean asyncInitStarted;
    private static volatile boolean isFrescoExternallyInitialized;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final CountDownLatch initLatch = new CountDownLatch(1);

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\t\u001a\u00020\u0007H\u0002J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0007J\u000e\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0007J\u000e\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u0010\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/discord/image/fresco/FrescoModuleDiscord$Companion;", "", "<init>", "()V", "initLatch", "Ljava/util/concurrent/CountDownLatch;", "asyncInitStarted", "", "isFrescoExternallyInitialized", "isFrescoInitialized", "startFrescoInitializationAsync", "", "context", "Landroid/content/Context;", "configureMemoryCacheReductionPercent", "percent", "", "configureDiskCacheRoutingEnabled", ViewProps.ENABLED, "configureDisableLowPriorityMemoryCache", "initializeFresco", "performInit", "fresco_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final synchronized boolean isFrescoInitialized() {
            return FrescoModuleDiscord.isFrescoExternallyInitialized || FrescoModuleDiscord.asyncInitStarted;
        }

        private final void performInit(Context context) {
            a.z(context, FrescoConfigKt.frescoConfig(context), null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit startFrescoInitializationAsync$lambda$1(Context context) {
            try {
                FrescoModuleDiscord.INSTANCE.performInit(context);
                return Unit.f14616a;
            } finally {
                FrescoModuleDiscord.initLatch.countDown();
            }
        }

        public final void configureDisableLowPriorityMemoryCache(boolean enabled) {
            FrescoMemoryCacheExperimentConfig.INSTANCE.configureDisableLowPriorityMemoryCache(enabled);
        }

        public final void configureDiskCacheRoutingEnabled(boolean enabled) {
            FrescoMemoryCacheExperimentConfig.INSTANCE.configureDiskCacheRoutingEnabled(enabled);
        }

        public final void configureMemoryCacheReductionPercent(int percent) {
            FrescoMemoryCacheExperimentConfig.INSTANCE.configureReductionPercent(percent);
        }

        public final synchronized void initializeFresco(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (isFrescoInitialized()) {
                if (FrescoModuleDiscord.asyncInitStarted) {
                    FrescoModuleDiscord.initLatch.await();
                }
                return;
            }
            FrescoModuleDiscord.isFrescoExternallyInitialized = true;
            try {
                performInit(context);
                FrescoModuleDiscord.initLatch.countDown();
            } catch (Throwable th2) {
                FrescoModuleDiscord.initLatch.countDown();
                throw th2;
            }
        }

        public final void startFrescoInitializationAsync(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            synchronized (this) {
                if (FrescoModuleDiscord.asyncInitStarted) {
                    return;
                }
                FrescoModuleDiscord.asyncInitStarted = true;
                Unit unit = Unit.f14616a;
                q.B("FrescoInitThread", 0, new f(context, 2), 22);
            }
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FrescoModuleDiscord(@NotNull ReactApplicationContext reactContext) {
        super(reactContext, false, null, 6, null);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        INSTANCE.initializeFresco(reactContext);
        FrescoMemoryTrimmer.INSTANCE.initialize(reactContext);
        initializeSkinny();
    }

    private final void initializeSkinny() {
        getReactApplicationContext().addLifecycleEventListener(this);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public boolean canOverrideExistingModule() {
        return true;
    }
}

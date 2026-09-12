package com.facebook.react.common.annotations.internal;

import com.facebook.react.bridge.AssertionException;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.common.build.ReactBuildConfig;
import com.facebook.react.devsupport.StackTraceHelper;
import kk.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rn.n;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007J\u001a\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0002¨\u0006\u000b"}, d2 = {"Lcom/facebook/react/common/annotations/internal/LegacyArchitectureLogger;", "", "<init>", "()V", "assertLegacyArchitecture", "", StackTraceHelper.NAME_KEY, "", "logLevel", "Lcom/facebook/react/common/annotations/internal/LegacyArchitectureLogLevel;", "executeAssert", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LegacyArchitectureLogger {

    @NotNull
    public static final LegacyArchitectureLogger INSTANCE = new LegacyArchitectureLogger();

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LegacyArchitectureLogLevel.values().length];
            try {
                iArr[LegacyArchitectureLogLevel.ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LegacyArchitectureLogLevel.WARNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private LegacyArchitectureLogger() {
    }

    public static final void assertLegacyArchitecture(@NotNull String name, @NotNull LegacyArchitectureLogLevel logLevel) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(logLevel, "logLevel");
        if (ReactBuildConfig.UNSTABLE_ENABLE_MINIFY_LEGACY_ARCHITECTURE) {
            INSTANCE.executeAssert(name, logLevel);
        }
    }

    public static /* synthetic */ void assertLegacyArchitecture$default(String str, LegacyArchitectureLogLevel legacyArchitectureLogLevel, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            legacyArchitectureLogLevel = LegacyArchitectureLogLevel.WARNING;
        }
        assertLegacyArchitecture(str, legacyArchitectureLogLevel);
    }

    private final void executeAssert(String name, LegacyArchitectureLogLevel logLevel) {
        if (ReactBuildConfig.DEBUG) {
            int i7 = WhenMappings.$EnumSwitchMapping$0[logLevel.ordinal()];
            if (i7 == 1) {
                throw new AssertionException(b.j(name, " is being executed when app is fully running on the NEW Architecture."));
            }
            if (i7 != 2) {
                throw new n();
            }
            ReactSoftExceptionLogger.logSoftException(ReactSoftExceptionLogger.Categories.SOFT_ASSERTIONS, new ReactNoCrashSoftException(b.j(name, " is being executed when app is fully running on the NEW Architecture.")));
        }
    }

    public static /* synthetic */ void executeAssert$default(LegacyArchitectureLogger legacyArchitectureLogger, String str, LegacyArchitectureLogLevel legacyArchitectureLogLevel, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            legacyArchitectureLogLevel = LegacyArchitectureLogLevel.WARNING;
        }
        legacyArchitectureLogger.executeAssert(str, legacyArchitectureLogLevel);
    }
}

package com.discord.crash_reporting;

import android.content.Context;
import android.os.Build;
import androidx.annotation.Keep;
import androidx.appcompat.widget.k1;
import com.discord.client_info.ClientInfo;
import com.discord.libdiscore.LibdiscoreModuleProvider;
import com.discord.lifecycle.ActivityResumedTracker;
import com.discord.lifecycle.AppLifecycle;
import com.discord.lifecycle.ForegroundServiceStartGuard;
import com.discord.logging.Log;
import com.discord.tti_manager.TTIModule;
import com.facebook.jni.annotations.DoNotStrip;
import com.facebook.react.modules.appstate.AppStateModule;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import io.sentry.Breadcrumb;
import io.sentry.Hint;
import io.sentry.IScope;
import io.sentry.SentryEvent;
import io.sentry.SentryLevel;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.d1;
import io.sentry.android.core.m0;
import io.sentry.b4;
import io.sentry.c4;
import io.sentry.f6;
import io.sentry.protocol.SentryStackFrame;
import io.sentry.protocol.a0;
import io.sentry.protocol.m;
import io.sentry.protocol.u;
import io.sentry.protocol.v;
import io.sentry.w5;
import io.sentry.x0;
import java.net.ConnectException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.security.cert.CertPathValidatorException;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.c0;
import kotlin.collections.d0;
import kotlin.collections.w0;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlin.text.x;
import lo.j;
import org.jetbrains.annotations.NotNull;
import rn.f;
import rn.n;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003]^_B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\b\u0010\u0012\u001a\u00020\u0005H\u0002J\b\u0010\u0013\u001a\u00020\u0005H\u0002J\u001e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019J\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u001bH\u0002J\u0018\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u001bH\u0002J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001c\u001a\u00020\u001bH\u0002J\u0012\u0010 \u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001c\u001a\u00020\u001bH\u0002J\u001c\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u0010#\u001a\u00020\"2\b\u0010$\u001a\u0004\u0018\u00010%H\u0002J*\u0010&\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0010\u001a\u00020\u00172\u0006\u0010'\u001a\u00020\u00172\u0006\u0010(\u001a\u00020\u00172\u0006\u0010)\u001a\u00020\u0017H\u0007J \u0010*\u001a\u00020\u001e2\u0006\u0010\u0010\u001a\u00020\u00172\u0006\u0010'\u001a\u00020\u00172\u0006\u0010(\u001a\u00020\u0017H\u0007J\u0018\u0010+\u001a\u00020\u001e2\u0006\u0010,\u001a\u00020\r2\b\b\u0002\u0010-\u001a\u00020\u0005J \u0010.\u001a\u00020\u001e2\u0006\u0010/\u001a\u00020\u00172\u0006\u0010(\u001a\u00020\u00172\b\b\u0002\u00100\u001a\u000201J\u001a\u0010.\u001a\u00020\u001e2\u0006\u0010/\u001a\u00020\u00172\n\u00102\u001a\u000603j\u0002`4J\u000e\u00105\u001a\u0002062\u0006\u00107\u001a\u000208J\u0010\u00109\u001a\u00020\u001e2\u0006\u0010:\u001a\u00020;H\u0007JF\u0010<\u001a\u00020\u001e2\u0006\u0010=\u001a\u00020\u00172\u0014\b\u0002\u0010>\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00010?2\n\b\u0002\u0010@\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u00107\u001a\u0004\u0018\u0001082\b\b\u0002\u0010A\u001a\u00020\u0005J\u001a\u0010B\u001a\u00020\u001e*\u00020\u00152\u0006\u0010C\u001a\u00020\u00172\u0006\u0010\u0006\u001a\u00020\u0017JH\u0010D\u001a\u00020\u001e2\u0006\u0010C\u001a\u00020\u00172\b\u0010(\u001a\u0004\u0018\u00010\u00172\u0014\u0010E\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u00010?2\u0006\u0010F\u001a\u00020G2\u000e\b\u0002\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00170\u000bH\u0002J\u0018\u0010I\u001a\u00020G2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010J\u001a\u00020KH\u0002J/\u0010L\u001a\u00020M2\u0006\u0010N\u001a\u00020G2\u0006\u0010O\u001a\u00020G2\u0006\u0010P\u001a\u00020M2\b\u0010Q\u001a\u0004\u0018\u00010GH\u0002¢\u0006\u0002\u0010RJ)\u0010S\u001a\u0004\u0018\u00010G2\b\u0010T\u001a\u0004\u0018\u00010G2\u0006\u0010U\u001a\u00020G2\u0006\u0010V\u001a\u00020MH\u0002¢\u0006\u0002\u0010WJ \u0010X\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020%2\u0006\u0010J\u001a\u00020KH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005@BX\u0086\u000e¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\n\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\r0\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010Y\u001a\u00020\u0017X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010Z\u001a\u00020\u0017X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010[\u001a\u00020\u0017X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\\\u001a\u00020MX\u0082T¢\u0006\u0002\n\u0000¨\u0006`"}, d2 = {"Lcom/discord/crash_reporting/CrashReporting;", "", "<init>", "()V", "TESTING_SENTRY", "", "value", "isCrashedLastRun", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "ignoreNetworkExceptionList", "", "Lkotlin/reflect/KClass;", "", "getSampleRate", "", "context", "Landroid/content/Context;", "isMetaQuest", "isDisabled", "init", "Lcom/discord/crash_reporting/CrashReporting$CrashReportingReady;", "releaseName", "", "libdiscoreModuleProvider", "Lcom/discord/libdiscore/LibdiscoreModuleProvider;", "handleBeforeSend", "Lio/sentry/SentryEvent;", "event", "persistLastCrashInfo", "", "getErrorMessage", "getErrorStack", "handleBeforeBreadcrumb", "Lio/sentry/Breadcrumb;", "breadcrumb", "hint", "Lio/sentry/Hint;", "libdiscoreEmitRustPanic", "detail", "message", "backtrace", "libdiscoreAddBreadcrumb", "captureException", "throwable", "ignoreNetworkExceptions", "captureMessage", "tag", "errorLevel", "Lcom/discord/crash_reporting/CrashReporting$ErrorLevel;", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "breadcrumbLevelToSentryLevel", "Lio/sentry/SentryLevel;", "level", "Lcom/discord/crash_reporting/CrashReporting$BreadcrumbLevel;", "addBreadcrumbBatchBinary", "buffer", "Ljava/nio/ByteBuffer;", "addBreadcrumb", "breadcrumbMessage", "breadcrumbData", "", "breadcrumbCategory", "log", "setTag", "key", "appendBreadcrumbToTelemetryRing", "data", "timestampMs", "", "channels", "getEventSize", "options", "Lio/sentry/android/core/SentryAndroidOptions;", "calculateBatchSize", "", "currentSize", "maxSizeBytes", "remainingBreadcrumbs", "avgBreadcrumbSize", "(JJILjava/lang/Long;)I", "computeAverageBreadcrumbSize", "previousEstimate", "sizeReduction", "removedCount", "(Ljava/lang/Long;JI)Ljava/lang/Long;", "incrementallyRemoveBreadcrumbs", "TAG_BUILD_NUMBER", "TAG_APP_VERSION", "TAG_EVENT_ORIGIN", "MAX_BREADCRUMBS", "CrashReportingReady", "BreadcrumbLevel", "ErrorLevel", "crash_reporting_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCrashReporting.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CrashReporting.kt\ncom/discord/crash_reporting/CrashReporting\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,801:1\n216#2,2:802\n216#2,2:804\n216#2,2:807\n1#3:806\n*S KotlinDebug\n*F\n+ 1 CrashReporting.kt\ncom/discord/crash_reporting/CrashReporting\n*L\n216#1:802,2\n353#1:804,2\n570#1:807,2\n*E\n"})
public final class CrashReporting {
    private static final int MAX_BREADCRUMBS = 5000;

    @NotNull
    private static final String TAG_APP_VERSION = "appVersion";

    @NotNull
    private static final String TAG_BUILD_NUMBER = "buildNumber";

    @NotNull
    private static final String TAG_EVENT_ORIGIN = "event.origin";
    private static final boolean TESTING_SENTRY = false;
    private static Boolean isCrashedLastRun;

    @NotNull
    public static final CrashReporting INSTANCE = new CrashReporting();

    @NotNull
    private static final List<KClass> ignoreNetworkExceptionList = d0.g(Reflection.getOrCreateKotlinClass(UnknownHostException.class), Reflection.getOrCreateKotlinClass(SocketTimeoutException.class), Reflection.getOrCreateKotlinClass(SocketException.class), Reflection.getOrCreateKotlinClass(ConnectException.class), Reflection.getOrCreateKotlinClass(SSLException.class), Reflection.getOrCreateKotlinClass(CertPathValidatorException.class), Reflection.getOrCreateKotlinClass(SSLHandshakeException.class));

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/discord/crash_reporting/CrashReporting$BreadcrumbLevel;", "", "<init>", "(Ljava/lang/String;I)V", "WARNING", "ERROR", "crash_reporting_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum BreadcrumbLevel {
        WARNING,
        ERROR;

        private static final /* synthetic */ EnumEntries $ENTRIES = com.facebook.imagepipeline.nativecode.b.l(values());

        @NotNull
        public static EnumEntries getEntries() {
            return $ENTRIES;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/discord/crash_reporting/CrashReporting$CrashReportingReady;", "", "<init>", "()V", "crash_reporting_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CrashReportingReady {
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/discord/crash_reporting/CrashReporting$ErrorLevel;", "", "<init>", "(Ljava/lang/String;I)V", "INFO", "WARNING", "crash_reporting_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum ErrorLevel {
        INFO,
        WARNING;

        private static final /* synthetic */ EnumEntries $ENTRIES = com.facebook.imagepipeline.nativecode.b.l(values());

        @NotNull
        public static EnumEntries getEntries() {
            return $ENTRIES;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ErrorLevel.values().length];
            try {
                iArr[ErrorLevel.INFO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ErrorLevel.WARNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[BreadcrumbLevel.values().length];
            try {
                iArr2[BreadcrumbLevel.WARNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[BreadcrumbLevel.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    private CrashReporting() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void addBreadcrumb$default(CrashReporting crashReporting, String str, Map map, String str2, BreadcrumbLevel breadcrumbLevel, boolean z5, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            map = w0.d();
        }
        Map map2 = map;
        String str3 = (i7 & 4) != 0 ? null : str2;
        BreadcrumbLevel breadcrumbLevel2 = (i7 & 8) != 0 ? null : breadcrumbLevel;
        if ((i7 & 16) != 0) {
            z5 = true;
        }
        crashReporting.addBreadcrumb(str, map2, str3, breadcrumbLevel2, z5);
    }

    private final void appendBreadcrumbToTelemetryRing(String key, String message, Map<String, ? extends Object> data, long timestampMs, List<String> channels) {
        try {
            TelemetryRing.INSTANCE.append(key, timestampMs, message, data, channels);
        } catch (Throwable th2) {
            Log.INSTANCE.w("SentryBreadcrumb", "Failed to append breadcrumb to TelemetryRing", th2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void appendBreadcrumbToTelemetryRing$default(CrashReporting crashReporting, String str, String str2, Map map, long j, List list, int i7, Object obj) {
        if ((i7 & 16) != 0) {
            list = c0.c("SENTRY");
        }
        crashReporting.appendBreadcrumbToTelemetryRing(str, str2, map, j, list);
    }

    private final int calculateBatchSize(long currentSize, long maxSizeBytes, int remainingBreadcrumbs, Long avgBreadcrumbSize) {
        double d6;
        long j = currentSize - maxSizeBytes;
        double d7 = j / maxSizeBytes;
        double d8 = remainingBreadcrumbs;
        int i7 = (int) (d8 * 0.5d);
        if (i7 < 1) {
            i7 = 1;
        }
        if (avgBreadcrumbSize != null && avgBreadcrumbSize.longValue() > 0) {
            return j.d((int) (j / avgBreadcrumbSize.longValue()), 1, i7);
        }
        if (d7 > 0.5d) {
            d6 = 0.3d;
        } else if (d7 > 0.2d) {
            d6 = 0.15d;
        } else if (d7 > 0.1d) {
            d6 = 0.08d;
        } else {
            d6 = d7 > 0.05d ? 0.03d : 0.0d;
        }
        return j.d((int) (d8 * d6), 1, i7);
    }

    public static /* synthetic */ void captureException$default(CrashReporting crashReporting, Throwable th2, boolean z5, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            z5 = false;
        }
        crashReporting.captureException(th2, z5);
    }

    public static /* synthetic */ void captureMessage$default(CrashReporting crashReporting, String str, String str2, ErrorLevel errorLevel, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            errorLevel = ErrorLevel.INFO;
        }
        crashReporting.captureMessage(str, str2, errorLevel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void captureMessage$lambda$17(String str, String str2, ErrorLevel errorLevel, IScope sentryScope) {
        SentryLevel sentryLevel;
        Intrinsics.checkNotNullParameter(sentryScope, "sentryScope");
        sentryScope.i(c0.c(str));
        int i7 = WhenMappings.$EnumSwitchMapping$0[errorLevel.ordinal()];
        if (i7 == 1) {
            sentryLevel = SentryLevel.INFO;
        } else {
            if (i7 != 2) {
                throw new n();
            }
            sentryLevel = SentryLevel.WARNING;
        }
        c4.b(str2, sentryLevel);
    }

    private final Long computeAverageBreadcrumbSize(Long previousEstimate, long sizeReduction, int removedCount) {
        if (sizeReduction <= 0 || removedCount <= 0) {
            return previousEstimate;
        }
        long j = sizeReduction / ((long) removedCount);
        if (previousEstimate == null) {
            return Long.valueOf(j);
        }
        return Long.valueOf((long) ((j * 0.3d) + (previousEstimate.longValue() * 0.7d)));
    }

    private final String getErrorMessage(SentryEvent event) {
        ArrayList arrayListD = event.d();
        u uVar = arrayListD != null ? (u) CollectionsKt.firstOrNull(arrayListD) : null;
        String str = uVar != null ? uVar.f13048d : null;
        String str2 = uVar != null ? uVar.f13049e : null;
        if (str != null && str2 != null) {
            return kk.b.k(str, ": ", str2);
        }
        if (str != null) {
            return str;
        }
        if (str2 != null) {
            return str2;
        }
        io.sentry.protocol.n nVar = event.N;
        if (nVar != null) {
            return nVar.f13002d;
        }
        return null;
    }

    private final String getErrorStack(SentryEvent event) {
        u uVar;
        a0 a0Var;
        List list;
        ArrayList arrayListD = event.d();
        if (arrayListD == null || (uVar = (u) CollectionsKt.firstOrNull(arrayListD)) == null || (a0Var = uVar.f13052w) == null || (list = a0Var.f12914d) == null || list.isEmpty()) {
            return null;
        }
        return CollectionsKt.O(list, ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE, null, null, new com.discord.chat.presentation.list.delegate.a(26), 30);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence getErrorStack$lambda$10(SentryStackFrame frame) {
        Integer num = -1;
        Intrinsics.checkNotNullParameter(frame, "frame");
        StringBuilder sb2 = new StringBuilder();
        String str = frame.f12903v;
        if (str != null) {
            sb2.append(str);
        }
        Integer num2 = frame.f12906y;
        if (num2 == null) {
            num2 = frame.E != null ? num : null;
        }
        Integer num3 = frame.E;
        if (num3 != null) {
            num = num3;
        } else if (num2 == null) {
            num = null;
        }
        if (num2 != null) {
            int iIntValue = num2.intValue();
            if (sb2.length() > 0) {
                sb2.append(':');
            }
            sb2.append(iIntValue);
            if (num != null) {
                int iIntValue2 = num.intValue();
                sb2.append(':');
                sb2.append(iIntValue2);
            }
        }
        String str2 = frame.f12904w;
        if (str2 != null) {
            sb2.append(" (");
            sb2.append(str2);
            sb2.append(')');
        }
        return sb2.toString();
    }

    private final long getEventSize(SentryEvent event, SentryAndroidOptions options) {
        return io.sentry.util.c.b(options.getSerializer(), options.getLogger(), event);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0026 A[PHI: r2
      0x0026: PHI (r2v5 java.lang.String) = 
      (r2v1 java.lang.String)
      (r2v2 java.lang.String)
      (r2v0 java.lang.String)
      (r2v3 java.lang.String)
      (r2v0 java.lang.String)
      (r2v4 java.lang.String)
      (r2v6 java.lang.String)
     binds: [B:36:0x0068, B:32:0x005b, B:27:0x004f, B:25:0x0046, B:20:0x003a, B:18:0x0031, B:13:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    private final Breadcrumb handleBeforeBreadcrumb(Breadcrumb breadcrumb, Hint hint) {
        String str;
        String strName;
        String str2 = breadcrumb.f12010y;
        if (str2 != null && !Intrinsics.areEqual(str2, "analytics")) {
            String lowerCase = null;
            String str3 = "app_lifecycle";
            switch (str2) {
                case "network.event":
                    str3 = "network_capabilities_changed";
                    str = str3;
                    break;
                case "device.event":
                    str3 = "device_event";
                    str = str3;
                    break;
                case "app.lifecycle":
                    str3 = "network_capabilities_changed";
                    str = str3;
                    break;
                case "ForegroundService":
                    str3 = "foreground_service";
                    str = str3;
                    break;
                case "lifecycle":
                    str3 = "network_capabilities_changed";
                    str = str3;
                    break;
                case "react.softexception":
                    str3 = "react_soft_exception";
                    str = str3;
                    break;
                case "ui.lifecycle":
                    str3 = "ui_lifecycle";
                    str = str3;
                    break;
                default:
                    str = null;
                    break;
            }
            if (str != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("type", breadcrumb.f12008w);
                SentryLevel sentryLevel = breadcrumb.F;
                if (sentryLevel != null && (strName = sentryLevel.name()) != null) {
                    lowerCase = strName.toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                }
                linkedHashMap.put("level", lowerCase);
                linkedHashMap.put("message", breadcrumb.f12007v);
                ConcurrentHashMap concurrentHashMap = breadcrumb.f12009x;
                Intrinsics.checkNotNullExpressionValue(concurrentHashMap, "getData(...)");
                for (Map.Entry entry : concurrentHashMap.entrySet()) {
                    linkedHashMap.put((String) entry.getKey(), entry.getValue());
                }
                String str4 = breadcrumb.f12007v;
                Date dateB = breadcrumb.b();
                appendBreadcrumbToTelemetryRing(str, str4, linkedHashMap, dateB != null ? dateB.getTime() : System.currentTimeMillis(), c0.c("ZOOMED"));
            }
        }
        return breadcrumb;
    }

    private final SentryEvent handleBeforeSend(Context context, SentryEvent event) {
        SentryLevel sentryLevel = event.R;
        AbstractMap abstractMap = event.f12674w;
        if (abstractMap != null) {
        }
        ArrayList arrayListD = event.d();
        if (arrayListD != null) {
        }
        boolean z5 = sentryLevel == null || sentryLevel == SentryLevel.FATAL || sentryLevel == SentryLevel.ERROR;
        try {
            event.c("app_process_lifecycle", AppLifecycle.INSTANCE.isForegrounded() ? "foreground" : AppStateModule.APP_STATE_BACKGROUND);
            ActivityResumedTracker.Snapshot snapshot = ActivityResumedTracker.INSTANCE.snapshot();
            String lowerCase = snapshot.getState().name().toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            event.c("app_activity_lifecycle", lowerCase);
            event.b(Long.valueOf(snapshot.getLastPausedAtElapsedRealtime()), "app_activity_last_paused_at_elapsed_realtime_ms");
            TTIModule.Companion companion = TTIModule.INSTANCE;
            event.c("app_launch_scenario", companion.getLaunchScenario());
            event.b(Boolean.valueOf(companion.getWasServiceStartedBeforeActivity()), "app_launch_was_service_started_before_activity");
            event.b(Boolean.valueOf(companion.getWasBroadcastReceiverStartedBeforeActivity()), "app_launch_was_broadcast_receiver_started_before_activity");
            event.b(Boolean.valueOf(companion.getWasInitializeCompleteWhenActivityOpened()), "app_launch_was_initialize_complete_when_activity_opened");
            event.b(Boolean.valueOf(companion.getWasLaunchedViaShortcut()), "app_launch_was_launched_via_shortcut");
            event.b(Integer.valueOf(companion.getActivitiesBeforeMainCount()), "app_launch_activities_before_main_count");
            ForegroundServiceStartGuard.Result resultEvaluate$default = ForegroundServiceStartGuard.evaluate$default(ForegroundServiceStartGuard.INSTANCE, 0L, 1, null);
            event.c("fgs_guard", resultEvaluate$default.getAllowed() ? "allowed" : "blocked");
            event.c("fgs_guard_reason", resultEvaluate$default.getReason());
            for (Map.Entry<String, String> entry : resultEvaluate$default.getDiagnostics().entrySet()) {
                String key = entry.getKey();
                event.b(entry.getValue(), "fgs_guard_" + key);
            }
        } catch (Throwable unused) {
        }
        if (sentryLevel == SentryLevel.FATAL) {
            OnCrashRegistry.INSTANCE.runAll$crash_reporting_release();
        }
        if (z5) {
            persistLastCrashInfo(context, event);
        }
        return event;
    }

    private final SentryEvent incrementallyRemoveBreadcrumbs(SentryEvent event, Hint hint, SentryAndroidOptions options) {
        Throwable th2;
        ArrayList arrayListJ0;
        try {
            List list = event.J;
            if (list != null) {
                try {
                    arrayListJ0 = CollectionsKt.j0(list);
                } catch (Throwable th3) {
                    th2 = th3;
                    options.getLogger().e(SentryLevel.ERROR, th2, "Error during incremental breadcrumb removal for event %s", event.f12670d);
                    return event;
                }
            } else {
                arrayListJ0 = new ArrayList();
            }
            int size = arrayListJ0.size();
            long eventSize = getEventSize(event, options);
            if (eventSize > w5.MAX_EVENT_SIZE_BYTES) {
                options.getLogger().q(SentryLevel.INFO, "Event %s exceeds %d bytes limit. Incrementally removing breadcrumbs.", event.f12670d, Long.valueOf(w5.MAX_EVENT_SIZE_BYTES));
                long j = eventSize;
                Long lComputeAverageBreadcrumbSize = null;
                while (true) {
                    if (arrayListJ0.isEmpty() || j <= w5.MAX_EVENT_SIZE_BYTES) {
                        break;
                    }
                    try {
                        int iMin = Math.min(calculateBatchSize(j, w5.MAX_EVENT_SIZE_BYTES, arrayListJ0.size(), lComputeAverageBreadcrumbSize), arrayListJ0.size());
                        if (iMin <= 0) {
                            break;
                        }
                        arrayListJ0.subList(0, iMin).clear();
                        event.J = new ArrayList(arrayListJ0);
                        long eventSize2 = getEventSize(event, options);
                        lComputeAverageBreadcrumbSize = computeAverageBreadcrumbSize(lComputeAverageBreadcrumbSize, j - eventSize2, iMin);
                        j = eventSize2;
                    } catch (Throwable th4) {
                        th = th4;
                        th2 = th;
                        options.getLogger().e(SentryLevel.ERROR, th2, "Error during incremental breadcrumb removal for event %s", event.f12670d);
                        return event;
                    }
                }
                int size2 = size - arrayListJ0.size();
                if (size2 > 0) {
                    options.getLogger().q(SentryLevel.DEBUG, "Removed %d breadcrumbs from event %s. Final size: %d bytes, remaining: %d", Integer.valueOf(size2), event.f12670d, Long.valueOf(j), Integer.valueOf(arrayListJ0.size()));
                }
                if (j > w5.MAX_EVENT_SIZE_BYTES) {
                    options.getLogger().q(SentryLevel.WARNING, "Event %s still exceeds size limit after removing all breadcrumbs.", event.f12670d);
                }
            }
            return event;
        } catch (Throwable th5) {
            th = th5;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void init$lambda$3(String str, String str2, Context context, double d6, SentryAndroidOptions options) {
        Intrinsics.checkNotNullParameter(options, "options");
        options.setDsn(str);
        ClientInfo clientInfo = ClientInfo.INSTANCE;
        options.setEnvironment(clientInfo.getReleaseChannel());
        options.setDist(clientInfo.getVersionCode());
        options.setRelease(str2);
        options.setCacheDirPath(context.getCacheDir() + "/sentry");
        options.setEnableActivityLifecycleTracingAutoFinish(false);
        options.setEnableAutoActivityLifecycleTracing(false);
        options.setTracesSampleRate(Double.valueOf(0.0d));
        options.setSampleRate(Double.valueOf(d6));
        options.setProguardUuid("7eae4825-3c4e-4f2c-80c9-30c83bc18c15");
        options.setTag(TAG_BUILD_NUMBER, clientInfo.getVersionCode());
        options.setTag(TAG_APP_VERSION, clientInfo.getVersionName());
        options.setBeforeSend(new com.discord.chat.input.views.d(context, 1));
        options.setMaxBreadcrumbs(MAX_BREADCRUMBS);
        options.setEnableEventSizeLimiting(true);
        options.setOnOversizedEvent(new b(options));
        options.setEnableAppLifecycleBreadcrumbs(true);
        options.setEnableActivityLifecycleBreadcrumbs(true);
        options.setEnableSystemEventBreadcrumbs(true);
        options.setEnableAppComponentBreadcrumbs(true);
        options.setEnableUserInteractionBreadcrumbs(true);
        options.setBeforeBreadcrumb(new k1(17));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SentryEvent init$lambda$3$lambda$0(Context context, SentryEvent event, Hint hint) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(hint, "<unused var>");
        return INSTANCE.handleBeforeSend(context, event);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SentryEvent init$lambda$3$lambda$1(SentryAndroidOptions sentryAndroidOptions, SentryEvent event, Hint hint) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(hint, "hint");
        return INSTANCE.incrementallyRemoveBreadcrumbs(event, hint, sentryAndroidOptions);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Breadcrumb init$lambda$3$lambda$2(Breadcrumb breadcrumb, Hint hint) {
        Intrinsics.checkNotNullParameter(breadcrumb, "breadcrumb");
        Intrinsics.checkNotNullParameter(hint, "hint");
        return INSTANCE.handleBeforeBreadcrumb(breadcrumb, hint);
    }

    private final boolean isDisabled() {
        if (ClientInfo.INSTANCE.isProdBuild()) {
            String DEVICE = Build.DEVICE;
            Intrinsics.checkNotNullExpressionValue(DEVICE, "DEVICE");
            if (StringsKt.D(DEVICE, "vivo", false)) {
                return true;
            }
        }
        return false;
    }

    private final boolean isMetaQuest() {
        return x.i(Build.BRAND, "oculus", true);
    }

    @DoNotStrip
    @Keep
    public static final void libdiscoreAddBreadcrumb(@NotNull String context, @NotNull String detail, @NotNull String message) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(detail, "detail");
        Intrinsics.checkNotNullParameter(message, "message");
        try {
            Breadcrumb breadcrumb = new Breadcrumb();
            breadcrumb.F = SentryLevel.FATAL;
            breadcrumb.f12010y = "libdiscore";
            breadcrumb.f12007v = context + "::" + detail + " - " + message;
            c4.a(breadcrumb);
        } catch (Exception e10) {
            Log.INSTANCE.e("SentryBreadcrumb", "Failed to add libdiscore breadcrumb", e10);
        }
    }

    @DoNotStrip
    @Keep
    public static final String libdiscoreEmitRustPanic(@NotNull String context, @NotNull String detail, @NotNull String message, @NotNull String backtrace) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(detail, "detail");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(backtrace, "backtrace");
        try {
            SentryEvent sentryEvent = new SentryEvent();
            sentryEvent.R = SentryLevel.FATAL;
            u uVar = new u();
            uVar.f13048d = "RustPanic";
            uVar.f13049e = message;
            uVar.f13050i = context;
            m mVar = new m();
            mVar.f12995d = "rust_panic";
            mVar.f12998v = Boolean.FALSE;
            uVar.f13053x = mVar;
            sentryEvent.Q = new f6(c0.c(uVar));
            sentryEvent.b(context, "context");
            sentryEvent.b(detail, "detail");
            sentryEvent.b(backtrace, "rust_backtrace");
            sentryEvent.c("libdiscore.context", context);
            sentryEvent.c("libdiscore.detail", detail);
            x0 x0VarF = c4.f();
            x0VarF.getClass();
            v vVarX = x0VarF.x(sentryEvent, new Hint());
            Intrinsics.checkNotNullExpressionValue(vVarX, "captureEvent(...)");
            c4.e(2000L);
            String string = vVarX.toString();
            if (string.length() == 0) {
                return null;
            }
            return string;
        } catch (Exception e10) {
            Log.INSTANCE.e("SentryBreadcrumb", "Failed to emit libdiscore sentry event", e10);
            return null;
        }
    }

    private final void persistLastCrashInfo(Context context, SentryEvent event) {
        String string;
        String str;
        u uVar;
        try {
            v vVar = event.f12670d;
            if (vVar != null && (string = vVar.toString()) != null) {
                String errorMessage = getErrorMessage(event);
                String errorStack = getErrorStack(event);
                ArrayList arrayListD = event.d();
                String str2 = (arrayListD == null || (uVar = (u) CollectionsKt.firstOrNull(arrayListD)) == null) ? null : uVar.f13048d;
                boolean z5 = str2 != null && StringsKt.D(str2, "JavascriptException", false);
                AbstractMap abstractMap = event.f12674w;
                if (abstractMap == null || (str = (String) abstractMap.get(TAG_EVENT_ORIGIN)) == null) {
                    str = event.E;
                }
                if (z5) {
                    str = "javascript";
                }
                boolean z6 = (z5 || Intrinsics.areEqual(str, "javascript")) ? false : true;
                Date date = (Date) event.M.clone();
                long time = date != null ? date.getTime() : System.currentTimeMillis();
                SentryLevel sentryLevel = event.R;
                CrashPersistence.INSTANCE.getInstance(context).setLastCrashInfo(new CrashPersistence.LastCrashInfo(string, time, str, z6, errorMessage, errorStack, sentryLevel != null ? sentryLevel.name() : null));
            }
        } catch (Throwable th2) {
            Log.INSTANCE.e("SentryBreadcrumb", "Failed to persist last crash info", th2);
        }
    }

    public final void addBreadcrumb(@NotNull String breadcrumbMessage, @NotNull Map<String, ? extends Object> breadcrumbData, String breadcrumbCategory, BreadcrumbLevel level, boolean log) {
        Intrinsics.checkNotNullParameter(breadcrumbMessage, "breadcrumbMessage");
        Intrinsics.checkNotNullParameter(breadcrumbData, "breadcrumbData");
        Breadcrumb breadcrumb = new Breadcrumb();
        breadcrumb.f12007v = breadcrumbMessage;
        for (Map.Entry<String, ? extends Object> entry : breadcrumbData.entrySet()) {
            breadcrumb.c(entry.getValue(), entry.getKey());
        }
        breadcrumb.f12010y = breadcrumbCategory;
        if (level != null) {
            breadcrumb.F = INSTANCE.breadcrumbLevelToSentryLevel(level);
        }
        if (log) {
            Log.i$default(Log.INSTANCE, "SentryBreadcrumb", breadcrumbMessage, (Throwable) null, 4, (Object) null);
        }
        c4.a(breadcrumb);
        appendBreadcrumbToTelemetryRing$default(this, breadcrumbMessage, breadcrumbMessage, breadcrumbData, System.currentTimeMillis(), null, 16, null);
    }

    @DoNotStrip
    @Keep
    public final void addBreadcrumbBatchBinary(@NotNull ByteBuffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        try {
            buffer.order(ByteOrder.BIG_ENDIAN);
            int i7 = buffer.getInt();
            for (int i10 = 0; i10 < i7; i10++) {
                int i11 = buffer.getInt();
                String str = "GLOG Batch [" + i11 + " entries] @ " + buffer.getLong() + " - " + buffer.getLong();
                ArrayList arrayList = new ArrayList();
                for (int i12 = 0; i12 < i11; i12++) {
                    byte[] bArr = new byte[buffer.getShort() & 65535];
                    buffer.get(bArr);
                    Charset charset = Charsets.UTF_8;
                    String str2 = new String(bArr, charset);
                    byte[] bArr2 = new byte[buffer.getShort() & 65535];
                    buffer.get(bArr2);
                    String str3 = new String(bArr2, charset);
                    boolean z5 = buffer.get() != 0;
                    long j = buffer.getLong();
                    appendBreadcrumbToTelemetryRing$default(INSTANCE, str2, str2, w0.g(new Pair("loc", str3), new Pair("main", Boolean.valueOf(z5))), j, null, 16, null);
                    arrayList.add(w0.g(new Pair("msg", str2), new Pair("loc", str3), new Pair("main", Boolean.valueOf(z5)), new Pair("ts", Long.valueOf(j))));
                }
                Breadcrumb breadcrumb = new Breadcrumb();
                breadcrumb.f12007v = str;
                breadcrumb.c(Integer.valueOf(i11), "count");
                breadcrumb.c(arrayList, "entries");
                c4.a(breadcrumb);
            }
        } catch (Exception e10) {
            Log.INSTANCE.e("CrashReporting", "Failed to parse breadcrumb buffer", e10);
        }
    }

    @NotNull
    public final SentryLevel breadcrumbLevelToSentryLevel(@NotNull BreadcrumbLevel level) {
        Intrinsics.checkNotNullParameter(level, "level");
        int i7 = WhenMappings.$EnumSwitchMapping$1[level.ordinal()];
        if (i7 == 1) {
            return SentryLevel.WARNING;
        }
        if (i7 == 2) {
            return SentryLevel.ERROR;
        }
        throw new n();
    }

    public final void captureException(@NotNull Throwable throwable, boolean ignoreNetworkExceptions) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Log.e$default(Log.INSTANCE, "SentryBreadcrumb", f.b(throwable), (Throwable) null, 4, (Object) null);
        if (!ignoreNetworkExceptions) {
            x0 x0VarF = c4.f();
            x0VarF.getClass();
            x0VarF.t(throwable, new Hint());
        } else {
            if (ignoreNetworkExceptionList.contains(Reflection.getOrCreateKotlinClass(throwable.getClass()))) {
                return;
            }
            x0 x0VarF2 = c4.f();
            x0VarF2.getClass();
            x0VarF2.t(throwable, new Hint());
        }
    }

    public final void captureMessage(@NotNull String tag, @NotNull String message, @NotNull ErrorLevel errorLevel) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(errorLevel, "errorLevel");
        int i7 = WhenMappings.$EnumSwitchMapping$0[errorLevel.ordinal()];
        if (i7 == 1) {
            Log.i$default(Log.INSTANCE, tag, message, (Throwable) null, 4, (Object) null);
        } else {
            if (i7 != 2) {
                throw new n();
            }
            Log.w$default(Log.INSTANCE, tag, message, (Throwable) null, 4, (Object) null);
        }
        c4.n(new ac.b(tag, message, errorLevel, 4));
    }

    public final double getSampleRate(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return (!ClientInfo.INSTANCE.isProdBuild() || isMetaQuest() || CrashPersistence.INSTANCE.getInstance(context).isStaff()) ? 1.0d : 0.05d;
    }

    @NotNull
    public final CrashReportingReady init(@NotNull final Context context, @NotNull final String releaseName, @NotNull LibdiscoreModuleProvider libdiscoreModuleProvider) {
        String str;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(releaseName, "releaseName");
        Intrinsics.checkNotNullParameter(libdiscoreModuleProvider, "libdiscoreModuleProvider");
        if (isDisabled()) {
            return new CrashReportingReady();
        }
        ClientInfo clientInfo = ClientInfo.INSTANCE;
        if (clientInfo.isDebugBuild() || clientInfo.isDeveloperBuild()) {
            str = "";
        } else if (CrashPersistence.INSTANCE.getInstance(context).isStaff()) {
            str = "https://90509cba01573ee4e14a2f5e15aee5ca@o64374.ingest.sentry.io/5992375";
        } else {
            str = !clientInfo.isProdBuild() ? "https://9a42ef460144a03b30c8b2d5321cfe11@o64374.ingest.sentry.io/5992375" : "https://70545531dfe34835bf4dd0996821e8b6@o64374.ingest.sentry.io/5992375";
        }
        final String str2 = str;
        final double sampleRate = getSampleRate(context);
        d1.b(context, new m0(1), new b4() { // from class: com.discord.crash_reporting.a
            @Override // io.sentry.b4
            public final void c(w5 w5Var) {
                CrashReporting.init$lambda$3(str2, releaseName, context, sampleRate, (SentryAndroidOptions) w5Var);
            }
        });
        isCrashedLastRun = c4.j();
        NativeCrashReporting.INSTANCE.initNative(clientInfo.isProdBuild());
        try {
            libdiscoreModuleProvider.get().installSentryReporter();
        } catch (Exception e10) {
            Log.INSTANCE.e("SentryBreadcrumb", "Failed to install libdiscore sentry reporter", e10);
        }
        return new CrashReportingReady();
    }

    public final Boolean isCrashedLastRun() {
        return isCrashedLastRun;
    }

    public final void setTag(@NotNull CrashReportingReady crashReportingReady, @NotNull String key, @NotNull String value) {
        Intrinsics.checkNotNullParameter(crashReportingReady, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        if (isDisabled()) {
            return;
        }
        c4.m(key, value);
    }

    public final void captureMessage(@NotNull String tag, @NotNull Exception exception) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(exception, "exception");
        String message = exception.getMessage();
        if (message == null) {
            message = "";
        }
        captureMessage$default(this, tag, message, null, 4, null);
    }
}

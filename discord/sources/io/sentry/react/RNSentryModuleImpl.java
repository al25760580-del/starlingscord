package io.sentry.react;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.util.Base64;
import android.util.SparseIntArray;
import androidx.core.app.FrameMetricsAggregator;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.discord.js_watchdog.SharedPreferencesKey;
import com.discord.notifications.renderer.NotificationRenderer;
import com.facebook.hermes.instrumentation.HermesSamplingProfiler;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.common.JavascriptException;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.uimanager.ViewProps;
import com.google.firebase.messaging.r;
import com.reactnativecommunity.clipboard.ClipboardModule;
import e4.l;
import io.sentry.Breadcrumb;
import io.sentry.Hint;
import io.sentry.ILogger;
import io.sentry.IScope;
import io.sentry.SentryEvent;
import io.sentry.SentryLevel;
import io.sentry.UncaughtExceptionHandlerIntegration;
import io.sentry.a1;
import io.sentry.a6;
import io.sentry.android.core.AnrIntegration;
import io.sentry.android.core.NdkIntegration;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.ViewHierarchyEventProcessor;
import io.sentry.android.core.d1;
import io.sentry.android.core.e1;
import io.sentry.android.core.internal.util.e;
import io.sentry.android.core.internal.util.o;
import io.sentry.android.core.k0;
import io.sentry.android.core.m0;
import io.sentry.android.core.p;
import io.sentry.android.core.t;
import io.sentry.android.core.w0;
import io.sentry.android.core.x;
import io.sentry.c4;
import io.sentry.f3;
import io.sentry.k4;
import io.sentry.l1;
import io.sentry.protocol.h0;
import io.sentry.protocol.i0;
import io.sentry.protocol.j;
import io.sentry.protocol.v;
import io.sentry.protocol.w;
import io.sentry.react.replay.RNSentryReplayFragmentLifecycleTracer;
import io.sentry.react.replay.RNSentryReplayMask;
import io.sentry.react.replay.RNSentryReplayUnmask;
import io.sentry.util.f;
import io.sentry.v4;
import io.sentry.w3;
import io.sentry.w5;
import io.sentry.z5;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import org.jetbrains.annotations.NotNull;
import s0.g;
import xr.m;

/* JADX INFO: loaded from: classes3.dex */
public class RNSentryModuleImpl {
    private static final int FROZEN_FRAME_THRESHOLD = 700;
    public static final String NAME = "RNSentry";
    private static final int SCREENSHOT_TIMEOUT_SECONDS = 2;
    private static final int SLOW_FRAME_THRESHOLD = 16;
    private static final Charset UTF_8;
    private static final k0 buildInfo;
    static long lastStartTimestampMs = 0;
    private static final ILogger logger;
    private static final String modulesPath = "modules.json";
    private boolean androidXAvailable;
    private final PackageInfo packageInfo;
    private final ReactApplicationContext reactApplicationContext;
    private FrameMetricsAggregator frameMetricsAggregator = null;
    private int profilingTracesHz = 101;
    private t androidProfiler = null;
    private boolean isProguardDebugMetaLoaded = false;
    private String proguardUuid = null;
    private String cacheDirPath = null;
    private a1 executorService = null;
    private long maxTraceFileSize = 5242880;

    @NotNull
    private final Runnable emitNewFrameEvent = createEmitNewFrameEvent();

    @NotNull
    private final k4 dateProvider = new e1();

    @NotNull
    private final f loadClass = new f();

    static {
        m0 m0Var = new m0("RNSentry");
        logger = m0Var;
        buildInfo = new k0(m0Var);
        UTF_8 = Charset.forName("UTF-8");
        lastStartTimestampMs = -1L;
    }

    public RNSentryModuleImpl(ReactApplicationContext reactApplicationContext) {
        this.packageInfo = getPackageInfo(reactApplicationContext);
        this.reactApplicationContext = reactApplicationContext;
    }

    private void addPackages(SentryEvent sentryEvent, io.sentry.protocol.t tVar) {
        io.sentry.protocol.t tVar2 = sentryEvent.f12672i;
        if (tVar2 == null || !"sentry.javascript.react-native".equals(tVar2.f13043d) || tVar == null) {
            return;
        }
        CopyOnWriteArraySet<w> copyOnWriteArraySet = tVar.f13045i;
        if (copyOnWriteArraySet == null) {
            copyOnWriteArraySet = v4.d().f13251b;
        }
        if (copyOnWriteArraySet != null) {
            for (w wVar : copyOnWriteArraySet) {
                v4.d().b(wVar.f13057d, wVar.f13058e);
            }
        }
        CopyOnWriteArraySet copyOnWriteArraySet2 = tVar.f13046v;
        if (copyOnWriteArraySet2 == null) {
            copyOnWriteArraySet2 = v4.d().f13250a;
        }
        if (copyOnWriteArraySet2 != null) {
            Iterator it = copyOnWriteArraySet2.iterator();
            while (it.hasNext()) {
                v4.d().a((String) it.next());
            }
        }
        sentryEvent.f12672i = tVar2;
    }

    private boolean checkAndroidXAvailability() {
        return true;
    }

    private void configureAndroidProfiling(@NotNull SentryAndroidOptions sentryAndroidOptions, @NotNull ReadableMap readableMap) {
        ReadableMap map;
        ReadableMap map2;
        if (readableMap.hasKey("_experiments") && (map = readableMap.getMap("_experiments")) != null && map.hasKey("androidProfilingOptions") && (map2 = map.getMap("androidProfilingOptions")) != null) {
            if (map2.hasKey("profileSessionSampleRate")) {
                double d6 = map2.getDouble("profileSessionSampleRate");
                sentryAndroidOptions.setProfileSessionSampleRate(Double.valueOf(d6));
                logger.q(SentryLevel.INFO, String.format("Android UI Profiling profileSessionSampleRate set to: %.2f", Double.valueOf(d6)), new Object[0]);
            }
            if (map2.hasKey("lifecycle")) {
                String string = map2.getString("lifecycle");
                if ("manual".equalsIgnoreCase(string)) {
                    sentryAndroidOptions.setProfileLifecycle(f3.MANUAL);
                    logger.q(SentryLevel.INFO, "Android UI Profile Lifecycle set to MANUAL", new Object[0]);
                } else if (SharedPreferencesKey.TRACE.equalsIgnoreCase(string)) {
                    sentryAndroidOptions.setProfileLifecycle(f3.TRACE);
                    logger.q(SentryLevel.INFO, "Android UI Profile Lifecycle set to TRACE", new Object[0]);
                }
            }
            if (map2.hasKey("startOnAppStart")) {
                boolean z5 = map2.getBoolean("startOnAppStart");
                sentryAndroidOptions.setStartProfilerOnAppStart(z5);
                logger.q(SentryLevel.INFO, "Android UI Profiling startOnAppStart set to " + z5, new Object[0]);
            }
        }
    }

    @NotNull
    private Runnable createEmitNewFrameEvent() {
        return new p(10, this);
    }

    private Activity getCurrentActivity() {
        return this.reactApplicationContext.getCurrentActivity();
    }

    private static PackageInfo getPackageInfo(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException unused) {
            logger.q(SentryLevel.WARNING, "Error getting package info.", new Object[0]);
            return null;
        }
    }

    private String getProfilingTracesDirPath() {
        if (this.cacheDirPath == null) {
            this.cacheDirPath = new File(getReactApplicationContext().getCacheDir(), "sentry/react").getAbsolutePath();
        }
        File file = new File(this.cacheDirPath, "profiling_trace");
        file.mkdirs();
        return file.getAbsolutePath();
    }

    private String getProguardUuid() {
        if (this.isProguardDebugMetaLoaded) {
            return this.proguardUuid;
        }
        this.isProguardDebugMetaLoaded = true;
        List listU = new l(getReactApplicationContext(), logger).U();
        if (listU == null) {
            return null;
        }
        Iterator it = listU.iterator();
        while (it.hasNext()) {
            String property = ((Properties) it.next()).getProperty("io.sentry.ProguardUuids");
            this.proguardUuid = property;
            if (property != null) {
                logger.q(SentryLevel.INFO, "Proguard uuid found: " + this.proguardUuid, new Object[0]);
                return this.proguardUuid;
            }
        }
        logger.q(SentryLevel.WARNING, "No proguard uuid found in debug meta properties file!", new Object[0]);
        return null;
    }

    private ReactApplicationContext getReactApplicationContext() {
        return this.reactApplicationContext;
    }

    private a6 getReplayOptions(@NotNull ReadableMap readableMap) {
        ReadableMap map;
        a6 a6Var = new a6(false, new io.sentry.protocol.t("sentry.javascript.react-native", "7.10.0"));
        if (readableMap.hasKey("replaysSessionSampleRate") || readableMap.hasKey("replaysOnErrorSampleRate")) {
            a6Var.q(readableMap.hasKey("replaysSessionSampleRate") ? Double.valueOf(readableMap.getDouble("replaysSessionSampleRate")) : null);
            a6Var.p(readableMap.hasKey("replaysOnErrorSampleRate") ? Double.valueOf(readableMap.getDouble("replaysOnErrorSampleRate")) : null);
            if (readableMap.hasKey("replaysSessionQuality")) {
                a6Var.f12055g = parseReplayQuality(readableMap.getString("replaysSessionQuality"));
            }
            if (readableMap.hasKey("mobileReplayOptions") && (map = readableMap.getMap("mobileReplayOptions")) != null) {
                a6Var.j(!map.hasKey("maskAllText") || map.getBoolean("maskAllText"));
                a6Var.i(!map.hasKey("maskAllImages") || map.getBoolean("maskAllImages"));
                if (!map.hasKey("maskAllVectors") || map.getBoolean("maskAllVectors")) {
                    a6Var.f12051c.add("com.horcrux.svg.SvgView");
                }
                if (map.hasKey("screenshotStrategy")) {
                    a6Var.f12061o = parseScreenshotStrategy(map.getString("screenshotStrategy"));
                }
                String name = RNSentryReplayMask.class.getName();
                a6Var.f12051c.add(name);
                a6Var.f12053e = name;
                a6Var.f12054f = RNSentryReplayUnmask.class.getName();
                return a6Var;
            }
        }
        return a6Var;
    }

    public static String getURLFromDSN(String str) {
        if (str == null) {
            return null;
        }
        try {
            URI uri = new URI(str);
            return uri.getScheme() + "://" + uri.getHost();
        } catch (URISyntaxException unused) {
            return null;
        }
    }

    private void initFragmentInitialFrameTracking() {
        FragmentManager supportFragmentManager;
        RNSentryReactFragmentLifecycleTracer rNSentryReactFragmentLifecycleTracer = new RNSentryReactFragmentLifecycleTracer(buildInfo, this.emitNewFrameEvent, logger);
        FragmentActivity fragmentActivity = (FragmentActivity) getCurrentActivity();
        if (fragmentActivity == null || (supportFragmentManager = fragmentActivity.getSupportFragmentManager()) == null) {
            return;
        }
        supportFragmentManager.W(rNSentryReactFragmentLifecycleTracer);
    }

    private void initFragmentReplayTracking() {
        FragmentManager supportFragmentManager;
        RNSentryReplayFragmentLifecycleTracer rNSentryReplayFragmentLifecycleTracer = new RNSentryReplayFragmentLifecycleTracer(logger);
        Activity currentActivity = getCurrentActivity();
        if ((currentActivity instanceof FragmentActivity) && (supportFragmentManager = ((FragmentActivity) currentActivity).getSupportFragmentManager()) != null) {
            supportFragmentManager.W(rNSentryReplayFragmentLifecycleTracer);
        }
    }

    private void initializeAndroidProfiler() {
        if (this.executorService == null) {
            this.executorService = new r(7);
        }
        String profilingTracesDirPath = getProfilingTracesDirPath();
        int micros = ((int) TimeUnit.SECONDS.toMicros(1L)) / this.profilingTracesHz;
        ReactApplicationContext reactApplicationContext = this.reactApplicationContext;
        ILogger iLogger = logger;
        this.androidProfiler = new t(profilingTracesDirPath, micros, new o(reactApplicationContext, iLogger, buildInfo), this.executorService, iLogger);
    }

    private boolean isFrameMetricsAggregatorAvailable() {
        return this.androidXAvailable && this.frameMetricsAggregator != null;
    }

    private boolean isReplayEnabled(a6 a6Var) {
        return (a6Var.f12049a == null && a6Var.f12050b == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$addBreadcrumb$6(ReadableMap readableMap, IScope iScope) {
        iScope.c(RNSentryBreadcrumb.fromMap(readableMap));
        String currentScreenFrom = RNSentryBreadcrumb.getCurrentScreenFrom(readableMap);
        if (currentScreenFrom != null) {
            iScope.B(currentScreenFrom);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createEmitNewFrameEvent$0() {
        RNSentryTimeToDisplay.putTimeToInitialDisplayForActiveSpan(Double.valueOf(this.dateProvider.now().d() / 1.0E9d));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Breadcrumb lambda$getSentryAndroidOptions$2(String str, String str2, Breadcrumb breadcrumb, Hint hint) {
        Object obj = breadcrumb.f12009x.get("url");
        String str3 = obj instanceof String ? (String) obj : "";
        if ("http".equals(breadcrumb.f12008w)) {
            if (str != null && str3.startsWith(str)) {
                return null;
            }
            if (str2 != null && str3.startsWith(str2)) {
                return null;
            }
        }
        return breadcrumb;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ SentryEvent lambda$getSentryAndroidOptions$3(SentryAndroidOptions sentryAndroidOptions, SentryEvent sentryEvent, Hint hint) {
        setEventOriginTag(sentryEvent);
        addPackages(sentryEvent, sentryAndroidOptions.getSdkVersion());
        return sentryEvent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initNativeSdk$1(ReadableMap readableMap, SentryAndroidOptions sentryAndroidOptions) {
        getSentryAndroidOptions(sentryAndroidOptions, readableMap, logger);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$setContext$9(ReadableMap readableMap, String str, IScope iScope) {
        if (readableMap == null) {
            iScope.u(str);
        } else {
            iScope.G(readableMap.toHashMap(), str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$setUser$5(ReadableMap readableMap, ReadableMap readableMap2, IScope iScope) {
        ReadableMap map;
        if (readableMap == null && readableMap2 == null) {
            iScope.m(null);
            return;
        }
        h0 h0Var = new h0();
        if (readableMap != null) {
            if (readableMap.hasKey("email")) {
                h0Var.f12956d = readableMap.getString("email");
            }
            if (readableMap.hasKey(StackTraceHelper.ID_KEY)) {
                h0Var.f12957e = readableMap.getString(StackTraceHelper.ID_KEY);
            }
            if (readableMap.hasKey(NotificationRenderer.USERNAME)) {
                h0Var.f12958i = readableMap.getString(NotificationRenderer.USERNAME);
            }
            if (readableMap.hasKey("ip_address")) {
                h0Var.f12959v = readableMap.getString("ip_address");
            }
            if (readableMap.hasKey("geo") && (map = readableMap.getMap("geo")) != null) {
                j jVar = new j();
                if (map.hasKey("city")) {
                    jVar.f12973d = map.getString("city");
                }
                if (map.hasKey("country_code")) {
                    jVar.f12974e = map.getString("country_code");
                }
                if (map.hasKey("region")) {
                    jVar.f12975i = map.getString("region");
                }
                h0Var.f12961x = jVar;
            }
        }
        if (readableMap2 != null) {
            HashMap map2 = new HashMap();
            ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = readableMap2.keySetIterator();
            while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
                String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
                String string = readableMap2.getString(strNextKey);
                if (string != null) {
                    map2.put(strNextKey, string);
                }
            }
            h0Var.f12962y = m.F(map2);
        }
        iScope.m(h0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$takeScreenshotOnUiThread$4(byte[][] bArr, Activity activity, CountDownLatch countDownLatch) {
        ILogger iLogger = logger;
        bArr[0] = hf.a.c(hf.a.a(activity, e.f12290a, iLogger, buildInfo), iLogger);
        countDownLatch.countDown();
    }

    private z5 parseReplayQuality(String str) {
        if (str == null) {
            return z5.MEDIUM;
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        switch (lowerCase) {
            case "medium":
                return z5.MEDIUM;
            case "low":
                return z5.LOW;
            case "high":
                return z5.HIGH;
            default:
                return z5.MEDIUM;
        }
    }

    private w3 parseScreenshotStrategy(String str) {
        if (str == null) {
            return w3.PIXEL_COPY;
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        return !lowerCase.equals("canvas") ? w3.PIXEL_COPY : w3.CANVAS;
    }

    private String readStringFromFile(File file) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        try {
            StringBuilder sb2 = new StringBuilder();
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    String string = sb2.toString();
                    bufferedReader.close();
                    return string;
                }
                sb2.append(line);
                sb2.append('\n');
            }
        } catch (Throwable th2) {
            try {
                bufferedReader.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    private void setEventEnvironmentTag(SentryEvent sentryEvent, String str) {
        sentryEvent.c("event.origin", "android");
        sentryEvent.c("event.environment", str);
    }

    private void setEventOriginTag(SentryEvent sentryEvent) {
        io.sentry.protocol.t tVar = sentryEvent.f12672i;
        if (tVar != null) {
            String str = tVar.f13043d;
            str.getClass();
            if (str.equals("sentry.java.android.react-native")) {
                setEventEnvironmentTag(sentryEvent, "java");
            } else if (str.equals("sentry.native.android.react-native")) {
                setEventEnvironmentTag(sentryEvent, "native");
            }
        }
    }

    private static byte[] takeScreenshotOnUiThread(Activity activity) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        byte[][] bArr = {new byte[0]};
        ac.a aVar = new ac.a(bArr, activity, countDownLatch, 25);
        if (UiThreadUtil.isOnUiThread()) {
            aVar.run();
        } else {
            UiThreadUtil.runOnUiThread(aVar);
        }
        try {
            countDownLatch.await(2L, TimeUnit.SECONDS);
            return bArr[0];
        } catch (InterruptedException unused) {
            logger.q(SentryLevel.ERROR, "Screenshot process was interrupted.", new Object[0]);
            return new byte[0];
        }
    }

    public void addBreadcrumb(ReadableMap readableMap) {
        c4.d(null, new gc.o(24, readableMap));
    }

    public void addListener(String str) {
        logger.q(SentryLevel.ERROR, "addListener of NativeEventEmitter can't be used on Android!", new Object[0]);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00c0  */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00f1, code lost:
    
        if (r11 != 4) goto L61;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void captureEnvelope(java.lang.String r19, com.facebook.react.bridge.ReadableMap r20, com.facebook.react.bridge.Promise r21) {
        /*
            Method dump skipped, instruction units count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.react.RNSentryModuleImpl.captureEnvelope(java.lang.String, com.facebook.react.bridge.ReadableMap, com.facebook.react.bridge.Promise):void");
    }

    public void captureReplay(boolean z5, Promise promise) {
        c4.f().l().getReplayController().captureReplay(Boolean.valueOf(z5));
        promise.resolve(getCurrentReplayId());
    }

    public void captureScreenshot(Promise promise) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            logger.q(SentryLevel.WARNING, "CurrentActivity is null, can't capture screenshot.", new Object[0]);
            promise.resolve(null);
            return;
        }
        byte[] bArrTakeScreenshotOnUiThread = takeScreenshotOnUiThread(currentActivity);
        if (bArrTakeScreenshotOnUiThread == null || bArrTakeScreenshotOnUiThread.length == 0) {
            logger.q(SentryLevel.WARNING, "Screenshot is null, screen was not captured.", new Object[0]);
            promise.resolve(null);
            return;
        }
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        for (byte b10 : bArrTakeScreenshotOnUiThread) {
            writableNativeArray.pushInt(b10);
        }
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString("contentType", ClipboardModule.MIMETYPE_PNG);
        writableNativeMap.putArray("data", writableNativeArray);
        writableNativeMap.putString("filename", "screenshot.png");
        WritableNativeArray writableNativeArray2 = new WritableNativeArray();
        writableNativeArray2.pushMap(writableNativeMap);
        promise.resolve(writableNativeArray2);
    }

    public void clearBreadcrumbs() {
        c4.d(null, new b(0));
    }

    public void closeNativeSdk(Promise promise) {
        c4.c();
        disableNativeFramesTracking();
        promise.resolve(Boolean.TRUE);
    }

    public void crash() {
        throw new RuntimeException("TEST - Sentry Client Crash (only works in release mode)");
    }

    public void crashedLastRun(Promise promise) {
        promise.resolve(c4.j());
    }

    public void disableNativeFramesTracking() {
        if (isFrameMetricsAggregatorAvailable()) {
            this.frameMetricsAggregator.b();
            this.frameMetricsAggregator = null;
        }
    }

    public void enableNativeFramesTracking() {
        boolean zCheckAndroidXAvailability = checkAndroidXAvailability();
        this.androidXAvailable = zCheckAndroidXAvailability;
        if (!zCheckAndroidXAvailability) {
            logger.q(SentryLevel.WARNING, "androidx.core' isn't available as a dependency.", new Object[0]);
            return;
        }
        this.frameMetricsAggregator = new FrameMetricsAggregator();
        Activity currentActivity = getCurrentActivity();
        FrameMetricsAggregator frameMetricsAggregator = this.frameMetricsAggregator;
        if (frameMetricsAggregator == null || currentActivity == null) {
            logger.q(SentryLevel.INFO, "currentActivity isn't available.", new Object[0]);
            return;
        }
        try {
            frameMetricsAggregator.a(currentActivity);
            logger.q(SentryLevel.INFO, "FrameMetricsAggregator installed.", new Object[0]);
        } catch (Throwable unused) {
            logger.q(SentryLevel.ERROR, "Error adding Activity to frameMetricsAggregator.", new Object[0]);
        }
    }

    public void encodeToBase64(ReadableArray readableArray, Promise promise) {
        byte[] bArr = new byte[readableArray.size()];
        for (int i7 = 0; i7 < readableArray.size(); i7++) {
            bArr[i7] = (byte) readableArray.getInt(i7);
        }
        promise.resolve(Base64.encodeToString(bArr, 0));
    }

    public void fetchModules(Promise promise) {
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(getReactApplicationContext().getResources().getAssets().open(modulesPath));
            try {
                byte[] bArr = new byte[bufferedInputStream.available()];
                bufferedInputStream.read(bArr);
                bufferedInputStream.close();
                promise.resolve(new String(bArr, UTF_8));
                bufferedInputStream.close();
            } catch (Throwable th2) {
                try {
                    bufferedInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (FileNotFoundException unused) {
            promise.resolve(null);
        } catch (Throwable unused2) {
            logger.q(SentryLevel.WARNING, "Fetching JS Modules failed.", new Object[0]);
            promise.resolve(null);
        }
    }

    public void fetchNativeAppStart(Promise promise, io.sentry.android.core.performance.f fVar, Map<String, Object> map, ILogger iLogger) {
        if (!fVar.f12377e) {
            iLogger.q(SentryLevel.WARNING, "Invalid app start data: app not launched in foreground.", new Object[0]);
            promise.resolve(null);
            return;
        }
        WritableMap writableMap = (WritableMap) RNSentryMapConverter.convertToWritable(map);
        long j = fVar.f12378i.f12384e;
        long j5 = lastStartTimestampMs;
        boolean z5 = j5 > 0 && j5 == j;
        writableMap.putBoolean("has_fetched", z5);
        if (lastStartTimestampMs < 0) {
            iLogger.q(SentryLevel.DEBUG, "App Start data reported to the RN layer for the first time.", new Object[0]);
        } else if (z5) {
            iLogger.q(SentryLevel.DEBUG, "App Start data already fetched from native before.", new Object[0]);
        } else {
            iLogger.q(SentryLevel.DEBUG, "App Start data updated, reporting to the RN layer again.", new Object[0]);
        }
        lastStartTimestampMs = j;
        fVar.I = false;
        fVar.f12381x.clear();
        fVar.f12382y.clear();
        promise.resolve(writableMap);
    }

    public void fetchNativeDeviceContexts(Promise promise) {
        fetchNativeDeviceContexts(promise, c4.f().l(), getReactApplicationContext().getApplicationContext(), w0.e());
    }

    public void fetchNativeFrames(Promise promise) {
        int i7;
        int i10;
        int i11;
        if (!isFrameMetricsAggregatorAvailable()) {
            promise.resolve(null);
            return;
        }
        try {
            SparseIntArray sparseIntArray = ((SparseIntArray[]) this.frameMetricsAggregator.f1460a.f13849b)[0];
            if (sparseIntArray != null) {
                i7 = 0;
                i10 = 0;
                i11 = 0;
                for (int i12 = 0; i12 < sparseIntArray.size(); i12++) {
                    int iKeyAt = sparseIntArray.keyAt(i12);
                    int iValueAt = sparseIntArray.valueAt(i12);
                    i7 += iValueAt;
                    if (iKeyAt > 700) {
                        i11 += iValueAt;
                    } else if (iKeyAt > 16) {
                        i10 += iValueAt;
                    }
                }
            } else {
                i7 = 0;
                i10 = 0;
                i11 = 0;
            }
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putInt("totalFrames", i7);
            writableMapCreateMap.putInt("slowFrames", i10);
            writableMapCreateMap.putInt("frozenFrames", i11);
            promise.resolve(writableMapCreateMap);
        } catch (Throwable unused) {
            logger.q(SentryLevel.WARNING, "Error fetching native frames.", new Object[0]);
            promise.resolve(null);
        }
    }

    public void fetchNativeLogAttributes(Promise promise) {
        fetchNativeLogContexts(promise, c4.f().l(), getReactApplicationContext().getApplicationContext(), w0.e());
    }

    public void fetchNativeLogContexts(Promise promise, @NotNull w5 w5Var, Context context, IScope iScope) {
        if (!(w5Var instanceof SentryAndroidOptions) || context == null) {
            promise.resolve(null);
            return;
        }
        Object obj = w0.l(context, (SentryAndroidOptions) w5Var, iScope).get("contexts");
        if (!(obj instanceof Map)) {
            promise.resolve(null);
            return;
        }
        Map map = (Map) obj;
        HashMap map2 = new HashMap();
        if (map.containsKey("os")) {
            map2.put("os", map.get("os"));
        }
        if (map.containsKey("device")) {
            map2.put("device", map.get("device"));
        }
        map2.put("release", w5Var.getRelease());
        HashMap map3 = new HashMap();
        map3.put("contexts", map2);
        promise.resolve(RNSentryMapConverter.convertToWritable(map3));
    }

    public String fetchNativePackageName() {
        return this.packageInfo.packageName;
    }

    public void fetchNativeRelease(Promise promise) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString(StackTraceHelper.ID_KEY, this.packageInfo.packageName);
        writableMapCreateMap.putString("version", this.packageInfo.versionName);
        writableMapCreateMap.putString("build", String.valueOf(this.packageInfo.versionCode));
        promise.resolve(writableMapCreateMap);
    }

    public void fetchNativeSdkInfo(Promise promise) {
        io.sentry.protocol.t sdkVersion = c4.f().l().getSdkVersion();
        if (sdkVersion == null) {
            promise.resolve(null);
            return;
        }
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString(StackTraceHelper.NAME_KEY, sdkVersion.f13043d);
        writableNativeMap.putString("version", sdkVersion.f13044e);
        promise.resolve(writableNativeMap);
    }

    public void fetchViewHierarchy(Promise promise) {
        Activity currentActivity = getCurrentActivity();
        ILogger iLogger = logger;
        i0 i0VarB = ViewHierarchyEventProcessor.b(currentActivity, new ArrayList(0), e.f12290a, iLogger);
        if (i0VarB == null) {
            iLogger.q(SentryLevel.ERROR, "Could not get ViewHierarchy.", new Object[0]);
            promise.resolve(null);
            return;
        }
        byte[] bArrC = io.sentry.util.c.c(c4.f().l().getSerializer(), iLogger, i0VarB);
        if (bArrC == null) {
            iLogger.q(SentryLevel.ERROR, "Could not serialize ViewHierarchy.", new Object[0]);
            promise.resolve(null);
        } else {
            if (bArrC.length < 1) {
                iLogger.q(SentryLevel.ERROR, "Got empty bytes array after serializing ViewHierarchy.", new Object[0]);
                promise.resolve(null);
                return;
            }
            WritableNativeArray writableNativeArray = new WritableNativeArray();
            for (byte b10 : bArrC) {
                writableNativeArray.pushInt(b10);
            }
            promise.resolve(writableNativeArray);
        }
    }

    public Context getApplicationContext() {
        Context applicationContext = getReactApplicationContext().getApplicationContext();
        if (applicationContext != null) {
            return applicationContext;
        }
        logger.q(SentryLevel.ERROR, "ApplicationContext is null, using ReactApplicationContext fallback.", new Object[0]);
        return getReactApplicationContext();
    }

    public String getCurrentReplayId() {
        v vVarY;
        IScope iScopeE = w0.e();
        if (iScopeE == null || (vVarY = iScopeE.y()) == v.f13055e) {
            return null;
        }
        return vVarY.toString();
    }

    public void getDataFromUri(String str, Promise promise) {
        try {
            InputStream inputStreamOpenInputStream = getReactApplicationContext().getContentResolver().openInputStream(Uri.parse(str));
            try {
                if (inputStreamOpenInputStream == null) {
                    String str2 = "File not found for uri: " + str;
                    logger.q(SentryLevel.ERROR, str2, new Object[0]);
                    promise.reject(new Exception(str2));
                    if (inputStreamOpenInputStream == null) {
                        return;
                    }
                } else {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    byte[] bArr = new byte[IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET];
                    while (true) {
                        int i7 = inputStreamOpenInputStream.read(bArr);
                        if (i7 == -1) {
                            break;
                        } else {
                            byteArrayOutputStream.write(bArr, 0, i7);
                        }
                    }
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    WritableArray writableArrayCreateArray = Arguments.createArray();
                    for (byte b10 : byteArray) {
                        writableArrayCreateArray.pushInt(b10 & 255);
                    }
                    promise.resolve(writableArrayCreateArray);
                }
                inputStreamOpenInputStream.close();
            } catch (Throwable th2) {
                if (inputStreamOpenInputStream != null) {
                    try {
                        inputStreamOpenInputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        } catch (IOException e10) {
            StringBuilder sbN = com.discord.chat.presentation.list.a.n("Error reading uri: ", str, ": ");
            sbN.append(e10.getMessage());
            String string = sbN.toString();
            logger.q(SentryLevel.ERROR, string, new Object[0]);
            promise.reject(new Exception(string));
        }
    }

    public void getNewScreenTimeToDisplay(Promise promise) {
        RNSentryTimeToDisplay.getTimeToDisplay(promise, this.dateProvider);
    }

    public void getSentryAndroidOptions(@NotNull SentryAndroidOptions sentryAndroidOptions, @NotNull ReadableMap readableMap, ILogger iLogger) {
        io.sentry.protocol.t sdkVersion = sentryAndroidOptions.getSdkVersion();
        if (sdkVersion == null) {
            sdkVersion = new io.sentry.protocol.t("sentry.java.android.react-native", io.sentry.android.replay.BuildConfig.VERSION_NAME);
        } else {
            sdkVersion.f13043d = "sentry.java.android.react-native";
        }
        v4.d().b("npm:@sentry/react-native", "7.10.0");
        sentryAndroidOptions.setSentryClientName(sdkVersion.f13043d + "/" + sdkVersion.f13044e);
        sentryAndroidOptions.setNativeSdkName("sentry.native.android.react-native");
        sentryAndroidOptions.setSdkVersion(sdkVersion);
        if (readableMap.hasKey("debug") && readableMap.getBoolean("debug")) {
            sentryAndroidOptions.setDebug(true);
        }
        if (readableMap.hasKey(ViewProps.ENABLED)) {
            sentryAndroidOptions.setEnabled(readableMap.getBoolean(ViewProps.ENABLED));
        }
        if (!readableMap.hasKey("dsn") || readableMap.getString("dsn") == null) {
            sentryAndroidOptions.setDsn("");
        } else {
            String string = readableMap.getString("dsn");
            iLogger.q(SentryLevel.INFO, g.e("Starting with DSN: '", string, "'"), new Object[0]);
            sentryAndroidOptions.setDsn(string);
        }
        if (readableMap.hasKey("sampleRate")) {
            sentryAndroidOptions.setSampleRate(Double.valueOf(readableMap.getDouble("sampleRate")));
        }
        if (readableMap.hasKey("sendClientReports")) {
            sentryAndroidOptions.setSendClientReports(readableMap.getBoolean("sendClientReports"));
        }
        if (readableMap.hasKey("maxBreadcrumbs")) {
            sentryAndroidOptions.setMaxBreadcrumbs(readableMap.getInt("maxBreadcrumbs"));
        }
        if (readableMap.hasKey("maxCacheItems")) {
            sentryAndroidOptions.setMaxCacheItems(readableMap.getInt("maxCacheItems"));
        }
        if (readableMap.hasKey("environment") && readableMap.getString("environment") != null) {
            sentryAndroidOptions.setEnvironment(readableMap.getString("environment"));
        }
        if (readableMap.hasKey("release") && readableMap.getString("release") != null) {
            sentryAndroidOptions.setRelease(readableMap.getString("release"));
        }
        if (readableMap.hasKey("dist") && readableMap.getString("dist") != null) {
            sentryAndroidOptions.setDist(readableMap.getString("dist"));
        }
        if (readableMap.hasKey("enableAutoSessionTracking")) {
            sentryAndroidOptions.setEnableAutoSessionTracking(readableMap.getBoolean("enableAutoSessionTracking"));
        }
        if (readableMap.hasKey("sessionTrackingIntervalMillis")) {
            sentryAndroidOptions.setSessionTrackingIntervalMillis(readableMap.getInt("sessionTrackingIntervalMillis"));
        }
        if (readableMap.hasKey("shutdownTimeout")) {
            sentryAndroidOptions.setShutdownTimeoutMillis(readableMap.getInt("shutdownTimeout"));
        }
        if (readableMap.hasKey("enableNdkScopeSync")) {
            sentryAndroidOptions.setEnableScopeSync(readableMap.getBoolean("enableNdkScopeSync"));
        }
        if (readableMap.hasKey("attachStacktrace")) {
            sentryAndroidOptions.setAttachStacktrace(readableMap.getBoolean("attachStacktrace"));
        }
        if (readableMap.hasKey("attachThreads")) {
            sentryAndroidOptions.setAttachThreads(readableMap.getBoolean("attachThreads"));
        }
        if (readableMap.hasKey("attachScreenshot")) {
            sentryAndroidOptions.setAttachScreenshot(readableMap.getBoolean("attachScreenshot"));
        }
        if (readableMap.hasKey("attachViewHierarchy")) {
            sentryAndroidOptions.setAttachViewHierarchy(readableMap.getBoolean("attachViewHierarchy"));
        }
        if (readableMap.hasKey("sendDefaultPii")) {
            sentryAndroidOptions.setSendDefaultPii(readableMap.getBoolean("sendDefaultPii"));
        }
        if (readableMap.hasKey("maxQueueSize")) {
            sentryAndroidOptions.setMaxQueueSize(readableMap.getInt("maxQueueSize"));
        }
        if (readableMap.hasKey("enableNdk")) {
            sentryAndroidOptions.setEnableNdk(readableMap.getBoolean("enableNdk"));
        }
        if (readableMap.hasKey("enableLogs")) {
            sentryAndroidOptions.getLogs().f12851a = readableMap.getBoolean("enableLogs");
        }
        if (readableMap.hasKey("spotlight")) {
            if (readableMap.getType("spotlight") == ReadableType.Boolean) {
                sentryAndroidOptions.setEnableSpotlight(readableMap.getBoolean("spotlight"));
                sentryAndroidOptions.setSpotlightConnectionUrl(readableMap.getString("defaultSidecarUrl"));
            } else if (readableMap.getType("spotlight") == ReadableType.String) {
                sentryAndroidOptions.setEnableSpotlight(true);
                sentryAndroidOptions.setSpotlightConnectionUrl(readableMap.getString("spotlight"));
            }
        }
        a6 replayOptions = getReplayOptions(readableMap);
        sentryAndroidOptions.setSessionReplay(replayOptions);
        this.loadClass.getClass();
        boolean zB = f.b("io.sentry.android.replay.ReplayIntegration", iLogger);
        if (isReplayEnabled(replayOptions) && zB) {
            sentryAndroidOptions.getReplayController().setBreadcrumbConverter(new RNSentryReplayBreadcrumbConverter());
            initFragmentReplayTracking();
        }
        configureAndroidProfiling(sentryAndroidOptions, readableMap);
        sentryAndroidOptions.setBeforeBreadcrumb(new a(0, getURLFromDSN(readableMap.getString("dsn")), readableMap.getString("devServerUrl")));
        sentryAndroidOptions.addIgnoredExceptionForType(JavascriptException.class);
        trySetIgnoreErrors(sentryAndroidOptions, readableMap);
        sentryAndroidOptions.setBeforeSend(new x(4, this, sentryAndroidOptions));
        if (readableMap.hasKey("enableNativeCrashHandling") && !readableMap.getBoolean("enableNativeCrashHandling")) {
            List<l1> integrations = sentryAndroidOptions.getIntegrations();
            for (l1 l1Var : integrations) {
                if ((l1Var instanceof UncaughtExceptionHandlerIntegration) || (l1Var instanceof AnrIntegration) || (l1Var instanceof NdkIntegration)) {
                    integrations.remove(l1Var);
                }
            }
        }
        iLogger.q(SentryLevel.INFO, String.format("Native Integrations '%s'", sentryAndroidOptions.getIntegrations()), new Object[0]);
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null) {
            m0.f12349e.a(currentActivity);
        }
    }

    public void initNativeReactNavigationNewFrameTracking(Promise promise) {
        initFragmentInitialFrameTracking();
    }

    public void initNativeSdk(ReadableMap readableMap, Promise promise) {
        d1.b(getApplicationContext(), new m0(1), new x(5, this, readableMap));
        promise.resolve(Boolean.TRUE);
    }

    public void popTimeToDisplayFor(String str, Promise promise) {
        if (str != null) {
            promise.resolve(RNSentryTimeToDisplay.popTimeToDisplayFor(str));
        } else {
            promise.resolve(null);
        }
    }

    public void removeListeners(double d6) {
        logger.q(SentryLevel.ERROR, "removeListeners of NativeEventEmitter can't be used on Android!", new Object[0]);
    }

    public boolean setActiveSpanId(String str) {
        RNSentryTimeToDisplay.setActiveSpanId(str);
        return true;
    }

    public void setContext(String str, ReadableMap readableMap) {
        if (str == null) {
            logger.q(SentryLevel.ERROR, "RNSentry.setContext called with null key, can't change context.", new Object[0]);
        } else {
            c4.d(null, new x(6, readableMap, str));
        }
    }

    public void setExtra(String str, String str2) {
        if (str == null || str2 == null) {
            logger.q(SentryLevel.ERROR, "RNSentry.setExtra called with null key or value, can't change extra.", new Object[0]);
        } else {
            c4.d(null, new a(1, str, str2));
        }
    }

    public void setTag(String str, String str2) {
        c4.d(null, new a(2, str, str2));
    }

    public void setUser(ReadableMap readableMap, ReadableMap readableMap2) {
        c4.d(null, new x(3, readableMap, readableMap2));
    }

    public WritableMap startProfiling(boolean z5) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        if (this.androidProfiler == null && z5) {
            initializeAndroidProfiler();
        }
        try {
            HermesSamplingProfiler.enable();
            t tVar = this.androidProfiler;
            if (tVar != null) {
                tVar.c();
            }
            writableNativeMap.putBoolean("started", true);
            return writableNativeMap;
        } catch (Throwable th2) {
            writableNativeMap.putBoolean("started", false);
            writableNativeMap.putString("error", th2.toString());
            return writableNativeMap;
        }
    }

    public WritableMap stopProfiling() {
        boolean zDelete;
        boolean zIsDebug = c4.f().l().isDebug();
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        File fileCreateTempFile = null;
        try {
            t tVar = this.androidProfiler;
            io.sentry.android.core.r rVarA = tVar != null ? tVar.a(null, false) : null;
            HermesSamplingProfiler.disable();
            fileCreateTempFile = File.createTempFile("sampling-profiler-trace", ".cpuprofile", this.reactApplicationContext.getCacheDir());
            if (zIsDebug) {
                logger.q(SentryLevel.INFO, "Profile saved to: " + fileCreateTempFile.getAbsolutePath(), new Object[0]);
            }
            HermesSamplingProfiler.dumpSampledTraceToFile(fileCreateTempFile.getPath());
            writableNativeMap.putString("profile", readStringFromFile(fileCreateTempFile));
            if (rVarA != null) {
                WritableNativeMap writableNativeMap2 = new WritableNativeMap();
                writableNativeMap2.putString("sampled_profile", io.sentry.config.a.r(a.a.w(this.maxTraceFileSize, ((File) rVarA.f12394v).getPath())));
                buildInfo.getClass();
                writableNativeMap2.putInt("android_api_level", Build.VERSION.SDK_INT);
                writableNativeMap2.putString("build_id", getProguardUuid());
                writableNativeMap.putMap("androidProfile", writableNativeMap2);
            }
            try {
                if (!fileCreateTempFile.delete()) {
                    logger.q(SentryLevel.WARNING, "Profile not deleted from:" + fileCreateTempFile.getAbsolutePath(), new Object[0]);
                    return writableNativeMap;
                }
            } catch (Throwable unused) {
                logger.q(SentryLevel.WARNING, "Profile not deleted from:" + fileCreateTempFile.getAbsolutePath(), new Object[0]);
            }
        } catch (Throwable th2) {
            try {
                writableNativeMap.putString("error", th2.toString());
                if (fileCreateTempFile != null) {
                    try {
                        if (!zDelete) {
                            logger.q(SentryLevel.WARNING, "Profile not deleted from:" + fileCreateTempFile.getAbsolutePath(), new Object[0]);
                        }
                    } catch (Throwable unused2) {
                        logger.q(SentryLevel.WARNING, "Profile not deleted from:" + fileCreateTempFile.getAbsolutePath(), new Object[0]);
                    }
                }
            } finally {
                if (fileCreateTempFile != null) {
                    try {
                        if (!fileCreateTempFile.delete()) {
                            logger.q(SentryLevel.WARNING, "Profile not deleted from:" + fileCreateTempFile.getAbsolutePath(), new Object[0]);
                        }
                    } catch (Throwable unused3) {
                        logger.q(SentryLevel.WARNING, "Profile not deleted from:" + fileCreateTempFile.getAbsolutePath(), new Object[0]);
                    }
                }
            }
        }
        return writableNativeMap;
    }

    public void trySetIgnoreErrors(SentryAndroidOptions sentryAndroidOptions, ReadableMap readableMap) {
        ReadableArray array = readableMap.hasKey("ignoreErrorsRegex") ? readableMap.getArray("ignoreErrorsRegex") : null;
        ReadableArray array2 = readableMap.hasKey("ignoreErrorsStr") ? readableMap.getArray("ignoreErrorsStr") : null;
        if (array == null && array2 == null) {
            return;
        }
        ArrayList arrayList = new ArrayList((array != null ? array.size() : 0) + (array2 != null ? array2.size() : 0));
        if (array != null) {
            for (int i7 = 0; i7 < array.size(); i7++) {
                arrayList.add(array.getString(i7));
            }
        }
        if (array2 != null) {
            for (int i10 = 0; i10 < array2.size(); i10++) {
                arrayList.add(w5.DEFAULT_PROPAGATION_TARGETS + Pattern.quote(array2.getString(i10)) + w5.DEFAULT_PROPAGATION_TARGETS);
            }
        }
        sentryAndroidOptions.setIgnoredErrors(arrayList);
    }

    public void fetchNativeDeviceContexts(Promise promise, @NotNull w5 w5Var, Context context, IScope iScope) {
        if (!(w5Var instanceof SentryAndroidOptions)) {
            promise.resolve(null);
            return;
        }
        if (context == null) {
            promise.resolve(null);
            return;
        }
        if (iScope != null) {
            Iterator it = iScope.w().iterator();
            while (it.hasNext()) {
                if ("react-native".equals(((Breadcrumb) it.next()).E)) {
                    it.remove();
                }
            }
        }
        promise.resolve(RNSentryMapConverter.convertToWritable(w0.l(context, (SentryAndroidOptions) w5Var, iScope)));
    }

    public void fetchNativeAppStart(Promise promise) {
        io.sentry.android.core.performance.f fVarB = io.sentry.android.core.performance.f.b();
        io.sentry.android.core.performance.f fVarB2 = io.sentry.android.core.performance.f.b();
        ArrayList arrayList = new ArrayList();
        io.sentry.android.core.performance.g gVar = new io.sentry.android.core.performance.g();
        io.sentry.android.core.performance.g gVar2 = fVarB2.f12378i;
        long j = gVar2.f12384e;
        long j5 = gVar2.f12385i;
        long j7 = io.sentry.android.core.performance.f.L;
        gVar.f12383d = "Process Initialization";
        gVar.f12384e = j;
        gVar.f12385i = j5;
        gVar.f12386v = j7;
        w0.a(gVar, arrayList);
        w0.a(fVarB2.f12380w, arrayList);
        ArrayList arrayList2 = new ArrayList(fVarB2.f12381x.values());
        Collections.sort(arrayList2);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            w0.a((io.sentry.android.core.performance.g) it.next(), arrayList);
        }
        ArrayList<io.sentry.android.core.performance.c> arrayList3 = new ArrayList(fVarB2.f12382y);
        Collections.sort(arrayList3);
        for (io.sentry.android.core.performance.c cVar : arrayList3) {
            w0.a(cVar.f12372d, arrayList);
            w0.a(cVar.f12373e, arrayList);
        }
        HashMap map = new HashMap();
        map.put("spans", arrayList);
        map.put("type", fVarB2.f12376d.toString().toLowerCase(Locale.ROOT));
        if (gVar2.c()) {
            map.put("app_start_timestamp_ms", Long.valueOf(gVar2.f12384e));
        }
        fetchNativeAppStart(promise, fVarB, map, logger);
    }
}

package io.sentry;

import com.facebook.react.uimanager.ViewProps;
import io.sentry.android.core.SentryAndroidOptions;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.ServiceLoader;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile y0 f12513a = p2.f12865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile x0 f12514b = n2.f12827b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p3 f12515c = new p3(w5.empty());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile boolean f12516d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Charset f12517e = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f12518f = System.currentTimeMillis();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final io.sentry.util.a f12519g = new io.sentry.util.a();

    public static void a(Breadcrumb breadcrumb) {
        f().c(breadcrumb);
    }

    public static io.sentry.protocol.v b(String str, SentryLevel sentryLevel) {
        return f().u(str, sentryLevel);
    }

    public static void c() {
        r rVarA = f12519g.a();
        try {
            x0 x0VarF = f();
            f12514b = n2.f12827b;
            f12513a.close();
            x0VarF.a(false);
            rVarA.close();
        } catch (Throwable th2) {
            try {
                rVarA.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public static void d(t3 t3Var, r3 r3Var) {
        f().r(t3Var, r3Var);
    }

    public static void e(long j) {
        f().b(j);
    }

    public static x0 f() {
        if (f12516d) {
            return f12514b;
        }
        x0 x0Var = f12513a.get();
        if (x0Var != null && !x0Var.q()) {
            return x0Var;
        }
        x0 x0VarW = f12514b.w("getCurrentScopes");
        f12513a.a(x0VarW);
        return x0VarW;
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, java.util.Collection] */
    public static void g(g2 g2Var, io.sentry.android.core.e eVar) {
        w5 w5Var = (w5) SentryAndroidOptions.class.getDeclaredConstructor(null).newInstance(null);
        try {
            eVar.c(w5Var);
        } catch (Throwable th2) {
            w5Var.getLogger().g(SentryLevel.ERROR, "Error in the 'OptionsConfiguration.configure' callback.", th2);
        }
        v3 v3Var = v3.f13245a;
        r rVarA = f12519g.a();
        try {
            if (!w5Var.getClass().getName().equals("io.sentry.android.core.SentryAndroidOptions") && io.sentry.util.h.f13226a) {
                throw new IllegalArgumentException("You are running Android. Please, use SentryAndroid.init. ".concat(w5Var.getClass().getName()));
            }
            if (l(w5Var)) {
                Boolean boolIsGlobalHubMode = w5Var.isGlobalHubMode();
                int i7 = 1;
                boolean zBooleanValue = boolIsGlobalHubMode != null ? boolIsGlobalHubMode.booleanValue() : true;
                w5Var.getLogger().q(SentryLevel.INFO, "GlobalHubMode: '%s'", String.valueOf(zBooleanValue));
                f12516d = zBooleanValue;
                int i10 = 6;
                if (w5Var.getFatalLogger() instanceof j2) {
                    w5Var.setFatalLogger(new g2(i10));
                }
                p3 p3Var = f12515c;
                int i11 = 0;
                if (android.support.v4.media.session.b.w(p3Var.k, w5Var, k())) {
                    if (k()) {
                        w5Var.getLogger().q(SentryLevel.WARNING, "Sentry has been already initialized. Previous configuration will be overwritten.", new Object[0]);
                    }
                    f().a(true);
                    p3Var.k = w5Var;
                    ?? r5 = p3Var.f12872g;
                    p3Var.f12872g = p3.b(w5Var.getMaxBreadcrumbs());
                    Iterator it = r5.iterator();
                    while (it.hasNext()) {
                        p3Var.g((Breadcrumb) it.next(), null);
                    }
                    f12514b = new u3(new p3(w5Var), new p3(w5Var), p3Var);
                    if (w5Var.isDebug() && (w5Var.getLogger() instanceof j2)) {
                        w5Var.setLogger(new g2(i10));
                    }
                    i(w5Var);
                    f12513a.a(f12514b);
                    h(w5Var);
                    p3Var.f12883t = new h4(w5Var);
                    if (w5Var.getExecutorService().isClosed()) {
                        w5Var.setExecutorService(new com.google.firebase.messaging.r(w5Var));
                        w5Var.getExecutorService().c();
                    }
                    try {
                        w5Var.getExecutorService().submit(new z3(w5Var, i11));
                    } catch (RejectedExecutionException e10) {
                        w5Var.getLogger().g(SentryLevel.DEBUG, "Failed to call the executor. Lazy fields will not be loaded. Did you call Sentry.close()?", e10);
                    }
                    try {
                        w5Var.getExecutorService().submit(new a3.h(22, w5Var));
                    } catch (Throwable th3) {
                        w5Var.getLogger().g(SentryLevel.DEBUG, "Failed to move previous session.", th3);
                    }
                    for (l1 l1Var : w5Var.getIntegrations()) {
                        try {
                            l1Var.register(v3Var, w5Var);
                        } catch (Throwable th4) {
                            w5Var.getLogger().g(SentryLevel.WARNING, "Failed to register the integration " + l1Var.getClass().getName(), th4);
                        }
                    }
                    try {
                        w5Var.getExecutorService().submit(new z3(w5Var, 2));
                    } catch (Throwable th5) {
                        w5Var.getLogger().g(SentryLevel.DEBUG, "Failed to notify options observers.", th5);
                    }
                    try {
                        w5Var.getExecutorService().submit(new b3(w5Var));
                    } catch (Throwable th6) {
                        w5Var.getLogger().g(SentryLevel.DEBUG, "Failed to finalize previous session.", th6);
                    }
                    try {
                        w5Var.getExecutorService().submit(new z3(w5Var, i7));
                    } catch (Throwable th7) {
                        w5Var.getLogger().g(SentryLevel.ERROR, "Failed to call the executor. App start profiling config will not be changed. Did you call Sentry.close()?", th7);
                    }
                    ILogger logger = w5Var.getLogger();
                    SentryLevel sentryLevel = SentryLevel.DEBUG;
                    logger.q(sentryLevel, "Using openTelemetryMode %s", w5Var.getOpenTelemetryMode());
                    w5Var.getLogger().q(sentryLevel, "Using span factory %s", w5Var.getSpanFactory().getClass().getName());
                    w5Var.getLogger().q(sentryLevel, "Using scopes storage %s", f12513a.getClass().getName());
                } else {
                    w5Var.getLogger().q(SentryLevel.WARNING, "This init call has been ignored due to priority being too low.", new Object[0]);
                }
            }
            rVarA.close();
        } catch (Throwable th8) {
            try {
                rVarA.close();
            } catch (Throwable th9) {
                th8.addSuppressed(th9);
            }
            throw th8;
        }
    }

    public static void h(w5 w5Var) {
        io.sentry.cache.d cVar;
        ILogger logger = w5Var.getLogger();
        SentryLevel sentryLevel = SentryLevel.INFO;
        logger.q(sentryLevel, "Initializing SDK with DSN: '%s'", w5Var.getDsn());
        String outboxPath = w5Var.getOutboxPath();
        if (outboxPath != null) {
            w5Var.getRuntimeManager().h(new a4(new File(outboxPath), 0));
        } else {
            logger.q(sentryLevel, "No outbox dir path is defined in options.", new Object[0]);
        }
        String cacheDirPath = w5Var.getCacheDirPath();
        if (cacheDirPath != null) {
            w5Var.getRuntimeManager().h(new a4(new File(cacheDirPath), 1));
            if (w5Var.getEnvelopeDiskCache() instanceof io.sentry.transport.i) {
                int i7 = io.sentry.cache.c.G;
                String cacheDirPath2 = w5Var.getCacheDirPath();
                int maxCacheItems = w5Var.getMaxCacheItems();
                if (cacheDirPath2 == null) {
                    w5Var.getLogger().q(SentryLevel.WARNING, "cacheDirPath is null, returning NoOpEnvelopeCache", new Object[0]);
                    cVar = io.sentry.transport.i.f13186d;
                } else {
                    cVar = new io.sentry.cache.c(w5Var, cacheDirPath2, maxCacheItems);
                }
                w5Var.setEnvelopeDiskCache(cVar);
            }
        }
        String profilingTracesDirPath = w5Var.getProfilingTracesDirPath();
        if ((w5Var.isProfilingEnabled() || w5Var.isContinuousProfilingEnabled()) && profilingTracesDirPath != null) {
            File file = new File(profilingTracesDirPath);
            w5Var.getRuntimeManager().h(new a4(file, 2));
            try {
                w5Var.getExecutorService().submit(new com.google.firebase.messaging.s(25, file));
            } catch (RejectedExecutionException e10) {
                w5Var.getLogger().g(SentryLevel.ERROR, "Failed to call the executor. Old profiles will not be deleted. Did you call Sentry.close()?", e10);
            }
        }
        io.sentry.internal.modules.a modulesLoader = w5Var.getModulesLoader();
        if (!w5Var.isSendModules()) {
            w5Var.setModulesLoader(io.sentry.internal.modules.e.f12774a);
        } else if (modulesLoader instanceof io.sentry.internal.modules.e) {
            w5Var.setModulesLoader(new io.sentry.internal.modules.f(Arrays.asList(new io.sentry.internal.modules.c(w5Var.getLogger()), new io.sentry.internal.modules.f(w5Var.getLogger())), w5Var.getLogger()));
        }
        if (w5Var.getDebugMetaLoader() instanceof io.sentry.internal.debugmeta.b) {
            w5Var.setDebugMetaLoader(new io.sentry.internal.debugmeta.c(w5Var.getLogger()));
        }
        List<Properties> listU = w5Var.getDebugMetaLoader().U();
        if (listU != null) {
            if (w5Var.getBundleIds().isEmpty()) {
                Iterator it = listU.iterator();
                while (it.hasNext()) {
                    String property = ((Properties) it.next()).getProperty("io.sentry.bundle-ids");
                    w5Var.getLogger().q(SentryLevel.DEBUG, "Bundle IDs found: %s", property);
                    if (property != null) {
                        for (String str : property.split(",", -1)) {
                            w5Var.addBundleId(str);
                        }
                    }
                }
            }
            if (w5Var.getProguardUuid() == null) {
                Iterator it2 = listU.iterator();
                while (it2.hasNext()) {
                    String property2 = ((Properties) it2.next()).getProperty("io.sentry.ProguardUuids");
                    if (property2 != null) {
                        w5Var.getLogger().q(SentryLevel.DEBUG, "Proguard UUID found: %s", property2);
                        w5Var.setProguardUuid(property2);
                        break;
                    }
                }
            }
            for (Properties properties : listU) {
                String property3 = properties.getProperty("io.sentry.build-tool");
                if (property3 != null) {
                    String property4 = properties.getProperty("io.sentry.build-tool-version");
                    if (property4 == null) {
                        property4 = "unknown";
                    }
                    w5Var.getLogger().q(SentryLevel.DEBUG, "Build tool found: %s, version %s", property3, property4);
                    v4.d().b(property3, property4);
                    break;
                }
            }
            for (Properties properties2 : listU) {
                String property5 = properties2.getProperty("io.sentry.distribution.org-slug");
                String property6 = properties2.getProperty("io.sentry.distribution.project-slug");
                String property7 = properties2.getProperty("io.sentry.distribution.auth-token");
                String property8 = properties2.getProperty("io.sentry.distribution.build-configuration");
                if (property5 != null || property6 != null || property7 != null || property8 != null) {
                    n5 distribution = w5Var.getDistribution();
                    if (property5 != null && !property5.isEmpty() && distribution.f12836b.isEmpty()) {
                        w5Var.getLogger().q(SentryLevel.DEBUG, "Distribution org slug found: %s", property5);
                        distribution.f12836b = property5;
                    }
                    if (property6 != null && !property6.isEmpty() && distribution.f12837c.isEmpty()) {
                        w5Var.getLogger().q(SentryLevel.DEBUG, "Distribution project slug found: %s", property6);
                        distribution.f12837c = property6;
                    }
                    if (property7 != null && !property7.isEmpty() && distribution.f12835a.isEmpty()) {
                        w5Var.getLogger().q(SentryLevel.DEBUG, "Distribution org auth token found", new Object[0]);
                        distribution.f12835a = property7;
                    }
                    if (property8 != null && !property8.isEmpty() && distribution.f12838d == null) {
                        w5Var.getLogger().q(SentryLevel.DEBUG, "Distribution build configuration found: %s", property8);
                        distribution.f12838d = property8;
                        break;
                    } else {
                        break;
                        break;
                        break;
                    }
                }
            }
        }
        if (w5Var.getThreadChecker() instanceof io.sentry.util.thread.b) {
            w5Var.setThreadChecker(io.sentry.util.thread.c.f13238b);
        }
        if (w5Var.getPerformanceCollectors().isEmpty()) {
            w5Var.addPerformanceCollector(new m1());
        }
        if (w5Var.isEnableBackpressureHandling() && !io.sentry.util.h.f13226a) {
            if (w5Var.getBackpressureMonitor() instanceof io.sentry.backpressure.c) {
                w5Var.setBackpressureMonitor(new io.sentry.backpressure.a(w5Var));
            }
            w5Var.getBackpressureMonitor().start();
        }
        if (!io.sentry.util.h.f13226a && w5Var.isContinuousProfilingEnabled() && (w5Var.getContinuousProfiler() instanceof f2)) {
            try {
                android.support.v4.media.session.b.n(w5Var);
                ILogger logger2 = w5Var.getLogger();
                w5Var.getProfilingTracesHz();
                w5Var.getExecutorService();
                try {
                    Iterator it3 = ServiceLoader.load(io.sentry.profiling.a.class).iterator();
                    if ((it3.hasNext() ? it3.next() : null) != null) {
                        throw new ClassCastException();
                    }
                    logger2.q(SentryLevel.DEBUG, "No continuous profiler provider found, using NoOpContinuousProfiler", new Object[0]);
                    w5Var.getLogger().q(SentryLevel.WARNING, "Could not load profiler, profiling will be disabled. If you are using Spring or Spring Boot with the OTEL Agent profiler init will be retried.", new Object[0]);
                    w5Var.getContinuousProfiler();
                } catch (Throwable th2) {
                    logger2.g(SentryLevel.ERROR, "Failed to load continuous profiler provider, using NoOpContinuousProfiler", th2);
                }
            } catch (Exception e11) {
                w5Var.getLogger().g(SentryLevel.ERROR, "Failed to create default profiling traces directory", e11);
            }
        } else {
            w5Var.getContinuousProfiler();
        }
        if (!io.sentry.util.h.f13226a && w5Var.isContinuousProfilingEnabled() && (w5Var.getProfilerConverter() instanceof k2)) {
            ILogger logger3 = f12515c.k.getLogger();
            try {
                Iterator it4 = ServiceLoader.load(io.sentry.profiling.b.class).iterator();
                if ((it4.hasNext() ? it4.next() : null) != null) {
                    throw new ClassCastException();
                }
                logger3.q(SentryLevel.DEBUG, "No profile converter provider found, using NoOpProfileConverter", new Object[0]);
                w5Var.getLogger().q(SentryLevel.WARNING, "Could not load profile converter. If you are using Spring or Spring Boot with the OTEL Agent, profile converter init will be retried.", new Object[0]);
                w5Var.getProfilerConverter();
            } catch (Throwable th3) {
                logger3.g(SentryLevel.ERROR, "Failed to load profile converter provider, using NoOpProfileConverter", th3);
            }
        } else {
            w5Var.getProfilerConverter();
        }
        w5Var.getLogger().q(SentryLevel.INFO, "Continuous profiler is enabled %s mode: %s", Boolean.valueOf(w5Var.isContinuousProfilingEnabled()), w5Var.getProfileLifecycle());
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00aa  */
    public static void i(w5 w5Var) {
        y0 sVar;
        Class clsC;
        List list;
        j2 j2Var = j2.f12781d;
        boolean z5 = io.sentry.util.h.f13226a;
        if (!z5) {
            if (f5.AUTO.equals(w5Var.getOpenTelemetryMode())) {
                if (io.sentry.util.f.b("io.sentry.opentelemetry.agent.AgentMarker", j2Var)) {
                    w5Var.getLogger().q(SentryLevel.DEBUG, "openTelemetryMode has been inferred from AUTO to AGENT", new Object[0]);
                    w5Var.setOpenTelemetryMode(f5.AGENT);
                } else if (io.sentry.util.f.b("io.sentry.opentelemetry.agent.AgentlessMarker", j2Var)) {
                    w5Var.getLogger().q(SentryLevel.DEBUG, "openTelemetryMode has been inferred from AUTO to AGENTLESS", new Object[0]);
                    w5Var.setOpenTelemetryMode(f5.AGENTLESS);
                } else if (io.sentry.util.f.b("io.sentry.opentelemetry.agent.AgentlessSpringMarker", j2Var)) {
                    w5Var.getLogger().q(SentryLevel.DEBUG, "openTelemetryMode has been inferred from AUTO to AGENTLESS_SPRING", new Object[0]);
                    w5Var.setOpenTelemetryMode(f5.AGENTLESS_SPRING);
                }
            }
        }
        f5 f5Var = f5.OFF;
        if (f5Var == w5Var.getOpenTelemetryMode()) {
            w5Var.setSpanFactory(new u2(1));
        }
        f12513a.close();
        if (f5Var == w5Var.getOpenTelemetryMode()) {
            f12513a = new s();
        } else {
            if (z5 || !io.sentry.util.f.b("io.sentry.opentelemetry.OtelContextScopesStorage", j2Var) || (clsC = io.sentry.util.f.c("io.sentry.opentelemetry.OtelContextScopesStorage", j2Var)) == null) {
                sVar = new s();
            } else {
                try {
                    Object objNewInstance = clsC.getDeclaredConstructor(null).newInstance(null);
                    if (objNewInstance == null || !(objNewInstance instanceof y0)) {
                        sVar = new s();
                    } else {
                        sVar = (y0) objNewInstance;
                    }
                } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
                }
            }
            f12513a = sVar;
        }
        if (io.sentry.util.h.f13226a) {
            return;
        }
        f5 openTelemetryMode = w5Var.getOpenTelemetryMode();
        if (f5.OFF.equals(openTelemetryMode)) {
            list = Collections.EMPTY_LIST;
        } else {
            ConcurrentHashMap concurrentHashMap = io.sentry.util.k.f13232a;
            ArrayList arrayList = new ArrayList();
            f5 f5Var2 = f5.AGENT;
            if (f5Var2 == openTelemetryMode || f5.AGENTLESS_SPRING == openTelemetryMode) {
                arrayList.add("auto.http.spring_jakarta.webmvc");
                arrayList.add("auto.http.spring.webmvc");
                arrayList.add("auto.http.spring7.webmvc");
                arrayList.add("auto.spring_jakarta.webflux");
                arrayList.add("auto.spring.webflux");
                arrayList.add("auto.spring7.webflux");
                arrayList.add("auto.db.jdbc");
                arrayList.add("auto.http.spring_jakarta.webclient");
                arrayList.add("auto.http.spring.webclient");
                arrayList.add("auto.http.spring7.webclient");
                arrayList.add("auto.http.spring_jakarta.restclient");
                arrayList.add("auto.http.spring.restclient");
                arrayList.add("auto.http.spring7.restclient");
                arrayList.add("auto.http.spring_jakarta.resttemplate");
                arrayList.add("auto.http.spring.resttemplate");
                arrayList.add("auto.http.spring7.resttemplate");
                arrayList.add("auto.http.openfeign");
                arrayList.add("auto.http.ktor-client");
            }
            if (f5Var2 == openTelemetryMode) {
                arrayList.add("auto.graphql.graphql");
                arrayList.add("auto.graphql.graphql22");
            }
            list = arrayList;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            w5Var.addIgnoredSpanOrigin((String) it.next());
        }
    }

    public static Boolean j() {
        return f().m();
    }

    public static boolean k() {
        return f().isEnabled();
    }

    public static boolean l(w5 w5Var) {
        Properties properties;
        Double dValueOf;
        Double dValueOf2;
        Properties propertiesC;
        Properties propertiesC2;
        if (w5Var.isEnableExternalConfiguration()) {
            g2 g2Var = new g2(6);
            ArrayList arrayList = new ArrayList();
            arrayList.add(new io.sentry.config.e("sentry.", System.getProperties()));
            arrayList.add(new io.sentry.config.c());
            String property = System.getProperty("sentry.properties.file");
            if (property != null && (propertiesC2 = new gc.b(property, g2Var, true).c()) != null) {
                arrayList.add(new io.sentry.config.e(propertiesC2));
            }
            String str = System.getenv("SENTRY_PROPERTIES_FILE");
            if (str != null && (propertiesC = new gc.b(str, g2Var, true).c()) != null) {
                arrayList.add(new io.sentry.config.e(propertiesC));
            }
            Double dValueOf3 = null;
            try {
                InputStream resourceAsStream = w3.q.j(io.sentry.config.a.class.getClassLoader()).getResourceAsStream("sentry.properties");
                if (resourceAsStream != null) {
                    try {
                        BufferedInputStream bufferedInputStream = new BufferedInputStream(resourceAsStream);
                        try {
                            properties = new Properties();
                            properties.load(bufferedInputStream);
                            bufferedInputStream.close();
                            resourceAsStream.close();
                        } catch (Throwable th2) {
                            try {
                                bufferedInputStream.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                            throw th2;
                        }
                    } catch (Throwable th4) {
                        try {
                            resourceAsStream.close();
                        } catch (Throwable th5) {
                            th4.addSuppressed(th5);
                        }
                        throw th4;
                    }
                } else {
                    if (resourceAsStream != null) {
                        resourceAsStream.close();
                    }
                    properties = null;
                }
            } catch (IOException e10) {
                g2Var.e(SentryLevel.ERROR, e10, "Failed to load Sentry configuration from classpath resource: %s", "sentry.properties");
            }
            if (properties != null) {
                arrayList.add(new io.sentry.config.e(properties));
            }
            Properties propertiesC3 = new gc.b("sentry.properties", g2Var, false).c();
            if (propertiesC3 != null) {
                arrayList.add(new io.sentry.config.e(propertiesC3));
            }
            io.sentry.config.b bVar = new io.sentry.config.b(arrayList);
            ILogger logger = w5Var.getLogger();
            d0 d0Var = new d0();
            d0Var.f12587a = bVar.getProperty("dsn");
            d0Var.f12588b = bVar.getProperty("environment");
            d0Var.f12589c = bVar.getProperty("release");
            d0Var.f12590d = bVar.getProperty("dist");
            d0Var.f12591e = bVar.getProperty("servername");
            d0Var.f12592f = bVar.a("uncaught.handler.enabled");
            d0Var.f12606v = bVar.a("uncaught.handler.print-stacktrace");
            String property2 = bVar.getProperty("traces-sample-rate");
            if (property2 != null) {
                try {
                    dValueOf = Double.valueOf(property2);
                } catch (NumberFormatException unused) {
                    dValueOf = null;
                }
            } else {
                dValueOf = null;
            }
            d0Var.f12595i = dValueOf;
            String property3 = bVar.getProperty("profiles-sample-rate");
            if (property3 != null) {
                try {
                    dValueOf2 = Double.valueOf(property3);
                } catch (NumberFormatException unused2) {
                    dValueOf2 = null;
                }
            } else {
                dValueOf2 = null;
            }
            d0Var.j = dValueOf2;
            d0Var.f12593g = bVar.a("debug");
            d0Var.f12594h = bVar.a("enable-deduplication");
            d0Var.f12607w = bVar.a("send-client-reports");
            d0Var.K = bVar.a("force-init");
            String property4 = bVar.getProperty("max-request-body-size");
            if (property4 != null) {
                d0Var.k = u5.valueOf(property4.toUpperCase(Locale.ROOT));
            }
            for (Map.Entry entry : ((ConcurrentHashMap) bVar.c()).entrySet()) {
                d0Var.f12596l.put((String) entry.getKey(), (String) entry.getValue());
            }
            String property5 = bVar.getProperty("proxy.host");
            String property6 = bVar.getProperty("proxy.user");
            String property7 = bVar.getProperty("proxy.pass");
            String property8 = bVar.getProperty("proxy.port");
            if (property8 == null) {
                property8 = "80";
            }
            if (property5 != null) {
                t5 t5Var = new t5();
                t5Var.f13157a = property5;
                t5Var.f13158b = property8;
                t5Var.f13159c = property6;
                t5Var.f13160d = property7;
                d0Var.f12597m = t5Var;
            }
            Iterator it = bVar.d("in-app-includes").iterator();
            while (it.hasNext()) {
                d0Var.f12599o.add((String) it.next());
            }
            Iterator it2 = bVar.d("in-app-excludes").iterator();
            while (it2.hasNext()) {
                d0Var.f12598n.add((String) it2.next());
            }
            List<String> listD = bVar.getProperty("trace-propagation-targets") != null ? bVar.d("trace-propagation-targets") : null;
            if (listD == null && bVar.getProperty("tracing-origins") != null) {
                listD = bVar.d("tracing-origins");
            }
            if (listD != null) {
                for (String str2 : listD) {
                    if (d0Var.f12600p == null) {
                        d0Var.f12600p = new CopyOnWriteArrayList();
                    }
                    if (!str2.isEmpty()) {
                        d0Var.f12600p.add(str2);
                    }
                }
            }
            Iterator it3 = bVar.d("context-tags").iterator();
            while (it3.hasNext()) {
                d0Var.f12601q.add((String) it3.next());
            }
            d0Var.f12602r = bVar.getProperty("proguard-uuid");
            Iterator it4 = bVar.d("bundle-ids").iterator();
            while (it4.hasNext()) {
                d0Var.f12608x.add((String) it4.next());
            }
            d0Var.f12603s = bVar.b("idle-timeout");
            String property9 = bVar.getProperty("ignored-errors");
            d0Var.f12605u = property9 != null ? Arrays.asList(property9.split(",")) : null;
            d0Var.f12609y = bVar.a(ViewProps.ENABLED);
            d0Var.f12610z = bVar.a("enable-pretty-serialization-output");
            d0Var.G = bVar.a("send-modules");
            d0Var.H = bVar.a("send-default-pii");
            String property10 = bVar.getProperty("ignored-checkins");
            d0Var.E = property10 != null ? Arrays.asList(property10.split(",")) : null;
            String property11 = bVar.getProperty("ignored-transactions");
            d0Var.F = property11 != null ? Arrays.asList(property11.split(",")) : null;
            d0Var.I = bVar.a("enable-backpressure-handling");
            d0Var.J = bVar.a("global-hub-mode");
            d0Var.L = bVar.a("capture-open-telemetry-events");
            d0Var.B = bVar.a("logs.enabled");
            d0Var.C = bVar.a("metrics.enabled");
            for (String str3 : bVar.d("ignored-exceptions-for-type")) {
                try {
                    Class<?> cls = Class.forName(str3);
                    if (Throwable.class.isAssignableFrom(cls)) {
                        d0Var.f12604t.add(cls);
                    } else {
                        logger.q(SentryLevel.WARNING, "Skipping setting %s as ignored-exception-for-type. Reason: %s does not extend Throwable", str3, str3);
                    }
                } catch (ClassNotFoundException unused3) {
                    logger.q(SentryLevel.WARNING, "Skipping setting %s as ignored-exception-for-type. Reason: %s class is not found", str3, str3);
                }
            }
            Long lB = bVar.b("cron.default-checkin-margin");
            Long lB2 = bVar.b("cron.default-max-runtime");
            String property12 = bVar.getProperty("cron.default-timezone");
            Long lB3 = bVar.b("cron.default-failure-issue-threshold");
            Long lB4 = bVar.b("cron.default-recovery-threshold");
            if (lB != null || lB2 != null || property12 != null || lB3 != null || lB4 != null) {
                m5 m5Var = new m5();
                m5Var.f12819a = lB;
                m5Var.f12820b = lB2;
                m5Var.f12821c = property12;
                m5Var.f12822d = lB3;
                m5Var.f12823e = lB4;
                d0Var.P = m5Var;
            }
            d0Var.A = bVar.a("enable-spotlight");
            d0Var.D = bVar.getProperty("spotlight-connection-url");
            String property13 = bVar.getProperty("profile-session-sample-rate");
            if (property13 != null) {
                try {
                    dValueOf3 = Double.valueOf(property13);
                } catch (NumberFormatException unused4) {
                }
            }
            d0Var.M = dValueOf3;
            d0Var.N = bVar.getProperty("profiling-traces-dir-path");
            String property14 = bVar.getProperty("profile-lifecycle");
            if (property14 != null && !property14.isEmpty()) {
                d0Var.O = f3.valueOf(property14.toUpperCase());
            }
            w5Var.merge(d0Var);
        }
        String dsn = w5Var.getDsn();
        if (!w5Var.isEnabled() || (dsn != null && dsn.isEmpty())) {
            c();
            return false;
        }
        if (dsn == null) {
            throw new IllegalArgumentException("DSN is required. Use empty string or set enabled to false in SentryOptions to disable SDK.");
        }
        w5Var.retrieveParsedDsn();
        return true;
    }

    public static void m(String str, String str2) {
        f().f(str, str2);
    }

    public static void n(ac.b bVar) {
        f().j(bVar);
    }
}

package io.sentry.android.core;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.util.DisplayMetrics;
import com.discord.js_watchdog.SharedPreferencesKey;
import io.sentry.Hint;
import io.sentry.ILogger;
import io.sentry.SentryEvent;
import io.sentry.SentryLevel;
import io.sentry.f6;
import io.sentry.j6;
import io.sentry.protocol.DebugImage;
import io.sentry.w5;
import java.io.File;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class h0 implements io.sentry.b0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f12210d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SentryAndroidOptions f12211e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final k0 f12212i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final u4.c f12213v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final io.sentry.cache.g f12214w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final List f12215x = Collections.singletonList(new g0(this));

    public h0(Context context, k0 k0Var, SentryAndroidOptions sentryAndroidOptions) {
        Context applicationContext = context.getApplicationContext();
        this.f12210d = applicationContext != null ? applicationContext : context;
        this.f12211e = sentryAndroidOptions;
        this.f12212i = k0Var;
        this.f12214w = sentryAndroidOptions.findPersistingScopeObserver();
        this.f12213v = new u4.c(new ue.i(sentryAndroidOptions));
    }

    public final String a() {
        SentryAndroidOptions sentryAndroidOptions = this.f12211e;
        try {
            return (String) sentryAndroidOptions.getRuntimeManager().h(new gc.o(13, this));
        } catch (Throwable th2) {
            sentryAndroidOptions.getLogger().g(SentryLevel.ERROR, "Error getting installationId.", th2);
            return null;
        }
    }

    public final Object b(w5 w5Var, String str, Class cls) {
        io.sentry.cache.g gVar = this.f12214w;
        if (gVar == null) {
            return null;
        }
        return gVar.p(w5Var, str, cls);
    }

    /* JADX WARN: Code duplicated, block: B:189:0x0429  */
    @Override // io.sentry.b0
    public final SentryEvent f(SentryEvent sentryEvent, Hint hint) {
        g0 g0Var;
        g0 g0Var2;
        String str;
        File[] fileArr;
        String str2;
        DisplayMetrics displayMetrics;
        io.sentry.protocol.c0 c0Var;
        ArrayList arrayList;
        Object objB = hint.b("sentry:typeCheckHint");
        boolean z5 = objB instanceof io.sentry.hints.b;
        SentryAndroidOptions sentryAndroidOptions = this.f12211e;
        if (!z5) {
            sentryAndroidOptions.getLogger().q(SentryLevel.WARNING, "The event is not Backfillable, but has been passed to BackfillingEventProcessor, skipping.", new Object[0]);
            return sentryEvent;
        }
        io.sentry.hints.b bVar = (io.sentry.hints.b) objB;
        Iterator it = this.f12215x.iterator();
        do {
            if (!it.hasNext()) {
                g0Var = null;
                break;
            }
            g0Var = (g0) it.next();
            g0Var.getClass();
        } while (!(objB instanceof io.sentry.hints.a));
        boolean z6 = true;
        if (g0Var != null) {
            boolean zEquals = bVar instanceof io.sentry.hints.a ? "anr_background".equals(((io.sentry.hints.a) bVar).c()) : false;
            h0 h0Var = g0Var.f12193a;
            if (sentryEvent.E == null) {
                sentryEvent.E = "java";
            }
            if (sentryEvent.d() == null) {
                io.sentry.protocol.m mVar = new io.sentry.protocol.m();
                if (bVar.shouldEnrich()) {
                    mVar.f12995d = "AppExitInfo";
                } else {
                    mVar.f12995d = "HistoricalAppExitInfo";
                }
                ApplicationNotResponding applicationNotResponding = new ApplicationNotResponding(zEquals ? "Background ANR" : "ANR", Thread.currentThread());
                f6 f6Var = sentryEvent.P;
                ArrayList arrayList2 = f6Var != null ? f6Var.f12677a : null;
                if (arrayList2 == null) {
                    c0Var = null;
                    break;
                }
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        c0Var = null;
                        break;
                    }
                    c0Var = (io.sentry.protocol.c0) it2.next();
                    String str3 = c0Var.f12927i;
                    if (str3 != null && str3.equals("main")) {
                        break;
                    }
                }
                if (c0Var == null) {
                    c0Var = new io.sentry.protocol.c0();
                    c0Var.F = new io.sentry.protocol.a0();
                }
                h0Var.f12213v.getClass();
                io.sentry.protocol.a0 a0Var = c0Var.F;
                if (a0Var == null) {
                    arrayList = new ArrayList(0);
                } else {
                    ArrayList arrayList3 = new ArrayList(1);
                    arrayList3.add(u4.c.s(applicationNotResponding, mVar, c0Var.f12925d, a0Var.f12914d, true));
                    arrayList = arrayList3;
                }
                sentryEvent.Q = new f6(arrayList);
            }
        }
        io.sentry.protocol.c cVar = sentryEvent.f12671e;
        io.sentry.protocol.o oVarG = cVar.g();
        Context context = this.f12210d;
        cVar.s(p0.c(context, sentryAndroidOptions).f12365g);
        if (oVarG != null) {
            String str4 = oVarG.f13006d;
            cVar.k(oVarG, (str4 == null || str4.isEmpty()) ? "os_1" : "os_" + str4.trim().toLowerCase(Locale.ROOT));
        }
        io.sentry.protocol.f fVarE = cVar.e();
        k0 k0Var = this.f12212i;
        if (fVarE == null) {
            io.sentry.protocol.f fVar = new io.sentry.protocol.f();
            fVar.f12941e = Build.MANUFACTURER;
            fVar.f12944i = Build.BRAND;
            fVar.f12945v = l0.d(sentryAndroidOptions.getLogger());
            fVar.f12946w = Build.MODEL;
            fVar.f12947x = Build.ID;
            fVar.f12948y = Build.SUPPORTED_ABIS;
            ActivityManager.MemoryInfo memoryInfoE = l0.e(context, sentryAndroidOptions.getLogger());
            if (memoryInfoE != null) {
                fVar.J = Long.valueOf(memoryInfoE.totalMem);
            }
            fVar.I = k0Var.a();
            ILogger logger = sentryAndroidOptions.getLogger();
            try {
                displayMetrics = context.getResources().getDisplayMetrics();
            } catch (Throwable th2) {
                logger.g(SentryLevel.ERROR, "Error getting DisplayMetrics.", th2);
                displayMetrics = null;
            }
            if (displayMetrics != null) {
                fVar.R = Integer.valueOf(displayMetrics.widthPixels);
                fVar.S = Integer.valueOf(displayMetrics.heightPixels);
                fVar.T = Float.valueOf(displayMetrics.density);
                fVar.U = Integer.valueOf(displayMetrics.densityDpi);
            }
            if (fVar.X == null) {
                fVar.X = a();
            }
            ArrayList arrayListA = io.sentry.android.core.internal.util.f.f12292c.a();
            if (!arrayListA.isEmpty()) {
                fVar.f12938c0 = Double.valueOf(((Integer) Collections.max(arrayListA)).doubleValue());
                fVar.f12937b0 = Integer.valueOf(arrayListA.size());
            }
            cVar.p(fVar);
        }
        if (!bVar.shouldEnrich()) {
            sentryAndroidOptions.getLogger().q(SentryLevel.DEBUG, "The event is Backfillable, but should not be enriched, skipping.", new Object[0]);
            return sentryEvent;
        }
        if (sentryEvent.f12673v == null) {
            sentryEvent.f12673v = (io.sentry.protocol.p) b(sentryAndroidOptions, "request.json", io.sentry.protocol.p.class);
        }
        if (sentryEvent.F == null) {
            sentryEvent.F = (io.sentry.protocol.h0) b(sentryAndroidOptions, "user.json", io.sentry.protocol.h0.class);
        }
        Map map = (Map) b(sentryAndroidOptions, "tags.json", Map.class);
        if (map != null) {
            if (sentryEvent.f12674w == null) {
                sentryEvent.f12674w = new HashMap(new HashMap(map));
            } else {
                for (Map.Entry entry : map.entrySet()) {
                    if (!sentryEvent.f12674w.containsKey(entry.getKey())) {
                        sentryEvent.c((String) entry.getKey(), (String) entry.getValue());
                    }
                }
            }
        }
        List list = (List) b(sentryAndroidOptions, "breadcrumbs.json", List.class);
        if (list != null) {
            List list2 = sentryEvent.J;
            if (list2 == null) {
                sentryEvent.J = new ArrayList(list);
            } else {
                list2.addAll(list);
            }
        }
        Map map2 = (Map) b(sentryAndroidOptions, "extras.json", Map.class);
        if (map2 != null) {
            if (sentryEvent.L == null) {
                sentryEvent.L = new HashMap(new HashMap(map2));
            } else {
                for (Map.Entry entry2 : map2.entrySet()) {
                    boolean z7 = z6;
                    if (!sentryEvent.L.containsKey(entry2.getKey())) {
                        sentryEvent.L.put((String) entry2.getKey(), entry2.getValue());
                    }
                    z6 = z7;
                }
            }
        }
        io.sentry.protocol.c cVar2 = (io.sentry.protocol.c) b(sentryAndroidOptions, "contexts.json", io.sentry.protocol.c.class);
        if (cVar2 != null) {
            Iterator it3 = new io.sentry.protocol.c(cVar2).f12923d.entrySet().iterator();
            while (it3.hasNext()) {
                Map.Entry entry3 = (Map.Entry) it3.next();
                Object value = entry3.getValue();
                Iterator it4 = it3;
                if ((!SharedPreferencesKey.TRACE.equals(entry3.getKey()) || !(value instanceof j6)) && !cVar.a(entry3.getKey())) {
                    cVar.k(value, (String) entry3.getKey());
                }
                it3 = it4;
            }
        }
        String str5 = (String) b(sentryAndroidOptions, "transaction.json", String.class);
        if (sentryEvent.S == null) {
            sentryEvent.S = str5;
        }
        List list3 = (List) b(sentryAndroidOptions, "fingerprint.json", List.class);
        if (sentryEvent.T == null) {
            sentryEvent.T = list3 != null ? new ArrayList(list3) : null;
        }
        SentryLevel sentryLevel = (SentryLevel) b(sentryAndroidOptions, "level.json", SentryLevel.class);
        if (sentryEvent.R == null) {
            sentryEvent.R = sentryLevel;
        }
        j6 j6Var = (j6) b(sentryAndroidOptions, "trace.json", j6.class);
        if (cVar.i() == null && j6Var != null) {
            cVar.w(j6Var);
        }
        String str6 = (String) b(sentryAndroidOptions, "replay.json", String.class);
        String cacheDirPath = sentryAndroidOptions.getCacheDirPath();
        if (cacheDirPath == null) {
            str = "anr_background";
            g0Var2 = g0Var;
        } else {
            g0Var2 = g0Var;
            str = "anr_background";
            if (!new File(cacheDirPath, a3.e.l("replay_", str6)).exists()) {
                String str7 = (String) io.sentry.cache.a.c(sentryAndroidOptions, ".options-cache", "replay-error-sample-rate.json", String.class);
                if (str7 != null) {
                    try {
                        if (Double.parseDouble(str7) < io.sentry.util.j.a().c()) {
                            sentryAndroidOptions.getLogger().q(SentryLevel.DEBUG, "Not capturing replay for ANR %s due to not being sampled.", sentryEvent.f12670d);
                        } else {
                            File[] fileArrListFiles = new File(cacheDirPath).listFiles();
                            if (fileArrListFiles != null) {
                                int length = fileArrListFiles.length;
                                long jLastModified = Long.MIN_VALUE;
                                String strSubstring = null;
                                int i7 = 0;
                                while (i7 < length) {
                                    File file = fileArrListFiles[i7];
                                    if (file.isDirectory()) {
                                        fileArr = fileArrListFiles;
                                        if (file.getName().startsWith("replay_") && file.lastModified() > jLastModified && file.lastModified() <= ((Date) sentryEvent.M.clone()).getTime()) {
                                            jLastModified = file.lastModified();
                                            strSubstring = file.getName().substring(7);
                                        }
                                    } else {
                                        fileArr = fileArrListFiles;
                                    }
                                    i7++;
                                    fileArrListFiles = fileArr;
                                }
                                str6 = strSubstring;
                            } else {
                                str6 = null;
                            }
                            if (str6 != null) {
                                Charset charset = io.sentry.cache.g.f12541c;
                                io.sentry.cache.a.d(sentryAndroidOptions, str6, ".scope-cache", "replay.json");
                                cVar.k(str6, "replay_id");
                            }
                        }
                    } catch (Throwable th3) {
                        sentryAndroidOptions.getLogger().g(SentryLevel.ERROR, "Error parsing replay sample rate.", th3);
                    }
                }
            } else if (str6 != null) {
                Charset charset2 = io.sentry.cache.g.f12541c;
                io.sentry.cache.a.d(sentryAndroidOptions, str6, ".scope-cache", "replay.json");
                cVar.k(str6, "replay_id");
            }
        }
        if (sentryEvent.f12675x == null) {
            sentryEvent.f12675x = (String) io.sentry.cache.a.c(sentryAndroidOptions, ".options-cache", "release.json", String.class);
        }
        if (sentryEvent.f12676y == null) {
            String environment = (String) io.sentry.cache.a.c(sentryAndroidOptions, ".options-cache", "environment.json", String.class);
            if (environment == null) {
                environment = sentryAndroidOptions.getEnvironment();
            }
            sentryEvent.f12676y = environment;
        }
        if (sentryEvent.I == null) {
            sentryEvent.I = (String) io.sentry.cache.a.c(sentryAndroidOptions, ".options-cache", "dist.json", String.class);
        }
        if (sentryEvent.I == null && (str2 = (String) io.sentry.cache.a.c(sentryAndroidOptions, ".options-cache", "release.json", String.class)) != null) {
            try {
                sentryEvent.I = str2.substring(str2.indexOf(43) + 1);
            } catch (Throwable unused) {
                sentryAndroidOptions.getLogger().q(SentryLevel.WARNING, "Failed to parse release from scope cache: %s", str2);
            }
        }
        io.sentry.protocol.d dVar = sentryEvent.K;
        if (dVar == null) {
            dVar = new io.sentry.protocol.d();
        }
        if (dVar.f12933e == null) {
            dVar.f12933e = new ArrayList(new ArrayList());
        }
        List list4 = dVar.f12933e;
        if (list4 != null) {
            String str8 = (String) io.sentry.cache.a.c(sentryAndroidOptions, ".options-cache", "proguard-uuid.json", String.class);
            if (str8 != null) {
                DebugImage debugImage = new DebugImage();
                debugImage.setType(DebugImage.PROGUARD);
                debugImage.setUuid(str8);
                list4.add(debugImage);
            }
            sentryEvent.K = dVar;
        } else {
            bVar = bVar;
        }
        if (sentryEvent.f12672i == null) {
            sentryEvent.f12672i = (io.sentry.protocol.t) io.sentry.cache.a.c(sentryAndroidOptions, ".options-cache", "sdk-version.json", io.sentry.protocol.t.class);
        }
        io.sentry.protocol.a aVarD = cVar.d();
        if (aVarD == null) {
            aVarD = new io.sentry.protocol.a();
        }
        io.sentry.protocol.a aVar = aVarD;
        aVar.f12911w = (String) l0.f12346c.a(context);
        PackageInfo packageInfoG = l0.g(context, k0Var);
        if (packageInfoG != null) {
            aVar.f12907d = packageInfoG.packageName;
        }
        String str9 = sentryEvent.f12675x;
        if (str9 == null) {
            str9 = (String) io.sentry.cache.a.c(sentryAndroidOptions, ".options-cache", "release.json", String.class);
        }
        if (str9 != null) {
            try {
                String strSubstring2 = str9.substring(str9.indexOf(64) + 1, str9.indexOf(43));
                String strSubstring3 = str9.substring(str9.indexOf(43) + 1);
                aVar.f12912x = strSubstring2;
                aVar.f12913y = strSubstring3;
            } catch (Throwable unused2) {
                sentryAndroidOptions.getLogger().q(SentryLevel.WARNING, "Failed to parse release from scope cache: %s", str9);
            }
        }
        try {
            a5.i0 i0Var = p0.c(context, sentryAndroidOptions).f12364f;
            if (i0Var != null) {
                aVar.I = Boolean.valueOf(i0Var.f214e);
                String[] strArr = (String[]) i0Var.f215i;
                if (strArr != null) {
                    aVar.J = Arrays.asList(strArr);
                }
            }
        } catch (Throwable th4) {
            sentryAndroidOptions.getLogger().g(SentryLevel.ERROR, "Error getting split apks info.", th4);
        }
        cVar.n(aVar);
        Map map3 = (Map) io.sentry.cache.a.c(sentryAndroidOptions, ".options-cache", "tags.json", Map.class);
        if (map3 != null) {
            if (sentryEvent.f12674w == null) {
                sentryEvent.f12674w = new HashMap(new HashMap(map3));
            } else {
                for (Map.Entry entry4 : map3.entrySet()) {
                    if (!sentryEvent.f12674w.containsKey(entry4.getKey())) {
                        sentryEvent.c((String) entry4.getKey(), (String) entry4.getValue());
                    }
                }
            }
        }
        io.sentry.protocol.h0 h0Var2 = sentryEvent.F;
        if (h0Var2 == null) {
            h0Var2 = new io.sentry.protocol.h0();
            sentryEvent.F = h0Var2;
        }
        if (h0Var2.f12957e == null) {
            h0Var2.f12957e = a();
        }
        if (h0Var2.f12959v == null && sentryAndroidOptions.isSendDefaultPii()) {
            h0Var2.f12959v = "{{auto}}";
        }
        try {
            a3.n nVar = p0.c(context, sentryAndroidOptions).f12363e;
            if (nVar != null) {
                HashMap map4 = new HashMap();
                map4.put("isSideLoaded", String.valueOf(nVar.f106b));
                String str10 = nVar.f105a;
                if (str10 != null) {
                    map4.put("installerStore", str10);
                }
                for (Map.Entry entry5 : map4.entrySet()) {
                    sentryEvent.c((String) entry5.getKey(), (String) entry5.getValue());
                }
            }
        } catch (Throwable th5) {
            sentryAndroidOptions.getLogger().g(SentryLevel.ERROR, "Error getting side loaded info.", th5);
        }
        if (g0Var2 != null) {
            io.sentry.hints.b bVar2 = bVar;
            boolean zEquals2 = bVar2 instanceof io.sentry.hints.a ? str.equals(((io.sentry.hints.a) bVar2).c()) : false;
            boolean z10 = !zEquals2;
            io.sentry.protocol.a aVarD2 = cVar.d();
            if (aVarD2 == null) {
                aVarD2 = new io.sentry.protocol.a();
                cVar.n(aVarD2);
            }
            if (aVarD2.H == null) {
                aVarD2.H = Boolean.valueOf(z10);
            }
            if (sentryEvent.T == null) {
                List listAsList = Arrays.asList("{{ default }}", zEquals2 ? "background-anr" : "foreground-anr");
                sentryEvent.T = listAsList != null ? new ArrayList(listAsList) : null;
            }
        }
        return sentryEvent;
    }

    @Override // io.sentry.b0
    public final io.sentry.protocol.d0 g(io.sentry.protocol.d0 d0Var, Hint hint) {
        return d0Var;
    }
}

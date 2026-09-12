package yi;

import a5.l0;
import af.w;
import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.Log;
import e4.l;
import gs.o;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import mi.m;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements d {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Object f23356m = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ji.f f23357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final aj.c f23358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f23359c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j f23360d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m f23361e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h f23362f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f23363g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ExecutorService f23364h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ni.h f23365i;
    public String j;
    public final HashSet k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f23366l;

    static {
        new AtomicInteger(1);
    }

    public c(ji.f fVar, xi.a aVar, ExecutorService executorService, ni.h hVar) {
        fVar.a();
        aj.c cVar = new aj.c(fVar.f13890a, aVar);
        l lVar = new l(fVar);
        if (k8.a.f14311e == null) {
            k8.a.f14311e = new k8.a();
        }
        k8.a aVar2 = k8.a.f14311e;
        if (j.f23374d == null) {
            j.f23374d = new j(aVar2);
        }
        j jVar = j.f23374d;
        m mVar = new m(new mi.d(2, fVar));
        h hVar2 = new h();
        this.f23363g = new Object();
        this.k = new HashSet();
        this.f23366l = new ArrayList();
        this.f23357a = fVar;
        this.f23358b = cVar;
        this.f23359c = lVar;
        this.f23360d = jVar;
        this.f23361e = mVar;
        this.f23362f = hVar2;
        this.f23364h = executorService;
        this.f23365i = hVar;
    }

    public final void a() {
        zi.a aVarT;
        synchronized (f23356m) {
            try {
                ji.f fVar = this.f23357a;
                fVar.a();
                io.sentry.internal.debugmeta.c cVarR0 = io.sentry.internal.debugmeta.c.r0(fVar.f13890a);
                try {
                    aVarT = this.f23359c.t();
                    int i7 = aVarT.f24008b;
                    boolean z5 = true;
                    if (i7 != 2 && i7 != 1) {
                        z5 = false;
                    }
                    if (z5) {
                        String strF = f(aVarT);
                        l lVar = this.f23359c;
                        o oVarA = aVarT.a();
                        oVarA.f10247c = strF;
                        oVarA.f10246b = 3;
                        aVarT = oVarA.j();
                        lVar.r(aVarT);
                    }
                    if (cVarR0 != null) {
                        cVarR0.E0();
                    }
                } catch (Throwable th2) {
                    if (cVarR0 != null) {
                        cVarR0.E0();
                    }
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        i(aVarT);
        this.f23365i.execute(new b(this, 1));
    }

    public final zi.a b(zi.a aVar) throws e {
        HttpURLConnection httpURLConnectionC;
        aj.b bVarF;
        aj.c cVar = this.f23358b;
        ji.f fVar = this.f23357a;
        fVar.a();
        String str = fVar.f13892c.f13904a;
        String str2 = aVar.f24007a;
        ji.f fVar2 = this.f23357a;
        fVar2.a();
        String str3 = fVar2.f13892c.f13910g;
        String str4 = aVar.f24010d;
        aj.d dVar = cVar.f624c;
        if (!dVar.a()) {
            throw new e("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL urlA = aj.c.a("projects/" + str3 + "/installations/" + str2 + "/authTokens:generate");
        int i7 = 0;
        while (true) {
            if (i7 > 1) {
                throw new e("Firebase Installations Service is unavailable. Please try again later.");
            }
            TrafficStats.setThreadStatsTag(32771);
            httpURLConnectionC = cVar.c(urlA, str);
            try {
                try {
                    httpURLConnectionC.setRequestMethod("POST");
                    httpURLConnectionC.addRequestProperty("Authorization", "FIS_v2 " + str4);
                    httpURLConnectionC.setDoOutput(true);
                    aj.c.h(httpURLConnectionC);
                    int responseCode = httpURLConnectionC.getResponseCode();
                    dVar.b(responseCode);
                    if (responseCode >= 200 && responseCode < 300) {
                        bVarF = aj.c.f(httpURLConnectionC);
                        break;
                    }
                    aj.c.b(httpURLConnectionC, null, str, str3);
                    if (responseCode == 401 || responseCode == 404) {
                        a1.d dVarA = aj.b.a();
                        dVarA.f17e = 3;
                        bVarF = dVarA.a();
                        break;
                    }
                    if (responseCode == 429) {
                        throw new e("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                        a1.d dVarA2 = aj.b.a();
                        dVarA2.f17e = 2;
                        bVarF = dVarA2.a();
                        break;
                    }
                    httpURLConnectionC.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    i7++;
                } catch (Throwable th2) {
                    httpURLConnectionC.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th2;
                }
            } catch (IOException | AssertionError unused) {
            }
        }
        httpURLConnectionC.disconnect();
        TrafficStats.clearThreadStatsTag();
        int iB = f0.e.b(bVarF.f619c);
        if (iB != 0) {
            if (iB == 1) {
                o oVarA = aVar.a();
                oVarA.f10252h = "BAD CONFIG";
                oVarA.f10246b = 5;
                return oVarA.j();
            }
            if (iB != 2) {
                throw new e("Firebase Installations Service is unavailable. Please try again later.");
            }
            synchronized (this) {
                this.j = null;
            }
            o oVarA2 = aVar.a();
            oVarA2.f10246b = 2;
            return oVarA2.j();
        }
        String str5 = bVarF.f617a;
        long j = bVarF.f618b;
        j jVar = this.f23360d;
        jVar.getClass();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        jVar.f23375a.getClass();
        long seconds = timeUnit.toSeconds(System.currentTimeMillis());
        o oVarA3 = aVar.a();
        oVarA3.f10248d = str5;
        oVarA3.f10250f = Long.valueOf(j);
        oVarA3.f10251g = Long.valueOf(seconds);
        return oVarA3.j();
    }

    public final ig.l c() {
        String str;
        e();
        synchronized (this) {
            str = this.j;
        }
        if (str != null) {
            return l0.v(str);
        }
        ig.g gVar = new ig.g();
        g gVar2 = new g(gVar);
        synchronized (this.f23363g) {
            this.f23366l.add(gVar2);
        }
        ig.l lVar = gVar.f11763a;
        this.f23364h.execute(new b(this, 0));
        return lVar;
    }

    public final ig.l d() {
        e();
        ig.g gVar = new ig.g();
        f fVar = new f(this.f23360d, gVar);
        synchronized (this.f23363g) {
            this.f23366l.add(fVar);
        }
        ig.l lVar = gVar.f11763a;
        this.f23364h.execute(new b(this, 2));
        return lVar;
    }

    public final void e() {
        ji.f fVar = this.f23357a;
        fVar.a();
        w.e(fVar.f13892c.f13905b, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        fVar.a();
        w.e(fVar.f13892c.f13910g, "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        fVar.a();
        w.e(fVar.f13892c.f13904a, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        fVar.a();
        String str = fVar.f13892c.f13905b;
        Pattern pattern = j.f23373c;
        w.a("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", str.contains(":"));
        fVar.a();
        w.a("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.", j.f23373c.matcher(fVar.f13892c.f13904a).matches());
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003d A[Catch: all -> 0x003f, DONT_GENERATE, TRY_ENTER, TryCatch #1 {all -> 0x003f, blocks: (B:10:0x002e, B:11:0x0030, B:15:0x003d, B:19:0x0041, B:20:0x0045, B:28:0x0059, B:12:0x0031, B:13:0x003a), top: B:35:0x002e, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x0041 A[Catch: all -> 0x003f, TryCatch #1 {all -> 0x003f, blocks: (B:10:0x002e, B:11:0x0030, B:15:0x003d, B:19:0x0041, B:20:0x0045, B:28:0x0059, B:12:0x0031, B:13:0x003a), top: B:35:0x002e, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x004c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0056 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:33:0x0031 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x002e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:6:0x001e  */
    /* JADX WARN: Code duplicated, block: B:8:0x0023  */
    public final String f(zi.a aVar) {
        zi.b bVar;
        String string;
        ji.f fVar = this.f23357a;
        fVar.a();
        if (!fVar.f13891b.equals("CHIME_ANDROID_SDK")) {
            ji.f fVar2 = this.f23357a;
            fVar2.a();
            if ("[DEFAULT]".equals(fVar2.f13891b)) {
                if (aVar.f24008b == 1) {
                    bVar = (zi.b) this.f23361e.get();
                    synchronized (bVar.f24015a) {
                        try {
                            synchronized (bVar.f24015a) {
                                string = bVar.f24015a.getString("|S|id", null);
                            }
                            if (string != null) {
                                string = bVar.a();
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    if (TextUtils.isEmpty(string)) {
                        return string;
                    }
                    this.f23362f.getClass();
                    return h.a();
                }
            }
        } else if (aVar.f24008b == 1) {
            bVar = (zi.b) this.f23361e.get();
            synchronized (bVar.f24015a) {
                synchronized (bVar.f24015a) {
                    string = bVar.f24015a.getString("|S|id", null);
                    if (string != null) {
                        string = bVar.a();
                    }
                    if (TextUtils.isEmpty(string)) {
                        return string;
                    }
                    this.f23362f.getClass();
                    return h.a();
                }
            }
        }
        this.f23362f.getClass();
        return h.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [aj.c] */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [aj.a] */
    public final zi.a g(zi.a aVar) throws e {
        String str = aVar.f24007a;
        String string = null;
        if (str != null && str.length() == 11) {
            zi.b bVar = (zi.b) this.f23361e.get();
            synchronized (bVar.f24015a) {
                try {
                    String[] strArr = zi.b.f24014c;
                    int i7 = 0;
                    while (true) {
                        if (i7 >= 4) {
                            break;
                        }
                        String str2 = strArr[i7];
                        String string2 = bVar.f24015a.getString("|T|" + bVar.f24016b + "|" + str2, null);
                        if (string2 != null && !string2.isEmpty()) {
                            if (string2.startsWith("{")) {
                                try {
                                    string = new JSONObject(string2).getString("token");
                                } catch (JSONException unused) {
                                }
                            } else {
                                string = string2;
                            }
                            break;
                        }
                        i7++;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        aj.c cVar = this.f23358b;
        ji.f fVar = this.f23357a;
        fVar.a();
        String str3 = fVar.f13892c.f13904a;
        String str4 = aVar.f24007a;
        ji.f fVar2 = this.f23357a;
        fVar2.a();
        String str5 = fVar2.f13892c.f13910g;
        ji.f fVar3 = this.f23357a;
        fVar3.a();
        String str6 = fVar3.f13892c.f13905b;
        aj.d dVar = cVar.f624c;
        if (!dVar.a()) {
            throw new e("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL urlA = aj.c.a("projects/" + str5 + "/installations");
        int i10 = 0;
        aj.a aVar2 = cVar;
        while (i10 <= 1) {
            TrafficStats.setThreadStatsTag(32769);
            HttpURLConnection httpURLConnectionC = aVar2.c(urlA, str3);
            try {
                try {
                    httpURLConnectionC.setRequestMethod("POST");
                    httpURLConnectionC.setDoOutput(true);
                    if (string != null) {
                        httpURLConnectionC.addRequestProperty("x-goog-fis-android-iid-migration-auth", string);
                    }
                    aj.c.g(httpURLConnectionC, str4, str6);
                    int responseCode = httpURLConnectionC.getResponseCode();
                    dVar.b(responseCode);
                    if (responseCode >= 200 && responseCode < 300) {
                        aj.a aVarE = aj.c.e(httpURLConnectionC);
                        httpURLConnectionC.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        aVar2 = aVarE;
                    } else {
                        try {
                            aj.c.b(httpURLConnectionC, str6, str3, str5);
                            if (responseCode == 429) {
                                throw new e("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                            }
                            if (responseCode < 500 || responseCode >= 600) {
                                Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                                aj.a aVar3 = new aj.a(null, null, null, null, 2);
                                httpURLConnectionC.disconnect();
                                TrafficStats.clearThreadStatsTag();
                                aVar2 = aVar3;
                            } else {
                                httpURLConnectionC.disconnect();
                                TrafficStats.clearThreadStatsTag();
                                i10++;
                                aVar2 = aVar2;
                            }
                        } catch (IOException | AssertionError unused2) {
                            httpURLConnectionC.disconnect();
                            TrafficStats.clearThreadStatsTag();
                        }
                        httpURLConnectionC.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        i10++;
                        aVar2 = aVar2;
                    }
                    int iB = f0.e.b(aVar2.f616e);
                    if (iB != 0) {
                        if (iB != 1) {
                            throw new e("Firebase Installations Service is unavailable. Please try again later.");
                        }
                        o oVarA = aVar.a();
                        oVarA.f10252h = "BAD CONFIG";
                        oVarA.f10246b = 5;
                        return oVarA.j();
                    }
                    String str7 = aVar2.f613b;
                    String str8 = aVar2.f614c;
                    j jVar = this.f23360d;
                    jVar.getClass();
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    jVar.f23375a.getClass();
                    long seconds = timeUnit.toSeconds(System.currentTimeMillis());
                    aj.b bVar2 = aVar2.f615d;
                    String str9 = bVar2.f617a;
                    long j = bVar2.f618b;
                    o oVarA2 = aVar.a();
                    oVarA2.f10247c = str7;
                    oVarA2.f10246b = 4;
                    oVarA2.f10248d = str9;
                    oVarA2.f10249e = str8;
                    oVarA2.f10250f = Long.valueOf(j);
                    oVarA2.f10251g = Long.valueOf(seconds);
                    return oVarA2.j();
                } catch (IOException | AssertionError unused3) {
                }
            } catch (Throwable th3) {
                httpURLConnectionC.disconnect();
                TrafficStats.clearThreadStatsTag();
                throw th3;
            }
        }
        throw new e("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final void h(Exception exc) {
        synchronized (this.f23363g) {
            try {
                Iterator it = this.f23366l.iterator();
                while (it.hasNext()) {
                    if (((i) it.next()).a(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void i(zi.a aVar) {
        synchronized (this.f23363g) {
            try {
                Iterator it = this.f23366l.iterator();
                while (it.hasNext()) {
                    if (((i) it.next()).b(aVar)) {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}

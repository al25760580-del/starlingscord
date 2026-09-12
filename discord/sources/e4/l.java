package e4;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Handler;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import android.util.SparseArray;
import androidx.work.impl.WorkDatabase_Impl;
import c5.t;
import ci.b0;
import com.discord.R;
import com.facebook.common.references.CloseableReference;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.otaliastudios.zoom.ZoomEngine;
import he.m0;
import io.sentry.ILogger;
import io.sentry.SentryLevel;
import j$.util.DesugarTimeZone;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import je.e0;
import je.v;
import je.w;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;
import kotlin.text.x;
import kotlinx.serialization.KSerializer;
import okhttp3.Call;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.Response;
import or.o1;
import org.json.JSONException;
import org.json.JSONObject;
import sh.g1;
import sh.h1;
import sh.s;
import sh.u1;
import zc.a0;
import zc.d0;
import zc.z;

/* JADX INFO: loaded from: classes.dex */
public final class l implements vd.f, OnCompleteListener, r8.c, io.sentry.internal.debugmeta.a, kb.b, m0, np.n, o1, cs.h, th.g, ci.p, z {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7988d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f7989e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f7990i;

    public /* synthetic */ l(int i7, Object obj, Object obj2) {
        this.f7988d = i7;
        this.f7989e = obj;
        this.f7990i = obj2;
    }

    @Override // io.sentry.internal.debugmeta.a
    public List U() {
        ILogger iLogger = (ILogger) this.f7990i;
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(((Context) this.f7989e).getAssets().open("sentry-debug-meta.properties"));
            try {
                Properties properties = new Properties();
                properties.load(bufferedInputStream);
                List listSingletonList = Collections.singletonList(properties);
                bufferedInputStream.close();
                return listSingletonList;
            } catch (Throwable th2) {
                try {
                    bufferedInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (FileNotFoundException unused) {
            iLogger.q(SentryLevel.INFO, "%s file was not found.", "sentry-debug-meta.properties");
            return null;
        } catch (IOException e10) {
            iLogger.g(SentryLevel.ERROR, "Error getting Proguard UUIDs.", e10);
            return null;
        } catch (RuntimeException e11) {
            iLogger.e(SentryLevel.ERROR, e11, "%s file is malformed.", "sentry-debug-meta.properties");
            return null;
        }
    }

    @Override // th.g
    public Object a() {
        switch (this.f7988d) {
            case 18:
                return new s(((u1) ((pf.b) this.f7989e).f18027e).f20202a, (h1) ((th.f) this.f7990i).a());
            case 19:
                th.f fVar = (th.f) this.f7990i;
                return new g1((s) ((th.f) this.f7989e).a(), (h1) fVar.a());
            default:
                return new com.google.android.play.core.integrity.c(((ci.q) this.f7989e).f3721d, (b0) ((ci.o) this.f7990i).a(), new pa.s());
        }
    }

    @Override // zc.z
    public void c(w wVar) {
        zc.b0 b0Var = (zc.b0) this.f7990i;
        SparseArray sparseArray = b0Var.f23663f;
        v vVar = (v) this.f7989e;
        if (wVar.u() == 0 && (wVar.u() & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0) {
            wVar.G(6);
            int iA = wVar.a() / 4;
            for (int i7 = 0; i7 < iA; i7++) {
                wVar.e(vVar.f13853b, 0, 4);
                vVar.p(0);
                int i10 = vVar.i(16);
                vVar.s(3);
                if (i10 == 0) {
                    vVar.s(13);
                } else {
                    int i11 = vVar.i(13);
                    if (sparseArray.get(i11) == null) {
                        sparseArray.put(i11, new a0(new hp.e(b0Var, i11)));
                        b0Var.f23667l++;
                    }
                }
            }
            if (b0Var.f23658a != 2) {
                sparseArray.remove(0);
            }
        }
    }

    @Override // or.o1
    public KSerializer d(KClass key) {
        Object objPutIfAbsent;
        Intrinsics.checkNotNullParameter(key, "key");
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f7990i;
        Class clsB = gn.h.B(key);
        Object kVar = concurrentHashMap.get(clsB);
        if (kVar == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(clsB, (kVar = new or.k((KSerializer) ((Function1) this.f7989e).invoke(key))))) != null) {
            kVar = objPutIfAbsent;
        }
        return ((or.k) kVar).f17565a;
    }

    @Override // np.n
    public np.l e(up.b classId, ap.a source) {
        Intrinsics.checkNotNullParameter(classId, "classId");
        Intrinsics.checkNotNullParameter(source, "source");
        return ((af.c) this.f7989e).H(classId, source, (ArrayList) this.f7990i);
    }

    @Override // vd.f
    public int f(long j) {
        long[] jArr = (long[]) this.f7990i;
        int iB = e0.b(jArr, j, false);
        if (iB < jArr.length) {
            return iB;
        }
        return -1;
    }

    public boolean g(j id2) {
        boolean zContainsKey;
        Intrinsics.checkNotNullParameter(id2, "id");
        synchronized (this.f7989e) {
            zContainsKey = ((LinkedHashMap) this.f7990i).containsKey(id2);
        }
        return zContainsKey;
    }

    @Override // vd.f
    public long h(int i7) {
        long[] jArr = (long[]) this.f7990i;
        je.b.g(i7 >= 0);
        je.b.g(i7 < jArr.length);
        return jArr[i7];
    }

    @Override // kb.b
    public boolean i(UnsatisfiedLinkError unsatisfiedLinkError, com.facebook.soloader.b0[] b0VarArr) {
        String str = ((Context) this.f7989e).getApplicationInfo().sourceDir;
        if (!new File(str).exists()) {
            StringBuilder sbN = com.discord.chat.presentation.list.a.n("Base apk does not exist: ", str, ". ");
            ((a5.b0) this.f7990i).D(sbN);
            throw new com.facebook.soloader.v(sbN.toString(), unsatisfiedLinkError);
        }
        Log.w("soloader.recovery.CheckBaseApkExists", "Base apk exists: " + str);
        return false;
    }

    @Override // he.m0
    public Object j(Uri uri, he.n nVar) {
        ld.a aVar = (ld.a) ((m0) this.f7989e).j(uri, nVar);
        List list = (List) this.f7990i;
        return (list == null || list.isEmpty()) ? aVar : (ld.a) aVar.a(list);
    }

    public void k(DecoderCounters decoderCounters) {
        synchronized (decoderCounters) {
        }
        Handler handler = (Handler) this.f7989e;
        if (handler != null) {
            handler.post(new ic.q(this, decoderCounters, 1));
        }
    }

    @Override // vd.f
    public List l(long j) {
        vd.c cVar;
        int iE = e0.e((long[]) this.f7990i, j, false);
        return (iE == -1 || (cVar = ((vd.c[]) this.f7989e)[iE]) == vd.c.O) ? Collections.EMPTY_LIST : Collections.singletonList(cVar);
    }

    public File m() {
        if (((File) this.f7989e) == null) {
            synchronized (this) {
                try {
                    if (((File) this.f7989e) == null) {
                        ji.f fVar = (ji.f) this.f7990i;
                        fVar.a();
                        this.f7989e = new File(fVar.f13890a.getFilesDir(), "PersistedInstallation." + ((ji.f) this.f7990i).c() + ".json");
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return (File) this.f7989e;
    }

    public pc.k n(Object... objArr) {
        Constructor constructorD;
        synchronized (((AtomicBoolean) this.f7990i)) {
            if (!((AtomicBoolean) this.f7990i).get()) {
                try {
                    constructorD = ((mc.q) this.f7989e).d();
                } catch (ClassNotFoundException unused) {
                    ((AtomicBoolean) this.f7990i).set(true);
                    constructorD = null;
                } catch (Exception e10) {
                    throw new RuntimeException("Error instantiating extension", e10);
                }
            }
            constructorD = null;
        }
        if (constructorD == null) {
            return null;
        }
        try {
            return (pc.k) constructorD.newInstance(objArr);
        } catch (Exception e11) {
            throw new IllegalStateException("Unexpected error creating extractor", e11);
        }
    }

    @Override // vd.f
    public int o() {
        return ((long[]) this.f7990i).length;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        switch (this.f7988d) {
            case 3:
                cg.h hVar = (cg.h) this.f7989e;
                ig.g gVar = (ig.g) this.f7990i;
                synchronized (hVar.f3667f) {
                    hVar.f3666e.remove(gVar);
                    break;
                }
                return;
            default:
                th.q qVar = (th.q) this.f7989e;
                ig.g gVar2 = (ig.g) this.f7990i;
                synchronized (qVar.f20793f) {
                    qVar.f20792e.remove(gVar2);
                    break;
                }
                return;
        }
    }

    @Override // cs.h
    public void onFailure(Call call, IOException e10) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(e10, "e");
        ((qs.g) this.f7989e).f(e10, null);
    }

    /* JADX WARN: Code duplicated, block: B:70:0x0137  */
    /* JADX WARN: Code duplicated, block: B:91:0x013c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // cs.h
    public void onResponse(Call call, Response response) {
        qs.g gVar;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
        gc.k kVar = response.J;
        boolean z5 = true;
        try {
            ((qs.g) this.f7989e).e(response, kVar);
            Intrinsics.checkNotNull(kVar);
            gs.k kVarF = kVar.f();
            Headers responseHeaders = response.f17384x;
            Intrinsics.checkNotNullParameter(responseHeaders, "responseHeaders");
            int size = responseHeaders.size();
            int i7 = 0;
            boolean z6 = false;
            Integer intOrNull = null;
            boolean z7 = false;
            Integer intOrNull2 = null;
            boolean z10 = false;
            boolean z11 = false;
            while (i7 < size) {
                int i10 = i7 + 1;
                if (x.i(responseHeaders.b(i7), "Sec-WebSocket-Extensions", z5)) {
                    String strH = responseHeaders.h(i7);
                    int i11 = 0;
                    while (i11 < strH.length()) {
                        boolean z12 = z5;
                        responseHeaders = responseHeaders;
                        int iG = ds.b.g(',', i11, 0, 4, strH);
                        int iE = ds.b.e(';', i11, iG, strH);
                        String strY = ds.b.y(i11, iE, strH);
                        int i12 = iE + 1;
                        if (x.i(strY, "permessage-deflate", z12)) {
                            if (z6) {
                                z11 = true;
                            }
                            i11 = i12;
                            while (i11 < iG) {
                                int iE2 = ds.b.e(';', i11, iG, strH);
                                int iE3 = ds.b.e('=', i11, iE2, strH);
                                String strY2 = ds.b.y(i11, iE3, strH);
                                String strP = iE3 < iE2 ? StringsKt.P(ds.b.y(iE3 + 1, iE2, strH)) : null;
                                i11 = iE2 + 1;
                                strH = strH;
                                if (x.i(strY2, "client_max_window_bits", true)) {
                                    if (intOrNull != null) {
                                        z11 = true;
                                    }
                                    intOrNull = strP == null ? null : StringsKt.toIntOrNull(strP);
                                    if (intOrNull == null) {
                                        z11 = true;
                                    }
                                } else if (x.i(strY2, "client_no_context_takeover", true)) {
                                    z11 = strP != null ? true : z7 ? true : z11;
                                    z7 = true;
                                } else {
                                    if (x.i(strY2, "server_max_window_bits", true)) {
                                        if (intOrNull2 != null) {
                                            z11 = true;
                                        }
                                        intOrNull2 = strP == null ? null : StringsKt.toIntOrNull(strP);
                                        if (intOrNull2 == null) {
                                        }
                                    } else if (x.i(strY2, "server_no_context_takeover", true)) {
                                        if (z10) {
                                            z11 = true;
                                        }
                                        if (strP != null) {
                                            z11 = true;
                                        }
                                        z10 = true;
                                    }
                                    z11 = true;
                                }
                            }
                            z5 = true;
                            z6 = true;
                        } else {
                            i11 = i12;
                            z5 = true;
                            z11 = true;
                        }
                    }
                }
                i7 = i10;
            }
            ((qs.g) this.f7989e).f19086d = new qs.h(z6, intOrNull, z7, intOrNull2, z10, z11);
            if (z11 || intOrNull != null) {
                gVar = (qs.g) this.f7989e;
                synchronized (gVar) {
                    gVar.f19095o.clear();
                    gVar.c(1010, "unexpected Sec-WebSocket-Extensions in response header");
                }
            } else if (intOrNull2 != null) {
                IntRange intRange = new IntRange(8, 15, 1);
                int iIntValue = intOrNull2.intValue();
                if (8 > iIntValue || iIntValue > intRange.f14689e) {
                    gVar = (qs.g) this.f7989e;
                    synchronized (gVar) {
                        gVar.f19095o.clear();
                        gVar.c(1010, "unexpected Sec-WebSocket-Extensions in response header");
                    }
                }
            }
            try {
                ((qs.g) this.f7989e).g(ds.b.f7821g + " WebSocket " + ((Request) this.f7990i).f17368a.f(), kVarF);
                qs.g gVar2 = (qs.g) this.f7989e;
                gVar2.f19083a.onOpen(gVar2, response);
                ((qs.g) this.f7989e).h();
            } catch (Exception e10) {
                ((qs.g) this.f7989e).f(e10, null);
            }
        } catch (IOException e11) {
            if (kVar != null) {
                kVar.c(true, true, null);
            }
            ((qs.g) this.f7989e).f(e11, response);
            ds.b.c(response);
        }
    }

    public synchronized Map p() {
        try {
            if (((Map) this.f7990i) == null) {
                this.f7990i = Collections.unmodifiableMap(new HashMap((HashMap) this.f7989e));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (Map) this.f7990i;
    }

    public String q(String str) {
        String str2 = (String) this.f7990i;
        Resources resources = (Resources) this.f7989e;
        int identifier = resources.getIdentifier(str, "string", str2);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    public void r(zi.a aVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", aVar.f24007a);
            jSONObject.put("Status", f0.e.b(aVar.f24008b));
            jSONObject.put("AuthToken", aVar.f24009c);
            jSONObject.put("RefreshToken", aVar.f24010d);
            jSONObject.put("TokenCreationEpochInSecs", aVar.f24012f);
            jSONObject.put("ExpiresInSecs", aVar.f24011e);
            jSONObject.put("FisError", aVar.f24013g);
            ji.f fVar = (ji.f) this.f7990i;
            fVar.a();
            File fileCreateTempFile = File.createTempFile("PersistedInstallation", "tmp", fVar.f13890a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (fileCreateTempFile.renameTo(m())) {
            } else {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x003d  */
    @Override // r8.c
    public void release(Object obj) {
        boolean z5;
        ue.i iVar;
        ga.h hVar = (ga.h) this.f7990i;
        ga.d dVar = (ga.d) this.f7989e;
        synchronized (hVar) {
            synchronized (hVar) {
                z5 = false;
                n8.i.e(dVar.f9536c > 0);
                dVar.f9536c--;
            }
            CloseableReference.l(hVar.i(dVar));
            if (!z5) {
                dVar = null;
            }
            if (dVar != null && (iVar = dVar.f9538e) != null) {
                iVar.l(dVar.f9534a, true);
            }
            hVar.g();
            hVar.d();
        }
        synchronized (hVar) {
            try {
                if (!dVar.f9537d && dVar.f9536c == 0) {
                    hVar.f9539d.d(dVar.f9534a, dVar);
                    z5 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        CloseableReference.l(hVar.i(dVar));
        if (!z5) {
            dVar = null;
        }
        if (dVar != null) {
            iVar.l(dVar.f9534a, true);
        }
        hVar.g();
        hVar.d();
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01cd A[LOOP:0: B:3:0x0004->B:103:0x01cd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:121:0x020c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:126:0x0206 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:127:0x01e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ed A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:61:0x0104  */
    /* JADX WARN: Code duplicated, block: B:64:0x0110  */
    /* JADX WARN: Code duplicated, block: B:66:0x0116  */
    /* JADX WARN: Code duplicated, block: B:67:0x0119  */
    /* JADX WARN: Code duplicated, block: B:70:0x012a A[LOOP:1: B:68:0x0124->B:70:0x012a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:73:0x013b  */
    /* JADX WARN: Code duplicated, block: B:76:0x0142  */
    /* JADX WARN: Code duplicated, block: B:95:0x0178  */
    /* JADX WARN: Code duplicated, block: B:96:0x0186  */
    /* JADX WARN: Code duplicated, block: B:97:0x0194  */
    /* JADX WARN: Code duplicated, block: B:99:0x019a  */
    /* JADX WARN: Instruction removed from duplicated block: B:103:0x01cd, please report this as an issue */
    public c5.i s(c5.n nVar) throws t {
        r rVar;
        int i7;
        List<c5.g> listUnmodifiableList;
        TreeMap treeMap;
        String str;
        int timeoutMs;
        t tVar;
        int i10;
        Map map;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        while (true) {
            d5.a aVar = null;
            try {
                c5.b cacheEntry = nVar.getCacheEntry();
                if (cacheEntry == null) {
                    try {
                        map = Collections.EMPTY_MAP;
                    } catch (IOException e10) {
                        e = e10;
                        e = e;
                        if (e instanceof SocketTimeoutException) {
                            rVar = new r(5, "socket", new c5.a());
                        } else {
                            if (e instanceof MalformedURLException) {
                                throw new RuntimeException("Bad URL " + nVar.getUrl(), e);
                            }
                            if (aVar != null) {
                                i7 = aVar.f7596a;
                                c5.w.c("Unexpected response code %d for %s", Integer.valueOf(i7), nVar.getUrl());
                                if (0 != 0) {
                                    listUnmodifiableList = Collections.unmodifiableList(aVar.f7597b);
                                    SystemClock.elapsedRealtime();
                                    if (listUnmodifiableList != null) {
                                        if (listUnmodifiableList.isEmpty()) {
                                            Map map2 = Collections.EMPTY_MAP;
                                        } else {
                                            treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                                            for (c5.g gVar : listUnmodifiableList) {
                                                treeMap.put(gVar.f3489a, gVar.f3490b);
                                            }
                                        }
                                    }
                                    if (listUnmodifiableList != null) {
                                        Collections.unmodifiableList(listUnmodifiableList);
                                    }
                                    if (i7 != 401) {
                                        rVar = new r(5, "auth", new c5.a());
                                    } else {
                                        rVar = new r(5, "auth", new c5.a());
                                    }
                                } else {
                                    rVar = new r(5, "network", new c5.a());
                                }
                            } else {
                                if (!nVar.shouldRetryConnectionErrors()) {
                                    throw new c5.j(e);
                                }
                                rVar = new r(5, "connection", new c5.j());
                            }
                        }
                        str = (String) rVar.f8034e;
                        c5.s retryPolicy = nVar.getRetryPolicy();
                        timeoutMs = nVar.getTimeoutMs();
                        try {
                            tVar = (t) rVar.f8035i;
                            c5.e eVar = (c5.e) retryPolicy;
                            i10 = eVar.f3486c + 1;
                            eVar.f3486c = i10;
                            int i11 = eVar.f3485b;
                            eVar.f3485b = i11 + ((int) (i11 * 1.0f));
                            if (i10 > 1) {
                                throw tVar;
                            }
                            nVar.addMarker(str + "-retry [timeout=" + timeoutMs + "]");
                        } catch (t e11) {
                            nVar.addMarker(str + "-timeout-giveup [timeout=" + timeoutMs + "]");
                            throw e11;
                        }
                    }
                } else {
                    HashMap map3 = new HashMap();
                    String str2 = cacheEntry.f3470b;
                    if (str2 != null) {
                        map3.put("If-None-Match", str2);
                    }
                    long j = cacheEntry.f3472d;
                    if (j > 0) {
                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("GMT"));
                        map3.put("If-Modified-Since", simpleDateFormat.format(new Date(j)));
                    }
                    map = map3;
                }
                try {
                    d5.a aVarU = ((ga.k) this.f7989e).u(nVar, map);
                    try {
                        int i12 = aVarU.f7596a;
                        List listUnmodifiableList2 = Collections.unmodifiableList(aVarU.f7597b);
                        if (i12 == 304) {
                            SystemClock.elapsedRealtime();
                            return f.C(nVar, listUnmodifiableList2);
                        }
                        InputStream inputStream = (InputStream) aVarU.f7599d;
                        if (inputStream == null) {
                            inputStream = null;
                        }
                        byte[] bArrN = inputStream != null ? f.N(inputStream, aVarU.f7598c, (d5.a) this.f7990i) : new byte[0];
                        long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                        if (c5.w.f3524a || jElapsedRealtime2 > 3000) {
                            c5.w.b("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", nVar, Long.valueOf(jElapsedRealtime2), bArrN != null ? Integer.valueOf(bArrN.length) : "null", Integer.valueOf(i12), Integer.valueOf(((c5.e) nVar.getRetryPolicy()).f3486c));
                        }
                        if (i12 < 200 || i12 > 299) {
                            throw new IOException();
                        }
                        SystemClock.elapsedRealtime();
                        return new c5.i(bArrN, false, listUnmodifiableList2);
                    } catch (IOException e12) {
                        e = e12;
                        aVar = aVarU;
                        if (e instanceof SocketTimeoutException) {
                            rVar = new r(5, "socket", new c5.a());
                        } else {
                            if (e instanceof MalformedURLException) {
                                throw new RuntimeException("Bad URL " + nVar.getUrl(), e);
                            }
                            if (aVar != null) {
                                i7 = aVar.f7596a;
                                c5.w.c("Unexpected response code %d for %s", Integer.valueOf(i7), nVar.getUrl());
                                if (0 != 0) {
                                    listUnmodifiableList = Collections.unmodifiableList(aVar.f7597b);
                                    SystemClock.elapsedRealtime();
                                    if (listUnmodifiableList != null) {
                                        if (listUnmodifiableList.isEmpty()) {
                                            Map map4 = Collections.EMPTY_MAP;
                                        } else {
                                            treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                                            while (r5.hasNext()) {
                                                treeMap.put(gVar.f3489a, gVar.f3490b);
                                            }
                                        }
                                    }
                                    if (listUnmodifiableList != null) {
                                        Collections.unmodifiableList(listUnmodifiableList);
                                    }
                                    if (i7 != 401 || i7 == 403) {
                                        rVar = new r(5, "auth", new c5.a());
                                    } else {
                                        if (i7 >= 400 && i7 <= 499) {
                                            throw new c5.d();
                                        }
                                        if (i7 < 500 || i7 > 599 || !nVar.shouldRetryServerErrors()) {
                                            throw new c5.a();
                                        }
                                        rVar = new r(5, "server", new c5.a());
                                    }
                                } else {
                                    rVar = new r(5, "network", new c5.a());
                                }
                            } else {
                                if (!nVar.shouldRetryConnectionErrors()) {
                                    throw new c5.j(e);
                                }
                                rVar = new r(5, "connection", new c5.j());
                            }
                        }
                        str = (String) rVar.f8034e;
                        c5.s retryPolicy2 = nVar.getRetryPolicy();
                        timeoutMs = nVar.getTimeoutMs();
                        tVar = (t) rVar.f8035i;
                        c5.e eVar2 = (c5.e) retryPolicy2;
                        i10 = eVar2.f3486c + 1;
                        eVar2.f3486c = i10;
                        int i13 = eVar2.f3485b;
                        eVar2.f3485b = i13 + ((int) (i13 * 1.0f));
                        if (i10 > 1) {
                            throw tVar;
                        }
                        nVar.addMarker(str + "-retry [timeout=" + timeoutMs + "]");
                    }
                } catch (IOException e13) {
                    e = e13;
                    e = e;
                    if (e instanceof SocketTimeoutException) {
                        rVar = new r(5, "socket", new c5.a());
                    } else {
                        if (e instanceof MalformedURLException) {
                            throw new RuntimeException("Bad URL " + nVar.getUrl(), e);
                        }
                        if (aVar != null) {
                            i7 = aVar.f7596a;
                            c5.w.c("Unexpected response code %d for %s", Integer.valueOf(i7), nVar.getUrl());
                            if (0 != 0) {
                                listUnmodifiableList = Collections.unmodifiableList(aVar.f7597b);
                                SystemClock.elapsedRealtime();
                                if (listUnmodifiableList != null) {
                                    if (listUnmodifiableList.isEmpty()) {
                                        Map map5 = Collections.EMPTY_MAP;
                                    } else {
                                        treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                                        while (r5.hasNext()) {
                                            treeMap.put(gVar.f3489a, gVar.f3490b);
                                        }
                                    }
                                }
                                if (listUnmodifiableList != null) {
                                    Collections.unmodifiableList(listUnmodifiableList);
                                }
                                if (i7 != 401) {
                                    rVar = new r(5, "auth", new c5.a());
                                } else {
                                    rVar = new r(5, "auth", new c5.a());
                                }
                            } else {
                                rVar = new r(5, "network", new c5.a());
                            }
                        } else {
                            if (!nVar.shouldRetryConnectionErrors()) {
                                throw new c5.j(e);
                            }
                            rVar = new r(5, "connection", new c5.j());
                        }
                    }
                    str = (String) rVar.f8034e;
                    c5.s retryPolicy3 = nVar.getRetryPolicy();
                    timeoutMs = nVar.getTimeoutMs();
                    tVar = (t) rVar.f8035i;
                    c5.e eVar3 = (c5.e) retryPolicy3;
                    i10 = eVar3.f3486c + 1;
                    eVar3.f3486c = i10;
                    int i14 = eVar3.f3485b;
                    eVar3.f3485b = i14 + ((int) (i14 * 1.0f));
                    if (i10 > 1) {
                        throw tVar;
                    }
                    nVar.addMarker(str + "-retry [timeout=" + timeoutMs + "]");
                }
            } catch (IOException e14) {
                e = e14;
            }
            nVar.addMarker(str + "-retry [timeout=" + timeoutMs + "]");
        }
    }

    public zi.a t() {
        JSONObject jSONObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(m());
            while (true) {
                try {
                    int i7 = fileInputStream.read(bArr, 0, 16384);
                    if (i7 < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i7);
                } catch (Throwable th2) {
                    try {
                        fileInputStream.close();
                        throw th2;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                        throw th2;
                    }
                }
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        }
        String strOptString = jSONObject.optString("Fid", null);
        int iOptInt = jSONObject.optInt("Status", 0);
        String strOptString2 = jSONObject.optString("AuthToken", null);
        String strOptString3 = jSONObject.optString("RefreshToken", null);
        long jOptLong = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
        long jOptLong2 = jSONObject.optLong("ExpiresInSecs", 0L);
        String strOptString4 = jSONObject.optString("FisError", null);
        int i10 = f0.e.c(5)[iOptInt];
        if (i10 == 0) {
            throw new NullPointerException("Null registrationStatus");
        }
        String str = i10 == 0 ? " registrationStatus" : "";
        if (str.isEmpty()) {
            return new zi.a(strOptString, i10, strOptString2, strOptString3, jOptLong2, jOptLong, strOptString4);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public List u(String workSpecId) {
        List listI0;
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        synchronized (this.f7989e) {
            try {
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.f7990i;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    if (Intrinsics.areEqual(((j) entry.getKey()).f7984a, workSpecId)) {
                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                    }
                }
                Iterator it = linkedHashMap2.keySet().iterator();
                while (it.hasNext()) {
                    ((LinkedHashMap) this.f7990i).remove((j) it.next());
                }
                listI0 = CollectionsKt.i0(linkedHashMap2.values());
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return listI0;
    }

    public w3.j v(j id2) {
        w3.j jVar;
        Intrinsics.checkNotNullParameter(id2, "id");
        synchronized (this.f7989e) {
            jVar = (w3.j) ((LinkedHashMap) this.f7990i).remove(id2);
        }
        return jVar;
    }

    public w3.j w(j id2) {
        w3.j jVar;
        Intrinsics.checkNotNullParameter(id2, "id");
        synchronized (this.f7989e) {
            try {
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.f7990i;
                Object jVar2 = linkedHashMap.get(id2);
                if (jVar2 == null) {
                    jVar2 = new w3.j(id2);
                    linkedHashMap.put(id2, jVar2);
                }
                jVar = (w3.j) jVar2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return jVar;
    }

    public l(ci.q qVar, ci.o oVar, i8.c cVar) {
        this.f7988d = 23;
        this.f7989e = qVar;
        this.f7990i = oVar;
    }

    public l(Context context) {
        this.f7988d = 1;
        af.w.g(context);
        Resources resources = context.getResources();
        this.f7989e = resources;
        this.f7990i = resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue);
    }

    public l(IBinder iBinder) throws RemoteException {
        this.f7988d = 22;
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (Objects.equals(interfaceDescriptor, "android.os.IMessenger")) {
            this.f7989e = new Messenger(iBinder);
            this.f7990i = null;
        } else if (Objects.equals(interfaceDescriptor, "com.google.android.gms.iid.IMessengerCompat")) {
            this.f7990i = new we.f(iBinder);
            this.f7989e = null;
        } else {
            Log.w("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
            throw new RemoteException();
        }
    }

    public l(String str, zs.a aVar, ye.d dVar) {
        this.f7988d = 24;
        this.f7990i = str;
        this.f7989e = aVar;
    }

    public l(ZoomEngine engine) {
        this.f7988d = 5;
        Intrinsics.checkNotNullParameter(engine, "engine");
        this.f7989e = engine;
        this.f7990i = new ArrayList();
    }

    public l(String str, HashMap map) {
        this.f7988d = 9;
        com.facebook.imagepipeline.nativecode.c.H(str, "url is required");
        try {
            this.f7989e = URI.create(str).toURL();
            this.f7990i = map;
        } catch (MalformedURLException e10) {
            throw new IllegalArgumentException("Failed to compose the Sentry's server URL.", e10);
        }
    }

    public l(WorkDatabase_Impl database) {
        this.f7988d = 0;
        this.f7989e = database;
        Intrinsics.checkNotNullParameter(database, "database");
        this.f7990i = new b(database, false, 3);
    }

    public l(Context context, ILogger iLogger) {
        this.f7988d = 10;
        Context applicationContext = context.getApplicationContext();
        this.f7989e = applicationContext != null ? applicationContext : context;
        this.f7990i = iLogger;
    }

    public l(ga.k kVar) {
        this.f7988d = 4;
        d5.a aVar = new d5.a();
        this.f7989e = kVar;
        this.f7990i = aVar;
    }

    public l(ji.f fVar) {
        this.f7988d = 26;
        this.f7990i = fVar;
    }

    public l(int i7) {
        this.f7988d = i7;
        switch (i7) {
            case 13:
                this.f7989e = new Rect();
                this.f7990i = new Rect();
                break;
            case 21:
                this.f7989e = new Object();
                this.f7990i = new LinkedHashMap();
                break;
            default:
                this.f7989e = new HashMap();
                break;
        }
    }

    public l(Function1 compute) {
        this.f7988d = 15;
        Intrinsics.checkNotNullParameter(compute, "compute");
        this.f7989e = compute;
        this.f7990i = new ConcurrentHashMap();
    }

    public l(ga.h hVar, ga.d dVar) {
        this.f7988d = 6;
        this.f7990i = hVar;
        this.f7989e = dVar;
    }

    public l(zc.b0 b0Var) {
        this.f7988d = 25;
        this.f7990i = b0Var;
        this.f7989e = new v(new byte[4], 4);
    }

    public l(mc.q qVar) {
        this.f7988d = 16;
        this.f7989e = qVar;
        this.f7990i = new AtomicBoolean(false);
    }

    @Override // zc.z
    public void b(je.b0 b0Var, pc.m mVar, d0 d0Var) {
    }
}

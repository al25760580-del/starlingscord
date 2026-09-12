package ga;

import ag.a1;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.widget.q;
import com.facebook.cache.common.CacheKey;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.image.EncodedImage;
import com.google.android.exoplayer2.source.LoadEventInfo;
import com.henninghall.date_picker.NativeRNDatePickerSpec;
import cs.r;
import e4.p;
import gc.h1;
import gc.o;
import he.a0;
import he.f0;
import he.h0;
import he.j0;
import he.k0;
import he.s0;
import i.x;
import ic.m0;
import io.sentry.SentryLevel;
import io.sentry.w5;
import io.sentry.x0;
import io.sentry.x3;
import io.sentry.y3;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.CookieHandler;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import javax.inject.Provider;
import je.e0;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.v0;
import kotlin.collections.w0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import ls.n;
import n.u;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.HttpUrl;
import vo.n0;
import vo.o0;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements q, xb.b, ig.c, ig.d, CookieJar, u, y3, ke.q, ik.d, in.a, n1.h, n0, np.l, f0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f9546d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f9547e;

    public /* synthetic */ l(int i7, Object obj) {
        this.f9546d = i7;
        this.f9547e = obj;
    }

    @Override // np.l
    public np.l F(up.b bVar, up.e eVar) {
        return null;
    }

    @Override // vo.n0
    public void a() {
        o0 NO_SOURCE_FILE = o0.f21821e;
        Intrinsics.checkNotNullExpressionValue(NO_SOURCE_FILE, "NO_SOURCE_FILE");
    }

    @Override // n.u
    public void b(n.j jVar, boolean z5) {
        x xVar;
        androidx.appcompat.app.a aVar = (androidx.appcompat.app.a) this.f9547e;
        n.j jVarK = jVar.k();
        int i7 = 0;
        boolean z6 = jVarK != jVar;
        if (z6) {
            jVar = jVarK;
        }
        x[] xVarArr = aVar.f745i0;
        int length = xVarArr != null ? xVarArr.length : 0;
        while (true) {
            if (i7 < length) {
                xVar = xVarArr[i7];
                if (xVar != null && xVar.f11272h == jVar) {
                    break;
                } else {
                    i7++;
                }
            } else {
                xVar = null;
                break;
            }
        }
        if (xVar != null) {
            if (!z6) {
                aVar.J(xVar, z5);
            } else {
                aVar.H(xVar.f11265a, xVar, jVarK);
                aVar.J(xVar, true);
            }
        }
    }

    @Override // ke.q
    public void c(o oVar) {
        oVar.e(((WindowManager) this.f9547e).getDefaultDisplay());
    }

    @Override // he.f0
    public void e(h0 h0Var, long j, long j5) {
        he.n0 n0Var = (he.n0) h0Var;
        pd.g gVar = (pd.g) this.f9547e;
        long j7 = n0Var.f10634d;
        s0 s0Var = n0Var.f10637v;
        Uri uri = s0Var.f10700i;
        LoadEventInfo loadEventInfo = new LoadEventInfo(s0Var.f10699e, s0Var.f10701v);
        gVar.K.getClass();
        gVar.O.m(loadEventInfo, n0Var.f10636i);
        qd.c cVar = (qd.c) n0Var.f10639x;
        qd.c cVar2 = gVar.f17970f0;
        int size = cVar2 == null ? 0 : cVar2.f18725m.size();
        long j10 = cVar.b(0).f18747b;
        int i7 = 0;
        while (i7 < size && gVar.f17970f0.b(i7).f18747b < j10) {
            i7++;
        }
        if (cVar.f18718d) {
            if (size - i7 > cVar.f18725m.size()) {
                je.b.N("DashMediaSource", "Loaded out of sync manifest");
            } else {
                long j11 = gVar.f17975l0;
                if (j11 == -9223372036854775807L || cVar.f18722h * 1000 > j11) {
                    gVar.f17974k0 = 0;
                } else {
                    je.b.N("DashMediaSource", "Loaded stale dynamic manifest: " + cVar.f18722h + ", " + gVar.f17975l0);
                }
            }
            int i10 = gVar.f17974k0;
            gVar.f17974k0 = i10 + 1;
            if (i10 < gVar.K.k(n0Var.f10636i)) {
                gVar.f17966b0.postDelayed(gVar.T, Math.min((gVar.f17974k0 - 1) * 1000, 5000));
                return;
            } else {
                gVar.a0 = new a1();
                return;
            }
        }
        gVar.f17970f0 = cVar;
        gVar.f17971g0 = cVar.f18718d & gVar.f17971g0;
        gVar.h0 = j - j5;
        gVar.f17972i0 = j;
        synchronized (gVar.R) {
            try {
                if (n0Var.f10635e.f10649a == gVar.f17968d0) {
                    Uri uri2 = gVar.f17970f0.k;
                    if (uri2 == null) {
                        uri2 = n0Var.f10637v.f10700i;
                    }
                    gVar.f17968d0 = uri2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (size != 0) {
            gVar.f17976m0 += i7;
            gVar.y(true);
            return;
        }
        qd.c cVar3 = gVar.f17970f0;
        if (!cVar3.f18718d) {
            gVar.y(true);
            return;
        }
        io.sentry.internal.debugmeta.c cVar4 = cVar3.f18723i;
        if (cVar4 == null) {
            gVar.w();
            return;
        }
        String str = (String) cVar4.f12759e;
        if (e0.a(str, "urn:mpeg:dash:utc:direct:2014") || e0.a(str, "urn:mpeg:dash:utc:direct:2012")) {
            try {
                gVar.f17973j0 = e0.L((String) cVar4.f12760i) - gVar.f17972i0;
                gVar.y(true);
                return;
            } catch (h1 e10) {
                je.b.s("DashMediaSource", "Failed to resolve time offset.", e10);
                gVar.y(true);
                return;
            }
        }
        if (e0.a(str, "urn:mpeg:dash:utc:http-iso:2014") || e0.a(str, "urn:mpeg:dash:utc:http-iso:2012")) {
            he.n0 n0Var2 = new he.n0(gVar.X, Uri.parse((String) cVar4.f12760i), 5, new pd.f());
            gVar.Y.f(n0Var2, new u4.c(gVar), 1);
            gVar.O.s(new LoadEventInfo(n0Var2.f10635e), n0Var2.f10636i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        } else if (e0.a(str, "urn:mpeg:dash:utc:http-xsdate:2014") || e0.a(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
            he.n0 n0Var3 = new he.n0(gVar.X, Uri.parse((String) cVar4.f12760i), 5, new k8.a());
            gVar.Y.f(n0Var3, new u4.c(gVar), 1);
            gVar.O.s(new LoadEventInfo(n0Var3.f10635e), n0Var3.f10636i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        } else if (e0.a(str, "urn:mpeg:dash:utc:ntp:2014") || e0.a(str, "urn:mpeg:dash:utc:ntp:2012")) {
            gVar.w();
        } else {
            je.b.s("DashMediaSource", "Failed to resolve time offset.", new IOException("Unsupported UTC timing scheme"));
            gVar.y(true);
        }
    }

    @Override // n.u
    public boolean f(n.j jVar) {
        Window.Callback callback;
        androidx.appcompat.app.a aVar = (androidx.appcompat.app.a) this.f9547e;
        if (jVar != jVar.k() || !aVar.f740c0 || (callback = aVar.I.getCallback()) == null || aVar.f750n0) {
            return true;
        }
        callback.onMenuOpened(108, jVar);
        return true;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new cc.j((Context) ((Provider) this.f9547e).get(), "com.google.android.datatransport.events", Integer.valueOf(cc.j.f3585v).intValue());
    }

    @Override // n1.h
    public void h(Object obj) {
        o1.d e10 = (o1.d) obj;
        Intrinsics.checkNotNullParameter(e10, "e");
        ar.k kVar = (ar.k) this.f9547e;
        if (kVar.c()) {
            rn.q qVar = Result.f14614e;
            kVar.resumeWith(ib.a.o(e10));
        }
    }

    public void j() {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList(((HashMap) this.f9547e).values());
            ((HashMap) this.f9547e).clear();
        }
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            EncodedImage encodedImage = (EncodedImage) arrayList.get(i7);
            if (encodedImage != null) {
                encodedImage.close();
            }
        }
    }

    public synchronized EncodedImage k(CacheKey cacheKey) {
        cacheKey.getClass();
        EncodedImage encodedImageCloneOrNull = (EncodedImage) ((HashMap) this.f9547e).get(cacheKey);
        if (encodedImageCloneOrNull != null) {
            synchronized (encodedImageCloneOrNull) {
                if (!EncodedImage.isValid(encodedImageCloneOrNull)) {
                    ((HashMap) this.f9547e).remove(cacheKey);
                    o8.a.t(l.class, "Found closed reference %d for key %s (%d)", Integer.valueOf(System.identityHashCode(encodedImageCloneOrNull)), cacheKey.c(), Integer.valueOf(System.identityHashCode(cacheKey)));
                    return null;
                }
                encodedImageCloneOrNull = EncodedImage.cloneOrNull(encodedImageCloneOrNull);
            }
        }
        return encodedImageCloneOrNull;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00a2 A[Catch: Exception -> 0x00a8, TRY_LEAVE, TryCatch #0 {Exception -> 0x00a8, blocks: (B:20:0x0081, B:21:0x0094, B:26:0x009c, B:28:0x00a2), top: B:61:0x009c }] */
    /* JADX WARN: Code duplicated, block: B:66:0x00a8 A[SYNTHETIC] */
    public ArrayList l() {
        p pVar = (p) this.f9547e;
        String strReplaceAll = ((SimpleDateFormat) DateFormat.getDateTimeInstance(0, 0, pVar.f())).toLocalizedPattern().replace(",", "").replaceAll("\\('(.+?)'\\)", "\\${$1}").replaceAll("'.+?'", "").replaceAll("\\$\\{(.+?)\\}", "('$1')");
        ArrayList arrayList = new ArrayList(Arrays.asList(hk.c.values()));
        ArrayList<hk.c> arrayList2 = new ArrayList();
        hk.c cVar = hk.c.f10926d;
        arrayList.remove(cVar);
        arrayList2.add(cVar);
        char[] charArray = strReplaceAll.toCharArray();
        int length = charArray.length;
        int i7 = 0;
        while (true) {
            hk.c cVar2 = hk.c.f10930w;
            hk.c cVar3 = hk.c.f10928i;
            hk.c cVar4 = hk.c.f10927e;
            hk.c cVar5 = hk.c.f10931x;
            hk.c cVar6 = hk.c.f10929v;
            hk.c cVar7 = hk.c.f10932y;
            if (i7 >= length) {
                if (arrayList.contains(cVar7)) {
                    arrayList.remove(cVar7);
                    arrayList2.add(cVar7);
                }
                if (!arrayList.isEmpty()) {
                    Log.e(NativeRNDatePickerSpec.NAME, arrayList.size() + " wheel types cannot be ordered. Wheel type 0: " + arrayList.get(0));
                }
                ArrayList arrayList3 = new ArrayList();
                hk.b bVarG = pVar.g();
                int iOrdinal = bVarG.ordinal();
                if (iOrdinal == 0) {
                    arrayList3.add(cVar6);
                    arrayList3.add(cVar3);
                    arrayList3.add(cVar4);
                } else if (iOrdinal == 1) {
                    arrayList3.add(cVar2);
                    arrayList3.add(cVar5);
                } else if (iOrdinal == 2) {
                    arrayList3.add(cVar);
                    arrayList3.add(cVar2);
                    arrayList3.add(cVar5);
                }
                if ((bVarG == hk.b.f10923e || bVarG == hk.b.f10924i) && ((l) pVar.f8030n).t()) {
                    arrayList3.add(cVar7);
                }
                ArrayList arrayList4 = new ArrayList();
                for (hk.c cVar8 : arrayList2) {
                    if (arrayList3.contains(cVar8)) {
                        arrayList4.add(cVar8);
                    }
                }
                return arrayList4;
            }
            char c8 = charArray[i7];
            if (c8 == 'H') {
                try {
                    if (arrayList.contains(cVar2)) {
                        arrayList.remove(cVar2);
                        arrayList2.add(cVar2);
                    }
                } catch (Exception unused) {
                }
            } else {
                if (c8 == 'M') {
                    cVar2 = cVar3;
                } else if (c8 == 'a') {
                    cVar2 = cVar7;
                } else if (c8 == 'd') {
                    cVar2 = cVar4;
                } else if (c8 != 'h') {
                    if (c8 == 'm') {
                        cVar2 = cVar5;
                    } else {
                        if (c8 != 'y') {
                            throw new Exception("Invalid pattern char: " + c8);
                        }
                        cVar2 = cVar6;
                    }
                }
                if (arrayList.contains(cVar2)) {
                    arrayList.remove(cVar2);
                    arrayList2.add(cVar2);
                }
            }
            i7++;
        }
    }

    @Override // okhttp3.CookieJar
    public List loadForRequest(HttpUrl url) {
        r rVar;
        Intrinsics.checkNotNullParameter(url, "url");
        ArrayList arrayList = null;
        try {
            Map<String, List<String>> cookieHeaders = ((CookieHandler) this.f9547e).get(url.g(), w0.d());
            Intrinsics.checkNotNullExpressionValue(cookieHeaders, "cookieHeaders");
            for (Map.Entry<String, List<String>> entry : cookieHeaders.entrySet()) {
                String key = entry.getKey();
                List<String> value = entry.getValue();
                if ("Cookie".equalsIgnoreCase(key) || "Cookie2".equalsIgnoreCase(key)) {
                    Intrinsics.checkNotNullExpressionValue(value, "value");
                    if (value.isEmpty()) {
                        continue;
                    } else {
                        for (String header : value) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            Intrinsics.checkNotNullExpressionValue(header, "header");
                            ArrayList arrayList2 = new ArrayList();
                            int length = header.length();
                            int i7 = 0;
                            while (i7 < length) {
                                int iF = ds.b.f(i7, length, header, ";,");
                                int iE = ds.b.e('=', i7, iF, header);
                                String name = ds.b.y(i7, iE, header);
                                if (!kotlin.text.x.o(name, "$", false)) {
                                    String strY = iE < iF ? ds.b.y(iE + 1, iF, header) : "";
                                    if (kotlin.text.x.o(strY, "\"", false) && kotlin.text.x.h(strY, "\"", false)) {
                                        strY = strY.substring(1, strY.length() - 1);
                                        Intrinsics.checkNotNullExpressionValue(strY, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                                    }
                                    String value2 = strY;
                                    Intrinsics.checkNotNullParameter(name, "name");
                                    if (!Intrinsics.areEqual(StringsKt.b0(name).toString(), name)) {
                                        throw new IllegalArgumentException("name is not trimmed");
                                    }
                                    Intrinsics.checkNotNullParameter(value2, "value");
                                    if (!Intrinsics.areEqual(StringsKt.b0(value2).toString(), value2)) {
                                        throw new IllegalArgumentException("value is not trimmed");
                                    }
                                    String domain = url.f17323d;
                                    Intrinsics.checkNotNullParameter(domain, "domain");
                                    String strJ = sa.a.J(domain);
                                    if (strJ == null) {
                                        throw new IllegalArgumentException(Intrinsics.stringPlus("unexpected domain: ", domain));
                                    }
                                    arrayList2.add(new Cookie(name, value2, 253402300799999L, strJ, "/", false, false, false, false));
                                }
                                i7 = iF + 1;
                            }
                            arrayList.addAll(arrayList2);
                        }
                    }
                }
            }
            if (arrayList == null) {
                return kotlin.collections.n0.f14659d;
            }
            List listUnmodifiableList = Collections.unmodifiableList(arrayList);
            Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "Collections.unmodifiableList(cookies)");
            return listUnmodifiableList;
        } catch (IOException e10) {
            n nVar = n.f15297a;
            n nVar2 = n.f15297a;
            StringBuilder sb2 = new StringBuilder("Loading cookies failed for ");
            url.getClass();
            Intrinsics.checkNotNullParameter("/...", "link");
            Intrinsics.checkNotNullParameter("/...", "link");
            try {
                rVar = new r(0);
                rVar.g(url, "/...");
            } catch (IllegalArgumentException unused) {
                rVar = null;
            }
            HttpUrl httpUrlB = rVar != null ? rVar.b() : null;
            Intrinsics.checkNotNull(httpUrlB);
            sb2.append(httpUrlB);
            String string = sb2.toString();
            nVar2.getClass();
            n.i(5, string, e10);
            return kotlin.collections.n0.f14659d;
        }
    }

    @Override // np.l
    public np.m m(up.e eVar) {
        if ("b".equals(eVar.b())) {
            return new op.b(this, 2);
        }
        return null;
    }

    @Override // he.f0
    public ad.f n(h0 h0Var, long j, long j5, IOException iOException, int i7) {
        long jMin;
        he.n0 n0Var = (he.n0) h0Var;
        pd.g gVar = (pd.g) this.f9547e;
        long j7 = n0Var.f10634d;
        s0 s0Var = n0Var.f10637v;
        Uri uri = s0Var.f10700i;
        LoadEventInfo loadEventInfo = new LoadEventInfo(s0Var.f10699e, s0Var.f10701v);
        int i10 = n0Var.f10636i;
        gVar.K.getClass();
        if (!(iOException instanceof h1) && !(iOException instanceof FileNotFoundException) && !(iOException instanceof a0) && !(iOException instanceof j0)) {
            int i11 = he.m.f10627e;
            Throwable cause = iOException;
            while (true) {
                if (cause == null) {
                    jMin = Math.min((i7 - 1) * 1000, 5000);
                    break;
                }
                if ((cause instanceof he.m) && ((he.m) cause).f10628d == 2008) {
                    jMin = -9223372036854775807L;
                    break;
                }
                cause = cause.getCause();
            }
        } else {
            jMin = -9223372036854775807L;
            break;
        }
        ad.f fVar = jMin == -9223372036854775807L ? k0.f10620x : new ad.f(0, jMin, false);
        gVar.O.q(loadEventInfo, i10, iOException, !fVar.a());
        return fVar;
    }

    public synchronized void o() {
        o8.a.q("Count = %d", Integer.valueOf(((HashMap) this.f9547e).size()), l.class);
    }

    @Override // ig.c
    public void onFailure(Exception exc) {
        xe.b bVar;
        if ((exc instanceof ye.e) && (bVar = ((ye.e) exc).f23289d.f5939v) != null && bVar.f22910e == 24) {
            ((com.google.android.gms.net.b) this.f9547e).f6219b.set(SystemClock.elapsedRealtime());
        }
    }

    @Override // n1.h
    public void onResult(Object obj) {
        n1.c result = (n1.c) obj;
        Intrinsics.checkNotNullParameter(result, "result");
        ar.k kVar = (ar.k) this.f9547e;
        if (kVar.c()) {
            rn.q qVar = Result.f14614e;
            kVar.resumeWith(result);
        }
    }

    @Override // ig.d
    public /* synthetic */ void onSuccess(Object obj) {
        ((com.margelo.nitro.playagerangedeclaration.c) this.f9547e).invoke(obj);
    }

    @Override // he.f0
    public void p(h0 h0Var, long j, long j5, boolean z5) {
        ((pd.g) this.f9547e).x((he.n0) h0Var);
    }

    public void q(Exception exc) {
        je.b.s("MediaCodecAudioRenderer", "Audio sink error", exc);
        e4.l lVar = ((m0) this.f9547e).f11567d1;
        Handler handler = (Handler) lVar.f7989e;
        if (handler != null) {
            handler.post(new ic.p(lVar, exc, 1));
        }
    }

    public void r(CacheKey cacheKey) {
        EncodedImage encodedImage;
        cacheKey.getClass();
        synchronized (this) {
            encodedImage = (EncodedImage) ((HashMap) this.f9547e).remove(cacheKey);
        }
        if (encodedImage == null) {
            return;
        }
        try {
            encodedImage.isValid();
        } finally {
            encodedImage.close();
        }
    }

    public synchronized void s(CacheKey cacheKey, EncodedImage encodedImage) {
        cacheKey.getClass();
        encodedImage.getClass();
        if (!EncodedImage.isValid(encodedImage)) {
            throw new IllegalArgumentException();
        }
        EncodedImage encodedImage2 = (EncodedImage) ((HashMap) this.f9547e).get(cacheKey);
        if (encodedImage2 == null) {
            return;
        }
        CloseableReference byteBufferRef = encodedImage2.getByteBufferRef();
        CloseableReference byteBufferRef2 = encodedImage.getByteBufferRef();
        if (byteBufferRef != null && byteBufferRef2 != null) {
            try {
                if (byteBufferRef.q() == byteBufferRef2.q()) {
                    ((HashMap) this.f9547e).remove(cacheKey);
                    byteBufferRef2.close();
                    byteBufferRef.close();
                    EncodedImage.closeSafely(encodedImage2);
                    o();
                    return;
                }
            } catch (Throwable th2) {
                byteBufferRef2.close();
                byteBufferRef.close();
                EncodedImage.closeSafely(encodedImage2);
                throw th2;
            }
        }
        CloseableReference.l(byteBufferRef2);
        CloseableReference.l(byteBufferRef);
        EncodedImage.closeSafely(encodedImage2);
    }

    @Override // okhttp3.CookieJar
    public void saveFromResponse(HttpUrl url, List cookies) {
        r rVar;
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(cookies, "cookies");
        ArrayList arrayList = new ArrayList();
        Iterator it = cookies.iterator();
        while (it.hasNext()) {
            Cookie cookie = (Cookie) it.next();
            Intrinsics.checkNotNullParameter(cookie, "cookie");
            arrayList.add(cookie.a(true));
        }
        try {
            ((CookieHandler) this.f9547e).put(url.g(), v0.b(new Pair("Set-Cookie", arrayList)));
        } catch (IOException e10) {
            n nVar = n.f15297a;
            n nVar2 = n.f15297a;
            StringBuilder sb2 = new StringBuilder("Saving cookies failed for ");
            url.getClass();
            Intrinsics.checkNotNullParameter("/...", "link");
            Intrinsics.checkNotNullParameter("/...", "link");
            try {
                rVar = new r(0);
                rVar.g(url, "/...");
            } catch (IllegalArgumentException unused) {
                rVar = null;
            }
            HttpUrl httpUrlB = rVar != null ? rVar.b() : null;
            Intrinsics.checkNotNull(httpUrlB);
            sb2.append(httpUrlB);
            String string = sb2.toString();
            nVar2.getClass();
            n.i(5, string, e10);
        }
    }

    public boolean t() {
        p pVar = (p) this.f9547e;
        if (((hk.a) ((jk.a) pVar.j).f13919a) != hk.a.f10920d) {
            return !android.text.format.DateFormat.is24HourFormat(com.mkuczera.haptic.d.f7010b);
        }
        DateFormat timeInstance = DateFormat.getTimeInstance(0, pVar.f());
        return (timeInstance instanceof SimpleDateFormat) && ((SimpleDateFormat) timeInstance).toPattern().contains("a");
    }

    public String toString() {
        switch (this.f9546d) {
            case 26:
                StringBuilder sb2 = new StringBuilder();
                ip.r rVar = (ip.r) this.f9547e;
                sb2.append(rVar);
                sb2.append(": ");
                sb2.append(((Map) io.sentry.config.a.H(rVar.G, ip.r.K[0])).keySet());
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    @Override // io.sentry.y3
    public x3 u(x0 x0Var, w5 w5Var) {
        com.facebook.imagepipeline.nativecode.c.H(x0Var, "Scopes are required");
        com.facebook.imagepipeline.nativecode.c.H(w5Var, "SentryOptions is required");
        String cacheDirPath = ((com.discord.crash_reporting.b) this.f9547e).f4336d.getCacheDirPath();
        if (cacheDirPath == null || !y3.T(cacheDirPath, w5Var.getLogger())) {
            w5Var.getLogger().q(SentryLevel.ERROR, "No cache dir path is defined in options.", new Object[0]);
            return null;
        }
        return new x3(w5Var.getLogger(), cacheDirPath, new io.sentry.a0(x0Var, w5Var.getSerializer(), w5Var.getLogger(), w5Var.getFlushTimeoutMillis(), w5Var.getMaxQueueSize()), new File(cacheDirPath));
    }

    public /* synthetic */ l(int i7, boolean z5) {
        this.f9546d = i7;
    }

    public l(com.margelo.nitro.playagerangedeclaration.c function) {
        this.f9546d = 6;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f9547e = function;
    }

    public l(ip.r packageFragment) {
        this.f9546d = 26;
        Intrinsics.checkNotNullParameter(packageFragment, "packageFragment");
        this.f9547e = packageFragment;
    }

    public l(v.d vector, a3.q onVectorMutated) {
        this.f9546d = 13;
        Intrinsics.checkNotNullParameter(vector, "vector");
        Intrinsics.checkNotNullParameter(onVectorMutated, "onVectorMutated");
        this.f9547e = vector;
    }

    public l(int i7) {
        this.f9546d = i7;
        switch (i7) {
            case 10:
                this.f9547e = null;
                break;
            case 17:
                this.f9547e = new io.sentry.transport.q();
                break;
            case 21:
                this.f9547e = new HashSet();
                break;
            default:
                this.f9547e = new AtomicReference(null);
                break;
        }
    }

    public l(CookieHandler cookieHandler) {
        this.f9546d = 7;
        Intrinsics.checkNotNullParameter(cookieHandler, "cookieHandler");
        this.f9547e = cookieHandler;
    }

    @Override // ke.q
    public void g() {
    }

    @Override // np.l
    public void i() {
    }

    @Override // np.l
    public void K(up.e eVar, zp.f fVar) {
    }

    @Override // np.l
    public void M(up.e eVar, Object obj) {
    }

    @Override // np.l
    public void G(up.e eVar, up.b bVar, up.e eVar2) {
    }
}

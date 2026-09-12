package xr;

import a5.l0;
import ag.a1;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.core.util.Pools$SynchronizedPool;
import ar.a0;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.assets.ReactFontManager;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.views.image.ReactImageView;
import com.google.firebase.messaging.FirebaseMessaging;
import cs.t;
import ip.g0;
import java.io.File;
import java.io.FileNotFoundException;
import java.net.ProtocolException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import je.w;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.d1;
import kotlin.collections.e0;
import kotlin.collections.n0;
import kotlin.collections.v0;
import kotlin.collections.w0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.reflect.KTypeProjection;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.x;
import lq.d0;
import lq.e1;
import lq.i0;
import lq.j0;
import lq.q0;
import lq.t0;
import lq.z;
import lq.z0;
import okhttp3.CacheControl;
import okhttp3.Cookie;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import pa.u;
import po.c0;
import po.q1;
import vo.r0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class m {
    public static boolean A(int i7) {
        if (i7 <= 1900 || i7 >= 2100) {
            return ((i7 & 3) == 0 && i7 % 100 != 0) || i7 % ReactFontManager.TypefaceStyle.NORMAL == 0;
        }
        return (i7 & 3) == 0;
    }

    public static final boolean B(z zVar) {
        Intrinsics.checkNotNullParameter(zVar, "<this>");
        Intrinsics.checkNotNullParameter(zVar, "<this>");
        vo.i iVarG = zVar.r0().g();
        return Intrinsics.areEqual(iVarG != null ? s(iVarG) : null, to.j.f20863c);
    }

    /* JADX WARN: Code duplicated, block: B:122:0x0171 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:124:0x0152 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:128:0x0138 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x0143  */
    /* JADX WARN: Code duplicated, block: B:89:0x015c  */
    /* JADX WARN: Code duplicated, block: B:91:0x0166  */
    /* JADX WARN: Code duplicated, block: B:92:0x0168  */
    public static void C(Intent intent) {
        long j;
        ji.f fVarB;
        ji.h hVar;
        String str;
        String str2;
        String[] strArrSplit;
        String str3;
        if (R(intent)) {
            D("_nr", intent.getExtras());
        }
        int iIntValue = 0;
        if ((intent == null || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction())) ? false : n()) {
            sb.f fVar = (sb.f) FirebaseMessaging.f6529l.get();
            if (fVar == null) {
                Log.e("FirebaseMessaging", "TransportFactory is null. Skip exporting message delivery metrics to Big Query");
                return;
            }
            int i7 = 1;
            ej.d dVar = null;
            str = null;
            String str4 = null;
            if (intent != null) {
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    extras = Bundle.EMPTY;
                }
                Object obj = extras.get("google.ttl");
                if (obj instanceof Integer) {
                    iIntValue = ((Integer) obj).intValue();
                } else if (obj instanceof String) {
                    try {
                        iIntValue = Integer.parseInt((String) obj);
                    } catch (NumberFormatException unused) {
                        Log.w("FirebaseMessaging", "Invalid TTL: " + obj);
                    }
                }
                int i10 = iIntValue;
                String string = extras.getString("google.to");
                if (TextUtils.isEmpty(string)) {
                    try {
                        ji.f fVarB2 = ji.f.b();
                        try {
                            Object obj2 = yi.c.f23356m;
                            fVarB2.a();
                            string = (String) l0.h(((yi.c) fVarB2.f13893d.b(yi.d.class)).c());
                        } catch (InterruptedException e10) {
                            e = e10;
                            throw new RuntimeException(e);
                        }
                    } catch (InterruptedException | ExecutionException e11) {
                        e = e11;
                    }
                }
                String str5 = string;
                ji.f fVarB3 = ji.f.b();
                fVarB3.a();
                String packageName = fVarB3.f13890a.getPackageName();
                ej.b bVar = u4.c.w(extras) ? ej.b.DISPLAY_NOTIFICATION : ej.b.DATA_MESSAGE;
                String string2 = extras.getString("google.message_id");
                if (string2 == null) {
                    string2 = extras.getString("message_id");
                }
                String str6 = string2 != null ? string2 : "";
                String string3 = extras.getString("from");
                if (string3 != null && string3.startsWith("/topics/")) {
                    str4 = string3;
                }
                String str7 = str4 != null ? str4 : "";
                String string4 = extras.getString("collapse_key");
                String str8 = string4 != null ? string4 : "";
                String string5 = extras.getString("google.c.a.m_l");
                String str9 = string5 != null ? string5 : "";
                String string6 = extras.getString("google.c.a.c_l");
                String str10 = string6 != null ? string6 : "";
                if (extras.containsKey("google.c.sender.id")) {
                    try {
                        j = Long.parseLong(extras.getString("google.c.sender.id"));
                    } catch (NumberFormatException e12) {
                        Log.w("FirebaseMessaging", "error parsing project number", e12);
                        fVarB = ji.f.b();
                        hVar = fVarB.f13892c;
                        fVarB.a();
                        str = hVar.f13908e;
                        if (str != null) {
                            try {
                                j = Long.parseLong(str);
                            } catch (NumberFormatException e13) {
                                Log.w("FirebaseMessaging", "error parsing sender ID", e13);
                                fVarB.a();
                                str2 = hVar.f13905b;
                                if (str2.startsWith("1:")) {
                                    strArrSplit = str2.split(":");
                                    if (strArrSplit.length < 2) {
                                        j = 0;
                                    } else {
                                        str3 = strArrSplit[1];
                                        if (str3.isEmpty()) {
                                            j = 0;
                                        } else {
                                            try {
                                                j = Long.parseLong(str3);
                                            } catch (NumberFormatException e14) {
                                                Log.w("FirebaseMessaging", "error parsing app ID", e14);
                                                j = 0;
                                            }
                                        }
                                    }
                                } else {
                                    try {
                                        j = Long.parseLong(str2);
                                    } catch (NumberFormatException e15) {
                                        Log.w("FirebaseMessaging", "error parsing app ID", e15);
                                        j = 0;
                                    }
                                }
                            }
                        } else {
                            fVarB.a();
                            str2 = hVar.f13905b;
                            if (str2.startsWith("1:")) {
                                j = Long.parseLong(str2);
                            } else {
                                strArrSplit = str2.split(":");
                                if (strArrSplit.length < 2) {
                                    j = 0;
                                } else {
                                    str3 = strArrSplit[1];
                                    if (str3.isEmpty()) {
                                        j = 0;
                                    } else {
                                        j = Long.parseLong(str3);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    fVarB = ji.f.b();
                    hVar = fVarB.f13892c;
                    fVarB.a();
                    str = hVar.f13908e;
                    if (str != null) {
                        j = Long.parseLong(str);
                    } else {
                        fVarB.a();
                        str2 = hVar.f13905b;
                        if (str2.startsWith("1:")) {
                            j = Long.parseLong(str2);
                        } else {
                            strArrSplit = str2.split(":");
                            if (strArrSplit.length < 2) {
                                j = 0;
                            } else {
                                str3 = strArrSplit[1];
                                if (str3.isEmpty()) {
                                    j = 0;
                                } else {
                                    j = Long.parseLong(str3);
                                }
                            }
                        }
                    }
                }
                dVar = new ej.d(j > 0 ? j : 0L, str6, str5, bVar, packageName, str8, i10, str7, str9, str10);
            }
            if (dVar == null) {
                return;
            }
            try {
                ((vb.o) fVar).a("FCM_CLIENT_EVENT_LOGGING", new sb.c("proto"), new com.google.firebase.messaging.n(i7)).c(new sb.a(new ej.e(dVar), new sb.b(Integer.valueOf(intent.getIntExtra("google.product_id", 111881503)))));
            } catch (RuntimeException e16) {
                Log.w("FirebaseMessaging", "Failed to send big query analytics payload.", e16);
            }
        }
    }

    public static void D(String str, Bundle bundle) {
        try {
            ji.f.b();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String string = bundle.getString("google.c.a.c_id");
            if (string != null) {
                bundle2.putString("_nmid", string);
            }
            String string2 = bundle.getString("google.c.a.c_l");
            if (string2 != null) {
                bundle2.putString("_nmn", string2);
            }
            String string3 = bundle.getString("google.c.a.m_l");
            if (!TextUtils.isEmpty(string3)) {
                bundle2.putString("label", string3);
            }
            String string4 = bundle.getString("google.c.a.m_c");
            if (!TextUtils.isEmpty(string4)) {
                bundle2.putString("message_channel", string4);
            }
            String string5 = bundle.getString("from");
            if (string5 == null || !string5.startsWith("/topics/")) {
                string5 = null;
            }
            if (string5 != null) {
                bundle2.putString("_nt", string5);
            }
            String string6 = bundle.getString("google.c.a.ts");
            if (string6 != null) {
                try {
                    bundle2.putInt("_nmt", Integer.parseInt(string6));
                } catch (NumberFormatException e10) {
                    Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", e10);
                }
            }
            String string7 = bundle.containsKey("google.c.a.udt") ? bundle.getString("google.c.a.udt") : null;
            if (string7 != null) {
                try {
                    bundle2.putInt("_ndt", Integer.parseInt(string7));
                } catch (NumberFormatException e11) {
                    Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e11);
                }
            }
            String str2 = u4.c.w(bundle) ? ViewProps.DISPLAY : "data";
            if ("_nr".equals(str) || "_nf".equals(str)) {
                bundle2.putString("_nmc", str2);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Logging to scion event=" + str + " scionPayload=" + bundle2);
            }
            ji.f fVarB = ji.f.b();
            fVarB.a();
            if (fVarB.f13893d.b(ki.a.class) != null) {
                throw new ClassCastException();
            }
            Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
        } catch (IllegalStateException unused) {
            Log.e("FirebaseMessaging", "Default FirebaseApp has not been initialized. Skip logging event to GA.");
        }
    }

    public static void E(File file) throws m8.b {
        if (file.exists()) {
            if (file.isDirectory()) {
                return;
            }
            if (!file.delete()) {
                String absolutePath = file.getAbsolutePath();
                a1 a1Var = new a1(file.getAbsolutePath());
                m8.b bVar = new m8.b(absolutePath);
                bVar.initCause(a1Var);
                throw bVar;
            }
        }
        if (!file.mkdirs() && !file.isDirectory()) {
            throw new m8.b(file.getAbsolutePath());
        }
    }

    public static ConcurrentHashMap F(Map map) {
        if (map == null) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null) {
                concurrentHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return concurrentHashMap;
    }

    public static a1.d M(String statusLine) throws ProtocolException {
        int i7;
        String strSubstring;
        Intrinsics.checkNotNullParameter(statusLine, "statusLine");
        boolean zO = x.o(statusLine, "HTTP/1.", false);
        t tVar = t.HTTP_1_0;
        if (zO) {
            i7 = 9;
            if (statusLine.length() < 9 || statusLine.charAt(8) != ' ') {
                throw new ProtocolException(Intrinsics.stringPlus("Unexpected status line: ", statusLine));
            }
            int iCharAt = statusLine.charAt(7) - '0';
            if (iCharAt != 0) {
                if (iCharAt != 1) {
                    throw new ProtocolException(Intrinsics.stringPlus("Unexpected status line: ", statusLine));
                }
                tVar = t.HTTP_1_1;
            }
        } else {
            if (!x.o(statusLine, "ICY ", false)) {
                throw new ProtocolException(Intrinsics.stringPlus("Unexpected status line: ", statusLine));
            }
            i7 = 4;
        }
        int i10 = i7 + 3;
        if (statusLine.length() < i10) {
            throw new ProtocolException(Intrinsics.stringPlus("Unexpected status line: ", statusLine));
        }
        try {
            String strSubstring2 = statusLine.substring(i7, i10);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
            int i11 = Integer.parseInt(strSubstring2);
            if (statusLine.length() <= i10) {
                strSubstring = "";
            } else {
                if (statusLine.charAt(i10) != ' ') {
                    throw new ProtocolException(Intrinsics.stringPlus("Unexpected status line: ", statusLine));
                }
                strSubstring = statusLine.substring(i7 + 4);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
            }
            return new a1.d(tVar, i11, strSubstring);
        } catch (NumberFormatException unused) {
            throw new ProtocolException(Intrinsics.stringPlus("Unexpected status line: ", statusLine));
        }
    }

    public static Cookie N(HttpUrl url, String setCookie) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(setCookie, "setCookie");
        long jCurrentTimeMillis = System.currentTimeMillis();
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(setCookie, "setCookie");
        char c8 = ';';
        int iG = ds.b.g(';', 0, 0, 6, setCookie);
        char c10 = '=';
        int iG2 = ds.b.g('=', 0, iG, 2, setCookie);
        String str = null;
        if (iG2 != iG) {
            String strY = ds.b.y(0, iG2, setCookie);
            if (strY.length() != 0 && ds.b.l(strY) == -1) {
                boolean z5 = true;
                String strY2 = ds.b.y(iG2 + 1, iG, setCookie);
                if (ds.b.l(strY2) == -1) {
                    int i7 = iG + 1;
                    int length = setCookie.length();
                    long j = 253402300799999L;
                    boolean z6 = false;
                    boolean z7 = false;
                    boolean z10 = false;
                    String str2 = null;
                    boolean z11 = true;
                    long jO = 253402300799999L;
                    long j5 = -1;
                    while (true) {
                        long j7 = LongCompanionObject.MAX_VALUE;
                        if (i7 >= length) {
                            if (j5 == Long.MIN_VALUE) {
                                j = Long.MIN_VALUE;
                            } else if (j5 != -1) {
                                if (j5 <= 9223372036854775L) {
                                    j7 = j5 * ((long) 1000);
                                }
                                long j10 = jCurrentTimeMillis + j7;
                                if (j10 >= jCurrentTimeMillis && j10 <= 253402300799999L) {
                                    j = j10;
                                }
                            } else {
                                j = jO;
                            }
                            String str3 = url.f17323d;
                            if (str != null) {
                                if (!Intrinsics.areEqual(str3, str)) {
                                    if (x.h(str3, str, false) && str3.charAt((str3.length() - str.length()) - 1) == '.') {
                                        Intrinsics.checkNotNullParameter(str3, "<this>");
                                        if (!ds.b.f7820f.d(str3)) {
                                        }
                                    }
                                }
                                return null;
                            }
                            str = str3;
                            if (str3.length() == str.length() || PublicSuffixDatabase.f17407g.a(str) != null) {
                                String strSubstring = "/";
                                if (str2 == null || !x.o(str2, "/", false)) {
                                    String strB = url.b();
                                    int iL = StringsKt.L('/', 0, 6, strB);
                                    if (iL != 0) {
                                        strSubstring = strB.substring(0, iL);
                                        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                                    }
                                    str2 = strSubstring;
                                }
                                return new Cookie(strY, strY2, j, str, str2, z10, z6, z7, z11);
                            }
                            return null;
                        }
                        int iE = ds.b.e(c8, i7, length, setCookie);
                        int iE2 = ds.b.e(c10, i7, iE, setCookie);
                        String strY3 = ds.b.y(i7, iE2, setCookie);
                        String strY4 = iE2 < iE ? ds.b.y(iE2 + 1, iE, setCookie) : "";
                        if (x.i(strY3, "expires", z5)) {
                            try {
                                jO = O(strY4.length(), strY4);
                                z7 = z5;
                            } catch (NumberFormatException | IllegalArgumentException unused) {
                            }
                        } else if (x.i(strY3, "max-age", z5)) {
                            try {
                                j5 = Long.parseLong(strY4);
                                if (j5 <= 0) {
                                    j5 = Long.MIN_VALUE;
                                }
                            } catch (NumberFormatException e10) {
                                if (!new Regex("-?\\d+").d(strY4)) {
                                    throw e10;
                                }
                                if (x.o(strY4, "-", false)) {
                                    j7 = Long.MIN_VALUE;
                                }
                                j5 = j7;
                            }
                            z7 = true;
                        } else if (x.i(strY3, "domain", true)) {
                            if (x.h(strY4, ".", false)) {
                                throw new IllegalArgumentException("Failed requirement.");
                            }
                            String strJ = sa.a.J(StringsKt.N(strY4, "."));
                            if (strJ == null) {
                                throw new IllegalArgumentException();
                            }
                            str = strJ;
                            z11 = false;
                        } else if (x.i(strY3, "path", true)) {
                            str2 = strY4;
                        } else if (x.i(strY3, "secure", true)) {
                            z10 = true;
                        } else if (x.i(strY3, "httponly", true)) {
                            z6 = true;
                        }
                        i7 = iE + 1;
                        c8 = ';';
                        c10 = '=';
                        z5 = true;
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x00a0  */
    public static long O(int i7, String str) {
        int iM = m(str, 0, i7, false);
        Matcher matcher = Cookie.f17302m.matcher(str);
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int iJ = -1;
        int i13 = -1;
        int i14 = -1;
        while (iM < i7) {
            int iM2 = m(str, iM + 1, i7, true);
            matcher.region(iM, iM2);
            if (i11 == -1 && matcher.usePattern(Cookie.f17302m).matches()) {
                String strGroup = matcher.group(1);
                Intrinsics.checkNotNullExpressionValue(strGroup, "matcher.group(1)");
                i11 = Integer.parseInt(strGroup);
                String strGroup2 = matcher.group(2);
                Intrinsics.checkNotNullExpressionValue(strGroup2, "matcher.group(2)");
                i13 = Integer.parseInt(strGroup2);
                String strGroup3 = matcher.group(3);
                Intrinsics.checkNotNullExpressionValue(strGroup3, "matcher.group(3)");
                i14 = Integer.parseInt(strGroup3);
            } else if (i12 == -1 && matcher.usePattern(Cookie.f17301l).matches()) {
                String strGroup4 = matcher.group(1);
                Intrinsics.checkNotNullExpressionValue(strGroup4, "matcher.group(1)");
                i12 = Integer.parseInt(strGroup4);
            } else if (iJ == -1) {
                Pattern pattern = Cookie.k;
                if (matcher.usePattern(pattern).matches()) {
                    String strGroup5 = matcher.group(1);
                    Intrinsics.checkNotNullExpressionValue(strGroup5, "matcher.group(1)");
                    Locale locale = Locale.US;
                    String strP = a3.e.p(locale, "US", strGroup5, locale, "this as java.lang.String).toLowerCase(locale)");
                    String strPattern = pattern.pattern();
                    Intrinsics.checkNotNullExpressionValue(strPattern, "MONTH_PATTERN.pattern()");
                    iJ = StringsKt.J(strPattern, strP, 0, false, 6) / 4;
                } else if (i10 != -1 && matcher.usePattern(Cookie.j).matches()) {
                    String strGroup6 = matcher.group(1);
                    Intrinsics.checkNotNullExpressionValue(strGroup6, "matcher.group(1)");
                    i10 = Integer.parseInt(strGroup6);
                }
            } else if (i10 != -1) {
            }
            iM = m(str, iM2 + 1, i7, false);
        }
        if (70 <= i10 && i10 < 100) {
            i10 += 1900;
        }
        if (i10 >= 0 && i10 < 70) {
            i10 += 2000;
        }
        if (i10 < 1601) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (iJ == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (1 > i12 || i12 >= 32) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i11 < 0 || i11 >= 24) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i13 < 0 || i13 >= 60) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i14 < 0 || i14 >= 60) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(ds.b.f7819e);
        gregorianCalendar.setLenient(false);
        gregorianCalendar.set(1, i10);
        gregorianCalendar.set(2, iJ - 1);
        gregorianCalendar.set(5, i12);
        gregorianCalendar.set(11, i11);
        gregorianCalendar.set(12, i13);
        gregorianCalendar.set(13, i14);
        gregorianCalendar.set(14, 0);
        return gregorianCalendar.getTimeInMillis();
    }

    public static void P(File file, File file2) throws m8.d {
        Throwable a1Var;
        file.getClass();
        file2.delete();
        if (file.renameTo(file2)) {
            return;
        }
        if (file2.exists()) {
            a1Var = new a1(file2.getAbsolutePath());
        } else if (file.getParentFile().exists()) {
            a1Var = !file.exists() ? new FileNotFoundException(file.getAbsolutePath()) : null;
        } else {
            a1Var = new m8.c(file.getAbsolutePath());
        }
        m8.d dVar = new m8.d("Unknown error renaming " + file.getAbsolutePath() + " to " + file2.getAbsolutePath());
        dVar.initCause(a1Var);
        throw dVar;
    }

    public static void Q(Drawable drawable, int i7) {
        drawable.setTint(i7);
    }

    public static boolean R(Intent intent) {
        Bundle extras;
        if (intent == null || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction()) || (extras = intent.getExtras()) == null) {
            return false;
        }
        return "1".equals(extras.getString("google.c.a.e"));
    }

    public static jp.a S(z0 z0Var, boolean z5, g0 g0Var, int i7) {
        boolean z6 = (i7 & 1) != 0 ? false : z5;
        boolean z7 = (i7 & 2) == 0;
        if ((i7 & 4) != 0) {
            g0Var = null;
        }
        Intrinsics.checkNotNullParameter(z0Var, "<this>");
        return new jp.a(z0Var, z7, z6, g0Var != null ? d1.b(g0Var) : null, 34);
    }

    public static long T(int i7, int i10, int i11) {
        c(i7, i10, i11);
        long j = i7;
        if (i10 < 3) {
            j--;
            i10 += 12;
        }
        return ((((yk.a.k(ReactFontManager.TypefaceStyle.NORMAL, j) + ((yk.a.k(4, j) + (365 * j)) - yk.a.k(100, j))) + ((long) (((i10 + 1) * 153) / 5))) - 123) + ((long) i11)) - 678881;
    }

    public static long U(long j) {
        long j5;
        long jA = yk.a.A(j, 678881L);
        long jK = yk.a.k(146097, jA);
        int iM = yk.a.m(146097, jA);
        int i7 = 29;
        int i10 = 2;
        if (iM == 146096) {
            j5 = (jK + 1) * 400;
        } else {
            int i11 = iM / 36524;
            int i12 = iM % 36524;
            int i13 = i12 / 1461;
            int i14 = i12 % 1461;
            if (i14 == 1460) {
                j5 = (jK * 400) + ((long) (i11 * 100)) + ((long) ((i13 + 1) * 4));
            } else {
                int i15 = i14 / 365;
                int i16 = i14 % 365;
                j5 = (jK * 400) + ((long) (i11 * 100)) + ((long) (i13 * 4)) + ((long) i15);
                int i17 = ((i16 + 31) * 5) / 153;
                i10 = i17 + 2;
                i7 = (i16 - (((i17 + 3) * 153) / 5)) + 123;
                if (i10 > 12) {
                    j5++;
                    i10 = i17 - 10;
                }
            }
        }
        if (j5 < -999999999 || j5 > 999999999) {
            throw new IllegalArgumentException(kk.b.i(j5, "Year out of range: "));
        }
        return (j5 << 32) | ((long) (i10 << 16)) | ((long) i7);
    }

    public static String V(int i7, int i10, int i11) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i7);
        sb2.append('-');
        if (i10 < 10) {
            sb2.append('0');
        }
        sb2.append(i10);
        sb2.append('-');
        if (i11 < 10) {
            sb2.append('0');
        }
        sb2.append(i11);
        return sb2.toString();
    }

    public static final e4.c a(String sectionName) {
        Intrinsics.checkNotNullParameter(sectionName, "sectionName");
        return new e4.c(sectionName);
    }

    public static final int b(long[] jArr, long j) {
        int length = jArr.length - 1;
        int i7 = 0;
        while (i7 <= length) {
            int i10 = (i7 + length) >>> 1;
            long j5 = jArr[i10];
            if (j > j5) {
                i7 = i10 + 1;
            } else {
                if (j >= j5) {
                    return i10;
                }
                length = i10 - 1;
            }
        }
        return -(i7 + 1);
    }

    public static void c(int i7, int i10, int i11) {
        if (i7 < -999999999 || i7 > 999999999) {
            throw new IllegalArgumentException(kk.b.h(i7, "YEAR out of range: "));
        }
        if (i10 < 1 || i10 > 12) {
            throw new IllegalArgumentException(kk.b.h(i10, "MONTH out of range: "));
        }
        if (i11 < 1 || i11 > 31) {
            throw new IllegalArgumentException(kk.b.h(i11, "DAY_OF_MONTH out of range: "));
        }
        if (i11 <= t(i7, i10)) {
            return;
        }
        throw new IllegalArgumentException("DAY_OF_MONTH exceeds month length in given year: " + V(i7, i10, i11));
    }

    public static void f(long j, w wVar, pc.x[] xVarArr) {
        int i7;
        int iU;
        while (true) {
            if (wVar.a() <= 1) {
                return;
            }
            int i10 = 0;
            while (true) {
                if (wVar.a() == 0) {
                    i7 = -1;
                    break;
                }
                int iU2 = wVar.u();
                i10 += iU2;
                if (iU2 != 255) {
                    i7 = i10;
                    break;
                }
            }
            int i11 = 0;
            do {
                if (wVar.a() == 0) {
                    i11 = -1;
                    break;
                } else {
                    iU = wVar.u();
                    i11 += iU;
                }
            } while (iU == 255);
            int i12 = wVar.f13861b + i11;
            if (i11 == -1 || i11 > wVar.a()) {
                je.b.N("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                i12 = wVar.f13862c;
            } else if (i7 == 4 && i11 >= 8) {
                int iU3 = wVar.u();
                int iZ = wVar.z();
                int iG = iZ == 49 ? wVar.g() : 0;
                int iU4 = wVar.u();
                if (iZ == 47) {
                    wVar.G(1);
                }
                boolean z5 = iU3 == 181 && (iZ == 49 || iZ == 47) && iU4 == 3;
                if (iZ == 49) {
                    z5 &= iG == 1195456820;
                }
                if (z5) {
                    g(j, wVar, xVarArr);
                }
            }
            wVar.F(i12);
        }
    }

    public static void g(long j, w wVar, pc.x[] xVarArr) {
        long j5;
        int iU = wVar.u();
        if ((iU & 64) != 0) {
            wVar.G(1);
            int i7 = (iU & 31) * 3;
            int i10 = wVar.f13861b;
            int length = xVarArr.length;
            int i11 = 0;
            while (i11 < length) {
                pc.x xVar = xVarArr[i11];
                wVar.F(i10);
                xVar.d(i7, wVar);
                if (j != -9223372036854775807L) {
                    j5 = j;
                    xVar.c(j5, 1, i7, 0, null);
                } else {
                    j5 = j;
                }
                i11++;
                j = j5;
            }
        }
    }

    public static final int h(z zVar) {
        Intrinsics.checkNotNullParameter(zVar, "<this>");
        wo.b bVarZ = zVar.getAnnotations().z(so.o.f20383q);
        if (bVarZ == null) {
            return 0;
        }
        zp.g gVar = (zp.g) w0.e(bVarZ.b(), so.p.f20397e);
        Intrinsics.checkNotNull(gVar, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.constants.IntValue");
        return ((Number) ((zp.k) gVar).f24066a).intValue();
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0101  */
    public static final d0 i(so.i builtIns, wo.h annotations, z zVar, List contextReceiverTypes, ArrayList parameterTypes, z returnType, boolean z5) {
        vo.f fVarK;
        wo.h iVar;
        Intrinsics.checkNotNullParameter(builtIns, "builtIns");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(contextReceiverTypes, "contextReceiverTypes");
        Intrinsics.checkNotNullParameter(parameterTypes, "parameterTypes");
        Intrinsics.checkNotNullParameter(returnType, "returnType");
        Intrinsics.checkNotNullParameter(contextReceiverTypes, "contextReceiverTypes");
        Intrinsics.checkNotNullParameter(parameterTypes, "parameterTypes");
        Intrinsics.checkNotNullParameter(returnType, "returnType");
        Intrinsics.checkNotNullParameter(builtIns, "builtIns");
        ArrayList arrayList = new ArrayList(contextReceiverTypes.size() + parameterTypes.size() + (zVar != null ? 1 : 0) + 1);
        ArrayList arrayList2 = new ArrayList(e0.l(contextReceiverTypes, 10));
        Iterator it = contextReceiverTypes.iterator();
        while (it.hasNext()) {
            arrayList2.add(c9.a.e((z) it.next()));
        }
        arrayList.addAll(arrayList2);
        vq.m.b(arrayList, zVar != null ? c9.a.e(zVar) : null);
        int i7 = 0;
        for (Object obj : parameterTypes) {
            int i10 = i7 + 1;
            if (i7 < 0) {
                kotlin.collections.d0.k();
                throw null;
            }
            arrayList.add(c9.a.e((z) obj));
            i7 = i10;
        }
        arrayList.add(c9.a.e(returnType));
        int size = contextReceiverTypes.size() + parameterTypes.size() + (zVar == null ? 0 : 1);
        Intrinsics.checkNotNullParameter(builtIns, "builtIns");
        if (z5) {
            fVarK = builtIns.w(size);
        } else {
            builtIns.getClass();
            up.e eVar = so.p.f20393a;
            fVarK = builtIns.k("Function" + size);
        }
        Intrinsics.checkNotNull(fVarK);
        wo.h iVar2 = wo.g.f22379a;
        if (zVar != null) {
            Intrinsics.checkNotNullParameter(annotations, "<this>");
            Intrinsics.checkNotNullParameter(builtIns, "builtIns");
            up.c cVar = so.o.f20382p;
            if (annotations.P(cVar)) {
                iVar = annotations;
            } else {
                ArrayList annotations2 = CollectionsKt.U(annotations, new wo.j(builtIns, cVar, w0.d()));
                Intrinsics.checkNotNullParameter(annotations2, "annotations");
                iVar = annotations2.isEmpty() ? iVar2 : new wo.i(0, annotations2);
            }
        } else {
            iVar = annotations;
        }
        if (!contextReceiverTypes.isEmpty()) {
            int size2 = contextReceiverTypes.size();
            Intrinsics.checkNotNullParameter(iVar, "<this>");
            Intrinsics.checkNotNullParameter(builtIns, "builtIns");
            up.c cVar2 = so.o.f20383q;
            if (!iVar.P(cVar2)) {
                ArrayList annotations3 = CollectionsKt.U(iVar, new wo.j(builtIns, cVar2, v0.b(new Pair(so.p.f20397e, new zp.k(size2)))));
                Intrinsics.checkNotNullParameter(annotations3, "annotations");
                if (!annotations3.isEmpty()) {
                    iVar2 = new wo.i(0, annotations3);
                }
                iVar = iVar2;
            }
        }
        return lq.c.s(lq.c.C(iVar), fVarK, arrayList);
    }

    public static final j0 j(vo.f from, vo.f to2) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to2, "to");
        from.l().size();
        to2.l().size();
        List listL = from.l();
        Intrinsics.checkNotNullExpressionValue(listL, "getDeclaredTypeParameters(...)");
        ArrayList arrayList = new ArrayList(e0.l(listL, 10));
        Iterator it = listL.iterator();
        while (it.hasNext()) {
            arrayList.add(((r0) it.next()).n());
        }
        List listL2 = to2.l();
        Intrinsics.checkNotNullExpressionValue(listL2, "getDeclaredTypeParameters(...)");
        ArrayList arrayList2 = new ArrayList(e0.l(listL2, 10));
        Iterator it2 = listL2.iterator();
        while (it2.hasNext()) {
            d0 d0VarJ = ((r0) it2.next()).j();
            Intrinsics.checkNotNullExpressionValue(d0VarJ, "getDefaultType(...)");
            arrayList2.add(c9.a.e(d0VarJ));
        }
        Map map = w0.l(CollectionsKt.n0(arrayList, arrayList2));
        Intrinsics.checkNotNullParameter(map, "map");
        return new j0(1, map);
    }

    public static final k1.b k(u poolFactory) {
        Intrinsics.checkNotNullParameter(poolFactory, "poolFactory");
        int i7 = ((pa.t) poolFactory.f17839d).f17832c.f17849d;
        Pools$SynchronizedPool pools$SynchronizedPool = new Pools$SynchronizedPool(i7);
        for (int i10 = 0; i10 < i7; i10++) {
            hs.c cVar = q8.a.f18629a;
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16384);
            Intrinsics.checkNotNullExpressionValue(byteBufferAllocate, "allocate(...)");
            pools$SynchronizedPool.release(byteBufferAllocate);
        }
        return pools$SynchronizedPool;
    }

    public static final q1 l(mo.c cVar, List arguments, boolean z5, List annotations) {
        vo.i descriptor;
        lq.l0 l0Var;
        i0 i0Var;
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        c0 c0Var = cVar instanceof c0 ? (c0) cVar : null;
        if (c0Var == null || (descriptor = c0Var.getDescriptor()) == null) {
            throw new a0("Cannot create type for an unsupported classifier: " + cVar + " (" + cVar.getClass() + ')');
        }
        q0 q0VarN = descriptor.n();
        Intrinsics.checkNotNullExpressionValue(q0VarN, "getTypeConstructor(...)");
        List parameters = q0VarN.getParameters();
        Intrinsics.checkNotNullExpressionValue(parameters, "getParameters(...)");
        if (parameters.size() != arguments.size()) {
            throw new IllegalArgumentException("Class declares " + parameters.size() + " type parameters, but " + arguments.size() + " were provided.");
        }
        if (annotations.isEmpty()) {
            lq.l0.f15225e.getClass();
            l0Var = lq.l0.f15226i;
        } else {
            lq.l0.f15225e.getClass();
            l0Var = lq.l0.f15226i;
        }
        List parameters2 = q0VarN.getParameters();
        Intrinsics.checkNotNullExpressionValue(parameters2, "getParameters(...)");
        ArrayList arrayList = new ArrayList(e0.l(arguments, 10));
        int i7 = 0;
        for (Object obj : arguments) {
            int i10 = i7 + 1;
            if (i7 < 0) {
                kotlin.collections.d0.k();
                throw null;
            }
            KTypeProjection kTypeProjection = (KTypeProjection) obj;
            q1 q1Var = (q1) kTypeProjection.f14694b;
            z zVar = q1Var != null ? q1Var.f18132d : null;
            mo.w wVar = kTypeProjection.f14693a;
            int i11 = wVar == null ? -1 : no.a.f16980a[wVar.ordinal()];
            if (i11 == -1) {
                Object obj2 = parameters2.get(i7);
                Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
                i0Var = new i0((r0) obj2);
            } else if (i11 == 1) {
                e1 e1Var = e1.INVARIANT;
                Intrinsics.checkNotNull(zVar);
                i0Var = new i0(zVar, e1Var);
            } else if (i11 == 2) {
                e1 e1Var2 = e1.IN_VARIANCE;
                Intrinsics.checkNotNull(zVar);
                i0Var = new i0(zVar, e1Var2);
            } else {
                if (i11 != 3) {
                    throw new rn.n();
                }
                e1 e1Var3 = e1.OUT_VARIANCE;
                Intrinsics.checkNotNull(zVar);
                i0Var = new i0(zVar, e1Var3);
            }
            arrayList.add(i0Var);
            i7 = i10;
        }
        return new q1(lq.c.t(arrayList, l0Var, q0VarN, z5), null);
    }

    public static int m(String str, int i7, int i10, boolean z5) {
        while (i7 < i10) {
            int i11 = i7 + 1;
            char cCharAt = str.charAt(i7);
            if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || (cCharAt <= '9' && '0' <= cCharAt) || ((cCharAt <= 'z' && 'a' <= cCharAt) || ((cCharAt <= 'Z' && 'A' <= cCharAt) || cCharAt == ':'))) == (!z5)) {
                return i7;
            }
            i7 = i11;
        }
        return i10;
    }

    public static boolean n() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            ji.f.b();
            ji.f fVarB = ji.f.b();
            fVarB.a();
            Context context = fVarB.f13890a;
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("export_to_big_query")) {
                return sharedPreferences.getBoolean("export_to_big_query", false);
            }
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("delivery_metrics_exported_to_big_query_enabled")) {
                    return applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            return false;
        } catch (IllegalStateException unused2) {
            Log.i("FirebaseMessaging", "FirebaseApp has not being initialized. Device might be in direct boot mode. Skip exporting delivery metrics to Big Query");
            return false;
        }
    }

    public static final WritableMap o(gn.a insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble(ViewProps.TOP, PixelUtil.toDIPFromPixel(insets.f10128a));
        writableMapCreateMap.putDouble(ViewProps.RIGHT, PixelUtil.toDIPFromPixel(insets.f10129b));
        writableMapCreateMap.putDouble(ViewProps.BOTTOM, PixelUtil.toDIPFromPixel(insets.f10130c));
        writableMapCreateMap.putDouble(ViewProps.LEFT, PixelUtil.toDIPFromPixel(insets.f10131d));
        return writableMapCreateMap;
    }

    public static final up.e p(z zVar) {
        String str;
        Intrinsics.checkNotNullParameter(zVar, "<this>");
        wo.b bVarZ = zVar.getAnnotations().z(so.o.f20384r);
        if (bVarZ != null) {
            Object objA0 = CollectionsKt.a0(bVarZ.b().values());
            zp.x xVar = objA0 instanceof zp.x ? (zp.x) objA0 : null;
            if (xVar != null && (str = (String) xVar.f24066a) != null) {
                if (!up.e.f(str)) {
                    str = null;
                }
                if (str != null) {
                    return up.e.e(str);
                }
            }
        }
        return null;
    }

    public static final List q(z zVar) {
        Intrinsics.checkNotNullParameter(zVar, "<this>");
        y(zVar);
        int iH = h(zVar);
        if (iH == 0) {
            return n0.f14659d;
        }
        List listSubList = zVar.l0().subList(0, iH);
        ArrayList arrayList = new ArrayList(e0.l(listSubList, 10));
        Iterator it = listSubList.iterator();
        while (it.hasNext()) {
            arrayList.add(((t0) it.next()).b());
        }
        return arrayList;
    }

    public static int r(int i7, int i10, int i11) {
        if (i11 >= 1) {
            int i12 = 31;
            if (i11 <= 31) {
                if (i11 > t(i7, i10)) {
                    throw new IllegalArgumentException("Day exceeds month length: " + V(i7, i10, i11));
                }
                switch (i10) {
                    case 1:
                        i12 = 28;
                        break;
                    case 2:
                        break;
                    case 3:
                        i12 = 2;
                        break;
                    case 4:
                        i12 = 5;
                        break;
                    case 5:
                        i12 = 7;
                        break;
                    case 6:
                        i12 = 10;
                        break;
                    case 7:
                        i12 = 12;
                        break;
                    case 8:
                        i12 = 15;
                        break;
                    case 9:
                        i12 = 18;
                        break;
                    case 10:
                        i12 = 20;
                        break;
                    case 11:
                        i12 = 23;
                        break;
                    case 12:
                        i12 = 25;
                        break;
                    default:
                        throw new IllegalArgumentException(kk.b.h(i10, "Month out of range: "));
                }
                int i13 = i7 % 100;
                int iJ = yk.a.j(i7, 100);
                if (i13 < 0) {
                    i13 += 100;
                }
                if (i10 <= 2 && (i13 = i13 - 1) < 0) {
                    iJ--;
                    i13 = 99;
                }
                int iJ2 = ((((i13 / 4) + ((i11 + i12) + i13)) + yk.a.j(iJ, 4)) - (iJ * 2)) % 7;
                return iJ2 <= 0 ? iJ2 + 7 : iJ2;
            }
        }
        throw new IllegalArgumentException(kk.b.h(i11, "Day out of range: "));
    }

    public static final to.k s(vo.i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        if (!(iVar instanceof vo.f) || !so.i.J(iVar)) {
            return null;
        }
        up.d dVarH = bq.e.h(iVar);
        if (!dVarH.d() || dVarH.c()) {
            return null;
        }
        to.m mVar = to.m.f20868c;
        up.c packageFqName = dVarH.g().b();
        String className = dVarH.f().b();
        Intrinsics.checkNotNullExpressionValue(className, "asString(...)");
        mVar.getClass();
        Intrinsics.checkNotNullParameter(packageFqName, "packageFqName");
        Intrinsics.checkNotNullParameter(className, "className");
        to.l lVarA = mVar.a(className, packageFqName);
        if (lVarA != null) {
            return lVarA.f20866a;
        }
        return null;
    }

    public static int t(int i7, int i10) {
        switch (i10) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 2:
                return A(i7) ? 29 : 28;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                throw new IllegalArgumentException(kk.b.h(i10, "Invalid month: "));
        }
    }

    public static final z u(z zVar) {
        Intrinsics.checkNotNullParameter(zVar, "<this>");
        y(zVar);
        if (zVar.getAnnotations().z(so.o.f20382p) == null) {
            return null;
        }
        return ((t0) zVar.l0().get(h(zVar))).b();
    }

    public static final List v(z zVar) {
        Intrinsics.checkNotNullParameter(zVar, "<this>");
        y(zVar);
        List listL0 = zVar.l0();
        int iH = h(zVar);
        Intrinsics.checkNotNullParameter(zVar, "<this>");
        return listL0.subList(((!y(zVar) || zVar.getAnnotations().z(so.o.f20382p) == null) ? 0 : 1) + iH, listL0.size() - 1);
    }

    public static final boolean y(z zVar) {
        Intrinsics.checkNotNullParameter(zVar, "<this>");
        vo.i iVarG = zVar.r0().g();
        if (iVarG == null) {
            return false;
        }
        Intrinsics.checkNotNullParameter(iVarG, "<this>");
        to.k kVarS = s(iVarG);
        return Intrinsics.areEqual(kVarS, to.g.f20860c) || Intrinsics.areEqual(kVarS, to.j.f20863c);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0038  */
    public static boolean z(Response response, Request request) {
        Intrinsics.checkNotNullParameter(response, "response");
        Intrinsics.checkNotNullParameter(request, "request");
        int i7 = response.f17382v;
        if (i7 != 200 && i7 != 410 && i7 != 414 && i7 != 501 && i7 != 203 && i7 != 204) {
            if (i7 == 307) {
                if (response.f("Expires", null) == null && response.c().f17292c == -1 && !response.c().f17295f && !response.c().f17294e) {
                    return false;
                }
            } else if (i7 != 308 && i7 != 404 && i7 != 405) {
                switch (i7) {
                    case ReactImageView.REMOTE_IMAGE_FADE_DURATION_MS /* 300 */:
                    case 301:
                        break;
                    case 302:
                        if (response.f("Expires", null) == null) {
                            return false;
                        }
                        break;
                    default:
                        return false;
                }
            }
        }
        if (response.c().f17291b) {
            return false;
        }
        CacheControl cacheControlB = request.f17373f;
        if (cacheControlB == null) {
            int i10 = CacheControl.f17289n;
            cacheControlB = sa.a.B(request.f17370c);
            request.f17373f = cacheControlB;
        }
        return !cacheControlB.f17291b;
    }

    public abstract void J(int i7);

    public abstract void K(View view, int i7, int i10);

    public abstract void L(float f2, float f7, View view);

    public abstract boolean W(int i7, View view);

    public abstract int d(int i7, View view);

    public abstract int e(int i7, View view);

    public int w(View view) {
        return 0;
    }

    public int x() {
        return 0;
    }

    public void H() {
    }

    public void G(int i7, int i10) {
    }

    public void I(int i7, View view) {
    }
}

package cs;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.n0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.CookieJar;
import okhttp3.HttpUrl;
import okio.Buffer;

/* JADX INFO: loaded from: classes.dex */
public final class o implements b, CookieJar, n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final o f7458d = new o();

    public static final l a(o oVar, String str) {
        l lVar = new l(str);
        l.f7435d.put(str, lVar);
        return lVar;
    }

    public static String b(String str, int i7, String encodeSet, int i10, int i11) {
        int i12 = (i11 & 1) != 0 ? 0 : i7;
        int length = (i11 & 2) != 0 ? str.length() : i10;
        boolean z5 = (i11 & 8) == 0;
        boolean z6 = (i11 & 16) == 0;
        boolean z7 = (i11 & 32) == 0;
        boolean z10 = (i11 & 64) == 0;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(encodeSet, "encodeSet");
        int iCharCount = i12;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            int i13 = IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
            int i14 = 32;
            if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z10) || StringsKt.E(encodeSet, (char) iCodePointAt) || ((iCodePointAt == 37 && (!z5 || (z6 && !d(iCharCount, length, str)))) || (iCodePointAt == 43 && z7)))) {
                Buffer buffer = new Buffer();
                buffer.j0(i12, iCharCount, str);
                Buffer buffer2 = null;
                while (iCharCount < length) {
                    int iCodePointAt2 = str.codePointAt(iCharCount);
                    if (!z5 || (iCodePointAt2 != 9 && iCodePointAt2 != 10 && iCodePointAt2 != 12 && iCodePointAt2 != 13)) {
                        if (iCodePointAt2 == 43 && z7) {
                            buffer.l0(z5 ? "+" : "%2B");
                        } else if (iCodePointAt2 < i14 || iCodePointAt2 == 127 || ((iCodePointAt2 >= i13 && !z10) || StringsKt.E(encodeSet, (char) iCodePointAt2) || (iCodePointAt2 == 37 && (!z5 || (z6 && !d(iCharCount, length, str)))))) {
                            if (buffer2 == null) {
                                buffer2 = new Buffer();
                            }
                            buffer2.m0(iCodePointAt2);
                            while (!buffer2.l()) {
                                byte b10 = buffer2.readByte();
                                buffer.U(37);
                                char[] cArr = HttpUrl.j;
                                buffer.U(cArr[((b10 & 255) >> 4) & 15]);
                                buffer.U(cArr[b10 & 15]);
                            }
                        } else {
                            buffer.m0(iCodePointAt2);
                        }
                    }
                    iCharCount += Character.charCount(iCodePointAt2);
                    i13 = IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                    i14 = 32;
                }
                return buffer.V();
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        String strSubstring = str.substring(i12, length);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static boolean d(int i7, int i10, String str) {
        int i11 = i7 + 2;
        return i11 < i10 && str.charAt(i7) == '%' && ds.b.q(str.charAt(i7 + 1)) != -1 && ds.b.q(str.charAt(i11)) != -1;
    }

    public static String e(int i7, String str, int i10, int i11) {
        int i12;
        if ((i11 & 1) != 0) {
            i7 = 0;
        }
        if ((i11 & 2) != 0) {
            i10 = str.length();
        }
        boolean z5 = (i11 & 4) == 0;
        Intrinsics.checkNotNullParameter(str, "<this>");
        int iCharCount = i7;
        while (iCharCount < i10) {
            int i13 = iCharCount + 1;
            char cCharAt = str.charAt(iCharCount);
            if (cCharAt == '%' || (cCharAt == '+' && z5)) {
                Buffer buffer = new Buffer();
                buffer.j0(i7, iCharCount, str);
                while (iCharCount < i10) {
                    int iCodePointAt = str.codePointAt(iCharCount);
                    if (iCodePointAt == 37 && (i12 = iCharCount + 2) < i10) {
                        int iQ = ds.b.q(str.charAt(iCharCount + 1));
                        int iQ2 = ds.b.q(str.charAt(i12));
                        if (iQ == -1 || iQ2 == -1) {
                            buffer.m0(iCodePointAt);
                            iCharCount += Character.charCount(iCodePointAt);
                        } else {
                            buffer.U((iQ << 4) + iQ2);
                            iCharCount = Character.charCount(iCodePointAt) + i12;
                        }
                    } else if (iCodePointAt == 43 && z5) {
                        buffer.U(32);
                        iCharCount++;
                    } else {
                        buffer.m0(iCodePointAt);
                        iCharCount += Character.charCount(iCodePointAt);
                    }
                }
                return buffer.V();
            }
            iCharCount = i13;
        }
        String strSubstring = str.substring(i7, i10);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static ArrayList f(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        ArrayList arrayList = new ArrayList();
        int i7 = 0;
        while (i7 <= str.length()) {
            int I = StringsKt.I(str, '&', i7, 4);
            if (I == -1) {
                I = str.length();
            }
            int I2 = StringsKt.I(str, '=', i7, 4);
            if (I2 == -1 || I2 > I) {
                String strSubstring = str.substring(i7, I);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(strSubstring);
                arrayList.add(null);
            } else {
                String strSubstring2 = str.substring(i7, I2);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(strSubstring2);
                String strSubstring3 = str.substring(I2 + 1, I);
                Intrinsics.checkNotNullExpressionValue(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(strSubstring3);
            }
            i7 = I + 1;
        }
        return arrayList;
    }

    public static void g(StringBuilder out, List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(out, "out");
        kotlin.ranges.a aVarG = lo.j.g(2, lo.j.i(0, list.size()));
        int i7 = aVarG.f14688d;
        int i10 = aVarG.f14689e;
        int i11 = aVarG.f14690i;
        if ((i11 <= 0 || i7 > i10) && (i11 >= 0 || i10 > i7)) {
            return;
        }
        while (true) {
            int i12 = i7 + i11;
            String str = (String) list.get(i7);
            String str2 = (String) list.get(i7 + 1);
            if (i7 > 0) {
                out.append('&');
            }
            out.append(str);
            if (str2 != null) {
                out.append('=');
                out.append(str2);
            }
            if (i7 == i10) {
                return;
            } else {
                i7 = i12;
            }
        }
    }

    public synchronized l c(String javaName) {
        l lVar;
        String strStringPlus;
        try {
            Intrinsics.checkNotNullParameter(javaName, "javaName");
            LinkedHashMap linkedHashMap = l.f7435d;
            lVar = (l) linkedHashMap.get(javaName);
            if (lVar == null) {
                if (kotlin.text.x.o(javaName, "TLS_", false)) {
                    String strSubstring = javaName.substring(4);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
                    strStringPlus = Intrinsics.stringPlus("SSL_", strSubstring);
                } else if (kotlin.text.x.o(javaName, "SSL_", false)) {
                    String strSubstring2 = javaName.substring(4);
                    Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String).substring(startIndex)");
                    strStringPlus = Intrinsics.stringPlus("TLS_", strSubstring2);
                } else {
                    strStringPlus = javaName;
                }
                lVar = (l) linkedHashMap.get(strStringPlus);
                if (lVar == null) {
                    lVar = new l(javaName);
                }
                linkedHashMap.put(javaName, lVar);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return lVar;
    }

    @Override // okhttp3.CookieJar
    public List loadForRequest(HttpUrl url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return n0.f14659d;
    }

    @Override // cs.n
    public List lookup(String hostname) throws UnknownHostException {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        try {
            InetAddress[] allByName = InetAddress.getAllByName(hostname);
            Intrinsics.checkNotNullExpressionValue(allByName, "getAllByName(hostname)");
            return kotlin.collections.y.H(allByName);
        } catch (NullPointerException e10) {
            UnknownHostException unknownHostException = new UnknownHostException(Intrinsics.stringPlus("Broken system behaviour for dns lookup of ", hostname));
            unknownHostException.initCause(e10);
            throw unknownHostException;
        }
    }

    @Override // okhttp3.CookieJar
    public void saveFromResponse(HttpUrl url, List cookies) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(cookies, "cookies");
    }
}

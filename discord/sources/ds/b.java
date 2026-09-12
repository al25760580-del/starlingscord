package ds;

import com.facebook.react.devsupport.StackTraceHelper;
import io.sentry.hints.j;
import j$.util.DesugarTimeZone;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import js.c;
import kotlin.collections.CollectionsKt;
import kotlin.collections.d0;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.x;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.e;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.Source;
import rn.f;
import rs.m;
import rs.v;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f7815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Headers f7816b = zs.a.L(new String[0]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f7817c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final m f7818d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final TimeZone f7819e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Regex f7820f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f7821g;

    static {
        byte[] bArr = new byte[0];
        f7815a = bArr;
        ResponseBody.Companion.getClass();
        f7817c = ResponseBody.Companion.c(bArr, null);
        RequestBody.Companion.d(RequestBody.Companion, bArr, null, 0, 7);
        int i7 = m.f19581v;
        ByteString byteString = ByteString.f17414v;
        f7818d = v.h(j.y("efbbbf"), j.y("feff"), j.y("fffe"), j.y("0000ffff"), j.y("ffff0000"));
        TimeZone timeZone = DesugarTimeZone.getTimeZone("GMT");
        Intrinsics.checkNotNull(timeZone);
        f7819e = timeZone;
        f7820f = new Regex("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        String name = OkHttpClient.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "OkHttpClient::class.java.name");
        f7821g = StringsKt.O(StringsKt.N(name, "okhttp3."), "Client");
    }

    public static final boolean a(HttpUrl httpUrl, HttpUrl other) {
        Intrinsics.checkNotNullParameter(httpUrl, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return Intrinsics.areEqual(httpUrl.f17323d, other.f17323d) && httpUrl.f17324e == other.f17324e && Intrinsics.areEqual(httpUrl.f17320a, other.f17320a);
    }

    public static final int b(long j, TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter("timeout", StackTraceHelper.NAME_KEY);
        if (j < 0) {
            throw new IllegalStateException(Intrinsics.stringPlus("timeout", " < 0").toString());
        }
        if (timeUnit == null) {
            throw new IllegalStateException("unit == null");
        }
        long millis = timeUnit.toMillis(j);
        if (millis > 2147483647L) {
            throw new IllegalArgumentException(Intrinsics.stringPlus("timeout", " too large.").toString());
        }
        if (millis != 0 || j <= 0) {
            return (int) millis;
        }
        throw new IllegalArgumentException(Intrinsics.stringPlus("timeout", " too small.").toString());
    }

    public static final void c(Closeable closeable) {
        Intrinsics.checkNotNullParameter(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception unused) {
        }
    }

    public static final void d(Socket socket) {
        Intrinsics.checkNotNullParameter(socket, "<this>");
        try {
            socket.close();
        } catch (AssertionError e10) {
            throw e10;
        } catch (RuntimeException e11) {
            if (!Intrinsics.areEqual(e11.getMessage(), "bio == null")) {
                throw e11;
            }
        } catch (Exception unused) {
        }
    }

    public static final int e(char c8, int i7, int i10, String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        while (i7 < i10) {
            int i11 = i7 + 1;
            if (str.charAt(i7) == c8) {
                return i7;
            }
            i7 = i11;
        }
        return i10;
    }

    public static final int f(int i7, int i10, String str, String delimiters) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiters, "delimiters");
        while (i7 < i10) {
            int i11 = i7 + 1;
            if (StringsKt.E(delimiters, str.charAt(i7))) {
                return i7;
            }
            i7 = i11;
        }
        return i10;
    }

    public static /* synthetic */ int g(char c8, int i7, int i10, int i11, String str) {
        if ((i11 & 2) != 0) {
            i7 = 0;
        }
        if ((i11 & 4) != 0) {
            i10 = str.length();
        }
        return e(c8, i7, i10, str);
    }

    public static final String h(String format, Object... args) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(args, "args");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
        return a3.e.q(objArrCopyOf, objArrCopyOf.length, locale, format, "format(locale, format, *args)");
    }

    public static final boolean i(String[] strArr, String[] strArr2, Comparator comparator) {
        Intrinsics.checkNotNullParameter(strArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            int length = strArr.length;
            int i7 = 0;
            while (i7 < length) {
                String str = strArr[i7];
                i7++;
                Iterator it = ArrayIteratorKt.iterator(strArr2);
                while (it.hasNext()) {
                    if (comparator.compare(str, (String) it.next()) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final long j(Response response) {
        Intrinsics.checkNotNullParameter(response, "<this>");
        String strA = response.f17384x.a("Content-Length");
        if (strA == null) {
            return -1L;
        }
        Intrinsics.checkNotNullParameter(strA, "<this>");
        try {
            return Long.parseLong(strA);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static final List k(Object... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Object[] objArr = (Object[]) elements.clone();
        List listUnmodifiableList = Collections.unmodifiableList(d0.g(Arrays.copyOf(objArr, objArr.length)));
        Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "unmodifiableList(listOf(*elements.clone()))");
        return listUnmodifiableList;
    }

    public static final int l(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int length = str.length();
        int i7 = 0;
        while (i7 < length) {
            int i10 = i7 + 1;
            char cCharAt = str.charAt(i7);
            if (Intrinsics.compare((int) cCharAt, 31) <= 0 || Intrinsics.compare((int) cCharAt, 127) >= 0) {
                return i7;
            }
            i7 = i10;
        }
        return -1;
    }

    public static final int m(int i7, int i10, String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        while (i7 < i10) {
            int i11 = i7 + 1;
            char cCharAt = str.charAt(i7);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i7;
            }
            i7 = i11;
        }
        return i10;
    }

    public static final int n(int i7, int i10, String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int i11 = i10 - 1;
        if (i7 <= i11) {
            while (true) {
                int i12 = i11 - 1;
                char cCharAt = str.charAt(i11);
                if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                    return i11 + 1;
                }
                if (i11 != i7) {
                    i11 = i12;
                }
            }
        }
        return i7;
    }

    public static final String[] o(String[] strArr, String[] other, Comparator comparator) {
        Intrinsics.checkNotNullParameter(strArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        ArrayList arrayList = new ArrayList();
        int length = strArr.length;
        int i7 = 0;
        while (i7 < length) {
            String str = strArr[i7];
            i7++;
            int length2 = other.length;
            int i10 = 0;
            while (i10 < length2) {
                String str2 = other[i10];
                i10++;
                if (comparator.compare(str, str2) == 0) {
                    arrayList.add(str);
                    break;
                }
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return (String[]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    public static final boolean p(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return x.i(name, "Authorization", true) || x.i(name, "Cookie", true) || x.i(name, "Proxy-Authorization", true) || x.i(name, "Set-Cookie", true);
    }

    public static final int q(char c8) {
        if ('0' <= c8 && c8 < ':') {
            return c8 - '0';
        }
        if ('a' <= c8 && c8 < 'g') {
            return c8 - 'W';
        }
        if ('A' > c8 || c8 >= 'G') {
            return -1;
        }
        return c8 - '7';
    }

    public static final Charset r(BufferedSource bufferedSource, Charset charset) {
        Intrinsics.checkNotNullParameter(bufferedSource, "<this>");
        Intrinsics.checkNotNullParameter(charset, "default");
        int iB0 = bufferedSource.b0(f7818d);
        if (iB0 == -1) {
            return charset;
        }
        if (iB0 == 0) {
            Charset UTF_8 = StandardCharsets.UTF_8;
            Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
            return UTF_8;
        }
        if (iB0 == 1) {
            Charset UTF_16BE = StandardCharsets.UTF_16BE;
            Intrinsics.checkNotNullExpressionValue(UTF_16BE, "UTF_16BE");
            return UTF_16BE;
        }
        if (iB0 == 2) {
            Charset UTF_16LE = StandardCharsets.UTF_16LE;
            Intrinsics.checkNotNullExpressionValue(UTF_16LE, "UTF_16LE");
            return UTF_16LE;
        }
        if (iB0 == 3) {
            Charsets.f14700a.getClass();
            Charset charset2 = Charsets.f14702c;
            if (charset2 != null) {
                return charset2;
            }
            Charset charsetForName = Charset.forName("UTF-32BE");
            Intrinsics.checkNotNullExpressionValue(charsetForName, "forName(...)");
            Charsets.f14702c = charsetForName;
            return charsetForName;
        }
        if (iB0 != 4) {
            throw new AssertionError();
        }
        Charsets.f14700a.getClass();
        Charset charset3 = Charsets.f14701b;
        if (charset3 != null) {
            return charset3;
        }
        Charset charsetForName2 = Charset.forName("UTF-32LE");
        Intrinsics.checkNotNullExpressionValue(charsetForName2, "forName(...)");
        Charsets.f14701b = charsetForName2;
        return charsetForName2;
    }

    public static final int s(BufferedSource bufferedSource) {
        Intrinsics.checkNotNullParameter(bufferedSource, "<this>");
        return (bufferedSource.readByte() & 255) | ((bufferedSource.readByte() & 255) << 16) | ((bufferedSource.readByte() & 255) << 8);
    }

    public static final boolean t(Source source, int i7) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        Intrinsics.checkNotNullParameter(source, "<this>");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        long jNanoTime = System.nanoTime();
        long jC = source.timeout().e() ? source.timeout().c() - jNanoTime : Long.MAX_VALUE;
        source.timeout().d(Math.min(jC, timeUnit.toNanos(i7)) + jNanoTime);
        try {
            Buffer buffer = new Buffer();
            while (source.read(buffer, 8192L) != -1) {
                buffer.c();
            }
            if (jC == LongCompanionObject.MAX_VALUE) {
                source.timeout().a();
                return true;
            }
            source.timeout().d(jNanoTime + jC);
            return true;
        } catch (InterruptedIOException unused) {
            if (jC == LongCompanionObject.MAX_VALUE) {
                source.timeout().a();
                return false;
            }
            source.timeout().d(jNanoTime + jC);
            return false;
        } catch (Throwable th2) {
            if (jC == LongCompanionObject.MAX_VALUE) {
                source.timeout().a();
            } else {
                source.timeout().d(jNanoTime + jC);
            }
            throw th2;
        }
    }

    public static final Headers u(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList(20);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            ByteString byteString = cVar.f14104a;
            ByteString byteString2 = cVar.f14105b;
            String name = byteString.k();
            String value = byteString2.k();
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            arrayList.add(name);
            arrayList.add(StringsKt.b0(value).toString());
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return new Headers((String[]) array);
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    public static final String v(HttpUrl httpUrl, boolean z5) {
        int i7;
        Intrinsics.checkNotNullParameter(httpUrl, "<this>");
        String strG = httpUrl.f17323d;
        int i10 = httpUrl.f17324e;
        if (StringsKt.D(strG, ":", false)) {
            strG = kk.b.g(']', "[", strG);
        }
        if (!z5) {
            String scheme = httpUrl.f17320a;
            Intrinsics.checkNotNullParameter(scheme, "scheme");
            if (Intrinsics.areEqual(scheme, "http")) {
                i7 = 80;
            } else {
                i7 = Intrinsics.areEqual(scheme, "https") ? 443 : -1;
            }
            if (i10 == i7) {
                return strG;
            }
        }
        return strG + ':' + i10;
    }

    public static final List w(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List listUnmodifiableList = Collections.unmodifiableList(CollectionsKt.j0(list));
        Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "unmodifiableList(toMutableList())");
        return listUnmodifiableList;
    }

    public static final int x(int i7, String str) {
        Long lValueOf;
        if (str == null) {
            lValueOf = null;
        } else {
            try {
                lValueOf = Long.valueOf(Long.parseLong(str));
            } catch (NumberFormatException unused) {
                return i7;
            }
        }
        if (lValueOf == null) {
            return i7;
        }
        long jLongValue = lValueOf.longValue();
        if (jLongValue > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (jLongValue < 0) {
            return 0;
        }
        return (int) jLongValue;
    }

    public static final String y(int i7, int i10, String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int iM = m(i7, i10, str);
        String strSubstring = str.substring(iM, n(iM, i10, str));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static final void z(IOException iOException, List suppressed) {
        Intrinsics.checkNotNullParameter(iOException, "<this>");
        Intrinsics.checkNotNullParameter(suppressed, "suppressed");
        if (suppressed.size() > 1) {
            System.out.println(suppressed);
        }
        Iterator it = suppressed.iterator();
        while (it.hasNext()) {
            f.a(iOException, (Exception) it.next());
        }
    }
}

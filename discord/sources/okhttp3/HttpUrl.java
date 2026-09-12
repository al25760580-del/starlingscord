package okhttp3;

import com.discord.notifications.renderer.NotificationRenderer;
import cs.o;
import cs.r;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final class HttpUrl {
    public static final char[] j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17321b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f17322c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f17323d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f17324e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f17325f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f17326g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f17327h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f17328i;

    public HttpUrl(String scheme, String username, String password, String host, int i7, ArrayList pathSegments, ArrayList arrayList, String str, String url) {
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(password, "password");
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(pathSegments, "pathSegments");
        Intrinsics.checkNotNullParameter(url, "url");
        this.f17320a = scheme;
        this.f17321b = username;
        this.f17322c = password;
        this.f17323d = host;
        this.f17324e = i7;
        this.f17325f = arrayList;
        this.f17326g = str;
        this.f17327h = url;
        this.f17328i = Intrinsics.areEqual(scheme, "https");
    }

    public final String a() {
        if (this.f17322c.length() == 0) {
            return "";
        }
        int length = this.f17320a.length() + 3;
        String str = this.f17327h;
        String strSubstring = str.substring(StringsKt.I(str, ':', length, 4) + 1, StringsKt.I(str, '@', 0, 6));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final String b() {
        int length = this.f17320a.length() + 3;
        String str = this.f17327h;
        int I = StringsKt.I(str, '/', length, 4);
        String strSubstring = str.substring(I, ds.b.f(I, str.length(), str, "?#"));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final ArrayList c() {
        int length = this.f17320a.length() + 3;
        String str = this.f17327h;
        int I = StringsKt.I(str, '/', length, 4);
        int iF = ds.b.f(I, str.length(), str, "?#");
        ArrayList arrayList = new ArrayList();
        while (I < iF) {
            int i7 = I + 1;
            int iE = ds.b.e('/', i7, iF, str);
            String strSubstring = str.substring(i7, iE);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            arrayList.add(strSubstring);
            I = iE;
        }
        return arrayList;
    }

    public final String d() {
        if (this.f17325f == null) {
            return null;
        }
        String str = this.f17327h;
        int I = StringsKt.I(str, '?', 0, 6) + 1;
        String strSubstring = str.substring(I, ds.b.e('#', I, str.length(), str));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final String e() {
        if (this.f17321b.length() == 0) {
            return "";
        }
        int length = this.f17320a.length() + 3;
        String str = this.f17327h;
        String strSubstring = str.substring(length, ds.b.f(length, str.length(), str, ":@"));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof HttpUrl) && Intrinsics.areEqual(((HttpUrl) obj).f17327h, this.f17327h);
    }

    public final String f() {
        r rVar;
        Intrinsics.checkNotNullParameter("/...", "link");
        try {
            rVar = new r(0);
            rVar.g(this, "/...");
        } catch (IllegalArgumentException unused) {
            rVar = null;
        }
        Intrinsics.checkNotNull(rVar);
        rVar.getClass();
        Intrinsics.checkNotNullParameter("", NotificationRenderer.USERNAME);
        String strB = o.b("", 0, " \"':;<=>@[]^`{}|/\\?#", 0, 251);
        Intrinsics.checkNotNullParameter(strB, "<set-?>");
        rVar.f7468d = strB;
        Intrinsics.checkNotNullParameter("", "password");
        String strB2 = o.b("", 0, " \"':;<=>@[]^`{}|/\\?#", 0, 251);
        Intrinsics.checkNotNullParameter(strB2, "<set-?>");
        rVar.f7469e = strB2;
        return rVar.b().f17327h;
    }

    public final URI g() {
        String strSubstring;
        r rVar = new r(0);
        ArrayList arrayList = (ArrayList) rVar.f7472h;
        String scheme = this.f17320a;
        rVar.f7467c = scheme;
        String strE = e();
        Intrinsics.checkNotNullParameter(strE, "<set-?>");
        rVar.f7468d = strE;
        String strA = a();
        Intrinsics.checkNotNullParameter(strA, "<set-?>");
        rVar.f7469e = strA;
        rVar.f7470f = this.f17323d;
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        int i7 = Intrinsics.areEqual(scheme, "http") ? 80 : Intrinsics.areEqual(scheme, "https") ? 443 : -1;
        int i10 = this.f17324e;
        rVar.f7466b = i10 != i7 ? i10 : -1;
        arrayList.clear();
        arrayList.addAll(c());
        rVar.d(d());
        if (this.f17326g == null) {
            strSubstring = null;
        } else {
            String str = this.f17327h;
            strSubstring = str.substring(StringsKt.I(str, '#', 0, 6) + 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
        }
        rVar.f7471g = strSubstring;
        String str2 = (String) rVar.f7470f;
        rVar.f7470f = str2 == null ? null : new Regex("[\"<>^`{|}]").replace(str2, "");
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.set(i11, o.b((String) arrayList.get(i11), 0, "[]", 0, 227));
        }
        ArrayList arrayList2 = (ArrayList) rVar.f7473i;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            int i12 = 0;
            while (i12 < size2) {
                int i13 = i12 + 1;
                String str3 = (String) arrayList2.get(i12);
                arrayList2.set(i12, str3 == null ? null : o.b(str3, 0, "\\^`{|}", 0, 195));
                i12 = i13;
            }
        }
        String str4 = (String) rVar.f7471g;
        rVar.f7471g = str4 != null ? o.b(str4, 0, " \"#<>\\^`{|}", 0, 163) : null;
        String string = rVar.toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e10) {
            try {
                URI uriCreate = URI.create(new Regex("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").replace(string, ""));
                Intrinsics.checkNotNullExpressionValue(uriCreate, "{\n      // Unlikely edge…Unexpected!\n      }\n    }");
                return uriCreate;
            } catch (Exception unused) {
                throw new RuntimeException(e10);
            }
        }
    }

    public final int hashCode() {
        return this.f17327h.hashCode();
    }

    public final String toString() {
        return this.f17327h;
    }
}

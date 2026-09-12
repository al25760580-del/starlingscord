package cs;

import android.util.StateSet;
import com.facebook.imageutils.JfifUtil;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.b0;
import okhttp3.HttpUrl;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f7467c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Serializable f7468d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Serializable f7469e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f7470f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f7471g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f7472h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f7473i;

    public r(kh.m mVar) {
        this.f7465a = 1;
        f();
        a(StateSet.WILD_CARD, mVar);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.io.Serializable, java.lang.Object, kh.m[]] */
    /* JADX WARN: Type inference failed for: r3v0, types: [int[][], java.io.Serializable, java.lang.Object] */
    public void a(int[] iArr, kh.m mVar) {
        int i7 = this.f7466b;
        if (i7 == 0 || iArr.length == 0) {
            this.f7467c = mVar;
        }
        int[][] iArr2 = (int[][]) this.f7468d;
        if (i7 >= iArr2.length) {
            int i10 = i7 + 10;
            ?? r5 = new int[i10][];
            System.arraycopy(iArr2, 0, r5, 0, i7);
            this.f7468d = r5;
            ?? r6 = new kh.m[i10];
            System.arraycopy((kh.m[]) this.f7469e, 0, r6, 0, i7);
            this.f7469e = r6;
        }
        int[][] iArr3 = (int[][]) this.f7468d;
        int i11 = this.f7466b;
        iArr3[i11] = iArr;
        ((kh.m[]) this.f7469e)[i11] = mVar;
        this.f7466b = i11 + 1;
    }

    public HttpUrl b() {
        ArrayList arrayList;
        String str = (String) this.f7467c;
        if (str == null) {
            throw new IllegalStateException("scheme == null");
        }
        String strE = o.e(0, (String) this.f7468d, 0, 7);
        String strE2 = o.e(0, (String) this.f7469e, 0, 7);
        String str2 = (String) this.f7470f;
        if (str2 == null) {
            throw new IllegalStateException("host == null");
        }
        int iC = c();
        ArrayList arrayList2 = (ArrayList) this.f7472h;
        ArrayList arrayList3 = new ArrayList(e0.l(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(o.e(0, (String) it.next(), 0, 7));
        }
        ArrayList<String> arrayList4 = (ArrayList) this.f7473i;
        if (arrayList4 == null) {
            arrayList = null;
        } else {
            ArrayList arrayList5 = new ArrayList(e0.l(arrayList4, 10));
            for (String str3 : arrayList4) {
                arrayList5.add(str3 == null ? null : o.e(0, str3, 0, 3));
            }
            arrayList = arrayList5;
        }
        String str4 = (String) this.f7471g;
        return new HttpUrl(str, strE, strE2, str2, iC, arrayList3, arrayList, str4 != null ? o.e(0, str4, 0, 7) : null, toString());
    }

    public int c() {
        int i7 = this.f7466b;
        if (i7 != -1) {
            return i7;
        }
        String scheme = (String) this.f7467c;
        Intrinsics.checkNotNull(scheme);
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        if (Intrinsics.areEqual(scheme, "http")) {
            return 80;
        }
        return Intrinsics.areEqual(scheme, "https") ? 443 : -1;
    }

    public void d(String str) {
        String strB;
        ArrayList arrayListF = null;
        if (str != null && (strB = o.b(str, 0, " \"'<>#", 0, 211)) != null) {
            arrayListF = o.f(strB);
        }
        this.f7473i = arrayListF;
    }

    public void e(String host) {
        Intrinsics.checkNotNullParameter(host, "host");
        String strJ = sa.a.J(o.e(0, host, 0, 7));
        if (strJ == null) {
            throw new IllegalArgumentException(Intrinsics.stringPlus("unexpected host: ", host));
        }
        this.f7470f = strJ;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.io.Serializable, kh.m[]] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int[][], java.io.Serializable] */
    public void f() {
        this.f7467c = new kh.m();
        this.f7468d = new int[10][];
        this.f7469e = new kh.m[10];
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0084  */
    public void g(HttpUrl httpUrl, String input) {
        int i7;
        byte b10;
        int i10;
        int iF;
        int i11;
        ArrayList arrayList = (ArrayList) this.f7472h;
        Intrinsics.checkNotNullParameter(input, "input");
        byte[] bArr = ds.b.f7815a;
        int iM = ds.b.m(0, input.length(), input);
        int iN = ds.b.n(iM, input.length(), input);
        byte b11 = -1;
        if (iN - iM >= 2) {
            char cCharAt = input.charAt(iM);
            char c8 = 'a';
            if ((Intrinsics.compare((int) cCharAt, 97) >= 0 && Intrinsics.compare((int) cCharAt, 122) <= 0) || (Intrinsics.compare((int) cCharAt, 65) >= 0 && Intrinsics.compare((int) cCharAt, 90) <= 0)) {
                i7 = iM + 1;
                while (true) {
                    if (i7 < iN) {
                        int i12 = i7 + 1;
                        char cCharAt2 = input.charAt(i7);
                        if ((c8 > cCharAt2 || cCharAt2 >= '{') && (('A' > cCharAt2 || cCharAt2 >= '[') && !(('0' <= cCharAt2 && cCharAt2 < ':') || cCharAt2 == '+' || cCharAt2 == '-' || cCharAt2 == '.'))) {
                            if (cCharAt2 == ':') {
                                break;
                            } else {
                                break;
                            }
                        } else {
                            i7 = i12;
                            c8 = 'a';
                        }
                    }
                    i7 = -1;
                    break;
                }
            } else {
                i7 = -1;
                break;
            }
        } else {
            i7 = -1;
            break;
        }
        int i13 = 1;
        if (i7 != -1) {
            if (kotlin.text.x.n(input, iM, "https:", true)) {
                this.f7467c = "https";
                iM += 6;
            } else {
                if (!kotlin.text.x.n(input, iM, "http:", true)) {
                    StringBuilder sb2 = new StringBuilder("Expected URL scheme 'http' or 'https' but was '");
                    String strSubstring = input.substring(0, i7);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    sb2.append(strSubstring);
                    sb2.append('\'');
                    throw new IllegalArgumentException(sb2.toString());
                }
                this.f7467c = "http";
                iM += 5;
            }
        } else {
            if (httpUrl == null) {
                throw new IllegalArgumentException(Intrinsics.stringPlus("Expected URL scheme 'http' or 'https' but no scheme was found for ", input.length() > 6 ? Intrinsics.stringPlus(b0.B(6, input), "...") : input));
            }
            this.f7467c = httpUrl.f17320a;
        }
        int i14 = iM;
        int i15 = 0;
        while (true) {
            b10 = 47;
            i10 = i13;
            if (i14 >= iN) {
                break;
            }
            int i16 = i14 + 1;
            char cCharAt3 = input.charAt(i14);
            if (cCharAt3 != '\\' && cCharAt3 != '/') {
                break;
            }
            i15++;
            i13 = i10;
            i14 = i16;
        }
        byte b12 = 35;
        if (i15 >= 2 || httpUrl == null || !Intrinsics.areEqual(httpUrl.f17320a, (String) this.f7467c)) {
            int i17 = iM + i15;
            int i18 = 0;
            int i19 = 0;
            while (true) {
                iF = ds.b.f(i17, iN, input, "@/\\?#");
                byte bCharAt = iF != iN ? input.charAt(iF) : b11;
                if (bCharAt == b11 || bCharAt == b12 || bCharAt == b10 || bCharAt == 92 || bCharAt == 63) {
                    break;
                }
                if (bCharAt != 64) {
                    b12 = 35;
                } else {
                    if (i18 == 0) {
                        int iE = ds.b.e(':', i17, iF, input);
                        String strB = o.b(input, i17, " \"':;<=>@[]^`{}|/\\?#", iE, 240);
                        if (i19 != 0) {
                            strB = a3.e.o(new StringBuilder(), (String) this.f7468d, "%40", strB);
                        }
                        this.f7468d = strB;
                        if (iE != iF) {
                            this.f7469e = o.b(input, iE + 1, " \"':;<=>@[]^`{}|/\\?#", iF, 240);
                            i18 = i10;
                        }
                        i19 = i10;
                    } else {
                        this.f7469e = ((String) this.f7469e) + "%40" + o.b(input, i17, " \"':;<=>@[]^`{}|/\\?#", iF, 240);
                    }
                    i17 = iF + 1;
                    b10 = 47;
                    b12 = 35;
                    b11 = -1;
                }
            }
            int i20 = i17;
            while (true) {
                if (i20 >= iF) {
                    i20 = iF;
                    break;
                }
                char cCharAt4 = input.charAt(i20);
                if (cCharAt4 == '[') {
                    do {
                        i20++;
                        if (i20 >= iF) {
                            break;
                        }
                    } while (input.charAt(i20) != ']');
                } else if (cCharAt4 == ':') {
                    break;
                }
                i20++;
            }
            int i21 = i20 + 1;
            if (i21 < iF) {
                this.f7470f = sa.a.J(o.e(i17, input, i20, 4));
                try {
                    i11 = Integer.parseInt(o.b(input, i21, "", iF, 248));
                    if (i10 > i11 || i11 >= 65536) {
                        i11 = -1;
                    }
                } catch (NumberFormatException unused) {
                }
                this.f7466b = i11;
                if (i11 == -1) {
                    StringBuilder sb3 = new StringBuilder("Invalid URL port: \"");
                    String strSubstring2 = input.substring(i21, iF);
                    Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                    sb3.append(strSubstring2);
                    sb3.append('\"');
                    throw new IllegalArgumentException(sb3.toString().toString());
                }
            } else {
                int i22 = -1;
                this.f7470f = sa.a.J(o.e(i17, input, i20, 4));
                String scheme = (String) this.f7467c;
                Intrinsics.checkNotNull(scheme);
                Intrinsics.checkNotNullParameter(scheme, "scheme");
                if (Intrinsics.areEqual(scheme, "http")) {
                    i22 = 80;
                } else if (Intrinsics.areEqual(scheme, "https")) {
                    i22 = 443;
                }
                this.f7466b = i22;
            }
            if (((String) this.f7470f) == null) {
                StringBuilder sb4 = new StringBuilder("Invalid URL host: \"");
                String strSubstring3 = input.substring(i17, i20);
                Intrinsics.checkNotNullExpressionValue(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                sb4.append(strSubstring3);
                sb4.append('\"');
                throw new IllegalArgumentException(sb4.toString().toString());
            }
            iM = iF;
        } else {
            this.f7468d = httpUrl.e();
            this.f7469e = httpUrl.a();
            this.f7470f = httpUrl.f17323d;
            this.f7466b = httpUrl.f17324e;
            arrayList.clear();
            arrayList.addAll(httpUrl.c());
            if (iM == iN || input.charAt(iM) == '#') {
                d(httpUrl.d());
            }
        }
        int iF2 = ds.b.f(iM, iN, input, "?#");
        if (iM != iF2) {
            char cCharAt5 = input.charAt(iM);
            if (cCharAt5 == '/' || cCharAt5 == '\\') {
                arrayList.clear();
                arrayList.add("");
                iM++;
            } else {
                arrayList.set(arrayList.size() - 1, "");
            }
            while (iM < iF2) {
                int iF3 = ds.b.f(iM, iF2, input, "/\\");
                boolean z5 = iF3 < iF2;
                String strB2 = o.b(input, iM, " \"<>^`{}|/\\?#", iF3, 240);
                if (!Intrinsics.areEqual(strB2, ".") && !kotlin.text.x.i(strB2, "%2e", true)) {
                    if (!Intrinsics.areEqual(strB2, "..") && !kotlin.text.x.i(strB2, "%2e.", true) && !kotlin.text.x.i(strB2, ".%2e", true) && !kotlin.text.x.i(strB2, "%2e%2e", true)) {
                        if (((CharSequence) kk.b.e(1, arrayList)).length() == 0) {
                            arrayList.set(arrayList.size() - 1, strB2);
                        } else {
                            arrayList.add(strB2);
                        }
                        if (z5) {
                            arrayList.add("");
                        }
                    } else if (((String) arrayList.remove(arrayList.size() - 1)).length() != 0 || arrayList.isEmpty()) {
                        arrayList.add("");
                    } else {
                        arrayList.set(arrayList.size() - 1, "");
                    }
                }
                iM = z5 ? iF3 + 1 : iF3;
            }
        }
        if (iF2 < iN && input.charAt(iF2) == '?') {
            int iE2 = ds.b.e('#', iF2, iN, input);
            this.f7473i = o.f(o.b(input, iF2 + 1, " \"'<>#", iE2, JfifUtil.MARKER_RST0));
            iF2 = iE2;
        }
        if (iF2 >= iN || input.charAt(iF2) != '#') {
            return;
        }
        this.f7471g = o.b(input, iF2 + 1, "", iN, 176);
    }

    public void h(String scheme) {
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        if (scheme.equalsIgnoreCase("http")) {
            this.f7467c = "http";
        } else {
            if (!scheme.equalsIgnoreCase("https")) {
                throw new IllegalArgumentException(Intrinsics.stringPlus("unexpected scheme: ", scheme));
            }
            this.f7467c = "https";
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00b6  */
    public String toString() {
        switch (this.f7465a) {
            case 0:
                StringBuilder out = new StringBuilder();
                String str = (String) this.f7467c;
                if (str != null) {
                    out.append(str);
                    out.append("://");
                } else {
                    out.append("//");
                }
                if (((String) this.f7468d).length() > 0 || ((String) this.f7469e).length() > 0) {
                    out.append((String) this.f7468d);
                    if (((String) this.f7469e).length() > 0) {
                        out.append(':');
                        out.append((String) this.f7469e);
                    }
                    out.append('@');
                }
                String str2 = (String) this.f7470f;
                if (str2 != null) {
                    Intrinsics.checkNotNull(str2);
                    if (StringsKt.E(str2, ':')) {
                        out.append('[');
                        out.append((String) this.f7470f);
                        out.append(']');
                    } else {
                        out.append((String) this.f7470f);
                    }
                }
                int i7 = -1;
                if (this.f7466b != -1 || ((String) this.f7467c) != null) {
                    int iC = c();
                    String scheme = (String) this.f7467c;
                    if (scheme != null) {
                        Intrinsics.checkNotNull(scheme);
                        Intrinsics.checkNotNullParameter(scheme, "scheme");
                        if (Intrinsics.areEqual(scheme, "http")) {
                            i7 = 80;
                        } else if (Intrinsics.areEqual(scheme, "https")) {
                            i7 = 443;
                        }
                        if (iC != i7) {
                            out.append(':');
                            out.append(iC);
                        }
                    } else {
                        out.append(':');
                        out.append(iC);
                    }
                }
                ArrayList arrayList = (ArrayList) this.f7472h;
                Intrinsics.checkNotNullParameter(arrayList, "<this>");
                Intrinsics.checkNotNullParameter(out, "out");
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    out.append('/');
                    out.append((String) arrayList.get(i10));
                }
                if (((ArrayList) this.f7473i) != null) {
                    out.append('?');
                    ArrayList arrayList2 = (ArrayList) this.f7473i;
                    Intrinsics.checkNotNull(arrayList2);
                    o.g(out, arrayList2);
                }
                if (((String) this.f7471g) != null) {
                    out.append('#');
                    out.append((String) this.f7471g);
                }
                String string = out.toString();
                Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
                return string;
            default:
                return super.toString();
        }
    }

    public r(int i7) {
        this.f7465a = i7;
        switch (i7) {
            case 1:
                break;
            default:
                this.f7468d = "";
                this.f7469e = "";
                this.f7466b = -1;
                ArrayList arrayList = new ArrayList();
                this.f7472h = arrayList;
                arrayList.add("");
                break;
        }
    }
}

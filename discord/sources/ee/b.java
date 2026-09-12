package ee;

import java.util.regex.Pattern;
import je.w;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f8139c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f8140d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f8141a = new w();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StringBuilder f8142b = new StringBuilder();

    public static String a(w wVar, StringBuilder sb2) {
        boolean z5 = false;
        sb2.setLength(0);
        int i7 = wVar.f13861b;
        int i10 = wVar.f13862c;
        while (i7 < i10 && !z5) {
            char c8 = (char) wVar.f13860a[i7];
            if ((c8 < 'A' || c8 > 'Z') && ((c8 < 'a' || c8 > 'z') && !((c8 >= '0' && c8 <= '9') || c8 == '#' || c8 == '-' || c8 == '.' || c8 == '_'))) {
                z5 = true;
            } else {
                i7++;
                sb2.append(c8);
            }
        }
        wVar.G(i7 - wVar.f13861b);
        return sb2.toString();
    }

    public static String b(w wVar, StringBuilder sb2) {
        c(wVar);
        if (wVar.a() == 0) {
            return null;
        }
        String strA = a(wVar, sb2);
        if (!"".equals(strA)) {
            return strA;
        }
        return "" + ((char) wVar.u());
    }

    public static void c(w wVar) {
        while (true) {
            for (boolean z5 = true; wVar.a() > 0 && z5; z5 = false) {
                int i7 = wVar.f13861b;
                byte[] bArr = wVar.f13860a;
                byte b10 = bArr[i7];
                char c8 = (char) b10;
                if (c8 == '\t' || c8 == '\n' || c8 == '\f' || c8 == '\r' || c8 == ' ') {
                    wVar.G(1);
                } else {
                    int i10 = wVar.f13862c;
                    int i11 = i7 + 2;
                    if (i11 <= i10) {
                        int i12 = i7 + 1;
                        if (b10 == 47 && bArr[i12] == 42) {
                            while (true) {
                                int i13 = i11 + 1;
                                if (i13 >= i10) {
                                    break;
                                }
                                if (((char) bArr[i11]) == '*' && ((char) bArr[i13]) == '/') {
                                    i11 += 2;
                                    i10 = i11;
                                } else {
                                    i11 = i13;
                                }
                            }
                            wVar.G(i10 - wVar.f13861b);
                        }
                    }
                }
            }
            return;
        }
    }
}

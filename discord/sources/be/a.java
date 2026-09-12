package be;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import com.discord.misc.utilities.logThrottle.LogThrottleSingleton;
import di.d;
import e4.l;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import je.b;
import je.w;
import vd.c;
import vd.e;
import vd.f;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Pattern f3224o = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Pattern f3225p = Pattern.compile("\\{\\\\.*?\\}");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final StringBuilder f3226m = new StringBuilder();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayList f3227n = new ArrayList();

    public static long h(Matcher matcher, int i7) {
        String strGroup = matcher.group(i7 + 1);
        long j = strGroup != null ? Long.parseLong(strGroup) * LogThrottleSingleton.RATE_LIMIT_ONE_HOUR : 0L;
        String strGroup2 = matcher.group(i7 + 2);
        strGroup2.getClass();
        long j5 = (Long.parseLong(strGroup2) * LogThrottleSingleton.RATE_LIMIT_ONE_MINUTE) + j;
        String strGroup3 = matcher.group(i7 + 3);
        strGroup3.getClass();
        long j7 = (Long.parseLong(strGroup3) * 1000) + j5;
        String strGroup4 = matcher.group(i7 + 4);
        if (strGroup4 != null) {
            j7 += Long.parseLong(strGroup4);
        }
        return j7 * 1000;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:66:0x0166  */
    /* JADX WARN: Code duplicated, block: B:70:0x0173  */
    /* JADX WARN: Code duplicated, block: B:71:0x0175  */
    /* JADX WARN: Code duplicated, block: B:83:0x0192  */
    /* JADX WARN: Code duplicated, block: B:95:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:96:0x01b9  */
    @Override // vd.e
    public final f e(byte[] bArr, int i7, boolean z5) {
        String str;
        int i10;
        int i11;
        int i12;
        int i13;
        float f2;
        c cVar;
        this = this;
        ArrayList arrayList = new ArrayList();
        long[] jArrCopyOf = new long[32];
        w wVar = new w(bArr, i7);
        Charset charsetB = wVar.B();
        if (charsetB == null) {
            charsetB = d.f7631c;
        }
        int i14 = 0;
        int i15 = 0;
        while (true) {
            String strH = wVar.h(charsetB);
            if (strH != null) {
                if (strH.length() != 0) {
                    try {
                        Integer.parseInt(strH);
                        String strH2 = wVar.h(charsetB);
                        if (strH2 == null) {
                            b.N("SubripDecoder", "Unexpected end");
                        } else {
                            Matcher matcher = f3224o.matcher(strH2);
                            if (matcher.matches()) {
                                long jH = h(matcher, 1);
                                if (i15 == jArrCopyOf.length) {
                                    jArrCopyOf = Arrays.copyOf(jArrCopyOf, i15 * 2);
                                }
                                int i16 = i15 + 1;
                                jArrCopyOf[i15] = jH;
                                long jH2 = h(matcher, 6);
                                if (i16 == jArrCopyOf.length) {
                                    jArrCopyOf = Arrays.copyOf(jArrCopyOf, i16 * 2);
                                }
                                i15 += 2;
                                jArrCopyOf[i16] = jH2;
                                StringBuilder sb2 = this.f3226m;
                                sb2.setLength(i14);
                                ArrayList arrayList2 = this.f3227n;
                                arrayList2.clear();
                                String strH3 = wVar.h(charsetB);
                                while (!TextUtils.isEmpty(strH3)) {
                                    if (sb2.length() > 0) {
                                        sb2.append("<br>");
                                    }
                                    String strTrim = strH3.trim();
                                    StringBuilder sb3 = new StringBuilder(strTrim);
                                    Matcher matcher2 = f3225p.matcher(strTrim);
                                    int i17 = i14;
                                    while (matcher2.find()) {
                                        String strGroup = matcher2.group();
                                        arrayList2.add(strGroup);
                                        int iStart = matcher2.start() - i17;
                                        int length = strGroup.length();
                                        sb3.replace(iStart, iStart + length, "");
                                        i17 += length;
                                    }
                                    sb2.append(sb3.toString());
                                    strH3 = wVar.h(charsetB);
                                    i14 = 0;
                                }
                                Spanned spannedFromHtml = Html.fromHtml(sb2.toString());
                                int i18 = 0;
                                while (true) {
                                    if (i18 < arrayList2.size()) {
                                        str = (String) arrayList2.get(i18);
                                        if (!str.matches("\\{\\\\an[1-9]\\}")) {
                                            i18++;
                                        }
                                    } else {
                                        str = null;
                                    }
                                }
                                if (str == null) {
                                    cVar = new c(spannedFromHtml, null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
                                } else {
                                    switch (str.hashCode()) {
                                        case -685620710:
                                            if (!str.equals("{\\an1}")) {
                                                i10 = 1;
                                            } else {
                                                i10 = 0;
                                            }
                                            break;
                                        case -685620679:
                                            str.equals("{\\an2}");
                                            i10 = 1;
                                            break;
                                        case -685620648:
                                            if (!str.equals("{\\an3}")) {
                                                i10 = 1;
                                            } else {
                                                i10 = 2;
                                            }
                                            break;
                                        case -685620617:
                                            if (!str.equals("{\\an4}")) {
                                                i10 = 1;
                                            } else {
                                                i10 = 0;
                                            }
                                            break;
                                        case -685620586:
                                            str.equals("{\\an5}");
                                            i10 = 1;
                                            break;
                                        case -685620555:
                                            if (!str.equals("{\\an6}")) {
                                                i10 = 1;
                                            } else {
                                                i10 = 2;
                                            }
                                            break;
                                        case -685620524:
                                            if (!str.equals("{\\an7}")) {
                                                i10 = 1;
                                            } else {
                                                i10 = 0;
                                            }
                                            break;
                                        case -685620493:
                                            str.equals("{\\an8}");
                                            i10 = 1;
                                            break;
                                        case -685620462:
                                            if (!str.equals("{\\an9}")) {
                                                i10 = 1;
                                            } else {
                                                i10 = 2;
                                            }
                                            break;
                                        default:
                                            i10 = 1;
                                            break;
                                    }
                                    switch (str.hashCode()) {
                                        case -685620710:
                                            if (!str.equals("{\\an1}")) {
                                                i11 = 1;
                                            } else {
                                                i11 = 2;
                                            }
                                            break;
                                        case -685620679:
                                            if (!str.equals("{\\an2}")) {
                                                i11 = 1;
                                            } else {
                                                i11 = 2;
                                            }
                                            break;
                                        case -685620648:
                                            if (!str.equals("{\\an3}")) {
                                                i11 = 1;
                                            } else {
                                                i11 = 2;
                                            }
                                            break;
                                        case -685620617:
                                            str.equals("{\\an4}");
                                            i11 = 1;
                                            break;
                                        case -685620586:
                                            str.equals("{\\an5}");
                                            i11 = 1;
                                            break;
                                        case -685620555:
                                            str.equals("{\\an6}");
                                            i11 = 1;
                                            break;
                                        case -685620524:
                                            if (!str.equals("{\\an7}")) {
                                                i11 = 1;
                                            } else {
                                                i11 = 0;
                                            }
                                            break;
                                        case -685620493:
                                            if (!str.equals("{\\an8}")) {
                                                i11 = 1;
                                            } else {
                                                i11 = 0;
                                            }
                                            break;
                                        case -685620462:
                                            if (!str.equals("{\\an9}")) {
                                                i11 = 1;
                                            } else {
                                                i11 = 0;
                                            }
                                            break;
                                        default:
                                            i11 = 1;
                                            break;
                                    }
                                    float f7 = 0.08f;
                                    if (i10 != 0) {
                                        i12 = 1;
                                        if (i10 != 1) {
                                            i13 = 2;
                                            if (i10 != 2) {
                                                throw new IllegalArgumentException();
                                            }
                                            f2 = 0.92f;
                                        } else {
                                            i13 = 2;
                                            f2 = 0.5f;
                                        }
                                    } else {
                                        i12 = 1;
                                        i13 = 2;
                                        f2 = 0.08f;
                                    }
                                    if (i11 != 0) {
                                        if (i11 == i12) {
                                            f7 = 0.5f;
                                        } else {
                                            if (i11 != i13) {
                                                throw new IllegalArgumentException();
                                            }
                                            f7 = 0.92f;
                                        }
                                    }
                                    cVar = new c(spannedFromHtml, null, null, null, f7, 0, i11, f2, i10, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
                                }
                                arrayList.add(cVar);
                                arrayList.add(c.O);
                                jArrCopyOf = jArrCopyOf;
                                wVar = wVar;
                            } else {
                                b.N("SubripDecoder", "Skipping invalid timing: ".concat(strH2));
                            }
                            i14 = 0;
                        }
                    } catch (NumberFormatException unused) {
                        b.N("SubripDecoder", "Skipping invalid index: ".concat(strH));
                    }
                }
            }
        }
        return new l(2, (c[]) arrayList.toArray(new c[i14]), Arrays.copyOf(jArrCopyOf, i15));
    }
}

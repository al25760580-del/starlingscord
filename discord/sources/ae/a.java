package ae;

import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import app.rive.runtime.kotlin.fonts.Fonts;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import je.e0;
import je.w;
import m3.m;
import vd.f;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends vd.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Pattern f354r = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f355m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final b f356n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public LinkedHashMap f357o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f358p = -3.4028235E38f;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f359q = -3.4028235E38f;

    public a(List list) {
        if (list == null || list.isEmpty()) {
            this.f355m = false;
            this.f356n = null;
            return;
        }
        this.f355m = true;
        String strN = e0.n((byte[]) list.get(0));
        je.b.g(strN.startsWith("Format:"));
        b bVarB = b.b(strN);
        bVarB.getClass();
        this.f356n = bVarB;
        i(new w((byte[]) list.get(1)), di.d.f7631c);
    }

    public static int h(long j, ArrayList arrayList, ArrayList arrayList2) {
        int i7;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i7 = 0;
                break;
            }
            if (((Long) arrayList.get(size)).longValue() == j) {
                return size;
            }
            if (((Long) arrayList.get(size)).longValue() < j) {
                i7 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i7, Long.valueOf(j));
        arrayList2.add(i7, i7 == 0 ? new ArrayList() : new ArrayList((Collection) arrayList2.get(i7 - 1)));
        return i7;
    }

    public static long j(String str) {
        Matcher matcher = f354r.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String strGroup = matcher.group(1);
        int i7 = e0.f13788a;
        return (Long.parseLong(matcher.group(4)) * 10000) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(2)) * 60000000) + (Long.parseLong(strGroup) * 3600000000L);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // vd.e
    public final f e(byte[] bArr, int i7, boolean z5) {
        w wVar;
        int i10;
        float f2;
        int i11;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        int i12;
        float f7;
        int i13;
        int i14;
        float f10;
        float f11;
        int i15;
        int i16;
        float f12;
        int i17;
        float f13;
        int i18;
        int i19;
        int iA;
        int i20;
        a aVar = this;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        w wVar2 = new w(bArr, i7);
        Charset charsetB = wVar2.B();
        if (charsetB == null) {
            charsetB = di.d.f7631c;
        }
        boolean z6 = aVar.f355m;
        if (!z6) {
            aVar.i(wVar2, charsetB);
        }
        b bVarB = z6 ? aVar.f356n : null;
        while (true) {
            String strH = wVar2.h(charsetB);
            if (strH == null) {
                return new e4.c(2, arrayList, arrayList2);
            }
            if (strH.startsWith("Format:")) {
                bVarB = b.b(strH);
            } else {
                if (strH.startsWith("Dialogue:")) {
                    if (bVarB == null) {
                        je.b.N("SsaDecoder", "Skipping dialogue line before complete format: ".concat(strH));
                    } else {
                        int i21 = bVarB.f365f;
                        je.b.g(strH.startsWith("Dialogue:"));
                        String[] strArrSplit = strH.substring(9).split(",", i21);
                        if (strArrSplit.length != i21) {
                            je.b.N("SsaDecoder", "Skipping dialogue line with fewer columns than format: ".concat(strH));
                        } else {
                            if (j(strArrSplit[bVarB.f361b]) == -9223372036854775807L) {
                                je.b.N("SsaDecoder", "Skipping invalid timing: ".concat(strH));
                            } else {
                                long j = j(strArrSplit[bVarB.f362c]);
                                if (j == -9223372036854775807L) {
                                    je.b.N("SsaDecoder", "Skipping invalid timing: ".concat(strH));
                                } else {
                                    LinkedHashMap linkedHashMap = aVar.f357o;
                                    e eVar = (linkedHashMap == null || (i20 = bVarB.f363d) == -1) ? null : (e) linkedHashMap.get(strArrSplit[i20].trim());
                                    String str = strArrSplit[bVarB.f364e];
                                    Matcher matcher = d.f375a.matcher(str);
                                    int i22 = -1;
                                    PointF pointF = null;
                                    while (matcher.find()) {
                                        w wVar3 = wVar2;
                                        String strGroup = matcher.group(1);
                                        strGroup.getClass();
                                        try {
                                            PointF pointFA = d.a(strGroup);
                                            if (pointFA != null) {
                                                pointF = pointFA;
                                            }
                                        } catch (RuntimeException unused) {
                                        }
                                        try {
                                            Matcher matcher2 = d.f378d.matcher(strGroup);
                                            if (matcher2.find()) {
                                                String strGroup2 = matcher2.group(1);
                                                strGroup2.getClass();
                                                iA = e.a(strGroup2);
                                            } else {
                                                iA = -1;
                                            }
                                            if (iA != -1) {
                                                i22 = iA;
                                            }
                                        } catch (RuntimeException unused2) {
                                        }
                                        wVar2 = wVar3;
                                    }
                                    wVar = wVar2;
                                    String strReplace = d.f375a.matcher(str).replaceAll("").replace("\\N", ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE).replace("\\n", ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE).replace("\\h", " ");
                                    float f14 = aVar.f358p;
                                    float f15 = aVar.f359q;
                                    SpannableString spannableString = new SpannableString(strReplace);
                                    if (eVar != null) {
                                        boolean z7 = eVar.f385g;
                                        Integer num = eVar.f382d;
                                        Integer num2 = eVar.f381c;
                                        if (num2 != null) {
                                            i15 = 33;
                                            i16 = 0;
                                            spannableString.setSpan(new ForegroundColorSpan(num2.intValue()), 0, spannableString.length(), 33);
                                        } else {
                                            i15 = 33;
                                            i16 = 0;
                                        }
                                        if (eVar.j == 3 && num != null) {
                                            spannableString.setSpan(new BackgroundColorSpan(num.intValue()), i16, spannableString.length(), i15);
                                        }
                                        float f16 = eVar.f383e;
                                        if (f16 == -3.4028235E38f || f15 == -3.4028235E38f) {
                                            f12 = -3.4028235E38f;
                                            i17 = Integer.MIN_VALUE;
                                        } else {
                                            f12 = f16 / f15;
                                            i17 = 1;
                                        }
                                        boolean z10 = eVar.f384f;
                                        if (z10 && z7) {
                                            f13 = f12;
                                            i18 = i17;
                                            i19 = 33;
                                            i10 = 0;
                                            spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
                                        } else {
                                            f13 = f12;
                                            i18 = i17;
                                            i19 = 33;
                                            i10 = 0;
                                            if (z10) {
                                                spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                                            } else if (z7 != 0) {
                                                spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
                                            }
                                        }
                                        if (eVar.f386h) {
                                            spannableString.setSpan(new UnderlineSpan(), i10, spannableString.length(), i19);
                                        }
                                        if (eVar.f387i) {
                                            spannableString.setSpan(new StrikethroughSpan(), i10, spannableString.length(), i19);
                                        }
                                        f2 = f13;
                                        i11 = i18;
                                    } else {
                                        charsetB = charsetB;
                                        bVarB = bVarB;
                                        i10 = 0;
                                        f2 = -3.4028235E38f;
                                        i11 = Integer.MIN_VALUE;
                                    }
                                    int i23 = -1;
                                    if (i22 != -1) {
                                        i23 = i22;
                                    } else if (eVar != null) {
                                        i23 = eVar.f380b;
                                    }
                                    switch (i23) {
                                        case 0:
                                        default:
                                            com.discord.chat.presentation.list.a.q(i23, "Unknown alignment: ", "SsaDecoder");
                                        case -1:
                                            alignment2 = null;
                                            break;
                                        case 1:
                                        case 4:
                                        case 7:
                                            alignment = Layout.Alignment.ALIGN_NORMAL;
                                            alignment2 = alignment;
                                            break;
                                        case 2:
                                        case 5:
                                        case 8:
                                            alignment = Layout.Alignment.ALIGN_CENTER;
                                            alignment2 = alignment;
                                            break;
                                        case 3:
                                        case 6:
                                        case 9:
                                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                                            alignment2 = alignment;
                                            break;
                                    }
                                    int i24 = Integer.MIN_VALUE;
                                    switch (i23) {
                                        case 0:
                                        default:
                                            com.discord.chat.presentation.list.a.q(i23, "Unknown alignment: ", "SsaDecoder");
                                        case -1:
                                            i12 = Integer.MIN_VALUE;
                                            break;
                                        case 1:
                                        case 4:
                                        case 7:
                                            i12 = i10;
                                            break;
                                        case 2:
                                        case 5:
                                        case 8:
                                            i12 = 1;
                                            break;
                                        case 3:
                                        case 6:
                                        case 9:
                                            i12 = 2;
                                            break;
                                    }
                                    switch (i23) {
                                        case -1:
                                            break;
                                        case 0:
                                        default:
                                            com.discord.chat.presentation.list.a.q(i23, "Unknown alignment: ", "SsaDecoder");
                                            break;
                                        case 1:
                                        case 2:
                                        case 3:
                                            i24 = 2;
                                            break;
                                        case 4:
                                        case 5:
                                        case 6:
                                            i24 = 1;
                                            break;
                                        case 7:
                                        case 8:
                                        case 9:
                                            i24 = i10;
                                            break;
                                    }
                                    if (pointF == 0 || f15 == -3.4028235E38f || f14 == -3.4028235E38f) {
                                        f7 = 0.05f;
                                        if (i12 != 0) {
                                            i14 = 1;
                                            if (i12 != 1) {
                                                i13 = 2;
                                                f10 = i12 != 2 ? -3.4028235E38f : 0.95f;
                                            } else {
                                                i13 = 2;
                                                f10 = 0.5f;
                                            }
                                        } else {
                                            i13 = 2;
                                            i14 = 1;
                                            f10 = 0.05f;
                                        }
                                        if (i24 != 0) {
                                            f7 = i24 != i14 ? i24 != i13 ? -3.4028235E38f : 0.95f : 0.5f;
                                        }
                                        f11 = f10;
                                    } else {
                                        float f17 = pointF.x / f14;
                                        f7 = pointF.y / f15;
                                        f11 = f17;
                                    }
                                    vd.c cVar = new vd.c(spannableString, alignment2, null, null, f7, i10, i24, f11, i12, i11, f2, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
                                    int iH = h(j, arrayList2, arrayList);
                                    for (int iH2 = h(r10, arrayList2, arrayList); iH2 < iH; iH2++) {
                                        ((List) arrayList.get(iH2)).add(cVar);
                                    }
                                }
                            }
                        }
                    }
                    wVar = wVar2;
                    charsetB = charsetB;
                    bVarB = bVarB;
                } else {
                    wVar = wVar2;
                    charsetB = charsetB;
                    bVarB = bVarB;
                }
                aVar = this;
                wVar2 = wVar;
                charsetB = charsetB;
                bVarB = bVarB;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:163:0x02cb  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void i(w wVar, Charset charset) {
        int i7;
        e eVar;
        while (true) {
            String strH = wVar.h(charset);
            if (strH == null) {
                return;
            }
            int i10 = 2;
            int i11 = 0;
            char c8 = '[';
            if ("[Script Info]".equalsIgnoreCase(strH)) {
                while (true) {
                    String strH2 = wVar.h(charset);
                    if (strH2 == null || (wVar.a() != 0 && wVar.c(charset) == '[')) {
                        break;
                    }
                    String[] strArrSplit = strH2.split(":");
                    if (strArrSplit.length == 2) {
                        String strT = m.T(strArrSplit[0].trim());
                        strT.getClass();
                        if (strT.equals("playresx")) {
                            this.f358p = Float.parseFloat(strArrSplit[1].trim());
                        } else if (strT.equals("playresy")) {
                            try {
                                this.f359q = Float.parseFloat(strArrSplit[1].trim());
                            } catch (NumberFormatException unused) {
                            }
                        }
                    }
                }
            } else if ("[V4+ Styles]".equalsIgnoreCase(strH)) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                while (true) {
                    c cVar = null;
                    while (true) {
                        String strH3 = wVar.h(charset);
                        if (strH3 != null && (wVar.a() == 0 || wVar.c(charset) != c8)) {
                            int i12 = -1;
                            if (strH3.startsWith("Format:")) {
                                String[] strArrSplit2 = TextUtils.split(strH3.substring(7), ",");
                                int i13 = -1;
                                int i14 = -1;
                                int i15 = -1;
                                int i16 = -1;
                                int i17 = -1;
                                int i18 = -1;
                                int i19 = -1;
                                int i20 = -1;
                                int i21 = -1;
                                int i22 = -1;
                                for (int i23 = i11; i23 < strArrSplit2.length; i23++) {
                                    String strT2 = m.T(strArrSplit2[i23].trim());
                                    strT2.getClass();
                                    switch (strT2.hashCode()) {
                                        case -1178781136:
                                            i7 = strT2.equals(Fonts.Font.STYLE_ITALIC) ? i11 : -1;
                                            break;
                                        case -1026963764:
                                            i7 = strT2.equals("underline") ? 1 : -1;
                                            break;
                                        case -192095652:
                                            i7 = strT2.equals("strikeout") ? i10 : -1;
                                            break;
                                        case -70925746:
                                            i7 = strT2.equals("primarycolour") ? 3 : -1;
                                            break;
                                        case 3029637:
                                            i7 = strT2.equals("bold") ? 4 : -1;
                                            break;
                                        case 3373707:
                                            i7 = strT2.equals(StackTraceHelper.NAME_KEY) ? 5 : -1;
                                            break;
                                        case 366554320:
                                            i7 = strT2.equals("fontsize") ? 6 : -1;
                                            break;
                                        case 767321349:
                                            i7 = strT2.equals("borderstyle") ? 7 : -1;
                                            break;
                                        case 1767875043:
                                            i7 = strT2.equals("alignment") ? 8 : -1;
                                            break;
                                        case 1988365454:
                                            i7 = strT2.equals("outlinecolour") ? 9 : -1;
                                            break;
                                        default:
                                            i7 = -1;
                                            break;
                                    }
                                    switch (i7) {
                                        case 0:
                                            i19 = i23;
                                            break;
                                        case 1:
                                            i20 = i23;
                                            break;
                                        case 2:
                                            i21 = i23;
                                            break;
                                        case 3:
                                            i15 = i23;
                                            break;
                                        case 4:
                                            i18 = i23;
                                            break;
                                        case 5:
                                            i13 = i23;
                                            break;
                                        case 6:
                                            i17 = i23;
                                            break;
                                        case 7:
                                            i22 = i23;
                                            break;
                                        case 8:
                                            i14 = i23;
                                            break;
                                        case 9:
                                            i16 = i23;
                                            break;
                                    }
                                }
                                if (i13 != -1) {
                                    cVar = new c(i13, i14, i15, i16, i17, i18, i19, i20, i21, i22, strArrSplit2.length);
                                }
                            } else {
                                if (strH3.startsWith("Style:")) {
                                    if (cVar == null) {
                                        je.b.N("SsaDecoder", "Skipping 'Style:' line before 'Format:' line: ".concat(strH3));
                                    } else {
                                        je.b.g(strH3.startsWith("Style:"));
                                        String[] strArrSplit3 = TextUtils.split(strH3.substring(6), ",");
                                        int length = strArrSplit3.length;
                                        int i24 = cVar.k;
                                        if (length != i24) {
                                            int length2 = strArrSplit3.length;
                                            int i25 = e0.f13788a;
                                            Locale locale = Locale.US;
                                            StringBuilder sbR = a3.e.r(i24, "Skipping malformed 'Style:' line (expected ", length2, " values, found ", "): '");
                                            sbR.append(strH3);
                                            sbR.append("'");
                                            je.b.N("SsaStyle", sbR.toString());
                                        } else {
                                            try {
                                                String strTrim = strArrSplit3[cVar.f366a].trim();
                                                int i26 = cVar.f367b;
                                                int iA = i26 != -1 ? e.a(strArrSplit3[i26].trim()) : -1;
                                                int i27 = cVar.f368c;
                                                Integer numC = i27 != -1 ? e.c(strArrSplit3[i27].trim()) : null;
                                                int i28 = cVar.f369d;
                                                Integer numC2 = i28 != -1 ? e.c(strArrSplit3[i28].trim()) : null;
                                                int i29 = cVar.f370e;
                                                float f2 = -3.4028235E38f;
                                                if (i29 != -1) {
                                                    String strTrim2 = strArrSplit3[i29].trim();
                                                    try {
                                                        f2 = Float.parseFloat(strTrim2);
                                                    } catch (NumberFormatException e10) {
                                                        je.b.O("SsaStyle", "Failed to parse font size: '" + strTrim2 + "'", e10);
                                                    }
                                                }
                                                float f7 = f2;
                                                int i30 = cVar.f371f;
                                                boolean z5 = i30 != -1 && e.b(strArrSplit3[i30].trim());
                                                int i31 = cVar.f372g;
                                                boolean z6 = i31 != -1 && e.b(strArrSplit3[i31].trim());
                                                int i32 = cVar.f373h;
                                                boolean z7 = i32 != -1 && e.b(strArrSplit3[i32].trim());
                                                int i33 = cVar.f374i;
                                                boolean z10 = i33 != -1 && e.b(strArrSplit3[i33].trim());
                                                int i34 = cVar.j;
                                                if (i34 != -1) {
                                                    String strTrim3 = strArrSplit3[i34].trim();
                                                    try {
                                                        int i35 = Integer.parseInt(strTrim3.trim());
                                                        if (i35 == 1 || i35 == 3) {
                                                            i12 = i35;
                                                        } else {
                                                            je.b.N("SsaStyle", "Ignoring unknown BorderStyle: " + strTrim3);
                                                        }
                                                    } catch (NumberFormatException unused2) {
                                                    }
                                                }
                                                eVar = new e(strTrim, iA, numC, numC2, f7, z5, z6, z7, z10, i12);
                                            } catch (RuntimeException e11) {
                                                je.b.O("SsaStyle", "Skipping malformed 'Style:' line: '" + strH3 + "'", e11);
                                                eVar = null;
                                            }
                                            if (eVar != null) {
                                                linkedHashMap.put(eVar.f379a, eVar);
                                            }
                                        }
                                        eVar = null;
                                        if (eVar != null) {
                                            linkedHashMap.put(eVar.f379a, eVar);
                                        }
                                    }
                                }
                                i10 = 2;
                                i11 = 0;
                                c8 = '[';
                            }
                        }
                    }
                }
                this.f357o = linkedHashMap;
            } else if ("[V4 Styles]".equalsIgnoreCase(strH)) {
                je.b.y("SsaDecoder", "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(strH)) {
                return;
            }
        }
    }
}

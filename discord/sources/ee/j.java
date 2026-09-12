package ee;

import android.text.TextUtils;
import app.rive.runtime.kotlin.fonts.Fonts;
import com.discord.misc.utilities.chat_view_types.ChatViewRecyclerTypes;
import com.facebook.react.uimanager.ViewProps;
import e4.m;
import gc.h1;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import je.e0;
import je.w;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends vd.e {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final w f8183m = new w();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final b f8184n = new b();

    /* JADX WARN: Code duplicated, block: B:120:0x0229  */
    /* JADX WARN: Code duplicated, block: B:129:0x024a  */
    /* JADX WARN: Code duplicated, block: B:130:0x0255  */
    /* JADX WARN: Code duplicated, block: B:132:0x025e  */
    /* JADX WARN: Code duplicated, block: B:133:0x0268  */
    /* JADX WARN: Code duplicated, block: B:135:0x0270  */
    /* JADX WARN: Code duplicated, block: B:137:0x0278  */
    /* JADX WARN: Code duplicated, block: B:138:0x027c  */
    /* JADX WARN: Code duplicated, block: B:140:0x0284  */
    /* JADX WARN: Code duplicated, block: B:141:0x028b  */
    /* JADX WARN: Code duplicated, block: B:143:0x0293  */
    /* JADX WARN: Code duplicated, block: B:149:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:151:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:153:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:155:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:156:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:158:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:159:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:161:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:163:0x02df  */
    /* JADX WARN: Code duplicated, block: B:164:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:166:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:168:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:170:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:172:0x0301  */
    /* JADX WARN: Code duplicated, block: B:174:0x0311  */
    /* JADX WARN: Code duplicated, block: B:175:0x032b  */
    /* JADX WARN: Code duplicated, block: B:178:0x033c  */
    /* JADX WARN: Code duplicated, block: B:181:0x0345  */
    /* JADX WARN: Code duplicated, block: B:182:0x0347  */
    /* JADX WARN: Code duplicated, block: B:185:0x0350  */
    /* JADX WARN: Code duplicated, block: B:186:0x0352  */
    /* JADX WARN: Code duplicated, block: B:189:0x035b  */
    /* JADX WARN: Code duplicated, block: B:193:0x0365  */
    /* JADX WARN: Code duplicated, block: B:194:0x036a  */
    /* JADX WARN: Code duplicated, block: B:195:0x036f  */
    /* JADX WARN: Code duplicated, block: B:197:0x0382  */
    /* JADX WARN: Code duplicated, block: B:238:0x035f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x00a5  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Instruction removed from duplicated block: B:174:0x0311, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r4v48 */
    /* JADX WARN: Type inference failed for: r4v49 */
    /* JADX WARN: Type inference failed for: r4v50 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v16 */
    @Override // vd.e
    public final vd.f e(byte[] bArr, int i7, boolean z5) throws vd.h {
        d dVarD;
        String strTrim;
        int i10;
        String string;
        int i11;
        Matcher matcher;
        String strGroup;
        byte b10;
        boolean z6;
        j jVar = this;
        w wVar = jVar.f8183m;
        wVar.D(bArr, i7);
        ArrayList arrayList = new ArrayList();
        try {
            k.d(wVar);
            while (!TextUtils.isEmpty(wVar.h(di.d.f7631c))) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                boolean z7 = false;
                int i12 = -1;
                int i13 = 0;
                byte b11 = -1;
                while (true) {
                    int i14 = 1;
                    if (b11 == -1) {
                        i13 = wVar.f13861b;
                        String strH = wVar.h(di.d.f7631c);
                        if (strH == null) {
                            b11 = 0;
                        } else if ("STYLE".equals(strH)) {
                            b11 = 2;
                        } else {
                            b11 = strH.startsWith("NOTE") ? (byte) 1 : (byte) 3;
                        }
                    } else {
                        wVar.F(i13);
                        if (b11 == 0) {
                            return new m(arrayList2);
                        }
                        if (b11 == 1) {
                            while (!TextUtils.isEmpty(wVar.h(di.d.f7631c))) {
                            }
                        } else {
                            String str = null;
                            if (b11 == 2) {
                                if (!arrayList2.isEmpty()) {
                                    throw new vd.h("A style block was found after the first cue.");
                                }
                                wVar.h(di.d.f7631c);
                                b bVar = jVar.f8184n;
                                w wVar2 = bVar.f8141a;
                                StringBuilder sb2 = bVar.f8142b;
                                sb2.setLength(0);
                                int i15 = wVar.f13861b;
                                while (!TextUtils.isEmpty(wVar.h(di.d.f7631c))) {
                                }
                                wVar2.D(wVar.f13860a, wVar.f13861b);
                                wVar2.F(i15);
                                ArrayList arrayList3 = new ArrayList();
                                while (true) {
                                    b.c(wVar2);
                                    if (wVar2.a() >= 5 && "::cue".equals(wVar2.s(5, di.d.f7631c))) {
                                        int i16 = wVar2.f13861b;
                                        String strB = b.b(wVar2, sb2);
                                        if (strB == null) {
                                            strTrim = str;
                                        } else if ("{".equals(strB)) {
                                            wVar2.F(i16);
                                            strTrim = "";
                                        } else {
                                            if ("(".equals(strB)) {
                                                int i17 = wVar2.f13861b;
                                                int i18 = wVar2.f13862c;
                                                int i19 = z7 ? 1 : 0;
                                                while (i17 < i18 && i19 == 0) {
                                                    int i20 = i17 + 1;
                                                    i19 = ((char) wVar2.f13860a[i17]) == ')' ? i14 : z7 ? 1 : 0;
                                                    i17 = i20;
                                                }
                                                strTrim = wVar2.s((i17 - 1) - wVar2.f13861b, di.d.f7631c).trim();
                                            } else {
                                                strTrim = str;
                                            }
                                            if (!")".equals(b.b(wVar2, sb2))) {
                                                strTrim = str;
                                            }
                                        }
                                    } else {
                                        strTrim = str;
                                    }
                                    if (strTrim != null && "{".equals(b.b(wVar2, sb2))) {
                                        c cVar = new c();
                                        cVar.f8143a = "";
                                        cVar.f8144b = "";
                                        cVar.f8145c = Collections.EMPTY_SET;
                                        cVar.f8146d = "";
                                        cVar.f8147e = str;
                                        cVar.f8149g = z7;
                                        cVar.f8151i = z7;
                                        cVar.j = i12;
                                        cVar.k = i12;
                                        cVar.f8152l = i12;
                                        cVar.f8153m = i12;
                                        cVar.f8154n = i12;
                                        cVar.f8156p = i12;
                                        cVar.f8157q = z7;
                                        if (!"".equals(strTrim)) {
                                            int iIndexOf = strTrim.indexOf(91);
                                            if (iIndexOf != i12) {
                                                Matcher matcher2 = b.f8139c.matcher(strTrim.substring(iIndexOf));
                                                if (matcher2.matches()) {
                                                    String strGroup2 = matcher2.group(i14);
                                                    strGroup2.getClass();
                                                    cVar.f8146d = strGroup2;
                                                }
                                                strTrim = strTrim.substring(z7 ? 1 : 0, iIndexOf);
                                            }
                                            int i21 = e0.f13788a;
                                            String[] strArrSplit = strTrim.split("\\.", i12);
                                            String str2 = strArrSplit[z7 ? 1 : 0];
                                            int iIndexOf2 = str2.indexOf(35);
                                            if (iIndexOf2 != i12) {
                                                cVar.f8144b = str2.substring(z7 ? 1 : 0, iIndexOf2);
                                                cVar.f8143a = str2.substring(iIndexOf2 + 1);
                                            } else {
                                                cVar.f8144b = str2;
                                            }
                                            if (strArrSplit.length > i14) {
                                                int length = strArrSplit.length;
                                                je.b.g(length <= strArrSplit.length ? i14 : z7 ? 1 : 0);
                                                cVar.f8145c = new HashSet(Arrays.asList((String[]) Arrays.copyOfRange(strArrSplit, i14, length)));
                                            }
                                        }
                                        ?? r7 = z7 ? 1 : 0;
                                        String strB2 = null;
                                        while (r7 == 0) {
                                            int i22 = wVar2.f13861b;
                                            strB2 = b.b(wVar2, sb2);
                                            ?? r14 = (strB2 == null || "}".equals(strB2)) ? i14 : z7;
                                            if (r14 == 0) {
                                                wVar2.F(i22);
                                                b.c(wVar2);
                                                String strA = b.a(wVar2, sb2);
                                                if (!"".equals(strA) && ":".equals(b.b(wVar2, sb2))) {
                                                    b.c(wVar2);
                                                    StringBuilder sb3 = new StringBuilder();
                                                    boolean z10 = false;
                                                    while (true) {
                                                        if (z10) {
                                                            string = sb3.toString();
                                                        } else {
                                                            int i23 = wVar2.f13861b;
                                                            boolean z11 = z10;
                                                            String strB3 = b.b(wVar2, sb2);
                                                            if (strB3 == null) {
                                                                string = null;
                                                            } else if ("}".equals(strB3) || ";".equals(strB3)) {
                                                                wVar2.F(i23);
                                                                z10 = true;
                                                            } else {
                                                                sb3.append(strB3);
                                                                z10 = z11;
                                                            }
                                                        }
                                                    }
                                                    if (string == null || "".equals(string)) {
                                                        i10 = 1;
                                                    } else {
                                                        int i24 = wVar2.f13861b;
                                                        String strB4 = b.b(wVar2, sb2);
                                                        if (";".equals(strB4)) {
                                                            if (ViewProps.COLOR.equals(strA)) {
                                                                i11 = 1;
                                                                cVar.f8148f = je.c.a(string, true);
                                                                cVar.f8149g = true;
                                                            } else {
                                                                i11 = 1;
                                                                if ("background-color".equals(strA)) {
                                                                    cVar.f8150h = je.c.a(string, true);
                                                                    cVar.f8151i = true;
                                                                } else if ("ruby-position".equals(strA)) {
                                                                    if ("text-combine-upright".equals(strA)) {
                                                                        if ("all".equals(string)) {
                                                                            z6 = true;
                                                                        } else {
                                                                            z6 = true;
                                                                        }
                                                                        cVar.f8157q = z6;
                                                                    } else if ("text-decoration".equals(strA)) {
                                                                        if ("underline".equals(string)) {
                                                                            i11 = 1;
                                                                            cVar.k = 1;
                                                                        }
                                                                    } else if ("font-family".equals(strA)) {
                                                                        cVar.f8147e = m3.m.T(string);
                                                                    } else if ("font-weight".equals(strA)) {
                                                                        i11 = 1;
                                                                        if ("font-style".equals(strA)) {
                                                                            if (Fonts.Font.STYLE_ITALIC.equals(string)) {
                                                                                cVar.f8153m = 1;
                                                                            }
                                                                        } else if ("font-size".equals(strA)) {
                                                                            matcher = b.f8140d.matcher(m3.m.T(string));
                                                                            if (matcher.matches()) {
                                                                                strGroup = matcher.group(2);
                                                                                strGroup.getClass();
                                                                                switch (strGroup.hashCode()) {
                                                                                    case ChatViewRecyclerTypes.POLL_TEXT_AND_IMAGE /* 37 */:
                                                                                        if (!strGroup.equals("%")) {
                                                                                            b10 = 0;
                                                                                        }
                                                                                        switch (b10) {
                                                                                            case 0:
                                                                                                i10 = 1;
                                                                                                cVar.f8154n = 3;
                                                                                                break;
                                                                                            case 1:
                                                                                                i10 = 1;
                                                                                                cVar.f8154n = 2;
                                                                                                break;
                                                                                            case 2:
                                                                                                i10 = 1;
                                                                                                cVar.f8154n = 1;
                                                                                                break;
                                                                                            default:
                                                                                                throw new IllegalStateException();
                                                                                        }
                                                                                        String strGroup3 = matcher.group(i10);
                                                                                        strGroup3.getClass();
                                                                                        cVar.f8155o = Float.parseFloat(strGroup3);
                                                                                        break;
                                                                                    case 3240:
                                                                                        if (!strGroup.equals("em")) {
                                                                                            b10 = 1;
                                                                                        }
                                                                                        switch (b10) {
                                                                                            case 0:
                                                                                                i10 = 1;
                                                                                                cVar.f8154n = 3;
                                                                                                break;
                                                                                            case 1:
                                                                                                i10 = 1;
                                                                                                cVar.f8154n = 2;
                                                                                                break;
                                                                                            case 2:
                                                                                                i10 = 1;
                                                                                                cVar.f8154n = 1;
                                                                                                break;
                                                                                            default:
                                                                                                throw new IllegalStateException();
                                                                                        }
                                                                                        String strGroup4 = matcher.group(i10);
                                                                                        strGroup4.getClass();
                                                                                        cVar.f8155o = Float.parseFloat(strGroup4);
                                                                                        break;
                                                                                    case 3592:
                                                                                        if (!strGroup.equals("px")) {
                                                                                            b10 = 2;
                                                                                        }
                                                                                        switch (b10) {
                                                                                            case 0:
                                                                                                i10 = 1;
                                                                                                cVar.f8154n = 3;
                                                                                                break;
                                                                                            case 1:
                                                                                                i10 = 1;
                                                                                                cVar.f8154n = 2;
                                                                                                break;
                                                                                            case 2:
                                                                                                i10 = 1;
                                                                                                cVar.f8154n = 1;
                                                                                                break;
                                                                                            default:
                                                                                                throw new IllegalStateException();
                                                                                        }
                                                                                        String strGroup5 = matcher.group(i10);
                                                                                        strGroup5.getClass();
                                                                                        cVar.f8155o = Float.parseFloat(strGroup5);
                                                                                        break;
                                                                                }
                                                                                b10 = -1;
                                                                                switch (b10) {
                                                                                    case 0:
                                                                                        i10 = 1;
                                                                                        cVar.f8154n = 3;
                                                                                        break;
                                                                                    case 1:
                                                                                        i10 = 1;
                                                                                        cVar.f8154n = 2;
                                                                                        break;
                                                                                    case 2:
                                                                                        i10 = 1;
                                                                                        cVar.f8154n = 1;
                                                                                        break;
                                                                                    default:
                                                                                        throw new IllegalStateException();
                                                                                }
                                                                                String strGroup6 = matcher.group(i10);
                                                                                strGroup6.getClass();
                                                                                cVar.f8155o = Float.parseFloat(strGroup6);
                                                                            } else {
                                                                                je.b.N("WebvttCssParser", "Invalid font-size: '" + string + "'.");
                                                                            }
                                                                        }
                                                                    } else if ("bold".equals(string)) {
                                                                        i11 = 1;
                                                                        cVar.f8152l = 1;
                                                                    }
                                                                    i10 = 1;
                                                                } else if ("over".equals(string)) {
                                                                    cVar.f8156p = 1;
                                                                } else if ("under".equals(string)) {
                                                                    cVar.f8156p = 2;
                                                                    i10 = 1;
                                                                } else {
                                                                    i10 = 1;
                                                                }
                                                            }
                                                            i10 = i11;
                                                        } else if ("}".equals(strB4)) {
                                                            wVar2.F(i24);
                                                            if (ViewProps.COLOR.equals(strA)) {
                                                                i11 = 1;
                                                                cVar.f8148f = je.c.a(string, true);
                                                                cVar.f8149g = true;
                                                            } else {
                                                                i11 = 1;
                                                                if ("background-color".equals(strA)) {
                                                                    cVar.f8150h = je.c.a(string, true);
                                                                    cVar.f8151i = true;
                                                                } else if ("ruby-position".equals(strA)) {
                                                                    if ("text-combine-upright".equals(strA)) {
                                                                        if ("all".equals(string) || string.startsWith("digits")) {
                                                                            z6 = true;
                                                                        } else {
                                                                            z6 = false;
                                                                        }
                                                                        cVar.f8157q = z6;
                                                                    } else if ("text-decoration".equals(strA)) {
                                                                        if ("underline".equals(string)) {
                                                                            i11 = 1;
                                                                            cVar.k = 1;
                                                                        }
                                                                    } else if ("font-family".equals(strA)) {
                                                                        cVar.f8147e = m3.m.T(string);
                                                                    } else if ("font-weight".equals(strA)) {
                                                                        i11 = 1;
                                                                        if ("font-style".equals(strA)) {
                                                                            if (Fonts.Font.STYLE_ITALIC.equals(string)) {
                                                                                cVar.f8153m = 1;
                                                                            }
                                                                        } else if ("font-size".equals(strA)) {
                                                                            matcher = b.f8140d.matcher(m3.m.T(string));
                                                                            if (matcher.matches()) {
                                                                                je.b.N("WebvttCssParser", "Invalid font-size: '" + string + "'.");
                                                                            } else {
                                                                                strGroup = matcher.group(2);
                                                                                strGroup.getClass();
                                                                                switch (strGroup.hashCode()) {
                                                                                    case ChatViewRecyclerTypes.POLL_TEXT_AND_IMAGE /* 37 */:
                                                                                        if (!strGroup.equals("%")) {
                                                                                            b10 = 0;
                                                                                        }
                                                                                        switch (b10) {
                                                                                            case 0:
                                                                                                i10 = 1;
                                                                                                cVar.f8154n = 3;
                                                                                                break;
                                                                                            case 1:
                                                                                                i10 = 1;
                                                                                                cVar.f8154n = 2;
                                                                                                break;
                                                                                            case 2:
                                                                                                i10 = 1;
                                                                                                cVar.f8154n = 1;
                                                                                                break;
                                                                                            default:
                                                                                                throw new IllegalStateException();
                                                                                        }
                                                                                        String strGroup7 = matcher.group(i10);
                                                                                        strGroup7.getClass();
                                                                                        cVar.f8155o = Float.parseFloat(strGroup7);
                                                                                        break;
                                                                                    case 3240:
                                                                                        if (!strGroup.equals("em")) {
                                                                                            b10 = 1;
                                                                                        }
                                                                                        switch (b10) {
                                                                                            case 0:
                                                                                                i10 = 1;
                                                                                                cVar.f8154n = 3;
                                                                                                break;
                                                                                            case 1:
                                                                                                i10 = 1;
                                                                                                cVar.f8154n = 2;
                                                                                                break;
                                                                                            case 2:
                                                                                                i10 = 1;
                                                                                                cVar.f8154n = 1;
                                                                                                break;
                                                                                            default:
                                                                                                throw new IllegalStateException();
                                                                                        }
                                                                                        String strGroup8 = matcher.group(i10);
                                                                                        strGroup8.getClass();
                                                                                        cVar.f8155o = Float.parseFloat(strGroup8);
                                                                                        break;
                                                                                    case 3592:
                                                                                        if (!strGroup.equals("px")) {
                                                                                            b10 = 2;
                                                                                        }
                                                                                        switch (b10) {
                                                                                            case 0:
                                                                                                i10 = 1;
                                                                                                cVar.f8154n = 3;
                                                                                                break;
                                                                                            case 1:
                                                                                                i10 = 1;
                                                                                                cVar.f8154n = 2;
                                                                                                break;
                                                                                            case 2:
                                                                                                i10 = 1;
                                                                                                cVar.f8154n = 1;
                                                                                                break;
                                                                                            default:
                                                                                                throw new IllegalStateException();
                                                                                        }
                                                                                        String strGroup9 = matcher.group(i10);
                                                                                        strGroup9.getClass();
                                                                                        cVar.f8155o = Float.parseFloat(strGroup9);
                                                                                        break;
                                                                                }
                                                                                b10 = -1;
                                                                                switch (b10) {
                                                                                    case 0:
                                                                                        i10 = 1;
                                                                                        cVar.f8154n = 3;
                                                                                        break;
                                                                                    case 1:
                                                                                        i10 = 1;
                                                                                        cVar.f8154n = 2;
                                                                                        break;
                                                                                    case 2:
                                                                                        i10 = 1;
                                                                                        cVar.f8154n = 1;
                                                                                        break;
                                                                                    default:
                                                                                        throw new IllegalStateException();
                                                                                }
                                                                                String strGroup10 = matcher.group(i10);
                                                                                strGroup10.getClass();
                                                                                cVar.f8155o = Float.parseFloat(strGroup10);
                                                                            }
                                                                        }
                                                                    } else if ("bold".equals(string)) {
                                                                        i11 = 1;
                                                                        cVar.f8152l = 1;
                                                                    }
                                                                    i10 = 1;
                                                                } else if ("over".equals(string)) {
                                                                    cVar.f8156p = 1;
                                                                } else if ("under".equals(string)) {
                                                                    cVar.f8156p = 2;
                                                                    i10 = 1;
                                                                } else {
                                                                    i10 = 1;
                                                                }
                                                            }
                                                            i10 = i11;
                                                        } else {
                                                            i10 = 1;
                                                        }
                                                    }
                                                } else {
                                                    i10 = i14;
                                                }
                                            } else {
                                                i10 = i14;
                                            }
                                            i14 = i10;
                                            r7 = r14;
                                            z7 = false;
                                        }
                                        int i25 = i14;
                                        if ("}".equals(strB2)) {
                                            arrayList3.add(cVar);
                                        }
                                        i14 = i25;
                                        z7 = false;
                                        i12 = -1;
                                        str = null;
                                    }
                                }
                                arrayList.addAll(arrayList3);
                            } else if (b11 == 3) {
                                Pattern pattern = i.f8179a;
                                Charset charset = di.d.f7631c;
                                String strH2 = wVar.h(charset);
                                if (strH2 == null) {
                                    dVarD = null;
                                } else {
                                    Pattern pattern2 = i.f8179a;
                                    Matcher matcher3 = pattern2.matcher(strH2);
                                    if (matcher3.matches()) {
                                        dVarD = i.d(null, matcher3, wVar, arrayList);
                                    } else {
                                        dVarD = null;
                                        String strH3 = wVar.h(charset);
                                        if (strH3 != null) {
                                            Matcher matcher4 = pattern2.matcher(strH3);
                                            if (matcher4.matches()) {
                                                dVarD = i.d(strH2.trim(), matcher4, wVar, arrayList);
                                            }
                                        }
                                    }
                                }
                                if (dVarD != null) {
                                    arrayList2.add(dVarD);
                                }
                            }
                            jVar = this;
                        }
                    }
                }
            }
        } catch (h1 e10) {
            throw new vd.h(e10);
        }
    }
}

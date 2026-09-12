package ee;

import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import je.e0;
import je.w;

/* JADX INFO: loaded from: classes3.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f8179a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f8180b = Pattern.compile("(\\S+?):(\\S+)");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Map f8181c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Map f8182d;

    static {
        HashMap map = new HashMap();
        map.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f8181c = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        map2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f8182d = Collections.unmodifiableMap(map2);
    }

    public static void a(String str, f fVar, List list, SpannableStringBuilder spannableStringBuilder, List list2) {
        int i7;
        int i10;
        int i11;
        int i12 = fVar.f8165b;
        int length = spannableStringBuilder.length();
        String str2 = fVar.f8164a;
        str2.getClass();
        int i13 = -1;
        switch (str2) {
            case "":
            case "v":
            case "lang":
                break;
            case "b":
                spannableStringBuilder.setSpan(new StyleSpan(1), i12, length, 33);
                break;
            case "c":
                for (String str3 : fVar.f8167d) {
                    Map map = f8181c;
                    if (map.containsKey(str3)) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(((Integer) map.get(str3)).intValue()), i12, length, 33);
                    } else {
                        Map map2 = f8182d;
                        if (map2.containsKey(str3)) {
                            spannableStringBuilder.setSpan(new BackgroundColorSpan(((Integer) map2.get(str3)).intValue()), i12, length, 33);
                        }
                    }
                }
                break;
            case "i":
                spannableStringBuilder.setSpan(new StyleSpan(2), i12, length, 33);
                break;
            case "u":
                spannableStringBuilder.setSpan(new UnderlineSpan(), i12, length, 33);
                break;
            case "ruby":
                int iC = c(list2, str, fVar);
                ArrayList arrayList = new ArrayList(list.size());
                arrayList.addAll(list);
                Collections.sort(arrayList, e.f8161c);
                int i14 = fVar.f8165b;
                int i15 = 0;
                int length2 = 0;
                while (i15 < arrayList.size()) {
                    if ("rt".equals(((e) arrayList.get(i15)).f8162a.f8164a)) {
                        e eVar = (e) arrayList.get(i15);
                        int iC2 = c(list2, str, eVar.f8162a);
                        if (iC2 == i13) {
                            iC2 = iC != i13 ? iC : 1;
                        }
                        int i16 = eVar.f8162a.f8165b - length2;
                        int i17 = eVar.f8163b - length2;
                        CharSequence charSequenceSubSequence = spannableStringBuilder.subSequence(i16, i17);
                        spannableStringBuilder.delete(i16, i17);
                        spannableStringBuilder.setSpan(new zd.c(charSequenceSubSequence.toString(), iC2), i14, i16, 33);
                        length2 = charSequenceSubSequence.length() + length2;
                        i14 = i16;
                    }
                    i15++;
                    i13 = -1;
                }
                break;
            default:
                return;
        }
        ArrayList arrayListB = b(list2, str, fVar);
        for (int i18 = 0; i18 < arrayListB.size(); i18++) {
            c cVar = ((g) arrayListB.get(i18)).f8169e;
            int i19 = cVar.f8152l;
            if (i19 == -1 && cVar.f8153m == -1) {
                i7 = -1;
            } else {
                i7 = (cVar.f8153m == 1 ? (char) 2 : (char) 0) | (i19 == 1 ? (char) 1 : (char) 0);
            }
            if (i7 != -1) {
                int i20 = cVar.f8152l;
                if (i20 == -1 && cVar.f8153m == -1) {
                    i11 = -1;
                    i10 = 1;
                } else {
                    i10 = 1;
                    i11 = (i20 == 1 ? 1 : 0) | (cVar.f8153m == 1 ? 2 : 0);
                }
                ls.d.f(spannableStringBuilder, new StyleSpan(i11), i12, length);
            } else {
                i10 = 1;
            }
            if (cVar.j == i10) {
                spannableStringBuilder.setSpan(new StrikethroughSpan(), i12, length, 33);
            }
            if (cVar.k == i10) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i12, length, 33);
            }
            if (cVar.f8149g) {
                if (!cVar.f8149g) {
                    throw new IllegalStateException("Font color not defined");
                }
                ls.d.f(spannableStringBuilder, new ForegroundColorSpan(cVar.f8148f), i12, length);
            }
            if (cVar.f8151i) {
                if (!cVar.f8151i) {
                    throw new IllegalStateException("Background color not defined.");
                }
                ls.d.f(spannableStringBuilder, new BackgroundColorSpan(cVar.f8150h), i12, length);
            }
            if (cVar.f8147e != null) {
                ls.d.f(spannableStringBuilder, new TypefaceSpan(cVar.f8147e), i12, length);
            }
            int i21 = cVar.f8154n;
            if (i21 == 1) {
                ls.d.f(spannableStringBuilder, new AbsoluteSizeSpan((int) cVar.f8155o, true), i12, length);
            } else if (i21 == 2) {
                ls.d.f(spannableStringBuilder, new RelativeSizeSpan(cVar.f8155o), i12, length);
            } else if (i21 == 3) {
                ls.d.f(spannableStringBuilder, new RelativeSizeSpan(cVar.f8155o / 100.0f), i12, length);
            }
            if (cVar.f8157q) {
                spannableStringBuilder.setSpan(new zd.a(), i12, length, 33);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v5, types: [int] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    public static ArrayList b(List list, String str, f fVar) {
        ?? r5;
        int size;
        boolean zIsEmpty;
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < list.size(); i7++) {
            c cVar = (c) list.get(i7);
            String str2 = fVar.f8164a;
            Set set = fVar.f8167d;
            String str3 = fVar.f8166c;
            if (cVar.f8143a.isEmpty() && cVar.f8144b.isEmpty() && cVar.f8145c.isEmpty() && cVar.f8146d.isEmpty()) {
                zIsEmpty = TextUtils.isEmpty(str2);
            } else {
                int iA = c.a(c.a(c.a(0, 1073741824, cVar.f8143a, str), 2, cVar.f8144b, str2), 4, cVar.f8146d, str3);
                if (iA == -1 || !set.containsAll(cVar.f8145c)) {
                    r5 = 0;
                } else {
                    size = iA + (cVar.f8145c.size() * 4);
                }
            }
            if (r5 > 0) {
                r5 = size;
                r5 = zIsEmpty;
                arrayList.add(new g(r5, cVar));
            } else {
                r5 = size;
                r5 = zIsEmpty;
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static int c(List list, String str, f fVar) {
        ArrayList arrayListB = b(list, str, fVar);
        for (int i7 = 0; i7 < arrayListB.size(); i7++) {
            int i10 = ((g) arrayListB.get(i7)).f8169e.f8156p;
            if (i10 != -1) {
                return i10;
            }
        }
        return -1;
    }

    public static d d(String str, Matcher matcher, w wVar, ArrayList arrayList) {
        h hVar = new h();
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            hVar.f8170a = k.c(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            hVar.f8171b = k.c(strGroup2);
            String strGroup3 = matcher.group(3);
            strGroup3.getClass();
            e(strGroup3, hVar);
            StringBuilder sb2 = new StringBuilder();
            wVar.getClass();
            String strH = wVar.h(di.d.f7631c);
            while (!TextUtils.isEmpty(strH)) {
                if (sb2.length() > 0) {
                    sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                }
                sb2.append(strH.trim());
                strH = wVar.h(di.d.f7631c);
            }
            hVar.f8172c = f(str, sb2.toString(), arrayList);
            return new d(hVar.a().a(), hVar.f8170a, hVar.f8171b);
        } catch (NumberFormatException unused) {
            je.b.N("WebvttCueParser", "Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void e(String str, h hVar) {
        int i7;
        int i10;
        int i11;
        Matcher matcher = f8180b.matcher(str);
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            try {
                if ("line".equals(strGroup)) {
                    g(strGroup2, hVar);
                } else {
                    if ("align".equals(strGroup)) {
                        switch (strGroup2) {
                            case "center":
                            case "middle":
                                i7 = 2;
                                break;
                            case "end":
                                i7 = 3;
                                break;
                            case "left":
                                i7 = 4;
                                break;
                            case "right":
                                i7 = 5;
                                break;
                            case "start":
                                i7 = 1;
                                break;
                            default:
                                je.b.N("WebvttCueParser", "Invalid alignment value: ".concat(strGroup2));
                                i7 = 2;
                                break;
                        }
                        hVar.f8173d = i7;
                    } else if (ViewProps.POSITION.equals(strGroup)) {
                        int iIndexOf = strGroup2.indexOf(44);
                        if (iIndexOf != -1) {
                            String strSubstring = strGroup2.substring(iIndexOf + 1);
                            strSubstring.getClass();
                            switch (strSubstring) {
                                case "line-left":
                                case "start":
                                    i10 = 0;
                                    break;
                                case "center":
                                case "middle":
                                    i10 = 1;
                                    break;
                                case "line-right":
                                case "end":
                                    i10 = 2;
                                    break;
                                default:
                                    je.b.N("WebvttCueParser", "Invalid anchor value: ".concat(strSubstring));
                                    i10 = Integer.MIN_VALUE;
                                    break;
                            }
                            hVar.f8178i = i10;
                            strGroup2 = strGroup2.substring(0, iIndexOf);
                        }
                        hVar.f8177h = k.b(strGroup2);
                    } else if ("size".equals(strGroup)) {
                        hVar.j = k.b(strGroup2);
                    } else if ("vertical".equals(strGroup)) {
                        if (strGroup2.equals("lr")) {
                            i11 = 2;
                        } else if (strGroup2.equals("rl")) {
                            i11 = 1;
                        } else {
                            je.b.N("WebvttCueParser", "Invalid 'vertical' value: ".concat(strGroup2));
                            i11 = Integer.MIN_VALUE;
                        }
                        hVar.k = i11;
                    } else {
                        je.b.N("WebvttCueParser", "Unknown cue setting " + strGroup + ":" + strGroup2);
                    }
                }
            } catch (NumberFormatException unused) {
                je.b.N("WebvttCueParser", "Skipping bad cue setting: " + matcher.group());
            }
        }
    }

    public static SpannedString f(String str, String str2, List list) {
        char c8;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i7 = 0;
        while (true) {
            String strTrim = "";
            if (i7 >= str2.length()) {
                while (!arrayDeque.isEmpty()) {
                    a(str, (f) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
                }
                a(str, new f("", 0, "", Collections.EMPTY_SET), Collections.EMPTY_LIST, spannableStringBuilder, list);
                return SpannedString.valueOf(spannableStringBuilder);
            }
            char cCharAt = str2.charAt(i7);
            if (cCharAt == '&') {
                i7++;
                int iIndexOf = str2.indexOf(59, i7);
                int iIndexOf2 = str2.indexOf(32, i7);
                if (iIndexOf == -1) {
                    iIndexOf = iIndexOf2;
                } else if (iIndexOf2 != -1) {
                    iIndexOf = Math.min(iIndexOf, iIndexOf2);
                }
                if (iIndexOf != -1) {
                    String strSubstring = str2.substring(i7, iIndexOf);
                    strSubstring.getClass();
                    switch (strSubstring) {
                        case "gt":
                            spannableStringBuilder.append('>');
                            break;
                        case "lt":
                            spannableStringBuilder.append('<');
                            break;
                        case "amp":
                            spannableStringBuilder.append('&');
                            break;
                        case "nbsp":
                            spannableStringBuilder.append(' ');
                            break;
                        default:
                            je.b.N("WebvttCueParser", "ignoring unsupported entity: '&" + strSubstring + ";'");
                            break;
                    }
                    if (iIndexOf == iIndexOf2) {
                        spannableStringBuilder.append((CharSequence) " ");
                    }
                    i7 = iIndexOf + 1;
                } else {
                    spannableStringBuilder.append(cCharAt);
                }
            } else if (cCharAt != '<') {
                spannableStringBuilder.append(cCharAt);
                i7++;
            } else {
                int length = i7 + 1;
                if (length < str2.length()) {
                    boolean z5 = str2.charAt(length) == '/';
                    int iIndexOf3 = str2.indexOf(62, length);
                    length = iIndexOf3 == -1 ? str2.length() : iIndexOf3 + 1;
                    int i10 = length - 2;
                    boolean z6 = str2.charAt(i10) == '/';
                    int i11 = i7 + (z5 ? 2 : 1);
                    if (!z6) {
                        i10 = length - 1;
                    }
                    String strSubstring2 = str2.substring(i11, i10);
                    if (!strSubstring2.trim().isEmpty()) {
                        String strTrim2 = strSubstring2.trim();
                        je.b.g(!strTrim2.isEmpty());
                        int i12 = e0.f13788a;
                        String str3 = strTrim2.split("[ \\.]", 2)[0];
                        str3.getClass();
                        switch (str3) {
                            case "b":
                            case "c":
                            case "i":
                            case "u":
                            case "v":
                            case "rt":
                            case "lang":
                            case "ruby":
                                if (!z5) {
                                    if (!z6) {
                                        int length2 = spannableStringBuilder.length();
                                        String strTrim3 = strSubstring2.trim();
                                        je.b.g(!strTrim3.isEmpty());
                                        int iIndexOf4 = strTrim3.indexOf(" ");
                                        if (iIndexOf4 == -1) {
                                            c8 = 0;
                                        } else {
                                            strTrim = strTrim3.substring(iIndexOf4).trim();
                                            c8 = 0;
                                            strTrim3 = strTrim3.substring(0, iIndexOf4);
                                        }
                                        String[] strArrSplit = strTrim3.split("\\.", -1);
                                        String str4 = strArrSplit[c8];
                                        HashSet hashSet = new HashSet();
                                        for (int i13 = 1; i13 < strArrSplit.length; i13++) {
                                            hashSet.add(strArrSplit[i13]);
                                        }
                                        arrayDeque.push(new f(str4, length2, strTrim, hashSet));
                                    }
                                    break;
                                } else {
                                    while (!arrayDeque.isEmpty()) {
                                        f fVar = (f) arrayDeque.pop();
                                        a(str, fVar, arrayList, spannableStringBuilder, list);
                                        if (arrayDeque.isEmpty()) {
                                            arrayList.clear();
                                        } else {
                                            arrayList.add(new e(fVar, spannableStringBuilder.length()));
                                        }
                                        if (fVar.f8164a.equals(str3)) {
                                            break;
                                        }
                                    }
                                    break;
                                }
                                break;
                        }
                    }
                }
                i7 = length;
            }
        }
    }

    public static void g(String str, h hVar) {
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            String strSubstring = str.substring(iIndexOf + 1);
            strSubstring.getClass();
            int i7 = 2;
            switch (strSubstring) {
                case "center":
                case "middle":
                    i7 = 1;
                    break;
                case "end":
                    break;
                case "start":
                    i7 = 0;
                    break;
                default:
                    je.b.N("WebvttCueParser", "Invalid anchor value: ".concat(strSubstring));
                    i7 = Integer.MIN_VALUE;
                    break;
            }
            hVar.f8176g = i7;
            str = str.substring(0, iIndexOf);
        }
        if (str.endsWith("%")) {
            hVar.f8174e = k.b(str);
            hVar.f8175f = 0;
        } else {
            hVar.f8174e = Integer.parseInt(str);
            hVar.f8175f = 1;
        }
    }
}

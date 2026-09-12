package ce;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Pair;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import je.e0;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f3613c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f3614d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f3615e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g f3616f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String[] f3617g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f3618h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f3619i;
    public final e j;
    public final HashMap k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final HashMap f3620l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ArrayList f3621m;

    public e(String str, String str2, long j, long j5, g gVar, String[] strArr, String str3, String str4, e eVar) {
        this.f3611a = str;
        this.f3612b = str2;
        this.f3619i = str4;
        this.f3616f = gVar;
        this.f3617g = strArr;
        this.f3613c = str2 != null;
        this.f3614d = j;
        this.f3615e = j5;
        str3.getClass();
        this.f3618h = str3;
        this.j = eVar;
        this.k = new HashMap();
        this.f3620l = new HashMap();
    }

    public static e a(String str) {
        return new e(null, str.replaceAll("\r\n", ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE).replaceAll(" *\n *", ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE).replaceAll(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE, " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    public static SpannableStringBuilder e(String str, TreeMap treeMap) {
        if (!treeMap.containsKey(str)) {
            vd.b bVar = new vd.b();
            bVar.f21618a = new SpannableStringBuilder();
            treeMap.put(str, bVar);
        }
        CharSequence charSequence = ((vd.b) treeMap.get(str)).f21618a;
        charSequence.getClass();
        return (SpannableStringBuilder) charSequence;
    }

    public final e b(int i7) {
        ArrayList arrayList = this.f3621m;
        if (arrayList != null) {
            return (e) arrayList.get(i7);
        }
        throw new IndexOutOfBoundsException();
    }

    public final int c() {
        ArrayList arrayList = this.f3621m;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final void d(TreeSet treeSet, boolean z5) {
        String str = this.f3611a;
        boolean zEquals = "p".equals(str);
        boolean zEquals2 = "div".equals(str);
        if (z5 || zEquals || (zEquals2 && this.f3619i != null)) {
            long j = this.f3614d;
            if (j != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j));
            }
            long j5 = this.f3615e;
            if (j5 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j5));
            }
        }
        if (this.f3621m == null) {
            return;
        }
        for (int i7 = 0; i7 < this.f3621m.size(); i7++) {
            ((e) this.f3621m.get(i7)).d(treeSet, z5 || zEquals);
        }
    }

    public final boolean f(long j) {
        long j5 = this.f3614d;
        long j7 = this.f3615e;
        if (j5 == -9223372036854775807L && j7 == -9223372036854775807L) {
            return true;
        }
        if (j5 <= j && j7 == -9223372036854775807L) {
            return true;
        }
        if (j5 != -9223372036854775807L || j >= j7) {
            return j5 <= j && j < j7;
        }
        return true;
    }

    public final void g(long j, String str, ArrayList arrayList) {
        String str2;
        String str3 = this.f3618h;
        if (!"".equals(str3)) {
            str = str3;
        }
        if (f(j) && "div".equals(this.f3611a) && (str2 = this.f3619i) != null) {
            arrayList.add(new Pair(str, str2));
            return;
        }
        for (int i7 = 0; i7 < c(); i7++) {
            b(i7).g(j, str, arrayList);
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:48:0x00bb  */
    public final void h(long j, Map map, HashMap map2, String str, TreeMap treeMap) {
        int i7;
        e eVar;
        g gVarI;
        int i10;
        int i11;
        int i12;
        int i13;
        Map map3 = map;
        if (f(j)) {
            String str2 = this.f3618h;
            String str3 = "".equals(str2) ? str : str2;
            for (Map.Entry entry : this.f3620l.entrySet()) {
                String str4 = (String) entry.getKey();
                HashMap map4 = this.k;
                int iIntValue = map4.containsKey(str4) ? ((Integer) map4.get(str4)).intValue() : 0;
                int iIntValue2 = ((Integer) entry.getValue()).intValue();
                if (iIntValue != iIntValue2) {
                    vd.b bVar = (vd.b) treeMap.get(str4);
                    bVar.getClass();
                    f fVar = (f) map2.get(str3);
                    fVar.getClass();
                    int i14 = fVar.j;
                    g gVarI2 = com.facebook.imagepipeline.nativecode.c.I(this.f3616f, this.f3617g, map3);
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) bVar.f21618a;
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                        bVar.f21618a = spannableStringBuilder;
                    }
                    if (gVarI2 != null) {
                        int i15 = gVarI2.f3638h;
                        int i16 = 1;
                        if (((i15 == -1 && gVarI2.f3639i == -1) ? -1 : (i15 == 1 ? (char) 1 : (char) 0) | (gVarI2.f3639i == 1 ? (char) 2 : (char) 0)) != -1) {
                            int i17 = gVarI2.f3638h;
                            if (i17 != -1) {
                                if (i17 == i16) {
                                    i11 = i16;
                                } else {
                                    i11 = 0;
                                }
                                if (gVarI2.f3639i == i16) {
                                    i12 = 2;
                                } else {
                                    i12 = 0;
                                }
                                i13 = i11 | i12;
                            } else if (gVarI2.f3639i == -1) {
                                i13 = -1;
                                i16 = 1;
                            } else {
                                i16 = 1;
                                if (i17 == i16) {
                                    i11 = i16;
                                } else {
                                    i11 = 0;
                                }
                                if (gVarI2.f3639i == i16) {
                                    i12 = 2;
                                } else {
                                    i12 = 0;
                                }
                                i13 = i11 | i12;
                            }
                            StyleSpan styleSpan = new StyleSpan(i13);
                            i7 = 33;
                            spannableStringBuilder.setSpan(styleSpan, iIntValue, iIntValue2, 33);
                        } else {
                            i7 = 33;
                        }
                        if (gVarI2.f3636f == i16) {
                            spannableStringBuilder.setSpan(new StrikethroughSpan(), iIntValue, iIntValue2, i7);
                        }
                        if (gVarI2.f3637g == i16) {
                            spannableStringBuilder.setSpan(new UnderlineSpan(), iIntValue, iIntValue2, i7);
                        }
                        if (gVarI2.f3633c) {
                            if (!gVarI2.f3633c) {
                                throw new IllegalStateException("Font color has not been defined.");
                            }
                            ls.d.f(spannableStringBuilder, new ForegroundColorSpan(gVarI2.f3632b), iIntValue, iIntValue2);
                        }
                        if (gVarI2.f3635e) {
                            if (!gVarI2.f3635e) {
                                throw new IllegalStateException("Background color has not been defined.");
                            }
                            ls.d.f(spannableStringBuilder, new BackgroundColorSpan(gVarI2.f3634d), iIntValue, iIntValue2);
                        }
                        if (gVarI2.f3631a != null) {
                            ls.d.f(spannableStringBuilder, new TypefaceSpan(gVarI2.f3631a), iIntValue, iIntValue2);
                        }
                        b bVar2 = gVarI2.f3646r;
                        if (bVar2 != null) {
                            int i18 = bVar2.f3595a;
                            if (i18 == -1) {
                                i18 = (i14 == 2 || i14 == 1) ? 3 : 1;
                                i10 = 1;
                            } else {
                                i10 = bVar2.f3596b;
                            }
                            int i19 = bVar2.f3597c;
                            if (i19 == -2) {
                                i19 = 1;
                            }
                            ls.d.f(spannableStringBuilder, new zd.d(i18, i10, i19), iIntValue, iIntValue2);
                        }
                        int i20 = gVarI2.f3641m;
                        if (i20 == 2) {
                            e eVar2 = this.j;
                            while (true) {
                                if (eVar2 == null) {
                                    eVar2 = null;
                                    break;
                                }
                                g gVarI3 = com.facebook.imagepipeline.nativecode.c.I(eVar2.f3616f, eVar2.f3617g, map3);
                                if (gVarI3 != null && gVarI3.f3641m == 1) {
                                    break;
                                } else {
                                    eVar2 = eVar2.j;
                                }
                            }
                            if (eVar2 != null) {
                                ArrayDeque arrayDeque = new ArrayDeque();
                                arrayDeque.push(eVar2);
                                while (true) {
                                    if (arrayDeque.isEmpty()) {
                                        eVar = null;
                                        break;
                                    }
                                    e eVar3 = (e) arrayDeque.pop();
                                    g gVarI4 = com.facebook.imagepipeline.nativecode.c.I(eVar3.f3616f, eVar3.f3617g, map3);
                                    if (gVarI4 != null && gVarI4.f3641m == 3) {
                                        eVar = eVar3;
                                        break;
                                    }
                                    for (int iC = eVar3.c() - 1; iC >= 0; iC--) {
                                        arrayDeque.push(eVar3.b(iC));
                                    }
                                }
                                if (eVar != null) {
                                    if (eVar.c() != 1 || eVar.b(0).f3612b == null) {
                                        je.b.y("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                                    } else {
                                        String str5 = eVar.b(0).f3612b;
                                        int i21 = e0.f13788a;
                                        g gVarI5 = com.facebook.imagepipeline.nativecode.c.I(eVar.f3616f, eVar.f3617g, map3);
                                        int i22 = gVarI5 != null ? gVarI5.f3642n : -1;
                                        if (i22 == -1 && (gVarI = com.facebook.imagepipeline.nativecode.c.I(eVar2.f3616f, eVar2.f3617g, map3)) != null) {
                                            i22 = gVarI.f3642n;
                                        }
                                        spannableStringBuilder.setSpan(new zd.c(str5, i22), iIntValue, iIntValue2, 33);
                                    }
                                }
                            }
                        } else if (i20 == 3 || i20 == 4) {
                            spannableStringBuilder.setSpan(new a(), iIntValue, iIntValue2, 33);
                        }
                        if (gVarI2.f3645q == 1) {
                            ls.d.f(spannableStringBuilder, new zd.a(), iIntValue, iIntValue2);
                        }
                        int i23 = gVarI2.j;
                        if (i23 == 1) {
                            ls.d.f(spannableStringBuilder, new AbsoluteSizeSpan((int) gVarI2.k, true), iIntValue, iIntValue2);
                        } else if (i23 == 2) {
                            ls.d.f(spannableStringBuilder, new RelativeSizeSpan(gVarI2.k), iIntValue, iIntValue2);
                        } else if (i23 == 3) {
                            ls.d.f(spannableStringBuilder, new RelativeSizeSpan(gVarI2.k / 100.0f), iIntValue, iIntValue2);
                        }
                        if ("p".equals(this.f3611a)) {
                            float f2 = gVarI2.f3647s;
                            if (f2 != Float.MAX_VALUE) {
                                bVar.f21632q = (f2 * (-90.0f)) / 100.0f;
                            }
                            Layout.Alignment alignment = gVarI2.f3643o;
                            if (alignment != null) {
                                bVar.f21620c = alignment;
                            }
                            Layout.Alignment alignment2 = gVarI2.f3644p;
                            if (alignment2 != null) {
                                bVar.f21621d = alignment2;
                            }
                        }
                    } else {
                        continue;
                    }
                }
            }
            int i24 = 0;
            while (i24 < c()) {
                b(i24).h(j, map3, map2, str3, treeMap);
                i24++;
                map3 = map;
            }
        }
    }

    public final void i(long j, boolean z5, String str, TreeMap treeMap) {
        HashMap map = this.k;
        map.clear();
        HashMap map2 = this.f3620l;
        map2.clear();
        String str2 = this.f3611a;
        if ("metadata".equals(str2)) {
            return;
        }
        String str3 = this.f3618h;
        String str4 = "".equals(str3) ? str : str3;
        if (this.f3613c && z5) {
            SpannableStringBuilder spannableStringBuilderE = e(str4, treeMap);
            String str5 = this.f3612b;
            str5.getClass();
            spannableStringBuilderE.append((CharSequence) str5);
            return;
        }
        if ("br".equals(str2) && z5) {
            e(str4, treeMap).append('\n');
            return;
        }
        if (f(j)) {
            for (Map.Entry entry : treeMap.entrySet()) {
                String str6 = (String) entry.getKey();
                CharSequence charSequence = ((vd.b) entry.getValue()).f21618a;
                charSequence.getClass();
                map.put(str6, Integer.valueOf(charSequence.length()));
            }
            boolean zEquals = "p".equals(str2);
            for (int i7 = 0; i7 < c(); i7++) {
                b(i7).i(j, z5 || zEquals, str4, treeMap);
            }
            if (zEquals) {
                SpannableStringBuilder spannableStringBuilderE2 = e(str4, treeMap);
                int length = spannableStringBuilderE2.length() - 1;
                while (length >= 0 && spannableStringBuilderE2.charAt(length) == ' ') {
                    length--;
                }
                if (length >= 0 && spannableStringBuilderE2.charAt(length) != '\n') {
                    spannableStringBuilderE2.append('\n');
                }
            }
            for (Map.Entry entry2 : treeMap.entrySet()) {
                String str7 = (String) entry2.getKey();
                CharSequence charSequence2 = ((vd.b) entry2.getValue()).f21618a;
                charSequence2.getClass();
                map2.put(str7, Integer.valueOf(charSequence2.length()));
            }
        }
    }
}

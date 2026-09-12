package uj;

import com.discord.media.utils.DiscordVideoMediaSource;
import com.facebook.react.common.assets.ReactFontManager;
import com.facebook.react.views.image.ReactImageView;
import com.google.zxing.Result;
import ij.l;
import ij.m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class k extends h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f21167d = {1, 1, 1};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f21168e = {1, 1, 1, 1, 1};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[][] f21169f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[][] f21170g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringBuilder f21171a = new StringBuilder(20);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f21172b = new j(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f21173c = new j(1);

    static {
        int[][] iArr = {new int[]{3, 2, 1, 1}, new int[]{2, 2, 2, 1}, new int[]{2, 1, 2, 2}, new int[]{1, 4, 1, 1}, new int[]{1, 1, 3, 2}, new int[]{1, 2, 3, 1}, new int[]{1, 1, 1, 4}, new int[]{1, 3, 1, 2}, new int[]{1, 2, 1, 3}, new int[]{3, 1, 1, 2}};
        f21169f = iArr;
        int[][] iArr2 = new int[20][];
        f21170g = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, 10);
        for (int i7 = 10; i7 < 20; i7++) {
            int[] iArr3 = f21169f[i7 - 10];
            int[] iArr4 = new int[iArr3.length];
            for (int i10 = 0; i10 < iArr3.length; i10++) {
                iArr4[i10] = iArr3[(iArr3.length - i10) - 1];
            }
            f21170g[i7] = iArr4;
        }
    }

    public static int h(mj.a aVar, int[] iArr, int i7, int[][] iArr2) {
        h.e(i7, aVar, iArr);
        int length = iArr2.length;
        float f2 = 0.48f;
        int i10 = -1;
        for (int i11 = 0; i11 < length; i11++) {
            float fD = h.d(iArr, iArr2[i11], 0.7f);
            if (fD < f2) {
                i10 = i11;
                f2 = fD;
            }
        }
        if (i10 >= 0) {
            return i10;
        }
        throw ij.h.f11808i;
    }

    public static int[] l(mj.a aVar, int i7, boolean z5, int[] iArr, int[] iArr2) {
        int i10 = aVar.f15838e;
        int iC = z5 ? aVar.c(i7) : aVar.b(i7);
        int length = iArr.length;
        boolean z6 = z5;
        int i11 = 0;
        int i12 = iC;
        while (iC < i10) {
            if (aVar.a(iC) != z6) {
                iArr2[i11] = iArr2[i11] + 1;
            } else {
                if (i11 != length - 1) {
                    i11++;
                } else {
                    if (h.d(iArr2, iArr, 0.7f) < 0.48f) {
                        return new int[]{i12, iC};
                    }
                    i12 += iArr2[0] + iArr2[1];
                    int i13 = i11 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i13);
                    iArr2[i13] = 0;
                    iArr2[i11] = 0;
                    i11--;
                }
                iArr2[i11] = 1;
                z6 = !z6;
            }
            iC++;
        }
        throw ij.h.f11808i;
    }

    public static int[] m(mj.a aVar) {
        int[] iArr = new int[3];
        int[] iArrL = null;
        boolean zD = false;
        int i7 = 0;
        while (!zD) {
            Arrays.fill(iArr, 0, 3, 0);
            iArrL = l(aVar, i7, false, f21167d, iArr);
            int i10 = iArrL[0];
            int i11 = iArrL[1];
            int i12 = i10 - (i11 - i10);
            if (i12 >= 0) {
                zD = aVar.d(i12, i10);
            }
            i7 = i11;
        }
        return iArrL;
    }

    @Override // uj.h
    public Result b(int i7, mj.a aVar, Map map) {
        return k(i7, aVar, m(aVar), map);
    }

    public boolean g(String str) throws ij.d {
        int length = str.length();
        if (length != 0) {
            int i7 = length - 1;
            int iDigit = Character.digit(str.charAt(i7), 10);
            CharSequence charSequenceSubSequence = str.subSequence(0, i7);
            int length2 = charSequenceSubSequence.length();
            int i10 = 0;
            for (int i11 = length2 - 1; i11 >= 0; i11 -= 2) {
                int iCharAt = charSequenceSubSequence.charAt(i11) - '0';
                if (iCharAt < 0 || iCharAt > 9) {
                    throw ij.d.a();
                }
                i10 += iCharAt;
            }
            int i12 = i10 * 3;
            for (int i13 = length2 - 2; i13 >= 0; i13 -= 2) {
                int iCharAt2 = charSequenceSubSequence.charAt(i13) - '0';
                if (iCharAt2 < 0 || iCharAt2 > 9) {
                    throw ij.d.a();
                }
                i12 += iCharAt2;
            }
            if ((1000 - i12) % 10 == iDigit) {
                return true;
            }
        }
        return false;
    }

    public int[] i(mj.a aVar, int i7) {
        return l(aVar, i7, false, f21167d, new int[3]);
    }

    public abstract int j(mj.a aVar, int[] iArr, StringBuilder sb2);

    public Result k(int i7, mj.a aVar, int[] iArr, Map map) throws ij.b, ij.d, ij.h {
        int length;
        if (map != null && map.get(ij.c.F) != null) {
            throw new ClassCastException();
        }
        StringBuilder sb2 = this.f21171a;
        sb2.setLength(0);
        int[] iArrI = i(aVar, j(aVar, iArr, sb2));
        int i10 = iArrI[1];
        int i11 = (i10 - iArrI[0]) + i10;
        if (i11 >= aVar.f15838e || !aVar.d(i10, i11)) {
            throw ij.h.f11808i;
        }
        String string = sb2.toString();
        if (string.length() < 8) {
            throw ij.d.a();
        }
        if (!g(string)) {
            throw ij.b.a();
        }
        float f2 = (iArr[1] + iArr[0]) / 2.0f;
        float f7 = (iArrI[1] + iArrI[0]) / 2.0f;
        ij.a aVarN = n();
        float f10 = i7;
        m[] mVarArr = {new m(f2, f10), new m(f7, f10)};
        String str = null;
        Result result = new Result(string, null, mVarArr, aVarN);
        try {
            Result resultB = this.f21172b.b(i7, iArrI[1], aVar);
            result.b(l.f11822y, resultB.f6648a);
            result.a(resultB.f6652e);
            m[] mVarArr2 = resultB.f6650c;
            m[] mVarArr3 = result.f6650c;
            if (mVarArr3 == null) {
                result.f6650c = mVarArr2;
            } else if (mVarArr2 != null && mVarArr2.length > 0) {
                m[] mVarArr4 = new m[mVarArr3.length + mVarArr2.length];
                System.arraycopy(mVarArr3, 0, mVarArr4, 0, mVarArr3.length);
                System.arraycopy(mVarArr2, 0, mVarArr4, mVarArr3.length, mVarArr2.length);
                result.f6650c = mVarArr4;
            }
            length = resultB.f6648a.length();
        } catch (ij.k unused) {
            length = 0;
        }
        int[] iArr2 = map == null ? null : (int[]) map.get(ij.c.G);
        if (iArr2 != null) {
            int length2 = iArr2.length;
            int i12 = 0;
            while (true) {
                if (i12 >= length2) {
                    throw ij.h.f11808i;
                }
                if (length == iArr2[i12]) {
                    break;
                }
                i12++;
            }
        }
        if (aVarN == ij.a.E || aVarN == ij.a.L) {
            j jVar = this.f21173c;
            synchronized (jVar) {
                if (((ArrayList) jVar.f21165a).isEmpty()) {
                    jVar.a(new int[]{0, 19}, "US/CA");
                    jVar.a(new int[]{30, 39}, "US");
                    jVar.a(new int[]{60, 139}, "US/CA");
                    jVar.a(new int[]{ReactImageView.REMOTE_IMAGE_FADE_DURATION_MS, 379}, "FR");
                    jVar.a(new int[]{380}, "BG");
                    jVar.a(new int[]{383}, "SI");
                    jVar.a(new int[]{385}, "HR");
                    jVar.a(new int[]{387}, "BA");
                    jVar.a(new int[]{ReactFontManager.TypefaceStyle.NORMAL, 440}, "DE");
                    jVar.a(new int[]{450, 459}, "JP");
                    jVar.a(new int[]{460, 469}, "RU");
                    jVar.a(new int[]{471}, "TW");
                    jVar.a(new int[]{474}, "EE");
                    jVar.a(new int[]{475}, "LV");
                    jVar.a(new int[]{476}, "AZ");
                    jVar.a(new int[]{477}, "LT");
                    jVar.a(new int[]{478}, "UZ");
                    jVar.a(new int[]{479}, "LK");
                    jVar.a(new int[]{DiscordVideoMediaSource.DEFAULT_HEIGHT}, "PH");
                    jVar.a(new int[]{481}, "BY");
                    jVar.a(new int[]{482}, "UA");
                    jVar.a(new int[]{484}, "MD");
                    jVar.a(new int[]{485}, "AM");
                    jVar.a(new int[]{486}, "GE");
                    jVar.a(new int[]{487}, "KZ");
                    jVar.a(new int[]{489}, "HK");
                    jVar.a(new int[]{490, 499}, "JP");
                    jVar.a(new int[]{500, 509}, "GB");
                    jVar.a(new int[]{520}, "GR");
                    jVar.a(new int[]{528}, "LB");
                    jVar.a(new int[]{529}, "CY");
                    jVar.a(new int[]{531}, "MK");
                    jVar.a(new int[]{535}, "MT");
                    jVar.a(new int[]{539}, "IE");
                    jVar.a(new int[]{540, 549}, "BE/LU");
                    jVar.a(new int[]{560}, "PT");
                    jVar.a(new int[]{569}, "IS");
                    jVar.a(new int[]{570, 579}, "DK");
                    jVar.a(new int[]{590}, "PL");
                    jVar.a(new int[]{594}, "RO");
                    jVar.a(new int[]{599}, "HU");
                    jVar.a(new int[]{600, 601}, "ZA");
                    jVar.a(new int[]{603}, "GH");
                    jVar.a(new int[]{608}, "BH");
                    jVar.a(new int[]{609}, "MU");
                    jVar.a(new int[]{611}, "MA");
                    jVar.a(new int[]{613}, "DZ");
                    jVar.a(new int[]{616}, "KE");
                    jVar.a(new int[]{618}, "CI");
                    jVar.a(new int[]{619}, "TN");
                    jVar.a(new int[]{621}, "SY");
                    jVar.a(new int[]{622}, "EG");
                    jVar.a(new int[]{624}, "LY");
                    jVar.a(new int[]{625}, "JO");
                    jVar.a(new int[]{626}, "IR");
                    jVar.a(new int[]{627}, "KW");
                    jVar.a(new int[]{628}, "SA");
                    jVar.a(new int[]{629}, "AE");
                    jVar.a(new int[]{DiscordVideoMediaSource.DEFAULT_WIDTH, 649}, "FI");
                    jVar.a(new int[]{690, 695}, "CN");
                    jVar.a(new int[]{ReactFontManager.TypefaceStyle.BOLD, 709}, "NO");
                    jVar.a(new int[]{729}, "IL");
                    jVar.a(new int[]{730, 739}, "SE");
                    jVar.a(new int[]{740}, "GT");
                    jVar.a(new int[]{741}, "SV");
                    jVar.a(new int[]{742}, "HN");
                    jVar.a(new int[]{743}, "NI");
                    jVar.a(new int[]{744}, "CR");
                    jVar.a(new int[]{745}, "PA");
                    jVar.a(new int[]{746}, "DO");
                    jVar.a(new int[]{750}, "MX");
                    jVar.a(new int[]{754, 755}, "CA");
                    jVar.a(new int[]{759}, "VE");
                    jVar.a(new int[]{760, 769}, "CH");
                    jVar.a(new int[]{770}, "CO");
                    jVar.a(new int[]{773}, "UY");
                    jVar.a(new int[]{775}, "PE");
                    jVar.a(new int[]{777}, "BO");
                    jVar.a(new int[]{779}, "AR");
                    jVar.a(new int[]{780}, "CL");
                    jVar.a(new int[]{784}, "PY");
                    jVar.a(new int[]{785}, "PE");
                    jVar.a(new int[]{786}, "EC");
                    jVar.a(new int[]{789, 790}, "BR");
                    jVar.a(new int[]{800, 839}, "IT");
                    jVar.a(new int[]{840, 849}, "ES");
                    jVar.a(new int[]{850}, "CU");
                    jVar.a(new int[]{858}, "SK");
                    jVar.a(new int[]{859}, "CZ");
                    jVar.a(new int[]{860}, "YU");
                    jVar.a(new int[]{865}, "MN");
                    jVar.a(new int[]{867}, "KP");
                    jVar.a(new int[]{868, 869}, "TR");
                    jVar.a(new int[]{870, 879}, "NL");
                    jVar.a(new int[]{880}, "KR");
                    jVar.a(new int[]{885}, "TH");
                    jVar.a(new int[]{888}, "SG");
                    jVar.a(new int[]{890}, "IN");
                    jVar.a(new int[]{893}, "VN");
                    jVar.a(new int[]{896}, "PK");
                    jVar.a(new int[]{899}, "ID");
                    jVar.a(new int[]{900, 919}, "AT");
                    jVar.a(new int[]{930, 939}, "AU");
                    jVar.a(new int[]{940, 949}, "AZ");
                    jVar.a(new int[]{955}, "MY");
                    jVar.a(new int[]{958}, "MO");
                }
            }
            int i13 = Integer.parseInt(string.substring(0, 3));
            int size = ((ArrayList) jVar.f21165a).size();
            for (int i14 = 0; i14 < size; i14++) {
                int[] iArr3 = (int[]) ((ArrayList) jVar.f21165a).get(i14);
                int i15 = iArr3[0];
                if (i13 < i15) {
                    break;
                }
                if (iArr3.length != 1) {
                    i15 = iArr3[1];
                }
                if (i13 <= i15) {
                    str = (String) ((ArrayList) jVar.f21166b).get(i14);
                    break;
                }
            }
            if (str != null) {
                result.b(l.f11821x, str);
            }
        }
        return result;
    }

    public abstract ij.a n();
}

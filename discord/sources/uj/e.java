package uj;

import com.discord.misc.utilities.chat_view_types.ChatViewRecyclerTypes;
import com.google.zxing.Result;
import e4.r;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends k {
    public static final int[] j = {0, 11, 13, 14, 19, 25, 28, 21, 22, 26};
    public static final int[] k = {1, 1, 1, 1, 1, 1};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int[][] f21151l = {new int[]{56, 52, 50, 49, 44, 38, 35, 42, 41, 37}, new int[]{7, 11, 13, 14, 19, 25, 28, 21, 22, 26}};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f21152h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f21153i;

    public e(int i7) {
        this.f21152h = i7;
        switch (i7) {
            case 1:
                this.f21153i = new int[4];
                break;
            case 2:
                this.f21153i = new int[4];
                break;
            case 3:
                this.f21153i = new e(0);
                break;
            default:
                this.f21153i = new int[4];
                break;
        }
    }

    public static Result o(Result result) throws ij.d {
        String str = result.f6648a;
        if (str.charAt(0) != '0') {
            throw ij.d.a();
        }
        Result result2 = new Result(str.substring(1), null, result.f6650c, ij.a.L);
        Map map = result.f6652e;
        if (map != null) {
            result2.a(map);
        }
        return result2;
    }

    @Override // uj.h, ij.j
    public Result a(r rVar, Map map) {
        switch (this.f21152h) {
            case 3:
                return o(((e) this.f21153i).a(rVar, map));
            default:
                return super.a(rVar, map);
        }
    }

    @Override // uj.k, uj.h
    public Result b(int i7, mj.a aVar, Map map) {
        switch (this.f21152h) {
            case 3:
                return o(((e) this.f21153i).b(i7, aVar, map));
            default:
                return super.b(i7, aVar, map);
        }
    }

    @Override // uj.k
    public boolean g(String str) {
        switch (this.f21152h) {
            case 1:
                char[] cArr = new char[6];
                str.getChars(1, 7, cArr, 0);
                StringBuilder sb2 = new StringBuilder(12);
                sb2.append(str.charAt(0));
                char c8 = cArr[5];
                switch (c8) {
                    case '0':
                    case ChatViewRecyclerTypes.MEDIA_ATTACHMENT_MOSAIC_IMAGE /* 49 */:
                    case '2':
                        sb2.append(cArr, 0, 2);
                        sb2.append(c8);
                        sb2.append("0000");
                        sb2.append(cArr, 2, 3);
                        break;
                    case ChatViewRecyclerTypes.MEDIA_ATTACHMENT_MOSAIC_VISUAL_PLACEHOLDER /* 51 */:
                        sb2.append(cArr, 0, 3);
                        sb2.append("00000");
                        sb2.append(cArr, 3, 2);
                        break;
                    case ChatViewRecyclerTypes.REFERRAL /* 52 */:
                        sb2.append(cArr, 0, 4);
                        sb2.append("00000");
                        sb2.append(cArr[4]);
                        break;
                    default:
                        sb2.append(cArr, 0, 5);
                        sb2.append("0000");
                        sb2.append(c8);
                        break;
                }
                if (str.length() >= 8) {
                    sb2.append(str.charAt(7));
                }
                return super.g(sb2.toString());
            default:
                return super.g(str);
        }
    }

    @Override // uj.k
    public int[] i(mj.a aVar, int i7) {
        switch (this.f21152h) {
            case 1:
                return k.l(aVar, i7, true, k, new int[6]);
            default:
                return super.i(aVar, i7);
        }
    }

    @Override // uj.k
    public final int j(mj.a aVar, int[] iArr, StringBuilder sb2) throws ij.h {
        int[][] iArr2;
        switch (this.f21152h) {
            case 0:
                int[] iArr3 = (int[]) this.f21153i;
                iArr3[0] = 0;
                iArr3[1] = 0;
                iArr3[2] = 0;
                iArr3[3] = 0;
                int i7 = aVar.f15838e;
                int i10 = iArr[1];
                int i11 = 0;
                for (int i12 = 0; i12 < 6 && i10 < i7; i12++) {
                    int iH = k.h(aVar, iArr3, i10, k.f21170g);
                    sb2.append((char) ((iH % 10) + 48));
                    for (int i13 : iArr3) {
                        i10 += i13;
                    }
                    if (iH >= 10) {
                        i11 |= 1 << (5 - i12);
                    }
                }
                for (int i14 = 0; i14 < 10; i14++) {
                    if (i11 == j[i14]) {
                        sb2.insert(0, (char) (i14 + 48));
                        int i15 = k.l(aVar, i10, true, k.f21168e, new int[5])[1];
                        for (int i16 = 0; i16 < 6 && i15 < i7; i16++) {
                            sb2.append((char) (k.h(aVar, iArr3, i15, k.f21169f) + 48));
                            for (int i17 : iArr3) {
                                i15 += i17;
                            }
                        }
                        return i15;
                    }
                }
                throw ij.h.f11808i;
            case 1:
                int[] iArr4 = (int[]) this.f21153i;
                iArr4[0] = 0;
                iArr4[1] = 0;
                iArr4[2] = 0;
                iArr4[3] = 0;
                int i18 = aVar.f15838e;
                int i19 = iArr[1];
                int i20 = 0;
                for (int i21 = 0; i21 < 6 && i19 < i18; i21++) {
                    int iH2 = k.h(aVar, iArr4, i19, k.f21170g);
                    sb2.append((char) ((iH2 % 10) + 48));
                    for (int i22 : iArr4) {
                        i19 += i22;
                    }
                    if (iH2 >= 10) {
                        i20 |= 1 << (5 - i21);
                    }
                }
                for (int i23 = 0; i23 <= 1; i23++) {
                    for (int i24 = 0; i24 < 10; i24++) {
                        if (i20 == f21151l[i23][i24]) {
                            sb2.insert(0, (char) (i23 + 48));
                            sb2.append((char) (i24 + 48));
                            return i19;
                        }
                    }
                }
                throw ij.h.f11808i;
            case 2:
                int[] iArr5 = (int[]) this.f21153i;
                iArr5[0] = 0;
                iArr5[1] = 0;
                iArr5[2] = 0;
                iArr5[3] = 0;
                int i25 = aVar.f15838e;
                int i26 = iArr[1];
                int i27 = 0;
                while (true) {
                    iArr2 = k.f21169f;
                    if (i27 < 4 && i26 < i25) {
                        sb2.append((char) (k.h(aVar, iArr5, i26, iArr2) + 48));
                        for (int i28 : iArr5) {
                            i26 += i28;
                        }
                        i27++;
                    }
                }
                int i29 = k.l(aVar, i26, true, k.f21168e, new int[5])[1];
                for (int i30 = 0; i30 < 4 && i29 < i25; i30++) {
                    sb2.append((char) (k.h(aVar, iArr5, i29, iArr2) + 48));
                    for (int i31 : iArr5) {
                        i29 += i31;
                    }
                }
                return i29;
            default:
                return ((e) this.f21153i).j(aVar, iArr, sb2);
        }
    }

    @Override // uj.k
    public Result k(int i7, mj.a aVar, int[] iArr, Map map) {
        switch (this.f21152h) {
            case 3:
                return o(((e) this.f21153i).k(i7, aVar, iArr, map));
            default:
                return super.k(i7, aVar, iArr, map);
        }
    }

    @Override // uj.k
    public final ij.a n() {
        switch (this.f21152h) {
            case 0:
                return ij.a.E;
            case 1:
                return ij.a.M;
            case 2:
                return ij.a.f11792y;
            default:
                return ij.a.L;
        }
    }
}

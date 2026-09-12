package wj;

import androidx.recyclerview.widget.h0;
import com.discord.chat.presentation.message.view.MediaImageViewKt;
import com.discord.media.engine.MediaEngine;
import com.discord.misc.utilities.chat_view_types.ChatViewRecyclerTypes;
import com.facebook.imageutils.JfifUtil;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.zxing.Result;
import fh.s;
import ij.h;
import ij.m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import n8.f;
import w3.q;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends vj.a {
    public static final int[] k = {7, 5, 4, 3, 1};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int[] f22311l = {4, 20, 52, 104, 204};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int[] f22312m = {0, 348, 1388, 2948, 3988};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int[][] f22313n = {new int[]{1, 8, 4, 1}, new int[]{3, 6, 4, 1}, new int[]{3, 4, 6, 1}, new int[]{3, 2, 8, 1}, new int[]{2, 6, 5, 1}, new int[]{2, 2, 9, 1}};

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int[][] f22314o = {new int[]{1, 3, 9, 27, 81, 32, 96, 77}, new int[]{20, 60, 180, 118, 143, 7, 21, 63}, new int[]{189, 145, 13, 39, 117, 140, 209, 205}, new int[]{193, 157, 49, 147, 19, 57, 171, 91}, new int[]{62, 186, 136, 197, 169, 85, 44, 132}, new int[]{185, 133, 188, 142, 4, 12, 36, 108}, new int[]{113, IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT, 173, 97, 80, 29, 87, 50}, new int[]{150, 28, 84, 41, 123, 158, 52, 156}, new int[]{46, 138, 203, 187, 139, 206, 196, 166}, new int[]{76, 17, 51, 153, 37, 111, 122, 155}, new int[]{43, 129, 176, 106, 107, 110, 119, MediaImageViewKt.OBSCURED_IMAGE_MIN_WIDTH}, new int[]{16, 48, 144, 10, 30, 90, 59, 177}, new int[]{109, 116, 137, h0.DEFAULT_DRAG_ANIMATION_DURATION, 178, 112, 125, 164}, new int[]{70, 210, JfifUtil.MARKER_RST0, 202, 184, 130, 179, 115}, new int[]{134, 191, 151, 31, 93, 68, 204, 190}, new int[]{148, 22, 66, 198, 172, 94, 71, 2}, new int[]{6, 18, 54, 162, 64, JfifUtil.MARKER_SOFn, 154, 40}, new int[]{120, 149, 25, 75, 14, 42, 126, 167}, new int[]{79, 26, 78, 23, 69, 207, 199, 175}, new int[]{103, 98, 83, 38, MediaEngine.MAX_SUPPORTED_PROTOCOL_VERSION, 131, 182, 124}, new int[]{161, 61, 183, 127, 170, 88, 53, 159}, new int[]{55, 165, 73, 8, 24, 72, 5, 15}, new int[]{45, 135, 194, 160, 58, 174, 100, 89}};

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int[][] f22315p = {new int[]{0, 0}, new int[]{0, 1, 1}, new int[]{0, 2, 1, 3}, new int[]{0, 4, 1, 3, 2}, new int[]{0, 4, 1, 3, 3, 5}, new int[]{0, 4, 1, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 2, 3, 3}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 4}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 3, 3, 4, 4, 5, 5}};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f22316g = new ArrayList(11);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f22317h = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int[] f22318i = new int[2];
    public boolean j;

    public static Result m(List list) {
        s aVar;
        int size = list.size() << 1;
        int i7 = size - 1;
        if (((a) kk.b.f(1, list)).f22307b == null) {
            i7 = size - 2;
        }
        mj.a aVar2 = new mj.a(i7 * 12);
        int i10 = ((a) list.get(0)).f22307b.f21688a;
        int i11 = 0;
        for (int i12 = 11; i12 >= 0; i12--) {
            if (((1 << i12) & i10) != 0) {
                aVar2.f(i11);
            }
            i11++;
        }
        for (int i13 = 1; i13 < list.size(); i13++) {
            a aVar3 = (a) list.get(i13);
            int i14 = aVar3.f22306a.f21688a;
            for (int i15 = 11; i15 >= 0; i15--) {
                if (((1 << i15) & i14) != 0) {
                    aVar2.f(i11);
                }
                i11++;
            }
            vj.b bVar = aVar3.f22307b;
            if (bVar != null) {
                int i16 = bVar.f21688a;
                for (int i17 = 11; i17 >= 0; i17--) {
                    if (((1 << i17) & i16) != 0) {
                        aVar2.f(i11);
                    }
                    i11++;
                }
            }
        }
        if (aVar2.a(1)) {
            aVar = new xj.b(aVar2, 2);
        } else if (aVar2.a(2)) {
            int iQ = f.Q(1, 4, aVar2);
            if (iQ == 4) {
                aVar = new xj.a(aVar2, 0);
            } else if (iQ != 5) {
                int iQ2 = f.Q(1, 5, aVar2);
                if (iQ2 == 12) {
                    aVar = new xj.b(aVar2, 0);
                } else if (iQ2 != 13) {
                    switch (f.Q(1, 7, aVar2)) {
                        case ChatViewRecyclerTypes.SHARED_CUSTOM_THEME_EMBED /* 56 */:
                            aVar = new xj.c(aVar2, "310", "11");
                            break;
                        case ChatViewRecyclerTypes.PREMIUM_GROUP_INVITE /* 57 */:
                            aVar = new xj.c(aVar2, "320", "11");
                            break;
                        case ChatViewRecyclerTypes.REFERRAL_REDESIGN /* 58 */:
                            aVar = new xj.c(aVar2, "310", "13");
                            break;
                        case ChatViewRecyclerTypes.VOICE_CHANNEL_LIST_INVITE /* 59 */:
                            aVar = new xj.c(aVar2, "320", "13");
                            break;
                        case ChatViewRecyclerTypes.GIFT_INTENT /* 60 */:
                            aVar = new xj.c(aVar2, "310", "15");
                            break;
                        case 61:
                            aVar = new xj.c(aVar2, "320", "15");
                            break;
                        case 62:
                            aVar = new xj.c(aVar2, "310", "17");
                            break;
                        case 63:
                            aVar = new xj.c(aVar2, "320", "17");
                            break;
                        default:
                            throw new IllegalStateException("unknown decoder: ".concat(String.valueOf(aVar2)));
                    }
                } else {
                    aVar = new xj.b(aVar2, 1);
                }
            } else {
                aVar = new xj.a(aVar2, 1);
            }
        } else {
            aVar = new xj.f(aVar2);
        }
        String strK = aVar.k();
        m[] mVarArr = ((a) list.get(0)).f22308c.f21692c;
        m[] mVarArr2 = ((a) kk.b.f(1, list)).f22308c.f21692c;
        return new Result(strK, null, new m[]{mVarArr[0], mVarArr[1], mVarArr2[0], mVarArr2[1]}, ij.a.K);
    }

    @Override // uj.h
    public final Result b(int i7, mj.a aVar, Map map) {
        ArrayList arrayList = this.f22316g;
        arrayList.clear();
        this.j = false;
        try {
            return m(o(aVar, i7));
        } catch (h unused) {
            arrayList.clear();
            this.j = true;
            return m(o(aVar, i7));
        }
    }

    public final boolean j() {
        ArrayList arrayList = this.f22316g;
        a aVar = (a) arrayList.get(0);
        vj.b bVar = aVar.f22306a;
        vj.b bVar2 = aVar.f22307b;
        if (bVar2 != null) {
            int i7 = bVar2.f21689b;
            int i10 = 2;
            for (int i11 = 1; i11 < arrayList.size(); i11++) {
                a aVar2 = (a) arrayList.get(i11);
                i7 += aVar2.f22306a.f21689b;
                int i12 = i10 + 1;
                vj.b bVar3 = aVar2.f22307b;
                if (bVar3 != null) {
                    i7 += bVar3.f21689b;
                    i10 += 2;
                } else {
                    i10 = i12;
                }
            }
            if (((i10 - 4) * 211) + (i7 % 211) == bVar.f21688a) {
                return true;
            }
        }
        return false;
    }

    public final List k(int i7, ArrayList arrayList) throws h {
        while (true) {
            ArrayList arrayList2 = this.f22317h;
            if (i7 >= arrayList2.size()) {
                throw h.f11808i;
            }
            b bVar = (b) arrayList2.get(i7);
            ArrayList arrayList3 = this.f22316g;
            arrayList3.clear();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList3.addAll(((b) it.next()).f22309a);
            }
            arrayList3.addAll(bVar.f22309a);
            for (int i10 = 0; i10 < 10; i10++) {
                int[] iArr = f22315p[i10];
                if (arrayList3.size() <= iArr.length) {
                    int i11 = 0;
                    while (true) {
                        if (i11 >= arrayList3.size()) {
                            if (!j()) {
                                ArrayList arrayList4 = new ArrayList(arrayList);
                                arrayList4.add(bVar);
                                try {
                                    return k(i7 + 1, arrayList4);
                                } catch (h unused) {
                                    break;
                                }
                            }
                            return arrayList3;
                        }
                        if (((a) arrayList3.get(i11)).f22308c.f21690a != iArr[i11]) {
                            break;
                        }
                        i11++;
                    }
                }
            }
            i7++;
        }
    }

    public final List l(boolean z5) {
        ArrayList arrayList = this.f22317h;
        List listK = null;
        if (arrayList.size() > 25) {
            arrayList.clear();
            return null;
        }
        this.f22316g.clear();
        if (z5) {
            Collections.reverse(arrayList);
        }
        try {
            listK = k(0, new ArrayList());
        } catch (h unused) {
        }
        if (z5) {
            Collections.reverse(arrayList);
        }
        return listK;
    }

    public final vj.b n(mj.a aVar, vj.c cVar, boolean z5, boolean z6) throws h {
        int[] iArr;
        boolean z7;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        int[][] iArr2;
        int i7 = 0;
        while (true) {
            iArr = this.f21683b;
            if (i7 >= iArr.length) {
                break;
            }
            iArr[i7] = 0;
            i7++;
        }
        if (z6) {
            uj.h.f(cVar.f21691b[0], aVar, iArr);
        } else {
            uj.h.e(cVar.f21691b[1], aVar, iArr);
            int i10 = 0;
            for (int length = iArr.length - 1; i10 < length; length--) {
                int i11 = iArr[i10];
                iArr[i10] = iArr[length];
                iArr[length] = i11;
                i10++;
            }
        }
        float fA = q.A(iArr) / 17.0f;
        int[] iArr3 = cVar.f21691b;
        int i12 = cVar.f21690a;
        float f2 = (iArr3[1] - iArr3[0]) / 15.0f;
        if (Math.abs(fA - f2) / f2 > 0.3f) {
            throw h.f11808i;
        }
        int i13 = 0;
        while (true) {
            int length2 = iArr.length;
            float[] fArr = this.f21685d;
            float[] fArr2 = this.f21684c;
            int[] iArr4 = this.f21687f;
            int[] iArr5 = this.f21686e;
            if (i13 >= length2) {
                int iA = q.A(iArr5);
                int iA2 = q.A(iArr4);
                if (iA > 13) {
                    z7 = false;
                    z10 = true;
                } else if (iA < 4) {
                    z10 = false;
                    z7 = true;
                } else {
                    z7 = false;
                    z10 = false;
                }
                if (iA2 > 13) {
                    z11 = false;
                    z12 = true;
                } else if (iA2 < 4) {
                    z12 = false;
                    z11 = true;
                } else {
                    z11 = false;
                    z12 = false;
                }
                int i14 = (iA + iA2) - 17;
                boolean z18 = (iA & 1) == 1;
                boolean z19 = (iA2 & 1) == 0;
                if (i14 != 1) {
                    z13 = true;
                    if (i14 != -1) {
                        if (i14 != 0) {
                            throw h.f11808i;
                        }
                        if (z18) {
                            if (!z19) {
                                throw h.f11808i;
                            }
                            if (iA < iA2) {
                                z16 = true;
                                z17 = true;
                            } else {
                                z14 = true;
                                z15 = true;
                            }
                        } else if (z19) {
                            throw h.f11808i;
                        }
                    } else if (z18) {
                        if (z19) {
                            throw h.f11808i;
                        }
                        z16 = true;
                    } else {
                        if (!z19) {
                            throw h.f11808i;
                        }
                        z15 = true;
                    }
                } else if (z18) {
                    if (z19) {
                        throw h.f11808i;
                    }
                    z14 = true;
                    z13 = true;
                } else {
                    if (!z19) {
                        throw h.f11808i;
                    }
                    z17 = true;
                    z13 = true;
                }
                if (z16) {
                    if (z14) {
                        throw h.f11808i;
                    }
                    vj.a.h(fArr2, iArr5);
                }
                if (z14) {
                    vj.a.g(fArr2, iArr5);
                }
                if (z15) {
                    if (z17) {
                        throw h.f11808i;
                    }
                    vj.a.h(fArr2, iArr4);
                }
                if (z17) {
                    vj.a.g(fArr, iArr4);
                }
                int i15 = (((i12 * 4) + (z5 ? 0 : 2)) + (!z6 ? 1 : 0)) - 1;
                int length3 = iArr5.length - 1;
                int i16 = 0;
                int i17 = 0;
                while (true) {
                    iArr2 = f22314o;
                    if (length3 < 0) {
                        break;
                    }
                    if (i12 != 0 || !z5 || !z6) {
                        i16 += iArr5[length3] * iArr2[i15][length3 * 2];
                    }
                    i17 += iArr5[length3];
                    length3--;
                }
                int i18 = 0;
                for (int length4 = iArr4.length - 1; length4 >= 0; length4--) {
                    if (i12 != 0 || !z5 || !z6) {
                        i18 += iArr4[length4] * iArr2[i15][(length4 * 2) + 1];
                    }
                }
                int i19 = i16 + i18;
                if ((i17 & 1) != 0 || i17 > 13 || i17 < 4) {
                    throw h.f11808i;
                }
                int i20 = (13 - i17) / 2;
                int i21 = k[i20];
                return new vj.b((m3.m.D(iArr5, i21, z13) * f22311l[i20]) + m3.m.D(iArr4, 9 - i21, false) + f22312m[i20], i19);
            }
            float f7 = (iArr[i13] * 1.0f) / fA;
            int i22 = (int) (0.5f + f7);
            if (i22 <= 0) {
                if (f7 < 0.3f) {
                    throw h.f11808i;
                }
                i22 = 1;
            } else if (i22 > 8) {
                if (f7 > 8.7f) {
                    throw h.f11808i;
                }
                i22 = 8;
            }
            int i23 = i13 / 2;
            if ((i13 & 1) == 0) {
                iArr5[i23] = i22;
                fArr2[i23] = f7 - i22;
            } else {
                iArr4[i23] = i22;
                fArr[i23] = f7 - i22;
            }
            i13++;
        }
    }

    public final List o(mj.a aVar, int i7) throws h {
        boolean zEquals;
        boolean z5;
        boolean z6 = false;
        while (true) {
            ArrayList arrayList = this.f22316g;
            if (z6) {
                if (j()) {
                    return arrayList;
                }
                ArrayList arrayList2 = this.f22317h;
                boolean zIsEmpty = arrayList2.isEmpty();
                int i10 = 0;
                boolean zEquals2 = false;
                while (true) {
                    if (i10 >= arrayList2.size()) {
                        zEquals = false;
                        break;
                    }
                    b bVar = (b) arrayList2.get(i10);
                    int i11 = bVar.f22310b;
                    ArrayList arrayList3 = bVar.f22309a;
                    if (i11 > i7) {
                        zEquals = arrayList3.equals(arrayList);
                        break;
                    }
                    zEquals2 = arrayList3.equals(arrayList);
                    i10++;
                }
                if (!zEquals && !zEquals2) {
                    Iterator it = arrayList2.iterator();
                    loop2: while (true) {
                        if (!it.hasNext()) {
                            z5 = false;
                            break;
                        }
                        b bVar2 = (b) it.next();
                        Iterator it2 = arrayList.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                z5 = true;
                                break loop2;
                            }
                            a aVar2 = (a) it2.next();
                            Iterator it3 = bVar2.f22309a.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    if (aVar2.equals((a) it3.next())) {
                                    }
                                }
                            }
                        }
                    }
                    if (!z5) {
                        arrayList2.add(i10, new b(i7, arrayList));
                        Iterator it4 = arrayList2.iterator();
                        while (it4.hasNext()) {
                            b bVar3 = (b) it4.next();
                            if (bVar3.f22309a.size() != arrayList.size()) {
                                Iterator it5 = bVar3.f22309a.iterator();
                                while (true) {
                                    if (!it5.hasNext()) {
                                        it4.remove();
                                        break;
                                    }
                                    a aVar3 = (a) it5.next();
                                    Iterator it6 = arrayList.iterator();
                                    do {
                                        if (!it6.hasNext()) {
                                            break;
                                        }
                                    } while (!aVar3.equals((a) it6.next()));
                                }
                            }
                        }
                    }
                }
                if (!zIsEmpty) {
                    List listL = l(false);
                    if (listL != null) {
                        return listL;
                    }
                    List listL2 = l(true);
                    if (listL2 != null) {
                        return listL2;
                    }
                }
                throw h.f11808i;
            }
            try {
                arrayList.add(p(aVar, arrayList, i7));
            } catch (h e10) {
                if (arrayList.isEmpty()) {
                    throw e10;
                }
                z6 = true;
            }
        }
    }

    public final a p(mj.a aVar, ArrayList arrayList, int i7) throws h {
        int i10;
        int i11;
        int i12;
        int iC;
        int i13;
        vj.c cVar;
        int i14 = 2;
        int i15 = 0;
        int i16 = 1;
        boolean z5 = arrayList.size() % 2 == 0;
        if (this.j) {
            z5 = !z5;
        }
        int iB = -1;
        boolean z6 = true;
        while (true) {
            int[] iArr = this.f21682a;
            iArr[i15] = i15;
            iArr[i16] = i15;
            iArr[i14] = i15;
            int i17 = 3;
            iArr[3] = i15;
            int i18 = aVar.f15838e;
            int i19 = iB >= 0 ? iB : arrayList.isEmpty() ? i15 : ((a) kk.b.e(i16, arrayList)).f22308c.f21691b[i16];
            int i20 = arrayList.size() % i14 != 0 ? i16 : i15;
            if (this.j) {
                i20 ^= 1;
            }
            int i21 = i15;
            while (i19 < i18) {
                boolean zA = aVar.a(i19);
                int i22 = !zA;
                if (zA) {
                    i21 = i22;
                    break;
                }
                i19++;
                i21 = i22;
            }
            int i23 = i14;
            int i24 = i15;
            int i25 = i21;
            int i26 = i19;
            while (true) {
                if (i19 >= i18) {
                    throw h.f11808i;
                }
                i10 = i15;
                if (aVar.a(i19) != i25) {
                    iArr[i24] = iArr[i24] + i16;
                    i11 = i16;
                    i17 = i17;
                } else {
                    if (i24 == i17) {
                        if (i20 != 0) {
                            int length = iArr.length;
                            int i27 = i10;
                            while (true) {
                                i12 = i16;
                                if (i27 >= length / 2) {
                                    break;
                                }
                                int i28 = iArr[i27];
                                int i29 = (length - i27) - 1;
                                iArr[i27] = iArr[i29];
                                iArr[i29] = i28;
                                i27++;
                                i16 = i12;
                            }
                        } else {
                            i12 = i16;
                        }
                        if (vj.a.i(iArr)) {
                            break;
                        }
                        if (i20 != 0) {
                            int length2 = iArr.length;
                            for (int i30 = 0; i30 < length2 / 2; i30++) {
                                int i31 = iArr[i30];
                                int i32 = (length2 - i30) - 1;
                                iArr[i30] = iArr[i32];
                                iArr[i32] = i31;
                            }
                        }
                        i11 = 1;
                        i10 = 0;
                        i26 += iArr[0] + iArr[1];
                        iArr[0] = iArr[i23];
                        iArr[1] = iArr[i17];
                        iArr[i23] = 0;
                        iArr[i17] = 0;
                        i24--;
                    } else {
                        i11 = i16;
                        i17 = i17;
                        i24++;
                    }
                    iArr[i24] = i11;
                    i25 ^= 1;
                }
                i19++;
                i15 = i10;
                i17 = i17;
                i16 = i11;
            }
            int[] iArr2 = this.f22318i;
            iArr2[i10] = i26;
            iArr2[i12] = i19;
            if (z5) {
                int i33 = i26 - 1;
                while (i33 >= 0 && !aVar.a(i33)) {
                    i33--;
                }
                i26 = i33 + 1;
                i13 = iArr2[i10] - i26;
                iC = iArr2[i12];
            } else {
                iC = aVar.c(i19 + 1);
                i13 = iC - iArr2[i12];
            }
            int i34 = iC;
            int i35 = i26;
            System.arraycopy(iArr, i10, iArr, i12, iArr.length - 1);
            iArr[i10] = i13;
            vj.b bVarN = null;
            try {
                int[][] iArr3 = f22313n;
                int i36 = 0;
                while (true) {
                    if (i36 >= 6) {
                        throw h.f11808i;
                    }
                    if (uj.h.d(iArr, iArr3[i36], 0.45f) < 0.2f) {
                        cVar = new vj.c(i36, i35, i34, i7, new int[]{i35, i34});
                        break;
                    }
                    i36++;
                }
            } catch (h unused) {
                cVar = null;
            }
            if (cVar == null) {
                int i37 = iArr2[0];
                iB = aVar.a(i37) ? aVar.b(aVar.c(i37)) : aVar.c(aVar.b(i37));
            } else {
                z6 = false;
            }
            if (!z6) {
                vj.b bVarN2 = n(aVar, cVar, z5, true);
                if (!arrayList.isEmpty() && ((a) kk.b.e(1, arrayList)).f22307b == null) {
                    throw h.f11808i;
                }
                try {
                    bVarN = n(aVar, cVar, z5, false);
                } catch (h unused2) {
                }
                return new a(bVarN2, bVarN, cVar);
            }
            i14 = i23;
            i15 = 0;
            i16 = 1;
        }
    }

    @Override // uj.h, ij.j
    public final void reset() {
        this.f22316g.clear();
        this.f22317h.clear();
    }
}

package uj;

import com.google.zxing.Result;
import ij.l;
import ij.m;
import java.util.ArrayList;
import java.util.EnumMap;

/* JADX INFO: loaded from: classes3.dex */
public final class j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f21164c = {1, 1, 2};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f21165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f21166b;

    public j(int i7) {
        switch (i7) {
            case 1:
                this.f21165a = new ArrayList();
                this.f21166b = new ArrayList();
                break;
            default:
                this.f21165a = new i(1);
                this.f21166b = new i(0);
                break;
        }
    }

    public void a(int[] iArr, String str) {
        ((ArrayList) this.f21165a).add(iArr);
        ((ArrayList) this.f21166b).add(str);
    }

    public Result b(int i7, int i10, mj.a aVar) throws ij.h {
        EnumMap enumMap;
        int[] iArrL = k.l(aVar, i10, false, f21164c, new int[3]);
        try {
            return ((i) this.f21166b).a(i7, aVar, iArrL);
        } catch (ij.k unused) {
            i iVar = (i) this.f21165a;
            StringBuilder sb2 = iVar.f21163b;
            sb2.setLength(0);
            int[] iArr = iVar.f21162a;
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            iArr[3] = 0;
            int i11 = aVar.f15838e;
            int iC = iArrL[1];
            int i12 = 0;
            for (int i13 = 0; i13 < 2 && iC < i11; i13++) {
                int iH = k.h(aVar, iArr, iC, k.f21170g);
                sb2.append((char) ((iH % 10) + 48));
                for (int i14 : iArr) {
                    iC += i14;
                }
                if (iH >= 10) {
                    i12 |= 1 << (1 - i13);
                }
                if (i13 != 1) {
                    iC = aVar.c(aVar.b(iC));
                }
            }
            if (sb2.length() != 2) {
                throw ij.h.f11808i;
            }
            if (Integer.parseInt(sb2.toString()) % 4 != i12) {
                throw ij.h.f11808i;
            }
            String string = sb2.toString();
            if (string.length() != 2) {
                enumMap = null;
            } else {
                enumMap = new EnumMap(l.class);
                enumMap.put(l.f11819v, Integer.valueOf(string));
            }
            float f2 = i7;
            Result result = new Result(string, null, new m[]{new m((iArrL[0] + iArrL[1]) / 2.0f, f2), new m(iC, f2)}, ij.a.N);
            if (enumMap != null) {
                result.a(enumMap);
            }
            return result;
        }
    }
}

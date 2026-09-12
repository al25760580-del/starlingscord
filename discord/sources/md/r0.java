package md;

import java.util.Arrays;
import java.util.Random;

/* JADX INFO: loaded from: classes3.dex */
public final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Random f15694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f15695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f15696c;

    public r0() {
        this(new Random());
    }

    public final r0 a(int i7) {
        int[] iArr;
        Random random;
        int[] iArr2 = new int[i7];
        int[] iArr3 = new int[i7];
        int i10 = 0;
        while (true) {
            iArr = this.f15695b;
            random = this.f15694a;
            if (i10 >= i7) {
                break;
            }
            iArr2[i10] = random.nextInt(iArr.length + 1);
            int i11 = i10 + 1;
            int iNextInt = random.nextInt(i11);
            iArr3[i10] = iArr3[iNextInt];
            iArr3[iNextInt] = i10;
            i10 = i11;
        }
        Arrays.sort(iArr2);
        int[] iArr4 = new int[iArr.length + i7];
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < iArr.length + i7; i14++) {
            if (i12 >= i7 || i13 != iArr2[i12]) {
                int i15 = i13 + 1;
                int i16 = iArr[i13];
                iArr4[i14] = i16;
                if (i16 >= 0) {
                    iArr4[i14] = i16 + i7;
                }
                i13 = i15;
            } else {
                iArr4[i14] = iArr3[i12];
                i12++;
            }
        }
        return new r0(iArr4, new Random(random.nextLong()));
    }

    public r0(int[] iArr, Random random) {
        this.f15695b = iArr;
        this.f15694a = random;
        this.f15696c = new int[iArr.length];
        for (int i7 = 0; i7 < iArr.length; i7++) {
            this.f15696c[iArr[i7]] = i7;
        }
    }

    public r0(Random random) {
        this(new int[0], random);
    }
}

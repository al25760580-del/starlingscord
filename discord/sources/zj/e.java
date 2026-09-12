package zj;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float[][] f24031a = (float[][]) Array.newInstance((Class<?>) Float.TYPE, 2787, 8);

    static {
        int i7;
        for (int i10 = 0; i10 < 2787; i10++) {
            int i11 = yj.a.f23377b[i10];
            int i12 = i11 & 1;
            int i13 = 0;
            while (i13 < 8) {
                float f2 = 0.0f;
                while (true) {
                    i7 = i11 & 1;
                    if (i7 == i12) {
                        f2 += 1.0f;
                        i11 >>= 1;
                    }
                }
                f24031a[i10][7 - i13] = f2 / 17.0f;
                i13++;
                i12 = i7;
            }
        }
    }
}

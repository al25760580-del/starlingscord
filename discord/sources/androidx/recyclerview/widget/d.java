package androidx.recyclerview.widget;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f2590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f2591b;

    public void a() {
        int[] iArr = (int[]) this.f2590a;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        this.f2591b = null;
    }

    public void b(int i7) {
        int[] iArr = (int[]) this.f2590a;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i7, 10) + 1];
            this.f2590a = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i7 >= iArr.length) {
            int length = iArr.length;
            while (length <= i7) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.f2590a = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = (int[]) this.f2590a;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    public void c(int i7, int i10) {
        int[] iArr = (int[]) this.f2590a;
        if (iArr == null || i7 >= iArr.length) {
            return;
        }
        int i11 = i7 + i10;
        b(i11);
        int[] iArr2 = (int[]) this.f2590a;
        System.arraycopy(iArr2, i7, iArr2, i11, (iArr2.length - i7) - i10);
        Arrays.fill((int[]) this.f2590a, i7, i11, -1);
        ArrayList arrayList = (ArrayList) this.f2591b;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            r1 r1Var = (r1) ((ArrayList) this.f2591b).get(size);
            int i12 = r1Var.f2677d;
            if (i12 >= i7) {
                r1Var.f2677d = i12 + i10;
            }
        }
    }

    public void d(int i7, int i10) {
        int[] iArr = (int[]) this.f2590a;
        if (iArr == null || i7 >= iArr.length) {
            return;
        }
        int i11 = i7 + i10;
        b(i11);
        int[] iArr2 = (int[]) this.f2590a;
        System.arraycopy(iArr2, i11, iArr2, i7, (iArr2.length - i7) - i10);
        int[] iArr3 = (int[]) this.f2590a;
        Arrays.fill(iArr3, iArr3.length - i10, iArr3.length, -1);
        ArrayList arrayList = (ArrayList) this.f2591b;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            r1 r1Var = (r1) ((ArrayList) this.f2591b).get(size);
            int i12 = r1Var.f2677d;
            if (i12 >= i7) {
                if (i12 < i11) {
                    ((ArrayList) this.f2591b).remove(size);
                } else {
                    r1Var.f2677d = i12 - i10;
                }
            }
        }
    }
}

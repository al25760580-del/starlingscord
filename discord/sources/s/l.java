package s;

import androidx.collection.SparseArrayCompat;
import java.util.ConcurrentModificationException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f19640a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f19641b = new Object();

    public static final void a(SparseArrayCompat sparseArrayCompat) {
        int i7 = sparseArrayCompat.f1226v;
        int[] iArr = sparseArrayCompat.f1224e;
        Object[] objArr = sparseArrayCompat.f1225i;
        int i10 = 0;
        for (int i11 = 0; i11 < i7; i11++) {
            Object obj = objArr[i11];
            if (obj != f19641b) {
                if (i11 != i10) {
                    iArr[i10] = iArr[i11];
                    objArr[i10] = obj;
                    objArr[i11] = null;
                }
                i10++;
            }
        }
        sparseArrayCompat.f1223d = false;
        sparseArrayCompat.f1226v = i10;
    }

    public static final void b(f fVar, int i7) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        int[] iArr = new int[i7];
        Intrinsics.checkNotNullParameter(iArr, "<set-?>");
        fVar.f19624d = iArr;
        Object[] objArr = new Object[i7];
        Intrinsics.checkNotNullParameter(objArr, "<set-?>");
        fVar.f19625e = objArr;
    }

    public static final int c(f fVar, Object obj, int i7) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        int i10 = fVar.f19626i;
        if (i10 == 0) {
            return -1;
        }
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        try {
            int iA = t.a.a(fVar.f19626i, i7, fVar.f19624d);
            if (iA < 0 || Intrinsics.areEqual(obj, fVar.f19625e[iA])) {
                return iA;
            }
            int i11 = iA + 1;
            while (i11 < i10 && fVar.f19624d[i11] == i7) {
                if (Intrinsics.areEqual(obj, fVar.f19625e[i11])) {
                    return i11;
                }
                i11++;
            }
            for (int i12 = iA - 1; i12 >= 0 && fVar.f19624d[i12] == i7; i12--) {
                if (Intrinsics.areEqual(obj, fVar.f19625e[i12])) {
                    return i12;
                }
            }
            return ~i11;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }
}

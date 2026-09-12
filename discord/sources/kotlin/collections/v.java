package kotlin.collections;

import java.util.RandomAccess;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class v extends h implements RandomAccess {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int[] f14668e;

    public v(int[] iArr) {
        this.f14668e = iArr;
    }

    @Override // kotlin.collections.b
    public final int a() {
        return this.f14668e.length;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0025 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:15:0x0027 A[RETURN] */
    @Override // kotlin.collections.b, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Integer)) {
            return false;
        }
        int iIntValue = ((Number) obj).intValue();
        int[] iArr = this.f14668e;
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int length = iArr.length;
        int i7 = 0;
        while (i7 < length) {
            if (iIntValue == iArr[i7]) {
                if (i7 >= 0) {
                    return true;
                }
                return false;
            }
            i7++;
        }
        i7 = -1;
        if (i7 >= 0) {
            return true;
        }
        return false;
    }

    @Override // kotlin.collections.h, java.util.List
    public final Object get(int i7) {
        return Integer.valueOf(this.f14668e[i7]);
    }

    @Override // kotlin.collections.h, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Number) obj).intValue();
        int[] iArr = this.f14668e;
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int length = iArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            if (iIntValue == iArr[i7]) {
                return i7;
            }
        }
        return -1;
    }

    @Override // kotlin.collections.b, java.util.Collection
    public final boolean isEmpty() {
        return this.f14668e.length == 0;
    }

    @Override // kotlin.collections.h, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Number) obj).intValue();
        int[] iArr = this.f14668e;
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int length = iArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i7 = length - 1;
                if (iIntValue == iArr[length]) {
                    return length;
                }
                if (i7 >= 0) {
                    length = i7;
                }
            }
        }
        return -1;
    }
}

package rp;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.n0;
import kotlin.collections.v;
import kotlin.collections.y;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f19506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f19508c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f19509d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f19510e;

    public a(int... numbers) {
        List listI0;
        Intrinsics.checkNotNullParameter(numbers, "numbers");
        this.f19506a = numbers;
        Integer numU = y.u(0, numbers);
        this.f19507b = numU != null ? numU.intValue() : -1;
        Integer numU2 = y.u(1, numbers);
        this.f19508c = numU2 != null ? numU2.intValue() : -1;
        Integer numU3 = y.u(2, numbers);
        this.f19509d = numU3 != null ? numU3.intValue() : -1;
        if (numbers.length <= 3) {
            listI0 = n0.f14659d;
        } else {
            if (numbers.length > 1024) {
                throw new IllegalArgumentException(com.discord.chat.presentation.list.a.j(new StringBuilder("BinaryVersion with length more than 1024 are not supported. Provided length "), numbers.length, '.'));
            }
            Intrinsics.checkNotNullParameter(numbers, "<this>");
            listI0 = CollectionsKt.i0(new kotlin.collections.g(new v(numbers), 3, numbers.length));
        }
        this.f19510e = listI0;
    }

    public final boolean a(int i7, int i10, int i11) {
        int i12 = this.f19507b;
        if (i12 > i7) {
            return true;
        }
        if (i12 < i7) {
            return false;
        }
        int i13 = this.f19508c;
        if (i13 > i10) {
            return true;
        }
        return i13 >= i10 && this.f19509d >= i11;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !Intrinsics.areEqual(getClass(), obj.getClass())) {
            return false;
        }
        a aVar = (a) obj;
        return this.f19507b == aVar.f19507b && this.f19508c == aVar.f19508c && this.f19509d == aVar.f19509d && Intrinsics.areEqual(this.f19510e, aVar.f19510e);
    }

    public final int hashCode() {
        int i7 = this.f19507b;
        int i10 = (i7 * 31) + this.f19508c + i7;
        int i11 = (i10 * 31) + this.f19509d + i10;
        return this.f19510e.hashCode() + (i11 * 31) + i11;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        for (int i7 : this.f19506a) {
            if (i7 == -1) {
                break;
            }
            arrayList.add(Integer.valueOf(i7));
        }
        return arrayList.isEmpty() ? "unknown" : CollectionsKt.O(arrayList, ".", null, null, null, 62);
    }
}

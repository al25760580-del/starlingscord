package kotlin.text;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements Iterator, KMappedMarker {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f14707d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f14708e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f14709i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public IntRange f14710v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f14711w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ c f14712x;

    public b(c cVar) {
        this.f14712x = cVar;
        int iD = lo.j.d(0, 0, cVar.f14713a.length());
        this.f14708e = iD;
        this.f14709i = iD;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001a  */
    /* JADX WARN: Code duplicated, block: B:12:0x0022 A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:18:0x0075  */
    public final void a() {
        Pair pair;
        int i7 = this.f14709i;
        if (i7 < 0) {
            this.f14707d = 0;
            this.f14710v = null;
            return;
        }
        c cVar = this.f14712x;
        int i10 = cVar.f14714b;
        if (i10 > 0) {
            int i11 = this.f14711w + 1;
            this.f14711w = i11;
            if (i11 >= i10) {
                this.f14710v = new IntRange(this.f14708e, StringsKt.H(cVar.f14713a), 1);
                this.f14709i = -1;
            } else if (i7 > cVar.f14713a.length() && (pair = (Pair) cVar.f14715c.invoke(cVar.f14713a, Integer.valueOf(this.f14709i))) != null) {
                int iIntValue = ((Number) pair.f14612d).intValue();
                int iIntValue2 = ((Number) pair.f14613e).intValue();
                this.f14710v = lo.j.i(this.f14708e, iIntValue);
                int i12 = iIntValue + iIntValue2;
                this.f14708e = i12;
                this.f14709i = i12 + (iIntValue2 == 0 ? 1 : 0);
            } else {
                this.f14710v = new IntRange(this.f14708e, StringsKt.H(cVar.f14713a), 1);
                this.f14709i = -1;
            }
        } else if (i7 > cVar.f14713a.length()) {
            this.f14710v = new IntRange(this.f14708e, StringsKt.H(cVar.f14713a), 1);
            this.f14709i = -1;
        } else {
            int iIntValue3 = ((Number) pair.f14612d).intValue();
            int iIntValue4 = ((Number) pair.f14613e).intValue();
            this.f14710v = lo.j.i(this.f14708e, iIntValue3);
            int i13 = iIntValue3 + iIntValue4;
            this.f14708e = i13;
            this.f14709i = i13 + (iIntValue4 == 0 ? 1 : 0);
        }
        this.f14707d = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f14707d == -1) {
            a();
        }
        return this.f14707d == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f14707d == -1) {
            a();
        }
        if (this.f14707d == 0) {
            throw new NoSuchElementException();
        }
        IntRange intRange = this.f14710v;
        Intrinsics.checkNotNull(intRange, "null cannot be cast to non-null type kotlin.ranges.IntRange");
        this.f14710v = null;
        this.f14707d = -1;
        return intRange;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

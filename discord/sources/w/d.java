package w;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: loaded from: classes.dex */
public final class d implements Iterator, KMappedMarker {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f[] f21965d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f21966e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f21967i;

    public d(f[] fVarArr) {
        e eVar = e.f21968b;
        this.f21965d = fVarArr;
        this.f21967i = true;
        f fVar = fVarArr[0];
        Object[] objArr = eVar.f21969a;
        int iBitCount = Integer.bitCount(0) * 2;
        fVar.f21970d = objArr;
        fVar.f21971e = iBitCount;
        fVar.f21972i = 0;
        this.f21966e = 0;
        a();
    }

    public final void a() {
        int i7 = this.f21966e;
        f[] fVarArr = this.f21965d;
        f fVar = fVarArr[i7];
        if (fVar.f21972i < fVar.f21971e) {
            return;
        }
        while (-1 < i7) {
            int iB = b(i7);
            if (iB == -1) {
                f fVar2 = fVarArr[i7];
                int i10 = fVar2.f21972i;
                Object[] objArr = fVar2.f21970d;
                if (i10 < objArr.length) {
                    int length = objArr.length;
                    fVar2.f21972i = i10 + 1;
                    iB = b(i7);
                }
            }
            if (iB != -1) {
                this.f21966e = iB;
                return;
            }
            if (i7 > 0) {
                f fVar3 = fVarArr[i7 - 1];
                int i11 = fVar3.f21972i;
                int length2 = fVar3.f21970d.length;
                fVar3.f21972i = i11 + 1;
            }
            f fVar4 = fVarArr[i7];
            fVar4.f21970d = e.f21968b.f21969a;
            fVar4.f21971e = 0;
            fVar4.f21972i = 0;
            i7--;
        }
        this.f21967i = false;
    }

    public final int b(int i7) {
        f[] fVarArr = this.f21965d;
        f fVar = fVarArr[i7];
        int i10 = fVar.f21972i;
        if (i10 < fVar.f21971e) {
            return i7;
        }
        Object[] objArr = fVar.f21970d;
        if (i10 >= objArr.length) {
            return -1;
        }
        int length = objArr.length;
        Object obj = objArr[i10];
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>");
        e eVar = (e) obj;
        if (i7 == 6) {
            f fVar2 = fVarArr[i7 + 1];
            Object[] objArr2 = eVar.f21969a;
            int length2 = objArr2.length;
            fVar2.f21970d = objArr2;
            fVar2.f21971e = length2;
            fVar2.f21972i = 0;
        } else {
            f fVar3 = fVarArr[i7 + 1];
            Object[] objArr3 = eVar.f21969a;
            int iBitCount = Integer.bitCount(0) * 2;
            fVar3.f21970d = objArr3;
            fVar3.f21971e = iBitCount;
            fVar3.f21972i = 0;
        }
        return b(i7 + 1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f21967i;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f21967i) {
            throw new NoSuchElementException();
        }
        Object next = this.f21965d[this.f21966e].next();
        a();
        return next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

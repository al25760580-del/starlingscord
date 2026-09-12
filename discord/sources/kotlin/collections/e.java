package kotlin.collections;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: loaded from: classes3.dex */
public class e implements Iterator, KMappedMarker {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f14637d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f14638e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f14639i;

    public e(byte[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        this.f14639i = array;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f14637d) {
            case 0:
                return this.f14638e < ((h) this.f14639i).a();
            case 1:
                return this.f14638e > 0;
            case 2:
                return this.f14638e < ((byte[]) this.f14639i).length;
            case 3:
                return this.f14638e < ((int[]) this.f14639i).length;
            case 4:
                return this.f14638e < ((long[]) this.f14639i).length;
            default:
                return this.f14638e < ((short[]) this.f14639i).length;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f14637d) {
            case 0:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                h hVar = (h) this.f14639i;
                int i7 = this.f14638e;
                this.f14638e = i7 + 1;
                return hVar.get(i7);
            case 1:
                or.a0 a0Var = (or.a0) this.f14639i;
                int i10 = a0Var.f17544c;
                int i11 = this.f14638e;
                this.f14638e = i11 - 1;
                return a0Var.f17546e[i10 - i11];
            case 2:
                int i12 = this.f14638e;
                byte[] bArr = (byte[]) this.f14639i;
                if (i12 >= bArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f14638e));
                }
                this.f14638e = i12 + 1;
                return new rn.y(bArr[i12]);
            case 3:
                int i13 = this.f14638e;
                int[] iArr = (int[]) this.f14639i;
                if (i13 >= iArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f14638e));
                }
                this.f14638e = i13 + 1;
                return new rn.b0(iArr[i13]);
            case 4:
                int i14 = this.f14638e;
                long[] jArr = (long[]) this.f14639i;
                if (i14 >= jArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f14638e));
                }
                this.f14638e = i14 + 1;
                return new rn.e0(jArr[i14]);
            default:
                int i15 = this.f14638e;
                short[] sArr = (short[]) this.f14639i;
                if (i15 >= sArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f14638e));
                }
                this.f14638e = i15 + 1;
                return new rn.i0(sArr[i15]);
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f14637d) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 3:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 4:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public e(int[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        this.f14639i = array;
    }

    public e(long[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        this.f14639i = array;
    }

    public e(short[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        this.f14639i = array;
    }

    public e(h hVar) {
        this.f14639i = hVar;
    }

    public e(or.a0 a0Var) {
        this.f14639i = a0Var;
        this.f14638e = a0Var.f17544c;
    }
}

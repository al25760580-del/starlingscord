package lo;

import java.util.NoSuchElementException;
import kotlin.collections.s0;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends s0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f15154d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f15155e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f15156i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f15157v;

    public b(int i7, int i10, int i11) {
        this.f15154d = i11;
        this.f15155e = i10;
        boolean z5 = false;
        if (i11 <= 0 ? i7 >= i10 : i7 <= i10) {
            z5 = true;
        }
        this.f15156i = z5;
        this.f15157v = z5 ? i7 : i10;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f15156i;
    }

    @Override // kotlin.collections.s0
    public final int nextInt() {
        int i7 = this.f15157v;
        if (i7 != this.f15155e) {
            this.f15157v = this.f15154d + i7;
            return i7;
        }
        if (!this.f15156i) {
            throw new NoSuchElementException();
        }
        this.f15156i = false;
        return i7;
    }
}

package io.sentry;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements Iterator {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12631d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12632e = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f12633i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ f f12634v;

    public e(f fVar) {
        this.f12634v = fVar;
        this.f12631d = fVar.f12663e;
        this.f12633i = fVar.f12665v;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f12633i || this.f12631d != this.f12634v.f12664i;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f12633i = false;
        int i7 = this.f12631d;
        this.f12632e = i7;
        int i10 = i7 + 1;
        f fVar = this.f12634v;
        this.f12631d = i10 < fVar.f12666w ? i10 : 0;
        return fVar.f12662d[i7];
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i7;
        f fVar = this.f12634v;
        int i10 = fVar.f12666w;
        Object[] objArr = fVar.f12662d;
        int i11 = this.f12632e;
        if (i11 == -1) {
            throw new IllegalStateException();
        }
        int i12 = fVar.f12663e;
        if (i11 == i12) {
            fVar.remove();
            this.f12632e = -1;
            return;
        }
        int i13 = i11 + 1;
        if (i12 >= i11 || i13 >= (i7 = fVar.f12664i)) {
            while (i13 != fVar.f12664i) {
                if (i13 >= i10) {
                    objArr[i13 - 1] = objArr[0];
                } else {
                    int i14 = i13 - 1;
                    if (i14 < 0) {
                        i14 = i10 - 1;
                    }
                    objArr[i14] = objArr[i13];
                    i13++;
                    if (i13 >= i10) {
                    }
                }
                i13 = 0;
            }
        } else {
            System.arraycopy(objArr, i13, objArr, i11, i7 - i13);
        }
        this.f12632e = -1;
        int i15 = fVar.f12664i - 1;
        if (i15 < 0) {
            i15 = i10 - 1;
        }
        fVar.f12664i = i15;
        objArr[i15] = null;
        fVar.f12665v = false;
        int i16 = this.f12631d - 1;
        if (i16 < 0) {
            i16 = i10 - 1;
        }
        this.f12631d = i16;
    }
}

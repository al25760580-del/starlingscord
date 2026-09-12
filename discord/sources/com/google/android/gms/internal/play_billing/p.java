package com.google.android.gms.internal.play_billing;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class p extends e0 implements ListIterator {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f6081d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f6082e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final s f6083i;

    public p(s sVar, int i7) {
        int size = sVar.size();
        z1.q(i7, size);
        this.f6081d = size;
        this.f6082e = i7;
        this.f6083i = sVar;
    }

    public final Object a(int i7) {
        return this.f6083i.get(i7);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f6082e < this.f6081d;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f6082e > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i7 = this.f6082e;
        this.f6082e = i7 + 1;
        return a(i7);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f6082e;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i7 = this.f6082e - 1;
        this.f6082e = i7;
        return a(i7);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f6082e - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}

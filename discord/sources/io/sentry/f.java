package io.sentry;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Queue;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends AbstractCollection implements Queue, Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient Object[] f12662d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public transient int f12663e = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public transient int f12664i = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public transient boolean f12665v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f12666w;

    public f(int i7) {
        if (i7 <= 0) {
            throw new IllegalArgumentException("The size must be greater than 0");
        }
        Object[] objArr = new Object[i7];
        this.f12662d = objArr;
        this.f12666w = objArr.length;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Queue
    public final boolean add(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Attempted to add null object to queue");
        }
        int size = size();
        int i7 = this.f12666w;
        if (size == i7) {
            remove();
        }
        int i10 = this.f12664i;
        int i11 = i10 + 1;
        this.f12664i = i11;
        this.f12662d[i10] = obj;
        if (i11 >= i7) {
            this.f12664i = 0;
        }
        if (this.f12664i == this.f12663e) {
            this.f12665v = true;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f12665v = false;
        this.f12663e = 0;
        this.f12664i = 0;
        Arrays.fill(this.f12662d, (Object) null);
    }

    @Override // java.util.Queue
    public final Object element() {
        if (isEmpty()) {
            throw new NoSuchElementException("queue is empty");
        }
        return peek();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new e(this);
    }

    @Override // java.util.Queue
    public final boolean offer(Object obj) {
        add(obj);
        return true;
    }

    @Override // java.util.Queue
    public final Object peek() {
        if (isEmpty()) {
            return null;
        }
        return this.f12662d[this.f12663e];
    }

    @Override // java.util.Queue
    public final Object poll() {
        if (isEmpty()) {
            return null;
        }
        return remove();
    }

    @Override // java.util.Queue
    public final Object remove() {
        if (isEmpty()) {
            throw new NoSuchElementException("queue is empty");
        }
        int i7 = this.f12663e;
        Object[] objArr = this.f12662d;
        Object obj = objArr[i7];
        if (obj != null) {
            int i10 = i7 + 1;
            this.f12663e = i10;
            objArr[i7] = null;
            if (i10 >= this.f12666w) {
                this.f12663e = 0;
            }
            this.f12665v = false;
        }
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        int i7 = this.f12664i;
        int i10 = this.f12663e;
        int i11 = this.f12666w;
        if (i7 < i10) {
            return (i11 - i10) + i7;
        }
        if (i7 != i10) {
            return i7 - i10;
        }
        if (this.f12665v) {
            return i11;
        }
        return 0;
    }
}

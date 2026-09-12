package com.google.android.gms.internal.play_billing;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class v extends e0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f6150d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f6151e;

    public v(Object obj) {
        this.f6150d = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f6151e;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f6151e) {
            throw new NoSuchElementException();
        }
        this.f6151e = true;
        return this.f6150d;
    }
}

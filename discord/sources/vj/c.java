package vj;

import ij.m;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f21691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m[] f21692c;

    public c(int i7, int i10, int i11, int i12, int[] iArr) {
        this.f21690a = i7;
        this.f21691b = iArr;
        float f2 = i12;
        this.f21692c = new m[]{new m(i10, f2), new m(i11, f2)};
    }

    public final boolean equals(Object obj) {
        return (obj instanceof c) && this.f21690a == ((c) obj).f21690a;
    }

    public final int hashCode() {
        return this.f21690a;
    }
}

package com.facebook.soloader;

import java.util.zip.ZipEntry;

/* JADX INFO: loaded from: classes3.dex */
public final class n extends g0 implements Comparable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ZipEntry f5410i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f5411v;

    public n(String str, ZipEntry zipEntry, int i7) {
        super(str, String.valueOf(zipEntry.getCrc()));
        this.f5410i = zipEntry;
        this.f5411v = i7;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f5395d.compareTo(((n) obj).f5395d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n.class == obj.getClass()) {
            n nVar = (n) obj;
            if (this.f5410i.equals(nVar.f5410i) && this.f5411v == nVar.f5411v) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f5410i.hashCode() + (this.f5411v * 31);
    }
}

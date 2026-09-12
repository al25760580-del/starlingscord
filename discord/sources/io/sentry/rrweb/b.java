package io.sentry.rrweb;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c f13110d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f13111e = System.currentTimeMillis();

    public b(c cVar) {
        this.f13110d = cVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f13111e == bVar.f13111e && this.f13110d == bVar.f13110d;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f13110d, Long.valueOf(this.f13111e)});
    }
}

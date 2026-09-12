package io.sentry.android.core.performance;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements Comparable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g f12372d = new g();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g f12373e = new g();

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        c cVar = (c) obj;
        int iCompare = Long.compare(this.f12372d.f12385i, cVar.f12372d.f12385i);
        return iCompare == 0 ? Long.compare(this.f12373e.f12385i, cVar.f12373e.f12385i) : iCompare;
    }
}

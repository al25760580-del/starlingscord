package cc;

import androidx.recyclerview.widget.h0;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f3564f = new a(h0.DEFAULT_DRAG_ANIMATION_DURATION, 10000, 81920, 10485760, 604800000);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f3565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3567c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f3568d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f3569e;

    public a(int i7, int i10, int i11, long j, long j5) {
        this.f3565a = j;
        this.f3566b = i7;
        this.f3567c = i10;
        this.f3568d = j5;
        this.f3569e = i11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f3565a == aVar.f3565a && this.f3566b == aVar.f3566b && this.f3567c == aVar.f3567c && this.f3568d == aVar.f3568d && this.f3569e == aVar.f3569e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f3565a;
        int i7 = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f3566b) * 1000003) ^ this.f3567c) * 1000003;
        long j5 = this.f3568d;
        return ((i7 ^ ((int) ((j5 >>> 32) ^ j5))) * 1000003) ^ this.f3569e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb2.append(this.f3565a);
        sb2.append(", loadBatchSize=");
        sb2.append(this.f3566b);
        sb2.append(", criticalSectionEnterTimeoutMs=");
        sb2.append(this.f3567c);
        sb2.append(", eventCleanUpAge=");
        sb2.append(this.f3568d);
        sb2.append(", maxBlobByteSizePerRow=");
        return kk.b.l(sb2, this.f3569e, "}");
    }
}

package v3;

import java.util.Set;
import kotlin.collections.p0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final e f21393i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f21394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f21395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f21396c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f21397d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f21398e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f21399f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f21400g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Set f21401h;

    static {
        r requiredNetworkType = r.f21420d;
        Intrinsics.checkNotNullParameter(requiredNetworkType, "requiredNetworkType");
        Intrinsics.checkNotNullParameter(requiredNetworkType, "requiredNetworkType");
        f21393i = new e(requiredNetworkType, false, false, false, false, -1L, -1L, p0.f14661d);
    }

    public e(r requiredNetworkType, boolean z5, boolean z6, boolean z7, boolean z10, long j, long j5, Set contentUriTriggers) {
        Intrinsics.checkNotNullParameter(requiredNetworkType, "requiredNetworkType");
        Intrinsics.checkNotNullParameter(contentUriTriggers, "contentUriTriggers");
        this.f21394a = requiredNetworkType;
        this.f21395b = z5;
        this.f21396c = z6;
        this.f21397d = z7;
        this.f21398e = z10;
        this.f21399f = j;
        this.f21400g = j5;
        this.f21401h = contentUriTriggers;
    }

    public final boolean a() {
        return !this.f21401h.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.areEqual(e.class, obj.getClass())) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f21395b == eVar.f21395b && this.f21396c == eVar.f21396c && this.f21397d == eVar.f21397d && this.f21398e == eVar.f21398e && this.f21399f == eVar.f21399f && this.f21400g == eVar.f21400g && this.f21394a == eVar.f21394a) {
            return Intrinsics.areEqual(this.f21401h, eVar.f21401h);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.f21394a.hashCode() * 31) + (this.f21395b ? 1 : 0)) * 31) + (this.f21396c ? 1 : 0)) * 31) + (this.f21397d ? 1 : 0)) * 31) + (this.f21398e ? 1 : 0)) * 31;
        long j = this.f21399f;
        int i7 = (iHashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j5 = this.f21400g;
        return this.f21401h.hashCode() + ((i7 + ((int) (j5 ^ (j5 >>> 32)))) * 31);
    }

    public final String toString() {
        return "Constraints{requiredNetworkType=" + this.f21394a + ", requiresCharging=" + this.f21395b + ", requiresDeviceIdle=" + this.f21396c + ", requiresBatteryNotLow=" + this.f21397d + ", requiresStorageNotLow=" + this.f21398e + ", contentTriggerUpdateDelayMillis=" + this.f21399f + ", contentTriggerMaxDelayMillis=" + this.f21400g + ", contentUriTriggers=" + this.f21401h + ", }";
    }

    public e(e other) {
        Intrinsics.checkNotNullParameter(other, "other");
        this.f21395b = other.f21395b;
        this.f21396c = other.f21396c;
        this.f21394a = other.f21394a;
        this.f21397d = other.f21397d;
        this.f21398e = other.f21398e;
        this.f21401h = other.f21401h;
        this.f21399f = other.f21399f;
        this.f21400g = other.f21400g;
    }
}

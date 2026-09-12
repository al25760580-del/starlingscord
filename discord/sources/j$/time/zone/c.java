package j$.time.zone;

import j$.time.ZoneOffset;
import java.io.Serializable;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes2.dex */
public final class c implements Serializable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final long[] f13568g = new long[0];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b[] f13569h = new b[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long[] f13570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ZoneOffset[] f13571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f13572c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ZoneOffset[] f13573d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b[] f13574e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient ConcurrentMap f13575f = new ConcurrentHashMap();

    public c(ZoneOffset zoneOffset) {
        ZoneOffset[] zoneOffsetArr = {zoneOffset};
        this.f13571b = zoneOffsetArr;
        long[] jArr = f13568g;
        this.f13570a = jArr;
        this.f13572c = jArr;
        this.f13573d = zoneOffsetArr;
        this.f13574e = f13569h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (Arrays.equals(this.f13570a, cVar.f13570a) && Arrays.equals(this.f13571b, cVar.f13571b) && Arrays.equals(this.f13572c, cVar.f13572c) && Arrays.equals(this.f13573d, cVar.f13573d) && Arrays.equals(this.f13574e, cVar.f13574e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((Arrays.hashCode(this.f13570a) ^ Arrays.hashCode(this.f13571b)) ^ Arrays.hashCode(this.f13572c)) ^ Arrays.hashCode(this.f13573d)) ^ Arrays.hashCode(this.f13574e);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ZoneRules[currentStandardOffset=");
        ZoneOffset[] zoneOffsetArr = this.f13571b;
        sb2.append(zoneOffsetArr[zoneOffsetArr.length - 1]);
        sb2.append("]");
        return sb2.toString();
    }
}

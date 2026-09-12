package ub;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f20999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f21000b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f21001c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f21002d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f21003e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f21004f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final v f21005g;

    public k(long j, Integer num, long j5, byte[] bArr, String str, long j7, v vVar) {
        this.f20999a = j;
        this.f21000b = num;
        this.f21001c = j5;
        this.f21002d = bArr;
        this.f21003e = str;
        this.f21004f = j7;
        this.f21005g = vVar;
    }

    public final boolean equals(Object obj) {
        Integer num;
        String str;
        v vVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof r) {
            r rVar = (r) obj;
            k kVar = (k) rVar;
            v vVar2 = kVar.f21005g;
            String str2 = kVar.f21003e;
            Integer num2 = kVar.f21000b;
            if (this.f20999a == kVar.f20999a && ((num = this.f21000b) != null ? num.equals(num2) : num2 == null) && this.f21001c == kVar.f21001c) {
                if (Arrays.equals(this.f21002d, rVar instanceof k ? ((k) rVar).f21002d : kVar.f21002d) && ((str = this.f21003e) != null ? str.equals(str2) : str2 == null) && this.f21004f == kVar.f21004f && ((vVar = this.f21005g) != null ? vVar.equals(vVar2) : vVar2 == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f20999a;
        int i7 = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f21000b;
        int iHashCode = (i7 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        long j5 = this.f21001c;
        int iHashCode2 = (((iHashCode ^ ((int) (j5 ^ (j5 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f21002d)) * 1000003;
        String str = this.f21003e;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j7 = this.f21004f;
        int i10 = (iHashCode3 ^ ((int) (j7 ^ (j7 >>> 32)))) * 1000003;
        v vVar = this.f21005g;
        return i10 ^ (vVar != null ? vVar.hashCode() : 0);
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.f20999a + ", eventCode=" + this.f21000b + ", eventUptimeMs=" + this.f21001c + ", sourceExtension=" + Arrays.toString(this.f21002d) + ", sourceExtensionJsonProto3=" + this.f21003e + ", timezoneOffsetSeconds=" + this.f21004f + ", networkConnectionInfo=" + this.f21005g + "}";
    }
}

package ub;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f21006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f21007b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f21008c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f21009d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f21010e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f21011f;

    public l(long j, long j5, j jVar, Integer num, String str, ArrayList arrayList) {
        w wVar = w.f21021d;
        this.f21006a = j;
        this.f21007b = j5;
        this.f21008c = jVar;
        this.f21009d = num;
        this.f21010e = str;
        this.f21011f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        l lVar = (l) ((s) obj);
        Object obj2 = w.f21021d;
        ArrayList arrayList = lVar.f21011f;
        String str = lVar.f21010e;
        Integer num = lVar.f21009d;
        j jVar = lVar.f21008c;
        if (this.f21006a != lVar.f21006a || this.f21007b != lVar.f21007b || !this.f21008c.equals(jVar)) {
            return false;
        }
        Integer num2 = this.f21009d;
        if (num2 == null) {
            if (num != null) {
                return false;
            }
        } else if (!num2.equals(num)) {
            return false;
        }
        String str2 = this.f21010e;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        return this.f21011f.equals(arrayList) && obj2.equals(obj2);
    }

    public final int hashCode() {
        long j = this.f21006a;
        long j5 = this.f21007b;
        int iHashCode = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j5 >>> 32) ^ j5))) * 1000003) ^ this.f21008c.hashCode()) * 1000003;
        Integer num = this.f21009d;
        int iHashCode2 = (iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f21010e;
        return ((((iHashCode2 ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ this.f21011f.hashCode()) * 1000003) ^ w.f21021d.hashCode();
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.f21006a + ", requestUptimeMs=" + this.f21007b + ", clientInfo=" + this.f21008c + ", logSource=" + this.f21009d + ", logSourceName=" + this.f21010e + ", logEvents=" + this.f21011f + ", qosTier=" + w.f21021d + "}";
    }
}

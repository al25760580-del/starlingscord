package vb;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f21524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f21525c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f21526d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f21527e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map f21528f;

    public h(String str, Integer num, l lVar, long j, long j5, HashMap map) {
        this.f21523a = str;
        this.f21524b = num;
        this.f21525c = lVar;
        this.f21526d = j;
        this.f21527e = j5;
        this.f21528f = map;
    }

    public final String a(String str) {
        String str2 = (String) this.f21528f.get(str);
        return str2 == null ? "" : str2;
    }

    public final int b(String str) {
        String str2 = (String) this.f21528f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final af.c c() {
        af.c cVar = new af.c();
        String str = this.f21523a;
        if (str == null) {
            throw new NullPointerException("Null transportName");
        }
        cVar.f395i = str;
        cVar.f398x = this.f21524b;
        l lVar = this.f21525c;
        if (lVar == null) {
            throw new NullPointerException("Null encodedPayload");
        }
        cVar.f393d = lVar;
        cVar.f394e = Long.valueOf(this.f21526d);
        cVar.f396v = Long.valueOf(this.f21527e);
        cVar.f397w = new HashMap(this.f21528f);
        return cVar;
    }

    public final boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            Integer num2 = hVar.f21524b;
            if (this.f21523a.equals(hVar.f21523a) && ((num = this.f21524b) != null ? num.equals(num2) : num2 == null) && this.f21525c.equals(hVar.f21525c) && this.f21526d == hVar.f21526d && this.f21527e == hVar.f21527e && this.f21528f.equals(hVar.f21528f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f21523a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f21524b;
        int iHashCode2 = (((iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.f21525c.hashCode()) * 1000003;
        long j = this.f21526d;
        int i7 = (iHashCode2 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j5 = this.f21527e;
        return ((i7 ^ ((int) (j5 ^ (j5 >>> 32)))) * 1000003) ^ this.f21528f.hashCode();
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.f21523a + ", code=" + this.f21524b + ", encodedPayload=" + this.f21525c + ", eventMillis=" + this.f21526d + ", uptimeMillis=" + this.f21527e + ", autoMetadata=" + this.f21528f + "}";
    }
}

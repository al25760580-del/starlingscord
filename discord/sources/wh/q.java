package wh;

import com.google.android.play.core.integrity.IntegrityTokenRequest;

/* JADX INFO: loaded from: classes3.dex */
public final class q extends IntegrityTokenRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f22302b;

    public q(String str, Long l6) {
        this.f22301a = str;
        this.f22302b = l6;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest
    public final Long a() {
        return this.f22302b;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest
    public final String b() {
        return this.f22301a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IntegrityTokenRequest)) {
            return false;
        }
        IntegrityTokenRequest integrityTokenRequest = (IntegrityTokenRequest) obj;
        if (!this.f22301a.equals(integrityTokenRequest.b())) {
            return false;
        }
        Long l6 = this.f22302b;
        if (l6 == null) {
            return integrityTokenRequest.a() == null;
        }
        return l6.equals(integrityTokenRequest.a());
    }

    public final int hashCode() {
        int iHashCode = this.f22301a.hashCode() ^ 1000003;
        Long l6 = this.f22302b;
        return (iHashCode * 1000003) ^ (l6 == null ? 0 : l6.hashCode());
    }

    public final String toString() {
        return "IntegrityTokenRequest{nonce=" + this.f22301a + ", cloudProjectNumber=" + this.f22302b + "}";
    }
}

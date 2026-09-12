package ph;

import com.google.android.play.agesignals.AgeSignalsResult;
import java.util.Date;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends AgeSignalsResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f18046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f18047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f18048c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Date f18049d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Integer f18050e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f18051f;

    public j(Integer num, Integer num2, Integer num3, Date date, Integer num4, String str) {
        this.f18046a = num;
        this.f18047b = num2;
        this.f18048c = num3;
        this.f18049d = date;
        this.f18050e = num4;
        this.f18051f = str;
    }

    @Override // com.google.android.play.agesignals.AgeSignalsResult
    public final Integer a() {
        return this.f18047b;
    }

    @Override // com.google.android.play.agesignals.AgeSignalsResult
    public final Integer b() {
        return this.f18046a;
    }

    @Override // com.google.android.play.agesignals.AgeSignalsResult
    public final Integer c() {
        return this.f18048c;
    }

    @Override // com.google.android.play.agesignals.AgeSignalsResult
    public final String d() {
        return this.f18051f;
    }

    @Override // com.google.android.play.agesignals.AgeSignalsResult
    public final Date e() {
        return this.f18049d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AgeSignalsResult)) {
            return false;
        }
        AgeSignalsResult ageSignalsResult = (AgeSignalsResult) obj;
        Integer num = this.f18046a;
        if (num == null) {
            if (ageSignalsResult.b() != null) {
                return false;
            }
        } else if (!num.equals(ageSignalsResult.b())) {
            return false;
        }
        Integer num2 = this.f18047b;
        if (num2 == null) {
            if (ageSignalsResult.a() != null) {
                return false;
            }
        } else if (!num2.equals(ageSignalsResult.a())) {
            return false;
        }
        Integer num3 = this.f18048c;
        if (num3 == null) {
            if (ageSignalsResult.c() != null) {
                return false;
            }
        } else if (!num3.equals(ageSignalsResult.c())) {
            return false;
        }
        Date date = this.f18049d;
        if (date == null) {
            if (ageSignalsResult.e() != null) {
                return false;
            }
        } else if (!date.equals(ageSignalsResult.e())) {
            return false;
        }
        Integer num4 = this.f18050e;
        if (num4 == null) {
            if (ageSignalsResult.f() != null) {
                return false;
            }
        } else if (!num4.equals(ageSignalsResult.f())) {
            return false;
        }
        String str = this.f18051f;
        if (str == null) {
            return ageSignalsResult.d() == null;
        }
        return str.equals(ageSignalsResult.d());
    }

    @Override // com.google.android.play.agesignals.AgeSignalsResult
    public final Integer f() {
        return this.f18050e;
    }

    public final int hashCode() {
        Integer num = this.f18046a;
        int iHashCode = num == null ? 0 : num.hashCode();
        Integer num2 = this.f18047b;
        int iHashCode2 = num2 == null ? 0 : num2.hashCode();
        int i7 = iHashCode ^ 1000003;
        Integer num3 = this.f18048c;
        int iHashCode3 = ((((i7 * 1000003) ^ iHashCode2) * 1000003) ^ (num3 == null ? 0 : num3.hashCode())) * 1000003;
        Date date = this.f18049d;
        int iHashCode4 = (iHashCode3 ^ (date == null ? 0 : date.hashCode())) * 1000003;
        Integer num4 = this.f18050e;
        int iHashCode5 = (iHashCode4 ^ (num4 == null ? 0 : num4.hashCode())) * 1000003;
        String str = this.f18051f;
        return (str != null ? str.hashCode() : 0) ^ iHashCode5;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f18049d);
        StringBuilder sb2 = new StringBuilder("AgeSignalsResult{ageRangeSource=");
        sb2.append(this.f18046a);
        sb2.append(", ageLower=");
        sb2.append(this.f18047b);
        sb2.append(", ageUpper=");
        kk.b.r(this.f18048c, ", significantChangeApprovalDate=", strValueOf, ", significantChangeStatus=", sb2);
        sb2.append(this.f18050e);
        sb2.append(", installId=");
        return com.discord.chat.presentation.list.a.k(sb2, this.f18051f, "}");
    }
}

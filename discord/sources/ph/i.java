package ph;

import com.google.android.play.agesignals.AgeSignalsAccessResult;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends AgeSignalsAccessResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f18045a;

    public i(Integer num) {
        this.f18045a = num;
    }

    @Override // com.google.android.play.agesignals.AgeSignalsAccessResult
    public final Integer a() {
        return this.f18045a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AgeSignalsAccessResult)) {
            return false;
        }
        AgeSignalsAccessResult ageSignalsAccessResult = (AgeSignalsAccessResult) obj;
        Integer num = this.f18045a;
        if (num == null) {
            return ageSignalsAccessResult.a() == null;
        }
        return num.equals(ageSignalsAccessResult.a());
    }

    public final int hashCode() {
        Integer num = this.f18045a;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public final String toString() {
        return "AgeSignalsAccessResult{ageSignalsStatus=" + this.f18045a + "}";
    }
}

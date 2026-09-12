package ye;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* JADX INFO: loaded from: classes3.dex */
public final class p extends BasePendingResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Status f23312a;

    public p(Status status) {
        super(null);
        this.f23312a = status;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final n E(Status status) {
        return this.f23312a;
    }
}

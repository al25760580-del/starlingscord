package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes3.dex */
public enum z3 {
    BROADCAST_ACTION_UNSPECIFIED(0),
    PURCHASES_UPDATED_ACTION(1),
    LOCAL_PURCHASES_UPDATED_ACTION(2),
    ALTERNATIVE_BILLING_ACTION(3),
    IN_APP_BILLING_RESULT_UPDATE_ACTION(4),
    PLAY_BILLING_ACTIVITY_CREATED_ACTION(5);


    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f6210d;

    z3(int i7) {
        this.f6210d = i7;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f6210d);
    }
}

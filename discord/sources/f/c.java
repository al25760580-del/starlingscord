package f;

import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.contract.ActivityResultContract;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ActivityResultCallback f8765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ActivityResultContract f8766b;

    public c(ActivityResultContract contract, ActivityResultCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(contract, "contract");
        this.f8765a = callback;
        this.f8766b = contract;
    }
}

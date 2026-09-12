package e;

import androidx.activity.Cancellable;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class r implements androidx.lifecycle.t, Cancellable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Lifecycle f7843d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final OnBackPressedCallback f7844e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public s f7845i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ OnBackPressedDispatcher f7846v;

    public r(OnBackPressedDispatcher onBackPressedDispatcher, Lifecycle lifecycle, OnBackPressedCallback onBackPressedCallback) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
        this.f7846v = onBackPressedDispatcher;
        this.f7843d = lifecycle;
        this.f7844e = onBackPressedCallback;
        lifecycle.a(this);
    }

    @Override // androidx.lifecycle.t
    public final void c(LifecycleOwner source, androidx.lifecycle.n event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == androidx.lifecycle.n.ON_START) {
            this.f7845i = this.f7846v.b(this.f7844e);
            return;
        }
        if (event != androidx.lifecycle.n.ON_STOP) {
            if (event == androidx.lifecycle.n.ON_DESTROY) {
                cancel();
            }
        } else {
            s sVar = this.f7845i;
            if (sVar != null) {
                sVar.cancel();
            }
        }
    }

    @Override // androidx.activity.Cancellable
    public final void cancel() {
        this.f7843d.c(this);
        this.f7844e.removeCancellable(this);
        s sVar = this.f7845i;
        if (sVar != null) {
            sVar.cancel();
        }
        this.f7845i = null;
    }
}

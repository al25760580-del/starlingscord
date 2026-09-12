package e;

import androidx.activity.Cancellable;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class s implements Cancellable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final OnBackPressedCallback f7847d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ OnBackPressedDispatcher f7848e;

    public s(OnBackPressedDispatcher onBackPressedDispatcher, OnBackPressedCallback onBackPressedCallback) {
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
        this.f7848e = onBackPressedDispatcher;
        this.f7847d = onBackPressedCallback;
    }

    @Override // androidx.activity.Cancellable
    public final void cancel() {
        OnBackPressedDispatcher onBackPressedDispatcher = this.f7848e;
        ArrayDeque arrayDeque = onBackPressedDispatcher.f710b;
        OnBackPressedCallback onBackPressedCallback = this.f7847d;
        arrayDeque.remove(onBackPressedCallback);
        if (Intrinsics.areEqual(onBackPressedDispatcher.f711c, onBackPressedCallback)) {
            onBackPressedCallback.handleOnBackCancelled();
            onBackPressedDispatcher.f711c = null;
        }
        onBackPressedCallback.removeCancellable(this);
        Function0<Unit> enabledChangedCallback$activity_release = onBackPressedCallback.getEnabledChangedCallback$activity_release();
        if (enabledChangedCallback$activity_release != null) {
            enabledChangedCallback$activity_release.invoke();
        }
        onBackPressedCallback.setEnabledChangedCallback$activity_release(null);
    }
}

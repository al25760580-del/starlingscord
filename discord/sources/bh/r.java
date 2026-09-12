package bh;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class r implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3299d;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View v6) {
        switch (this.f3299d) {
            case 0:
                v6.removeOnAttachStateChangeListener(this);
                v6.requestApplyInsets();
                break;
            default:
                Intrinsics.checkNotNullParameter(v6, "v");
                v6.removeOnAttachStateChangeListener(this);
                v6.requestApplyInsets();
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View v6) {
        switch (this.f3299d) {
            case 0:
                break;
            default:
                Intrinsics.checkNotNullParameter(v6, "v");
                break;
        }
    }

    private final void a(View view) {
    }
}

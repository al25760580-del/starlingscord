package og;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f17253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v0.b f17254c;

    public /* synthetic */ a(v0.b bVar, View view, int i7) {
        this.f17252a = i7;
        this.f17254c = bVar;
        this.f17253b = view;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z5) {
        switch (this.f17252a) {
            case 0:
                HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = (HideBottomViewOnScrollBehavior) this.f17254c;
                if (z5 && hideBottomViewOnScrollBehavior.j == 1) {
                    hideBottomViewOnScrollBehavior.s(this.f17253b);
                    break;
                }
                break;
            default:
                HideViewOnScrollBehavior hideViewOnScrollBehavior = (HideViewOnScrollBehavior) this.f17254c;
                if (z5 && hideViewOnScrollBehavior.j == 1) {
                    hideViewOnScrollBehavior.t(this.f17253b);
                    break;
                }
                break;
        }
    }
}

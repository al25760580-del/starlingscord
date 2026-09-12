package n;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes.dex */
public final class n extends FrameLayout implements m.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CollapsibleActionView f16193d;

    /* JADX WARN: Multi-variable type inference failed */
    public n(View view) {
        super(view.getContext());
        this.f16193d = (CollapsibleActionView) view;
        addView(view);
    }

    @Override // m.a
    public final void onActionViewCollapsed() {
        this.f16193d.onActionViewCollapsed();
    }

    @Override // m.a
    public final void onActionViewExpanded() {
        this.f16193d.onActionViewExpanded();
    }
}

package androidx.fragment.app;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class w extends FragmentContainer {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ FragmentContainer f2264d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ DialogFragment f2265e;

    public w(DialogFragment dialogFragment, FragmentContainer fragmentContainer) {
        this.f2265e = dialogFragment;
        this.f2264d = fragmentContainer;
    }

    @Override // androidx.fragment.app.FragmentContainer
    public final View b(int i7) {
        FragmentContainer fragmentContainer = this.f2264d;
        return fragmentContainer.c() ? fragmentContainer.b(i7) : this.f2265e.onFindViewById(i7);
    }

    @Override // androidx.fragment.app.FragmentContainer
    public final boolean c() {
        return this.f2264d.c() || this.f2265e.onHasView();
    }
}

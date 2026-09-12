package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import androidx.activity.result.ActivityResultRegistry;
import androidx.arch.core.util.Function;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;

/* JADX INFO: loaded from: classes.dex */
public final class d0 implements Function, Observer {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2114d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2115e;

    public /* synthetic */ d0(int i7, Object obj) {
        this.f2114d = i7;
        this.f2115e = obj;
    }

    @Override // androidx.arch.core.util.Function
    public Object apply(Object obj) {
        switch (this.f2114d) {
            case 0:
                Fragment fragment = (Fragment) this.f2115e;
                Object obj2 = fragment.mHost;
                return obj2 instanceof f.g ? ((f.g) obj2).getActivityResultRegistry() : fragment.requireActivity().getActivityResultRegistry();
            default:
                return (ActivityResultRegistry) this.f2115e;
        }
    }

    @Override // androidx.lifecycle.Observer
    public void onChanged(Object obj) {
        LifecycleOwner lifecycleOwner = (LifecycleOwner) obj;
        DialogFragment dialogFragment = (DialogFragment) this.f2115e;
        if (lifecycleOwner == null || !dialogFragment.mShowsDialog) {
            return;
        }
        View viewRequireView = dialogFragment.requireView();
        if (viewRequireView.getParent() != null) {
            throw new IllegalStateException("DialogFragment can not be attached to a container view");
        }
        if (dialogFragment.mDialog != null) {
            if (FragmentManager.M(3)) {
                Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + dialogFragment.mDialog);
            }
            dialogFragment.mDialog.setContentView(viewRequireView);
        }
    }
}

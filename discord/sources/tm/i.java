package tm;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.events.EventDispatcher;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends Fragment {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f f20847d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b f20848e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f20849i;

    public i(f stackScreen) {
        Intrinsics.checkNotNullParameter(stackScreen, "stackScreen");
        this.f20847d = stackScreen;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f20848e = new b(this, this.f20847d);
        OnBackPressedDispatcher onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        b onBackPressedCallback = this.f20848e;
        if (onBackPressedCallback == null) {
            throw new IllegalStateException("[RNScreens] Attempt to require nullish OnBackPressedCallback");
        }
        onBackPressedDispatcher.getClass();
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
        onBackPressedDispatcher.b(onBackPressedCallback);
        setAllowEnterTransitionOverlap(true);
        setAllowReturnTransitionOverlap(true);
        setEnterTransition(new androidx.transition.b(5));
        setExitTransition(new androidx.transition.b(3));
        setReturnTransition(new androidx.transition.b(5));
        setReenterTransition(new androidx.transition.b(3));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return this.f20847d;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        f fVar = this.f20847d;
        if (fVar.getActivityMode() == d.f20835e) {
            fVar.setNativelyDismissed$react_native_screens_release(true);
        }
        h eventEmitter$react_native_screens_release = fVar.getEventEmitter$react_native_screens_release();
        ((EventDispatcher) eventEmitter$react_native_screens_release.f14232c).dispatchEvent(new um.b(UIManagerHelper.getSurfaceId((ReactContext) eventEmitter$react_native_screens_release.f14231b), eventEmitter$react_native_screens_release.f14230a, fVar.f20841i));
        b bVar = this.f20848e;
        if (bVar == null) {
            throw new IllegalStateException("[RNScreens] Attempt to require nullish OnBackPressedCallback");
        }
        bVar.remove();
        this.f20848e = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        f fVar = this.f20847d;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(viewLifecycleOwner, "viewLifecycleOwner");
        new d3.b(viewLifecycleOwner.getLifecycle(), fVar.getEventEmitter$react_native_screens_release());
    }
}

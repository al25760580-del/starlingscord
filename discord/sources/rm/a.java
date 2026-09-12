package rm;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.facebook.react.ReactRootView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    public static FragmentManager a(ViewGroup view) {
        boolean z5;
        boolean z6;
        Intrinsics.checkNotNullParameter(view, "view");
        ViewParent viewParent = view;
        while (true) {
            z5 = viewParent instanceof ReactRootView;
            if (z5 || (viewParent instanceof pm.a) || viewParent.getParent() == null) {
                break;
            }
            ViewParent parent = viewParent.getParent();
            Intrinsics.checkNotNullExpressionValue(parent, "getParent(...)");
            viewParent = parent;
        }
        if (viewParent instanceof pm.a) {
            Fragment associatedFragment = ((pm.a) viewParent).getAssociatedFragment();
            if (associatedFragment != null) {
                return associatedFragment.getChildFragmentManager();
            }
            throw new IllegalStateException(("[RNScreens] Parent fragment providing view " + viewParent + " returned nullish fragment").toString());
        }
        if (!z5) {
            throw new IllegalStateException("[RNScreens] Expected parent to be a ReactRootView, instead found: ".concat(viewParent.getClass().getName()).toString());
        }
        ReactRootView reactRootView = (ReactRootView) viewParent;
        Context context = reactRootView.getContext();
        while (true) {
            z6 = context instanceof FragmentActivity;
            if (z6 || !(context instanceof ContextWrapper)) {
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (!z6) {
            throw new IllegalStateException("[RNScreens] In order to use react-native-screens components your app's activity need to extend ReactActivity");
        }
        FragmentActivity fragmentActivity = (FragmentActivity) context;
        if (fragmentActivity.getSupportFragmentManager().f2043c.f().isEmpty()) {
            return fragmentActivity.getSupportFragmentManager();
        }
        try {
            return FragmentManager.C(reactRootView).getChildFragmentManager();
        } catch (IllegalStateException unused) {
            return fragmentActivity.getSupportFragmentManager();
        }
    }
}

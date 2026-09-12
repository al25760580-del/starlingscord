package vm;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.events.EventDispatcher;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class n extends Fragment {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k f21781d;

    public n(k tabsScreen) {
        Intrinsics.checkNotNullParameter(tabsScreen, "tabsScreen");
        this.f21781d = tabsScreen;
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration config) {
        Intrinsics.checkNotNullParameter(config, "newConfig");
        super.onConfigurationChanged(config);
        k tabsScreen = this.f21781d;
        tabsScreen.getClass();
        Intrinsics.checkNotNullParameter(this, "fragment");
        Intrinsics.checkNotNullParameter(config, "config");
        l lVar = (l) tabsScreen.f21775e.get();
        if (lVar != null) {
            Intrinsics.checkNotNullParameter(tabsScreen, "tabsScreen");
            Intrinsics.checkNotNullParameter(config, "config");
            ((e) lVar).onConfigurationChanged(config);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return this.f21781d;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        m eventEmitter$react_native_screens_release = this.f21781d.getEventEmitter$react_native_screens_release();
        int i7 = eventEmitter$react_native_screens_release.f14230a;
        ls.l.b(i7, "onWillDisappear");
        ((EventDispatcher) eventEmitter$react_native_screens_release.f14232c).dispatchEvent(new wm.b(UIManagerHelper.getSurfaceId((ReactContext) eventEmitter$react_native_screens_release.f14231b), i7, 3));
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        m eventEmitter$react_native_screens_release = this.f21781d.getEventEmitter$react_native_screens_release();
        int i7 = eventEmitter$react_native_screens_release.f14230a;
        ls.l.b(i7, "onDidAppear");
        ((EventDispatcher) eventEmitter$react_native_screens_release.f14232c).dispatchEvent(new wm.b(UIManagerHelper.getSurfaceId((ReactContext) eventEmitter$react_native_screens_release.f14231b), i7, 0));
        super.onResume();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        m eventEmitter$react_native_screens_release = this.f21781d.getEventEmitter$react_native_screens_release();
        int i7 = eventEmitter$react_native_screens_release.f14230a;
        ls.l.b(i7, "onWillAppear");
        ((EventDispatcher) eventEmitter$react_native_screens_release.f14232c).dispatchEvent(new wm.b(UIManagerHelper.getSurfaceId((ReactContext) eventEmitter$react_native_screens_release.f14231b), i7, 2));
        super.onStart();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        m eventEmitter$react_native_screens_release = this.f21781d.getEventEmitter$react_native_screens_release();
        int i7 = eventEmitter$react_native_screens_release.f14230a;
        ls.l.b(i7, "onDidDisappear");
        ((EventDispatcher) eventEmitter$react_native_screens_release.f14232c).dispatchEvent(new wm.b(UIManagerHelper.getSurfaceId((ReactContext) eventEmitter$react_native_screens_release.f14231b), i7, 1));
        super.onStop();
    }
}

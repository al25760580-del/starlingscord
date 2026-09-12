package tm;

import android.util.Log;
import androidx.activity.OnBackPressedCallback;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.n;
import androidx.lifecycle.t;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.events.EventDispatcher;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends OnBackPressedCallback implements t, c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f f20832d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f20833e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(i lifecycleOwner, f screen) {
        super(false);
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(screen, "screen");
        this.f20832d = screen;
        this.f20833e = false;
        lifecycleOwner.getLifecycle().a(this);
    }

    public final void a() {
        boolean z5 = false;
        if (this.f20833e) {
            f fVar = this.f20832d;
            if (((Boolean) fVar.f20840e.getValue(fVar, f.F[0])).booleanValue()) {
                z5 = true;
            }
        }
        setEnabled(z5);
    }

    @Override // androidx.lifecycle.t
    public final void c(LifecycleOwner source, n event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        int i7 = a.f20831a[event.ordinal()];
        f fVar = this.f20832d;
        if (i7 == 1) {
            fVar.setPreventNativeDismissChangeObserver$react_native_screens_release(this);
            return;
        }
        if (i7 == 2) {
            a();
            return;
        }
        if (i7 == 3) {
            setEnabled(false);
        } else {
            if (i7 != 4) {
                return;
            }
            source.getLifecycle().c(this);
            fVar.setPreventNativeDismissChangeObserver$react_native_screens_release(null);
        }
    }

    @Override // androidx.activity.OnBackPressedCallback
    public final void handleOnBackPressed() {
        f fVar = this.f20832d;
        Log.i("RNScreens", "PreventNativeDismissCallback called for screen " + fVar.getScreenKey());
        h eventEmitter$react_native_screens_release = fVar.getEventEmitter$react_native_screens_release();
        ((EventDispatcher) eventEmitter$react_native_screens_release.f14232c).dispatchEvent(new um.a(UIManagerHelper.getSurfaceId((ReactContext) eventEmitter$react_native_screens_release.f14231b), eventEmitter$react_native_screens_release.f14230a, 2));
    }
}

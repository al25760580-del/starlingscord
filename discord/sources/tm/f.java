package tm;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.facebook.react.uimanager.ThemedReactContext;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends ViewGroup implements pm.a {
    public static final /* synthetic */ KProperty[] F = {com.discord.chat.presentation.list.a.p(f.class, "isPreventNativeDismissEnabled", "isPreventNativeDismissEnabled$react_native_screens_release()Z", 0), com.discord.chat.presentation.list.a.p(f.class, "activityMode", "getActivityMode()Lcom/swmansion/rnscreens/gamma/stack/screen/StackScreen$ActivityMode;", 0)};
    public c E;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ThemedReactContext f20839d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e f20840e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f20841i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public WeakReference f20842v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final e f20843w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f20844x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public h f20845y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(ThemedReactContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.f20839d = reactContext;
        setTransitionGroup(true);
        this.f20840e = new e(this, 0);
        this.f20842v = new WeakReference(null);
        d dVar = d.f20834d;
        this.f20843w = new e(this, 1);
    }

    @NotNull
    public final d getActivityMode() {
        return (d) this.f20843w.getValue(this, F[1]);
    }

    @Override // pm.a
    public Fragment getAssociatedFragment() {
        Fragment fragmentC;
        Intrinsics.checkNotNullParameter(this, "<this>");
        try {
            fragmentC = FragmentManager.C(this);
        } catch (IllegalStateException unused) {
            fragmentC = null;
        }
        if (fragmentC == null) {
            return null;
        }
        if (fragmentC instanceof i) {
            return fragmentC;
        }
        throw new IllegalStateException("[RNScreens] Unexpected fragment type: ".concat(fragmentC.getClass().getSimpleName()).toString());
    }

    @NotNull
    public final h getEventEmitter$react_native_screens_release() {
        h hVar = this.f20845y;
        if (hVar != null) {
            return hVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventEmitter");
        return null;
    }

    public final c getPreventNativeDismissChangeObserver$react_native_screens_release() {
        return this.E;
    }

    public final String getScreenKey() {
        return this.f20844x;
    }

    @NotNull
    public final WeakReference<sm.j> getStackHost$react_native_screens_release() {
        return this.f20842v;
    }

    public final void setActivityMode(@NotNull d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<set-?>");
        this.f20843w.setValue(this, F[1], dVar);
    }

    public final void setEventEmitter$react_native_screens_release(@NotNull h hVar) {
        Intrinsics.checkNotNullParameter(hVar, "<set-?>");
        this.f20845y = hVar;
    }

    public final void setNativelyDismissed$react_native_screens_release(boolean z5) {
        if (!z5) {
            throw new IllegalArgumentException("[RNScreens] Natively dismissed StackScreen must remain dismissed.");
        }
        this.f20841i = true;
    }

    public final void setPreventNativeDismissChangeObserver$react_native_screens_release(c cVar) {
        this.E = cVar;
    }

    public final void setPreventNativeDismissEnabled$react_native_screens_release(boolean z5) {
        this.f20840e.setValue(this, F[0], Boolean.valueOf(z5));
    }

    public final void setScreenKey(String str) {
        if (this.f20844x != null) {
            throw new IllegalArgumentException("[RNScreens] StackScreen can't change its screenKey.");
        }
        this.f20844x = str;
    }

    public final void setStackHost$react_native_screens_release(@NotNull WeakReference<sm.j> weakReference) {
        Intrinsics.checkNotNullParameter(weakReference, "<set-?>");
        this.f20842v = weakReference;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i7, int i10, int i11, int i12) {
    }
}

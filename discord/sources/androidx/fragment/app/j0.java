package androidx.fragment.app;

import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.core.util.Consumer;
import androidx.core.view.MenuProvider;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelStore;
import androidx.savedstate.SavedStateRegistry;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public final class j0 extends FragmentHostCallback implements y0.f, y0.g, x0.c1, x0.d1, androidx.lifecycle.c1, e.t, f.g, d3.e, g1, androidx.core.view.k {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ FragmentActivity f2165w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(FragmentActivity fragmentActivity) {
        super(fragmentActivity);
        this.f2165w = fragmentActivity;
    }

    @Override // androidx.fragment.app.g1
    public final void a(Fragment fragment) {
        this.f2165w.onAttachFragment(fragment);
    }

    @Override // androidx.core.view.k
    public final void addMenuProvider(MenuProvider menuProvider) {
        this.f2165w.addMenuProvider(menuProvider);
    }

    @Override // y0.f
    public final void addOnConfigurationChangedListener(Consumer consumer) {
        this.f2165w.addOnConfigurationChangedListener(consumer);
    }

    @Override // x0.c1
    public final void addOnMultiWindowModeChangedListener(Consumer consumer) {
        this.f2165w.addOnMultiWindowModeChangedListener(consumer);
    }

    @Override // x0.d1
    public final void addOnPictureInPictureModeChangedListener(Consumer consumer) {
        this.f2165w.addOnPictureInPictureModeChangedListener(consumer);
    }

    @Override // y0.g
    public final void addOnTrimMemoryListener(Consumer consumer) {
        this.f2165w.addOnTrimMemoryListener(consumer);
    }

    @Override // androidx.fragment.app.FragmentHostCallback, androidx.fragment.app.FragmentContainer
    public final View b(int i7) {
        return this.f2165w.findViewById(i7);
    }

    @Override // androidx.fragment.app.FragmentHostCallback, androidx.fragment.app.FragmentContainer
    public final boolean c() {
        Window window = this.f2165w.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // androidx.fragment.app.FragmentHostCallback
    public final void d(PrintWriter printWriter, String[] strArr) {
        this.f2165w.dump("  ", null, printWriter, strArr);
    }

    @Override // androidx.fragment.app.FragmentHostCallback
    public final FragmentActivity e() {
        return this.f2165w;
    }

    @Override // androidx.fragment.app.FragmentHostCallback
    public final LayoutInflater f() {
        FragmentActivity fragmentActivity = this.f2165w;
        return fragmentActivity.getLayoutInflater().cloneInContext(fragmentActivity);
    }

    @Override // androidx.fragment.app.FragmentHostCallback
    public final boolean g(String str) {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 < 33 && TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return false;
        }
        FragmentActivity fragmentActivity = this.f2165w;
        if (i7 >= 32) {
            return fragmentActivity.shouldShowRequestPermissionRationale(str);
        }
        if (i7 != 31) {
            return fragmentActivity.shouldShowRequestPermissionRationale(str);
        }
        try {
            return ((Boolean) PackageManager.class.getMethod("shouldShowRequestPermissionRationale", String.class).invoke(fragmentActivity.getApplication().getPackageManager(), str)).booleanValue();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return fragmentActivity.shouldShowRequestPermissionRationale(str);
        }
    }

    @Override // f.g
    public final ActivityResultRegistry getActivityResultRegistry() {
        return this.f2165w.getActivityResultRegistry();
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.f2165w.mFragmentLifecycleRegistry;
    }

    @Override // e.t
    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return this.f2165w.getOnBackPressedDispatcher();
    }

    @Override // d3.e
    public final SavedStateRegistry getSavedStateRegistry() {
        return this.f2165w.getSavedStateRegistry();
    }

    @Override // androidx.lifecycle.c1
    public final ViewModelStore getViewModelStore() {
        return this.f2165w.getViewModelStore();
    }

    @Override // androidx.fragment.app.FragmentHostCallback
    public final void h() {
        this.f2165w.invalidateMenu();
    }

    @Override // androidx.core.view.k
    public final void removeMenuProvider(MenuProvider menuProvider) {
        this.f2165w.removeMenuProvider(menuProvider);
    }

    @Override // y0.f
    public final void removeOnConfigurationChangedListener(Consumer consumer) {
        this.f2165w.removeOnConfigurationChangedListener(consumer);
    }

    @Override // x0.c1
    public final void removeOnMultiWindowModeChangedListener(Consumer consumer) {
        this.f2165w.removeOnMultiWindowModeChangedListener(consumer);
    }

    @Override // x0.d1
    public final void removeOnPictureInPictureModeChangedListener(Consumer consumer) {
        this.f2165w.removeOnPictureInPictureModeChangedListener(consumer);
    }

    @Override // y0.g
    public final void removeOnTrimMemoryListener(Consumer consumer) {
        this.f2165w.removeOnTrimMemoryListener(consumer);
    }
}

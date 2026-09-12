package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.activity.contextaware.OnContextAvailableListener;
import androidx.annotation.NonNull;
import androidx.core.app.SharedElementCallback;
import androidx.core.util.Consumer;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleRegistry;
import androidx.loader.app.LoaderManager;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes.dex */
public class FragmentActivity extends ComponentActivity implements x0.a {
    static final String LIFECYCLE_TAG = "android:support:lifecycle";
    boolean mCreated;
    boolean mResumed;
    final FragmentController mFragments = new FragmentController(new j0(this));
    final LifecycleRegistry mFragmentLifecycleRegistry = new LifecycleRegistry(this);
    boolean mStopped = true;

    public FragmentActivity() {
        getSavedStateRegistry().c("android:support:lifecycle", new g0(0, this));
        final int i7 = 0;
        addOnConfigurationChangedListener(new Consumer(this) { // from class: androidx.fragment.app.h0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FragmentActivity f2152b;

            {
                this.f2152b = this;
            }

            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                switch (i7) {
                    case 0:
                        this.f2152b.mFragments.a();
                        break;
                    default:
                        this.f2152b.mFragments.a();
                        break;
                }
            }
        });
        final int i10 = 1;
        addOnNewIntentListener(new Consumer(this) { // from class: androidx.fragment.app.h0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FragmentActivity f2152b;

            {
                this.f2152b = this;
            }

            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                switch (i10) {
                    case 0:
                        this.f2152b.mFragments.a();
                        break;
                    default:
                        this.f2152b.mFragments.a();
                        break;
                }
            }
        });
        addOnContextAvailableListener(new OnContextAvailableListener() { // from class: androidx.fragment.app.i0
            @Override // androidx.activity.contextaware.OnContextAvailableListener
            public final void a(ComponentActivity componentActivity) {
                j0 j0Var = this.f2162a.mFragments.f2036a;
                j0Var.f2040v.b(j0Var, j0Var, null);
            }
        });
    }

    public static boolean d(FragmentManager fragmentManager) {
        Lifecycle.State state = Lifecycle.State.f2295d;
        boolean zD = false;
        for (Fragment fragment : fragmentManager.f2043c.f()) {
            if (fragment != null) {
                if (fragment.getHost() != null) {
                    zD |= d(fragment.getChildFragmentManager());
                }
                FragmentViewLifecycleOwner fragmentViewLifecycleOwner = fragment.mViewLifecycleOwner;
                if (fragmentViewLifecycleOwner != null) {
                    fragmentViewLifecycleOwner.b();
                    if (fragmentViewLifecycleOwner.f2083v.f2303d.a(Lifecycle.State.f2298v)) {
                        fragment.mViewLifecycleOwner.f2083v.h();
                        zD = true;
                    }
                }
                if (fragment.mLifecycleRegistry.f2303d.a(Lifecycle.State.f2298v)) {
                    fragment.mLifecycleRegistry.h();
                    zD = true;
                }
            }
        }
        return zD;
    }

    public final View dispatchFragmentsOnCreateView(View view, @NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        return this.mFragments.f2036a.f2040v.f2046f.onCreateView(view, str, context, attributeSet);
    }

    @Override // android.app.Activity
    public void dump(@NonNull String str, FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (shouldDumpInternalState(strArr)) {
            printWriter.print(str);
            printWriter.print("Local FragmentActivity ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(" State:");
            String str2 = str + "  ";
            printWriter.print(str2);
            printWriter.print("mCreated=");
            printWriter.print(this.mCreated);
            printWriter.print(" mResumed=");
            printWriter.print(this.mResumed);
            printWriter.print(" mStopped=");
            printWriter.print(this.mStopped);
            if (getApplication() != null) {
                LoaderManager.a(this).c(str2, printWriter);
            }
            this.mFragments.f2036a.f2040v.v(str, fileDescriptor, printWriter, strArr);
        }
    }

    @NonNull
    public FragmentManager getSupportFragmentManager() {
        return this.mFragments.f2036a.f2040v;
    }

    @NonNull
    @Deprecated
    public LoaderManager getSupportLoaderManager() {
        return LoaderManager.a(this);
    }

    public void markFragmentsCreated() {
        FragmentManager supportFragmentManager;
        do {
            supportFragmentManager = getSupportFragmentManager();
            Lifecycle.State state = Lifecycle.State.f2295d;
        } while (d(supportFragmentManager));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i7, int i10, Intent intent) {
        this.mFragments.a();
        super.onActivityResult(i7, i10, intent);
    }

    @Deprecated
    public void onAttachFragment(@NonNull Fragment fragment) {
    }

    @Override // androidx.activity.ComponentActivity, x0.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.f(androidx.lifecycle.n.ON_CREATE);
        c1 c1Var = this.mFragments.f2036a.f2040v;
        c1Var.H = false;
        c1Var.I = false;
        c1Var.O.f2140g = false;
        c1Var.u(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, @NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        View viewDispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return viewDispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : viewDispatchFragmentsOnCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.mFragments.f2036a.f2040v.l();
        this.mFragmentLifecycleRegistry.f(androidx.lifecycle.n.ON_DESTROY);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i7, MenuItem menuItem) {
        if (super.onMenuItemSelected(i7, menuItem)) {
            return true;
        }
        if (i7 == 6) {
            return this.mFragments.f2036a.f2040v.j(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.f2036a.f2040v.u(5);
        this.mFragmentLifecycleRegistry.f(androidx.lifecycle.n.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i7, @NonNull String[] strArr, @NonNull int[] iArr) {
        this.mFragments.a();
        super.onRequestPermissionsResult(i7, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        this.mFragments.a();
        super.onResume();
        this.mResumed = true;
        this.mFragments.f2036a.f2040v.z(true);
    }

    public void onResumeFragments() {
        this.mFragmentLifecycleRegistry.f(androidx.lifecycle.n.ON_RESUME);
        c1 c1Var = this.mFragments.f2036a.f2040v;
        c1Var.H = false;
        c1Var.I = false;
        c1Var.O.f2140g = false;
        c1Var.u(7);
    }

    @Override // android.app.Activity
    public void onStart() {
        this.mFragments.a();
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            c1 c1Var = this.mFragments.f2036a.f2040v;
            c1Var.H = false;
            c1Var.I = false;
            c1Var.O.f2140g = false;
            c1Var.u(4);
        }
        this.mFragments.f2036a.f2040v.z(true);
        this.mFragmentLifecycleRegistry.f(androidx.lifecycle.n.ON_START);
        c1 c1Var2 = this.mFragments.f2036a.f2040v;
        c1Var2.H = false;
        c1Var2.I = false;
        c1Var2.O.f2140g = false;
        c1Var2.u(5);
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.mFragments.a();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        c1 c1Var = this.mFragments.f2036a.f2040v;
        c1Var.I = true;
        c1Var.O.f2140g = true;
        c1Var.u(4);
        this.mFragmentLifecycleRegistry.f(androidx.lifecycle.n.ON_STOP);
    }

    public void setEnterSharedElementCallback(SharedElementCallback sharedElementCallback) {
        setEnterSharedElementCallback(sharedElementCallback != null ? new x0.b(sharedElementCallback) : null);
    }

    public void setExitSharedElementCallback(SharedElementCallback sharedElementCallback) {
        setExitSharedElementCallback(sharedElementCallback != null ? new x0.b(sharedElementCallback) : null);
    }

    public void startActivityFromFragment(@NonNull Fragment fragment, @NonNull Intent intent, int i7, Bundle bundle) {
        if (i7 == -1) {
            startActivityForResult(intent, -1, bundle);
        } else {
            fragment.startActivityForResult(intent, i7, bundle);
        }
    }

    @Deprecated
    public void startIntentSenderFromFragment(@NonNull Fragment fragment, @NonNull IntentSender intentSender, int i7, Intent intent, int i10, int i11, int i12, Bundle bundle) {
        if (i7 == -1) {
            startIntentSenderForResult(intentSender, i7, intent, i10, i11, i12, bundle);
        } else {
            fragment.startIntentSenderForResult(intentSender, i7, intent, i10, i11, i12, bundle);
        }
    }

    public void supportFinishAfterTransition() {
        finishAfterTransition();
    }

    public void supportPostponeEnterTransition() {
        postponeEnterTransition();
    }

    public void supportStartPostponedEnterTransition() {
        startPostponedEnterTransition();
    }

    @Override // x0.a
    @Deprecated
    public final void validateRequestPermissionsRequestCode(int i7) {
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(@NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        View viewDispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(null, str, context, attributeSet);
        return viewDispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : viewDispatchFragmentsOnCreateView;
    }

    public void startActivityFromFragment(@NonNull Fragment fragment, @NonNull Intent intent, int i7) {
        startActivityFromFragment(fragment, intent, i7, (Bundle) null);
    }
}

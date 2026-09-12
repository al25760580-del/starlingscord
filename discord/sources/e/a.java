package e;

import androidx.activity.ComponentActivity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7822d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ComponentActivity f7823e;

    public /* synthetic */ a(ComponentActivity componentActivity, int i7) {
        this.f7822d = i7;
        this.f7823e = componentActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.f7822d;
        ComponentActivity componentActivity = this.f7823e;
        switch (i7) {
            case 0:
                int i10 = ComponentActivity.f701d;
                componentActivity.invalidateMenu();
                return;
            default:
                try {
                    super/*android.app.Activity*/.onBackPressed();
                    return;
                } catch (IllegalStateException e10) {
                    if (!Intrinsics.areEqual(e10.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                        throw e10;
                    }
                    return;
                } catch (NullPointerException e11) {
                    if (!Intrinsics.areEqual(e11.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                        throw e11;
                    }
                    return;
                }
        }
    }
}

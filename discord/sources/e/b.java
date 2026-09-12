package e;

import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements androidx.lifecycle.t {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7824d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f7825e;

    public /* synthetic */ b(int i7, Object obj) {
        this.f7824d = i7;
        this.f7825e = obj;
    }

    @Override // androidx.lifecycle.t
    public final void c(LifecycleOwner lifecycleOwner, androidx.lifecycle.n event) {
        Window window;
        View viewPeekDecorView;
        int i7 = this.f7824d;
        Object obj = this.f7825e;
        switch (i7) {
            case 0:
                ComponentActivity componentActivity = (ComponentActivity) obj;
                int i10 = ComponentActivity.f701d;
                Intrinsics.checkNotNullParameter(lifecycleOwner, "<anonymous parameter 0>");
                Intrinsics.checkNotNullParameter(event, "event");
                if (event == androidx.lifecycle.n.ON_STOP && (window = componentActivity.getWindow()) != null && (viewPeekDecorView = window.peekDecorView()) != null) {
                    viewPeekDecorView.cancelPendingInputEvents();
                    break;
                }
                break;
            case 1:
                ComponentActivity.b((ComponentActivity) obj, lifecycleOwner, event);
                break;
            default:
                e3.a aVar = (e3.a) obj;
                Intrinsics.checkNotNullParameter(lifecycleOwner, "<unused var>");
                Intrinsics.checkNotNullParameter(event, "event");
                if (event == androidx.lifecycle.n.ON_START) {
                    aVar.f7961h = true;
                } else if (event == androidx.lifecycle.n.ON_STOP) {
                    aVar.f7961h = false;
                }
                break;
        }
    }
}

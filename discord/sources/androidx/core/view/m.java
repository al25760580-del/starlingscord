package androidx.core.view;

import android.window.OnBackInvokedDispatcher;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements androidx.lifecycle.t {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1698d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1699e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f1700i;

    public /* synthetic */ m(int i7, Object obj, Object obj2) {
        this.f1698d = i7;
        this.f1699e = obj;
        this.f1700i = obj2;
    }

    @Override // androidx.lifecycle.t
    public final void c(LifecycleOwner lifecycleOwner, androidx.lifecycle.n event) {
        int i7 = this.f1698d;
        Object obj = this.f1700i;
        Object obj2 = this.f1699e;
        switch (i7) {
            case 0:
                MenuHostHelper menuHostHelper = (MenuHostHelper) obj2;
                MenuProvider menuProvider = (MenuProvider) obj;
                menuHostHelper.getClass();
                if (event == androidx.lifecycle.n.ON_DESTROY) {
                    menuHostHelper.a(menuProvider);
                }
                break;
            default:
                OnBackPressedDispatcher onBackPressedDispatcher = (OnBackPressedDispatcher) obj2;
                ComponentActivity componentActivity = (ComponentActivity) obj;
                int i10 = ComponentActivity.f701d;
                Intrinsics.checkNotNullParameter(lifecycleOwner, "<anonymous parameter 0>");
                Intrinsics.checkNotNullParameter(event, "event");
                if (event == androidx.lifecycle.n.ON_CREATE) {
                    OnBackInvokedDispatcher invoker = e.e.b(componentActivity);
                    onBackPressedDispatcher.getClass();
                    Intrinsics.checkNotNullParameter(invoker, "invoker");
                    onBackPressedDispatcher.f713e = invoker;
                    onBackPressedDispatcher.e(onBackPressedDispatcher.f715g);
                }
                break;
        }
    }
}

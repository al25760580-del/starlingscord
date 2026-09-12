package e;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.lifecycle.u0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class h extends Lambda implements Function0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7832d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ComponentActivity f7833e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(ComponentActivity componentActivity, int i7) {
        super(0);
        this.f7832d = i7;
        this.f7833e = componentActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f7832d) {
            case 0:
                ComponentActivity componentActivity = this.f7833e;
                return new u0(componentActivity.getApplication(), componentActivity, componentActivity.getIntent() != null ? componentActivity.getIntent().getExtras() : null);
            case 1:
                this.f7833e.reportFullyDrawn();
                return Unit.f14616a;
            default:
                ComponentActivity componentActivity2 = this.f7833e;
                OnBackPressedDispatcher onBackPressedDispatcher = new OnBackPressedDispatcher(new a(componentActivity2, 1));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        componentActivity2.getLifecycle().a(new androidx.core.view.m(1, onBackPressedDispatcher, componentActivity2));
                    } else {
                        new Handler(Looper.getMainLooper()).post(new com.mkuczera.haptic.a(4, componentActivity2, onBackPressedDispatcher));
                    }
                }
                return onBackPressedDispatcher;
        }
    }
}

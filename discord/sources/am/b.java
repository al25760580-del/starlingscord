package am;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.f2;
import androidx.core.view.t;
import androidx.core.view.u0;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.views.safeareaview.ReactSafeAreaView;
import com.swmansion.rnscreens.e0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements t {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f639d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f640e;

    public /* synthetic */ b(int i7, Object obj) {
        this.f639d = i7;
        this.f640e = obj;
    }

    @Override // androidx.core.view.t
    public final WindowInsetsCompat a(View v6, WindowInsetsCompat insets) {
        switch (this.f639d) {
            case 0:
                e eVar = (e) this.f640e;
                Intrinsics.checkNotNullParameter(v6, "v");
                Intrinsics.checkNotNullParameter(insets, "insets");
                ThemedReactContext themedReactContext = eVar.f644d;
                ViewGroup viewGroupB = sl.c.b(themedReactContext);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                boolean z5 = (eVar.f648w || sl.c.d(themedReactContext) != 16 || eVar.f647v) ? false : true;
                f2 f2Var = insets.f1605a;
                Insets insetsF = f2Var.f(2);
                Intrinsics.checkNotNullExpressionValue(insetsF, "getInsets(...)");
                Insets insetsF2 = f2Var.f(519);
                Intrinsics.checkNotNullExpressionValue(insetsF2, "getInsets(...)");
                int iMax = !z5 ? 0 : f2Var.f(8).f1559d;
                int i7 = insetsF.f1556a;
                int i10 = eVar.f645e ? 0 : insetsF2.f1557b;
                int i11 = insetsF.f1558c;
                if (!eVar.f646i) {
                    iMax = Math.max(insetsF.f1559d, iMax);
                }
                layoutParams.setMargins(i7, i10, i11, iMax);
                if (viewGroupB != null) {
                    viewGroupB.setLayoutParams(layoutParams);
                }
                return u0.k(v6, insets);
            case 1:
                return ReactSafeAreaView.onAttachedToWindow$lambda$0((ReactSafeAreaView) this.f640e, v6, insets);
            case 2:
                mm.i iVar = (mm.i) this.f640e;
                Intrinsics.checkNotNullParameter(v6, "<unused var>");
                Intrinsics.checkNotNullParameter(insets, "windowInsets");
                Intrinsics.checkNotNullParameter(insets, "insets");
                iVar.f15911x = insets.f1605a.f(8).f1559d;
                if (!iVar.f15909v) {
                    iVar.h(0.0f);
                }
                return insets;
            default:
                e0 e0Var = (e0) this.f640e;
                Intrinsics.checkNotNullParameter(v6, "<unused var>");
                Intrinsics.checkNotNullParameter(insets, "windowInsets");
                e0Var.z(insets);
                return insets;
        }
    }
}

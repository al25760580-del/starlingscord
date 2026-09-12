package vm;

import android.util.TypedValue;
import androidx.appcompat.view.ContextThemeWrapper;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ContextThemeWrapper f21770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qg.e f21771b;

    public g(ContextThemeWrapper context, qg.e bottomNavigationView) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(bottomNavigationView, "bottomNavigationView");
        this.f21770a = context;
        this.f21771b = bottomNavigationView;
    }

    public final int a(int i7) {
        TypedValue typedValue = new TypedValue();
        this.f21770a.getTheme().resolveAttribute(i7, typedValue, true);
        return typedValue.data;
    }
}

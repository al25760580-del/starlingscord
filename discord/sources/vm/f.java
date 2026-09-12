package vm;

import android.os.Build;
import android.view.MenuItem;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qg.e f21768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f21769b;

    public f(qg.e bottomNavigationView, ArrayList tabsScreenFragments) {
        Intrinsics.checkNotNullParameter(bottomNavigationView, "bottomNavigationView");
        Intrinsics.checkNotNullParameter(tabsScreenFragments, "tabsScreenFragments");
        this.f21768a = bottomNavigationView;
        this.f21769b = tabsScreenFragments;
    }

    public final void a(MenuItem menuItem, k tabsScreen) {
        Intrinsics.checkNotNullParameter(menuItem, "menuItem");
        Intrinsics.checkNotNullParameter(tabsScreen, "tabsScreen");
        eh.e eVar = (eh.e) this.f21768a.findViewById(menuItem.getItemId());
        if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setContentDescription(tabsScreen.getTabBarItemAccessibilityLabel());
        }
        eVar.setTag(tabsScreen.getTabBarItemTestID());
    }
}

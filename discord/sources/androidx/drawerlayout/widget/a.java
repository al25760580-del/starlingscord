package androidx.drawerlayout.widget;

import android.view.View;
import androidx.core.view.accessibility.AccessibilityViewCommand;

/* JADX INFO: loaded from: classes.dex */
public final class a implements AccessibilityViewCommand {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ DrawerLayout f1978d;

    public a(DrawerLayout drawerLayout) {
        this.f1978d = drawerLayout;
    }

    @Override // androidx.core.view.accessibility.AccessibilityViewCommand
    public final boolean c(View view, AccessibilityViewCommand.CommandArguments commandArguments) {
        DrawerLayout drawerLayout = this.f1978d;
        if (!drawerLayout.isDrawerOpen(view) || drawerLayout.getDrawerLockMode(view) == 2) {
            return false;
        }
        drawerLayout.closeDrawer(view);
        return true;
    }
}

package rg;

import android.view.View;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements AccessibilityViewCommand {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f19416d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ BottomSheetBehavior f19417e;

    public a(BottomSheetBehavior bottomSheetBehavior, int i7) {
        this.f19417e = bottomSheetBehavior;
        this.f19416d = i7;
    }

    @Override // androidx.core.view.accessibility.AccessibilityViewCommand
    public final boolean c(View view, AccessibilityViewCommand.CommandArguments commandArguments) {
        this.f19417e.G(this.f19416d);
        return true;
    }
}

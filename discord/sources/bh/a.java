package bh;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.discord.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.NavigationMenuItemView;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends androidx.core.view.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3235b;

    public /* synthetic */ a(int i7, Object obj) {
        this.f3234a = i7;
        this.f3235b = obj;
    }

    @Override // androidx.core.view.b
    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f3234a) {
            case 0:
                super.onInitializeAccessibilityEvent(view, accessibilityEvent);
                accessibilityEvent.setChecked(((CheckableImageButton) this.f3235b).f6404v);
                break;
            default:
                super.onInitializeAccessibilityEvent(view, accessibilityEvent);
                break;
        }
    }

    @Override // androidx.core.view.b
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        int i7 = this.f3234a;
        Object obj = this.f3235b;
        switch (i7) {
            case 0:
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                CheckableImageButton checkableImageButton = (CheckableImageButton) obj;
                accessibilityNodeInfoCompat.n(checkableImageButton.f6405w);
                accessibilityNodeInfoCompat.f1613a.setChecked(checkableImageButton.f6404v);
                break;
            case 1:
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.n(((NavigationMenuItemView) obj).U);
                break;
            case 2:
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                com.google.android.material.datepicker.m mVar = (com.google.android.material.datepicker.m) obj;
                accessibilityNodeInfoCompat.b(new androidx.core.view.accessibility.a(16, mVar.I.getVisibility() == 0 ? mVar.getString(R.string.mtrl_picker_toggle_to_year_selection) : mVar.getString(R.string.mtrl_picker_toggle_to_day_selection)));
                break;
            default:
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) obj;
                int i10 = MaterialButtonToggleGroup.N;
                int i11 = -1;
                if (view instanceof MaterialButton) {
                    int i12 = 0;
                    for (int i13 = 0; i13 < materialButtonToggleGroup.getChildCount(); i13++) {
                        if (materialButtonToggleGroup.getChildAt(i13) == view) {
                            i11 = i12;
                        } else {
                            if ((materialButtonToggleGroup.getChildAt(i13) instanceof MaterialButton) && materialButtonToggleGroup.getChildAt(i13).getVisibility() != 8) {
                                i12++;
                            }
                        }
                    }
                }
                accessibilityNodeInfoCompat.r(g.a.a(0, 1, i11, 1, ((MaterialButton) view).L));
                break;
        }
    }
}

package wg;

import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.discord.R;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends androidx.customview.widget.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Chip f22229a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Chip chip, Chip chip2) {
        super(chip2);
        this.f22229a = chip;
    }

    @Override // androidx.customview.widget.a
    public final int getVirtualViewAt(float f2, float f7) {
        Rect rect = Chip.T;
        Chip chip = this.f22229a;
        return (chip.d() && chip.getCloseIconTouchBounds().contains(f2, f7)) ? 1 : 0;
    }

    @Override // androidx.customview.widget.a
    public final void getVisibleVirtualViews(List list) {
        e eVar;
        ArrayList arrayList = (ArrayList) list;
        arrayList.add(0);
        Rect rect = Chip.T;
        Chip chip = this.f22229a;
        if (!chip.d() || (eVar = chip.f6320w) == null || !eVar.f22255r0 || chip.E == null) {
            return;
        }
        arrayList.add(1);
    }

    @Override // androidx.customview.widget.a
    public final boolean onPerformActionForVirtualView(int i7, int i10, Bundle bundle) {
        boolean z5 = false;
        if (i10 == 16) {
            Chip chip = this.f22229a;
            if (i7 == 0) {
                return chip.performClick();
            }
            if (i7 == 1) {
                chip.playSoundEffect(0);
                View.OnClickListener onClickListener = chip.E;
                if (onClickListener != null) {
                    onClickListener.onClick(chip);
                    z5 = true;
                }
                if (chip.P) {
                    chip.O.sendEventForVirtualView(1, 1);
                }
            }
        }
        return z5;
    }

    @Override // androidx.customview.widget.a
    public final void onPopulateNodeForHost(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        Chip chip = this.f22229a;
        e eVar = chip.f6320w;
        accessibilityNodeInfoCompat.n(eVar != null && eVar.f22261x0);
        accessibilityNodeInfoCompat.p(chip.isClickable());
        accessibilityNodeInfoCompat.o(chip.getAccessibilityClassName());
        accessibilityNodeInfoCompat.A(chip.getText());
    }

    @Override // androidx.customview.widget.a
    public final void onPopulateNodeForVirtualView(int i7, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        if (i7 != 1) {
            accessibilityNodeInfoCompat.s("");
            accessibilityNodeInfoCompat.m(Chip.T);
            return;
        }
        Chip chip = this.f22229a;
        CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
        if (closeIconContentDescription != null) {
            accessibilityNodeInfoCompat.s(closeIconContentDescription);
        } else {
            CharSequence text = chip.getText();
            accessibilityNodeInfoCompat.s(chip.getContext().getString(R.string.mtrl_chip_close_icon_content_description, TextUtils.isEmpty(text) ? "" : text).trim());
        }
        accessibilityNodeInfoCompat.m(chip.getCloseIconTouchBoundsInt());
        accessibilityNodeInfoCompat.b(androidx.core.view.accessibility.a.f1618g);
        accessibilityNodeInfoCompat.f1613a.setEnabled(chip.isEnabled());
        accessibilityNodeInfoCompat.o(Button.class.getName());
    }

    @Override // androidx.customview.widget.a
    public final void onVirtualViewKeyboardFocusChanged(int i7, boolean z5) {
        Chip chip = this.f22229a;
        if (i7 == 1) {
            chip.J = z5;
        }
        e eVar = chip.f6320w;
        boolean z6 = chip.J;
        boolean zW = false;
        if (eVar.f22256s0 != null) {
            zW = eVar.W(z6 ? new int[]{android.R.attr.state_pressed, android.R.attr.state_enabled} : e.f22230m1);
        }
        if (zW) {
            chip.refreshDrawableState();
        }
    }
}

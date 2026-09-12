package l1;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeProviderCompat;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class d extends AccessibilityNodeProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AccessibilityNodeProviderCompat f14816a;

    public d(AccessibilityNodeProviderCompat accessibilityNodeProviderCompat) {
        this.f14816a = accessibilityNodeProviderCompat;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i7) {
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompatA = this.f14816a.a(i7);
        if (accessibilityNodeInfoCompatA == null) {
            return null;
        }
        return accessibilityNodeInfoCompatA.f1613a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List findAccessibilityNodeInfosByText(String str, int i7) {
        this.f14816a.getClass();
        return null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i7) {
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompatB = this.f14816a.b(i7);
        if (accessibilityNodeInfoCompatB == null) {
            return null;
        }
        return accessibilityNodeInfoCompatB.f1613a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i7, int i10, Bundle bundle) {
        return this.f14816a.c(i7, i10, bundle);
    }
}

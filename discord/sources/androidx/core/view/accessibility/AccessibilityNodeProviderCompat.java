package androidx.core.view.accessibility;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeProvider;

/* JADX INFO: loaded from: classes.dex */
public class AccessibilityNodeProviderCompat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AccessibilityNodeProvider f1615a;

    public AccessibilityNodeProviderCompat() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f1615a = new l1.e(this);
        } else {
            this.f1615a = new l1.d(this);
        }
    }

    public AccessibilityNodeInfoCompat a(int i7) {
        return null;
    }

    public AccessibilityNodeInfoCompat b(int i7) {
        return null;
    }

    public boolean c(int i7, int i10, Bundle bundle) {
        return false;
    }

    public AccessibilityNodeProviderCompat(AccessibilityNodeProvider accessibilityNodeProvider) {
        this.f1615a = accessibilityNodeProvider;
    }
}

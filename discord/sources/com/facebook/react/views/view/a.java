package com.facebook.react.views.view;

import android.view.accessibility.AccessibilityManager;
import com.discord.device.DeviceAccessibilityModule;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements AccessibilityManager.AccessibilityStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5362b;

    public /* synthetic */ a(int i7, Object obj) {
        this.f5361a = i7;
        this.f5362b = obj;
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z5) {
        switch (this.f5361a) {
            case 0:
                ReactViewGroup.addChildrenForAccessibility$lambda$3((ReactViewGroup) this.f5362b, z5);
                break;
            default:
                ((DeviceAccessibilityModule) this.f5362b).emitOnAccessibilityServiceEnabledChanged(z5);
                break;
        }
    }
}

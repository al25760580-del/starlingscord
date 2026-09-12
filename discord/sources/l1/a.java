package l1;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

/* JADX INFO: loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f14811d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AccessibilityNodeInfoCompat f14812e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f14813i;

    public a(int i7, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, int i10) {
        this.f14811d = i7;
        this.f14812e = accessibilityNodeInfoCompat;
        this.f14813i = i10;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f14811d);
        this.f14812e.f1613a.performAction(this.f14813i, bundle);
    }
}

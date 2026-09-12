package g;

import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f9429a;

    public /* synthetic */ a(Object obj) {
        this.f9429a = obj;
    }

    public static a a(int i7, int i10, int i11, int i12, boolean z5) {
        return new a(AccessibilityNodeInfo.CollectionItemInfo.obtain(i7, i10, i11, i12, false, z5));
    }
}

package f3;

import android.content.ComponentName;
import androidx.core.content.pm.ShortcutInfoCompat;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Comparable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ShortcutInfoCompat f8792d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ComponentName f8793e;

    public a(ShortcutInfoCompat shortcutInfoCompat, ComponentName componentName) {
        this.f8792d = shortcutInfoCompat;
        this.f8793e = componentName;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f8792d.f1553m - ((a) obj).f8792d.f1553m;
    }
}

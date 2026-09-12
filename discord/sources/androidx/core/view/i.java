package androidx.core.view;

import android.view.DisplayCutout;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DisplayCutout f1670a;

    public i(DisplayCutout displayCutout) {
        this.f1670a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f1670a, ((i) obj).f1670a);
    }

    public final int hashCode() {
        DisplayCutout displayCutout = this.f1670a;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f1670a + "}";
    }
}

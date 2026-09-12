package androidx.core.view;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class a2 extends z1 {
    public a2(WindowInsetsCompat windowInsetsCompat, WindowInsets windowInsets) {
        super(windowInsetsCompat, windowInsets);
    }

    @Override // androidx.core.view.f2
    public WindowInsetsCompat a() {
        return WindowInsetsCompat.g(null, this.f1749c.consumeDisplayCutout());
    }

    @Override // androidx.core.view.f2
    public i e() {
        DisplayCutout displayCutout = this.f1749c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new i(displayCutout);
    }

    @Override // androidx.core.view.y1, androidx.core.view.f2
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a2)) {
            return false;
        }
        a2 a2Var = (a2) obj;
        return Objects.equals(this.f1749c, a2Var.f1749c) && Objects.equals(this.f1753g, a2Var.f1753g) && y1.B(this.f1754h, a2Var.f1754h);
    }

    @Override // androidx.core.view.f2
    public int hashCode() {
        return this.f1749c.hashCode();
    }
}

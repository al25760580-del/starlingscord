package androidx.core.view;

import android.view.WindowInsetsAnimation;
import androidx.core.graphics.Insets;

/* JADX INFO: loaded from: classes.dex */
public final class f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Insets f1659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Insets f1660b;

    public f1(Insets insets, Insets insets2) {
        this.f1659a = insets;
        this.f1660b = insets2;
    }

    public final String toString() {
        return "Bounds{lower=" + this.f1659a + " upper=" + this.f1660b + "}";
    }

    public f1(WindowInsetsAnimation.Bounds bounds) {
        this.f1659a = n1.f(bounds);
        this.f1660b = n1.e(bounds);
    }
}

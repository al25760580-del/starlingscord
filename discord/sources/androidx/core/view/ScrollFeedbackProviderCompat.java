package androidx.core.view;

import android.os.Build;
import androidx.core.widget.NestedScrollView;

/* JADX INFO: loaded from: classes.dex */
public final class ScrollFeedbackProviderCompat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f1603a;

    public ScrollFeedbackProviderCompat(NestedScrollView nestedScrollView) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f1603a = new x(nestedScrollView);
        } else {
            this.f1603a = new i8.b(2);
        }
    }
}

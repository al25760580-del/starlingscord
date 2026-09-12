package androidx.metrics.performance;

import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import com.discord.R;
import e4.i;
import kotlin.jvm.internal.Intrinsics;
import x2.e;
import x2.f;
import x2.g;
import x2.h;

/* JADX INFO: loaded from: classes.dex */
public final class JankStats {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OnFrameListener f2428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f2429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f2430c;

    public interface OnFrameListener {
        void a(FrameData frameData);
    }

    public JankStats(Window window, OnFrameListener onFrameListener) {
        this.f2428a = onFrameListener;
        View view = window.peekDecorView();
        if (view == null) {
            throw new IllegalStateException("window.peekDecorView() is null: JankStats can only be created with a Window that has a non-null DecorView");
        }
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewParent parent = view.getParent();
        View view2 = view;
        while (parent instanceof View) {
            view2 = parent;
            parent = view2.getParent();
        }
        Object tag = view2.getTag(R.id.metricsStateHolder);
        if (tag == null) {
            tag = new h();
            view2.setTag(R.id.metricsStateHolder, tag);
        }
        h hVar = (h) tag;
        if (hVar.f22606a == null) {
            hVar.f22606a = new i(18);
        }
        int i7 = Build.VERSION.SDK_INT;
        e gVar = i7 >= 31 ? new g(this, view, window) : i7 >= 26 ? new f(this, view, window) : new e(this, view, window);
        this.f2429b = gVar;
        gVar.r(true);
        this.f2430c = 2.0f;
    }
}

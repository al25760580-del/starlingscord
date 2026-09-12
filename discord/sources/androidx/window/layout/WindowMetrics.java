package androidx.window.layout;

import android.graphics.Rect;
import kotlin.jvm.internal.Intrinsics;
import s3.a;

/* JADX INFO: loaded from: classes.dex */
public final class WindowMetrics {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f2806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f2807b;

    public WindowMetrics(a _bounds, float f2) {
        Intrinsics.checkNotNullParameter(_bounds, "_bounds");
        this.f2806a = _bounds;
        this.f2807b = f2;
    }

    public final Rect a() {
        a aVar = this.f2806a;
        aVar.getClass();
        return new Rect(aVar.f19712a, aVar.f19713b, aVar.f19714c, aVar.f19715d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(WindowMetrics.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.window.layout.WindowMetrics");
        WindowMetrics windowMetrics = (WindowMetrics) obj;
        return Intrinsics.areEqual(this.f2806a, windowMetrics.f2806a) && this.f2807b == windowMetrics.f2807b;
    }

    public final int hashCode() {
        return Float.hashCode(this.f2807b) + (this.f2806a.hashCode() * 31);
    }

    public final String toString() {
        return "WindowMetrics(_bounds=" + this.f2806a + ", density=" + this.f2807b + ')';
    }
}

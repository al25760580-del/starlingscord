package androidx.fragment.app;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import java.io.PrintWriter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class FragmentHostCallback extends FragmentContainer {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final FragmentActivity f2037d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final FragmentActivity f2038e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Handler f2039i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final c1 f2040v;

    public FragmentHostCallback(FragmentActivity context) {
        Intrinsics.checkNotNullParameter(context, "activity");
        Handler handler = new Handler();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f2037d = context;
        this.f2038e = context;
        this.f2039i = handler;
        this.f2040v = new c1();
    }

    @Override // androidx.fragment.app.FragmentContainer
    public View b(int i7) {
        return null;
    }

    @Override // androidx.fragment.app.FragmentContainer
    public boolean c() {
        return true;
    }

    public void d(PrintWriter writer, String[] strArr) {
        Intrinsics.checkNotNullParameter("  ", "prefix");
        Intrinsics.checkNotNullParameter(writer, "writer");
    }

    public abstract FragmentActivity e();

    public LayoutInflater f() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f2038e);
        Intrinsics.checkNotNullExpressionValue(layoutInflaterFrom, "from(context)");
        return layoutInflaterFrom;
    }

    public boolean g(String permission) {
        Intrinsics.checkNotNullParameter(permission, "permission");
        return false;
    }

    public void h() {
    }
}

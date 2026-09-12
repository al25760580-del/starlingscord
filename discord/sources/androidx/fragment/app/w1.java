package androidx.fragment.app;

import android.view.ViewGroup;
import androidx.activity.BackEventCompat;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f2266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f2267b;

    public boolean a() {
        return this instanceof i;
    }

    public abstract void b(ViewGroup viewGroup);

    public abstract void c(ViewGroup viewGroup);

    public void d(BackEventCompat backEvent, ViewGroup container) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
        Intrinsics.checkNotNullParameter(container, "container");
    }

    public void e(ViewGroup container) {
        Intrinsics.checkNotNullParameter(container, "container");
    }
}

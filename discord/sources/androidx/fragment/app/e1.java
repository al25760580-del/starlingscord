package androidx.fragment.app;

import androidx.lifecycle.ViewModelProvider$Factory;

/* JADX INFO: loaded from: classes.dex */
public final class e1 implements ViewModelProvider$Factory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2132a;

    @Override // androidx.lifecycle.ViewModelProvider$Factory
    public final androidx.lifecycle.y0 a(Class cls) {
        switch (this.f2132a) {
            case 0:
                return new f1(true);
            default:
                return new v2.b();
        }
    }
}

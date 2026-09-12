package v2;

import a5.i0;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import ue.d;

/* JADX INFO: loaded from: classes.dex */
public final class a extends MutableLiveData {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final d f21368l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Object f21369m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public i0 f21370n;

    public a(d dVar) {
        this.f21368l = dVar;
        if (dVar.f21103a != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        dVar.f21103a = this;
    }

    @Override // androidx.lifecycle.LiveData
    public final void e() {
        d dVar = this.f21368l;
        dVar.f21104b = true;
        dVar.f21106d = false;
        dVar.f21105c = false;
        dVar.f21111i.drainPermits();
        dVar.c();
    }

    @Override // androidx.lifecycle.LiveData
    public final void f() {
        this.f21368l.f21104b = false;
    }

    @Override // androidx.lifecycle.LiveData
    public final void g(Observer observer) {
        super.g(observer);
        this.f21369m = null;
        this.f21370n = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.lifecycle.LifecycleOwner, java.lang.Object] */
    public final void j() {
        ?? r5 = this.f21369m;
        i0 i0Var = this.f21370n;
        if (r5 == 0 || i0Var == null) {
            return;
        }
        super.g(i0Var);
        d(r5, i0Var);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append("LoaderInfo{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" #0 : ");
        Class<?> cls = this.f21368l.getClass();
        sb2.append(cls.getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(cls)));
        sb2.append("}}");
        return sb2.toString();
    }
}

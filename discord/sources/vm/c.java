package vm;

import android.view.Menu;
import kotlin.collections.d0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f21750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f21751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f21752c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e f21753d;

    public c(e eVar) {
        this.f21753d = eVar;
    }

    public final void a() {
        this.f21751b = true;
        this.f21752c = true;
    }

    public final void b() {
        if (this.f21750a) {
            return;
        }
        this.f21750a = true;
        this.f21753d.post(new sm.f(6, this));
    }

    public final void c() {
        int i7 = 0;
        this.f21750a = false;
        boolean z5 = this.f21751b;
        e eVar = this.f21753d;
        if (z5) {
            this.f21751b = false;
            e.d(eVar);
        }
        if (this.f21752c) {
            this.f21752c = false;
            e.b(eVar);
            f fVar = eVar.K;
            for (Object obj : fVar.f21769b) {
                int i10 = i7 + 1;
                if (i7 < 0) {
                    d0.k();
                    throw null;
                }
                Menu menu = fVar.f21768a.getMenu();
                Intrinsics.checkNotNullExpressionValue(menu, "getMenu(...)");
                fVar.a(menu.getItem(i7), ((n) obj).f21781d);
                i7 = i10;
            }
        }
    }
}

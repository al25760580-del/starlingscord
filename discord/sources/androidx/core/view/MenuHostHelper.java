package androidx.core.view;

import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class MenuHostHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f1593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f1594b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f1595c = new HashMap();

    public MenuHostHelper(Runnable runnable) {
        this.f1593a = runnable;
    }

    public final void a(MenuProvider menuProvider) {
        this.f1594b.remove(menuProvider);
        n nVar = (n) this.f1595c.remove(menuProvider);
        if (nVar != null) {
            nVar.f1705a.c(nVar.f1706b);
            nVar.f1706b = null;
        }
        this.f1593a.run();
    }
}

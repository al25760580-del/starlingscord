package androidx.core.app;

import i.h;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class TaskStackBuilder implements Iterable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f1539d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h f1540e;

    public TaskStackBuilder(h hVar) {
        this.f1540e = hVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f1539d.iterator();
    }
}

package androidx.lifecycle;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class ViewModelStore {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f2325a = new LinkedHashMap();

    public final void a() {
        LinkedHashMap linkedHashMap = this.f2325a;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((y0) it.next()).a();
        }
        linkedHashMap.clear();
    }
}

package io.sentry.featureflags;

import io.sentry.protocol.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import s0.g;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile CopyOnWriteArrayList f12678d;

    @Override // io.sentry.featureflags.b
    public final h h() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f12678d.iterator();
        if (it.hasNext()) {
            throw g.a(it);
        }
        return new h(arrayList);
    }

    @Override // io.sentry.featureflags.b
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public final b m1258clone() {
        a aVar = new a();
        new io.sentry.util.a();
        aVar.f12678d = new CopyOnWriteArrayList(this.f12678d);
        return aVar;
    }
}

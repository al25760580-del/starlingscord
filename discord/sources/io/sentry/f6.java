package io.sentry;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class f6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f12677a;

    public f6() {
        this.f12677a = new ArrayList();
    }

    public void a(Path path) {
        ArrayList arrayList = this.f12677a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            n4.t tVar = (n4.t) arrayList.get(size);
            hs.c cVar = x4.h.f22636a;
            if (tVar != null && !tVar.f16487a) {
                x4.h.a(path, tVar.f16490d.k() / 100.0f, tVar.f16491e.k() / 100.0f, tVar.f16492f.k() / 360.0f);
            }
        }
    }

    public f6(List list) {
        this.f12677a = new ArrayList(list == null ? new ArrayList(0) : list);
    }
}

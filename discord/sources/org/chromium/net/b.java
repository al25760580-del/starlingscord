package org.chromium.net;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        c cVar = (c) obj;
        c cVar2 = (c) obj2;
        if (CronetProvider.PROVIDER_NAME_FALLBACK.equals(cVar.f17647a.getName())) {
            return 1;
        }
        if (CronetProvider.PROVIDER_NAME_FALLBACK.equals(cVar2.f17647a.getName())) {
            return -1;
        }
        return -CronetEngine.Builder.compareVersions(cVar.f17647a.getVersion(), cVar2.f17647a.getVersion());
    }
}

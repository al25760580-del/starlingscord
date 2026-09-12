package io.sentry;

import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public final class g4 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((Breadcrumb) obj).b().compareTo(((Breadcrumb) obj2).b());
    }
}

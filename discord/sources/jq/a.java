package jq;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes3.dex */
public class a implements wo.h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f14012e = {kk.b.p(a.class, "annotations", "getAnnotations()Ljava/util/List;", 0)};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final kq.i f14013d;

    public a(kq.o storageManager, Function0 compute) {
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(compute, "compute");
        kq.l lVar = (kq.l) storageManager;
        lVar.getClass();
        this.f14013d = new kq.i(lVar, compute);
    }

    @Override // wo.h
    public final boolean P(up.c cVar) {
        return android.support.v4.media.session.b.o(this, cVar);
    }

    @Override // wo.h
    public boolean isEmpty() {
        return ((List) io.sentry.config.a.H(this.f14013d, f14012e[0])).isEmpty();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return ((List) io.sentry.config.a.H(this.f14013d, f14012e[0])).iterator();
    }

    @Override // wo.h
    public final wo.b z(up.c cVar) {
        return android.support.v4.media.session.b.h(this, cVar);
    }
}

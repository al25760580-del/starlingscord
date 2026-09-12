package uo;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.d0;
import kotlin.collections.p0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vo.e0;
import vo.h0;
import yo.z;

/* JADX INFO: loaded from: classes3.dex */
public final class q implements h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kq.l f21245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z f21246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public hq.j f21247c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final kq.j f21248d;

    public q(kq.l storageManager, ue.i finder, z moduleDescriptor) {
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(finder, "finder");
        Intrinsics.checkNotNullParameter(moduleDescriptor, "moduleDescriptor");
        this.f21245a = storageManager;
        this.f21246b = moduleDescriptor;
        this.f21248d = storageManager.d(new bp.i(6, this));
    }

    @Override // vo.h0
    public final boolean a(up.c fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        kq.j jVar = this.f21248d;
        Object obj = jVar.f14781e.get(fqName);
        return ((obj == null || obj == kq.k.f14784e) ? d(fqName) : (e0) jVar.invoke(fqName)) == null;
    }

    @Override // vo.h0
    public final void b(up.c fqName, ArrayList packageFragments) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(packageFragments, "packageFragments");
        vq.m.b(packageFragments, this.f21248d.invoke(fqName));
    }

    @Override // vo.h0
    public final List c(up.c fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        return d0.h(this.f21248d.invoke(fqName));
    }

    public final iq.c d(up.c packageFqName) {
        InputStream inputStreamA;
        Intrinsics.checkNotNullParameter(packageFqName, "fqName");
        Intrinsics.checkNotNullParameter(packageFqName, "packageFqName");
        if (packageFqName.c(so.p.k)) {
            iq.a.f13401m.getClass();
            inputStreamA = iq.d.a(iq.a.a(packageFqName));
        } else {
            inputStreamA = null;
        }
        if (inputStreamA != null) {
            return ls.l.m(packageFqName, this.f21245a, this.f21246b, inputStreamA);
        }
        return null;
    }

    @Override // vo.h0
    public final Collection k(up.c fqName, Function1 nameFilter) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        return p0.f14661d;
    }
}

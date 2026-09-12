package cq;

import e4.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.i0;
import kotlin.collections.n0;
import kotlin.jvm.internal.Intrinsics;
import vo.f;
import yo.h0;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f7330b;

    public a(n0 inner) {
        Intrinsics.checkNotNullParameter(inner, "inner");
        this.f7330b = inner;
    }

    public final void a(f thisDescriptor, ArrayList result, i c8) {
        Intrinsics.checkNotNullParameter(thisDescriptor, "thisDescriptor");
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(c8, "c");
        Iterator it = this.f7330b.iterator();
        while (it.hasNext()) {
            ((a) ((e) it.next())).a(thisDescriptor, result, c8);
        }
    }

    public final void b(f thisDescriptor, up.e name, ArrayList result, i c8) {
        Intrinsics.checkNotNullParameter(thisDescriptor, "thisDescriptor");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(c8, "c");
        Iterator it = this.f7330b.iterator();
        while (it.hasNext()) {
            ((a) ((e) it.next())).b(thisDescriptor, name, result, c8);
        }
    }

    public final void c(f thisDescriptor, up.e name, sn.e result, i c8) {
        Intrinsics.checkNotNullParameter(thisDescriptor, "thisDescriptor");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(c8, "c");
        Iterator it = this.f7330b.iterator();
        while (it.hasNext()) {
            ((a) ((e) it.next())).c(thisDescriptor, name, result, c8);
        }
    }

    public final void d(f thisDescriptor, up.e name, ArrayList result, i c8) {
        Intrinsics.checkNotNullParameter(thisDescriptor, "thisDescriptor");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(c8, "c");
        Iterator it = this.f7330b.iterator();
        while (it.hasNext()) {
            ((a) ((e) it.next())).d(thisDescriptor, name, result, c8);
        }
    }

    public final ArrayList e(f thisDescriptor, i c8) {
        Intrinsics.checkNotNullParameter(thisDescriptor, "thisDescriptor");
        Intrinsics.checkNotNullParameter(c8, "c");
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f7330b.iterator();
        while (it.hasNext()) {
            i0.o(arrayList, ((a) ((e) it.next())).e(thisDescriptor, c8));
        }
        return arrayList;
    }

    public final ArrayList f(f thisDescriptor, i c8) {
        Intrinsics.checkNotNullParameter(thisDescriptor, "thisDescriptor");
        Intrinsics.checkNotNullParameter(c8, "c");
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f7330b.iterator();
        while (it.hasNext()) {
            i0.o(arrayList, ((a) ((e) it.next())).f(thisDescriptor, c8));
        }
        return arrayList;
    }

    public final ArrayList g(f thisDescriptor, i c8) {
        Intrinsics.checkNotNullParameter(thisDescriptor, "thisDescriptor");
        Intrinsics.checkNotNullParameter(c8, "c");
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f7330b.iterator();
        while (it.hasNext()) {
            i0.o(arrayList, ((a) ((e) it.next())).g(thisDescriptor, c8));
        }
        return arrayList;
    }

    public final h0 h(f thisDescriptor, h0 propertyDescriptor, i c8) {
        Intrinsics.checkNotNullParameter(thisDescriptor, "thisDescriptor");
        Intrinsics.checkNotNullParameter(propertyDescriptor, "propertyDescriptor");
        Intrinsics.checkNotNullParameter(c8, "c");
        Iterator it = this.f7330b.iterator();
        while (it.hasNext()) {
            propertyDescriptor = ((a) ((e) it.next())).h(thisDescriptor, propertyDescriptor, c8);
        }
        return propertyDescriptor;
    }
}

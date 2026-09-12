package androidx.datastore.preferences.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class a0 extends c0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Class f1817c = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    public static List d(int i7, long j, Object obj) {
        List list = (List) n1.f1911d.i(j, obj);
        if (list.isEmpty()) {
            List yVar = list instanceof z ? new y(i7) : new ArrayList(i7);
            n1.o(j, obj, yVar);
            return yVar;
        }
        if (f1817c.isAssignableFrom(list.getClass())) {
            ArrayList arrayList = new ArrayList(list.size() + i7);
            arrayList.addAll(list);
            n1.o(j, obj, arrayList);
            return arrayList;
        }
        if (!(list instanceof i1)) {
            return list;
        }
        y yVar2 = new y(list.size() + i7);
        yVar2.addAll((i1) list);
        n1.o(j, obj, yVar2);
        return yVar2;
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public final void a(long j, Object obj) {
        Object objUnmodifiableList;
        List list = (List) n1.f1911d.i(j, obj);
        if (list instanceof z) {
            objUnmodifiableList = ((z) list).f();
        } else if (f1817c.isAssignableFrom(list.getClass())) {
            return;
        } else {
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        n1.o(j, obj, objUnmodifiableList);
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public final void b(long j, Object obj, Object obj2) {
        List list = (List) n1.f1911d.i(j, obj2);
        List listD = d(list.size(), j, obj);
        int size = listD.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            listD.addAll(list);
        }
        if (size > 0) {
            list = listD;
        }
        n1.o(j, obj, list);
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public final List c(long j, Object obj) {
        return d(10, j, obj);
    }
}

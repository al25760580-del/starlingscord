package hj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class y extends a0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Class f10918c = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    public static List d(int i7, long j, Object obj) {
        List list = (List) c1.f10811c.i(j, obj);
        if (list.isEmpty()) {
            List wVar = list instanceof x ? new w(i7) : new ArrayList(i7);
            c1.o(j, obj, wVar);
            return wVar;
        }
        if (f10918c.isAssignableFrom(list.getClass())) {
            ArrayList arrayList = new ArrayList(list.size() + i7);
            arrayList.addAll(list);
            c1.o(j, obj, arrayList);
            return arrayList;
        }
        if (!(list instanceof x0)) {
            return list;
        }
        w wVar2 = new w(list.size() + i7);
        wVar2.addAll((x0) list);
        c1.o(j, obj, wVar2);
        return wVar2;
    }

    @Override // hj.a0
    public final void a(long j, Object obj) {
        Object objUnmodifiableList;
        List list = (List) c1.f10811c.i(j, obj);
        if (list instanceof x) {
            objUnmodifiableList = ((x) list).f();
        } else if (f10918c.isAssignableFrom(list.getClass())) {
            return;
        } else {
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        c1.o(j, obj, objUnmodifiableList);
    }

    @Override // hj.a0
    public final void b(long j, Object obj, Object obj2) {
        List list = (List) c1.f10811c.i(j, obj2);
        List listD = d(list.size(), j, obj);
        int size = listD.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            listD.addAll(list);
        }
        if (size > 0) {
            list = listD;
        }
        c1.o(j, obj, list);
    }

    @Override // hj.a0
    public final List c(long j, Object obj) {
        return d(10, j, obj);
    }
}

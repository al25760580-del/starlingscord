package a4;

import e4.o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.d0;
import kotlin.jvm.internal.Intrinsics;
import v3.q;

/* JADX INFO: loaded from: classes.dex */
public final class i implements vd.f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f132d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f133e;

    public i(List list) {
        this.f133e = list;
    }

    public boolean a(o workSpec) {
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.f133e) {
            b4.e eVar = (b4.e) obj;
            eVar.getClass();
            Intrinsics.checkNotNullParameter(workSpec, "workSpec");
            if (eVar.b(workSpec) && eVar.c(eVar.f3067a.a())) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            q.d().a(l.f142a, "Work " + workSpec.f7998a + " constrained by " + CollectionsKt.O(arrayList, null, null, null, f.f126d, 31));
        }
        return arrayList.isEmpty();
    }

    @Override // vd.f
    public int f(long j) {
        switch (this.f132d) {
            case 1:
                return j < 0 ? 0 : -1;
            default:
                return -1;
        }
    }

    @Override // vd.f
    public long h(int i7) {
        switch (this.f132d) {
            case 1:
                je.b.g(i7 == 0);
                break;
        }
        return 0L;
    }

    @Override // vd.f
    public List l(long j) {
        switch (this.f132d) {
            case 1:
                return j >= 0 ? this.f133e : Collections.EMPTY_LIST;
            default:
                return this.f133e;
        }
    }

    @Override // vd.f
    public int o() {
        switch (this.f132d) {
        }
        return 1;
    }

    public i(ArrayList arrayList) {
        this.f133e = Collections.unmodifiableList(arrayList);
    }

    public i(c4.l trackers) {
        Intrinsics.checkNotNullParameter(trackers, "trackers");
        b4.a aVar = new b4.a(trackers.f3465a);
        b4.a aVar2 = new b4.a(trackers.f3466b, (byte) 0);
        b4.a aVar3 = new b4.a(trackers.f3468d, (char) 0);
        c4.i iVar = trackers.f3467c;
        List controllers = d0.g(aVar, aVar2, aVar3, new b4.a(iVar, 2), new b4.a(iVar, 3), new b4.g(iVar), new b4.f(iVar));
        Intrinsics.checkNotNullParameter(controllers, "controllers");
        this.f133e = controllers;
    }
}

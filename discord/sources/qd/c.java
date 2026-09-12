package qd;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import je.e0;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements ld.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f18715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f18716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f18717c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f18718d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f18719e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f18720f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f18721g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f18722h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final io.sentry.internal.debugmeta.c f18723i;
    public final t j;
    public final Uri k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final i f18724l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List f18725m;

    public c(long j, long j5, long j7, boolean z5, long j10, long j11, long j12, long j13, i iVar, io.sentry.internal.debugmeta.c cVar, t tVar, Uri uri, ArrayList arrayList) {
        this.f18715a = j;
        this.f18716b = j5;
        this.f18717c = j7;
        this.f18718d = z5;
        this.f18719e = j10;
        this.f18720f = j11;
        this.f18721g = j12;
        this.f18722h = j13;
        this.f18724l = iVar;
        this.f18723i = cVar;
        this.k = uri;
        this.j = tVar;
        this.f18725m = arrayList;
    }

    @Override // ld.a
    public final Object a(List list) {
        long j;
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new ld.b(-1, -1, -1));
        ArrayList arrayList = new ArrayList();
        long j5 = 0;
        int i7 = 0;
        while (true) {
            if (i7 >= this.f18725m.size()) {
                break;
            }
            if (((ld.b) linkedList.peek()).f15018d != i7) {
                long jC = c(i7);
                if (jC != -9223372036854775807L) {
                    j5 += jC;
                }
            } else {
                h hVarB = b(i7);
                List list2 = hVarB.f18748c;
                ld.b bVar = (ld.b) linkedList.poll();
                int i10 = bVar.f15018d;
                ArrayList arrayList2 = new ArrayList();
                while (true) {
                    int i11 = bVar.f15019e;
                    a aVar = (a) list2.get(i11);
                    List list3 = aVar.f18707c;
                    ArrayList arrayList3 = new ArrayList();
                    do {
                        arrayList3.add((m) list3.get(bVar.f15020i));
                        bVar = (ld.b) linkedList.poll();
                        if (bVar.f15018d != i10) {
                            break;
                        }
                    } while (bVar.f15019e == i11);
                    j = j5;
                    arrayList2.add(new a(aVar.f18705a, aVar.f18706b, arrayList3, aVar.f18708d, aVar.f18709e, aVar.f18710f));
                    if (bVar.f15018d != i10) {
                        break;
                    }
                    j5 = j;
                }
                linkedList.addFirst(bVar);
                arrayList.add(new h(hVarB.f18746a, hVarB.f18747b - j, arrayList2, hVarB.f18749d));
                j5 = j;
            }
            i7++;
        }
        long j7 = j5;
        long j10 = this.f18716b;
        return new c(this.f18715a, j10 != -9223372036854775807L ? j10 - j7 : -9223372036854775807L, this.f18717c, this.f18718d, this.f18719e, this.f18720f, this.f18721g, this.f18722h, this.f18724l, this.f18723i, this.j, this.k, arrayList);
    }

    public final h b(int i7) {
        return (h) this.f18725m.get(i7);
    }

    public final long c(int i7) {
        long j;
        long j5;
        List list = this.f18725m;
        if (i7 == list.size() - 1) {
            j = this.f18716b;
            if (j == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            j5 = ((h) list.get(i7)).f18747b;
        } else {
            j = ((h) list.get(i7 + 1)).f18747b;
            j5 = ((h) list.get(i7)).f18747b;
        }
        return j - j5;
    }

    public final long d(int i7) {
        return e0.I(c(i7));
    }
}

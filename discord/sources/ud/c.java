package ud;

import com.google.android.exoplayer2.Format;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements ld.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f21058b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f21059c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f21060d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f21061e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b[] f21062f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f21063g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f21064h;

    public c(int i7, int i10, long j, long j5, int i11, boolean z5, a aVar, b[] bVarArr) {
        this.f21057a = i7;
        this.f21058b = i10;
        this.f21063g = j;
        this.f21064h = j5;
        this.f21059c = i11;
        this.f21060d = z5;
        this.f21061e = aVar;
        this.f21062f = bVarArr;
    }

    @Override // ld.a
    public final Object a(List list) {
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        b bVar = null;
        int i7 = 0;
        while (i7 < arrayList.size()) {
            ld.b bVar2 = (ld.b) arrayList.get(i7);
            b bVar3 = this.f21062f[bVar2.f15019e];
            if (bVar3 != bVar && bVar != null) {
                arrayList2.add(bVar.a((Format[]) arrayList3.toArray(new Format[0])));
                arrayList3.clear();
            }
            arrayList3.add(bVar3.j[bVar2.f15020i]);
            i7++;
            bVar = bVar3;
        }
        if (bVar != null) {
            arrayList2.add(bVar.a((Format[]) arrayList3.toArray(new Format[0])));
        }
        return new c(this.f21057a, this.f21058b, this.f21063g, this.f21064h, this.f21059c, this.f21060d, this.f21061e, (b[]) arrayList2.toArray(new b[0]));
    }
}

package xc;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends lc.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f22741i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ArrayList f22742v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ArrayList f22743w;

    public a(int i7, long j) {
        super(i7, 1);
        this.f22741i = j;
        this.f22742v = new ArrayList();
        this.f22743w = new ArrayList();
    }

    public final a e(int i7) {
        ArrayList arrayList = this.f22743w;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            a aVar = (a) arrayList.get(i10);
            if (aVar.f14999e == i7) {
                return aVar;
            }
        }
        return null;
    }

    public final b g(int i7) {
        ArrayList arrayList = this.f22742v;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = (b) arrayList.get(i10);
            if (bVar.f14999e == i7) {
                return bVar;
            }
        }
        return null;
    }

    @Override // lc.a
    public final String toString() {
        return lc.a.b(this.f14999e) + " leaves: " + Arrays.toString(this.f22742v.toArray()) + " containers: " + Arrays.toString(this.f22743w.toArray());
    }
}

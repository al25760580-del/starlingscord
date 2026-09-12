package pa;

import android.util.SparseIntArray;
import androidx.datastore.preferences.protobuf.d1;

/* JADX INFO: loaded from: classes3.dex */
public abstract class p extends b {
    public final int[] G;

    public p(q8.b bVar, v vVar, w wVar) {
        super(bVar, vVar, wVar);
        SparseIntArray sparseIntArray = vVar.f17848c;
        sparseIntArray.getClass();
        this.G = new int[sparseIntArray.size()];
        int i7 = 0;
        while (true) {
            int[] iArr = this.G;
            if (i7 >= iArr.length) {
                this.f17797e.getClass();
                this.F.getClass();
                return;
            } else {
                iArr[i7] = sparseIntArray.keyAt(i7);
                i7++;
            }
        }
    }

    @Override // pa.b
    public final void c(Object obj) {
        o oVar = (o) obj;
        oVar.getClass();
        oVar.close();
    }

    @Override // pa.b
    public final int e(int i7) {
        if (i7 <= 0) {
            throw new d1(Integer.valueOf(i7));
        }
        for (int i10 : this.G) {
            if (i10 >= i7) {
                return i10;
            }
        }
        return i7;
    }

    @Override // pa.b
    public final int f(Object obj) {
        o oVar = (o) obj;
        oVar.getClass();
        return oVar.u();
    }

    @Override // pa.b
    public final boolean j(Object obj) {
        o oVar = (o) obj;
        oVar.getClass();
        return !oVar.isClosed();
    }

    @Override // pa.b
    public final int g(int i7) {
        return i7;
    }
}

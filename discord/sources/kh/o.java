package kh;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class o extends u {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f14511c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Matrix f14512d;

    public o(ArrayList arrayList, Matrix matrix) {
        this.f14511c = arrayList;
        this.f14512d = matrix;
    }

    @Override // kh.u
    public final void a(Matrix matrix, jh.a aVar, int i7, Canvas canvas) {
        Iterator it = this.f14511c.iterator();
        while (it.hasNext()) {
            ((u) it.next()).a(this.f14512d, aVar, i7, canvas);
        }
    }
}

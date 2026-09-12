package pa;

import java.util.LinkedList;

/* JADX INFO: loaded from: classes3.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedList f17813c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f17814d;

    public f(int i7, int i10, int i11) {
        n8.i.e(i7 > 0);
        n8.i.e(i10 >= 0);
        n8.i.e(i11 >= 0);
        this.f17811a = i7;
        this.f17812b = i10;
        this.f17813c = new LinkedList();
        this.f17814d = i11;
    }

    public Object a() {
        return this.f17813c.poll();
    }
}

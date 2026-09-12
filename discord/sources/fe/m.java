package fe;

import com.google.android.exoplayer2.Format;
import md.x0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f9105d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final x0 f9106e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f9107i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Format f9108v;

    public m(int i7, x0 x0Var, int i10) {
        this.f9105d = i7;
        this.f9106e = x0Var;
        this.f9107i = i10;
        this.f9108v = x0Var.f15730v[i10];
    }

    public abstract int a();

    public abstract boolean b(m mVar);
}

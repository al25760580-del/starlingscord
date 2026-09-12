package fe;

import md.x0;

/* JADX INFO: loaded from: classes3.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x0 f9112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f9113b;

    public o(int i7, x0 x0Var, int[] iArr) {
        if (iArr.length == 0) {
            je.b.s("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.f9112a = x0Var;
        this.f9113b = iArr;
    }
}

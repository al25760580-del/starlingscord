package jo;

import java.util.Random;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a extends d {
    @Override // jo.d
    public final int a(int i7) {
        return ((-i7) >> 31) & (d().nextInt() >>> (32 - i7));
    }

    @Override // jo.d
    public final int b() {
        return d().nextInt();
    }

    public abstract Random d();
}

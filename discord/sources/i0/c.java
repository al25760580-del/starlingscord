package i0;

import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class c extends z.e implements g0, j {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public z.d f11285i;
    public HashSet j;

    @Override // z.e
    public final void a() {
        if (!this.f23581h) {
            throw new IllegalStateException("Check failed.");
        }
        if ((this.f23575b & 8) == 0) {
            return;
        }
        k.c(this);
        throw null;
    }

    public final String toString() {
        return this.f11285i.toString();
    }
}

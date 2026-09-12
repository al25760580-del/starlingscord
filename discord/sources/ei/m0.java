package ei;

import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class m0 implements di.j, Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f8332d;

    public m0() {
        p.c(2, "expectedValuesPerKey");
        this.f8332d = 2;
    }

    @Override // di.j
    public final Object get() {
        return new ArrayList(this.f8332d);
    }
}

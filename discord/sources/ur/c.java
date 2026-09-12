package ur;

import java.util.Iterator;
import vp.a0;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements Iterable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f21308d;

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f21308d) {
            case 0:
                return d.f21310b.iterator();
            case 1:
                return e.f21313c.iterator();
            case 2:
                return b.f21305a.iterator();
            case 3:
                return d.f21309a.iterator();
            case 4:
                return b.f21307c.iterator();
            case 5:
                return b.f21306b.iterator();
            case 6:
                return e.f21312b.iterator();
            case 7:
                return e.f21311a.iterator();
            default:
                return a0.f21859a;
        }
    }
}

package o4;

import kh.v;
import l4.g0;

/* JADX INFO: loaded from: classes.dex */
public final class g extends e4.c {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ e4.c f17129v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(e4.c cVar) {
        super(24);
        this.f17129v = cVar;
    }

    @Override // e4.c
    public final Object J(v vVar) {
        Float f2 = (Float) ((g0) this.f17129v.f7967i);
        if (f2 == null) {
            return null;
        }
        return Float.valueOf(f2.floatValue() * 2.55f);
    }
}

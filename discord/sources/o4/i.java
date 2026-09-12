package o4;

/* JADX INFO: loaded from: classes.dex */
public final class i extends k {
    @Override // o4.e
    public final Object f(y4.a aVar, float f2) {
        return Float.valueOf(l(aVar, f2));
    }

    public final float k() {
        return l(this.f17122c.f(), c());
    }

    public final float l(y4.a aVar, float f2) {
        float f7;
        Object obj = aVar.f23194b;
        Object obj2 = aVar.f23194b;
        if (obj == null || aVar.f23195c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        e4.c cVar = this.f17124e;
        if (cVar != null) {
            f7 = f2;
            Float f10 = (Float) cVar.K(aVar.f23199g, aVar.f23200h.floatValue(), (Float) obj2, (Float) aVar.f23195c, f7, d(), this.f17123d);
            if (f10 != null) {
                return f10.floatValue();
            }
        } else {
            f7 = f2;
        }
        if (aVar.f23201i == -3987645.8f) {
            aVar.f23201i = ((Float) obj2).floatValue();
        }
        float f11 = aVar.f23201i;
        if (aVar.j == -3987645.8f) {
            aVar.j = ((Float) aVar.f23195c).floatValue();
        }
        return x4.g.e(f11, aVar.j, f7);
    }
}

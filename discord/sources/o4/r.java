package o4;

import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class r extends e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f17169i;

    public r(e4.c cVar, Object obj) {
        super(Collections.EMPTY_LIST);
        j(cVar);
        this.f17169i = obj;
    }

    @Override // o4.e
    public final float b() {
        return 1.0f;
    }

    @Override // o4.e
    public final Object e() {
        e4.c cVar = this.f17124e;
        Object obj = this.f17169i;
        float f2 = this.f17123d;
        return cVar.K(0.0f, 0.0f, obj, obj, f2, f2, f2);
    }

    @Override // o4.e
    public final Object f(y4.a aVar, float f2) {
        return e();
    }

    @Override // o4.e
    public final void h() {
        if (this.f17124e != null) {
            super.h();
        }
    }

    @Override // o4.e
    public final void i(float f2) {
        this.f17123d = f2;
    }
}

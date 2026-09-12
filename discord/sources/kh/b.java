package kh;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f14459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f14460b;

    public b(float f2, d dVar) {
        while (dVar instanceof b) {
            dVar = ((b) dVar).f14459a;
            f2 += ((b) dVar).f14460b;
        }
        this.f14459a = dVar;
        this.f14460b = f2;
    }

    @Override // kh.d
    public final float a(RectF rectF) {
        return Math.max(0.0f, this.f14459a.a(rectF) + this.f14460b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f14459a.equals(bVar.f14459a) && this.f14460b == bVar.f14460b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f14459a, Float.valueOf(this.f14460b)});
    }
}

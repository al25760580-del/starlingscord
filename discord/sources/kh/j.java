package kh;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f14489a;

    public j(float f2) {
        this.f14489a = f2;
    }

    @Override // kh.d
    public final float a(RectF rectF) {
        return Math.min(rectF.width(), rectF.height()) * this.f14489a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && this.f14489a == ((j) obj).f14489a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f14489a)});
    }

    public final String toString() {
        return kk.b.l(new StringBuilder(), (int) (this.f14489a * 100.0f), "%");
    }
}

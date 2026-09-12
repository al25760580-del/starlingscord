package kh;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f14454a;

    public a(float f2) {
        this.f14454a = f2;
    }

    @Override // kh.d
    public final float a(RectF rectF) {
        return this.f14454a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f14454a == ((a) obj).f14454a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f14454a)});
    }

    public final String toString() {
        return this.f14454a + "px";
    }
}

package com.otaliastudios.zoom;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class AbsolutePoint {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f7012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f7013b;

    public /* synthetic */ AbsolutePoint() {
        this(0.0f, 0.0f);
    }

    public final AbsolutePoint a(AbsolutePoint absolutePoint) {
        Intrinsics.checkNotNullParameter(absolutePoint, "absolutePoint");
        return new AbsolutePoint(this.f7012a + absolutePoint.f7012a, this.f7013b + absolutePoint.f7013b);
    }

    public final void b(AbsolutePoint p3) {
        Intrinsics.checkNotNullParameter(p3, "p");
        c(Float.valueOf(p3.f7012a), Float.valueOf(p3.f7013b));
    }

    public final void c(Float x5, Float y5) {
        Intrinsics.checkNotNullParameter(x5, "x");
        Intrinsics.checkNotNullParameter(y5, "y");
        this.f7012a = x5.floatValue();
        this.f7013b = y5.floatValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbsolutePoint)) {
            return false;
        }
        AbsolutePoint absolutePoint = (AbsolutePoint) obj;
        return Intrinsics.areEqual((Object) Float.valueOf(this.f7012a), (Object) Float.valueOf(absolutePoint.f7012a)) && Intrinsics.areEqual((Object) Float.valueOf(this.f7013b), (Object) Float.valueOf(absolutePoint.f7013b));
    }

    public final int hashCode() {
        return Float.hashCode(this.f7013b) + (Float.hashCode(this.f7012a) * 31);
    }

    public final String toString() {
        return "AbsolutePoint(x=" + this.f7012a + ", y=" + this.f7013b + ')';
    }

    public AbsolutePoint(float f2, float f7) {
        this.f7012a = f2;
        this.f7013b = f7;
    }
}

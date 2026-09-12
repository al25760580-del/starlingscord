package com.otaliastudios.zoom;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ScaledPoint {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f7016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f7017b;

    public /* synthetic */ ScaledPoint() {
        this(0.0f, 0.0f);
    }

    public static AbsolutePoint b(ScaledPoint scaledPoint, float f2) {
        AbsolutePoint outPoint = new AbsolutePoint();
        scaledPoint.getClass();
        Intrinsics.checkNotNullParameter(outPoint, "outPoint");
        outPoint.c(Float.valueOf(scaledPoint.f7016a / f2), Float.valueOf(scaledPoint.f7017b / f2));
        return outPoint;
    }

    public final void a(Float x5, Float y5) {
        Intrinsics.checkNotNullParameter(x5, "x");
        Intrinsics.checkNotNullParameter(y5, "y");
        this.f7016a = x5.floatValue();
        this.f7017b = y5.floatValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScaledPoint)) {
            return false;
        }
        ScaledPoint scaledPoint = (ScaledPoint) obj;
        return Intrinsics.areEqual((Object) Float.valueOf(this.f7016a), (Object) Float.valueOf(scaledPoint.f7016a)) && Intrinsics.areEqual((Object) Float.valueOf(this.f7017b), (Object) Float.valueOf(scaledPoint.f7017b));
    }

    public final int hashCode() {
        return Float.hashCode(this.f7017b) + (Float.hashCode(this.f7016a) * 31);
    }

    public final String toString() {
        return "ScaledPoint(x=" + this.f7016a + ", y=" + this.f7017b + ')';
    }

    public ScaledPoint(float f2, float f7) {
        this.f7016a = f2;
        this.f7017b = f7;
    }
}

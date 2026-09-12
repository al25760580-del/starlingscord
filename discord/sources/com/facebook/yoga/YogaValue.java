package com.facebook.yoga;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class YogaValue {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final YogaValue f5487c = new YogaValue(Float.NaN, YogaUnit.UNDEFINED);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final YogaValue f5488d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f5489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final YogaUnit f5490b;

    static {
        new YogaValue(0.0f, YogaUnit.POINT);
        f5488d = new YogaValue(Float.NaN, YogaUnit.AUTO);
    }

    public YogaValue(float f2, YogaUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        this.f5489a = f2;
        this.f5490b = unit;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof YogaValue) {
            YogaValue yogaValue = (YogaValue) obj;
            YogaUnit yogaUnit = yogaValue.f5490b;
            YogaUnit yogaUnit2 = this.f5490b;
            if (yogaUnit2 == yogaUnit) {
                return yogaUnit2 == YogaUnit.UNDEFINED || yogaUnit2 == YogaUnit.AUTO || Float.compare(this.f5489a, yogaValue.f5489a) == 0;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f5489a) + this.f5490b.f5486d;
    }

    public final String toString() {
        int iOrdinal = this.f5490b.ordinal();
        if (iOrdinal == 0) {
            return "undefined";
        }
        float f2 = this.f5489a;
        if (iOrdinal == 1) {
            return String.valueOf(f2);
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return "auto";
            }
            throw new IllegalStateException();
        }
        return f2 + "%";
    }
}

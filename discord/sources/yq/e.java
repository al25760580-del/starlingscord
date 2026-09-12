package yq;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public class e {
    public static final double a(double d6, d sourceUnit, d targetUnit) {
        Intrinsics.checkNotNullParameter(sourceUnit, "sourceUnit");
        Intrinsics.checkNotNullParameter(targetUnit, "targetUnit");
        long jConvert = targetUnit.f23513d.convert(1L, sourceUnit.f23513d);
        return jConvert > 0 ? d6 * jConvert : d6 / sourceUnit.f23513d.convert(1L, targetUnit.f23513d);
    }

    public static final long b(long j, d sourceUnit, d targetUnit) {
        Intrinsics.checkNotNullParameter(sourceUnit, "sourceUnit");
        Intrinsics.checkNotNullParameter(targetUnit, "targetUnit");
        return targetUnit.f23513d.convert(j, sourceUnit.f23513d);
    }

    public static final long c(long j, d sourceUnit, d targetUnit) {
        Intrinsics.checkNotNullParameter(sourceUnit, "sourceUnit");
        Intrinsics.checkNotNullParameter(targetUnit, "targetUnit");
        return targetUnit.f23513d.convert(j, sourceUnit.f23513d);
    }
}

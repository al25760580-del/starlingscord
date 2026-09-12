package cn;

import android.animation.FloatEvaluator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends FloatEvaluator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kotlin.collections.a f3747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f6.a f3748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Number f3749c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Number f3750d;

    public a(kotlin.collections.a startValueProvider, f6.a endValueProvider) {
        Intrinsics.checkNotNullParameter(startValueProvider, "startValueProvider");
        Intrinsics.checkNotNullParameter(endValueProvider, "endValueProvider");
        this.f3747a = startValueProvider;
        this.f3748b = endValueProvider;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.animation.TypeEvaluator
    public final Float evaluate(float f2, Number number, Number number2) {
        if (this.f3749c == null) {
            this.f3749c = (Number) this.f3747a.invoke(number);
        }
        Number number3 = this.f3749c;
        if (this.f3750d == null) {
            this.f3748b.invoke(number2);
            this.f3750d = Float.valueOf(0.0f);
        }
        Number number4 = this.f3750d;
        if (number3 == null || number4 == null) {
            return null;
        }
        return super.evaluate(f2, number3, number4);
    }
}

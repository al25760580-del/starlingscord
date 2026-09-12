package or;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final class i0 extends g1 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f17559m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(String name, f0 generatedSerializer) {
        super(name, generatedSerializer, 1);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(generatedSerializer, "generatedSerializer");
        this.f17559m = true;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // or.g1
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i0) {
            SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
            if (Intrinsics.areEqual(this.f17542a, serialDescriptor.d())) {
                i0 i0Var = (i0) obj;
                if (i0Var.f17559m && Arrays.equals((SerialDescriptor[]) this.k.getValue(), (SerialDescriptor[]) i0Var.k.getValue())) {
                    int iG = serialDescriptor.g();
                    int i7 = this.f17544c;
                    if (i7 == iG) {
                        for (int i10 = 0; i10 < i7; i10++) {
                            if (Intrinsics.areEqual(j(i10).d(), serialDescriptor.j(i10).d()) && Intrinsics.areEqual(j(i10).c(), serialDescriptor.j(i10).c())) {
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // or.g1
    public final int hashCode() {
        return super.hashCode() * 31;
    }

    @Override // or.g1, kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isInline() {
        return this.f17559m;
    }
}

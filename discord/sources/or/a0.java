package or;

import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final class a0 extends g1 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final mr.i f17500m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final rn.u f17501n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(final String name, final int i7) {
        super(name, null, i7);
        Intrinsics.checkNotNullParameter(name, "name");
        this.f17500m = mr.i.f16076b;
        this.f17501n = rn.l.b(new Function0() { // from class: or.z
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i10 = i7;
                SerialDescriptor[] serialDescriptorArr = new SerialDescriptor[i10];
                for (int i11 = 0; i11 < i10; i11++) {
                    serialDescriptorArr[i11] = m3.m.g(name + '.' + this.f17546e[i11], mr.j.f16080e, new SerialDescriptor[0], new f6.a(17));
                }
                return serialDescriptorArr;
            }
        });
    }

    @Override // or.g1, kotlinx.serialization.descriptors.SerialDescriptor
    public final ls.d c() {
        return this.f17500m;
    }

    @Override // or.g1
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof SerialDescriptor)) {
            return false;
        }
        SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
        return serialDescriptor.c() == mr.i.f16076b && Intrinsics.areEqual(this.f17542a, serialDescriptor.d()) && Intrinsics.areEqual(e1.b(this), e1.b(serialDescriptor));
    }

    @Override // or.g1
    public final int hashCode() {
        int iHashCode = this.f17542a.hashCode();
        Intrinsics.checkNotNullParameter(this, "<this>");
        kotlin.collections.e eVar = new kotlin.collections.e(this);
        int iHashCode2 = 1;
        while (eVar.hasNext()) {
            int i7 = iHashCode2 * 31;
            String str = (String) eVar.next();
            iHashCode2 = i7 + (str != null ? str.hashCode() : 0);
        }
        return (iHashCode * 31) + iHashCode2;
    }

    @Override // or.g1, kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor j(int i7) {
        return ((SerialDescriptor[]) this.f17501n.getValue())[i7];
    }

    @Override // or.g1
    public final String toString() {
        Intrinsics.checkNotNullParameter(this, "<this>");
        return CollectionsKt.O(new kotlin.collections.x(2, this), ", ", s0.g.g(new StringBuilder(), this.f17542a, '('), ")", null, 56);
    }
}

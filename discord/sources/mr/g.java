package mr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.collections.e0;
import kotlin.collections.r0;
import kotlin.collections.w0;
import kotlin.collections.x;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import or.e1;
import or.l;
import rn.u;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements SerialDescriptor, l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ls.d f16066b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f16067c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f16068d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashSet f16069e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String[] f16070f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final SerialDescriptor[] f16071g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List[] f16072h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean[] f16073i;
    public final Map j;
    public final SerialDescriptor[] k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final u f16074l;

    public g(String serialName, ls.d kind, int i7, List typeParameters, a builder) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(typeParameters, "typeParameters");
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.f16065a = serialName;
        this.f16066b = kind;
        this.f16067c = i7;
        this.f16068d = builder.f16046b;
        ArrayList arrayList = builder.f16047c;
        this.f16069e = CollectionsKt.g0(arrayList);
        int i10 = 0;
        this.f16070f = (String[]) arrayList.toArray(new String[0]);
        this.f16071g = e1.c(builder.f16049e);
        this.f16072h = (List[]) builder.f16050f.toArray(new List[0]);
        ArrayList arrayList2 = builder.f16051g;
        Intrinsics.checkNotNullParameter(arrayList2, "<this>");
        boolean[] zArr = new boolean[arrayList2.size()];
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            zArr[i10] = ((Boolean) it.next()).booleanValue();
            i10++;
        }
        this.f16073i = zArr;
        String[] strArr = this.f16070f;
        Intrinsics.checkNotNullParameter(strArr, "<this>");
        x xVar = new x(new i6.a(4, strArr));
        ArrayList arrayList3 = new ArrayList(e0.l(xVar, 10));
        Iterator it2 = xVar.iterator();
        while (true) {
            r0 r0Var = (r0) it2;
            if (!r0Var.f14666e.hasNext()) {
                this.j = w0.l(arrayList3);
                this.k = e1.c(typeParameters);
                this.f16074l = rn.l.b(new i6.a(7, this));
                return;
            }
            IndexedValue indexedValue = (IndexedValue) r0Var.next();
            arrayList3.add(new Pair(indexedValue.f14623b, Integer.valueOf(indexedValue.f14622a)));
        }
    }

    @Override // or.l
    public final Set a() {
        return this.f16069e;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final ls.d c() {
        return this.f16066b;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String d() {
        return this.f16065a;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean e() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
            if (Intrinsics.areEqual(this.f16065a, serialDescriptor.d()) && Arrays.equals(this.k, ((g) obj).k)) {
                int iG = serialDescriptor.g();
                int i7 = this.f16067c;
                if (i7 == iG) {
                    for (int i10 = 0; i10 < i7; i10++) {
                        SerialDescriptor[] serialDescriptorArr = this.f16071g;
                        if (Intrinsics.areEqual(serialDescriptorArr[i10].d(), serialDescriptor.j(i10).d()) && Intrinsics.areEqual(serialDescriptorArr[i10].c(), serialDescriptor.j(i10).c())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int f(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Integer num = (Integer) this.j.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int g() {
        return this.f16067c;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getAnnotations() {
        return this.f16068d;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String h(int i7) {
        return this.f16070f[i7];
    }

    public final int hashCode() {
        return ((Number) this.f16074l.getValue()).intValue();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List i(int i7) {
        return this.f16072h[i7];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isInline() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor j(int i7) {
        return this.f16071g[i7];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean k(int i7) {
        return this.f16073i[i7];
    }

    public final String toString() {
        return CollectionsKt.O(lo.j.i(0, this.f16067c), ", ", s0.g.g(new StringBuilder(), this.f16065a, '('), ")", new kotlin.collections.a(6, this), 24);
    }
}

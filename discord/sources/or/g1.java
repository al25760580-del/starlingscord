package or;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public class g1 implements SerialDescriptor, l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f0 f17543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f17544c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f17545d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String[] f17546e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List[] f17547f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList f17548g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean[] f17549h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f17550i;
    public final Object j;
    public final Object k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f17551l;

    public g1(String serialName, f0 f0Var, int i7) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        this.f17542a = serialName;
        this.f17543b = f0Var;
        this.f17544c = i7;
        this.f17545d = -1;
        String[] strArr = new String[i7];
        for (int i10 = 0; i10 < i7; i10++) {
            strArr[i10] = "[UNINITIALIZED]";
        }
        this.f17546e = strArr;
        int i11 = this.f17544c;
        this.f17547f = new List[i11];
        this.f17549h = new boolean[i11];
        this.f17550i = kotlin.collections.w0.d();
        rn.m mVar = rn.m.f19486e;
        final int i12 = 0;
        this.j = rn.l.a(mVar, new Function0(this) { // from class: or.f1

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ g1 f17534e;

            {
                this.f17534e = this;
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                KSerializer[] kSerializerArrChildSerializers;
                ArrayList arrayList;
                KSerializer[] kSerializerArrTypeParametersSerializers;
                switch (i12) {
                    case 0:
                        f0 f0Var2 = this.f17534e.f17543b;
                        return (f0Var2 == null || (kSerializerArrChildSerializers = f0Var2.childSerializers()) == null) ? e1.f17528b : kSerializerArrChildSerializers;
                    case 1:
                        f0 f0Var3 = this.f17534e.f17543b;
                        if (f0Var3 == null || (kSerializerArrTypeParametersSerializers = f0Var3.typeParametersSerializers()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(kSerializerArrTypeParametersSerializers.length);
                            for (KSerializer kSerializer : kSerializerArrTypeParametersSerializers) {
                                arrayList.add(kSerializer.getDescriptor());
                            }
                        }
                        return e1.c(arrayList);
                    default:
                        g1 g1Var = this.f17534e;
                        return Integer.valueOf(e1.f(g1Var, (SerialDescriptor[]) g1Var.k.getValue()));
                }
            }
        });
        final int i13 = 1;
        this.k = rn.l.a(mVar, new Function0(this) { // from class: or.f1

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ g1 f17534e;

            {
                this.f17534e = this;
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                KSerializer[] kSerializerArrChildSerializers;
                ArrayList arrayList;
                KSerializer[] kSerializerArrTypeParametersSerializers;
                switch (i13) {
                    case 0:
                        f0 f0Var2 = this.f17534e.f17543b;
                        return (f0Var2 == null || (kSerializerArrChildSerializers = f0Var2.childSerializers()) == null) ? e1.f17528b : kSerializerArrChildSerializers;
                    case 1:
                        f0 f0Var3 = this.f17534e.f17543b;
                        if (f0Var3 == null || (kSerializerArrTypeParametersSerializers = f0Var3.typeParametersSerializers()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(kSerializerArrTypeParametersSerializers.length);
                            for (KSerializer kSerializer : kSerializerArrTypeParametersSerializers) {
                                arrayList.add(kSerializer.getDescriptor());
                            }
                        }
                        return e1.c(arrayList);
                    default:
                        g1 g1Var = this.f17534e;
                        return Integer.valueOf(e1.f(g1Var, (SerialDescriptor[]) g1Var.k.getValue()));
                }
            }
        });
        final int i14 = 2;
        this.f17551l = rn.l.a(mVar, new Function0(this) { // from class: or.f1

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ g1 f17534e;

            {
                this.f17534e = this;
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                KSerializer[] kSerializerArrChildSerializers;
                ArrayList arrayList;
                KSerializer[] kSerializerArrTypeParametersSerializers;
                switch (i14) {
                    case 0:
                        f0 f0Var2 = this.f17534e.f17543b;
                        return (f0Var2 == null || (kSerializerArrChildSerializers = f0Var2.childSerializers()) == null) ? e1.f17528b : kSerializerArrChildSerializers;
                    case 1:
                        f0 f0Var3 = this.f17534e.f17543b;
                        if (f0Var3 == null || (kSerializerArrTypeParametersSerializers = f0Var3.typeParametersSerializers()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(kSerializerArrTypeParametersSerializers.length);
                            for (KSerializer kSerializer : kSerializerArrTypeParametersSerializers) {
                                arrayList.add(kSerializer.getDescriptor());
                            }
                        }
                        return e1.c(arrayList);
                    default:
                        g1 g1Var = this.f17534e;
                        return Integer.valueOf(e1.f(g1Var, (SerialDescriptor[]) g1Var.k.getValue()));
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // or.l
    public final Set a() {
        return this.f17550i.keySet();
    }

    public final void b(String name, boolean z5) {
        Intrinsics.checkNotNullParameter(name, "name");
        int i7 = this.f17545d + 1;
        this.f17545d = i7;
        String[] strArr = this.f17546e;
        strArr[i7] = name;
        this.f17549h[i7] = z5;
        this.f17547f[i7] = null;
        if (i7 == this.f17544c - 1) {
            HashMap map = new HashMap();
            int length = strArr.length;
            for (int i10 = 0; i10 < length; i10++) {
                map.put(strArr[i10], Integer.valueOf(i10));
            }
            this.f17550i = map;
        }
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public ls.d c() {
        return mr.j.f16077b;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String d() {
        return this.f17542a;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean e() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, kotlin.Lazy] */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g1) {
            SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
            if (Intrinsics.areEqual(this.f17542a, serialDescriptor.d()) && Arrays.equals((SerialDescriptor[]) this.k.getValue(), (SerialDescriptor[]) ((g1) obj).k.getValue())) {
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
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int f(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Integer num = (Integer) this.f17550i.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int g() {
        return this.f17544c;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getAnnotations() {
        ArrayList arrayList = this.f17548g;
        return arrayList == null ? kotlin.collections.n0.f14659d : arrayList;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String h(int i7) {
        return this.f17546e[i7];
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public int hashCode() {
        return ((Number) this.f17551l.getValue()).intValue();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List i(int i7) {
        List list = this.f17547f[i7];
        return list == null ? kotlin.collections.n0.f14659d : list;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean isInline() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public SerialDescriptor j(int i7) {
        return ((KSerializer[]) this.j.getValue())[i7].getDescriptor();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean k(int i7) {
        return this.f17549h[i7];
    }

    public final void l(Annotation a10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        if (this.f17548g == null) {
            this.f17548g = new ArrayList(1);
        }
        ArrayList arrayList = this.f17548g;
        Intrinsics.checkNotNull(arrayList);
        arrayList.add(a10);
    }

    public String toString() {
        return CollectionsKt.O(lo.j.i(0, this.f17544c), ", ", s0.g.g(new StringBuilder(), this.f17542a, '('), ")", new kotlin.collections.a(10, this), 24);
    }
}

package eq;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.n0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m f8615c = new m();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f8616d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f8617e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f8618f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f8619g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f8620h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f8621i;
    public static final int j;
    public static final int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f8622l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final f f8623m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final f f8624n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final f f8625o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final f f8626p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final f f8627q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final ArrayList f8628r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final ArrayList f8629s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f8630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8631b;

    static {
        e eVar;
        int i7 = f8616d;
        int i10 = i7 << 1;
        f8617e = i7;
        int i11 = i7 << 2;
        f8618f = i10;
        int i12 = i7 << 3;
        f8619g = i11;
        int i13 = i7 << 4;
        f8620h = i12;
        int i14 = i7 << 5;
        f8621i = i13;
        j = i14;
        f8616d = i7 << 7;
        int i15 = (i7 << 6) - 1;
        k = i15;
        int i16 = i7 | i10 | i11;
        f8622l = i16;
        f8623m = new f(i15);
        f8624n = new f(i13 | i14);
        new f(i7);
        new f(i10);
        new f(i11);
        f8625o = new f(i16);
        new f(i12);
        f8626p = new f(i13);
        f8627q = new f(i14);
        new f(i10 | i13 | i14);
        Field[] fields = f.class.getFields();
        Intrinsics.checkNotNullExpressionValue(fields, "getFields(...)");
        ArrayList arrayList = new ArrayList();
        for (Field field : fields) {
            if (Modifier.isStatic(field.getModifiers())) {
                arrayList.add(field);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            e eVar2 = null;
            if (!it.hasNext()) {
                break;
            }
            Field field2 = (Field) it.next();
            Object obj = field2.get(null);
            f fVar = obj instanceof f ? (f) obj : null;
            if (fVar != null) {
                int i17 = fVar.f8631b;
                String name = field2.getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                eVar2 = new e(i17, name);
            }
            if (eVar2 != null) {
                arrayList2.add(eVar2);
            }
        }
        f8628r = arrayList2;
        Field[] fields2 = f.class.getFields();
        Intrinsics.checkNotNullExpressionValue(fields2, "getFields(...)");
        ArrayList arrayList3 = new ArrayList();
        for (Field field3 : fields2) {
            if (Modifier.isStatic(field3.getModifiers())) {
                arrayList3.add(field3);
            }
        }
        ArrayList<Field> arrayList4 = new ArrayList();
        for (Object obj2 : arrayList3) {
            if (Intrinsics.areEqual(((Field) obj2).getType(), Integer.TYPE)) {
                arrayList4.add(obj2);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        for (Field field4 : arrayList4) {
            Object obj3 = field4.get(null);
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue = ((Integer) obj3).intValue();
            if (iIntValue == ((-iIntValue) & iIntValue)) {
                String name2 = field4.getName();
                Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
                eVar = new e(iIntValue, name2);
            } else {
                eVar = null;
            }
            if (eVar != null) {
                arrayList5.add(eVar);
            }
        }
        f8629s = arrayList5;
    }

    public f(int i7) {
        this(i7, n0.f14659d);
    }

    public final boolean a(int i7) {
        return (i7 & this.f8631b) != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(f.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter");
        f fVar = (f) obj;
        return Intrinsics.areEqual(this.f8630a, fVar.f8630a) && this.f8631b == fVar.f8631b;
    }

    public final int hashCode() {
        return (this.f8630a.hashCode() * 31) + this.f8631b;
    }

    public final String toString() {
        Object next;
        Iterator it = f8628r.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((e) next).f8613a != this.f8631b);
        e eVar = (e) next;
        String strO = eVar != null ? eVar.f8614b : null;
        if (strO == null) {
            ArrayList arrayList = new ArrayList();
            for (e eVar2 : f8629s) {
                String str = a(eVar2.f8613a) ? eVar2.f8614b : null;
                if (str != null) {
                    arrayList.add(str);
                }
            }
            strO = CollectionsKt.O(arrayList, " | ", null, null, null, 62);
        }
        StringBuilder sbN = com.discord.chat.presentation.list.a.n("DescriptorKindFilter(", strO, ", ");
        sbN.append(this.f8630a);
        sbN.append(')');
        return sbN.toString();
    }

    public f(int i7, List excludes) {
        Intrinsics.checkNotNullParameter(excludes, "excludes");
        this.f8630a = excludes;
        Iterator it = excludes.iterator();
        while (it.hasNext()) {
            i7 &= ~((d) it.next()).a();
        }
        this.f8631b = i7;
    }
}

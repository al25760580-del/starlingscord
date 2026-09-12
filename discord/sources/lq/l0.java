package lq;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes3.dex */
public final class l0 extends sq.d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e4.r f15225e = new e4.r(13);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final l0 f15226i = new l0(kotlin.collections.n0.f14659d);

    public l0(List list) {
        sq.j arrayMap = sq.j.f20514d;
        Intrinsics.checkNotNull(arrayMap, "null cannot be cast to non-null type org.jetbrains.kotlin.util.ArrayMap<T of org.jetbrains.kotlin.util.AttributeArrayOwner>");
        Intrinsics.checkNotNullParameter(arrayMap, "arrayMap");
        this.f20499d = arrayMap;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            j value = (j) it.next();
            value.getClass();
            KClass tClass = Reflection.getOrCreateKotlinClass(j.class);
            Intrinsics.checkNotNullParameter(tClass, "tClass");
            Intrinsics.checkNotNullParameter(value, "value");
            String keyQualifiedName = tClass.getQualifiedName();
            Intrinsics.checkNotNull(keyQualifiedName);
            Intrinsics.checkNotNullParameter(keyQualifiedName, "keyQualifiedName");
            Intrinsics.checkNotNullParameter(value, "value");
            int iH = f15225e.H(keyQualifiedName);
            int iA = this.f20499d.a();
            if (iA != 0) {
                if (iA == 1) {
                    sq.a aVar = this.f20499d;
                    try {
                        Intrinsics.checkNotNull(aVar, "null cannot be cast to non-null type org.jetbrains.kotlin.util.OneElementArrayMap<T of org.jetbrains.kotlin.util.AttributeArrayOwner>");
                        sq.p pVar = (sq.p) aVar;
                        int i7 = pVar.f20527e;
                        if (i7 == iH) {
                            this.f20499d = new sq.p(iH, value);
                        } else {
                            sq.c cVar = new sq.c();
                            cVar.f20497d = new Object[20];
                            cVar.f20498e = 0;
                            cVar.b(i7, pVar.f20526d);
                            this.f20499d = cVar;
                        }
                    } catch (ClassCastException e10) {
                        throw new IllegalStateException(sq.d.a(aVar, 1, "OneElementArrayMap"), e10);
                    }
                }
                this.f20499d.b(iH, value);
            } else {
                sq.a aVar2 = this.f20499d;
                if (!(aVar2 instanceof sq.j)) {
                    throw new IllegalStateException(sq.d.a(aVar2, 0, "EmptyArrayMap"));
                }
                this.f20499d = new sq.p(iH, value);
            }
        }
    }
}

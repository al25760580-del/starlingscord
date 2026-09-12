package or;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final class m1 extends t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final KClass f17575b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f17576c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(KClass kClass, KSerializer eSerializer) {
        super(eSerializer);
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        Intrinsics.checkNotNullParameter(eSerializer, "eSerializer");
        this.f17575b = kClass;
        SerialDescriptor elementDesc = eSerializer.getDescriptor();
        Intrinsics.checkNotNullParameter(elementDesc, "elementDesc");
        this.f17576c = new c(elementDesc, 0);
    }

    @Override // or.a
    public final Object a() {
        return new ArrayList();
    }

    @Override // or.a
    public final int b(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        return arrayList.size();
    }

    @Override // or.a
    public final void c(int i7, Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        arrayList.ensureCapacity(i7);
    }

    @Override // or.a
    public final Iterator d(Object obj) {
        Object[] objArr = (Object[]) obj;
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        return ArrayIteratorKt.iterator(objArr);
    }

    @Override // or.a
    public final int e(Object obj) {
        Object[] objArr = (Object[]) obj;
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        return objArr.length;
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return this.f17576c;
    }

    @Override // or.a
    public final Object i(Object obj) {
        Intrinsics.checkNotNullParameter(null, "<this>");
        kotlin.collections.w.b(null);
        throw null;
    }

    @Override // or.a
    public final Object j(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        KClass eClass = this.f17575b;
        Intrinsics.checkNotNullParameter(eClass, "eClass");
        Object objNewInstance = Array.newInstance((Class<?>) gn.h.B(eClass), arrayList.size());
        Intrinsics.checkNotNull(objNewInstance, "null cannot be cast to non-null type kotlin.Array<E of kotlinx.serialization.internal.PlatformKt.toNativeArrayImpl>");
        Object[] array = arrayList.toArray((Object[]) objNewInstance);
        Intrinsics.checkNotNullExpressionValue(array, "toArray(...)");
        return array;
    }

    @Override // or.t
    public final void k(int i7, Object obj, Object obj2) {
        ArrayList arrayList = (ArrayList) obj;
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        arrayList.add(i7, obj2);
    }
}

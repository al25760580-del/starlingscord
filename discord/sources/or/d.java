package or;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17519b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o0 f17520c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(KSerializer element, char c8) {
        super(element);
        Intrinsics.checkNotNullParameter(element, "element");
    }

    @Override // or.a
    public final Object a() {
        switch (this.f17519b) {
            case 0:
                return new ArrayList();
            case 1:
                return new HashSet();
            default:
                return new LinkedHashSet();
        }
    }

    @Override // or.a
    public final int b(Object obj) {
        switch (this.f17519b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                Intrinsics.checkNotNullParameter(arrayList, "<this>");
                return arrayList.size();
            case 1:
                HashSet hashSet = (HashSet) obj;
                Intrinsics.checkNotNullParameter(hashSet, "<this>");
                return hashSet.size();
            default:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
                Intrinsics.checkNotNullParameter(linkedHashSet, "<this>");
                return linkedHashSet.size();
        }
    }

    @Override // or.a
    public final void c(int i7, Object obj) {
        switch (this.f17519b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                Intrinsics.checkNotNullParameter(arrayList, "<this>");
                arrayList.ensureCapacity(i7);
                break;
            case 1:
                Intrinsics.checkNotNullParameter((HashSet) obj, "<this>");
                break;
            default:
                Intrinsics.checkNotNullParameter((LinkedHashSet) obj, "<this>");
                break;
        }
    }

    @Override // or.a
    public final Iterator d(Object obj) {
        Collection collection = (Collection) obj;
        Intrinsics.checkNotNullParameter(collection, "<this>");
        return collection.iterator();
    }

    @Override // or.a
    public final int e(Object obj) {
        Collection collection = (Collection) obj;
        Intrinsics.checkNotNullParameter(collection, "<this>");
        return collection.size();
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        switch (this.f17519b) {
            case 0:
                break;
            case 1:
                break;
        }
        return (c) this.f17520c;
    }

    @Override // or.a
    public final Object i(Object obj) {
        switch (this.f17519b) {
            case 0:
                Intrinsics.checkNotNullParameter(null, "<this>");
                return new ArrayList((Collection) null);
            case 1:
                Intrinsics.checkNotNullParameter(null, "<this>");
                return new HashSet((Collection) null);
            default:
                Intrinsics.checkNotNullParameter(null, "<this>");
                return new LinkedHashSet((Collection) null);
        }
    }

    @Override // or.a
    public final Object j(Object obj) {
        switch (this.f17519b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                Intrinsics.checkNotNullParameter(arrayList, "<this>");
                return arrayList;
            case 1:
                HashSet hashSet = (HashSet) obj;
                Intrinsics.checkNotNullParameter(hashSet, "<this>");
                return hashSet;
            default:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
                Intrinsics.checkNotNullParameter(linkedHashSet, "<this>");
                return linkedHashSet;
        }
    }

    @Override // or.t
    public final void k(int i7, Object obj, Object obj2) {
        switch (this.f17519b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                Intrinsics.checkNotNullParameter(arrayList, "<this>");
                arrayList.add(i7, obj2);
                break;
            case 1:
                HashSet hashSet = (HashSet) obj;
                Intrinsics.checkNotNullParameter(hashSet, "<this>");
                hashSet.add(obj2);
                break;
            default:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
                Intrinsics.checkNotNullParameter(linkedHashSet, "<this>");
                linkedHashSet.add(obj2);
                break;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(KSerializer eSerializer, int i7) {
        this(eSerializer, (char) 0);
        this.f17519b = i7;
        switch (i7) {
            case 1:
                Intrinsics.checkNotNullParameter(eSerializer, "eSerializer");
                this(eSerializer, (char) 0);
                SerialDescriptor elementDesc = eSerializer.getDescriptor();
                Intrinsics.checkNotNullParameter(elementDesc, "elementDesc");
                this.f17520c = new c(elementDesc, 2);
                break;
            case 2:
                Intrinsics.checkNotNullParameter(eSerializer, "eSerializer");
                this(eSerializer, (char) 0);
                SerialDescriptor elementDesc2 = eSerializer.getDescriptor();
                Intrinsics.checkNotNullParameter(elementDesc2, "elementDesc");
                this.f17520c = new c(elementDesc2, 3);
                break;
            default:
                Intrinsics.checkNotNullParameter(eSerializer, "element");
                SerialDescriptor elementDesc3 = eSerializer.getDescriptor();
                Intrinsics.checkNotNullParameter(elementDesc3, "elementDesc");
                this.f17520c = new c(elementDesc3, 1);
                break;
        }
    }
}

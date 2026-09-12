package vq;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.o;
import kotlin.collections.v0;
import kotlin.collections.y;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends o {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f21949i = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f21950d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f21951e;

    public j(int i7) {
    }

    @Override // kotlin.collections.o
    public final int a() {
        return this.f21951e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        Object obj2;
        int i7 = this.f21951e;
        if (i7 == 0) {
            this.f21950d = obj;
        } else if (i7 == 1) {
            if (Intrinsics.areEqual(this.f21950d, obj)) {
                return false;
            }
            this.f21950d = new Object[]{this.f21950d, obj};
        } else if (i7 < 5) {
            Object obj3 = this.f21950d;
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            Object[] objArr = (Object[]) obj3;
            if (y.p(obj, objArr)) {
                return false;
            }
            int i10 = this.f21951e;
            if (i10 == 4) {
                Object[] elements = Arrays.copyOf(objArr, objArr.length);
                Intrinsics.checkNotNullParameter(elements, "elements");
                LinkedHashSet linkedHashSet = new LinkedHashSet(v0.a(elements.length));
                y.F(elements, linkedHashSet);
                linkedHashSet.add(obj);
                obj2 = linkedHashSet;
            } else {
                Object[] objArrCopyOf = Arrays.copyOf(objArr, i10 + 1);
                Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
                objArrCopyOf[objArrCopyOf.length - 1] = obj;
                obj2 = objArrCopyOf;
            }
            this.f21950d = obj2;
        } else {
            Object obj4 = this.f21950d;
            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>");
            if (!TypeIntrinsics.asMutableSet(obj4).add(obj)) {
                return false;
            }
        }
        this.f21951e++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f21950d = null;
        this.f21951e = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (a() == 0) {
            return false;
        }
        if (a() == 1) {
            return Intrinsics.areEqual(this.f21950d, obj);
        }
        if (a() < 5) {
            Object obj2 = this.f21950d;
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            return y.p(obj, (Object[]) obj2);
        }
        Object obj3 = this.f21950d;
        Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.collections.Set<T of org.jetbrains.kotlin.utils.SmartSet>");
        return ((Set) obj3).contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i7 = this.f21951e;
        if (i7 == 0) {
            return Collections.EMPTY_SET.iterator();
        }
        if (i7 == 1) {
            return new i(this.f21950d);
        }
        if (i7 < 5) {
            Object obj = this.f21950d;
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            return new h((Object[]) obj);
        }
        Object obj2 = this.f21950d;
        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>");
        return TypeIntrinsics.asMutableSet(obj2).iterator();
    }
}

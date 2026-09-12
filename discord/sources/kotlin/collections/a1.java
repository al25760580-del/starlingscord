package kotlin.collections;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a1 extends h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f14626e = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f14627i;

    public a1(List delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f14627i = delegate;
    }

    @Override // kotlin.collections.b
    public final int a() {
        switch (this.f14626e) {
            case 0:
                return ((List) this.f14627i).size();
            default:
                return ((kotlin.text.m) this.f14627i).f14734a.groupCount() + 1;
        }
    }

    @Override // kotlin.collections.b, java.util.Collection, java.util.List
    public /* bridge */ boolean contains(Object obj) {
        switch (this.f14626e) {
            case 1:
                if (obj instanceof String) {
                    return super.contains((String) obj);
                }
                return false;
            default:
                return super.contains(obj);
        }
    }

    @Override // kotlin.collections.h, java.util.List
    public final Object get(int i7) {
        switch (this.f14626e) {
            case 0:
                return ((List) this.f14627i).get(j0.v(i7, this));
            default:
                String strGroup = ((kotlin.text.m) this.f14627i).f14734a.group(i7);
                return strGroup == null ? "" : strGroup;
        }
    }

    @Override // kotlin.collections.h, java.util.List
    public /* bridge */ int indexOf(Object obj) {
        switch (this.f14626e) {
            case 1:
                if (obj instanceof String) {
                    return super.indexOf((String) obj);
                }
                return -1;
            default:
                return super.indexOf(obj);
        }
    }

    @Override // kotlin.collections.h, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        switch (this.f14626e) {
            case 0:
                return new z0(this, 0);
            default:
                return super.iterator();
        }
    }

    @Override // kotlin.collections.h, java.util.List
    public /* bridge */ int lastIndexOf(Object obj) {
        switch (this.f14626e) {
            case 1:
                if (obj instanceof String) {
                    return super.lastIndexOf((String) obj);
                }
                return -1;
            default:
                return super.lastIndexOf(obj);
        }
    }

    @Override // kotlin.collections.h, java.util.List
    public ListIterator listIterator() {
        switch (this.f14626e) {
            case 0:
                return new z0(this, 0);
            default:
                return super.listIterator();
        }
    }

    @Override // kotlin.collections.h, java.util.List
    public ListIterator listIterator(int i7) {
        switch (this.f14626e) {
            case 0:
                return new z0(this, i7);
            default:
                return super.listIterator(i7);
        }
    }

    public a1(kotlin.text.m mVar) {
        this.f14627i = mVar;
    }
}

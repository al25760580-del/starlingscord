package s;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Iterator, Map.Entry {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f19616d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f19617e = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f19618i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ e f19619v;

    public c(e eVar) {
        this.f19619v = eVar;
        this.f19616d = eVar.f1222i - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.f19618i) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int i7 = this.f19617e;
        e eVar = this.f19619v;
        return Intrinsics.areEqual(key, eVar.f(i7)) && Intrinsics.areEqual(entry.getValue(), eVar.i(this.f19617e));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.f19618i) {
            return this.f19619v.f(this.f19617e);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f19618i) {
            return this.f19619v.i(this.f19617e);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f19617e < this.f19616d;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f19618i) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i7 = this.f19617e;
        e eVar = this.f19619v;
        Object objF = eVar.f(i7);
        Object objI = eVar.i(this.f19617e);
        return (objF == null ? 0 : objF.hashCode()) ^ (objI != null ? objI.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f19617e++;
        this.f19618i = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f19618i) {
            throw new IllegalStateException();
        }
        this.f19619v.g(this.f19617e);
        this.f19617e--;
        this.f19616d--;
        this.f19618i = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.f19618i) {
            return this.f19619v.h(this.f19617e, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}

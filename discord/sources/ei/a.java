package ei;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements Iterator {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Iterator f8276d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f8277e = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Collection f8278i = null;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Iterator f8279v = k0.f8322d;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ n0 f8280w;

    public a(n0 n0Var) {
        this.f8280w = n0Var;
        this.f8276d = n0Var.f8335v.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f8276d.hasNext() || this.f8279v.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f8279v.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f8276d.next();
            this.f8277e = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.f8278i = collection;
            this.f8279v = collection.iterator();
        }
        return this.f8279v.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f8279v.remove();
        Collection collection = this.f8278i;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.f8276d.remove();
        }
        this.f8280w.f8336w--;
    }
}

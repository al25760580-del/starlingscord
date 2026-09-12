package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: loaded from: classes.dex */
public final class c0 implements Iterator, KMappedMarker {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1639d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Iterator f1640e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f1641i;

    public c0(y0 y0Var) {
        this.f1639d = 0;
        this.f1641i = new ArrayList();
        this.f1640e = y0Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f1639d) {
            case 0:
                break;
        }
        return this.f1640e.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f1639d) {
            case 0:
                Object next = this.f1640e.next();
                ArrayList arrayList = (ArrayList) this.f1641i;
                View view = (View) next;
                ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
                y0 y0Var = viewGroup != null ? new y0(viewGroup) : null;
                if (y0Var == null || !y0Var.hasNext()) {
                    while (!this.f1640e.hasNext() && !arrayList.isEmpty()) {
                        this.f1640e = (Iterator) CollectionsKt.Q(arrayList);
                        kotlin.collections.i0.u(arrayList);
                    }
                } else {
                    arrayList.add(this.f1640e);
                    this.f1640e = y0Var;
                }
                return next;
            default:
                return ((xq.s) this.f1641i).f23050b.invoke(this.f1640e.next());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f1639d) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public c0(xq.s sVar) {
        this.f1639d = 1;
        this.f1641i = sVar;
        this.f1640e = sVar.f23049a.iterator();
    }
}

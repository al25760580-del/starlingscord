package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import kotlin.jvm.internal.markers.KMutableIterator;

/* JADX INFO: loaded from: classes.dex */
public final class y0 implements Iterator, KMutableIterator {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1744d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ ViewGroup f1745e;

    public y0(ViewGroup viewGroup) {
        this.f1745e = viewGroup;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f1744d < this.f1745e.getChildCount();
    }

    @Override // java.util.Iterator
    public final Object next() {
        ViewGroup viewGroup = this.f1745e;
        int i7 = this.f1744d;
        this.f1744d = i7 + 1;
        View childAt = viewGroup.getChildAt(i7);
        if (childAt != null) {
            return childAt;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        ViewGroup viewGroup = this.f1745e;
        int i7 = this.f1744d - 1;
        this.f1744d = i7;
        viewGroup.removeViewAt(i7);
    }
}

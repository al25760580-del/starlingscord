package androidx.core.view;

import android.view.Menu;
import android.view.MenuItem;
import java.util.Iterator;
import kotlin.jvm.internal.markers.KMutableIterator;

/* JADX INFO: loaded from: classes.dex */
public final class p implements Iterator, KMutableIterator {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1713d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ Menu f1714e;

    public p(Menu menu) {
        this.f1714e = menu;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f1713d < this.f1714e.size();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Menu menu = this.f1714e;
        int i7 = this.f1713d;
        this.f1713d = i7 + 1;
        MenuItem item = menu.getItem(i7);
        if (item != null) {
            return item;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        Menu menu = this.f1714e;
        int i7 = this.f1713d - 1;
        this.f1713d = i7;
        MenuItem item = menu.getItem(i7);
        if (item == null) {
            throw new IndexOutOfBoundsException();
        }
        menu.removeItem(item.getItemId());
    }
}

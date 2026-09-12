package v;

import java.util.List;
import s0.g;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    public static final void a(int i7, List list) {
        int size = list.size();
        if (i7 < 0 || i7 >= size) {
            c(i7, size);
        }
    }

    public static final void b(List list, int i7, int i10) {
        if (i7 > i10) {
            f(i7, i10);
        }
        if (i7 < 0) {
            d(i7);
        }
        if (i10 > list.size()) {
            e(i10, list.size());
        }
    }

    private static final void c(int i7, int i10) {
        throw new IndexOutOfBoundsException(g.c(i7, "Index ", i10, " is out of bounds. The list has ", " elements."));
    }

    private static final void d(int i7) {
        throw new IndexOutOfBoundsException(g.d(i7, "fromIndex (", ") is less than 0."));
    }

    private static final void e(int i7, int i10) {
        throw new IndexOutOfBoundsException("toIndex (" + i7 + ") is more than than the list size (" + i10 + ')');
    }

    private static final void f(int i7, int i10) {
        throw new IllegalArgumentException(g.c(i7, "Indices are out of order. fromIndex (", i10, ") is greater than toIndex (", ")."));
    }
}

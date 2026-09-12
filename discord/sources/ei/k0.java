package ei;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class k0 implements Iterator {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final k0 f8322d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ k0[] f8323e;

    static {
        k0 k0Var = new k0("INSTANCE", 0);
        f8322d = k0Var;
        f8323e = new k0[]{k0Var};
    }

    public static k0 valueOf(String str) {
        return (k0) Enum.valueOf(k0.class, str);
    }

    public static k0[] values() {
        return (k0[]) f8323e.clone();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new IllegalStateException("no calls to next() since the last call to remove()");
    }
}

package ci;

import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class k extends g implements Set {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f3709i = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public transient l f3710e;

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this || obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                return set.size() == 0 && containsAll(set);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }
}

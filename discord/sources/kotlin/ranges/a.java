package kotlin.ranges;

import java.util.Iterator;
import kotlin.jvm.internal.markers.KMappedMarker;
import lo.b;
import org.jetbrains.annotations.NotNull;
import zn.c;

/* JADX INFO: loaded from: classes3.dex */
public class a implements Iterable, KMappedMarker {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public static final lo.a f14687v = new lo.a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f14688d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f14689e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f14690i;

    public a(int i7, int i10, int i11) {
        if (i11 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i11 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f14688d = i7;
        this.f14689e = c.a(i7, i10, i11);
        this.f14690i = i11;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        if (isEmpty() && ((a) obj).isEmpty()) {
            return true;
        }
        a aVar = (a) obj;
        return this.f14688d == aVar.f14688d && this.f14689e == aVar.f14689e && this.f14690i == aVar.f14690i;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f14688d * 31) + this.f14689e) * 31) + this.f14690i;
    }

    public boolean isEmpty() {
        int i7 = this.f14690i;
        int i10 = this.f14689e;
        int i11 = this.f14688d;
        if (i7 > 0) {
            return i11 > i10;
        }
        return i11 < i10;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new b(this.f14688d, this.f14689e, this.f14690i);
    }

    public String toString() {
        StringBuilder sb2;
        int i7 = this.f14689e;
        int i10 = this.f14688d;
        int i11 = this.f14690i;
        if (i11 > 0) {
            sb2 = new StringBuilder();
            sb2.append(i10);
            sb2.append("..");
            sb2.append(i7);
            sb2.append(" step ");
            sb2.append(i11);
        } else {
            sb2 = new StringBuilder();
            sb2.append(i10);
            sb2.append(" downTo ");
            sb2.append(i7);
            sb2.append(" step ");
            sb2.append(-i11);
        }
        return sb2.toString();
    }
}

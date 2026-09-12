package kotlin.collections;

import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes3.dex */
public final class x implements Iterable, KMappedMarker {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f14669d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f14670e;

    public /* synthetic */ x(int i7, Object obj) {
        this.f14669d = i7;
        this.f14670e = obj;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f14669d) {
            case 0:
                return ArrayIteratorKt.iterator((Object[]) this.f14670e);
            case 1:
                return new r0((Iterator) ((Function0) this.f14670e).invoke());
            case 2:
                return new e((or.a0) this.f14670e);
            default:
                return ((Sequence) this.f14670e).iterator();
        }
    }

    public x(Function0 iteratorFactory) {
        this.f14669d = 1;
        Intrinsics.checkNotNullParameter(iteratorFactory, "iteratorFactory");
        this.f14670e = iteratorFactory;
    }
}

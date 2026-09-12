package xq;

import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements Sequence {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Sequence f23029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f23030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function1 f23031c;

    public g(Sequence sequence, boolean z5, Function1 predicate) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        this.f23029a = sequence;
        this.f23030b = z5;
        this.f23031c = predicate;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        return new d(this);
    }
}

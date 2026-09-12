package xq;

import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements Sequence {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Sequence f23032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function1 f23033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function1 f23034c;

    public h(Sequence sequence, Function1 transformer, Function1 iterator) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        Intrinsics.checkNotNullParameter(transformer, "transformer");
        Intrinsics.checkNotNullParameter(iterator, "iterator");
        this.f23032a = sequence;
        this.f23033b = transformer;
        this.f23034c = iterator;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        return new d(this);
    }
}

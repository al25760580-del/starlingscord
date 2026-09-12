package xq;

import androidx.core.view.c0;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes3.dex */
public final class s implements Sequence {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Sequence f23049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function1 f23050b;

    public s(Sequence sequence, Function1 transformer) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        Intrinsics.checkNotNullParameter(transformer, "transformer");
        this.f23049a = sequence;
        this.f23050b = transformer;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        return new c0(this);
    }
}

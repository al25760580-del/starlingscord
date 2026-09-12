package xq;

import java.util.Iterator;
import kotlin.collections.r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements Sequence, c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Sequence f23018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f23019b;

    public b(Sequence sequence, int i7) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        this.f23018a = sequence;
        this.f23019b = i7;
        if (i7 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i7 + '.').toString());
    }

    @Override // xq.c
    public final Sequence a(int i7) {
        int i10 = this.f23019b + i7;
        return i10 < 0 ? new b(this, i7) : new b(this.f23018a, i10);
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        return new r0(this);
    }
}

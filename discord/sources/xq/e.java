package xq;

import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements Sequence {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f23026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function1 f23027c;

    public e(Sequence sequence, Function1 predicate, int i7) {
        this.f23025a = i7;
        switch (i7) {
            case 1:
                Intrinsics.checkNotNullParameter(sequence, "sequence");
                Intrinsics.checkNotNullParameter(predicate, "predicate");
                this.f23026b = sequence;
                this.f23027c = predicate;
                break;
            default:
                Intrinsics.checkNotNullParameter(sequence, "sequence");
                Intrinsics.checkNotNullParameter(predicate, "predicate");
                this.f23026b = sequence;
                this.f23027c = predicate;
                break;
        }
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        switch (this.f23025a) {
            case 0:
                return new d(this);
            case 1:
                return new d(this, (byte) 0);
            default:
                return new i(this);
        }
    }

    public e(Function0 getInitialValue, Function1 getNextValue) {
        this.f23025a = 2;
        Intrinsics.checkNotNullParameter(getInitialValue, "getInitialValue");
        Intrinsics.checkNotNullParameter(getNextValue, "getNextValue");
        this.f23026b = getInitialValue;
        this.f23027c = getNextValue;
    }
}

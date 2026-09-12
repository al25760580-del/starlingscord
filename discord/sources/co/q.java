package co;

import java.io.BufferedReader;
import java.util.Iterator;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes3.dex */
public final class q implements Sequence {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f3779b;

    public /* synthetic */ q(int i7, Object obj) {
        this.f3778a = i7;
        this.f3779b = obj;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [kotlin.jvm.functions.Function2, xn.g] */
    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        switch (this.f3778a) {
            case 0:
                return new p(this);
            case 1:
                return ArrayIteratorKt.iterator((Object[]) this.f3779b);
            case 2:
                return ((Iterable) this.f3779b).iterator();
            case 3:
                return new kotlin.text.k((CharSequence) this.f3779b);
            case 4:
                return xq.l.a((xn.g) this.f3779b);
            default:
                return (Iterator) this.f3779b;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public q(Function2 function2) {
        this.f3778a = 4;
        this.f3779b = (xn.g) function2;
    }

    public q(BufferedReader reader) {
        this.f3778a = 0;
        Intrinsics.checkNotNullParameter(reader, "reader");
        this.f3779b = reader;
    }
}

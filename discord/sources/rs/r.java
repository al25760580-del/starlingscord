package rs;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f19603a = new q(new byte[0], 0, 0, false, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f19604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicReference[] f19605c;

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f19604b = iHighestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i7 = 0; i7 < iHighestOneBit; i7++) {
            atomicReferenceArr[i7] = new AtomicReference();
        }
        f19605c = atomicReferenceArr;
    }

    public static final void a(q segment) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        if (segment.f19601f != null || segment.f19602g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (segment.f19599d) {
            return;
        }
        AtomicReference atomicReference = f19605c[(int) (Thread.currentThread().getId() & (((long) f19604b) - 1))];
        q qVar = (q) atomicReference.get();
        if (qVar == f19603a) {
            return;
        }
        int i7 = qVar != null ? qVar.f19598c : 0;
        if (i7 >= 65536) {
            return;
        }
        segment.f19601f = qVar;
        segment.f19597b = 0;
        segment.f19598c = i7 + 8192;
        while (!atomicReference.compareAndSet(qVar, segment)) {
            if (atomicReference.get() != qVar) {
                segment.f19601f = null;
                return;
            }
        }
    }

    public static final q b() {
        AtomicReference atomicReference = f19605c[(int) (Thread.currentThread().getId() & (((long) f19604b) - 1))];
        q qVar = f19603a;
        q qVar2 = (q) atomicReference.getAndSet(qVar);
        if (qVar2 == qVar) {
            return new q();
        }
        if (qVar2 == null) {
            atomicReference.set(null);
            return new q();
        }
        atomicReference.set(qVar2.f19601f);
        qVar2.f19601f = null;
        qVar2.f19598c = 0;
        return qVar2;
    }
}

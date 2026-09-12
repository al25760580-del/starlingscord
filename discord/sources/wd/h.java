package wd;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import je.e0;
import kotlin.jvm.internal.LongCompanionObject;
import vd.j;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h implements vd.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayDeque f22187a = new ArrayDeque();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayDeque f22188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PriorityQueue f22189c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public g f22190d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f22191e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f22192f;

    public h() {
        for (int i7 = 0; i7 < 10; i7++) {
            this.f22187a.add(new g(1));
        }
        this.f22188b = new ArrayDeque();
        for (int i10 = 0; i10 < 2; i10++) {
            ArrayDeque arrayDeque = this.f22188b;
            mi.a aVar = new mi.a(11, this);
            vd.d dVar = new vd.d();
            dVar.f21649y = aVar;
            arrayDeque.add(dVar);
        }
        this.f22189c = new PriorityQueue();
    }

    @Override // lc.d
    public final void a(j jVar) {
        je.b.g(jVar == this.f22190d);
        g gVar = (g) jVar;
        if (gVar.c(Integer.MIN_VALUE)) {
            gVar.e();
            this.f22187a.add(gVar);
        } else {
            long j = this.f22192f;
            this.f22192f = 1 + j;
            gVar.G = j;
            this.f22189c.add(gVar);
        }
        this.f22190d = null;
    }

    @Override // vd.g
    public final void b(long j) {
        this.f22191e = j;
    }

    @Override // lc.d
    public final Object d() {
        je.b.k(this.f22190d == null);
        ArrayDeque arrayDeque = this.f22187a;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        g gVar = (g) arrayDeque.pollFirst();
        this.f22190d = gVar;
        return gVar;
    }

    public abstract op.c e();

    public abstract void f(g gVar);

    @Override // lc.d
    public void flush() {
        ArrayDeque arrayDeque;
        this.f22192f = 0L;
        this.f22191e = 0L;
        while (true) {
            PriorityQueue priorityQueue = this.f22189c;
            boolean zIsEmpty = priorityQueue.isEmpty();
            arrayDeque = this.f22187a;
            if (zIsEmpty) {
                break;
            }
            g gVar = (g) priorityQueue.poll();
            int i7 = e0.f13788a;
            gVar.e();
            arrayDeque.add(gVar);
        }
        g gVar2 = this.f22190d;
        if (gVar2 != null) {
            gVar2.e();
            arrayDeque.add(gVar2);
            this.f22190d = null;
        }
    }

    @Override // lc.d
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public vd.d c() {
        ArrayDeque arrayDeque = this.f22188b;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        while (true) {
            PriorityQueue priorityQueue = this.f22189c;
            if (priorityQueue.isEmpty()) {
                return null;
            }
            g gVar = (g) priorityQueue.peek();
            int i7 = e0.f13788a;
            if (gVar.f15012x > this.f22191e) {
                return null;
            }
            g gVar2 = (g) priorityQueue.poll();
            boolean zC = gVar2.c(4);
            ArrayDeque arrayDeque2 = this.f22187a;
            if (zC) {
                vd.d dVar = (vd.d) arrayDeque.pollFirst();
                dVar.a(4);
                gVar2.e();
                arrayDeque2.add(gVar2);
                return dVar;
            }
            f(gVar2);
            if (h()) {
                op.c cVarE = e();
                vd.d dVar2 = (vd.d) arrayDeque.pollFirst();
                dVar2.g(gVar2.f15012x, cVarE, LongCompanionObject.MAX_VALUE);
                gVar2.e();
                arrayDeque2.add(gVar2);
                return dVar2;
            }
            gVar2.e();
            arrayDeque2.add(gVar2);
        }
    }

    public abstract boolean h();

    @Override // lc.d
    public void release() {
    }
}

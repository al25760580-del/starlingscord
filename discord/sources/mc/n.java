package mc;

import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final md.s f15569b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList f15570c;

    public n(CopyOnWriteArrayList copyOnWriteArrayList, int i7, md.s sVar) {
        this.f15570c = copyOnWriteArrayList;
        this.f15568a = i7;
        this.f15569b = sVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, mc.o] */
    public final void a() {
        for (m mVar : this.f15570c) {
            je.e0.M(mVar.f15566a, new l(this, mVar.f15567b, 2));
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, mc.o] */
    public final void b() {
        for (m mVar : this.f15570c) {
            je.e0.M(mVar.f15566a, new l(this, mVar.f15567b, 1));
        }
    }

    public final void c(int i7) {
        for (m mVar : this.f15570c) {
            je.e0.M(mVar.f15566a, new ab.a(this, mVar.f15567b, i7, 11));
        }
    }

    public final void d(Exception exc) {
        for (m mVar : this.f15570c) {
            je.e0.M(mVar.f15566a, new ac.a(this, mVar.f15567b, exc, 28));
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, mc.o] */
    public final void e() {
        for (m mVar : this.f15570c) {
            je.e0.M(mVar.f15566a, new l(this, mVar.f15567b, 0));
        }
    }
}

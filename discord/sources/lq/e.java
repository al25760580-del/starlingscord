package lq;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements Function0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p0 f15187d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final mq.b f15188e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final pq.e f15189i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final pq.e f15190v;

    public e(p0 p0Var, mq.b bVar, pq.e eVar, pq.e eVar2) {
        this.f15187d = p0Var;
        this.f15188e = bVar;
        this.f15189i = eVar;
        this.f15190v = eVar2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        pq.e eVar = this.f15190v;
        return Boolean.valueOf(f.j(this.f15187d, this.f15188e.f0(this.f15189i), eVar));
    }
}

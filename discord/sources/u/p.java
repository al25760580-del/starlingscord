package u;

import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class p extends xn.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Lambda f20894d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f20895e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ q f20896i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f20897v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q qVar, xn.c cVar) {
        super(cVar);
        this.f20896i = qVar;
    }

    @Override // xn.a
    public final Object invokeSuspend(Object obj) {
        this.f20895e = obj;
        this.f20897v |= Integer.MIN_VALUE;
        this.f20896i.a(null, this);
        return wn.a.f22354d;
    }
}

package e2;

import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes.dex */
public final class r extends xn.c {
    public int E;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f7903d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f7904e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f7905i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Ref.ObjectRef f7906v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public z f7907w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f7908x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ s f7909y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(s sVar, xn.c cVar) {
        super(cVar);
        this.f7909y = sVar;
    }

    @Override // xn.a
    public final Object invokeSuspend(Object obj) {
        this.f7908x = obj;
        this.E |= Integer.MIN_VALUE;
        return this.f7909y.a(null, this);
    }
}

package e2;

import java.io.Serializable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class q extends xn.c {
    public final /* synthetic */ z E;
    public int F;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public z f7896d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f7897e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Serializable f7898i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Object f7899v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public s f7900w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Iterator f7901x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f7902y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(z zVar, xn.c cVar) {
        super(cVar);
        this.E = zVar;
    }

    @Override // xn.a
    public final Object invokeSuspend(Object obj) {
        this.f7902y = obj;
        this.F |= Integer.MIN_VALUE;
        return this.E.c(this);
    }
}

package dr;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends xn.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public er.v f7700d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f7701e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ a4.h f7702i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f7703v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(a4.h hVar, Continuation continuation) {
        super(continuation);
        this.f7702i = hVar;
    }

    @Override // xn.a
    public final Object invokeSuspend(Object obj) {
        this.f7701e = obj;
        this.f7703v |= Integer.MIN_VALUE;
        return this.f7702i.collect(null, this);
    }
}

package h1;

import a4.j;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes.dex */
public final class a extends xn.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f10277d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f10278e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ j f10279i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(j jVar, Continuation continuation) {
        super(continuation);
        this.f10279i = jVar;
    }

    @Override // xn.a
    public final Object invokeSuspend(Object obj) {
        this.f10277d = obj;
        this.f10278e |= Integer.MIN_VALUE;
        return this.f10279i.emit(null, this);
    }
}

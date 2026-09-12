package er;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends xn.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public i f8677d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f8678e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Job f8679i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f8680v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i f8681w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f8682x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, Continuation continuation) {
        super(continuation);
        this.f8681w = iVar;
    }

    @Override // xn.a
    public final Object invokeSuspend(Object obj) {
        this.f8680v = obj;
        this.f8682x |= Integer.MIN_VALUE;
        return this.f8681w.emit(null, this);
    }
}

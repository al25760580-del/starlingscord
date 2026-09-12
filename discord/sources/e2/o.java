package e2;

import com.margelo.nitro.rive.f1;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes.dex */
public final class o extends xn.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f7887d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f7888e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ f1 f7889i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(f1 f1Var, Continuation continuation) {
        super(continuation);
        this.f7889i = f1Var;
    }

    @Override // xn.a
    public final Object invokeSuspend(Object obj) {
        this.f7887d = obj;
        this.f7888e |= Integer.MIN_VALUE;
        return this.f7889i.emit(null, this);
    }
}

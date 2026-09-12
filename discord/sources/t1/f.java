package t1;

import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import n1.h;
import o1.l;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements Function0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f20580d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Executor f20581e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ h f20582i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ l f20583v;

    public /* synthetic */ f(Executor executor, h hVar, l lVar, int i7) {
        this.f20580d = i7;
        this.f20581e = executor;
        this.f20582i = hVar;
        this.f20583v = lVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f20580d) {
            case 0:
                this.f20581e.execute(new g(this.f20582i, this.f20583v, 1));
                break;
            default:
                this.f20581e.execute(new g(this.f20582i, this.f20583v, 2));
                break;
        }
        return Unit.f14616a;
    }
}

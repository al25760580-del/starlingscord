package d0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7551d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p f7552e;

    public /* synthetic */ l(p pVar, int i7) {
        this.f7551d = i7;
        this.f7552e = pVar;
    }

    @Override // d0.h
    public final double invoke(double d6) {
        switch (this.f7551d) {
            case 0:
                p this$0 = this.f7552e;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                return lo.j.b(this$0.k.invoke(d6), this$0.f7561e, this$0.f7562f);
            default:
                p this$1 = this.f7552e;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                return this$1.f7567m.invoke(lo.j.b(d6, this$1.f7561e, this$1.f7562f));
        }
    }
}

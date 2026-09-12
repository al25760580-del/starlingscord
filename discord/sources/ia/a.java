package ia;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f11411d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d f11412e;

    public /* synthetic */ a(d dVar, int i7) {
        this.f11411d = i7;
        this.f11412e = dVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f11411d) {
            case 0:
                d this$0 = this.f11412e;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                return new c(this$0);
            case 1:
                d this$1 = this.f11412e;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                return this$1.f11422a.B(this$1.f11426e);
            default:
                d this$2 = this.f11412e;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                return this$2.f11422a.B(this$2.f11427f);
        }
    }
}

package t1;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f20570d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function1 f20571e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f20572i;

    public /* synthetic */ b(Function1 function1, Ref.ObjectRef objectRef, int i7) {
        this.f20570d = i7;
        this.f20571e = function1;
        this.f20572i = objectRef;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f20570d) {
            case 0:
                this.f20571e.invoke(this.f20572i.element);
                break;
            default:
                this.f20571e.invoke(this.f20572i.element);
                break;
        }
        return Unit.f14616a;
    }
}

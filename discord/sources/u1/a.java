package u1;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import o1.l;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f20909d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d f20910e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ l f20911i;

    public /* synthetic */ a(d dVar, l lVar, int i7) {
        this.f20909d = i7;
        this.f20910e = dVar;
        this.f20911i = lVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f20909d) {
            case 0:
                d dVar = this.f20910e;
                dVar.g().execute(new b(dVar, this.f20911i, 2));
                break;
            default:
                d dVar2 = this.f20910e;
                dVar2.g().execute(new b(dVar2, this.f20911i, 1));
                break;
        }
        return Unit.f14616a;
    }
}

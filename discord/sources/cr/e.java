package cr;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e extends FunctionReferenceImpl implements Function3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e f7350d = new e(3, h.class, "processResultSelectReceiveCatching", "processResultSelectReceiveCatching(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        h hVar = (h) obj;
        AtomicLongFieldUpdater atomicLongFieldUpdater = h.f7357e;
        hVar.getClass();
        if (obj3 == j.f7374l) {
            obj3 = new l(hVar.t());
        }
        return new n(obj3);
    }
}

package ar;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c1 extends FunctionReferenceImpl implements Function1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2902d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c1(int i7, Object obj, Class cls, String str, String str2, int i10, int i11) {
        super(i7, obj, cls, str, str2, i10);
        this.f2902d = i11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f2902d) {
            case 0:
                ((d1) this.receiver).k((Throwable) obj);
                return Unit.f14616a;
            case 1:
                up.e p3 = (up.e) obj;
                Intrinsics.checkNotNullParameter(p3, "p0");
                return ((ip.p) this.receiver).N(p3);
            case 2:
                up.e p5 = (up.e) obj;
                Intrinsics.checkNotNullParameter(p5, "p0");
                return ((ip.p) this.receiver).O(p5);
            case 3:
                String p6 = (String) obj;
                Intrinsics.checkNotNullParameter(p6, "p0");
                ((iq.d) this.receiver).getClass();
                return iq.d.a(p6);
            case 4:
                up.e p10 = (up.e) obj;
                Intrinsics.checkNotNullParameter(p10, "p0");
                return ((jq.j) this.receiver).q0(p10);
            case 5:
                mq.f p11 = (mq.f) obj;
                Intrinsics.checkNotNullParameter(p11, "p0");
                return new jq.h((jq.j) this.receiver, p11);
            default:
                pq.d p12 = (pq.d) obj;
                Intrinsics.checkNotNullParameter(p12, "p0");
                return ((mq.e) this.receiver).a(p12);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(Object obj) {
        super(1, obj, jq.j.class, "getValueClassPropertyType", "getValueClassPropertyType(Lorg/jetbrains/kotlin/name/Name;)Lorg/jetbrains/kotlin/types/SimpleType;", 0);
        this.f2902d = 4;
    }
}

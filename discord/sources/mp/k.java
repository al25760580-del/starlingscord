package mp;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements Function1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f15987d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f15988e;

    public /* synthetic */ k(String str, int i7) {
        this.f15987d = i7;
        this.f15988e = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        p function = (p) obj;
        switch (this.f15987d) {
            case 0:
                Intrinsics.checkNotNullParameter(function, "$this$function");
                function.c(this.f15988e, l.f15990b);
                break;
            case 1:
                Intrinsics.checkNotNullParameter(function, "$this$function");
                d dVar = l.f15990b;
                function.c(this.f15988e, dVar, dVar);
                break;
            case 2:
                Intrinsics.checkNotNullParameter(function, "$this$function");
                d dVar2 = l.f15990b;
                function.a(this.f15988e, dVar2, dVar2);
                break;
            case 3:
                Intrinsics.checkNotNullParameter(function, "$this$function");
                function.a(this.f15988e, l.f15990b);
                break;
            case 4:
                Intrinsics.checkNotNullParameter(function, "$this$function");
                function.a(this.f15988e, l.f15990b);
                break;
            case 5:
                Intrinsics.checkNotNullParameter(function, "$this$function");
                function.c(this.f15988e, l.f15990b);
                break;
            default:
                Intrinsics.checkNotNullParameter(function, "$this$function");
                function.c(this.f15988e, l.f15990b);
                break;
        }
        return Unit.f14616a;
    }
}

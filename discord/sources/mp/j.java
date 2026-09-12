package mp;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements Function1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f15984d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f15985e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f15986i;

    public /* synthetic */ j(int i7, String str, String str2) {
        this.f15984d = i7;
        this.f15985e = str;
        this.f15986i = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        p function = (p) obj;
        switch (this.f15984d) {
            case 0:
                Intrinsics.checkNotNullParameter(function, "$this$function");
                d dVar = l.f15990b;
                String str = this.f15985e;
                function.a(str, dVar);
                d dVar2 = l.f15989a;
                function.a(this.f15986i, dVar, dVar, dVar2, dVar2);
                function.c(str, dVar2);
                break;
            case 1:
                Intrinsics.checkNotNullParameter(function, "$this$function");
                d dVar3 = l.f15990b;
                String str2 = this.f15985e;
                function.a(str2, dVar3);
                function.a(this.f15986i, dVar3, dVar3, dVar3);
                function.c(str2, dVar3);
                break;
            case 2:
                Intrinsics.checkNotNullParameter(function, "$this$function");
                d dVar4 = l.f15990b;
                String str3 = this.f15985e;
                function.a(str3, dVar4);
                d dVar5 = l.f15991c;
                d dVar6 = l.f15989a;
                function.a(this.f15986i, dVar4, dVar4, dVar5, dVar6);
                function.c(str3, dVar6);
                break;
            case 3:
                Intrinsics.checkNotNullParameter(function, "$this$function");
                d dVar7 = l.f15990b;
                String str4 = this.f15985e;
                function.a(str4, dVar7);
                d dVar8 = l.f15991c;
                function.a(str4, dVar8);
                d dVar9 = l.f15989a;
                function.a(this.f15986i, dVar7, dVar8, dVar8, dVar9);
                function.c(str4, dVar9);
                break;
            case 4:
                Intrinsics.checkNotNullParameter(function, "$this$function");
                d dVar10 = l.f15991c;
                function.a(this.f15985e, dVar10);
                function.c(this.f15986i, l.f15990b, dVar10);
                break;
            default:
                Intrinsics.checkNotNullParameter(function, "$this$function");
                function.a(this.f15985e, l.f15989a);
                function.c(this.f15986i, l.f15990b, l.f15991c);
                break;
        }
        return Unit.f14616a;
    }
}

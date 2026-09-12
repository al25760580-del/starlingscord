package ip;

import java.util.Collection;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d0 extends vq.m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ vo.f f13335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LinkedHashSet f13336c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function1 f13337d;

    public d0(vo.f fVar, LinkedHashSet linkedHashSet, Function1 function1) {
        this.f13335b = fVar;
        this.f13336c = linkedHashSet;
        this.f13337d = function1;
    }

    @Override // vq.m
    public final boolean d(Object obj) {
        vo.f current = (vo.f) obj;
        Intrinsics.checkNotNullParameter(current, "current");
        if (current == this.f13335b) {
            return true;
        }
        eq.o oVarF = current.F();
        Intrinsics.checkNotNullExpressionValue(oVarF, "getStaticScope(...)");
        if (!(oVarF instanceof f0)) {
            return true;
        }
        this.f13336c.addAll((Collection) this.f13337d.invoke(oVarF));
        return false;
    }

    @Override // vq.m
    public final /* bridge */ /* synthetic */ Object k() {
        return Unit.f14616a;
    }
}

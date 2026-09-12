package bp;

import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class r extends w implements lp.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Constructor f3368a;

    public r(Constructor member) {
        Intrinsics.checkNotNullParameter(member, "member");
        this.f3368a = member;
    }

    @Override // bp.w
    public final Member b() {
        return this.f3368a;
    }

    @Override // lp.e
    public final ArrayList getTypeParameters() {
        TypeVariable[] typeParameters = this.f3368a.getTypeParameters();
        Intrinsics.checkNotNullExpressionValue(typeParameters, "getTypeParameters(...)");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable typeVariable : typeParameters) {
            arrayList.add(new c0(typeVariable));
        }
        return arrayList;
    }
}

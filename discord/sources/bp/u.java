package bp;

import java.lang.reflect.Field;
import java.lang.reflect.Member;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class u extends w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field f3370a;

    public u(Field member) {
        Intrinsics.checkNotNullParameter(member, "member");
        this.f3370a = member;
    }

    @Override // bp.w
    public final Member b() {
        return this.f3370a;
    }
}

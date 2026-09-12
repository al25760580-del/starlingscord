package lq;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u0 f15261a = new u0();

    public boolean a() {
        return false;
    }

    public boolean b() {
        return false;
    }

    public final y0 c() {
        y0 y0VarE = y0.e(this);
        Intrinsics.checkNotNullExpressionValue(y0VarE, "create(...)");
        return y0VarE;
    }

    public wo.h d(wo.h annotations) {
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        return annotations;
    }

    public abstract t0 e(z zVar);

    public boolean f() {
        return this instanceof u0;
    }

    public z g(z topLevelType, e1 position) {
        Intrinsics.checkNotNullParameter(topLevelType, "topLevelType");
        Intrinsics.checkNotNullParameter(position, "position");
        return topLevelType;
    }
}

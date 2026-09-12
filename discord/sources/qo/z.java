package qo;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class z implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Method f18975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f18976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Class f18977c;

    public z(Method method, List list) {
        this.f18975a = method;
        this.f18976b = list;
        Class<?> returnType = method.getReturnType();
        Intrinsics.checkNotNullExpressionValue(returnType, "getReturnType(...)");
        this.f18977c = returnType;
    }

    @Override // qo.g
    public final List a() {
        return this.f18976b;
    }

    @Override // qo.g
    public final /* bridge */ /* synthetic */ Member b() {
        return null;
    }

    @Override // qo.g
    public final boolean c() {
        return false;
    }

    @Override // qo.g
    public final Type getReturnType() {
        return this.f18977c;
    }
}

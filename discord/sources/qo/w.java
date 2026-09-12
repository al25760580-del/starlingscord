package qo;

import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.collections.d0;
import kotlin.jvm.internal.SpreadBuilder;

/* JADX INFO: loaded from: classes3.dex */
public abstract class w implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Member f18970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Type f18971b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Class f18972c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f18973d;

    /* JADX WARN: Code duplicated, block: B:6:0x0027  */
    public w(Member member, Type type, Class cls, Type[] typeArr) {
        List listH;
        this.f18970a = member;
        this.f18971b = type;
        this.f18972c = cls;
        if (cls != null) {
            SpreadBuilder spreadBuilder = new SpreadBuilder(2);
            spreadBuilder.add(cls);
            spreadBuilder.addSpread(typeArr);
            listH = d0.g(spreadBuilder.toArray(new Type[spreadBuilder.size()]));
            listH = listH == null ? kotlin.collections.y.H(typeArr) : listH;
        }
        this.f18973d = listH;
    }

    @Override // qo.g
    public final List a() {
        return this.f18973d;
    }

    @Override // qo.g
    public final Member b() {
        return this.f18970a;
    }

    @Override // qo.g
    public final boolean c() {
        return false;
    }

    public void d(Object[] objArr) {
        zs.a.l(this, objArr);
    }

    public final void e(Object obj) {
        if (obj == null || !this.f18970a.getDeclaringClass().isInstance(obj)) {
            throw new IllegalArgumentException("An object member requires the object instance passed as the first argument.");
        }
    }

    @Override // qo.g
    public final Type getReturnType() {
        return this.f18971b;
    }
}

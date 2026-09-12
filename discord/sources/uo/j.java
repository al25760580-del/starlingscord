package uo;

import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import yo.z;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends so.i {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f21222h = {kk.b.p(j.class, "customizer", "getCustomizer()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltInsCustomizer;", 0)};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public so.l f21223f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final kq.i f21224g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(kq.l storageManager) {
        super(storageManager);
        h kind = h.f21219d;
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(kind, "kind");
        this.f21224g = new kq.i(storageManager, new fp.b(15, this, storageManager));
    }

    public final o K() {
        return (o) io.sentry.config.a.H(this.f21224g, f21222h[0]);
    }

    @Override // so.i
    public final xo.b d() {
        return K();
    }

    @Override // so.i
    public final Iterable m() {
        Iterable iterableM = super.m();
        Intrinsics.checkNotNullExpressionValue(iterableM, "getClassDescriptorFactories(...)");
        kq.l lVar = this.f20346d;
        Intrinsics.checkNotNullExpressionValue(lVar, "getStorageManager(...)");
        z zVarL = l();
        Intrinsics.checkNotNullExpressionValue(zVarL, "getBuiltInsModule(...)");
        return CollectionsKt.U(iterableM, new g(lVar, zVarL));
    }

    @Override // so.i
    public final xo.d q() {
        return K();
    }
}

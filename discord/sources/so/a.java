package so;

import java.util.ServiceLoader;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements Function0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f20327e = new a(0);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f20328i = new a(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f20329d;

    public /* synthetic */ a(int i7) {
        this.f20329d = i7;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f20329d) {
            case 0:
                b bVar = b.f20330a;
                ServiceLoader serviceLoaderLoad = ServiceLoader.load(c.class, c.class.getClassLoader());
                Intrinsics.checkNotNull(serviceLoaderLoad);
                c cVar = (c) CollectionsKt.L(serviceLoaderLoad);
                if (cVar != null) {
                    return cVar;
                }
                throw new IllegalStateException("No BuiltInsLoader implementation was found. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager");
            default:
                e eVar = new e(new kq.l("DefaultBuiltIns"));
                eVar.c();
                return eVar;
        }
    }
}

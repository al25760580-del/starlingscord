package ia;

import a5.b0;
import com.facebook.imagepipeline.core.DefaultExecutorSupplier;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlin.collections.v0;
import kotlin.collections.w0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pa.u;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f11413d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c f11414e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ d f11415i;

    public /* synthetic */ b(c cVar, d dVar, int i7) {
        this.f11413d = i7;
        this.f11414e = cVar;
        this.f11415i = dVar;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f11413d) {
            case 0:
                c this$0 = this.f11414e;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                d this$1 = this.f11415i;
                Intrinsics.checkNotNullParameter(this$1, "this$1");
                j8.i iVar = (j8.i) this$0.f11416a.getValue();
                u uVar = this$1.f11423b;
                e4.e eVarC = uVar.c(0);
                Intrinsics.checkNotNullExpressionValue(eVarC, "getPooledByteBufferFactory(...)");
                b0 b0VarD = uVar.d();
                Intrinsics.checkNotNullExpressionValue(b0VarD, "getPooledByteStreams(...)");
                DefaultExecutorSupplier defaultExecutorSupplier = (DefaultExecutorSupplier) this$1.f11424c;
                ExecutorService executorService = defaultExecutorSupplier.f4824a;
                Intrinsics.checkNotNullExpressionValue(executorService, "forLocalStorageRead(...)");
                ExecutorService executorService2 = defaultExecutorSupplier.f4824a;
                Intrinsics.checkNotNullExpressionValue(executorService2, "forLocalStorageWrite(...)");
                return new ga.b(iVar, eVarC, b0VarD, executorService, executorService2, this$1.f11425d);
            case 1:
                c this$2 = this.f11414e;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                d this$3 = this.f11415i;
                Intrinsics.checkNotNullParameter(this$3, "this$1");
                j8.i iVar2 = (j8.i) this$2.f11418c.getValue();
                u uVar2 = this$3.f11423b;
                e4.e eVarC2 = uVar2.c(0);
                Intrinsics.checkNotNullExpressionValue(eVarC2, "getPooledByteBufferFactory(...)");
                b0 b0VarD2 = uVar2.d();
                Intrinsics.checkNotNullExpressionValue(b0VarD2, "getPooledByteStreams(...)");
                DefaultExecutorSupplier defaultExecutorSupplier2 = (DefaultExecutorSupplier) this$3.f11424c;
                ExecutorService executorService3 = defaultExecutorSupplier2.f4824a;
                Intrinsics.checkNotNullExpressionValue(executorService3, "forLocalStorageRead(...)");
                ExecutorService executorService4 = defaultExecutorSupplier2.f4824a;
                Intrinsics.checkNotNullExpressionValue(executorService4, "forLocalStorageWrite(...)");
                return new ga.b(iVar2, eVarC2, b0VarD2, executorService3, executorService4, this$3.f11425d);
            case 2:
                Intrinsics.checkNotNullParameter(this.f11415i, "this$0");
                Intrinsics.checkNotNullParameter(this.f11414e, "this$1");
                return w0.d();
            default:
                d this$4 = this.f11415i;
                u uVar3 = this$4.f11423b;
                c this$5 = this.f11414e;
                Intrinsics.checkNotNullParameter(this$5, "this$0");
                Intrinsics.checkNotNullParameter(this$4, "this$1");
                Map map = (Map) this$5.f11420e.getValue();
                LinkedHashMap linkedHashMap = new LinkedHashMap(v0.a(map.size()));
                for (Map.Entry entry : map.entrySet()) {
                    Object key = entry.getKey();
                    j8.i iVar3 = (j8.i) entry.getValue();
                    e eVar = this$4.f11424c;
                    e4.e eVarC3 = uVar3.c(0);
                    Intrinsics.checkNotNullExpressionValue(eVarC3, "getPooledByteBufferFactory(...)");
                    b0 b0VarD3 = uVar3.d();
                    Intrinsics.checkNotNullExpressionValue(b0VarD3, "getPooledByteStreams(...)");
                    DefaultExecutorSupplier defaultExecutorSupplier3 = (DefaultExecutorSupplier) eVar;
                    ExecutorService executorService5 = defaultExecutorSupplier3.f4824a;
                    Intrinsics.checkNotNullExpressionValue(executorService5, "forLocalStorageRead(...)");
                    ExecutorService executorService6 = defaultExecutorSupplier3.f4824a;
                    Intrinsics.checkNotNullExpressionValue(executorService6, "forLocalStorageWrite(...)");
                    linkedHashMap.put(key, new ga.b(iVar3, eVarC3, b0VarD3, executorService5, executorService6, this$4.f11425d));
                }
                return new n8.e(linkedHashMap);
        }
    }

    public /* synthetic */ b(d dVar, c cVar) {
        this.f11413d = 2;
        this.f11415i = dVar;
        this.f11414e = cVar;
    }
}

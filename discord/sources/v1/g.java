package v1;

import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements Function0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f21359d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h f21360e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Throwable f21361i;

    public /* synthetic */ g(h hVar, Throwable th2, int i7) {
        this.f21359d = i7;
        this.f21360e = hVar;
        this.f21361i = th2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f21359d) {
            case 0:
                final h hVar = this.f21360e;
                Executor executor = hVar.f21364g;
                if (executor == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("executor");
                    executor = null;
                }
                final int i7 = 1;
                final Throwable th2 = this.f21361i;
                executor.execute(new Runnable() { // from class: v1.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i7) {
                            case 0:
                                n1.h hVar2 = hVar.f21363f;
                                if (hVar2 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("callback");
                                    hVar2 = null;
                                }
                                hVar2.h(new o1.h(th2.getMessage()));
                                break;
                            default:
                                n1.h hVar3 = hVar.f21363f;
                                if (hVar3 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("callback");
                                    hVar3 = null;
                                }
                                hVar3.h(new q1.a(new p1.a(26), th2.getMessage()));
                                break;
                        }
                    }
                });
                break;
            default:
                final h hVar2 = this.f21360e;
                Executor executor2 = hVar2.f21364g;
                if (executor2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("executor");
                    executor2 = null;
                }
                final int i10 = 0;
                final Throwable th3 = this.f21361i;
                executor2.execute(new Runnable() { // from class: v1.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                n1.h hVar3 = hVar2.f21363f;
                                if (hVar3 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("callback");
                                    hVar3 = null;
                                }
                                hVar3.h(new o1.h(th3.getMessage()));
                                break;
                            default:
                                n1.h hVar4 = hVar2.f21363f;
                                if (hVar4 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("callback");
                                    hVar4 = null;
                                }
                                hVar4.h(new q1.a(new p1.a(26), th3.getMessage()));
                                break;
                        }
                    }
                });
                break;
        }
        return Unit.f14616a;
    }
}

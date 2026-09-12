package w1;

import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import n1.h;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Function0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f21991d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e f21992e;

    public /* synthetic */ d(e eVar, int i7) {
        this.f21991d = i7;
        this.f21992e = eVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f21991d) {
            case 0:
                final e eVar = this.f21992e;
                Executor executor = eVar.f21995g;
                if (executor == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("executor");
                    executor = null;
                }
                final int i7 = 0;
                executor.execute(new Runnable() { // from class: w1.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i7) {
                            case 0:
                                h hVar = eVar.f21994f;
                                if (hVar == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("callback");
                                    hVar = null;
                                }
                                hVar.h(new o1.h("No provider data returned."));
                                break;
                            default:
                                h hVar2 = eVar.f21994f;
                                if (hVar2 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("callback");
                                    hVar2 = null;
                                }
                                hVar2.h(new o1.h("Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context."));
                                break;
                        }
                    }
                });
                break;
            default:
                final e eVar2 = this.f21992e;
                Executor executor2 = eVar2.f21995g;
                if (executor2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("executor");
                    executor2 = null;
                }
                final int i10 = 1;
                executor2.execute(new Runnable() { // from class: w1.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                h hVar = eVar2.f21994f;
                                if (hVar == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("callback");
                                    hVar = null;
                                }
                                hVar.h(new o1.h("No provider data returned."));
                                break;
                            default:
                                h hVar2 = eVar2.f21994f;
                                if (hVar2 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("callback");
                                    hVar2 = null;
                                }
                                hVar2.h(new o1.h("Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context."));
                                break;
                        }
                    }
                });
                break;
        }
        return Unit.f14616a;
    }
}

package v1;

import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements Function0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f21356d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h f21357e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ JSONException f21358i;

    public /* synthetic */ f(h hVar, JSONException jSONException, int i7) {
        this.f21356d = i7;
        this.f21357e = hVar;
        this.f21358i = jSONException;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f21356d) {
            case 0:
                final h hVar = this.f21357e;
                Executor executor = hVar.f21364g;
                if (executor == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("executor");
                    executor = null;
                }
                final int i7 = 0;
                final JSONException jSONException = this.f21358i;
                executor.execute(new Runnable() { // from class: v1.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i7) {
                            case 0:
                                n1.h hVar2 = hVar.f21363f;
                                if (hVar2 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("callback");
                                    hVar2 = null;
                                }
                                hVar2.h(new q1.a(new p1.a(4), jSONException.getMessage()));
                                break;
                            default:
                                n1.h hVar3 = hVar.f21363f;
                                if (hVar3 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("callback");
                                    hVar3 = null;
                                }
                                String message = jSONException.getMessage();
                                hVar3.h((message == null || message.length() <= 0) ? new q1.a(new p1.a(4), "Unknown error") : new q1.a(new p1.a(4), message));
                                break;
                        }
                    }
                });
                break;
            default:
                final h hVar2 = this.f21357e;
                Executor executor2 = hVar2.f21364g;
                if (executor2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("executor");
                    executor2 = null;
                }
                final int i10 = 1;
                final JSONException jSONException2 = this.f21358i;
                executor2.execute(new Runnable() { // from class: v1.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                n1.h hVar3 = hVar2.f21363f;
                                if (hVar3 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("callback");
                                    hVar3 = null;
                                }
                                hVar3.h(new q1.a(new p1.a(4), jSONException2.getMessage()));
                                break;
                            default:
                                n1.h hVar4 = hVar2.f21363f;
                                if (hVar4 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("callback");
                                    hVar4 = null;
                                }
                                String message = jSONException2.getMessage();
                                hVar4.h((message == null || message.length() <= 0) ? new q1.a(new p1.a(4), "Unknown error") : new q1.a(new p1.a(4), message));
                                break;
                        }
                    }
                });
                break;
        }
        return Unit.f14616a;
    }
}

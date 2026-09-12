package dl;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends Lambda implements Function1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7682d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f7683e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(float f2, int i7) {
        super(1);
        this.f7682d = i7;
        this.f7683e = f2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f7682d) {
            case 0:
                gl.b obtain = (gl.b) obj;
                Intrinsics.checkNotNullParameter(obtain, "$this$obtain");
                obtain.f10110a = this.f7683e;
                obtain.f10111b = false;
                break;
            default:
                gl.b animateUpdate = (gl.b) obj;
                Intrinsics.checkNotNullParameter(animateUpdate, "$this$animateUpdate");
                animateUpdate.f10110a = this.f7683e;
                animateUpdate.f10111b = true;
                break;
        }
        return Unit.f14616a;
    }
}

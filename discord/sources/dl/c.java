package dl;

import com.otaliastudios.zoom.ScaledPoint;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends Lambda implements Function1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7673d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ScaledPoint f7674e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(ScaledPoint scaledPoint, int i7) {
        super(1);
        this.f7673d = i7;
        this.f7674e = scaledPoint;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f7673d) {
            case 0:
                gl.b applyUpdate = (gl.b) obj;
                Intrinsics.checkNotNullParameter(applyUpdate, "$this$applyUpdate");
                applyUpdate.f10113d = this.f7674e;
                applyUpdate.f10112c = null;
                applyUpdate.f10114e = false;
                applyUpdate.f10115f = false;
                break;
            case 1:
                gl.b animateUpdate = (gl.b) obj;
                Intrinsics.checkNotNullParameter(animateUpdate, "$this$animateUpdate");
                animateUpdate.f10113d = this.f7674e;
                animateUpdate.f10112c = null;
                animateUpdate.f10114e = true;
                animateUpdate.f10115f = true;
                break;
            case 2:
                gl.b applyUpdate2 = (gl.b) obj;
                Intrinsics.checkNotNullParameter(applyUpdate2, "$this$applyUpdate");
                applyUpdate2.f10113d = this.f7674e;
                applyUpdate2.f10112c = null;
                applyUpdate2.f10114e = false;
                applyUpdate2.f10115f = true;
                break;
            default:
                gl.b applyUpdate3 = (gl.b) obj;
                Intrinsics.checkNotNullParameter(applyUpdate3, "$this$applyUpdate");
                applyUpdate3.f10113d = this.f7674e;
                applyUpdate3.f10112c = null;
                applyUpdate3.f10114e = true;
                applyUpdate3.f10115f = true;
                break;
        }
        return Unit.f14616a;
    }
}

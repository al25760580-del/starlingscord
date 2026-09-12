package dl;

import com.otaliastudios.zoom.ZoomEngine;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends Lambda implements Function1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7671d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ZoomEngine f7672e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(ZoomEngine zoomEngine, int i7) {
        super(1);
        this.f7671d = i7;
        this.f7672e = zoomEngine;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f7671d) {
            case 0:
                gl.b applyUpdate = (gl.b) obj;
                Intrinsics.checkNotNullParameter(applyUpdate, "$this$applyUpdate");
                applyUpdate.f10110a = this.f7672e.f7026h.f10943v;
                applyUpdate.f10111b = false;
                applyUpdate.f10118i = false;
                break;
            default:
                gl.b applyUpdate2 = (gl.b) obj;
                Intrinsics.checkNotNullParameter(applyUpdate2, "$this$applyUpdate");
                applyUpdate2.f10110a = this.f7672e.f7027i.f();
                applyUpdate2.f10111b = false;
                break;
        }
        return Unit.f14616a;
    }
}

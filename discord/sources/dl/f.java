package dl;

import com.otaliastudios.zoom.AbsolutePoint;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends Lambda implements Function1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f7678d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f7679e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(float f2, float f7) {
        super(1);
        this.f7678d = f2;
        this.f7679e = f7;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        gl.b obtain = (gl.b) obj;
        Intrinsics.checkNotNullParameter(obtain, "$this$obtain");
        AbsolutePoint absolutePoint = new AbsolutePoint(this.f7678d, this.f7679e);
        obtain.f10113d = null;
        obtain.f10112c = absolutePoint;
        obtain.f10114e = true;
        obtain.f10115f = false;
        return Unit.f14616a;
    }
}

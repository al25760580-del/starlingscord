package dl;

import com.otaliastudios.zoom.AbsolutePoint;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends Lambda implements Function1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f7675d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f7676e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f7677i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(float f2, float f7, float f10) {
        super(1);
        this.f7675d = f2;
        this.f7676e = f7;
        this.f7677i = f10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        gl.b obtain = (gl.b) obj;
        Intrinsics.checkNotNullParameter(obtain, "$this$obtain");
        obtain.f10110a = this.f7675d;
        obtain.f10111b = false;
        AbsolutePoint absolutePoint = new AbsolutePoint(this.f7676e, this.f7677i);
        obtain.f10113d = null;
        obtain.f10112c = absolutePoint;
        obtain.f10114e = false;
        obtain.f10115f = false;
        return Unit.f14616a;
    }
}

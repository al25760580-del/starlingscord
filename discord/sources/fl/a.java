package fl;

import android.graphics.PointF;
import com.otaliastudios.zoom.AbsolutePoint;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends Lambda implements Function1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f9289d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f9290e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f9291i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(float f2, Object obj, int i7) {
        super(1);
        this.f9289d = i7;
        this.f9290e = f2;
        this.f9291i = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f9289d) {
            case 0:
                gl.b applyUpdate = (gl.b) obj;
                Intrinsics.checkNotNullParameter(applyUpdate, "$this$applyUpdate");
                applyUpdate.f10110a = this.f9290e;
                applyUpdate.f10111b = true;
                PointF pointF = (PointF) this.f9291i;
                Float fValueOf = Float.valueOf(pointF.x);
                Float fValueOf2 = Float.valueOf(pointF.y);
                applyUpdate.f10116g = fValueOf;
                applyUpdate.f10117h = fValueOf2;
                applyUpdate.f10115f = true;
                applyUpdate.f10118i = false;
                break;
            default:
                gl.b applyUpdate2 = (gl.b) obj;
                Intrinsics.checkNotNullParameter(applyUpdate2, "$this$applyUpdate");
                applyUpdate2.f10110a = this.f9290e;
                applyUpdate2.f10111b = true;
                AbsolutePoint absolutePoint = (AbsolutePoint) this.f9291i;
                applyUpdate2.f10113d = null;
                applyUpdate2.f10112c = absolutePoint;
                applyUpdate2.f10114e = false;
                applyUpdate2.f10115f = true;
                applyUpdate2.f10118i = false;
                break;
        }
        return Unit.f14616a;
    }
}

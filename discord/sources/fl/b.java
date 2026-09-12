package fl;

import android.graphics.PointF;
import android.view.ScaleGestureDetector;
import com.otaliastudios.zoom.AbsolutePoint;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends Lambda implements Function1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f9292d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f9293e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f9294i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f9295v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(float f2, Object obj, Object obj2, int i7) {
        super(1);
        this.f9292d = i7;
        this.f9293e = f2;
        this.f9294i = obj;
        this.f9295v = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f9292d) {
            case 0:
                gl.b animateUpdate = (gl.b) obj;
                Intrinsics.checkNotNullParameter(animateUpdate, "$this$animateUpdate");
                animateUpdate.f10110a = this.f9293e;
                animateUpdate.f10111b = true;
                AbsolutePoint absolutePoint = (AbsolutePoint) this.f9294i;
                animateUpdate.f10113d = null;
                animateUpdate.f10112c = absolutePoint;
                animateUpdate.f10114e = false;
                animateUpdate.f10115f = true;
                PointF pointF = (PointF) this.f9295v;
                Float fValueOf = Float.valueOf(pointF.x);
                Float fValueOf2 = Float.valueOf(pointF.y);
                animateUpdate.f10116g = fValueOf;
                animateUpdate.f10117h = fValueOf2;
                break;
            default:
                gl.b applyUpdate = (gl.b) obj;
                Intrinsics.checkNotNullParameter(applyUpdate, "$this$applyUpdate");
                applyUpdate.f10110a = this.f9293e;
                applyUpdate.f10111b = true;
                AbsolutePoint absolutePoint2 = ((c) this.f9294i).f9303g;
                applyUpdate.f10113d = null;
                applyUpdate.f10112c = absolutePoint2;
                applyUpdate.f10114e = true;
                applyUpdate.f10115f = true;
                ScaleGestureDetector scaleGestureDetector = (ScaleGestureDetector) this.f9295v;
                Float fValueOf3 = Float.valueOf(scaleGestureDetector.getFocusX());
                Float fValueOf4 = Float.valueOf(scaleGestureDetector.getFocusY());
                applyUpdate.f10116g = fValueOf3;
                applyUpdate.f10117h = fValueOf4;
                break;
        }
        return Unit.f14616a;
    }
}

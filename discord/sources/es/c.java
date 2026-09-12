package es;

import android.animation.ValueAnimator;
import com.otaliastudios.zoom.AbsolutePoint;
import com.otaliastudios.zoom.ScaledPoint;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class c extends Lambda implements Function1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8729d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f8730e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f8731i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i7, Object obj, Object obj2) {
        super(1);
        this.f8729d = i7;
        this.f8730e = obj;
        this.f8731i = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f8729d) {
            case 0:
                IOException it = (IOException) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                h hVar = (h) this.f8730e;
                a3.f fVar = (a3.f) this.f8731i;
                synchronized (hVar) {
                    fVar.g();
                }
                return Unit.f14616a;
            case 1:
                gl.b applyUpdate = (gl.b) obj;
                ValueAnimator valueAnimator = (ValueAnimator) this.f8731i;
                Intrinsics.checkNotNullParameter(applyUpdate, "$this$applyUpdate");
                gl.c cVar = (gl.c) this.f8730e;
                boolean zIsNaN = Float.isNaN(cVar.f10119a);
                boolean z5 = cVar.f10124f;
                if (!zIsNaN) {
                    Object animatedValue = valueAnimator.getAnimatedValue("zoom");
                    if (animatedValue == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
                    }
                    float fFloatValue = ((Float) animatedValue).floatValue();
                    boolean z6 = cVar.f10120b;
                    applyUpdate.f10110a = fFloatValue;
                    applyUpdate.f10111b = z6;
                }
                if (cVar.f10121c != null) {
                    Object animatedValue2 = valueAnimator.getAnimatedValue("panX");
                    if (animatedValue2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
                    }
                    float fFloatValue2 = ((Float) animatedValue2).floatValue();
                    Object animatedValue3 = valueAnimator.getAnimatedValue("panY");
                    if (animatedValue3 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
                    }
                    AbsolutePoint absolutePoint = new AbsolutePoint(fFloatValue2, ((Float) animatedValue3).floatValue());
                    applyUpdate.f10113d = null;
                    applyUpdate.f10112c = absolutePoint;
                    applyUpdate.f10114e = false;
                    applyUpdate.f10115f = z5;
                } else if (cVar.f10122d != null) {
                    Object animatedValue4 = valueAnimator.getAnimatedValue("panX");
                    if (animatedValue4 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
                    }
                    float fFloatValue3 = ((Float) animatedValue4).floatValue();
                    Object animatedValue5 = valueAnimator.getAnimatedValue("panY");
                    if (animatedValue5 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
                    }
                    applyUpdate.f10113d = new ScaledPoint(fFloatValue3, ((Float) animatedValue5).floatValue());
                    applyUpdate.f10112c = null;
                    applyUpdate.f10114e = false;
                    applyUpdate.f10115f = z5;
                }
                Float f2 = cVar.f10125g;
                Float f7 = cVar.f10126h;
                applyUpdate.f10116g = f2;
                applyUpdate.f10117h = f7;
                applyUpdate.f10118i = cVar.f10127i;
                return Unit.f14616a;
            case 2:
                j0.d dVar = (j0.d) this.f8730e;
                j0.e callback = (j0.e) this.f8731i;
                Intrinsics.checkNotNullParameter(callback, "callback");
                synchronized (dVar.f13587w) {
                    dVar.f13589y.remove(callback);
                }
                return Unit.f14616a;
            default:
                ((j0.f) this.f8730e).f13592d.removeFrameCallback((j0.e) this.f8731i);
                return Unit.f14616a;
        }
    }
}

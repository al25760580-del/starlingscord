package lm;

import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.PixelUtil;
import im.s;
import im.z;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f15124e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f15125f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f15126g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f15127h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f15128i;
    public final float j;
    public final float k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float f15129l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final z f15130m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(s handler) {
        super(handler);
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f15124e = handler.f11911y;
        this.f15125f = handler.f11912z;
        this.f15126g = handler.p();
        this.f15127h = handler.q();
        this.f15128i = (handler.f11958n0 - handler.f11954j0) + handler.f11956l0;
        this.j = (handler.f11959o0 - handler.f11955k0) + handler.f11957m0;
        this.k = handler.S;
        this.f15129l = handler.T;
        this.f15130m = handler.f11965u0;
    }

    @Override // lm.b
    public final void a(WritableMap eventData) {
        Intrinsics.checkNotNullParameter(eventData, "eventData");
        super.a(eventData);
        eventData.putDouble("x", PixelUtil.toDIPFromPixel(this.f15124e));
        eventData.putDouble("y", PixelUtil.toDIPFromPixel(this.f15125f));
        eventData.putDouble("absoluteX", PixelUtil.toDIPFromPixel(this.f15126g));
        eventData.putDouble("absoluteY", PixelUtil.toDIPFromPixel(this.f15127h));
        eventData.putDouble("translationX", PixelUtil.toDIPFromPixel(this.f15128i));
        eventData.putDouble("translationY", PixelUtil.toDIPFromPixel(this.j));
        eventData.putDouble("velocityX", PixelUtil.toDIPFromPixel(this.k));
        eventData.putDouble("velocityY", PixelUtil.toDIPFromPixel(this.f15129l));
        z zVar = this.f15130m;
        if (zVar.f12001e == -1.0d) {
            return;
        }
        eventData.putMap("stylusData", zVar.a());
    }
}

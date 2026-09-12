package lm;

import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.PixelUtil;
import im.z;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f15109e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f15110f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f15111g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f15112h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final z f15113i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(im.h handler) {
        super(handler);
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f15109e = handler.f11911y;
        this.f15110f = handler.f11912z;
        this.f15111g = handler.p();
        this.f15112h = handler.q();
        this.f15113i = handler.U;
    }

    @Override // lm.b
    public final void a(WritableMap eventData) {
        Intrinsics.checkNotNullParameter(eventData, "eventData");
        super.a(eventData);
        eventData.putDouble("x", PixelUtil.toDIPFromPixel(this.f15109e));
        eventData.putDouble("y", PixelUtil.toDIPFromPixel(this.f15110f));
        eventData.putDouble("absoluteX", PixelUtil.toDIPFromPixel(this.f15111g));
        eventData.putDouble("absoluteY", PixelUtil.toDIPFromPixel(this.f15112h));
        z zVar = this.f15113i;
        if (zVar.f12001e == -1.0d) {
            return;
        }
        eventData.putMap("stylusData", zVar.a());
    }
}

package lm;

import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.PixelUtil;
import im.q;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f15119e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f15120f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f15121g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f15122h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f15123i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(q handler) {
        super(handler);
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f15119e = handler.k;
        this.f15120f = handler.f11911y;
        this.f15121g = handler.f11912z;
        this.f15122h = handler.p();
        this.f15123i = handler.q();
    }

    @Override // lm.b
    public final void a(WritableMap eventData) {
        Intrinsics.checkNotNullParameter(eventData, "eventData");
        super.a(eventData);
        eventData.putBoolean("pointerInside", this.f15119e);
        eventData.putDouble("x", PixelUtil.toDIPFromPixel(this.f15120f));
        eventData.putDouble("y", PixelUtil.toDIPFromPixel(this.f15121g));
        eventData.putDouble("absoluteX", PixelUtil.toDIPFromPixel(this.f15122h));
        eventData.putDouble("absoluteY", PixelUtil.toDIPFromPixel(this.f15123i));
    }
}

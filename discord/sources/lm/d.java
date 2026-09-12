package lm;

import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.PixelUtil;
import im.i;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f15114e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f15115f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f15116g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f15117h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f15118i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(i handler) {
        super(handler);
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f15114e = handler.f11911y;
        this.f15115f = handler.f11912z;
        this.f15116g = handler.p();
        this.f15117h = handler.q();
        this.f15118i = (int) (handler.Y - handler.X);
    }

    @Override // lm.b
    public final void a(WritableMap eventData) {
        Intrinsics.checkNotNullParameter(eventData, "eventData");
        super.a(eventData);
        eventData.putDouble("x", PixelUtil.toDIPFromPixel(this.f15114e));
        eventData.putDouble("y", PixelUtil.toDIPFromPixel(this.f15115f));
        eventData.putDouble("absoluteX", PixelUtil.toDIPFromPixel(this.f15116g));
        eventData.putDouble("absoluteY", PixelUtil.toDIPFromPixel(this.f15117h));
        eventData.putInt("duration", this.f15118i);
    }
}

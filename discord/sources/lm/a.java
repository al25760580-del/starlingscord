package lm;

import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.PixelUtil;
import im.a0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f15100e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f15101f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f15102g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f15103h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f15104i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(im.b handler) {
        super(handler);
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f15101f = handler.f11911y;
        this.f15102g = handler.f11912z;
        this.f15103h = handler.p();
        this.f15104i = handler.q();
    }

    @Override // lm.b
    public final void a(WritableMap eventData) {
        switch (this.f15100e) {
            case 0:
                Intrinsics.checkNotNullParameter(eventData, "eventData");
                super.a(eventData);
                eventData.putDouble("x", PixelUtil.toDIPFromPixel(this.f15101f));
                eventData.putDouble("y", PixelUtil.toDIPFromPixel(this.f15102g));
                eventData.putDouble("absoluteX", PixelUtil.toDIPFromPixel(this.f15103h));
                eventData.putDouble("absoluteY", PixelUtil.toDIPFromPixel(this.f15104i));
                break;
            default:
                Intrinsics.checkNotNullParameter(eventData, "eventData");
                super.a(eventData);
                eventData.putDouble("x", PixelUtil.toDIPFromPixel(this.f15101f));
                eventData.putDouble("y", PixelUtil.toDIPFromPixel(this.f15102g));
                eventData.putDouble("absoluteX", PixelUtil.toDIPFromPixel(this.f15103h));
                eventData.putDouble("absoluteY", PixelUtil.toDIPFromPixel(this.f15104i));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(a0 handler) {
        super(handler);
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f15101f = handler.f11911y;
        this.f15102g = handler.f11912z;
        this.f15103h = handler.p();
        this.f15104i = handler.q();
    }
}

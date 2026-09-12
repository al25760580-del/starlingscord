package lm;

import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ViewProps;
import im.t;
import im.w;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f15131e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final double f15132f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f15133g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f15134h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final double f15135i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(t handler) {
        super(handler);
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f15132f = handler.S;
        this.f15133g = handler.U;
        this.f15134h = handler.V;
        this.f15135i = handler.T;
    }

    @Override // lm.b
    public final void a(WritableMap eventData) {
        switch (this.f15131e) {
            case 0:
                Intrinsics.checkNotNullParameter(eventData, "eventData");
                super.a(eventData);
                eventData.putDouble("scale", this.f15132f);
                eventData.putDouble("focalX", PixelUtil.toDIPFromPixel(this.f15133g));
                eventData.putDouble("focalY", PixelUtil.toDIPFromPixel(this.f15134h));
                eventData.putDouble("velocity", this.f15135i);
                break;
            default:
                Intrinsics.checkNotNullParameter(eventData, "eventData");
                super.a(eventData);
                eventData.putDouble(ViewProps.ROTATION, this.f15132f);
                eventData.putDouble("anchorX", PixelUtil.toDIPFromPixel(this.f15133g));
                eventData.putDouble("anchorY", PixelUtil.toDIPFromPixel(this.f15134h));
                eventData.putDouble("velocity", this.f15135i);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(w handler) {
        super(handler);
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f15132f = handler.T;
        this.f15133g = handler.V;
        this.f15134h = handler.W;
        this.f15135i = handler.U;
    }
}

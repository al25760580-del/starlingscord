package gn;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.events.Event;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends Event {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f10132d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c f10133e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(int i7, int i10, a mInsets, c mFrame) {
        super(i7, i10);
        Intrinsics.checkNotNullParameter(mInsets, "mInsets");
        Intrinsics.checkNotNullParameter(mFrame, "mFrame");
        this.f10132d = mInsets;
        this.f10133e = mFrame;
    }

    @Override // com.facebook.react.uimanager.events.Event
    /* JADX INFO: renamed from: getEventData */
    public final WritableMap getAccessibilityEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putMap("insets", xr.m.o(this.f10132d));
        c rect = this.f10133e;
        Intrinsics.checkNotNullParameter(rect, "rect");
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        writableMapCreateMap2.putDouble("x", PixelUtil.toDIPFromPixel(rect.f10134a));
        writableMapCreateMap2.putDouble("y", PixelUtil.toDIPFromPixel(rect.f10135b));
        writableMapCreateMap2.putDouble("width", PixelUtil.toDIPFromPixel(rect.f10136c));
        writableMapCreateMap2.putDouble("height", PixelUtil.toDIPFromPixel(rect.f10137d));
        writableMapCreateMap.putMap("frame", writableMapCreateMap2);
        return writableMapCreateMap;
    }

    @Override // com.facebook.react.uimanager.events.Event
    /* JADX INFO: renamed from: getEventName */
    public final String getName() {
        return "topInsetsChange";
    }
}

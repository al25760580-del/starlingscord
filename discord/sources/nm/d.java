package nm;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends Event {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f16972d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f16973e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f16974i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final short f16975v;

    public d(int i7, int i10, float f2, boolean z5, boolean z6, short s2) {
        super(i7, i10);
        this.f16972d = f2;
        this.f16973e = z5;
        this.f16974i = z6;
        this.f16975v = s2;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public final short getCoalescingKey() {
        return this.f16975v;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public final WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble(ReactProgressBarViewManager.PROP_PROGRESS, this.f16972d);
        writableMapCreateMap.putInt("closing", this.f16973e ? 1 : 0);
        writableMapCreateMap.putInt("goingForward", this.f16974i ? 1 : 0);
        return writableMapCreateMap;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public final String getEventName() {
        return "topTransitionProgress";
    }
}

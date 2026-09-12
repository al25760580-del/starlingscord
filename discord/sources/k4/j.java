package k4;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;

/* JADX INFO: loaded from: classes.dex */
public final class j extends Event {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f14306d;

    public j(int i7, int i10, boolean z5) {
        super(i7, i10);
        this.f14306d = z5;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public final short getCoalescingKey() {
        return (short) 0;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public final WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putBoolean("isCancelled", this.f14306d);
        return writableMapCreateMap;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public final String getEventName() {
        return "topAnimationFinish";
    }
}

package nm;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends Event {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f16978d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f16979e;

    public f(int i7, int i10, int i11, boolean z5) {
        super(i7, i10);
        this.f16978d = i11;
        this.f16979e = z5;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public final short getCoalescingKey() {
        return (short) 0;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public final WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt("index", this.f16978d);
        writableMapCreateMap.putBoolean("isStable", this.f16979e);
        return writableMapCreateMap;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public final String getEventName() {
        return "topSheetDetentChanged";
    }
}

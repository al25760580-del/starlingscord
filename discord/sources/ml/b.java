package ml;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.views.textinput.ReactTextChangedEvent;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends Event {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double f15881d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f15882e;

    public b(int i7, double d6) {
        super(i7);
        this.f15881d = d6;
        this.f15882e = true;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public final short getCoalescingKey() {
        return (short) 0;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public final WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt("target", getViewTag());
        writableMapCreateMap.putDouble("value", this.f15881d);
        writableMapCreateMap.putBoolean("fromUser", this.f15882e);
        return writableMapCreateMap;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public final String getEventName() {
        return ReactTextChangedEvent.EVENT_NAME;
    }
}

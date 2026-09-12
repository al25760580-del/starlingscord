package ml;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends Event {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f15883d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final double f15884e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i7, double d6, int i10) {
        super(i7);
        this.f15883d = i10;
        this.f15884e = d6;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public boolean canCoalesce() {
        switch (this.f15883d) {
            case 0:
                return false;
            case 1:
                return false;
            default:
                return super.canCoalesce();
        }
    }

    @Override // com.facebook.react.uimanager.events.Event
    public final short getCoalescingKey() {
        switch (this.f15883d) {
            case 0:
                return (short) 0;
            case 1:
                return (short) 0;
            default:
                return (short) this.f15884e;
        }
    }

    @Override // com.facebook.react.uimanager.events.Event
    public final WritableMap getEventData() {
        switch (this.f15883d) {
            case 0:
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putInt("target", getViewTag());
                writableMapCreateMap.putDouble("value", this.f15884e);
                return writableMapCreateMap;
            case 1:
                WritableMap writableMapCreateMap2 = Arguments.createMap();
                writableMapCreateMap2.putInt("target", getViewTag());
                writableMapCreateMap2.putDouble("value", this.f15884e);
                return writableMapCreateMap2;
            default:
                WritableMap writableMapCreateMap3 = Arguments.createMap();
                writableMapCreateMap3.putDouble("headerHeight", this.f15884e);
                return writableMapCreateMap3;
        }
    }

    @Override // com.facebook.react.uimanager.events.Event
    public final String getEventName() {
        switch (this.f15883d) {
            case 0:
                return "onRNCSliderSlidingComplete";
            case 1:
                return "onRNCSliderSlidingStart";
            default:
                return "topHeaderHeightChange";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(int i7, int i10, double d6) {
        super(i7, i10);
        this.f15883d = 2;
        this.f15884e = d6;
    }
}

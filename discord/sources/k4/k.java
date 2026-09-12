package k4;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;

/* JADX INFO: loaded from: classes.dex */
public final class k extends Event {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f14307d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(int i7, int i10, int i11) {
        super(i7, i10);
        this.f14307d = i11;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public short getCoalescingKey() {
        switch (this.f14307d) {
            case 1:
                return (short) 0;
            case 2:
                return (short) 0;
            case 3:
                return (short) 0;
            case 4:
                return (short) 0;
            case 5:
                return (short) 0;
            case 6:
                return (short) 0;
            case 7:
                return (short) 0;
            case 8:
                return (short) 0;
            case 9:
                return (short) 0;
            case 10:
                return (short) 0;
            case 11:
                return (short) 0;
            case 12:
                return (short) 0;
            case 13:
                return (short) 0;
            default:
                return super.getCoalescingKey();
        }
    }

    @Override // com.facebook.react.uimanager.events.Event
    public final WritableMap getEventData() {
        switch (this.f14307d) {
            case 0:
                return Arguments.createMap();
            case 1:
                return Arguments.createMap();
            case 2:
                return Arguments.createMap();
            case 3:
                return Arguments.createMap();
            case 4:
                return Arguments.createMap();
            case 5:
                return Arguments.createMap();
            case 6:
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putInt("dismissCount", 1);
                return writableMapCreateMap;
            case 7:
                return Arguments.createMap();
            case 8:
                return Arguments.createMap();
            case 9:
                return Arguments.createMap();
            case 10:
                return Arguments.createMap();
            case 11:
                return Arguments.createMap();
            case 12:
                return Arguments.createMap();
            default:
                return Arguments.createMap();
        }
    }

    @Override // com.facebook.react.uimanager.events.Event
    public final String getEventName() {
        switch (this.f14307d) {
            case 0:
                return "topAnimationLoaded";
            case 1:
                return "topAttached";
            case 2:
                return "topHeaderBackButtonClicked";
            case 3:
                return "topDetached";
            case 4:
                return "topAppear";
            case 5:
                return "topDisappear";
            case 6:
                return "topDismissed";
            case 7:
                return "topWillAppear";
            case 8:
                return "topWillDisappear";
            case 9:
                return "topSearchBlur";
            case 10:
                return "topClose";
            case 11:
                return "topSearchFocus";
            case 12:
                return "topOpen";
            default:
                return "topFinishTransitioning";
        }
    }
}

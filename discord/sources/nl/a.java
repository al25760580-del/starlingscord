package nl;

import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends Event {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f16959d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final WritableMap f16960e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(WritableMap mEventData, int i7, int i10) {
        super(i7);
        this.f16959d = i10;
        switch (i10) {
            case 1:
                Intrinsics.checkNotNullParameter(mEventData, "mEventData");
                super(i7);
                this.f16960e = mEventData;
                break;
            case 2:
                Intrinsics.checkNotNullParameter(mEventData, "mEventData");
                super(i7);
                this.f16960e = mEventData;
                break;
            case 3:
                Intrinsics.checkNotNullParameter(mEventData, "mEventData");
                super(i7);
                this.f16960e = mEventData;
                break;
            case 4:
                Intrinsics.checkNotNullParameter(mEventData, "mEventData");
                super(i7);
                this.f16960e = mEventData;
                break;
            case 5:
                Intrinsics.checkNotNullParameter(mEventData, "mEventData");
                super(i7);
                this.f16960e = mEventData;
                break;
            case 6:
                Intrinsics.checkNotNullParameter(mEventData, "mEventData");
                super(i7);
                this.f16960e = mEventData;
                break;
            case 7:
                Intrinsics.checkNotNullParameter(mEventData, "mData");
                super(i7);
                this.f16960e = mEventData;
                mEventData.putString("navigationType", "other");
                mEventData.putBoolean("isTopFrame", true);
                break;
            default:
                Intrinsics.checkNotNullParameter(mEventData, "mEventData");
                this.f16960e = mEventData;
                break;
        }
    }

    @Override // com.facebook.react.uimanager.events.Event
    public final boolean canCoalesce() {
        switch (this.f16959d) {
        }
        return false;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public final void dispatch(RCTEventEmitter rctEventEmitter) {
        switch (this.f16959d) {
            case 0:
                Intrinsics.checkNotNullParameter(rctEventEmitter, "rctEventEmitter");
                rctEventEmitter.receiveEvent(getViewTag(), internal_getEventNameCompat(), this.f16960e);
                break;
            case 1:
                Intrinsics.checkNotNullParameter(rctEventEmitter, "rctEventEmitter");
                rctEventEmitter.receiveEvent(getViewTag(), internal_getEventNameCompat(), this.f16960e);
                break;
            case 2:
                Intrinsics.checkNotNullParameter(rctEventEmitter, "rctEventEmitter");
                rctEventEmitter.receiveEvent(getViewTag(), internal_getEventNameCompat(), this.f16960e);
                break;
            case 3:
                Intrinsics.checkNotNullParameter(rctEventEmitter, "rctEventEmitter");
                rctEventEmitter.receiveEvent(getViewTag(), internal_getEventNameCompat(), this.f16960e);
                break;
            case 4:
                Intrinsics.checkNotNullParameter(rctEventEmitter, "rctEventEmitter");
                rctEventEmitter.receiveEvent(getViewTag(), internal_getEventNameCompat(), this.f16960e);
                break;
            case 5:
                Intrinsics.checkNotNullParameter(rctEventEmitter, "rctEventEmitter");
                rctEventEmitter.receiveEvent(getViewTag(), "topMessage", this.f16960e);
                break;
            case 6:
                Intrinsics.checkNotNullParameter(rctEventEmitter, "rctEventEmitter");
                rctEventEmitter.receiveEvent(getViewTag(), internal_getEventNameCompat(), this.f16960e);
                break;
            default:
                Intrinsics.checkNotNullParameter(rctEventEmitter, "rctEventEmitter");
                rctEventEmitter.receiveEvent(getViewTag(), "topShouldStartLoadWithRequest", this.f16960e);
                break;
        }
    }

    @Override // com.facebook.react.uimanager.events.Event
    public final short getCoalescingKey() {
        switch (this.f16959d) {
        }
        return (short) 0;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public final String getEventName() {
        switch (this.f16959d) {
            case 0:
                return "topHttpError";
            case 1:
                return "topLoadingError";
            case 2:
                return "topLoadingFinish";
            case 3:
                return "topLoadingProgress";
            case 4:
                return "topLoadingStart";
            case 5:
                return "topMessage";
            case 6:
                return "topRenderProcessGone";
            default:
                return "topShouldStartLoadWithRequest";
        }
    }
}

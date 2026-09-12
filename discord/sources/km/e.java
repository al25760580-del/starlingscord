package km;

import androidx.core.util.Pools$SynchronizedPool;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends Event {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final Pools$SynchronizedPool f14598w = new Pools$SynchronizedPool(7);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public WritableMap f14599d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public short f14600e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f14601i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public a f14602v;

    @Override // com.facebook.react.uimanager.events.Event
    public final boolean canCoalesce() {
        int i7 = this.f14601i;
        return !(i7 == 5 || i7 == 6);
    }

    @Override // com.facebook.react.uimanager.events.Event
    public final short getCoalescingKey() {
        return this.f14600e;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public final WritableMap getEventData() {
        return this.f14599d;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public final String getEventName() {
        int i7 = this.f14601i;
        if (!(i7 == 5 || i7 == 6)) {
            return "onGestureHandlerEvent";
        }
        a aVar = this.f14602v;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("eventHandlerType");
            aVar = null;
        }
        return aVar == a.f14583e ? "onGestureHandlerReanimatedTouchEvent" : "onGestureHandlerTouchEvent";
    }

    @Override // com.facebook.react.uimanager.events.Event
    public final void onDispose() {
        this.f14599d = null;
        f14598w.release(this);
    }
}

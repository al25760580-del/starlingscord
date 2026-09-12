package km;

import androidx.core.util.Pools$SynchronizedPool;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import e4.f;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends Event {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final Pools$SynchronizedPool f14586w = new Pools$SynchronizedPool(7);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public lm.b f14587d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public short f14588e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f14589i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public a f14590v;

    @Override // com.facebook.react.uimanager.events.Event
    public final boolean canCoalesce() {
        int i7 = this.f14589i;
        return !(i7 == 5 || i7 == 6);
    }

    @Override // com.facebook.react.uimanager.events.Event
    public final short getCoalescingKey() {
        return this.f14588e;
    }

    @Override // com.facebook.react.uimanager.events.Event
    /* JADX INFO: renamed from: getEventData */
    public final WritableMap getAccessibilityEventData() {
        int i7 = this.f14589i;
        if (i7 != 5 && i7 != 6) {
            lm.b bVar = this.f14587d;
            Intrinsics.checkNotNull(bVar);
            return f.t(bVar);
        }
        lm.b dataBuilder = this.f14587d;
        Intrinsics.checkNotNull(dataBuilder);
        Intrinsics.checkNotNullParameter(dataBuilder, "dataBuilder");
        WritableMap writableMapCreateMap = Arguments.createMap();
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        dataBuilder.a(writableMapCreateMap2);
        Unit unit = Unit.f14616a;
        writableMapCreateMap.putMap("handlerData", writableMapCreateMap2);
        writableMapCreateMap.putInt("handlerTag", dataBuilder.f15105a);
        writableMapCreateMap.putInt("state", dataBuilder.f15106b);
        return writableMapCreateMap;
    }

    @Override // com.facebook.react.uimanager.events.Event
    /* JADX INFO: renamed from: getEventName */
    public final String getName() {
        int i7 = this.f14589i;
        a aVar = null;
        if (!(i7 == 5 || i7 == 6)) {
            a aVar2 = this.f14590v;
            if (aVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("eventHandlerType");
            } else {
                aVar = aVar2;
            }
            return aVar == a.f14584i ? "topGestureHandlerEvent" : "onGestureHandlerEvent";
        }
        a aVar3 = this.f14590v;
        if (aVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("eventHandlerType");
            aVar3 = null;
        }
        if (aVar3 == a.f14584i) {
            return "topGestureHandlerAnimatedEvent";
        }
        a aVar4 = this.f14590v;
        if (aVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("eventHandlerType");
        } else {
            aVar = aVar4;
        }
        return aVar == a.f14583e ? "onGestureHandlerReanimatedEvent" : "onGestureHandlerEvent";
    }

    @Override // com.facebook.react.uimanager.events.Event
    public final void onDispose() {
        this.f14587d = null;
        f14586w.release(this);
    }
}

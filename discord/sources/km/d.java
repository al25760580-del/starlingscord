package km;

import androidx.core.util.Pools$SynchronizedPool;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import gn.h;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends Event {
    public static final Pools$SynchronizedPool E = new Pools$SynchronizedPool(7);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public lm.b f14593d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f14594e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f14595i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f14596v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public a f14597w;

    @Override // com.facebook.react.uimanager.events.Event
    public final boolean canCoalesce() {
        return false;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public final short getCoalescingKey() {
        return (short) 0;
    }

    @Override // com.facebook.react.uimanager.events.Event
    /* JADX INFO: renamed from: getEventData */
    public final WritableMap getAccessibilityEventData() {
        int i7 = this.f14596v;
        if (i7 != 5 && i7 != 6) {
            lm.b bVar = this.f14593d;
            Intrinsics.checkNotNull(bVar);
            return h.n(bVar, this.f14594e, this.f14595i);
        }
        lm.b dataBuilder = this.f14593d;
        Intrinsics.checkNotNull(dataBuilder);
        int i10 = this.f14594e;
        int i11 = this.f14595i;
        Intrinsics.checkNotNullParameter(dataBuilder, "dataBuilder");
        WritableMap writableMapCreateMap = Arguments.createMap();
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        dataBuilder.a(writableMapCreateMap2);
        Unit unit = Unit.f14616a;
        writableMapCreateMap.putMap("handlerData", writableMapCreateMap2);
        writableMapCreateMap.putInt("handlerTag", dataBuilder.f15105a);
        writableMapCreateMap.putInt("state", i10);
        writableMapCreateMap.putInt("oldState", i11);
        return writableMapCreateMap;
    }

    @Override // com.facebook.react.uimanager.events.Event
    /* JADX INFO: renamed from: getEventName */
    public final String getName() {
        int i7 = this.f14596v;
        if (i7 == 5 || i7 == 6) {
            a aVar = this.f14597w;
            if (aVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("eventHandlerType");
                aVar = null;
            }
            if (aVar == a.f14583e) {
                return "onGestureHandlerReanimatedStateChange";
            }
        }
        return "onGestureHandlerStateChange";
    }

    @Override // com.facebook.react.uimanager.events.Event
    public final void onDispose() {
        this.f14593d = null;
        this.f14594e = 0;
        this.f14595i = 0;
        E.release(this);
    }
}

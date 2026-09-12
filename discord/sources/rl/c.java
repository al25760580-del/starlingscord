package rl;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends Event {
    public static final b E = b.Move;
    public static final b F = b.Start;
    public static final b G = b.End;
    public static final b H = b.Interactive;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f19454d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final double f19455e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final double f19456i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f19457v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f19458w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(int i7, int i10, b event, double d6, double d7, int i11, int i12) {
        super(i7, i10);
        Intrinsics.checkNotNullParameter(event, "event");
        this.f19454d = event;
        this.f19455e = d6;
        this.f19456i = d7;
        this.f19457v = i11;
        this.f19458w = i12;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public final short getCoalescingKey() {
        return (short) 0;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public final WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble(ReactProgressBarViewManager.PROP_PROGRESS, this.f19456i);
        writableMapCreateMap.putDouble("height", this.f19455e);
        writableMapCreateMap.putInt("duration", this.f19457v);
        writableMapCreateMap.putInt("target", this.f19458w);
        return writableMapCreateMap;
    }

    @Override // com.facebook.react.uimanager.events.Event
    /* JADX INFO: renamed from: getEventName */
    public final String getName() {
        return this.f19454d.f19453d;
    }
}

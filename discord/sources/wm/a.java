package wm;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends Event implements qm.a {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final i8.b f22345v = new i8.b(20);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f22346d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f22347e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f22348i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(int i7, int i10, String tabKey, int i11, boolean z5) {
        super(i7, i10);
        Intrinsics.checkNotNullParameter(tabKey, "tabKey");
        this.f22346d = tabKey;
        this.f22347e = i11;
        this.f22348i = z5;
    }

    @Override // qm.a
    public final String g() {
        return "onNativeFocusChange";
    }

    @Override // com.facebook.react.uimanager.events.Event
    public final short getCoalescingKey() {
        return (short) ((this.f22347e * 10) + (this.f22348i ? 1 : 0));
    }

    @Override // com.facebook.react.uimanager.events.Event
    public final WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("tabKey", this.f22346d);
        writableMapCreateMap.putBoolean("repeatedSelectionHandledBySpecialEffect", this.f22348i);
        return writableMapCreateMap;
    }

    @Override // com.facebook.react.uimanager.events.Event
    /* JADX INFO: renamed from: getEventName */
    public final String getName() {
        return "topNativeFocusChange";
    }
}

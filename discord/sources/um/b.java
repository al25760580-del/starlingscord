package um;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends c {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final q8.c f21188v = new q8.c();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f21189i;

    public b(int i7, int i10, boolean z5) {
        super(i7, i10, "topDismiss", "onDismiss");
        this.f21189i = z5;
    }

    @Override // um.c, com.facebook.react.uimanager.events.Event
    public final WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putBoolean("isNativeDismiss", this.f21189i);
        return writableMapCreateMap;
    }
}

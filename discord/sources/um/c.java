package um;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c extends Event implements qm.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f21190d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f21191e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(int i7, int i10, String name, String registrationName) {
        super(i7, i10);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(registrationName, "registrationName");
        this.f21190d = name;
        this.f21191e = registrationName;
    }

    @Override // qm.a
    public final String g() {
        return this.f21191e;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public final short getCoalescingKey() {
        return (short) 0;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public WritableMap getEventData() {
        return Arguments.createMap();
    }

    @Override // com.facebook.react.uimanager.events.Event
    /* JADX INFO: renamed from: getEventName */
    public final String getName() {
        return this.f21190d;
    }
}

package wm;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import i8.c;
import io.sentry.hints.j;
import kh.f;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends Event implements qm.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f22349e = new c(20);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final j f22350i = new j(20);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final k8.a f22351v = new k8.a();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final f f22352w = new f(20);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f22353d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i7, int i10, int i11) {
        super(i7, i10);
        this.f22353d = i11;
    }

    @Override // qm.a
    public final String g() {
        switch (this.f22353d) {
            case 0:
                return "onDidAppear";
            case 1:
                return "onDidDisappear";
            case 2:
                return "onWillAppear";
            default:
                return "onWillDisappear";
        }
    }

    @Override // com.facebook.react.uimanager.events.Event
    public final short getCoalescingKey() {
        switch (this.f22353d) {
        }
        return (short) 0;
    }

    @Override // com.facebook.react.uimanager.events.Event
    /* JADX INFO: renamed from: getEventData */
    public final WritableMap getAccessibilityEventData() {
        switch (this.f22353d) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return Arguments.createMap();
    }

    @Override // com.facebook.react.uimanager.events.Event
    /* JADX INFO: renamed from: getEventName */
    public final String getName() {
        switch (this.f22353d) {
            case 0:
                return "topDidAppear";
            case 1:
                return "topDidDisappear";
            case 2:
                return "topWillAppear";
            default:
                return "topWillDisappear";
        }
    }
}

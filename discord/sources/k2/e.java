package k2;

import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.events.EventDispatcher;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f14230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f14231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f14232c;

    public e(ReactContext reactContext, int i7) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.f14231b = reactContext;
        this.f14230a = i7;
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(reactContext, i7);
        if (eventDispatcherForReactTag == null) {
            throw new IllegalStateException(kk.b.h(i7, "[RNScreens] Nullish event dispatcher for view with tag: ").toString());
        }
        this.f14232c = eventDispatcherForReactTag;
    }

    public e(h hVar) {
        this.f14230a = 0;
        this.f14232c = new c();
        this.f14231b = hVar;
    }
}

package qb;

import android.app.Activity;
import ar.v0;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.common.ReactConstants;
import com.github.yamill.orientation.OrientationModule;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import mq.t;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements LifecycleEventListener {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static Integer f18684v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final com.discord.browser_manager.b f18685w;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ReactContext f18686d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final pb.a f18687e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public d f18688i;

    static {
        t destinationFunction = new t(2, new c(), c.class, "tryEmitOrientationDegreesChange", "tryEmitOrientationDegreesChange(ILcom/facebook/react/bridge/ReactContext;)V", 0, 2);
        v0 coroutineScope = v0.f2972d;
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(destinationFunction, "destinationFunction");
        f18685w = new com.discord.browser_manager.b(new Ref.ObjectRef(), new Ref.ObjectRef(), new Ref.ObjectRef(), destinationFunction, 2);
    }

    public e(ReactApplicationContext reactContext, pb.a onGetCurrentActivity) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        Intrinsics.checkNotNullParameter(onGetCurrentActivity, "onGetCurrentActivity");
        this.f18686d = reactContext;
        this.f18687e = onGetCurrentActivity;
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostResume() {
        Activity activity_init_$lambda$2 = OrientationModule._init_$lambda$2(this.f18687e.f17851e);
        if (activity_init_$lambda$2 == null || this.f18688i != null) {
            o8.a.g(ReactConstants.TAG, "no activity to register receiver");
            return;
        }
        d dVar = new d(activity_init_$lambda$2, this);
        this.f18688i = dVar;
        if (dVar.canDetectOrientation()) {
            d dVar2 = this.f18688i;
            if (dVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("orientationEventListener");
                dVar2 = null;
            }
            dVar2.enable();
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostDestroy() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostPause() {
    }
}

package qb;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements LifecycleEventListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ReactContext f18675d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final kotlin.collections.a f18676e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Uri f18677i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f18678v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public b2.a f18679w;

    public a(ReactApplicationContext reactContext, kotlin.collections.a onAutoRotateEnabled) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        Intrinsics.checkNotNullParameter(onAutoRotateEnabled, "onAutoRotateEnabled");
        this.f18675d = reactContext;
        this.f18676e = onAutoRotateEnabled;
        this.f18677i = Settings.System.getUriFor("accelerometer_rotation");
        this.f18678v = "accelerometer_rotation";
        onAutoRotateEnabled.invoke(Boolean.valueOf(Settings.System.getInt(reactContext.getContentResolver(), "accelerometer_rotation", 0) == 1));
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostPause() {
        b2.a aVar = this.f18679w;
        if (aVar != null) {
            this.f18675d.getContentResolver().unregisterContentObserver(aVar);
        }
        this.f18679w = null;
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostResume() {
        Looper looperMyLooper = Looper.myLooper();
        Intrinsics.checkNotNull(looperMyLooper);
        b2.a aVar = new b2.a(this, new Handler(looperMyLooper));
        this.f18679w = aVar;
        ReactContext reactContext = this.f18675d;
        reactContext.getContentResolver().registerContentObserver(this.f18677i, false, aVar);
        this.f18676e.invoke(Boolean.valueOf(Settings.System.getInt(reactContext.getContentResolver(), this.f18678v, 0) == 1));
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostDestroy() {
    }
}

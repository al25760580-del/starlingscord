package io.sentry.android.core.internal.gestures;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import androidx.core.view.GestureDetectorCompat;
import com.facebook.react.uimanager.ViewProps;
import io.sentry.SentryLevel;
import io.sentry.w5;
import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Window.Callback f12241e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final f f12242i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final GestureDetectorCompat f12243v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final w5 f12244w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final i8.c f12245x;

    public g(Window.Callback callback, Activity activity, f fVar, w5 w5Var) {
        GestureDetectorCompat gestureDetectorCompat = new GestureDetectorCompat(activity, fVar, new Handler(Looper.getMainLooper()));
        i8.c cVar = new i8.c(9);
        super(callback);
        this.f12241e = callback;
        this.f12242i = fVar;
        this.f12244w = w5Var;
        this.f12243v = gestureDetectorCompat;
        this.f12245x = cVar;
    }

    public final void a(MotionEvent motionEvent) {
        String str;
        this.f12243v.f1592a.onTouchEvent(motionEvent);
        if (motionEvent.getActionMasked() == 1) {
            f fVar = this.f12242i;
            View viewB = fVar.b("onUp");
            e eVar = fVar.f12240y;
            io.sentry.internal.gestures.b bVar = (io.sentry.internal.gestures.b) eVar.f12233d;
            if (viewB == null || bVar == null) {
                return;
            }
            d dVar = (d) eVar.f12232c;
            d dVar2 = d.Unknown;
            if (dVar == dVar2) {
                fVar.f12236i.getLogger().q(SentryLevel.DEBUG, "Unable to define scroll type. No breadcrumb captured.", new Object[0]);
                return;
            }
            float x5 = motionEvent.getX() - eVar.f12230a;
            float y5 = motionEvent.getY() - eVar.f12231b;
            if (Math.abs(x5) > Math.abs(y5)) {
                str = x5 > 0.0f ? ViewProps.RIGHT : ViewProps.LEFT;
            } else {
                str = y5 > 0.0f ? "down" : "up";
            }
            fVar.a(bVar, (d) eVar.f12232c, Collections.singletonMap("direction", str), motionEvent);
            fVar.c(bVar, (d) eVar.f12232c);
            eVar.f12233d = null;
            eVar.f12232c = dVar2;
            eVar.f12230a = 0.0f;
            eVar.f12231b = 0.0f;
        }
    }

    @Override // io.sentry.android.core.internal.gestures.i, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null) {
            this.f12245x.getClass();
            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
            try {
                a(motionEventObtain);
            } catch (Throwable th2) {
                w5 w5Var = this.f12244w;
                if (w5Var != null) {
                    try {
                        w5Var.getLogger().g(SentryLevel.ERROR, "Error dispatching touch event", th2);
                    } finally {
                        motionEventObtain.recycle();
                    }
                }
            }
        }
        return this.f12247d.dispatchTouchEvent(motionEvent);
    }
}

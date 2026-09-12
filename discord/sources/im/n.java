package im;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.facebook.react.views.textinput.ReactEditText;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class n implements o {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q f11939d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ReactEditText f11940e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f11941i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f11942v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f11943w;

    public n(q handler, ReactEditText editText) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(editText, "editText");
        this.f11939d = handler;
        this.f11940e = editText;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(editText.getContext());
        this.f11943w = viewConfiguration.getScaledTouchSlop() * viewConfiguration.getScaledTouchSlop();
    }

    @Override // im.o
    public final boolean a() {
        return true;
    }

    @Override // im.o
    public final boolean b(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        return true;
    }

    @Override // im.o
    public final boolean c() {
        return true;
    }

    @Override // im.o
    public final boolean d(List list, q qVar) {
        gn.h.S(list, qVar);
        return true;
    }

    @Override // im.o
    public final boolean e(View view) {
        return gn.h.j(view);
    }

    @Override // im.o
    public final void f(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f11939d.a(false);
        this.f11940e.onTouchEvent(event);
        this.f11941i = event.getX();
        this.f11942v = event.getY();
    }

    @Override // im.o
    public final Boolean g(View view, MotionEvent motionEvent) {
        return gn.h.R(view, motionEvent);
    }

    @Override // im.o
    public final Boolean h(f handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        if (handler instanceof q) {
            return null;
        }
        return Boolean.valueOf(!(handler instanceof jm.l));
    }

    @Override // im.o
    public final void i(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (kk.b.c(event.getY(), this.f11942v, event.getY() - this.f11942v, (event.getX() - this.f11941i) * (event.getX() - this.f11941i)) < this.f11943w) {
            this.f11940e.requestFocusFromJS();
        }
    }
}

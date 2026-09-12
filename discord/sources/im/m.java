package im;

import android.view.MotionEvent;
import android.view.View;
import com.facebook.react.views.text.ReactTextView;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class m implements o {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f11938d;

    public /* synthetic */ m(int i7) {
        this.f11938d = i7;
    }

    @Override // im.o
    public final boolean a() {
        switch (this.f11938d) {
            case 0:
                return false;
            case 1:
                return false;
            case 2:
                return true;
            default:
                return false;
        }
    }

    @Override // im.o
    public final boolean b(MotionEvent event) {
        switch (this.f11938d) {
            case 0:
                Intrinsics.checkNotNullParameter(event, "event");
                break;
            case 1:
                Intrinsics.checkNotNullParameter(event, "event");
                break;
            case 2:
                Intrinsics.checkNotNullParameter(event, "event");
                break;
            default:
                Intrinsics.checkNotNullParameter(event, "event");
                break;
        }
        return true;
    }

    @Override // im.o
    public final boolean c() {
        switch (this.f11938d) {
        }
        return false;
    }

    @Override // im.o
    public final boolean d(List list, q qVar) {
        switch (this.f11938d) {
            case 0:
                gn.h.S(list, qVar);
                break;
            case 1:
                gn.h.S(list, qVar);
                break;
            case 2:
                gn.h.S(list, qVar);
                break;
            default:
                gn.h.S(list, qVar);
                break;
        }
        return true;
    }

    @Override // im.o
    public final boolean e(View view) {
        switch (this.f11938d) {
            case 0:
                return gn.h.j(view);
            case 1:
                return gn.h.j(view);
            case 2:
                return gn.h.j(view);
            default:
                Intrinsics.checkNotNullParameter(view, "view");
                return view instanceof ReactTextView;
        }
    }

    @Override // im.o
    public final void f(MotionEvent event) {
        switch (this.f11938d) {
            case 0:
                Intrinsics.checkNotNullParameter(event, "event");
                break;
            case 1:
                Intrinsics.checkNotNullParameter(event, "event");
                break;
            case 2:
                Intrinsics.checkNotNullParameter(event, "event");
                break;
            default:
                Intrinsics.checkNotNullParameter(event, "event");
                break;
        }
    }

    @Override // im.o
    public final Boolean g(View view, MotionEvent event) {
        switch (this.f11938d) {
            case 0:
                return gn.h.R(view, event);
            case 1:
                Intrinsics.checkNotNullParameter(event, "event");
                if (view != null) {
                    return Boolean.valueOf(view.dispatchTouchEvent(event));
                }
                return null;
            case 2:
                return gn.h.R(view, event);
            default:
                return gn.h.R(view, event);
        }
    }

    @Override // im.o
    public final Boolean h(f handler) {
        switch (this.f11938d) {
            case 0:
                Intrinsics.checkNotNullParameter(handler, "handler");
                return null;
            case 1:
                Intrinsics.checkNotNullParameter(handler, "handler");
                return null;
            case 2:
                Intrinsics.checkNotNullParameter(handler, "handler");
                return null;
            default:
                Intrinsics.checkNotNullParameter(handler, "handler");
                return Boolean.FALSE;
        }
    }

    @Override // im.o
    public final void i(MotionEvent event) {
        switch (this.f11938d) {
            case 0:
                Intrinsics.checkNotNullParameter(event, "event");
                break;
            case 1:
                Intrinsics.checkNotNullParameter(event, "event");
                break;
            case 2:
                Intrinsics.checkNotNullParameter(event, "event");
                break;
            default:
                Intrinsics.checkNotNullParameter(event, "event");
                break;
        }
    }
}

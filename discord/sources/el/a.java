package el;

import android.animation.ValueAnimator;
import android.view.MotionEvent;
import androidx.appcompat.widget.i0;
import com.otaliastudios.zoom.ScaledPoint;
import com.otaliastudios.zoom.ZoomEngine;
import com.otaliastudios.zoom.ZoomLogger;
import e4.l;
import fl.c;
import fl.d;
import hl.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;
import w3.q;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ZoomLogger f8452c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0 f8453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8454b;

    static {
        String tag = a.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(tag, "TAG");
        Intrinsics.checkNotNullParameter(tag, "tag");
        f8452c = new ZoomLogger(tag);
    }

    public a(i0 callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f8453a = callback;
    }

    public static String c(int i7) {
        if (i7 == 0) {
            return "IDLE";
        }
        if (i7 == 1) {
            return "SCROLLING";
        }
        if (i7 == 2) {
            return "PINCHING";
        }
        if (i7 != 3) {
            return i7 != 4 ? "" : "FLINGING";
        }
        return "ANIMATING";
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0093  */
    public final int a(MotionEvent event) {
        int actionMasked;
        ZoomEngine zoomEngine = (ZoomEngine) this.f8453a.f1004e;
        ZoomLogger zoomLogger = f8452c;
        zoomLogger.c("processTouchEvent:", "start.");
        if (this.f8454b == 3) {
            return 2;
        }
        Intrinsics.checkNotNullParameter(event, "event");
        c cVar = zoomEngine.k;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(event, "event");
        boolean zOnTouchEvent = cVar.f9301e.onTouchEvent(event);
        zoomLogger.c("processTouchEvent:", "scaleResult:", Boolean.valueOf(zOnTouchEvent));
        if (this.f8454b != 2) {
            Intrinsics.checkNotNullParameter(event, "event");
            d dVar = zoomEngine.j;
            dVar.getClass();
            Intrinsics.checkNotNullParameter(event, "event");
            zOnTouchEvent |= dVar.f9307v.onTouchEvent(event);
            zoomLogger.c("processTouchEvent:", "flingResult:", Boolean.valueOf(zOnTouchEvent));
        }
        int i7 = 1;
        if (this.f8454b == 1 && ((actionMasked = event.getActionMasked()) == 1 || actionMasked == 3)) {
            zoomLogger.a("processTouchEvent:", "up event while scrolling, dispatching endScrollGesture.");
            d dVar2 = zoomEngine.j;
            b bVar = dVar2.f9304d;
            if (bVar.f10938v || bVar.f10939w) {
                ScaledPoint scaledPointC0 = bVar.C0();
                if (scaledPointC0.f7016a == 0.0f && scaledPointC0.f7017b == 0.0f) {
                    dVar2.f9305e.b(0);
                } else {
                    gl.a aVar = dVar2.f9306i;
                    dl.c update = new dl.c(scaledPointC0, i7);
                    Intrinsics.checkNotNullParameter(update, "update");
                    int i10 = gl.c.k;
                    aVar.a(q.v(update));
                }
            } else {
                dVar2.f9305e.b(0);
            }
        }
        if (zOnTouchEvent && this.f8454b != 0) {
            zoomLogger.c("processTouchEvent:", "returning: TOUCH_STEAL");
            return 2;
        }
        if (zOnTouchEvent) {
            zoomLogger.c("processTouchEvent:", "returning: TOUCH_LISTEN");
            return 1;
        }
        zoomLogger.c("processTouchEvent:", "returning: TOUCH_NO");
        b(0);
        return 0;
    }

    public final boolean b(int i7) {
        Object[] objArr = {"trySetState:", c(i7)};
        ZoomLogger zoomLogger = f8452c;
        zoomLogger.c(objArr);
        ZoomEngine zoomEngine = (ZoomEngine) this.f8453a.f1004e;
        if (!zoomEngine.f7027i.f10103h) {
            return false;
        }
        int i10 = this.f8454b;
        if (i7 == i10 && i7 != 3) {
            return true;
        }
        if (i7 == 0) {
            l lVar = zoomEngine.f7023e;
            Iterator it = ((ArrayList) lVar.f7990i).iterator();
            while (it.hasNext()) {
                ((dl.d) it.next()).onIdle((ZoomEngine) lVar.f7989e);
            }
        } else if (i7 != 1) {
            if (i7 != 2) {
                if (i7 == 4 && i10 == 3) {
                    return false;
                }
            } else if (i10 == 3) {
                return false;
            }
        } else if (i10 == 2 || i10 == 3) {
            return false;
        }
        if (i10 == 3) {
            LinkedHashSet linkedHashSet = zoomEngine.f7027i.f10108o;
            Iterator it2 = linkedHashSet.iterator();
            while (it2.hasNext()) {
                ((ValueAnimator) it2.next()).cancel();
            }
            linkedHashSet.clear();
        } else if (i10 == 4) {
            zoomEngine.j.f9308w.forceFinished(true);
        }
        zoomLogger.a("setState:", c(i7));
        this.f8454b = i7;
        return true;
    }
}

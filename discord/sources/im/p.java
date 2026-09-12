package im;

import android.view.MotionEvent;
import android.view.View;
import android.widget.ScrollView;
import com.facebook.react.views.swiperefresh.ReactSwipeRefreshLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class p implements o {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q f11944d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ReactSwipeRefreshLayout f11945e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Float f11946i;

    public p(q handler, ReactSwipeRefreshLayout swipeRefreshLayout) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(swipeRefreshLayout, "swipeRefreshLayout");
        this.f11944d = handler;
        this.f11945e = swipeRefreshLayout;
    }

    @Override // im.o
    public final boolean a() {
        return false;
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
        l lVar;
        f fVar;
        Intrinsics.checkNotNullParameter(event, "event");
        View childAt = this.f11945e.getChildAt(0);
        f fVar2 = null;
        ScrollView view = childAt instanceof ScrollView ? (ScrollView) childAt : null;
        if (view == null) {
            return;
        }
        q qVar = this.f11944d;
        g gVar = qVar.F;
        if (gVar != null) {
            Intrinsics.checkNotNullParameter(view, "view");
            ArrayList arrayListG = gVar.f11919b.g(view);
            if (arrayListG != null) {
                Iterator it = arrayListG.iterator();
                do {
                    if (!it.hasNext()) {
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                    fVar = (f) it.next();
                } while (!(fVar instanceof q));
                fVar2 = fVar;
            }
        }
        Float f2 = this.f11946i;
        if (f2 != null) {
            float fFloatValue = f2.floatValue() - event.getY();
            if (fFloatValue < 0.0f) {
                lVar = l.f11934d;
            } else {
                lVar = fFloatValue > 0.0f ? l.f11935e : l.f11936i;
            }
        } else {
            lVar = l.f11936i;
        }
        if (fVar2 != null && fVar2.f11896h == 4 && (lVar == l.f11935e || view.canScrollVertically(-1))) {
            qVar.m();
        }
        this.f11946i = Float.valueOf(event.getY());
    }

    @Override // im.o
    public final Boolean g(View view, MotionEvent motionEvent) {
        return gn.h.R(view, motionEvent);
    }

    @Override // im.o
    public final Boolean h(f handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        return null;
    }

    @Override // im.o
    public final void i(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
    }
}

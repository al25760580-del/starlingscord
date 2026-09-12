package jm;

import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends im.f {
    public final boolean R = true;
    public final /* synthetic */ m S;

    public l(m mVar, int i7) {
        this.S = mVar;
        this.f11892d = i7;
        this.f11908v = false;
    }

    public final void M(MotionEvent motionEvent) {
        im.g gVar;
        ArrayList arrayList;
        if (this.f11896h == 0) {
            m mVar = this.S;
            if (mVar.f13965f && (gVar = this.F) != null && ((arrayList = gVar.f11923f) == null || !arrayList.isEmpty())) {
                Iterator it = arrayList.iterator();
                do {
                    if (!it.hasNext()) {
                        d();
                        mVar.f13965f = false;
                        break;
                    }
                } while (((im.f) it.next()).f11896h != 4);
            } else {
                d();
                mVar.f13965f = false;
                break;
            }
        }
        if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 10) {
            k();
        }
    }

    @Override // im.f
    public final boolean t() {
        return this.R;
    }

    @Override // im.f
    public final void w() {
        this.S.f13965f = true;
    }

    @Override // im.f
    public final void y(MotionEvent event, MotionEvent sourceEvent) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(sourceEvent, "sourceEvent");
        M(event);
    }

    @Override // im.f
    public final void z(MotionEvent event, MotionEvent sourceEvent) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(sourceEvent, "sourceEvent");
        M(event);
    }
}

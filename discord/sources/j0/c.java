package j0;

import android.view.Choreographer;
import java.util.ArrayList;
import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Choreographer.FrameCallback, Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d f13584d;

    public c(d dVar) {
        this.f13584d = dVar;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.f13584d.f13586v.removeCallbacks(this);
        d.p0(this.f13584d);
        d dVar = this.f13584d;
        synchronized (dVar.f13587w) {
            if (dVar.G) {
                dVar.G = false;
                ArrayList arrayList = dVar.f13589y;
                dVar.f13589y = dVar.E;
                dVar.E = arrayList;
                int size = arrayList.size();
                for (int i7 = 0; i7 < size; i7++) {
                    ((Choreographer.FrameCallback) arrayList.get(i7)).doFrame(j);
                }
                arrayList.clear();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        d.p0(this.f13584d);
        d dVar = this.f13584d;
        synchronized (dVar.f13587w) {
            try {
                if (dVar.f13589y.isEmpty()) {
                    dVar.f13585i.removeFrameCallback(this);
                    dVar.G = false;
                }
                Unit unit = Unit.f14616a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}

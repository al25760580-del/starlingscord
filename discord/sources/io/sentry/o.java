package io.sentry;

import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.discord.jank_stats.JankRecordStore;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class o extends TimerTask {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f12841d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f12842e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f12843i;

    public o(q qVar, ArrayList arrayList) {
        this.f12843i = qVar;
        this.f12842e = arrayList;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        switch (this.f12841d) {
            case 0:
                ArrayList arrayList = (ArrayList) this.f12842e;
                long jCurrentTimeMillis = System.currentTimeMillis();
                q qVar = (q) this.f12843i;
                if (jCurrentTimeMillis - qVar.f13079i > 10) {
                    arrayList.clear();
                    qVar.f13079i = jCurrentTimeMillis;
                    a3 a3Var = new a3(qVar.f13077g.getDateProvider().now().d());
                    Iterator it = qVar.f13074d.iterator();
                    while (it.hasNext()) {
                        ((u0) it.next()).a(a3Var);
                    }
                    for (p pVar : qVar.f13073c.values()) {
                        ArrayList arrayList2 = pVar.f12860a;
                        f1 f1Var = pVar.f12861b;
                        arrayList2.add(a3Var);
                        if (f1Var != null) {
                            if (pVar.f12863d.f13077g.getDateProvider().now().d() > TimeUnit.MILLISECONDS.toNanos(JankRecordStore.FLUSH_INTERVAL_MS) + pVar.f12862c) {
                                arrayList.add(f1Var);
                            }
                        }
                    }
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        qVar.f((f1) it2.next());
                    }
                    break;
                }
                break;
            default:
                ((AccessibilityManager) this.f12842e).sendAccessibilityEvent((AccessibilityEvent) this.f12843i);
                break;
        }
    }

    public o(AccessibilityManager accessibilityManager, AccessibilityEvent accessibilityEvent) {
        this.f12842e = accessibilityManager;
        this.f12843i = accessibilityEvent;
    }
}

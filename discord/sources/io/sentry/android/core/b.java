package io.sentry.android.core;

import android.app.Activity;
import androidx.appcompat.widget.b4;
import androidx.core.app.FrameMetricsAggregator;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f12151d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b4 f12152e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Activity f12153i;

    public /* synthetic */ b(b4 b4Var, Activity activity, int i7) {
        this.f12151d = i7;
        this.f12152e = b4Var;
        this.f12153i = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Activity activity;
        WeakReference weakReference;
        switch (this.f12151d) {
            case 0:
                ((FrameMetricsAggregator) ((io.sentry.util.e) this.f12152e.f909d).a()).a(this.f12153i);
                break;
            default:
                je.u uVar = ((FrameMetricsAggregator) ((io.sentry.util.e) this.f12152e.f909d).a()).f1460a;
                ArrayList arrayList = (ArrayList) uVar.f13850c;
                Iterator it = arrayList.iterator();
                do {
                    boolean zHasNext = it.hasNext();
                    activity = this.f12153i;
                    if (zHasNext) {
                        weakReference = (WeakReference) it.next();
                    }
                    activity.getWindow().removeOnFrameMetricsAvailableListener((x0.i) uVar.f13851d);
                    break;
                } while (weakReference.get() != activity);
                arrayList.remove(weakReference);
                activity.getWindow().removeOnFrameMetricsAvailableListener((x0.i) uVar.f13851d);
                break;
        }
    }
}

package androidx.core.app;

import android.app.Activity;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseIntArray;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import je.u;
import x0.i;

/* JADX INFO: loaded from: classes.dex */
public class FrameMetricsAggregator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f1460a;

    public FrameMetricsAggregator() {
        this(1);
    }

    public final void a(Activity activity) {
        u uVar = this.f1460a;
        uVar.getClass();
        if (u.f13846f == null) {
            HandlerThread handlerThread = new HandlerThread("FrameMetricsAggregator");
            u.f13846f = handlerThread;
            handlerThread.start();
            u.f13847g = new Handler(u.f13846f.getLooper());
        }
        for (int i7 = 0; i7 <= 8; i7++) {
            SparseIntArray[] sparseIntArrayArr = (SparseIntArray[]) uVar.f13849b;
            if (sparseIntArrayArr[i7] == null && (uVar.f13848a & (1 << i7)) != 0) {
                sparseIntArrayArr[i7] = new SparseIntArray();
            }
        }
        activity.getWindow().addOnFrameMetricsAvailableListener((i) uVar.f13851d, u.f13847g);
        ((ArrayList) uVar.f13850c).add(new WeakReference(activity));
    }

    public final void b() {
        u uVar = this.f1460a;
        ArrayList arrayList = (ArrayList) uVar.f13850c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            WeakReference weakReference = (WeakReference) arrayList.get(size);
            Activity activity = (Activity) weakReference.get();
            if (weakReference.get() != null) {
                activity.getWindow().removeOnFrameMetricsAvailableListener((i) uVar.f13851d);
                arrayList.remove(size);
            }
        }
    }

    public FrameMetricsAggregator(int i7) {
        u uVar = new u();
        uVar.f13849b = new SparseIntArray[9];
        uVar.f13850c = new ArrayList();
        uVar.f13851d = new i(uVar);
        uVar.f13848a = i7;
        this.f1460a = uVar;
    }
}

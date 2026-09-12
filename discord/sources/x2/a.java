package x2;

import android.view.FrameMetrics;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import com.discord.R;
import e4.i;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Window.OnFrameMetricsAvailableListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f22592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f22593b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f22594c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f22595d;

    public a(ArrayList delegates) {
        Intrinsics.checkNotNullParameter(delegates, "delegates");
        this.f22592a = delegates;
        this.f22594c = new ArrayList();
        this.f22595d = new ArrayList();
    }

    @Override // android.view.Window.OnFrameMetricsAvailableListener
    public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i7) {
        View decorView;
        synchronized (this) {
            try {
                this.f22593b = true;
                Iterator it = this.f22592a.iterator();
                while (it.hasNext()) {
                    ((Window.OnFrameMetricsAvailableListener) it.next()).onFrameMetricsAvailable(window, frameMetrics, i7);
                }
                if (!this.f22594c.isEmpty()) {
                    Iterator it2 = this.f22594c.iterator();
                    while (it2.hasNext()) {
                        this.f22592a.add((Window.OnFrameMetricsAvailableListener) it2.next());
                    }
                    this.f22594c.clear();
                }
                if (!this.f22595d.isEmpty()) {
                    boolean zIsEmpty = this.f22592a.isEmpty();
                    Iterator it3 = this.f22595d.iterator();
                    while (it3.hasNext()) {
                        this.f22592a.remove((Window.OnFrameMetricsAvailableListener) it3.next());
                    }
                    this.f22595d.clear();
                    if (!zIsEmpty && this.f22592a.isEmpty()) {
                        if (window != null) {
                            window.removeOnFrameMetricsAvailableListener(this);
                        }
                        if (window != null && (decorView = window.getDecorView()) != null) {
                            decorView.setTag(R.id.metricsDelegator, null);
                        }
                    }
                }
                this.f22593b = false;
                Unit unit = Unit.f14616a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (window != null) {
            View view = window.getDecorView();
            Intrinsics.checkNotNullExpressionValue(view, "window.decorView");
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(view, "view");
            ViewParent parent = view.getParent();
            while (parent instanceof View) {
                view = parent;
                parent = view.getParent();
            }
            Object tag = view.getTag(R.id.metricsStateHolder);
            if (tag == null) {
                tag = new h();
                view.setTag(R.id.metricsStateHolder, tag);
            }
            i iVar = ((h) tag).f22606a;
            if (iVar != null) {
                synchronized (((ArrayList) iVar.f7981i)) {
                    int size = ((ArrayList) iVar.f7981i).size() - 1;
                    if (-1 < size) {
                        if (((ArrayList) iVar.f7981i).get(size) != null) {
                            throw new ClassCastException();
                        }
                        throw null;
                    }
                    Unit unit2 = Unit.f14616a;
                }
            }
        }
    }
}

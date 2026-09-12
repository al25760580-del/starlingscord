package x0;

import android.util.SparseIntArray;
import android.view.FrameMetrics;
import android.view.Window;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;

/* JADX INFO: loaded from: classes.dex */
public final class i implements Window.OnFrameMetricsAvailableListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ je.u f22529a;

    public i(je.u uVar) {
        this.f22529a = uVar;
    }

    @Override // android.view.Window.OnFrameMetricsAvailableListener
    public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i7) {
        je.u uVar = this.f22529a;
        int i10 = uVar.f13848a;
        if ((i10 & 1) != 0) {
            je.u.b(((SparseIntArray[]) uVar.f13849b)[0], frameMetrics.getMetric(8));
        }
        if ((i10 & 2) != 0) {
            je.u.b(((SparseIntArray[]) uVar.f13849b)[1], frameMetrics.getMetric(1));
        }
        if ((i10 & 4) != 0) {
            je.u.b(((SparseIntArray[]) uVar.f13849b)[2], frameMetrics.getMetric(3));
        }
        if ((i10 & 8) != 0) {
            je.u.b(((SparseIntArray[]) uVar.f13849b)[3], frameMetrics.getMetric(4));
        }
        if ((i10 & 16) != 0) {
            je.u.b(((SparseIntArray[]) uVar.f13849b)[4], frameMetrics.getMetric(5));
        }
        if ((i10 & 64) != 0) {
            je.u.b(((SparseIntArray[]) uVar.f13849b)[6], frameMetrics.getMetric(7));
        }
        if ((i10 & 32) != 0) {
            je.u.b(((SparseIntArray[]) uVar.f13849b)[5], frameMetrics.getMetric(6));
        }
        if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0) {
            je.u.b(((SparseIntArray[]) uVar.f13849b)[7], frameMetrics.getMetric(0));
        }
        if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0) {
            je.u.b(((SparseIntArray[]) uVar.f13849b)[8], frameMetrics.getMetric(2));
        }
    }
}

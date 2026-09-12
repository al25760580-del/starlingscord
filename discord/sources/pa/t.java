package pa;

import android.util.SparseIntArray;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import org.webrtc.PeerConnection;

/* JADX INFO: loaded from: classes3.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f17830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f17831b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f17832c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q8.c f17833d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final v f17834e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final s f17835f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final v f17836g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final s f17837h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f17838i;
    public final int j;

    public t(ga.l lVar) {
        sa.a.w();
        this.f17830a = j.a();
        this.f17831b = s.l();
        int i7 = k.f17823a;
        int i10 = i7 * 4194304;
        SparseIntArray sparseIntArray = new SparseIntArray();
        for (int i11 = 131072; i11 <= 4194304; i11 *= 2) {
            sparseIntArray.put(i11, i7);
        }
        this.f17832c = new v(4194304, i10, sparseIntArray, k.f17823a);
        this.f17833d = q8.c.i();
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        sparseIntArray2.put(IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET, 5);
        sparseIntArray2.put(RecyclerView.ItemAnimator.FLAG_MOVED, 5);
        sparseIntArray2.put(RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT, 5);
        sparseIntArray2.put(8192, 5);
        sparseIntArray2.put(16384, 5);
        sparseIntArray2.put(PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS, 5);
        sparseIntArray2.put(65536, 5);
        sparseIntArray2.put(131072, 5);
        sparseIntArray2.put(262144, 2);
        sparseIntArray2.put(524288, 2);
        sparseIntArray2.put(1048576, 2);
        int iMin = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        int i12 = iMin < 16777216 ? 3145728 : iMin < 33554432 ? 6291456 : 12582912;
        int iMin2 = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        this.f17834e = new v(i12, iMin2 < 16777216 ? iMin2 / 2 : (iMin2 / 4) * 3, sparseIntArray2, -1);
        this.f17835f = s.l();
        v vVar = (v) lVar.f9547e;
        if (vVar == null) {
            SparseIntArray sparseIntArray3 = new SparseIntArray();
            sparseIntArray3.put(16384, 5);
            vVar = new v(81920, 1048576, sparseIntArray3, -1);
        }
        this.f17836g = vVar;
        this.f17837h = s.l();
        this.f17838i = "legacy";
        this.j = 4194304;
        sa.a.w();
    }
}

package ag;

import android.hardware.Camera;
import android.view.View;
import java.util.Comparator;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class t implements Comparator {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f579d;

    public /* synthetic */ t(int i7) {
        this.f579d = i7;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f579d) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                Map.Entry entry2 = (Map.Entry) obj2;
                w wVar = w.f586x;
                Objects.requireNonNull(entry);
                Objects.requireNonNull(entry2);
                Comparable comparable = (Comparable) entry.getKey();
                Comparable comparable2 = (Comparable) entry2.getKey();
                comparable.getClass();
                comparable2.getClass();
                return comparable.compareTo(comparable2);
            case 1:
                return ((View) obj).getTop() - ((View) obj2).getTop();
            case 2:
                return ((byte[]) obj).length - ((byte[]) obj2).length;
            case 3:
                Camera.Size size = (Camera.Size) obj;
                Camera.Size size2 = (Camera.Size) obj2;
                return Integer.compare(size2.height * size2.width, size.height * size.width);
            case 4:
                int[] iArr = (int[]) obj;
                int[] iArr2 = (int[]) obj2;
                int iCompare = Integer.compare(iArr2[1], iArr[1]);
                return iCompare == 0 ? Integer.compare(iArr2[0], iArr[0]) : iCompare;
            case 5:
                long jA = ((j8.a) obj).a();
                long jA2 = ((j8.a) obj2).a();
                if (jA < jA2) {
                    return -1;
                }
                return jA2 == jA ? 0 : 1;
            case 6:
                return ((net.time4j.r0) obj).n((net.time4j.r0) obj2);
            case 7:
                xr.h hVar = (xr.h) ((xr.r) obj).b();
                xr.h hVar2 = (xr.h) ((xr.r) obj2).b();
                int iCompare2 = Double.compare(hVar2.getLength(), hVar.getLength());
                if (iCompare2 != 0 || hVar.equals(hVar2)) {
                    return iCompare2;
                }
                throw new IllegalArgumentException("Mixing different units of same length not allowed.");
            case 8:
                return ((net.time4j.tz.f) obj).a().compareTo(((net.time4j.tz.f) obj2).a());
            case 9:
                return ((p0.e) obj).f17759e - ((p0.e) obj2).f17759e;
            case 10:
                return tn.a.a((Integer) ((Pair) obj).f14612d, (Integer) ((Pair) obj2).f14612d);
            case 11:
                return tn.a.a((Integer) ((Pair) obj).f14612d, (Integer) ((Pair) obj2).f14612d);
            default:
                WeakHashMap weakHashMap = androidx.core.view.u0.f1729a;
                float fG = androidx.core.view.l0.g((View) obj);
                float fG2 = androidx.core.view.l0.g((View) obj2);
                if (fG > fG2) {
                    return -1;
                }
                return fG < fG2 ? 1 : 0;
        }
    }
}

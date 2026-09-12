package lq;

import java.util.Comparator;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class x implements Comparator {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f15262d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f15263e;

    public /* synthetic */ x(int i7, Object obj) {
        this.f15262d = i7;
        this.f15263e = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        double dDoubleValue;
        switch (this.f15262d) {
            case 0:
                z zVar = (z) obj;
                Function1 function1 = (Function1) this.f15263e;
                Intrinsics.checkNotNull(zVar);
                String string = function1.invoke(zVar).toString();
                z zVar2 = (z) obj2;
                Intrinsics.checkNotNull(zVar2);
                return tn.a.a(string, function1.invoke(zVar2).toString());
            default:
                Map map = (Map) this.f15263e;
                Double d6 = (Double) map.get(obj);
                double dDoubleValue2 = Double.NaN;
                if (d6 == null) {
                    dDoubleValue = obj instanceof xr.h ? ((xr.h) xr.h.class.cast(obj)).getLength() : Double.NaN;
                } else {
                    dDoubleValue = d6.doubleValue();
                }
                Double d7 = (Double) map.get(obj2);
                if (d7 != null) {
                    dDoubleValue2 = d7.doubleValue();
                } else if (obj2 instanceof xr.h) {
                    dDoubleValue2 = ((xr.h) xr.h.class.cast(obj2)).getLength();
                }
                return Double.compare(dDoubleValue, dDoubleValue2);
        }
    }
}

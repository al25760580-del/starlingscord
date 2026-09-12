package tc;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import je.w;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends fq.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f20702i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long[] f20703v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long[] f20704w;

    public static HashMap A0(w wVar) {
        int iX = wVar.x();
        HashMap map = new HashMap(iX);
        for (int i7 = 0; i7 < iX; i7++) {
            String strB0 = B0(wVar);
            Serializable serializableZ0 = z0(wVar.u(), wVar);
            if (serializableZ0 != null) {
                map.put(strB0, serializableZ0);
            }
        }
        return map;
    }

    public static String B0(w wVar) {
        int iZ = wVar.z();
        int i7 = wVar.f13861b;
        wVar.G(iZ);
        return new String(wVar.f13860a, i7, iZ);
    }

    public static Serializable z0(int i7, w wVar) {
        if (i7 == 0) {
            return Double.valueOf(Double.longBitsToDouble(wVar.o()));
        }
        if (i7 == 1) {
            return Boolean.valueOf(wVar.u() == 1);
        }
        if (i7 == 2) {
            return B0(wVar);
        }
        if (i7 != 3) {
            if (i7 == 8) {
                return A0(wVar);
            }
            if (i7 != 10) {
                if (i7 != 11) {
                    return null;
                }
                Date date = new Date((long) Double.longBitsToDouble(wVar.o()));
                wVar.G(2);
                return date;
            }
            int iX = wVar.x();
            ArrayList arrayList = new ArrayList(iX);
            for (int i10 = 0; i10 < iX; i10++) {
                Serializable serializableZ0 = z0(wVar.u(), wVar);
                if (serializableZ0 != null) {
                    arrayList.add(serializableZ0);
                }
            }
            return arrayList;
        }
        HashMap map = new HashMap();
        while (true) {
            String strB0 = B0(wVar);
            int iU = wVar.u();
            if (iU == 9) {
                return map;
            }
            Serializable serializableZ1 = z0(iU, wVar);
            if (serializableZ1 != null) {
                map.put(strB0, serializableZ1);
            }
        }
    }
}

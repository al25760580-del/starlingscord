package ie;

import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class p implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        i iVar = (i) obj;
        i iVar2 = (i) obj2;
        long j = iVar.f11741x;
        long j5 = iVar2.f11741x;
        if (j - j5 == 0) {
            return iVar.compareTo(iVar2);
        }
        return j < j5 ? -1 : 1;
    }
}

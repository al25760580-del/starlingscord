package net.time4j;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class b0 implements Comparator {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f16597d;

    public b0(i0[] i0VarArr) {
        List listAsList = Arrays.asList(i0VarArr);
        if (listAsList.isEmpty()) {
            throw new IllegalArgumentException("Missing units.");
        }
        Collections.sort(listAsList, this);
        int size = listAsList.size();
        int i7 = 0;
        while (i7 < size) {
            xr.h hVar = (xr.h) listAsList.get(i7);
            i7++;
            for (int i10 = i7; i10 < size; i10++) {
                if (hVar.equals(listAsList.get(i10))) {
                    throw new IllegalArgumentException("Duplicate unit: " + hVar);
                }
            }
        }
        this.f16597d = Collections.unmodifiableList(listAsList);
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return Double.compare(((xr.h) obj2).getLength(), ((xr.h) obj).getLength());
    }
}

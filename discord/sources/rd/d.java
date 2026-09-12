package rd;

import java.util.ArrayList;
import mo.c0;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f19263b = {8, 13, 11, 2, 0, 1, 7};

    public static void a(int i7, ArrayList arrayList) {
        if (c0.A(i7, 0, 7, f19263b) == -1 || arrayList.contains(Integer.valueOf(i7))) {
            return;
        }
        arrayList.add(Integer.valueOf(i7));
    }
}

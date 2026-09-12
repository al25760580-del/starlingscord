package lq;

import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d0 extends d1 implements pq.f, pq.g {
    @Override // lq.d1
    /* JADX INFO: renamed from: A0, reason: merged with bridge method [inline-methods] */
    public abstract d0 x0(boolean z5);

    @Override // lq.d1
    /* JADX INFO: renamed from: B0, reason: merged with bridge method [inline-methods] */
    public abstract d0 z0(l0 l0Var);

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = getAnnotations().iterator();
        while (it.hasNext()) {
            String[] value = {"[", wp.f.f22424c.w((wo.b) it.next(), null), "] "};
            Intrinsics.checkNotNullParameter(sb2, "<this>");
            Intrinsics.checkNotNullParameter(value, "value");
            for (int i7 = 0; i7 < 3; i7++) {
                sb2.append(value[i7]);
            }
        }
        sb2.append(r0());
        if (!l0().isEmpty()) {
            CollectionsKt.N(l0(), sb2, ", ", "<", ">", null, 112);
        }
        if (t0()) {
            sb2.append("?");
        }
        return sb2.toString();
    }
}

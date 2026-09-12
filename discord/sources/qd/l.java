package qd;

import android.net.Uri;
import com.google.android.exoplayer2.Format;
import ei.e0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends m {
    public final j E;
    public final pf.b F;

    public l(Format format, e0 e0Var, r rVar, ArrayList arrayList, List list, List list2) {
        super(format, e0Var, rVar, arrayList, list, list2);
        Uri.parse(((b) e0Var.get(0)).f18711a);
        long j = rVar.f18776e;
        j jVar = j <= 0 ? null : new j(rVar.f18775d, j, null);
        this.E = jVar;
        this.F = jVar == null ? new pf.b(1, new j(0L, -1L, null)) : null;
    }

    @Override // qd.m
    public final String a() {
        return null;
    }

    @Override // qd.m
    public final pd.h c() {
        return this.F;
    }

    @Override // qd.m
    public final j d() {
        return this.E;
    }
}

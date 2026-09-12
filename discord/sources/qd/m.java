package qd;

import com.google.android.exoplayer2.Format;
import ei.e0;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Format f18759d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e0 f18760e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f18761i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final List f18762v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final List f18763w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final List f18764x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final j f18765y;

    public m(Format format, List list, s sVar, List list2, List list3, List list4) {
        je.b.g(!list.isEmpty());
        this.f18759d = format;
        this.f18760e = e0.k(list);
        this.f18762v = list2 == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(list2);
        this.f18763w = list3;
        this.f18764x = list4;
        this.f18765y = sVar.a(this);
        this.f18761i = je.e0.P(sVar.f18779c, 1000000L, sVar.f18778b);
    }

    public abstract String a();

    public abstract pd.h c();

    public abstract j d();
}

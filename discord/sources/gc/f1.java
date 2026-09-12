package gc;

import com.google.android.exoplayer2.Timeline;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class f1 implements y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final md.o f9630a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f9633d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f9634e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f9632c = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f9631b = new Object();

    public f1(md.a aVar, boolean z5) {
        this.f9630a = new md.o(aVar, z5);
    }

    @Override // gc.y0
    public final Object a() {
        return this.f9631b;
    }

    @Override // gc.y0
    public final Timeline b() {
        return this.f9630a.L;
    }
}

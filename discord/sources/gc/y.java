package gc;

import com.google.android.exoplayer2.Timeline;

/* JADX INFO: loaded from: classes3.dex */
public final class y implements y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f9948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Timeline f9949b;

    public y(Object obj, Timeline timeline) {
        this.f9948a = obj;
        this.f9949b = timeline;
    }

    @Override // gc.y0
    public final Object a() {
        return this.f9948a;
    }

    @Override // gc.y0
    public final Timeline b() {
        return this.f9949b;
    }
}

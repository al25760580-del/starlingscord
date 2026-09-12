package md;

import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.exoplayer2.source.MediaLoadData;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class u implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f15706d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a1.d f15707e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f15708i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ LoadEventInfo f15709v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ MediaLoadData f15710w;

    public /* synthetic */ u(a1.d dVar, w wVar, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, int i7) {
        this.f15706d = i7;
        this.f15707e = dVar;
        this.f15708i = wVar;
        this.f15709v = loadEventInfo;
        this.f15710w = mediaLoadData;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, md.w] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, md.w] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, md.w] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15706d) {
            case 0:
                a1.d dVar = this.f15707e;
                this.f15708i.n(dVar.f17e, (s) dVar.f18i, this.f15709v, this.f15710w);
                break;
            case 1:
                a1.d dVar2 = this.f15707e;
                this.f15708i.m(dVar2.f17e, (s) dVar2.f18i, this.f15709v, this.f15710w);
                break;
            default:
                a1.d dVar3 = this.f15707e;
                this.f15708i.w(dVar3.f17e, (s) dVar3.f18i, this.f15709v, this.f15710w);
                break;
        }
    }
}

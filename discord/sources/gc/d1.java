package gc;

import android.util.Pair;
import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.exoplayer2.source.MediaLoadData;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d1 implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f9594d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ LoadEventInfo f9595e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ MediaLoadData f9596i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ IOException f9597v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ boolean f9598w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f9599x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f9600y;

    public /* synthetic */ d1(Object obj, Object obj2, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z5, int i7) {
        this.f9594d = i7;
        this.f9599x = obj;
        this.f9600y = obj2;
        this.f9595e = loadEventInfo;
        this.f9596i = mediaLoadData;
        this.f9597v = iOException;
        this.f9598w = z5;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, md.w] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9594d) {
            case 0:
                e4.c cVar = (e4.c) this.f9599x;
                Pair pair = (Pair) this.f9600y;
                ((hc.u) ((hc.a) ((g1) cVar.f7967i).f9667i)).d(((Integer) pair.first).intValue(), (md.s) pair.second, this.f9595e, this.f9596i, this.f9597v, this.f9598w);
                break;
            default:
                a1.d dVar = (a1.d) this.f9599x;
                this.f9600y.d(dVar.f17e, (md.s) dVar.f18i, this.f9595e, this.f9596i, this.f9597v, this.f9598w);
                break;
        }
    }
}

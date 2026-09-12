package gc;

import com.google.android.exoplayer2.Player;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r implements je.k, je.j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.google.android.exoplayer2.c f9831d;

    public /* synthetic */ r(com.google.android.exoplayer2.c cVar) {
        this.f9831d = cVar;
    }

    @Override // je.k
    public void h(Object obj, je.g gVar) {
        ((com.google.android.exoplayer2.e) obj).onEvents(this.f9831d.f5647f, new Player.Events(gVar));
    }

    @Override // je.j
    public void invoke(Object obj) {
        ((com.google.android.exoplayer2.e) obj).onAvailableCommandsChanged(this.f9831d.L);
    }
}

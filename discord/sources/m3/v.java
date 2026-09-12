package m3;

import androidx.transition.Transition;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class v extends u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s.e f15452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f15453b;

    public v(w wVar, s.e eVar) {
        this.f15453b = wVar;
        this.f15452a = eVar;
    }

    @Override // m3.u, m3.s
    public final void onTransitionEnd(Transition transition) {
        ((ArrayList) this.f15452a.get(this.f15453b.f15455e)).remove(transition);
        transition.D(this);
    }
}

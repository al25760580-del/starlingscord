package m3;

import androidx.transition.Transition;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class i extends u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f15414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f15415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f15416c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ArrayList f15417d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k f15418e;

    public i(k kVar, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.f15418e = kVar;
        this.f15414a = obj;
        this.f15415b = arrayList;
        this.f15416c = obj2;
        this.f15417d = arrayList2;
    }

    @Override // m3.u, m3.s
    public final void onTransitionEnd(Transition transition) {
        transition.D(this);
    }

    @Override // m3.u, m3.s
    public final void onTransitionStart(Transition transition) {
        k kVar = this.f15418e;
        Object obj = this.f15414a;
        if (obj != null) {
            kVar.z(obj, this.f15415b, null);
        }
        Object obj2 = this.f15416c;
        if (obj2 != null) {
            kVar.z(obj2, this.f15417d, null);
        }
    }
}

package m3;

import android.view.View;
import androidx.transition.Transition;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class h implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f15407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f15408b;

    public h(View view, ArrayList arrayList) {
        this.f15407a = view;
        this.f15408b = arrayList;
    }

    @Override // m3.s
    public final void onTransitionEnd(Transition transition) {
        transition.D(this);
        this.f15407a.setVisibility(8);
        ArrayList arrayList = this.f15408b;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((View) arrayList.get(i7)).setVisibility(0);
        }
    }

    @Override // m3.s
    public final void onTransitionStart(Transition transition) {
        transition.D(this);
        transition.a(this);
    }

    @Override // m3.s
    public final void onTransitionCancel(Transition transition) {
    }

    @Override // m3.s
    public final void onTransitionPause(Transition transition) {
    }

    @Override // m3.s
    public final void onTransitionResume(Transition transition) {
    }
}

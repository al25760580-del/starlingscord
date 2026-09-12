package androidx.recyclerview.widget;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class n0 implements AsyncListDiffer.ListListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o0 f2651a;

    public n0(o0 o0Var) {
        this.f2651a = o0Var;
    }

    @Override // androidx.recyclerview.widget.AsyncListDiffer.ListListener
    public final void a(List list, List list2) {
        this.f2651a.onCurrentListChanged(list, list2);
    }
}

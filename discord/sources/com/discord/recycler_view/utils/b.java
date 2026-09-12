package com.discord.recycler_view.utils;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Function2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4568d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ TransitionResilientGridLayoutManager f4569e;

    public /* synthetic */ b(TransitionResilientGridLayoutManager transitionResilientGridLayoutManager, int i7) {
        this.f4568d = i7;
        this.f4569e = transitionResilientGridLayoutManager;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f4568d) {
            case 0:
                return TransitionResilientGridLayoutManager.removeAndRecycleView$lambda$2(this.f4569e, (View) obj, (RecyclerView.Recycler) obj2);
            case 1:
                return TransitionResilientGridLayoutManager.onLayoutChildren$lambda$7(this.f4569e, (RecyclerView.Recycler) obj, (RecyclerView.State) obj2);
            default:
                return TransitionResilientGridLayoutManager.removeAndRecycleViewAt$lambda$6(this.f4569e, ((Integer) obj).intValue(), (RecyclerView.Recycler) obj2);
        }
    }
}

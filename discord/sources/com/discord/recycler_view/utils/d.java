package com.discord.recycler_view.utils;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Function2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4572d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ TransitionResilientLinearLayoutManager f4573e;

    public /* synthetic */ d(TransitionResilientLinearLayoutManager transitionResilientLinearLayoutManager, int i7) {
        this.f4572d = i7;
        this.f4573e = transitionResilientLinearLayoutManager;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f4572d) {
            case 0:
                return TransitionResilientLinearLayoutManager.removeAndRecycleView$lambda$2(this.f4573e, (View) obj, (RecyclerView.Recycler) obj2);
            case 1:
                return TransitionResilientLinearLayoutManager.onLayoutChildren$lambda$7(this.f4573e, (RecyclerView.Recycler) obj, (RecyclerView.State) obj2);
            default:
                return TransitionResilientLinearLayoutManager.removeAndRecycleViewAt$lambda$6(this.f4573e, ((Integer) obj).intValue(), (RecyclerView.Recycler) obj2);
        }
    }
}

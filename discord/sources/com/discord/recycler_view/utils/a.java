package com.discord.recycler_view.utils;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4566d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ TransitionResilientGridLayoutManager f4567e;

    public /* synthetic */ a(TransitionResilientGridLayoutManager transitionResilientGridLayoutManager, int i7) {
        this.f4566d = i7;
        this.f4567e = transitionResilientGridLayoutManager;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f4566d) {
            case 0:
                return TransitionResilientGridLayoutManager.removeAndRecycleView$lambda$1(this.f4567e, (View) obj);
            case 1:
                return TransitionResilientGridLayoutManager.removeAndRecycleViewAt$lambda$5(this.f4567e, ((Integer) obj).intValue());
            default:
                return TransitionResilientGridLayoutManager.removeAndRecycleAllViews$lambda$4(this.f4567e, (RecyclerView.Recycler) obj);
        }
    }
}

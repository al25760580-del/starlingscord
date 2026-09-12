package com.discord.recycler_view.utils;

import a3.e;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.crash_reporting.CrashReporting;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final class TransitionResilientRecyclingDelegate$collectAndDeferRecyclingFromScrap$1$1$1 implements Runnable {
    final /* synthetic */ String $breadcrumbContext;
    final /* synthetic */ RecyclerView.Recycler $recycler;
    final /* synthetic */ View $view;
    final /* synthetic */ TransitionResilientRecyclingDelegate this$0;

    public TransitionResilientRecyclingDelegate$collectAndDeferRecyclingFromScrap$1$1$1(View view, RecyclerView.Recycler recycler, String str, TransitionResilientRecyclingDelegate transitionResilientRecyclingDelegate) {
        this.$view = view;
        this.$recycler = recycler;
        this.$breadcrumbContext = str;
        this.this$0 = transitionResilientRecyclingDelegate;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (this.$view.getParent() == null) {
                this.$recycler.j(this.$view);
                return;
            }
            CrashReporting.addBreadcrumb$default(CrashReporting.INSTANCE, "Skipped recycling view that still has a parent during deferred recycling" + this.$breadcrumbContext, null, null, null, false, 30, null);
        } catch (Exception e10) {
            this.this$0.captureException(new Exception(e.l("Deferred recycling failed", this.$breadcrumbContext), e10));
        }
    }
}

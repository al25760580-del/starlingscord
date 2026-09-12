package com.google.android.material.datepicker;

import android.R;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.DecelerateInterpolator;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.Scroller;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m1;
import androidx.recyclerview.widget.u0;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: loaded from: classes3.dex */
public final class m<S> extends v {
    public RecyclerView E;
    public View F;
    public View G;
    public View H;
    public View I;
    public MaterialButton J;
    public AccessibilityManager K;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f6355e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public b f6356i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public q f6357v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f6358w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public c f6359x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public RecyclerView f6360y;

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f6355e = bundle.getInt("THEME_RES_ID_KEY");
        if (bundle.getParcelable("GRID_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f6356i = (b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f6357v = (q) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i7;
        int i10;
        u0 u0Var;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.f6355e);
        this.f6359x = new c(contextThemeWrapper);
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        this.K = (AccessibilityManager) requireContext().getSystemService("accessibility");
        q qVar = this.f6356i.f6327d;
        if (o.w(contextThemeWrapper, R.attr.windowFullscreen)) {
            i7 = com.discord.R.layout.mtrl_calendar_vertical;
            i10 = 1;
        } else {
            i7 = com.discord.R.layout.mtrl_calendar_horizontal;
            i10 = 0;
        }
        View viewInflate = layoutInflaterCloneInContext.inflate(i7, viewGroup, false);
        Resources resources = requireContext().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(com.discord.R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(com.discord.R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(com.discord.R.dimen.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(com.discord.R.dimen.mtrl_calendar_days_of_week_height);
        int i11 = r.f6382v;
        viewInflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(com.discord.R.dimen.mtrl_calendar_month_vertical_padding) * (i11 - 1)) + (resources.getDimensionPixelSize(com.discord.R.dimen.mtrl_calendar_day_height) * i11) + resources.getDimensionPixelOffset(com.discord.R.dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) viewInflate.findViewById(com.discord.R.id.mtrl_calendar_days_of_week);
        androidx.core.view.u0.p(gridView, new h(0));
        int i12 = this.f6356i.f6331w;
        gridView.setAdapter((ListAdapter) (i12 > 0 ? new e(i12) : new e()));
        gridView.setNumColumns(qVar.f6378v);
        gridView.setEnabled(false);
        this.E = (RecyclerView) viewInflate.findViewById(com.discord.R.id.mtrl_calendar_months);
        getContext();
        this.E.setLayoutManager(new i(this, i10, i10));
        this.E.setTag("MONTHS_VIEW_GROUP_TAG");
        u uVar = new u(contextThemeWrapper, this.f6356i, new j(this));
        this.E.setAdapter(uVar);
        int integer = contextThemeWrapper.getResources().getInteger(com.discord.R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView3 = (RecyclerView) viewInflate.findViewById(com.discord.R.id.mtrl_calendar_year_selector_frame);
        this.f6360y = recyclerView3;
        if (recyclerView3 != null) {
            recyclerView3.setHasFixedSize(true);
            this.f6360y.setLayoutManager(new GridLayoutManager(integer, 0));
            this.f6360y.setAdapter(new b0(this));
            this.f6360y.addItemDecoration(new k(this));
        }
        View viewFindViewById = viewInflate.findViewById(com.discord.R.id.month_navigation_fragment_toggle);
        b bVar = uVar.f6391a;
        if (viewFindViewById != null) {
            MaterialButton materialButton = (MaterialButton) viewInflate.findViewById(com.discord.R.id.month_navigation_fragment_toggle);
            this.J = materialButton;
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            androidx.core.view.u0.p(this.J, new bh.a(2, this));
            View viewFindViewById2 = viewInflate.findViewById(com.discord.R.id.month_navigation_previous);
            this.F = viewFindViewById2;
            viewFindViewById2.setTag("NAVIGATION_PREV_TAG");
            View viewFindViewById3 = viewInflate.findViewById(com.discord.R.id.month_navigation_next);
            this.G = viewFindViewById3;
            viewFindViewById3.setTag("NAVIGATION_NEXT_TAG");
            this.H = viewInflate.findViewById(com.discord.R.id.mtrl_calendar_year_selector_frame);
            this.I = viewInflate.findViewById(com.discord.R.id.mtrl_calendar_day_selector_frame);
            u(1);
            this.J.setText(this.f6357v.i());
            this.E.addOnScrollListener(new l(this, uVar));
            this.J.setOnClickListener(new androidx.appcompat.widget.b(3, this));
            this.G.setOnClickListener(new f(this, uVar, 1));
            this.F.setOnClickListener(new f(this, uVar, 0));
            v(bVar.f6327d.v(this.f6357v));
        }
        if (!o.w(contextThemeWrapper, R.attr.windowFullscreen) && (recyclerView2 = (u0Var = new u0()).f2652a) != (recyclerView = this.E)) {
            m1 m1Var = u0Var.f2653b;
            if (recyclerView2 != null) {
                recyclerView2.removeOnScrollListener(m1Var);
                u0Var.f2652a.setOnFlingListener(null);
            }
            u0Var.f2652a = recyclerView;
            if (recyclerView != null) {
                if (recyclerView.getOnFlingListener() != null) {
                    throw new IllegalStateException("An instance of OnFlingListener already set.");
                }
                u0Var.f2652a.addOnScrollListener(m1Var);
                u0Var.f2652a.setOnFlingListener(u0Var);
                new Scroller(u0Var.f2652a.getContext(), new DecelerateInterpolator());
                u0Var.b();
            }
        }
        this.E.scrollToPosition(bVar.f6327d.v(this.f6357v));
        androidx.core.view.u0.p(this.E, new h(1));
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f6355e);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f6356i);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f6357v);
    }

    public final void t(q qVar) {
        u uVar = (u) this.E.getAdapter();
        int iV = uVar.f6391a.f6327d.v(qVar);
        AccessibilityManager accessibilityManager = this.K;
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            int iV2 = iV - uVar.f6391a.f6327d.v(this.f6357v);
            boolean z5 = Math.abs(iV2) > 3;
            boolean z6 = iV2 > 0;
            this.f6357v = qVar;
            if (z5 && z6) {
                this.E.scrollToPosition(iV - 3);
                this.E.post(new g(iV, 0, this));
            } else if (z5) {
                this.E.scrollToPosition(iV + 3);
                this.E.post(new g(iV, 0, this));
            } else {
                this.E.post(new g(iV, 0, this));
            }
        } else {
            this.f6357v = qVar;
            this.E.scrollToPosition(iV);
        }
        v(iV);
    }

    public final void u(int i7) {
        this.f6358w = i7;
        if (i7 == 2) {
            this.f6360y.getLayoutManager().scrollToPosition(this.f6357v.f6377i - ((b0) this.f6360y.getAdapter()).f6334a.f6356i.f6327d.f6377i);
            this.H.setVisibility(0);
            this.I.setVisibility(8);
            this.F.setVisibility(8);
            this.G.setVisibility(8);
            return;
        }
        if (i7 == 1) {
            this.H.setVisibility(8);
            this.I.setVisibility(0);
            this.F.setVisibility(0);
            this.G.setVisibility(0);
            t(this.f6357v);
        }
    }

    public final void v(int i7) {
        this.G.setEnabled(i7 + 1 < this.E.getAdapter().getItemCount());
        this.F.setEnabled(i7 - 1 >= 0);
    }
}

package com.google.android.material.datepicker;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.R;
import java.util.Calendar;

/* JADX INFO: loaded from: classes3.dex */
public final class u extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f6391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f6392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6393c;

    public u(ContextThemeWrapper contextThemeWrapper, b bVar, j jVar) {
        q qVar = bVar.f6327d;
        q qVar2 = bVar.f6328e;
        q qVar3 = bVar.f6330v;
        if (qVar.f6375d.compareTo(qVar3.f6375d) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (qVar3.f6375d.compareTo(qVar2.f6375d) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        this.f6393c = (contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * r.f6382v) + (o.w(contextThemeWrapper, android.R.attr.windowFullscreen) ? contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) : 0);
        this.f6391a = bVar;
        this.f6392b = jVar;
        setHasStableIds(true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f6391a.f6333y;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i7) {
        Calendar calendarA = z.a(this.f6391a.f6327d.f6375d);
        calendarA.add(2, i7);
        calendarA.set(5, 1);
        Calendar calendarA2 = z.a(calendarA);
        calendarA2.get(2);
        calendarA2.get(1);
        calendarA2.getMaximum(7);
        calendarA2.getActualMaximum(5);
        calendarA2.getTimeInMillis();
        return calendarA2.getTimeInMillis();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
        t tVar = (t) viewHolder;
        b bVar = this.f6391a;
        Calendar calendarA = z.a(bVar.f6327d.f6375d);
        calendarA.add(2, i7);
        q qVar = new q(calendarA);
        tVar.f6389d.setText(qVar.i());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) tVar.f6390e.findViewById(R.id.month_grid);
        if (materialCalendarGridView.a() == null || !qVar.equals(materialCalendarGridView.a().f6384d)) {
            new r(qVar, bVar);
            throw null;
        }
        materialCalendarGridView.invalidate();
        materialCalendarGridView.a().getClass();
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (!o.w(viewGroup.getContext(), android.R.attr.windowFullscreen)) {
            return new t(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.LayoutParams(-1, this.f6393c));
        return new t(linearLayout, true);
    }
}

package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.discord.R;
import java.util.Calendar;

/* JADX INFO: loaded from: classes3.dex */
public final class r extends BaseAdapter {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f6382v = z.c(null).getMaximum(4);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f6383w = (z.c(null).getMaximum(7) + z.c(null).getMaximum(5)) - 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q f6384d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c f6385e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final b f6386i;

    public r(q qVar, b bVar) {
        this.f6384d = qVar;
        this.f6386i = bVar;
        throw null;
    }

    public final int a() {
        int firstDayOfWeek = this.f6386i.f6331w;
        q qVar = this.f6384d;
        Calendar calendar = qVar.f6375d;
        int i7 = calendar.get(7);
        if (firstDayOfWeek <= 0) {
            firstDayOfWeek = calendar.getFirstDayOfWeek();
        }
        int i10 = i7 - firstDayOfWeek;
        return i10 < 0 ? i10 + qVar.f6378v : i10;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Long getItem(int i7) {
        if (i7 < a() || i7 > c()) {
            return null;
        }
        int iA = (i7 - a()) + 1;
        Calendar calendarA = z.a(this.f6384d.f6375d);
        calendarA.set(5, iA);
        return Long.valueOf(calendarA.getTimeInMillis());
    }

    public final int c() {
        return (a() + this.f6384d.f6379w) - 1;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return f6383w;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i7) {
        return i7 / this.f6384d.f6378v;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x005d  */
    @Override // android.widget.Adapter
    public final View getView(int i7, View view, ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        if (this.f6385e == null) {
            this.f6385e = new c(context);
        }
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day, viewGroup, false);
        }
        int iA = i7 - a();
        if (iA >= 0) {
            q qVar = this.f6384d;
            if (iA >= qVar.f6379w) {
                textView.setVisibility(8);
                textView.setEnabled(false);
            } else {
                textView.setTag(qVar);
                textView.setText(String.format(textView.getResources().getConfiguration().locale, "%d", Integer.valueOf(iA + 1)));
                textView.setVisibility(0);
                textView.setEnabled(true);
            }
        } else {
            textView.setVisibility(8);
            textView.setEnabled(false);
        }
        if (getItem(i7) == null || textView == null) {
            return textView;
        }
        textView.getContext();
        z.b().getTimeInMillis();
        throw null;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}

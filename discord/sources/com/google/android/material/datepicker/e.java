package com.google.android.material.datepicker;

import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.discord.R;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends BaseAdapter {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f6338v;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Calendar f6339d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f6340e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f6341i;

    static {
        f6338v = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
    }

    public e() {
        Calendar calendarC = z.c(null);
        this.f6339d = calendarC;
        this.f6340e = calendarC.getMaximum(7);
        this.f6341i = calendarC.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f6340e;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i7) {
        int i10 = this.f6340e;
        if (i7 >= i10) {
            return null;
        }
        int i11 = i7 + this.f6341i;
        if (i11 > i10) {
            i11 -= i10;
        }
        return Integer.valueOf(i11);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i7) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public final View getView(int i7, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day_of_week, viewGroup, false);
        }
        int i10 = i7 + this.f6341i;
        int i11 = this.f6340e;
        if (i10 > i11) {
            i10 -= i11;
        }
        Calendar calendar = this.f6339d;
        calendar.set(7, i10);
        textView.setText(calendar.getDisplayName(7, f6338v, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(R.string.mtrl_picker_day_of_week_column_header), calendar.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    public e(int i7) {
        Calendar calendarC = z.c(null);
        this.f6339d = calendarC;
        this.f6340e = calendarC.getMaximum(7);
        this.f6341i = i7;
    }
}

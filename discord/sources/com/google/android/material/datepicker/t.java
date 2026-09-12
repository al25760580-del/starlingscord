package com.google.android.material.datepicker;

import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.g0;
import androidx.core.view.u0;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.R;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class t extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f6389d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final MaterialCalendarGridView f6390e;

    public t(LinearLayout linearLayout, boolean z5) {
        super(linearLayout);
        TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
        this.f6389d = textView;
        WeakHashMap weakHashMap = u0.f1729a;
        new g0(R.id.tag_accessibility_heading, Boolean.class, 0, 28, 3).f(textView, Boolean.TRUE);
        this.f6390e = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
        if (z5) {
            return;
        }
        textView.setVisibility(8);
    }
}

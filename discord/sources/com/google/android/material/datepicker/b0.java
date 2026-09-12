package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.R;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class b0 extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f6334a;

    public b0(m mVar) {
        this.f6334a = mVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f6334a.f6356i.f6332x;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
        a0 a0Var = (a0) viewHolder;
        m mVar = this.f6334a;
        int i10 = mVar.f6356i.f6327d.f6377i + i7;
        a0Var.f6326d.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i10)));
        TextView textView = a0Var.f6326d;
        Context context = textView.getContext();
        textView.setContentDescription(z.b().get(1) == i10 ? String.format(context.getString(R.string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i10)) : String.format(context.getString(R.string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i10)));
        c cVar = mVar.f6359x;
        if (z.b().get(1) == i10) {
            kh.f fVar = cVar.f6336b;
        } else {
            kh.f fVar2 = cVar.f6335a;
        }
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
        return new a0((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_year, viewGroup, false));
    }
}

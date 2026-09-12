package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: loaded from: classes3.dex */
public final class s implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ MaterialCalendarGridView f6387d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u f6388e;

    public s(u uVar, MaterialCalendarGridView materialCalendarGridView) {
        this.f6388e = uVar;
        this.f6387d = materialCalendarGridView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i7, long j) {
        MaterialCalendarGridView materialCalendarGridView = this.f6387d;
        r rVarA = materialCalendarGridView.a();
        if (i7 < rVarA.a() || i7 > rVarA.c()) {
            return;
        }
        if (materialCalendarGridView.a().getItem(i7).longValue() >= this.f6388e.f6392b.f6351a.f6356i.f6329i.f6337d) {
            throw null;
        }
    }
}

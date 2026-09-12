package com.google.android.material.datepicker;

import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends RecyclerView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u f6353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f6354b;

    public l(m mVar, u uVar) {
        this.f6354b = mVar;
        this.f6353a = uVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrolled(RecyclerView recyclerView, int i7, int i10) {
        b bVar = this.f6353a.f6391a;
        m mVar = this.f6354b;
        int iFindFirstVisibleItemPosition = i7 < 0 ? ((LinearLayoutManager) mVar.E.getLayoutManager()).findFirstVisibleItemPosition() : ((LinearLayoutManager) mVar.E.getLayoutManager()).findLastVisibleItemPosition();
        Calendar calendarA = z.a(bVar.f6327d.f6375d);
        calendarA.add(2, iFindFirstVisibleItemPosition);
        q qVar = new q(calendarA);
        mVar.f6357v = qVar;
        MaterialButton materialButton = mVar.J;
        Calendar calendarA2 = z.a(bVar.f6327d.f6375d);
        calendarA2.add(2, iFindFirstVisibleItemPosition);
        calendarA2.set(5, 1);
        Calendar calendarA3 = z.a(calendarA2);
        calendarA3.get(2);
        calendarA3.get(1);
        calendarA3.getMaximum(7);
        calendarA3.getActualMaximum(5);
        calendarA3.getTimeInMillis();
        long timeInMillis = calendarA3.getTimeInMillis();
        Locale locale = Locale.getDefault();
        AtomicReference atomicReference = z.f6395a;
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("yMMMM", locale);
        instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
        instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
        materialButton.setText(instanceForSkeleton.format(new Date(timeInMillis)));
        mVar.v(bVar.f6327d.v(qVar));
    }
}

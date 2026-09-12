package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Calendar;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements View.OnClickListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6342d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u f6343e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ m f6344i;

    public /* synthetic */ f(m mVar, u uVar, int i7) {
        this.f6342d = i7;
        this.f6344i = mVar;
        this.f6343e = uVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f6342d) {
            case 0:
                m mVar = this.f6344i;
                int iFindLastVisibleItemPosition = ((LinearLayoutManager) mVar.E.getLayoutManager()).findLastVisibleItemPosition() - 1;
                Calendar calendarA = z.a(this.f6343e.f6391a.f6327d.f6375d);
                calendarA.add(2, iFindLastVisibleItemPosition);
                mVar.t(new q(calendarA));
                break;
            default:
                m mVar2 = this.f6344i;
                int iFindFirstVisibleItemPosition = ((LinearLayoutManager) mVar2.E.getLayoutManager()).findFirstVisibleItemPosition() + 1;
                Calendar calendarA2 = z.a(this.f6343e.f6391a.f6327d.f6375d);
                calendarA2.add(2, iFindFirstVisibleItemPosition);
                mVar2.t(new q(calendarA2));
                break;
        }
    }
}

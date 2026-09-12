package com.google.android.material.datepicker;

import androidx.work.impl.foreground.SystemForegroundService;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6345d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f6346e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f6347i;

    public /* synthetic */ g(int i7, int i10, Object obj) {
        this.f6345d = i10;
        this.f6347i = obj;
        this.f6346e = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6345d) {
            case 0:
                ((m) this.f6347i).E.smoothScrollToPosition(this.f6346e);
                break;
            case 1:
                ((SystemForegroundService) this.f6347i).f2848w.cancel(this.f6346e);
                break;
            case 2:
                ((eh.e) this.f6347i).k(this.f6346e);
                break;
            case 3:
                a1.b bVar = (a1.b) ((fj.c) this.f6347i).f9267e;
                if (bVar != null) {
                    bVar.g(this.f6346e);
                }
                break;
            case 4:
                ArrayList arrayList = (ArrayList) this.f6347i;
                int size = arrayList.size();
                int i7 = 0;
                if (this.f6346e == 1) {
                    while (i7 < size) {
                        ((k2.g) arrayList.get(i7)).b();
                        i7++;
                    }
                } else {
                    while (i7 < size) {
                        ((k2.g) arrayList.get(i7)).a();
                        i7++;
                    }
                }
                break;
            default:
                ((ze.m) this.f6347i).f(this.f6346e);
                break;
        }
    }

    public g(List list, int i7, Throwable th2) {
        this.f6345d = 4;
        yk.a.d(list, "initCallbacks cannot be null");
        this.f6347i = new ArrayList(list);
        this.f6346e = i7;
    }
}

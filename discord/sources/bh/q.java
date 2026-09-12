package bh;

import android.view.View;
import androidx.core.view.WindowInsetsCompat;

/* JADX INFO: loaded from: classes3.dex */
public final class q implements androidx.core.view.t {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s f3297d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t f3298e;

    public q(s sVar, t tVar) {
        this.f3297d = sVar;
        this.f3298e = tVar;
    }

    @Override // androidx.core.view.t
    public final WindowInsetsCompat a(View view, WindowInsetsCompat windowInsetsCompat) {
        t tVar = new t();
        t tVar2 = this.f3298e;
        tVar.f3301b = tVar2.f3301b;
        tVar.f3302c = tVar2.f3302c;
        tVar.f3303d = tVar2.f3303d;
        tVar.f3304e = tVar2.f3304e;
        return this.f3297d.d(view, windowInsetsCompat, tVar);
    }
}

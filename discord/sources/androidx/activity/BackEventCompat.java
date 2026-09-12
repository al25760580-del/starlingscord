package androidx.activity;

import android.window.BackEvent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class BackEventCompat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f699c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f700d;

    public BackEventCompat(BackEvent backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
        float fO = a2.a.o(backEvent);
        float fP = a2.a.p(backEvent);
        float fL = a2.a.l(backEvent);
        int iN = a2.a.n(backEvent);
        this.f697a = fO;
        this.f698b = fP;
        this.f699c = fL;
        this.f700d = iN;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BackEventCompat{touchX=");
        sb2.append(this.f697a);
        sb2.append(", touchY=");
        sb2.append(this.f698b);
        sb2.append(", progress=");
        sb2.append(this.f699c);
        sb2.append(", swipeEdge=");
        return com.discord.chat.presentation.list.a.j(sb2, this.f700d, '}');
    }
}

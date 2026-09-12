package h3;

import a3.q;
import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import rn.g0;
import rn.l;
import rn.u;

/* JADX INFO: loaded from: classes.dex */
public final class h implements g3.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f10316d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f10317e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final a1.d f10318i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f10319v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f10320w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final u f10321x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f10322y;

    public h(Context context, String str, a1.d callback, boolean z5, boolean z6) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f10316d = context;
        this.f10317e = str;
        this.f10318i = callback;
        this.f10319v = z5;
        this.f10320w = z6;
        this.f10321x = l.b(new q(8, this));
    }

    @Override // g3.d
    public final c C() {
        return ((g) this.f10321x.getValue()).c(true);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f10321x.f19495e != g0.f19473a) {
            ((g) this.f10321x.getValue()).close();
        }
    }

    @Override // g3.d
    public final void setWriteAheadLoggingEnabled(boolean z5) {
        if (this.f10321x.f19495e != g0.f19473a) {
            g sQLiteOpenHelper = (g) this.f10321x.getValue();
            Intrinsics.checkNotNullParameter(sQLiteOpenHelper, "sQLiteOpenHelper");
            sQLiteOpenHelper.setWriteAheadLoggingEnabled(z5);
        }
        this.f10322y = z5;
    }
}

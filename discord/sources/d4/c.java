package d4;

import android.app.Notification;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.work.impl.foreground.SystemForegroundService;
import q.g;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7590d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f7591e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f7592i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Parcelable f7593v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f7594w;

    public c(SystemForegroundService systemForegroundService, int i7, Notification notification, int i10) {
        this.f7594w = systemForegroundService;
        this.f7591e = i7;
        this.f7593v = notification;
        this.f7592i = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7590d) {
            case 0:
                Notification notification = (Notification) this.f7593v;
                SystemForegroundService systemForegroundService = (SystemForegroundService) this.f7594w;
                int i7 = Build.VERSION.SDK_INT;
                int i10 = this.f7592i;
                int i11 = this.f7591e;
                if (i7 >= 31) {
                    e.a(systemForegroundService, i11, notification, i10);
                } else if (i7 < 29) {
                    systemForegroundService.startForeground(i11, notification);
                } else {
                    d.a(systemForegroundService, i11, notification, i10);
                }
                break;
            default:
                ((g) this.f7594w).f18569g.onActivityResized(this.f7591e, this.f7592i, (Bundle) this.f7593v);
                break;
        }
    }

    public c(g gVar, int i7, int i10, Bundle bundle) {
        this.f7594w = gVar;
        this.f7591e = i7;
        this.f7592i = i10;
        this.f7593v = bundle;
    }
}

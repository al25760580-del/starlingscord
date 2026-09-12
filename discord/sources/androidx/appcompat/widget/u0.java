package androidx.appcompat.widget;

import android.app.Notification;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.TextView;
import androidx.work.impl.foreground.SystemForegroundService;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: loaded from: classes.dex */
public final class u0 implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1126d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f1127e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f1128i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Object f1129v;

    public /* synthetic */ u0(Object obj, int i7, Parcelable parcelable, int i10) {
        this.f1126d = i10;
        this.f1129v = obj;
        this.f1127e = i7;
        this.f1128i = parcelable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1126d) {
            case 0:
                ((TextView) this.f1128i).setTypeface((Typeface) this.f1129v, this.f1127e);
                break;
            case 1:
                ((SystemForegroundService) this.f1129v).f2848w.notify(this.f1127e, (Notification) this.f1128i);
                break;
            case 2:
                ((q.g) this.f1129v).f18569g.onNavigationEvent(this.f1127e, (Bundle) this.f1128i);
                break;
            case 3:
                ((BottomSheetBehavior) this.f1129v).J((View) this.f1128i, this.f1127e, false);
                break;
            case 4:
                try {
                    ((sh.x0) this.f1128i).i(this.f1127e, 4, (String) this.f1129v);
                } catch (vh.a e10) {
                    sh.x0.f20229h.e("notifyModuleCompleted failed", e10);
                    return;
                }
                break;
            default:
                ((y3.i) this.f1128i).a(this.f1127e, (Intent) this.f1129v);
                break;
        }
    }

    public /* synthetic */ u0(Object obj, Object obj2, int i7, int i10) {
        this.f1126d = i10;
        this.f1128i = obj;
        this.f1129v = obj2;
        this.f1127e = i7;
    }

    public /* synthetic */ u0(sh.x0 x0Var, int i7, String str) {
        this.f1126d = 4;
        this.f1128i = x0Var;
        this.f1127e = i7;
        this.f1129v = str;
    }

    public u0(BottomSheetBehavior bottomSheetBehavior, View view, int i7) {
        this.f1126d = 3;
        this.f1129v = bottomSheetBehavior;
        this.f1128i = view;
        this.f1127e = i7;
    }
}

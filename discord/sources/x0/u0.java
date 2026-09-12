package x0;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat$Builder;
import androidx.core.graphics.drawable.IconCompat;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.uimanager.ViewProps;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class u0 extends v0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f22568h;
    public IconCompat j;
    public IconCompat k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public IconCompat f22570l;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f22565e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList f22566f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f22567g = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f22569i = true;

    public static IconCompat g(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        if (parcelable instanceof Icon) {
            PorterDuff.Mode mode = IconCompat.k;
            return yk.a.i((Icon) parcelable);
        }
        if (parcelable instanceof Bitmap) {
            return IconCompat.c((Bitmap) parcelable);
        }
        return null;
    }

    @Override // x0.v0
    public final void a(Bundle bundle) {
        super.a(bundle);
        if (Build.VERSION.SDK_INT < 36) {
            ArrayList arrayList = this.f22565e;
            ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
            if (arrayList != null && !arrayList.isEmpty()) {
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    t0 t0Var = (t0) arrayList.get(i7);
                    if (t0Var.f22553a > 0) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putInt("length", t0Var.f22553a);
                        bundle2.putInt(StackTraceHelper.ID_KEY, t0Var.f22554b);
                        bundle2.putInt("colorInt", t0Var.f22555c);
                        arrayList2.add(bundle2);
                    }
                }
            }
            bundle.putParcelableArrayList("android.progressSegments", arrayList2);
            ArrayList arrayList3 = this.f22566f;
            ArrayList<? extends Parcelable> arrayList4 = new ArrayList<>();
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                for (int i10 = 0; i10 < arrayList3.size(); i10++) {
                    s0 s0Var = (s0) arrayList3.get(i10);
                    if (s0Var.f22550a >= 0) {
                        Bundle bundle3 = new Bundle();
                        bundle3.putInt(ViewProps.POSITION, s0Var.f22550a);
                        bundle3.putInt(StackTraceHelper.ID_KEY, s0Var.f22551b);
                        bundle3.putInt("colorInt", s0Var.f22552c);
                        arrayList4.add(bundle3);
                    }
                }
            }
            bundle.putParcelableArrayList("android.progressPoints", arrayList4);
            bundle.putInt("android.progress", this.f22567g);
            bundle.putBoolean("android.progressIndeterminate", this.f22568h);
            bundle.putInt("android.progressMax", h());
            bundle.putBoolean("android.styledByProgress", this.f22569i);
            NotificationCompat$Builder notificationCompat$Builder = this.f22571a;
            Context context = notificationCompat$Builder != null ? notificationCompat$Builder.f1483a : null;
            if (context != null) {
                IconCompat iconCompat = this.j;
                if (iconCompat != null) {
                    bundle.putParcelable("android.progressTrackerIcon", iconCompat.i(context));
                } else {
                    bundle.remove("android.progressTrackerIcon");
                }
                IconCompat iconCompat2 = this.k;
                if (iconCompat2 != null) {
                    bundle.putParcelable("android.progressStartIcon", iconCompat2.i(context));
                } else {
                    bundle.remove("android.progressStartIcon");
                }
                IconCompat iconCompat3 = this.f22570l;
                if (iconCompat3 != null) {
                    bundle.putParcelable("android.progressEndIcon", iconCompat3.i(context));
                } else {
                    bundle.remove("android.progressEndIcon");
                }
            }
        }
    }

    @Override // x0.v0
    public final void b(hp.e eVar) {
        Notification.Builder builder = (Notification.Builder) eVar.f10989i;
        if (Build.VERSION.SDK_INT < 36) {
            int iH = h();
            builder.setProgress(iH, Math.min(this.f22567g, iH), this.f22568h);
            return;
        }
        Context context = (Context) eVar.f10988e;
        Notification.ProgressStyle progressStyle = new Notification.ProgressStyle();
        r0.h(progressStyle, this.f22569i);
        r0.a(progressStyle, this.f22567g);
        r0.c(progressStyle, this.f22568h);
        IconCompat iconCompat = this.k;
        r0.f(progressStyle, iconCompat != null ? iconCompat.i(context) : null);
        IconCompat iconCompat2 = this.f22570l;
        r0.b(progressStyle, iconCompat2 != null ? iconCompat2.i(context) : null);
        IconCompat iconCompat3 = this.j;
        r0.g(progressStyle, iconCompat3 != null ? iconCompat3.i(context) : null);
        r0.d(progressStyle, this.f22566f);
        r0.e(progressStyle, this.f22565e);
        builder.setStyle(progressStyle);
    }

    @Override // x0.v0
    public final void c(Bundle bundle) {
        super.c(bundle);
        bundle.remove("android.progressSegments");
        bundle.remove("android.progress");
        bundle.remove("android.styledByProgress");
        bundle.remove("android.progressTrackerIcon");
        bundle.remove("android.progressStartIcon");
        bundle.remove("android.progressEndIcon");
        bundle.remove("android.progressPoints");
        bundle.remove("android.progressIndeterminate");
    }

    @Override // x0.v0
    public final String e() {
        return "androidx.core.app.NotificationCompat$ProgressStyle";
    }

    @Override // x0.v0
    public final void f(Bundle bundle) {
        super.f(bundle);
        ArrayList arrayListD = Build.VERSION.SDK_INT >= 34 ? e.e.d("android.progressSegments", bundle) : bundle.getParcelableArrayList("android.progressSegments");
        ArrayList arrayList = new ArrayList();
        if (arrayListD != null && !arrayListD.isEmpty()) {
            for (int i7 = 0; i7 < arrayListD.size(); i7++) {
                Bundle bundle2 = (Bundle) arrayListD.get(i7);
                int i10 = bundle2.getInt("length");
                if (i10 > 0) {
                    int i11 = bundle2.getInt(StackTraceHelper.ID_KEY);
                    int i12 = bundle2.getInt("colorInt", 0);
                    t0 t0Var = new t0();
                    t0Var.f22553a = i10;
                    t0Var.f22554b = i11;
                    t0Var.f22555c = i12;
                    arrayList.add(t0Var);
                }
            }
        }
        this.f22565e = arrayList;
        this.f22567g = bundle.getInt("android.progress", 0);
        this.f22568h = bundle.getBoolean("android.progressIndeterminate", false);
        this.f22569i = bundle.getBoolean("android.styledByProgress", true);
        ArrayList arrayListD2 = Build.VERSION.SDK_INT >= 34 ? e.e.d("android.progressPoints", bundle) : bundle.getParcelableArrayList("android.progressPoints");
        ArrayList arrayList2 = new ArrayList();
        if (arrayListD2 != null && !arrayListD2.isEmpty()) {
            for (int i13 = 0; i13 < arrayListD2.size(); i13++) {
                Bundle bundle3 = (Bundle) arrayListD2.get(i13);
                int i14 = bundle3.getInt(ViewProps.POSITION);
                if (i14 >= 0) {
                    int i15 = bundle3.getInt(StackTraceHelper.ID_KEY);
                    int i16 = bundle3.getInt("colorInt", 0);
                    s0 s0Var = new s0();
                    s0Var.f22550a = i14;
                    s0Var.f22551b = i15;
                    s0Var.f22552c = i16;
                    arrayList2.add(s0Var);
                }
            }
        }
        this.f22566f = arrayList2;
        this.j = g((Parcelable) yk.a.p(bundle, "android.progressTrackerIcon", Icon.class));
        this.k = g((Parcelable) yk.a.p(bundle, "android.progressStartIcon", Icon.class));
        this.f22570l = g((Parcelable) yk.a.p(bundle, "android.progressEndIcon", Icon.class));
    }

    public final int h() {
        ArrayList arrayList = this.f22565e;
        if (arrayList != null && !arrayList.isEmpty()) {
            int i7 = 0;
            int iAddExact = 0;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                int i11 = ((t0) arrayList.get(i10)).f22553a;
                if (i11 > 0) {
                    try {
                        iAddExact = Math.addExact(iAddExact, i11);
                        i7++;
                    } catch (ArithmeticException unused) {
                        return 100;
                    }
                }
            }
            if (i7 != 0) {
                return iAddExact;
            }
        }
        return 100;
    }
}

package x0;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.graphics.drawable.IconCompat;

/* JADX INFO: loaded from: classes.dex */
public final class x extends v0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public IconCompat f22575e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public IconCompat f22576f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f22577g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f22578h;

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
    public final void b(hp.e eVar) {
        Notification.Builder builder = (Notification.Builder) eVar.f10989i;
        Context context = (Context) eVar.f10988e;
        Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(builder).setBigContentTitle(this.f22572b);
        IconCompat iconCompat = this.f22575e;
        if (iconCompat != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                w.a(bigContentTitle, iconCompat.i(context));
            } else {
                int iV = iconCompat.f1560a;
                if (iV == -1) {
                    iV = yk.a.v(iconCompat.f1561b);
                }
                if (iV == 1) {
                    bigContentTitle = bigContentTitle.bigPicture(this.f22575e.e());
                }
            }
        }
        if (this.f22577g) {
            IconCompat iconCompat2 = this.f22576f;
            if (iconCompat2 == null) {
                bigContentTitle.bigLargeIcon((Bitmap) null);
            } else {
                v.a(bigContentTitle, iconCompat2.i(context));
            }
        }
        if (this.f22574d) {
            bigContentTitle.setSummaryText(this.f22573c);
        }
        if (Build.VERSION.SDK_INT >= 31) {
            w.c(bigContentTitle, this.f22578h);
            w.b(bigContentTitle, null);
        }
    }

    @Override // x0.v0
    public final void c(Bundle bundle) {
        super.c(bundle);
        bundle.remove("android.largeIcon.big");
        bundle.remove("android.picture");
        bundle.remove("android.pictureIcon");
        bundle.remove("android.showBigPictureWhenCollapsed");
    }

    @Override // x0.v0
    public final String e() {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }

    @Override // x0.v0
    public final void f(Bundle bundle) {
        super.f(bundle);
        if (bundle.containsKey("android.largeIcon.big")) {
            this.f22576f = g(bundle.getParcelable("android.largeIcon.big"));
            this.f22577g = true;
        }
        Parcelable parcelable = bundle.getParcelable("android.picture");
        this.f22575e = parcelable != null ? g(parcelable) : g(bundle.getParcelable("android.pictureIcon"));
        this.f22578h = bundle.getBoolean("android.showBigPictureWhenCollapsed");
    }
}

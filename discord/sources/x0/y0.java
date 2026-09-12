package x0;

import android.app.Notification;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f22582b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f22583c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Notification f22584d;

    public y0(String str, int i7, String str2, Notification notification) {
        this.f22581a = str;
        this.f22582b = i7;
        this.f22583c = str2;
        this.f22584d = notification;
    }

    public final void a(c.c cVar) {
        String str = this.f22581a;
        int i7 = this.f22582b;
        String str2 = this.f22583c;
        c.a aVar = (c.a) cVar;
        aVar.getClass();
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(c.c.f3402d);
            parcelObtain.writeString(str);
            parcelObtain.writeInt(i7);
            parcelObtain.writeString(str2);
            Notification notification = this.f22584d;
            if (notification != null) {
                parcelObtain.writeInt(1);
                notification.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            aVar.f3400f.transact(1, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NotifyTask[packageName:");
        sb2.append(this.f22581a);
        sb2.append(", id:");
        sb2.append(this.f22582b);
        sb2.append(", tag:");
        return com.discord.chat.presentation.list.a.k(sb2, this.f22583c, "]");
    }
}

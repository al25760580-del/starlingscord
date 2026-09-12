package x0;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.app.NotificationCompat$Action;
import androidx.core.app.NotificationCompat$Builder;
import androidx.core.app.RemoteInput;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IconCompat f22556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CharSequence f22557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PendingIntent f22558c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f22559d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Bundle f22560e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList f22561f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f22562g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f22563h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f22564i;
    public boolean j;

    public u(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
        this(iconCompat, charSequence, pendingIntent, new Bundle());
    }

    public final NotificationCompat$Action a() {
        CharSequence[] charSequenceArr;
        if (this.f22564i && this.f22558c == null) {
            throw new NullPointerException("Contextual Actions must contain a valid PendingIntent");
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList<RemoteInput> arrayList3 = this.f22561f;
        if (arrayList3 != null) {
            for (RemoteInput remoteInput : arrayList3) {
                if (remoteInput.f1534d || (!((charSequenceArr = remoteInput.f1533c) == null || charSequenceArr.length == 0) || remoteInput.f1537g.isEmpty())) {
                    arrayList2.add(remoteInput);
                } else {
                    arrayList.add(remoteInput);
                }
            }
        }
        return new NotificationCompat$Action(this.f22556a, this.f22557b, this.f22558c, this.f22560e, arrayList2.isEmpty() ? null : (RemoteInput[]) arrayList2.toArray(new RemoteInput[arrayList2.size()]), arrayList.isEmpty() ? null : (RemoteInput[]) arrayList.toArray(new RemoteInput[arrayList.size()]), this.f22559d, this.f22562g, this.f22563h, this.f22564i, this.j);
    }

    public u(int i7, CharSequence charSequence, PendingIntent pendingIntent) {
        this(i7 != 0 ? IconCompat.d(null, "", i7) : null, charSequence, pendingIntent, new Bundle());
    }

    public u(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle) {
        this.f22559d = true;
        this.f22563h = true;
        this.f22556a = iconCompat;
        this.f22557b = NotificationCompat$Builder.e(charSequence);
        this.f22558c = pendingIntent;
        this.f22560e = bundle;
        this.f22561f = null;
        this.f22559d = true;
        this.f22562g = 0;
        this.f22563h = true;
        this.f22564i = false;
        this.j = false;
    }
}

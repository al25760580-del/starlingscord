package x0;

import android.app.Notification;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class y extends v0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f22579e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f22580f;

    public y(int i7) {
        this.f22579e = i7;
        switch (i7) {
            case 1:
                this.f22580f = new ArrayList();
                break;
        }
    }

    @Override // x0.v0
    public final void b(hp.e eVar) {
        switch (this.f22579e) {
            case 0:
                Notification.BigTextStyle bigTextStyleBigText = new Notification.BigTextStyle((Notification.Builder) eVar.f10989i).setBigContentTitle(this.f22572b).bigText((CharSequence) this.f22580f);
                if (this.f22574d) {
                    bigTextStyleBigText.setSummaryText(this.f22573c);
                }
                break;
            default:
                Notification.InboxStyle bigContentTitle = new Notification.InboxStyle((Notification.Builder) eVar.f10989i).setBigContentTitle(this.f22572b);
                if (this.f22574d) {
                    bigContentTitle.setSummaryText(this.f22573c);
                }
                Iterator it = ((ArrayList) this.f22580f).iterator();
                while (it.hasNext()) {
                    bigContentTitle.addLine((CharSequence) it.next());
                }
                break;
        }
    }

    @Override // x0.v0
    public final void c(Bundle bundle) {
        switch (this.f22579e) {
            case 0:
                super.c(bundle);
                bundle.remove("android.bigText");
                break;
            default:
                super.c(bundle);
                bundle.remove("android.textLines");
                break;
        }
    }

    @Override // x0.v0
    public final String e() {
        switch (this.f22579e) {
            case 0:
                return "androidx.core.app.NotificationCompat$BigTextStyle";
            default:
                return "androidx.core.app.NotificationCompat$InboxStyle";
        }
    }

    @Override // x0.v0
    public final void f(Bundle bundle) {
        switch (this.f22579e) {
            case 0:
                super.f(bundle);
                this.f22580f = bundle.getCharSequence("android.bigText");
                break;
            default:
                super.f(bundle);
                ArrayList arrayList = (ArrayList) this.f22580f;
                arrayList.clear();
                if (bundle.containsKey("android.textLines")) {
                    Collections.addAll(arrayList, bundle.getCharSequenceArray("android.textLines"));
                }
                break;
        }
    }
}

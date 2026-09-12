package tr;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import fp.l;
import java.util.TimeZone;
import net.time4j.tz.c;
import net.time4j.tz.d;
import net.time4j.tz.i;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        synchronized (i.class) {
            do {
            } while (i.I.poll() != null);
            i.J.clear();
        }
        new l();
        String str = i.f16723d;
        i.H.clear();
        boolean z5 = i.f16726v;
        if (z5) {
            String id2 = TimeZone.getDefault().getID();
            i iVarB = i.b(null, id2, false);
            if (iVarB == null) {
                iVarB = new d(new c(id2));
            }
            i.f16727w = iVarB;
        }
        StringBuilder sb2 = new StringBuilder("Event ACTION_TIMEZONE_CHANGED received, system timezone changed to: [");
        sb2.append(((!z5 || i.f16727w == null) ? i.L : i.f16727w).a().a());
        sb2.append("]. Original tz-id reported by Android: [");
        sb2.append(intent.getStringExtra("time-zone"));
        sb2.append("]");
        Log.i("TIME4A", sb2.toString());
    }
}

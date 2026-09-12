package ph;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.google.android.play.agesignals.AgeSharingConsentWrapperActivity;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends qh.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final cg.b f18034g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ig.g f18035h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Activity f18036i;
    public final /* synthetic */ g j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, ig.g gVar2, Activity activity) {
        super("com.google.android.play.agesignals.protocol.IAgeSignalsAccessCallback", 1);
        Objects.requireNonNull(gVar);
        this.j = gVar;
        this.f18034g = new cg.b("OnAgeSignalsAccessCallback", 0);
        this.f18035h = gVar2;
        this.f18036i = activity;
    }

    public final void z(Bundle bundle) {
        PendingIntent pendingIntent;
        cg.b bVar = this.f18034g;
        bVar.c("onCompleteRequestAgeSignalsAccess", new Object[0]);
        g gVar = this.j;
        cg.h hVar = gVar.f18043c;
        ig.g gVar2 = this.f18035h;
        hVar.c(gVar2);
        if (bundle.containsKey("age.sharing.consent.intent")) {
            pendingIntent = Build.VERSION.SDK_INT >= 33 ? (PendingIntent) bundle.getParcelable("age.sharing.consent.intent", PendingIntent.class) : (PendingIntent) bundle.getParcelable("age.sharing.consent.intent");
        } else {
            pendingIntent = null;
        }
        if (pendingIntent == null) {
            gVar2.d(new i(bundle.containsKey("age.signals.status") ? Integer.valueOf(bundle.getInt("age.signals.status")) : null));
            return;
        }
        bVar.c("In-app age sharing consent", new Object[0]);
        Activity activity = this.f18036i;
        Intent intent = new Intent(activity, (Class<?>) AgeSharingConsentWrapperActivity.class);
        intent.putExtra("confirmation_intent", pendingIntent);
        intent.putExtra("result_receiver", new d(gVar, gVar.f18041a, gVar2));
        activity.startActivity(intent);
    }
}

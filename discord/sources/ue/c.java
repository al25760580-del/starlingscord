package ue;

import af.w;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements Runnable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a1.d f21100i = new a1.d("RevokeAccessOperation", new String[0]);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f21101d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ze.j f21102e;

    public c(String str) {
        w.d(str);
        this.f21101d = str;
        this.f21102e = new ze.j(null);
    }

    @Override // java.lang.Runnable
    public final void run() {
        a1.d dVar = f21100i;
        Status status = Status.f5935y;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://accounts.google.com/o/oauth2/revoke?token=" + this.f21101d).openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.f5933w;
            } else {
                Log.e((String) dVar.f18i, ((String) dVar.f19v).concat("Unable to revoke access!"));
            }
            String str = "Response Code: " + responseCode;
            if (dVar.f17e <= 3) {
                Log.d((String) dVar.f18i, ((String) dVar.f19v).concat(str));
            }
        } catch (IOException e10) {
            Log.e((String) dVar.f18i, ((String) dVar.f19v).concat("IOException when revoking access: ".concat(String.valueOf(e10.toString()))));
        } catch (Exception e11) {
            Log.e((String) dVar.f18i, ((String) dVar.f19v).concat("Exception when revoking access: ".concat(String.valueOf(e11.toString()))));
        }
        this.f21102e.setResult(status);
    }
}

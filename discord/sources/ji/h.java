package ji;

import af.w;
import android.content.Context;
import android.text.TextUtils;
import e4.l;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f13906c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f13907d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f13908e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f13909f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f13910g;

    public h(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        int i7 = ff.f.f9159a;
        w.i("ApplicationId must be set.", true ^ (str == null || str.trim().isEmpty()));
        this.f13905b = str;
        this.f13904a = str2;
        this.f13906c = str3;
        this.f13907d = str4;
        this.f13908e = str5;
        this.f13909f = str6;
        this.f13910g = str7;
    }

    public static h a(Context context) {
        l lVar = new l(context);
        String strQ = lVar.q("google_app_id");
        if (TextUtils.isEmpty(strQ)) {
            return null;
        }
        return new h(strQ, lVar.q("google_api_key"), lVar.q("firebase_database_url"), lVar.q("ga_trackingId"), lVar.q("gcm_defaultSenderId"), lVar.q("google_storage_bucket"), lVar.q("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return w.j(this.f13905b, hVar.f13905b) && w.j(this.f13904a, hVar.f13904a) && w.j(this.f13906c, hVar.f13906c) && w.j(this.f13907d, hVar.f13907d) && w.j(this.f13908e, hVar.f13908e) && w.j(this.f13909f, hVar.f13909f) && w.j(this.f13910g, hVar.f13910g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f13905b, this.f13904a, this.f13906c, this.f13907d, this.f13908e, this.f13909f, this.f13910g});
    }

    public final String toString() {
        e4.e eVar = new e4.e(this);
        eVar.w(this.f13905b, "applicationId");
        eVar.w(this.f13904a, "apiKey");
        eVar.w(this.f13906c, "databaseUrl");
        eVar.w(this.f13908e, "gcmSenderId");
        eVar.w(this.f13909f, "storageBucket");
        eVar.w(this.f13910g, "projectId");
        return eVar.toString();
    }
}

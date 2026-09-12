package tb;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import com.appsflyer.AdRevenueScheme;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;
import pc.r;
import si.d;
import ub.c;
import ub.f;
import ub.g;
import ub.h;
import ub.i;
import ub.j;
import ub.k;
import ub.l;
import ub.n;
import ub.o;
import ub.q;
import ub.s;
import ub.t;
import ub.u;
import ub.v;
import wb.e;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f20677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConnectivityManager f20678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f20679c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final URL f20680d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ec.a f20681e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ec.a f20682f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f20683g;

    public b(Context context, ec.a aVar, ec.a aVar2) {
        d dVar = new d();
        c cVar = c.f20963a;
        dVar.a(o.class, cVar);
        dVar.a(i.class, cVar);
        f fVar = f.f20976a;
        dVar.a(s.class, fVar);
        dVar.a(l.class, fVar);
        ub.d dVar2 = ub.d.f20965a;
        dVar.a(q.class, dVar2);
        dVar.a(j.class, dVar2);
        ub.b bVar = ub.b.f20952a;
        dVar.a(ub.a.class, bVar);
        dVar.a(h.class, bVar);
        ub.e eVar = ub.e.f20968a;
        dVar.a(ub.r.class, eVar);
        dVar.a(k.class, eVar);
        g gVar = g.f20984a;
        dVar.a(v.class, gVar);
        dVar.a(n.class, gVar);
        dVar.f20270d = true;
        this.f20677a = new r(dVar);
        this.f20679c = context;
        this.f20678b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f20680d = b(a.f20671c);
        this.f20681e = aVar2;
        this.f20682f = aVar;
        this.f20683g = 130000;
    }

    public static URL b(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e10) {
            throw new IllegalArgumentException(a3.e.l("Invalid url: ", str), e10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00af  */
    /* JADX WARN: Code duplicated, block: B:30:0x010a  */
    public final vb.h a(vb.h hVar) {
        int type;
        int subtype;
        HashMap map;
        NetworkInfo activeNetworkInfo = this.f20678b.getActiveNetworkInfo();
        af.c cVarC = hVar.c();
        int i7 = Build.VERSION.SDK_INT;
        HashMap map2 = (HashMap) cVarC.f397w;
        if (map2 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map2.put("sdk-version", String.valueOf(i7));
        cVarC.i("model", Build.MODEL);
        cVarC.i("hardware", Build.HARDWARE);
        cVarC.i("device", Build.DEVICE);
        cVarC.i("product", Build.PRODUCT);
        cVarC.i("os-uild", Build.ID);
        cVarC.i("manufacturer", Build.MANUFACTURER);
        cVarC.i("fingerprint", Build.FINGERPRINT);
        Calendar.getInstance();
        long offset = TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
        HashMap map3 = (HashMap) cVarC.f397w;
        if (map3 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map3.put("tz-offset", String.valueOf(offset));
        int i10 = -1;
        if (activeNetworkInfo == null) {
            SparseArray sparseArray = u.f21019d;
            type = -1;
        } else {
            type = activeNetworkInfo.getType();
        }
        HashMap map4 = (HashMap) cVarC.f397w;
        if (map4 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map4.put("net-type", String.valueOf(type));
        if (activeNetworkInfo != null) {
            subtype = activeNetworkInfo.getSubtype();
            if (subtype == -1) {
                SparseArray sparseArray2 = t.f21017d;
                subtype = 100;
            } else if (((t) t.f21017d.get(subtype)) == null) {
            }
            map = (HashMap) cVarC.f397w;
            if (map != null) {
                throw new IllegalStateException("Property \"autoMetadata\" has not been set");
            }
            map.put("mobile-subtype", String.valueOf(subtype));
            cVarC.i(AdRevenueScheme.COUNTRY, Locale.getDefault().getCountry());
            cVarC.i("locale", Locale.getDefault().getLanguage());
            Context context = this.f20679c;
            cVarC.i("mcc_mnc", ((TelephonyManager) context.getSystemService("phone")).getSimOperator());
            try {
                i10 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException e10) {
                io.sentry.config.a.p("CctTransportBackend", "Unable to find version code for package", e10);
            }
            cVarC.i("application_build", Integer.toString(i10));
            return cVarC.m();
        }
        SparseArray sparseArray3 = t.f21017d;
        subtype = 0;
        map = (HashMap) cVarC.f397w;
        if (map != null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map.put("mobile-subtype", String.valueOf(subtype));
        cVarC.i(AdRevenueScheme.COUNTRY, Locale.getDefault().getCountry());
        cVarC.i("locale", Locale.getDefault().getLanguage());
        Context context2 = this.f20679c;
        cVarC.i("mcc_mnc", ((TelephonyManager) context2.getSystemService("phone")).getSimOperator());
        i10 = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionCode;
        cVarC.i("application_build", Integer.toString(i10));
        return cVarC.m();
    }
}

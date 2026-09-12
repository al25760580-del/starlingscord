package zr;

import java.util.HashMap;
import java.util.Locale;
import yr.a0;
import yr.e0;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f24082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f24083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final HashMap f24084c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f24085d;

    static {
        HashMap map = new HashMap(140);
        f24082a = map;
        f24083b = new a();
        HashMap map2 = new HashMap();
        b("bm bo dz id ig ii in ja jbo jv jw kde kea km ko lkt", map2);
        b("lo ms my nqo root sah ses sg th to vi wo yo zh", map2);
        b("pt_PT", map2);
        b("am as bn fa gu hi kn zu", map2);
        b("ff fr hy kab pt", map2);
        b("si", map2);
        b("ak bh guw ln mg nso pa ti wa", map2);
        b("tzm", map2);
        b("is", map2);
        b("mk", map2);
        b("ceb fil tl", map2);
        b("lv prg", map2);
        b("lag ksh", map2);
        b("iu naq se sma smi smj smn sms", map2);
        b("shi", map2);
        b("mo ro", map2);
        b("bs hr sh sr", map2);
        b("gd", map2);
        b("sl", map2);
        b("he iw", map2);
        b("cs sk", map2);
        b("pl", map2);
        b("be", map2);
        b("lt", map2);
        b("mt", map2);
        b("ru uk", map2);
        b("br", map2);
        b("ga", map2);
        b("gv", map2);
        b("ar", map2);
        b("cy", map2);
        b("dsb hsb", map2);
        b("kw", map2);
        map.putAll(map2);
        HashMap map3 = new HashMap(140);
        f24084c = map3;
        f24085d = new a();
        HashMap map4 = new HashMap();
        c("sv", map4);
        c("fil fr ga hy lo mo ms ro tl vi", map4);
        c("hu", map4);
        c("ne", map4);
        c("kk", map4);
        c("it sc scn", map4);
        c("ka", map4);
        c("sq", map4);
        c("en", map4);
        c("mr", map4);
        c("ca", map4);
        c("mk", map4);
        c("az", map4);
        c("gu hi", map4);
        c("as bn", map4);
        c("cy", map4);
        c("be", map4);
        c("uk", map4);
        c("tk", map4);
        c("or", map4);
        c("gd", map4);
        c("kw", map4);
        map3.putAll(map4);
    }

    public static void b(String str, HashMap map) {
        for (String str2 : str.split(" ")) {
            map.put(str2, new a());
        }
    }

    public static void c(String str, HashMap map) {
        for (String str2 : str.split(" ")) {
            map.put(str2, new a());
        }
    }

    @Override // yr.a0
    public final e0 a(Locale locale) {
        HashMap map;
        a aVar;
        e0 e0Var;
        int iB = f0.e.b(1);
        if (iB == 0) {
            map = f24082a;
            aVar = f24083b;
        } else {
            if (iB != 1) {
                throw new UnsupportedOperationException("CARDINALS");
            }
            map = f24084c;
            aVar = f24085d;
        }
        String country = locale.getCountry();
        if (country.isEmpty()) {
            e0Var = null;
        } else {
            e0Var = (e0) map.get(locale.getLanguage() + '_' + country);
        }
        if (e0Var == null) {
            e0Var = (e0) map.get(locale.getLanguage());
        }
        return e0Var == null ? aVar : e0Var;
    }
}

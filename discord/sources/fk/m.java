package fk;

import com.facebook.react.devsupport.StackTraceHelper;
import java.util.EnumMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f9282a = b("EEE, MMM d", "d", "y");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i f9283b;

    static {
        i iVar = new i();
        iVar.put("af", b("EEE d MMM", "d", "y"));
        iVar.put("am", b("EEE፣ MMM d", "d", "y"));
        iVar.put("ar", b("EEE، d MMM", "d", "y"));
        iVar.put("ar_DZ", b("EEE، d MMM", "d", "y"));
        iVar.put("ar_EG", b("EEE، d MMM", "d", "y"));
        iVar.put("az", b("d MMM, EEE", "d", "y"));
        iVar.put("be", b("EEE, d MMM", "d", "y"));
        iVar.put("bg", b("EEE, d.MM", "d", "y 'г'."));
        iVar.put("bn", b("EEE d MMM", "d", "y"));
        iVar.put("br", b("EEE d MMM", "d", "y"));
        iVar.put("bs", b("EEE, d. MMM", "d.", "y."));
        iVar.put("ca", b("EEE, d MMM", "d", "y"));
        iVar.put("chr", b("EEE, MMM d", "d", "y"));
        iVar.put("cs", b("EEE d. M.", "d.", "y"));
        iVar.put("cy", b("EEE, d MMM", "d", "y"));
        iVar.put("da", b("EEE d. MMM", "d.", "y"));
        iVar.put("de", b("EEE, d. MMM", "d", "y"));
        iVar.put("de_AT", b("EEE, d. MMM", "d", "y"));
        iVar.put("de_CH", b("EEE, d. MMM", "d", "y"));
        iVar.put("el", b("EEE, d MMM", "d", "y"));
        iVar.put("en", b("EEE, MMM d", "d", "y"));
        iVar.put("en_AU", b("EEE, d MMM", "d", "y"));
        iVar.put("en_CA", b("EEE, MMM d", "d", "y"));
        iVar.put("en_GB", b("EEE, d MMM", "d", "y"));
        iVar.put("en_IE", b("EEE, d MMM", "d", "y"));
        iVar.put("en_IN", b("EEE, d MMM", "d", "y"));
        iVar.put("en_SG", b("EEE, d MMM", "d", "y"));
        iVar.put("en_US", b("EEE, MMM d", "d", "y"));
        iVar.put("en_ZA", b("EEE, dd MMM", "d", "y"));
        iVar.put("es", b("EEE, d MMM", "d", "y"));
        iVar.put("es_419", b("EEE, d MMM", "d", "y"));
        iVar.put("es_ES", b("EEE, d MMM", "d", "y"));
        iVar.put("es_MX", b("EEE d 'de' MMM", "d", "y"));
        iVar.put("es_US", b("EEE, d 'de' MMM", "d", "y"));
        iVar.put("et", b("EEE, d. MMM", "d", "y"));
        iVar.put("eu", b("MMM d, EEE", "d", "y"));
        iVar.put("fa", b("EEE d LLL", "d", "y"));
        iVar.put("fi", b("EEE d. MMM", "d", "y"));
        iVar.put("fil", b("EEE, MMM d", "d", "y"));
        iVar.put("fr", b("EEE d MMM", "d", "y"));
        iVar.put("fr_CA", b("EEE d MMM", "d", "y"));
        iVar.put("ga", b("EEE d MMM", "d", "y"));
        iVar.put("gl", b("EEE, d 'de' MMM", "d", "y"));
        iVar.put("gsw", b("EEE d. MMM", "d", "y"));
        iVar.put("gu", b("EEE, d MMM", "d", "y"));
        iVar.put("haw", b("EEE, d MMM", "d", "y"));
        iVar.put("he", b("EEE, d בMMM", "d", "y"));
        iVar.put("hi", b("EEE, d MMM", "d", "y"));
        iVar.put("hr", b("EEE, d. MMM", "d.", "y."));
        iVar.put("hu", b("MMM d., EEE", "d", "y."));
        iVar.put("hy", b("d MMM, EEE", "d", "y"));
        iVar.put(StackTraceHelper.ID_KEY, b("EEE, d MMM", "d", "y"));
        iVar.put("in", b("EEE, d MMM", "d", "y"));
        iVar.put("is", b("EEE, d. MMM", "d", "y"));
        iVar.put("it", b("EEE d MMM", "d", "y"));
        iVar.put("iw", b("EEE, d בMMM", "d", "y"));
        iVar.put("ja", b("M月d日 EEE", "d日", "y年"));
        iVar.put("ka", b("EEE, d MMM", "d", "y"));
        iVar.put("kk", b("d MMM, EEE", "d", "y"));
        iVar.put("km", b("EEE d MMM", "d", "y"));
        iVar.put("kn", b("EEE, d MMM", "d", "y"));
        iVar.put("ko", b("MMM d일 EEE", "d일", "y년"));
        iVar.put("ky", b("d-MMM, EEE", "d", "y"));
        iVar.put("lb", b("EEE d MMM", "d", "y"));
        iVar.put("ln", b("EEE d MMM", "d", "y"));
        iVar.put("lo", b("EEE d MMM", "d", "y"));
        iVar.put("lt", b("MM-dd, EEE", "dd", "y"));
        iVar.put("lv", b("EEE, d. MMM", "d", "y. 'g'."));
        iVar.put("mk", b("EEE, d MMM", "d", "y"));
        iVar.put("ml", b("MMM d, EEE", "d", "y"));
        iVar.put("mn", b("MMM'ын' d. EEE", "d", "y"));
        iVar.put("mo", b("EEE, d MMM", "d", "y"));
        iVar.put("mr", b("EEE, d MMM", "d", "y"));
        iVar.put("ms", b("EEE, d MMM", "d", "y"));
        iVar.put("mt", b("EEE, d 'ta'’ MMM", "d", "y"));
        iVar.put("my", b("MMM d၊ EEE", "d", "y"));
        iVar.put("nb", b("EEE d. MMM", "d.", "y"));
        iVar.put("ne", b("MMM d, EEE", "d", "y"));
        iVar.put("nl", b("EEE d MMM", "d", "y"));
        iVar.put("nn", b("EEE d. MMM", "d.", "y"));
        iVar.put("no", b("EEE d. MMM", "d.", "y"));
        iVar.put("no_NO", b("EEE d. MMM", "d.", "y"));
        iVar.put("or", b("EEE, MMM d", "d", "y"));
        iVar.put("pa", b("EEE, d MMM", "d", "y"));
        iVar.put("pl", b("EEE, d MMM", "d", "y"));
        iVar.put("pt", b("EEE, d 'de' MMM", "d", "y"));
        iVar.put("pt_BR", b("EEE, d 'de' MMM", "d", "y"));
        iVar.put("pt_PT", b("EEE, d/MM", "d", "y"));
        iVar.put("ro", b("EEE, d MMM", "d", "y"));
        iVar.put("ru", b("ccc, d MMM", "d", "y"));
        iVar.put("sh", b("EEE d. MMM", "d", "y."));
        iVar.put("si", b("MMM d EEE", "d", "y"));
        iVar.put("sk", b("EEE d. M.", "d.", "y"));
        iVar.put("sl", b("EEE, d. MMM", "d.", "y"));
        iVar.put("sq", b("EEE, d MMM", "d", "y"));
        iVar.put("sr", b("EEE d. MMM", "d", "y."));
        iVar.put("sr_Latn", b("EEE d. MMM", "d", "y."));
        iVar.put("sv", b("EEE d MMM", "d", "y"));
        iVar.put("sw", b("EEE, d MMM", "d", "y"));
        iVar.put("ta", b("MMM d, EEE", "d", "y"));
        iVar.put("te", b("d MMM, EEE", "d", "y"));
        iVar.put("th", b("EEE d MMM", "d", "y"));
        iVar.put("tl", b("EEE, MMM d", "d", "y"));
        iVar.put("tr", b("d MMMM EEE", "d", "y"));
        iVar.put("uk", b("EEE, d MMM", "d", "y"));
        iVar.put("ur", b("EEE، d MMM", "d", "y"));
        iVar.put("uz", b("EEE, d-MMM", "d", "y"));
        iVar.put("vi", b("EEE, d MMM", "d", "y"));
        iVar.put("zh", b("M月d日EEE", "d日", "y年"));
        iVar.put("zh_CN", b("M月d日EEE", "d日", "y年"));
        iVar.put("zh_HK", b("M月d日EEE", "d日", "y年"));
        iVar.put("zh_TW", b("M月d日 EEE", "d日", "y年"));
        iVar.put("zu", b("EEE, MMM d", "d", "y"));
        iVar.put("en_ISO", b("EEE, MMM d", "d", "y"));
        iVar.put("en_MY", b("EEE, d MMM", "d", "y"));
        iVar.put("fr_CH", b("EEE d MMM", "d", "y"));
        iVar.put("it_CH", b("EEE d MMM", "d", "y"));
        iVar.put("ps", b("MMM d, EEE", "d", "y"));
        f9283b = iVar;
    }

    public static String a(String str, k kVar) throws l {
        try {
            return ((String) ((EnumMap) f9283b.get(str)).get(kVar)).replaceAll(",", "");
        } catch (NullPointerException unused) {
            throw new l();
        }
    }

    public static j b(String str, String str2, String str3) {
        j jVar = new j(k.class);
        jVar.put(k.f9278d, str);
        jVar.put(k.f9279e, str2);
        jVar.put(k.f9280i, str3);
        return jVar;
    }
}

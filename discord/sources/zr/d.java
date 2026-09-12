package zr;

import com.facebook.react.devsupport.StackTraceHelper;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public enum d {
    /* JADX INFO: Fake field, exist only in values array */
    tl("fil"),
    /* JADX INFO: Fake field, exist only in values array */
    no("nb"),
    /* JADX INFO: Fake field, exist only in values array */
    in(StackTraceHelper.ID_KEY),
    /* JADX INFO: Fake field, exist only in values array */
    iw("he");


    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d[] f24087d = values();
    private final String alias;

    d(String str) {
        this.alias = str;
    }

    public static String a(Locale locale) {
        String language = locale.getLanguage();
        if (language.equals("no") && locale.getVariant().equals("NY") && locale.getCountry().equals("NO")) {
            return "nn";
        }
        for (d dVar : f24087d) {
            if (language.equals(dVar.name())) {
                return dVar.alias;
            }
        }
        return language;
    }
}

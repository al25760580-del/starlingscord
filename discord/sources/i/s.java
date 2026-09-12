package i;

import android.content.res.Configuration;
import android.os.LocaleList;
import androidx.annotation.NonNull;
import androidx.core.os.LocaleListCompat;

/* JADX INFO: loaded from: classes.dex */
public abstract class s {
    public static void a(@NonNull Configuration configuration, @NonNull Configuration configuration2, @NonNull Configuration configuration3) {
        LocaleList locales = configuration.getLocales();
        LocaleList locales2 = configuration2.getLocales();
        if (locales.equals(locales2)) {
            return;
        }
        configuration3.setLocales(locales2);
        configuration3.locale = configuration2.locale;
    }

    public static LocaleListCompat b(Configuration configuration) {
        return LocaleListCompat.a(configuration.getLocales().toLanguageTags());
    }

    public static void c(LocaleListCompat localeListCompat) {
        LocaleList.setDefault(LocaleList.forLanguageTags(localeListCompat.f1570a.f8789a.toLanguageTags()));
    }

    public static void d(Configuration configuration, LocaleListCompat localeListCompat) {
        configuration.setLocales(LocaleList.forLanguageTags(localeListCompat.f1570a.f8789a.toLanguageTags()));
    }
}

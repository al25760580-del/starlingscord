package androidx.core.os;

import android.os.LocaleList;
import f1.c;
import f1.d;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class LocaleListCompat {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final LocaleListCompat f1569b = new LocaleListCompat(new d(new LocaleList(new Locale[0])));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f1570a;

    public LocaleListCompat(d dVar) {
        this.f1570a = dVar;
    }

    public static LocaleListCompat a(String str) {
        if (str == null || str.isEmpty()) {
            return f1569b;
        }
        String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i7 = 0; i7 < length; i7++) {
            String str2 = strArrSplit[i7];
            int i10 = c.f8788a;
            localeArr[i7] = Locale.forLanguageTag(str2);
        }
        return new LocaleListCompat(new d(new LocaleList(localeArr)));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof LocaleListCompat) {
            return this.f1570a.equals(((LocaleListCompat) obj).f1570a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1570a.f8789a.hashCode();
    }

    public final String toString() {
        return this.f1570a.f8789a.toString();
    }
}

package com.facebook.hermes.unicode;

import java.text.Collator;
import java.text.DateFormat;
import java.text.Normalizer;
import java.util.Locale;
import xa.a;

/* JADX INFO: loaded from: classes3.dex */
@a
public class AndroidUnicodeUtils {
    @a
    public static String convertToCase(String str, int i7, boolean z5) {
        Locale locale = z5 ? Locale.getDefault() : Locale.ENGLISH;
        if (i7 == 0) {
            return str.toUpperCase(locale);
        }
        if (i7 == 1) {
            return str.toLowerCase(locale);
        }
        throw new RuntimeException("Invalid target case");
    }

    @a
    public static String dateFormat(double d6, boolean z5, boolean z6) {
        DateFormat timeInstance;
        if (z5 && z6) {
            timeInstance = DateFormat.getDateTimeInstance(2, 2);
        } else if (z5) {
            timeInstance = DateFormat.getDateInstance(2);
        } else {
            if (!z6) {
                throw new RuntimeException("Bad dateFormat configuration");
            }
            timeInstance = DateFormat.getTimeInstance(2);
        }
        return timeInstance.format(Long.valueOf((long) d6)).toString();
    }

    @a
    public static int localeCompare(String str, String str2) {
        return Collator.getInstance().compare(str, str2);
    }

    @a
    public static String normalize(String str, int i7) {
        if (i7 == 0) {
            return Normalizer.normalize(str, Normalizer.Form.NFC);
        }
        if (i7 == 1) {
            return Normalizer.normalize(str, Normalizer.Form.NFD);
        }
        if (i7 == 2) {
            return Normalizer.normalize(str, Normalizer.Form.NFKC);
        }
        if (i7 == 3) {
            return Normalizer.normalize(str, Normalizer.Form.NFKD);
        }
        throw new RuntimeException("Invalid form");
    }
}

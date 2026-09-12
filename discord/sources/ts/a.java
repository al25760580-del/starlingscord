package ts;

import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    static {
        new ConcurrentHashMap();
        new ConcurrentHashMap();
    }

    public static boolean a(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        int length = str.length();
        for (int i7 = 0; i7 < length; i7++) {
            if (Character.isUpperCase(str.charAt(i7))) {
            }
        }
        return str.length() == 2;
    }

    public static boolean b(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        int length = str.length();
        for (int i7 = 0; i7 < length; i7++) {
            if (Character.isLowerCase(str.charAt(i7))) {
            }
        }
        return str.length() == 2 || str.length() == 3;
    }

    public static boolean c(String str) {
        if (str != null && str.length() != 0) {
            int length = str.length();
            for (int i7 = 0; i7 < length; i7++) {
                if (Character.isDigit(str.charAt(i7))) {
                }
            }
            if (str.length() == 3) {
                return true;
            }
        }
        return false;
    }

    public static Locale d(String str) {
        if (str == null) {
            return null;
        }
        if (str.isEmpty()) {
            return new Locale("", "");
        }
        if (str.contains("#")) {
            throw new IllegalArgumentException("Invalid locale format: ".concat(str));
        }
        int length = str.length();
        if (length < 2) {
            throw new IllegalArgumentException("Invalid locale format: ".concat(str));
        }
        if (str.charAt(0) == '_') {
            if (length < 3) {
                throw new IllegalArgumentException("Invalid locale format: ".concat(str));
            }
            char cCharAt = str.charAt(1);
            char cCharAt2 = str.charAt(2);
            if (!Character.isUpperCase(cCharAt) || !Character.isUpperCase(cCharAt2)) {
                throw new IllegalArgumentException("Invalid locale format: ".concat(str));
            }
            if (length == 3) {
                return new Locale("", str.substring(1, 3));
            }
            if (length < 5) {
                throw new IllegalArgumentException("Invalid locale format: ".concat(str));
            }
            if (str.charAt(3) == '_') {
                return new Locale("", str.substring(1, 3), str.substring(4));
            }
            throw new IllegalArgumentException("Invalid locale format: ".concat(str));
        }
        if (b(str)) {
            return new Locale(str);
        }
        String[] strArrSplit = str.split("_", -1);
        String str2 = strArrSplit[0];
        if (strArrSplit.length == 2) {
            String str3 = strArrSplit[1];
            if ((b(str2) && a(str3)) || c(str3)) {
                return new Locale(str2, str3);
            }
        } else if (strArrSplit.length == 3) {
            String str4 = strArrSplit[1];
            String str5 = strArrSplit[2];
            if (b(str2) && ((str4.isEmpty() || a(str4) || c(str4)) && !str5.isEmpty())) {
                return new Locale(str2, str4, str5);
            }
        }
        throw new IllegalArgumentException("Invalid locale format: ".concat(str));
    }
}

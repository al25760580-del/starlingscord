package yr;

import java.text.DateFormatSymbols;
import java.text.Normalizer;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23520a;

    public static String[] h(String[] strArr, int i7) {
        String[] strArr2 = new String[i7];
        for (int i10 = 0; i10 < i7; i10++) {
            if (strArr[i10].isEmpty()) {
                strArr2[i10] = String.valueOf(i10 + 1);
            } else {
                strArr2[i10] = i(strArr[i10]);
            }
        }
        return strArr2;
    }

    public static String i(String str) {
        char cCharAt = Normalizer.normalize(str, Normalizer.Form.NFD).charAt(0);
        if (cCharAt >= 'A' && cCharAt <= 'Z') {
            return String.valueOf(cCharAt);
        }
        if (cCharAt >= 'a' && cCharAt <= 'z') {
            return String.valueOf((char) (cCharAt - ' '));
        }
        if (cCharAt < 1040 || cCharAt > 1071) {
            return (cCharAt < 1072 || cCharAt > 1103) ? str : String.valueOf((char) (cCharAt - ' '));
        }
        return String.valueOf(cCharAt);
    }

    @Override // yr.h0
    public final String[] a(Locale locale, i0 i0Var, y yVar) {
        switch (this.f23520a) {
            case 0:
                return i0Var == i0.f23545v ? new String[]{"A", "P"} : new String[]{"AM", "PM"};
            default:
                return i0Var == i0.f23545v ? new String[]{"A", "P"} : DateFormatSymbols.getInstance(locale).getAmPmStrings();
        }
    }

    @Override // yr.h0
    public final String[] b(Locale locale, i0 i0Var, y yVar) {
        switch (this.f23520a) {
            case 0:
                return i0Var == i0.f23545v ? new String[]{"1", "2", "3", "4"} : new String[]{"Q1", "Q2", "Q3", "Q4"};
            default:
                return new String[]{"Q1", "Q2", "Q3", "Q4"};
        }
    }

    @Override // yr.h0
    public final boolean c(Locale locale) {
        switch (this.f23520a) {
            case 0:
                return true;
            default:
                String language = locale.getLanguage();
                for (Locale locale2 : DateFormatSymbols.getAvailableLocales()) {
                    if (locale2.getLanguage().equals(language)) {
                        return true;
                    }
                }
                return false;
        }
    }

    @Override // yr.h0
    public final String[] d(String str, Locale locale, i0 i0Var) {
        switch (this.f23520a) {
            case 0:
                return i0Var == i0.f23545v ? new String[]{"B", "A"} : new String[]{"BC", "AD"};
            default:
                DateFormatSymbols dateFormatSymbols = DateFormatSymbols.getInstance(locale);
                if (i0Var != i0.f23545v) {
                    return dateFormatSymbols.getEras();
                }
                String[] eras = dateFormatSymbols.getEras();
                String[] strArr = new String[eras.length];
                int length = eras.length;
                for (int i7 = 0; i7 < length; i7++) {
                    if (!eras[i7].isEmpty()) {
                        strArr[i7] = i(eras[i7]);
                    } else if (i7 == 0 && eras.length == 2) {
                        strArr[i7] = "B";
                    } else if (i7 == 1 && eras.length == 2) {
                        strArr[i7] = "A";
                    } else {
                        strArr[i7] = String.valueOf(i7);
                    }
                }
                return strArr;
        }
    }

    @Override // yr.h0
    public final String[] e(Locale locale, i0 i0Var, y yVar) {
        String[] weekdays;
        switch (this.f23520a) {
            case 0:
                return new String[]{"1", "2", "3", "4", "5", "6", "7"};
            default:
                DateFormatSymbols dateFormatSymbols = DateFormatSymbols.getInstance(locale);
                int iOrdinal = i0Var.ordinal();
                if (iOrdinal == 0) {
                    weekdays = dateFormatSymbols.getWeekdays();
                } else if (iOrdinal == 1 || iOrdinal == 2) {
                    weekdays = dateFormatSymbols.getShortWeekdays();
                } else {
                    if (iOrdinal != 3) {
                        throw new UnsupportedOperationException("Unknown text width: " + i0Var);
                    }
                    weekdays = h(e(locale, i0.f23544i, yVar), 7);
                }
                if (weekdays.length <= 7) {
                    return weekdays;
                }
                String str = weekdays[1];
                String[] strArr = new String[7];
                System.arraycopy(weekdays, 2, strArr, 0, 6);
                strArr[6] = str;
                return strArr;
        }
    }

    @Override // yr.h0
    public final boolean f(String str) {
        switch (this.f23520a) {
            case 0:
                return true;
            default:
                return "iso8601".equals(str);
        }
    }

    @Override // yr.h0
    public final String[] g(String str, Locale locale, i0 i0Var, y yVar, boolean z5) {
        switch (this.f23520a) {
            case 0:
                return i0Var == i0.f23542d ? new String[]{"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13"} : new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13"};
            default:
                DateFormatSymbols dateFormatSymbols = DateFormatSymbols.getInstance(locale);
                int iOrdinal = i0Var.ordinal();
                if (iOrdinal == 0) {
                    return dateFormatSymbols.getMonths();
                }
                if (iOrdinal == 1 || iOrdinal == 2) {
                    return dateFormatSymbols.getShortMonths();
                }
                if (iOrdinal == 3) {
                    return h(dateFormatSymbols.getShortMonths(), 12);
                }
                throw new UnsupportedOperationException(i0Var.name());
        }
    }

    public final String toString() {
        switch (this.f23520a) {
            case 0:
                return "FallbackProvider";
            default:
                return "JDKTextProvider";
        }
    }
}

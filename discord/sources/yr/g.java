package yr;

import java.text.DecimalFormatSymbols;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements h {
    @Override // yr.h
    public final String a(Locale locale) {
        return locale.getLanguage().equals("ar") ? "\u200f-" : String.valueOf(DecimalFormatSymbols.getInstance(locale).getMinusSign());
    }

    @Override // yr.h
    public final Locale[] b() {
        return DecimalFormatSymbols.getAvailableLocales();
    }

    @Override // yr.h
    public final char c(Locale locale) {
        return DecimalFormatSymbols.getInstance(locale).getZeroDigit();
    }
}

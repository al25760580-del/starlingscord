package gk;

import android.icu.text.DecimalFormatSymbols;
import java.util.Formatter;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringBuilder f10059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public char f10060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Formatter f10061c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object[] f10062d;

    public h() {
        StringBuilder sb2 = new StringBuilder();
        this.f10059a = sb2;
        this.f10062d = new Object[1];
        Locale locale = Locale.getDefault();
        this.f10061c = new Formatter(sb2, locale);
        this.f10060b = DecimalFormatSymbols.getInstance(locale).getZeroDigit();
    }
}

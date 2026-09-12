package okhttp3;

import java.text.DateFormat;
import java.util.Date;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class Cookie {
    public static final Pattern j = Pattern.compile("(\\d{2,4})[^\\d]*");
    public static final Pattern k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Pattern f17301l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Pattern f17302m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17304b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f17305c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f17306d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f17307e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f17308f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f17309g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f17310h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f17311i;

    public Cookie(String str, String str2, long j5, String str3, String str4, boolean z5, boolean z6, boolean z7, boolean z10) {
        this.f17303a = str;
        this.f17304b = str2;
        this.f17305c = j5;
        this.f17306d = str3;
        this.f17307e = str4;
        this.f17308f = z5;
        this.f17309g = z6;
        this.f17310h = z7;
        this.f17311i = z10;
    }

    public final String a(boolean z5) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f17303a);
        sb2.append('=');
        sb2.append(this.f17304b);
        if (this.f17310h) {
            long j5 = this.f17305c;
            if (j5 == Long.MIN_VALUE) {
                sb2.append("; max-age=0");
            } else {
                sb2.append("; expires=");
                Date date = new Date(j5);
                hs.c cVar = hs.d.f11127a;
                Intrinsics.checkNotNullParameter(date, "<this>");
                String str = ((DateFormat) hs.d.f11127a.get()).format(date);
                Intrinsics.checkNotNullExpressionValue(str, "STANDARD_DATE_FORMAT.get().format(this)");
                sb2.append(str);
            }
        }
        if (!this.f17311i) {
            sb2.append("; domain=");
            if (z5) {
                sb2.append(".");
            }
            sb2.append(this.f17306d);
        }
        sb2.append("; path=");
        sb2.append(this.f17307e);
        if (this.f17308f) {
            sb2.append("; secure");
        }
        if (this.f17309g) {
            sb2.append("; httponly");
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString()");
        return string;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Cookie)) {
            return false;
        }
        Cookie cookie = (Cookie) obj;
        return Intrinsics.areEqual(cookie.f17303a, this.f17303a) && Intrinsics.areEqual(cookie.f17304b, this.f17304b) && cookie.f17305c == this.f17305c && Intrinsics.areEqual(cookie.f17306d, this.f17306d) && Intrinsics.areEqual(cookie.f17307e, this.f17307e) && cookie.f17308f == this.f17308f && cookie.f17309g == this.f17309g && cookie.f17310h == this.f17310h && cookie.f17311i == this.f17311i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f17311i) + com.discord.chat.presentation.list.a.g(com.discord.chat.presentation.list.a.g(com.discord.chat.presentation.list.a.g(a3.e.d(a3.e.d(com.discord.chat.presentation.list.a.h(this.f17305c, a3.e.d(a3.e.d(527, 31, this.f17303a), 31, this.f17304b), 31), 31, this.f17306d), 31, this.f17307e), 31, this.f17308f), 31, this.f17309g), 31, this.f17310h);
    }

    public final String toString() {
        return a(false);
    }
}

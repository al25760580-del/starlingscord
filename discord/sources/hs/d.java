package hs;

import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f11127a = new c(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f11128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final DateFormat[] f11129c;

    static {
        String[] strArr = {"EEE, dd MMM yyyy HH:mm:ss zzz", "EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z"};
        f11128b = strArr;
        f11129c = new DateFormat[strArr.length];
    }

    public static final Date a(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (str.length() == 0) {
            return null;
        }
        ParsePosition parsePosition = new ParsePosition(0);
        Date date = ((DateFormat) f11127a.get()).parse(str, parsePosition);
        if (parsePosition.getIndex() == str.length()) {
            return date;
        }
        String[] strArr = f11128b;
        synchronized (strArr) {
            try {
                int length = strArr.length;
                int i7 = 0;
                while (i7 < length) {
                    int i10 = i7 + 1;
                    DateFormat[] dateFormatArr = f11129c;
                    DateFormat simpleDateFormat = dateFormatArr[i7];
                    if (simpleDateFormat == null) {
                        simpleDateFormat = new SimpleDateFormat(f11128b[i7], Locale.US);
                        simpleDateFormat.setTimeZone(ds.b.f7819e);
                        dateFormatArr[i7] = simpleDateFormat;
                    }
                    parsePosition.setIndex(0);
                    Date date2 = simpleDateFormat.parse(str, parsePosition);
                    if (parsePosition.getIndex() != 0) {
                        return date2;
                    }
                    i7 = i10;
                }
                Unit unit = Unit.f14616a;
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}

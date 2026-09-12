package ee;

import gc.h1;
import java.util.regex.Pattern;
import je.e0;
import je.w;

/* JADX INFO: loaded from: classes3.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f8185a = Pattern.compile("^NOTE([ \t].*)?$");

    public static boolean a(w wVar) {
        wVar.getClass();
        String strH = wVar.h(di.d.f7631c);
        return strH != null && strH.startsWith("WEBVTT");
    }

    public static float b(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long c(String str) {
        int i7 = e0.f13788a;
        String[] strArrSplit = str.split("\\.", 2);
        long j = 0;
        for (String str2 : strArrSplit[0].split(":", -1)) {
            j = (j * 60) + Long.parseLong(str2);
        }
        long j5 = j * 1000;
        if (strArrSplit.length == 2) {
            j5 += Long.parseLong(strArrSplit[1]);
        }
        return j5 * 1000;
    }

    public static void d(w wVar) throws h1 {
        int i7 = wVar.f13861b;
        if (a(wVar)) {
            return;
        }
        wVar.F(i7);
        throw h1.a("Expected WEBVTT. Got " + wVar.h(di.d.f7631c), null);
    }
}

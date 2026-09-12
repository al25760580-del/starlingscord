package x9;

import android.icu.text.NumberFormat;
import android.icu.text.UFormat;
import android.icu.util.MeasureUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class c0 implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public UFormat f22676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public NumberFormat f22677b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b0 f22678c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public w f22679d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public MeasureUnit f22680e;

    /* JADX WARN: Code duplicated, block: B:22:0x0043  */
    /* JADX WARN: Code duplicated, block: B:24:0x004d  */
    /* JADX WARN: Code duplicated, block: B:27:0x0067  */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
    
        if (r9 != 3) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final x9.y a(x9.v r9) {
        /*
            r8 = this;
            android.icu.text.NumberFormat r0 = r8.f22677b
            boolean r1 = r0 instanceof android.icu.text.DecimalFormat
            if (r1 == 0) goto L77
            android.icu.text.DecimalFormat r0 = (android.icu.text.DecimalFormat) r0
            android.icu.text.DecimalFormatSymbols r1 = r0.getDecimalFormatSymbols()
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 31
            r4 = 0
            r5 = 3
            r6 = 2
            r7 = 1
            if (r2 < r3) goto L29
            int r9 = r9.ordinal()
            if (r9 == r7) goto L25
            if (r9 == r6) goto L21
            if (r9 == r5) goto L25
            goto L77
        L21:
            r0.setSignAlwaysShown(r4)
            return r8
        L25:
            r0.setSignAlwaysShown(r7)
            return r8
        L29:
            int r9 = r9.ordinal()
            if (r9 == r7) goto L43
            if (r9 == r6) goto L34
            if (r9 == r5) goto L43
            goto L77
        L34:
            java.lang.String r9 = ""
            r0.setPositivePrefix(r9)
            r0.setPositiveSuffix(r9)
            r0.setNegativePrefix(r9)
            r0.setNegativeSuffix(r9)
            return r8
        L43:
            java.lang.String r9 = r0.getNegativePrefix()
            boolean r9 = r9.isEmpty()
            if (r9 != 0) goto L5d
            java.lang.String r9 = new java.lang.String
            char r2 = r1.getPlusSign()
            char[] r3 = new char[r7]
            r3[r4] = r2
            r9.<init>(r3)
            r0.setPositivePrefix(r9)
        L5d:
            java.lang.String r9 = r0.getNegativeSuffix()
            boolean r9 = r9.isEmpty()
            if (r9 != 0) goto L77
            java.lang.String r9 = new java.lang.String
            char r1 = r1.getPlusSign()
            char[] r2 = new char[r7]
            r2[r4] = r1
            r9.<init>(r2)
            r0.setPositiveSuffix(r9)
        L77:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: x9.c0.a(x9.v):x9.y");
    }
}

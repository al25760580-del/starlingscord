package com.facebook.hermes.intl;

import a3.e;
import ag.b;
import android.icu.text.CompactDecimalFormat;
import android.icu.text.DecimalFormat;
import android.icu.text.DecimalFormatSymbols;
import android.icu.text.MeasureFormat;
import android.icu.text.NumberingSystem;
import android.icu.text.UFormat;
import android.icu.util.Currency;
import android.icu.util.Measure;
import android.icu.util.MeasureUnit;
import android.icu.util.ULocale;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.views.scroll.ReactScrollViewHelper;
import java.text.AttributedCharacterIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import x9.a0;
import x9.b0;
import x9.c0;
import x9.r;
import x9.s;
import x9.t;
import x9.u;
import x9.v;
import x9.w;
import x9.x;
import x9.z;
import xa.a;

/* JADX INFO: loaded from: classes3.dex */
@a
public class NumberFormat {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String[] f4770v = {"acre", "bit", "byte", "celsius", "centimeter", "day", "degree", "fahrenheit", "fluid-ounce", "foot", "gallon", "gigabit", "gigabyte", "gram", "hectare", "hour", "inch", "kilobit", "kilobyte", "kilogram", "kilometer", "liter", "megabit", "megabyte", "meter", "mile", "mile-scandinavian", "milliliter", "millimeter", "millisecond", "minute", "month", "ounce", "percent", "petabyte", "pound", "second", "stone", "terabit", "terabyte", "week", "yard", "year"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f4771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s f4773c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f4774d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f4775e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final x f4776f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f4777g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f4778h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f4779i;
    public final int j;
    public final int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f4780l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f4781m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final v f4782n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final c0 f4783o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f4784p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f4785q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final u f4786r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final r f4787s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final b0 f4788t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final b0 f4789u;

    /* JADX WARN: Code duplicated, block: B:102:0x03e7  */
    /* JADX WARN: Code duplicated, block: B:104:0x03eb  */
    /* JADX WARN: Code duplicated, block: B:108:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:111:0x03f9  */
    /* JADX WARN: Code duplicated, block: B:112:0x03fc  */
    /* JADX WARN: Code duplicated, block: B:114:0x0416  */
    /* JADX WARN: Code duplicated, block: B:117:0x0420  */
    /* JADX WARN: Code duplicated, block: B:119:0x0423  */
    /* JADX WARN: Code duplicated, block: B:124:0x042c  */
    /* JADX WARN: Code duplicated, block: B:125:0x042e  */
    /* JADX WARN: Code duplicated, block: B:127:0x0432  */
    /* JADX WARN: Code duplicated, block: B:128:0x0434  */
    /* JADX WARN: Code duplicated, block: B:130:0x0438  */
    /* JADX WARN: Code duplicated, block: B:131:0x043a  */
    /* JADX WARN: Code duplicated, block: B:133:0x0444  */
    /* JADX WARN: Code duplicated, block: B:136:0x0451  */
    /* JADX WARN: Code duplicated, block: B:140:0x046a  */
    /* JADX WARN: Code duplicated, block: B:143:0x0478  */
    /* JADX WARN: Code duplicated, block: B:145:0x0486  */
    /* JADX WARN: Code duplicated, block: B:147:0x0489  */
    /* JADX WARN: Code duplicated, block: B:151:0x0495  */
    /* JADX WARN: Code duplicated, block: B:154:0x04ad  */
    /* JADX WARN: Code duplicated, block: B:157:0x04be  */
    /* JADX WARN: Code duplicated, block: B:161:0x04c5  */
    /* JADX WARN: Code duplicated, block: B:163:0x04ca  */
    /* JADX WARN: Code duplicated, block: B:165:0x04d0  */
    /* JADX WARN: Code duplicated, block: B:167:0x04d5  */
    /* JADX WARN: Code duplicated, block: B:172:0x04eb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:173:0x04ed  */
    /* JADX WARN: Code duplicated, block: B:175:0x04f4  */
    /* JADX WARN: Code duplicated, block: B:178:0x04ff  */
    /* JADX WARN: Code duplicated, block: B:181:0x0512  */
    /* JADX WARN: Code duplicated, block: B:184:0x0520  */
    /* JADX WARN: Code duplicated, block: B:186:0x0530  */
    /* JADX WARN: Code duplicated, block: B:190:0x0562  */
    /* JADX WARN: Code duplicated, block: B:192:0x0565  */
    /* JADX WARN: Code duplicated, block: B:193:0x0568  */
    /* JADX WARN: Code duplicated, block: B:194:0x056b  */
    /* JADX WARN: Code duplicated, block: B:199:0x0584 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:204:0x03b8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:208:0x0576 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:209:0x0552 A[EDGE_INSN: B:209:0x0552->B:188:0x0552 BREAK  A[LOOP:0: B:182:0x051a->B:211:?], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x018e  */
    /* JADX WARN: Code duplicated, block: B:43:0x01b5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:47:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:52:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:54:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:55:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:60:0x0279  */
    /* JADX WARN: Code duplicated, block: B:86:0x0361  */
    /* JADX WARN: Code duplicated, block: B:89:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:90:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:95:0x03be  */
    /* JADX WARN: Code duplicated, block: B:96:0x03cc  */
    /* JADX WARN: Instruction removed from duplicated block: B:186:0x0530, please report this as an issue */
    @a
    public NumberFormat(List<String> list, Map<String, Object> map) throws b {
        Object objD;
        w wVar;
        w wVar2;
        Double dValueOf;
        Double dValueOf2;
        Double dValueOf3;
        Double dValueOf4;
        Object objC;
        Object objC2;
        boolean z5;
        u uVar;
        u uVar2;
        Object objD2;
        b0 b0Var;
        String str;
        w wVar3;
        t tVar;
        u uVar3;
        r rVar;
        w wVar4;
        c0 c0Var;
        String name;
        s sVar;
        int i7;
        int i10;
        int i11;
        android.icu.text.NumberFormat numberFormat;
        int i12;
        int i13;
        int i14;
        String str2;
        x xVar;
        Iterator<MeasureUnit> it;
        MeasureUnit next;
        int iOrdinal;
        MeasureFormat.FormatWidth formatWidth;
        android.icu.text.NumberFormat numberFormat2;
        DecimalFormat decimalFormat;
        Currency currency;
        android.icu.text.NumberFormat numberFormat3;
        int i15;
        int iOrdinal2;
        int i16;
        android.icu.text.NumberFormat numberFormat4;
        CompactDecimalFormat.CompactStyle compactStyle;
        this.f4772b = null;
        this.f4773c = s.f22720d;
        t tVar2 = t.f22723d;
        this.f4774d = tVar2;
        this.f4775e = null;
        this.f4777g = true;
        this.f4778h = -1;
        this.f4779i = -1;
        this.j = -1;
        this.k = -1;
        this.f4780l = -1;
        this.f4782n = v.f22730d;
        this.f4785q = null;
        this.f4786r = null;
        this.f4788t = null;
        this.f4789u = null;
        c0 c0Var2 = new c0();
        this.f4783o = c0Var2;
        Double dValueOf5 = Double.valueOf(0.0d);
        HashMap map2 = new HashMap();
        map2.put("localeMatcher", x9.a.d(map, "localeMatcher", 2, x9.a.f22660a, "best fit"));
        a0 a0Var = x9.a.f22664e;
        Object objD3 = x9.a.d(map, "numberingSystem", 2, a0Var, a0Var);
        if (!(objD3 instanceof a0)) {
            String str3 = (String) objD3;
            if (!x9.a.i(0, str3.length() - 1, str3, 3, 8)) {
                throw new b("Invalid numbering system !", 9);
            }
        }
        map2.put("nu", objD3);
        HashMap mapK = x9.a.k(list, map2, Collections.singletonList("nu"));
        b0 b0Var2 = (b0) mapK.get("locale");
        this.f4788t = b0Var2;
        this.f4789u = b0Var2.a();
        Object objC3 = x9.a.c(mapK, "nu");
        if (objC3 instanceof z) {
            this.f4784p = true;
            this.f4785q = NumberingSystem.getInstance((ULocale) this.f4788t.c()).getName();
        } else {
            this.f4784p = false;
            this.f4785q = (String) objC3;
        }
        this.f4771a = (w) x9.a.l(w.class, (String) x9.a.d(map, "style", 2, new String[]{"decimal", "percent", "currency", "unit"}, "decimal"));
        Object objD4 = x9.a.d(map, "currency", 2, a0Var, a0Var);
        boolean z6 = objD4 instanceof a0;
        w wVar5 = w.f22734i;
        if (z6) {
            if (this.f4771a == wVar5) {
                throw new b("Expected currency style !", 9);
            }
        } else if (!a((String) objD4).matches("^[A-Z][A-Z][A-Z]$")) {
            throw new b("Malformed currency code !", 9);
        }
        Object objD5 = x9.a.d(map, "currencyDisplay", 2, new String[]{"symbol", "narrowSymbol", "code", StackTraceHelper.NAME_KEY}, "symbol");
        Object objD6 = x9.a.d(map, "currencySign", 2, new String[]{"accounting", "standard"}, "standard");
        Object objD7 = x9.a.d(map, "unit", 2, a0Var, a0Var);
        boolean z7 = objD7 instanceof a0;
        w wVar6 = w.f22735v;
        if (!z7) {
            String str4 = (String) objD7;
            String[] strArr = f4770v;
            if (Arrays.binarySearch(strArr, str4) < 0) {
                int iIndexOf = str4.indexOf("-per-");
                if (iIndexOf < 0 || str4.indexOf("-per-", iIndexOf + 1) >= 0 || Arrays.binarySearch(strArr, str4.substring(0, iIndexOf)) < 0 || Arrays.binarySearch(strArr, str4.substring(iIndexOf + 5)) < 0) {
                    throw new b("Malformed unit identifier !", 9);
                }
            }
            objD = x9.a.d(map, "unitDisplay", 2, new String[]{"long", "short", "narrow"}, "short");
            wVar = this.f4771a;
            if (wVar == wVar5) {
                this.f4772b = a((String) objD4);
                this.f4773c = (s) x9.a.l(s.class, (String) objD5);
                this.f4774d = (t) x9.a.l(t.class, (String) objD6);
            } else if (wVar == wVar6) {
                this.f4775e = (String) objD7;
                this.f4776f = (x) x9.a.l(x.class, (String) objD);
            }
            wVar2 = this.f4771a;
            if (wVar2 == wVar5) {
                try {
                    double defaultFractionDigits = Currency.getInstance(this.f4772b).getDefaultFractionDigits();
                    dValueOf2 = Double.valueOf(defaultFractionDigits);
                    dValueOf = Double.valueOf(defaultFractionDigits);
                } catch (IllegalArgumentException unused) {
                    throw new b("Invalid currency code !", 9);
                }
            } else if (wVar2 == w.f22733e) {
                dValueOf2 = dValueOf5;
                dValueOf = dValueOf2;
            } else {
                dValueOf = Double.valueOf(3.0d);
                dValueOf2 = dValueOf5;
            }
            Double d6 = dValueOf2;
            this.f4786r = (u) x9.a.l(u.class, (String) x9.a.d(map, "notation", 2, new String[]{"standard", "scientific", "engineering", "compact"}, "standard"));
            Double dValueOf6 = Double.valueOf(20.0d);
            dValueOf3 = Double.valueOf(1.0d);
            dValueOf4 = Double.valueOf(21.0d);
            Double d7 = dValueOf;
            Object objB = x9.a.b("minimumIntegerDigits", x9.a.c(map, "minimumIntegerDigits"), dValueOf3, dValueOf4, dValueOf3);
            Object objC4 = x9.a.c(map, "minimumFractionDigits");
            Object objC5 = x9.a.c(map, "maximumFractionDigits");
            objC = x9.a.c(map, "minimumSignificantDigits");
            objC2 = x9.a.c(map, "maximumSignificantDigits");
            this.f4778h = (int) Math.floor(((Double) objB).doubleValue());
            z5 = objC instanceof a0;
            uVar = u.f22727e;
            uVar2 = u.f22728i;
            if (z5 || !(objC2 instanceof a0)) {
                this.f4781m = 1;
                Object objB2 = x9.a.b("minimumSignificantDigits", objC, dValueOf3, dValueOf4, dValueOf3);
                Object objB3 = x9.a.b("maximumSignificantDigits", objC2, objB2, dValueOf4, dValueOf4);
                this.k = (int) Math.floor(((Double) objB2).doubleValue());
                this.f4780l = (int) Math.floor(((Double) objB3).doubleValue());
            } else if ((objC4 instanceof a0) && (objC5 instanceof a0)) {
                u uVar4 = this.f4786r;
                if (uVar4 == uVar2) {
                    this.f4781m = 3;
                } else if (uVar4 == uVar) {
                    this.f4781m = 2;
                    this.j = 5;
                } else {
                    this.f4781m = 2;
                    this.f4779i = (int) Math.floor(d6.doubleValue());
                    this.j = (int) Math.floor(d7.doubleValue());
                }
            } else {
                this.f4781m = 2;
                Object objB4 = x9.a.b("minimumFractionDigits", objC4, dValueOf5, dValueOf6, a0Var);
                Object objB5 = x9.a.b("maximumFractionDigits", objC5, dValueOf5, dValueOf6, a0Var);
                if (objB4 instanceof a0) {
                    objB4 = Double.valueOf(Math.min(d6.doubleValue(), ((Double) objB5).doubleValue()));
                } else if (objB5 instanceof a0) {
                    objB5 = Double.valueOf(Math.max(d7.doubleValue(), ((Double) objB4).doubleValue()));
                } else if (((Double) objB4).doubleValue() > ((Double) objB5).doubleValue()) {
                    throw new b("minimumFractionDigits is greater than maximumFractionDigits", 9);
                }
                this.f4779i = (int) Math.floor(((Double) objB4).doubleValue());
                this.j = (int) Math.floor(((Double) objB5).doubleValue());
            }
            objD2 = x9.a.d(map, "compactDisplay", 2, new String[]{"short", "long"}, "short");
            if (this.f4786r == uVar2) {
                this.f4787s = (r) x9.a.l(r.class, (String) objD2);
            }
            this.f4777g = ((Boolean) x9.a.d(map, "useGrouping", 1, a0Var, Boolean.TRUE)).booleanValue();
            this.f4782n = (v) x9.a.l(v.class, (String) x9.a.d(map, "signDisplay", 2, new String[]{"auto", ReactScrollViewHelper.OVER_SCROLL_NEVER, ReactScrollViewHelper.OVER_SCROLL_ALWAYS, "exceptZero"}, "auto"));
            b0Var = this.f4788t;
            if (this.f4784p) {
                str = "";
            } else {
                str = this.f4785q;
            }
            wVar3 = this.f4771a;
            tVar = this.f4774d;
            uVar3 = this.f4786r;
            rVar = this.f4787s;
            if (!str.isEmpty()) {
                try {
                    if (NumberingSystem.getInstanceByName(str) != null) {
                        throw new b("Invalid numbering system: ".concat(str), 9);
                    }
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(str);
                    b0Var.e("nu", arrayList);
                } catch (RuntimeException unused2) {
                    throw new b("Invalid numbering system: ".concat(str), 9);
                }
            }
            if (uVar3 == uVar2) {
                if (wVar3 != w.f22732d) {
                    wVar4 = wVar6;
                    if (wVar3 == wVar4) {
                    }
                    name = this.f4772b;
                    sVar = this.f4773c;
                    if (c0Var.f22679d == wVar5) {
                        currency = Currency.getInstance(name);
                        c0Var.f22677b.setCurrency(currency);
                        if (sVar != s.f22721e) {
                            b0 b0Var3 = c0Var.f22678c;
                            b0Var3.b();
                            ULocale uLocale = b0Var3.f22667a;
                            if (sVar.ordinal() != 3) {
                                i15 = 0;
                            } else {
                                i15 = 1;
                            }
                            name = currency.getName(uLocale, i15, (boolean[]) null);
                        }
                        numberFormat3 = c0Var.f22677b;
                        if (numberFormat3 instanceof DecimalFormat) {
                            DecimalFormat decimalFormat2 = (DecimalFormat) numberFormat3;
                            DecimalFormatSymbols decimalFormatSymbols = decimalFormat2.getDecimalFormatSymbols();
                            decimalFormatSymbols.setCurrencySymbol(name);
                            decimalFormat2.setDecimalFormatSymbols(decimalFormatSymbols);
                        }
                    }
                    c0Var.f22677b.setGroupingUsed(this.f4777g);
                    i7 = this.f4778h;
                    if (i7 != -1) {
                        c0Var.f22677b.setMinimumIntegerDigits(i7);
                    }
                    int i17 = this.f4781m;
                    i10 = this.k;
                    i11 = this.f4780l;
                    numberFormat = c0Var.f22677b;
                    if ((numberFormat instanceof DecimalFormat) && i17 == 1) {
                        decimalFormat = (DecimalFormat) numberFormat;
                        if (i10 >= 0) {
                            decimalFormat.setMinimumSignificantDigits(i10);
                        }
                        if (i11 >= 0) {
                            if (i11 >= decimalFormat.getMinimumSignificantDigits()) {
                                throw new b("maximumSignificantDigits should be at least equal to minimumSignificantDigits", 9);
                            }
                            decimalFormat.setMaximumSignificantDigits(i11);
                        }
                        decimalFormat.setSignificantDigitsUsed(true);
                    }
                    i12 = this.f4781m;
                    i13 = this.f4779i;
                    i14 = this.j;
                    if (i12 == 2) {
                        if (i13 >= 0) {
                            c0Var.f22677b.setMinimumFractionDigits(i13);
                        }
                        if (i14 >= 0) {
                            c0Var.f22677b.setMaximumFractionDigits(i14);
                        }
                        numberFormat2 = c0Var.f22677b;
                        if (numberFormat2 instanceof DecimalFormat) {
                            ((DecimalFormat) numberFormat2).setSignificantDigitsUsed(false);
                        }
                    }
                    c0Var.a(this.f4782n);
                    str2 = this.f4775e;
                    xVar = this.f4776f;
                    if (c0Var.f22679d == wVar4) {
                        it = MeasureUnit.getAvailable().iterator();
                        do {
                            if (it.hasNext()) {
                                throw new b(e.l("Unknown unit: ", str2), 9);
                            }
                            next = it.next();
                            if (!next.getSubtype().equals(str2)) {
                                break;
                            }
                        } while (!next.getSubtype().equals(next.getType() + "-" + str2));
                        c0Var.f22680e = next;
                        b0 b0Var4 = c0Var.f22678c;
                        b0Var4.b();
                        ULocale uLocale2 = b0Var4.f22667a;
                        iOrdinal = xVar.ordinal();
                        if (iOrdinal != 1) {
                            formatWidth = MeasureFormat.FormatWidth.NARROW;
                        } else if (iOrdinal != 2) {
                            formatWidth = MeasureFormat.FormatWidth.SHORT;
                        } else {
                            formatWidth = MeasureFormat.FormatWidth.WIDE;
                        }
                        c0Var.f22676a = MeasureFormat.getInstance(uLocale2, formatWidth, c0Var.f22677b);
                    }
                }
                wVar4 = wVar6;
                if (rVar == r.f22718d) {
                    compactStyle = CompactDecimalFormat.CompactStyle.SHORT;
                } else {
                    compactStyle = CompactDecimalFormat.CompactStyle.LONG;
                }
                CompactDecimalFormat compactDecimalFormat = CompactDecimalFormat.getInstance((ULocale) b0Var.c(), compactStyle);
                c0Var = c0Var2;
                c0Var.f22677b = compactDecimalFormat;
                c0Var.f22676a = compactDecimalFormat;
                c0Var.f22678c = b0Var;
                c0Var.f22679d = wVar3;
                compactDecimalFormat.setRoundingMode(4);
                name = this.f4772b;
                sVar = this.f4773c;
                if (c0Var.f22679d == wVar5) {
                    currency = Currency.getInstance(name);
                    c0Var.f22677b.setCurrency(currency);
                    if (sVar != s.f22721e) {
                        b0 b0Var5 = c0Var.f22678c;
                        b0Var5.b();
                        ULocale uLocale3 = b0Var5.f22667a;
                        if (sVar.ordinal() != 3) {
                            i15 = 0;
                        } else {
                            i15 = 1;
                        }
                        name = currency.getName(uLocale3, i15, (boolean[]) null);
                    }
                    numberFormat3 = c0Var.f22677b;
                    if (numberFormat3 instanceof DecimalFormat) {
                        DecimalFormat decimalFormat3 = (DecimalFormat) numberFormat3;
                        DecimalFormatSymbols decimalFormatSymbols2 = decimalFormat3.getDecimalFormatSymbols();
                        decimalFormatSymbols2.setCurrencySymbol(name);
                        decimalFormat3.setDecimalFormatSymbols(decimalFormatSymbols2);
                    }
                }
                c0Var.f22677b.setGroupingUsed(this.f4777g);
                i7 = this.f4778h;
                if (i7 != -1) {
                    c0Var.f22677b.setMinimumIntegerDigits(i7);
                }
                int i18 = this.f4781m;
                i10 = this.k;
                i11 = this.f4780l;
                numberFormat = c0Var.f22677b;
                if (numberFormat instanceof DecimalFormat) {
                    decimalFormat = (DecimalFormat) numberFormat;
                    if (i10 >= 0) {
                        decimalFormat.setMinimumSignificantDigits(i10);
                    }
                    if (i11 >= 0) {
                        if (i11 >= decimalFormat.getMinimumSignificantDigits()) {
                            throw new b("maximumSignificantDigits should be at least equal to minimumSignificantDigits", 9);
                        }
                        decimalFormat.setMaximumSignificantDigits(i11);
                    }
                    decimalFormat.setSignificantDigitsUsed(true);
                }
                i12 = this.f4781m;
                i13 = this.f4779i;
                i14 = this.j;
                if (i12 == 2) {
                    if (i13 >= 0) {
                        c0Var.f22677b.setMinimumFractionDigits(i13);
                    }
                    if (i14 >= 0) {
                        c0Var.f22677b.setMaximumFractionDigits(i14);
                    }
                    numberFormat2 = c0Var.f22677b;
                    if (numberFormat2 instanceof DecimalFormat) {
                        ((DecimalFormat) numberFormat2).setSignificantDigitsUsed(false);
                    }
                }
                c0Var.a(this.f4782n);
                str2 = this.f4775e;
                xVar = this.f4776f;
                if (c0Var.f22679d == wVar4) {
                    it = MeasureUnit.getAvailable().iterator();
                    do {
                        if (it.hasNext()) {
                            throw new b(e.l("Unknown unit: ", str2), 9);
                        }
                        next = it.next();
                        if (!next.getSubtype().equals(str2)) {
                            break;
                            break;
                        }
                    } while (!next.getSubtype().equals(next.getType() + "-" + str2));
                    c0Var.f22680e = next;
                    b0 b0Var6 = c0Var.f22678c;
                    b0Var6.b();
                    ULocale uLocale4 = b0Var6.f22667a;
                    iOrdinal = xVar.ordinal();
                    if (iOrdinal != 1) {
                        formatWidth = MeasureFormat.FormatWidth.NARROW;
                    } else if (iOrdinal != 2) {
                        formatWidth = MeasureFormat.FormatWidth.SHORT;
                    } else {
                        formatWidth = MeasureFormat.FormatWidth.WIDE;
                    }
                    c0Var.f22676a = MeasureFormat.getInstance(uLocale4, formatWidth, c0Var.f22677b);
                }
            }
            wVar4 = wVar6;
            c0Var = c0Var2;
            iOrdinal2 = wVar3.ordinal();
            if (iOrdinal2 != 1) {
                i16 = 2;
            } else if (iOrdinal2 != 2) {
                if (uVar3 != u.f22726d || uVar3 == uVar) {
                    i16 = 3;
                } else {
                    i16 = 0;
                }
            } else if (tVar == t.f22724e) {
                i16 = 7;
            } else {
                if (tVar == tVar2) {
                    throw new b("Unrecognized formatting style requested.", 9);
                }
                i16 = 1;
            }
            numberFormat4 = android.icu.text.NumberFormat.getInstance((ULocale) b0Var.c(), i16);
            if (uVar3 == uVar) {
                numberFormat4.setMaximumIntegerDigits(3);
            }
            c0Var.f22677b = numberFormat4;
            c0Var.f22676a = numberFormat4;
            c0Var.f22678c = b0Var;
            c0Var.f22679d = wVar3;
            numberFormat4.setRoundingMode(4);
            name = this.f4772b;
            sVar = this.f4773c;
            if (c0Var.f22679d == wVar5) {
                currency = Currency.getInstance(name);
                c0Var.f22677b.setCurrency(currency);
                if (sVar != s.f22721e) {
                    b0 b0Var7 = c0Var.f22678c;
                    b0Var7.b();
                    ULocale uLocale5 = b0Var7.f22667a;
                    if (sVar.ordinal() != 3) {
                        i15 = 0;
                    } else {
                        i15 = 1;
                    }
                    name = currency.getName(uLocale5, i15, (boolean[]) null);
                }
                numberFormat3 = c0Var.f22677b;
                if (numberFormat3 instanceof DecimalFormat) {
                    DecimalFormat decimalFormat4 = (DecimalFormat) numberFormat3;
                    DecimalFormatSymbols decimalFormatSymbols3 = decimalFormat4.getDecimalFormatSymbols();
                    decimalFormatSymbols3.setCurrencySymbol(name);
                    decimalFormat4.setDecimalFormatSymbols(decimalFormatSymbols3);
                }
            }
            c0Var.f22677b.setGroupingUsed(this.f4777g);
            i7 = this.f4778h;
            if (i7 != -1) {
                c0Var.f22677b.setMinimumIntegerDigits(i7);
            }
            int i19 = this.f4781m;
            i10 = this.k;
            i11 = this.f4780l;
            numberFormat = c0Var.f22677b;
            if (numberFormat instanceof DecimalFormat) {
                decimalFormat = (DecimalFormat) numberFormat;
                if (i10 >= 0) {
                    decimalFormat.setMinimumSignificantDigits(i10);
                }
                if (i11 >= 0) {
                    if (i11 >= decimalFormat.getMinimumSignificantDigits()) {
                        throw new b("maximumSignificantDigits should be at least equal to minimumSignificantDigits", 9);
                    }
                    decimalFormat.setMaximumSignificantDigits(i11);
                }
                decimalFormat.setSignificantDigitsUsed(true);
            }
            i12 = this.f4781m;
            i13 = this.f4779i;
            i14 = this.j;
            if (i12 == 2) {
                if (i13 >= 0) {
                    c0Var.f22677b.setMinimumFractionDigits(i13);
                }
                if (i14 >= 0) {
                    c0Var.f22677b.setMaximumFractionDigits(i14);
                }
                numberFormat2 = c0Var.f22677b;
                if (numberFormat2 instanceof DecimalFormat) {
                    ((DecimalFormat) numberFormat2).setSignificantDigitsUsed(false);
                }
            }
            c0Var.a(this.f4782n);
            str2 = this.f4775e;
            xVar = this.f4776f;
            if (c0Var.f22679d == wVar4) {
                it = MeasureUnit.getAvailable().iterator();
                do {
                    if (it.hasNext()) {
                        throw new b(e.l("Unknown unit: ", str2), 9);
                    }
                    next = it.next();
                    if (!next.getSubtype().equals(str2)) {
                        break;
                        break;
                    }
                } while (!next.getSubtype().equals(next.getType() + "-" + str2));
                c0Var.f22680e = next;
                b0 b0Var8 = c0Var.f22678c;
                b0Var8.b();
                ULocale uLocale6 = b0Var8.f22667a;
                iOrdinal = xVar.ordinal();
                if (iOrdinal != 1) {
                    formatWidth = MeasureFormat.FormatWidth.NARROW;
                } else if (iOrdinal != 2) {
                    formatWidth = MeasureFormat.FormatWidth.SHORT;
                } else {
                    formatWidth = MeasureFormat.FormatWidth.WIDE;
                }
                c0Var.f22676a = MeasureFormat.getInstance(uLocale6, formatWidth, c0Var.f22677b);
            }
        }
        if (this.f4771a == wVar6) {
            throw new b("Expected unit !", 9);
        }
        objD = x9.a.d(map, "unitDisplay", 2, new String[]{"long", "short", "narrow"}, "short");
        wVar = this.f4771a;
        if (wVar == wVar5) {
            this.f4772b = a((String) objD4);
            this.f4773c = (s) x9.a.l(s.class, (String) objD5);
            this.f4774d = (t) x9.a.l(t.class, (String) objD6);
        } else if (wVar == wVar6) {
            this.f4775e = (String) objD7;
            this.f4776f = (x) x9.a.l(x.class, (String) objD);
        }
        wVar2 = this.f4771a;
        if (wVar2 == wVar5) {
            double defaultFractionDigits2 = Currency.getInstance(this.f4772b).getDefaultFractionDigits();
            dValueOf2 = Double.valueOf(defaultFractionDigits2);
            dValueOf = Double.valueOf(defaultFractionDigits2);
        } else if (wVar2 == w.f22733e) {
            dValueOf2 = dValueOf5;
            dValueOf = dValueOf2;
        } else {
            dValueOf = Double.valueOf(3.0d);
            dValueOf2 = dValueOf5;
        }
        Double d8 = dValueOf2;
        this.f4786r = (u) x9.a.l(u.class, (String) x9.a.d(map, "notation", 2, new String[]{"standard", "scientific", "engineering", "compact"}, "standard"));
        Double dValueOf7 = Double.valueOf(20.0d);
        dValueOf3 = Double.valueOf(1.0d);
        dValueOf4 = Double.valueOf(21.0d);
        Double d9 = dValueOf;
        Object objB6 = x9.a.b("minimumIntegerDigits", x9.a.c(map, "minimumIntegerDigits"), dValueOf3, dValueOf4, dValueOf3);
        Object objC6 = x9.a.c(map, "minimumFractionDigits");
        Object objC7 = x9.a.c(map, "maximumFractionDigits");
        objC = x9.a.c(map, "minimumSignificantDigits");
        objC2 = x9.a.c(map, "maximumSignificantDigits");
        this.f4778h = (int) Math.floor(((Double) objB6).doubleValue());
        z5 = objC instanceof a0;
        uVar = u.f22727e;
        uVar2 = u.f22728i;
        if (z5) {
            this.f4781m = 1;
            Object objB7 = x9.a.b("minimumSignificantDigits", objC, dValueOf3, dValueOf4, dValueOf3);
            Object objB8 = x9.a.b("maximumSignificantDigits", objC2, objB7, dValueOf4, dValueOf4);
            this.k = (int) Math.floor(((Double) objB7).doubleValue());
            this.f4780l = (int) Math.floor(((Double) objB8).doubleValue());
        } else {
            this.f4781m = 1;
            Object objB9 = x9.a.b("minimumSignificantDigits", objC, dValueOf3, dValueOf4, dValueOf3);
            Object objB10 = x9.a.b("maximumSignificantDigits", objC2, objB9, dValueOf4, dValueOf4);
            this.k = (int) Math.floor(((Double) objB9).doubleValue());
            this.f4780l = (int) Math.floor(((Double) objB10).doubleValue());
        }
        objD2 = x9.a.d(map, "compactDisplay", 2, new String[]{"short", "long"}, "short");
        if (this.f4786r == uVar2) {
            this.f4787s = (r) x9.a.l(r.class, (String) objD2);
        }
        this.f4777g = ((Boolean) x9.a.d(map, "useGrouping", 1, a0Var, Boolean.TRUE)).booleanValue();
        this.f4782n = (v) x9.a.l(v.class, (String) x9.a.d(map, "signDisplay", 2, new String[]{"auto", ReactScrollViewHelper.OVER_SCROLL_NEVER, ReactScrollViewHelper.OVER_SCROLL_ALWAYS, "exceptZero"}, "auto"));
        b0Var = this.f4788t;
        if (this.f4784p) {
            str = "";
        } else {
            str = this.f4785q;
        }
        wVar3 = this.f4771a;
        tVar = this.f4774d;
        uVar3 = this.f4786r;
        rVar = this.f4787s;
        if (!str.isEmpty()) {
            if (NumberingSystem.getInstanceByName(str) != null) {
                throw new b("Invalid numbering system: ".concat(str), 9);
            }
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(str);
            b0Var.e("nu", arrayList2);
        }
        if (uVar3 == uVar2) {
            if (wVar3 != w.f22732d) {
                wVar4 = wVar6;
                if (wVar3 == wVar4) {
                }
                name = this.f4772b;
                sVar = this.f4773c;
                if (c0Var.f22679d == wVar5) {
                    currency = Currency.getInstance(name);
                    c0Var.f22677b.setCurrency(currency);
                    if (sVar != s.f22721e) {
                        b0 b0Var9 = c0Var.f22678c;
                        b0Var9.b();
                        ULocale uLocale7 = b0Var9.f22667a;
                        if (sVar.ordinal() != 3) {
                            i15 = 0;
                        } else {
                            i15 = 1;
                        }
                        name = currency.getName(uLocale7, i15, (boolean[]) null);
                    }
                    numberFormat3 = c0Var.f22677b;
                    if (numberFormat3 instanceof DecimalFormat) {
                        DecimalFormat decimalFormat5 = (DecimalFormat) numberFormat3;
                        DecimalFormatSymbols decimalFormatSymbols4 = decimalFormat5.getDecimalFormatSymbols();
                        decimalFormatSymbols4.setCurrencySymbol(name);
                        decimalFormat5.setDecimalFormatSymbols(decimalFormatSymbols4);
                    }
                }
                c0Var.f22677b.setGroupingUsed(this.f4777g);
                i7 = this.f4778h;
                if (i7 != -1) {
                    c0Var.f22677b.setMinimumIntegerDigits(i7);
                }
                int i110 = this.f4781m;
                i10 = this.k;
                i11 = this.f4780l;
                numberFormat = c0Var.f22677b;
                if (numberFormat instanceof DecimalFormat) {
                    decimalFormat = (DecimalFormat) numberFormat;
                    if (i10 >= 0) {
                        decimalFormat.setMinimumSignificantDigits(i10);
                    }
                    if (i11 >= 0) {
                        if (i11 >= decimalFormat.getMinimumSignificantDigits()) {
                            throw new b("maximumSignificantDigits should be at least equal to minimumSignificantDigits", 9);
                        }
                        decimalFormat.setMaximumSignificantDigits(i11);
                    }
                    decimalFormat.setSignificantDigitsUsed(true);
                }
                i12 = this.f4781m;
                i13 = this.f4779i;
                i14 = this.j;
                if (i12 == 2) {
                    if (i13 >= 0) {
                        c0Var.f22677b.setMinimumFractionDigits(i13);
                    }
                    if (i14 >= 0) {
                        c0Var.f22677b.setMaximumFractionDigits(i14);
                    }
                    numberFormat2 = c0Var.f22677b;
                    if (numberFormat2 instanceof DecimalFormat) {
                        ((DecimalFormat) numberFormat2).setSignificantDigitsUsed(false);
                    }
                }
                c0Var.a(this.f4782n);
                str2 = this.f4775e;
                xVar = this.f4776f;
                if (c0Var.f22679d == wVar4) {
                    it = MeasureUnit.getAvailable().iterator();
                    do {
                        if (it.hasNext()) {
                            throw new b(e.l("Unknown unit: ", str2), 9);
                        }
                        next = it.next();
                        if (!next.getSubtype().equals(str2)) {
                            break;
                            break;
                        }
                    } while (!next.getSubtype().equals(next.getType() + "-" + str2));
                    c0Var.f22680e = next;
                    b0 b0Var10 = c0Var.f22678c;
                    b0Var10.b();
                    ULocale uLocale8 = b0Var10.f22667a;
                    iOrdinal = xVar.ordinal();
                    if (iOrdinal != 1) {
                        formatWidth = MeasureFormat.FormatWidth.NARROW;
                    } else if (iOrdinal != 2) {
                        formatWidth = MeasureFormat.FormatWidth.SHORT;
                    } else {
                        formatWidth = MeasureFormat.FormatWidth.WIDE;
                    }
                    c0Var.f22676a = MeasureFormat.getInstance(uLocale8, formatWidth, c0Var.f22677b);
                }
            }
            wVar4 = wVar6;
            if (rVar == r.f22718d) {
                compactStyle = CompactDecimalFormat.CompactStyle.SHORT;
            } else {
                compactStyle = CompactDecimalFormat.CompactStyle.LONG;
            }
            CompactDecimalFormat compactDecimalFormat2 = CompactDecimalFormat.getInstance((ULocale) b0Var.c(), compactStyle);
            c0Var = c0Var2;
            c0Var.f22677b = compactDecimalFormat2;
            c0Var.f22676a = compactDecimalFormat2;
            c0Var.f22678c = b0Var;
            c0Var.f22679d = wVar3;
            compactDecimalFormat2.setRoundingMode(4);
            name = this.f4772b;
            sVar = this.f4773c;
            if (c0Var.f22679d == wVar5) {
                currency = Currency.getInstance(name);
                c0Var.f22677b.setCurrency(currency);
                if (sVar != s.f22721e) {
                    b0 b0Var11 = c0Var.f22678c;
                    b0Var11.b();
                    ULocale uLocale9 = b0Var11.f22667a;
                    if (sVar.ordinal() != 3) {
                        i15 = 0;
                    } else {
                        i15 = 1;
                    }
                    name = currency.getName(uLocale9, i15, (boolean[]) null);
                }
                numberFormat3 = c0Var.f22677b;
                if (numberFormat3 instanceof DecimalFormat) {
                    DecimalFormat decimalFormat6 = (DecimalFormat) numberFormat3;
                    DecimalFormatSymbols decimalFormatSymbols5 = decimalFormat6.getDecimalFormatSymbols();
                    decimalFormatSymbols5.setCurrencySymbol(name);
                    decimalFormat6.setDecimalFormatSymbols(decimalFormatSymbols5);
                }
            }
            c0Var.f22677b.setGroupingUsed(this.f4777g);
            i7 = this.f4778h;
            if (i7 != -1) {
                c0Var.f22677b.setMinimumIntegerDigits(i7);
            }
            int i111 = this.f4781m;
            i10 = this.k;
            i11 = this.f4780l;
            numberFormat = c0Var.f22677b;
            if (numberFormat instanceof DecimalFormat) {
                decimalFormat = (DecimalFormat) numberFormat;
                if (i10 >= 0) {
                    decimalFormat.setMinimumSignificantDigits(i10);
                }
                if (i11 >= 0) {
                    if (i11 >= decimalFormat.getMinimumSignificantDigits()) {
                        throw new b("maximumSignificantDigits should be at least equal to minimumSignificantDigits", 9);
                    }
                    decimalFormat.setMaximumSignificantDigits(i11);
                }
                decimalFormat.setSignificantDigitsUsed(true);
            }
            i12 = this.f4781m;
            i13 = this.f4779i;
            i14 = this.j;
            if (i12 == 2) {
                if (i13 >= 0) {
                    c0Var.f22677b.setMinimumFractionDigits(i13);
                }
                if (i14 >= 0) {
                    c0Var.f22677b.setMaximumFractionDigits(i14);
                }
                numberFormat2 = c0Var.f22677b;
                if (numberFormat2 instanceof DecimalFormat) {
                    ((DecimalFormat) numberFormat2).setSignificantDigitsUsed(false);
                }
            }
            c0Var.a(this.f4782n);
            str2 = this.f4775e;
            xVar = this.f4776f;
            if (c0Var.f22679d == wVar4) {
                it = MeasureUnit.getAvailable().iterator();
                do {
                    if (it.hasNext()) {
                        throw new b(e.l("Unknown unit: ", str2), 9);
                    }
                    next = it.next();
                    if (!next.getSubtype().equals(str2)) {
                        break;
                        break;
                    }
                } while (!next.getSubtype().equals(next.getType() + "-" + str2));
                c0Var.f22680e = next;
                b0 b0Var12 = c0Var.f22678c;
                b0Var12.b();
                ULocale uLocale10 = b0Var12.f22667a;
                iOrdinal = xVar.ordinal();
                if (iOrdinal != 1) {
                    formatWidth = MeasureFormat.FormatWidth.NARROW;
                } else if (iOrdinal != 2) {
                    formatWidth = MeasureFormat.FormatWidth.SHORT;
                } else {
                    formatWidth = MeasureFormat.FormatWidth.WIDE;
                }
                c0Var.f22676a = MeasureFormat.getInstance(uLocale10, formatWidth, c0Var.f22677b);
            }
        }
        wVar4 = wVar6;
        c0Var = c0Var2;
        iOrdinal2 = wVar3.ordinal();
        if (iOrdinal2 != 1) {
            i16 = 2;
        } else if (iOrdinal2 != 2) {
            if (uVar3 != u.f22726d) {
                i16 = 3;
            } else {
                i16 = 3;
            }
        } else if (tVar == t.f22724e) {
            i16 = 7;
        } else {
            if (tVar == tVar2) {
                throw new b("Unrecognized formatting style requested.", 9);
            }
            i16 = 1;
        }
        numberFormat4 = android.icu.text.NumberFormat.getInstance((ULocale) b0Var.c(), i16);
        if (uVar3 == uVar) {
            numberFormat4.setMaximumIntegerDigits(3);
        }
        c0Var.f22677b = numberFormat4;
        c0Var.f22676a = numberFormat4;
        c0Var.f22678c = b0Var;
        c0Var.f22679d = wVar3;
        numberFormat4.setRoundingMode(4);
        name = this.f4772b;
        sVar = this.f4773c;
        if (c0Var.f22679d == wVar5) {
            currency = Currency.getInstance(name);
            c0Var.f22677b.setCurrency(currency);
            if (sVar != s.f22721e) {
                b0 b0Var13 = c0Var.f22678c;
                b0Var13.b();
                ULocale uLocale11 = b0Var13.f22667a;
                if (sVar.ordinal() != 3) {
                    i15 = 0;
                } else {
                    i15 = 1;
                }
                name = currency.getName(uLocale11, i15, (boolean[]) null);
            }
            numberFormat3 = c0Var.f22677b;
            if (numberFormat3 instanceof DecimalFormat) {
                DecimalFormat decimalFormat7 = (DecimalFormat) numberFormat3;
                DecimalFormatSymbols decimalFormatSymbols6 = decimalFormat7.getDecimalFormatSymbols();
                decimalFormatSymbols6.setCurrencySymbol(name);
                decimalFormat7.setDecimalFormatSymbols(decimalFormatSymbols6);
            }
        }
        c0Var.f22677b.setGroupingUsed(this.f4777g);
        i7 = this.f4778h;
        if (i7 != -1) {
            c0Var.f22677b.setMinimumIntegerDigits(i7);
        }
        int i112 = this.f4781m;
        i10 = this.k;
        i11 = this.f4780l;
        numberFormat = c0Var.f22677b;
        if (numberFormat instanceof DecimalFormat) {
            decimalFormat = (DecimalFormat) numberFormat;
            if (i10 >= 0) {
                decimalFormat.setMinimumSignificantDigits(i10);
            }
            if (i11 >= 0) {
                if (i11 >= decimalFormat.getMinimumSignificantDigits()) {
                    throw new b("maximumSignificantDigits should be at least equal to minimumSignificantDigits", 9);
                }
                decimalFormat.setMaximumSignificantDigits(i11);
            }
            decimalFormat.setSignificantDigitsUsed(true);
        }
        i12 = this.f4781m;
        i13 = this.f4779i;
        i14 = this.j;
        if (i12 == 2) {
            if (i13 >= 0) {
                c0Var.f22677b.setMinimumFractionDigits(i13);
            }
            if (i14 >= 0) {
                c0Var.f22677b.setMaximumFractionDigits(i14);
            }
            numberFormat2 = c0Var.f22677b;
            if (numberFormat2 instanceof DecimalFormat) {
                ((DecimalFormat) numberFormat2).setSignificantDigitsUsed(false);
            }
        }
        c0Var.a(this.f4782n);
        str2 = this.f4775e;
        xVar = this.f4776f;
        if (c0Var.f22679d == wVar4) {
            it = MeasureUnit.getAvailable().iterator();
            do {
                if (it.hasNext()) {
                    throw new b(e.l("Unknown unit: ", str2), 9);
                }
                next = it.next();
                if (!next.getSubtype().equals(str2)) {
                    break;
                    break;
                }
            } while (!next.getSubtype().equals(next.getType() + "-" + str2));
            c0Var.f22680e = next;
            b0 b0Var14 = c0Var.f22678c;
            b0Var14.b();
            ULocale uLocale12 = b0Var14.f22667a;
            iOrdinal = xVar.ordinal();
            if (iOrdinal != 1) {
                formatWidth = MeasureFormat.FormatWidth.NARROW;
            } else if (iOrdinal != 2) {
                formatWidth = MeasureFormat.FormatWidth.SHORT;
            } else {
                formatWidth = MeasureFormat.FormatWidth.WIDE;
            }
            c0Var.f22676a = MeasureFormat.getInstance(uLocale12, formatWidth, c0Var.f22677b);
        }
    }

    public static String a(String str) {
        StringBuilder sb2 = new StringBuilder(str.length());
        for (int i7 = 0; i7 < str.length(); i7++) {
            char cCharAt = str.charAt(i7);
            if (cCharAt < 'a' || cCharAt > 'z') {
                sb2.append(cCharAt);
            } else {
                sb2.append((char) (cCharAt - ' '));
            }
        }
        return sb2.toString();
    }

    @a
    public static List<String> supportedLocalesOf(List<String> list, Map<String, Object> map) {
        String str = (String) x9.a.d(map, "localeMatcher", 2, x9.a.f22660a, "best fit");
        String[] strArr = new String[list.size()];
        return str.equals("best fit") ? Arrays.asList(x9.a.f((String[]) list.toArray(strArr))) : Arrays.asList(x9.a.j((String[]) list.toArray(strArr)));
    }

    @a
    public String format(double d6) {
        c0 c0Var = this.f4783o;
        try {
            try {
                UFormat uFormat = c0Var.f22676a;
                return (!(uFormat instanceof MeasureFormat) || c0Var.f22680e == null) ? uFormat.format(Double.valueOf(d6)) : uFormat.format(new Measure(Double.valueOf(d6), c0Var.f22680e));
            } catch (NumberFormatException unused) {
                return android.icu.text.NumberFormat.getInstance(ULocale.getDefault()).format(d6);
            }
        } catch (RuntimeException unused2) {
            return android.icu.text.NumberFormat.getInstance(ULocale.forLanguageTag("en")).format(d6);
        }
    }

    @a
    public List<Map<String, String>> formatToParts(double d6) {
        AttributedCharacterIterator toCharacterIterator;
        ArrayList arrayList = new ArrayList();
        c0 c0Var = this.f4783o;
        try {
            try {
                UFormat uFormat = c0Var.f22676a;
                toCharacterIterator = (!(uFormat instanceof MeasureFormat) || c0Var.f22680e == null) ? uFormat.formatToCharacterIterator(Double.valueOf(d6)) : uFormat.formatToCharacterIterator(new Measure(Double.valueOf(d6), c0Var.f22680e));
            } catch (RuntimeException unused) {
                toCharacterIterator = android.icu.text.NumberFormat.getInstance(ULocale.forLanguageTag("en")).formatToCharacterIterator(Double.valueOf(d6));
            }
        } catch (NumberFormatException unused2) {
            toCharacterIterator = android.icu.text.NumberFormat.getInstance(ULocale.getDefault()).formatToCharacterIterator(Double.valueOf(d6));
        } catch (Exception unused3) {
            toCharacterIterator = android.icu.text.NumberFormat.getInstance(ULocale.forLanguageTag("en")).formatToCharacterIterator(Double.valueOf(d6));
        }
        StringBuilder sb2 = new StringBuilder();
        for (char cFirst = toCharacterIterator.first(); cFirst != 65535; cFirst = toCharacterIterator.next()) {
            sb2.append(cFirst);
            if (toCharacterIterator.getIndex() + 1 == toCharacterIterator.getRunLimit()) {
                Iterator<AttributedCharacterIterator.Attribute> it = toCharacterIterator.getAttributes().keySet().iterator();
                String str = "literal";
                if (it.hasNext()) {
                    AttributedCharacterIterator.Attribute next = it.next();
                    if (next == android.icu.text.NumberFormat.Field.SIGN) {
                        str = Double.compare(d6, 0.0d) >= 0 ? "plusSign" : "minusSign";
                    } else if (next == android.icu.text.NumberFormat.Field.INTEGER) {
                        str = Double.isNaN(d6) ? "nan" : Double.isInfinite(d6) ? "infinity" : "integer";
                    } else if (next == android.icu.text.NumberFormat.Field.FRACTION) {
                        str = "fraction";
                    } else if (next == android.icu.text.NumberFormat.Field.EXPONENT) {
                        str = "exponentInteger";
                    } else if (next == android.icu.text.NumberFormat.Field.EXPONENT_SIGN) {
                        str = "exponentMinusSign";
                    } else if (next == android.icu.text.NumberFormat.Field.EXPONENT_SYMBOL) {
                        str = "exponentSeparator";
                    } else if (next == android.icu.text.NumberFormat.Field.DECIMAL_SEPARATOR) {
                        str = "decimal";
                    } else if (next == android.icu.text.NumberFormat.Field.GROUPING_SEPARATOR) {
                        str = "group";
                    } else if (next == android.icu.text.NumberFormat.Field.PERCENT) {
                        str = "percentSign";
                    } else if (next == android.icu.text.NumberFormat.Field.PERMILLE) {
                        str = "permilleSign";
                    } else if (next == android.icu.text.NumberFormat.Field.CURRENCY) {
                        str = "currency";
                    } else if (next.toString().equals("android.icu.text.NumberFormat$Field(compact)")) {
                        str = "compact";
                    }
                }
                String string = sb2.toString();
                sb2.setLength(0);
                HashMap map = new HashMap();
                map.put("type", str);
                map.put("value", string);
                arrayList.add(map);
            }
        }
        return arrayList;
    }

    @a
    public Map<String, Object> resolvedOptions() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("locale", this.f4789u.f());
        linkedHashMap.put("numberingSystem", this.f4785q);
        linkedHashMap.put("style", this.f4771a.toString());
        w wVar = w.f22734i;
        w wVar2 = this.f4771a;
        if (wVar2 == wVar) {
            linkedHashMap.put("currency", this.f4772b);
            linkedHashMap.put("currencyDisplay", this.f4773c.toString());
            linkedHashMap.put("currencySign", this.f4774d.toString());
        } else if (wVar2 == w.f22735v) {
            linkedHashMap.put("unit", this.f4775e);
            linkedHashMap.put("unitDisplay", this.f4776f.toString());
        }
        int i7 = this.f4778h;
        if (i7 != -1) {
            linkedHashMap.put("minimumIntegerDigits", Integer.valueOf(i7));
        }
        int i10 = this.f4781m;
        if (i10 == 1) {
            int i11 = this.f4780l;
            if (i11 != -1) {
                linkedHashMap.put("maximumSignificantDigits", Integer.valueOf(i11));
            }
            int i12 = this.k;
            if (i12 != -1) {
                linkedHashMap.put("minimumSignificantDigits", Integer.valueOf(i12));
            }
        } else if (i10 == 2) {
            int i13 = this.f4779i;
            if (i13 != -1) {
                linkedHashMap.put("minimumFractionDigits", Integer.valueOf(i13));
            }
            int i14 = this.j;
            if (i14 != -1) {
                linkedHashMap.put("maximumFractionDigits", Integer.valueOf(i14));
            }
        }
        linkedHashMap.put("useGrouping", Boolean.valueOf(this.f4777g));
        linkedHashMap.put("notation", this.f4786r.toString());
        if (this.f4786r == u.f22728i) {
            linkedHashMap.put("compactDisplay", this.f4787s.toString());
        }
        linkedHashMap.put("signDisplay", this.f4782n.toString());
        return linkedHashMap;
    }
}

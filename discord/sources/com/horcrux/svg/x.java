package com.horcrux.svg;

import app.rive.runtime.kotlin.fonts.Fonts;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.common.assets.ReactFontManager;
import com.facebook.react.uimanager.ViewProps;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class x {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final x f6807p = new x();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f6808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6810c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ReadableMap f6811d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public d2 f6812e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f6813f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f6814g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f6815h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f6816i;
    public final int j;
    public final e2 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final double f6817l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final double f6818m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final double f6819n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f6820o;

    public x() {
        this.f6811d = null;
        this.f6809b = "";
        this.f6810c = 1;
        this.f6812e = d2.Normal;
        this.f6813f = ReactFontManager.TypefaceStyle.NORMAL;
        this.f6814g = "";
        this.f6815h = "";
        this.f6816i = 1;
        this.j = 1;
        this.k = e2.None;
        this.f6820o = false;
        this.f6817l = 0.0d;
        this.f6808a = 12.0d;
        this.f6818m = 0.0d;
        this.f6819n = 0.0d;
    }

    public static double b(ReadableMap readableMap, String str, double d6, double d7, double d8) {
        return readableMap.getType(str) == ReadableType.Number ? readableMap.getDouble(str) : a.a.f(d8, readableMap.getString(str), d6, d7);
    }

    public final void a(x xVar, double d6) {
        long jRound = Math.round(d6);
        if (jRound < 1 || jRound > 1000) {
            this.f6813f = xVar.f6813f;
            this.f6812e = xVar.f6812e;
        } else {
            int i7 = (int) jRound;
            this.f6813f = i7;
            this.f6812e = w.f6804a[Math.round(i7 / 100.0f)];
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x005b  */
    /* JADX WARN: Code duplicated, block: B:23:0x0065 A[PHI: r12
      0x0065: PHI (r12v64 int) = (r12v63 int), (r12v67 int) binds: [B:27:0x006f, B:21:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
    public x(ReadableMap readableMap, x xVar, double d6) {
        ReadableMap readableMap2;
        int i7;
        String string;
        String string2;
        int i10;
        e2 e2Var;
        double d7;
        double dB;
        double dB2;
        double dB3;
        int i11;
        double d8 = xVar.f6808a;
        if (readableMap.hasKey(ViewProps.FONT_SIZE)) {
            readableMap2 = readableMap;
            this.f6808a = b(readableMap, ViewProps.FONT_SIZE, 1.0d, d8, d8);
        } else {
            readableMap2 = readableMap;
            this.f6808a = d8;
        }
        if (readableMap2.hasKey(ViewProps.FONT_WEIGHT)) {
            if (readableMap2.getType(ViewProps.FONT_WEIGHT) == ReadableType.Number) {
                a(xVar, readableMap2.getDouble(ViewProps.FONT_WEIGHT));
            } else {
                String string3 = readableMap2.getString(ViewProps.FONT_WEIGHT);
                HashMap map = d2.J;
                if (map.containsKey(string3)) {
                    d2 d2Var = (d2) map.get(string3);
                    d2[] d2VarArr = w.f6804a;
                    d2 d2Var2 = d2.Bolder;
                    int i12 = ReactFontManager.TypefaceStyle.BOLD;
                    if (d2Var == d2Var2) {
                        i11 = xVar.f6813f;
                        if (i11 < 350) {
                            i12 = 400;
                        } else if (i11 >= 550) {
                            i12 = 900;
                            if (i11 >= 900) {
                                i12 = i11;
                            }
                        }
                    } else if (d2Var == d2.Lighter) {
                        i11 = xVar.f6813f;
                        if (i11 < 100) {
                            i12 = i11;
                        } else if (i11 < 550) {
                            i12 = 100;
                        } else if (i11 < 750) {
                            i12 = 400;
                        }
                    } else {
                        i12 = w.f6805b[d2Var.ordinal()];
                    }
                    this.f6813f = i12;
                    this.f6812e = w.f6804a[Math.round(i12 / 100.0f)];
                } else if (string3 != null) {
                    a(xVar, Double.parseDouble(string3));
                } else {
                    this.f6813f = xVar.f6813f;
                    this.f6812e = xVar.f6812e;
                }
            }
        } else {
            this.f6813f = xVar.f6813f;
            this.f6812e = xVar.f6812e;
        }
        this.f6811d = readableMap2.hasKey("fontData") ? readableMap2.getMap("fontData") : xVar.f6811d;
        this.f6809b = readableMap2.hasKey(ViewProps.FONT_FAMILY) ? readableMap2.getString(ViewProps.FONT_FAMILY) : xVar.f6809b;
        int i13 = 3;
        boolean z5 = true;
        if (readableMap2.hasKey(ViewProps.FONT_STYLE)) {
            String string4 = readableMap2.getString(ViewProps.FONT_STYLE);
            if (string4 == null) {
                throw new NullPointerException("Name is null");
            }
            if (string4.equals("normal")) {
                i7 = 1;
            } else if (string4.equals(Fonts.Font.STYLE_ITALIC)) {
                i7 = 2;
            } else {
                if (!string4.equals("oblique")) {
                    throw new IllegalArgumentException("No enum constant com.horcrux.svg.TextProperties.FontStyle.".concat(string4));
                }
                i7 = 3;
            }
        } else {
            i7 = xVar.f6810c;
        }
        this.f6810c = i7;
        if (readableMap2.hasKey("fontFeatureSettings")) {
            string = readableMap2.getString("fontFeatureSettings");
        } else {
            string = xVar.f6814g;
        }
        this.f6814g = string;
        if (readableMap2.hasKey("fontVariationSettings")) {
            string2 = readableMap2.getString("fontVariationSettings");
        } else {
            string2 = xVar.f6815h;
        }
        this.f6815h = string2;
        if (readableMap2.hasKey("fontVariantLigatures")) {
            String string5 = readableMap2.getString("fontVariantLigatures");
            if (string5 == null) {
                throw new NullPointerException("Name is null");
            }
            if (string5.equals("normal")) {
                i10 = 1;
            } else {
                if (!string5.equals(ViewProps.NONE)) {
                    throw new IllegalArgumentException("No enum constant com.horcrux.svg.TextProperties.FontVariantLigatures.".concat(string5));
                }
                i10 = 2;
            }
        } else {
            i10 = xVar.f6816i;
        }
        this.f6816i = i10;
        if (readableMap2.hasKey("textAnchor")) {
            String string6 = readableMap2.getString("textAnchor");
            if (string6 == null) {
                throw new NullPointerException("Name is null");
            }
            if (string6.equals(ViewProps.START)) {
                i13 = 1;
            } else if (string6.equals("middle")) {
                i13 = 2;
            } else if (!string6.equals(ViewProps.END)) {
                throw new IllegalArgumentException("No enum constant com.horcrux.svg.TextProperties.TextAnchor.".concat(string6));
            }
        } else {
            i13 = xVar.j;
        }
        this.j = i13;
        if (readableMap2.hasKey("textDecoration")) {
            String string7 = readableMap2.getString("textDecoration");
            HashMap map2 = e2.f6702i;
            if (map2.containsKey(string7)) {
                e2Var = (e2) map2.get(string7);
            } else {
                throw new IllegalArgumentException(a3.e.l("Unknown String Value: ", string7));
            }
        } else {
            e2Var = xVar.k;
        }
        this.k = e2Var;
        boolean zHasKey = readableMap2.hasKey("kerning");
        if (!zHasKey && !xVar.f6820o) {
            z5 = false;
        }
        this.f6820o = z5;
        if (zHasKey) {
            d7 = d6;
            dB = b(readableMap2, "kerning", d7, this.f6808a, 0.0d);
        } else {
            d7 = d6;
            dB = xVar.f6817l;
        }
        this.f6817l = dB;
        if (readableMap2.hasKey("wordSpacing")) {
            dB2 = b(readableMap2, "wordSpacing", d7, this.f6808a, 0.0d);
        } else {
            dB2 = xVar.f6818m;
        }
        this.f6818m = dB2;
        if (readableMap2.hasKey(ViewProps.LETTER_SPACING)) {
            dB3 = b(readableMap2, ViewProps.LETTER_SPACING, d7, this.f6808a, 0.0d);
        } else {
            dB3 = xVar.f6819n;
        }
        this.f6819n = dB3;
    }
}

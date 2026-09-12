package com.horcrux.svg;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f6786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SVGLength$UnitType f6787b;

    public r0() {
        this.f6786a = 0.0d;
        this.f6787b = SVGLength$UnitType.UNKNOWN;
    }

    public static ArrayList a(Dynamic dynamic) {
        int i7 = q0.f6785a[dynamic.getType().ordinal()];
        if (i7 == 1) {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(new r0(dynamic.asDouble()));
            return arrayList;
        }
        int i10 = 0;
        if (i7 == 2) {
            String[] strArrSplit = dynamic.asString().trim().replaceAll(",", " ").split(" ");
            ArrayList arrayList2 = new ArrayList(strArrSplit.length);
            int length = strArrSplit.length;
            while (i10 < length) {
                arrayList2.add(new r0(strArrSplit[i10]));
                i10++;
            }
            return arrayList2;
        }
        if (i7 != 3) {
            return null;
        }
        ReadableArray readableArrayAsArray = dynamic.asArray();
        int size = readableArrayAsArray.size();
        ArrayList arrayList3 = new ArrayList(size);
        while (i10 < size) {
            arrayList3.add(b(readableArrayAsArray.getDynamic(i10)));
            i10++;
        }
        return arrayList3;
    }

    public static r0 b(Dynamic dynamic) {
        int i7 = q0.f6785a[dynamic.getType().ordinal()];
        if (i7 != 1) {
            return i7 != 2 ? new r0() : new r0(dynamic.asString());
        }
        return new r0(dynamic.asDouble());
    }

    public static String c(Dynamic dynamic) {
        int i7 = q0.f6785a[dynamic.getType().ordinal()];
        if (i7 == 1) {
            return String.valueOf(dynamic.asDouble());
        }
        if (i7 != 2) {
            return null;
        }
        return dynamic.asString();
    }

    public r0(double d6) {
        this.f6786a = d6;
        this.f6787b = SVGLength$UnitType.NUMBER;
    }

    public r0(String str) {
        String strTrim = str.trim();
        int length = strTrim.length();
        int i7 = length - 1;
        if (length != 0 && !strTrim.equals("normal")) {
            if (strTrim.codePointAt(i7) == 37) {
                this.f6787b = SVGLength$UnitType.PERCENTAGE;
                this.f6786a = Double.valueOf(strTrim.substring(0, i7)).doubleValue();
                return;
            }
            int i10 = length - 2;
            if (i10 > 0) {
                String strSubstring = strTrim.substring(i10);
                strSubstring.getClass();
                switch (strSubstring) {
                    case "cm":
                        this.f6787b = SVGLength$UnitType.CM;
                        length = i10;
                        break;
                    case "em":
                        this.f6787b = SVGLength$UnitType.EMS;
                        length = i10;
                        break;
                    case "ex":
                        this.f6787b = SVGLength$UnitType.EXS;
                        length = i10;
                        break;
                    case "in":
                        this.f6787b = SVGLength$UnitType.IN;
                        length = i10;
                        break;
                    case "mm":
                        this.f6787b = SVGLength$UnitType.MM;
                        length = i10;
                        break;
                    case "pc":
                        this.f6787b = SVGLength$UnitType.PC;
                        length = i10;
                        break;
                    case "pt":
                        this.f6787b = SVGLength$UnitType.PT;
                        length = i10;
                        break;
                    case "px":
                        this.f6787b = SVGLength$UnitType.NUMBER;
                        length = i10;
                        break;
                    default:
                        this.f6787b = SVGLength$UnitType.NUMBER;
                        break;
                }
                this.f6786a = Double.valueOf(strTrim.substring(0, length)).doubleValue();
                return;
            }
            this.f6787b = SVGLength$UnitType.NUMBER;
            this.f6786a = Double.valueOf(strTrim).doubleValue();
            return;
        }
        this.f6787b = SVGLength$UnitType.UNKNOWN;
        this.f6786a = 0.0d;
    }
}

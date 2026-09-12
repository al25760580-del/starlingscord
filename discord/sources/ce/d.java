package ce;

import android.text.Layout;
import android.text.TextUtils;
import app.rive.runtime.kotlin.fonts.Fonts;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.uimanager.ViewProps;
import ei.d1;
import ei.h0;
import ei.i0;
import ei.p;
import ei.x0;
import ei.z0;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import je.e0;
import m3.m;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import vd.h;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends vd.e {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Pattern f3601n = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Pattern f3602o = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Pattern f3603p = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Pattern f3604q = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Pattern f3605r = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Pattern f3606s = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Pattern f3607t = Pattern.compile("^(\\d+) (\\d+)$");

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final c f3608u = new c(1, 1, 30.0f);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final o9.d f3609v = new o9.d(15, 2);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final XmlPullParserFactory f3610m;

    public d() {
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.f3610m = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e10) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e10);
        }
    }

    public static g h(g gVar) {
        return gVar == null ? new g() : gVar;
    }

    public static boolean i(String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("image") || str.equals("data") || str.equals("information");
    }

    public static o9.d j(XmlPullParser xmlPullParser, o9.d dVar) throws h {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return dVar;
        }
        Matcher matcher = f3607t.matcher(attributeValue);
        if (!matcher.matches()) {
            je.b.N("TtmlDecoder", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return dVar;
        }
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            int i7 = Integer.parseInt(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            int i10 = Integer.parseInt(strGroup2);
            if (i7 != 0 && i10 != 0) {
                return new o9.d(i10, 2);
            }
            throw new h("Invalid cell resolution " + i7 + " " + i10);
        } catch (NumberFormatException unused) {
            je.b.N("TtmlDecoder", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return dVar;
        }
    }

    public static void k(String str, g gVar) throws h {
        Matcher matcher;
        int i7 = e0.f13788a;
        String[] strArrSplit = str.split("\\s+", -1);
        int length = strArrSplit.length;
        Pattern pattern = f3603p;
        if (length == 1) {
            matcher = pattern.matcher(str);
        } else {
            if (strArrSplit.length != 2) {
                throw new h(kk.b.l(new StringBuilder("Invalid number of entries for fontSize: "), strArrSplit.length, "."));
            }
            matcher = pattern.matcher(strArrSplit[1]);
            je.b.N("TtmlDecoder", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        }
        if (!matcher.matches()) {
            throw new h(s0.g.e("Invalid expression for fontSize: '", str, "'."));
        }
        String strGroup = matcher.group(3);
        strGroup.getClass();
        switch (strGroup) {
            case "%":
                gVar.j = 3;
                break;
            case "em":
                gVar.j = 2;
                break;
            case "px":
                gVar.j = 1;
                break;
            default:
                throw new h(s0.g.e("Invalid unit for fontSize: '", strGroup, "'."));
        }
        String strGroup2 = matcher.group(1);
        strGroup2.getClass();
        gVar.k = Float.parseFloat(strGroup2);
    }

    public static c l(XmlPullParser xmlPullParser) throws h {
        float f2;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int i7 = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            int i10 = e0.f13788a;
            String[] strArrSplit = attributeValue2.split(" ", -1);
            if (strArrSplit.length != 2) {
                throw new h("frameRateMultiplier doesn't have 2 parts");
            }
            f2 = Integer.parseInt(strArrSplit[0]) / Integer.parseInt(strArrSplit[1]);
        } else {
            f2 = 1.0f;
        }
        c cVar = f3608u;
        int i11 = cVar.f3599b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i11 = Integer.parseInt(attributeValue3);
        }
        int i12 = cVar.f3600c;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i12 = Integer.parseInt(attributeValue4);
        }
        return new c(i11, i12, i7 * f2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:107:0x0133 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:111:0x00fd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:47:0x0122  */
    /* JADX WARN: Code duplicated, block: B:49:0x0128 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x012a  */
    /* JADX WARN: Code duplicated, block: B:55:0x015d  */
    /* JADX WARN: Code duplicated, block: B:57:0x016c  */
    /* JADX WARN: Code duplicated, block: B:60:0x0175  */
    /* JADX WARN: Code duplicated, block: B:61:0x017c  */
    /* JADX WARN: Code duplicated, block: B:62:0x0187  */
    /* JADX WARN: Code duplicated, block: B:65:0x019b  */
    /* JADX WARN: Code duplicated, block: B:67:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:68:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:71:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:72:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:75:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:76:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:79:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:82:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:83:0x01d2 A[PHI: r14
      0x01d2: PHI (r14v2 int) = (r14v1 int), (r14v0 int) binds: [B:84:0x01d5, B:80:0x01cb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:84:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:87:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:88:0x01f9  */
    public static void m(XmlPullParser xmlPullParser, HashMap map, o9.d dVar, c5.e eVar, HashMap map2, HashMap map3) throws XmlPullParserException, IOException {
        String strW;
        float f2;
        float f7;
        String strW2;
        Matcher matcher;
        Matcher matcher2;
        float f10;
        float f11;
        String strW3;
        float f12;
        int i7;
        String strW4;
        int i10;
        f fVar;
        String strT;
        String strT2;
        String[] strArrSplit;
        do {
            xmlPullParser.next();
            if (je.b.C(xmlPullParser, "style")) {
                String strW5 = je.b.w(xmlPullParser, "style");
                g gVarO = o(xmlPullParser, new g());
                if (strW5 != null) {
                    String strTrim = strW5.trim();
                    if (strTrim.isEmpty()) {
                        strArrSplit = new String[0];
                    } else {
                        int i11 = e0.f13788a;
                        strArrSplit = strTrim.split("\\s+", -1);
                    }
                    for (String str : strArrSplit) {
                        gVarO.a((g) map.get(str));
                    }
                }
                String str2 = gVarO.f3640l;
                if (str2 != null) {
                    map.put(str2, gVarO);
                }
            } else if (je.b.C(xmlPullParser, "region")) {
                String strW6 = je.b.w(xmlPullParser, StackTraceHelper.ID_KEY);
                if (strW6 != null) {
                    String strW7 = je.b.w(xmlPullParser, "origin");
                    if (strW7 != null) {
                        Pattern pattern = f3605r;
                        Matcher matcher3 = pattern.matcher(strW7);
                        Pattern pattern2 = f3606s;
                        Matcher matcher4 = pattern2.matcher(strW7);
                        int i12 = 2;
                        if (matcher3.matches()) {
                            try {
                                String strGroup = matcher3.group(1);
                                strGroup.getClass();
                                f2 = Float.parseFloat(strGroup) / 100.0f;
                                String strGroup2 = matcher3.group(2);
                                strGroup2.getClass();
                                f7 = Float.parseFloat(strGroup2) / 100.0f;
                                strW2 = je.b.w(xmlPullParser, "extent");
                                if (strW2 != null) {
                                    matcher = pattern.matcher(strW2);
                                    matcher2 = pattern2.matcher(strW2);
                                    if (matcher.matches()) {
                                        try {
                                            String strGroup3 = matcher.group(1);
                                            strGroup3.getClass();
                                            f10 = Float.parseFloat(strGroup3) / 100.0f;
                                            String strGroup4 = matcher.group(2);
                                            strGroup4.getClass();
                                            f11 = Float.parseFloat(strGroup4) / 100.0f;
                                        } catch (NumberFormatException unused) {
                                            je.b.N("TtmlDecoder", "Ignoring region with malformed extent: ".concat(strW7));
                                            fVar = null;
                                        }
                                    } else if (matcher2.matches()) {
                                        je.b.N("TtmlDecoder", "Ignoring region with unsupported extent: ".concat(strW7));
                                    } else if (eVar == null) {
                                        je.b.N("TtmlDecoder", "Ignoring region with missing tts:extent: ".concat(strW7));
                                    } else {
                                        try {
                                            String strGroup5 = matcher2.group(1);
                                            strGroup5.getClass();
                                            int i13 = Integer.parseInt(strGroup5);
                                            String strGroup6 = matcher2.group(2);
                                            strGroup6.getClass();
                                            int i14 = Integer.parseInt(strGroup6);
                                            f10 = i13 / eVar.f3485b;
                                            f11 = i14 / eVar.f3486c;
                                        } catch (NumberFormatException unused2) {
                                            je.b.N("TtmlDecoder", "Ignoring region with malformed extent: ".concat(strW7));
                                            fVar = null;
                                        }
                                    }
                                    float f13 = f10;
                                    strW3 = je.b.w(xmlPullParser, "displayAlign");
                                    if (strW3 != null) {
                                        strT2 = m.T(strW3);
                                        strT2.getClass();
                                        if (!strT2.equals("center")) {
                                            f12 = f7 + (f11 / 2.0f);
                                            i7 = 1;
                                        } else if (strT2.equals("after")) {
                                            f12 = f7 + f11;
                                            i7 = 2;
                                        } else {
                                            f12 = f7;
                                            i7 = 0;
                                        }
                                    } else {
                                        f12 = f7;
                                        i7 = 0;
                                    }
                                    float f14 = 1.0f / dVar.f17185e;
                                    strW4 = je.b.w(xmlPullParser, "writingMode");
                                    if (strW4 != null) {
                                        strT = m.T(strW4);
                                        strT.getClass();
                                        switch (strT) {
                                            case "tb":
                                            case "tblr":
                                                i10 = i12;
                                                break;
                                            case "tbrl":
                                                i10 = 1;
                                                break;
                                            default:
                                                i12 = Integer.MIN_VALUE;
                                                i10 = i12;
                                                break;
                                        }
                                    } else {
                                        i12 = Integer.MIN_VALUE;
                                        i10 = i12;
                                    }
                                    fVar = new f(strW6, f2, f12, 0, i7, f13, f11, 1, f14, i10);
                                } else {
                                    je.b.N("TtmlDecoder", "Ignoring region without an extent");
                                }
                            } catch (NumberFormatException unused3) {
                                je.b.N("TtmlDecoder", "Ignoring region with malformed origin: ".concat(strW7));
                            }
                        } else if (!matcher4.matches()) {
                            je.b.N("TtmlDecoder", "Ignoring region with unsupported origin: ".concat(strW7));
                        } else if (eVar == null) {
                            je.b.N("TtmlDecoder", "Ignoring region with missing tts:extent: ".concat(strW7));
                        } else {
                            try {
                                String strGroup7 = matcher4.group(1);
                                strGroup7.getClass();
                                int i15 = Integer.parseInt(strGroup7);
                                String strGroup8 = matcher4.group(2);
                                strGroup8.getClass();
                                int i16 = Integer.parseInt(strGroup8);
                                float f15 = i15 / eVar.f3485b;
                                f7 = i16 / eVar.f3486c;
                                f2 = f15;
                                strW2 = je.b.w(xmlPullParser, "extent");
                                if (strW2 != null) {
                                    matcher = pattern.matcher(strW2);
                                    matcher2 = pattern2.matcher(strW2);
                                    if (matcher.matches()) {
                                        String strGroup9 = matcher.group(1);
                                        strGroup9.getClass();
                                        f10 = Float.parseFloat(strGroup9) / 100.0f;
                                        String strGroup10 = matcher.group(2);
                                        strGroup10.getClass();
                                        f11 = Float.parseFloat(strGroup10) / 100.0f;
                                    } else if (matcher2.matches()) {
                                        je.b.N("TtmlDecoder", "Ignoring region with unsupported extent: ".concat(strW7));
                                    } else if (eVar == null) {
                                        je.b.N("TtmlDecoder", "Ignoring region with missing tts:extent: ".concat(strW7));
                                    } else {
                                        String strGroup11 = matcher2.group(1);
                                        strGroup11.getClass();
                                        int i17 = Integer.parseInt(strGroup11);
                                        String strGroup12 = matcher2.group(2);
                                        strGroup12.getClass();
                                        int i18 = Integer.parseInt(strGroup12);
                                        f10 = i17 / eVar.f3485b;
                                        f11 = i18 / eVar.f3486c;
                                    }
                                    float f16 = f10;
                                    strW3 = je.b.w(xmlPullParser, "displayAlign");
                                    if (strW3 != null) {
                                        strT2 = m.T(strW3);
                                        strT2.getClass();
                                        if (!strT2.equals("center")) {
                                            f12 = f7 + (f11 / 2.0f);
                                            i7 = 1;
                                        } else if (strT2.equals("after")) {
                                            f12 = f7;
                                            i7 = 0;
                                        } else {
                                            f12 = f7 + f11;
                                            i7 = 2;
                                        }
                                    } else {
                                        f12 = f7;
                                        i7 = 0;
                                    }
                                    float f17 = 1.0f / dVar.f17185e;
                                    strW4 = je.b.w(xmlPullParser, "writingMode");
                                    if (strW4 != null) {
                                        strT = m.T(strW4);
                                        strT.getClass();
                                        switch (strT) {
                                            case 3694:
                                                if (!strT.equals("tb")) {
                                                }
                                                break;
                                            case 3553396:
                                                if (!strT.equals("tblr")) {
                                                }
                                                break;
                                            case 3553576:
                                                if (!strT.equals("tbrl")) {
                                                }
                                                break;
                                            default:
                                                break;
                                        }
                                        /*  JADX ERROR: Method code generation error
                                            java.lang.NullPointerException: Switch insn not found in header
                                            	at java.base/java.util.Objects.requireNonNull(Objects.java:246)
                                            	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:246)
                                            	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:90)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                            	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:320)
                                            	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                                            	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:157)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:136)
                                            	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:157)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:136)
                                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                            	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:157)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:136)
                                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                            	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:216)
                                            	at jadx.core.dex.regions.loops.LoopRegion.generate(LoopRegion.java:173)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                            */
                                        /*
                                            Method dump skipped, instruction units count: 638
                                            To view this dump add '--comments-level debug' option
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: ce.d.m(org.xmlpull.v1.XmlPullParser, java.util.HashMap, o9.d, c5.e, java.util.HashMap, java.util.HashMap):void");
                                    }

                                    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                                    /* JADX WARN: Code duplicated, block: B:6:0x003c  */
                                    public static e n(XmlPullParser xmlPullParser, e eVar, HashMap map, c cVar) throws h {
                                        long j;
                                        String[] strArrSplit;
                                        int attributeCount = xmlPullParser.getAttributeCount();
                                        String[] strArr = null;
                                        g gVarO = o(xmlPullParser, null);
                                        String strSubstring = null;
                                        String str = "";
                                        long jP = -9223372036854775807L;
                                        long jP2 = -9223372036854775807L;
                                        long jP3 = -9223372036854775807L;
                                        for (int i7 = 0; i7 < attributeCount; i7++) {
                                            String attributeName = xmlPullParser.getAttributeName(i7);
                                            String attributeValue = xmlPullParser.getAttributeValue(i7);
                                            attributeName.getClass();
                                            switch (attributeName) {
                                                case "region":
                                                    if (map.containsKey(attributeValue)) {
                                                        str = attributeValue;
                                                        continue;
                                                    }
                                                    break;
                                                case "dur":
                                                    jP3 = p(attributeValue, cVar);
                                                    break;
                                                case "end":
                                                    jP2 = p(attributeValue, cVar);
                                                    break;
                                                case "begin":
                                                    jP = p(attributeValue, cVar);
                                                    break;
                                                case "style":
                                                    String strTrim = attributeValue.trim();
                                                    if (strTrim.isEmpty()) {
                                                        strArrSplit = new String[0];
                                                    } else {
                                                        int i10 = e0.f13788a;
                                                        strArrSplit = strTrim.split("\\s+", -1);
                                                    }
                                                    if (strArrSplit.length > 0) {
                                                        strArr = strArrSplit;
                                                        break;
                                                    }
                                                    break;
                                                case "backgroundImage":
                                                    if (attributeValue.startsWith("#")) {
                                                        strSubstring = attributeValue.substring(1);
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                        if (eVar != null) {
                                            long j5 = eVar.f3614d;
                                            if (j5 != -9223372036854775807L) {
                                                if (jP != -9223372036854775807L) {
                                                    jP += j5;
                                                }
                                                if (jP2 != -9223372036854775807L) {
                                                    jP2 += j5;
                                                }
                                            }
                                        }
                                        if (jP2 != -9223372036854775807L) {
                                            j = jP2;
                                        } else {
                                            if (jP3 != -9223372036854775807L) {
                                                jP2 = jP + jP3;
                                            } else if (eVar != null) {
                                                long j7 = eVar.f3615e;
                                                if (j7 != -9223372036854775807L) {
                                                    j = j7;
                                                }
                                            }
                                            j = jP2;
                                        }
                                        return new e(xmlPullParser.getName(), null, jP, j, gVarO, strArr, str, strSubstring, eVar);
                                    }

                                    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                                    /* JADX WARN: Code duplicated, block: B:112:0x0189  */
                                    /* JADX WARN: Code duplicated, block: B:140:0x0202  */
                                    /* JADX WARN: Code duplicated, block: B:142:0x0216  */
                                    /* JADX WARN: Code duplicated, block: B:148:0x0224  */
                                    /* JADX WARN: Code duplicated, block: B:151:0x0232  */
                                    /* JADX WARN: Code duplicated, block: B:156:0x0251  */
                                    /* JADX WARN: Code duplicated, block: B:158:0x0262  */
                                    /* JADX WARN: Code duplicated, block: B:161:0x0268  */
                                    /* JADX WARN: Code duplicated, block: B:164:0x0272  */
                                    /* JADX WARN: Code duplicated, block: B:168:0x0288  */
                                    /* JADX WARN: Code duplicated, block: B:170:0x028d  */
                                    /* JADX WARN: Code duplicated, block: B:173:0x0293  */
                                    /* JADX WARN: Code duplicated, block: B:176:0x029d  */
                                    /* JADX WARN: Code duplicated, block: B:178:0x02a5  */
                                    /* JADX WARN: Code duplicated, block: B:179:0x02a7  */
                                    /* JADX WARN: Code duplicated, block: B:6:0x001e  */
                                    /* JADX WARN: Code duplicated, block: B:72:0x0103  */
                                    public static g o(XmlPullParser xmlPullParser, g gVar) {
                                        byte b10;
                                        int i7;
                                        z0 z0VarK;
                                        z0 z0VarK2;
                                        z0 z0VarK3;
                                        String str;
                                        int iHashCode;
                                        String str2;
                                        int iHashCode2;
                                        int i10;
                                        b bVar;
                                        String str3;
                                        int iHashCode3;
                                        int attributeCount = xmlPullParser.getAttributeCount();
                                        g gVarH = gVar;
                                        for (int i11 = 0; i11 < attributeCount; i11++) {
                                            String attributeValue = xmlPullParser.getAttributeValue(i11);
                                            String attributeName = xmlPullParser.getAttributeName(i11);
                                            attributeName.getClass();
                                            switch (attributeName) {
                                                case "fontStyle":
                                                    b10 = 0;
                                                    break;
                                                case "fontFamily":
                                                    b10 = 1;
                                                    break;
                                                case "textAlign":
                                                    b10 = 2;
                                                    break;
                                                case "textDecoration":
                                                    b10 = 3;
                                                    break;
                                                case "fontWeight":
                                                    b10 = 4;
                                                    break;
                                                case "id":
                                                    b10 = 5;
                                                    break;
                                                case "ruby":
                                                    b10 = 6;
                                                    break;
                                                case "color":
                                                    b10 = 7;
                                                    break;
                                                case "shear":
                                                    b10 = 8;
                                                    break;
                                                case "textCombine":
                                                    b10 = 9;
                                                    break;
                                                case "fontSize":
                                                    b10 = 10;
                                                    break;
                                                case "textEmphasis":
                                                    b10 = 11;
                                                    break;
                                                case "rubyPosition":
                                                    b10 = 12;
                                                    break;
                                                case "backgroundColor":
                                                    b10 = 13;
                                                    break;
                                                case "multiRowAlign":
                                                    b10 = 14;
                                                    break;
                                                default:
                                                    b10 = -1;
                                                    break;
                                            }
                                            Layout.Alignment alignment = null;
                                            switch (b10) {
                                                case 0:
                                                    gVarH = h(gVarH);
                                                    gVarH.f3639i = Fonts.Font.STYLE_ITALIC.equalsIgnoreCase(attributeValue) ? 1 : 0;
                                                    break;
                                                case 1:
                                                    gVarH = h(gVarH);
                                                    gVarH.f3631a = attributeValue;
                                                    break;
                                                case 2:
                                                    gVarH = h(gVarH);
                                                    String strT = m.T(attributeValue);
                                                    strT.getClass();
                                                    switch (strT) {
                                                        case "center":
                                                            alignment = Layout.Alignment.ALIGN_CENTER;
                                                            break;
                                                        case "end":
                                                        case "right":
                                                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                                                            break;
                                                        case "left":
                                                        case "start":
                                                            alignment = Layout.Alignment.ALIGN_NORMAL;
                                                            break;
                                                    }
                                                    gVarH.f3643o = alignment;
                                                    break;
                                                case 3:
                                                    String strT2 = m.T(attributeValue);
                                                    strT2.getClass();
                                                    switch (strT2) {
                                                        case "nounderline":
                                                            gVarH = h(gVarH);
                                                            gVarH.f3637g = 0;
                                                            break;
                                                        case "underline":
                                                            gVarH = h(gVarH);
                                                            gVarH.f3637g = 1;
                                                            break;
                                                        case "nolinethrough":
                                                            gVarH = h(gVarH);
                                                            gVarH.f3636f = 0;
                                                            break;
                                                        case "linethrough":
                                                            gVarH = h(gVarH);
                                                            gVarH.f3636f = 1;
                                                            break;
                                                    }
                                                    break;
                                                case 4:
                                                    gVarH = h(gVarH);
                                                    gVarH.f3638h = "bold".equalsIgnoreCase(attributeValue) ? 1 : 0;
                                                    break;
                                                case 5:
                                                    if ("style".equals(xmlPullParser.getName())) {
                                                        gVarH = h(gVarH);
                                                        gVarH.f3640l = attributeValue;
                                                    }
                                                    break;
                                                case 6:
                                                    String strT3 = m.T(attributeValue);
                                                    strT3.getClass();
                                                    switch (strT3) {
                                                        case "baseContainer":
                                                        case "base":
                                                            gVarH = h(gVarH);
                                                            gVarH.f3641m = 2;
                                                            break;
                                                        case "container":
                                                            gVarH = h(gVarH);
                                                            gVarH.f3641m = 1;
                                                            break;
                                                        case "delimiter":
                                                            gVarH = h(gVarH);
                                                            gVarH.f3641m = 4;
                                                            break;
                                                        case "textContainer":
                                                        case "text":
                                                            gVarH = h(gVarH);
                                                            gVarH.f3641m = 3;
                                                            break;
                                                    }
                                                    break;
                                                case 7:
                                                    gVarH = h(gVarH);
                                                    try {
                                                        gVarH.f3632b = je.c.a(attributeValue, false);
                                                        gVarH.f3633c = true;
                                                    } catch (IllegalArgumentException unused) {
                                                        a3.e.y("Failed parsing color value: ", attributeValue, "TtmlDecoder");
                                                    }
                                                    break;
                                                case 8:
                                                    g gVarH2 = h(gVarH);
                                                    Matcher matcher = f3604q.matcher(attributeValue);
                                                    float fMin = Float.MAX_VALUE;
                                                    if (matcher.matches()) {
                                                        try {
                                                            String strGroup = matcher.group(1);
                                                            strGroup.getClass();
                                                            fMin = Math.min(100.0f, Math.max(-100.0f, Float.parseFloat(strGroup)));
                                                        } catch (NumberFormatException e10) {
                                                            je.b.O("TtmlDecoder", "Failed to parse shear: " + attributeValue, e10);
                                                        }
                                                    } else {
                                                        a3.e.y("Invalid value for shear: ", attributeValue, "TtmlDecoder");
                                                    }
                                                    gVarH2.f3647s = fMin;
                                                    gVarH = gVarH2;
                                                    break;
                                                case 9:
                                                    String strT4 = m.T(attributeValue);
                                                    strT4.getClass();
                                                    if (strT4.equals("all")) {
                                                        gVarH = h(gVarH);
                                                        gVarH.f3645q = 1;
                                                    } else if (strT4.equals(ViewProps.NONE)) {
                                                        gVarH = h(gVarH);
                                                        gVarH.f3645q = 0;
                                                    }
                                                    break;
                                                case 10:
                                                    try {
                                                        gVarH = h(gVarH);
                                                        k(attributeValue, gVarH);
                                                    } catch (h unused2) {
                                                        a3.e.y("Failed parsing fontSize value: ", attributeValue, "TtmlDecoder");
                                                    }
                                                    break;
                                                case 11:
                                                    gVarH = h(gVarH);
                                                    Pattern pattern = b.f3590d;
                                                    if (attributeValue == null) {
                                                        bVar = null;
                                                    } else {
                                                        String strT5 = m.T(attributeValue.trim());
                                                        if (strT5.isEmpty()) {
                                                            bVar = null;
                                                        } else {
                                                            String[] strArrSplit = TextUtils.split(strT5, b.f3590d);
                                                            int length = strArrSplit.length;
                                                            h0 h0VarK = length != 0 ? length != 1 ? h0.k(strArrSplit.length, (Object[]) strArrSplit.clone()) : new d1(strArrSplit[0]) : x0.G;
                                                            String str4 = (String) p.h("outside", p.k(b.f3594h, h0VarK));
                                                            int iHashCode4 = str4.hashCode();
                                                            if (iHashCode4 != -1392885889) {
                                                                if (iHashCode4 != -1106037339) {
                                                                    if (iHashCode4 == 92734940 && str4.equals("after")) {
                                                                        i7 = 2;
                                                                    }
                                                                } else if (str4.equals("outside")) {
                                                                    i7 = -2;
                                                                }
                                                                z0VarK = p.k(b.f3591e, h0VarK);
                                                                if (z0VarK.isEmpty()) {
                                                                    z0VarK2 = p.k(b.f3593g, h0VarK);
                                                                    z0VarK3 = p.k(b.f3592f, h0VarK);
                                                                    if (z0VarK2.isEmpty() || !z0VarK3.isEmpty()) {
                                                                        str = (String) p.h("filled", z0VarK2);
                                                                        iHashCode = str.hashCode();
                                                                        if (iHashCode != -1274499742) {
                                                                            int i12 = (iHashCode != 3417674 && str.equals("open")) ? 2 : 1;
                                                                            str2 = (String) p.h("circle", z0VarK3);
                                                                            iHashCode2 = str2.hashCode();
                                                                            if (iHashCode2 != -1360216880) {
                                                                                if (iHashCode2 != -905816648) {
                                                                                    if (iHashCode2 == 99657 && str2.equals("dot")) {
                                                                                        i10 = 2;
                                                                                    }
                                                                                } else if (str2.equals("sesame")) {
                                                                                    i10 = 3;
                                                                                }
                                                                                bVar = new b(i10, i12, i7);
                                                                            } else {
                                                                                str2.equals("circle");
                                                                            }
                                                                            i10 = 1;
                                                                            bVar = new b(i10, i12, i7);
                                                                        } else {
                                                                            str.equals("filled");
                                                                        }
                                                                        str2 = (String) p.h("circle", z0VarK3);
                                                                        iHashCode2 = str2.hashCode();
                                                                        if (iHashCode2 != -1360216880) {
                                                                            if (iHashCode2 != -905816648) {
                                                                                if (iHashCode2 == 99657) {
                                                                                    i10 = 2;
                                                                                }
                                                                            } else if (str2.equals("sesame")) {
                                                                                i10 = 3;
                                                                            }
                                                                            bVar = new b(i10, i12, i7);
                                                                        } else {
                                                                            str2.equals("circle");
                                                                        }
                                                                        i10 = 1;
                                                                        bVar = new b(i10, i12, i7);
                                                                    } else {
                                                                        bVar = new b(-1, 0, i7);
                                                                    }
                                                                } else {
                                                                    str3 = (String) new i0(z0VarK).next();
                                                                    iHashCode3 = str3.hashCode();
                                                                    if (iHashCode3 != 3005871) {
                                                                        int i13 = (iHashCode3 != 3387192 && str3.equals(ViewProps.NONE)) ? 0 : -1;
                                                                        bVar = new b(i13, 0, i7);
                                                                    } else {
                                                                        str3.equals("auto");
                                                                    }
                                                                    bVar = new b(i13, 0, i7);
                                                                }
                                                            } else {
                                                                str4.equals("before");
                                                            }
                                                            i7 = 1;
                                                            z0VarK = p.k(b.f3591e, h0VarK);
                                                            if (z0VarK.isEmpty()) {
                                                                str3 = (String) new i0(z0VarK).next();
                                                                iHashCode3 = str3.hashCode();
                                                                if (iHashCode3 != 3005871) {
                                                                    if (iHashCode3 != 3387192) {
                                                                    }
                                                                    bVar = new b(i13, 0, i7);
                                                                } else {
                                                                    str3.equals("auto");
                                                                }
                                                                bVar = new b(i13, 0, i7);
                                                            } else {
                                                                z0VarK2 = p.k(b.f3593g, h0VarK);
                                                                z0VarK3 = p.k(b.f3592f, h0VarK);
                                                                if (z0VarK2.isEmpty()) {
                                                                    str = (String) p.h("filled", z0VarK2);
                                                                    iHashCode = str.hashCode();
                                                                    if (iHashCode != -1274499742) {
                                                                        if (iHashCode != 3417674) {
                                                                        }
                                                                        str2 = (String) p.h("circle", z0VarK3);
                                                                        iHashCode2 = str2.hashCode();
                                                                        if (iHashCode2 != -1360216880) {
                                                                            if (iHashCode2 != -905816648) {
                                                                                if (iHashCode2 == 99657) {
                                                                                    i10 = 2;
                                                                                }
                                                                            } else if (str2.equals("sesame")) {
                                                                                i10 = 3;
                                                                            }
                                                                            bVar = new b(i10, i12, i7);
                                                                        } else {
                                                                            str2.equals("circle");
                                                                        }
                                                                        i10 = 1;
                                                                        bVar = new b(i10, i12, i7);
                                                                    } else {
                                                                        str.equals("filled");
                                                                    }
                                                                    str2 = (String) p.h("circle", z0VarK3);
                                                                    iHashCode2 = str2.hashCode();
                                                                    if (iHashCode2 != -1360216880) {
                                                                        if (iHashCode2 != -905816648) {
                                                                            if (iHashCode2 == 99657) {
                                                                                i10 = 2;
                                                                            }
                                                                        } else if (str2.equals("sesame")) {
                                                                            i10 = 3;
                                                                        }
                                                                        bVar = new b(i10, i12, i7);
                                                                    } else {
                                                                        str2.equals("circle");
                                                                    }
                                                                    i10 = 1;
                                                                    bVar = new b(i10, i12, i7);
                                                                } else {
                                                                    str = (String) p.h("filled", z0VarK2);
                                                                    iHashCode = str.hashCode();
                                                                    if (iHashCode != -1274499742) {
                                                                        if (iHashCode != 3417674) {
                                                                        }
                                                                        str2 = (String) p.h("circle", z0VarK3);
                                                                        iHashCode2 = str2.hashCode();
                                                                        if (iHashCode2 != -1360216880) {
                                                                            if (iHashCode2 != -905816648) {
                                                                                if (iHashCode2 == 99657) {
                                                                                    i10 = 2;
                                                                                }
                                                                            } else if (str2.equals("sesame")) {
                                                                                i10 = 3;
                                                                            }
                                                                            bVar = new b(i10, i12, i7);
                                                                        } else {
                                                                            str2.equals("circle");
                                                                        }
                                                                        i10 = 1;
                                                                        bVar = new b(i10, i12, i7);
                                                                    } else {
                                                                        str.equals("filled");
                                                                    }
                                                                    str2 = (String) p.h("circle", z0VarK3);
                                                                    iHashCode2 = str2.hashCode();
                                                                    if (iHashCode2 != -1360216880) {
                                                                        if (iHashCode2 != -905816648) {
                                                                            if (iHashCode2 == 99657) {
                                                                                i10 = 2;
                                                                            }
                                                                        } else if (str2.equals("sesame")) {
                                                                            i10 = 3;
                                                                        }
                                                                        bVar = new b(i10, i12, i7);
                                                                    } else {
                                                                        str2.equals("circle");
                                                                    }
                                                                    i10 = 1;
                                                                    bVar = new b(i10, i12, i7);
                                                                }
                                                            }
                                                        }
                                                    }
                                                    gVarH.f3646r = bVar;
                                                    break;
                                                case 12:
                                                    String strT6 = m.T(attributeValue);
                                                    strT6.getClass();
                                                    if (strT6.equals("before")) {
                                                        gVarH = h(gVarH);
                                                        gVarH.f3642n = 1;
                                                    } else if (strT6.equals("after")) {
                                                        gVarH = h(gVarH);
                                                        gVarH.f3642n = 2;
                                                    }
                                                    break;
                                                case 13:
                                                    gVarH = h(gVarH);
                                                    try {
                                                        gVarH.f3634d = je.c.a(attributeValue, false);
                                                        gVarH.f3635e = true;
                                                    } catch (IllegalArgumentException unused3) {
                                                        a3.e.y("Failed parsing background value: ", attributeValue, "TtmlDecoder");
                                                    }
                                                    break;
                                                case 14:
                                                    gVarH = h(gVarH);
                                                    String strT7 = m.T(attributeValue);
                                                    strT7.getClass();
                                                    switch (strT7) {
                                                        case "center":
                                                            alignment = Layout.Alignment.ALIGN_CENTER;
                                                            break;
                                                        case "end":
                                                        case "right":
                                                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                                                            break;
                                                        case "left":
                                                        case "start":
                                                            alignment = Layout.Alignment.ALIGN_NORMAL;
                                                            break;
                                                    }
                                                    gVarH.f3644p = alignment;
                                                    break;
                                            }
                                        }
                                        return gVarH;
                                    }

                                    public static long p(String str, c cVar) throws h {
                                        double d6;
                                        double d7;
                                        Matcher matcher = f3601n.matcher(str);
                                        if (matcher.matches()) {
                                            String strGroup = matcher.group(1);
                                            strGroup.getClass();
                                            double d8 = Long.parseLong(strGroup) * 3600;
                                            String strGroup2 = matcher.group(2);
                                            strGroup2.getClass();
                                            double d9 = d8 + (Long.parseLong(strGroup2) * 60);
                                            String strGroup3 = matcher.group(3);
                                            strGroup3.getClass();
                                            double d10 = d9 + Long.parseLong(strGroup3);
                                            String strGroup4 = matcher.group(4);
                                            double d11 = d10 + (strGroup4 != null ? Double.parseDouble(strGroup4) : 0.0d);
                                            String strGroup5 = matcher.group(5);
                                            double d12 = d11 + (strGroup5 != null ? Long.parseLong(strGroup5) / cVar.f3598a : 0.0d);
                                            String strGroup6 = matcher.group(6);
                                            return (long) ((d12 + (strGroup6 != null ? (Long.parseLong(strGroup6) / ((double) cVar.f3599b)) / ((double) cVar.f3598a) : 0.0d)) * 1000000.0d);
                                        }
                                        Matcher matcher2 = f3602o.matcher(str);
                                        if (!matcher2.matches()) {
                                            throw new h(a3.e.l("Malformed time expression: ", str));
                                        }
                                        String strGroup7 = matcher2.group(1);
                                        strGroup7.getClass();
                                        double d13 = Double.parseDouble(strGroup7);
                                        String strGroup8 = matcher2.group(2);
                                        strGroup8.getClass();
                                        switch (strGroup8) {
                                            case "f":
                                                d6 = cVar.f3598a;
                                                d13 /= d6;
                                                return (long) (d13 * 1000000.0d);
                                            case "h":
                                                d7 = 3600.0d;
                                                break;
                                            case "m":
                                                d7 = 60.0d;
                                                break;
                                            case "t":
                                                d6 = cVar.f3600c;
                                                d13 /= d6;
                                                return (long) (d13 * 1000000.0d);
                                            case "ms":
                                                d6 = 1000.0d;
                                                d13 /= d6;
                                                return (long) (d13 * 1000000.0d);
                                            default:
                                                return (long) (d13 * 1000000.0d);
                                        }
                                        d13 *= d7;
                                        return (long) (d13 * 1000000.0d);
                                    }

                                    public static c5.e q(XmlPullParser xmlPullParser) {
                                        String strW = je.b.w(xmlPullParser, "extent");
                                        if (strW == null) {
                                            return null;
                                        }
                                        Matcher matcher = f3606s.matcher(strW);
                                        if (!matcher.matches()) {
                                            je.b.N("TtmlDecoder", "Ignoring non-pixel tts extent: ".concat(strW));
                                            return null;
                                        }
                                        try {
                                            String strGroup = matcher.group(1);
                                            strGroup.getClass();
                                            int i7 = Integer.parseInt(strGroup);
                                            String strGroup2 = matcher.group(2);
                                            strGroup2.getClass();
                                            return new c5.e(i7, Integer.parseInt(strGroup2), 1);
                                        } catch (NumberFormatException unused) {
                                            je.b.N("TtmlDecoder", "Ignoring malformed tts extent: ".concat(strW));
                                            return null;
                                        }
                                    }

                                    @Override // vd.e
                                    public final vd.f e(byte[] bArr, int i7, boolean z5) throws h {
                                        try {
                                            XmlPullParser xmlPullParserNewPullParser = this.f3610m.newPullParser();
                                            HashMap map = new HashMap();
                                            HashMap map2 = new HashMap();
                                            HashMap map3 = new HashMap();
                                            map2.put("", new f("", -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
                                            c5.e eVarQ = null;
                                            xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bArr, 0, i7), null);
                                            ArrayDeque arrayDeque = new ArrayDeque();
                                            c cVar = f3608u;
                                            o9.d dVar = f3609v;
                                            int i10 = 0;
                                            c cVarL = cVar;
                                            o9.c cVar2 = null;
                                            o9.d dVarJ = dVar;
                                            for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.getEventType()) {
                                                e eVar = (e) arrayDeque.peek();
                                                if (i10 == 0) {
                                                    String name = xmlPullParserNewPullParser.getName();
                                                    if (eventType == 2) {
                                                        if ("tt".equals(name)) {
                                                            cVarL = l(xmlPullParserNewPullParser);
                                                            dVarJ = j(xmlPullParserNewPullParser, dVar);
                                                            eVarQ = q(xmlPullParserNewPullParser);
                                                        }
                                                        c cVar3 = cVarL;
                                                        o9.d dVar2 = dVarJ;
                                                        if (i(name)) {
                                                            if ("head".equals(name)) {
                                                                m(xmlPullParserNewPullParser, map, dVar2, eVarQ, map2, map3);
                                                            } else {
                                                                try {
                                                                    e eVarN = n(xmlPullParserNewPullParser, eVar, map2, cVar3);
                                                                    arrayDeque.push(eVarN);
                                                                    if (eVar != null) {
                                                                        if (eVar.f3621m == null) {
                                                                            eVar.f3621m = new ArrayList();
                                                                        }
                                                                        eVar.f3621m.add(eVarN);
                                                                    }
                                                                } catch (h e10) {
                                                                    je.b.O("TtmlDecoder", "Suppressing parser error", e10);
                                                                    i10++;
                                                                }
                                                            }
                                                            dVarJ = dVar2;
                                                            cVarL = cVar3;
                                                        } else {
                                                            je.b.y("TtmlDecoder", "Ignoring unsupported tag: " + xmlPullParserNewPullParser.getName());
                                                        }
                                                        i10++;
                                                        dVarJ = dVar2;
                                                        cVarL = cVar3;
                                                    } else if (eventType == 4) {
                                                        eVar.getClass();
                                                        e eVarA = e.a(xmlPullParserNewPullParser.getText());
                                                        if (eVar.f3621m == null) {
                                                            eVar.f3621m = new ArrayList();
                                                        }
                                                        eVar.f3621m.add(eVarA);
                                                    } else if (eventType == 3) {
                                                        if (xmlPullParserNewPullParser.getName().equals("tt")) {
                                                            e eVar2 = (e) arrayDeque.peek();
                                                            eVar2.getClass();
                                                            cVar2 = new o9.c(eVar2, map, map2, map3);
                                                        }
                                                        arrayDeque.pop();
                                                    }
                                                } else if (eventType == 2) {
                                                    i10++;
                                                } else if (eventType == 3) {
                                                    i10--;
                                                }
                                                xmlPullParserNewPullParser.next();
                                            }
                                            if (cVar2 != null) {
                                                return cVar2;
                                            }
                                            throw new h("No TTML subtitles found");
                                        } catch (IOException e11) {
                                            throw new IllegalStateException("Unexpected error when reading input.", e11);
                                        } catch (XmlPullParserException e12) {
                                            throw new h("Unable to decode source", e12);
                                        }
                                    }
                                }

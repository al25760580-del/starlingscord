package je;

import android.graphics.Color;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f13771a = Pattern.compile("^rgb\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f13772b = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f13773c = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d*\\.?\\d*?)\\)$");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final HashMap f13774d;

    static {
        HashMap map = new HashMap();
        f13774d = map;
        s0.g.j(-984833, map, "aliceblue", -332841, "antiquewhite");
        map.put("aqua", -16711681);
        map.put("aquamarine", -8388652);
        s0.g.j(-983041, map, "azure", -657956, "beige");
        s0.g.j(-6972, map, "bisque", -16777216, "black");
        s0.g.j(-5171, map, "blanchedalmond", -16776961, "blue");
        s0.g.j(-7722014, map, "blueviolet", -5952982, "brown");
        s0.g.j(-2180985, map, "burlywood", -10510688, "cadetblue");
        s0.g.j(-8388864, map, "chartreuse", -2987746, "chocolate");
        s0.g.j(-32944, map, "coral", -10185235, "cornflowerblue");
        s0.g.j(-1828, map, "cornsilk", -2354116, "crimson");
        map.put("cyan", -16711681);
        map.put("darkblue", -16777077);
        s0.g.j(-16741493, map, "darkcyan", -4684277, "darkgoldenrod");
        map.put("darkgray", -5658199);
        map.put("darkgreen", -16751616);
        map.put("darkgrey", -5658199);
        map.put("darkkhaki", -4343957);
        s0.g.j(-7667573, map, "darkmagenta", -11179217, "darkolivegreen");
        s0.g.j(-29696, map, "darkorange", -6737204, "darkorchid");
        s0.g.j(-7667712, map, "darkred", -1468806, "darksalmon");
        s0.g.j(-7357297, map, "darkseagreen", -12042869, "darkslateblue");
        map.put("darkslategray", -13676721);
        map.put("darkslategrey", -13676721);
        map.put("darkturquoise", -16724271);
        map.put("darkviolet", -7077677);
        s0.g.j(-60269, map, "deeppink", -16728065, "deepskyblue");
        map.put("dimgray", -9868951);
        map.put("dimgrey", -9868951);
        map.put("dodgerblue", -14774017);
        map.put("firebrick", -5103070);
        s0.g.j(-1296, map, "floralwhite", -14513374, "forestgreen");
        map.put("fuchsia", -65281);
        map.put("gainsboro", -2302756);
        s0.g.j(-460545, map, "ghostwhite", -10496, "gold");
        map.put("goldenrod", -2448096);
        map.put("gray", -8355712);
        s0.g.j(-16744448, map, "green", -5374161, "greenyellow");
        map.put("grey", -8355712);
        map.put("honeydew", -983056);
        s0.g.j(-38476, map, "hotpink", -3318692, "indianred");
        s0.g.j(-11861886, map, "indigo", -16, "ivory");
        s0.g.j(-989556, map, "khaki", -1644806, "lavender");
        s0.g.j(-3851, map, "lavenderblush", -8586240, "lawngreen");
        s0.g.j(-1331, map, "lemonchiffon", -5383962, "lightblue");
        s0.g.j(-1015680, map, "lightcoral", -2031617, "lightcyan");
        map.put("lightgoldenrodyellow", -329006);
        map.put("lightgray", -2894893);
        map.put("lightgreen", -7278960);
        map.put("lightgrey", -2894893);
        s0.g.j(-18751, map, "lightpink", -24454, "lightsalmon");
        s0.g.j(-14634326, map, "lightseagreen", -7876870, "lightskyblue");
        map.put("lightslategray", -8943463);
        map.put("lightslategrey", -8943463);
        map.put("lightsteelblue", -5192482);
        map.put("lightyellow", -32);
        s0.g.j(-16711936, map, "lime", -13447886, "limegreen");
        map.put("linen", -331546);
        map.put("magenta", -65281);
        s0.g.j(-8388608, map, "maroon", -10039894, "mediumaquamarine");
        s0.g.j(-16777011, map, "mediumblue", -4565549, "mediumorchid");
        s0.g.j(-7114533, map, "mediumpurple", -12799119, "mediumseagreen");
        s0.g.j(-8689426, map, "mediumslateblue", -16713062, "mediumspringgreen");
        s0.g.j(-12004916, map, "mediumturquoise", -3730043, "mediumvioletred");
        s0.g.j(-15132304, map, "midnightblue", -655366, "mintcream");
        s0.g.j(-6943, map, "mistyrose", -6987, "moccasin");
        s0.g.j(-8531, map, "navajowhite", -16777088, "navy");
        s0.g.j(-133658, map, "oldlace", -8355840, "olive");
        s0.g.j(-9728477, map, "olivedrab", -23296, "orange");
        s0.g.j(-47872, map, "orangered", -2461482, "orchid");
        s0.g.j(-1120086, map, "palegoldenrod", -6751336, "palegreen");
        s0.g.j(-5247250, map, "paleturquoise", -2396013, "palevioletred");
        s0.g.j(-4139, map, "papayawhip", -9543, "peachpuff");
        s0.g.j(-3308225, map, "peru", -16181, "pink");
        s0.g.j(-2252579, map, "plum", -5185306, "powderblue");
        s0.g.j(-8388480, map, "purple", -10079335, "rebeccapurple");
        s0.g.j(-65536, map, "red", -4419697, "rosybrown");
        s0.g.j(-12490271, map, "royalblue", -7650029, "saddlebrown");
        s0.g.j(-360334, map, "salmon", -744352, "sandybrown");
        s0.g.j(-13726889, map, "seagreen", -2578, "seashell");
        s0.g.j(-6270419, map, "sienna", -4144960, "silver");
        s0.g.j(-7876885, map, "skyblue", -9807155, "slateblue");
        map.put("slategray", -9404272);
        map.put("slategrey", -9404272);
        map.put("snow", -1286);
        map.put("springgreen", -16711809);
        s0.g.j(-12156236, map, "steelblue", -2968436, "tan");
        s0.g.j(-16744320, map, "teal", -2572328, "thistle");
        s0.g.j(-40121, map, "tomato", 0, "transparent");
        s0.g.j(-12525360, map, "turquoise", -1146130, "violet");
        s0.g.j(-663885, map, "wheat", -1, "white");
        s0.g.j(-657931, map, "whitesmoke", -256, "yellow");
        map.put("yellowgreen", -6632142);
    }

    public static int a(String str, boolean z5) {
        int i7;
        b.g(!TextUtils.isEmpty(str));
        String strReplace = str.replace(" ", "");
        if (strReplace.charAt(0) == '#') {
            int i10 = (int) Long.parseLong(strReplace.substring(1), 16);
            if (strReplace.length() == 7) {
                return (-16777216) | i10;
            }
            if (strReplace.length() == 9) {
                return ((i10 & 255) << 24) | (i10 >>> 8);
            }
            throw new IllegalArgumentException();
        }
        if (strReplace.startsWith("rgba")) {
            Matcher matcher = (z5 ? f13773c : f13772b).matcher(strReplace);
            if (matcher.matches()) {
                if (z5) {
                    String strGroup = matcher.group(4);
                    strGroup.getClass();
                    i7 = (int) (Float.parseFloat(strGroup) * 255.0f);
                } else {
                    String strGroup2 = matcher.group(4);
                    strGroup2.getClass();
                    i7 = Integer.parseInt(strGroup2, 10);
                }
                String strGroup3 = matcher.group(1);
                strGroup3.getClass();
                int i11 = Integer.parseInt(strGroup3, 10);
                String strGroup4 = matcher.group(2);
                strGroup4.getClass();
                int i12 = Integer.parseInt(strGroup4, 10);
                String strGroup5 = matcher.group(3);
                strGroup5.getClass();
                return Color.argb(i7, i11, i12, Integer.parseInt(strGroup5, 10));
            }
        } else if (strReplace.startsWith("rgb")) {
            Matcher matcher2 = f13771a.matcher(strReplace);
            if (matcher2.matches()) {
                String strGroup6 = matcher2.group(1);
                strGroup6.getClass();
                int i13 = Integer.parseInt(strGroup6, 10);
                String strGroup7 = matcher2.group(2);
                strGroup7.getClass();
                int i14 = Integer.parseInt(strGroup7, 10);
                String strGroup8 = matcher2.group(3);
                strGroup8.getClass();
                return Color.rgb(i13, i14, Integer.parseInt(strGroup8, 10));
            }
        } else {
            Integer num = (Integer) f13774d.get(m3.m.T(strReplace));
            if (num != null) {
                return num.intValue();
            }
        }
        throw new IllegalArgumentException();
    }
}

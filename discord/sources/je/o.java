package je;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.webrtc.MediaStreamTrack;

/* JADX INFO: loaded from: classes3.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ArrayList f13816a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f13817b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    public static String a(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : e0.S(str)) {
            String strD = d(str2);
            if (strD != null && j(strD)) {
                return strD;
            }
        }
        return null;
    }

    public static String b(String str, String str2) {
        if (str != null && str2 != null) {
            String[] strArrS = e0.S(str);
            StringBuilder sb2 = new StringBuilder();
            for (String str3 : strArrS) {
                if (str2.equals(d(str3))) {
                    if (sb2.length() > 0) {
                        sb2.append(",");
                    }
                    sb2.append(str3);
                }
            }
            if (sb2.length() > 0) {
                return sb2.toString();
            }
        }
        return null;
    }

    public static int c(String str, String str2) {
        c5.e eVarF;
        str.getClass();
        switch (str) {
            case "audio/eac3-joc":
                return 18;
            case "audio/vnd.dts.hd;profile=lbr":
                return 8;
            case "audio/vnd.dts":
                return 7;
            case "audio/mp4a-latm":
                if (str2 == null || (eVarF = f(str2)) == null) {
                    return 0;
                }
                return eVarF.b();
            case "audio/ac3":
                return 5;
            case "audio/ac4":
                return 17;
            case "audio/vnd.dts.uhd;profile=p2":
                return 30;
            case "audio/eac3":
                return 6;
            case "audio/mpeg":
                return 9;
            case "audio/opus":
                return 20;
            case "audio/vnd.dts.hd":
                return 8;
            case "audio/true-hd":
                return 14;
            default:
                return 0;
        }
    }

    public static String d(String str) {
        c5.e eVarF;
        String strE = null;
        if (str != null) {
            String strT = m3.m.T(str.trim());
            if (strT.startsWith("avc1") || strT.startsWith("avc3")) {
                return "video/avc";
            }
            if (strT.startsWith("hev1") || strT.startsWith("hvc1")) {
                return "video/hevc";
            }
            if (strT.startsWith("dvav") || strT.startsWith("dva1") || strT.startsWith("dvhe") || strT.startsWith("dvh1")) {
                return "video/dolby-vision";
            }
            if (strT.startsWith("av01")) {
                return "video/av01";
            }
            if (strT.startsWith("vp9") || strT.startsWith("vp09")) {
                return "video/x-vnd.on2.vp9";
            }
            if (strT.startsWith("vp8") || strT.startsWith("vp08")) {
                return "video/x-vnd.on2.vp8";
            }
            if (strT.startsWith("mp4a")) {
                if (strT.startsWith("mp4a.") && (eVarF = f(strT)) != null) {
                    strE = e(eVarF.f3485b);
                }
                return strE == null ? "audio/mp4a-latm" : strE;
            }
            if (strT.startsWith("mha1")) {
                return "audio/mha1";
            }
            if (strT.startsWith("mhm1")) {
                return "audio/mhm1";
            }
            if (strT.startsWith("ac-3") || strT.startsWith("dac3")) {
                return "audio/ac3";
            }
            if (strT.startsWith("ec-3") || strT.startsWith("dec3")) {
                return "audio/eac3";
            }
            if (strT.startsWith("ec+3")) {
                return "audio/eac3-joc";
            }
            if (strT.startsWith("ac-4") || strT.startsWith("dac4")) {
                return "audio/ac4";
            }
            if (strT.startsWith("dtsc")) {
                return "audio/vnd.dts";
            }
            if (strT.startsWith("dtse")) {
                return "audio/vnd.dts.hd;profile=lbr";
            }
            if (strT.startsWith("dtsh") || strT.startsWith("dtsl")) {
                return "audio/vnd.dts.hd";
            }
            if (strT.startsWith("dtsx")) {
                return "audio/vnd.dts.uhd;profile=p2";
            }
            if (strT.startsWith("opus")) {
                return "audio/opus";
            }
            if (strT.startsWith("vorbis")) {
                return "audio/vorbis";
            }
            if (strT.startsWith("flac")) {
                return "audio/flac";
            }
            if (strT.startsWith("stpp")) {
                return "application/ttml+xml";
            }
            if (strT.startsWith("wvtt")) {
                return "text/vtt";
            }
            if (strT.contains("cea708")) {
                return "application/cea-708";
            }
            if (strT.contains("eia608") || strT.contains("cea608")) {
                return "application/cea-608";
            }
            ArrayList arrayList = f13816a;
            if (arrayList.size() > 0) {
                arrayList.get(0).getClass();
                throw new ClassCastException();
            }
        }
        return null;
    }

    public static String e(int i7) {
        if (i7 == 32) {
            return "video/mp4v-es";
        }
        if (i7 == 33) {
            return "video/avc";
        }
        if (i7 == 35) {
            return "video/hevc";
        }
        if (i7 == 64) {
            return "audio/mp4a-latm";
        }
        if (i7 == 163) {
            return "video/wvc1";
        }
        if (i7 == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i7 == 165) {
            return "audio/ac3";
        }
        if (i7 == 166) {
            return "audio/eac3";
        }
        switch (i7) {
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
                return "video/mpeg2";
            case 102:
            case 103:
            case 104:
                return "audio/mp4a-latm";
            case 105:
            case 107:
                return "audio/mpeg";
            case 106:
                return "video/mpeg";
            default:
                switch (i7) {
                    case 169:
                    case 172:
                        return "audio/vnd.dts";
                    case 170:
                    case 171:
                        return "audio/vnd.dts.hd";
                    case 173:
                        return "audio/opus";
                    case 174:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    public static c5.e f(String str) {
        Matcher matcher = f13817b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        String strGroup2 = matcher.group(2);
        try {
            return new c5.e(Integer.parseInt(strGroup, 16), strGroup2 != null ? Integer.parseInt(strGroup2) : 0, 4);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static String g(String str) {
        int iIndexOf;
        if (str == null || (iIndexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, iIndexOf);
    }

    public static int h(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (j(str)) {
            return 1;
        }
        if (l(str)) {
            return 2;
        }
        if (k(str)) {
            return 3;
        }
        if ("image".equals(g(str))) {
            return 4;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        ArrayList arrayList = f13816a;
        if (arrayList.size() <= 0) {
            return -1;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    public static String i(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : e0.S(str)) {
            String strD = d(str2);
            if (strD != null && l(strD)) {
                return strD;
            }
        }
        return null;
    }

    public static boolean j(String str) {
        return MediaStreamTrack.AUDIO_TRACK_KIND.equals(g(str));
    }

    public static boolean k(String str) {
        return "text".equals(g(str)) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str);
    }

    public static boolean l(String str) {
        return MediaStreamTrack.VIDEO_TRACK_KIND.equals(g(str));
    }
}

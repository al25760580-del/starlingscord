package je;

import android.app.UiModeManager;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h0;
import com.discord.chat.presentation.message.view.MediaImageViewKt;
import com.discord.media.engine.MediaEngine;
import com.discord.misc.utilities.logThrottle.LogThrottleSingleton;
import com.facebook.imageutils.JfifUtil;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.uimanager.ViewProps;
import com.google.android.exoplayer2.Player;
import gc.h1;
import j$.util.DesugarTimeZone;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import org.webrtc.MediaStreamTrack;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f13788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f13789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f13790c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f13791d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f13792e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final byte[] f13793f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Pattern f13794g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Pattern f13795h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Pattern f13796i;
    public static final Pattern j;
    public static HashMap k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String[] f13797l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String[] f13798m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int[] f13799n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int[] f13800o;

    static {
        int i7 = Build.VERSION.SDK_INT;
        f13788a = i7;
        String str = Build.DEVICE;
        f13789b = str;
        String str2 = Build.MANUFACTURER;
        f13790c = str2;
        String str3 = Build.MODEL;
        f13791d = str3;
        f13792e = str + ", " + str3 + ", " + str2 + ", " + i7;
        f13793f = new byte[0];
        f13794g = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        f13795h = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        f13796i = Pattern.compile("%([A-Fa-f0-9]{2})");
        j = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        f13797l = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", StackTraceHelper.ID_KEY, "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        f13798m = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        f13799n = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        f13800o = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, JfifUtil.MARKER_SOI, 223, 214, 209, 196, 195, 202, 205, 144, 151, 158, 153, 140, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, 189, 199, JfifUtil.MARKER_SOFn, 201, 206, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, 137, 142, 135, IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT, 149, MediaImageViewKt.OBSCURED_IMAGE_MIN_WIDTH, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, h0.DEFAULT_DRAG_ANIMATION_DURATION, 221, JfifUtil.MARKER_SOS, 211, MediaImageViewKt.OBSCURED_IMAGE_MIN_HEIGHT, 105, 110, 103, 96, 117, MediaEngine.MAX_SUPPORTED_PROTOCOL_VERSION, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, 132, 131, 222, JfifUtil.MARKER_EOI, JfifUtil.MARKER_RST0, JfifUtil.MARKER_RST7, 194, 197, 204, 203, 230, JfifUtil.MARKER_APP1, 232, 239, h0.DEFAULT_SWIPE_ANIMATION_DURATION, 253, 244, 243};
    }

    public static String A(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e10) {
            b.s("Util", "Failed to read system property ".concat(str), e10);
            return null;
        }
    }

    public static String B(int i7) {
        switch (i7) {
            case -2:
                return ViewProps.NONE;
            case -1:
                return "unknown";
            case 0:
                return "default";
            case 1:
                return MediaStreamTrack.AUDIO_TRACK_KIND;
            case 2:
                return MediaStreamTrack.VIDEO_TRACK_KIND;
            case 3:
                return "text";
            case 4:
                return "image";
            case 5:
                return "metadata";
            case 6:
                return "camera motion";
            default:
                return i7 >= 10000 ? s0.g.d(i7, "custom (", ")") : "?";
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x002a  */
    /* JADX WARN: Code duplicated, block: B:20:0x002e A[RETURN] */
    public static boolean C(Player player) {
        boolean z5 = false;
        if (player == null) {
            return false;
        }
        int iW = player.w();
        if (iW != 1 || !player.E(2)) {
            if (iW == 4 && player.E(4)) {
                player.n();
            }
            if (player.E(1)) {
                return z5;
            }
            player.B();
            return true;
        }
        player.a();
        z5 = true;
        if (player.E(1)) {
            return z5;
        }
        player.B();
        return true;
    }

    public static int D(Uri uri) {
        int i7;
        String scheme = uri.getScheme();
        if (scheme != null && m3.m.w("rtsp", scheme)) {
            return 3;
        }
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment != null) {
            int iLastIndexOf = lastPathSegment.lastIndexOf(46);
            if (iLastIndexOf >= 0) {
                String strT = m3.m.T(lastPathSegment.substring(iLastIndexOf + 1));
                strT.getClass();
                switch (strT) {
                    case "ism":
                    case "isml":
                        i7 = 1;
                        break;
                    case "mpd":
                        i7 = 0;
                        break;
                    case "m3u8":
                        i7 = 2;
                        break;
                    default:
                        i7 = 4;
                        break;
                }
                if (i7 != 4) {
                    return i7;
                }
            }
            String path = uri.getPath();
            path.getClass();
            Matcher matcher = j.matcher(path);
            if (matcher.matches()) {
                String strGroup = matcher.group(2);
                if (strGroup != null) {
                    if (strGroup.contains("format=mpd-time-csf")) {
                        return 0;
                    }
                    if (strGroup.contains("format=m3u8-aapl")) {
                        return 2;
                    }
                }
                return 1;
            }
        }
        return 4;
    }

    public static boolean E(w wVar, w wVar2, Inflater inflater) {
        if (wVar.a() <= 0) {
            return false;
        }
        if (wVar2.f13860a.length < wVar.a()) {
            wVar2.b(wVar.a() * 2);
        }
        if (inflater == null) {
            inflater = new Inflater();
        }
        inflater.setInput(wVar.f13860a, wVar.f13861b, wVar.a());
        int iInflate = 0;
        while (true) {
            try {
                byte[] bArr = wVar2.f13860a;
                iInflate += inflater.inflate(bArr, iInflate, bArr.length - iInflate);
                if (inflater.finished()) {
                    wVar2.E(iInflate);
                    inflater.reset();
                    return true;
                }
                if (!inflater.needsDictionary() && !inflater.needsInput()) {
                    byte[] bArr2 = wVar2.f13860a;
                    if (iInflate == bArr2.length) {
                        wVar2.b(bArr2.length * 2);
                    }
                }
                inflater.reset();
                return false;
            } catch (DataFormatException unused) {
                inflater.reset();
                return false;
            } catch (Throwable th2) {
                inflater.reset();
                throw th2;
            }
        }
    }

    public static boolean F(int i7) {
        return i7 == 3 || i7 == 2 || i7 == 268435456 || i7 == 536870912 || i7 == 805306368 || i7 == 4;
    }

    public static boolean G(int i7) {
        return i7 == 10 || i7 == 13;
    }

    public static boolean H(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    public static long I(long j5) {
        return (j5 == -9223372036854775807L || j5 == Long.MIN_VALUE) ? j5 : j5 * 1000;
    }

    public static String J(String str) {
        if (str == null) {
            return null;
        }
        String strReplace = str.replace('_', '-');
        if (!strReplace.isEmpty() && !strReplace.equals("und")) {
            str = strReplace;
        }
        String strT = m3.m.T(str);
        int i7 = 0;
        String str2 = strT.split("-", 2)[0];
        if (k == null) {
            String[] iSOLanguages = Locale.getISOLanguages();
            int length = iSOLanguages.length;
            String[] strArr = f13797l;
            HashMap map = new HashMap(length + strArr.length);
            for (String str3 : iSOLanguages) {
                try {
                    String iSO3Language = new Locale(str3).getISO3Language();
                    if (!TextUtils.isEmpty(iSO3Language)) {
                        map.put(iSO3Language, str3);
                    }
                } catch (MissingResourceException unused) {
                }
            }
            for (int i10 = 0; i10 < strArr.length; i10 += 2) {
                map.put(strArr[i10], strArr[i10 + 1]);
            }
            k = map;
        }
        String str4 = (String) k.get(str2);
        if (str4 != null) {
            StringBuilder sbN = kk.b.n(str4);
            sbN.append(strT.substring(str2.length()));
            strT = sbN.toString();
            str2 = str4;
        }
        if (!"no".equals(str2) && !"i".equals(str2) && !"zh".equals(str2)) {
            return strT;
        }
        while (true) {
            String[] strArr2 = f13798m;
            if (i7 >= strArr2.length) {
                return strT;
            }
            if (strT.startsWith(strArr2[i7])) {
                return strArr2[i7 + 1] + strT.substring(strArr2[i7].length());
            }
            i7 += 2;
        }
    }

    public static Object[] K(int i7, Object[] objArr) {
        b.g(i7 <= objArr.length);
        return Arrays.copyOf(objArr, i7);
    }

    public static long L(String str) throws h1 {
        Matcher matcher = f13794g.matcher(str);
        if (!matcher.matches()) {
            throw h1.a("Invalid date/time format: " + str, null);
        }
        int i7 = 0;
        if (matcher.group(9) != null && !matcher.group(9).equalsIgnoreCase("Z")) {
            i7 = Integer.parseInt(matcher.group(13)) + (Integer.parseInt(matcher.group(12)) * 60);
            if ("-".equals(matcher.group(11))) {
                i7 *= -1;
            }
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(DesugarTimeZone.getTimeZone("GMT"));
        gregorianCalendar.clear();
        gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
        if (!TextUtils.isEmpty(matcher.group(8))) {
            gregorianCalendar.set(14, new BigDecimal("0." + matcher.group(8)).movePointRight(3).intValue());
        }
        long timeInMillis = gregorianCalendar.getTimeInMillis();
        return i7 != 0 ? timeInMillis - (((long) i7) * LogThrottleSingleton.RATE_LIMIT_ONE_MINUTE) : timeInMillis;
    }

    public static void M(Handler handler, Runnable runnable) {
        if (handler.getLooper().getThread().isAlive()) {
            if (handler.getLooper() == Looper.myLooper()) {
                runnable.run();
            } else {
                handler.post(runnable);
            }
        }
    }

    public static void N(ArrayList arrayList, int i7, int i10) {
        if (i7 < 0 || i10 > arrayList.size() || i7 > i10) {
            throw new IllegalArgumentException();
        }
        if (i7 != i10) {
            arrayList.subList(i7, i10).clear();
        }
    }

    public static long O(int i7, long j5) {
        return (j5 * 1000000) / ((long) i7);
    }

    public static long P(long j5, long j7, long j10) {
        if (j10 >= j7 && j10 % j7 == 0) {
            return j5 / (j10 / j7);
        }
        if (j10 < j7 && j7 % j10 == 0) {
            return (j7 / j10) * j5;
        }
        return (long) (j5 * (j7 / j10));
    }

    public static void Q(long[] jArr, long j5) {
        int i7 = 0;
        if (j5 >= 1000000 && j5 % 1000000 == 0) {
            long j7 = j5 / 1000000;
            while (i7 < jArr.length) {
                jArr[i7] = jArr[i7] / j7;
                i7++;
            }
            return;
        }
        if (j5 >= 1000000 || 1000000 % j5 != 0) {
            double d6 = 1000000 / j5;
            while (i7 < jArr.length) {
                jArr[i7] = (long) (jArr[i7] * d6);
                i7++;
            }
            return;
        }
        long j10 = 1000000 / j5;
        while (i7 < jArr.length) {
            jArr[i7] = jArr[i7] * j10;
            i7++;
        }
    }

    public static boolean R(Player player) {
        return player == null || !player.g() || player.w() == 1 || player.w() == 4;
    }

    public static String[] S(String str) {
        return TextUtils.isEmpty(str) ? new String[0] : str.trim().split("(\\s*,\\s*)", -1);
    }

    public static byte[] T(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int i7 = inputStream.read(bArr);
            if (i7 == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i7);
        }
    }

    public static long U(long j5) {
        return (j5 == -9223372036854775807L || j5 == Long.MIN_VALUE) ? j5 : j5 / 1000;
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static int b(long[] jArr, long j5, boolean z5) {
        int i7;
        int iBinarySearch = Arrays.binarySearch(jArr, j5);
        if (iBinarySearch < 0) {
            return ~iBinarySearch;
        }
        while (true) {
            i7 = iBinarySearch + 1;
            if (i7 >= jArr.length || jArr[i7] != j5) {
                break;
            }
            iBinarySearch = i7;
        }
        return z5 ? iBinarySearch : i7;
    }

    public static int c(Long l6, boolean z5, List list) {
        int i7;
        int iBinarySearch = Collections.binarySearch(list, l6);
        if (iBinarySearch < 0) {
            i7 = -(iBinarySearch + 2);
        } else {
            while (true) {
                int i10 = iBinarySearch - 1;
                if (i10 < 0 || ((Comparable) list.get(i10)).compareTo(l6) != 0) {
                    break;
                }
                iBinarySearch = i10;
            }
            i7 = iBinarySearch;
        }
        return z5 ? Math.max(0, i7) : i7;
    }

    public static int d(int[] iArr, int i7, boolean z5, boolean z6) {
        int i10;
        int i11;
        int iBinarySearch = Arrays.binarySearch(iArr, i7);
        if (iBinarySearch < 0) {
            i11 = -(iBinarySearch + 2);
        } else {
            while (true) {
                i10 = iBinarySearch - 1;
                if (i10 < 0 || iArr[i10] != i7) {
                    break;
                }
                iBinarySearch = i10;
            }
            i11 = z5 ? iBinarySearch : i10;
        }
        return z6 ? Math.max(0, i11) : i11;
    }

    public static int e(long[] jArr, long j5, boolean z5) {
        int i7;
        int iBinarySearch = Arrays.binarySearch(jArr, j5);
        if (iBinarySearch < 0) {
            i7 = -(iBinarySearch + 2);
        } else {
            while (true) {
                int i10 = iBinarySearch - 1;
                if (i10 < 0 || jArr[i10] != j5) {
                    break;
                }
                iBinarySearch = i10;
            }
            i7 = iBinarySearch;
        }
        return z5 ? Math.max(0, i7) : i7;
    }

    public static int f(int i7, int i10) {
        return ((i7 + i10) - 1) / i10;
    }

    public static void g(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static float h(float f2, float f7, float f10) {
        return Math.max(f7, Math.min(f2, f10));
    }

    public static int i(int i7, int i10, int i11) {
        return Math.max(i10, Math.min(i7, i11));
    }

    public static long j(long j5, long j7, long j10) {
        return Math.max(j7, Math.min(j5, j10));
    }

    public static boolean k(Object[] objArr, Comparable comparable) {
        for (Object obj : objArr) {
            if (a(obj, comparable)) {
                return true;
            }
        }
        return false;
    }

    public static int l(int i7, int i10, int i11, byte[] bArr) {
        while (i7 < i10) {
            i11 = f13799n[((i11 >>> 24) ^ (bArr[i7] & 255)) & 255] ^ (i11 << 8);
            i7++;
        }
        return i11;
    }

    public static Handler m(Handler.Callback callback) {
        Looper looperMyLooper = Looper.myLooper();
        b.l(looperMyLooper);
        return new Handler(looperMyLooper, callback);
    }

    public static String n(byte[] bArr) {
        return new String(bArr, di.d.f7631c);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:12:0x0015 A[RETURN] */
    public static int o(int i7) {
        switch (i7) {
            case 1:
                return 4;
            case 2:
                return 12;
            case 3:
                return 28;
            case 4:
                return 204;
            case 5:
                return 220;
            case 6:
                return 252;
            case 7:
                return 1276;
            case 8:
                return 6396;
            case 9:
            case 11:
            default:
                return 0;
            case 10:
                if (f13788a >= 32) {
                    return 737532;
                }
                return 6396;
            case 12:
                return 743676;
        }
    }

    public static int p(int i7, String str) {
        int i10 = 0;
        for (String str2 : S(str)) {
            if (i7 == o.h(o.d(str2))) {
                i10++;
            }
        }
        return i10;
    }

    public static String q(int i7, String str) {
        String[] strArrS = S(str);
        if (strArrS.length == 0) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : strArrS) {
            if (i7 == o.h(o.d(str2))) {
                if (sb2.length() > 0) {
                    sb2.append(",");
                }
                sb2.append(str2);
            }
        }
        if (sb2.length() > 0) {
            return sb2.toString();
        }
        return null;
    }

    public static Drawable r(Context context, Resources resources, int i7) {
        return f13788a >= 21 ? d0.a(context, resources, i7) : resources.getDrawable(i7);
    }

    public static int s(int i7) {
        if (i7 == 2 || i7 == 4) {
            return 6005;
        }
        if (i7 == 10) {
            return 6004;
        }
        if (i7 == 7) {
            return 6005;
        }
        if (i7 == 8) {
            return 6003;
        }
        switch (i7) {
            case 15:
                return 6003;
            case 16:
            case 18:
                return 6005;
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                return 6004;
            default:
                switch (i7) {
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                        return 6002;
                    default:
                        return 6006;
                }
        }
    }

    public static int t(String str) {
        String[] strArrSplit;
        int length;
        int i7 = 0;
        if (str == null || (length = (strArrSplit = str.split("_", -1)).length) < 2) {
            return 0;
        }
        String str2 = strArrSplit[length - 1];
        boolean z5 = length >= 3 && "neg".equals(strArrSplit[length - 2]);
        try {
            str2.getClass();
            i7 = Integer.parseInt(str2);
            if (z5) {
                return -i7;
            }
        } catch (NumberFormatException unused) {
        }
        return i7;
    }

    public static long u(long j5, float f2) {
        return f2 == 1.0f ? j5 : Math.round(j5 * ((double) f2));
    }

    public static long v(long j5) {
        return j5 == -9223372036854775807L ? System.currentTimeMillis() : SystemClock.elapsedRealtime() + j5;
    }

    public static int w(int i7) {
        if (i7 == 8) {
            return 3;
        }
        if (i7 == 16) {
            return 2;
        }
        if (i7 != 24) {
            return i7 != 32 ? 0 : 805306368;
        }
        return 536870912;
    }

    public static int x(int i7, int i10) {
        if (i7 != 2) {
            if (i7 == 3) {
                return i10;
            }
            if (i7 != 4) {
                if (i7 != 268435456) {
                    if (i7 == 536870912) {
                        return i10 * 3;
                    }
                    if (i7 != 805306368) {
                        throw new IllegalArgumentException();
                    }
                }
            }
            return i10 * 4;
        }
        return i10 * 2;
    }

    public static long y(long j5, float f2) {
        return f2 == 1.0f ? j5 : Math.round(j5 / ((double) f2));
    }

    public static String z(StringBuilder sb2, Formatter formatter, long j5) {
        if (j5 == -9223372036854775807L) {
            j5 = 0;
        }
        String str = j5 < 0 ? "-" : "";
        long jAbs = (Math.abs(j5) + 500) / 1000;
        long j7 = jAbs % 60;
        long j10 = (jAbs / 60) % 60;
        long j11 = jAbs / 3600;
        sb2.setLength(0);
        return j11 > 0 ? formatter.format("%s%d:%02d:%02d", str, Long.valueOf(j11), Long.valueOf(j10), Long.valueOf(j7)).toString() : formatter.format("%s%02d:%02d", str, Long.valueOf(j10), Long.valueOf(j7)).toString();
    }
}

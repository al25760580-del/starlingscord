package bd;

import a5.b0;
import android.media.MediaCodecInfo;
import android.util.Pair;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.misc.utilities.chat_view_types.ChatViewRecyclerTypes;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.google.android.exoplayer2.Format;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import je.e0;
import org.webrtc.PeerConnection;

/* JADX INFO: loaded from: classes3.dex */
public abstract class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f3221a = Pattern.compile("^\\D?(\\d+)$");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f3222b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f3223c = -1;

    public static void a(String str, ArrayList arrayList) {
        if ("audio/raw".equals(str)) {
            if (e0.f13788a < 26 && e0.f13789b.equals("R9") && arrayList.size() == 1 && ((o) arrayList.get(0)).f3172a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                arrayList.add(o.h("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, false));
            }
            Collections.sort(arrayList, new u(0, new t(2)));
        }
        int i7 = e0.f13788a;
        if (i7 < 21 && arrayList.size() > 1) {
            String str2 = ((o) arrayList.get(0)).f3172a;
            if ("OMX.SEC.mp3.dec".equals(str2) || "OMX.SEC.MP3.Decoder".equals(str2) || "OMX.brcm.audio.mp3.decoder".equals(str2)) {
                Collections.sort(arrayList, new u(0, new t(3)));
            }
        }
        if (i7 >= 32 || arrayList.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(((o) arrayList.get(0)).f3172a)) {
            return;
        }
        arrayList.add((o) arrayList.remove(0));
    }

    public static String b(Format format) {
        Pair pairD;
        if ("audio/eac3-joc".equals(format.I)) {
            return "audio/eac3";
        }
        if (!"video/dolby-vision".equals(format.I) || (pairD = d(format)) == null) {
            return null;
        }
        int iIntValue = ((Integer) pairD.first).intValue();
        if (iIntValue == 16 || iIntValue == 256) {
            return "video/hevc";
        }
        if (iIntValue == 512) {
            return "video/avc";
        }
        return null;
    }

    public static String c(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        }
        if (str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        }
        if (str2.equals("audio/flac") && "OMX.lge.flac.decoder".equals(str)) {
            return "audio/x-lg-flac";
        }
        if (str2.equals("audio/ac3") && "OMX.lge.ac3.decoder".equals(str)) {
            return "audio/lg-ac3";
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:102:0x0190  */
    /* JADX WARN: Code duplicated, block: B:103:0x0194  */
    /* JADX WARN: Code duplicated, block: B:106:0x019d  */
    /* JADX WARN: Code duplicated, block: B:107:0x019f  */
    /* JADX WARN: Code duplicated, block: B:110:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:111:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:114:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:115:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:118:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:119:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:122:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:123:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:126:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:127:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:130:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:131:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:134:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:137:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:138:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:139:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:140:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:141:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:142:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:143:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:144:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:145:0x0201  */
    /* JADX WARN: Code duplicated, block: B:146:0x0204  */
    /* JADX WARN: Code duplicated, block: B:147:0x0207  */
    /* JADX WARN: Code duplicated, block: B:148:0x020a  */
    /* JADX WARN: Code duplicated, block: B:150:0x020e  */
    /* JADX WARN: Code duplicated, block: B:152:0x0214  */
    /* JADX WARN: Code duplicated, block: B:156:0x022a  */
    /* JADX WARN: Code duplicated, block: B:21:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:277:0x0378 A[PHI: r2
      0x0378: PHI (r2v55 int) = (r2v54 int), (r2v57 int), (r2v58 int), (r2v59 int), (r2v60 int) binds: [B:258:0x0351, B:261:0x0357, B:263:0x035b, B:265:0x035f, B:267:0x0363] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:303:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:306:0x03df  */
    /* JADX WARN: Code duplicated, block: B:75:0x013b  */
    /* JADX WARN: Code duplicated, block: B:77:0x0141  */
    /* JADX WARN: Code duplicated, block: B:79:0x0145  */
    /* JADX WARN: Code duplicated, block: B:80:0x0149  */
    /* JADX WARN: Code duplicated, block: B:82:0x0150  */
    /* JADX WARN: Code duplicated, block: B:83:0x0153  */
    /* JADX WARN: Code duplicated, block: B:86:0x015c  */
    /* JADX WARN: Code duplicated, block: B:87:0x0160  */
    /* JADX WARN: Code duplicated, block: B:90:0x0169  */
    /* JADX WARN: Code duplicated, block: B:91:0x016d  */
    /* JADX WARN: Code duplicated, block: B:94:0x0176  */
    /* JADX WARN: Code duplicated, block: B:95:0x017a  */
    /* JADX WARN: Code duplicated, block: B:98:0x0183  */
    /* JADX WARN: Code duplicated, block: B:99:0x0187  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v165 */
    /* JADX WARN: Type inference failed for: r1v167 */
    /* JADX WARN: Type inference failed for: r1v169 */
    /* JADX WARN: Type inference failed for: r1v171 */
    /* JADX WARN: Type inference failed for: r1v174 */
    /* JADX WARN: Type inference failed for: r1v177 */
    /* JADX WARN: Type inference failed for: r1v180 */
    /* JADX WARN: Type inference failed for: r1v183 */
    /* JADX WARN: Type inference failed for: r1v186 */
    /* JADX WARN: Type inference failed for: r1v189 */
    /* JADX WARN: Type inference failed for: r1v192 */
    /* JADX WARN: Type inference failed for: r1v195 */
    /* JADX WARN: Type inference failed for: r1v198 */
    /* JADX WARN: Type inference failed for: r1v199 */
    /* JADX WARN: Type inference failed for: r1v200 */
    public static Pair d(Format format) {
        byte b10;
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z5;
        Integer num;
        String str;
        ?? r5;
        Integer numValueOf = Integer.valueOf(IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET);
        Integer numValueOf2 = Integer.valueOf(RecyclerView.ItemAnimator.FLAG_MOVED);
        Integer numValueOf3 = Integer.valueOf(RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT);
        Integer numValueOf4 = Integer.valueOf(IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING);
        Integer numValueOf5 = Integer.valueOf(IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER);
        Integer numValueOf6 = Integer.valueOf(IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
        String str2 = format.F;
        String str3 = format.F;
        if (str2 == null) {
            return null;
        }
        String[] strArrSplit = str2.split("\\.");
        boolean zEquals = "video/dolby-vision".equals(format.I);
        Pattern pattern = f3221a;
        if (zEquals) {
            if (strArrSplit.length < 3) {
                a3.e.y("Ignoring malformed Dolby Vision codec string: ", str3, "MediaCodecUtil");
                return null;
            }
            Matcher matcher = pattern.matcher(strArrSplit[1]);
            if (!matcher.matches()) {
                a3.e.y("Ignoring malformed Dolby Vision codec string: ", str3, "MediaCodecUtil");
                return null;
            }
            String strGroup = matcher.group(1);
            if (strGroup != null) {
                z5 = true;
                switch (strGroup) {
                    case "00":
                        num = 1;
                        break;
                    case "01":
                        num = 2;
                        break;
                    case "02":
                        num = 4;
                        break;
                    case "03":
                        num = 8;
                        break;
                    case "04":
                        num = 16;
                        break;
                    case "05":
                        num = 32;
                        break;
                    case "06":
                        num = 64;
                        break;
                    case "07":
                        num = numValueOf6;
                        break;
                    case "08":
                        num = numValueOf5;
                        break;
                    case "09":
                        num = numValueOf4;
                        break;
                }
                if (num == null) {
                    a3.e.y("Unknown Dolby Vision profile string: ", strGroup, "MediaCodecUtil");
                    return null;
                }
                str = strArrSplit[2];
                if (str == null) {
                    switch (str.hashCode()) {
                        case 1537:
                            if (str.equals("01")) {
                                r5 = -1;
                            } else {
                                r5 = 0;
                            }
                            break;
                        case 1538:
                            if (str.equals("02")) {
                                r5 = -1;
                            } else {
                                r5 = z5;
                            }
                            break;
                        case 1539:
                            if (str.equals("03")) {
                                r5 = -1;
                            } else {
                                r5 = 2;
                            }
                            break;
                        case 1540:
                            if (str.equals("04")) {
                                r5 = -1;
                            } else {
                                r5 = 3;
                            }
                            break;
                        case 1541:
                            if (str.equals("05")) {
                                r5 = -1;
                            } else {
                                r5 = 4;
                            }
                            break;
                        case 1542:
                            if (str.equals("06")) {
                                r5 = -1;
                            } else {
                                r5 = 5;
                            }
                            break;
                        case 1543:
                            if (str.equals("07")) {
                                r5 = -1;
                            } else {
                                r5 = 6;
                            }
                            break;
                        case 1544:
                            if (str.equals("08")) {
                                r5 = -1;
                            } else {
                                r5 = 7;
                            }
                            break;
                        case 1545:
                            if (str.equals("09")) {
                                r5 = -1;
                            } else {
                                r5 = 8;
                            }
                            break;
                        case 1567:
                            if (str.equals("10")) {
                                r5 = -1;
                            } else {
                                r5 = 9;
                            }
                            break;
                        case 1568:
                            if (str.equals("11")) {
                                r5 = -1;
                            } else {
                                r5 = 10;
                            }
                            break;
                        case 1569:
                            if (str.equals("12")) {
                                r5 = -1;
                            } else {
                                r5 = 11;
                            }
                            break;
                        case 1570:
                            if (str.equals("13")) {
                                r5 = -1;
                            } else {
                                r5 = 12;
                            }
                            break;
                        default:
                            r5 = -1;
                            break;
                    }
                    switch (r5) {
                        case 0:
                            numValueOf = 1;
                            break;
                        case 1:
                            numValueOf = 2;
                            break;
                        case 2:
                            numValueOf = 4;
                            break;
                        case 3:
                            numValueOf = 8;
                            break;
                        case 4:
                            numValueOf = 16;
                            break;
                        case 5:
                            numValueOf = 32;
                            break;
                        case 6:
                            numValueOf = 64;
                            break;
                        case 7:
                            numValueOf = numValueOf6;
                            break;
                        case 8:
                            numValueOf = numValueOf5;
                            break;
                        case 9:
                            numValueOf = numValueOf4;
                            break;
                        case 10:
                            break;
                        case 11:
                            numValueOf = numValueOf2;
                            break;
                        case 12:
                            numValueOf = numValueOf3;
                            break;
                        default:
                            numValueOf = null;
                            break;
                    }
                } else {
                    numValueOf = null;
                }
                if (numValueOf == null) {
                    return new Pair(num, numValueOf);
                }
                a3.e.y("Unknown Dolby Vision level string: ", str, "MediaCodecUtil");
                return null;
            }
            z5 = true;
            num = null;
            if (num == null) {
                a3.e.y("Unknown Dolby Vision profile string: ", strGroup, "MediaCodecUtil");
                return null;
            }
            str = strArrSplit[2];
            if (str == null) {
                switch (str.hashCode()) {
                    case 1537:
                        if (str.equals("01")) {
                            r5 = 0;
                        } else {
                            r5 = -1;
                        }
                        break;
                    case 1538:
                        if (str.equals("02")) {
                            r5 = z5;
                        } else {
                            r5 = -1;
                        }
                        break;
                    case 1539:
                        if (str.equals("03")) {
                            r5 = 2;
                        } else {
                            r5 = -1;
                        }
                        break;
                    case 1540:
                        if (str.equals("04")) {
                            r5 = 3;
                        } else {
                            r5 = -1;
                        }
                        break;
                    case 1541:
                        if (str.equals("05")) {
                            r5 = 4;
                        } else {
                            r5 = -1;
                        }
                        break;
                    case 1542:
                        if (str.equals("06")) {
                            r5 = 5;
                        } else {
                            r5 = -1;
                        }
                        break;
                    case 1543:
                        if (str.equals("07")) {
                            r5 = 6;
                        } else {
                            r5 = -1;
                        }
                        break;
                    case 1544:
                        if (str.equals("08")) {
                            r5 = 7;
                        } else {
                            r5 = -1;
                        }
                        break;
                    case 1545:
                        if (str.equals("09")) {
                            r5 = 8;
                        } else {
                            r5 = -1;
                        }
                        break;
                    case 1567:
                        if (str.equals("10")) {
                            r5 = 9;
                        } else {
                            r5 = -1;
                        }
                        break;
                    case 1568:
                        if (str.equals("11")) {
                            r5 = 10;
                        } else {
                            r5 = -1;
                        }
                        break;
                    case 1569:
                        if (str.equals("12")) {
                            r5 = 11;
                        } else {
                            r5 = -1;
                        }
                        break;
                    case 1570:
                        if (str.equals("13")) {
                            r5 = 12;
                        } else {
                            r5 = -1;
                        }
                        break;
                    default:
                        r5 = -1;
                        break;
                }
                switch (r5) {
                    case 0:
                        numValueOf = 1;
                        break;
                    case 1:
                        numValueOf = 2;
                        break;
                    case 2:
                        numValueOf = 4;
                        break;
                    case 3:
                        numValueOf = 8;
                        break;
                    case 4:
                        numValueOf = 16;
                        break;
                    case 5:
                        numValueOf = 32;
                        break;
                    case 6:
                        numValueOf = 64;
                        break;
                    case 7:
                        numValueOf = numValueOf6;
                        break;
                    case 8:
                        numValueOf = numValueOf5;
                        break;
                    case 9:
                        numValueOf = numValueOf4;
                        break;
                    case 10:
                        break;
                    case 11:
                        numValueOf = numValueOf2;
                        break;
                    case 12:
                        numValueOf = numValueOf3;
                        break;
                    default:
                        numValueOf = null;
                        break;
                }
            } else {
                numValueOf = null;
            }
            if (numValueOf == null) {
                return new Pair(num, numValueOf);
            }
            a3.e.y("Unknown Dolby Vision level string: ", str, "MediaCodecUtil");
            return null;
        }
        String str4 = strArrSplit[0];
        str4.getClass();
        switch (str4) {
            case "av01":
                b10 = 0;
                break;
            case "avc1":
                b10 = 1;
                break;
            case "avc2":
                b10 = 2;
                break;
            case "hev1":
                b10 = 3;
                break;
            case "hvc1":
                b10 = 4;
                break;
            case "mp4a":
                b10 = 5;
                break;
            case "vp09":
                b10 = 6;
                break;
            default:
                b10 = -1;
                break;
        }
        int i18 = 20;
        switch (b10) {
            case 0:
                ke.b bVar = format.U;
                if (strArrSplit.length < 4) {
                    a3.e.y("Ignoring malformed AV1 codec string: ", str3, "MediaCodecUtil");
                    return null;
                }
                try {
                    int i19 = Integer.parseInt(strArrSplit[1]);
                    int i20 = Integer.parseInt(strArrSplit[2].substring(0, 2));
                    int i21 = Integer.parseInt(strArrSplit[3]);
                    if (i19 != 0) {
                        com.discord.chat.presentation.list.a.q(i19, "Unknown AV1 profile: ", "MediaCodecUtil");
                        return null;
                    }
                    int i22 = 8;
                    if (i21 != 8 && i21 != 10) {
                        com.discord.chat.presentation.list.a.q(i21, "Unknown AV1 bit depth: ", "MediaCodecUtil");
                        return null;
                    }
                    int i23 = i21 == 8 ? 1 : (bVar == null || !(bVar.f14330v != null || (i7 = bVar.f14329i) == 7 || i7 == 6)) ? 2 : RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT;
                    switch (i20) {
                        case 0:
                            i22 = 1;
                            break;
                        case 1:
                            i22 = 2;
                            break;
                        case 2:
                            i22 = 4;
                            break;
                        case 3:
                            break;
                        case 4:
                            i22 = 16;
                            break;
                        case 5:
                            i22 = 32;
                            break;
                        case 6:
                            i22 = 64;
                            break;
                        case 7:
                            i22 = IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                            break;
                        case 8:
                            i22 = IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                            break;
                        case 9:
                            i22 = IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                            break;
                        case 10:
                            i22 = IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
                            break;
                        case 11:
                            i22 = RecyclerView.ItemAnimator.FLAG_MOVED;
                            break;
                        case 12:
                            i22 = RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT;
                            break;
                        case 13:
                            i22 = 8192;
                            break;
                        case 14:
                            i22 = 16384;
                            break;
                        case 15:
                            i22 = 32768;
                            break;
                        case 16:
                            i22 = 65536;
                            break;
                        case 17:
                            i22 = 131072;
                            break;
                        case 18:
                            i22 = 262144;
                            break;
                        case 19:
                            i22 = 524288;
                            break;
                        case 20:
                            i22 = 1048576;
                            break;
                        case 21:
                            i22 = 2097152;
                            break;
                        case 22:
                            i22 = 4194304;
                            break;
                        case 23:
                            i22 = 8388608;
                            break;
                        default:
                            i22 = -1;
                            break;
                    }
                    if (i22 != -1) {
                        return new Pair(Integer.valueOf(i23), Integer.valueOf(i22));
                    }
                    com.discord.chat.presentation.list.a.q(i20, "Unknown AV1 level: ", "MediaCodecUtil");
                    return null;
                } catch (NumberFormatException unused) {
                    a3.e.y("Ignoring malformed AV1 codec string: ", str3, "MediaCodecUtil");
                    return null;
                }
            case 1:
            case 2:
                if (strArrSplit.length < 2) {
                    a3.e.y("Ignoring malformed AVC codec string: ", str3, "MediaCodecUtil");
                    return null;
                }
                try {
                    if (strArrSplit[1].length() == 6) {
                        i10 = 16;
                        i11 = Integer.parseInt(strArrSplit[1].substring(0, 2), 16);
                        i12 = Integer.parseInt(strArrSplit[1].substring(4), 16);
                    } else {
                        i10 = 16;
                        if (strArrSplit.length < 3) {
                            je.b.N("MediaCodecUtil", "Ignoring malformed AVC codec string: " + str3);
                            return null;
                        }
                        i11 = Integer.parseInt(strArrSplit[1]);
                        i12 = Integer.parseInt(strArrSplit[2]);
                    }
                    if (i11 == 66) {
                        i13 = -1;
                        i14 = 1;
                    } else if (i11 == 77) {
                        i13 = -1;
                        i14 = 2;
                    } else if (i11 == 88) {
                        i13 = -1;
                        i14 = 4;
                    } else if (i11 == 100) {
                        i13 = -1;
                        i14 = 8;
                    } else if (i11 == 110) {
                        i14 = i10;
                        i13 = -1;
                    } else if (i11 == 122) {
                        i13 = -1;
                        i14 = 32;
                    } else if (i11 != 244) {
                        i13 = -1;
                        i14 = -1;
                    } else {
                        i13 = -1;
                        i14 = 64;
                    }
                    if (i14 == i13) {
                        com.discord.chat.presentation.list.a.q(i11, "Unknown AVC profile: ", "MediaCodecUtil");
                        return null;
                    }
                    switch (i12) {
                        case 10:
                            i10 = 1;
                            break;
                        case 11:
                            i10 = 4;
                            break;
                        case 12:
                            i10 = 8;
                            break;
                        case 13:
                            break;
                        default:
                            switch (i12) {
                                case 20:
                                    i10 = 32;
                                    break;
                                case 21:
                                    i10 = 64;
                                    break;
                                case 22:
                                    i10 = IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                                    break;
                                default:
                                    switch (i12) {
                                        case 30:
                                            i10 = IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                                            break;
                                        case 31:
                                            i10 = IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                                            break;
                                        case 32:
                                            i10 = IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
                                            break;
                                        default:
                                            switch (i12) {
                                                case 40:
                                                    i10 = RecyclerView.ItemAnimator.FLAG_MOVED;
                                                    break;
                                                case 41:
                                                    i10 = RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT;
                                                    break;
                                                case 42:
                                                    i10 = 8192;
                                                    break;
                                                default:
                                                    switch (i12) {
                                                        case 50:
                                                            i10 = 16384;
                                                            break;
                                                        case ChatViewRecyclerTypes.MEDIA_ATTACHMENT_MOSAIC_VISUAL_PLACEHOLDER /* 51 */:
                                                            i10 = 32768;
                                                            break;
                                                        case ChatViewRecyclerTypes.REFERRAL /* 52 */:
                                                            i10 = 65536;
                                                            break;
                                                        default:
                                                            i10 = -1;
                                                            break;
                                                    }
                                                    break;
                                            }
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    if (i10 != -1) {
                        return new Pair(Integer.valueOf(i14), Integer.valueOf(i10));
                    }
                    com.discord.chat.presentation.list.a.q(i12, "Unknown AVC level: ", "MediaCodecUtil");
                    return null;
                } catch (NumberFormatException unused2) {
                    a3.e.y("Ignoring malformed AVC codec string: ", str3, "MediaCodecUtil");
                    return null;
                }
            case 3:
            case 4:
                ke.b bVar2 = format.U;
                if (strArrSplit.length < 4) {
                    a3.e.y("Ignoring malformed HEVC codec string: ", str3, "MediaCodecUtil");
                    return null;
                }
                Matcher matcher2 = pattern.matcher(strArrSplit[1]);
                if (!matcher2.matches()) {
                    a3.e.y("Ignoring malformed HEVC codec string: ", str3, "MediaCodecUtil");
                    return null;
                }
                String strGroup2 = matcher2.group(1);
                if ("1".equals(strGroup2)) {
                    i15 = 1;
                } else {
                    if (!"2".equals(strGroup2)) {
                        a3.e.y("Unknown HEVC profile string: ", strGroup2, "MediaCodecUtil");
                        return null;
                    }
                    i15 = (bVar2 == null || bVar2.f14329i != 6) ? 2 : RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT;
                }
                String str5 = strArrSplit[3];
                if (str5 != null) {
                    switch (str5) {
                        case "H30":
                            numValueOf = 2;
                            break;
                        case "H60":
                            numValueOf = 8;
                            break;
                        case "H63":
                            numValueOf = 32;
                            break;
                        case "H90":
                            numValueOf = numValueOf6;
                            break;
                        case "H93":
                            numValueOf = numValueOf4;
                            break;
                        case "L30":
                            numValueOf = 1;
                            break;
                        case "L60":
                            numValueOf = 4;
                            break;
                        case "L63":
                            numValueOf = 16;
                            break;
                        case "L90":
                            numValueOf = 64;
                            break;
                        case "L93":
                            numValueOf = numValueOf5;
                            break;
                        case "H120":
                            numValueOf = numValueOf2;
                            break;
                        case "H123":
                            numValueOf = 8192;
                            break;
                        case "H150":
                            numValueOf = Integer.valueOf(PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS);
                            break;
                        case "H153":
                            numValueOf = 131072;
                            break;
                        case "H156":
                            numValueOf = 524288;
                            break;
                        case "H180":
                            numValueOf = 2097152;
                            break;
                        case "H183":
                            numValueOf = 8388608;
                            break;
                        case "H186":
                            numValueOf = 33554432;
                            break;
                        case "L120":
                            break;
                        case "L123":
                            numValueOf = numValueOf3;
                            break;
                        case "L150":
                            numValueOf = 16384;
                            break;
                        case "L153":
                            numValueOf = 65536;
                            break;
                        case "L156":
                            numValueOf = 262144;
                            break;
                        case "L180":
                            numValueOf = 1048576;
                            break;
                        case "L183":
                            numValueOf = 4194304;
                            break;
                        case "L186":
                            numValueOf = Integer.valueOf(PointerEventHelper.X_FLAG_SUPPORTS_HOVER);
                            break;
                        default:
                            numValueOf = null;
                            break;
                    }
                } else {
                    numValueOf = null;
                }
                if (numValueOf != null) {
                    return new Pair(Integer.valueOf(i15), numValueOf);
                }
                a3.e.y("Unknown HEVC level string: ", str5, "MediaCodecUtil");
                return null;
            case 5:
                if (strArrSplit.length != 3) {
                    a3.e.y("Ignoring malformed MP4A codec string: ", str3, "MediaCodecUtil");
                    return null;
                }
                try {
                    if ("audio/mp4a-latm".equals(je.o.e(Integer.parseInt(strArrSplit[1], 16)))) {
                        int i24 = Integer.parseInt(strArrSplit[2]);
                        int i25 = 17;
                        if (i24 == 17) {
                            i18 = i25;
                        } else if (i24 != 20) {
                            i25 = 23;
                            if (i24 != 23) {
                                i25 = 29;
                                if (i24 != 29) {
                                    i25 = 39;
                                    if (i24 != 39) {
                                        i25 = 42;
                                        if (i24 != 42) {
                                            switch (i24) {
                                                case 1:
                                                    i18 = 1;
                                                    break;
                                                case 2:
                                                    i18 = 2;
                                                    break;
                                                case 3:
                                                    i18 = 3;
                                                    break;
                                                case 4:
                                                    i18 = 4;
                                                    break;
                                                case 5:
                                                    i18 = 5;
                                                    break;
                                                case 6:
                                                    i18 = 6;
                                                    break;
                                                default:
                                                    i18 = -1;
                                                    break;
                                            }
                                        } else {
                                            i18 = i25;
                                        }
                                    } else {
                                        i18 = i25;
                                    }
                                } else {
                                    i18 = i25;
                                }
                            } else {
                                i18 = i25;
                            }
                        }
                        if (i18 != -1) {
                            return new Pair(Integer.valueOf(i18), 0);
                        }
                    }
                } catch (NumberFormatException unused3) {
                    a3.e.y("Ignoring malformed MP4A codec string: ", str3, "MediaCodecUtil");
                }
                return null;
            case 6:
                if (strArrSplit.length < 3) {
                    a3.e.y("Ignoring malformed VP9 codec string: ", str3, "MediaCodecUtil");
                    return null;
                }
                try {
                    int i26 = Integer.parseInt(strArrSplit[1]);
                    int i27 = Integer.parseInt(strArrSplit[2]);
                    if (i26 == 0) {
                        i16 = 1;
                    } else if (i26 == 1) {
                        i16 = 2;
                    } else if (i26 != 2) {
                        i16 = i26 != 3 ? -1 : 8;
                    } else {
                        i16 = 4;
                    }
                    if (i16 == -1) {
                        com.discord.chat.presentation.list.a.q(i26, "Unknown VP9 profile: ", "MediaCodecUtil");
                        return null;
                    }
                    if (i27 == 10) {
                        i17 = 1;
                    } else if (i27 == 11) {
                        i17 = 2;
                    } else if (i27 == 20) {
                        i17 = 4;
                    } else if (i27 == 21) {
                        i17 = 8;
                    } else if (i27 == 30) {
                        i17 = 16;
                    } else if (i27 == 31) {
                        i17 = 32;
                    } else if (i27 == 40) {
                        i17 = 64;
                    } else if (i27 == 41) {
                        i17 = IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                    } else if (i27 == 50) {
                        i17 = IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                    } else if (i27 != 51) {
                        switch (i27) {
                            case ChatViewRecyclerTypes.GIFT_INTENT /* 60 */:
                                i17 = RecyclerView.ItemAnimator.FLAG_MOVED;
                                break;
                            case 61:
                                i17 = RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT;
                                break;
                            case 62:
                                i17 = 8192;
                                break;
                            default:
                                i17 = -1;
                                break;
                        }
                    } else {
                        i17 = IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                    }
                    if (i17 != -1) {
                        return new Pair(Integer.valueOf(i16), Integer.valueOf(i17));
                    }
                    com.discord.chat.presentation.list.a.q(i27, "Unknown VP9 level: ", "MediaCodecUtil");
                    return null;
                } catch (NumberFormatException unused4) {
                    a3.e.y("Ignoring malformed VP9 codec string: ", str3, "MediaCodecUtil");
                    return null;
                }
            default:
                return null;
        }
    }

    public static synchronized List e(String str, boolean z5, boolean z6) {
        try {
            v vVar = new v(str, z5, z6);
            HashMap map = f3222b;
            List list = (List) map.get(vVar);
            if (list != null) {
                return list;
            }
            int i7 = e0.f13788a;
            ArrayList arrayListF = f(vVar, i7 >= 21 ? new b0(z5, z6) : new i8.c(3));
            if (z5 && arrayListF.isEmpty() && 21 <= i7 && i7 <= 23) {
                arrayListF = f(vVar, new i8.c(3));
                if (!arrayListF.isEmpty()) {
                    je.b.N("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((o) arrayListF.get(0)).f3172a);
                }
            }
            a(str, arrayListF);
            ei.e0 e0VarK = ei.e0.k(arrayListF);
            map.put(vVar, e0VarK);
            return e0VarK;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static ArrayList f(v vVar, x xVar) throws w {
        String strC;
        String str;
        String str2;
        v vVar2 = vVar;
        boolean z5 = vVar2.f3219b;
        try {
            ArrayList arrayList = new ArrayList();
            String str3 = vVar2.f3218a;
            int iJ = xVar.j();
            boolean zM = xVar.m();
            int i7 = 0;
            while (i7 < iJ) {
                MediaCodecInfo mediaCodecInfoB = xVar.b(i7);
                int i10 = e0.f13788a;
                if (i10 < 29 || !mediaCodecInfoB.isAlias()) {
                    String name = mediaCodecInfoB.getName();
                    if (g(mediaCodecInfoB, name, zM, str3) && (strC = c(mediaCodecInfoB, name, str3)) != null) {
                        try {
                            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfoB.getCapabilitiesForType(strC);
                            boolean zD = xVar.d("tunneled-playback", strC, capabilitiesForType);
                            boolean zH = xVar.h("tunneled-playback", capabilitiesForType);
                            boolean z6 = vVar2.f3220c;
                            if ((z6 || !zH) && (!z6 || zD)) {
                                boolean zD2 = xVar.d("secure-playback", strC, capabilitiesForType);
                                boolean zH2 = xVar.h("secure-playback", capabilitiesForType);
                                if ((z5 || !zH2) && (!z5 || zD2)) {
                                    boolean zIsHardwareAccelerated = i10 >= 29 ? mediaCodecInfoB.isHardwareAccelerated() : !h(mediaCodecInfoB, str3);
                                    h(mediaCodecInfoB, str3);
                                    if (i10 >= 29) {
                                        mediaCodecInfoB.isVendor();
                                    } else {
                                        String strT = m3.m.T(mediaCodecInfoB.getName());
                                        if (!strT.startsWith("omx.google.") && !strT.startsWith("c2.android.")) {
                                            strT.startsWith("c2.google.");
                                        }
                                    }
                                    if (!(zM && z5 == zD2) && (zM || z5)) {
                                        boolean z7 = zIsHardwareAccelerated;
                                        str2 = name;
                                        if (!zM && zD2) {
                                            str = strC;
                                            try {
                                                arrayList.add(o.h(str2 + ".secure", str3, str, capabilitiesForType, z7, true));
                                                break;
                                            } catch (Exception e10) {
                                                e = e10;
                                                if (e0.f13788a <= 23 || arrayList.isEmpty()) {
                                                    je.b.r("MediaCodecUtil", "Failed to query codec " + str2 + " (" + str + ")");
                                                    throw e;
                                                }
                                                je.b.r("MediaCodecUtil", "Skipping codec " + str2 + " (failed to query capabilities)");
                                                i7++;
                                                vVar2 = vVar;
                                            }
                                        }
                                    } else {
                                        str = strC;
                                        try {
                                            o oVarH = o.h(name, str3, str, capabilitiesForType, zIsHardwareAccelerated, false);
                                            str2 = name;
                                            try {
                                                arrayList.add(oVarH);
                                            } catch (Exception e11) {
                                                e = e11;
                                                str = str;
                                                if (e0.f13788a <= 23) {
                                                }
                                                je.b.r("MediaCodecUtil", "Failed to query codec " + str2 + " (" + str + ")");
                                                throw e;
                                            }
                                        } catch (Exception e12) {
                                            e = e12;
                                            str2 = name;
                                        }
                                    }
                                }
                            }
                        } catch (Exception e13) {
                            e = e13;
                            str = strC;
                            str2 = name;
                        }
                    }
                }
                i7++;
                vVar2 = vVar;
            }
            return arrayList;
        } catch (Exception e14) {
            throw new w("Failed to query underlying media codecs", e14);
        }
    }

    public static boolean g(MediaCodecInfo mediaCodecInfo, String str, boolean z5, String str2) {
        if (mediaCodecInfo.isEncoder()) {
            return false;
        }
        if (!z5 && str.endsWith(".secure")) {
            return false;
        }
        int i7 = e0.f13788a;
        if (i7 < 21 && ("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
            return false;
        }
        if (i7 < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(str)) {
            String str3 = e0.f13789b;
            if ("a70".equals(str3)) {
                return false;
            }
            if ("Xiaomi".equals(e0.f13790c) && str3.startsWith("HM")) {
                return false;
            }
        }
        if (i7 == 16 && "OMX.qcom.audio.decoder.mp3".equals(str)) {
            String str4 = e0.f13789b;
            if ("dlxu".equals(str4) || "protou".equals(str4) || "ville".equals(str4) || "villeplus".equals(str4) || "villec2".equals(str4) || str4.startsWith("gee") || "C6602".equals(str4) || "C6603".equals(str4) || "C6606".equals(str4) || "C6616".equals(str4) || "L36h".equals(str4) || "SO-02E".equals(str4)) {
                return false;
            }
        }
        if (i7 == 16 && "OMX.qcom.audio.decoder.aac".equals(str)) {
            String str5 = e0.f13789b;
            if ("C1504".equals(str5) || "C1505".equals(str5) || "C1604".equals(str5) || "C1605".equals(str5)) {
                return false;
            }
        }
        if (i7 < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(e0.f13790c))) {
            String str6 = e0.f13789b;
            if (str6.startsWith("zeroflte") || str6.startsWith("zerolte") || str6.startsWith("zenlte") || "SC-05G".equals(str6) || "marinelteatt".equals(str6) || "404SC".equals(str6) || "SC-04G".equals(str6) || "SCV31".equals(str6)) {
                return false;
            }
        }
        if (i7 <= 19 && "OMX.SEC.vp8.dec".equals(str) && "samsung".equals(e0.f13790c)) {
            String str7 = e0.f13789b;
            if (str7.startsWith("d2") || str7.startsWith("serrano") || str7.startsWith("jflte") || str7.startsWith("santos") || str7.startsWith("t0")) {
                return false;
            }
        }
        if (i7 <= 19 && e0.f13789b.startsWith("jflte") && "OMX.qcom.video.decoder.vp8".equals(str)) {
            return false;
        }
        return (i7 <= 23 && "audio/eac3-joc".equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) ? false : true;
    }

    public static boolean h(MediaCodecInfo mediaCodecInfo, String str) {
        if (e0.f13788a >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (je.o.j(str)) {
            return true;
        }
        String strT = m3.m.T(mediaCodecInfo.getName());
        if (strT.startsWith("arc.")) {
            return false;
        }
        if (strT.startsWith("omx.google.") || strT.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((strT.startsWith("omx.sec.") && strT.contains(".sw.")) || strT.equals("omx.qcom.video.decoder.hevcswvdec") || strT.startsWith("c2.android.") || strT.startsWith("c2.google.")) {
            return true;
        }
        return (strT.startsWith("omx.") || strT.startsWith("c2.")) ? false : true;
    }

    public static int i() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        int i7;
        if (f3223c == -1) {
            int iMax = 0;
            List listE = e("video/avc", false, false);
            o oVar = listE.isEmpty() ? null : (o) listE.get(0);
            if (oVar != null) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = oVar.f3175d;
                if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                }
                int length = codecProfileLevelArr.length;
                int iMax2 = 0;
                while (iMax < length) {
                    int i10 = codecProfileLevelArr[iMax].level;
                    if (i10 != 1 && i10 != 2) {
                        switch (i10) {
                            case 8:
                            case 16:
                            case 32:
                                i7 = 101376;
                                break;
                            case 64:
                                i7 = 202752;
                                break;
                            case IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT /* 128 */:
                            case IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER /* 256 */:
                                i7 = 414720;
                                break;
                            case IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING /* 512 */:
                                i7 = 921600;
                                break;
                            case IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET /* 1024 */:
                                i7 = 1310720;
                                break;
                            case RecyclerView.ItemAnimator.FLAG_MOVED /* 2048 */:
                            case RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT /* 4096 */:
                                i7 = 2097152;
                                break;
                            case 8192:
                                i7 = 2228224;
                                break;
                            case 16384:
                                i7 = 5652480;
                                break;
                            case PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS /* 32768 */:
                            case 65536:
                                i7 = 9437184;
                                break;
                            case 131072:
                            case 262144:
                            case 524288:
                                i7 = 35651584;
                                break;
                            default:
                                i7 = -1;
                                break;
                        }
                    } else {
                        i7 = 25344;
                    }
                    iMax2 = Math.max(i7, iMax2);
                    iMax++;
                }
                iMax = Math.max(iMax2, e0.f13788a >= 21 ? 345600 : 172800);
            }
            f3223c = iMax;
        }
        return f3223c;
    }
}

package bd;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.Surface;
import androidx.recyclerview.widget.h0;
import com.discord.chat.presentation.message.view.MediaImageViewKt;
import com.discord.media.engine.MediaEngine;
import com.discord.misc.utilities.chat_view_types.ChatViewRecyclerTypes;
import com.facebook.imageutils.JfifUtil;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.swmansion.reanimated.BuildConfig;
import ei.r0;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import je.e0;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3132d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f3133e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f3134i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Object f3135v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Object f3136w;

    /* JADX WARN: Code duplicated, block: B:13:0x002a  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public c(Context context) {
        String strV;
        int[] iArr;
        TelephonyManager telephonyManager;
        this.f3134i = context == null ? null : context.getApplicationContext();
        int i7 = e0.f13788a;
        if (context == null || (telephonyManager = (TelephonyManager) context.getSystemService("phone")) == null) {
            strV = m3.m.V(Locale.getDefault().getCountry());
        } else {
            String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (TextUtils.isEmpty(networkCountryIso)) {
                strV = m3.m.V(Locale.getDefault().getCountry());
            } else {
                strV = m3.m.V(networkCountryIso);
            }
        }
        r0 r0Var = he.s.f10680n;
        strV.getClass();
        byte b10 = -1;
        switch (strV.hashCode()) {
            case 2083:
                if (strV.equals("AD")) {
                    b10 = 0;
                }
                break;
            case 2084:
                if (strV.equals("AE")) {
                    b10 = 1;
                }
                break;
            case 2085:
                if (strV.equals("AF")) {
                    b10 = 2;
                }
                break;
            case 2086:
                if (strV.equals("AG")) {
                    b10 = 3;
                }
                break;
            case 2088:
                if (strV.equals("AI")) {
                    b10 = 4;
                }
                break;
            case 2091:
                if (strV.equals("AL")) {
                    b10 = 5;
                }
                break;
            case 2092:
                if (strV.equals("AM")) {
                    b10 = 6;
                }
                break;
            case 2094:
                if (strV.equals("AO")) {
                    b10 = 7;
                }
                break;
            case 2096:
                if (strV.equals("AQ")) {
                    b10 = 8;
                }
                break;
            case 2098:
                if (strV.equals("AS")) {
                    b10 = 9;
                }
                break;
            case 2099:
                if (strV.equals("AT")) {
                    b10 = 10;
                }
                break;
            case 2100:
                if (strV.equals("AU")) {
                    b10 = 11;
                }
                break;
            case 2102:
                if (strV.equals("AW")) {
                    b10 = 12;
                }
                break;
            case 2103:
                if (strV.equals("AX")) {
                    b10 = 13;
                }
                break;
            case 2105:
                if (strV.equals("AZ")) {
                    b10 = 14;
                }
                break;
            case 2111:
                if (strV.equals("BA")) {
                    b10 = 15;
                }
                break;
            case 2112:
                if (strV.equals("BB")) {
                    b10 = 16;
                }
                break;
            case 2114:
                if (strV.equals("BD")) {
                    b10 = 17;
                }
                break;
            case 2115:
                if (strV.equals("BE")) {
                    b10 = 18;
                }
                break;
            case 2116:
                if (strV.equals("BF")) {
                    b10 = 19;
                }
                break;
            case 2117:
                if (strV.equals("BG")) {
                    b10 = 20;
                }
                break;
            case 2118:
                if (strV.equals("BH")) {
                    b10 = 21;
                }
                break;
            case 2119:
                if (strV.equals("BI")) {
                    b10 = 22;
                }
                break;
            case 2120:
                if (strV.equals("BJ")) {
                    b10 = 23;
                }
                break;
            case 2122:
                if (strV.equals("BL")) {
                    b10 = 24;
                }
                break;
            case 2123:
                if (strV.equals("BM")) {
                    b10 = 25;
                }
                break;
            case 2124:
                if (strV.equals("BN")) {
                    b10 = 26;
                }
                break;
            case 2125:
                if (strV.equals("BO")) {
                    b10 = 27;
                }
                break;
            case 2127:
                if (strV.equals("BQ")) {
                    b10 = 28;
                }
                break;
            case 2128:
                if (strV.equals("BR")) {
                    b10 = 29;
                }
                break;
            case 2129:
                if (strV.equals("BS")) {
                    b10 = 30;
                }
                break;
            case 2130:
                if (strV.equals("BT")) {
                    b10 = 31;
                }
                break;
            case 2133:
                if (strV.equals("BW")) {
                    b10 = 32;
                }
                break;
            case 2135:
                if (strV.equals("BY")) {
                    b10 = 33;
                }
                break;
            case 2136:
                if (strV.equals("BZ")) {
                    b10 = 34;
                }
                break;
            case 2142:
                if (strV.equals("CA")) {
                    b10 = 35;
                }
                break;
            case 2145:
                if (strV.equals("CD")) {
                    b10 = 36;
                }
                break;
            case 2147:
                if (strV.equals("CF")) {
                    b10 = 37;
                }
                break;
            case 2148:
                if (strV.equals("CG")) {
                    b10 = 38;
                }
                break;
            case 2149:
                if (strV.equals("CH")) {
                    b10 = 39;
                }
                break;
            case 2150:
                if (strV.equals("CI")) {
                    b10 = 40;
                }
                break;
            case 2152:
                if (strV.equals("CK")) {
                    b10 = 41;
                }
                break;
            case 2153:
                if (strV.equals("CL")) {
                    b10 = 42;
                }
                break;
            case 2154:
                if (strV.equals("CM")) {
                    b10 = 43;
                }
                break;
            case 2155:
                if (strV.equals("CN")) {
                    b10 = 44;
                }
                break;
            case 2156:
                if (strV.equals("CO")) {
                    b10 = 45;
                }
                break;
            case 2159:
                if (strV.equals("CR")) {
                    b10 = 46;
                }
                break;
            case 2162:
                if (strV.equals("CU")) {
                    b10 = 47;
                }
                break;
            case 2163:
                if (strV.equals("CV")) {
                    b10 = 48;
                }
                break;
            case 2164:
                if (strV.equals("CW")) {
                    b10 = 49;
                }
                break;
            case 2165:
                if (strV.equals("CX")) {
                    b10 = 50;
                }
                break;
            case 2166:
                if (strV.equals("CY")) {
                    b10 = 51;
                }
                break;
            case 2167:
                if (strV.equals("CZ")) {
                    b10 = 52;
                }
                break;
            case 2177:
                if (strV.equals("DE")) {
                    b10 = 53;
                }
                break;
            case 2182:
                if (strV.equals("DJ")) {
                    b10 = 54;
                }
                break;
            case 2183:
                if (strV.equals("DK")) {
                    b10 = 55;
                }
                break;
            case 2185:
                if (strV.equals("DM")) {
                    b10 = 56;
                }
                break;
            case 2187:
                if (strV.equals("DO")) {
                    b10 = 57;
                }
                break;
            case 2198:
                if (strV.equals("DZ")) {
                    b10 = 58;
                }
                break;
            case 2206:
                if (strV.equals("EC")) {
                    b10 = 59;
                }
                break;
            case 2208:
                if (strV.equals("EE")) {
                    b10 = 60;
                }
                break;
            case 2210:
                if (strV.equals("EG")) {
                    b10 = 61;
                }
                break;
            case 2221:
                if (strV.equals("ER")) {
                    b10 = 62;
                }
                break;
            case 2222:
                if (strV.equals("ES")) {
                    b10 = 63;
                }
                break;
            case 2223:
                if (strV.equals("ET")) {
                    b10 = 64;
                }
                break;
            case 2243:
                if (strV.equals("FI")) {
                    b10 = 65;
                }
                break;
            case 2244:
                if (strV.equals("FJ")) {
                    b10 = 66;
                }
                break;
            case 2247:
                if (strV.equals("FM")) {
                    b10 = 67;
                }
                break;
            case 2249:
                if (strV.equals("FO")) {
                    b10 = 68;
                }
                break;
            case 2252:
                if (strV.equals("FR")) {
                    b10 = 69;
                }
                break;
            case 2266:
                if (strV.equals("GA")) {
                    b10 = 70;
                }
                break;
            case 2267:
                if (strV.equals("GB")) {
                    b10 = 71;
                }
                break;
            case 2269:
                if (strV.equals("GD")) {
                    b10 = 72;
                }
                break;
            case 2270:
                if (strV.equals("GE")) {
                    b10 = 73;
                }
                break;
            case 2271:
                if (strV.equals("GF")) {
                    b10 = 74;
                }
                break;
            case 2272:
                if (strV.equals("GG")) {
                    b10 = 75;
                }
                break;
            case 2273:
                if (strV.equals("GH")) {
                    b10 = 76;
                }
                break;
            case 2274:
                if (strV.equals("GI")) {
                    b10 = 77;
                }
                break;
            case 2277:
                if (strV.equals("GL")) {
                    b10 = 78;
                }
                break;
            case 2278:
                if (strV.equals("GM")) {
                    b10 = 79;
                }
                break;
            case 2279:
                if (strV.equals("GN")) {
                    b10 = 80;
                }
                break;
            case 2281:
                if (strV.equals("GP")) {
                    b10 = 81;
                }
                break;
            case 2282:
                if (strV.equals("GQ")) {
                    b10 = 82;
                }
                break;
            case 2283:
                if (strV.equals("GR")) {
                    b10 = 83;
                }
                break;
            case 2285:
                if (strV.equals("GT")) {
                    b10 = 84;
                }
                break;
            case 2286:
                if (strV.equals("GU")) {
                    b10 = 85;
                }
                break;
            case 2288:
                if (strV.equals("GW")) {
                    b10 = 86;
                }
                break;
            case 2290:
                if (strV.equals("GY")) {
                    b10 = 87;
                }
                break;
            case 2307:
                if (strV.equals("HK")) {
                    b10 = 88;
                }
                break;
            case 2310:
                if (strV.equals("HN")) {
                    b10 = 89;
                }
                break;
            case 2314:
                if (strV.equals("HR")) {
                    b10 = 90;
                }
                break;
            case 2316:
                if (strV.equals("HT")) {
                    b10 = 91;
                }
                break;
            case 2317:
                if (strV.equals("HU")) {
                    b10 = 92;
                }
                break;
            case 2331:
                if (strV.equals("ID")) {
                    b10 = 93;
                }
                break;
            case 2332:
                if (strV.equals("IE")) {
                    b10 = 94;
                }
                break;
            case 2339:
                if (strV.equals("IL")) {
                    b10 = 95;
                }
                break;
            case 2340:
                if (strV.equals("IM")) {
                    b10 = 96;
                }
                break;
            case 2341:
                if (strV.equals("IN")) {
                    b10 = 97;
                }
                break;
            case 2342:
                if (strV.equals("IO")) {
                    b10 = 98;
                }
                break;
            case 2344:
                if (strV.equals("IQ")) {
                    b10 = 99;
                }
                break;
            case 2345:
                if (strV.equals("IR")) {
                    b10 = 100;
                }
                break;
            case 2346:
                if (strV.equals("IS")) {
                    b10 = 101;
                }
                break;
            case 2347:
                if (strV.equals("IT")) {
                    b10 = 102;
                }
                break;
            case 2363:
                if (strV.equals("JE")) {
                    b10 = 103;
                }
                break;
            case 2371:
                if (strV.equals("JM")) {
                    b10 = 104;
                }
                break;
            case 2373:
                if (strV.equals("JO")) {
                    b10 = 105;
                }
                break;
            case 2374:
                if (strV.equals("JP")) {
                    b10 = 106;
                }
                break;
            case 2394:
                if (strV.equals("KE")) {
                    b10 = 107;
                }
                break;
            case 2396:
                if (strV.equals("KG")) {
                    b10 = 108;
                }
                break;
            case 2397:
                if (strV.equals("KH")) {
                    b10 = 109;
                }
                break;
            case 2398:
                if (strV.equals("KI")) {
                    b10 = 110;
                }
                break;
            case 2402:
                if (strV.equals("KM")) {
                    b10 = 111;
                }
                break;
            case 2403:
                if (strV.equals("KN")) {
                    b10 = 112;
                }
                break;
            case 2407:
                if (strV.equals("KR")) {
                    b10 = 113;
                }
                break;
            case 2412:
                if (strV.equals("KW")) {
                    b10 = 114;
                }
                break;
            case 2414:
                if (strV.equals("KY")) {
                    b10 = 115;
                }
                break;
            case 2415:
                if (strV.equals("KZ")) {
                    b10 = 116;
                }
                break;
            case 2421:
                if (strV.equals("LA")) {
                    b10 = 117;
                }
                break;
            case 2422:
                if (strV.equals("LB")) {
                    b10 = 118;
                }
                break;
            case 2423:
                if (strV.equals("LC")) {
                    b10 = 119;
                }
                break;
            case 2429:
                if (strV.equals("LI")) {
                    b10 = 120;
                }
                break;
            case 2431:
                if (strV.equals("LK")) {
                    b10 = 121;
                }
                break;
            case 2438:
                if (strV.equals("LR")) {
                    b10 = 122;
                }
                break;
            case 2439:
                if (strV.equals("LS")) {
                    b10 = 123;
                }
                break;
            case 2440:
                if (strV.equals("LT")) {
                    b10 = 124;
                }
                break;
            case 2441:
                if (strV.equals("LU")) {
                    b10 = 125;
                }
                break;
            case 2442:
                if (strV.equals("LV")) {
                    b10 = 126;
                }
                break;
            case 2445:
                if (strV.equals("LY")) {
                    b10 = ByteCompanionObject.MAX_VALUE;
                }
                break;
            case 2452:
                if (strV.equals("MA")) {
                    b10 = ByteCompanionObject.MIN_VALUE;
                }
                break;
            case 2454:
                if (strV.equals("MC")) {
                    b10 = 129;
                }
                break;
            case 2455:
                if (strV.equals("MD")) {
                    b10 = 130;
                }
                break;
            case 2456:
                if (strV.equals("ME")) {
                    b10 = 131;
                }
                break;
            case 2457:
                if (strV.equals("MF")) {
                    b10 = 132;
                }
                break;
            case 2458:
                if (strV.equals("MG")) {
                    b10 = 133;
                }
                break;
            case 2459:
                if (strV.equals("MH")) {
                    b10 = 134;
                }
                break;
            case 2462:
                if (strV.equals("MK")) {
                    b10 = 135;
                }
                break;
            case 2463:
                if (strV.equals("ML")) {
                    b10 = 136;
                }
                break;
            case 2464:
                if (strV.equals("MM")) {
                    b10 = 137;
                }
                break;
            case 2465:
                if (strV.equals("MN")) {
                    b10 = 138;
                }
                break;
            case 2466:
                if (strV.equals("MO")) {
                    b10 = 139;
                }
                break;
            case 2467:
                if (strV.equals("MP")) {
                    b10 = 140;
                }
                break;
            case 2468:
                if (strV.equals("MQ")) {
                    b10 = 141;
                }
                break;
            case 2469:
                if (strV.equals("MR")) {
                    b10 = 142;
                }
                break;
            case 2470:
                if (strV.equals("MS")) {
                    b10 = 143;
                }
                break;
            case 2471:
                if (strV.equals("MT")) {
                    b10 = 144;
                }
                break;
            case 2472:
                if (strV.equals("MU")) {
                    b10 = 145;
                }
                break;
            case 2473:
                if (strV.equals("MV")) {
                    b10 = 146;
                }
                break;
            case 2474:
                if (strV.equals("MW")) {
                    b10 = 147;
                }
                break;
            case 2475:
                if (strV.equals("MX")) {
                    b10 = 148;
                }
                break;
            case 2476:
                if (strV.equals("MY")) {
                    b10 = 149;
                }
                break;
            case 2477:
                if (strV.equals("MZ")) {
                    b10 = 150;
                }
                break;
            case 2483:
                if (strV.equals("NA")) {
                    b10 = 151;
                }
                break;
            case 2485:
                if (strV.equals("NC")) {
                    b10 = 152;
                }
                break;
            case 2487:
                if (strV.equals("NE")) {
                    b10 = 153;
                }
                break;
            case 2489:
                if (strV.equals("NG")) {
                    b10 = 154;
                }
                break;
            case 2491:
                if (strV.equals("NI")) {
                    b10 = 155;
                }
                break;
            case 2494:
                if (strV.equals("NL")) {
                    b10 = 156;
                }
                break;
            case 2497:
                if (strV.equals("NO")) {
                    b10 = 157;
                }
                break;
            case 2498:
                if (strV.equals("NP")) {
                    b10 = 158;
                }
                break;
            case 2500:
                if (strV.equals("NR")) {
                    b10 = 159;
                }
                break;
            case 2503:
                if (strV.equals("NU")) {
                    b10 = 160;
                }
                break;
            case 2508:
                if (strV.equals("NZ")) {
                    b10 = 161;
                }
                break;
            case 2526:
                if (strV.equals("OM")) {
                    b10 = 162;
                }
                break;
            case 2545:
                if (strV.equals("PA")) {
                    b10 = 163;
                }
                break;
            case 2549:
                if (strV.equals("PE")) {
                    b10 = 164;
                }
                break;
            case 2550:
                if (strV.equals("PF")) {
                    b10 = 165;
                }
                break;
            case 2551:
                if (strV.equals("PG")) {
                    b10 = 166;
                }
                break;
            case 2552:
                if (strV.equals("PH")) {
                    b10 = 167;
                }
                break;
            case 2555:
                if (strV.equals("PK")) {
                    b10 = 168;
                }
                break;
            case 2556:
                if (strV.equals("PL")) {
                    b10 = 169;
                }
                break;
            case 2557:
                if (strV.equals("PM")) {
                    b10 = 170;
                }
                break;
            case 2562:
                if (strV.equals("PR")) {
                    b10 = 171;
                }
                break;
            case 2563:
                if (strV.equals("PS")) {
                    b10 = 172;
                }
                break;
            case 2564:
                if (strV.equals("PT")) {
                    b10 = 173;
                }
                break;
            case 2567:
                if (strV.equals("PW")) {
                    b10 = 174;
                }
                break;
            case 2569:
                if (strV.equals("PY")) {
                    b10 = 175;
                }
                break;
            case 2576:
                if (strV.equals("QA")) {
                    b10 = 176;
                }
                break;
            case 2611:
                if (strV.equals("RE")) {
                    b10 = 177;
                }
                break;
            case 2621:
                if (strV.equals("RO")) {
                    b10 = 178;
                }
                break;
            case 2625:
                if (strV.equals("RS")) {
                    b10 = 179;
                }
                break;
            case 2627:
                if (strV.equals("RU")) {
                    b10 = 180;
                }
                break;
            case 2629:
                if (strV.equals("RW")) {
                    b10 = 181;
                }
                break;
            case 2638:
                if (strV.equals("SA")) {
                    b10 = 182;
                }
                break;
            case 2639:
                if (strV.equals("SB")) {
                    b10 = 183;
                }
                break;
            case 2640:
                if (strV.equals("SC")) {
                    b10 = 184;
                }
                break;
            case 2641:
                if (strV.equals("SD")) {
                    b10 = 185;
                }
                break;
            case 2642:
                if (strV.equals("SE")) {
                    b10 = 186;
                }
                break;
            case 2644:
                if (strV.equals("SG")) {
                    b10 = 187;
                }
                break;
            case 2645:
                if (strV.equals("SH")) {
                    b10 = 188;
                }
                break;
            case 2646:
                if (strV.equals("SI")) {
                    b10 = 189;
                }
                break;
            case 2647:
                if (strV.equals("SJ")) {
                    b10 = 190;
                }
                break;
            case 2648:
                if (strV.equals("SK")) {
                    b10 = 191;
                }
                break;
            case 2649:
                if (strV.equals("SL")) {
                    b10 = 192;
                }
                break;
            case 2650:
                if (strV.equals("SM")) {
                    b10 = 193;
                }
                break;
            case 2651:
                if (strV.equals("SN")) {
                    b10 = 194;
                }
                break;
            case 2652:
                if (strV.equals("SO")) {
                    b10 = 195;
                }
                break;
            case 2655:
                if (strV.equals("SR")) {
                    b10 = 196;
                }
                break;
            case 2656:
                if (strV.equals("SS")) {
                    b10 = 197;
                }
                break;
            case 2657:
                if (strV.equals("ST")) {
                    b10 = 198;
                }
                break;
            case 2659:
                if (strV.equals("SV")) {
                    b10 = 199;
                }
                break;
            case 2661:
                if (strV.equals("SX")) {
                    b10 = 200;
                }
                break;
            case 2662:
                if (strV.equals("SY")) {
                    b10 = 201;
                }
                break;
            case 2663:
                if (strV.equals("SZ")) {
                    b10 = 202;
                }
                break;
            case 2671:
                if (strV.equals("TC")) {
                    b10 = 203;
                }
                break;
            case 2672:
                if (strV.equals("TD")) {
                    b10 = 204;
                }
                break;
            case 2675:
                if (strV.equals("TG")) {
                    b10 = 205;
                }
                break;
            case 2676:
                if (strV.equals("TH")) {
                    b10 = 206;
                }
                break;
            case 2678:
                if (strV.equals("TJ")) {
                    b10 = 207;
                }
                break;
            case 2679:
                if (strV.equals("TK")) {
                    b10 = 208;
                }
                break;
            case 2680:
                if (strV.equals("TL")) {
                    b10 = 209;
                }
                break;
            case 2681:
                if (strV.equals("TM")) {
                    b10 = 210;
                }
                break;
            case 2682:
                if (strV.equals("TN")) {
                    b10 = 211;
                }
                break;
            case 2683:
                if (strV.equals("TO")) {
                    b10 = 212;
                }
                break;
            case 2686:
                if (strV.equals("TR")) {
                    b10 = 213;
                }
                break;
            case 2688:
                if (strV.equals("TT")) {
                    b10 = 214;
                }
                break;
            case 2690:
                if (strV.equals("TV")) {
                    b10 = 215;
                }
                break;
            case 2691:
                if (strV.equals("TW")) {
                    b10 = 216;
                }
                break;
            case 2694:
                if (strV.equals("TZ")) {
                    b10 = 217;
                }
                break;
            case 2700:
                if (strV.equals("UA")) {
                    b10 = 218;
                }
                break;
            case 2706:
                if (strV.equals("UG")) {
                    b10 = 219;
                }
                break;
            case 2718:
                if (strV.equals("US")) {
                    b10 = 220;
                }
                break;
            case 2724:
                if (strV.equals("UY")) {
                    b10 = 221;
                }
                break;
            case 2725:
                if (strV.equals("UZ")) {
                    b10 = 222;
                }
                break;
            case 2731:
                if (strV.equals("VA")) {
                    b10 = 223;
                }
                break;
            case 2733:
                if (strV.equals("VC")) {
                    b10 = 224;
                }
                break;
            case 2735:
                if (strV.equals("VE")) {
                    b10 = 225;
                }
                break;
            case 2737:
                if (strV.equals("VG")) {
                    b10 = 226;
                }
                break;
            case 2739:
                if (strV.equals("VI")) {
                    b10 = 227;
                }
                break;
            case 2744:
                if (strV.equals("VN")) {
                    b10 = 228;
                }
                break;
            case 2751:
                if (strV.equals("VU")) {
                    b10 = 229;
                }
                break;
            case 2767:
                if (strV.equals("WF")) {
                    b10 = 230;
                }
                break;
            case 2780:
                if (strV.equals("WS")) {
                    b10 = 231;
                }
                break;
            case 2803:
                if (strV.equals("XK")) {
                    b10 = 232;
                }
                break;
            case 2828:
                if (strV.equals("YE")) {
                    b10 = 233;
                }
                break;
            case 2843:
                if (strV.equals("YT")) {
                    b10 = 234;
                }
                break;
            case 2855:
                if (strV.equals("ZA")) {
                    b10 = 235;
                }
                break;
            case 2867:
                if (strV.equals("ZM")) {
                    b10 = 236;
                }
                break;
            case 2877:
                if (strV.equals("ZW")) {
                    b10 = 237;
                }
                break;
        }
        switch (b10) {
            case 0:
            case ChatViewRecyclerTypes.MEDIA_ATTACHMENT_MOSAIC_IMAGE /* 49 */:
                iArr = new int[]{2, 2, 0, 0, 2, 2};
                break;
            case 1:
                iArr = new int[]{1, 4, 3, 4, 4, 2};
                break;
            case 2:
            case 166:
                iArr = new int[]{4, 3, 3, 3, 2, 2};
                break;
            case 3:
                iArr = new int[]{2, 4, 3, 4, 2, 2};
                break;
            case 4:
            case 16:
            case 25:
            case 28:
            case ChatViewRecyclerTypes.SHARED_CUSTOM_THEME_EMBED /* 56 */:
            case 68:
                iArr = new int[]{0, 2, 0, 0, 2, 2};
                break;
            case 5:
                iArr = new int[]{1, 1, 1, 3, 2, 2};
                break;
            case 6:
                iArr = new int[]{2, 3, 2, 3, 2, 2};
                break;
            case 7:
                iArr = new int[]{4, 4, 4, 3, 2, 2};
                break;
            case 8:
            case 62:
            case 188:
                iArr = new int[]{4, 2, 2, 2, 2, 2};
                break;
            case 9:
                iArr = new int[]{2, 2, 3, 3, 2, 2};
                break;
            case 10:
                iArr = new int[]{1, 2, 1, 4, 1, 4};
                break;
            case 11:
                iArr = new int[]{0, 2, 1, 1, 3, 0};
                break;
            case 12:
            case 85:
                iArr = new int[]{1, 2, 4, 4, 2, 2};
                break;
            case 13:
            case 50:
            case 120:
            case 140:
            case 143:
            case 170:
            case 193:
            case 223:
                iArr = new int[]{0, 2, 2, 2, 2, 2};
                break;
            case 14:
            case 19:
            case ChatViewRecyclerTypes.REFERRAL_REDESIGN /* 58 */:
                iArr = new int[]{3, 3, 4, 4, 2, 2};
                break;
            case 15:
            case 94:
                iArr = new int[]{1, 1, 1, 1, 2, 2};
                break;
            case 17:
            case 116:
                iArr = new int[]{2, 1, 2, 2, 2, 2};
                break;
            case 18:
                iArr = new int[]{0, 1, 4, 4, 3, 2};
                break;
            case 20:
            case 63:
            case 83:
            case 189:
                iArr = new int[]{0, 0, 0, 0, 1, 2};
                break;
            case 21:
                iArr = new int[]{1, 3, 1, 4, 4, 2};
                break;
            case 22:
            case 91:
            case 133:
            case 153:
            case 204:
            case JfifUtil.MARKER_APP1 /* 225 */:
            case 233:
                iArr = new int[]{4, 4, 4, 4, 2, 2};
                break;
            case 23:
                iArr = new int[]{4, 4, 2, 3, 2, 2};
                break;
            case 24:
            case 132:
            case 175:
                iArr = new int[]{1, 2, 2, 2, 2, 2};
                break;
            case 26:
                iArr = new int[]{3, 2, 0, 1, 2, 2};
                break;
            case 27:
                iArr = new int[]{1, 2, 3, 2, 2, 2};
                break;
            case 29:
                iArr = new int[]{1, 1, 2, 1, 1, 0};
                break;
            case 30:
            case 118:
                iArr = new int[]{3, 2, 1, 2, 2, 2};
                break;
            case 31:
            case 150:
            case 231:
                iArr = new int[]{3, 1, 2, 1, 2, 2};
                break;
            case 32:
                iArr = new int[]{3, 2, 1, 0, 2, 2};
                break;
            case 33:
                iArr = new int[]{1, 1, 2, 3, 2, 2};
                break;
            case 34:
            case 41:
                iArr = new int[]{2, 2, 2, 1, 2, 2};
                break;
            case 35:
                iArr = new int[]{0, 2, 3, 3, 3, 3};
                break;
            case 36:
            case 111:
                iArr = new int[]{4, 3, 3, 2, 2, 2};
                break;
            case ChatViewRecyclerTypes.POLL_TEXT_AND_IMAGE /* 37 */:
            case 183:
                iArr = new int[]{4, 2, 4, 2, 2, 2};
                break;
            case ChatViewRecyclerTypes.POLL_IMAGE_ONLY /* 38 */:
            case 76:
                iArr = new int[]{3, 3, 3, 3, 2, 2};
                break;
            case ChatViewRecyclerTypes.SAFETY_SYSTEM_NOTIFICATION /* 39 */:
                iArr = new int[]{0, 0, 0, 0, 0, 3};
                break;
            case 40:
            case 61:
                iArr = new int[]{3, 4, 3, 3, 2, 2};
                break;
            case 42:
                iArr = new int[]{1, 1, 2, 1, 3, 2};
                break;
            case ChatViewRecyclerTypes.FORWARD_HEADER /* 43 */:
                iArr = new int[]{4, 3, 3, 4, 2, 2};
                break;
            case ChatViewRecyclerTypes.FORWARD_BREADCRUMB /* 44 */:
                iArr = new int[]{2, 0, 4, 3, 3, 1};
                break;
            case ChatViewRecyclerTypes.REACTION_BURST_REACTION /* 45 */:
                iArr = new int[]{2, 3, 4, 2, 2, 2};
                break;
            case 46:
                iArr = new int[]{2, 4, 4, 4, 2, 2};
                break;
            case ChatViewRecyclerTypes.REACTION_ADD_REACTION /* 47 */:
            case 110:
                iArr = new int[]{4, 2, 4, 3, 2, 2};
                break;
            case 48:
                iArr = new int[]{2, 3, 0, 1, 2, 2};
                break;
            case ChatViewRecyclerTypes.MEDIA_ATTACHMENT_MOSAIC_VISUAL_PLACEHOLDER /* 51 */:
            case 90:
            case 126:
                iArr = new int[]{1, 0, 0, 0, 0, 2};
                break;
            case ChatViewRecyclerTypes.REFERRAL /* 52 */:
                iArr = new int[]{0, 0, 2, 0, 1, 2};
                break;
            case ChatViewRecyclerTypes.GUILD_PROFILE_INVITE /* 53 */:
                iArr = new int[]{0, 1, 3, 2, 2, 2};
                break;
            case ChatViewRecyclerTypes.APP_MESSAGE_EMBED /* 54 */:
            case 201:
            case 207:
                iArr = new int[]{4, 3, 4, 4, 2, 2};
                break;
            case ChatViewRecyclerTypes.ACTIVITY_RICH_PRESENCE_INVITE_EMBED /* 55 */:
            case ChatViewRecyclerTypes.GIFT_INTENT /* 60 */:
            case 92:
            case 124:
            case 144:
                iArr = new int[]{0, 0, 0, 0, 0, 2};
                break;
            case ChatViewRecyclerTypes.PREMIUM_GROUP_INVITE /* 57 */:
                iArr = new int[]{3, 4, 4, 4, 4, 2};
                break;
            case ChatViewRecyclerTypes.VOICE_CHANNEL_LIST_INVITE /* 59 */:
                iArr = new int[]{1, 3, 2, 1, 2, 2};
                break;
            case 64:
            case 194:
                iArr = new int[]{4, 4, 3, 2, 2, 2};
                break;
            case 65:
                iArr = new int[]{0, 0, 0, 2, 0, 2};
                break;
            case 66:
                iArr = new int[]{3, 1, 2, 3, 2, 2};
                break;
            case 67:
                iArr = new int[]{4, 2, 3, 0, 2, 2};
                break;
            case 69:
                iArr = new int[]{1, 1, 2, 1, 1, 2};
                break;
            case 70:
            case 205:
                iArr = new int[]{3, 4, 1, 0, 2, 2};
                break;
            case 71:
                iArr = new int[]{0, 1, 1, 2, 1, 2};
                break;
            case 72:
            case 112:
            case 115:
            case 119:
            case h0.DEFAULT_DRAG_ANIMATION_DURATION /* 200 */:
            case 224:
                iArr = new int[]{1, 2, 0, 0, 2, 2};
                break;
            case 73:
                iArr = new int[]{1, 0, 0, 2, 2, 2};
                break;
            case 74:
            case 168:
            case JfifUtil.MARKER_SOFn /* 192 */:
                iArr = new int[]{3, 2, 3, 3, 2, 2};
                break;
            case 75:
                iArr = new int[]{0, 2, 1, 0, 2, 2};
                break;
            case 77:
            case 103:
                iArr = new int[]{1, 2, 0, 1, 2, 2};
                break;
            case 78:
            case JfifUtil.MARKER_RST0 /* 208 */:
                iArr = new int[]{2, 2, 2, 4, 2, 2};
                break;
            case 79:
                iArr = new int[]{4, 3, 2, 4, 2, 2};
                break;
            case 80:
                iArr = new int[]{4, 4, 4, 2, 2, 2};
                break;
            case 81:
                iArr = new int[]{3, 1, 1, 3, 2, 2};
                break;
            case 82:
                iArr = new int[]{4, 4, 3, 3, 2, 2};
                break;
            case 84:
                iArr = new int[]{2, 2, 2, 1, 1, 2};
                break;
            case BuildConfig.REACT_NATIVE_MINOR_VERSION /* 86 */:
                iArr = new int[]{4, 4, 2, 2, 2, 2};
                break;
            case 87:
                iArr = new int[]{3, 0, 1, 1, 2, 2};
                break;
            case 88:
                iArr = new int[]{0, 1, 1, 3, 2, 0};
                break;
            case 89:
                iArr = new int[]{3, 3, 2, 2, 2, 2};
                break;
            case 93:
                iArr = new int[]{3, 1, 1, 2, 3, 2};
                break;
            case 95:
                iArr = new int[]{1, 2, 2, 3, 4, 2};
                break;
            case 96:
                iArr = new int[]{0, 2, 0, 1, 2, 2};
                break;
            case 97:
                iArr = new int[]{1, 1, 2, 1, 2, 1};
                break;
            case 98:
            case JfifUtil.MARKER_RST7 /* 215 */:
            case 230:
                iArr = new int[]{4, 2, 2, 4, 2, 2};
                break;
            case 99:
            case 190:
                iArr = new int[]{3, 2, 2, 2, 2, 2};
                break;
            case 100:
                iArr = new int[]{4, 2, 3, 3, 4, 2};
                break;
            case 101:
                iArr = new int[]{0, 0, 1, 0, 0, 2};
                break;
            case 102:
                iArr = new int[]{0, 0, 1, 1, 1, 2};
                break;
            case 104:
                iArr = new int[]{2, 4, 2, 1, 2, 2};
                break;
            case 105:
                iArr = new int[]{2, 0, 1, 1, 2, 2};
                break;
            case 106:
                iArr = new int[]{0, 3, 3, 3, 4, 4};
                break;
            case 107:
                iArr = new int[]{3, 2, 2, 1, 2, 2};
                break;
            case 108:
            case 141:
                iArr = new int[]{2, 1, 1, 2, 2, 2};
                break;
            case 109:
                iArr = new int[]{1, 0, 4, 2, 2, 2};
                break;
            case 113:
                iArr = new int[]{0, 2, 2, 4, 4, 4};
                break;
            case MediaEngine.MAX_SUPPORTED_PROTOCOL_VERSION /* 114 */:
                iArr = new int[]{1, 0, 1, 0, 0, 2};
                break;
            case 117:
                iArr = new int[]{1, 2, 1, 3, 2, 2};
                break;
            case 121:
                iArr = new int[]{3, 2, 3, 4, 4, 2};
                break;
            case 122:
                iArr = new int[]{3, 4, 3, 4, 2, 2};
                break;
            case 123:
            case 219:
                iArr = new int[]{3, 3, 3, 2, 2, 2};
                break;
            case 125:
                iArr = new int[]{1, 1, 4, 2, 0, 2};
                break;
            case 127:
            case MediaImageViewKt.OBSCURED_IMAGE_MIN_HEIGHT /* 212 */:
            case 237:
                iArr = new int[]{3, 2, 4, 3, 2, 2};
                break;
            case IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT /* 128 */:
                iArr = new int[]{3, 3, 2, 1, 2, 2};
                break;
            case 129:
                iArr = new int[]{0, 2, 2, 0, 2, 2};
                break;
            case 130:
                iArr = new int[]{1, 0, 0, 0, 2, 2};
                break;
            case 131:
                iArr = new int[]{2, 0, 0, 1, 1, 2};
                break;
            case 134:
                iArr = new int[]{4, 2, 1, 3, 2, 2};
                break;
            case 135:
                iArr = new int[]{2, 0, 0, 1, 3, 2};
                break;
            case 136:
            case JfifUtil.MARKER_EOI /* 217 */:
                iArr = new int[]{3, 4, 2, 2, 2, 2};
                break;
            case 137:
                iArr = new int[]{2, 2, 2, 3, 4, 2};
                break;
            case 138:
                iArr = new int[]{2, 0, 1, 2, 2, 2};
                break;
            case 139:
                iArr = new int[]{0, 2, 4, 4, 4, 2};
                break;
            case 142:
                iArr = new int[]{4, 2, 3, 4, 2, 2};
                break;
            case 145:
            case 182:
                iArr = new int[]{3, 1, 1, 2, 2, 2};
                break;
            case MediaImageViewKt.OBSCURED_IMAGE_MIN_WIDTH /* 146 */:
                iArr = new int[]{3, 4, 1, 3, 3, 2};
                break;
            case 147:
                iArr = new int[]{4, 2, 3, 3, 2, 2};
                break;
            case 148:
                iArr = new int[]{3, 4, 4, 4, 2, 2};
                break;
            case 149:
                iArr = new int[]{1, 0, 4, 1, 2, 2};
                break;
            case 151:
                iArr = new int[]{3, 4, 3, 2, 2, 2};
                break;
            case 152:
                iArr = new int[]{3, 2, 3, 4, 2, 2};
                break;
            case 154:
                iArr = new int[]{3, 4, 2, 1, 2, 2};
                break;
            case 155:
                iArr = new int[]{2, 3, 4, 3, 2, 2};
                break;
            case 156:
                iArr = new int[]{0, 2, 3, 3, 0, 4};
                break;
            case 157:
                iArr = new int[]{0, 1, 2, 1, 1, 2};
                break;
            case 158:
                iArr = new int[]{2, 1, 4, 3, 2, 2};
                break;
            case 159:
                iArr = new int[]{4, 0, 3, 2, 2, 2};
                break;
            case 160:
                iArr = new int[]{4, 2, 2, 1, 2, 2};
                break;
            case 161:
                iArr = new int[]{1, 0, 2, 2, 4, 2};
                break;
            case 162:
                iArr = new int[]{2, 3, 1, 3, 4, 2};
                break;
            case 163:
                iArr = new int[]{2, 3, 3, 3, 2, 2};
                break;
            case 164:
                iArr = new int[]{1, 2, 4, 4, 3, 2};
                break;
            case 165:
            case 199:
                iArr = new int[]{2, 3, 3, 1, 2, 2};
                break;
            case 167:
                iArr = new int[]{2, 1, 3, 2, 2, 0};
                break;
            case 169:
                iArr = new int[]{2, 1, 2, 2, 4, 2};
                break;
            case 171:
                iArr = new int[]{2, 0, 2, 0, 2, 1};
                break;
            case 172:
                iArr = new int[]{3, 4, 1, 4, 2, 2};
                break;
            case 173:
                iArr = new int[]{1, 0, 0, 0, 1, 2};
                break;
            case 174:
                iArr = new int[]{2, 2, 4, 2, 2, 2};
                break;
            case 176:
                iArr = new int[]{1, 4, 4, 4, 4, 2};
                break;
            case 177:
                iArr = new int[]{1, 2, 2, 3, 1, 2};
                break;
            case 178:
                iArr = new int[]{0, 0, 1, 2, 1, 2};
                break;
            case 179:
                iArr = new int[]{2, 0, 0, 0, 2, 2};
                break;
            case 180:
                iArr = new int[]{1, 0, 0, 0, 3, 3};
                break;
            case 181:
                iArr = new int[]{3, 3, 1, 0, 2, 2};
                break;
            case 184:
                iArr = new int[]{4, 3, 1, 1, 2, 2};
                break;
            case 185:
                iArr = new int[]{4, 3, 4, 2, 2, 2};
                break;
            case 186:
                iArr = new int[]{0, 1, 1, 1, 0, 2};
                break;
            case 187:
                iArr = new int[]{2, 3, 3, 3, 3, 3};
                break;
            case 191:
                iArr = new int[]{1, 1, 1, 1, 3, 2};
                break;
            case 195:
                iArr = new int[]{3, 2, 2, 4, 4, 2};
                break;
            case 196:
                iArr = new int[]{2, 4, 3, 0, 2, 2};
                break;
            case 197:
            case 210:
                iArr = new int[]{4, 2, 2, 3, 2, 2};
                break;
            case 198:
                iArr = new int[]{2, 2, 1, 2, 2, 2};
                break;
            case 202:
                iArr = new int[]{4, 4, 3, 4, 2, 2};
                break;
            case 203:
                iArr = new int[]{2, 2, 1, 3, 2, 2};
                break;
            case 206:
                iArr = new int[]{0, 1, 2, 1, 2, 2};
                break;
            case 209:
                iArr = new int[]{4, 2, 4, 4, 2, 2};
                break;
            case 211:
            case 221:
                iArr = new int[]{2, 1, 1, 1, 2, 2};
                break;
            case 213:
                iArr = new int[]{1, 0, 0, 1, 3, 2};
                break;
            case 214:
                iArr = new int[]{1, 4, 0, 0, 2, 2};
                break;
            case JfifUtil.MARKER_SOI /* 216 */:
                iArr = new int[]{0, 2, 0, 0, 0, 0};
                break;
            case JfifUtil.MARKER_SOS /* 218 */:
                iArr = new int[]{0, 1, 1, 2, 4, 2};
                break;
            case 220:
                iArr = new int[]{1, 1, 4, 1, 3, 1};
                break;
            case 222:
                iArr = new int[]{2, 2, 3, 4, 3, 2};
                break;
            case 226:
                iArr = new int[]{2, 2, 0, 1, 2, 2};
                break;
            case 227:
                iArr = new int[]{0, 2, 1, 2, 2, 2};
                break;
            case 228:
                iArr = new int[]{0, 0, 1, 2, 2, 1};
                break;
            case 229:
                iArr = new int[]{4, 3, 3, 1, 2, 2};
                break;
            case 232:
                iArr = new int[]{1, 2, 1, 1, 2, 2};
                break;
            case 234:
                iArr = new int[]{2, 3, 3, 4, 2, 2};
                break;
            case 235:
                iArr = new int[]{2, 3, 2, 1, 2, 2};
                break;
            case 236:
                iArr = new int[]{4, 4, 4, 3, 3, 2};
                break;
            default:
                iArr = new int[]{2, 2, 2, 2, 2, 2};
                break;
        }
        HashMap map = new HashMap(8);
        map.put(0, 1000000L);
        r0 r0Var2 = he.s.f10680n;
        map.put(2, (Long) r0Var2.get(iArr[0]));
        map.put(3, (Long) he.s.f10681o.get(iArr[1]));
        map.put(4, (Long) he.s.f10682p.get(iArr[2]));
        map.put(5, (Long) he.s.f10683q.get(iArr[3]));
        map.put(10, (Long) he.s.f10684r.get(iArr[4]));
        map.put(9, (Long) he.s.f10685s.get(iArr[5]));
        map.put(7, (Long) r0Var2.get(iArr[0]));
        this.f3135v = map;
        this.f3132d = 2000;
        this.f3136w = je.y.f13866a;
        this.f3133e = true;
    }

    public static void b(c cVar, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto) {
        g gVar = (g) cVar.f3135v;
        MediaCodec mediaCodec = (MediaCodec) cVar.f3134i;
        HandlerThread handlerThread = gVar.f3153b;
        je.b.k(gVar.f3154c == null);
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        mediaCodec.setCallback(gVar, handler);
        gVar.f3154c = handler;
        je.b.c("configureCodec");
        mediaCodec.configure(mediaFormat, surface, mediaCrypto, 0);
        je.b.t();
        f fVar = (f) cVar.f3136w;
        HandlerThread handlerThread2 = fVar.f3147b;
        if (!fVar.f3151f) {
            handlerThread2.start();
            fVar.f3148c = new d(fVar, handlerThread2.getLooper(), 0);
            fVar.f3151f = true;
        }
        je.b.c("startCodec");
        mediaCodec.start();
        je.b.t();
        cVar.f3132d = 1;
    }

    public static String c(int i7, String str) {
        StringBuilder sb2 = new StringBuilder(str);
        if (i7 == 1) {
            sb2.append("Audio");
        } else if (i7 == 2) {
            sb2.append("Video");
        } else {
            sb2.append("Unknown(");
            sb2.append(i7);
            sb2.append(")");
        }
        return sb2.toString();
    }

    @Override // bd.l
    public void a(ke.h hVar, Handler handler) {
        ((MediaCodec) this.f3134i).setOnFrameRenderedListener(new a(this, hVar, 0), handler);
    }

    @Override // bd.l
    public void d(int i7, lc.c cVar, long j) {
        f fVar = (f) this.f3136w;
        RuntimeException runtimeException = (RuntimeException) fVar.f3149d.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
        e eVarB = f.b();
        eVarB.f3139a = i7;
        eVarB.f3140b = 0;
        eVarB.f3142d = j;
        eVarB.f3143e = 0;
        MediaCodec.CryptoInfo cryptoInfo = eVarB.f3141c;
        cryptoInfo.numSubSamples = cVar.f15005f;
        int[] iArr = cVar.f15003d;
        int[] iArrCopyOf = cryptoInfo.numBytesOfClearData;
        if (iArr != null) {
            if (iArrCopyOf == null || iArrCopyOf.length < iArr.length) {
                iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            } else {
                System.arraycopy(iArr, 0, iArrCopyOf, 0, iArr.length);
            }
        }
        cryptoInfo.numBytesOfClearData = iArrCopyOf;
        int[] iArr2 = cVar.f15004e;
        int[] iArrCopyOf2 = cryptoInfo.numBytesOfEncryptedData;
        if (iArr2 != null) {
            if (iArrCopyOf2 == null || iArrCopyOf2.length < iArr2.length) {
                iArrCopyOf2 = Arrays.copyOf(iArr2, iArr2.length);
            } else {
                System.arraycopy(iArr2, 0, iArrCopyOf2, 0, iArr2.length);
            }
        }
        cryptoInfo.numBytesOfEncryptedData = iArrCopyOf2;
        byte[] bArr = cVar.f15001b;
        byte[] bArrCopyOf = cryptoInfo.key;
        if (bArr != null) {
            if (bArrCopyOf == null || bArrCopyOf.length < bArr.length) {
                bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
            } else {
                System.arraycopy(bArr, 0, bArrCopyOf, 0, bArr.length);
            }
        }
        bArrCopyOf.getClass();
        cryptoInfo.key = bArrCopyOf;
        byte[] bArr2 = cVar.f15000a;
        byte[] bArrCopyOf2 = cryptoInfo.iv;
        if (bArr2 != null) {
            if (bArrCopyOf2 == null || bArrCopyOf2.length < bArr2.length) {
                bArrCopyOf2 = Arrays.copyOf(bArr2, bArr2.length);
            } else {
                System.arraycopy(bArr2, 0, bArrCopyOf2, 0, bArr2.length);
            }
        }
        bArrCopyOf2.getClass();
        cryptoInfo.iv = bArrCopyOf2;
        cryptoInfo.mode = cVar.f15002c;
        if (e0.f13788a >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(cVar.f15006g, cVar.f15007h));
        }
        fVar.f3148c.obtainMessage(1, eVarB).sendToTarget();
    }

    @Override // bd.l
    public void flush() {
        ((f) this.f3136w).a();
        ((MediaCodec) this.f3134i).flush();
        g gVar = (g) this.f3135v;
        synchronized (gVar.f3152a) {
            gVar.k++;
            Handler handler = gVar.f3154c;
            int i7 = e0.f13788a;
            handler.post(new am.c(4, gVar));
        }
        ((MediaCodec) this.f3134i).start();
    }

    @Override // bd.l
    public ByteBuffer getInputBuffer(int i7) {
        return ((MediaCodec) this.f3134i).getInputBuffer(i7);
    }

    @Override // bd.l
    public ByteBuffer getOutputBuffer(int i7) {
        return ((MediaCodec) this.f3134i).getOutputBuffer(i7);
    }

    @Override // bd.l
    public MediaFormat getOutputFormat() {
        MediaFormat mediaFormat;
        g gVar = (g) this.f3135v;
        synchronized (gVar.f3152a) {
            try {
                mediaFormat = gVar.f3159h;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return mediaFormat;
    }

    @Override // bd.l
    public void i(long j, int i7, int i10, int i11) {
        f fVar = (f) this.f3136w;
        RuntimeException runtimeException = (RuntimeException) fVar.f3149d.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
        e eVarB = f.b();
        eVarB.f3139a = i7;
        eVarB.f3140b = i10;
        eVarB.f3142d = j;
        eVarB.f3143e = i11;
        d dVar = fVar.f3148c;
        int i12 = e0.f13788a;
        dVar.obtainMessage(0, eVarB).sendToTarget();
    }

    @Override // bd.l
    public void j(int i7, long j) {
        ((MediaCodec) this.f3134i).releaseOutputBuffer(i7, j);
    }

    @Override // bd.l
    public int k() {
        RuntimeException runtimeException = (RuntimeException) ((f) this.f3136w).f3149d.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
        g gVar = (g) this.f3135v;
        synchronized (gVar.f3152a) {
            try {
                IllegalStateException illegalStateException = gVar.f3162m;
                if (illegalStateException != null) {
                    gVar.f3162m = null;
                    throw illegalStateException;
                }
                MediaCodec.CodecException codecException = gVar.j;
                if (codecException != null) {
                    gVar.j = null;
                    throw codecException;
                }
                boolean z5 = true;
                int iE = -1;
                if (gVar.k > 0 || gVar.f3161l) {
                    return -1;
                }
                ad.e eVar = gVar.f3155d;
                if (eVar.f344i != 0) {
                    z5 = false;
                }
                if (!z5) {
                    iE = eVar.e();
                }
                return iE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // bd.l
    public int m(MediaCodec.BufferInfo bufferInfo) {
        RuntimeException runtimeException = (RuntimeException) ((f) this.f3136w).f3149d.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
        g gVar = (g) this.f3135v;
        synchronized (gVar.f3152a) {
            try {
                IllegalStateException illegalStateException = gVar.f3162m;
                if (illegalStateException != null) {
                    gVar.f3162m = null;
                    throw illegalStateException;
                }
                MediaCodec.CodecException codecException = gVar.j;
                if (codecException != null) {
                    gVar.j = null;
                    throw codecException;
                }
                boolean z5 = true;
                if (gVar.k > 0 || gVar.f3161l) {
                    return -1;
                }
                ad.e eVar = gVar.f3156e;
                if (eVar.f344i != 0) {
                    z5 = false;
                }
                if (z5) {
                    return -1;
                }
                int iE = eVar.e();
                if (iE >= 0) {
                    je.b.l(gVar.f3159h);
                    MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) gVar.f3157f.remove();
                    bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                } else if (iE == -2) {
                    gVar.f3159h = (MediaFormat) gVar.f3158g.remove();
                }
                return iE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // bd.l
    public void p(int i7) {
        ((MediaCodec) this.f3134i).setVideoScalingMode(i7);
    }

    @Override // bd.l
    public void release() {
        try {
            if (this.f3132d == 1) {
                f fVar = (f) this.f3136w;
                if (fVar.f3151f) {
                    fVar.a();
                    fVar.f3147b.quit();
                }
                fVar.f3151f = false;
                g gVar = (g) this.f3135v;
                synchronized (gVar.f3152a) {
                    gVar.f3161l = true;
                    gVar.f3153b.quit();
                    gVar.a();
                }
            }
            this.f3132d = 2;
            if (this.f3133e) {
                return;
            }
            ((MediaCodec) this.f3134i).release();
            this.f3133e = true;
        } catch (Throwable th2) {
            if (!this.f3133e) {
                ((MediaCodec) this.f3134i).release();
                this.f3133e = true;
            }
            throw th2;
        }
    }

    @Override // bd.l
    public void releaseOutputBuffer(int i7, boolean z5) {
        ((MediaCodec) this.f3134i).releaseOutputBuffer(i7, z5);
    }

    @Override // bd.l
    public void setOutputSurface(Surface surface) {
        ((MediaCodec) this.f3134i).setOutputSurface(surface);
    }

    @Override // bd.l
    public void setParameters(Bundle bundle) {
        ((MediaCodec) this.f3134i).setParameters(bundle);
    }

    public c(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2) {
        this.f3134i = mediaCodec;
        this.f3135v = new g(handlerThread);
        this.f3136w = new f(mediaCodec, handlerThread2);
        this.f3132d = 0;
    }
}

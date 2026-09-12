package ic;

import androidx.recyclerview.widget.RecyclerView;
import com.discord.media.utils.DiscordVideoMediaSource;
import com.facebook.imageutils.JfifUtil;
import com.facebook.react.common.assets.ReactFontManager;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.reactnativecommunity.webview.RNCWebViewManager;
import gc.h1;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f11471a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f11472b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f11473c = {1, 2, 3, 6};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f11474d = {48000, 44100, 32000};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f11475e = {24000, 22050, 16000};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f11476f = {2, 1, 2, 3, 3, 4, 4, 5};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[] f11477g = {32, 40, 48, 56, 64, 80, 96, 112, IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT, 160, JfifUtil.MARKER_SOFn, 224, IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER, 320, 384, 448, IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING, 576, DiscordVideoMediaSource.DEFAULT_WIDTH};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int[] f11478h = {69, 87, 104, 121, 139, 174, JfifUtil.MARKER_RST0, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int[] f11479i = {2002, 2000, 1920, 1601, 1600, RNCWebViewManager.COMMAND_CLEAR_CACHE, 1000, 960, 800, 800, DiscordVideoMediaSource.DEFAULT_HEIGHT, ReactFontManager.TypefaceStyle.NORMAL, ReactFontManager.TypefaceStyle.NORMAL, RecyclerView.ItemAnimator.FLAG_MOVED};
    public static final int[] j = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    public static final int[] k = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int[] f11480l = {64, 112, IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT, JfifUtil.MARKER_SOFn, 224, IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER, 384, 448, IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING, DiscordVideoMediaSource.DEFAULT_WIDTH, 768, 896, IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET, 1152, 1280, 1536, 1920, RecyclerView.ItemAnimator.FLAG_MOVED, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT, 6144, 7680};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String[] f11481m = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int[] f11482n = {44100, 48000, 32000};

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int[] f11483o = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int[] f11484p = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int[] f11485q = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int[] f11486r = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int[] f11487s = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    public static byte[] a(int i7, int i10, int i11) {
        return new byte[]{(byte) (((i7 << 3) & 248) | ((i10 >> 1) & 7)), (byte) (((i10 << 7) & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) | ((i11 << 3) & 120))};
    }

    public static ArrayList b(byte[] bArr) {
        long j5 = (((long) (((bArr[11] & 255) << 8) | (bArr[10] & 255))) * 1000000000) / 48000;
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j5).array());
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(80000000L).array());
        return arrayList;
    }

    public static int c(int i7, int i10) {
        int i11 = i10 / 2;
        if (i7 < 0 || i7 >= 3 || i10 < 0 || i11 >= 19) {
            return -1;
        }
        int i12 = f11474d[i7];
        if (i12 == 44100) {
            return ((i10 % 2) + f11478h[i11]) * 2;
        }
        int i13 = f11477g[i11];
        return i12 == 32000 ? i13 * 6 : i13 * 4;
    }

    public static void d(int i7, je.w wVar) {
        wVar.C(7);
        byte[] bArr = wVar.f13860a;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i7 >> 16) & 255);
        bArr[5] = (byte) ((i7 >> 8) & 255);
        bArr[6] = (byte) (i7 & 255);
    }

    public static int e(int i7) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        if ((i7 & (-2097152)) != -2097152 || (i10 = (i7 >>> 19) & 3) == 1 || (i11 = (i7 >>> 17) & 3) == 0 || (i12 = (i7 >>> 12) & 15) == 0 || i12 == 15 || (i13 = (i7 >>> 10) & 3) == 3) {
            return -1;
        }
        int i15 = f11482n[i13];
        if (i10 == 2) {
            i15 /= 2;
        } else if (i10 == 0) {
            i15 /= 4;
        }
        int i16 = (i7 >>> 9) & 1;
        if (i11 == 3) {
            return ((((i10 == 3 ? f11483o[i12 - 1] : f11484p[i12 - 1]) * 12) / i15) + i16) * 4;
        }
        if (i10 == 3) {
            i14 = i11 == 2 ? f11485q[i12 - 1] : f11486r[i12 - 1];
        } else {
            i14 = f11487s[i12 - 1];
        }
        if (i10 == 3) {
            return ((i14 * 144) / i15) + i16;
        }
        return (((i11 == 1 ? 72 : 144) * i14) / i15) + i16;
    }

    public static long f(byte b10, byte b11) {
        int i7;
        int i10;
        int i11 = b10 & 255;
        int i12 = b10 & 3;
        if (i12 != 0) {
            i7 = 2;
            if (i12 != 1 && i12 != 2) {
                i7 = b11 & 63;
            }
        } else {
            i7 = 1;
        }
        int i13 = i11 >> 3;
        int i14 = i13 & 3;
        if (i13 >= 16) {
            i10 = 2500 << i14;
        } else if (i13 >= 12) {
            i10 = 10000 << (i13 & 1);
        } else {
            i10 = i14 == 3 ? 60000 : 10000 << i14;
        }
        return ((long) i7) * ((long) i10);
    }

    public static int g(je.v vVar) throws h1 {
        int i7 = vVar.i(4);
        if (i7 == 15) {
            if (vVar.b() >= 24) {
                return vVar.i(24);
            }
            throw h1.a("AAC header insufficient data", null);
        }
        if (i7 < 13) {
            return f11471a[i7];
        }
        throw h1.a("AAC header wrong Sampling Frequency Index", null);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0083  */
    /* JADX WARN: Code duplicated, block: B:44:0x008b  */
    /* JADX WARN: Code duplicated, block: B:47:0x0090  */
    public static gc.l h(je.v vVar) {
        int i7;
        int i10;
        int i11 = vVar.i(16);
        int i12 = vVar.i(16);
        if (i12 == 65535) {
            i12 = vVar.i(24);
            i7 = 7;
        } else {
            i7 = 4;
        }
        int i13 = i12 + i7;
        if (i11 == 44097) {
            i13 += 2;
        }
        if (vVar.i(2) == 3) {
            do {
                vVar.i(2);
            } while (vVar.h());
        }
        int i14 = vVar.i(10);
        if (vVar.h() && vVar.i(3) > 0) {
            vVar.s(2);
        }
        int i15 = vVar.h() ? 48000 : 44100;
        int i16 = vVar.i(4);
        int[] iArr = f11479i;
        if (i15 == 44100 && i16 == 13) {
            i10 = iArr[i16];
        } else if (i15 != 48000 || i16 >= 14) {
            i10 = 0;
        } else {
            int i17 = iArr[i16];
            int i18 = i14 % 5;
            if (i18 == 1) {
                if (i16 != 3 || i16 == 8) {
                    i10 = i17 + 1;
                } else {
                    i10 = i17;
                }
            } else if (i18 != 2) {
                if (i18 == 3) {
                    if (i16 != 3) {
                    }
                    i10 = i17 + 1;
                } else if (i18 == 4 && (i16 == 3 || i16 == 8 || i16 == 11)) {
                    i10 = i17 + 1;
                } else {
                    i10 = i17;
                }
            } else if (i16 == 8 || i16 == 11) {
                i10 = i17 + 1;
            } else {
                i10 = i17;
            }
        }
        return new gc.l(i15, i13, i10);
    }

    public static o0 i(je.v vVar, boolean z5) throws h1 {
        int i7 = vVar.i(5);
        if (i7 == 31) {
            i7 = vVar.i(6) + 32;
        }
        int iG = g(vVar);
        int i10 = vVar.i(4);
        String strH = kk.b.h(i7, "mp4a.40.");
        if (i7 == 5 || i7 == 29) {
            iG = g(vVar);
            int i11 = vVar.i(5);
            if (i11 == 31) {
                i11 = vVar.i(6) + 32;
            }
            i7 = i11;
            if (i7 == 22) {
                i10 = vVar.i(4);
            }
        }
        if (z5) {
            if (i7 != 1 && i7 != 2 && i7 != 3 && i7 != 4 && i7 != 6 && i7 != 7 && i7 != 17) {
                switch (i7) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw h1.c("Unsupported audio object type: " + i7);
                }
            }
            if (vVar.h()) {
                je.b.N("AacUtil", "Unexpected frameLengthFlag = 1");
            }
            if (vVar.h()) {
                vVar.s(14);
            }
            boolean zH = vVar.h();
            if (i10 == 0) {
                throw new UnsupportedOperationException();
            }
            if (i7 == 6 || i7 == 20) {
                vVar.s(3);
            }
            if (zH) {
                if (i7 == 22) {
                    vVar.s(16);
                }
                if (i7 == 17 || i7 == 19 || i7 == 20 || i7 == 23) {
                    vVar.s(3);
                }
                vVar.s(1);
            }
            switch (i7) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int i12 = vVar.i(2);
                    if (i12 == 2 || i12 == 3) {
                        throw h1.c("Unsupported epConfig: " + i12);
                    }
                    break;
            }
        }
        int i13 = f11472b[i10];
        if (i13 == -1) {
            throw h1.a(null, null);
        }
        o0 o0Var = new o0();
        o0Var.f11592a = iG;
        o0Var.f11593b = i13;
        o0Var.f11594c = strH;
        return o0Var;
    }

    public static int j(int i7) {
        int i10;
        int i11;
        if ((i7 & (-2097152)) == -2097152 && (i10 = (i7 >>> 19) & 3) != 1 && (i11 = (i7 >>> 17) & 3) != 0) {
            int i12 = (i7 >>> 12) & 15;
            int i13 = (i7 >>> 10) & 3;
            if (i12 != 0 && i12 != 15 && i13 != 3) {
                if (i11 == 1) {
                    return i10 == 3 ? 1152 : 576;
                }
                if (i11 == 2) {
                    return 1152;
                }
                if (i11 == 3) {
                    return 384;
                }
                throw new IllegalArgumentException();
            }
        }
        return -1;
    }
}

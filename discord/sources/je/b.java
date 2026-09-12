package je;

import android.media.MediaFormat;
import android.net.Uri;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.os.Bundle;
import android.os.SystemClock;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import ei.r0;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f13758a = {0, 0, 0, 1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f13759b = {"", "A", "B", "C"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f13760c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f13761d = {0, 0, 0, 1};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float[] f13762e = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object f13763f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int[] f13764g = new int[10];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Object f13765h = new Object();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Object f13766i = new Object();
    public static boolean j;
    public static long k;

    public static int A(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return -1;
        }
        if (lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3")) {
            return 0;
        }
        if (lastPathSegment.endsWith(".ac4")) {
            return 1;
        }
        if (lastPathSegment.endsWith(".adts") || lastPathSegment.endsWith(".aac")) {
            return 2;
        }
        if (lastPathSegment.endsWith(".amr")) {
            return 3;
        }
        if (lastPathSegment.endsWith(".flac")) {
            return 4;
        }
        if (lastPathSegment.endsWith(".flv")) {
            return 5;
        }
        if (lastPathSegment.endsWith(".mid") || lastPathSegment.endsWith(".midi") || lastPathSegment.endsWith(".smf")) {
            return 15;
        }
        if (lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".webm")) {
            return 6;
        }
        if (lastPathSegment.endsWith(".mp3")) {
            return 7;
        }
        if (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) || lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
            return 8;
        }
        if (lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".opus")) {
            return 9;
        }
        if (lastPathSegment.endsWith(".ps") || lastPathSegment.endsWith(".mpeg") || lastPathSegment.endsWith(".mpg") || lastPathSegment.endsWith(".m2p")) {
            return 10;
        }
        if (lastPathSegment.endsWith(".ts") || lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
            return 11;
        }
        if (lastPathSegment.endsWith(".wav") || lastPathSegment.endsWith(".wave")) {
            return 12;
        }
        if (lastPathSegment.endsWith(".vtt") || lastPathSegment.endsWith(".webvtt")) {
            return 13;
        }
        if (lastPathSegment.endsWith(".jpg") || lastPathSegment.endsWith(".jpeg")) {
            return 14;
        }
        return lastPathSegment.endsWith(".avi") ? 16 : -1;
    }

    public static boolean B(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals(str);
    }

    public static boolean C(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals(str);
    }

    public static void D(MediaFormat mediaFormat, String str, int i7) {
        if (i7 != -1) {
            mediaFormat.setInteger(str, i7);
        }
    }

    public static p E(byte[] bArr, int i7, int i10) {
        int i11;
        int i12;
        int i13;
        int iC;
        int iL;
        int i14 = 2;
        v vVar = new v(bArr, i7 + 2, i10);
        int i15 = 4;
        vVar.s(4);
        int i16 = vVar.i(3);
        vVar.r();
        int i17 = vVar.i(2);
        boolean zH = vVar.h();
        int i18 = vVar.i(5);
        int i19 = 0;
        for (int i20 = 0; i20 < 32; i20++) {
            if (vVar.h()) {
                i19 |= 1 << i20;
            }
        }
        int i21 = 6;
        int[] iArr = new int[6];
        for (int i22 = 0; i22 < 6; i22++) {
            iArr[i22] = vVar.i(8);
        }
        int i23 = i19;
        int i24 = vVar.i(8);
        int i25 = 0;
        for (int i26 = 0; i26 < i16; i26++) {
            if (vVar.h()) {
                i25 += 89;
            }
            if (vVar.h()) {
                i25 += 8;
            }
        }
        vVar.s(i25);
        if (i16 > 0) {
            vVar.s((8 - i16) * 2);
        }
        vVar.l();
        int iL2 = vVar.l();
        if (iL2 == 3) {
            vVar.r();
        }
        int iL3 = vVar.l();
        int iL4 = vVar.l();
        if (vVar.h()) {
            int iL5 = vVar.l();
            int iL6 = vVar.l();
            int iL7 = vVar.l();
            int iL8 = vVar.l();
            iL3 -= (iL5 + iL6) * ((iL2 == 1 || iL2 == 2) ? 2 : 1);
            iL4 -= (iL7 + iL8) * (iL2 == 1 ? 2 : 1);
        }
        vVar.l();
        vVar.l();
        int iL9 = vVar.l();
        for (int i27 = vVar.h() ? 0 : i16; i27 <= i16; i27++) {
            vVar.l();
            vVar.l();
            vVar.l();
        }
        vVar.l();
        vVar.l();
        vVar.l();
        vVar.l();
        vVar.l();
        vVar.l();
        if (vVar.h() && vVar.h()) {
            int i28 = 0;
            while (i28 < i15) {
                int i29 = 0;
                while (i29 < i21) {
                    if (vVar.h()) {
                        int iMin = Math.min(64, 1 << ((i28 << 1) + 4));
                        if (i28 > 1) {
                            vVar.m();
                        }
                        for (int i30 = 0; i30 < iMin; i30++) {
                            vVar.m();
                        }
                    } else {
                        vVar.l();
                    }
                    i29 += i28 == 3 ? 3 : 1;
                    i21 = 6;
                }
                i28++;
                i15 = 4;
                i21 = 6;
            }
        }
        vVar.s(2);
        if (vVar.h()) {
            vVar.s(8);
            vVar.l();
            vVar.l();
            vVar.r();
        }
        int iL10 = vVar.l();
        int i31 = 0;
        int[] iArr2 = new int[0];
        int[] iArrCopyOf = new int[0];
        int iB = -1;
        int i32 = -1;
        int i33 = -1;
        while (i31 < iL10) {
            if (i31 == 0 || !vVar.h()) {
                iL = vVar.l();
                int iL11 = vVar.l();
                int[] iArr3 = new int[iL];
                int i34 = 0;
                while (i34 < iL) {
                    iArr3[i34] = (i34 > 0 ? iArr3[i34 - 1] : 0) - (vVar.l() + 1);
                    vVar.r();
                    i34++;
                }
                int[] iArr4 = new int[iL11];
                int i35 = 0;
                while (i35 < iL11) {
                    iArr4[i35] = vVar.l() + 1 + (i35 > 0 ? iArr4[i35 - 1] : 0);
                    vVar.r();
                    i35++;
                }
                iArr2 = iArr3;
                iArrCopyOf = iArr4;
                i32 = iL11;
            } else {
                int i36 = i33 + i32;
                int iL12 = (1 - ((vVar.h() ? 1 : 0) * 2)) * (vVar.l() + 1);
                int i37 = i36 + 1;
                boolean[] zArr = new boolean[i37];
                for (int i38 = 0; i38 <= i36; i38++) {
                    if (vVar.h()) {
                        zArr[i38] = true;
                    } else {
                        zArr[i38] = vVar.h();
                    }
                }
                int[] iArr5 = new int[i37];
                int[] iArr6 = new int[i37];
                int i39 = 0;
                for (int i40 = i32 - 1; i40 >= 0; i40--) {
                    int i41 = iArrCopyOf[i40] + iL12;
                    if (i41 < 0 && zArr[i33 + i40]) {
                        iArr5[i39] = i41;
                        i39++;
                    }
                }
                if (iL12 < 0 && zArr[i36]) {
                    iArr5[i39] = iL12;
                    i39++;
                }
                iL = i39;
                for (int i42 = 0; i42 < i33; i42++) {
                    int i43 = iArr2[i42] + iL12;
                    if (i43 < 0 && zArr[i42]) {
                        iArr5[iL] = i43;
                        iL++;
                    }
                }
                int[] iArrCopyOf2 = Arrays.copyOf(iArr5, iL);
                int i44 = 0;
                for (int i45 = i33 - 1; i45 >= 0; i45--) {
                    int i46 = iArr2[i45] + iL12;
                    if (i46 > 0 && zArr[i45]) {
                        iArr6[i44] = i46;
                        i44++;
                    }
                }
                if (iL12 > 0 && zArr[i36]) {
                    iArr6[i44] = iL12;
                    i44++;
                }
                int i47 = i44;
                for (int i48 = 0; i48 < i32; i48++) {
                    int i49 = iArrCopyOf[i48] + iL12;
                    if (i49 > 0 && zArr[i33 + i48]) {
                        iArr6[i47] = i49;
                        i47++;
                    }
                }
                iArrCopyOf = Arrays.copyOf(iArr6, i47);
                iArr2 = iArrCopyOf2;
                i32 = i47;
            }
            i33 = iL;
            i31++;
            i14 = i14;
            iL10 = iL10;
            iL9 = iL9;
        }
        int i50 = i14;
        int i51 = iL9;
        if (vVar.h()) {
            int iL13 = vVar.l();
            for (int i52 = 0; i52 < iL13; i52++) {
                vVar.s(i51 + 5);
            }
        }
        int i53 = i50;
        vVar.s(i53);
        float f2 = 1.0f;
        if (vVar.h()) {
            if (vVar.h()) {
                int i54 = vVar.i(8);
                if (i54 == 255) {
                    int i55 = vVar.i(16);
                    int i56 = vVar.i(16);
                    if (i55 != 0 && i56 != 0) {
                        f2 = i55 / i56;
                    }
                } else if (i54 < 17) {
                    f2 = f13762e[i54];
                } else {
                    com.discord.chat.presentation.list.a.q(i54, "Unexpected aspect_ratio_idc value: ", "NalUnitUtil");
                }
            }
            if (vVar.h()) {
                vVar.r();
            }
            if (vVar.h()) {
                vVar.s(3);
                if (vVar.h()) {
                    i53 = 1;
                }
                if (vVar.h()) {
                    int i57 = vVar.i(8);
                    int i58 = vVar.i(8);
                    vVar.s(8);
                    iB = ke.b.b(i57);
                    iC = ke.b.c(i58);
                } else {
                    iC = -1;
                }
            } else {
                i53 = -1;
                iC = -1;
            }
            if (vVar.h()) {
                vVar.l();
                vVar.l();
            }
            vVar.r();
            if (vVar.h()) {
                iL4 *= 2;
            }
            i11 = iL4;
            i12 = iB;
            i13 = i53;
            iB = iC;
        } else {
            i11 = iL4;
            i12 = -1;
            i13 = -1;
        }
        return new p(i17, zH, i18, i23, iArr, i24, iL3, i11, f2, i12, i13, iB);
    }

    /* JADX WARN: Code duplicated, block: B:105:0x01bc A[PHI: r18
      0x01bc: PHI (r18v2 float) = (r18v1 float), (r18v5 float) binds: [B:78:0x0143, B:95:0x0185] A[DONT_GENERATE, DONT_INLINE]] */
    public static r F(byte[] bArr, int i7, int i10) {
        int iL;
        boolean zH;
        v vVar;
        int i11;
        boolean z5;
        int iL2;
        int iC;
        float f2;
        int i12;
        int i13;
        v vVar2 = new v(bArr, i7 + 1, i10);
        int i14 = vVar2.i(8);
        int i15 = vVar2.i(8);
        int i16 = vVar2.i(8);
        int iL3 = vVar2.l();
        if (i14 == 100 || i14 == 110 || i14 == 122 || i14 == 244 || i14 == 44 || i14 == 83 || i14 == 86 || i14 == 118 || i14 == 128 || i14 == 138) {
            iL = vVar2.l();
            zH = iL == 3 ? vVar2.h() : false;
            vVar2.l();
            vVar2.l();
            vVar2.r();
            if (vVar2.h()) {
                int i17 = iL != 3 ? 8 : 12;
                int i18 = 0;
                while (i18 < i17) {
                    if (vVar2.h()) {
                        int i19 = i18 < 6 ? 16 : 64;
                        int iM = 8;
                        int i20 = 8;
                        for (int i21 = 0; i21 < i19; i21++) {
                            if (iM != 0) {
                                iM = ((vVar2.m() + i20) + IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                            }
                            if (iM != 0) {
                                i20 = iM;
                            }
                        }
                    }
                    i18++;
                }
            }
        } else {
            iL = 1;
            zH = false;
        }
        int iL4 = vVar2.l() + 4;
        int iL5 = vVar2.l();
        if (iL5 == 0) {
            iL2 = vVar2.l() + 4;
            vVar = vVar2;
            i11 = 16;
            z5 = false;
        } else {
            if (iL5 == 1) {
                boolean zH2 = vVar2.h();
                vVar2.m();
                vVar2.m();
                i11 = 16;
                long jL = vVar2.l();
                vVar = vVar2;
                for (int i22 = 0; i22 < jL; i22++) {
                    vVar.l();
                }
                z5 = zH2;
            } else {
                vVar = vVar2;
                i11 = 16;
                z5 = false;
            }
            iL2 = 0;
        }
        vVar.l();
        vVar.r();
        int iL6 = vVar.l() + 1;
        int iL7 = vVar.l() + 1;
        boolean zH3 = vVar.h();
        int i23 = 2 - (zH3 ? 1 : 0);
        int i24 = iL7 * i23;
        if (!zH3) {
            vVar.r();
        }
        vVar.r();
        int i25 = iL6 * 16;
        int i26 = i24 * 16;
        if (vVar.h()) {
            int iL8 = vVar.l();
            int iL9 = vVar.l();
            int iL10 = vVar.l();
            int iL11 = vVar.l();
            if (iL == 0) {
                i13 = 1;
            } else {
                i13 = iL == 3 ? 1 : 2;
                i23 *= iL == 1 ? 2 : 1;
            }
            i25 -= (iL8 + iL9) * i13;
            i26 -= (iL10 + iL11) * i23;
        }
        int iB = -1;
        float f7 = 1.0f;
        if (vVar.h()) {
            if (vVar.h()) {
                int i27 = vVar.i(8);
                if (i27 == 255) {
                    int i28 = i11;
                    int i29 = vVar.i(i28);
                    int i30 = vVar.i(i28);
                    if (i29 != 0 && i30 != 0) {
                        f7 = i29 / i30;
                    }
                } else if (i27 < 17) {
                    f7 = f13762e[i27];
                } else {
                    com.discord.chat.presentation.list.a.q(i27, "Unexpected aspect_ratio_idc value: ", "NalUnitUtil");
                }
            }
            if (vVar.h()) {
                vVar.r();
            }
            if (vVar.h()) {
                vVar.s(3);
                int i31 = vVar.h() ? 1 : 2;
                if (vVar.h()) {
                    int i32 = vVar.i(8);
                    int i33 = vVar.i(8);
                    vVar.s(8);
                    iB = ke.b.b(i32);
                    iC = ke.b.c(i33);
                } else {
                    iC = -1;
                }
                f2 = f7;
                i12 = i31;
            } else {
                iL2 = iL2;
                iC = -1;
                f2 = f7;
                i12 = -1;
            }
        } else {
            iL2 = iL2;
            iC = -1;
            f2 = f7;
            i12 = -1;
        }
        return new r(i14, i15, i16, iL3, i25, i26, f2, zH, zH3, iL4, iL5, iL2, z5, iB, i12, iC);
    }

    public static long G(byte[] bArr, int i7) {
        int i10 = bArr[i7];
        int i11 = bArr[i7 + 1];
        int i12 = bArr[i7 + 2];
        int i13 = bArr[i7 + 3];
        if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 128) {
            i10 = (i10 & 127) + IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if ((i11 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 128) {
            i11 = (i11 & 127) + IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if ((i12 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 128) {
            i12 = (i12 & 127) + IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if ((i13 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 128) {
            i13 = (i13 & 127) + IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        return (((long) i10) << 24) + (((long) i11) << 16) + (((long) i12) << 8) + ((long) i13);
    }

    public static long H(byte[] bArr, int i7) {
        long jG = G(bArr, i7);
        long jG2 = G(bArr, i7 + 4);
        if (jG == 0 && jG2 == 0) {
            return 0L;
        }
        return ((jG2 * 1000) / 4294967296L) + ((jG - 2208988800L) * 1000);
    }

    public static String I(int i7, int i10, StringBuilder sb2) {
        int i11;
        int iLastIndexOf;
        if (i7 >= i10) {
            return sb2.toString();
        }
        if (sb2.charAt(i7) == '/') {
            i7++;
        }
        int i12 = i7;
        int i13 = i12;
        while (i12 <= i10) {
            if (i12 == i10) {
                i11 = i12;
            } else if (sb2.charAt(i12) == '/') {
                i11 = i12 + 1;
            } else {
                i12++;
            }
            int i14 = i13 + 1;
            if (i12 == i14 && sb2.charAt(i13) == '.') {
                sb2.delete(i13, i11);
                i10 -= i11 - i13;
            } else {
                if (i12 == i13 + 2 && sb2.charAt(i13) == '.' && sb2.charAt(i14) == '.') {
                    iLastIndexOf = sb2.lastIndexOf("/", i13 - 2) + 1;
                    int i15 = iLastIndexOf > i7 ? iLastIndexOf : i7;
                    sb2.delete(i15, i11);
                    i10 -= i11 - i15;
                } else {
                    iLastIndexOf = i12 + 1;
                }
                i13 = iLastIndexOf;
            }
            i12 = i13;
        }
        return sb2.toString();
    }

    public static String J(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        int[] iArrX = x(str2);
        if (iArrX[0] != -1) {
            sb2.append(str2);
            I(iArrX[1], iArrX[2], sb2);
            return sb2.toString();
        }
        int[] iArrX2 = x(str);
        if (iArrX[3] == 0) {
            sb2.append((CharSequence) str, 0, iArrX2[3]);
            sb2.append(str2);
            return sb2.toString();
        }
        if (iArrX[2] == 0) {
            sb2.append((CharSequence) str, 0, iArrX2[2]);
            sb2.append(str2);
            return sb2.toString();
        }
        int i7 = iArrX[1];
        if (i7 != 0) {
            int i10 = iArrX2[0] + 1;
            sb2.append((CharSequence) str, 0, i10);
            sb2.append(str2);
            return I(iArrX[1] + i10, i10 + iArrX[2], sb2);
        }
        if (str2.charAt(i7) == '/') {
            sb2.append((CharSequence) str, 0, iArrX2[1]);
            sb2.append(str2);
            int i11 = iArrX2[1];
            return I(i11, iArrX[2] + i11, sb2);
        }
        int i12 = iArrX2[0] + 2;
        int i13 = iArrX2[1];
        if (i12 >= i13 || i13 != iArrX2[2]) {
            int iLastIndexOf = str.lastIndexOf(47, iArrX2[2] - 1);
            int i14 = iLastIndexOf == -1 ? iArrX2[1] : iLastIndexOf + 1;
            sb2.append((CharSequence) str, 0, i14);
            sb2.append(str2);
            return I(iArrX2[1], i14 + iArrX[2], sb2);
        }
        sb2.append((CharSequence) str, 0, i13);
        sb2.append('/');
        sb2.append(str2);
        int i15 = iArrX2[1];
        return I(i15, iArrX[2] + i15 + 1, sb2);
    }

    public static Uri K(String str, String str2) {
        return Uri.parse(J(str, str2));
    }

    public static void L(MediaFormat mediaFormat, List list) {
        for (int i7 = 0; i7 < list.size(); i7++) {
            mediaFormat.setByteBuffer(kk.b.h(i7, "csd-"), ByteBuffer.wrap((byte[]) list.get(i7)));
        }
    }

    public static int M(byte[] bArr, int i7) {
        int i10;
        synchronized (f13763f) {
            int i11 = 0;
            int i12 = 0;
            while (i11 < i7) {
                while (true) {
                    if (i11 >= i7 - 2) {
                        i11 = i7;
                        break;
                    }
                    try {
                        if (bArr[i11] == 0 && bArr[i11 + 1] == 0 && bArr[i11 + 2] == 3) {
                            break;
                        }
                        i11++;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (i11 < i7) {
                    int[] iArr = f13764g;
                    if (iArr.length <= i12) {
                        f13764g = Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    f13764g[i12] = i11;
                    i11 += 3;
                    i12++;
                }
            }
            i10 = i7 - i12;
            int i13 = 0;
            int i14 = 0;
            for (int i15 = 0; i15 < i12; i15++) {
                int i16 = f13764g[i15] - i14;
                System.arraycopy(bArr, i14, bArr, i13, i16);
                int i17 = i13 + i16;
                int i18 = i17 + 1;
                bArr[i17] = 0;
                i13 = i17 + 2;
                bArr[i18] = 0;
                i14 += i16 + 3;
            }
            System.arraycopy(bArr, i14, bArr, i13, i10 - i13);
        }
        return i10;
    }

    public static void N(String str, String str2) {
        synchronized (f13760c) {
            Log.w(str, str2);
        }
    }

    public static void O(String str, String str2, Exception exc) {
        N(str, b(str2, exc));
    }

    public static long a() throws UnknownHostException {
        synchronized (f13766i) {
        }
        InetAddress byName = InetAddress.getByName("time.android.com");
        DatagramSocket datagramSocket = new DatagramSocket();
        try {
            datagramSocket.setSoTimeout(10000);
            byte[] bArr = new byte[48];
            DatagramPacket datagramPacket = new DatagramPacket(bArr, 48, byName, 123);
            bArr[0] = 27;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (jCurrentTimeMillis == 0) {
                Arrays.fill(bArr, 40, 48, (byte) 0);
            } else {
                long j5 = jCurrentTimeMillis / 1000;
                long j7 = jCurrentTimeMillis - (j5 * 1000);
                long j10 = j5 + 2208988800L;
                bArr[40] = (byte) (j10 >> 24);
                bArr[41] = (byte) (j10 >> 16);
                bArr[42] = (byte) (j10 >> 8);
                bArr[43] = (byte) j10;
                long j11 = (j7 * 4294967296L) / 1000;
                bArr[44] = (byte) (j11 >> 24);
                bArr[45] = (byte) (j11 >> 16);
                bArr[46] = (byte) (j11 >> 8);
                bArr[47] = (byte) (Math.random() * 255.0d);
            }
            datagramSocket.send(datagramPacket);
            datagramSocket.receive(new DatagramPacket(bArr, 48));
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            long j12 = (jElapsedRealtime2 - jElapsedRealtime) + jCurrentTimeMillis;
            byte b10 = bArr[0];
            int i7 = bArr[1] & 255;
            long jH = H(bArr, 24);
            long jH2 = H(bArr, 32);
            long jH3 = H(bArr, 40);
            n((byte) ((b10 >> 6) & 3), (byte) (b10 & 7), i7, jH3);
            long j13 = (j12 + (((jH3 - j12) + (jH2 - jH)) / 2)) - jElapsedRealtime2;
            datagramSocket.close();
            return j13;
        } catch (Throwable th2) {
            try {
                datagramSocket.close();
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
    }

    public static String b(String str, Throwable th2) {
        String strReplace;
        synchronized (f13760c) {
            try {
                if (th2 != null) {
                    Throwable cause = th2;
                    while (true) {
                        if (cause == null) {
                            strReplace = Log.getStackTraceString(th2).trim().replace("\t", "    ");
                            break;
                        }
                        if (cause instanceof UnknownHostException) {
                            strReplace = "UnknownHostException (no network)";
                            break;
                        }
                        cause = cause.getCause();
                    }
                } else {
                    strReplace = null;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (TextUtils.isEmpty(strReplace)) {
            return str;
        }
        StringBuilder sbO = kk.b.o(str, "\n  ");
        sbO.append(strReplace.replace(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE, "\n  "));
        sbO.append('\n');
        return sbO.toString();
    }

    public static void c(String str) {
        if (e0.f13788a >= 18) {
            Trace.beginSection(str);
        }
    }

    public static void d(int i7, int i10) throws h {
        GLES20.glBindTexture(i7, i10);
        h();
        GLES20.glTexParameteri(i7, 10240, 9729);
        h();
        GLES20.glTexParameteri(i7, 10241, 9729);
        h();
        GLES20.glTexParameteri(i7, 10242, 33071);
        h();
        GLES20.glTexParameteri(i7, 10243, 33071);
        h();
    }

    public static String e(int i7, boolean z5, int i10, int i11, int[] iArr, int i12) {
        Object[] objArr = {f13759b[i7], Integer.valueOf(i10), Integer.valueOf(i11), Character.valueOf(z5 ? 'H' : 'L'), Integer.valueOf(i12)};
        int i13 = e0.f13788a;
        StringBuilder sb2 = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", objArr));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i14 = 0; i14 < length; i14++) {
            sb2.append(String.format(".%02X", Integer.valueOf(iArr[i14])));
        }
        return sb2.toString();
    }

    public static void f(String str, boolean z5) {
        if (!z5) {
            throw new IllegalArgumentException(String.valueOf(str));
        }
    }

    public static void g(boolean z5) {
        if (!z5) {
            throw new IllegalArgumentException();
        }
    }

    public static void h() throws h {
        StringBuilder sb2 = new StringBuilder();
        boolean z5 = false;
        while (true) {
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError == 0) {
                break;
            }
            if (z5) {
                sb2.append('\n');
            }
            sb2.append("glError: ");
            sb2.append(GLU.gluErrorString(iGlGetError));
            z5 = true;
        }
        if (z5) {
            throw new h(sb2.toString());
        }
    }

    public static void i(String str, boolean z5) throws h {
        if (!z5) {
            throw new h(str);
        }
    }

    public static void j(int i7, int i10) {
        if (i7 < 0 || i7 >= i10) {
            throw new IndexOutOfBoundsException();
        }
    }

    public static void k(boolean z5) {
        if (!z5) {
            throw new IllegalStateException();
        }
    }

    public static void l(Object obj) {
        if (obj == null) {
            throw new IllegalStateException();
        }
    }

    public static void m(Object obj, String str) {
        if (obj == null) {
            throw new IllegalStateException(str);
        }
    }

    public static void n(byte b10, byte b11, int i7, long j5) throws IOException {
        if (b10 == 3) {
            throw new IOException("SNTP: Unsynchronized server");
        }
        if (b11 != 4 && b11 != 5) {
            throw new IOException(kk.b.h(b11, "SNTP: Untrusted mode: "));
        }
        if (i7 == 0 || i7 > 15) {
            throw new IOException(kk.b.h(i7, "SNTP: Untrusted stratum: "));
        }
        if (j5 == 0) {
            throw new IOException("SNTP: Zero transmitTime");
        }
    }

    public static void o(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static FloatBuffer p(float[] fArr) {
        return (FloatBuffer) ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr).flip();
    }

    public static void q(String str, String str2) {
        synchronized (f13760c) {
            Log.d(str, str2);
        }
    }

    public static void r(String str, String str2) {
        synchronized (f13760c) {
            Log.e(str, str2);
        }
    }

    public static void s(String str, String str2, Throwable th2) {
        r(str, b(str2, th2));
    }

    public static void t() {
        if (e0.f13788a >= 18) {
            Trace.endSection();
        }
    }

    public static int u(byte[] bArr, int i7, int i10, boolean[] zArr) {
        int i11 = i10 - i7;
        k(i11 >= 0);
        if (i11 == 0) {
            return i10;
        }
        if (zArr[0]) {
            o(zArr);
            return i7 - 3;
        }
        if (i11 > 1 && zArr[1] && bArr[i7] == 1) {
            o(zArr);
            return i7 - 2;
        }
        if (i11 > 2 && zArr[2] && bArr[i7] == 0 && bArr[i7 + 1] == 1) {
            o(zArr);
            return i7 - 1;
        }
        int i12 = i10 - 1;
        int i13 = i7 + 2;
        while (i13 < i12) {
            byte b10 = bArr[i13];
            if ((b10 & 254) == 0) {
                int i14 = i13 - 2;
                if (bArr[i14] == 0 && bArr[i13 - 1] == 0 && b10 == 1) {
                    o(zArr);
                    return i14;
                }
                i13 -= 2;
            }
            i13 += 3;
        }
        zArr[0] = i11 <= 2 ? !(i11 != 2 ? !(zArr[1] && bArr[i12] == 1) : !(zArr[2] && bArr[i10 + (-2)] == 0 && bArr[i12] == 1)) : bArr[i10 + (-3)] == 0 && bArr[i10 + (-2)] == 0 && bArr[i12] == 1;
        zArr[1] = i11 <= 1 ? zArr[2] && bArr[i12] == 0 : bArr[i10 + (-2)] == 0 && bArr[i12] == 0;
        zArr[2] = bArr[i12] == 0;
        return i10;
    }

    public static r0 v(gc.f fVar, ArrayList arrayList) {
        ei.c0 c0Var = ei.e0.f8303e;
        ei.p.c(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i7 = 0;
        int i10 = 0;
        boolean z5 = false;
        while (i7 < arrayList.size()) {
            Bundle bundle = (Bundle) arrayList.get(i7);
            bundle.getClass();
            gc.g gVarB = fVar.b(bundle);
            gVarB.getClass();
            int i11 = i10 + 1;
            if (objArrCopyOf.length < i11) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, ei.y.d(objArrCopyOf.length, i11));
            } else {
                if (z5) {
                    objArrCopyOf = (Object[]) objArrCopyOf.clone();
                }
                objArrCopyOf[i10] = gVarB;
                i7++;
                i10++;
            }
            z5 = false;
            objArrCopyOf[i10] = gVarB;
            i7++;
            i10++;
        }
        return ei.e0.j(i10, objArrCopyOf);
    }

    public static String w(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i7 = 0; i7 < attributeCount; i7++) {
            if (xmlPullParser.getAttributeName(i7).equals(str)) {
                return xmlPullParser.getAttributeValue(i7);
            }
        }
        return null;
    }

    public static int[] x(String str) {
        int iIndexOf;
        int[] iArr = new int[4];
        if (TextUtils.isEmpty(str)) {
            iArr[0] = -1;
            return iArr;
        }
        int length = str.length();
        int iIndexOf2 = str.indexOf(35);
        if (iIndexOf2 != -1) {
            length = iIndexOf2;
        }
        int iIndexOf3 = str.indexOf(63);
        if (iIndexOf3 == -1 || iIndexOf3 > length) {
            iIndexOf3 = length;
        }
        int iIndexOf4 = str.indexOf(47);
        if (iIndexOf4 == -1 || iIndexOf4 > iIndexOf3) {
            iIndexOf4 = iIndexOf3;
        }
        int iIndexOf5 = str.indexOf(58);
        if (iIndexOf5 > iIndexOf4) {
            iIndexOf5 = -1;
        }
        int i7 = iIndexOf5 + 2;
        if (i7 < iIndexOf3 && str.charAt(iIndexOf5 + 1) == '/' && str.charAt(i7) == '/') {
            iIndexOf = str.indexOf(47, iIndexOf5 + 3);
            if (iIndexOf == -1 || iIndexOf > iIndexOf3) {
                iIndexOf = iIndexOf3;
            }
        } else {
            iIndexOf = iIndexOf5 + 1;
        }
        iArr[0] = iIndexOf5;
        iArr[1] = iIndexOf;
        iArr[2] = iIndexOf3;
        iArr[3] = length;
        return iArr;
    }

    public static void y(String str, String str2) {
        synchronized (f13760c) {
            Log.i(str, str2);
        }
    }

    public static int z(String str) {
        String str2 = str;
        if (str2 == null) {
            return -1;
        }
        ArrayList arrayList = o.f13816a;
        switch (str2) {
            case "audio/x-flac":
                str2 = "audio/flac";
                break;
            case "audio/x-wav":
                str2 = "audio/wav";
                break;
            case "audio/mp3":
                str2 = "audio/mpeg";
                break;
        }
        switch (str2) {
            case "audio/eac3-joc":
            case "audio/ac3":
            case "audio/eac3":
                return 0;
            case "video/mp2p":
                return 10;
            case "video/mp2t":
                return 11;
            case "video/webm":
            case "audio/x-matroska":
            case "application/webm":
            case "audio/webm":
            case "video/x-matroska":
                return 6;
            case "audio/amr-wb":
            case "audio/amr":
            case "audio/3gpp":
                return 3;
            case "image/jpeg":
                return 14;
            case "application/mp4":
            case "audio/mp4":
            case "video/mp4":
                return 8;
            case "video/x-msvideo":
                return 16;
            case "text/vtt":
                return 13;
            case "video/x-flv":
                return 5;
            case "audio/ac4":
                return 1;
            case "audio/ogg":
                return 9;
            case "audio/wav":
                return 12;
            case "audio/flac":
                return 4;
            case "audio/midi":
                return 15;
            case "audio/mpeg":
                return 7;
            default:
                return -1;
        }
    }
}

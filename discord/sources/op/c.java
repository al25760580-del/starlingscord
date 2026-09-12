package op;

import a5.b0;
import a5.g;
import ag.o;
import ag.q1;
import ag.s1;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.profileinstaller.ProfileInstallReceiver;
import androidx.recyclerview.widget.h0;
import ci.q;
import com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions;
import com.google.firebase.messaging.r;
import gc.s0;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import np.l;
import np.m;
import vd.f;
import x9.n;
import ze.i;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements l, pa.e, i, ig.d, ca.b, vs.b, f, y2.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f17489d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f17490e;

    public /* synthetic */ c(int i7, Object obj) {
        this.f17489d = i7;
        this.f17490e = obj;
    }

    public static void b(StringBuilder sb2, char[] cArr, char c8) {
        for (int i7 = 0; i7 < sb2.length(); i7++) {
            for (char c10 : cArr) {
                if (sb2.charAt(i7) == c10) {
                    sb2.setCharAt(i7, c8);
                    break;
                }
            }
        }
    }

    public static int g(x9.e eVar) throws ag.b {
        int iOrdinal = eVar.ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        int i7 = 1;
        if (iOrdinal != 1) {
            i7 = 2;
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return 3;
                }
                throw new ag.b("Invalid DateStyle: ".concat(eVar.toString()), 9);
            }
        }
        return i7;
    }

    public static int k(n nVar) throws ag.b {
        int iOrdinal = nVar.ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        int i7 = 1;
        if (iOrdinal != 1) {
            i7 = 2;
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return 3;
                }
                throw new ag.b("Invalid DateStyle: ".concat(nVar.toString()), 9);
            }
        }
        return i7;
    }

    @Override // np.l
    public l F(up.b bVar, up.e eVar) {
        return null;
    }

    @Override // np.l
    public void M(up.e eVar, Object obj) {
        e eVar2 = (e) this.f17490e;
        String strB = eVar.b();
        if ("k".equals(strB)) {
            if (obj instanceof Integer) {
                a.f17480e.getClass();
                a aVar = (a) a.f17481i.get((Integer) obj);
                if (aVar == null) {
                    aVar = a.UNKNOWN;
                }
                eVar2.f17499y = aVar;
                return;
            }
            return;
        }
        if ("mv".equals(strB)) {
            if (obj instanceof int[]) {
                eVar2.f17493d = (int[]) obj;
            }
        } else {
            if ("xs".equals(strB)) {
                if (obj instanceof String) {
                    String str = (String) obj;
                    if (str.isEmpty()) {
                        return;
                    }
                    eVar2.f17494e = str;
                    return;
                }
                return;
            }
            if (!"xi".equals(strB)) {
                "pn".equals(strB);
            } else if (obj instanceof Integer) {
                eVar2.f17495i = ((Integer) obj).intValue();
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:493:0x03c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:501:? A[LOOP:15: B:204:0x035b->B:501:?, LOOP_END, SYNTHETIC] */
    public s0 a(mj.b bVar) throws ij.b, ij.d {
        byte[] bArr;
        int i7;
        int iG;
        int i10;
        int iG2;
        int iG3;
        n8.f fVar = new n8.f(bVar);
        qj.b bVar2 = (qj.b) fVar.f16511i;
        mj.b bVar3 = (mj.b) fVar.f16512v;
        int i11 = bVar2.f18913g;
        byte[] bArr2 = new byte[i11];
        mj.b bVar4 = (mj.b) fVar.f16510e;
        int i12 = bVar4.f15840e;
        int i13 = bVar4.f15839d;
        int i14 = 0;
        int i15 = 0;
        boolean z5 = false;
        int i16 = 0;
        boolean z6 = false;
        boolean z7 = false;
        boolean z10 = false;
        int i17 = 4;
        while (true) {
            if (i17 == i12 && i15 == 0 && !z5) {
                int i18 = i16 + 1;
                int i19 = i12 - 1;
                int i20 = (fVar.e0(i19, i14, i12, i13) ? 1 : 0) << 1;
                if (fVar.e0(i19, 1, i12, i13)) {
                    i20 |= 1;
                }
                int i21 = i20 << 1;
                if (fVar.e0(i19, 2, i12, i13)) {
                    i21 |= 1;
                }
                int i22 = i21 << 1;
                bArr = bArr2;
                if (fVar.e0(0, i13 - 2, i12, i13)) {
                    i22 |= 1;
                }
                int i23 = i22 << 1;
                int i24 = i13 - 1;
                if (fVar.e0(0, i24, i12, i13)) {
                    i23 |= 1;
                }
                int i25 = i23 << 1;
                if (fVar.e0(1, i24, i12, i13)) {
                    i25 |= 1;
                }
                int i26 = i25 << 1;
                if (fVar.e0(2, i24, i12, i13)) {
                    i26 |= 1;
                }
                int i27 = i26 << 1;
                if (fVar.e0(3, i24, i12, i13)) {
                    i27 |= 1;
                }
                bArr[i16] = (byte) i27;
                i17 -= 2;
                i15 += 2;
                i16 = i18;
                z5 = true;
            } else {
                bArr = bArr2;
                int i28 = i12 - 2;
                if (i17 == i28 && i15 == 0 && (i13 & 3) != 0 && !z6) {
                    int i29 = i16 + 1;
                    int i30 = (fVar.e0(i12 + (-3), 0, i12, i13) ? 1 : 0) << 1;
                    if (fVar.e0(i28, 0, i12, i13)) {
                        i30 |= 1;
                    }
                    int i31 = i30 << 1;
                    if (fVar.e0(i12 - 1, 0, i12, i13)) {
                        i31 |= 1;
                    }
                    int i32 = i31 << 1;
                    if (fVar.e0(0, i13 - 4, i12, i13)) {
                        i32 |= 1;
                    }
                    int i33 = i32 << 1;
                    if (fVar.e0(0, i13 - 3, i12, i13)) {
                        i33 |= 1;
                    }
                    int i34 = i33 << 1;
                    if (fVar.e0(0, i13 - 2, i12, i13)) {
                        i34 |= 1;
                    }
                    int i35 = i34 << 1;
                    int i36 = i13 - 1;
                    if (fVar.e0(0, i36, i12, i13)) {
                        i35 |= 1;
                    }
                    int i37 = i35 << 1;
                    if (fVar.e0(1, i36, i12, i13)) {
                        i37 |= 1;
                    }
                    bArr[i16] = (byte) i37;
                    i17 -= 2;
                    i15 += 2;
                    i16 = i29;
                    z6 = true;
                } else if (i17 == i12 + 4 && i15 == 2 && (i13 & 7) == 0 && !z7) {
                    int i38 = i16 + 1;
                    int i39 = i12 - 1;
                    int i40 = (fVar.e0(i39, 0, i12, i13) ? 1 : 0) << 1;
                    int i41 = i13 - 1;
                    if (fVar.e0(i39, i41, i12, i13)) {
                        i40 |= 1;
                    }
                    int i42 = i40 << 1;
                    int i43 = i13 - 3;
                    if (fVar.e0(0, i43, i12, i13)) {
                        i42 |= 1;
                    }
                    int i44 = i42 << 1;
                    int i45 = i13 - 2;
                    if (fVar.e0(0, i45, i12, i13)) {
                        i44 |= 1;
                    }
                    int i46 = i44 << 1;
                    if (fVar.e0(0, i41, i12, i13)) {
                        i46 |= 1;
                    }
                    int i47 = i46 << 1;
                    int i48 = (fVar.e0(1, i43, i12, i13) ? i47 | 1 : i47) << 1;
                    if (fVar.e0(1, i45, i12, i13)) {
                        i48 |= 1;
                    }
                    int i49 = i48 << 1;
                    if (fVar.e0(1, i41, i12, i13)) {
                        i49 |= 1;
                    }
                    bArr[i16] = (byte) i49;
                    i17 -= 2;
                    i15 += 2;
                    i16 = i38;
                    z7 = true;
                } else if (i17 == i28 && i15 == 0 && (i13 & 7) == 4 && !z10) {
                    int i50 = i16 + 1;
                    int i51 = (fVar.e0(i12 + (-3), 0, i12, i13) ? 1 : 0) << 1;
                    if (fVar.e0(i28, 0, i12, i13)) {
                        i51 |= 1;
                    }
                    int i52 = i51 << 1;
                    if (fVar.e0(i12 - 1, 0, i12, i13)) {
                        i52 |= 1;
                    }
                    int i53 = i52 << 1;
                    if (fVar.e0(0, i13 - 2, i12, i13)) {
                        i53 |= 1;
                    }
                    int i54 = i53 << 1;
                    int i55 = i13 - 1;
                    if (fVar.e0(0, i55, i12, i13)) {
                        i54 |= 1;
                    }
                    int i56 = i54 << 1;
                    if (fVar.e0(1, i55, i12, i13)) {
                        i56 |= 1;
                    }
                    int i57 = i56 << 1;
                    if (fVar.e0(2, i55, i12, i13)) {
                        i57 |= 1;
                    }
                    int i58 = i57 << 1;
                    if (fVar.e0(3, i55, i12, i13)) {
                        i58 |= 1;
                    }
                    bArr[i16] = (byte) i58;
                    i17 -= 2;
                    i15 += 2;
                    i16 = i50;
                    z10 = true;
                } else {
                    while (true) {
                        if (i17 < i12 && i15 >= 0 && !bVar3.b(i15, i17)) {
                            bArr[i16] = (byte) fVar.f0(i17, i15, i12, i13);
                            i16++;
                        }
                        int i59 = i17 - 2;
                        int i60 = i15 + 2;
                        if (i59 < 0 || i60 >= i13) {
                            break;
                        }
                        i17 = i59;
                        i15 = i60;
                    }
                    int i61 = i17 - 1;
                    int i62 = i15 + 5;
                    while (true) {
                        if (i61 >= 0 && i62 < i13 && !bVar3.b(i62, i61)) {
                            bArr[i16] = (byte) fVar.f0(i61, i62, i12, i13);
                            i16++;
                        }
                        int i63 = i61 + 2;
                        int i64 = i62 - 2;
                        if (i63 >= i12 || i64 < 0) {
                            break;
                        }
                        i61 = i63;
                        i62 = i64;
                    }
                    i17 = i61 + 5;
                    i15 = i62 - 1;
                }
            }
            if (i17 >= i12 && i15 >= i13) {
                break;
            }
            i14 = 0;
            bArr2 = bArr;
        }
        if (i16 != bVar2.f18913g) {
            throw ij.d.a();
        }
        b0 b0Var = bVar2.f18912f;
        c5.e[] eVarArr = (c5.e[]) b0Var.f174i;
        int i65 = b0Var.f173e;
        int i66 = 0;
        for (c5.e eVar : eVarArr) {
            i66 += eVar.f3485b;
        }
        dk.a[] aVarArr = new dk.a[i66];
        int i67 = 0;
        for (c5.e eVar2 : eVarArr) {
            int i68 = 0;
            while (i68 < eVar2.f3485b) {
                int i69 = eVar2.f3486c;
                aVarArr[i67] = new dk.a(new byte[i65 + i69], i69);
                i68++;
                i67++;
            }
        }
        int length = aVarArr[0].f7651b.length - i65;
        int i70 = length - 1;
        int i71 = 0;
        for (int i72 = 0; i72 < i70; i72++) {
            int i73 = 0;
            while (i73 < i67) {
                aVarArr[i73].f7651b[i72] = bArr[i71];
                i73++;
                i71++;
            }
        }
        boolean z11 = bVar2.f18907a == 24;
        int i74 = 8;
        int i75 = z11 ? 8 : i67;
        int i76 = 0;
        while (i76 < i75) {
            aVarArr[i76].f7651b[i70] = bArr[i71];
            i76++;
            i71++;
        }
        int length2 = aVarArr[0].f7651b.length;
        while (true) {
            i7 = 7;
            if (length >= length2) {
                break;
            }
            int i77 = 0;
            while (i77 < i67) {
                int i78 = z11 ? (i77 + 8) % i67 : i77;
                aVarArr[i78].f7651b[(!z11 || i78 <= 7) ? length : length - 1] = bArr[i71];
                i77++;
                i71++;
            }
            length++;
        }
        if (i71 != i11) {
            throw new IllegalArgumentException();
        }
        int i79 = 0;
        for (int i80 = 0; i80 < i66; i80++) {
            i79 += aVarArr[i80].f7650a;
        }
        byte[] bArr3 = new byte[i79];
        for (int i81 = 0; i81 < i66; i81++) {
            dk.a aVar = aVarArr[i81];
            byte[] bArr4 = aVar.f7651b;
            int i82 = aVar.f7650a;
            int length3 = bArr4.length;
            int[] iArr = new int[length3];
            for (int i83 = 0; i83 < length3; i83++) {
                iArr[i83] = bArr4[i83] & 255;
            }
            try {
                ((ue.i) this.f17490e).h(bArr4.length - i82, iArr);
                for (int i84 = 0; i84 < i82; i84++) {
                    bArr4[i84] = (byte) iArr[i84];
                }
                for (int i85 = 0; i85 < i82; i85++) {
                    bArr3[(i85 * i66) + i81] = bArr4[i85];
                }
            } catch (oj.b unused) {
                throw ij.b.a();
            }
        }
        g gVar = new g(bArr3);
        StringBuilder sb2 = new StringBuilder(100);
        StringBuilder sb3 = new StringBuilder(0);
        ArrayList arrayList = new ArrayList(1);
        int i86 = 2;
        while (true) {
            int i87 = 6;
            if (i86 == 2) {
                boolean z12 = false;
                while (true) {
                    int iG4 = gVar.g(i74);
                    if (iG4 == 0) {
                        throw ij.d.a();
                    }
                    if (iG4 <= 128) {
                        if (z12) {
                            iG4 += IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                        }
                        sb2.append((char) (iG4 - 1));
                        i87 = 2;
                    } else if (iG4 == 129) {
                        i87 = 1;
                    } else {
                        if (iG4 > 229) {
                            switch (iG4) {
                                case 230:
                                    i87 = 3;
                                    break;
                                case 231:
                                    i87 = i7;
                                    break;
                                case 232:
                                    sb2.append((char) 29);
                                    if (gVar.d() <= 0) {
                                        i87 = 2;
                                    }
                                    break;
                                case 233:
                                case 234:
                                case 241:
                                    break;
                                case 235:
                                    z12 = true;
                                    if (gVar.d() <= 0) {
                                        i87 = 2;
                                    }
                                    break;
                                case 236:
                                    sb2.append("[)>\u001e05\u001d");
                                    sb3.insert(0, "\u001e\u0004");
                                    if (gVar.d() <= 0) {
                                        i87 = 2;
                                    }
                                    break;
                                case 237:
                                    sb2.append("[)>\u001e06\u001d");
                                    sb3.insert(0, "\u001e\u0004");
                                    if (gVar.d() <= 0) {
                                        i87 = 2;
                                    }
                                    break;
                                case 238:
                                    i87 = 5;
                                    break;
                                case 239:
                                    i87 = 4;
                                    break;
                                case 240:
                                    break;
                                default:
                                    if (iG4 != 254 || gVar.d() != 0) {
                                        throw ij.d.a();
                                    }
                                    break;
                            }
                        } else {
                            int i88 = iG4 - 130;
                            if (i88 < 10) {
                                sb2.append('0');
                            }
                            sb2.append(i88);
                        }
                        if (gVar.d() <= 0) {
                            i87 = 2;
                        }
                    }
                }
                i86 = i87;
            } else {
                int iB = f0.e.b(i86);
                if (iB == 2) {
                    int i89 = 3;
                    int[] iArr2 = new int[3];
                    boolean z13 = false;
                    int i90 = 0;
                    while (true) {
                        if (gVar.d() != 8 && (iG = gVar.g(8)) != 254) {
                            qj.a.a(iG, gVar.g(8), iArr2);
                            int i91 = i90;
                            boolean z14 = z13;
                            int i92 = 0;
                            while (i92 < i89) {
                                int i93 = iArr2[i92];
                                if (i91 != 0) {
                                    if (i91 != 1) {
                                        if (i91 != 2) {
                                            if (i91 != i89) {
                                                throw ij.d.a();
                                            }
                                            if (z14) {
                                                sb2.append((char) (i93 + 224));
                                                z14 = false;
                                            } else {
                                                sb2.append((char) (i93 + 96));
                                            }
                                        } else if (i93 < 27) {
                                            char c8 = qj.a.f18902b[i93];
                                            if (z14) {
                                                sb2.append((char) (c8 + 128));
                                                z14 = false;
                                            } else {
                                                sb2.append(c8);
                                            }
                                        } else if (i93 == 27) {
                                            sb2.append((char) 29);
                                        } else {
                                            if (i93 != 30) {
                                                throw ij.d.a();
                                            }
                                            z14 = true;
                                        }
                                    } else if (z14) {
                                        sb2.append((char) (i93 + IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT));
                                        z14 = false;
                                    } else {
                                        sb2.append((char) i93);
                                    }
                                    i91 = 0;
                                } else if (i93 < i89) {
                                    i91 = i93 + 1;
                                } else {
                                    if (i93 >= 40) {
                                        throw ij.d.a();
                                    }
                                    char c10 = qj.a.f18901a[i93];
                                    if (z14) {
                                        sb2.append((char) (c10 + 128));
                                        z14 = false;
                                    } else {
                                        sb2.append(c10);
                                    }
                                }
                                i92++;
                                i89 = 3;
                            }
                            i10 = 2;
                            if (gVar.d() > 0) {
                                z13 = z14;
                                i90 = i91;
                                i89 = 3;
                            }
                        }
                    }
                    i86 = i10;
                } else if (iB == 3) {
                    int i94 = 3;
                    int[] iArr3 = new int[3];
                    boolean z15 = false;
                    int i95 = 0;
                    for (int i96 = 254; gVar.d() != i74 && (iG2 = gVar.g(i74)) != i96; i96 = 254) {
                        qj.a.a(iG2, gVar.g(i74), iArr3);
                        int i97 = i95;
                        int i98 = 0;
                        while (i98 < i94) {
                            int i99 = iArr3[i98];
                            if (i97 != 0) {
                                if (i97 != 1) {
                                    if (i97 != 2) {
                                        if (i97 != i94) {
                                            throw ij.d.a();
                                        }
                                        if (i99 >= 32) {
                                            throw ij.d.a();
                                        }
                                        char c11 = qj.a.f18905e[i99];
                                        if (z15) {
                                            sb2.append((char) (c11 + 128));
                                            z15 = false;
                                        } else {
                                            sb2.append(c11);
                                        }
                                    } else if (i99 < 27) {
                                        char c12 = qj.a.f18904d[i99];
                                        if (z15) {
                                            sb2.append((char) (c12 + 128));
                                            z15 = false;
                                        } else {
                                            sb2.append(c12);
                                        }
                                    } else if (i99 == 27) {
                                        sb2.append((char) 29);
                                    } else {
                                        if (i99 != 30) {
                                            throw ij.d.a();
                                        }
                                        z15 = true;
                                    }
                                } else if (z15) {
                                    sb2.append((char) (i99 + IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT));
                                    z15 = false;
                                } else {
                                    sb2.append((char) i99);
                                }
                                i97 = 0;
                            } else if (i99 < i94) {
                                i97 = i99 + 1;
                            } else {
                                if (i99 >= 40) {
                                    throw ij.d.a();
                                }
                                char c13 = qj.a.f18903c[i99];
                                if (z15) {
                                    sb2.append((char) (c13 + 128));
                                    z15 = false;
                                } else {
                                    sb2.append(c13);
                                }
                            }
                            i98++;
                            i94 = 3;
                        }
                        if (gVar.d() > 0) {
                            i95 = i97;
                            i74 = 8;
                            i94 = 3;
                        }
                    }
                } else if (iB == 4) {
                    int i100 = 3;
                    int[] iArr4 = new int[3];
                    while (gVar.d() != i74 && (iG3 = gVar.g(i74)) != 254) {
                        qj.a.a(iG3, gVar.g(i74), iArr4);
                        int i101 = 0;
                        while (i101 < i100) {
                            int i102 = iArr4[i101];
                            if (i102 == 0) {
                                sb2.append('\r');
                            } else if (i102 == 1) {
                                sb2.append('*');
                            } else if (i102 == 2) {
                                sb2.append('>');
                            } else if (i102 == i100) {
                                sb2.append(' ');
                            } else if (i102 < 14) {
                                sb2.append((char) (i102 + 44));
                            } else {
                                if (i102 >= 40) {
                                    throw ij.d.a();
                                }
                                sb2.append((char) (i102 + 51));
                            }
                            i101++;
                            i100 = 3;
                        }
                        if (gVar.d() > 0) {
                            i100 = 3;
                        }
                    }
                } else if (iB == 5) {
                    while (gVar.d() > 16) {
                        int i103 = 0;
                        while (true) {
                            if (i103 < 4) {
                                int iG5 = gVar.g(6);
                                if (iG5 == 31) {
                                    int i104 = 8 - gVar.f185e;
                                    if (i104 != i74) {
                                        gVar.g(i104);
                                    }
                                } else {
                                    if ((iG5 & 32) == 0) {
                                        iG5 |= 64;
                                    }
                                    sb2.append((char) iG5);
                                    i103++;
                                }
                            } else if (gVar.d() <= 0) {
                            }
                        }
                    }
                } else {
                    if (iB != 6) {
                        throw ij.d.a();
                    }
                    int i105 = gVar.f184d;
                    int i106 = i105 + 2;
                    int iB2 = qj.a.b(gVar.g(i74), i105 + 1);
                    if (iB2 == 0) {
                        iB2 = gVar.d() / 8;
                    } else if (iB2 >= 250) {
                        iB2 = ((iB2 - 249) * h0.DEFAULT_SWIPE_ANIMATION_DURATION) + qj.a.b(gVar.g(i74), i106);
                        i106 = i105 + 3;
                    }
                    if (iB2 < 0) {
                        throw ij.d.a();
                    }
                    byte[] bArr5 = new byte[iB2];
                    int i107 = 0;
                    while (i107 < iB2) {
                        if (gVar.d() < i74) {
                            throw ij.d.a();
                        }
                        bArr5[i107] = (byte) qj.a.b(gVar.g(i74), i106);
                        i107++;
                        i106++;
                    }
                    arrayList.add(bArr5);
                    try {
                        sb2.append(new String(bArr5, "ISO8859_1"));
                    } catch (UnsupportedEncodingException e10) {
                        throw new IllegalStateException("Platform does not support required encoding: ".concat(String.valueOf(e10)));
                    }
                }
                i10 = 2;
                i86 = i10;
            }
            if (i86 == 1 || gVar.d() <= 0) {
                if (sb3.length() > 0) {
                    sb2.append((CharSequence) sb3);
                }
                String string = sb2.toString();
                if (arrayList.isEmpty()) {
                    arrayList = null;
                }
                return new s0(bArr3, string, arrayList, null);
            }
            i74 = 8;
            i7 = 7;
        }
    }

    @Override // ze.i
    public void accept(Object obj, Object obj2) {
        switch (this.f17489d) {
            case 3:
                pf.c cVar = new pf.c((ig.g) obj2, 1);
                s1 s1Var = (s1) ((q1) obj).o();
                PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions = (PublicKeyCredentialRequestOptions) this.f17490e;
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.writeInterfaceToken(s1Var.f578g);
                int i7 = o.f552a;
                parcelObtain.writeStrongBinder(cVar);
                if (publicKeyCredentialRequestOptions == null) {
                    parcelObtain.writeInt(0);
                } else {
                    parcelObtain.writeInt(1);
                    publicKeyCredentialRequestOptions.writeToParcel(parcelObtain, 0);
                }
                s1Var.j(2, parcelObtain);
                break;
            default:
                ue.l lVar = new ue.l((ig.g) obj2);
                uf.i iVar = (uf.i) ((uf.c) obj).o();
                re.e eVar = (re.e) this.f17490e;
                Parcel parcelR = iVar.r();
                int i10 = uf.f.f21125a;
                parcelR.writeStrongBinder(lVar);
                uf.f.c(parcelR, eVar);
                iVar.s(1, parcelR);
                break;
        }
    }

    @Override // y2.b
    public void c() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // vs.b
    public FileChannel d() throws IOException {
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) this.f17490e;
        if (parcelFileDescriptor.getStatSize() != -1) {
            return new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor).getChannel();
        }
        parcelFileDescriptor.close();
        throw new IllegalArgumentException("Not a file: ".concat(String.valueOf(parcelFileDescriptor)));
    }

    @Override // ca.b
    public ca.a e(r rVar, Rect rect) {
        AnimatedFactoryV2Impl animatedFactoryV2Impl = (AnimatedFactoryV2Impl) this.f17490e;
        if (animatedFactoryV2Impl.f4738g == null) {
            animatedFactoryV2Impl.f4738g = new i8.b(5);
        }
        return new ca.a(animatedFactoryV2Impl.f4738g, rVar, rect, animatedFactoryV2Impl.f4735d);
    }

    @Override // vd.f
    public int f(long j) {
        return j < 0 ? 0 : -1;
    }

    @Override // q8.d
    public Object get(int i7) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1, (int) Math.ceil(((double) i7) / 2.0d), Bitmap.Config.RGB_565);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        ((Set) this.f17490e).add(bitmapCreateBitmap);
        return bitmapCreateBitmap;
    }

    @Override // vd.f
    public long h(int i7) {
        je.b.g(i7 == 0);
        return 0L;
    }

    @Override // y2.b
    public void j(int i7, Object obj) {
        String str;
        switch (i7) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i7 == 6 || i7 == 7 || i7 == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.f17490e).setResultCode(i7);
    }

    @Override // vd.f
    public List l(long j) {
        return j >= 0 ? (List) this.f17490e : Collections.EMPTY_LIST;
    }

    @Override // np.l
    public m m(up.e eVar) {
        String strB = eVar.b();
        if ("d1".equals(strB)) {
            return new b(this, 0);
        }
        if ("d2".equals(strB)) {
            return new b(this, 1);
        }
        return null;
    }

    @Override // vd.f
    public int o() {
        return 1;
    }

    @Override // ig.d
    public void onSuccess(Object obj) {
        ((sh.m) this.f17490e).f();
    }

    @Override // r8.c
    public void release(Object obj) {
        Bitmap value = (Bitmap) obj;
        Intrinsics.checkNotNullParameter(value, "value");
        ((Set) this.f17490e).remove(value);
        value.recycle();
    }

    public /* synthetic */ c(ye.i iVar, bf.a aVar, int i7) {
        this.f17489d = i7;
        this.f17490e = aVar;
    }

    public c(Context context) {
        this.f17489d = 13;
        q qVar = new q(context);
        this.f17490e = ci.o.b(new po.d(7, ci.o.b(new io.sentry.internal.debugmeta.c(qVar, ci.o.b(wh.c.f22267b), new i8.c(qVar, wh.c.f22268c)))));
    }

    public c(int i7) {
        this.f17489d = i7;
        switch (i7) {
            case 4:
                this.f17490e = new ue.i(oj.a.f17264m);
                break;
            case 14:
                break;
            default:
                Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
                Intrinsics.checkNotNullExpressionValue(setNewSetFromMap, "newIdentityHashSet(...)");
                this.f17490e = setNewSetFromMap;
                break;
        }
    }

    @Override // np.l
    public void i() {
    }

    @Override // np.l
    public void K(up.e eVar, zp.f fVar) {
    }

    @Override // np.l
    public void G(up.e eVar, up.b bVar, up.e eVar2) {
    }
}

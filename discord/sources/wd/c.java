package wd;

import androidx.recyclerview.widget.h0;
import com.discord.chat.presentation.message.view.MediaImageViewKt;
import com.discord.media.engine.MediaEngine;
import com.discord.misc.utilities.chat_view_types.ChatViewRecyclerTypes;
import com.facebook.imageutils.JfifUtil;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import je.w;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.LongCompanionObject;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends h {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f22137h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f22138i;
    public final int j;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public List f22141n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public List f22142o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f22143p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f22144q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f22145r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f22146s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public byte f22147t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public byte f22148u;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f22150w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f22151x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int[] f22134y = {11, 1, 3, 12, 14, 5, 7, 9};

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int[] f22135z = {0, 4, 8, 12, 16, 20, 24, 28};
    public static final int[] A = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};
    public static final int[] B = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, JfifUtil.MARKER_APP1, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, h0.DEFAULT_SWIPE_ANIMATION_DURATION, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, MediaEngine.MAX_SUPPORTED_PROTOCOL_VERSION, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};
    public static final int[] C = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};
    public static final int[] D = {193, 201, 211, JfifUtil.MARKER_SOS, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, JfifUtil.MARKER_SOFn, 194, 199, h0.DEFAULT_DRAG_ANIMATION_DURATION, 202, 203, 235, 206, 207, 239, MediaImageViewKt.OBSCURED_IMAGE_MIN_HEIGHT, JfifUtil.MARKER_EOI, 249, 219, 171, 187};
    public static final int[] E = {195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, JfifUtil.MARKER_SOI, 248, 9484, 9488, 9492, 9496};
    public static final boolean[] F = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w f22136g = new w();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f22139l = new ArrayList();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public b f22140m = new b(0, 4);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f22149v = 0;
    public final long k = 16000000;

    public c(String str, int i7) {
        this.f22137h = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i7 == 1) {
            this.j = 0;
            this.f22138i = 0;
        } else if (i7 == 2) {
            this.j = 1;
            this.f22138i = 0;
        } else if (i7 == 3) {
            this.j = 0;
            this.f22138i = 1;
        } else if (i7 != 4) {
            je.b.N("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
            this.j = 0;
            this.f22138i = 0;
        } else {
            this.j = 1;
            this.f22138i = 1;
        }
        k(0);
        j();
        this.f22150w = true;
        this.f22151x = -9223372036854775807L;
    }

    @Override // wd.h
    public final op.c e() {
        List list = this.f22141n;
        this.f22142o = list;
        list.getClass();
        return new op.c(12, list);
    }

    /* JADX WARN: Code duplicated, block: B:121:0x019a  */
    /* JADX WARN: Code duplicated, block: B:123:0x01a0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:127:0x01ae A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:128:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:131:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:133:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:134:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:137:0x01c3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:138:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:140:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:141:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:142:0x01da  */
    /* JADX WARN: Code duplicated, block: B:143:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:148:0x0207 A[LOOP:1: B:146:0x0201->B:148:0x0207, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:149:0x020b  */
    /* JADX WARN: Code duplicated, block: B:151:0x0211 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:152:0x0213  */
    /* JADX WARN: Code duplicated, block: B:153:0x0218  */
    /* JADX WARN: Code duplicated, block: B:154:0x021f  */
    /* JADX WARN: Code duplicated, block: B:155:0x022a  */
    /* JADX WARN: Code duplicated, block: B:156:0x0235  */
    /* JADX WARN: Code duplicated, block: B:157:0x0240  */
    /* JADX WARN: Code duplicated, block: B:158:0x0245  */
    /* JADX WARN: Code duplicated, block: B:159:0x024a  */
    /* JADX WARN: Code duplicated, block: B:161:0x025b  */
    /* JADX WARN: Code duplicated, block: B:179:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:180:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:181:0x007e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:182:0x00ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:183:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:188:0x0014 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:189:0x0014 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:191:0x0014 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0059  */
    /* JADX WARN: Code duplicated, block: B:49:0x0092  */
    /* JADX WARN: Code duplicated, block: B:51:0x0096  */
    /* JADX WARN: Code duplicated, block: B:52:0x0098  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a6 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:64:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:75:0x00de  */
    /* JADX WARN: Code duplicated, block: B:83:0x0100 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x0102  */
    /* JADX WARN: Code duplicated, block: B:91:0x012a  */
    /* JADX WARN: Code duplicated, block: B:93:0x012e  */
    @Override // wd.h
    public final void f(g gVar) {
        boolean z5;
        int i7;
        int[] iArr;
        int i10;
        int i11;
        int i12;
        ArrayList arrayList;
        int iMin;
        ByteBuffer byteBuffer = gVar.f15010v;
        byteBuffer.getClass();
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        w wVar = this.f22136g;
        wVar.D(bArrArray, iLimit);
        boolean z6 = false;
        while (true) {
            int iA = wVar.a();
            int i13 = this.f22137h;
            if (iA < i13) {
                if (z6) {
                    int i14 = this.f22143p;
                    if (i14 == 1 || i14 == 3) {
                        this.f22141n = i();
                        this.f22151x = this.f22191e;
                        return;
                    }
                    return;
                }
                return;
            }
            int iU = i13 == 2 ? -4 : wVar.u();
            int iU2 = wVar.u();
            int iU3 = wVar.u();
            if ((iU & 2) == 0 && (iU & 1) == this.f22138i) {
                byte b10 = (byte) (iU2 & 127);
                byte b11 = (byte) (iU3 & 127);
                if (b10 != 0 || b11 != 0) {
                    boolean z7 = this.f22145r;
                    if ((iU & 4) == 4) {
                        boolean[] zArr = F;
                        if (zArr[iU2] && zArr[iU3]) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                    } else {
                        z5 = false;
                    }
                    this.f22145r = z5;
                    if (!z5 || (b10 & 240) != 16) {
                        this.f22146s = false;
                        if (!z5) {
                            if (1 > b10 && b10 <= 15) {
                                this.f22150w = false;
                            } else if ((b10 & 246) == 20) {
                                if (b11 == 32 && b11 != 47) {
                                    switch (b11) {
                                        default:
                                            switch (b11) {
                                                case 42:
                                                case ChatViewRecyclerTypes.FORWARD_HEADER /* 43 */:
                                                    this.f22150w = false;
                                                    break;
                                            }
                                        case ChatViewRecyclerTypes.POLL_TEXT_AND_IMAGE /* 37 */:
                                        case ChatViewRecyclerTypes.POLL_IMAGE_ONLY /* 38 */:
                                        case ChatViewRecyclerTypes.SAFETY_SYSTEM_NOTIFICATION /* 39 */:
                                            this.f22150w = true;
                                            break;
                                    }
                                } else {
                                    this.f22150w = true;
                                }
                            }
                            if (this.f22150w) {
                                i7 = b10 & 224;
                                if (i7 == 0) {
                                    this.f22149v = (b10 >> 3) & 1;
                                }
                                if (this.f22149v != this.j) {
                                    if (i7 == 0) {
                                        i10 = b10 & 247;
                                        if (i10 == 17 || (b11 & 240) != 48) {
                                            i11 = b10 & 246;
                                            if (i11 != 18 && (b11 & 224) == 32) {
                                                this.f22140m.b();
                                                this.f22140m.a((char) ((b10 & 1) == 0 ? D[b11 & 31] : E[b11 & 31]));
                                            } else if (i10 != 17 && (b11 & 240) == 32) {
                                                this.f22140m.a(' ');
                                                boolean z10 = (b11 & 1) == 1;
                                                b bVar = this.f22140m;
                                                bVar.f22126a.add(new a((b11 >> 1) & 7, bVar.f22128c.length(), z10));
                                            } else if ((b10 & 240) != 16 && (b11 & 192) == 64) {
                                                int i15 = f22134y[b10 & 7];
                                                if ((b11 & 32) != 0) {
                                                    i15++;
                                                }
                                                b bVar2 = this.f22140m;
                                                if (i15 != bVar2.f22129d) {
                                                    if (this.f22143p != 1 && !bVar2.e()) {
                                                        b bVar3 = new b(this.f22143p, this.f22144q);
                                                        this.f22140m = bVar3;
                                                        this.f22139l.add(bVar3);
                                                    }
                                                    this.f22140m.f22129d = i15;
                                                }
                                                boolean z11 = (b11 & 16) == 16;
                                                boolean z12 = (b11 & 1) == 1;
                                                int i16 = (b11 >> 1) & 7;
                                                b bVar4 = this.f22140m;
                                                bVar4.f22126a.add(new a(z11 ? 8 : i16, bVar4.f22128c.length(), z12));
                                                if (z11) {
                                                    this.f22140m.f22130e = f22135z[i16];
                                                }
                                            } else if (i10 != 23 && b11 >= 33 && b11 <= 35) {
                                                this.f22140m.f22131f = b11 - 32;
                                            } else if (i11 == 20 && (b11 & 240) == 32) {
                                                if (b11 == 32) {
                                                    k(2);
                                                } else if (b11 != 41) {
                                                    switch (b11) {
                                                        case ChatViewRecyclerTypes.POLL_TEXT_AND_IMAGE /* 37 */:
                                                            k(1);
                                                            this.f22144q = 2;
                                                            this.f22140m.f22133h = 2;
                                                            break;
                                                        case ChatViewRecyclerTypes.POLL_IMAGE_ONLY /* 38 */:
                                                            k(1);
                                                            this.f22144q = 3;
                                                            this.f22140m.f22133h = 3;
                                                            break;
                                                        case ChatViewRecyclerTypes.SAFETY_SYSTEM_NOTIFICATION /* 39 */:
                                                            k(1);
                                                            this.f22144q = 4;
                                                            this.f22140m.f22133h = 4;
                                                            break;
                                                        default:
                                                            i12 = this.f22143p;
                                                            if (i12 != 0) {
                                                                if (b11 != 33) {
                                                                    switch (b11) {
                                                                        case ChatViewRecyclerTypes.FORWARD_BREADCRUMB /* 44 */:
                                                                            this.f22141n = Collections.EMPTY_LIST;
                                                                            if (i12 != 1 || i12 == 3) {
                                                                                j();
                                                                            }
                                                                            break;
                                                                        case ChatViewRecyclerTypes.REACTION_BURST_REACTION /* 45 */:
                                                                            if (i12 == 1 && !this.f22140m.e()) {
                                                                                b bVar5 = this.f22140m;
                                                                                arrayList = bVar5.f22127b;
                                                                                arrayList.add(bVar5.d());
                                                                                bVar5.f22128c.setLength(0);
                                                                                bVar5.f22126a.clear();
                                                                                iMin = Math.min(bVar5.f22133h, bVar5.f22129d);
                                                                                while (arrayList.size() >= iMin) {
                                                                                    arrayList.remove(0);
                                                                                }
                                                                            }
                                                                            break;
                                                                        case 46:
                                                                            j();
                                                                            break;
                                                                        case ChatViewRecyclerTypes.REACTION_ADD_REACTION /* 47 */:
                                                                            this.f22141n = i();
                                                                            j();
                                                                            break;
                                                                    }
                                                                } else {
                                                                    this.f22140m.b();
                                                                    break;
                                                                }
                                                            }
                                                            break;
                                                    }
                                                } else {
                                                    k(3);
                                                }
                                            }
                                        } else {
                                            this.f22140m.a((char) C[b11 & 15]);
                                        }
                                    } else {
                                        b bVar6 = this.f22140m;
                                        int i17 = (b10 & ByteCompanionObject.MAX_VALUE) - 32;
                                        iArr = B;
                                        bVar6.a((char) iArr[i17]);
                                        if ((b11 & 224) != 0) {
                                            this.f22140m.a((char) iArr[(b11 & ByteCompanionObject.MAX_VALUE) - 32]);
                                        }
                                    }
                                    z6 = true;
                                }
                            }
                        } else if (z7) {
                            j();
                            z6 = true;
                        }
                    } else if (this.f22146s && this.f22147t == b10 && this.f22148u == b11) {
                        this.f22146s = false;
                    } else {
                        this.f22146s = true;
                        this.f22147t = b10;
                        this.f22148u = b11;
                        if (!z5) {
                            if (1 > b10) {
                                if ((b10 & 246) == 20) {
                                    if (b11 == 32) {
                                        this.f22150w = true;
                                    } else {
                                        this.f22150w = true;
                                    }
                                }
                            } else if ((b10 & 246) == 20) {
                                if (b11 == 32) {
                                    this.f22150w = true;
                                } else {
                                    this.f22150w = true;
                                }
                            }
                            if (this.f22150w) {
                                i7 = b10 & 224;
                                if (i7 == 0) {
                                    this.f22149v = (b10 >> 3) & 1;
                                }
                                if (this.f22149v != this.j) {
                                    if (i7 == 0) {
                                        i10 = b10 & 247;
                                        if (i10 == 17) {
                                            i11 = b10 & 246;
                                            if (i11 != 18) {
                                                if (i10 != 17) {
                                                    if ((b10 & 240) != 16) {
                                                        if (i10 != 23) {
                                                            if (i11 == 20) {
                                                                if (b11 == 32) {
                                                                    k(2);
                                                                } else if (b11 != 41) {
                                                                    switch (b11) {
                                                                        case ChatViewRecyclerTypes.POLL_TEXT_AND_IMAGE /* 37 */:
                                                                            k(1);
                                                                            this.f22144q = 2;
                                                                            this.f22140m.f22133h = 2;
                                                                            break;
                                                                        case ChatViewRecyclerTypes.POLL_IMAGE_ONLY /* 38 */:
                                                                            k(1);
                                                                            this.f22144q = 3;
                                                                            this.f22140m.f22133h = 3;
                                                                            break;
                                                                        case ChatViewRecyclerTypes.SAFETY_SYSTEM_NOTIFICATION /* 39 */:
                                                                            k(1);
                                                                            this.f22144q = 4;
                                                                            this.f22140m.f22133h = 4;
                                                                            break;
                                                                        default:
                                                                            i12 = this.f22143p;
                                                                            if (i12 != 0) {
                                                                                if (b11 != 33) {
                                                                                    switch (b11) {
                                                                                        case ChatViewRecyclerTypes.FORWARD_BREADCRUMB /* 44 */:
                                                                                            this.f22141n = Collections.EMPTY_LIST;
                                                                                            if (i12 != 1) {
                                                                                                j();
                                                                                            } else {
                                                                                                j();
                                                                                            }
                                                                                            break;
                                                                                        case ChatViewRecyclerTypes.REACTION_BURST_REACTION /* 45 */:
                                                                                            if (i12 == 1) {
                                                                                                b bVar7 = this.f22140m;
                                                                                                arrayList = bVar7.f22127b;
                                                                                                arrayList.add(bVar7.d());
                                                                                                bVar7.f22128c.setLength(0);
                                                                                                bVar7.f22126a.clear();
                                                                                                iMin = Math.min(bVar7.f22133h, bVar7.f22129d);
                                                                                                while (arrayList.size() >= iMin) {
                                                                                                    arrayList.remove(0);
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                        case 46:
                                                                                            j();
                                                                                            break;
                                                                                        case ChatViewRecyclerTypes.REACTION_ADD_REACTION /* 47 */:
                                                                                            this.f22141n = i();
                                                                                            j();
                                                                                            break;
                                                                                    }
                                                                                } else {
                                                                                    this.f22140m.b();
                                                                                    break;
                                                                                }
                                                                            }
                                                                            break;
                                                                    }
                                                                } else {
                                                                    k(3);
                                                                }
                                                            }
                                                        } else if (i11 == 20) {
                                                            if (b11 == 32) {
                                                                k(2);
                                                            } else if (b11 != 41) {
                                                                switch (b11) {
                                                                    case ChatViewRecyclerTypes.POLL_TEXT_AND_IMAGE /* 37 */:
                                                                        k(1);
                                                                        this.f22144q = 2;
                                                                        this.f22140m.f22133h = 2;
                                                                        break;
                                                                    case ChatViewRecyclerTypes.POLL_IMAGE_ONLY /* 38 */:
                                                                        k(1);
                                                                        this.f22144q = 3;
                                                                        this.f22140m.f22133h = 3;
                                                                        break;
                                                                    case ChatViewRecyclerTypes.SAFETY_SYSTEM_NOTIFICATION /* 39 */:
                                                                        k(1);
                                                                        this.f22144q = 4;
                                                                        this.f22140m.f22133h = 4;
                                                                        break;
                                                                    default:
                                                                        i12 = this.f22143p;
                                                                        if (i12 != 0) {
                                                                            if (b11 != 33) {
                                                                                switch (b11) {
                                                                                    case ChatViewRecyclerTypes.FORWARD_BREADCRUMB /* 44 */:
                                                                                        this.f22141n = Collections.EMPTY_LIST;
                                                                                        if (i12 != 1) {
                                                                                            j();
                                                                                        } else {
                                                                                            j();
                                                                                        }
                                                                                        break;
                                                                                    case ChatViewRecyclerTypes.REACTION_BURST_REACTION /* 45 */:
                                                                                        if (i12 == 1) {
                                                                                            b bVar8 = this.f22140m;
                                                                                            arrayList = bVar8.f22127b;
                                                                                            arrayList.add(bVar8.d());
                                                                                            bVar8.f22128c.setLength(0);
                                                                                            bVar8.f22126a.clear();
                                                                                            iMin = Math.min(bVar8.f22133h, bVar8.f22129d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        j();
                                                                                        break;
                                                                                    case ChatViewRecyclerTypes.REACTION_ADD_REACTION /* 47 */:
                                                                                        this.f22141n = i();
                                                                                        j();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f22140m.b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                k(3);
                                                            }
                                                        }
                                                    } else if (i10 != 23) {
                                                        if (i11 == 20) {
                                                            if (b11 == 32) {
                                                                k(2);
                                                            } else if (b11 != 41) {
                                                                switch (b11) {
                                                                    case ChatViewRecyclerTypes.POLL_TEXT_AND_IMAGE /* 37 */:
                                                                        k(1);
                                                                        this.f22144q = 2;
                                                                        this.f22140m.f22133h = 2;
                                                                        break;
                                                                    case ChatViewRecyclerTypes.POLL_IMAGE_ONLY /* 38 */:
                                                                        k(1);
                                                                        this.f22144q = 3;
                                                                        this.f22140m.f22133h = 3;
                                                                        break;
                                                                    case ChatViewRecyclerTypes.SAFETY_SYSTEM_NOTIFICATION /* 39 */:
                                                                        k(1);
                                                                        this.f22144q = 4;
                                                                        this.f22140m.f22133h = 4;
                                                                        break;
                                                                    default:
                                                                        i12 = this.f22143p;
                                                                        if (i12 != 0) {
                                                                            if (b11 != 33) {
                                                                                switch (b11) {
                                                                                    case ChatViewRecyclerTypes.FORWARD_BREADCRUMB /* 44 */:
                                                                                        this.f22141n = Collections.EMPTY_LIST;
                                                                                        if (i12 != 1) {
                                                                                            j();
                                                                                        } else {
                                                                                            j();
                                                                                        }
                                                                                        break;
                                                                                    case ChatViewRecyclerTypes.REACTION_BURST_REACTION /* 45 */:
                                                                                        if (i12 == 1) {
                                                                                            b bVar9 = this.f22140m;
                                                                                            arrayList = bVar9.f22127b;
                                                                                            arrayList.add(bVar9.d());
                                                                                            bVar9.f22128c.setLength(0);
                                                                                            bVar9.f22126a.clear();
                                                                                            iMin = Math.min(bVar9.f22133h, bVar9.f22129d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        j();
                                                                                        break;
                                                                                    case ChatViewRecyclerTypes.REACTION_ADD_REACTION /* 47 */:
                                                                                        this.f22141n = i();
                                                                                        j();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f22140m.b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                k(3);
                                                            }
                                                        }
                                                    } else if (i11 == 20) {
                                                        if (b11 == 32) {
                                                            k(2);
                                                        } else if (b11 != 41) {
                                                            switch (b11) {
                                                                case ChatViewRecyclerTypes.POLL_TEXT_AND_IMAGE /* 37 */:
                                                                    k(1);
                                                                    this.f22144q = 2;
                                                                    this.f22140m.f22133h = 2;
                                                                    break;
                                                                case ChatViewRecyclerTypes.POLL_IMAGE_ONLY /* 38 */:
                                                                    k(1);
                                                                    this.f22144q = 3;
                                                                    this.f22140m.f22133h = 3;
                                                                    break;
                                                                case ChatViewRecyclerTypes.SAFETY_SYSTEM_NOTIFICATION /* 39 */:
                                                                    k(1);
                                                                    this.f22144q = 4;
                                                                    this.f22140m.f22133h = 4;
                                                                    break;
                                                                default:
                                                                    i12 = this.f22143p;
                                                                    if (i12 != 0) {
                                                                        if (b11 != 33) {
                                                                            switch (b11) {
                                                                                case ChatViewRecyclerTypes.FORWARD_BREADCRUMB /* 44 */:
                                                                                    this.f22141n = Collections.EMPTY_LIST;
                                                                                    if (i12 != 1) {
                                                                                        j();
                                                                                    } else {
                                                                                        j();
                                                                                    }
                                                                                    break;
                                                                                case ChatViewRecyclerTypes.REACTION_BURST_REACTION /* 45 */:
                                                                                    if (i12 == 1) {
                                                                                        b bVar10 = this.f22140m;
                                                                                        arrayList = bVar10.f22127b;
                                                                                        arrayList.add(bVar10.d());
                                                                                        bVar10.f22128c.setLength(0);
                                                                                        bVar10.f22126a.clear();
                                                                                        iMin = Math.min(bVar10.f22133h, bVar10.f22129d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    j();
                                                                                    break;
                                                                                case ChatViewRecyclerTypes.REACTION_ADD_REACTION /* 47 */:
                                                                                    this.f22141n = i();
                                                                                    j();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f22140m.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            k(3);
                                                        }
                                                    }
                                                } else if ((b10 & 240) != 16) {
                                                    if (i10 != 23) {
                                                        if (i11 == 20) {
                                                            if (b11 == 32) {
                                                                k(2);
                                                            } else if (b11 != 41) {
                                                                switch (b11) {
                                                                    case ChatViewRecyclerTypes.POLL_TEXT_AND_IMAGE /* 37 */:
                                                                        k(1);
                                                                        this.f22144q = 2;
                                                                        this.f22140m.f22133h = 2;
                                                                        break;
                                                                    case ChatViewRecyclerTypes.POLL_IMAGE_ONLY /* 38 */:
                                                                        k(1);
                                                                        this.f22144q = 3;
                                                                        this.f22140m.f22133h = 3;
                                                                        break;
                                                                    case ChatViewRecyclerTypes.SAFETY_SYSTEM_NOTIFICATION /* 39 */:
                                                                        k(1);
                                                                        this.f22144q = 4;
                                                                        this.f22140m.f22133h = 4;
                                                                        break;
                                                                    default:
                                                                        i12 = this.f22143p;
                                                                        if (i12 != 0) {
                                                                            if (b11 != 33) {
                                                                                switch (b11) {
                                                                                    case ChatViewRecyclerTypes.FORWARD_BREADCRUMB /* 44 */:
                                                                                        this.f22141n = Collections.EMPTY_LIST;
                                                                                        if (i12 != 1) {
                                                                                            j();
                                                                                        } else {
                                                                                            j();
                                                                                        }
                                                                                        break;
                                                                                    case ChatViewRecyclerTypes.REACTION_BURST_REACTION /* 45 */:
                                                                                        if (i12 == 1) {
                                                                                            b bVar11 = this.f22140m;
                                                                                            arrayList = bVar11.f22127b;
                                                                                            arrayList.add(bVar11.d());
                                                                                            bVar11.f22128c.setLength(0);
                                                                                            bVar11.f22126a.clear();
                                                                                            iMin = Math.min(bVar11.f22133h, bVar11.f22129d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        j();
                                                                                        break;
                                                                                    case ChatViewRecyclerTypes.REACTION_ADD_REACTION /* 47 */:
                                                                                        this.f22141n = i();
                                                                                        j();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f22140m.b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                k(3);
                                                            }
                                                        }
                                                    } else if (i11 == 20) {
                                                        if (b11 == 32) {
                                                            k(2);
                                                        } else if (b11 != 41) {
                                                            switch (b11) {
                                                                case ChatViewRecyclerTypes.POLL_TEXT_AND_IMAGE /* 37 */:
                                                                    k(1);
                                                                    this.f22144q = 2;
                                                                    this.f22140m.f22133h = 2;
                                                                    break;
                                                                case ChatViewRecyclerTypes.POLL_IMAGE_ONLY /* 38 */:
                                                                    k(1);
                                                                    this.f22144q = 3;
                                                                    this.f22140m.f22133h = 3;
                                                                    break;
                                                                case ChatViewRecyclerTypes.SAFETY_SYSTEM_NOTIFICATION /* 39 */:
                                                                    k(1);
                                                                    this.f22144q = 4;
                                                                    this.f22140m.f22133h = 4;
                                                                    break;
                                                                default:
                                                                    i12 = this.f22143p;
                                                                    if (i12 != 0) {
                                                                        if (b11 != 33) {
                                                                            switch (b11) {
                                                                                case ChatViewRecyclerTypes.FORWARD_BREADCRUMB /* 44 */:
                                                                                    this.f22141n = Collections.EMPTY_LIST;
                                                                                    if (i12 != 1) {
                                                                                        j();
                                                                                    } else {
                                                                                        j();
                                                                                    }
                                                                                    break;
                                                                                case ChatViewRecyclerTypes.REACTION_BURST_REACTION /* 45 */:
                                                                                    if (i12 == 1) {
                                                                                        b bVar12 = this.f22140m;
                                                                                        arrayList = bVar12.f22127b;
                                                                                        arrayList.add(bVar12.d());
                                                                                        bVar12.f22128c.setLength(0);
                                                                                        bVar12.f22126a.clear();
                                                                                        iMin = Math.min(bVar12.f22133h, bVar12.f22129d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    j();
                                                                                    break;
                                                                                case ChatViewRecyclerTypes.REACTION_ADD_REACTION /* 47 */:
                                                                                    this.f22141n = i();
                                                                                    j();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f22140m.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            k(3);
                                                        }
                                                    }
                                                } else if (i10 != 23) {
                                                    if (i11 == 20) {
                                                        if (b11 == 32) {
                                                            k(2);
                                                        } else if (b11 != 41) {
                                                            switch (b11) {
                                                                case ChatViewRecyclerTypes.POLL_TEXT_AND_IMAGE /* 37 */:
                                                                    k(1);
                                                                    this.f22144q = 2;
                                                                    this.f22140m.f22133h = 2;
                                                                    break;
                                                                case ChatViewRecyclerTypes.POLL_IMAGE_ONLY /* 38 */:
                                                                    k(1);
                                                                    this.f22144q = 3;
                                                                    this.f22140m.f22133h = 3;
                                                                    break;
                                                                case ChatViewRecyclerTypes.SAFETY_SYSTEM_NOTIFICATION /* 39 */:
                                                                    k(1);
                                                                    this.f22144q = 4;
                                                                    this.f22140m.f22133h = 4;
                                                                    break;
                                                                default:
                                                                    i12 = this.f22143p;
                                                                    if (i12 != 0) {
                                                                        if (b11 != 33) {
                                                                            switch (b11) {
                                                                                case ChatViewRecyclerTypes.FORWARD_BREADCRUMB /* 44 */:
                                                                                    this.f22141n = Collections.EMPTY_LIST;
                                                                                    if (i12 != 1) {
                                                                                        j();
                                                                                    } else {
                                                                                        j();
                                                                                    }
                                                                                    break;
                                                                                case ChatViewRecyclerTypes.REACTION_BURST_REACTION /* 45 */:
                                                                                    if (i12 == 1) {
                                                                                        b bVar13 = this.f22140m;
                                                                                        arrayList = bVar13.f22127b;
                                                                                        arrayList.add(bVar13.d());
                                                                                        bVar13.f22128c.setLength(0);
                                                                                        bVar13.f22126a.clear();
                                                                                        iMin = Math.min(bVar13.f22133h, bVar13.f22129d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    j();
                                                                                    break;
                                                                                case ChatViewRecyclerTypes.REACTION_ADD_REACTION /* 47 */:
                                                                                    this.f22141n = i();
                                                                                    j();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f22140m.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            k(3);
                                                        }
                                                    }
                                                } else if (i11 == 20) {
                                                    if (b11 == 32) {
                                                        k(2);
                                                    } else if (b11 != 41) {
                                                        switch (b11) {
                                                            case ChatViewRecyclerTypes.POLL_TEXT_AND_IMAGE /* 37 */:
                                                                k(1);
                                                                this.f22144q = 2;
                                                                this.f22140m.f22133h = 2;
                                                                break;
                                                            case ChatViewRecyclerTypes.POLL_IMAGE_ONLY /* 38 */:
                                                                k(1);
                                                                this.f22144q = 3;
                                                                this.f22140m.f22133h = 3;
                                                                break;
                                                            case ChatViewRecyclerTypes.SAFETY_SYSTEM_NOTIFICATION /* 39 */:
                                                                k(1);
                                                                this.f22144q = 4;
                                                                this.f22140m.f22133h = 4;
                                                                break;
                                                            default:
                                                                i12 = this.f22143p;
                                                                if (i12 != 0) {
                                                                    if (b11 != 33) {
                                                                        switch (b11) {
                                                                            case ChatViewRecyclerTypes.FORWARD_BREADCRUMB /* 44 */:
                                                                                this.f22141n = Collections.EMPTY_LIST;
                                                                                if (i12 != 1) {
                                                                                    j();
                                                                                } else {
                                                                                    j();
                                                                                }
                                                                                break;
                                                                            case ChatViewRecyclerTypes.REACTION_BURST_REACTION /* 45 */:
                                                                                if (i12 == 1) {
                                                                                    b bVar14 = this.f22140m;
                                                                                    arrayList = bVar14.f22127b;
                                                                                    arrayList.add(bVar14.d());
                                                                                    bVar14.f22128c.setLength(0);
                                                                                    bVar14.f22126a.clear();
                                                                                    iMin = Math.min(bVar14.f22133h, bVar14.f22129d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                j();
                                                                                break;
                                                                            case ChatViewRecyclerTypes.REACTION_ADD_REACTION /* 47 */:
                                                                                this.f22141n = i();
                                                                                j();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f22140m.b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        k(3);
                                                    }
                                                }
                                            } else if (i10 != 17) {
                                                if ((b10 & 240) != 16) {
                                                    if (i10 != 23) {
                                                        if (i11 == 20) {
                                                            if (b11 == 32) {
                                                                k(2);
                                                            } else if (b11 != 41) {
                                                                switch (b11) {
                                                                    case ChatViewRecyclerTypes.POLL_TEXT_AND_IMAGE /* 37 */:
                                                                        k(1);
                                                                        this.f22144q = 2;
                                                                        this.f22140m.f22133h = 2;
                                                                        break;
                                                                    case ChatViewRecyclerTypes.POLL_IMAGE_ONLY /* 38 */:
                                                                        k(1);
                                                                        this.f22144q = 3;
                                                                        this.f22140m.f22133h = 3;
                                                                        break;
                                                                    case ChatViewRecyclerTypes.SAFETY_SYSTEM_NOTIFICATION /* 39 */:
                                                                        k(1);
                                                                        this.f22144q = 4;
                                                                        this.f22140m.f22133h = 4;
                                                                        break;
                                                                    default:
                                                                        i12 = this.f22143p;
                                                                        if (i12 != 0) {
                                                                            if (b11 != 33) {
                                                                                switch (b11) {
                                                                                    case ChatViewRecyclerTypes.FORWARD_BREADCRUMB /* 44 */:
                                                                                        this.f22141n = Collections.EMPTY_LIST;
                                                                                        if (i12 != 1) {
                                                                                            j();
                                                                                        } else {
                                                                                            j();
                                                                                        }
                                                                                        break;
                                                                                    case ChatViewRecyclerTypes.REACTION_BURST_REACTION /* 45 */:
                                                                                        if (i12 == 1) {
                                                                                            b bVar15 = this.f22140m;
                                                                                            arrayList = bVar15.f22127b;
                                                                                            arrayList.add(bVar15.d());
                                                                                            bVar15.f22128c.setLength(0);
                                                                                            bVar15.f22126a.clear();
                                                                                            iMin = Math.min(bVar15.f22133h, bVar15.f22129d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        j();
                                                                                        break;
                                                                                    case ChatViewRecyclerTypes.REACTION_ADD_REACTION /* 47 */:
                                                                                        this.f22141n = i();
                                                                                        j();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f22140m.b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                k(3);
                                                            }
                                                        }
                                                    } else if (i11 == 20) {
                                                        if (b11 == 32) {
                                                            k(2);
                                                        } else if (b11 != 41) {
                                                            switch (b11) {
                                                                case ChatViewRecyclerTypes.POLL_TEXT_AND_IMAGE /* 37 */:
                                                                    k(1);
                                                                    this.f22144q = 2;
                                                                    this.f22140m.f22133h = 2;
                                                                    break;
                                                                case ChatViewRecyclerTypes.POLL_IMAGE_ONLY /* 38 */:
                                                                    k(1);
                                                                    this.f22144q = 3;
                                                                    this.f22140m.f22133h = 3;
                                                                    break;
                                                                case ChatViewRecyclerTypes.SAFETY_SYSTEM_NOTIFICATION /* 39 */:
                                                                    k(1);
                                                                    this.f22144q = 4;
                                                                    this.f22140m.f22133h = 4;
                                                                    break;
                                                                default:
                                                                    i12 = this.f22143p;
                                                                    if (i12 != 0) {
                                                                        if (b11 != 33) {
                                                                            switch (b11) {
                                                                                case ChatViewRecyclerTypes.FORWARD_BREADCRUMB /* 44 */:
                                                                                    this.f22141n = Collections.EMPTY_LIST;
                                                                                    if (i12 != 1) {
                                                                                        j();
                                                                                    } else {
                                                                                        j();
                                                                                    }
                                                                                    break;
                                                                                case ChatViewRecyclerTypes.REACTION_BURST_REACTION /* 45 */:
                                                                                    if (i12 == 1) {
                                                                                        b bVar16 = this.f22140m;
                                                                                        arrayList = bVar16.f22127b;
                                                                                        arrayList.add(bVar16.d());
                                                                                        bVar16.f22128c.setLength(0);
                                                                                        bVar16.f22126a.clear();
                                                                                        iMin = Math.min(bVar16.f22133h, bVar16.f22129d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    j();
                                                                                    break;
                                                                                case ChatViewRecyclerTypes.REACTION_ADD_REACTION /* 47 */:
                                                                                    this.f22141n = i();
                                                                                    j();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f22140m.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            k(3);
                                                        }
                                                    }
                                                } else if (i10 != 23) {
                                                    if (i11 == 20) {
                                                        if (b11 == 32) {
                                                            k(2);
                                                        } else if (b11 != 41) {
                                                            switch (b11) {
                                                                case ChatViewRecyclerTypes.POLL_TEXT_AND_IMAGE /* 37 */:
                                                                    k(1);
                                                                    this.f22144q = 2;
                                                                    this.f22140m.f22133h = 2;
                                                                    break;
                                                                case ChatViewRecyclerTypes.POLL_IMAGE_ONLY /* 38 */:
                                                                    k(1);
                                                                    this.f22144q = 3;
                                                                    this.f22140m.f22133h = 3;
                                                                    break;
                                                                case ChatViewRecyclerTypes.SAFETY_SYSTEM_NOTIFICATION /* 39 */:
                                                                    k(1);
                                                                    this.f22144q = 4;
                                                                    this.f22140m.f22133h = 4;
                                                                    break;
                                                                default:
                                                                    i12 = this.f22143p;
                                                                    if (i12 != 0) {
                                                                        if (b11 != 33) {
                                                                            switch (b11) {
                                                                                case ChatViewRecyclerTypes.FORWARD_BREADCRUMB /* 44 */:
                                                                                    this.f22141n = Collections.EMPTY_LIST;
                                                                                    if (i12 != 1) {
                                                                                        j();
                                                                                    } else {
                                                                                        j();
                                                                                    }
                                                                                    break;
                                                                                case ChatViewRecyclerTypes.REACTION_BURST_REACTION /* 45 */:
                                                                                    if (i12 == 1) {
                                                                                        b bVar17 = this.f22140m;
                                                                                        arrayList = bVar17.f22127b;
                                                                                        arrayList.add(bVar17.d());
                                                                                        bVar17.f22128c.setLength(0);
                                                                                        bVar17.f22126a.clear();
                                                                                        iMin = Math.min(bVar17.f22133h, bVar17.f22129d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    j();
                                                                                    break;
                                                                                case ChatViewRecyclerTypes.REACTION_ADD_REACTION /* 47 */:
                                                                                    this.f22141n = i();
                                                                                    j();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f22140m.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            k(3);
                                                        }
                                                    }
                                                } else if (i11 == 20) {
                                                    if (b11 == 32) {
                                                        k(2);
                                                    } else if (b11 != 41) {
                                                        switch (b11) {
                                                            case ChatViewRecyclerTypes.POLL_TEXT_AND_IMAGE /* 37 */:
                                                                k(1);
                                                                this.f22144q = 2;
                                                                this.f22140m.f22133h = 2;
                                                                break;
                                                            case ChatViewRecyclerTypes.POLL_IMAGE_ONLY /* 38 */:
                                                                k(1);
                                                                this.f22144q = 3;
                                                                this.f22140m.f22133h = 3;
                                                                break;
                                                            case ChatViewRecyclerTypes.SAFETY_SYSTEM_NOTIFICATION /* 39 */:
                                                                k(1);
                                                                this.f22144q = 4;
                                                                this.f22140m.f22133h = 4;
                                                                break;
                                                            default:
                                                                i12 = this.f22143p;
                                                                if (i12 != 0) {
                                                                    if (b11 != 33) {
                                                                        switch (b11) {
                                                                            case ChatViewRecyclerTypes.FORWARD_BREADCRUMB /* 44 */:
                                                                                this.f22141n = Collections.EMPTY_LIST;
                                                                                if (i12 != 1) {
                                                                                    j();
                                                                                } else {
                                                                                    j();
                                                                                }
                                                                                break;
                                                                            case ChatViewRecyclerTypes.REACTION_BURST_REACTION /* 45 */:
                                                                                if (i12 == 1) {
                                                                                    b bVar18 = this.f22140m;
                                                                                    arrayList = bVar18.f22127b;
                                                                                    arrayList.add(bVar18.d());
                                                                                    bVar18.f22128c.setLength(0);
                                                                                    bVar18.f22126a.clear();
                                                                                    iMin = Math.min(bVar18.f22133h, bVar18.f22129d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                j();
                                                                                break;
                                                                            case ChatViewRecyclerTypes.REACTION_ADD_REACTION /* 47 */:
                                                                                this.f22141n = i();
                                                                                j();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f22140m.b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        k(3);
                                                    }
                                                }
                                            } else if ((b10 & 240) != 16) {
                                                if (i10 != 23) {
                                                    if (i11 == 20) {
                                                        if (b11 == 32) {
                                                            k(2);
                                                        } else if (b11 != 41) {
                                                            switch (b11) {
                                                                case ChatViewRecyclerTypes.POLL_TEXT_AND_IMAGE /* 37 */:
                                                                    k(1);
                                                                    this.f22144q = 2;
                                                                    this.f22140m.f22133h = 2;
                                                                    break;
                                                                case ChatViewRecyclerTypes.POLL_IMAGE_ONLY /* 38 */:
                                                                    k(1);
                                                                    this.f22144q = 3;
                                                                    this.f22140m.f22133h = 3;
                                                                    break;
                                                                case ChatViewRecyclerTypes.SAFETY_SYSTEM_NOTIFICATION /* 39 */:
                                                                    k(1);
                                                                    this.f22144q = 4;
                                                                    this.f22140m.f22133h = 4;
                                                                    break;
                                                                default:
                                                                    i12 = this.f22143p;
                                                                    if (i12 != 0) {
                                                                        if (b11 != 33) {
                                                                            switch (b11) {
                                                                                case ChatViewRecyclerTypes.FORWARD_BREADCRUMB /* 44 */:
                                                                                    this.f22141n = Collections.EMPTY_LIST;
                                                                                    if (i12 != 1) {
                                                                                        j();
                                                                                    } else {
                                                                                        j();
                                                                                    }
                                                                                    break;
                                                                                case ChatViewRecyclerTypes.REACTION_BURST_REACTION /* 45 */:
                                                                                    if (i12 == 1) {
                                                                                        b bVar19 = this.f22140m;
                                                                                        arrayList = bVar19.f22127b;
                                                                                        arrayList.add(bVar19.d());
                                                                                        bVar19.f22128c.setLength(0);
                                                                                        bVar19.f22126a.clear();
                                                                                        iMin = Math.min(bVar19.f22133h, bVar19.f22129d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    j();
                                                                                    break;
                                                                                case ChatViewRecyclerTypes.REACTION_ADD_REACTION /* 47 */:
                                                                                    this.f22141n = i();
                                                                                    j();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f22140m.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            k(3);
                                                        }
                                                    }
                                                } else if (i11 == 20) {
                                                    if (b11 == 32) {
                                                        k(2);
                                                    } else if (b11 != 41) {
                                                        switch (b11) {
                                                            case ChatViewRecyclerTypes.POLL_TEXT_AND_IMAGE /* 37 */:
                                                                k(1);
                                                                this.f22144q = 2;
                                                                this.f22140m.f22133h = 2;
                                                                break;
                                                            case ChatViewRecyclerTypes.POLL_IMAGE_ONLY /* 38 */:
                                                                k(1);
                                                                this.f22144q = 3;
                                                                this.f22140m.f22133h = 3;
                                                                break;
                                                            case ChatViewRecyclerTypes.SAFETY_SYSTEM_NOTIFICATION /* 39 */:
                                                                k(1);
                                                                this.f22144q = 4;
                                                                this.f22140m.f22133h = 4;
                                                                break;
                                                            default:
                                                                i12 = this.f22143p;
                                                                if (i12 != 0) {
                                                                    if (b11 != 33) {
                                                                        switch (b11) {
                                                                            case ChatViewRecyclerTypes.FORWARD_BREADCRUMB /* 44 */:
                                                                                this.f22141n = Collections.EMPTY_LIST;
                                                                                if (i12 != 1) {
                                                                                    j();
                                                                                } else {
                                                                                    j();
                                                                                }
                                                                                break;
                                                                            case ChatViewRecyclerTypes.REACTION_BURST_REACTION /* 45 */:
                                                                                if (i12 == 1) {
                                                                                    b bVar110 = this.f22140m;
                                                                                    arrayList = bVar110.f22127b;
                                                                                    arrayList.add(bVar110.d());
                                                                                    bVar110.f22128c.setLength(0);
                                                                                    bVar110.f22126a.clear();
                                                                                    iMin = Math.min(bVar110.f22133h, bVar110.f22129d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                j();
                                                                                break;
                                                                            case ChatViewRecyclerTypes.REACTION_ADD_REACTION /* 47 */:
                                                                                this.f22141n = i();
                                                                                j();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f22140m.b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        k(3);
                                                    }
                                                }
                                            } else if (i10 != 23) {
                                                if (i11 == 20) {
                                                    if (b11 == 32) {
                                                        k(2);
                                                    } else if (b11 != 41) {
                                                        switch (b11) {
                                                            case ChatViewRecyclerTypes.POLL_TEXT_AND_IMAGE /* 37 */:
                                                                k(1);
                                                                this.f22144q = 2;
                                                                this.f22140m.f22133h = 2;
                                                                break;
                                                            case ChatViewRecyclerTypes.POLL_IMAGE_ONLY /* 38 */:
                                                                k(1);
                                                                this.f22144q = 3;
                                                                this.f22140m.f22133h = 3;
                                                                break;
                                                            case ChatViewRecyclerTypes.SAFETY_SYSTEM_NOTIFICATION /* 39 */:
                                                                k(1);
                                                                this.f22144q = 4;
                                                                this.f22140m.f22133h = 4;
                                                                break;
                                                            default:
                                                                i12 = this.f22143p;
                                                                if (i12 != 0) {
                                                                    if (b11 != 33) {
                                                                        switch (b11) {
                                                                            case ChatViewRecyclerTypes.FORWARD_BREADCRUMB /* 44 */:
                                                                                this.f22141n = Collections.EMPTY_LIST;
                                                                                if (i12 != 1) {
                                                                                    j();
                                                                                } else {
                                                                                    j();
                                                                                }
                                                                                break;
                                                                            case ChatViewRecyclerTypes.REACTION_BURST_REACTION /* 45 */:
                                                                                if (i12 == 1) {
                                                                                    b bVar111 = this.f22140m;
                                                                                    arrayList = bVar111.f22127b;
                                                                                    arrayList.add(bVar111.d());
                                                                                    bVar111.f22128c.setLength(0);
                                                                                    bVar111.f22126a.clear();
                                                                                    iMin = Math.min(bVar111.f22133h, bVar111.f22129d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                j();
                                                                                break;
                                                                            case ChatViewRecyclerTypes.REACTION_ADD_REACTION /* 47 */:
                                                                                this.f22141n = i();
                                                                                j();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f22140m.b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        k(3);
                                                    }
                                                }
                                            } else if (i11 == 20) {
                                                if (b11 == 32) {
                                                    k(2);
                                                } else if (b11 != 41) {
                                                    switch (b11) {
                                                        case ChatViewRecyclerTypes.POLL_TEXT_AND_IMAGE /* 37 */:
                                                            k(1);
                                                            this.f22144q = 2;
                                                            this.f22140m.f22133h = 2;
                                                            break;
                                                        case ChatViewRecyclerTypes.POLL_IMAGE_ONLY /* 38 */:
                                                            k(1);
                                                            this.f22144q = 3;
                                                            this.f22140m.f22133h = 3;
                                                            break;
                                                        case ChatViewRecyclerTypes.SAFETY_SYSTEM_NOTIFICATION /* 39 */:
                                                            k(1);
                                                            this.f22144q = 4;
                                                            this.f22140m.f22133h = 4;
                                                            break;
                                                        default:
                                                            i12 = this.f22143p;
                                                            if (i12 != 0) {
                                                                if (b11 != 33) {
                                                                    switch (b11) {
                                                                        case ChatViewRecyclerTypes.FORWARD_BREADCRUMB /* 44 */:
                                                                            this.f22141n = Collections.EMPTY_LIST;
                                                                            if (i12 != 1) {
                                                                                j();
                                                                            } else {
                                                                                j();
                                                                            }
                                                                            break;
                                                                        case ChatViewRecyclerTypes.REACTION_BURST_REACTION /* 45 */:
                                                                            if (i12 == 1) {
                                                                                b bVar112 = this.f22140m;
                                                                                arrayList = bVar112.f22127b;
                                                                                arrayList.add(bVar112.d());
                                                                                bVar112.f22128c.setLength(0);
                                                                                bVar112.f22126a.clear();
                                                                                iMin = Math.min(bVar112.f22133h, bVar112.f22129d);
                                                                                while (arrayList.size() >= iMin) {
                                                                                    arrayList.remove(0);
                                                                                }
                                                                            }
                                                                            break;
                                                                        case 46:
                                                                            j();
                                                                            break;
                                                                        case ChatViewRecyclerTypes.REACTION_ADD_REACTION /* 47 */:
                                                                            this.f22141n = i();
                                                                            j();
                                                                            break;
                                                                    }
                                                                } else {
                                                                    this.f22140m.b();
                                                                    break;
                                                                }
                                                            }
                                                            break;
                                                    }
                                                } else {
                                                    k(3);
                                                }
                                            }
                                        } else {
                                            i11 = b10 & 246;
                                            if (i11 != 18) {
                                                if (i10 != 17) {
                                                    if ((b10 & 240) != 16) {
                                                        if (i10 != 23) {
                                                            if (i11 == 20) {
                                                                if (b11 == 32) {
                                                                    k(2);
                                                                } else if (b11 != 41) {
                                                                    switch (b11) {
                                                                        case ChatViewRecyclerTypes.POLL_TEXT_AND_IMAGE /* 37 */:
                                                                            k(1);
                                                                            this.f22144q = 2;
                                                                            this.f22140m.f22133h = 2;
                                                                            break;
                                                                        case ChatViewRecyclerTypes.POLL_IMAGE_ONLY /* 38 */:
                                                                            k(1);
                                                                            this.f22144q = 3;
                                                                            this.f22140m.f22133h = 3;
                                                                            break;
                                                                        case ChatViewRecyclerTypes.SAFETY_SYSTEM_NOTIFICATION /* 39 */:
                                                                            k(1);
                                                                            this.f22144q = 4;
                                                                            this.f22140m.f22133h = 4;
                                                                            break;
                                                                        default:
                                                                            i12 = this.f22143p;
                                                                            if (i12 != 0) {
                                                                                if (b11 != 33) {
                                                                                    switch (b11) {
                                                                                        case ChatViewRecyclerTypes.FORWARD_BREADCRUMB /* 44 */:
                                                                                            this.f22141n = Collections.EMPTY_LIST;
                                                                                            if (i12 != 1) {
                                                                                                j();
                                                                                            } else {
                                                                                                j();
                                                                                            }
                                                                                            break;
                                                                                        case ChatViewRecyclerTypes.REACTION_BURST_REACTION /* 45 */:
                                                                                            if (i12 == 1) {
                                                                                                b bVar113 = this.f22140m;
                                                                                                arrayList = bVar113.f22127b;
                                                                                                arrayList.add(bVar113.d());
                                                                                                bVar113.f22128c.setLength(0);
                                                                                                bVar113.f22126a.clear();
                                                                                                iMin = Math.min(bVar113.f22133h, bVar113.f22129d);
                                                                                                while (arrayList.size() >= iMin) {
                                                                                                    arrayList.remove(0);
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                        case 46:
                                                                                            j();
                                                                                            break;
                                                                                        case ChatViewRecyclerTypes.REACTION_ADD_REACTION /* 47 */:
                                                                                            this.f22141n = i();
                                                                                            j();
                                                                                            break;
                                                                                    }
                                                                                } else {
                                                                                    this.f22140m.b();
                                                                                    break;
                                                                                }
                                                                            }
                                                                            break;
                                                                    }
                                                                } else {
                                                                    k(3);
                                                                }
                                                            }
                                                        } else if (i11 == 20) {
                                                            if (b11 == 32) {
                                                                k(2);
                                                            } else if (b11 != 41) {
                                                                switch (b11) {
                                                                    case ChatViewRecyclerTypes.POLL_TEXT_AND_IMAGE /* 37 */:
                                                                        k(1);
                                                                        this.f22144q = 2;
                                                                        this.f22140m.f22133h = 2;
                                                                        break;
                                                                    case ChatViewRecyclerTypes.POLL_IMAGE_ONLY /* 38 */:
                                                                        k(1);
                                                                        this.f22144q = 3;
                                                                        this.f22140m.f22133h = 3;
                                                                        break;
                                                                    case ChatViewRecyclerTypes.SAFETY_SYSTEM_NOTIFICATION /* 39 */:
                                                                        k(1);
                                                                        this.f22144q = 4;
                                                                        this.f22140m.f22133h = 4;
                                                                        break;
                                                                    default:
                                                                        i12 = this.f22143p;
                                                                        if (i12 != 0) {
                                                                            if (b11 != 33) {
                                                                                switch (b11) {
                                                                                    case ChatViewRecyclerTypes.FORWARD_BREADCRUMB /* 44 */:
                                                                                        this.f22141n = Collections.EMPTY_LIST;
                                                                                        if (i12 != 1) {
                                                                                            j();
                                                                                        } else {
                                                                                            j();
                                                                                        }
                                                                                        break;
                                                                                    case ChatViewRecyclerTypes.REACTION_BURST_REACTION /* 45 */:
                                                                                        if (i12 == 1) {
                                                                                            b bVar114 = this.f22140m;
                                                                                            arrayList = bVar114.f22127b;
                                                                                            arrayList.add(bVar114.d());
                                                                                            bVar114.f22128c.setLength(0);
                                                                                            bVar114.f22126a.clear();
                                                                                            iMin = Math.min(bVar114.f22133h, bVar114.f22129d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        j();
                                                                                        break;
                                                                                    case ChatViewRecyclerTypes.REACTION_ADD_REACTION /* 47 */:
                                                                                        this.f22141n = i();
                                                                                        j();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f22140m.b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                k(3);
                                                            }
                                                        }
                                                    } else if (i10 != 23) {
                                                        if (i11 == 20) {
                                                            if (b11 == 32) {
                                                                k(2);
                                                            } else if (b11 != 41) {
                                                                switch (b11) {
                                                                    case ChatViewRecyclerTypes.POLL_TEXT_AND_IMAGE /* 37 */:
                                                                        k(1);
                                                                        this.f22144q = 2;
                                                                        this.f22140m.f22133h = 2;
                                                                        break;
                                                                    case ChatViewRecyclerTypes.POLL_IMAGE_ONLY /* 38 */:
                                                                        k(1);
                                                                        this.f22144q = 3;
                                                                        this.f22140m.f22133h = 3;
                                                                        break;
                                                                    case ChatViewRecyclerTypes.SAFETY_SYSTEM_NOTIFICATION /* 39 */:
                                                                        k(1);
                                                                        this.f22144q = 4;
                                                                        this.f22140m.f22133h = 4;
                                                                        break;
                                                                    default:
                                                                        i12 = this.f22143p;
                                                                        if (i12 != 0) {
                                                                            if (b11 != 33) {
                                                                                switch (b11) {
                                                                                    case ChatViewRecyclerTypes.FORWARD_BREADCRUMB /* 44 */:
                                                                                        this.f22141n = Collections.EMPTY_LIST;
                                                                                        if (i12 != 1) {
                                                                                            j();
                                                                                        } else {
                                                                                            j();
                                                                                        }
                                                                                        break;
                                                                                    case ChatViewRecyclerTypes.REACTION_BURST_REACTION /* 45 */:
                                                                                        if (i12 == 1) {
                                                                                            b bVar115 = this.f22140m;
                                                                                            arrayList = bVar115.f22127b;
                                                                                            arrayList.add(bVar115.d());
                                                                                            bVar115.f22128c.setLength(0);
                                                                                            bVar115.f22126a.clear();
                                                                                            iMin = Math.min(bVar115.f22133h, bVar115.f22129d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        j();
                                                                                        break;
                                                                                    case ChatViewRecyclerTypes.REACTION_ADD_REACTION /* 47 */:
                                                                                        this.f22141n = i();
                                                                                        j();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f22140m.b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                k(3);
                                                            }
                                                        }
                                                    } else if (i11 == 20) {
                                                        if (b11 == 32) {
                                                            k(2);
                                                        } else if (b11 != 41) {
                                                            switch (b11) {
                                                                case ChatViewRecyclerTypes.POLL_TEXT_AND_IMAGE /* 37 */:
                                                                    k(1);
                                                                    this.f22144q = 2;
                                                                    this.f22140m.f22133h = 2;
                                                                    break;
                                                                case ChatViewRecyclerTypes.POLL_IMAGE_ONLY /* 38 */:
                                                                    k(1);
                                                                    this.f22144q = 3;
                                                                    this.f22140m.f22133h = 3;
                                                                    break;
                                                                case ChatViewRecyclerTypes.SAFETY_SYSTEM_NOTIFICATION /* 39 */:
                                                                    k(1);
                                                                    this.f22144q = 4;
                                                                    this.f22140m.f22133h = 4;
                                                                    break;
                                                                default:
                                                                    i12 = this.f22143p;
                                                                    if (i12 != 0) {
                                                                        if (b11 != 33) {
                                                                            switch (b11) {
                                                                                case ChatViewRecyclerTypes.FORWARD_BREADCRUMB /* 44 */:
                                                                                    this.f22141n = Collections.EMPTY_LIST;
                                                                                    if (i12 != 1) {
                                                                                        j();
                                                                                    } else {
                                                                                        j();
                                                                                    }
                                                                                    break;
                                                                                case ChatViewRecyclerTypes.REACTION_BURST_REACTION /* 45 */:
                                                                                    if (i12 == 1) {
                                                                                        b bVar116 = this.f22140m;
                                                                                        arrayList = bVar116.f22127b;
                                                                                        arrayList.add(bVar116.d());
                                                                                        bVar116.f22128c.setLength(0);
                                                                                        bVar116.f22126a.clear();
                                                                                        iMin = Math.min(bVar116.f22133h, bVar116.f22129d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    j();
                                                                                    break;
                                                                                case ChatViewRecyclerTypes.REACTION_ADD_REACTION /* 47 */:
                                                                                    this.f22141n = i();
                                                                                    j();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f22140m.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            k(3);
                                                        }
                                                    }
                                                } else if ((b10 & 240) != 16) {
                                                    if (i10 != 23) {
                                                        if (i11 == 20) {
                                                            if (b11 == 32) {
                                                                k(2);
                                                            } else if (b11 != 41) {
                                                                switch (b11) {
                                                                    case ChatViewRecyclerTypes.POLL_TEXT_AND_IMAGE /* 37 */:
                                                                        k(1);
                                                                        this.f22144q = 2;
                                                                        this.f22140m.f22133h = 2;
                                                                        break;
                                                                    case ChatViewRecyclerTypes.POLL_IMAGE_ONLY /* 38 */:
                                                                        k(1);
                                                                        this.f22144q = 3;
                                                                        this.f22140m.f22133h = 3;
                                                                        break;
                                                                    case ChatViewRecyclerTypes.SAFETY_SYSTEM_NOTIFICATION /* 39 */:
                                                                        k(1);
                                                                        this.f22144q = 4;
                                                                        this.f22140m.f22133h = 4;
                                                                        break;
                                                                    default:
                                                                        i12 = this.f22143p;
                                                                        if (i12 != 0) {
                                                                            if (b11 != 33) {
                                                                                switch (b11) {
                                                                                    case ChatViewRecyclerTypes.FORWARD_BREADCRUMB /* 44 */:
                                                                                        this.f22141n = Collections.EMPTY_LIST;
                                                                                        if (i12 != 1) {
                                                                                            j();
                                                                                        } else {
                                                                                            j();
                                                                                        }
                                                                                        break;
                                                                                    case ChatViewRecyclerTypes.REACTION_BURST_REACTION /* 45 */:
                                                                                        if (i12 == 1) {
                                                                                            b bVar117 = this.f22140m;
                                                                                            arrayList = bVar117.f22127b;
                                                                                            arrayList.add(bVar117.d());
                                                                                            bVar117.f22128c.setLength(0);
                                                                                            bVar117.f22126a.clear();
                                                                                            iMin = Math.min(bVar117.f22133h, bVar117.f22129d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        j();
                                                                                        break;
                                                                                    case ChatViewRecyclerTypes.REACTION_ADD_REACTION /* 47 */:
                                                                                        this.f22141n = i();
                                                                                        j();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f22140m.b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                k(3);
                                                            }
                                                        }
                                                    } else if (i11 == 20) {
                                                        if (b11 == 32) {
                                                            k(2);
                                                        } else if (b11 != 41) {
                                                            switch (b11) {
                                                                case ChatViewRecyclerTypes.POLL_TEXT_AND_IMAGE /* 37 */:
                                                                    k(1);
                                                                    this.f22144q = 2;
                                                                    this.f22140m.f22133h = 2;
                                                                    break;
                                                                case ChatViewRecyclerTypes.POLL_IMAGE_ONLY /* 38 */:
                                                                    k(1);
                                                                    this.f22144q = 3;
                                                                    this.f22140m.f22133h = 3;
                                                                    break;
                                                                case ChatViewRecyclerTypes.SAFETY_SYSTEM_NOTIFICATION /* 39 */:
                                                                    k(1);
                                                                    this.f22144q = 4;
                                                                    this.f22140m.f22133h = 4;
                                                                    break;
                                                                default:
                                                                    i12 = this.f22143p;
                                                                    if (i12 != 0) {
                                                                        if (b11 != 33) {
                                                                            switch (b11) {
                                                                                case ChatViewRecyclerTypes.FORWARD_BREADCRUMB /* 44 */:
                                                                                    this.f22141n = Collections.EMPTY_LIST;
                                                                                    if (i12 != 1) {
                                                                                        j();
                                                                                    } else {
                                                                                        j();
                                                                                    }
                                                                                    break;
                                                                                case ChatViewRecyclerTypes.REACTION_BURST_REACTION /* 45 */:
                                                                                    if (i12 == 1) {
                                                                                        b bVar118 = this.f22140m;
                                                                                        arrayList = bVar118.f22127b;
                                                                                        arrayList.add(bVar118.d());
                                                                                        bVar118.f22128c.setLength(0);
                                                                                        bVar118.f22126a.clear();
                                                                                        iMin = Math.min(bVar118.f22133h, bVar118.f22129d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    j();
                                                                                    break;
                                                                                case ChatViewRecyclerTypes.REACTION_ADD_REACTION /* 47 */:
                                                                                    this.f22141n = i();
                                                                                    j();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f22140m.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            k(3);
                                                        }
                                                    }
                                                } else if (i10 != 23) {
                                                    if (i11 == 20) {
                                                        if (b11 == 32) {
                                                            k(2);
                                                        } else if (b11 != 41) {
                                                            switch (b11) {
                                                                case ChatViewRecyclerTypes.POLL_TEXT_AND_IMAGE /* 37 */:
                                                                    k(1);
                                                                    this.f22144q = 2;
                                                                    this.f22140m.f22133h = 2;
                                                                    break;
                                                                case ChatViewRecyclerTypes.POLL_IMAGE_ONLY /* 38 */:
                                                                    k(1);
                                                                    this.f22144q = 3;
                                                                    this.f22140m.f22133h = 3;
                                                                    break;
                                                                case ChatViewRecyclerTypes.SAFETY_SYSTEM_NOTIFICATION /* 39 */:
                                                                    k(1);
                                                                    this.f22144q = 4;
                                                                    this.f22140m.f22133h = 4;
                                                                    break;
                                                                default:
                                                                    i12 = this.f22143p;
                                                                    if (i12 != 0) {
                                                                        if (b11 != 33) {
                                                                            switch (b11) {
                                                                                case ChatViewRecyclerTypes.FORWARD_BREADCRUMB /* 44 */:
                                                                                    this.f22141n = Collections.EMPTY_LIST;
                                                                                    if (i12 != 1) {
                                                                                        j();
                                                                                    } else {
                                                                                        j();
                                                                                    }
                                                                                    break;
                                                                                case ChatViewRecyclerTypes.REACTION_BURST_REACTION /* 45 */:
                                                                                    if (i12 == 1) {
                                                                                        b bVar119 = this.f22140m;
                                                                                        arrayList = bVar119.f22127b;
                                                                                        arrayList.add(bVar119.d());
                                                                                        bVar119.f22128c.setLength(0);
                                                                                        bVar119.f22126a.clear();
                                                                                        iMin = Math.min(bVar119.f22133h, bVar119.f22129d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    j();
                                                                                    break;
                                                                                case ChatViewRecyclerTypes.REACTION_ADD_REACTION /* 47 */:
                                                                                    this.f22141n = i();
                                                                                    j();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f22140m.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            k(3);
                                                        }
                                                    }
                                                } else if (i11 == 20) {
                                                    if (b11 == 32) {
                                                        k(2);
                                                    } else if (b11 != 41) {
                                                        switch (b11) {
                                                            case ChatViewRecyclerTypes.POLL_TEXT_AND_IMAGE /* 37 */:
                                                                k(1);
                                                                this.f22144q = 2;
                                                                this.f22140m.f22133h = 2;
                                                                break;
                                                            case ChatViewRecyclerTypes.POLL_IMAGE_ONLY /* 38 */:
                                                                k(1);
                                                                this.f22144q = 3;
                                                                this.f22140m.f22133h = 3;
                                                                break;
                                                            case ChatViewRecyclerTypes.SAFETY_SYSTEM_NOTIFICATION /* 39 */:
                                                                k(1);
                                                                this.f22144q = 4;
                                                                this.f22140m.f22133h = 4;
                                                                break;
                                                            default:
                                                                i12 = this.f22143p;
                                                                if (i12 != 0) {
                                                                    if (b11 != 33) {
                                                                        switch (b11) {
                                                                            case ChatViewRecyclerTypes.FORWARD_BREADCRUMB /* 44 */:
                                                                                this.f22141n = Collections.EMPTY_LIST;
                                                                                if (i12 != 1) {
                                                                                    j();
                                                                                } else {
                                                                                    j();
                                                                                }
                                                                                break;
                                                                            case ChatViewRecyclerTypes.REACTION_BURST_REACTION /* 45 */:
                                                                                if (i12 == 1) {
                                                                                    b bVar1110 = this.f22140m;
                                                                                    arrayList = bVar1110.f22127b;
                                                                                    arrayList.add(bVar1110.d());
                                                                                    bVar1110.f22128c.setLength(0);
                                                                                    bVar1110.f22126a.clear();
                                                                                    iMin = Math.min(bVar1110.f22133h, bVar1110.f22129d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                j();
                                                                                break;
                                                                            case ChatViewRecyclerTypes.REACTION_ADD_REACTION /* 47 */:
                                                                                this.f22141n = i();
                                                                                j();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f22140m.b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        k(3);
                                                    }
                                                }
                                            } else if (i10 != 17) {
                                                if ((b10 & 240) != 16) {
                                                    if (i10 != 23) {
                                                        if (i11 == 20) {
                                                            if (b11 == 32) {
                                                                k(2);
                                                            } else if (b11 != 41) {
                                                                switch (b11) {
                                                                    case ChatViewRecyclerTypes.POLL_TEXT_AND_IMAGE /* 37 */:
                                                                        k(1);
                                                                        this.f22144q = 2;
                                                                        this.f22140m.f22133h = 2;
                                                                        break;
                                                                    case ChatViewRecyclerTypes.POLL_IMAGE_ONLY /* 38 */:
                                                                        k(1);
                                                                        this.f22144q = 3;
                                                                        this.f22140m.f22133h = 3;
                                                                        break;
                                                                    case ChatViewRecyclerTypes.SAFETY_SYSTEM_NOTIFICATION /* 39 */:
                                                                        k(1);
                                                                        this.f22144q = 4;
                                                                        this.f22140m.f22133h = 4;
                                                                        break;
                                                                    default:
                                                                        i12 = this.f22143p;
                                                                        if (i12 != 0) {
                                                                            if (b11 != 33) {
                                                                                switch (b11) {
                                                                                    case ChatViewRecyclerTypes.FORWARD_BREADCRUMB /* 44 */:
                                                                                        this.f22141n = Collections.EMPTY_LIST;
                                                                                        if (i12 != 1) {
                                                                                            j();
                                                                                        } else {
                                                                                            j();
                                                                                        }
                                                                                        break;
                                                                                    case ChatViewRecyclerTypes.REACTION_BURST_REACTION /* 45 */:
                                                                                        if (i12 == 1) {
                                                                                            b bVar1111 = this.f22140m;
                                                                                            arrayList = bVar1111.f22127b;
                                                                                            arrayList.add(bVar1111.d());
                                                                                            bVar1111.f22128c.setLength(0);
                                                                                            bVar1111.f22126a.clear();
                                                                                            iMin = Math.min(bVar1111.f22133h, bVar1111.f22129d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        j();
                                                                                        break;
                                                                                    case ChatViewRecyclerTypes.REACTION_ADD_REACTION /* 47 */:
                                                                                        this.f22141n = i();
                                                                                        j();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f22140m.b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                k(3);
                                                            }
                                                        }
                                                    } else if (i11 == 20) {
                                                        if (b11 == 32) {
                                                            k(2);
                                                        } else if (b11 != 41) {
                                                            switch (b11) {
                                                                case ChatViewRecyclerTypes.POLL_TEXT_AND_IMAGE /* 37 */:
                                                                    k(1);
                                                                    this.f22144q = 2;
                                                                    this.f22140m.f22133h = 2;
                                                                    break;
                                                                case ChatViewRecyclerTypes.POLL_IMAGE_ONLY /* 38 */:
                                                                    k(1);
                                                                    this.f22144q = 3;
                                                                    this.f22140m.f22133h = 3;
                                                                    break;
                                                                case ChatViewRecyclerTypes.SAFETY_SYSTEM_NOTIFICATION /* 39 */:
                                                                    k(1);
                                                                    this.f22144q = 4;
                                                                    this.f22140m.f22133h = 4;
                                                                    break;
                                                                default:
                                                                    i12 = this.f22143p;
                                                                    if (i12 != 0) {
                                                                        if (b11 != 33) {
                                                                            switch (b11) {
                                                                                case ChatViewRecyclerTypes.FORWARD_BREADCRUMB /* 44 */:
                                                                                    this.f22141n = Collections.EMPTY_LIST;
                                                                                    if (i12 != 1) {
                                                                                        j();
                                                                                    } else {
                                                                                        j();
                                                                                    }
                                                                                    break;
                                                                                case ChatViewRecyclerTypes.REACTION_BURST_REACTION /* 45 */:
                                                                                    if (i12 == 1) {
                                                                                        b bVar1112 = this.f22140m;
                                                                                        arrayList = bVar1112.f22127b;
                                                                                        arrayList.add(bVar1112.d());
                                                                                        bVar1112.f22128c.setLength(0);
                                                                                        bVar1112.f22126a.clear();
                                                                                        iMin = Math.min(bVar1112.f22133h, bVar1112.f22129d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    j();
                                                                                    break;
                                                                                case ChatViewRecyclerTypes.REACTION_ADD_REACTION /* 47 */:
                                                                                    this.f22141n = i();
                                                                                    j();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f22140m.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            k(3);
                                                        }
                                                    }
                                                } else if (i10 != 23) {
                                                    if (i11 == 20) {
                                                        if (b11 == 32) {
                                                            k(2);
                                                        } else if (b11 != 41) {
                                                            switch (b11) {
                                                                case ChatViewRecyclerTypes.POLL_TEXT_AND_IMAGE /* 37 */:
                                                                    k(1);
                                                                    this.f22144q = 2;
                                                                    this.f22140m.f22133h = 2;
                                                                    break;
                                                                case ChatViewRecyclerTypes.POLL_IMAGE_ONLY /* 38 */:
                                                                    k(1);
                                                                    this.f22144q = 3;
                                                                    this.f22140m.f22133h = 3;
                                                                    break;
                                                                case ChatViewRecyclerTypes.SAFETY_SYSTEM_NOTIFICATION /* 39 */:
                                                                    k(1);
                                                                    this.f22144q = 4;
                                                                    this.f22140m.f22133h = 4;
                                                                    break;
                                                                default:
                                                                    i12 = this.f22143p;
                                                                    if (i12 != 0) {
                                                                        if (b11 != 33) {
                                                                            switch (b11) {
                                                                                case ChatViewRecyclerTypes.FORWARD_BREADCRUMB /* 44 */:
                                                                                    this.f22141n = Collections.EMPTY_LIST;
                                                                                    if (i12 != 1) {
                                                                                        j();
                                                                                    } else {
                                                                                        j();
                                                                                    }
                                                                                    break;
                                                                                case ChatViewRecyclerTypes.REACTION_BURST_REACTION /* 45 */:
                                                                                    if (i12 == 1) {
                                                                                        b bVar1113 = this.f22140m;
                                                                                        arrayList = bVar1113.f22127b;
                                                                                        arrayList.add(bVar1113.d());
                                                                                        bVar1113.f22128c.setLength(0);
                                                                                        bVar1113.f22126a.clear();
                                                                                        iMin = Math.min(bVar1113.f22133h, bVar1113.f22129d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    j();
                                                                                    break;
                                                                                case ChatViewRecyclerTypes.REACTION_ADD_REACTION /* 47 */:
                                                                                    this.f22141n = i();
                                                                                    j();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f22140m.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            k(3);
                                                        }
                                                    }
                                                } else if (i11 == 20) {
                                                    if (b11 == 32) {
                                                        k(2);
                                                    } else if (b11 != 41) {
                                                        switch (b11) {
                                                            case ChatViewRecyclerTypes.POLL_TEXT_AND_IMAGE /* 37 */:
                                                                k(1);
                                                                this.f22144q = 2;
                                                                this.f22140m.f22133h = 2;
                                                                break;
                                                            case ChatViewRecyclerTypes.POLL_IMAGE_ONLY /* 38 */:
                                                                k(1);
                                                                this.f22144q = 3;
                                                                this.f22140m.f22133h = 3;
                                                                break;
                                                            case ChatViewRecyclerTypes.SAFETY_SYSTEM_NOTIFICATION /* 39 */:
                                                                k(1);
                                                                this.f22144q = 4;
                                                                this.f22140m.f22133h = 4;
                                                                break;
                                                            default:
                                                                i12 = this.f22143p;
                                                                if (i12 != 0) {
                                                                    if (b11 != 33) {
                                                                        switch (b11) {
                                                                            case ChatViewRecyclerTypes.FORWARD_BREADCRUMB /* 44 */:
                                                                                this.f22141n = Collections.EMPTY_LIST;
                                                                                if (i12 != 1) {
                                                                                    j();
                                                                                } else {
                                                                                    j();
                                                                                }
                                                                                break;
                                                                            case ChatViewRecyclerTypes.REACTION_BURST_REACTION /* 45 */:
                                                                                if (i12 == 1) {
                                                                                    b bVar1114 = this.f22140m;
                                                                                    arrayList = bVar1114.f22127b;
                                                                                    arrayList.add(bVar1114.d());
                                                                                    bVar1114.f22128c.setLength(0);
                                                                                    bVar1114.f22126a.clear();
                                                                                    iMin = Math.min(bVar1114.f22133h, bVar1114.f22129d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                j();
                                                                                break;
                                                                            case ChatViewRecyclerTypes.REACTION_ADD_REACTION /* 47 */:
                                                                                this.f22141n = i();
                                                                                j();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f22140m.b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        k(3);
                                                    }
                                                }
                                            } else if ((b10 & 240) != 16) {
                                                if (i10 != 23) {
                                                    if (i11 == 20) {
                                                        if (b11 == 32) {
                                                            k(2);
                                                        } else if (b11 != 41) {
                                                            switch (b11) {
                                                                case ChatViewRecyclerTypes.POLL_TEXT_AND_IMAGE /* 37 */:
                                                                    k(1);
                                                                    this.f22144q = 2;
                                                                    this.f22140m.f22133h = 2;
                                                                    break;
                                                                case ChatViewRecyclerTypes.POLL_IMAGE_ONLY /* 38 */:
                                                                    k(1);
                                                                    this.f22144q = 3;
                                                                    this.f22140m.f22133h = 3;
                                                                    break;
                                                                case ChatViewRecyclerTypes.SAFETY_SYSTEM_NOTIFICATION /* 39 */:
                                                                    k(1);
                                                                    this.f22144q = 4;
                                                                    this.f22140m.f22133h = 4;
                                                                    break;
                                                                default:
                                                                    i12 = this.f22143p;
                                                                    if (i12 != 0) {
                                                                        if (b11 != 33) {
                                                                            switch (b11) {
                                                                                case ChatViewRecyclerTypes.FORWARD_BREADCRUMB /* 44 */:
                                                                                    this.f22141n = Collections.EMPTY_LIST;
                                                                                    if (i12 != 1) {
                                                                                        j();
                                                                                    } else {
                                                                                        j();
                                                                                    }
                                                                                    break;
                                                                                case ChatViewRecyclerTypes.REACTION_BURST_REACTION /* 45 */:
                                                                                    if (i12 == 1) {
                                                                                        b bVar1115 = this.f22140m;
                                                                                        arrayList = bVar1115.f22127b;
                                                                                        arrayList.add(bVar1115.d());
                                                                                        bVar1115.f22128c.setLength(0);
                                                                                        bVar1115.f22126a.clear();
                                                                                        iMin = Math.min(bVar1115.f22133h, bVar1115.f22129d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    j();
                                                                                    break;
                                                                                case ChatViewRecyclerTypes.REACTION_ADD_REACTION /* 47 */:
                                                                                    this.f22141n = i();
                                                                                    j();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f22140m.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            k(3);
                                                        }
                                                    }
                                                } else if (i11 == 20) {
                                                    if (b11 == 32) {
                                                        k(2);
                                                    } else if (b11 != 41) {
                                                        switch (b11) {
                                                            case ChatViewRecyclerTypes.POLL_TEXT_AND_IMAGE /* 37 */:
                                                                k(1);
                                                                this.f22144q = 2;
                                                                this.f22140m.f22133h = 2;
                                                                break;
                                                            case ChatViewRecyclerTypes.POLL_IMAGE_ONLY /* 38 */:
                                                                k(1);
                                                                this.f22144q = 3;
                                                                this.f22140m.f22133h = 3;
                                                                break;
                                                            case ChatViewRecyclerTypes.SAFETY_SYSTEM_NOTIFICATION /* 39 */:
                                                                k(1);
                                                                this.f22144q = 4;
                                                                this.f22140m.f22133h = 4;
                                                                break;
                                                            default:
                                                                i12 = this.f22143p;
                                                                if (i12 != 0) {
                                                                    if (b11 != 33) {
                                                                        switch (b11) {
                                                                            case ChatViewRecyclerTypes.FORWARD_BREADCRUMB /* 44 */:
                                                                                this.f22141n = Collections.EMPTY_LIST;
                                                                                if (i12 != 1) {
                                                                                    j();
                                                                                } else {
                                                                                    j();
                                                                                }
                                                                                break;
                                                                            case ChatViewRecyclerTypes.REACTION_BURST_REACTION /* 45 */:
                                                                                if (i12 == 1) {
                                                                                    b bVar1116 = this.f22140m;
                                                                                    arrayList = bVar1116.f22127b;
                                                                                    arrayList.add(bVar1116.d());
                                                                                    bVar1116.f22128c.setLength(0);
                                                                                    bVar1116.f22126a.clear();
                                                                                    iMin = Math.min(bVar1116.f22133h, bVar1116.f22129d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                j();
                                                                                break;
                                                                            case ChatViewRecyclerTypes.REACTION_ADD_REACTION /* 47 */:
                                                                                this.f22141n = i();
                                                                                j();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f22140m.b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        k(3);
                                                    }
                                                }
                                            } else if (i10 != 23) {
                                                if (i11 == 20) {
                                                    if (b11 == 32) {
                                                        k(2);
                                                    } else if (b11 != 41) {
                                                        switch (b11) {
                                                            case ChatViewRecyclerTypes.POLL_TEXT_AND_IMAGE /* 37 */:
                                                                k(1);
                                                                this.f22144q = 2;
                                                                this.f22140m.f22133h = 2;
                                                                break;
                                                            case ChatViewRecyclerTypes.POLL_IMAGE_ONLY /* 38 */:
                                                                k(1);
                                                                this.f22144q = 3;
                                                                this.f22140m.f22133h = 3;
                                                                break;
                                                            case ChatViewRecyclerTypes.SAFETY_SYSTEM_NOTIFICATION /* 39 */:
                                                                k(1);
                                                                this.f22144q = 4;
                                                                this.f22140m.f22133h = 4;
                                                                break;
                                                            default:
                                                                i12 = this.f22143p;
                                                                if (i12 != 0) {
                                                                    if (b11 != 33) {
                                                                        switch (b11) {
                                                                            case ChatViewRecyclerTypes.FORWARD_BREADCRUMB /* 44 */:
                                                                                this.f22141n = Collections.EMPTY_LIST;
                                                                                if (i12 != 1) {
                                                                                    j();
                                                                                } else {
                                                                                    j();
                                                                                }
                                                                                break;
                                                                            case ChatViewRecyclerTypes.REACTION_BURST_REACTION /* 45 */:
                                                                                if (i12 == 1) {
                                                                                    b bVar1117 = this.f22140m;
                                                                                    arrayList = bVar1117.f22127b;
                                                                                    arrayList.add(bVar1117.d());
                                                                                    bVar1117.f22128c.setLength(0);
                                                                                    bVar1117.f22126a.clear();
                                                                                    iMin = Math.min(bVar1117.f22133h, bVar1117.f22129d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                j();
                                                                                break;
                                                                            case ChatViewRecyclerTypes.REACTION_ADD_REACTION /* 47 */:
                                                                                this.f22141n = i();
                                                                                j();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f22140m.b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        k(3);
                                                    }
                                                }
                                            } else if (i11 == 20) {
                                                if (b11 == 32) {
                                                    k(2);
                                                } else if (b11 != 41) {
                                                    switch (b11) {
                                                        case ChatViewRecyclerTypes.POLL_TEXT_AND_IMAGE /* 37 */:
                                                            k(1);
                                                            this.f22144q = 2;
                                                            this.f22140m.f22133h = 2;
                                                            break;
                                                        case ChatViewRecyclerTypes.POLL_IMAGE_ONLY /* 38 */:
                                                            k(1);
                                                            this.f22144q = 3;
                                                            this.f22140m.f22133h = 3;
                                                            break;
                                                        case ChatViewRecyclerTypes.SAFETY_SYSTEM_NOTIFICATION /* 39 */:
                                                            k(1);
                                                            this.f22144q = 4;
                                                            this.f22140m.f22133h = 4;
                                                            break;
                                                        default:
                                                            i12 = this.f22143p;
                                                            if (i12 != 0) {
                                                                if (b11 != 33) {
                                                                    switch (b11) {
                                                                        case ChatViewRecyclerTypes.FORWARD_BREADCRUMB /* 44 */:
                                                                            this.f22141n = Collections.EMPTY_LIST;
                                                                            if (i12 != 1) {
                                                                                j();
                                                                            } else {
                                                                                j();
                                                                            }
                                                                            break;
                                                                        case ChatViewRecyclerTypes.REACTION_BURST_REACTION /* 45 */:
                                                                            if (i12 == 1) {
                                                                                b bVar1118 = this.f22140m;
                                                                                arrayList = bVar1118.f22127b;
                                                                                arrayList.add(bVar1118.d());
                                                                                bVar1118.f22128c.setLength(0);
                                                                                bVar1118.f22126a.clear();
                                                                                iMin = Math.min(bVar1118.f22133h, bVar1118.f22129d);
                                                                                while (arrayList.size() >= iMin) {
                                                                                    arrayList.remove(0);
                                                                                }
                                                                            }
                                                                            break;
                                                                        case 46:
                                                                            j();
                                                                            break;
                                                                        case ChatViewRecyclerTypes.REACTION_ADD_REACTION /* 47 */:
                                                                            this.f22141n = i();
                                                                            j();
                                                                            break;
                                                                    }
                                                                } else {
                                                                    this.f22140m.b();
                                                                    break;
                                                                }
                                                            }
                                                            break;
                                                    }
                                                } else {
                                                    k(3);
                                                }
                                            }
                                        }
                                    } else {
                                        b bVar20 = this.f22140m;
                                        int i18 = (b10 & ByteCompanionObject.MAX_VALUE) - 32;
                                        iArr = B;
                                        bVar20.a((char) iArr[i18]);
                                        if ((b11 & 224) != 0) {
                                            this.f22140m.a((char) iArr[(b11 & ByteCompanionObject.MAX_VALUE) - 32]);
                                        }
                                    }
                                    z6 = true;
                                }
                            }
                        } else if (z7) {
                            j();
                            z6 = true;
                        }
                    }
                }
            }
        }
    }

    @Override // wd.h, lc.d
    public final void flush() {
        super.flush();
        this.f22141n = null;
        this.f22142o = null;
        k(0);
        this.f22144q = 4;
        this.f22140m.f22133h = 4;
        j();
        this.f22145r = false;
        this.f22146s = false;
        this.f22147t = (byte) 0;
        this.f22148u = (byte) 0;
        this.f22149v = 0;
        this.f22150w = true;
        this.f22151x = -9223372036854775807L;
    }

    @Override // wd.h, lc.d
    /* JADX INFO: renamed from: g */
    public final vd.d c() {
        vd.d dVar;
        vd.d dVarC = super.c();
        if (dVarC != null) {
            return dVarC;
        }
        long j = this.k;
        if (j == -9223372036854775807L) {
            return null;
        }
        long j5 = this.f22151x;
        if (j5 == -9223372036854775807L || this.f22191e - j5 < j || (dVar = (vd.d) this.f22188b.pollFirst()) == null) {
            return null;
        }
        this.f22141n = Collections.EMPTY_LIST;
        this.f22151x = -9223372036854775807L;
        dVar.g(this.f22191e, e(), LongCompanionObject.MAX_VALUE);
        return dVar;
    }

    @Override // wd.h
    public final boolean h() {
        return this.f22141n != this.f22142o;
    }

    public final ArrayList i() {
        ArrayList arrayList = this.f22139l;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        int iMin = 2;
        for (int i7 = 0; i7 < size; i7++) {
            vd.c cVarC = ((b) arrayList.get(i7)).c(Integer.MIN_VALUE);
            arrayList2.add(cVarC);
            if (cVarC != null) {
                iMin = Math.min(iMin, cVarC.F);
            }
        }
        ArrayList arrayList3 = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            vd.c cVarC2 = (vd.c) arrayList2.get(i10);
            if (cVarC2 != null) {
                if (cVarC2.F != iMin) {
                    cVarC2 = ((b) arrayList.get(i10)).c(iMin);
                    cVarC2.getClass();
                }
                arrayList3.add(cVarC2);
            }
        }
        return arrayList3;
    }

    public final void j() {
        b bVar = this.f22140m;
        bVar.f22132g = this.f22143p;
        bVar.f22126a.clear();
        bVar.f22127b.clear();
        bVar.f22128c.setLength(0);
        bVar.f22129d = 15;
        bVar.f22130e = 0;
        bVar.f22131f = 0;
        ArrayList arrayList = this.f22139l;
        arrayList.clear();
        arrayList.add(this.f22140m);
    }

    public final void k(int i7) {
        int i10 = this.f22143p;
        if (i10 == i7) {
            return;
        }
        this.f22143p = i7;
        if (i7 != 3) {
            j();
            if (i10 == 3 || i7 == 1 || i7 == 0) {
                this.f22141n = Collections.EMPTY_LIST;
                return;
            }
            return;
        }
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f22139l;
            if (i11 >= arrayList.size()) {
                return;
            }
            ((b) arrayList.get(i11)).f22132g = i7;
            i11++;
        }
    }

    @Override // wd.h, lc.d
    public final void release() {
    }
}

package wd;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import com.discord.chat.presentation.message.view.MediaImageViewKt;
import com.discord.misc.utilities.chat_view_types.ChatViewRecyclerTypes;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import je.v;
import je.w;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends h {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w f22179g = new w();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final v f22180h = new v();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f22181i = -1;
    public final int j;
    public final e[] k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public e f22182l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public List f22183m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public List f22184n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public v f22185o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f22186p;

    public f(int i7, List list) {
        this.j = i7 == -1 ? 1 : i7;
        if (list != null && list.size() == 1 && ((byte[]) list.get(0)).length == 1) {
            byte b10 = ((byte[]) list.get(0))[0];
        }
        this.k = new e[8];
        for (int i10 = 0; i10 < 8; i10++) {
            this.k[i10] = new e();
        }
        this.f22182l = this.k[0];
    }

    @Override // wd.h
    public final op.c e() {
        List list = this.f22183m;
        this.f22184n = list;
        list.getClass();
        return new op.c(12, list);
    }

    @Override // wd.h
    public final void f(g gVar) {
        ByteBuffer byteBuffer = gVar.f15010v;
        byteBuffer.getClass();
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        w wVar = this.f22179g;
        wVar.D(bArrArray, iLimit);
        while (wVar.a() >= 3) {
            int iU = wVar.u();
            int i7 = iU & 3;
            boolean z5 = (iU & 4) == 4;
            byte bU = (byte) wVar.u();
            byte bU2 = (byte) wVar.u();
            if (i7 == 2 || i7 == 3) {
                if (z5) {
                    if (i7 == 3) {
                        i();
                        int i10 = (bU & 192) >> 6;
                        int i11 = this.f22181i;
                        if (i11 != -1 && i10 != (i11 + 1) % 4) {
                            k();
                            je.b.N("Cea708Decoder", "Sequence number discontinuity. previous=" + this.f22181i + " current=" + i10);
                        }
                        this.f22181i = i10;
                        int i12 = bU & 63;
                        if (i12 == 0) {
                            i12 = 64;
                        }
                        v vVar = new v(i10, i12);
                        this.f22185o = vVar;
                        byte[] bArr = vVar.f13853b;
                        vVar.f13856e = 1;
                        bArr[0] = bU2;
                    } else {
                        je.b.g(i7 == 2);
                        v vVar2 = this.f22185o;
                        if (vVar2 == null) {
                            je.b.r("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = vVar2.f13853b;
                            int i13 = vVar2.f13856e;
                            int i14 = i13 + 1;
                            vVar2.f13856e = i14;
                            bArr2[i13] = bU;
                            vVar2.f13856e = i13 + 2;
                            bArr2[i14] = bU2;
                        }
                    }
                    v vVar3 = this.f22185o;
                    if (vVar3.f13856e == (vVar3.f13855d * 2) - 1) {
                        i();
                    }
                }
            }
        }
    }

    @Override // wd.h, lc.d
    public final void flush() {
        super.flush();
        this.f22183m = null;
        this.f22184n = null;
        this.f22186p = 0;
        this.f22182l = this.k[0];
        k();
        this.f22185o = null;
    }

    @Override // wd.h
    public final boolean h() {
        return this.f22183m != this.f22184n;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:232:0x057b  */
    public final void i() {
        boolean z5;
        char c8;
        v vVar = this.f22185o;
        if (vVar == null) {
            return;
        }
        int i7 = 2;
        if (vVar.f13856e != (vVar.f13855d * 2) - 1) {
            je.b.q("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.f22185o.f13855d * 2) - 1) + ", but current index is " + this.f22185o.f13856e + " (sequence number " + this.f22185o.f13854c + ");");
        }
        v vVar2 = this.f22185o;
        byte[] bArr = vVar2.f13853b;
        int i10 = vVar2.f13856e;
        v vVar3 = this.f22180h;
        vVar3.o(bArr, i10);
        boolean z6 = false;
        while (vVar3.b() > 0) {
            int i11 = 3;
            int i12 = vVar3.i(3);
            int i13 = vVar3.i(5);
            if (i12 == 7) {
                vVar3.s(i7);
                i12 = vVar3.i(6);
                if (i12 < 7) {
                    com.discord.chat.presentation.list.a.q(i12, "Invalid extended service number: ", "Cea708Decoder");
                }
            }
            if (i13 == 0) {
                if (i12 != 0) {
                    je.b.N("Cea708Decoder", "serviceNumber is non-zero (" + i12 + ") when blockSize is 0");
                }
                if (z6) {
                    this.f22183m = j();
                }
                this.f22185o = null;
            }
            if (i12 != this.j) {
                vVar3.t(i13);
            } else {
                int iG = (i13 * 8) + vVar3.g();
                while (vVar3.g() < iG) {
                    int i14 = vVar3.i(8);
                    if (i14 != 16) {
                        if (i14 > 31) {
                            if (i14 <= 127) {
                                if (i14 == 127) {
                                    this.f22182l.a((char) 9835);
                                } else {
                                    this.f22182l.a((char) (i14 & 255));
                                }
                                z6 = true;
                            } else {
                                if (i14 <= 159) {
                                    e[] eVarArr = this.k;
                                    switch (i14) {
                                        case IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT /* 128 */:
                                        case 129:
                                        case 130:
                                        case 131:
                                        case 132:
                                        case 133:
                                        case 134:
                                        case 135:
                                            i11 = i11;
                                            iG = iG;
                                            z5 = true;
                                            int i15 = i14 - 128;
                                            if (this.f22186p != i15) {
                                                this.f22186p = i15;
                                                this.f22182l = eVarArr[i15];
                                            }
                                            break;
                                        case 136:
                                            i11 = i11;
                                            iG = iG;
                                            z5 = true;
                                            for (int i16 = 1; i16 <= 8; i16++) {
                                                if (vVar3.h()) {
                                                    e eVar = eVarArr[8 - i16];
                                                    eVar.f22159a.clear();
                                                    eVar.f22160b.clear();
                                                    eVar.f22172p = -1;
                                                    eVar.f22173q = -1;
                                                    eVar.f22174r = -1;
                                                    eVar.f22176t = -1;
                                                    eVar.f22178v = 0;
                                                }
                                            }
                                            break;
                                        case 137:
                                            i11 = i11;
                                            iG = iG;
                                            for (int i17 = 1; i17 <= 8; i17++) {
                                                if (vVar3.h()) {
                                                    eVarArr[8 - i17].f22162d = true;
                                                }
                                            }
                                            z5 = true;
                                            break;
                                        case 138:
                                            i11 = i11;
                                            iG = iG;
                                            for (int i18 = 1; i18 <= 8; i18++) {
                                                if (vVar3.h()) {
                                                    eVarArr[8 - i18].f22162d = false;
                                                }
                                            }
                                            z5 = true;
                                            break;
                                        case 139:
                                            i11 = i11;
                                            iG = iG;
                                            for (int i19 = 1; i19 <= 8; i19++) {
                                                if (vVar3.h()) {
                                                    e eVar2 = eVarArr[8 - i19];
                                                    eVar2.f22162d = !eVar2.f22162d;
                                                }
                                            }
                                            z5 = true;
                                            break;
                                        case 140:
                                            i11 = i11;
                                            iG = iG;
                                            for (int i20 = 1; i20 <= 8; i20++) {
                                                if (vVar3.h()) {
                                                    eVarArr[8 - i20].d();
                                                }
                                            }
                                            z5 = true;
                                            break;
                                        case 141:
                                            i11 = i11;
                                            iG = iG;
                                            vVar3.s(8);
                                            z5 = true;
                                            break;
                                        case 142:
                                            i11 = i11;
                                            iG = iG;
                                            z5 = true;
                                            break;
                                        case 143:
                                            i11 = i11;
                                            iG = iG;
                                            k();
                                            z5 = true;
                                            break;
                                        case 144:
                                            int i21 = i7;
                                            iG = iG;
                                            if (this.f22182l.f22161c) {
                                                vVar3.i(4);
                                                vVar3.i(i21);
                                                vVar3.i(i21);
                                                boolean zH = vVar3.h();
                                                boolean zH2 = vVar3.h();
                                                i11 = 3;
                                                vVar3.i(3);
                                                vVar3.i(3);
                                                this.f22182l.e(zH, zH2);
                                            } else {
                                                vVar3.s(16);
                                                i11 = 3;
                                            }
                                            z5 = true;
                                            break;
                                        case 145:
                                            iG = iG;
                                            if (this.f22182l.f22161c) {
                                                int iC = e.c(vVar3.i(2), vVar3.i(2), vVar3.i(2), vVar3.i(2));
                                                int iC2 = e.c(vVar3.i(2), vVar3.i(2), vVar3.i(2), vVar3.i(2));
                                                vVar3.s(2);
                                                e.c(vVar3.i(2), vVar3.i(2), vVar3.i(2), 0);
                                                this.f22182l.f(iC, iC2);
                                            } else {
                                                vVar3.s(24);
                                            }
                                            i11 = 3;
                                            z5 = true;
                                            break;
                                        case MediaImageViewKt.OBSCURED_IMAGE_MIN_WIDTH /* 146 */:
                                            iG = iG;
                                            if (this.f22182l.f22161c) {
                                                vVar3.s(4);
                                                int i22 = vVar3.i(4);
                                                vVar3.s(2);
                                                vVar3.i(6);
                                                e eVar3 = this.f22182l;
                                                if (eVar3.f22178v != i22) {
                                                    eVar3.a('\n');
                                                }
                                                eVar3.f22178v = i22;
                                            } else {
                                                vVar3.s(16);
                                            }
                                            i11 = 3;
                                            z5 = true;
                                            break;
                                        case 147:
                                        case 148:
                                        case 149:
                                        case 150:
                                        default:
                                            com.discord.chat.presentation.list.a.q(i14, "Invalid C1 command: ", "Cea708Decoder");
                                            i11 = i11;
                                            iG = iG;
                                            z5 = true;
                                            break;
                                        case 151:
                                            iG = iG;
                                            if (this.f22182l.f22161c) {
                                                int iC3 = e.c(vVar3.i(2), vVar3.i(2), vVar3.i(2), vVar3.i(2));
                                                vVar3.i(2);
                                                e.c(vVar3.i(2), vVar3.i(2), vVar3.i(2), 0);
                                                vVar3.h();
                                                vVar3.h();
                                                vVar3.i(2);
                                                vVar3.i(2);
                                                int i23 = vVar3.i(2);
                                                vVar3.s(8);
                                                e eVar4 = this.f22182l;
                                                eVar4.f22171o = iC3;
                                                eVar4.f22168l = i23;
                                            } else {
                                                vVar3.s(32);
                                            }
                                            i11 = 3;
                                            z5 = true;
                                            break;
                                        case 152:
                                        case 153:
                                        case 154:
                                        case 155:
                                        case 156:
                                        case 157:
                                        case 158:
                                        case 159:
                                            int i24 = i14 - 152;
                                            e eVar5 = eVarArr[i24];
                                            vVar3.s(i7);
                                            boolean zH3 = vVar3.h();
                                            boolean zH4 = vVar3.h();
                                            vVar3.h();
                                            int i25 = vVar3.i(i11);
                                            boolean zH5 = vVar3.h();
                                            int i26 = vVar3.i(7);
                                            int i27 = vVar3.i(8);
                                            int i28 = vVar3.i(4);
                                            int i29 = vVar3.i(4);
                                            vVar3.s(i7);
                                            vVar3.i(6);
                                            vVar3.s(i7);
                                            int i30 = vVar3.i(3);
                                            int i31 = vVar3.i(3);
                                            ArrayList arrayList = eVar5.f22159a;
                                            iG = iG;
                                            eVar5.f22161c = true;
                                            eVar5.f22162d = zH3;
                                            eVar5.k = zH4;
                                            eVar5.f22163e = i25;
                                            eVar5.f22164f = zH5;
                                            eVar5.f22165g = i26;
                                            eVar5.f22166h = i27;
                                            eVar5.f22167i = i28;
                                            int i32 = i29 + 1;
                                            if (eVar5.j != i32) {
                                                eVar5.j = i32;
                                                while (true) {
                                                    if ((zH4 && arrayList.size() >= eVar5.j) || arrayList.size() >= 15) {
                                                        arrayList.remove(0);
                                                    }
                                                }
                                            }
                                            if (i30 != 0 && eVar5.f22169m != i30) {
                                                eVar5.f22169m = i30;
                                                int i33 = i30 - 1;
                                                int i34 = e.C[i33];
                                                boolean z7 = e.B[i33];
                                                int i35 = e.f22158z[i33];
                                                int i36 = e.A[i33];
                                                int i37 = e.f22157y[i33];
                                                eVar5.f22171o = i34;
                                                eVar5.f22168l = i37;
                                            }
                                            if (i31 != 0 && eVar5.f22170n != i31) {
                                                eVar5.f22170n = i31;
                                                int i38 = i31 - 1;
                                                int i39 = e.E[i38];
                                                int i40 = e.D[i38];
                                                eVar5.e(false, false);
                                                eVar5.f(e.f22155w, e.F[i38]);
                                            }
                                            if (this.f22186p != i24) {
                                                this.f22186p = i24;
                                                this.f22182l = eVarArr[i24];
                                            }
                                            i11 = 3;
                                            z5 = true;
                                            break;
                                    }
                                } else {
                                    i11 = i11;
                                    iG = iG;
                                    z5 = true;
                                    if (i14 <= 255) {
                                        this.f22182l.a((char) (i14 & 255));
                                    } else {
                                        com.discord.chat.presentation.list.a.q(i14, "Invalid base command: ", "Cea708Decoder");
                                    }
                                    i7 = 2;
                                }
                                z6 = z5;
                                i7 = 2;
                            }
                            c8 = 7;
                        } else if (i14 != 0) {
                            if (i14 == i11) {
                                this.f22183m = j();
                            } else if (i14 != 8) {
                                switch (i14) {
                                    case 12:
                                        k();
                                        break;
                                    case 13:
                                        this.f22182l.a('\n');
                                        break;
                                    case 14:
                                        break;
                                    default:
                                        if (i14 >= 17 && i14 <= 23) {
                                            je.b.N("Cea708Decoder", "Currently unsupported COMMAND_EXT1 Command: " + i14);
                                            vVar3.s(8);
                                        } else if (i14 < 24 || i14 > 31) {
                                            com.discord.chat.presentation.list.a.q(i14, "Invalid C0 command: ", "Cea708Decoder");
                                        } else {
                                            je.b.N("Cea708Decoder", "Currently unsupported COMMAND_P16 Command: " + i14);
                                            vVar3.s(16);
                                        }
                                        break;
                                }
                            } else {
                                SpannableStringBuilder spannableStringBuilder = this.f22182l.f22160b;
                                int length = spannableStringBuilder.length();
                                if (length > 0) {
                                    spannableStringBuilder.delete(length - 1, length);
                                }
                            }
                        }
                        z5 = true;
                        c8 = 7;
                    } else {
                        i11 = i11;
                        iG = iG;
                        z5 = true;
                        int i41 = vVar3.i(8);
                        if (i41 <= 31) {
                            c8 = 7;
                            if (i41 > 7) {
                                if (i41 <= 15) {
                                    vVar3.s(8);
                                } else if (i41 <= 23) {
                                    vVar3.s(16);
                                } else if (i41 <= 31) {
                                    vVar3.s(24);
                                }
                            }
                        } else {
                            c8 = 7;
                            if (i41 <= 127) {
                                if (i41 == 32) {
                                    this.f22182l.a(' ');
                                } else if (i41 == 33) {
                                    this.f22182l.a((char) 160);
                                } else if (i41 == 37) {
                                    this.f22182l.a((char) 8230);
                                } else if (i41 == 42) {
                                    this.f22182l.a((char) 352);
                                } else if (i41 == 44) {
                                    this.f22182l.a((char) 338);
                                } else if (i41 == 63) {
                                    this.f22182l.a((char) 376);
                                } else if (i41 == 57) {
                                    this.f22182l.a((char) 8482);
                                } else if (i41 == 58) {
                                    this.f22182l.a((char) 353);
                                } else if (i41 == 60) {
                                    this.f22182l.a((char) 339);
                                } else if (i41 != 61) {
                                    switch (i41) {
                                        case 48:
                                            this.f22182l.a((char) 9608);
                                            break;
                                        case ChatViewRecyclerTypes.MEDIA_ATTACHMENT_MOSAIC_IMAGE /* 49 */:
                                            this.f22182l.a((char) 8216);
                                            break;
                                        case 50:
                                            this.f22182l.a((char) 8217);
                                            break;
                                        case ChatViewRecyclerTypes.MEDIA_ATTACHMENT_MOSAIC_VISUAL_PLACEHOLDER /* 51 */:
                                            this.f22182l.a((char) 8220);
                                            break;
                                        case ChatViewRecyclerTypes.REFERRAL /* 52 */:
                                            this.f22182l.a((char) 8221);
                                            break;
                                        case ChatViewRecyclerTypes.GUILD_PROFILE_INVITE /* 53 */:
                                            this.f22182l.a((char) 8226);
                                            break;
                                        default:
                                            switch (i41) {
                                                case 118:
                                                    this.f22182l.a((char) 8539);
                                                    break;
                                                case 119:
                                                    this.f22182l.a((char) 8540);
                                                    break;
                                                case 120:
                                                    this.f22182l.a((char) 8541);
                                                    break;
                                                case 121:
                                                    this.f22182l.a((char) 8542);
                                                    break;
                                                case 122:
                                                    this.f22182l.a((char) 9474);
                                                    break;
                                                case 123:
                                                    this.f22182l.a((char) 9488);
                                                    break;
                                                case 124:
                                                    this.f22182l.a((char) 9492);
                                                    break;
                                                case 125:
                                                    this.f22182l.a((char) 9472);
                                                    break;
                                                case 126:
                                                    this.f22182l.a((char) 9496);
                                                    break;
                                                case 127:
                                                    this.f22182l.a((char) 9484);
                                                    break;
                                                default:
                                                    com.discord.chat.presentation.list.a.q(i41, "Invalid G2 character: ", "Cea708Decoder");
                                                    break;
                                            }
                                            break;
                                    }
                                } else {
                                    this.f22182l.a((char) 8480);
                                }
                                z6 = true;
                            } else if (i41 > 159) {
                                i7 = 2;
                                if (i41 <= 255) {
                                    if (i41 == 160) {
                                        this.f22182l.a((char) 13252);
                                    } else {
                                        com.discord.chat.presentation.list.a.q(i41, "Invalid G3 character: ", "Cea708Decoder");
                                        this.f22182l.a('_');
                                    }
                                    z6 = true;
                                } else {
                                    com.discord.chat.presentation.list.a.q(i41, "Invalid extended command: ", "Cea708Decoder");
                                }
                            } else if (i41 <= 135) {
                                vVar3.s(32);
                            } else if (i41 <= 143) {
                                vVar3.s(40);
                            } else if (i41 <= 159) {
                                i7 = 2;
                                vVar3.s(2);
                                vVar3.s(vVar3.i(6) * 8);
                            }
                        }
                        i7 = 2;
                    }
                    iG = iG;
                    i11 = i11;
                    i7 = i7;
                }
            }
        }
        if (z6) {
            this.f22183m = j();
        }
        this.f22185o = null;
    }

    public final List j() {
        d dVar;
        Layout.Alignment alignment;
        float f2;
        float f7;
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < 8; i7++) {
            e[] eVarArr = this.k;
            e eVar = eVarArr[i7];
            if (eVar.f22161c && (!eVar.f22159a.isEmpty() || eVar.f22160b.length() != 0)) {
                e eVar2 = eVarArr[i7];
                if (eVar2.f22162d) {
                    ArrayList arrayList2 = eVar2.f22159a;
                    if (!eVar2.f22161c || (arrayList2.isEmpty() && eVar2.f22160b.length() == 0)) {
                        dVar = null;
                    } else {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                            spannableStringBuilder.append((CharSequence) arrayList2.get(i10));
                            spannableStringBuilder.append('\n');
                        }
                        spannableStringBuilder.append((CharSequence) eVar2.b());
                        int i11 = eVar2.f22168l;
                        if (i11 == 0) {
                            alignment = Layout.Alignment.ALIGN_NORMAL;
                        } else if (i11 == 1) {
                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                        } else if (i11 != 2) {
                            if (i11 != 3) {
                                throw new IllegalArgumentException("Unexpected justification value: " + eVar2.f22168l);
                            }
                            alignment = Layout.Alignment.ALIGN_NORMAL;
                        } else {
                            alignment = Layout.Alignment.ALIGN_CENTER;
                        }
                        Layout.Alignment alignment2 = alignment;
                        if (eVar2.f22164f) {
                            f2 = eVar2.f22166h / 99.0f;
                            f7 = eVar2.f22165g / 99.0f;
                        } else {
                            f2 = eVar2.f22166h / 209.0f;
                            f7 = eVar2.f22165g / 74.0f;
                        }
                        float f10 = (f2 * 0.9f) + 0.05f;
                        float f11 = (f7 * 0.9f) + 0.05f;
                        int i12 = eVar2.f22167i;
                        int i13 = i12 / 3;
                        int i14 = i13 == 0 ? 0 : i13 == 1 ? 1 : 2;
                        int i15 = i12 % 3;
                        int i16 = i15 == 0 ? 0 : i15 == 1 ? 1 : 2;
                        int i17 = eVar2.f22171o;
                        dVar = new d(spannableStringBuilder, alignment2, f11, i14, f10, i16, i17 != e.f22156x, i17, eVar2.f22163e);
                    }
                    if (dVar != null) {
                        arrayList.add(dVar);
                    }
                } else {
                    continue;
                }
            }
        }
        Collections.sort(arrayList, d.f22152c);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        for (int i18 = 0; i18 < arrayList.size(); i18++) {
            arrayList3.add(((d) arrayList.get(i18)).f22153a);
        }
        return Collections.unmodifiableList(arrayList3);
    }

    public final void k() {
        for (int i7 = 0; i7 < 8; i7++) {
            this.k[i7].d();
        }
    }
}

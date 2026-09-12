package rc;

import com.google.android.exoplayer2.Format;
import ei.c0;
import ei.e0;
import ei.p;
import ei.r0;
import ei.y;
import gc.g0;
import java.util.Arrays;
import je.w;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e0 f19250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19251b;

    public f(int i7, r0 r0Var) {
        this.f19251b = i7;
        this.f19250a = r0Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static f b(int i7, w wVar) {
        String str;
        a gVar;
        String str2;
        int i10;
        int i11 = 4;
        p.c(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i12 = wVar.f13862c;
        int i13 = 0;
        int i14 = -2;
        int i15 = 0;
        while (wVar.a() > 8) {
            int i16 = wVar.i();
            int i17 = wVar.f13861b + wVar.i();
            wVar.E(i17);
            if (i16 != 1414744396) {
                d dVar = null;
                switch (i16) {
                    case 1718776947:
                        if (i14 != 2) {
                            if (i14 == 1) {
                                int iN = wVar.n();
                                if (iN == 1) {
                                    str = "audio/raw";
                                } else if (iN == 85) {
                                    str = "audio/mpeg";
                                } else if (iN == 255) {
                                    str = "audio/mp4a-latm";
                                } else if (iN != 8192) {
                                    str = iN != 8193 ? null : "audio/vnd.dts";
                                } else {
                                    str = "audio/ac3";
                                }
                                if (str != null) {
                                    int iN2 = wVar.n();
                                    int i18 = wVar.i();
                                    wVar.G(6);
                                    int iW = je.e0.w(wVar.z());
                                    int iN3 = wVar.n();
                                    byte[] bArr = new byte[iN3];
                                    wVar.e(bArr, i13, iN3);
                                    g0 g0Var = new g0();
                                    g0Var.k = str;
                                    g0Var.f9656x = iN2;
                                    g0Var.f9657y = i18;
                                    if ("audio/raw".equals(str) && iW != 0) {
                                        g0Var.f9658z = iW;
                                    }
                                    if ("audio/mp4a-latm".equals(str) && iN3 > 0) {
                                        g0Var.f9645m = e0.r(bArr);
                                    }
                                    gVar = new g(new Format(g0Var));
                                } else {
                                    com.discord.chat.presentation.list.a.q(iN, "Ignoring track with unsupported format tag ", "StreamFormatChunk");
                                }
                            } else {
                                je.b.N("StreamFormatChunk", "Ignoring strf box for unsupported track type: " + je.e0.B(i14));
                            }
                            gVar = dVar;
                            break;
                        } else {
                            wVar.G(i11);
                            int i19 = wVar.i();
                            int i20 = wVar.i();
                            wVar.G(i11);
                            int i21 = wVar.i();
                            switch (i21) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str2 = "video/mp4v-es";
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str2 = "video/avc";
                                    break;
                                case 842289229:
                                    str2 = "video/mp42";
                                    break;
                                case 859066445:
                                    str2 = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str2 = "video/mjpeg";
                                    break;
                                default:
                                    str2 = null;
                                    break;
                            }
                            if (str2 != null) {
                                g0 g0Var2 = new g0();
                                g0Var2.f9648p = i19;
                                g0Var2.f9649q = i20;
                                g0Var2.k = str2;
                                gVar = new g(new Format(g0Var2));
                            } else {
                                com.discord.chat.presentation.list.a.q(i21, "Ignoring track with unsupported compression ", "StreamFormatChunk");
                                gVar = dVar;
                            }
                        }
                        break;
                    case 1751742049:
                        int i22 = wVar.i();
                        wVar.G(8);
                        int i23 = wVar.i();
                        int i24 = wVar.i();
                        wVar.G(i11);
                        wVar.i();
                        wVar.G(12);
                        gVar = new c(i22, i23, i24);
                        break;
                    case 1752331379:
                        int i25 = wVar.i();
                        wVar.G(12);
                        wVar.i();
                        int i26 = wVar.i();
                        int i27 = wVar.i();
                        wVar.G(i11);
                        int i28 = wVar.i();
                        int i29 = wVar.i();
                        wVar.G(8);
                        dVar = new d(i25, i26, i27, i28, i29);
                        gVar = dVar;
                        break;
                    case 1852994675:
                        gVar = new h(wVar.s(wVar.a(), di.d.f7631c));
                        break;
                    default:
                        gVar = dVar;
                        break;
                }
            } else {
                gVar = b(wVar.i(), wVar);
            }
            if (gVar != null) {
                if (gVar.getType() == 1752331379) {
                    int i30 = ((d) gVar).f19235a;
                    if (i30 == 1935960438) {
                        i14 = 2;
                    } else if (i30 != 1935963489) {
                        if (i30 != 1937012852) {
                            je.b.N("AviStreamHeaderChunk", "Found unsupported streamType fourCC: " + Integer.toHexString(i30));
                            i10 = -1;
                        } else {
                            i10 = 3;
                        }
                        i14 = i10;
                    } else {
                        i14 = 1;
                    }
                }
                int i31 = i15 + 1;
                if (objArrCopyOf.length < i31) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, y.d(objArrCopyOf.length, i31));
                }
                objArrCopyOf[i15] = gVar;
                i15 = i31;
            }
            wVar.F(i17);
            wVar.E(i12);
            i11 = 4;
            i13 = 0;
        }
        return new f(i7, e0.j(i15, objArrCopyOf));
    }

    public final a a(Class cls) {
        c0 c0VarListIterator = this.f19250a.listIterator(0);
        while (c0VarListIterator.hasNext()) {
            a aVar = (a) c0VarListIterator.next();
            if (aVar.getClass() == cls) {
                return aVar;
            }
        }
        return null;
    }

    @Override // rc.a
    public final int getType() {
        return this.f19251b;
    }
}

package pf;

import ag.q1;
import ag.s1;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Parcel;
import android.util.SparseArray;
import androidx.datastore.preferences.protobuf.d1;
import ci.o;
import ci.p;
import com.facebook.common.references.CloseableReference;
import com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl;
import com.facebook.imagepipeline.common.ImageDecodeOptions;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.imageutils.JfifUtil;
import gc.h1;
import java.io.File;
import java.io.FileInputStream;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import je.w;
import kotlin.collections.d0;
import kotlin.collections.e0;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import na.k;
import pa.q;
import pc.l;
import pd.h;
import pp.r0;
import pp.s0;
import pp.y0;
import qd.j;
import qf.v;
import s.m;
import sh.b1;
import sh.s;
import sh.u1;
import th.f;
import th.g;
import vc.d;
import vc.e;
import ze.i;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements i, h, sg.a, g, la.b, vs.b, xb.b, p {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f18026d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f18027e;

    @Override // pd.h
    public long A(long j, long j5) {
        return 1L;
    }

    @Override // th.g
    public Object a() {
        switch (this.f18026d) {
            case 5:
                return new b1((s) ((f) this.f18027e).a());
            case 6:
                return ((u1) this.f18027e).f20202a;
            case 7:
            default:
                return new com.google.android.play.core.integrity.f((com.google.android.play.core.integrity.c) ((o) this.f18027e).a());
            case 8:
                return ((g) this.f18027e).a();
        }
    }

    @Override // ze.i
    public void accept(Object obj, Object obj2) {
        switch (this.f18026d) {
            case 0:
                c cVar = new c((ig.g) obj2, 0);
                s1 s1Var = (s1) ((q1) obj).o();
                v vVar = (v) this.f18027e;
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.writeInterfaceToken(s1Var.f578g);
                int i7 = ag.o.f552a;
                parcelObtain.writeStrongBinder(cVar);
                parcelObtain.writeInt(1);
                vVar.writeToParcel(parcelObtain, 0);
                s1Var.j(1, parcelObtain);
                break;
            default:
                uf.b bVar = (uf.b) this.f18027e;
                uf.a aVar = new uf.a((ig.g) obj2);
                uf.i iVar = (uf.i) ((uf.c) obj).o();
                String str = bVar.k;
                Parcel parcelR = iVar.r();
                int i10 = uf.f.f21125a;
                parcelR.writeStrongBinder(aVar);
                parcelR.writeString(str);
                iVar.s(2, parcelR);
                break;
        }
    }

    @Override // pd.h
    public long b(long j) {
        return 0L;
    }

    /* JADX WARN: Code duplicated, block: B:131:0x029c  */
    /* JADX WARN: Multi-variable type inference failed */
    public void c(int i7, int i10, l lVar) throws h1 {
        int i11;
        int i12;
        int i13;
        long j;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        d dVar = (d) this.f18027e;
        e eVar = dVar.f21590b;
        SparseArray sparseArray = dVar.f21592c;
        w wVar = dVar.f21598i;
        w wVar2 = dVar.f21596g;
        int i19 = 1;
        int i20 = 0;
        if (i7 != 161 && i7 != 163) {
            if (i7 == 165) {
                if (dVar.G != 2) {
                    return;
                }
                vc.c cVar = (vc.c) sparseArray.get(dVar.M);
                int i21 = dVar.P;
                w wVar3 = dVar.f21601n;
                if (i21 != 4 || !"V_VP9".equals(cVar.f21561b)) {
                    lVar.u(i10);
                    return;
                } else {
                    wVar3.C(i10);
                    lVar.readFully(wVar3.f13860a, 0, i10);
                    return;
                }
            }
            if (i7 == 16877) {
                dVar.b(i7);
                vc.c cVar2 = dVar.f21608u;
                int i22 = cVar2.f21566g;
                if (i22 != 1685485123 && i22 != 1685480259) {
                    lVar.u(i10);
                    return;
                }
                byte[] bArr = new byte[i10];
                cVar2.N = bArr;
                lVar.readFully(bArr, 0, i10);
                return;
            }
            if (i7 == 16981) {
                dVar.b(i7);
                byte[] bArr2 = new byte[i10];
                dVar.f21608u.f21568i = bArr2;
                lVar.readFully(bArr2, 0, i10);
                return;
            }
            if (i7 == 18402) {
                byte[] bArr3 = new byte[i10];
                lVar.readFully(bArr3, 0, i10);
                dVar.b(i7);
                dVar.f21608u.j = new pc.w(1, 0, 0, bArr3);
                return;
            }
            if (i7 == 21419) {
                Arrays.fill(wVar.f13860a, (byte) 0);
                lVar.readFully(wVar.f13860a, 4 - i10, i10);
                wVar.F(0);
                dVar.f21610w = (int) wVar.v();
                return;
            }
            if (i7 == 25506) {
                dVar.b(i7);
                byte[] bArr4 = new byte[i10];
                dVar.f21608u.k = bArr4;
                lVar.readFully(bArr4, 0, i10);
                return;
            }
            if (i7 != 30322) {
                throw h1.a("Unexpected id: " + i7, null);
            }
            dVar.b(i7);
            byte[] bArr5 = new byte[i10];
            dVar.f21608u.f21579v = bArr5;
            lVar.readFully(bArr5, 0, i10);
            return;
        }
        if (dVar.G == 0) {
            dVar.M = (int) eVar.b(lVar, false, true, 8);
            dVar.N = eVar.f21617c;
            dVar.I = -9223372036854775807L;
            dVar.G = 1;
            wVar2.C(0);
        }
        vc.c cVar3 = (vc.c) sparseArray.get(dVar.M);
        if (cVar3 == null) {
            lVar.u(i10 - dVar.N);
            dVar.G = 0;
            return;
        }
        cVar3.X.getClass();
        if (dVar.G == 1) {
            dVar.i(lVar, 3);
            int i23 = (wVar2.f13860a[2] & 6) >> 1;
            int i24 = 255;
            if (i23 == 0) {
                dVar.K = 1;
                int[] iArr = dVar.L;
                if (iArr == null) {
                    iArr = new int[1];
                } else if (iArr.length < 1) {
                    iArr = new int[Math.max(iArr.length * 2, 1)];
                }
                dVar.L = iArr;
                iArr[0] = (i10 - dVar.N) - 3;
            } else {
                dVar.i(lVar, 4);
                int i25 = (wVar2.f13860a[3] & 255) + 1;
                dVar.K = i25;
                int[] iArr2 = dVar.L;
                if (iArr2 == null) {
                    iArr2 = new int[i25];
                } else if (iArr2.length < i25) {
                    iArr2 = new int[Math.max(iArr2.length * 2, i25)];
                }
                dVar.L = iArr2;
                if (i23 == 2) {
                    int i26 = (i10 - dVar.N) - 4;
                    int i27 = dVar.K;
                    Arrays.fill(iArr2, 0, i27, i26 / i27);
                } else {
                    if (i23 == 1) {
                        int i28 = 0;
                        int i29 = 0;
                        int i30 = 4;
                        while (true) {
                            i15 = dVar.K - 1;
                            if (i28 >= i15) {
                                break;
                            }
                            dVar.L[i28] = 0;
                            while (true) {
                                i16 = i30 + 1;
                                dVar.i(lVar, i16);
                                int i31 = wVar2.f13860a[i30] & 255;
                                int[] iArr3 = dVar.L;
                                i17 = iArr3[i28] + i31;
                                iArr3[i28] = i17;
                                if (i31 != 255) {
                                    break;
                                } else {
                                    i30 = i16;
                                }
                            }
                            i29 += i17;
                            i28++;
                            i30 = i16;
                        }
                        dVar.L[i15] = ((i10 - dVar.N) - i30) - i29;
                    } else {
                        if (i23 != 3) {
                            throw h1.a("Unexpected lacing value: " + i23, null);
                        }
                        int i32 = 0;
                        int i33 = 0;
                        int i34 = 4;
                        while (true) {
                            int i35 = dVar.K - i19;
                            if (i32 >= i35) {
                                i11 = i19;
                                i12 = i20;
                                dVar.L[i35] = ((i10 - dVar.N) - i34) - i33;
                                break;
                            }
                            dVar.L[i32] = i20;
                            int i36 = i34 + 1;
                            dVar.i(lVar, i36);
                            if (wVar2.f13860a[i34] == 0) {
                                throw h1.a("No valid varint length mask found", null);
                            }
                            int i37 = i19;
                            int i38 = i20;
                            while (true) {
                                if (i38 >= 8) {
                                    i13 = i20;
                                    j = 0;
                                    i14 = i36;
                                    break;
                                }
                                int i39 = i37 << (7 - i38);
                                i13 = i20;
                                if ((wVar2.f13860a[i34] & i39) != 0) {
                                    i14 = i36 + i38;
                                    dVar.i(lVar, i14);
                                    j = wVar2.f13860a[i34] & i24 & (~i39);
                                    while (i36 < i14) {
                                        j = (j << 8) | ((long) (wVar2.f13860a[i36] & i24));
                                        i36++;
                                        i24 = 255;
                                    }
                                    if (i32 <= 0) {
                                        break;
                                    }
                                    j -= (1 << ((i38 * 7) + 6)) - 1;
                                    break;
                                }
                                i38++;
                                i20 = i13;
                                i24 = 255;
                            }
                            if (j < -2147483648L || j > 2147483647L) {
                                throw h1.a("EBML lacing sample size out of range.", null);
                            }
                            int i40 = (int) j;
                            int[] iArr4 = dVar.L;
                            if (i32 != 0) {
                                i40 += iArr4[i32 - 1];
                            }
                            iArr4[i32] = i40;
                            i33 += i40;
                            i32++;
                            i34 = i14;
                            i19 = i37;
                            i20 = i13;
                            i24 = 255;
                        }
                    }
                    byte[] bArr6 = wVar2.f13860a;
                    dVar.H = dVar.k((bArr6[i11] & 255) | (bArr6[i12] << 8)) + dVar.B;
                    if (cVar3.f21563d != 2 || (i7 == 163 && (wVar2.f13860a[2] & ByteCompanionObject.MIN_VALUE) == 128)) {
                        i18 = i11;
                    } else {
                        i18 = i12;
                    }
                    dVar.O = i18;
                    dVar.G = 2;
                    dVar.J = i12;
                }
            }
            i11 = 1;
            i12 = 0;
            byte[] bArr7 = wVar2.f13860a;
            dVar.H = dVar.k((bArr7[i11] & 255) | (bArr7[i12] << 8)) + dVar.B;
            if (cVar3.f21563d != 2) {
                i18 = i11;
            } else {
                i18 = i11;
            }
            dVar.O = i18;
            dVar.G = 2;
            dVar.J = i12;
        } else {
            i11 = 1;
        }
        if (i7 == 163) {
            while (true) {
                int i41 = dVar.J;
                if (i41 >= dVar.K) {
                    dVar.G = 0;
                    return;
                }
                dVar.c(cVar3, ((long) ((dVar.J * cVar3.f21564e) / 1000)) + dVar.H, dVar.O, dVar.l(lVar, cVar3, dVar.L[i41], false), 0);
                dVar.J++;
            }
        } else {
            while (true) {
                int i42 = dVar.J;
                if (i42 >= dVar.K) {
                    return;
                }
                int[] iArr5 = dVar.L;
                boolean z5 = i11;
                iArr5[i42] = dVar.l(lVar, cVar3, iArr5[i42], z5);
                dVar.J += z5 ? 1 : 0;
            }
        }
    }

    @Override // vs.b
    public FileChannel d() {
        return new FileInputStream((File) this.f18027e).getChannel();
    }

    public s0 f(int i7) {
        return (s0) ((List) this.f18027e).get(i7);
    }

    @Override // la.b
    public na.c g(EncodedImage encodedImage, int i7, k kVar, ImageDecodeOptions imageDecodeOptions) {
        AnimatedFactoryV2Impl animatedFactoryV2Impl = (AnimatedFactoryV2Impl) this.f18027e;
        if (animatedFactoryV2Impl.f4736e == null) {
            animatedFactoryV2Impl.f4736e = new ba.b(new ph.c(animatedFactoryV2Impl), animatedFactoryV2Impl.f4732a, animatedFactoryV2Impl.k);
        }
        ba.b bVar = animatedFactoryV2Impl.f4736e;
        Bitmap.Config config = imageDecodeOptions.f4811b;
        bVar.getClass();
        ba.a aVar = ba.b.f3084a;
        if (aVar == null) {
            throw new UnsupportedOperationException("To encode animated gif please add the dependency to the animated-gif module");
        }
        CloseableReference byteBufferRef = encodedImage.getByteBufferRef();
        byteBufferRef.getClass();
        try {
            q qVar = (q) byteBufferRef.q();
            return ba.b.a(encodedImage.getSource(), imageDecodeOptions, qVar.f() != null ? aVar.a(qVar.f(), imageDecodeOptions) : aVar.b(qVar.g(), qVar.n(), imageDecodeOptions));
        } finally {
            byteBufferRef.close();
        }
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new n8.f((Context) ((ph.c) this.f18027e).f18031d, new q8.c(), new pa.s(), 21);
    }

    public int h() {
        return ((ca.a) this.f18027e).f3549c.k();
    }

    @Override // pd.h
    public long i(long j, long j5) {
        return 0L;
    }

    @Override // pd.h
    public long j(long j, long j5) {
        return -9223372036854775807L;
    }

    @Override // pd.h
    public j k(long j) {
        return (j) this.f18027e;
    }

    public int l() {
        return ((ca.a) this.f18027e).f3549c.q();
    }

    public void m(int i7, long j) throws h1 {
        d dVar = (d) this.f18027e;
        if (i7 == 20529) {
            if (j == 0) {
                return;
            }
            throw h1.a("ContentEncodingOrder " + j + " not supported", null);
        }
        if (i7 == 20530) {
            if (j == 1) {
                return;
            }
            throw h1.a("ContentEncodingScope " + j + " not supported", null);
        }
        switch (i7) {
            case 131:
                dVar.b(i7);
                dVar.f21608u.f21563d = (int) j;
                return;
            case 136:
                dVar.b(i7);
                dVar.f21608u.V = j == 1;
                return;
            case 155:
                dVar.I = dVar.k(j);
                return;
            case 159:
                dVar.b(i7);
                dVar.f21608u.O = (int) j;
                return;
            case 176:
                dVar.b(i7);
                dVar.f21608u.f21570m = (int) j;
                return;
            case 179:
                dVar.a(i7);
                dVar.C.n(dVar.k(j));
                return;
            case 186:
                dVar.b(i7);
                dVar.f21608u.f21571n = (int) j;
                return;
            case JfifUtil.MARKER_RST7 /* 215 */:
                dVar.b(i7);
                dVar.f21608u.f21562c = (int) j;
                return;
            case 231:
                dVar.B = dVar.k(j);
                return;
            case 238:
                dVar.P = (int) j;
                return;
            case 241:
                if (dVar.E) {
                    return;
                }
                dVar.a(i7);
                dVar.D.n(j);
                dVar.E = true;
                return;
            case 251:
                dVar.Q = true;
                return;
            case 16871:
                dVar.b(i7);
                dVar.f21608u.f21566g = (int) j;
                return;
            case 16980:
                if (j == 3) {
                    return;
                }
                throw h1.a("ContentCompAlgo " + j + " not supported", null);
            case 17029:
                if (j < 1 || j > 2) {
                    throw h1.a("DocTypeReadVersion " + j + " not supported", null);
                }
                return;
            case 17143:
                if (j == 1) {
                    return;
                }
                throw h1.a("EBMLReadVersion " + j + " not supported", null);
            case 18401:
                if (j == 5) {
                    return;
                }
                throw h1.a("ContentEncAlgo " + j + " not supported", null);
            case 18408:
                if (j == 1) {
                    return;
                }
                throw h1.a("AESSettingsCipherMode " + j + " not supported", null);
            case 21420:
                dVar.f21611x = j + dVar.f21604q;
                return;
            case 21432:
                int i10 = (int) j;
                dVar.b(i7);
                if (i10 == 0) {
                    dVar.f21608u.f21580w = 0;
                    return;
                }
                if (i10 == 1) {
                    dVar.f21608u.f21580w = 2;
                    return;
                } else if (i10 == 3) {
                    dVar.f21608u.f21580w = 1;
                    return;
                } else {
                    if (i10 != 15) {
                        return;
                    }
                    dVar.f21608u.f21580w = 3;
                    return;
                }
            case 21680:
                dVar.b(i7);
                dVar.f21608u.f21572o = (int) j;
                return;
            case 21682:
                dVar.b(i7);
                dVar.f21608u.f21574q = (int) j;
                return;
            case 21690:
                dVar.b(i7);
                dVar.f21608u.f21573p = (int) j;
                return;
            case 21930:
                dVar.b(i7);
                dVar.f21608u.U = j == 1;
                return;
            case 21998:
                dVar.b(i7);
                dVar.f21608u.f21565f = (int) j;
                return;
            case 22186:
                dVar.b(i7);
                dVar.f21608u.R = j;
                return;
            case 22203:
                dVar.b(i7);
                dVar.f21608u.S = j;
                return;
            case 25188:
                dVar.b(i7);
                dVar.f21608u.P = (int) j;
                return;
            case 30114:
                dVar.R = j;
                return;
            case 30321:
                dVar.b(i7);
                int i11 = (int) j;
                if (i11 == 0) {
                    dVar.f21608u.f21575r = 0;
                    return;
                }
                if (i11 == 1) {
                    dVar.f21608u.f21575r = 1;
                    return;
                } else if (i11 == 2) {
                    dVar.f21608u.f21575r = 2;
                    return;
                } else {
                    if (i11 != 3) {
                        return;
                    }
                    dVar.f21608u.f21575r = 3;
                    return;
                }
            case 2352003:
                dVar.b(i7);
                dVar.f21608u.f21564e = (int) j;
                return;
            case 2807729:
                dVar.f21605r = j;
                return;
            default:
                switch (i7) {
                    case 21945:
                        dVar.b(i7);
                        int i12 = (int) j;
                        if (i12 == 1) {
                            dVar.f21608u.A = 2;
                            return;
                        } else {
                            if (i12 != 2) {
                                return;
                            }
                            dVar.f21608u.A = 1;
                            return;
                        }
                    case 21946:
                        dVar.b(i7);
                        int iC = ke.b.c((int) j);
                        if (iC != -1) {
                            dVar.f21608u.f21583z = iC;
                            return;
                        }
                        return;
                    case 21947:
                        dVar.b(i7);
                        dVar.f21608u.f21581x = true;
                        int iB = ke.b.b((int) j);
                        if (iB != -1) {
                            dVar.f21608u.f21582y = iB;
                            return;
                        }
                        return;
                    case 21948:
                        dVar.b(i7);
                        dVar.f21608u.B = (int) j;
                        return;
                    case 21949:
                        dVar.b(i7);
                        dVar.f21608u.C = (int) j;
                        return;
                    default:
                        return;
                }
        }
    }

    @Override // pd.h
    public long p(long j, long j5) {
        return 0L;
    }

    @Override // pd.h
    public boolean v() {
        return true;
    }

    @Override // pd.h
    public long w() {
        return 0L;
    }

    @Override // pd.h
    public long z(long j) {
        return 1L;
    }

    public /* synthetic */ b(int i7, Object obj) {
        this.f18026d = i7;
        this.f18027e = obj;
    }

    public /* synthetic */ b(a aVar, v vVar) {
        this.f18026d = 0;
        this.f18027e = vVar;
    }

    public b(ca.a animatedDrawableBackend) {
        this.f18026d = 2;
        Intrinsics.checkNotNullParameter(animatedDrawableBackend, "animatedDrawableBackend");
        this.f18027e = animatedDrawableBackend;
    }

    public b(y0 typeTable) {
        this.f18026d = 3;
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        List list = typeTable.f18499i;
        if ((typeTable.f18498e & 1) == 1) {
            int i7 = typeTable.f18500v;
            Intrinsics.checkNotNullExpressionValue(list, "getTypeList(...)");
            ArrayList arrayList = new ArrayList(e0.l(list, 10));
            int i10 = 0;
            for (Object obj : list) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    d0.k();
                    throw null;
                }
                s0 s0VarG = (s0) obj;
                if (i10 >= i7) {
                    s0VarG.getClass();
                    r0 r0VarQ = s0.q(s0VarG);
                    r0VarQ.f18423v |= 2;
                    r0VarQ.f18425x = true;
                    s0VarG = r0VarQ.g();
                    if (!s0VarG.b()) {
                        throw new d1();
                    }
                }
                arrayList.add(s0VarG);
                i10 = i11;
            }
            list = arrayList;
        }
        Intrinsics.checkNotNullExpressionValue(list, "run(...)");
        this.f18027e = list;
    }

    public b(long[] jArr) {
        m mVar;
        int i7;
        this.f18026d = 15;
        if (jArr != null) {
            long[] elements = Arrays.copyOf(jArr, jArr.length);
            mVar = new m(elements.length);
            int i10 = mVar.f19634b;
            Intrinsics.checkNotNullParameter(elements, "elements");
            if (i10 >= 0 && i10 <= (i7 = mVar.f19634b)) {
                if (elements.length != 0) {
                    int length = i7 + elements.length;
                    long[] jArr2 = mVar.f19633a;
                    if (jArr2.length < length) {
                        long[] jArrCopyOf = Arrays.copyOf(jArr2, Math.max(length, (jArr2.length * 3) / 2));
                        Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
                        mVar.f19633a = jArrCopyOf;
                    }
                    long[] jArr3 = mVar.f19633a;
                    int i11 = mVar.f19634b;
                    if (i10 != i11) {
                        kotlin.collections.w.f(jArr3, jArr3, elements.length + i10, i10, i11);
                    }
                    kotlin.collections.w.f(elements, jArr3, i10, 0, elements.length);
                    mVar.f19634b += elements.length;
                }
            } else {
                Intrinsics.checkNotNullParameter("", "message");
                throw new IndexOutOfBoundsException("");
            }
        } else {
            mVar = new m(16);
        }
        this.f18027e = mVar;
    }

    @Override // pd.h
    public long e(long j, long j5) {
        return j5;
    }
}

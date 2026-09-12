package zc;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.android.exoplayer2.Format;
import gc.g0;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
public final class m implements h {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final float[] f23763l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e4.r f23764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final je.w f23765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean[] f23766c = new boolean[4];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k f23767d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final u f23768e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public l f23769f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f23770g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f23771h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public pc.x f23772i;
    public boolean j;
    public long k;

    public m(e4.r rVar) {
        this.f23764a = rVar;
        k kVar = new k();
        kVar.f23754e = new byte[IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT];
        this.f23767d = kVar;
        this.k = -9223372036854775807L;
        this.f23768e = new u(178);
        this.f23765b = new je.w();
    }

    @Override // zc.h
    public final void a() {
        je.b.o(this.f23766c);
        k kVar = this.f23767d;
        kVar.f23750a = false;
        kVar.f23752c = 0;
        kVar.f23751b = 0;
        l lVar = this.f23769f;
        if (lVar != null) {
            lVar.f23756b = false;
            lVar.f23757c = false;
            lVar.f23758d = false;
            lVar.f23759e = -1;
        }
        u uVar = this.f23768e;
        if (uVar != null) {
            uVar.c();
        }
        this.f23770g = 0L;
        this.k = -9223372036854775807L;
    }

    /* JADX WARN: Code duplicated, block: B:97:0x022b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // zc.h
    public final void c(je.w wVar) {
        int i7;
        int i10;
        boolean z5;
        int i11;
        int i12;
        float f2;
        je.b.l(this.f23769f);
        je.b.l(this.f23772i);
        int i13 = wVar.f13861b;
        int i14 = wVar.f13862c;
        byte[] bArr = wVar.f13860a;
        this.f23770g += (long) wVar.a();
        this.f23772i.d(wVar.a(), wVar);
        while (true) {
            int iU = je.b.u(bArr, i13, i14, this.f23766c);
            k kVar = this.f23767d;
            u uVar = this.f23768e;
            if (iU == i14) {
                if (!this.j) {
                    kVar.a(bArr, i13, i14);
                }
                this.f23769f.a(bArr, i13, i14);
                if (uVar != null) {
                    uVar.a(bArr, i13, i14);
                    return;
                }
                return;
            }
            int i15 = iU + 3;
            byte b10 = wVar.f13860a[i15];
            int i16 = b10 & 255;
            int i17 = iU - i13;
            if (this.j) {
                i7 = i14;
                i10 = i15;
            } else {
                if (i17 > 0) {
                    kVar.a(bArr, i13, iU);
                }
                int i18 = i17 < 0 ? -i17 : 0;
                int i19 = kVar.f23751b;
                if (i19 != 0) {
                    i7 = i14;
                    if (i19 == 1) {
                        i10 = i15;
                        i12 = 0;
                        if (i16 != 181) {
                            je.b.N("H263Reader", "Unexpected start code value");
                            kVar.f23750a = false;
                            kVar.f23752c = 0;
                            kVar.f23751b = 0;
                        } else {
                            kVar.f23751b = 2;
                        }
                    } else if (i19 != 2) {
                        i10 = i15;
                        if (i19 != 3) {
                            if (i19 != 4) {
                                throw new IllegalStateException();
                            }
                            if (i16 == 179 || i16 == 181) {
                                kVar.f23752c -= i18;
                                kVar.f23750a = false;
                                pc.x xVar = this.f23772i;
                                int i20 = kVar.f23753d;
                                String str = this.f23771h;
                                str.getClass();
                                byte[] bArrCopyOf = Arrays.copyOf(kVar.f23754e, kVar.f23752c);
                                je.v vVar = new je.v(bArrCopyOf, bArrCopyOf.length);
                                vVar.t(i20);
                                vVar.t(4);
                                vVar.r();
                                vVar.s(8);
                                if (vVar.h()) {
                                    vVar.s(4);
                                    vVar.s(3);
                                }
                                int i21 = vVar.i(4);
                                if (i21 == 15) {
                                    int i22 = vVar.i(8);
                                    int i23 = vVar.i(8);
                                    if (i23 == 0) {
                                        je.b.N("H263Reader", "Invalid aspect ratio");
                                        f2 = 1.0f;
                                    } else {
                                        f2 = i22 / i23;
                                    }
                                } else if (i21 < 7) {
                                    f2 = f23763l[i21];
                                } else {
                                    je.b.N("H263Reader", "Invalid aspect ratio");
                                    f2 = 1.0f;
                                }
                                if (vVar.h()) {
                                    vVar.s(2);
                                    vVar.s(1);
                                    if (vVar.h()) {
                                        vVar.s(15);
                                        vVar.r();
                                        vVar.s(15);
                                        vVar.r();
                                        vVar.s(15);
                                        vVar.r();
                                        vVar.s(3);
                                        vVar.s(11);
                                        vVar.r();
                                        vVar.s(15);
                                        vVar.r();
                                    }
                                }
                                if (vVar.i(2) != 0) {
                                    je.b.N("H263Reader", "Unhandled video object layer shape");
                                }
                                vVar.r();
                                int i24 = vVar.i(16);
                                vVar.r();
                                if (vVar.h()) {
                                    if (i24 == 0) {
                                        je.b.N("H263Reader", "Invalid vop_increment_time_resolution");
                                    } else {
                                        int i25 = 0;
                                        for (int i26 = i24 - 1; i26 > 0; i26 >>= 1) {
                                            i25++;
                                        }
                                        vVar.s(i25);
                                    }
                                }
                                vVar.r();
                                int i27 = vVar.i(13);
                                vVar.r();
                                int i28 = vVar.i(13);
                                vVar.r();
                                vVar.r();
                                g0 g0Var = new g0();
                                g0Var.f9635a = str;
                                g0Var.k = "video/mp4v-es";
                                g0Var.f9648p = i27;
                                g0Var.f9649q = i28;
                                g0Var.f9652t = f2;
                                g0Var.f9645m = Collections.singletonList(bArrCopyOf);
                                xVar.e(new Format(g0Var));
                                this.j = true;
                            } else {
                                i12 = 0;
                            }
                        } else if ((b10 & 240) != 32) {
                            je.b.N("H263Reader", "Unexpected start code value");
                            i12 = 0;
                            kVar.f23750a = false;
                            kVar.f23752c = 0;
                            kVar.f23751b = 0;
                        } else {
                            i12 = 0;
                            kVar.f23753d = kVar.f23752c;
                            kVar.f23751b = 4;
                        }
                    } else {
                        i10 = i15;
                        i12 = 0;
                        if (i16 > 31) {
                            je.b.N("H263Reader", "Unexpected start code value");
                            kVar.f23750a = false;
                            kVar.f23752c = 0;
                            kVar.f23751b = 0;
                        } else {
                            kVar.f23751b = 3;
                        }
                    }
                } else {
                    i7 = i14;
                    i10 = i15;
                    i12 = 0;
                    if (i16 == 176) {
                        kVar.f23751b = 1;
                        kVar.f23750a = true;
                    }
                }
                kVar.a(k.f23749f, i12, 3);
            }
            this.f23769f.a(bArr, i13, iU);
            if (uVar == null) {
                z5 = true;
            } else {
                if (i17 > 0) {
                    uVar.a(bArr, i13, iU);
                    i11 = 0;
                } else {
                    i11 = -i17;
                }
                if (uVar.b(i11)) {
                    int iM = je.b.M(uVar.f23871d, uVar.f23872e);
                    int i29 = je.e0.f13788a;
                    byte[] bArr2 = uVar.f23871d;
                    je.w wVar2 = this.f23765b;
                    wVar2.D(bArr2, iM);
                    this.f23764a.z(this.k, wVar2);
                }
                if (i16 == 178) {
                    z5 = true;
                    if (wVar.f13860a[iU + 2] == 1) {
                        uVar.d(i16);
                    }
                } else {
                    z5 = true;
                }
            }
            int i30 = i7 - iU;
            long j = this.f23770g - ((long) i30);
            l lVar = this.f23769f;
            boolean z6 = this.j;
            if (lVar.f23759e == 182 && z6 && lVar.f23756b) {
                long j5 = lVar.f23762h;
                if (j5 != -9223372036854775807L) {
                    lVar.f23755a.c(j5, lVar.f23758d ? 1 : 0, (int) (j - lVar.f23761g), i30, null);
                }
            }
            if (lVar.f23759e != 179) {
                lVar.f23761g = j;
            }
            l lVar2 = this.f23769f;
            long j7 = this.k;
            lVar2.f23759e = i16;
            lVar2.f23758d = false;
            lVar2.f23756b = (i16 == 182 || i16 == 179) ? z5 : false;
            lVar2.f23757c = i16 == 182 ? z5 : false;
            lVar2.f23760f = 0;
            lVar2.f23762h = j7;
            i14 = i7;
            i13 = i10;
        }
    }

    @Override // zc.h
    public final void e(pc.m mVar, d0 d0Var) {
        d0Var.a();
        d0Var.b();
        this.f23771h = d0Var.f23692e;
        d0Var.b();
        pc.x xVarX = mVar.x(d0Var.f23691d, 2);
        this.f23772i = xVarX;
        this.f23769f = new l(xVarX);
        this.f23764a.B(mVar, d0Var);
    }

    @Override // zc.h
    public final void f(int i7, long j) {
        if (j != -9223372036854775807L) {
            this.k = j;
        }
    }

    @Override // zc.h
    public final void d() {
    }
}

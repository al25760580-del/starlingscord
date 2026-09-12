package zc;

import com.google.android.exoplayer2.Format;
import gc.g0;
import java.util.Collections;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: classes3.dex */
public final class r implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e4.e f23827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f23828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public pc.x f23829c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public q f23830d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f23831e;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f23836l;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean[] f23832f = new boolean[3];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final u f23833g = new u(32);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final u f23834h = new u(33);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final u f23835i = new u(34);
    public final u j = new u(39);
    public final u k = new u(40);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f23837m = -9223372036854775807L;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final je.w f23838n = new je.w();

    public r(e4.e eVar) {
        this.f23827a = eVar;
    }

    @Override // zc.h
    public final void a() {
        this.f23836l = 0L;
        this.f23837m = -9223372036854775807L;
        je.b.o(this.f23832f);
        this.f23833g.c();
        this.f23834h.c();
        this.f23835i.c();
        this.j.c();
        this.k.c();
        q qVar = this.f23830d;
        if (qVar != null) {
            qVar.f23821f = false;
            qVar.f23822g = false;
            qVar.f23823h = false;
            qVar.f23824i = false;
            qVar.j = false;
        }
    }

    public final void b(byte[] bArr, int i7, int i10) {
        q qVar = this.f23830d;
        if (qVar.f23821f) {
            int i11 = qVar.f23819d;
            int i12 = (i7 + 2) - i11;
            if (i12 < i10) {
                qVar.f23822g = (bArr[i12] & ByteCompanionObject.MIN_VALUE) != 0;
                qVar.f23821f = false;
            } else {
                qVar.f23819d = (i10 - i7) + i11;
            }
        }
        if (!this.f23831e) {
            this.f23833g.a(bArr, i7, i10);
            this.f23834h.a(bArr, i7, i10);
            this.f23835i.a(bArr, i7, i10);
        }
        this.j.a(bArr, i7, i10);
        this.k.a(bArr, i7, i10);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x015f  */
    /* JADX WARN: Code duplicated, block: B:66:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:81:0x0213  */
    /* JADX WARN: Code duplicated, block: B:86:0x021c  */
    /* JADX WARN: Code duplicated, block: B:89:0x0223  */
    /* JADX WARN: Code duplicated, block: B:97:0x022c A[SYNTHETIC] */
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
        u uVar;
        boolean z5;
        boolean z6;
        boolean z7;
        je.b.l(this.f23829c);
        int i7 = je.e0.f13788a;
        while (wVar.a() > 0) {
            int i10 = wVar.f13861b;
            int i11 = wVar.f13862c;
            byte[] bArr = wVar.f13860a;
            this.f23836l += (long) wVar.a();
            this.f23829c.d(wVar.a(), wVar);
            while (i10 < i11) {
                int iU = je.b.u(bArr, i10, i11, this.f23832f);
                if (iU == i11) {
                    b(bArr, i10, i11);
                    return;
                }
                int i12 = iU + 3;
                int i13 = (bArr[i12] & 126) >> 1;
                int i14 = iU - i10;
                if (i14 > 0) {
                    b(bArr, i10, iU);
                }
                int i15 = i11 - iU;
                long j = this.f23836l - ((long) i15);
                int i16 = i14 < 0 ? -i14 : 0;
                long j5 = this.f23837m;
                pc.x[] xVarArr = (pc.x[]) this.f23827a.f7972i;
                q qVar = this.f23830d;
                boolean z10 = this.f23831e;
                if (qVar.j && qVar.f23822g) {
                    qVar.f23826m = qVar.f23818c;
                    qVar.j = false;
                } else if (qVar.f23823h || qVar.f23822g) {
                    if (z10 && qVar.f23824i) {
                        long j7 = qVar.f23817b;
                        int i17 = i15 + ((int) (j - j7));
                        long j10 = qVar.f23825l;
                        if (j10 != -9223372036854775807L) {
                            qVar.f23816a.c(j10, qVar.f23826m ? 1 : 0, (int) (j7 - qVar.k), i17, null);
                        }
                    }
                    qVar.k = qVar.f23817b;
                    qVar.f23825l = qVar.f23820e;
                    qVar.f23826m = qVar.f23818c;
                    qVar.f23824i = true;
                }
                boolean z11 = this.f23831e;
                u uVar2 = this.f23833g;
                u uVar3 = this.f23834h;
                u uVar4 = this.f23835i;
                if (!z11) {
                    uVar2.b(i16);
                    uVar3.b(i16);
                    uVar4.b(i16);
                    if (uVar2.f23870c && uVar3.f23870c && uVar4.f23870c) {
                        pc.x xVar = this.f23829c;
                        String str = this.f23828b;
                        int i18 = uVar2.f23872e;
                        byte[] bArr2 = new byte[uVar3.f23872e + i18 + uVar4.f23872e];
                        System.arraycopy(uVar2.f23871d, 0, bArr2, 0, i18);
                        System.arraycopy(uVar3.f23871d, 0, bArr2, uVar2.f23872e, uVar3.f23872e);
                        System.arraycopy(uVar4.f23871d, 0, bArr2, uVar2.f23872e + uVar3.f23872e, uVar4.f23872e);
                        je.p pVarE = je.b.E(uVar3.f23871d, 3, uVar3.f23872e);
                        String strE = je.b.e(pVarE.f13818a, pVarE.f13819b, pVarE.f13820c, pVarE.f13821d, pVarE.f13822e, pVarE.f13823f);
                        g0 g0Var = new g0();
                        g0Var.f9635a = str;
                        g0Var.k = "video/hevc";
                        g0Var.f9642h = strE;
                        g0Var.f9648p = pVarE.f13824g;
                        g0Var.f9649q = pVarE.f13825h;
                        g0Var.f9652t = pVarE.f13826i;
                        g0Var.f9645m = Collections.singletonList(bArr2);
                        xVar.e(new Format(g0Var));
                        this.f23831e = true;
                    }
                }
                u uVar5 = this.j;
                boolean zB = uVar5.b(i16);
                je.w wVar2 = this.f23838n;
                if (zB) {
                    wVar2.D(uVar5.f23871d, je.b.M(uVar5.f23871d, uVar5.f23872e));
                    wVar2.G(5);
                    xr.m.f(j5, wVar2, xVarArr);
                }
                u uVar6 = this.k;
                if (uVar6.b(i16)) {
                    wVar2.D(uVar6.f23871d, je.b.M(uVar6.f23871d, uVar6.f23872e));
                    wVar2.G(5);
                    xr.m.f(j5, wVar2, xVarArr);
                }
                long j11 = this.f23837m;
                q qVar2 = this.f23830d;
                boolean z12 = this.f23831e;
                qVar2.f23822g = false;
                qVar2.f23823h = false;
                qVar2.f23820e = j11;
                qVar2.f23819d = 0;
                qVar2.f23817b = j;
                if (i13 < 32 || i13 == 40) {
                    uVar = uVar4;
                    z5 = false;
                } else {
                    if (!qVar2.f23824i || qVar2.j) {
                        uVar = uVar4;
                        z5 = false;
                    } else {
                        if (z12) {
                            long j12 = qVar2.f23825l;
                            if (j12 == -9223372036854775807L) {
                                uVar = uVar4;
                            } else {
                                uVar = uVar4;
                                qVar2.f23816a.c(j12, qVar2.f23826m ? 1 : 0, (int) (j - qVar2.k), i15, null);
                            }
                        } else {
                            uVar = uVar4;
                        }
                        z5 = false;
                        qVar2.f23824i = false;
                    }
                    if ((32 <= i13 && i13 <= 35) || i13 == 39) {
                        z6 = true;
                        qVar2.f23823h = !qVar2.j;
                        qVar2.j = true;
                    }
                    if (i13 >= 16 || i13 > 21) {
                        z7 = z5;
                    } else {
                        z7 = z6;
                    }
                    qVar2.f23818c = z7;
                    if (z7 || i13 <= 9) {
                        z5 = z6;
                    }
                    qVar2.f23821f = z5;
                    if (!this.f23831e) {
                        uVar2.d(i13);
                        uVar3.d(i13);
                        uVar.d(i13);
                    }
                    uVar5.d(i13);
                    uVar6.d(i13);
                    i11 = i11;
                    bArr = bArr;
                    i10 = i12;
                }
                z6 = true;
                if (i13 >= 16) {
                    z7 = z5;
                } else {
                    z7 = z5;
                }
                qVar2.f23818c = z7;
                if (z7) {
                    z5 = z6;
                } else {
                    z5 = z6;
                }
                qVar2.f23821f = z5;
                if (!this.f23831e) {
                    uVar2.d(i13);
                    uVar3.d(i13);
                    uVar.d(i13);
                }
                uVar5.d(i13);
                uVar6.d(i13);
                i11 = i11;
                bArr = bArr;
                i10 = i12;
            }
        }
    }

    @Override // zc.h
    public final void e(pc.m mVar, d0 d0Var) {
        d0Var.a();
        d0Var.b();
        this.f23828b = d0Var.f23692e;
        d0Var.b();
        pc.x xVarX = mVar.x(d0Var.f23691d, 2);
        this.f23829c = xVarX;
        this.f23830d = new q(xVarX);
        this.f23827a.z(mVar, d0Var);
    }

    @Override // zc.h
    public final void f(int i7, long j) {
        if (j != -9223372036854775807L) {
            this.f23837m = j;
        }
    }

    @Override // zc.h
    public final void d() {
    }
}

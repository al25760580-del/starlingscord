package zc;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.android.exoplayer2.Format;
import gc.g0;
import gc.h1;
import ic.o0;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements h {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final byte[] f23693v = {73, 68, 51};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f23694a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f23697d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f23698e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public pc.x f23699f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public pc.x f23700g;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f23703l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f23706o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f23707p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f23709r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public pc.x f23711t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f23712u;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final je.v f23695b = new je.v(new byte[7], 7);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final je.w f23696c = new je.w(Arrays.copyOf(f23693v, 10));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f23701h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f23702i = 0;
    public int j = IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f23704m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f23705n = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f23708q = -9223372036854775807L;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f23710s = -9223372036854775807L;

    public e(boolean z5, String str) {
        this.f23694a = z5;
        this.f23697d = str;
    }

    @Override // zc.h
    public final void a() {
        this.f23710s = -9223372036854775807L;
        this.f23703l = false;
        this.f23701h = 0;
        this.f23702i = 0;
        this.j = IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
    }

    /* JADX WARN: Code duplicated, block: B:61:0x01d7  */
    @Override // zc.h
    public final void c(je.w wVar) throws h1 {
        byte b10;
        int i7;
        int i10;
        char c8;
        int i11;
        char c10;
        int i12;
        int i13;
        int i14;
        this.f23699f.getClass();
        int i15 = je.e0.f13788a;
        while (wVar.a() > 0) {
            int i16 = this.f23701h;
            byte b11 = -1;
            je.w wVar2 = this.f23696c;
            int i17 = 3;
            je.v vVar = this.f23695b;
            int i18 = 4;
            int i19 = 1;
            int i20 = 0;
            if (i16 == 0) {
                byte[] bArr = wVar.f13860a;
                int i21 = wVar.f13861b;
                int i22 = wVar.f13862c;
                while (true) {
                    if (i21 < i22) {
                        int i23 = i21 + 1;
                        int i24 = i17;
                        byte b12 = bArr[i21];
                        int i25 = b12 & 255;
                        if (this.j == 512 && ((65280 | (((byte) i25) & 255)) & 65526) == 65520) {
                            if (!this.f23703l) {
                                int i26 = i21 - 1;
                                wVar.F(i21);
                                byte[] bArr2 = vVar.f13853b;
                                if (wVar.a() < i19) {
                                    b10 = -1;
                                } else {
                                    wVar.e(bArr2, i20, i19);
                                    vVar.p(i18);
                                    int i27 = vVar.i(i19);
                                    int i28 = this.f23704m;
                                    if (i28 == -1 || i27 == i28) {
                                        if (this.f23705n != -1) {
                                            byte[] bArr3 = vVar.f13853b;
                                            if (wVar.a() >= i19) {
                                                wVar.e(bArr3, i20, i19);
                                                vVar.p(2);
                                                i12 = 4;
                                                if (vVar.i(4) != this.f23705n) {
                                                    b10 = -1;
                                                } else {
                                                    wVar.F(i23);
                                                }
                                            }
                                        } else {
                                            i12 = 4;
                                        }
                                        byte[] bArr4 = vVar.f13853b;
                                        if (wVar.a() >= i12) {
                                            wVar.e(bArr4, i20, i12);
                                            vVar.p(14);
                                            int i29 = vVar.i(13);
                                            if (i29 < 7) {
                                                b10 = -1;
                                            } else {
                                                byte[] bArr5 = wVar.f13860a;
                                                int i30 = wVar.f13862c;
                                                int i31 = i26 + i29;
                                                if (i31 < i30) {
                                                    byte b13 = bArr5[i31];
                                                    b10 = -1;
                                                    if (b13 == -1) {
                                                        int i32 = i31 + 1;
                                                        if (i32 != i30) {
                                                            byte b14 = bArr5[i32];
                                                            if (((65280 | (b14 & 255)) & 65526) == 65520 && ((b14 & 8) >> 3) == i27) {
                                                            }
                                                        }
                                                    } else if (b13 == 73 && ((i13 = i31 + 1) == i30 || (bArr5[i13] == 68 && ((i14 = i31 + 2) == i30 || bArr5[i14] == 51)))) {
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        b10 = -1;
                                    }
                                }
                                i7 = 1;
                            }
                            this.f23706o = (b12 & 8) >> 3;
                            this.k = (b12 & 1) == 0;
                            if (this.f23703l) {
                                this.f23701h = i24;
                                this.f23702i = 0;
                            } else {
                                this.f23701h = 1;
                                this.f23702i = 0;
                            }
                            wVar.F(i23);
                        } else {
                            b10 = b11;
                            i7 = i19;
                        }
                        int i33 = this.j;
                        int i34 = i25 | i33;
                        if (i34 == 329) {
                            i10 = 3;
                            c8 = 256;
                            i11 = 0;
                            c10 = 2;
                            this.j = 768;
                        } else if (i34 == 511) {
                            i10 = 3;
                            c8 = 256;
                            i11 = 0;
                            c10 = 2;
                            this.j = IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                        } else if (i34 == 836) {
                            i10 = 3;
                            c8 = 256;
                            i11 = 0;
                            c10 = 2;
                            this.j = IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
                        } else if (i34 != 1075) {
                            c8 = 256;
                            if (i33 != 256) {
                                this.j = IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                                i10 = 3;
                                i11 = 0;
                                c10 = 2;
                            } else {
                                i10 = 3;
                                i11 = 0;
                                c10 = 2;
                            }
                            i19 = i7;
                            b11 = b10;
                            i18 = 4;
                            i20 = i11;
                            i17 = i10;
                        } else {
                            this.f23701h = 2;
                            this.f23702i = 3;
                            this.f23709r = 0;
                            wVar2.F(0);
                            wVar.F(i23);
                        }
                        i21 = i23;
                        i19 = i7;
                        b11 = b10;
                        i18 = 4;
                        i20 = i11;
                        i17 = i10;
                    } else {
                        wVar.F(i21);
                    }
                }
            } else if (i16 != 1) {
                if (i16 == 2) {
                    byte[] bArr6 = wVar2.f13860a;
                    int iMin = Math.min(wVar.a(), 10 - this.f23702i);
                    wVar.e(bArr6, this.f23702i, iMin);
                    int i35 = this.f23702i + iMin;
                    this.f23702i = i35;
                    if (i35 == 10) {
                        this.f23700g.d(10, wVar2);
                        wVar2.F(6);
                        pc.x xVar = this.f23700g;
                        int iT = wVar2.t() + 10;
                        this.f23701h = 4;
                        this.f23702i = 10;
                        this.f23711t = xVar;
                        this.f23712u = 0L;
                        this.f23709r = iT;
                    }
                } else if (i16 == 3) {
                    int i36 = this.k ? 7 : 5;
                    byte[] bArr7 = vVar.f13853b;
                    int iMin2 = Math.min(wVar.a(), i36 - this.f23702i);
                    wVar.e(bArr7, this.f23702i, iMin2);
                    int i37 = this.f23702i + iMin2;
                    this.f23702i = i37;
                    if (i37 == i36) {
                        vVar.p(0);
                        if (this.f23707p) {
                            vVar.s(10);
                        } else {
                            int i38 = vVar.i(2) + 1;
                            if (i38 != 2) {
                                je.b.N("AdtsReader", "Detected audio object type: " + i38 + ", but assuming AAC LC.");
                                i38 = 2;
                            }
                            vVar.s(5);
                            byte[] bArrA = ic.a.a(i38, this.f23705n, vVar.i(3));
                            o0 o0VarI = ic.a.i(new je.v(bArrA, 2), false);
                            g0 g0Var = new g0();
                            g0Var.f9635a = this.f23698e;
                            g0Var.k = "audio/mp4a-latm";
                            g0Var.f9642h = (String) o0VarI.f11594c;
                            g0Var.f9656x = o0VarI.f11593b;
                            g0Var.f9657y = o0VarI.f11592a;
                            g0Var.f9645m = Collections.singletonList(bArrA);
                            g0Var.f9637c = this.f23697d;
                            Format format = new Format(g0Var);
                            this.f23708q = 1024000000 / ((long) format.W);
                            this.f23699f.e(format);
                            this.f23707p = true;
                        }
                        vVar.s(4);
                        int i39 = vVar.i(13);
                        int i40 = i39 - 7;
                        if (this.k) {
                            i40 = i39 - 9;
                        }
                        pc.x xVar2 = this.f23699f;
                        long j = this.f23708q;
                        this.f23701h = 4;
                        this.f23702i = 0;
                        this.f23711t = xVar2;
                        this.f23712u = j;
                        this.f23709r = i40;
                    }
                } else {
                    if (i16 != 4) {
                        throw new IllegalStateException();
                    }
                    int iMin3 = Math.min(wVar.a(), this.f23709r - this.f23702i);
                    this.f23711t.d(iMin3, wVar);
                    int i41 = this.f23702i + iMin3;
                    this.f23702i = i41;
                    int i42 = this.f23709r;
                    if (i41 == i42) {
                        long j5 = this.f23710s;
                        if (j5 != -9223372036854775807L) {
                            this.f23711t.c(j5, 1, i42, 0, null);
                            this.f23710s += this.f23712u;
                        }
                        this.f23701h = 0;
                        this.f23702i = 0;
                        this.j = IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                    }
                }
            } else if (wVar.a() != 0) {
                vVar.f13853b[0] = wVar.f13860a[wVar.f13861b];
                vVar.p(2);
                int i43 = vVar.i(4);
                int i44 = this.f23705n;
                if (i44 == -1 || i43 == i44) {
                    if (!this.f23703l) {
                        this.f23703l = true;
                        this.f23704m = this.f23706o;
                        this.f23705n = i43;
                    }
                    this.f23701h = 3;
                    this.f23702i = 0;
                } else {
                    this.f23703l = false;
                    this.f23701h = 0;
                    this.f23702i = 0;
                    this.j = IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                }
            }
        }
    }

    @Override // zc.h
    public final void e(pc.m mVar, d0 d0Var) {
        d0Var.a();
        d0Var.b();
        this.f23698e = d0Var.f23692e;
        d0Var.b();
        pc.x xVarX = mVar.x(d0Var.f23691d, 1);
        this.f23699f = xVarX;
        this.f23711t = xVarX;
        if (!this.f23694a) {
            this.f23700g = new pc.j();
            return;
        }
        d0Var.a();
        d0Var.b();
        pc.x xVarX2 = mVar.x(d0Var.f23691d, 5);
        this.f23700g = xVarX2;
        g0 g0Var = new g0();
        d0Var.b();
        g0Var.f9635a = d0Var.f23692e;
        g0Var.k = "application/id3";
        xVarX2.e(new Format(g0Var));
    }

    @Override // zc.h
    public final void f(int i7, long j) {
        if (j != -9223372036854775807L) {
            this.f23710s = j;
        }
    }

    @Override // zc.h
    public final void d() {
    }
}

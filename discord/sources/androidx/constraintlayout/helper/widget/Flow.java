package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.m;
import androidx.constraintlayout.widget.n;
import java.util.ArrayList;
import java.util.Arrays;
import r0.c;
import r0.d;
import r0.e;
import r0.f;
import s0.b;

/* JADX INFO: loaded from: classes.dex */
public class Flow extends n {
    public e G;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.constraintlayout.widget.n, androidx.constraintlayout.widget.b
    public final void h(AttributeSet attributeSet) {
        super.h(attributeSet);
        e eVar = new e();
        eVar.f19169r0 = 0;
        eVar.f19170s0 = 0;
        eVar.f19171t0 = 0;
        eVar.f19172u0 = 0;
        eVar.f19173v0 = 0;
        eVar.f19174w0 = 0;
        eVar.f19175x0 = false;
        eVar.f19176y0 = 0;
        eVar.f19177z0 = 0;
        eVar.A0 = new b();
        eVar.B0 = null;
        eVar.C0 = -1;
        eVar.D0 = -1;
        eVar.E0 = -1;
        eVar.F0 = -1;
        eVar.G0 = -1;
        eVar.H0 = -1;
        eVar.I0 = 0.5f;
        eVar.J0 = 0.5f;
        eVar.K0 = 0.5f;
        eVar.L0 = 0.5f;
        eVar.M0 = 0.5f;
        eVar.N0 = 0.5f;
        eVar.O0 = 0;
        eVar.P0 = 0;
        eVar.Q0 = 2;
        eVar.R0 = 2;
        eVar.S0 = 0;
        eVar.T0 = -1;
        eVar.U0 = 0;
        eVar.V0 = new ArrayList();
        eVar.W0 = null;
        eVar.X0 = null;
        eVar.Y0 = null;
        eVar.f19168a1 = 0;
        this.G = eVar;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, m.f1445b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i7 = 0; i7 < indexCount; i7++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i7);
                if (index == 0) {
                    this.G.U0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 1) {
                    e eVar2 = this.G;
                    int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    eVar2.f19169r0 = dimensionPixelSize;
                    eVar2.f19170s0 = dimensionPixelSize;
                    eVar2.f19171t0 = dimensionPixelSize;
                    eVar2.f19172u0 = dimensionPixelSize;
                } else if (index == 18) {
                    e eVar3 = this.G;
                    int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    eVar3.f19171t0 = dimensionPixelSize2;
                    eVar3.f19173v0 = dimensionPixelSize2;
                    eVar3.f19174w0 = dimensionPixelSize2;
                } else if (index == 19) {
                    this.G.f19172u0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 2) {
                    this.G.f19173v0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 3) {
                    this.G.f19169r0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 4) {
                    this.G.f19174w0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 5) {
                    this.G.f19170s0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 54) {
                    this.G.S0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 44) {
                    this.G.C0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 53) {
                    this.G.D0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 38) {
                    this.G.E0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 46) {
                    this.G.G0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 40) {
                    this.G.F0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 48) {
                    this.G.H0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 42) {
                    this.G.I0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 37) {
                    this.G.K0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 45) {
                    this.G.M0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 39) {
                    this.G.L0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 47) {
                    this.G.N0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 51) {
                    this.G.J0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 41) {
                    this.G.Q0 = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == 50) {
                    this.G.R0 = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == 43) {
                    this.G.O0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 52) {
                    this.G.P0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 49) {
                    this.G.T0 = typedArrayObtainStyledAttributes.getInt(index, -1);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f1351v = this.G;
        k();
    }

    @Override // androidx.constraintlayout.widget.b
    public final void i(ConstraintWidget constraintWidget, boolean z5) {
        e eVar = this.G;
        int i7 = eVar.f19171t0;
        if (i7 > 0 || eVar.f19172u0 > 0) {
            if (z5) {
                eVar.f19173v0 = eVar.f19172u0;
                eVar.f19174w0 = i7;
            } else {
                eVar.f19173v0 = i7;
                eVar.f19174w0 = eVar.f19172u0;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x015f  */
    /* JADX WARN: Code duplicated, block: B:105:0x0167  */
    /* JADX WARN: Code duplicated, block: B:108:0x016f  */
    /* JADX WARN: Code duplicated, block: B:111:0x0178  */
    /* JADX WARN: Code duplicated, block: B:114:0x017e  */
    /* JADX WARN: Code duplicated, block: B:123:0x0195 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:124:0x0197  */
    /* JADX WARN: Code duplicated, block: B:125:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:130:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:139:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:142:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:144:0x01df  */
    /* JADX WARN: Code duplicated, block: B:146:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:149:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:157:0x020d  */
    /* JADX WARN: Code duplicated, block: B:162:0x0221  */
    /* JADX WARN: Code duplicated, block: B:167:0x023f  */
    /* JADX WARN: Code duplicated, block: B:169:0x0245 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:170:0x0247  */
    /* JADX WARN: Code duplicated, block: B:175:0x0257  */
    /* JADX WARN: Code duplicated, block: B:177:0x025f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:178:0x0261  */
    /* JADX WARN: Code duplicated, block: B:183:0x0275  */
    /* JADX WARN: Code duplicated, block: B:187:0x027e  */
    /* JADX WARN: Code duplicated, block: B:188:0x0280  */
    /* JADX WARN: Code duplicated, block: B:194:0x02a7 A[PHI: r30 r31 r32 r33 r35 r36
      0x02a7: PHI (r30v1 char) = (r30v0 char), (r30v3 char), (r30v4 char) binds: [B:294:0x04c9, B:292:0x04af, B:193:0x029b] A[DONT_GENERATE, DONT_INLINE]
      0x02a7: PHI (r31v1 int) = (r31v0 int), (r31v3 int), (r31v4 int) binds: [B:294:0x04c9, B:292:0x04af, B:193:0x029b] A[DONT_GENERATE, DONT_INLINE]
      0x02a7: PHI (r32v1 int) = (r32v0 int), (r32v3 int), (r32v4 int) binds: [B:294:0x04c9, B:292:0x04af, B:193:0x029b] A[DONT_GENERATE, DONT_INLINE]
      0x02a7: PHI (r33v1 int[]) = (r33v0 int[]), (r33v3 int[]), (r33v4 int[]) binds: [B:294:0x04c9, B:292:0x04af, B:193:0x029b] A[DONT_GENERATE, DONT_INLINE]
      0x02a7: PHI (r35v1 int) = (r35v0 int), (r35v3 int), (r35v4 int) binds: [B:294:0x04c9, B:292:0x04af, B:193:0x029b] A[DONT_GENERATE, DONT_INLINE]
      0x02a7: PHI (r36v1 int) = (r36v0 int), (r36v3 int), (r36v4 int) binds: [B:294:0x04c9, B:292:0x04af, B:193:0x029b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:195:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:198:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:200:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:202:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:204:0x0307  */
    /* JADX WARN: Code duplicated, block: B:221:0x032c  */
    /* JADX WARN: Code duplicated, block: B:223:0x0348  */
    /* JADX WARN: Code duplicated, block: B:225:0x034d  */
    /* JADX WARN: Code duplicated, block: B:227:0x035c  */
    /* JADX WARN: Code duplicated, block: B:229:0x0362  */
    /* JADX WARN: Code duplicated, block: B:231:0x036f  */
    /* JADX WARN: Code duplicated, block: B:248:0x0394  */
    /* JADX WARN: Code duplicated, block: B:250:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:252:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:261:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:266:0x03ee  */
    /* JADX WARN: Code duplicated, block: B:268:0x03f6  */
    /* JADX WARN: Code duplicated, block: B:269:0x0400  */
    /* JADX WARN: Code duplicated, block: B:273:0x0421  */
    /* JADX WARN: Code duplicated, block: B:275:0x0429  */
    /* JADX WARN: Code duplicated, block: B:277:0x042d  */
    /* JADX WARN: Code duplicated, block: B:278:0x043e  */
    /* JADX WARN: Code duplicated, block: B:281:0x0460  */
    /* JADX WARN: Code duplicated, block: B:283:0x0469  */
    /* JADX WARN: Code duplicated, block: B:285:0x046f  */
    /* JADX WARN: Code duplicated, block: B:286:0x0480  */
    /* JADX WARN: Code duplicated, block: B:289:0x04a0  */
    /* JADX WARN: Code duplicated, block: B:293:0x04b7  */
    /* JADX WARN: Code duplicated, block: B:296:0x04cd  */
    /* JADX WARN: Code duplicated, block: B:298:0x04d3  */
    /* JADX WARN: Code duplicated, block: B:299:0x04e4  */
    /* JADX WARN: Code duplicated, block: B:302:0x0528 A[LOOP:14: B:301:0x0526->B:302:0x0528, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:307:0x0551 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:308:0x0553  */
    /* JADX WARN: Code duplicated, block: B:309:0x0558 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:310:0x055a  */
    /* JADX WARN: Code duplicated, block: B:311:0x055c  */
    /* JADX WARN: Code duplicated, block: B:314:0x0560 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:315:0x0562  */
    /* JADX WARN: Code duplicated, block: B:316:0x0567 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:317:0x0569  */
    /* JADX WARN: Code duplicated, block: B:318:0x056b  */
    /* JADX WARN: Code duplicated, block: B:321:0x057a  */
    /* JADX WARN: Code duplicated, block: B:322:0x057d  */
    /* JADX WARN: Code duplicated, block: B:333:0x00da A[EDGE_INSN: B:333:0x00da->B:60:0x00da BREAK  A[LOOP:1: B:54:0x00c3->B:59:0x00d5], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:335:0x00d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:338:0x00f7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:339:0x0149 A[EDGE_INSN: B:339:0x0149->B:93:0x0149 BREAK  A[LOOP:3: B:81:0x012b->B:92:0x0144], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:340:0x0149 A[EDGE_INSN: B:340:0x0149->B:93:0x0149 BREAK  A[LOOP:3: B:81:0x012b->B:92:0x0144], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:342:0x0144 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:354:0x0250 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:357:0x026a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:359:0x0175 A[EDGE_INSN: B:359:0x0175->B:110:0x0175 BREAK  A[LOOP:9: B:98:0x0159->B:109:0x0172], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:361:0x0172 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x009a  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:52:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:56:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:58:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:61:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:64:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:66:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:71:0x0109  */
    /* JADX WARN: Code duplicated, block: B:73:0x010c  */
    /* JADX WARN: Code duplicated, block: B:75:0x010f  */
    /* JADX WARN: Code duplicated, block: B:76:0x011f  */
    /* JADX WARN: Code duplicated, block: B:78:0x0123  */
    /* JADX WARN: Code duplicated, block: B:80:0x0127  */
    /* JADX WARN: Code duplicated, block: B:83:0x012f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x0131  */
    /* JADX WARN: Code duplicated, block: B:88:0x0139  */
    /* JADX WARN: Code duplicated, block: B:91:0x0141  */
    /* JADX WARN: Code duplicated, block: B:94:0x014b  */
    /* JADX WARN: Code duplicated, block: B:95:0x0150  */
    /* JADX WARN: Code duplicated, block: B:97:0x0156  */
    /* JADX WARN: Code duplicated, block: B:99:0x015b  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.constraintlayout.widget.n
    public final void l(e eVar, int i7, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int[] iArr;
        int i15;
        int i16;
        ConstraintWidget[] constraintWidgetArr;
        int i17;
        int i18;
        int i19;
        ConstraintWidget[] constraintWidgetArr2;
        ConstraintWidget[] constraintWidgetArr3;
        int i20;
        int i21;
        int i22;
        int[] iArr2;
        int i23;
        int i24;
        int i25;
        char c8;
        int i26;
        int i27;
        d dVar;
        int i28;
        char c10;
        int i29;
        int i30;
        boolean z5;
        int i31;
        int i32;
        int[] iArr3;
        char c11;
        int i33;
        c cVar;
        c cVar2;
        d dVar2;
        int i34;
        int i35;
        d dVar3;
        int i36;
        int i37;
        int i38;
        int i39;
        ConstraintWidget constraintWidget;
        int iO;
        boolean z6;
        int i40;
        int size;
        int[] iArr4;
        int i41;
        boolean z7;
        c cVar3;
        int i42;
        int i43;
        int i44;
        int i45;
        c cVar4;
        c cVar5;
        c cVar6;
        int i46;
        int iMax;
        int i47;
        d dVar4;
        int i48;
        int iD;
        int iC;
        int i49;
        d dVar5;
        d dVar6;
        int i50;
        int i51;
        ConstraintWidget constraintWidget2;
        int iP;
        int i52;
        boolean z10;
        ConstraintWidget constraintWidget3;
        int i53;
        int i54;
        int i55;
        int i56;
        int iCeil;
        int iCeil2;
        int i57;
        int i58;
        ConstraintWidget constraintWidget4;
        int iO2;
        boolean z11;
        ConstraintWidget[] constraintWidgetArr4;
        ConstraintWidget[] constraintWidgetArr5;
        int i59;
        int i60;
        int iP2;
        int i61;
        int iO3;
        ConstraintWidget constraintWidget5;
        ConstraintWidget constraintWidget6;
        int i62;
        int i63;
        int i64;
        int i65;
        ConstraintWidget constraintWidget7;
        ConstraintWidget[] constraintWidgetArr6;
        ConstraintWidget constraintWidget8;
        ConstraintWidget constraintWidget9;
        int i66;
        int i67;
        int i68;
        ConstraintWidget constraintWidget10;
        int iP3;
        ConstraintWidget[] constraintWidgetArr7;
        int i69;
        int i70;
        ConstraintWidget constraintWidget11;
        ConstraintWidget[] constraintWidgetArr8;
        int i71;
        int mode = View.MeasureSpec.getMode(i7);
        int size2 = View.MeasureSpec.getSize(i7);
        int mode2 = View.MeasureSpec.getMode(i10);
        int size3 = View.MeasureSpec.getSize(i10);
        int i72 = 0;
        if (eVar == null) {
            setMeasuredDimension(0, 0);
            return;
        }
        ArrayList arrayList = eVar.V0;
        if (eVar.f19185q0 > 0) {
            b bVar = eVar.A0;
            ConstraintWidget constraintWidget12 = eVar.S;
            s0.c cVar7 = constraintWidget12 != null ? ((ConstraintWidgetContainer) constraintWidget12).f1278t0 : null;
            if (cVar7 == null) {
                eVar.f19176y0 = 0;
                eVar.f19177z0 = 0;
                eVar.f19175x0 = false;
            } else {
                int i73 = 0;
                while (i73 < eVar.f19185q0) {
                    ConstraintWidget constraintWidget13 = eVar.f19184p0[i73];
                    if (constraintWidget13 != null && !(constraintWidget13 instanceof f)) {
                        int iJ = constraintWidget13.j(i72);
                        int iJ2 = constraintWidget13.j(1);
                        if (iJ != 3 || constraintWidget13.f1264q == 1 || iJ2 != 3 || constraintWidget13.f1265r == 1) {
                            if (iJ == 3) {
                                iJ = 2;
                            }
                            if (iJ2 == 3) {
                                iJ2 = 2;
                            }
                            bVar.f19653a = iJ;
                            bVar.f19654b = iJ2;
                            bVar.f19655c = constraintWidget13.n();
                            bVar.f19656d = constraintWidget13.k();
                            ((ConstraintLayout.Measurer) cVar7).b(constraintWidget13, bVar);
                            constraintWidget13.J(bVar.f19657e);
                            constraintWidget13.G(bVar.f19658f);
                            constraintWidget13.D(bVar.f19659g);
                        }
                    }
                    i73++;
                    i72 = 0;
                }
                i11 = eVar.f19173v0;
                i12 = eVar.f19174w0;
                i13 = eVar.f19169r0;
                i14 = eVar.f19170s0;
                iArr = new int[2];
                i15 = (size2 - i11) - i12;
                i16 = eVar.U0;
                if (i16 == 1) {
                    i15 = (size3 - i13) - i14;
                }
                if (i16 == 0) {
                    if (eVar.C0 == -1) {
                        i71 = 0;
                        eVar.C0 = 0;
                    } else {
                        i71 = 0;
                    }
                    if (eVar.D0 == -1) {
                        eVar.D0 = i71;
                    }
                } else {
                    if (eVar.C0 == -1) {
                        eVar.C0 = 0;
                    }
                    if (eVar.D0 == -1) {
                        eVar.D0 = 0;
                    }
                }
                constraintWidgetArr = eVar.f19184p0;
                i17 = 0;
                i18 = 0;
                while (true) {
                    i19 = eVar.f19185q0;
                    constraintWidgetArr2 = constraintWidgetArr;
                    if (i17 < i19) {
                        break;
                    }
                    if (eVar.f19184p0[i17].f1247f0 == 8) {
                        i18++;
                    }
                    i17++;
                    constraintWidgetArr = constraintWidgetArr2;
                }
                if (i18 > 0) {
                    constraintWidgetArr7 = new ConstraintWidget[i19 - i18];
                    i69 = 0;
                    i70 = 0;
                    while (i69 < eVar.f19185q0) {
                        constraintWidget11 = eVar.f19184p0[i69];
                        constraintWidgetArr8 = constraintWidgetArr7;
                        if (constraintWidget11.f1247f0 != 8) {
                            constraintWidgetArr8[i70] = constraintWidget11;
                            i70++;
                        }
                        i69++;
                        constraintWidgetArr7 = constraintWidgetArr8;
                    }
                    constraintWidgetArr2 = constraintWidgetArr7;
                    i19 = i70;
                }
                constraintWidgetArr3 = constraintWidgetArr2;
                eVar.Z0 = constraintWidgetArr3;
                eVar.f19168a1 = i19;
                i20 = eVar.S0;
                if (i20 != 0) {
                    if (i20 != 1) {
                        i31 = i19;
                        i32 = i14;
                        iArr3 = iArr;
                        c11 = 1;
                        i33 = eVar.U0;
                        cVar = eVar.K;
                        cVar2 = eVar.J;
                        if (i31 == 0) {
                            arrayList.clear();
                            i34 = i15;
                            i23 = i11;
                            i24 = i12;
                            c8 = 1;
                            i25 = i13;
                            i21 = i32;
                            iArr2 = iArr3;
                            i35 = 3;
                            dVar2 = new d(eVar, i33, eVar.H, eVar.I, eVar.J, eVar.K, i34);
                            arrayList.add(dVar2);
                            if (i33 == 0) {
                                dVar6 = dVar2;
                                i50 = 0;
                                i39 = 0;
                                i51 = 0;
                                while (i50 < i31) {
                                    constraintWidget2 = constraintWidgetArr3[i50];
                                    iP = eVar.P(constraintWidget2, i34);
                                    i52 = i50;
                                    if (constraintWidget2.f1262o0[0] == i35) {
                                        i39++;
                                    }
                                    int i74 = i39;
                                    z10 = (i51 != i34 || (eVar.O0 + i51) + iP > i34) && dVar6.f19153b != null;
                                    if (!z10 && i52 > 0 && (i54 = eVar.T0) > 0 && i52 % i54 == 0) {
                                        z10 = true;
                                    }
                                    if (z10) {
                                        i53 = i52;
                                        constraintWidget3 = constraintWidget2;
                                        d dVar7 = new d(eVar, i33, eVar.H, eVar.I, eVar.J, eVar.K, i34);
                                        dVar7.f19163n = i53;
                                        arrayList.add(dVar7);
                                        dVar6 = dVar7;
                                    } else {
                                        constraintWidget3 = constraintWidget2;
                                        i53 = i52;
                                        if (i53 > 0) {
                                            i51 = eVar.O0 + iP + i51;
                                        }
                                        dVar6.a(constraintWidget3);
                                        i50 = i53 + 1;
                                        i39 = i74;
                                        i35 = 3;
                                    }
                                    i51 = iP;
                                    dVar6.a(constraintWidget3);
                                    i50 = i53 + 1;
                                    i39 = i74;
                                    i35 = 3;
                                }
                            } else {
                                dVar3 = dVar2;
                                i36 = 0;
                                i37 = 0;
                                i38 = 0;
                                while (i36 < i31) {
                                    constraintWidget = constraintWidgetArr3[i36];
                                    iO = eVar.O(constraintWidget, i34);
                                    if (constraintWidget.f1262o0[1] == 3) {
                                        i37++;
                                    }
                                    int i75 = i37;
                                    z6 = (i38 != i34 || (eVar.P0 + i38) + iO > i34) && dVar3.f19153b != null;
                                    if (!z6 && i36 > 0 && (i40 = eVar.T0) > 0 && i36 % i40 == 0) {
                                        z6 = true;
                                    }
                                    if (z6) {
                                        d dVar8 = new d(eVar, i33, eVar.H, eVar.I, eVar.J, eVar.K, i34);
                                        dVar8.f19163n = i36;
                                        arrayList.add(dVar8);
                                        dVar3 = dVar8;
                                    } else {
                                        if (i36 > 0) {
                                            i38 = eVar.P0 + iO + i38;
                                        }
                                        dVar3.a(constraintWidget);
                                        i36++;
                                        i37 = i75;
                                    }
                                    i38 = iO;
                                    dVar3.a(constraintWidget);
                                    i36++;
                                    i37 = i75;
                                }
                                i39 = i37;
                            }
                            size = arrayList.size();
                            c cVar8 = eVar.H;
                            c cVar9 = eVar.I;
                            int i76 = eVar.f19173v0;
                            int i77 = eVar.f19169r0;
                            int i78 = eVar.f19174w0;
                            int i79 = eVar.f19170s0;
                            iArr4 = eVar.f1262o0;
                            i41 = i33;
                            if (iArr4[0] != 2 || iArr4[1] == 2) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            if (i39 > 0 && z7) {
                                for (i49 = 0; i49 < size; i49++) {
                                    dVar5 = (d) arrayList.get(i49);
                                    if (i41 == 0) {
                                        dVar5.e(i34 - dVar5.d());
                                    } else {
                                        dVar5.e(i34 - dVar5.c());
                                    }
                                }
                            }
                            cVar3 = cVar9;
                            i42 = i76;
                            i43 = i77;
                            i44 = i78;
                            i45 = i79;
                            cVar4 = cVar8;
                            cVar5 = cVar;
                            cVar6 = cVar2;
                            i46 = 0;
                            iMax = 0;
                            i47 = 0;
                            while (i46 < size) {
                                dVar4 = (d) arrayList.get(i46);
                                if (i41 == 0) {
                                    if (i46 < size - 1) {
                                        cVar5 = ((d) arrayList.get(i46 + 1)).f19153b.I;
                                        i45 = 0;
                                    } else {
                                        i45 = eVar.f19170s0;
                                        cVar5 = cVar;
                                    }
                                    c cVar10 = dVar4.f19153b.K;
                                    i48 = i41;
                                    dVar4.f(i48, cVar4, cVar3, cVar6, cVar5, i42, i43, i44, i45, i34);
                                    iMax = Math.max(iMax, dVar4.d());
                                    iC = dVar4.c() + i47;
                                    if (i46 > 0) {
                                        iC += eVar.P0;
                                    }
                                    i47 = iC;
                                    cVar3 = cVar10;
                                    i43 = 0;
                                } else {
                                    i48 = i41;
                                    if (i46 < size - 1) {
                                        cVar6 = ((d) arrayList.get(i46 + 1)).f19153b.H;
                                        i44 = 0;
                                    } else {
                                        i44 = eVar.f19174w0;
                                        cVar6 = cVar2;
                                    }
                                    c cVar11 = dVar4.f19153b.J;
                                    dVar4.f(i48, cVar4, cVar3, cVar6, cVar5, i42, i43, i44, i45, i34);
                                    iD = dVar4.d() + iMax;
                                    int iMax2 = Math.max(i47, dVar4.c());
                                    if (i46 > 0) {
                                        iD += eVar.O0;
                                    }
                                    i47 = iMax2;
                                    iMax = iD;
                                    cVar4 = cVar11;
                                    i42 = 0;
                                }
                                i46++;
                                i41 = i48;
                            }
                            iArr2[0] = iMax;
                            iArr2[1] = i47;
                        }
                        c10 = 0;
                    } else if (i20 != 2) {
                        i21 = i14;
                        iArr2 = iArr;
                        i23 = i11;
                        i24 = i12;
                        i25 = i13;
                        c10 = 0;
                        c8 = 1;
                    } else {
                        i55 = eVar.U0;
                        if (i55 == 0) {
                            i66 = eVar.T0;
                            if (i66 <= 0) {
                                i67 = 0;
                                i68 = 0;
                                iCeil2 = 0;
                                while (true) {
                                    i32 = i14;
                                    if (i67 >= i19) {
                                        break;
                                    }
                                    if (i67 > 0) {
                                        i68 += eVar.O0;
                                    }
                                    constraintWidget10 = constraintWidgetArr3[i67];
                                    if (constraintWidget10 != null) {
                                        iP3 = eVar.P(constraintWidget10, i15) + i68;
                                        if (iP3 > i15) {
                                            break;
                                        }
                                        iCeil2++;
                                        i68 = iP3;
                                    }
                                    i67++;
                                    i14 = i32;
                                }
                            } else {
                                i32 = i14;
                                iCeil2 = i66;
                            }
                            iCeil = 0;
                        } else {
                            i32 = i14;
                            i56 = eVar.T0;
                            if (i56 <= 0) {
                                i57 = 0;
                                i58 = 0;
                                iCeil = 0;
                                while (i57 < i19) {
                                    int i80 = i57;
                                    if (i57 > 0) {
                                        i58 += eVar.P0;
                                    }
                                    constraintWidget4 = constraintWidgetArr3[i80];
                                    if (constraintWidget4 != null) {
                                        iO2 = eVar.O(constraintWidget4, i15) + i58;
                                        if (iO2 > i15) {
                                            break;
                                        }
                                        iCeil++;
                                        i58 = iO2;
                                    }
                                    i57 = i80 + 1;
                                }
                            } else {
                                iCeil = i56;
                            }
                            iCeil2 = 0;
                        }
                        if (eVar.Y0 == null) {
                            eVar.Y0 = new int[2];
                        }
                        z11 = (iCeil != 0 && i55 == 1) || (iCeil2 == 0 && i55 == 0);
                        while (!z11) {
                            if (i55 == 0) {
                                iCeil = (int) Math.ceil(i19 / iCeil2);
                                iCeil2 = iCeil2;
                            } else {
                                iCeil2 = (int) Math.ceil(i19 / iCeil);
                            }
                            constraintWidgetArr4 = eVar.X0;
                            int i81 = i19;
                            if (constraintWidgetArr4 != null || constraintWidgetArr4.length < iCeil2) {
                                eVar.X0 = new ConstraintWidget[iCeil2];
                            } else {
                                Arrays.fill(constraintWidgetArr4, (Object) null);
                            }
                            constraintWidgetArr5 = eVar.W0;
                            if (constraintWidgetArr5 != null || constraintWidgetArr5.length < iCeil) {
                                eVar.W0 = new ConstraintWidget[iCeil];
                            } else {
                                Arrays.fill(constraintWidgetArr5, (Object) null);
                            }
                            i59 = 0;
                            while (i59 < iCeil2) {
                                i62 = 0;
                                while (i62 < iCeil) {
                                    i63 = (i62 * iCeil2) + i59;
                                    i64 = i59;
                                    if (i55 == 1) {
                                        i63 = (i64 * iCeil) + i62;
                                    }
                                    int[] iArr5 = iArr;
                                    i65 = i63;
                                    if (i65 >= constraintWidgetArr3.length && (constraintWidget7 = constraintWidgetArr3[i65]) != null) {
                                        int iP4 = eVar.P(constraintWidget7, i15);
                                        constraintWidgetArr6 = constraintWidgetArr3;
                                        constraintWidget8 = eVar.X0[i64];
                                        if (constraintWidget8 != null || constraintWidget8.n() < iP4) {
                                            eVar.X0[i64] = constraintWidget7;
                                        }
                                        int iO4 = eVar.O(constraintWidget7, i15);
                                        constraintWidget9 = eVar.W0[i62];
                                        if (constraintWidget9 != null || constraintWidget9.k() < iO4) {
                                            eVar.W0[i62] = constraintWidget7;
                                        }
                                    } else {
                                        constraintWidgetArr6 = constraintWidgetArr3;
                                    }
                                    i62++;
                                    i59 = i64;
                                    iArr = iArr5;
                                    constraintWidgetArr3 = constraintWidgetArr6;
                                }
                                i59++;
                            }
                            ConstraintWidget[] constraintWidgetArr9 = constraintWidgetArr3;
                            int[] iArr6 = iArr;
                            iP2 = 0;
                            for (i60 = 0; i60 < iCeil2; i60++) {
                                constraintWidget6 = eVar.X0[i60];
                                if (constraintWidget6 == null) {
                                    if (i60 > 0) {
                                        iP2 += eVar.O0;
                                    }
                                    iP2 = eVar.P(constraintWidget6, i15) + iP2;
                                }
                            }
                            i61 = 0;
                            iO3 = 0;
                            while (i61 < iCeil) {
                                constraintWidget5 = eVar.W0[i61];
                                int i82 = i61;
                                if (constraintWidget5 == null) {
                                    if (i61 > 0) {
                                        iO3 += eVar.P0;
                                    }
                                    iO3 = eVar.O(constraintWidget5, i15) + iO3;
                                }
                                i61 = i82 + 1;
                            }
                            iArr6[0] = iP2;
                            iArr6[1] = iO3;
                            if (i55 == 0) {
                                if (iP2 > i15 || iCeil2 <= 1) {
                                    z11 = true;
                                } else {
                                    iCeil2--;
                                    z11 = z11;
                                }
                            } else if (iO3 > i15 || iCeil <= 1) {
                                z11 = true;
                            } else {
                                iCeil--;
                                z11 = z11;
                            }
                            i19 = i81;
                            iArr = iArr6;
                            constraintWidgetArr3 = constraintWidgetArr9;
                        }
                        iArr3 = iArr;
                        c11 = 1;
                        int[] iArr7 = eVar.Y0;
                        iArr7[0] = iCeil2;
                        iArr7[1] = iCeil;
                    }
                    c8 = c11;
                    i23 = i11;
                    i24 = i12;
                    i25 = i13;
                    i21 = i32;
                    iArr2 = iArr3;
                    c10 = 0;
                } else {
                    i21 = i14;
                    i22 = i15;
                    iArr2 = iArr;
                    i23 = i11;
                    i24 = i12;
                    i25 = i13;
                    c8 = 1;
                    i26 = i19;
                    i27 = eVar.U0;
                    if (i26 == 0) {
                        c10 = 0;
                    } else {
                        if (arrayList.size() == 0) {
                            dVar = new d(eVar, i27, eVar.H, eVar.I, eVar.J, eVar.K, i22);
                            arrayList.add(dVar);
                        } else {
                            d dVar9 = (d) arrayList.get(0);
                            dVar9.f19154c = 0;
                            dVar9.f19153b = null;
                            dVar9.f19161l = 0;
                            dVar9.f19162m = 0;
                            dVar9.f19163n = 0;
                            dVar9.f19164o = 0;
                            dVar9.f19165p = 0;
                            dVar9.f(i27, eVar.H, eVar.I, eVar.J, eVar.K, eVar.f19173v0, eVar.f19169r0, eVar.f19174w0, eVar.f19170s0, i22);
                            dVar = dVar9;
                        }
                        for (i28 = 0; i28 < i26; i28++) {
                            dVar.a(constraintWidgetArr3[i28]);
                        }
                        c10 = 0;
                        iArr2[0] = dVar.d();
                        iArr2[1] = dVar.c();
                    }
                }
                i29 = iArr2[c10] + i23 + i24;
                i30 = iArr2[c8] + i25 + i21;
                if (mode != 1073741824) {
                    if (mode == Integer.MIN_VALUE) {
                        size2 = Math.min(i29, size2);
                    } else if (mode == 0) {
                        size2 = i29;
                    } else {
                        size2 = 0;
                    }
                }
                if (mode2 != 1073741824) {
                    if (mode2 == Integer.MIN_VALUE) {
                        size3 = Math.min(i30, size3);
                    } else if (mode2 == 0) {
                        size3 = i30;
                    } else {
                        size3 = 0;
                    }
                }
                eVar.f19176y0 = size2;
                eVar.f19177z0 = size3;
                eVar.J(size2);
                eVar.G(size3);
                if (eVar.f19185q0 > 0) {
                    z5 = c8;
                } else {
                    z5 = 0;
                }
                eVar.f19175x0 = z5;
            }
        } else {
            i11 = eVar.f19173v0;
            i12 = eVar.f19174w0;
            i13 = eVar.f19169r0;
            i14 = eVar.f19170s0;
            iArr = new int[2];
            i15 = (size2 - i11) - i12;
            i16 = eVar.U0;
            if (i16 == 1) {
                i15 = (size3 - i13) - i14;
            }
            if (i16 == 0) {
                if (eVar.C0 == -1) {
                    i71 = 0;
                    eVar.C0 = 0;
                } else {
                    i71 = 0;
                }
                if (eVar.D0 == -1) {
                    eVar.D0 = i71;
                }
            } else {
                if (eVar.C0 == -1) {
                    eVar.C0 = 0;
                }
                if (eVar.D0 == -1) {
                    eVar.D0 = 0;
                }
            }
            constraintWidgetArr = eVar.f19184p0;
            i17 = 0;
            i18 = 0;
            while (true) {
                i19 = eVar.f19185q0;
                constraintWidgetArr2 = constraintWidgetArr;
                if (i17 < i19) {
                    break;
                    break;
                }
                if (eVar.f19184p0[i17].f1247f0 == 8) {
                    i18++;
                }
                i17++;
                constraintWidgetArr = constraintWidgetArr2;
            }
            if (i18 > 0) {
                constraintWidgetArr7 = new ConstraintWidget[i19 - i18];
                i69 = 0;
                i70 = 0;
                while (i69 < eVar.f19185q0) {
                    constraintWidget11 = eVar.f19184p0[i69];
                    constraintWidgetArr8 = constraintWidgetArr7;
                    if (constraintWidget11.f1247f0 != 8) {
                        constraintWidgetArr8[i70] = constraintWidget11;
                        i70++;
                    }
                    i69++;
                    constraintWidgetArr7 = constraintWidgetArr8;
                }
                constraintWidgetArr2 = constraintWidgetArr7;
                i19 = i70;
            }
            constraintWidgetArr3 = constraintWidgetArr2;
            eVar.Z0 = constraintWidgetArr3;
            eVar.f19168a1 = i19;
            i20 = eVar.S0;
            if (i20 != 0) {
                if (i20 != 1) {
                    i31 = i19;
                    i32 = i14;
                    iArr3 = iArr;
                    c11 = 1;
                    i33 = eVar.U0;
                    cVar = eVar.K;
                    cVar2 = eVar.J;
                    if (i31 == 0) {
                        arrayList.clear();
                        i34 = i15;
                        i23 = i11;
                        i24 = i12;
                        c8 = 1;
                        i25 = i13;
                        i21 = i32;
                        iArr2 = iArr3;
                        i35 = 3;
                        dVar2 = new d(eVar, i33, eVar.H, eVar.I, eVar.J, eVar.K, i34);
                        arrayList.add(dVar2);
                        if (i33 == 0) {
                            dVar6 = dVar2;
                            i50 = 0;
                            i39 = 0;
                            i51 = 0;
                            while (i50 < i31) {
                                constraintWidget2 = constraintWidgetArr3[i50];
                                iP = eVar.P(constraintWidget2, i34);
                                i52 = i50;
                                if (constraintWidget2.f1262o0[0] == i35) {
                                    i39++;
                                }
                                int i710 = i39;
                                if (i51 != i34) {
                                }
                                if (!z10) {
                                    z10 = true;
                                }
                                if (z10) {
                                    i53 = i52;
                                    constraintWidget3 = constraintWidget2;
                                    d dVar10 = new d(eVar, i33, eVar.H, eVar.I, eVar.J, eVar.K, i34);
                                    dVar10.f19163n = i53;
                                    arrayList.add(dVar10);
                                    dVar6 = dVar10;
                                } else {
                                    constraintWidget3 = constraintWidget2;
                                    i53 = i52;
                                    if (i53 > 0) {
                                        i51 = eVar.O0 + iP + i51;
                                    }
                                    dVar6.a(constraintWidget3);
                                    i50 = i53 + 1;
                                    i39 = i710;
                                    i35 = 3;
                                }
                                i51 = iP;
                                dVar6.a(constraintWidget3);
                                i50 = i53 + 1;
                                i39 = i710;
                                i35 = 3;
                            }
                        } else {
                            dVar3 = dVar2;
                            i36 = 0;
                            i37 = 0;
                            i38 = 0;
                            while (i36 < i31) {
                                constraintWidget = constraintWidgetArr3[i36];
                                iO = eVar.O(constraintWidget, i34);
                                if (constraintWidget.f1262o0[1] == 3) {
                                    i37++;
                                }
                                int i711 = i37;
                                if (i38 != i34) {
                                }
                                if (!z6) {
                                    z6 = true;
                                }
                                if (z6) {
                                    d dVar11 = new d(eVar, i33, eVar.H, eVar.I, eVar.J, eVar.K, i34);
                                    dVar11.f19163n = i36;
                                    arrayList.add(dVar11);
                                    dVar3 = dVar11;
                                } else {
                                    if (i36 > 0) {
                                        i38 = eVar.P0 + iO + i38;
                                    }
                                    dVar3.a(constraintWidget);
                                    i36++;
                                    i37 = i711;
                                }
                                i38 = iO;
                                dVar3.a(constraintWidget);
                                i36++;
                                i37 = i711;
                            }
                            i39 = i37;
                        }
                        size = arrayList.size();
                        c cVar12 = eVar.H;
                        c cVar13 = eVar.I;
                        int i712 = eVar.f19173v0;
                        int i713 = eVar.f19169r0;
                        int i714 = eVar.f19174w0;
                        int i715 = eVar.f19170s0;
                        iArr4 = eVar.f1262o0;
                        i41 = i33;
                        if (iArr4[0] != 2) {
                            z7 = true;
                        } else {
                            z7 = true;
                        }
                        if (i39 > 0) {
                            while (i49 < size) {
                                dVar5 = (d) arrayList.get(i49);
                                if (i41 == 0) {
                                    dVar5.e(i34 - dVar5.d());
                                } else {
                                    dVar5.e(i34 - dVar5.c());
                                }
                            }
                        }
                        cVar3 = cVar13;
                        i42 = i712;
                        i43 = i713;
                        i44 = i714;
                        i45 = i715;
                        cVar4 = cVar12;
                        cVar5 = cVar;
                        cVar6 = cVar2;
                        i46 = 0;
                        iMax = 0;
                        i47 = 0;
                        while (i46 < size) {
                            dVar4 = (d) arrayList.get(i46);
                            if (i41 == 0) {
                                if (i46 < size - 1) {
                                    cVar5 = ((d) arrayList.get(i46 + 1)).f19153b.I;
                                    i45 = 0;
                                } else {
                                    i45 = eVar.f19170s0;
                                    cVar5 = cVar;
                                }
                                c cVar14 = dVar4.f19153b.K;
                                i48 = i41;
                                dVar4.f(i48, cVar4, cVar3, cVar6, cVar5, i42, i43, i44, i45, i34);
                                iMax = Math.max(iMax, dVar4.d());
                                iC = dVar4.c() + i47;
                                if (i46 > 0) {
                                    iC += eVar.P0;
                                }
                                i47 = iC;
                                cVar3 = cVar14;
                                i43 = 0;
                            } else {
                                i48 = i41;
                                if (i46 < size - 1) {
                                    cVar6 = ((d) arrayList.get(i46 + 1)).f19153b.H;
                                    i44 = 0;
                                } else {
                                    i44 = eVar.f19174w0;
                                    cVar6 = cVar2;
                                }
                                c cVar15 = dVar4.f19153b.J;
                                dVar4.f(i48, cVar4, cVar3, cVar6, cVar5, i42, i43, i44, i45, i34);
                                iD = dVar4.d() + iMax;
                                int iMax3 = Math.max(i47, dVar4.c());
                                if (i46 > 0) {
                                    iD += eVar.O0;
                                }
                                i47 = iMax3;
                                iMax = iD;
                                cVar4 = cVar15;
                                i42 = 0;
                            }
                            i46++;
                            i41 = i48;
                        }
                        iArr2[0] = iMax;
                        iArr2[1] = i47;
                    }
                    c10 = 0;
                } else if (i20 != 2) {
                    i21 = i14;
                    iArr2 = iArr;
                    i23 = i11;
                    i24 = i12;
                    i25 = i13;
                    c10 = 0;
                    c8 = 1;
                } else {
                    i55 = eVar.U0;
                    if (i55 == 0) {
                        i66 = eVar.T0;
                        if (i66 <= 0) {
                            i67 = 0;
                            i68 = 0;
                            iCeil2 = 0;
                            while (true) {
                                i32 = i14;
                                if (i67 >= i19) {
                                    break;
                                    break;
                                }
                                if (i67 > 0) {
                                    i68 += eVar.O0;
                                }
                                constraintWidget10 = constraintWidgetArr3[i67];
                                if (constraintWidget10 != null) {
                                    iP3 = eVar.P(constraintWidget10, i15) + i68;
                                    if (iP3 > i15) {
                                        break;
                                        break;
                                    } else {
                                        iCeil2++;
                                        i68 = iP3;
                                    }
                                }
                                i67++;
                                i14 = i32;
                            }
                        } else {
                            i32 = i14;
                            iCeil2 = i66;
                        }
                        iCeil = 0;
                    } else {
                        i32 = i14;
                        i56 = eVar.T0;
                        if (i56 <= 0) {
                            i57 = 0;
                            i58 = 0;
                            iCeil = 0;
                            while (i57 < i19) {
                                int i83 = i57;
                                if (i57 > 0) {
                                    i58 += eVar.P0;
                                }
                                constraintWidget4 = constraintWidgetArr3[i83];
                                if (constraintWidget4 != null) {
                                    iO2 = eVar.O(constraintWidget4, i15) + i58;
                                    if (iO2 > i15) {
                                        break;
                                        break;
                                    } else {
                                        iCeil++;
                                        i58 = iO2;
                                    }
                                }
                                i57 = i83 + 1;
                            }
                        } else {
                            iCeil = i56;
                        }
                        iCeil2 = 0;
                    }
                    if (eVar.Y0 == null) {
                        eVar.Y0 = new int[2];
                    }
                    if (iCeil != 0) {
                    }
                    while (!z11) {
                        if (i55 == 0) {
                            iCeil = (int) Math.ceil(i19 / iCeil2);
                            iCeil2 = iCeil2;
                        } else {
                            iCeil2 = (int) Math.ceil(i19 / iCeil);
                        }
                        constraintWidgetArr4 = eVar.X0;
                        int i84 = i19;
                        if (constraintWidgetArr4 != null) {
                            eVar.X0 = new ConstraintWidget[iCeil2];
                        } else {
                            eVar.X0 = new ConstraintWidget[iCeil2];
                        }
                        constraintWidgetArr5 = eVar.W0;
                        if (constraintWidgetArr5 != null) {
                            eVar.W0 = new ConstraintWidget[iCeil];
                        } else {
                            eVar.W0 = new ConstraintWidget[iCeil];
                        }
                        i59 = 0;
                        while (i59 < iCeil2) {
                            i62 = 0;
                            while (i62 < iCeil) {
                                i63 = (i62 * iCeil2) + i59;
                                i64 = i59;
                                if (i55 == 1) {
                                    i63 = (i64 * iCeil) + i62;
                                }
                                int[] iArr8 = iArr;
                                i65 = i63;
                                if (i65 >= constraintWidgetArr3.length) {
                                    constraintWidgetArr6 = constraintWidgetArr3;
                                } else {
                                    int iP5 = eVar.P(constraintWidget7, i15);
                                    constraintWidgetArr6 = constraintWidgetArr3;
                                    constraintWidget8 = eVar.X0[i64];
                                    if (constraintWidget8 != null) {
                                        eVar.X0[i64] = constraintWidget7;
                                    } else {
                                        eVar.X0[i64] = constraintWidget7;
                                    }
                                    int iO5 = eVar.O(constraintWidget7, i15);
                                    constraintWidget9 = eVar.W0[i62];
                                    if (constraintWidget9 != null) {
                                        eVar.W0[i62] = constraintWidget7;
                                    } else {
                                        eVar.W0[i62] = constraintWidget7;
                                    }
                                }
                                i62++;
                                i59 = i64;
                                iArr = iArr8;
                                constraintWidgetArr3 = constraintWidgetArr6;
                            }
                            i59++;
                        }
                        ConstraintWidget[] constraintWidgetArr10 = constraintWidgetArr3;
                        int[] iArr9 = iArr;
                        iP2 = 0;
                        while (i60 < iCeil2) {
                            constraintWidget6 = eVar.X0[i60];
                            if (constraintWidget6 == null) {
                                if (i60 > 0) {
                                    iP2 += eVar.O0;
                                }
                                iP2 = eVar.P(constraintWidget6, i15) + iP2;
                            }
                        }
                        i61 = 0;
                        iO3 = 0;
                        while (i61 < iCeil) {
                            constraintWidget5 = eVar.W0[i61];
                            int i85 = i61;
                            if (constraintWidget5 == null) {
                                if (i61 > 0) {
                                    iO3 += eVar.P0;
                                }
                                iO3 = eVar.O(constraintWidget5, i15) + iO3;
                            }
                            i61 = i85 + 1;
                        }
                        iArr9[0] = iP2;
                        iArr9[1] = iO3;
                        if (i55 == 0) {
                            if (iP2 > i15) {
                            }
                            z11 = true;
                        } else {
                            if (iO3 > i15) {
                            }
                            z11 = true;
                        }
                        i19 = i84;
                        iArr = iArr9;
                        constraintWidgetArr3 = constraintWidgetArr10;
                    }
                    iArr3 = iArr;
                    c11 = 1;
                    int[] iArr10 = eVar.Y0;
                    iArr10[0] = iCeil2;
                    iArr10[1] = iCeil;
                }
                c8 = c11;
                i23 = i11;
                i24 = i12;
                i25 = i13;
                i21 = i32;
                iArr2 = iArr3;
                c10 = 0;
            } else {
                i21 = i14;
                i22 = i15;
                iArr2 = iArr;
                i23 = i11;
                i24 = i12;
                i25 = i13;
                c8 = 1;
                i26 = i19;
                i27 = eVar.U0;
                if (i26 == 0) {
                    c10 = 0;
                } else {
                    if (arrayList.size() == 0) {
                        dVar = new d(eVar, i27, eVar.H, eVar.I, eVar.J, eVar.K, i22);
                        arrayList.add(dVar);
                    } else {
                        d dVar12 = (d) arrayList.get(0);
                        dVar12.f19154c = 0;
                        dVar12.f19153b = null;
                        dVar12.f19161l = 0;
                        dVar12.f19162m = 0;
                        dVar12.f19163n = 0;
                        dVar12.f19164o = 0;
                        dVar12.f19165p = 0;
                        dVar12.f(i27, eVar.H, eVar.I, eVar.J, eVar.K, eVar.f19173v0, eVar.f19169r0, eVar.f19174w0, eVar.f19170s0, i22);
                        dVar = dVar12;
                    }
                    while (i28 < i26) {
                        dVar.a(constraintWidgetArr3[i28]);
                    }
                    c10 = 0;
                    iArr2[0] = dVar.d();
                    iArr2[1] = dVar.c();
                }
            }
            i29 = iArr2[c10] + i23 + i24;
            i30 = iArr2[c8] + i25 + i21;
            if (mode != 1073741824) {
                if (mode == Integer.MIN_VALUE) {
                    size2 = Math.min(i29, size2);
                } else if (mode == 0) {
                    size2 = i29;
                } else {
                    size2 = 0;
                }
            }
            if (mode2 != 1073741824) {
                if (mode2 == Integer.MIN_VALUE) {
                    size3 = Math.min(i30, size3);
                } else if (mode2 == 0) {
                    size3 = i30;
                } else {
                    size3 = 0;
                }
            }
            eVar.f19176y0 = size2;
            eVar.f19177z0 = size3;
            eVar.J(size2);
            eVar.G(size3);
            if (eVar.f19185q0 > 0) {
                z5 = c8;
            } else {
                z5 = 0;
            }
            eVar.f19175x0 = z5;
        }
        setMeasuredDimension(eVar.f19176y0, eVar.f19177z0);
    }

    @Override // androidx.constraintlayout.widget.b, android.view.View
    public final void onMeasure(int i7, int i10) {
        l(this.G, i7, i10);
    }

    public void setFirstHorizontalBias(float f2) {
        this.G.K0 = f2;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i7) {
        this.G.E0 = i7;
        requestLayout();
    }

    public void setFirstVerticalBias(float f2) {
        this.G.L0 = f2;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i7) {
        this.G.F0 = i7;
        requestLayout();
    }

    public void setHorizontalAlign(int i7) {
        this.G.Q0 = i7;
        requestLayout();
    }

    public void setHorizontalBias(float f2) {
        this.G.I0 = f2;
        requestLayout();
    }

    public void setHorizontalGap(int i7) {
        this.G.O0 = i7;
        requestLayout();
    }

    public void setHorizontalStyle(int i7) {
        this.G.C0 = i7;
        requestLayout();
    }

    public void setMaxElementsWrap(int i7) {
        this.G.T0 = i7;
        requestLayout();
    }

    public void setOrientation(int i7) {
        this.G.U0 = i7;
        requestLayout();
    }

    public void setPadding(int i7) {
        e eVar = this.G;
        eVar.f19169r0 = i7;
        eVar.f19170s0 = i7;
        eVar.f19171t0 = i7;
        eVar.f19172u0 = i7;
        requestLayout();
    }

    public void setPaddingBottom(int i7) {
        this.G.f19170s0 = i7;
        requestLayout();
    }

    public void setPaddingLeft(int i7) {
        this.G.f19173v0 = i7;
        requestLayout();
    }

    public void setPaddingRight(int i7) {
        this.G.f19174w0 = i7;
        requestLayout();
    }

    public void setPaddingTop(int i7) {
        this.G.f19169r0 = i7;
        requestLayout();
    }

    public void setVerticalAlign(int i7) {
        this.G.R0 = i7;
        requestLayout();
    }

    public void setVerticalBias(float f2) {
        this.G.J0 = f2;
        requestLayout();
    }

    public void setVerticalGap(int i7) {
        this.G.P0 = i7;
        requestLayout();
    }

    public void setVerticalStyle(int i7) {
        this.G.D0 = i7;
        requestLayout();
    }

    public void setWrapMode(int i7) {
        this.G.S0 = i7;
        requestLayout();
    }
}

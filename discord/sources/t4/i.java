package t4;

import a5.l;
import android.content.res.AssetManager;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Typeface;
import androidx.recyclerview.widget.h0;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.facebook.react.views.text.ReactFontManager;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import je.u;
import kotlin.jvm.internal.Intrinsics;
import l4.v;
import l4.z;
import o4.p;
import o4.r;
import s.k;
import s4.m;

/* JADX INFO: loaded from: classes.dex */
public final class i extends b {
    public final StringBuilder D;
    public final RectF E;
    public final Matrix F;
    public final m4.a G;
    public final m4.a H;
    public final HashMap I;
    public final k J;
    public final ArrayList K;
    public final o4.f L;
    public final v M;
    public final l4.i N;
    public final int O;
    public final o4.f P;
    public r Q;
    public final o4.f R;
    public r S;
    public final o4.i T;
    public r U;
    public final o4.i V;
    public r W;
    public final o4.f X;
    public r Y;
    public r Z;
    public final o4.f a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final o4.f f20642b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final o4.f f20643c0;

    public i(v vVar, e eVar) {
        u uVar;
        u uVar2;
        r4.a aVar;
        u uVar3;
        r4.a aVar2;
        u uVar4;
        r4.a aVar3;
        o9.c cVar;
        r4.a aVar4;
        o9.c cVar2;
        r4.b bVar;
        o9.c cVar3;
        r4.b bVar2;
        o9.c cVar4;
        r4.a aVar5;
        o9.c cVar5;
        r4.a aVar6;
        super(vVar, eVar);
        this.D = new StringBuilder(2);
        this.E = new RectF();
        this.F = new Matrix();
        m4.a aVar7 = new m4.a(1, 1);
        aVar7.setStyle(Paint.Style.FILL);
        this.G = aVar7;
        m4.a aVar8 = new m4.a(1, 2);
        aVar8.setStyle(Paint.Style.STROKE);
        this.H = aVar8;
        this.I = new HashMap();
        this.J = new k();
        this.K = new ArrayList();
        this.O = 2;
        this.M = vVar;
        this.N = eVar.f20618b;
        o4.f fVar = new o4.f(2, (List) eVar.f20631q.f9357e);
        this.L = fVar;
        fVar.a(this);
        e(fVar);
        e4.r rVar = eVar.f20632r;
        if (rVar != null && (cVar5 = (o9.c) rVar.f8034e) != null && (aVar6 = (r4.a) cVar5.f17179d) != null) {
            o4.e eVarL0 = aVar6.l0();
            this.P = (o4.f) eVarL0;
            eVarL0.a(this);
            e(eVarL0);
        }
        if (rVar != null && (cVar4 = (o9.c) rVar.f8034e) != null && (aVar5 = (r4.a) cVar4.f17180e) != null) {
            o4.e eVarL1 = aVar5.l0();
            this.R = (o4.f) eVarL1;
            eVarL1.a(this);
            e(eVarL1);
        }
        if (rVar != null && (cVar3 = (o9.c) rVar.f8034e) != null && (bVar2 = (r4.b) cVar3.f17181i) != null) {
            o4.i iVarL0 = bVar2.l0();
            this.T = iVarL0;
            iVarL0.a(this);
            e(iVarL0);
        }
        if (rVar != null && (cVar2 = (o9.c) rVar.f8034e) != null && (bVar = (r4.b) cVar2.f17182v) != null) {
            o4.i iVarL1 = bVar.l0();
            this.V = iVarL1;
            iVarL1.a(this);
            e(iVarL1);
        }
        if (rVar != null && (cVar = (o9.c) rVar.f8034e) != null && (aVar4 = (r4.a) cVar.f17183w) != null) {
            o4.e eVarL2 = aVar4.l0();
            this.X = (o4.f) eVarL2;
            eVarL2.a(this);
            e(eVarL2);
        }
        if (rVar != null && (uVar4 = (u) rVar.f8035i) != null && (aVar3 = (r4.a) uVar4.f13849b) != null) {
            o4.e eVarL3 = aVar3.l0();
            this.a0 = (o4.f) eVarL3;
            eVarL3.a(this);
            e(eVarL3);
        }
        if (rVar != null && (uVar3 = (u) rVar.f8035i) != null && (aVar2 = (r4.a) uVar3.f13850c) != null) {
            o4.e eVarL4 = aVar2.l0();
            this.f20642b0 = (o4.f) eVarL4;
            eVarL4.a(this);
            e(eVarL4);
        }
        if (rVar != null && (uVar2 = (u) rVar.f8035i) != null && (aVar = (r4.a) uVar2.f13851d) != null) {
            o4.e eVarL5 = aVar.l0();
            this.f20643c0 = (o4.f) eVarL5;
            eVarL5.a(this);
            e(eVarL5);
        }
        if (rVar == null || (uVar = (u) rVar.f8035i) == null) {
            return;
        }
        this.O = uVar.f13848a;
    }

    public static void u(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
    }

    public static void v(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    @Override // t4.b, n4.e
    public final void d(RectF rectF, Matrix matrix, boolean z5) {
        super.d(rectF, matrix, z5);
        l4.i iVar = this.N;
        rectF.set(0.0f, 0.0f, iVar.k.width(), iVar.k.height());
    }

    @Override // t4.b, q4.f
    public final void h(e4.c cVar, Object obj) {
        super.h(cVar, obj);
        PointF pointF = z.f14943a;
        if (obj == 1) {
            r rVar = this.Q;
            if (rVar != null) {
                p(rVar);
            }
            r rVar2 = new r(cVar, null);
            this.Q = rVar2;
            rVar2.a(this);
            e(this.Q);
            return;
        }
        if (obj == 2) {
            r rVar3 = this.S;
            if (rVar3 != null) {
                p(rVar3);
            }
            r rVar4 = new r(cVar, null);
            this.S = rVar4;
            rVar4.a(this);
            e(this.S);
            return;
        }
        if (obj == z.f14954n) {
            r rVar5 = this.U;
            if (rVar5 != null) {
                p(rVar5);
            }
            r rVar6 = new r(cVar, null);
            this.U = rVar6;
            rVar6.a(this);
            e(this.U);
            return;
        }
        if (obj == z.f14955o) {
            r rVar7 = this.W;
            if (rVar7 != null) {
                p(rVar7);
            }
            r rVar8 = new r(cVar, null);
            this.W = rVar8;
            rVar8.a(this);
            e(this.W);
            return;
        }
        if (obj == z.A) {
            r rVar9 = this.Y;
            if (rVar9 != null) {
                p(rVar9);
            }
            r rVar10 = new r(cVar, null);
            this.Y = rVar10;
            rVar10.a(this);
            e(this.Y);
            return;
        }
        if (obj != z.H) {
            if (obj == z.J) {
                o4.f fVar = this.L;
                fVar.getClass();
                fVar.j(new p(new kh.v(), cVar, new q4.b()));
                return;
            }
            return;
        }
        r rVar11 = this.Z;
        if (rVar11 != null) {
            p(rVar11);
        }
        r rVar12 = new r(cVar, null);
        this.Z = rVar12;
        rVar12.a(this);
        e(this.Z);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:101:0x0360  */
    /* JADX WARN: Code duplicated, block: B:102:0x0363  */
    /* JADX WARN: Code duplicated, block: B:105:0x036a  */
    /* JADX WARN: Code duplicated, block: B:106:0x036d  */
    /* JADX WARN: Code duplicated, block: B:109:0x0376  */
    /* JADX WARN: Code duplicated, block: B:112:0x037f  */
    /* JADX WARN: Code duplicated, block: B:113:0x0382  */
    /* JADX WARN: Code duplicated, block: B:115:0x038a  */
    /* JADX WARN: Code duplicated, block: B:116:0x038c  */
    /* JADX WARN: Code duplicated, block: B:119:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:120:0x03d1  */
    /* JADX WARN: Code duplicated, block: B:121:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:124:0x03e2  */
    /* JADX WARN: Code duplicated, block: B:125:0x03e4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:126:0x03e6  */
    /* JADX WARN: Code duplicated, block: B:132:0x0417 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:133:0x0419  */
    /* JADX WARN: Code duplicated, block: B:134:0x041c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:135:0x041e  */
    /* JADX WARN: Code duplicated, block: B:136:0x0421  */
    /* JADX WARN: Code duplicated, block: B:140:0x0429  */
    /* JADX WARN: Code duplicated, block: B:142:0x0432  */
    /* JADX WARN: Code duplicated, block: B:170:0x04f1  */
    /* JADX WARN: Code duplicated, block: B:172:0x04fc  */
    /* JADX WARN: Code duplicated, block: B:173:0x04fe  */
    /* JADX WARN: Code duplicated, block: B:177:0x0515  */
    /* JADX WARN: Code duplicated, block: B:179:0x052a  */
    /* JADX WARN: Code duplicated, block: B:182:0x0537  */
    /* JADX WARN: Code duplicated, block: B:185:0x054f  */
    /* JADX WARN: Code duplicated, block: B:201:0x059d  */
    /* JADX WARN: Code duplicated, block: B:202:0x05a8  */
    /* JADX WARN: Code duplicated, block: B:204:0x05b6 A[LOOP:9: B:203:0x05b4->B:204:0x05b6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:208:0x05d9  */
    /* JADX WARN: Code duplicated, block: B:209:0x05e0  */
    /* JADX WARN: Code duplicated, block: B:212:0x060c  */
    /* JADX WARN: Code duplicated, block: B:233:0x0592 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:26:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:27:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:31:0x0105  */
    /* JADX WARN: Code duplicated, block: B:33:0x011c  */
    /* JADX WARN: Code duplicated, block: B:36:0x0128  */
    /* JADX WARN: Code duplicated, block: B:38:0x013c  */
    /* JADX WARN: Code duplicated, block: B:39:0x014c  */
    /* JADX WARN: Code duplicated, block: B:41:0x0157  */
    /* JADX WARN: Code duplicated, block: B:42:0x0168  */
    /* JADX WARN: Code duplicated, block: B:44:0x017f A[LOOP:4: B:43:0x017d->B:44:0x017f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:49:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:51:0x01de  */
    /* JADX WARN: Code duplicated, block: B:52:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:57:0x0232  */
    /* JADX WARN: Code duplicated, block: B:78:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:80:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:82:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:83:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:85:0x030c  */
    /* JADX WARN: Code duplicated, block: B:86:0x031b  */
    /* JADX WARN: Code duplicated, block: B:88:0x0323  */
    /* JADX WARN: Code duplicated, block: B:91:0x0340  */
    /* JADX WARN: Code duplicated, block: B:94:0x0349  */
    /* JADX WARN: Code duplicated, block: B:95:0x034c  */
    /* JADX WARN: Code duplicated, block: B:98:0x0355  */
    /* JADX WARN: Code duplicated, block: B:99:0x0358  */
    /* JADX WARN: Instruction removed from duplicated block: B:126:0x03e6, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // t4.b
    public final void k(Canvas canvas, Matrix matrix, int i7) {
        af.c cVarI;
        m4.a aVar;
        String str;
        m4.a aVar2;
        v vVar;
        String str2;
        int i10;
        Typeface typeface;
        l lVar;
        HashMap map;
        Typeface typeface2;
        HashMap map2;
        Typeface typeface3;
        l4.b bVar;
        Typeface typefaceCreateFromAsset;
        Typeface typeface4;
        int i11;
        ReactFontManager.Companion companion;
        Typeface typeface5;
        boolean zContains;
        boolean zContains2;
        int i12;
        Typeface typeface6;
        float fFloatValue;
        float fC;
        List listAsList;
        int size;
        int i13;
        int length;
        PointF pointF;
        float f2;
        m4.a aVar3;
        float f7;
        i iVar;
        List listZ;
        int i14;
        h hVar;
        String str3;
        int length2;
        int iCodePointAt;
        int i15;
        int iCharCount;
        float f10;
        long j;
        k kVar;
        StringBuilder sb2;
        int iCharCount2;
        String string;
        int iCodePointAt2;
        Canvas canvas2;
        float fFloatValue2;
        float f11;
        int i16;
        int i17;
        PointF pointF2;
        float f12;
        float f13;
        List listZ2;
        int i18;
        h hVar2;
        int i19;
        String str4;
        int i20;
        q4.d dVar;
        HashMap map3;
        ArrayList arrayList;
        int size2;
        ArrayList arrayList2;
        int i21;
        List list;
        int i22;
        m4.a aVar4;
        m4.a aVar5;
        Path pathG;
        m4.a aVar6;
        m4.a aVar7;
        q4.b bVar2 = (q4.b) this.L.e();
        l4.i iVar2 = this.N;
        q4.c cVar = (q4.c) iVar2.f14868f.get(bVar2.f18602b);
        if (cVar == null) {
            return;
        }
        String fontName = cVar.f18613b;
        String fontStyle = cVar.f18614c;
        String fontFamily = cVar.f18612a;
        canvas.save();
        canvas.concat(matrix);
        t(bVar2, i7, 0);
        v vVar2 = this.M;
        Map map4 = vVar2.G;
        String str5 = ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE;
        String str6 = "\u0003";
        int i23 = 0;
        o4.i iVar3 = this.V;
        m4.a aVar8 = this.G;
        m4.a aVar9 = this.H;
        if (map4 == null && vVar2.J == null && vVar2.f14917d.f14870h.g() > 0) {
            r rVar = this.Y;
            float fFloatValue3 = rVar != null ? ((Float) rVar.e()).floatValue() : bVar2.f18603c;
            float[] fArr = (float[]) x4.h.f22639d.get();
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            float f14 = x4.h.f22640e;
            fArr[2] = f14;
            fArr[3] = f14;
            matrix.mapPoints(fArr);
            v vVar3 = vVar2;
            float f15 = fFloatValue3 / 100.0f;
            Math.hypot(fArr[2] - fArr[0], fArr[3] - fArr[1]);
            List listAsList2 = Arrays.asList(bVar2.f18601a.replaceAll("\r\n", "\r").replaceAll("\u0003", "\r").replaceAll(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE, "\r").split("\r"));
            int size3 = listAsList2.size();
            float f16 = bVar2.f18605e / 10.0f;
            r rVar2 = this.W;
            if (rVar2 != null) {
                fFloatValue2 = ((Float) rVar2.e()).floatValue();
            } else {
                if (iVar3 != null) {
                    fFloatValue2 = ((Float) iVar3.e()).floatValue();
                }
                f11 = f16;
                i16 = 0;
                i17 = -1;
                while (i16 < size3) {
                    String str7 = (String) listAsList2.get(i16);
                    pointF2 = bVar2.f18611m;
                    if (pointF2 == null) {
                        f12 = 0.0f;
                    } else {
                        f12 = pointF2.x;
                    }
                    f13 = f15;
                    listZ2 = z(str7, f12, cVar, f13, f11, true);
                    i18 = i23;
                    while (i18 < listZ2.size()) {
                        hVar2 = (h) listZ2.get(i18);
                        List list2 = listZ2;
                        i19 = i17 + 1;
                        canvas.save();
                        int i24 = i18;
                        if (y(canvas, bVar2, i19, hVar2.f20641b)) {
                            str4 = hVar2.f20640a;
                            i20 = i23;
                            while (i20 < str4.length()) {
                                String str8 = str4;
                                dVar = (q4.d) iVar2.f14870h.c(q4.d.a(str4.charAt(i20), fontFamily, fontStyle));
                                if (dVar == null) {
                                    f11 = f11;
                                    i20 = i20;
                                    listAsList2 = listAsList2;
                                    size3 = size3;
                                    aVar4 = aVar8;
                                    aVar5 = aVar9;
                                    vVar3 = vVar3;
                                } else {
                                    t(bVar2, i7, i20);
                                    map3 = this.I;
                                    if (map3.containsKey(dVar)) {
                                        list = (List) map3.get(dVar);
                                    } else {
                                        arrayList = dVar.f18616a;
                                        size2 = arrayList.size();
                                        arrayList2 = new ArrayList(size2);
                                        i21 = i23;
                                        while (i21 < size2) {
                                            arrayList2.add(new n4.d(vVar3, this, (m) arrayList.get(i21), iVar2));
                                            size2 = size2;
                                            i21++;
                                            arrayList = arrayList;
                                        }
                                        map3.put(dVar, arrayList2);
                                        list = arrayList2;
                                    }
                                    i22 = i23;
                                    while (i22 < list.size()) {
                                        pathG = ((n4.d) list.get(i22)).g();
                                        List list3 = list;
                                        pathG.computeBounds(this.E, i23);
                                        Matrix matrix2 = this.F;
                                        matrix2.reset();
                                        int i25 = i22;
                                        matrix2.preTranslate(0.0f, (-bVar2.f18607g) * x4.h.c());
                                        matrix2.preScale(f13, f13);
                                        pathG.transform(matrix2);
                                        if (bVar2.k) {
                                            aVar6 = aVar8;
                                            v(pathG, aVar6, canvas);
                                            aVar7 = aVar9;
                                            v(pathG, aVar7, canvas);
                                        } else {
                                            aVar6 = aVar8;
                                            aVar7 = aVar9;
                                            v(pathG, aVar7, canvas);
                                            v(pathG, aVar6, canvas);
                                        }
                                        i22 = i25 + 1;
                                        aVar9 = aVar7;
                                        aVar8 = aVar6;
                                        list = list3;
                                        i23 = 0;
                                    }
                                    aVar4 = aVar8;
                                    aVar5 = aVar9;
                                    canvas.translate((x4.h.c() * ((float) dVar.f18618c) * f13) + f11, 0.0f);
                                }
                                i20++;
                                aVar9 = aVar5;
                                aVar8 = aVar4;
                                vVar3 = vVar3;
                                str4 = str8;
                                f11 = f11;
                                listAsList2 = listAsList2;
                                size3 = size3;
                                i23 = 0;
                            }
                        }
                        float f17 = f11;
                        List list4 = listAsList2;
                        int i26 = size3;
                        m4.a aVar10 = aVar8;
                        m4.a aVar11 = aVar9;
                        v vVar4 = vVar3;
                        canvas.restore();
                        aVar9 = aVar11;
                        aVar8 = aVar10;
                        vVar3 = vVar4;
                        i17 = i19;
                        f11 = f17;
                        listAsList2 = list4;
                        size3 = i26;
                        i23 = 0;
                        i18 = i24 + 1;
                        listZ2 = list2;
                    }
                    i16++;
                    listAsList2 = listAsList2;
                    size3 = size3;
                    i23 = 0;
                    f15 = f13;
                }
                canvas2 = canvas;
            }
            f16 += fFloatValue2;
            f11 = f16;
            i16 = 0;
            i17 = -1;
            while (i16 < size3) {
                String str9 = (String) listAsList2.get(i16);
                pointF2 = bVar2.f18611m;
                if (pointF2 == null) {
                    f12 = 0.0f;
                } else {
                    f12 = pointF2.x;
                }
                f13 = f15;
                listZ2 = z(str9, f12, cVar, f13, f11, true);
                i18 = i23;
                while (i18 < listZ2.size()) {
                    hVar2 = (h) listZ2.get(i18);
                    List list5 = listZ2;
                    i19 = i17 + 1;
                    canvas.save();
                    int i27 = i18;
                    if (y(canvas, bVar2, i19, hVar2.f20641b)) {
                        str4 = hVar2.f20640a;
                        i20 = i23;
                        while (i20 < str4.length()) {
                            String str10 = str4;
                            dVar = (q4.d) iVar2.f14870h.c(q4.d.a(str4.charAt(i20), fontFamily, fontStyle));
                            if (dVar == null) {
                                f11 = f11;
                                i20 = i20;
                                listAsList2 = listAsList2;
                                size3 = size3;
                                aVar4 = aVar8;
                                aVar5 = aVar9;
                                vVar3 = vVar3;
                            } else {
                                t(bVar2, i7, i20);
                                map3 = this.I;
                                if (map3.containsKey(dVar)) {
                                    list = (List) map3.get(dVar);
                                } else {
                                    arrayList = dVar.f18616a;
                                    size2 = arrayList.size();
                                    arrayList2 = new ArrayList(size2);
                                    i21 = i23;
                                    while (i21 < size2) {
                                        arrayList2.add(new n4.d(vVar3, this, (m) arrayList.get(i21), iVar2));
                                        size2 = size2;
                                        i21++;
                                        arrayList = arrayList;
                                    }
                                    map3.put(dVar, arrayList2);
                                    list = arrayList2;
                                }
                                i22 = i23;
                                while (i22 < list.size()) {
                                    pathG = ((n4.d) list.get(i22)).g();
                                    List list6 = list;
                                    pathG.computeBounds(this.E, i23);
                                    Matrix matrix3 = this.F;
                                    matrix3.reset();
                                    int i28 = i22;
                                    matrix3.preTranslate(0.0f, (-bVar2.f18607g) * x4.h.c());
                                    matrix3.preScale(f13, f13);
                                    pathG.transform(matrix3);
                                    if (bVar2.k) {
                                        aVar6 = aVar8;
                                        v(pathG, aVar6, canvas);
                                        aVar7 = aVar9;
                                        v(pathG, aVar7, canvas);
                                    } else {
                                        aVar6 = aVar8;
                                        aVar7 = aVar9;
                                        v(pathG, aVar7, canvas);
                                        v(pathG, aVar6, canvas);
                                    }
                                    i22 = i28 + 1;
                                    aVar9 = aVar7;
                                    aVar8 = aVar6;
                                    list = list6;
                                    i23 = 0;
                                }
                                aVar4 = aVar8;
                                aVar5 = aVar9;
                                canvas.translate((x4.h.c() * ((float) dVar.f18618c) * f13) + f11, 0.0f);
                            }
                            i20++;
                            aVar9 = aVar5;
                            aVar8 = aVar4;
                            vVar3 = vVar3;
                            str4 = str10;
                            f11 = f11;
                            listAsList2 = listAsList2;
                            size3 = size3;
                            i23 = 0;
                        }
                    }
                    float f18 = f11;
                    List list7 = listAsList2;
                    int i29 = size3;
                    m4.a aVar12 = aVar8;
                    m4.a aVar13 = aVar9;
                    v vVar5 = vVar3;
                    canvas.restore();
                    aVar9 = aVar13;
                    aVar8 = aVar12;
                    vVar3 = vVar5;
                    i17 = i19;
                    f11 = f18;
                    listAsList2 = list7;
                    size3 = i29;
                    i23 = 0;
                    i18 = i27 + 1;
                    listZ2 = list5;
                }
                i16++;
                listAsList2 = listAsList2;
                size3 = size3;
                i23 = 0;
                f15 = f13;
            }
            canvas2 = canvas;
        } else {
            r rVar3 = this.Z;
            if (rVar3 == null || (typeface = (Typeface) rVar3.e()) == null) {
                Map map5 = vVar2.G;
                if (map5 == null) {
                    cVarI = vVar2.i();
                    if (cVarI != null) {
                        lVar = (l) cVarI.f393d;
                        lVar.f227b = fontFamily;
                        lVar.f228c = fontStyle;
                        map = (HashMap) cVarI.f394e;
                        typeface2 = (Typeface) map.get(lVar);
                        if (typeface2 != null) {
                            aVar = aVar9;
                            str = "\r";
                            aVar2 = aVar8;
                            vVar = vVar2;
                            str2 = "\r\n";
                            typeface = typeface2;
                            i10 = -1;
                        } else {
                            map2 = (HashMap) cVarI.f396v;
                            typeface3 = (Typeface) map2.get(fontFamily);
                            if (typeface3 != null) {
                                aVar = aVar9;
                                aVar2 = aVar8;
                                vVar = vVar2;
                                str2 = "\r\n";
                                typefaceCreateFromAsset = typeface3;
                                i10 = -1;
                                str = "\r";
                            } else {
                                str = "\r";
                                bVar = (l4.b) cVarI.f398x;
                                if (bVar != null) {
                                    k4.h hVar3 = (k4.h) bVar;
                                    str2 = "\r\n";
                                    Intrinsics.checkNotNullParameter(fontFamily, "fontFamily");
                                    aVar = aVar9;
                                    Intrinsics.checkNotNullParameter(fontStyle, "fontStyle");
                                    Intrinsics.checkNotNullParameter(fontName, "fontName");
                                    switch (fontStyle) {
                                        case "Medium":
                                            i11 = 500;
                                            break;
                                        case "Normal":
                                        case "Regular":
                                            i11 = com.facebook.react.common.assets.ReactFontManager.TypefaceStyle.NORMAL;
                                            break;
                                        case "Bold":
                                            i11 = com.facebook.react.common.assets.ReactFontManager.TypefaceStyle.BOLD;
                                            break;
                                        case "Thin":
                                            i11 = 100;
                                            break;
                                        case "Black":
                                            i11 = 900;
                                            break;
                                        case "Light":
                                            i11 = h0.DEFAULT_DRAG_ANIMATION_DURATION;
                                            break;
                                        default:
                                            i11 = -1;
                                            break;
                                    }
                                    companion = ReactFontManager.INSTANCE;
                                    aVar2 = aVar8;
                                    ReactFontManager companion2 = companion.getInstance();
                                    AssetManager assets = hVar3.f14288a.getContext().getAssets();
                                    Intrinsics.checkNotNullExpressionValue(assets, "getAssets(...)");
                                    vVar = vVar2;
                                    typeface5 = companion2.getTypeface(fontName, -1, i11, assets);
                                    if (typeface5 == null) {
                                        k4.h hVar4 = (k4.h) ((l4.b) cVarI.f398x);
                                        hVar4.getClass();
                                        Intrinsics.checkNotNullParameter(fontFamily, "fontFamily");
                                        ReactFontManager companion3 = companion.getInstance();
                                        AssetManager assets2 = hVar4.f14288a.getContext().getAssets();
                                        Intrinsics.checkNotNullExpressionValue(assets2, "getAssets(...)");
                                        i10 = -1;
                                        typefaceCreateFromAsset = companion3.getTypeface(fontFamily, -1, -1, assets2);
                                    } else {
                                        i10 = -1;
                                        typefaceCreateFromAsset = typeface5;
                                    }
                                } else {
                                    aVar = aVar9;
                                    aVar2 = aVar8;
                                    vVar = vVar2;
                                    str2 = "\r\n";
                                    i10 = -1;
                                    typefaceCreateFromAsset = null;
                                }
                                typeface4 = cVar.f18615d;
                                if (typeface4 != null) {
                                    typefaceCreateFromAsset = typeface4;
                                } else {
                                    if (typefaceCreateFromAsset == null) {
                                        typefaceCreateFromAsset = Typeface.createFromAsset((AssetManager) cVarI.f397w, "fonts/" + fontFamily + ((String) cVarI.f395i));
                                    }
                                    map2.put(fontFamily, typefaceCreateFromAsset);
                                }
                            }
                            zContains = fontStyle.contains("Italic");
                            zContains2 = fontStyle.contains("Bold");
                            if (!zContains && zContains2) {
                                i12 = 3;
                            } else if (zContains) {
                                i12 = 2;
                            } else if (zContains2) {
                                i12 = 1;
                            } else {
                                i12 = 0;
                            }
                            if (typefaceCreateFromAsset.getStyle() != i12) {
                                typefaceCreateFromAsset = Typeface.create(typefaceCreateFromAsset, i12);
                            }
                            map.put(lVar, typefaceCreateFromAsset);
                            typeface = typefaceCreateFromAsset;
                        }
                    } else {
                        aVar = aVar9;
                        str = "\r";
                        aVar2 = aVar8;
                        vVar = vVar2;
                        str2 = "\r\n";
                        i10 = -1;
                        typeface = null;
                    }
                } else {
                    if (map5.containsKey(fontFamily)) {
                        typeface6 = (Typeface) map5.get(fontFamily);
                    } else if (map5.containsKey(fontName)) {
                        typeface6 = (Typeface) map5.get(fontName);
                    } else {
                        String strK = kk.b.k(fontFamily, "-", fontStyle);
                        if (map5.containsKey(strK)) {
                            typeface6 = (Typeface) map5.get(strK);
                        } else {
                            cVarI = vVar2.i();
                            if (cVarI != null) {
                                lVar = (l) cVarI.f393d;
                                lVar.f227b = fontFamily;
                                lVar.f228c = fontStyle;
                                map = (HashMap) cVarI.f394e;
                                typeface2 = (Typeface) map.get(lVar);
                                if (typeface2 != null) {
                                    aVar = aVar9;
                                    str = "\r";
                                    aVar2 = aVar8;
                                    vVar = vVar2;
                                    str2 = "\r\n";
                                    typeface = typeface2;
                                    i10 = -1;
                                } else {
                                    map2 = (HashMap) cVarI.f396v;
                                    typeface3 = (Typeface) map2.get(fontFamily);
                                    if (typeface3 != null) {
                                        aVar = aVar9;
                                        aVar2 = aVar8;
                                        vVar = vVar2;
                                        str2 = "\r\n";
                                        typefaceCreateFromAsset = typeface3;
                                        i10 = -1;
                                        str = "\r";
                                    } else {
                                        str = "\r";
                                        bVar = (l4.b) cVarI.f398x;
                                        if (bVar != null) {
                                            k4.h hVar5 = (k4.h) bVar;
                                            str2 = "\r\n";
                                            Intrinsics.checkNotNullParameter(fontFamily, "fontFamily");
                                            aVar = aVar9;
                                            Intrinsics.checkNotNullParameter(fontStyle, "fontStyle");
                                            Intrinsics.checkNotNullParameter(fontName, "fontName");
                                            switch (fontStyle) {
                                                case -1994163307:
                                                    if (fontStyle.equals("Medium")) {
                                                        i11 = 500;
                                                    } else {
                                                        i11 = -1;
                                                    }
                                                    break;
                                                case -1955878649:
                                                    if (fontStyle.equals(ReactProgressBarViewManager.DEFAULT_STYLE)) {
                                                        i11 = com.facebook.react.common.assets.ReactFontManager.TypefaceStyle.NORMAL;
                                                    } else {
                                                        i11 = -1;
                                                    }
                                                    break;
                                                case -1543850116:
                                                    if (fontStyle.equals("Regular")) {
                                                        i11 = com.facebook.react.common.assets.ReactFontManager.TypefaceStyle.NORMAL;
                                                    } else {
                                                        i11 = -1;
                                                    }
                                                    break;
                                                case 2076325:
                                                    if (fontStyle.equals("Bold")) {
                                                        i11 = com.facebook.react.common.assets.ReactFontManager.TypefaceStyle.BOLD;
                                                    } else {
                                                        i11 = -1;
                                                    }
                                                    break;
                                                case 2605753:
                                                    if (fontStyle.equals("Thin")) {
                                                        i11 = -1;
                                                    } else {
                                                        i11 = 100;
                                                    }
                                                    break;
                                                case 64266207:
                                                    if (fontStyle.equals("Black")) {
                                                        i11 = 900;
                                                    } else {
                                                        i11 = -1;
                                                    }
                                                    break;
                                                case 73417974:
                                                    if (fontStyle.equals("Light")) {
                                                        i11 = h0.DEFAULT_DRAG_ANIMATION_DURATION;
                                                    } else {
                                                        i11 = -1;
                                                    }
                                                    break;
                                                default:
                                                    i11 = -1;
                                                    break;
                                            }
                                            companion = ReactFontManager.INSTANCE;
                                            aVar2 = aVar8;
                                            ReactFontManager companion4 = companion.getInstance();
                                            AssetManager assets3 = hVar5.f14288a.getContext().getAssets();
                                            Intrinsics.checkNotNullExpressionValue(assets3, "getAssets(...)");
                                            vVar = vVar2;
                                            typeface5 = companion4.getTypeface(fontName, -1, i11, assets3);
                                            if (typeface5 == null) {
                                                k4.h hVar6 = (k4.h) ((l4.b) cVarI.f398x);
                                                hVar6.getClass();
                                                Intrinsics.checkNotNullParameter(fontFamily, "fontFamily");
                                                ReactFontManager companion5 = companion.getInstance();
                                                AssetManager assets4 = hVar6.f14288a.getContext().getAssets();
                                                Intrinsics.checkNotNullExpressionValue(assets4, "getAssets(...)");
                                                i10 = -1;
                                                typefaceCreateFromAsset = companion5.getTypeface(fontFamily, -1, -1, assets4);
                                            } else {
                                                i10 = -1;
                                                typefaceCreateFromAsset = typeface5;
                                            }
                                        } else {
                                            aVar = aVar9;
                                            aVar2 = aVar8;
                                            vVar = vVar2;
                                            str2 = "\r\n";
                                            i10 = -1;
                                            typefaceCreateFromAsset = null;
                                        }
                                        typeface4 = cVar.f18615d;
                                        if (typeface4 != null) {
                                            typefaceCreateFromAsset = typeface4;
                                        } else {
                                            if (typefaceCreateFromAsset == null) {
                                                typefaceCreateFromAsset = Typeface.createFromAsset((AssetManager) cVarI.f397w, "fonts/" + fontFamily + ((String) cVarI.f395i));
                                            }
                                            map2.put(fontFamily, typefaceCreateFromAsset);
                                        }
                                    }
                                    zContains = fontStyle.contains("Italic");
                                    zContains2 = fontStyle.contains("Bold");
                                    if (!zContains) {
                                        if (zContains) {
                                            i12 = 2;
                                        } else if (zContains2) {
                                            i12 = 1;
                                        } else {
                                            i12 = 0;
                                        }
                                    } else if (zContains) {
                                        i12 = 2;
                                    } else if (zContains2) {
                                        i12 = 1;
                                    } else {
                                        i12 = 0;
                                    }
                                    if (typefaceCreateFromAsset.getStyle() != i12) {
                                        typefaceCreateFromAsset = Typeface.create(typefaceCreateFromAsset, i12);
                                    }
                                    map.put(lVar, typefaceCreateFromAsset);
                                    typeface = typefaceCreateFromAsset;
                                }
                            } else {
                                aVar = aVar9;
                                str = "\r";
                                aVar2 = aVar8;
                                vVar = vVar2;
                                str2 = "\r\n";
                                i10 = -1;
                                typeface = null;
                            }
                        }
                    }
                    typeface = typeface6;
                    aVar = aVar9;
                    str = "\r";
                    aVar2 = aVar8;
                    vVar = vVar2;
                    str2 = "\r\n";
                    i10 = -1;
                }
                if (typeface == null) {
                    typeface = cVar.f18615d;
                }
            } else {
                aVar = aVar9;
                str5 = ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE;
                str6 = "\u0003";
                str = "\r";
                aVar2 = aVar8;
                vVar = vVar2;
                str2 = "\r\n";
                i10 = -1;
            }
            if (typeface != null) {
                String str11 = bVar2.f18601a;
                l4.h0 h0Var = vVar.J;
                i iVar4 = this;
                if (h0Var != null) {
                    String str12 = iVar4.f20606p.f20619c;
                    HashMap map6 = h0Var.f14860a;
                    boolean z5 = h0Var.f14862c;
                    if (z5 && map6.containsKey(str11)) {
                        str11 = (String) map6.get(str11);
                    } else if (z5) {
                        map6.put(str11, str11);
                    }
                }
                m4.a aVar14 = aVar2;
                aVar14.setTypeface(typeface);
                r rVar4 = iVar4.Y;
                float fFloatValue4 = rVar4 != null ? ((Float) rVar4.e()).floatValue() : bVar2.f18603c;
                aVar14.setTextSize(x4.h.c() * fFloatValue4);
                m4.a aVar15 = aVar;
                aVar15.setTypeface(aVar14.getTypeface());
                aVar15.setTextSize(aVar14.getTextSize());
                float f19 = bVar2.f18605e / 10.0f;
                r rVar5 = iVar4.W;
                if (rVar5 != null) {
                    fFloatValue = ((Float) rVar5.e()).floatValue();
                } else {
                    if (iVar3 != null) {
                        fFloatValue = ((Float) iVar3.e()).floatValue();
                    }
                    fC = ((x4.h.c() * f19) * fFloatValue4) / 100.0f;
                    String str13 = str;
                    listAsList = Arrays.asList(str11.replaceAll(str2, str13).replaceAll(str6, str13).replaceAll(str5, str13).split(str13));
                    size = listAsList.size();
                    i13 = 0;
                    length = 0;
                    while (i13 < size) {
                        String str14 = (String) listAsList.get(i13);
                        pointF = bVar2.f18611m;
                        if (pointF == null) {
                            f2 = 0.0f;
                        } else {
                            f2 = pointF.x;
                        }
                        aVar3 = aVar15;
                        f7 = fC;
                        iVar = iVar4;
                        listZ = iVar.z(str14, f2, cVar, 0.0f, f7, false);
                        i14 = 0;
                        while (i14 < listZ.size()) {
                            hVar = (h) listZ.get(i14);
                            i10++;
                            canvas.save();
                            if (iVar.y(canvas, bVar2, i10, hVar.f20641b)) {
                                str3 = hVar.f20640a;
                                length2 = 0;
                                while (length2 < str3.length()) {
                                    iCodePointAt = str3.codePointAt(length2);
                                    i15 = length2;
                                    iCharCount = Character.charCount(iCodePointAt) + length2;
                                    q4.c cVar2 = cVar;
                                    while (true) {
                                        if (iCharCount < str3.length()) {
                                            iCodePointAt2 = str3.codePointAt(iCharCount);
                                            f10 = f7;
                                            if (Character.getType(iCodePointAt2) != 16 || Character.getType(iCodePointAt2) == 27 || Character.getType(iCodePointAt2) == 6 || Character.getType(iCodePointAt2) == 28 || Character.getType(iCodePointAt2) == 8 || Character.getType(iCodePointAt2) == 19) {
                                                iCharCount += Character.charCount(iCodePointAt2);
                                                iCodePointAt = (iCodePointAt * 31) + iCodePointAt2;
                                                f7 = f10;
                                            }
                                        } else {
                                            f10 = f7;
                                        }
                                    }
                                    j = iCodePointAt;
                                    kVar = iVar.J;
                                    if (kVar.c(j) >= 0) {
                                        string = (String) kVar.b(j);
                                    } else {
                                        sb2 = iVar.D;
                                        sb2.setLength(0);
                                        iCharCount2 = i15;
                                        while (iCharCount2 < iCharCount) {
                                            int i30 = iCharCount;
                                            int iCodePointAt3 = str3.codePointAt(iCharCount2);
                                            sb2.appendCodePoint(iCodePointAt3);
                                            iCharCount2 += Character.charCount(iCodePointAt3);
                                            iCharCount = i30;
                                        }
                                        string = sb2.toString();
                                        kVar.e(j, string);
                                    }
                                    iVar.t(bVar2, i7, length + i15);
                                    if (bVar2.k) {
                                        u(string, aVar14, canvas);
                                        u(string, aVar3, canvas);
                                    } else {
                                        u(string, aVar3, canvas);
                                        u(string, aVar14, canvas);
                                    }
                                    canvas.translate(aVar14.measureText(string) + f10, 0.0f);
                                    length2 = string.length() + i15;
                                    cVar = cVar2;
                                    listAsList = listAsList;
                                    f7 = f10;
                                    size = size;
                                }
                            }
                            q4.c cVar3 = cVar;
                            float f20 = f7;
                            List list8 = listAsList;
                            int i31 = size;
                            length += hVar.f20640a.length();
                            canvas.restore();
                            i14++;
                            listZ = listZ;
                            cVar = cVar3;
                            listAsList = list8;
                            f7 = f20;
                            size = i31;
                        }
                        float f21 = f7;
                        i13++;
                        iVar4 = iVar;
                        aVar15 = aVar3;
                        fC = f21;
                        size = size;
                    }
                }
                f19 += fFloatValue;
                fC = ((x4.h.c() * f19) * fFloatValue4) / 100.0f;
                String str15 = str;
                listAsList = Arrays.asList(str11.replaceAll(str2, str15).replaceAll(str6, str15).replaceAll(str5, str15).split(str15));
                size = listAsList.size();
                i13 = 0;
                length = 0;
                while (i13 < size) {
                    String str16 = (String) listAsList.get(i13);
                    pointF = bVar2.f18611m;
                    if (pointF == null) {
                        f2 = 0.0f;
                    } else {
                        f2 = pointF.x;
                    }
                    aVar3 = aVar15;
                    f7 = fC;
                    iVar = iVar4;
                    listZ = iVar.z(str16, f2, cVar, 0.0f, f7, false);
                    i14 = 0;
                    while (i14 < listZ.size()) {
                        hVar = (h) listZ.get(i14);
                        i10++;
                        canvas.save();
                        if (iVar.y(canvas, bVar2, i10, hVar.f20641b)) {
                            str3 = hVar.f20640a;
                            length2 = 0;
                            while (length2 < str3.length()) {
                                iCodePointAt = str3.codePointAt(length2);
                                i15 = length2;
                                iCharCount = Character.charCount(iCodePointAt) + length2;
                                q4.c cVar4 = cVar;
                                while (true) {
                                    if (iCharCount < str3.length()) {
                                        iCodePointAt2 = str3.codePointAt(iCharCount);
                                        f10 = f7;
                                        if (Character.getType(iCodePointAt2) != 16) {
                                        }
                                        iCharCount += Character.charCount(iCodePointAt2);
                                        iCodePointAt = (iCodePointAt * 31) + iCodePointAt2;
                                        f7 = f10;
                                    } else {
                                        f10 = f7;
                                    }
                                }
                                j = iCodePointAt;
                                kVar = iVar.J;
                                if (kVar.c(j) >= 0) {
                                    string = (String) kVar.b(j);
                                } else {
                                    sb2 = iVar.D;
                                    sb2.setLength(0);
                                    iCharCount2 = i15;
                                    while (iCharCount2 < iCharCount) {
                                        int i32 = iCharCount;
                                        int iCodePointAt4 = str3.codePointAt(iCharCount2);
                                        sb2.appendCodePoint(iCodePointAt4);
                                        iCharCount2 += Character.charCount(iCodePointAt4);
                                        iCharCount = i32;
                                    }
                                    string = sb2.toString();
                                    kVar.e(j, string);
                                }
                                iVar.t(bVar2, i7, length + i15);
                                if (bVar2.k) {
                                    u(string, aVar14, canvas);
                                    u(string, aVar3, canvas);
                                } else {
                                    u(string, aVar3, canvas);
                                    u(string, aVar14, canvas);
                                }
                                canvas.translate(aVar14.measureText(string) + f10, 0.0f);
                                length2 = string.length() + i15;
                                cVar = cVar4;
                                listAsList = listAsList;
                                f7 = f10;
                                size = size;
                            }
                        }
                        q4.c cVar5 = cVar;
                        float f22 = f7;
                        List list9 = listAsList;
                        int i33 = size;
                        length += hVar.f20640a.length();
                        canvas.restore();
                        i14++;
                        listZ = listZ;
                        cVar = cVar5;
                        listAsList = list9;
                        f7 = f22;
                        size = i33;
                    }
                    float f23 = f7;
                    i13++;
                    iVar4 = iVar;
                    aVar15 = aVar3;
                    fC = f23;
                    size = size;
                }
            }
            canvas2 = canvas;
        }
        canvas2.restore();
    }

    public final void t(q4.b bVar, int i7, int i10) {
        r rVar = this.Q;
        m4.a aVar = this.G;
        if (rVar != null) {
            aVar.setColor(((Integer) rVar.e()).intValue());
        } else {
            o4.f fVar = this.P;
            if (fVar == null || !x(i10)) {
                aVar.setColor(bVar.f18608h);
            } else {
                aVar.setColor(((Integer) fVar.e()).intValue());
            }
        }
        r rVar2 = this.S;
        m4.a aVar2 = this.H;
        if (rVar2 != null) {
            aVar2.setColor(((Integer) rVar2.e()).intValue());
        } else {
            o4.f fVar2 = this.R;
            if (fVar2 == null || !x(i10)) {
                aVar2.setColor(bVar.f18609i);
            } else {
                aVar2.setColor(((Integer) fVar2.e()).intValue());
            }
        }
        o4.e eVar = this.f20613w.j;
        int iIntValue = 100;
        int iIntValue2 = eVar == null ? 100 : ((Integer) eVar.e()).intValue();
        o4.f fVar3 = this.X;
        if (fVar3 != null && x(i10)) {
            iIntValue = ((Integer) fVar3.e()).intValue();
        }
        int iRound = Math.round((((iIntValue / 100.0f) * ((iIntValue2 * 255.0f) / 100.0f)) * i7) / 255.0f);
        aVar.setAlpha(iRound);
        aVar2.setAlpha(iRound);
        r rVar3 = this.U;
        if (rVar3 != null) {
            aVar2.setStrokeWidth(((Float) rVar3.e()).floatValue());
            return;
        }
        o4.i iVar = this.T;
        if (iVar == null || !x(i10)) {
            aVar2.setStrokeWidth(x4.h.c() * bVar.j);
        } else {
            aVar2.setStrokeWidth(((Float) iVar.e()).floatValue());
        }
    }

    public final h w(int i7) {
        ArrayList arrayList = this.K;
        for (int size = arrayList.size(); size < i7; size++) {
            h hVar = new h();
            hVar.f20640a = "";
            hVar.f20641b = 0.0f;
            arrayList.add(hVar);
        }
        return (h) arrayList.get(i7 - 1);
    }

    public final boolean x(int i7) {
        o4.f fVar;
        int length = ((q4.b) this.L.e()).f18601a.length();
        o4.f fVar2 = this.a0;
        if (fVar2 == null || (fVar = this.f20642b0) == null) {
            return true;
        }
        int iMin = Math.min(((Integer) fVar2.e()).intValue(), ((Integer) fVar.e()).intValue());
        int iMax = Math.max(((Integer) fVar2.e()).intValue(), ((Integer) fVar.e()).intValue());
        o4.f fVar3 = this.f20643c0;
        if (fVar3 != null) {
            int iIntValue = ((Integer) fVar3.e()).intValue();
            iMin += iIntValue;
            iMax += iIntValue;
        }
        if (this.O == 2) {
            return i7 >= iMin && i7 < iMax;
        }
        float f2 = (i7 / length) * 100.0f;
        return f2 >= ((float) iMin) && f2 < ((float) iMax);
    }

    public final boolean y(Canvas canvas, q4.b bVar, int i7, float f2) {
        PointF pointF = bVar.f18610l;
        PointF pointF2 = bVar.f18611m;
        float fC = x4.h.c();
        float f7 = (i7 * bVar.f18606f * fC) + (pointF == null ? 0.0f : (bVar.f18606f * fC) + pointF.y);
        if (this.M.S && pointF2 != null && pointF != null && f7 >= pointF.y + pointF2.y + bVar.f18603c) {
            return false;
        }
        float f10 = pointF == null ? 0.0f : pointF.x;
        float f11 = pointF2 != null ? pointF2.x : 0.0f;
        int iB = f0.e.b(bVar.f18604d);
        if (iB == 0) {
            canvas.translate(f10, f7);
            return true;
        }
        if (iB == 1) {
            canvas.translate((f10 + f11) - f2, f7);
            return true;
        }
        if (iB != 2) {
            return true;
        }
        canvas.translate(((f11 / 2.0f) + f10) - (f2 / 2.0f), f7);
        return true;
    }

    public final List z(String str, float f2, q4.c cVar, float f7, float f10, boolean z5) {
        float fMeasureText;
        int i7 = 0;
        int i10 = 0;
        boolean z6 = false;
        int i11 = 0;
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        for (int i12 = 0; i12 < str.length(); i12++) {
            char cCharAt = str.charAt(i12);
            if (z5) {
                q4.d dVar = (q4.d) this.N.f14870h.c(q4.d.a(cCharAt, cVar.f18612a, cVar.f18614c));
                if (dVar != null) {
                    fMeasureText = (x4.h.c() * ((float) dVar.f18618c) * f7) + f10;
                }
            } else {
                fMeasureText = this.G.measureText(str.substring(i12, i12 + 1)) + f10;
            }
            if (cCharAt == ' ') {
                z6 = true;
                f13 = fMeasureText;
            } else if (z6) {
                z6 = false;
                i11 = i12;
                f12 = fMeasureText;
            } else {
                f12 += fMeasureText;
            }
            f11 += fMeasureText;
            if (f2 > 0.0f && f11 >= f2 && cCharAt != ' ') {
                i7++;
                h hVarW = w(i7);
                if (i11 == i10) {
                    String strSubstring = str.substring(i10, i12);
                    String strTrim = strSubstring.trim();
                    float length = (f11 - fMeasureText) - ((strTrim.length() - strSubstring.length()) * f13);
                    hVarW.f20640a = strTrim;
                    hVarW.f20641b = length;
                    i10 = i12;
                    i11 = i10;
                    f11 = fMeasureText;
                    f12 = f11;
                } else {
                    String strSubstring2 = str.substring(i10, i11 - 1);
                    String strTrim2 = strSubstring2.trim();
                    float length2 = ((f11 - f12) - ((strSubstring2.length() - strTrim2.length()) * f13)) - f13;
                    hVarW.f20640a = strTrim2;
                    hVarW.f20641b = length2;
                    f11 = f12;
                    i10 = i11;
                }
            }
        }
        if (f11 > 0.0f) {
            i7++;
            h hVarW2 = w(i7);
            hVarW2.f20640a = str.substring(i10);
            hVarW2.f20641b = f11;
        }
        return this.K.subList(0, i7);
    }
}

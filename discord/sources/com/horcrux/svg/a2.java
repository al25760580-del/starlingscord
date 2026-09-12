package com.horcrux.svg;

import android.content.res.AssetManager;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Region;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.views.text.ReactFontManager;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class a2 extends f2 {
    public Path N;
    public String O;
    public b2 P;
    public final ArrayList Q;
    public final ArrayList R;
    public final AssetManager S;

    public a2(ThemedReactContext themedReactContext) {
        super(themedReactContext);
        this.Q = new ArrayList();
        this.R = new ArrayList();
        this.S = this.mContext.getResources().getAssets();
    }

    @Override // com.horcrux.svg.f2, com.horcrux.svg.VirtualView
    public final void clearCache() {
        this.N = null;
        super.clearCache();
    }

    @Override // com.horcrux.svg.f2, com.horcrux.svg.a0, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public final void draw(Canvas canvas, Paint paint, float f2) {
        if (this.O == null) {
            clip(canvas, paint);
            c(canvas, paint, f2);
            return;
        }
        r0 r0Var = this.f6709x;
        if (r0Var != null && r0Var.f6786a != 0.0d) {
            if (setupFillPaint(paint, this.fillOpacity * f2)) {
                o(canvas, paint);
            }
            if (setupStrokePaint(paint, f2 * this.strokeOpacity)) {
                o(canvas, paint);
                return;
            }
            return;
        }
        ArrayList arrayList = this.Q;
        int size = arrayList.size();
        if (size > 0) {
            n(paint, f().f6844r);
            for (int i7 = 0; i7 < size; i7++) {
                String str = (String) arrayList.get(i7);
                Matrix matrix = (Matrix) this.R.get(i7);
                canvas.save();
                canvas.concat(matrix);
                canvas.drawText(str, 0.0f, 0.0f, paint);
                canvas.restore();
            }
        }
        d(canvas, paint, f2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:101:0x021e  */
    /* JADX WARN: Code duplicated, block: B:103:0x0227  */
    /* JADX WARN: Code duplicated, block: B:104:0x0229  */
    /* JADX WARN: Code duplicated, block: B:107:0x0237  */
    /* JADX WARN: Code duplicated, block: B:108:0x0240  */
    /* JADX WARN: Code duplicated, block: B:111:0x0254  */
    /* JADX WARN: Code duplicated, block: B:113:0x026c  */
    /* JADX WARN: Code duplicated, block: B:115:0x0277  */
    /* JADX WARN: Code duplicated, block: B:116:0x0285  */
    /* JADX WARN: Code duplicated, block: B:117:0x0288  */
    /* JADX WARN: Code duplicated, block: B:119:0x0290  */
    /* JADX WARN: Code duplicated, block: B:122:0x02be  */
    /* JADX WARN: Code duplicated, block: B:124:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:130:0x02d7 A[EDGE_INSN: B:130:0x02d7->B:131:0x02d9 BREAK  A[LOOP:5: B:123:0x02c2->B:129:0x02d2]] */
    /* JADX WARN: Code duplicated, block: B:133:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:135:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:141:0x02fa A[PHI: r14
      0x02fa: PHI (r14v16 double) = (r14v15 double), (r14v33 double) binds: [B:132:0x02db, B:310:0x02fa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:143:0x0300  */
    /* JADX WARN: Code duplicated, block: B:146:0x0308  */
    /* JADX WARN: Code duplicated, block: B:148:0x030f  */
    /* JADX WARN: Code duplicated, block: B:150:0x0313  */
    /* JADX WARN: Code duplicated, block: B:152:0x031b  */
    /* JADX WARN: Code duplicated, block: B:153:0x031e  */
    /* JADX WARN: Code duplicated, block: B:154:0x0321  */
    /* JADX WARN: Code duplicated, block: B:155:0x0324  */
    /* JADX WARN: Code duplicated, block: B:156:0x0327  */
    /* JADX WARN: Code duplicated, block: B:157:0x032a  */
    /* JADX WARN: Code duplicated, block: B:158:0x032f  */
    /* JADX WARN: Code duplicated, block: B:159:0x0343  */
    /* JADX WARN: Code duplicated, block: B:160:0x0346  */
    /* JADX WARN: Code duplicated, block: B:170:0x0364  */
    /* JADX WARN: Code duplicated, block: B:211:0x0434  */
    /* JADX WARN: Code duplicated, block: B:213:0x0440  */
    /* JADX WARN: Code duplicated, block: B:215:0x044b  */
    /* JADX WARN: Code duplicated, block: B:218:0x0457  */
    /* JADX WARN: Code duplicated, block: B:224:0x0485  */
    /* JADX WARN: Code duplicated, block: B:225:0x0491  */
    /* JADX WARN: Code duplicated, block: B:228:0x0497  */
    /* JADX WARN: Code duplicated, block: B:229:0x0499  */
    /* JADX WARN: Code duplicated, block: B:231:0x049c  */
    /* JADX WARN: Code duplicated, block: B:232:0x049f  */
    /* JADX WARN: Code duplicated, block: B:235:0x04a7  */
    /* JADX WARN: Code duplicated, block: B:236:0x04ab  */
    /* JADX WARN: Code duplicated, block: B:239:0x04d0  */
    /* JADX WARN: Code duplicated, block: B:240:0x04ee  */
    /* JADX WARN: Code duplicated, block: B:243:0x0505  */
    /* JADX WARN: Code duplicated, block: B:246:0x0545 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:247:0x0547  */
    /* JADX WARN: Code duplicated, block: B:306:0x02d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:310:0x02fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:318:0x045d A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x0144  */
    /* JADX WARN: Code duplicated, block: B:67:0x0158  */
    /* JADX WARN: Code duplicated, block: B:70:0x016f  */
    /* JADX WARN: Code duplicated, block: B:91:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:93:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:94:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:97:0x0202  */
    /* JADX WARN: Code duplicated, block: B:98:0x0204  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r25v10 */
    /* JADX WARN: Type inference failed for: r25v11 */
    /* JADX WARN: Type inference failed for: r25v12 */
    /* JADX WARN: Type inference failed for: r25v13 */
    /* JADX WARN: Type inference failed for: r25v14 */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:72:0x01a2
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // com.horcrux.svg.f2, com.horcrux.svg.a0, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public final android.graphics.Path getPath(android.graphics.Canvas r77, android.graphics.Paint r78) {
        /*
            Method dump skipped, instruction units count: 1864
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.horcrux.svg.a2.getPath(android.graphics.Canvas, android.graphics.Paint):android.graphics.Path");
    }

    @Override // com.horcrux.svg.a0, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public final int hitTest(float[] fArr) {
        Region region;
        if (this.O == null) {
            return super.hitTest(fArr);
        }
        if (this.mPath != null && this.mInvertible) {
            float[] fArr2 = new float[2];
            this.mInvMatrix.mapPoints(fArr2, fArr);
            this.mInvTransform.mapPoints(fArr2);
            int iRound = Math.round(fArr2[0]);
            int iRound2 = Math.round(fArr2[1]);
            initBounds();
            Region region2 = this.mRegion;
            if ((region2 != null && region2.contains(iRound, iRound2)) || ((region = this.mStrokeRegion) != null && region.contains(iRound, iRound2))) {
                if (getClipPath() == null || this.mClipRegion.contains(iRound, iRound2)) {
                    return getId();
                }
                return -1;
            }
        }
        return -1;
    }

    @Override // com.horcrux.svg.f2, com.horcrux.svg.VirtualView, android.view.View
    public final void invalidate() {
        this.N = null;
        super.invalidate();
    }

    @Override // com.horcrux.svg.f2
    public final double k(Paint paint) {
        if (!Double.isNaN(this.M)) {
            return this.M;
        }
        String str = this.O;
        double dK = 0.0d;
        if (str == null) {
            for (int i7 = 0; i7 < getChildCount(); i7++) {
                View childAt = getChildAt(i7);
                if (childAt instanceof f2) {
                    dK = ((f2) childAt).k(paint) + dK;
                }
            }
            this.M = dK;
            return dK;
        }
        if (str.length() == 0) {
            this.M = 0.0d;
            return 0.0d;
        }
        x xVar = f().f6844r;
        n(paint, xVar);
        m(paint, xVar);
        double dMeasureText = paint.measureText(str);
        this.M = dMeasureText;
        return dMeasureText;
    }

    public final void m(Paint paint, x xVar) {
        int i7 = Build.VERSION.SDK_INT;
        double d6 = xVar.f6819n;
        String str = xVar.f6814g;
        paint.setLetterSpacing((float) (d6 / (xVar.f6808a * ((double) this.mScale))));
        if (d6 == 0.0d && xVar.f6816i == 1) {
            paint.setFontFeatureSettings("'rlig', 'liga', 'clig', 'calt', 'locl', 'ccmp', 'mark', 'mkmk','kern', 'hlig', 'cala', " + str);
        } else {
            paint.setFontFeatureSettings("'rlig', 'liga', 'clig', 'calt', 'locl', 'ccmp', 'mark', 'mkmk','kern', 'liga' 0, 'clig' 0, 'dlig' 0, 'hlig' 0, 'cala' 0, " + str);
        }
        if (i7 >= 26) {
            paint.setFontVariationSettings("'wght' " + xVar.f6813f + xVar.f6815h);
        }
    }

    public final void n(Paint paint, x xVar) {
        Typeface typefaceCreateFromAsset;
        d2 d2Var = xVar.f6812e;
        String str = xVar.f6815h;
        int i7 = 0;
        boolean z5 = d2Var == d2.Bold || xVar.f6813f >= 550;
        boolean z6 = xVar.f6810c == 2;
        if (z5 && z6) {
            i7 = 3;
        } else if (z5) {
            i7 = 1;
        } else if (z6) {
            i7 = 2;
        }
        int i10 = xVar.f6813f;
        String str2 = xVar.f6809b;
        AssetManager assetManager = this.S;
        Typeface typeface = null;
        if (str2 != null && str2.length() > 0) {
            String strE = s0.g.e("fonts/", str2, ".otf");
            String strE2 = s0.g.e("fonts/", str2, ".ttf");
            if (Build.VERSION.SDK_INT >= 26) {
                Typeface.Builder builder = new Typeface.Builder(assetManager, strE);
                builder.setFontVariationSettings("'wght' " + i10 + str);
                builder.setWeight(i10);
                builder.setItalic(z6);
                typeface = builder.build();
                if (typeface == null) {
                    Typeface.Builder builder2 = new Typeface.Builder(assetManager, strE2);
                    builder2.setFontVariationSettings("'wght' " + i10 + str);
                    builder2.setWeight(i10);
                    builder2.setItalic(z6);
                    typefaceCreateFromAsset = builder2.build();
                    typeface = typefaceCreateFromAsset;
                }
            } else {
                try {
                    try {
                        typeface = Typeface.create(Typeface.createFromAsset(assetManager, strE), i7);
                    } catch (Exception unused) {
                    }
                } catch (Exception unused2) {
                    typefaceCreateFromAsset = Typeface.createFromAsset(assetManager, strE2);
                    try {
                        typeface = Typeface.create(typefaceCreateFromAsset, i7);
                    } catch (Exception unused3) {
                        typeface = typefaceCreateFromAsset;
                    }
                }
            }
        }
        if (typeface == null) {
            try {
                typeface = ReactFontManager.getInstance().getTypeface(str2, i7, assetManager);
            } catch (Exception unused4) {
            }
        }
        if (Build.VERSION.SDK_INT >= 28) {
            typeface = Typeface.create(typeface, i10, z6);
        }
        paint.setLinearText(true);
        paint.setSubpixelText(true);
        paint.setTypeface(typeface);
        paint.setTextSize((float) (xVar.f6808a * ((double) this.mScale)));
        paint.setLetterSpacing(0.0f);
    }

    public final void o(Canvas canvas, Paint paint) {
        Layout.Alignment alignment;
        z zVarF = f();
        h();
        x xVar = zVarF.f6844r;
        TextPaint textPaint = new TextPaint(paint);
        n(textPaint, xVar);
        m(textPaint, xVar);
        double d6 = zVarF.f6843q;
        int iB = f0.e.b(xVar.j);
        if (iB != 1) {
            alignment = iB != 2 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE;
        } else {
            alignment = Layout.Alignment.ALIGN_CENTER;
        }
        SpannableString spannableString = new SpannableString(this.O);
        StaticLayout staticLayoutBuild = StaticLayout.Builder.obtain(spannableString, 0, spannableString.length(), textPaint, (int) a.a.g(this.f6709x, canvas.getWidth(), this.mScale, d6)).setAlignment(alignment).setLineSpacing(0.0f, 1.0f).setIncludePad(true).setBreakStrategy(1).setHyphenationFrequency(1).build();
        int lineAscent = staticLayoutBuild.getLineAscent(0);
        float fC = (float) zVarF.c(0.0d);
        float fD = (float) (zVarF.d() + ((double) lineAscent));
        g();
        canvas.save();
        canvas.translate(fC, fD);
        staticLayoutBuild.draw(canvas);
        canvas.restore();
    }
}

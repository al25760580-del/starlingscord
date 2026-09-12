package ge;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import je.e0;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends View implements p {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f9967d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f9968e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f9969i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public d f9970v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f9971w;

    public c(Context context, int i7) {
        super(context, null);
        this.f9967d = new ArrayList();
        this.f9968e = Collections.EMPTY_LIST;
        this.f9969i = 0.0533f;
        this.f9970v = d.f9972g;
        this.f9971w = 0.08f;
    }

    @Override // ge.p
    public final void a(List list, d dVar, float f2, float f7) {
        this.f9968e = list;
        this.f9970v = dVar;
        this.f9969i = f2;
        this.f9971w = f7;
        while (true) {
            ArrayList arrayList = this.f9967d;
            if (arrayList.size() >= list.size()) {
                invalidate();
                return;
            }
            arrayList.add(new o(getContext()));
        }
    }

    /* JADX WARN: Code duplicated, block: B:187:0x0464  */
    /* JADX WARN: Code duplicated, block: B:189:0x0467  */
    /* JADX WARN: Code duplicated, block: B:191:0x046a  */
    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f2;
        int i7;
        int i10;
        boolean z5;
        int iRound;
        float f7;
        int i11;
        float f10;
        int i12;
        int iMax;
        int iMin;
        int iRound2;
        int i13;
        c cVar = this;
        List list = cVar.f9968e;
        if (list.isEmpty()) {
            return;
        }
        int height = cVar.getHeight();
        int paddingLeft = cVar.getPaddingLeft();
        int paddingTop = cVar.getPaddingTop();
        int width = cVar.getWidth() - cVar.getPaddingRight();
        int paddingBottom = height - cVar.getPaddingBottom();
        if (paddingBottom <= paddingTop || width <= paddingLeft) {
            return;
        }
        int i14 = paddingBottom - paddingTop;
        float fH = mf.f.H(0, height, i14, cVar.f9969i);
        float f11 = 0.0f;
        if (fH <= 0.0f) {
            return;
        }
        int size = list.size();
        int i15 = 0;
        while (i15 < size) {
            vd.c cVarA = (vd.c) list.get(i15);
            float f12 = f11;
            if (cVarA.M != Integer.MIN_VALUE) {
                vd.b bVarA = cVarA.a();
                float f13 = cVarA.f21643w;
                bVarA.f21625h = -3.4028235E38f;
                bVarA.f21626i = Integer.MIN_VALUE;
                bVarA.f21620c = null;
                if (cVarA.f21644x == 0) {
                    bVarA.f21622e = 1.0f - f13;
                    i13 = 0;
                    bVarA.f21623f = 0;
                } else {
                    i13 = 0;
                    bVarA.f21622e = (-f13) - 1.0f;
                    bVarA.f21623f = 1;
                }
                int i16 = cVarA.f21645y;
                if (i16 == 0) {
                    bVarA.f21624g = 2;
                } else if (i16 == 2) {
                    bVarA.f21624g = i13;
                }
                cVarA = bVarA.a();
            }
            float fH2 = mf.f.H(cVarA.K, height, i14, cVarA.L);
            o oVar = (o) cVar.f9967d.get(i15);
            d dVar = cVar.f9970v;
            float f14 = cVar.f9971w;
            TextPaint textPaint = oVar.f10003f;
            int i17 = height;
            Bitmap bitmap = cVarA.f21642v;
            int i18 = i14;
            float f15 = cVarA.H;
            int i19 = size;
            float f16 = cVarA.G;
            int i20 = i15;
            int i21 = cVarA.F;
            float f17 = cVarA.E;
            int i22 = cVarA.f21645y;
            float f18 = fH;
            int i23 = cVarA.f21644x;
            float f19 = cVarA.f21643w;
            Layout.Alignment alignment = cVarA.f21640e;
            CharSequence charSequence = cVarA.f21639d;
            boolean z6 = bitmap == null;
            if (z6) {
                if (TextUtils.isEmpty(charSequence)) {
                    paddingLeft = paddingLeft;
                    paddingTop = paddingTop;
                    z5 = false;
                } else {
                    f2 = f17;
                    i7 = cVarA.I ? cVarA.J : dVar.f9975c;
                }
                i15 = i20 + 1;
                cVar = this;
                f11 = f12;
                list = list;
                height = i17;
                i14 = i18;
                size = i19;
                fH = f18;
                paddingLeft = paddingLeft;
                paddingTop = paddingTop;
            } else {
                f2 = f17;
                i7 = -16777216;
            }
            CharSequence charSequence2 = oVar.f10006i;
            if ((charSequence2 == charSequence || (charSequence2 != null && charSequence2.equals(charSequence))) && e0.a(oVar.j, alignment) && oVar.k == bitmap && oVar.f10007l == f19 && oVar.f10008m == i23) {
                i10 = i22;
                if (Integer.valueOf(oVar.f10009n).equals(Integer.valueOf(i10)) && oVar.f10010o == f2 && Integer.valueOf(oVar.f10011p).equals(Integer.valueOf(i21)) && oVar.f10012q == f16 && oVar.f10013r == f15 && oVar.f10014s == dVar.f9973a && oVar.f10015t == dVar.f9974b && oVar.f10016u == i7 && oVar.f10018w == dVar.f9976d && oVar.f10017v == dVar.f9977e && e0.a(textPaint.getTypeface(), dVar.f9978f) && oVar.f10019x == f18 && oVar.f10020y == fH2 && oVar.f10021z == f14 && oVar.A == paddingLeft && oVar.B == paddingTop && oVar.C == width && oVar.D == paddingBottom) {
                    oVar.a(canvas, z6);
                    paddingLeft = paddingLeft;
                    paddingTop = paddingTop;
                    z5 = false;
                }
                i15 = i20 + 1;
                cVar = this;
                f11 = f12;
                list = list;
                height = i17;
                i14 = i18;
                size = i19;
                fH = f18;
                paddingLeft = paddingLeft;
                paddingTop = paddingTop;
            } else {
                i10 = i22;
            }
            oVar.f10006i = charSequence;
            oVar.j = alignment;
            oVar.k = bitmap;
            oVar.f10007l = f19;
            oVar.f10008m = i23;
            oVar.f10009n = i10;
            oVar.f10010o = f2;
            oVar.f10011p = i21;
            oVar.f10012q = f16;
            oVar.f10013r = f15;
            oVar.f10014s = dVar.f9973a;
            oVar.f10015t = dVar.f9974b;
            oVar.f10016u = i7;
            oVar.f10018w = dVar.f9976d;
            oVar.f10017v = dVar.f9977e;
            textPaint.setTypeface(dVar.f9978f);
            oVar.f10019x = f18;
            oVar.f10020y = fH2;
            oVar.f10021z = f14;
            oVar.A = paddingLeft;
            oVar.B = paddingTop;
            oVar.C = width;
            oVar.D = paddingBottom;
            if (z6) {
                oVar.f10006i.getClass();
                CharSequence charSequence3 = oVar.f10006i;
                SpannableStringBuilder spannableStringBuilder = charSequence3 instanceof SpannableStringBuilder ? (SpannableStringBuilder) charSequence3 : new SpannableStringBuilder(oVar.f10006i);
                int i24 = oVar.C - oVar.A;
                int i25 = oVar.D - oVar.B;
                textPaint.setTextSize(oVar.f10019x);
                int i26 = (int) ((oVar.f10019x * 0.125f) + 0.5f);
                int i27 = i26 * 2;
                int i28 = i24 - i27;
                float f20 = oVar.f10012q;
                if (f20 != -3.4028235E38f) {
                    i28 = (int) (i28 * f20);
                }
                int i29 = i28;
                if (i29 <= 0) {
                    je.b.N("SubtitlePainter", "Skipped drawing subtitle cue (insufficient space)");
                    f18 = f18;
                    paddingLeft = paddingLeft;
                    paddingTop = paddingTop;
                } else {
                    if (oVar.f10020y > f12) {
                        f18 = f18;
                        i12 = 0;
                        spannableStringBuilder.setSpan(new AbsoluteSizeSpan((int) oVar.f10020y), 0, spannableStringBuilder.length(), 16711680);
                    } else {
                        f18 = f18;
                        i12 = 0;
                    }
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
                    if (oVar.f10018w == 1) {
                        ForegroundColorSpan[] foregroundColorSpanArr = (ForegroundColorSpan[]) spannableStringBuilder2.getSpans(i12, spannableStringBuilder2.length(), ForegroundColorSpan.class);
                        int i30 = 0;
                        for (int length = foregroundColorSpanArr.length; i30 < length; length = length) {
                            spannableStringBuilder2.removeSpan(foregroundColorSpanArr[i30]);
                            i30++;
                        }
                    }
                    if (Color.alpha(oVar.f10015t) > 0) {
                        int i31 = oVar.f10018w;
                        if (i31 == 0 || i31 == 2) {
                            spannableStringBuilder.setSpan(new BackgroundColorSpan(oVar.f10015t), 0, spannableStringBuilder.length(), 16711680);
                        } else {
                            spannableStringBuilder2.setSpan(new BackgroundColorSpan(oVar.f10015t), 0, spannableStringBuilder2.length(), 16711680);
                        }
                    }
                    Layout.Alignment alignment2 = oVar.j;
                    if (alignment2 == null) {
                        alignment2 = Layout.Alignment.ALIGN_CENTER;
                    }
                    Layout.Alignment alignment3 = alignment2;
                    SpannableStringBuilder spannableStringBuilder3 = spannableStringBuilder;
                    StaticLayout staticLayout = new StaticLayout(spannableStringBuilder3, r2, i29, alignment3, oVar.f10001d, oVar.f10002e, true);
                    oVar.E = staticLayout;
                    int height2 = staticLayout.getHeight();
                    int lineCount = oVar.E.getLineCount();
                    int i32 = 0;
                    int iMax2 = 0;
                    while (i32 < lineCount) {
                        iMax2 = Math.max((int) Math.ceil(oVar.E.getLineWidth(i32)), iMax2);
                        i32++;
                        height2 = height2;
                        lineCount = lineCount;
                        spannableStringBuilder2 = spannableStringBuilder2;
                    }
                    SpannableStringBuilder spannableStringBuilder4 = spannableStringBuilder2;
                    int i33 = height2;
                    int i34 = ((oVar.f10012q == -3.4028235E38f || iMax2 >= i29) ? iMax2 : i29) + i27;
                    float f21 = oVar.f10010o;
                    if (f21 != -3.4028235E38f) {
                        int iRound3 = Math.round(i24 * f21);
                        int i35 = oVar.A;
                        int i36 = iRound3 + i35;
                        int i37 = oVar.f10011p;
                        if (i37 == 1) {
                            i36 = ((i36 * 2) - i34) / 2;
                        } else if (i37 == 2) {
                            i36 -= i34;
                        }
                        iMax = Math.max(i36, i35);
                        iMin = Math.min(iMax + i34, oVar.C);
                    } else {
                        iMax = oVar.A + ((i24 - i34) / 2);
                        iMin = iMax + i34;
                    }
                    int i38 = iMin - iMax;
                    if (i38 <= 0) {
                        je.b.N("SubtitlePainter", "Skipped drawing subtitle cue (invalid horizontal positioning)");
                    } else {
                        float f22 = oVar.f10007l;
                        if (f22 != -3.4028235E38f) {
                            if (oVar.f10008m == 0) {
                                iRound2 = Math.round(i25 * f22) + oVar.B;
                                int i39 = oVar.f10009n;
                                if (i39 == 2) {
                                    iRound2 -= i33;
                                } else if (i39 == 1) {
                                    iRound2 = ((iRound2 * 2) - i33) / 2;
                                }
                                z5 = false;
                            } else {
                                z5 = false;
                                int lineBottom = oVar.E.getLineBottom(0) - oVar.E.getLineTop(0);
                                float f23 = oVar.f10007l;
                                iRound2 = f23 >= f12 ? Math.round(f23 * lineBottom) + oVar.B : (Math.round((f23 + 1.0f) * lineBottom) + oVar.D) - i33;
                            }
                            int i40 = iRound2 + i33;
                            int i41 = oVar.D;
                            if (i40 > i41) {
                                iRound2 = i41 - i33;
                            } else {
                                int i42 = oVar.B;
                                if (iRound2 < i42) {
                                    iRound2 = i42;
                                }
                            }
                        } else {
                            z5 = false;
                            iRound2 = (oVar.D - i33) - ((int) (i25 * oVar.f10021z));
                        }
                        oVar.E = new StaticLayout(spannableStringBuilder3, r2, i38, alignment3, oVar.f10001d, oVar.f10002e, true);
                        oVar.F = new StaticLayout(spannableStringBuilder4, textPaint, i38, alignment3, oVar.f10001d, oVar.f10002e, true);
                        oVar.G = iMax;
                        oVar.H = iRound2;
                        oVar.I = i26;
                    }
                }
                z5 = false;
            } else {
                paddingLeft = paddingLeft;
                paddingTop = paddingTop;
                z5 = false;
                oVar.k.getClass();
                Bitmap bitmap2 = oVar.k;
                int i43 = oVar.C;
                int i44 = oVar.A;
                int i45 = oVar.D;
                int i46 = oVar.B;
                float f24 = i43 - i44;
                float f25 = (oVar.f10010o * f24) + i44;
                float f26 = i45 - i46;
                float f27 = (oVar.f10007l * f26) + i46;
                int iRound4 = Math.round(f24 * oVar.f10012q);
                float f28 = oVar.f10013r;
                if (f28 != -3.4028235E38f) {
                    f18 = f18;
                    iRound = Math.round(f26 * f28);
                } else {
                    f18 = f18;
                    iRound = Math.round((bitmap2.getHeight() / bitmap2.getWidth()) * iRound4);
                }
                int i47 = oVar.f10011p;
                if (i47 == 2) {
                    f7 = iRound4;
                } else {
                    if (i47 == 1) {
                        f7 = iRound4 / 2;
                    }
                    int iRound5 = Math.round(f25);
                    i11 = oVar.f10009n;
                    if (i11 == 2) {
                        f10 = iRound;
                    } else {
                        if (i11 == 1) {
                            f10 = iRound / 2;
                        }
                        int iRound6 = Math.round(f27);
                        oVar.J = new Rect(iRound5, iRound6, iRound4 + iRound5, iRound + iRound6);
                    }
                    f27 -= f10;
                    int iRound7 = Math.round(f27);
                    oVar.J = new Rect(iRound5, iRound7, iRound4 + iRound5, iRound + iRound7);
                }
                f25 -= f7;
                int iRound8 = Math.round(f25);
                i11 = oVar.f10009n;
                if (i11 == 2) {
                    f10 = iRound;
                } else {
                    if (i11 == 1) {
                        f10 = iRound / 2;
                    }
                    int iRound9 = Math.round(f27);
                    oVar.J = new Rect(iRound8, iRound9, iRound4 + iRound8, iRound + iRound9);
                }
                f27 -= f10;
                int iRound10 = Math.round(f27);
                oVar.J = new Rect(iRound8, iRound10, iRound4 + iRound8, iRound + iRound10);
            }
            oVar.a(canvas, z6);
            i15 = i20 + 1;
            cVar = this;
            f11 = f12;
            list = list;
            height = i17;
            i14 = i18;
            size = i19;
            fH = f18;
            paddingLeft = paddingLeft;
            paddingTop = paddingTop;
        }
    }
}

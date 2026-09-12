package k2;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.ReplacementSpan;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class v extends ReplacementSpan {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final u f14270e;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public TextPaint f14273w;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Paint.FontMetricsInt f14269d = new Paint.FontMetricsInt();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public short f14271i = -1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f14272v = 1.0f;

    public v(u uVar) {
        yk.a.d(uVar, "rasterizer cannot be null");
        this.f14270e = uVar;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0042  */
    /* JADX WARN: Code duplicated, block: B:21:0x0046  */
    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i10, float f2, int i11, int i12, int i13, Paint paint) {
        TextPaint textPaint = null;
        if (charSequence instanceof Spanned) {
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence).getSpans(i7, i10, CharacterStyle.class);
            if (characterStyleArr.length != 0) {
                if (characterStyleArr.length != 1 || characterStyleArr[0] != this) {
                    TextPaint textPaint2 = this.f14273w;
                    if (textPaint2 == null) {
                        textPaint2 = new TextPaint();
                        this.f14273w = textPaint2;
                    }
                    textPaint = textPaint2;
                    textPaint.set(paint);
                    for (CharacterStyle characterStyle : characterStyleArr) {
                        characterStyle.updateDrawState(textPaint);
                    }
                } else if (paint instanceof TextPaint) {
                    textPaint = (TextPaint) paint;
                }
            } else if (paint instanceof TextPaint) {
                textPaint = (TextPaint) paint;
            }
        } else if (paint instanceof TextPaint) {
            textPaint = (TextPaint) paint;
        }
        TextPaint textPaint3 = textPaint;
        if (textPaint3 != null && textPaint3.bgColor != 0) {
            int color = textPaint3.getColor();
            Paint.Style style = textPaint3.getStyle();
            textPaint3.setColor(textPaint3.bgColor);
            textPaint3.setStyle(Paint.Style.FILL);
            canvas.drawRect(f2, i11, f2 + this.f14271i, i13, textPaint3);
            textPaint3.setStyle(style);
            textPaint3.setColor(color);
        }
        i.a().getClass();
        float f7 = i12;
        Paint paint2 = textPaint3;
        if (textPaint3 == null) {
            paint2 = paint;
        }
        u uVar = this.f14270e;
        com.google.firebase.messaging.r rVar = uVar.f14267b;
        Typeface typeface = (Typeface) rVar.f6613v;
        Typeface typeface2 = paint2.getTypeface();
        paint2.setTypeface(typeface);
        canvas.drawText((char[]) rVar.f6611e, uVar.f14266a * 2, 2, f2, f7, paint2);
        paint2.setTypeface(typeface2);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i7, int i10, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.f14269d;
        paint.getFontMetricsInt(fontMetricsInt2);
        float fAbs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        u uVar = this.f14270e;
        l2.a aVarB = uVar.b();
        int iA = aVarB.a(14);
        this.f14272v = fAbs / (iA != 0 ? ((ByteBuffer) aVarB.f1674v).getShort(iA + aVarB.f1671d) : (short) 0);
        l2.a aVarB2 = uVar.b();
        int iA2 = aVarB2.a(14);
        if (iA2 != 0) {
            ((ByteBuffer) aVarB2.f1674v).getShort(iA2 + aVarB2.f1671d);
        }
        l2.a aVarB3 = uVar.b();
        int iA3 = aVarB3.a(12);
        short s2 = (short) ((iA3 != 0 ? ((ByteBuffer) aVarB3.f1674v).getShort(iA3 + aVarB3.f1671d) : (short) 0) * this.f14272v);
        this.f14271i = s2;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s2;
    }
}

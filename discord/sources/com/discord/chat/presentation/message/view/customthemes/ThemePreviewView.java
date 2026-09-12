package com.discord.chat.presentation.message.view.customthemes;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.react.uimanager.PixelUtil;
import com.rnlineargradient.LinearGradientManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0014\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ\u000e\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u000fJ\u0018\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001eH\u0014J(\u0010 \u001a\u00020\t2\u0006\u0010!\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\u001e2\u0006\u0010$\u001a\u00020\u001eH\u0014J\b\u0010%\u001a\u00020\tH\u0002J\u0010\u0010&\u001a\u00020\t2\u0006\u0010'\u001a\u00020(H\u0014R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/discord/chat/presentation/message/view/customthemes/ThemePreviewView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "setHexColors", "", "hexColors", "", "", "setGradientAngle", "angleDeg", "", "setCornerRadiusDp", "radiusDp", LinearGradientManager.PROP_COLORS, "", "angleDegrees", "cornerRadiusPx", "paint", "Landroid/graphics/Paint;", "shader", "Landroid/graphics/Shader;", "rect", "Landroid/graphics/RectF;", "onMeasure", "widthMeasureSpec", "", "heightMeasureSpec", "onSizeChanged", "w", "h", "oldw", "oldh", "rebuildShader", "onDraw", "canvas", "Landroid/graphics/Canvas;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nThemePreviewView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThemePreviewView.kt\ncom/discord/chat/presentation/message/view/customthemes/ThemePreviewView\n+ 2 Color.kt\nandroidx/core/graphics/ColorKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,110:1\n404#2:111\n404#2:115\n1563#3:112\n1634#3,2:113\n1636#3:116\n*S KotlinDebug\n*F\n+ 1 ThemePreviewView.kt\ncom/discord/chat/presentation/message/view/customthemes/ThemePreviewView\n*L\n38#1:111\n22#1:115\n22#1:112\n22#1:113,2\n22#1:116\n*E\n"})
public final class ThemePreviewView extends View {
    private float angleDegrees;

    @NotNull
    private int[] colors;
    private float cornerRadiusPx;

    @NotNull
    private final Paint paint;

    @NotNull
    private final RectF rect;
    private Shader shader;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ThemePreviewView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void rebuildShader() {
        if (getWidth() == 0 || getHeight() == 0) {
            return;
        }
        int[] iArr = this.colors;
        if (iArr.length == 0) {
            return;
        }
        if (iArr.length == 1) {
            this.paint.setShader(null);
            this.paint.setColor(this.colors[0]);
            return;
        }
        double radians = Math.toRadians(((double) this.angleDegrees) - ((double) 90));
        float fCos = (float) Math.cos(radians);
        float fSin = (float) Math.sin(radians);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float fHypot = ((float) Math.hypot(getWidth(), getHeight())) * 0.5f;
        float f2 = fCos * fHypot;
        float f7 = width - f2;
        float f10 = fSin * fHypot;
        float f11 = height - f10;
        float f12 = width + f2;
        float f13 = height + f10;
        int length = this.colors.length;
        float[] fArr = new float[length];
        for (int i7 = 0; i7 < length; i7++) {
            fArr[i7] = i7 / (this.colors.length - 1);
        }
        LinearGradient linearGradient = new LinearGradient(f7, f11, f12, f13, this.colors, fArr, Shader.TileMode.CLAMP);
        this.shader = linearGradient;
        this.paint.setShader(linearGradient);
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        RectF rectF = this.rect;
        float f2 = this.cornerRadiusPx;
        canvas.drawRoundRect(rectF, f2, f2, this.paint);
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int iDpToPx = (int) PixelUtil.INSTANCE.dpToPx(54.0f);
        int iMin = Math.min(View.resolveSize(iDpToPx, widthMeasureSpec), View.resolveSize(iDpToPx, heightMeasureSpec));
        setMeasuredDimension(iMin, iMin);
    }

    @Override // android.view.View
    public void onSizeChanged(int w5, int h6, int oldw, int oldh) {
        this.rect.set(0.0f, 0.0f, w5, h6);
        rebuildShader();
    }

    public final void setCornerRadiusDp(float radiusDp) {
        this.cornerRadiusPx = PixelUtil.INSTANCE.dpToPx(radiusDp);
        invalidate();
    }

    public final void setGradientAngle(float angleDeg) {
        this.angleDegrees = angleDeg;
        rebuildShader();
        invalidate();
    }

    public final void setHexColors(@NotNull List<String> hexColors) {
        Intrinsics.checkNotNullParameter(hexColors, "hexColors");
        ArrayList arrayList = new ArrayList(e0.l(hexColors, 10));
        Iterator<T> it = hexColors.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(Color.parseColor((String) it.next())));
        }
        this.colors = CollectionsKt.h0(arrayList);
        rebuildShader();
        invalidate();
    }

    public /* synthetic */ ThemePreviewView(Context context, AttributeSet attributeSet, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i7 & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThemePreviewView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.colors = new int[]{Color.parseColor("#ff6A00"), Color.parseColor("#ffD500")};
        this.cornerRadiusPx = PixelUtil.INSTANCE.dpToPx(8.0f);
        this.paint = new Paint(1);
        this.rect = new RectF();
    }
}

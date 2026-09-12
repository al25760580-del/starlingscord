package com.discord.chat.presentation.list;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Region;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\tJ\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0014R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/discord/chat/presentation/list/MaskedShadowView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", ViewProps.SHADOW_COLOR, "", "borderRadius", "", "shadowElevation", "path", "Landroid/graphics/Path;", "shadowPaint", "Landroid/graphics/Paint;", "setParams", "", "onDraw", "canvas", "Landroid/graphics/Canvas;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMaskedShadowView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MaskedShadowView.kt\ncom/discord/chat/presentation/list/MaskedShadowView\n+ 2 Color.kt\nandroidx/core/graphics/ColorKt\n*L\n1#1,83:1\n404#2:84\n404#2:85\n*S KotlinDebug\n*F\n+ 1 MaskedShadowView.kt\ncom/discord/chat/presentation/list/MaskedShadowView\n*L\n30#1:84\n41#1:85\n*E\n"})
public final class MaskedShadowView extends View {
    private float borderRadius;

    @NotNull
    private final Path path;

    @NotNull
    private String shadowColor;
    private float shadowElevation;

    @NotNull
    private final Paint shadowPaint;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MaskedShadowView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        if (getVisibility() != 0 || getWidth() == 0 || getHeight() == 0) {
            return;
        }
        this.path.reset();
        Path path = this.path;
        float width = getWidth();
        float height = getHeight();
        float f2 = this.borderRadius;
        path.addRoundRect(0.0f, 0.0f, width, height, f2, f2, Path.Direction.CW);
        if (Build.VERSION.SDK_INT >= 26) {
            canvas.clipOutPath(this.path);
        } else {
            canvas.clipPath(this.path, Region.Op.DIFFERENCE);
        }
        float f7 = this.shadowElevation / 2;
        float width2 = getWidth() + f7;
        float height2 = getHeight() + f7;
        float f10 = this.borderRadius;
        canvas.drawRoundRect(-f7, 0.0f, width2, height2, f10, f10, this.shadowPaint);
    }

    public final void setParams(float shadowElevation, float borderRadius, @NotNull String shadowColor) {
        Intrinsics.checkNotNullParameter(shadowColor, "shadowColor");
        this.borderRadius = borderRadius;
        this.shadowElevation = shadowElevation;
        this.shadowColor = shadowColor;
        this.shadowPaint.setShadowLayer(shadowElevation, 0.0f, shadowElevation / 2, Color.parseColor(shadowColor));
        invalidate();
    }

    public /* synthetic */ MaskedShadowView(Context context, AttributeSet attributeSet, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i7 & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaskedShadowView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.shadowColor = "#28000000";
        this.shadowElevation = SizeUtilsKt.getDpToPx(10);
        this.path = new Path();
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(0);
        float f2 = this.shadowElevation;
        paint.setShadowLayer(f2, 0.0f, f2 / 2, Color.parseColor(this.shadowColor));
        this.shadowPaint = paint;
    }
}

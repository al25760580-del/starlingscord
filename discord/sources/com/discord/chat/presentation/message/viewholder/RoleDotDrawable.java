package com.discord.chat.presentation.message.viewholder;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.discord.chat.bridge.rolecolors.RoleColors;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.react.FontManager;
import com.facebook.react.uimanager.ViewProps;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0005H\u0016J\u0012\u0010\u0016\u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0005H\u0017J\u000e\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u001bR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/discord/chat/presentation/message/viewholder/RoleDotDrawable;", "Landroid/graphics/drawable/Drawable;", "context", "Landroid/content/Context;", ViewProps.BORDER_COLOR, "", "spSize", "<init>", "(Landroid/content/Context;II)V", "scale", "", "pxSize", "borderColorPaint", "Landroid/graphics/Paint;", "roleColorAlphaPaint", "roleColorPaint", "draw", "", "canvas", "Landroid/graphics/Canvas;", "setAlpha", "p0", "setColorFilter", "Landroid/graphics/ColorFilter;", "getOpacity", "setColors", "roleColors", "Lcom/discord/chat/bridge/rolecolors/RoleColors;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RoleDotDrawable extends Drawable {

    @NotNull
    private final Paint borderColorPaint;
    private final float pxSize;

    @NotNull
    private final Paint roleColorAlphaPaint;

    @NotNull
    private final Paint roleColorPaint;
    private final float scale;

    public /* synthetic */ RoleDotDrawable(Context context, int i7, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, i7, (i11 & 4) != 0 ? 20 : i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        float f2 = this.pxSize;
        float f7 = 2;
        float f10 = ((f2 / f7) + f7) / f7;
        canvas.drawCircle(f2 / f7, f2 / f7, f10, this.borderColorPaint);
        float f11 = this.pxSize;
        canvas.drawCircle(f11 / f7, f11 / f7, f10, this.roleColorAlphaPaint);
        float f12 = this.pxSize;
        canvas.drawCircle(f12 / f7, f12 / f7, f10 - f7, this.roleColorPaint);
    }

    @Override // android.graphics.drawable.Drawable
    @rn.d
    public int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int p3) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter p3) {
    }

    public final void setColors(@NotNull RoleColors roleColors) {
        Intrinsics.checkNotNullParameter(roleColors, "roleColors");
        if (roleColors.getSecondaryColor() != null) {
            ArrayList arrayListI = d0.i(Integer.valueOf(roleColors.getPrimaryColor()), roleColors.getSecondaryColor());
            if (roleColors.getTertiaryColor() != null) {
                arrayListI.add(roleColors.getTertiaryColor());
            }
            float f2 = 2;
            float f7 = this.pxSize / f2;
            float f10 = f7 / f2;
            this.roleColorPaint.setShader(new LinearGradient(f10, 0.0f, f10 + f7 + f2, 0.0f, CollectionsKt.h0(arrayListI), (float[]) null, Shader.TileMode.MIRROR));
        } else {
            this.roleColorPaint.setShader(null);
            this.roleColorPaint.setColor(Color.argb(255, Color.red(roleColors.getPrimaryColor()), Color.green(roleColors.getPrimaryColor()), Color.blue(roleColors.getPrimaryColor())));
        }
        this.roleColorAlphaPaint.setColor(Color.argb(102, Color.red(roleColors.getPrimaryColor()), Color.green(roleColors.getPrimaryColor()), Color.blue(roleColors.getPrimaryColor())));
    }

    public RoleDotDrawable(@NotNull Context context, int i7, int i10) {
        Intrinsics.checkNotNullParameter(context, "context");
        float fontScale = FontManager.INSTANCE.getFontScale(context);
        this.scale = fontScale;
        this.pxSize = SizeUtilsKt.getSpToPx(i10) * fontScale;
        Paint paint = new Paint();
        paint.setColor(Color.argb(255, Color.red(i7), Color.green(i7), Color.blue(i7)));
        paint.setAntiAlias(true);
        this.borderColorPaint = paint;
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        this.roleColorAlphaPaint = paint2;
        Paint paint3 = new Paint();
        paint3.setAntiAlias(true);
        this.roleColorPaint = paint3;
    }
}

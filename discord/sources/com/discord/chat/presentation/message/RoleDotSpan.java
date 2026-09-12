package com.discord.chat.presentation.message;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.PaintDrawable;
import android.text.style.DynamicDrawableSpan;
import com.discord.chat.bridge.rolecolors.RoleColors;
import com.discord.chat.presentation.message.viewholder.RoleDotDrawable;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.react.FontManager;
import com.discord.theme.R;
import com.discord.theme.utils.ColorUtilsKt;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/discord/chat/presentation/message/RoleDotSpan;", "Landroid/text/style/DynamicDrawableSpan;", "context", "Landroid/content/Context;", ViewProps.BACKGROUND_COLOR, "", "spSize", "<init>", "(Landroid/content/Context;II)V", "scale", "", "pxSize", ViewProps.BORDER_COLOR, "roleDot", "Lcom/discord/chat/presentation/message/viewholder/RoleDotDrawable;", "backgroundDrawable", "Landroid/graphics/drawable/PaintDrawable;", "layerDrawable", "Landroid/graphics/drawable/LayerDrawable;", "getDrawable", "Landroid/graphics/drawable/Drawable;", "setColors", "", "roleColors", "Lcom/discord/chat/bridge/rolecolors/RoleColors;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RoleDotSpan extends DynamicDrawableSpan {

    @NotNull
    private final PaintDrawable backgroundDrawable;
    private final int borderColor;

    @NotNull
    private final LayerDrawable layerDrawable;
    private final int pxSize;

    @NotNull
    private final RoleDotDrawable roleDot;
    private final float scale;

    public /* synthetic */ RoleDotSpan(Context context, int i7, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, i7, (i11 & 4) != 0 ? 20 : i10);
    }

    @Override // android.text.style.DynamicDrawableSpan
    @NotNull
    public Drawable getDrawable() {
        LayerDrawable layerDrawable = this.layerDrawable;
        int i7 = this.pxSize;
        layerDrawable.setBounds(0, 0, i7, i7);
        return this.layerDrawable;
    }

    public final void setColors(@NotNull RoleColors roleColors) {
        Intrinsics.checkNotNullParameter(roleColors, "roleColors");
        this.roleDot.setColors(roleColors);
    }

    public RoleDotSpan(@NotNull Context context, int i7, int i10) {
        Intrinsics.checkNotNullParameter(context, "context");
        float fontScale = FontManager.INSTANCE.getFontScale(context);
        this.scale = fontScale;
        this.pxSize = (int) (SizeUtilsKt.getSpToPx(i10) * fontScale);
        int themeColor = ColorUtilsKt.getThemeColor(context, R.color.black, R.color.white);
        this.borderColor = themeColor;
        RoleDotDrawable roleDotDrawable = new RoleDotDrawable(context, themeColor, i10);
        this.roleDot = roleDotDrawable;
        PaintDrawable paintDrawable = new PaintDrawable(i7);
        paintDrawable.setCornerRadius(SizeUtilsKt.getDpToPx(4));
        this.backgroundDrawable = paintDrawable;
        this.layerDrawable = new LayerDrawable(new Drawable[]{paintDrawable, roleDotDrawable});
    }
}

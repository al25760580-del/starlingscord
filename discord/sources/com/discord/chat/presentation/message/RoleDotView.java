package com.discord.chat.presentation.message;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import com.discord.chat.bridge.rolecolors.RoleColors;
import com.discord.chat.databinding.RoleDotViewBinding;
import com.discord.chat.presentation.message.viewholder.RoleDotDrawable;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.misc.utilities.view.ViewBackgroundUtilsKt;
import com.discord.theme.R;
import com.discord.theme.ThemeManagerKt;
import com.discord.theme.utils.ColorUtilsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/discord/chat/presentation/message/RoleDotView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/discord/chat/databinding/RoleDotViewBinding;", "configure", "", "roleColors", "Lcom/discord/chat/bridge/rolecolors/RoleColors;", "spSize", "", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RoleDotView extends FrameLayout {

    @NotNull
    private final RoleDotViewBinding binding;

    public /* synthetic */ RoleDotView(Context context, AttributeSet attributeSet, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i7 & 2) != 0 ? null : attributeSet);
    }

    public static /* synthetic */ void configure$default(RoleDotView roleDotView, RoleColors roleColors, int i7, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i7 = 20;
        }
        roleDotView.configure(roleColors, i7);
    }

    public final void configure(@NotNull RoleColors roleColors, int spSize) {
        Intrinsics.checkNotNullParameter(roleColors, "roleColors");
        FrameLayout roleDotViewBackground = this.binding.roleDotViewBackground;
        Intrinsics.checkNotNullExpressionValue(roleDotViewBackground, "roleDotViewBackground");
        ViewBackgroundUtilsKt.setBackgroundRectangle$default(roleDotViewBackground, ThemeManagerKt.getTheme().getBackgroundModNormal(), SizeUtilsKt.getDpToPx(4), null, 0, 12, null);
        int colorCompat = ColorUtilsKt.getColorCompat(this, ThemeManagerKt.getTheme().getColorRes(R.color.black, R.color.white));
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        RoleDotDrawable roleDotDrawable = new RoleDotDrawable(context, colorCompat, spSize);
        roleDotDrawable.setColors(roleColors);
        this.binding.roleDotViewDot.setImageDrawable(roleDotDrawable);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoleDotView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        RoleDotViewBinding roleDotViewBindingInflate = RoleDotViewBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(roleDotViewBindingInflate, "inflate(...)");
        this.binding = roleDotViewBindingInflate;
    }
}

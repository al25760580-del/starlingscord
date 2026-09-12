package com.discord.chat.presentation.message.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.discord.SetTextSizeSpKt;
import com.discord.chat.databinding.GuildViewBinding;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.image.fresco.SetImageUriWithCachePolicyKt;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.misc.utilities.view.ViewClippingUtilsKt;
import com.discord.theme.R;
import com.discord.theme.utils.ColorUtilsKt;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJE\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\r2\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u0016R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/discord/chat/presentation/message/view/GuildView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/discord/chat/databinding/GuildViewBinding;", "boundIconUrl", "", "boundShortGuildName", "configure", "", "iconUrl", "shortGuildName", "thumbnailBackgroundColor", "borderRadiusDp", "thumbnailTextColor", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nGuildView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GuildView.kt\ncom/discord/chat/presentation/message/view/GuildView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,69:1\n257#2,2:70\n257#2,2:72\n257#2,2:74\n257#2,2:76\n*S KotlinDebug\n*F\n+ 1 GuildView.kt\ncom/discord/chat/presentation/message/view/GuildView\n*L\n50#1:70,2\n51#1:72,2\n59#1:74,2\n60#1:76,2\n*E\n"})
public final class GuildView extends FrameLayout {

    @NotNull
    private final GuildViewBinding binding;
    private String boundIconUrl;
    private String boundShortGuildName;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GuildView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static /* synthetic */ void configure$default(GuildView guildView, String str, String str2, Integer num, Integer num2, Integer num3, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            str2 = null;
        }
        if ((i7 & 8) != 0) {
            num2 = null;
        }
        if ((i7 & 16) != 0) {
            num3 = null;
        }
        guildView.configure(str, str2, num, num2, num3);
    }

    public final void configure(String iconUrl, String shortGuildName, Integer thumbnailBackgroundColor, Integer borderRadiusDp, Integer thumbnailTextColor) {
        int colorCompat;
        if (Intrinsics.areEqual(this.boundIconUrl, iconUrl) && Intrinsics.areEqual(this.boundShortGuildName, shortGuildName)) {
            return;
        }
        this.boundIconUrl = iconUrl;
        this.boundShortGuildName = shortGuildName;
        if (iconUrl == null || StringsKt.K(iconUrl)) {
            SimpleDraweeView guildAvatar = this.binding.guildAvatar;
            Intrinsics.checkNotNullExpressionValue(guildAvatar, "guildAvatar");
            guildAvatar.setVisibility(8);
            TextView guildText = this.binding.guildText;
            Intrinsics.checkNotNullExpressionValue(guildText, "guildText");
            guildText.setVisibility(0);
            this.binding.guildText.setText(shortGuildName);
            if (thumbnailBackgroundColor != null) {
                colorCompat = thumbnailBackgroundColor.intValue();
            } else {
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                colorCompat = ColorUtilsKt.getColorCompat(context, R.color.brand);
            }
            setBackgroundColor(colorCompat);
            this.binding.guildText.setTextColor(thumbnailTextColor != null ? thumbnailTextColor.intValue() : -1);
        } else {
            SimpleDraweeView guildAvatar2 = this.binding.guildAvatar;
            Intrinsics.checkNotNullExpressionValue(guildAvatar2, "guildAvatar");
            guildAvatar2.setVisibility(0);
            TextView guildText2 = this.binding.guildText;
            Intrinsics.checkNotNullExpressionValue(guildText2, "guildText");
            guildText2.setVisibility(8);
            SimpleDraweeView guildAvatar3 = this.binding.guildAvatar;
            Intrinsics.checkNotNullExpressionValue(guildAvatar3, "guildAvatar");
            SetImageUriWithCachePolicyKt.setImageUriWithCachePolicy(guildAvatar3, iconUrl);
            setBackgroundColor(thumbnailBackgroundColor != null ? thumbnailBackgroundColor.intValue() : 0);
        }
        View root = this.binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        ViewClippingUtilsKt.clipToRoundedRectangle(root, SizeUtilsKt.getDpToPx(borderRadiusDp != null ? borderRadiusDp.intValue() : 16));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GuildView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ GuildView(Context context, AttributeSet attributeSet, int i7, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet, (i10 & 4) != 0 ? 0 : i7);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GuildView(@NotNull Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        GuildViewBinding guildViewBindingInflate = GuildViewBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(guildViewBindingInflate, "inflate(...)");
        this.binding = guildViewBindingInflate;
        View root = guildViewBindingInflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        ViewClippingUtilsKt.clipToRoundedRectangle(root, SizeUtilsKt.getDpToPx(16));
        TextView textView = guildViewBindingInflate.guildText;
        Intrinsics.checkNotNull(textView);
        SetTextSizeSpKt.setTextSizeSp(textView, 14.0f);
        DiscordFontUtilsKt.setDiscordFont(textView, DiscordFont.PrimaryNormal);
    }
}

package com.discord.chat.presentation.message.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.discord.chat.bridge.Message;
import com.discord.chat.bridge.channelprompt.ChannelPromptData;
import com.discord.chat.databinding.ChannelPromptActionsViewBinding;
import com.discord.core.DCDButton;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.theme.ThemeManagerKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J.\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000fR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/discord/chat/presentation/message/view/ChannelPromptActionsView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/discord/chat/databinding/ChannelPromptActionsViewBinding;", "configure", "", "message", "Lcom/discord/chat/bridge/Message;", "onTapCameraButton", "Landroid/view/View$OnClickListener;", "onTapEmojiButton", "onTapGamingStatsButton", "onTapGifButton", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nChannelPromptActionsView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChannelPromptActionsView.kt\ncom/discord/chat/presentation/message/view/ChannelPromptActionsView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,75:1\n257#2,2:76\n257#2,2:78\n257#2,2:80\n257#2,2:82\n257#2,2:84\n257#2,2:86\n257#2,2:88\n257#2,2:90\n*S KotlinDebug\n*F\n+ 1 ChannelPromptActionsView.kt\ncom/discord/chat/presentation/message/view/ChannelPromptActionsView\n*L\n31#1:76,2\n33#1:78,2\n43#1:80,2\n45#1:82,2\n55#1:84,2\n57#1:86,2\n66#1:88,2\n68#1:90,2\n*E\n"})
public final class ChannelPromptActionsView extends LinearLayout {

    @NotNull
    private final ChannelPromptActionsViewBinding binding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChannelPromptActionsView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void configure(@NotNull Message message, @NotNull View.OnClickListener onTapCameraButton, @NotNull View.OnClickListener onTapEmojiButton, @NotNull View.OnClickListener onTapGamingStatsButton, @NotNull View.OnClickListener onTapGifButton) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(onTapCameraButton, "onTapCameraButton");
        Intrinsics.checkNotNullParameter(onTapEmojiButton, "onTapEmojiButton");
        Intrinsics.checkNotNullParameter(onTapGamingStatsButton, "onTapGamingStatsButton");
        Intrinsics.checkNotNullParameter(onTapGifButton, "onTapGifButton");
        DCDButton dCDButton = this.binding.cameraButton;
        ChannelPromptData channelPromptData = message.getChannelPromptData();
        if ((channelPromptData != null ? channelPromptData.getCameraButtonIcon() : null) != null) {
            dCDButton.setIcon(message.getChannelPromptData().getCameraButtonIcon(), SizeUtilsKt.getDpToPx(24));
            dCDButton.setText(message.getChannelPromptData().getCameraButtonText());
            Intrinsics.checkNotNull(dCDButton);
            dCDButton.setVisibility(0);
        } else {
            Intrinsics.checkNotNull(dCDButton);
            dCDButton.setVisibility(8);
        }
        dCDButton.setBackgroundColor(ThemeManagerKt.getTheme().getMobileLegacyButtonSecondaryBackgroundDefault());
        dCDButton.setOnClickButtonListener(onTapCameraButton);
        DCDButton dCDButton2 = this.binding.gifButton;
        ChannelPromptData channelPromptData2 = message.getChannelPromptData();
        if ((channelPromptData2 != null ? channelPromptData2.getGifButtonIcon() : null) != null) {
            dCDButton2.setIcon(message.getChannelPromptData().getGifButtonIcon(), SizeUtilsKt.getDpToPx(24));
            dCDButton2.setText(message.getChannelPromptData().getGifButtonText());
            Intrinsics.checkNotNull(dCDButton2);
            dCDButton2.setVisibility(0);
        } else {
            Intrinsics.checkNotNull(dCDButton2);
            dCDButton2.setVisibility(8);
        }
        dCDButton2.setBackgroundColor(ThemeManagerKt.getTheme().getMobileLegacyButtonSecondaryBackgroundDefault());
        dCDButton2.setOnClickButtonListener(onTapGifButton);
        DCDButton dCDButton3 = this.binding.emojiButton;
        ChannelPromptData channelPromptData3 = message.getChannelPromptData();
        if ((channelPromptData3 != null ? channelPromptData3.getEmojiButtonIcon() : null) != null) {
            dCDButton3.setIcon(message.getChannelPromptData().getEmojiButtonIcon(), SizeUtilsKt.getDpToPx(24));
            dCDButton3.setText(message.getChannelPromptData().getEmojiButtonText());
            Intrinsics.checkNotNull(dCDButton3);
            dCDButton3.setVisibility(0);
        } else {
            Intrinsics.checkNotNull(dCDButton3);
            dCDButton3.setVisibility(8);
        }
        dCDButton3.setBackgroundColor(ThemeManagerKt.getTheme().getMobileLegacyButtonSecondaryBackgroundDefault());
        dCDButton3.setOnClickButtonListener(onTapEmojiButton);
        DCDButton dCDButton4 = this.binding.gamingStatsButton;
        ChannelPromptData channelPromptData4 = message.getChannelPromptData();
        if ((channelPromptData4 != null ? channelPromptData4.getGamingStatsButtonText() : null) != null) {
            dCDButton4.setText(message.getChannelPromptData().getGamingStatsButtonText());
            Intrinsics.checkNotNull(dCDButton4);
            dCDButton4.setVisibility(0);
        } else {
            Intrinsics.checkNotNull(dCDButton4);
            dCDButton4.setVisibility(8);
        }
        dCDButton4.setBackgroundColor(ThemeManagerKt.getTheme().getMobileLegacyButtonSecondaryBackgroundDefault());
        dCDButton4.setOnClickButtonListener(onTapGamingStatsButton);
    }

    public /* synthetic */ ChannelPromptActionsView(Context context, AttributeSet attributeSet, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i7 & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelPromptActionsView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        ChannelPromptActionsViewBinding channelPromptActionsViewBindingInflate = ChannelPromptActionsViewBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(channelPromptActionsViewBindingInflate, "inflate(...)");
        this.binding = channelPromptActionsViewBindingInflate;
    }
}

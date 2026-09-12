package com.discord.mobile_voice_overlay.views;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.mobile_voice_overlay.MobileVoiceOverlaySelectorResult;
import com.discord.mobile_voice_overlay.databinding.OverlayVoiceChannelSearchResultBinding;
import com.discord.primitives.ChannelId;
import com.discord.theme.ThemeManagerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u0012\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\rR\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/discord/mobile_voice_overlay/views/ResultViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "parent", "Landroid/view/ViewGroup;", "onChannelSelected", "Lkotlin/Function1;", "Lcom/discord/primitives/ChannelId;", "", "binding", "Lcom/discord/mobile_voice_overlay/databinding/OverlayVoiceChannelSearchResultBinding;", "<init>", "(Landroid/view/ViewGroup;Lkotlin/jvm/functions/Function1;Lcom/discord/mobile_voice_overlay/databinding/OverlayVoiceChannelSearchResultBinding;)V", "result", "Lcom/discord/mobile_voice_overlay/MobileVoiceOverlaySelectorResult;", "getResult", "()Lcom/discord/mobile_voice_overlay/MobileVoiceOverlaySelectorResult;", "setResult", "(Lcom/discord/mobile_voice_overlay/MobileVoiceOverlaySelectorResult;)V", "bind", "mobile_voice_overlay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nOverlayVoiceSelectorBubbleDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OverlayVoiceSelectorBubbleDialog.kt\ncom/discord/mobile_voice_overlay/views/ResultViewHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,203:1\n1#2:204\n*E\n"})
final class ResultViewHolder extends RecyclerView.ViewHolder {

    @NotNull
    private final OverlayVoiceChannelSearchResultBinding binding;

    @NotNull
    private final Function1<ChannelId, Unit> onChannelSelected;
    private MobileVoiceOverlaySelectorResult result;

    public /* synthetic */ ResultViewHolder(ViewGroup viewGroup, Function1 function1, OverlayVoiceChannelSearchResultBinding overlayVoiceChannelSearchResultBinding, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(viewGroup, function1, (i7 & 4) != 0 ? OverlayVoiceChannelSearchResultBinding.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false) : overlayVoiceChannelSearchResultBinding);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(ResultViewHolder resultViewHolder, View view) {
        MobileVoiceOverlaySelectorResult mobileVoiceOverlaySelectorResult = resultViewHolder.result;
        if (mobileVoiceOverlaySelectorResult != null) {
            resultViewHolder.onChannelSelected.invoke(ChannelId.m1130boximpl(mobileVoiceOverlaySelectorResult.m1040getChannelIdo4g7jtM()));
        }
    }

    public final void bind(@NotNull MobileVoiceOverlaySelectorResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.result = result;
        this.binding.channelName.setText(result.getChannelName());
        this.binding.categoryName.setText(result.getCategoryName());
        this.binding.guildName.setText(result.getGuildName());
    }

    public final MobileVoiceOverlaySelectorResult getResult() {
        return this.result;
    }

    public final void setResult(MobileVoiceOverlaySelectorResult mobileVoiceOverlaySelectorResult) {
        this.result = mobileVoiceOverlaySelectorResult;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ResultViewHolder(@NotNull ViewGroup parent, @NotNull Function1<? super ChannelId, Unit> onChannelSelected, @NotNull OverlayVoiceChannelSearchResultBinding binding) {
        super(binding.getRoot());
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(onChannelSelected, "onChannelSelected");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.onChannelSelected = onChannelSelected;
        this.binding = binding;
        binding.container.setOnClickListener(new e(0, this));
        TextView textView = binding.channelName;
        Intrinsics.checkNotNull(textView);
        DiscordFontUtilsKt.setDiscordFont(textView, DiscordFont.PrimarySemibold);
        textView.setTextColor(ThemeManagerKt.getTheme().getMobileTextHeadingPrimary());
        TextView textView2 = binding.categoryName;
        Intrinsics.checkNotNull(textView2);
        DiscordFont discordFont = DiscordFont.PrimaryMedium;
        DiscordFontUtilsKt.setDiscordFont(textView2, discordFont);
        textView2.setTextColor(ThemeManagerKt.getTheme().getTextSubtle());
        TextView textView3 = binding.guildName;
        Intrinsics.checkNotNull(textView3);
        DiscordFontUtilsKt.setDiscordFont(textView3, discordFont);
        textView3.setTextColor(ThemeManagerKt.getTheme().getTextSubtle());
    }
}

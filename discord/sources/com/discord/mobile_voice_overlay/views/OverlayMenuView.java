package com.discord.mobile_voice_overlay.views;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.mobile_voice_overlay.ConnectionQuality;
import com.discord.mobile_voice_overlay.MobileVoiceOverlayAssets;
import com.discord.mobile_voice_overlay.MobileVoiceOverlayData;
import com.discord.mobile_voice_overlay.databinding.ViewOverlayMenuBinding;
import com.discord.react_asset_fetcher.ReactAsset;
import com.discord.react_asset_fetcher.ReactAssetUtilsKt;
import com.discord.theme.ThemeManagerKt;
import com.discord.theme.utils.ColorUtilsKt;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import rn.n;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\u000bJ\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0016R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/discord/mobile_voice_overlay/views/OverlayMenuView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "attributeSetId", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/discord/mobile_voice_overlay/databinding/ViewOverlayMenuBinding;", "getBinding", "()Lcom/discord/mobile_voice_overlay/databinding/ViewOverlayMenuBinding;", "assets", "Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayAssets;", "setAssets", "", "setData", "data", "Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayData;", "mobile_voice_overlay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nOverlayMenuView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OverlayMenuView.kt\ncom/discord/mobile_voice_overlay/views/OverlayMenuView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,82:1\n257#2,2:83\n*S KotlinDebug\n*F\n+ 1 OverlayMenuView.kt\ncom/discord/mobile_voice_overlay/views/OverlayMenuView\n*L\n66#1:83,2\n*E\n"})
public final class OverlayMenuView extends LinearLayout {
    private MobileVoiceOverlayAssets assets;

    @NotNull
    private final ViewOverlayMenuBinding binding;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ConnectionQuality.values().length];
            try {
                iArr[ConnectionQuality.Fine.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ConnectionQuality.Average.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ConnectionQuality.Bad.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ConnectionQuality.Unknown.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverlayMenuView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewOverlayMenuBinding viewOverlayMenuBindingInflate = ViewOverlayMenuBinding.inflate(LayoutInflater.from(getContext()), this);
        Intrinsics.checkNotNullExpressionValue(viewOverlayMenuBindingInflate, "inflate(...)");
        this.binding = viewOverlayMenuBindingInflate;
        TextView overlayGuildName = viewOverlayMenuBindingInflate.overlayGuildName;
        Intrinsics.checkNotNullExpressionValue(overlayGuildName, "overlayGuildName");
        DiscordFont discordFont = DiscordFont.PrimarySemibold;
        DiscordFontUtilsKt.setDiscordFont(overlayGuildName, discordFont);
        TextView overlayInviteLink = viewOverlayMenuBindingInflate.overlayInviteLink;
        Intrinsics.checkNotNullExpressionValue(overlayInviteLink, "overlayInviteLink");
        DiscordFontUtilsKt.setDiscordFont(overlayInviteLink, discordFont);
        TextView overlaySwitchChannels = viewOverlayMenuBindingInflate.overlaySwitchChannels;
        Intrinsics.checkNotNullExpressionValue(overlaySwitchChannels, "overlaySwitchChannels");
        DiscordFontUtilsKt.setDiscordFont(overlaySwitchChannels, discordFont);
        TextView overlayOpenApp = viewOverlayMenuBindingInflate.overlayOpenApp;
        Intrinsics.checkNotNullExpressionValue(overlayOpenApp, "overlayOpenApp");
        DiscordFontUtilsKt.setDiscordFont(overlayOpenApp, discordFont);
        viewOverlayMenuBindingInflate.menuTop.setCardBackgroundColor(ThemeManagerKt.getTheme().getBackgroundSurfaceHigh());
        viewOverlayMenuBindingInflate.menuTopStatusContainer.setBackgroundColor(ThemeManagerKt.getTheme().getBackgroundBaseLowest());
        viewOverlayMenuBindingInflate.menuTopStatusContainer.setBackgroundTintList(ColorStateList.valueOf(ThemeManagerKt.getTheme().getBackgroundBaseLowest()));
        viewOverlayMenuBindingInflate.menuBottom.setCardBackgroundColor(ThemeManagerKt.getTheme().getBackgroundBaseLowest());
        viewOverlayMenuBindingInflate.overlayInviteLink.setTextColor(ThemeManagerKt.getTheme().getInteractiveTextDefault());
        viewOverlayMenuBindingInflate.overlaySwitchChannels.setTextColor(ThemeManagerKt.getTheme().getInteractiveTextDefault());
        viewOverlayMenuBindingInflate.overlayOpenApp.setTextColor(ThemeManagerKt.getTheme().getInteractiveTextDefault());
        viewOverlayMenuBindingInflate.overlayGuildName.setTextColor(ThemeManagerKt.getTheme().getMobileTextHeadingPrimary());
        viewOverlayMenuBindingInflate.overlayChannelName.setTextColor(ThemeManagerKt.getTheme().getTextMuted());
    }

    @NotNull
    public final ViewOverlayMenuBinding getBinding() {
        return this.binding;
    }

    public final void setAssets(@NotNull MobileVoiceOverlayAssets assets) {
        Intrinsics.checkNotNullParameter(assets, "assets");
        this.assets = assets;
        SimpleDraweeView simpleDraweeView = this.binding.muteToggle;
        simpleDraweeView.setContentDescription(assets.getMute());
        Intrinsics.checkNotNull(simpleDraweeView);
        ReactAssetUtilsKt.setReactAsset(simpleDraweeView, ReactAsset.MicrophoneIcon);
        ColorUtilsKt.setTintColor(simpleDraweeView, Integer.valueOf(ThemeManagerKt.getTheme().getInteractiveTextDefault()));
        SimpleDraweeView simpleDraweeView2 = this.binding.disconnectBtn;
        simpleDraweeView2.setContentDescription(assets.getDisconnectFromVoice());
        Intrinsics.checkNotNull(simpleDraweeView2);
        ReactAssetUtilsKt.setReactAsset(simpleDraweeView2, ReactAsset.PhoneHangUpIcon);
        ColorUtilsKt.setTintColor(simpleDraweeView2, Integer.valueOf(ThemeManagerKt.getTheme().getInteractiveTextDefault()));
        this.binding.overlayInviteLink.setText(assets.getGetInvite());
        this.binding.overlaySwitchChannels.setText(assets.getSwitchChannels());
        this.binding.overlayOpenApp.setText(assets.getOpenDiscord());
    }

    public final void setData(@NotNull MobileVoiceOverlayData data) {
        ReactAsset reactAsset;
        Intrinsics.checkNotNullParameter(data, "data");
        TextView overlayInviteLink = this.binding.overlayInviteLink;
        Intrinsics.checkNotNullExpressionValue(overlayInviteLink, "overlayInviteLink");
        overlayInviteLink.setVisibility(data.getCanGenerateInvite() ? 0 : 8);
        SimpleDraweeView muteToggle = this.binding.muteToggle;
        Intrinsics.checkNotNullExpressionValue(muteToggle, "muteToggle");
        ReactAssetUtilsKt.setReactAsset(muteToggle, data.getMuted() ? ReactAsset.MicrophoneSlashIcon : ReactAsset.MicrophoneIcon);
        SimpleDraweeView overlayNetworkIcon = this.binding.overlayNetworkIcon;
        Intrinsics.checkNotNullExpressionValue(overlayNetworkIcon, "overlayNetworkIcon");
        int i7 = WhenMappings.$EnumSwitchMapping$0[data.getConnectionQuality().ordinal()];
        if (i7 == 1) {
            reactAsset = ReactAsset.ConnectionFineIcon;
        } else if (i7 == 2) {
            reactAsset = ReactAsset.ConnectionAverageIcon;
        } else if (i7 == 3) {
            reactAsset = ReactAsset.ConnectionBadIcon;
        } else {
            if (i7 != 4) {
                throw new n();
            }
            reactAsset = ReactAsset.ConnectionUnknownIcon;
        }
        ReactAssetUtilsKt.setReactAsset(overlayNetworkIcon, reactAsset);
        this.binding.overlayGuildName.setText(data.getGuildName());
        this.binding.overlayChannelName.setText(data.getChannelName());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverlayMenuView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewOverlayMenuBinding viewOverlayMenuBindingInflate = ViewOverlayMenuBinding.inflate(LayoutInflater.from(getContext()), this);
        Intrinsics.checkNotNullExpressionValue(viewOverlayMenuBindingInflate, "inflate(...)");
        this.binding = viewOverlayMenuBindingInflate;
        TextView overlayGuildName = viewOverlayMenuBindingInflate.overlayGuildName;
        Intrinsics.checkNotNullExpressionValue(overlayGuildName, "overlayGuildName");
        DiscordFont discordFont = DiscordFont.PrimarySemibold;
        DiscordFontUtilsKt.setDiscordFont(overlayGuildName, discordFont);
        TextView overlayInviteLink = viewOverlayMenuBindingInflate.overlayInviteLink;
        Intrinsics.checkNotNullExpressionValue(overlayInviteLink, "overlayInviteLink");
        DiscordFontUtilsKt.setDiscordFont(overlayInviteLink, discordFont);
        TextView overlaySwitchChannels = viewOverlayMenuBindingInflate.overlaySwitchChannels;
        Intrinsics.checkNotNullExpressionValue(overlaySwitchChannels, "overlaySwitchChannels");
        DiscordFontUtilsKt.setDiscordFont(overlaySwitchChannels, discordFont);
        TextView overlayOpenApp = viewOverlayMenuBindingInflate.overlayOpenApp;
        Intrinsics.checkNotNullExpressionValue(overlayOpenApp, "overlayOpenApp");
        DiscordFontUtilsKt.setDiscordFont(overlayOpenApp, discordFont);
        viewOverlayMenuBindingInflate.menuTop.setCardBackgroundColor(ThemeManagerKt.getTheme().getBackgroundSurfaceHigh());
        viewOverlayMenuBindingInflate.menuTopStatusContainer.setBackgroundColor(ThemeManagerKt.getTheme().getBackgroundBaseLowest());
        viewOverlayMenuBindingInflate.menuTopStatusContainer.setBackgroundTintList(ColorStateList.valueOf(ThemeManagerKt.getTheme().getBackgroundBaseLowest()));
        viewOverlayMenuBindingInflate.menuBottom.setCardBackgroundColor(ThemeManagerKt.getTheme().getBackgroundBaseLowest());
        viewOverlayMenuBindingInflate.overlayInviteLink.setTextColor(ThemeManagerKt.getTheme().getInteractiveTextDefault());
        viewOverlayMenuBindingInflate.overlaySwitchChannels.setTextColor(ThemeManagerKt.getTheme().getInteractiveTextDefault());
        viewOverlayMenuBindingInflate.overlayOpenApp.setTextColor(ThemeManagerKt.getTheme().getInteractiveTextDefault());
        viewOverlayMenuBindingInflate.overlayGuildName.setTextColor(ThemeManagerKt.getTheme().getMobileTextHeadingPrimary());
        viewOverlayMenuBindingInflate.overlayChannelName.setTextColor(ThemeManagerKt.getTheme().getTextMuted());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverlayMenuView(@NotNull Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewOverlayMenuBinding viewOverlayMenuBindingInflate = ViewOverlayMenuBinding.inflate(LayoutInflater.from(getContext()), this);
        Intrinsics.checkNotNullExpressionValue(viewOverlayMenuBindingInflate, "inflate(...)");
        this.binding = viewOverlayMenuBindingInflate;
        TextView overlayGuildName = viewOverlayMenuBindingInflate.overlayGuildName;
        Intrinsics.checkNotNullExpressionValue(overlayGuildName, "overlayGuildName");
        DiscordFont discordFont = DiscordFont.PrimarySemibold;
        DiscordFontUtilsKt.setDiscordFont(overlayGuildName, discordFont);
        TextView overlayInviteLink = viewOverlayMenuBindingInflate.overlayInviteLink;
        Intrinsics.checkNotNullExpressionValue(overlayInviteLink, "overlayInviteLink");
        DiscordFontUtilsKt.setDiscordFont(overlayInviteLink, discordFont);
        TextView overlaySwitchChannels = viewOverlayMenuBindingInflate.overlaySwitchChannels;
        Intrinsics.checkNotNullExpressionValue(overlaySwitchChannels, "overlaySwitchChannels");
        DiscordFontUtilsKt.setDiscordFont(overlaySwitchChannels, discordFont);
        TextView overlayOpenApp = viewOverlayMenuBindingInflate.overlayOpenApp;
        Intrinsics.checkNotNullExpressionValue(overlayOpenApp, "overlayOpenApp");
        DiscordFontUtilsKt.setDiscordFont(overlayOpenApp, discordFont);
        viewOverlayMenuBindingInflate.menuTop.setCardBackgroundColor(ThemeManagerKt.getTheme().getBackgroundSurfaceHigh());
        viewOverlayMenuBindingInflate.menuTopStatusContainer.setBackgroundColor(ThemeManagerKt.getTheme().getBackgroundBaseLowest());
        viewOverlayMenuBindingInflate.menuTopStatusContainer.setBackgroundTintList(ColorStateList.valueOf(ThemeManagerKt.getTheme().getBackgroundBaseLowest()));
        viewOverlayMenuBindingInflate.menuBottom.setCardBackgroundColor(ThemeManagerKt.getTheme().getBackgroundBaseLowest());
        viewOverlayMenuBindingInflate.overlayInviteLink.setTextColor(ThemeManagerKt.getTheme().getInteractiveTextDefault());
        viewOverlayMenuBindingInflate.overlaySwitchChannels.setTextColor(ThemeManagerKt.getTheme().getInteractiveTextDefault());
        viewOverlayMenuBindingInflate.overlayOpenApp.setTextColor(ThemeManagerKt.getTheme().getInteractiveTextDefault());
        viewOverlayMenuBindingInflate.overlayGuildName.setTextColor(ThemeManagerKt.getTheme().getMobileTextHeadingPrimary());
        viewOverlayMenuBindingInflate.overlayChannelName.setTextColor(ThemeManagerKt.getTheme().getTextMuted());
    }
}

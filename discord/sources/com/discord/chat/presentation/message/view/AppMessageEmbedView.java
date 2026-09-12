package com.discord.chat.presentation.message.view;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.discord.SetTextSizeSpKt;
import com.discord.chat.bridge.codedlinks.AppMessageActionImpl;
import com.discord.chat.bridge.codedlinks.AppMessageEmbedDisplayType;
import com.discord.chat.bridge.codedlinks.AppMessageEmbedImpl;
import com.discord.chat.databinding.AppMessageEmbedViewBinding;
import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.chat.presentation.media.MediaContainingViewResizer;
import com.discord.chat.presentation.message.messagepart.MessageMargins;
import com.discord.core.DCDButton;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.image.fresco.SetImageUriWithCachePolicyKt;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.misc.utilities.view.ViewBackgroundUtilsKt;
import com.discord.overlapping_circles.OverlappingCirclesView;
import com.discord.react_asset_fetcher.ReactAsset;
import com.discord.react_asset_fetcher.ReactAssetExtensionsKt;
import com.discord.react_asset_fetcher.ReactAssetUtilsKt;
import com.discord.react_strings.I18nMessage;
import com.discord.react_strings.I18nUtilsKt;
import com.discord.theme.R;
import com.discord.theme.ThemeManagerKt;
import com.discord.theme.utils.ColorUtilsKt;
import com.facebook.drawee.view.SimpleDraweeView;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ&\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0007J(\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0007H\u0002J#\u0010\u001d\u001a\u0004\u0018\u00010\u00072\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00070\u001fH\u0002¢\u0006\u0002\u0010!J\u0010\u0010\"\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020#H\u0002J\u0018\u0010$\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020#2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J \u0010%\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010&\u001a\u00020 H\u0002R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/discord/chat/presentation/message/view/AppMessageEmbedView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "view", "Lcom/discord/chat/databinding/AppMessageEmbedViewBinding;", "getView", "()Lcom/discord/chat/databinding/AppMessageEmbedViewBinding;", "setView", "(Lcom/discord/chat/databinding/AppMessageEmbedViewBinding;)V", "gradientDrawable", "Landroid/graphics/drawable/GradientDrawable;", "textColor", "initView", "", "margins", "Lcom/discord/chat/presentation/message/messagepart/MessageMargins;", "data", "Lcom/discord/chat/bridge/codedlinks/AppMessageEmbedImpl;", "eventHandler", "Lcom/discord/chat/presentation/events/ChatEventHandler;", "constrainedWidth", "configureNormalCard", "rgbToColorInt", "map", "", "", "(Ljava/util/Map;)Ljava/lang/Integer;", "setDefaultBackground", "Landroid/view/View;", "setBackgroundGradient", "handleTap", "actionId", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAppMessageEmbedView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppMessageEmbedView.kt\ncom/discord/chat/presentation/message/view/AppMessageEmbedView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,319:1\n257#2,2:320\n257#2,2:322\n257#2,2:324\n257#2,2:326\n257#2,2:328\n257#2,2:330\n257#2,2:332\n257#2,2:334\n257#2,2:336\n257#2,2:338\n257#2,2:340\n257#2,2:342\n257#2,2:344\n257#2,2:346\n257#2,2:348\n257#2,2:350\n257#2,2:352\n257#2,2:354\n257#2,2:359\n257#2,2:361\n1878#3,3:356\n*S KotlinDebug\n*F\n+ 1 AppMessageEmbedView.kt\ncom/discord/chat/presentation/message/view/AppMessageEmbedView\n*L\n49#1:320,2\n50#1:322,2\n54#1:324,2\n58#1:326,2\n119#1:328,2\n120#1:330,2\n130#1:332,2\n133#1:334,2\n136#1:336,2\n137#1:338,2\n141#1:340,2\n157#1:342,2\n164#1:344,2\n171#1:346,2\n178#1:348,2\n179#1:350,2\n183#1:352,2\n188#1:354,2\n250#1:359,2\n252#1:361,2\n204#1:356,3\n*E\n"})
public final class AppMessageEmbedView extends ConstraintLayout {
    private GradientDrawable gradientDrawable;
    private final int textColor;

    @NotNull
    private AppMessageEmbedViewBinding view;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AppMessageEmbedDisplayType.values().length];
            try {
                iArr[AppMessageEmbedDisplayType.Blocked.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AppMessageEmbedDisplayType.Display.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AppMessageEmbedView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r23v1 */
    private final void configureNormalCard(MessageMargins margins, AppMessageEmbedImpl data, ChatEventHandler eventHandler, int constrainedWidth) {
        final AppMessageEmbedImpl appMessageEmbedImpl = data;
        final ChatEventHandler chatEventHandler = eventHandler;
        ConstraintLayout normalContainer = this.view.normalContainer;
        Intrinsics.checkNotNullExpressionValue(normalContainer, "normalContainer");
        setDefaultBackground(normalContainer);
        AppMessageEmbedViewBinding appMessageEmbedViewBinding = this.view;
        TextView textView = appMessageEmbedViewBinding.title;
        textView.setTextColor(this.textColor);
        Intrinsics.checkNotNull(textView);
        SetTextSizeSpKt.setTextSizeSp(textView, 12.0f);
        DiscordFontUtilsKt.setDiscordFont(textView, DiscordFont.PrimaryExtraBold);
        TextView textView2 = appMessageEmbedViewBinding.header;
        textView2.setTextColor(this.textColor);
        Intrinsics.checkNotNull(textView2);
        SetTextSizeSpKt.setTextSizeSp(textView2, 16.0f);
        DiscordFontUtilsKt.setDiscordFont(textView2, DiscordFont.PrimarySemibold);
        TextView textView3 = appMessageEmbedViewBinding.info;
        textView3.setTextColor(this.textColor);
        Intrinsics.checkNotNull(textView3);
        SetTextSizeSpKt.setTextSizeSp(textView3, 12.0f);
        DiscordFontUtilsKt.setDiscordFont(textView3, DiscordFont.PrimaryMedium);
        TextView textView4 = appMessageEmbedViewBinding.tagline;
        textView4.setTextColor(this.textColor);
        Intrinsics.checkNotNull(textView4);
        SetTextSizeSpKt.setTextSizeSp(textView4, 12.0f);
        DiscordFont discordFont = DiscordFont.PrimaryNormal;
        DiscordFontUtilsKt.setDiscordFont(textView4, discordFont);
        DCDButton dCDButton = appMessageEmbedViewBinding.linkIcon;
        Context context = dCDButton.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        dCDButton.setBackgroundColor(ColorUtilsKt.getColorCompat(context, R.color.transparent));
        ReactAsset reactAsset = ReactAsset.LinkIcon;
        Context context2 = dCDButton.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        dCDButton.setIcon(ReactAssetExtensionsKt.getUri(reactAsset, context2), SizeUtilsKt.getDpToPx(16));
        dCDButton.setTextColor(Integer.valueOf(this.textColor));
        Context context3 = dCDButton.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        I18nMessage i18nMessage = I18nMessage.COPY_LINK;
        dCDButton.setContentDescription(I18nUtilsKt.i18nFormat$default(context3, i18nMessage, null, 2, null));
        DCDButton dCDButton2 = appMessageEmbedViewBinding.linkIconTitle;
        Context context4 = dCDButton2.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        dCDButton2.setBackgroundColor(ColorUtilsKt.getColorCompat(context4, R.color.transparent));
        Context context5 = dCDButton2.getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
        dCDButton2.setIcon(ReactAssetExtensionsKt.getUri(reactAsset, context5), SizeUtilsKt.getDpToPx(16));
        dCDButton2.setTextColor(Integer.valueOf(this.textColor));
        Context context6 = dCDButton2.getContext();
        Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
        dCDButton2.setContentDescription(I18nUtilsKt.i18nFormat$default(context6, i18nMessage, null, 2, null));
        SimpleDraweeView simpleDraweeView = appMessageEmbedViewBinding.playerIcon;
        Intrinsics.checkNotNull(simpleDraweeView);
        ReactAssetUtilsKt.setReactAsset(simpleDraweeView, ReactAsset.GroupIcon);
        ColorUtilsKt.setTintColor(simpleDraweeView, Integer.valueOf(this.textColor));
        OverlappingCirclesView participants = appMessageEmbedViewBinding.participants;
        Intrinsics.checkNotNullExpressionValue(participants, "participants");
        int i7 = 8;
        participants.setVisibility(8);
        TextView participantsText = appMessageEmbedViewBinding.participantsText;
        Intrinsics.checkNotNullExpressionValue(participantsText, "participantsText");
        participantsText.setVisibility(8);
        TextView textView5 = appMessageEmbedViewBinding.participantsText;
        textView5.setTextColor(this.textColor);
        Intrinsics.checkNotNull(textView5);
        SetTextSizeSpKt.setTextSizeSp(textView5, 12.0f);
        DiscordFontUtilsKt.setDiscordFont(textView5, discordFont);
        this.view.header.setText(appMessageEmbedImpl.getHeader());
        TextView header = this.view.header;
        Intrinsics.checkNotNullExpressionValue(header, "header");
        int i10 = 0;
        header.setVisibility(appMessageEmbedImpl.getHeader() != null ? 0 : 8);
        this.view.info.setText(appMessageEmbedImpl.getInfo());
        TextView info = this.view.info;
        Intrinsics.checkNotNullExpressionValue(info, "info");
        info.setVisibility(appMessageEmbedImpl.getInfo() != null ? 0 : 8);
        this.view.tagline.setText(appMessageEmbedImpl.getTagline());
        TextView tagline = this.view.tagline;
        Intrinsics.checkNotNullExpressionValue(tagline, "tagline");
        tagline.setVisibility(appMessageEmbedImpl.getTagline() != null ? 0 : 8);
        SimpleDraweeView playerIcon = this.view.playerIcon;
        Intrinsics.checkNotNullExpressionValue(playerIcon, "playerIcon");
        playerIcon.setVisibility(appMessageEmbedImpl.getTagline() != null ? 0 : 8);
        if (appMessageEmbedImpl.getStaticBannerSrc() != null) {
            SimpleDraweeView banner = this.view.banner;
            Intrinsics.checkNotNullExpressionValue(banner, "banner");
            banner.setVisibility(0);
            this.view.banner.setImageURI(appMessageEmbedImpl.getStaticBannerSrc());
            int width = MessageMargins.INSTANCE.getWidth(margins, constrainedWidth, false);
            double d6 = ((double) width) / (Intrinsics.areEqual(appMessageEmbedImpl.getBannerRatio(), "activity") ? 1.7777777777777777d : 2.8333333333333335d);
            MediaContainingViewResizer mediaContainingViewResizer = MediaContainingViewResizer.INSTANCE;
            SimpleDraweeView banner2 = this.view.banner;
            Intrinsics.checkNotNullExpressionValue(banner2, "banner");
            int i11 = (int) d6;
            mediaContainingViewResizer.resizeLayoutParams(banner2, width, i11, width, i11, MediaContainingViewResizer.ResizeMode.Fill);
        } else {
            SimpleDraweeView banner3 = this.view.banner;
            Intrinsics.checkNotNullExpressionValue(banner3, "banner");
            banner3.setVisibility(8);
        }
        if (appMessageEmbedImpl.getTitle() != null) {
            TextView textView6 = this.view.title;
            String upperCase = appMessageEmbedImpl.getTitle().toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            textView6.setText(upperCase);
        } else {
            TextView title = this.view.title;
            Intrinsics.checkNotNullExpressionValue(title, "title");
            title.setVisibility(8);
        }
        if (appMessageEmbedImpl.getIconSrc() != null) {
            SimpleDraweeView appIcon = this.view.appIcon;
            Intrinsics.checkNotNullExpressionValue(appIcon, "appIcon");
            SetImageUriWithCachePolicyKt.setImageUriWithCachePolicy(appIcon, appMessageEmbedImpl.getIconSrc());
        } else {
            SimpleDraweeView appIcon2 = this.view.appIcon;
            Intrinsics.checkNotNullExpressionValue(appIcon2, "appIcon");
            appIcon2.setVisibility(8);
        }
        ConstraintLayout normalContainer2 = this.view.normalContainer;
        Intrinsics.checkNotNullExpressionValue(normalContainer2, "normalContainer");
        setBackgroundGradient(normalContainer2, appMessageEmbedImpl);
        DCDButton linkIcon = this.view.linkIcon;
        Intrinsics.checkNotNullExpressionValue(linkIcon, "linkIcon");
        linkIcon.setVisibility(8);
        DCDButton linkIconTitle = this.view.linkIconTitle;
        Intrinsics.checkNotNullExpressionValue(linkIconTitle, "linkIconTitle");
        linkIconTitle.setVisibility(8);
        if (appMessageEmbedImpl.getEmbedUrl() != null) {
            if (appMessageEmbedImpl.getTitle() != null) {
                DCDButton linkIconTitle2 = this.view.linkIconTitle;
                Intrinsics.checkNotNullExpressionValue(linkIconTitle2, "linkIconTitle");
                linkIconTitle2.setVisibility(0);
                final int i12 = 0;
                this.view.linkIconTitle.setOnClickButtonListener(new View.OnClickListener(this) { // from class: com.discord.chat.presentation.message.view.f

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    public final /* synthetic */ AppMessageEmbedView f4196e;

                    {
                        this.f4196e = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i12) {
                            case 0:
                                this.f4196e.handleTap(chatEventHandler, appMessageEmbedImpl, "link_copied");
                                break;
                            default:
                                this.f4196e.handleTap(chatEventHandler, appMessageEmbedImpl, "link_copied");
                                break;
                        }
                    }
                });
            } else {
                DCDButton linkIcon2 = this.view.linkIcon;
                Intrinsics.checkNotNullExpressionValue(linkIcon2, "linkIcon");
                linkIcon2.setVisibility(0);
                final int i13 = 1;
                this.view.linkIcon.setOnClickButtonListener(new View.OnClickListener(this) { // from class: com.discord.chat.presentation.message.view.f

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    public final /* synthetic */ AppMessageEmbedView f4196e;

                    {
                        this.f4196e = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i13) {
                            case 0:
                                this.f4196e.handleTap(chatEventHandler, appMessageEmbedImpl, "link_copied");
                                break;
                            default:
                                this.f4196e.handleTap(chatEventHandler, appMessageEmbedImpl, "link_copied");
                                break;
                        }
                    }
                });
            }
        }
        List<AppMessageActionImpl> actions = appMessageEmbedImpl.getActions();
        if (actions == null || actions.isEmpty()) {
            LinearLayout actionsContainer = this.view.actionsContainer;
            Intrinsics.checkNotNullExpressionValue(actionsContainer, "actionsContainer");
            actionsContainer.setVisibility(8);
            return;
        }
        this.view.actionsContainer.removeAllViews();
        float size = 1.0f / appMessageEmbedImpl.getActions().size();
        int i14 = 0;
        for (Object obj : CollectionsKt.X(appMessageEmbedImpl.getActions())) {
            int i15 = i14 + 1;
            if (i14 < 0) {
                d0.k();
                throw null;
            }
            AppMessageActionImpl appMessageActionImpl = (AppMessageActionImpl) obj;
            int i16 = i14 != appMessageEmbedImpl.getActions().size() + (-1) ? i10 : 1;
            String label = appMessageActionImpl.getLabel();
            String id2 = appMessageActionImpl.getId();
            Boolean disabled = appMessageActionImpl.getDisabled();
            ?? BooleanValue = disabled != null ? disabled.booleanValue() : i10;
            Context context7 = getContext();
            Intrinsics.checkNotNullExpressionValue(context7, "getContext(...)");
            int colorCompat = ColorUtilsKt.getColorCompat(context7, R.color.white_500);
            Context context8 = getContext();
            Intrinsics.checkNotNullExpressionValue(context8, "getContext(...)");
            int colorCompat2 = ColorUtilsKt.getColorCompat(context8, R.color.black_500);
            int iE = i16 != 0 ? colorCompat : b1.c.e(colorCompat, 30);
            if (i16 == 0) {
                colorCompat2 = colorCompat;
            }
            int i17 = i7;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i10, -2);
            layoutParams.weight = size;
            if (i14 > 0) {
                layoutParams.setMarginStart(SizeUtilsKt.getDpToPx(i17));
            }
            Context context9 = getContext();
            Intrinsics.checkNotNullExpressionValue(context9, "getContext(...)");
            ?? r23 = BooleanValue;
            DCDButton dCDButton3 = new DCDButton(context9, null, 2, null);
            dCDButton3.setAlpha(r23 != 0 ? 0.5f : 1.0f);
            dCDButton3.setText(label);
            dCDButton3.setBackgroundColor(iE);
            dCDButton3.setTextColor(Integer.valueOf(colorCompat2));
            dCDButton3.setTextSizeSp(14.0f);
            dCDButton3.setDiscordFont(DiscordFont.PrimaryMedium);
            dCDButton3.setCornerRadius(SizeUtilsKt.getDpToPx(i17));
            dCDButton3.setLayoutParams(layoutParams);
            dCDButton3.setOnClickButtonListener(new g(0, this, chatEventHandler, appMessageEmbedImpl, id2));
            this.view.actionsContainer.addView(dCDButton3);
            appMessageEmbedImpl = data;
            chatEventHandler = eventHandler;
            i14 = i15;
            i7 = i17;
            i10 = 0;
        }
        LinearLayout actionsContainer2 = this.view.actionsContainer;
        Intrinsics.checkNotNullExpressionValue(actionsContainer2, "actionsContainer");
        actionsContainer2.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleTap(ChatEventHandler eventHandler, AppMessageEmbedImpl data, String actionId) {
        String messageId = data.getMessageId();
        String appId = data.getAppId();
        String embedUrl = data.getEmbedUrl();
        if (embedUrl == null) {
            embedUrl = "";
        }
        eventHandler.onTapAppMessageEmbed(messageId, actionId, appId, embedUrl);
    }

    private final Integer rgbToColorInt(Map<String, Integer> map) {
        Integer num = map.get("r");
        Integer num2 = map.get("g");
        Integer num3 = map.get("b");
        if (num == null || num2 == null || num3 == null) {
            return null;
        }
        if (num.intValue() == 0 && num2.intValue() == 0 && num3.intValue() == 0) {
            return null;
        }
        return Integer.valueOf(Color.rgb(num.intValue(), num2.intValue(), num3.intValue()));
    }

    private final void setBackgroundGradient(View view, AppMessageEmbedImpl data) {
        if (data.getGradientColors() != null && data.getGradientColors().size() == 2) {
            Integer numRgbToColorInt = rgbToColorInt(data.getGradientColors().get(0));
            Integer numRgbToColorInt2 = rgbToColorInt(data.getGradientColors().get(1));
            if (numRgbToColorInt == null || numRgbToColorInt2 == null || numRgbToColorInt.intValue() == 0 || numRgbToColorInt2.intValue() == 0) {
                return;
            }
            if (this.gradientDrawable == null) {
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setCornerRadius(SizeUtilsKt.getDpToPx(12));
                gradientDrawable.setOrientation(GradientDrawable.Orientation.BL_TR);
                this.gradientDrawable = gradientDrawable;
            }
            GradientDrawable gradientDrawable2 = this.gradientDrawable;
            if (gradientDrawable2 != null) {
                gradientDrawable2.setColors(new int[]{numRgbToColorInt.intValue(), numRgbToColorInt2.intValue()});
            }
            view.setBackground(this.gradientDrawable);
        }
    }

    private final void setDefaultBackground(View view) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ViewBackgroundUtilsKt.setBackgroundRectangle$default(view, ColorUtilsKt.getColorCompat(context, ThemeManagerKt.getTheme().getColorRes(R.color.primary_130, R.color.primary_630)), SizeUtilsKt.getDpToPx(12), null, 0, 12, null);
    }

    @NotNull
    public final AppMessageEmbedViewBinding getView() {
        return this.view;
    }

    public final void initView(@NotNull MessageMargins margins, @NotNull AppMessageEmbedImpl data, @NotNull ChatEventHandler eventHandler, int constrainedWidth) {
        Intrinsics.checkNotNullParameter(margins, "margins");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(eventHandler, "eventHandler");
        ConstraintLayout normalContainer = this.view.normalContainer;
        Intrinsics.checkNotNullExpressionValue(normalContainer, "normalContainer");
        normalContainer.setVisibility(8);
        BlockedApplicationEmbedView blockedView = this.view.blockedView;
        Intrinsics.checkNotNullExpressionValue(blockedView, "blockedView");
        blockedView.setVisibility(8);
        int i7 = WhenMappings.$EnumSwitchMapping$0[data.getDisplayType().ordinal()];
        if (i7 == 1) {
            BlockedApplicationEmbedView blockedView2 = this.view.blockedView;
            Intrinsics.checkNotNullExpressionValue(blockedView2, "blockedView");
            blockedView2.setVisibility(0);
            this.view.blockedView.configure(data.getHeader(), data.getInfo());
            return;
        }
        if (i7 != 2) {
            throw new rn.n();
        }
        ConstraintLayout normalContainer2 = this.view.normalContainer;
        Intrinsics.checkNotNullExpressionValue(normalContainer2, "normalContainer");
        normalContainer2.setVisibility(0);
        configureNormalCard(margins, data, eventHandler, constrainedWidth);
    }

    public final void setView(@NotNull AppMessageEmbedViewBinding appMessageEmbedViewBinding) {
        Intrinsics.checkNotNullParameter(appMessageEmbedViewBinding, "<set-?>");
        this.view = appMessageEmbedViewBinding;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AppMessageEmbedView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ AppMessageEmbedView(Context context, AttributeSet attributeSet, int i7, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet, (i10 & 4) != 0 ? 0 : i7);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppMessageEmbedView(@NotNull Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        AppMessageEmbedViewBinding appMessageEmbedViewBindingInflate = AppMessageEmbedViewBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(appMessageEmbedViewBindingInflate, "inflate(...)");
        this.view = appMessageEmbedViewBindingInflate;
        this.textColor = ColorUtilsKt.getColorCompat(context, R.color.primary_230);
    }
}

package com.discord.chat.presentation.message.view;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.SetTextSizeSpKt;
import com.discord.chat.bridge.codedlinks.InviteRole;
import com.discord.chat.databinding.GuildProfileInviteViewBinding;
import com.discord.core.DCDButton;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.misc.utilities.view.ViewBackgroundUtilsKt;
import com.discord.misc.utilities.view.ViewClippingUtilsKt;
import com.discord.react_asset_fetcher.ReactAssetUtilsKt;
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt;
import com.discord.theme.ThemeManagerKt;
import com.discord.theme.utils.ColorUtilsKt;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.react.uimanager.ViewProps;
import com.google.android.flexbox.FlexboxLayoutManager;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J,\u0010\u0012\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\b\u0001\u0010\u0015\u001a\u00020\u00072\b\b\u0001\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0018J\u0010\u0010\u0019\u001a\u00020\u000f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0011J\u0010\u0010\u001b\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014J\u0018\u0010\u001c\u001a\u00020\u000f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u001e\u001a\u00020\u0018J!\u0010\u001f\u001a\u00020\u000f2\b\u0010 \u001a\u0004\u0018\u00010\u00112\n\b\u0001\u0010!\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\"J\u0010\u0010#\u001a\u00020\u000f2\b\u0010$\u001a\u0004\u0018\u00010\u0011J\u001a\u0010%\u001a\u00020\u000f2\b\u0010&\u001a\u0004\u0018\u00010\u00112\b\u0010'\u001a\u0004\u0018\u00010\u0011J\u001a\u0010(\u001a\u00020\u000f2\b\u0010)\u001a\u0004\u0018\u00010*2\b\u0010+\u001a\u0004\u0018\u00010*J\u001a\u0010,\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010-\u001a\u0004\u0018\u00010\u0014J \u0010.\u001a\u00020\u000f2\u000e\u0010/\u001a\n\u0012\u0004\u0012\u000201\u0018\u0001002\b\u00102\u001a\u0004\u0018\u00010\u0014R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00063"}, d2 = {"Lcom/discord/chat/presentation/message/view/GuildProfileInviteView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/discord/chat/databinding/GuildProfileInviteViewBinding;", "rolesAdapter", "Lcom/discord/chat/presentation/message/view/GuildProfileInviteRoleAdapter;", "setHeader", "", "headerText", "", "setBanner", "url", "", ViewProps.COLOR, "secondaryColor", "roundTop", "", "setTitle", "titleText", "setGuildBadge", "setBody", "bodyText", "hasProfileOverflow", "setAcceptButton", "text", ViewProps.BACKGROUND_COLOR, "(Ljava/lang/CharSequence;Ljava/lang/Integer;)V", "setEstablished", "establishedText", "setPresence", "onlineText", "memberText", "setClickListeners", "tapEmbedListener", "Landroid/view/View$OnClickListener;", "tapAcceptListener", "setAvatar", "thumbnailText", "setRoles", "roles", "", "Lcom/discord/chat/bridge/codedlinks/InviteRole;", "rolesHeadingText", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nGuildProfileInviteView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GuildProfileInviteView.kt\ncom/discord/chat/presentation/message/view/GuildProfileInviteView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,243:1\n257#2,2:244\n257#2,2:246\n257#2,2:248\n67#2,4:250\n37#2,2:254\n55#2:256\n72#2:257\n257#2,2:258\n257#2,2:260\n257#2,2:262\n257#2,2:264\n257#2,2:266\n257#2,2:268\n257#2,2:270\n257#2,2:272\n257#2,2:274\n257#2,2:276\n*S KotlinDebug\n*F\n+ 1 GuildProfileInviteView.kt\ncom/discord/chat/presentation/message/view/GuildProfileInviteView\n*L\n119#1:244,2\n149#1:246,2\n160#1:248,2\n171#1:250,4\n171#1:254,2\n171#1:256\n171#1:257\n188#1:258,2\n196#1:260,2\n202#1:262,2\n203#1:264,2\n205#1:266,2\n206#1:268,2\n233#1:270,2\n234#1:272,2\n238#1:274,2\n239#1:276,2\n*E\n"})
public final class GuildProfileInviteView extends ConstraintLayout {

    @NotNull
    private final GuildProfileInviteViewBinding binding;

    @NotNull
    private final GuildProfileInviteRoleAdapter rolesAdapter;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GuildProfileInviteView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void setAcceptButton(CharSequence text, Integer backgroundColor) {
        DCDButton dCDButton = this.binding.acceptButton;
        Intrinsics.checkNotNull(dCDButton);
        dCDButton.setVisibility(text == null || StringsKt.K(text) ? 8 : 0);
        dCDButton.setBackgroundColor(backgroundColor != null ? backgroundColor.intValue() : ThemeManagerKt.getTheme().getControlPrimaryBackgroundDefault());
        dCDButton.setText(text);
    }

    public final void setAvatar(String url, String thumbnailText) {
        this.binding.avatar.configure(url, thumbnailText, Integer.valueOf(ThemeManagerKt.getTheme().getBackgroundBaseLow()), 16, Integer.valueOf(ThemeManagerKt.getTheme().getMobileTextHeadingPrimary()));
    }

    public final void setBanner(String url, int color, int secondaryColor, boolean roundTop) {
        float dpToPx = roundTop ? SizeUtilsKt.getDpToPx(16) : 0.0f;
        SimpleDraweeView simpleDraweeView = this.binding.itemInviteSplash;
        GenericDraweeHierarchy genericDraweeHierarchy = (GenericDraweeHierarchy) simpleDraweeView.getHierarchy();
        i9.b bVar = new i9.b();
        bVar.a(dpToPx, dpToPx, 0.0f, 0.0f);
        genericDraweeHierarchy.p(bVar);
        simpleDraweeView.setImageURI(url);
        if (url != null) {
            simpleDraweeView.setBackground(null);
        } else {
            Intrinsics.checkNotNull(simpleDraweeView);
            ViewBackgroundUtilsKt.setBackgroundRectangle$default(simpleDraweeView, new int[]{color, secondaryColor}, GradientDrawable.Orientation.TL_BR, dpToPx, dpToPx, 0.0f, 0.0f, null, 0, 240, null);
        }
    }

    public final void setBody(CharSequence bodyText, boolean hasProfileOverflow) {
        final TextView textView = this.binding.bodyText;
        Intrinsics.checkNotNull(textView);
        textView.setVisibility(!(bodyText == null || bodyText.length() == 0) ? 0 : 8);
        textView.setText(bodyText);
        if (bodyText == null || bodyText.length() == 0) {
            this.binding.overlayGradient.setVisibility(4);
            return;
        }
        if (hasProfileOverflow) {
            this.binding.overlayGradient.setVisibility(0);
        } else if (!textView.isLaidOut() || textView.isLayoutRequested()) {
            textView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.discord.chat.presentation.message.view.GuildProfileInviteView$setBody$lambda$15$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view.removeOnLayoutChangeListener(this);
                    this.this$0.binding.overlayGradient.setVisibility((textView.getLayout() == null || textView.getLayout().getLineCount() <= 0 || textView.getLayout().getEllipsisCount(textView.getLayout().getLineCount() + (-1)) <= 0) ? 4 : 0);
                }
            });
        } else {
            this.binding.overlayGradient.setVisibility((textView.getLayout() == null || textView.getLayout().getLineCount() <= 0 || textView.getLayout().getEllipsisCount(textView.getLayout().getLineCount() - 1) <= 0) ? 4 : 0);
        }
    }

    public final void setClickListeners(View.OnClickListener tapEmbedListener, View.OnClickListener tapAcceptListener) {
        NestedScrollOnTouchUtilsKt.setOnClickListenerNested(this, true, tapEmbedListener);
        this.binding.acceptButton.setOnClickButtonListener(tapAcceptListener);
    }

    public final void setEstablished(CharSequence establishedText) {
        TextView textView = this.binding.establishedText;
        Intrinsics.checkNotNull(textView);
        textView.setVisibility(establishedText == null || establishedText.length() == 0 ? 8 : 0);
        textView.setText(establishedText);
    }

    public final void setGuildBadge(String url) {
        SimpleDraweeView guildBadge = this.binding.guildBadge;
        Intrinsics.checkNotNullExpressionValue(guildBadge, "guildBadge");
        ReactAssetUtilsKt.setOptionalReactImageUrl(guildBadge, url);
    }

    public final void setHeader(CharSequence headerText) {
        TextView textView = this.binding.headerText;
        Intrinsics.checkNotNull(textView);
        textView.setVisibility(headerText == null || headerText.length() == 0 ? 8 : 0);
        textView.setText(headerText);
    }

    public final void setPresence(CharSequence onlineText, CharSequence memberText) {
        ImageView itemInviteOnlineDot = this.binding.itemInviteOnlineDot;
        Intrinsics.checkNotNullExpressionValue(itemInviteOnlineDot, "itemInviteOnlineDot");
        boolean z5 = true;
        itemInviteOnlineDot.setVisibility(!(onlineText == null || StringsKt.K(onlineText)) ? 0 : 8);
        TextView itemInviteOnlineText = this.binding.itemInviteOnlineText;
        Intrinsics.checkNotNullExpressionValue(itemInviteOnlineText, "itemInviteOnlineText");
        itemInviteOnlineText.setVisibility(!(onlineText == null || StringsKt.K(onlineText)) ? 0 : 8);
        this.binding.itemInviteOnlineText.setText(onlineText);
        ImageView itemInviteTotalMemberDot = this.binding.itemInviteTotalMemberDot;
        Intrinsics.checkNotNullExpressionValue(itemInviteTotalMemberDot, "itemInviteTotalMemberDot");
        itemInviteTotalMemberDot.setVisibility(!(memberText == null || StringsKt.K(memberText)) ? 0 : 8);
        TextView itemInviteTotalMemberText = this.binding.itemInviteTotalMemberText;
        Intrinsics.checkNotNullExpressionValue(itemInviteTotalMemberText, "itemInviteTotalMemberText");
        if (memberText != null && !StringsKt.K(memberText)) {
            z5 = false;
        }
        itemInviteTotalMemberText.setVisibility(z5 ? 8 : 0);
        this.binding.itemInviteTotalMemberText.setText(memberText);
    }

    public final void setRoles(List<InviteRole> roles, String rolesHeadingText) {
        if (roles == null || roles.isEmpty()) {
            TextView rolesHeadingText2 = this.binding.rolesHeadingText;
            Intrinsics.checkNotNullExpressionValue(rolesHeadingText2, "rolesHeadingText");
            rolesHeadingText2.setVisibility(8);
            RecyclerView rolesContainer = this.binding.rolesContainer;
            Intrinsics.checkNotNullExpressionValue(rolesContainer, "rolesContainer");
            rolesContainer.setVisibility(8);
            return;
        }
        TextView rolesHeadingText3 = this.binding.rolesHeadingText;
        Intrinsics.checkNotNullExpressionValue(rolesHeadingText3, "rolesHeadingText");
        rolesHeadingText3.setVisibility(0);
        RecyclerView rolesContainer2 = this.binding.rolesContainer;
        Intrinsics.checkNotNullExpressionValue(rolesContainer2, "rolesContainer");
        rolesContainer2.setVisibility(0);
        this.binding.rolesHeadingText.setText(rolesHeadingText);
        this.rolesAdapter.setRoles(roles);
    }

    public final void setTitle(CharSequence titleText) {
        TextView textView = this.binding.titleText;
        Intrinsics.checkNotNull(textView);
        textView.setVisibility(titleText == null || titleText.length() == 0 ? 8 : 0);
        textView.setText(titleText);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GuildProfileInviteView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ GuildProfileInviteView(Context context, AttributeSet attributeSet, int i7, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet, (i10 & 4) != 0 ? 0 : i7);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GuildProfileInviteView(@NotNull Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        GuildProfileInviteViewBinding guildProfileInviteViewBindingInflate = GuildProfileInviteViewBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(guildProfileInviteViewBindingInflate, "inflate(...)");
        this.binding = guildProfileInviteViewBindingInflate;
        GuildProfileInviteRoleAdapter guildProfileInviteRoleAdapter = new GuildProfileInviteRoleAdapter();
        this.rolesAdapter = guildProfileInviteRoleAdapter;
        setMaxWidth(SizeUtilsKt.getDpToPx(375));
        ViewBackgroundUtilsKt.setBackgroundRectangle(this, ThemeManagerKt.getTheme().getBackgroundSurfaceHigh(), SizeUtilsKt.getDpToPx(16), Integer.valueOf(ThemeManagerKt.getTheme().getBorderSubtle()), SizeUtilsKt.getDpToPx(1));
        TextView textView = guildProfileInviteViewBindingInflate.headerText;
        textView.setTextColor(ThemeManagerKt.getTheme().getTextSubtle());
        Intrinsics.checkNotNull(textView);
        SetTextSizeSpKt.setTextSizeSp(textView, 14.0f);
        DiscordFont discordFont = DiscordFont.PrimarySemibold;
        DiscordFontUtilsKt.setDiscordFont(textView, discordFont);
        TextView textView2 = guildProfileInviteViewBindingInflate.titleText;
        textView2.setTextColor(ThemeManagerKt.getTheme().getMobileTextHeadingPrimary());
        Intrinsics.checkNotNull(textView2);
        SetTextSizeSpKt.setTextSizeSp(textView2, 16.0f);
        DiscordFontUtilsKt.setDiscordFont(textView2, discordFont);
        TextView textView3 = guildProfileInviteViewBindingInflate.itemInviteOnlineText;
        textView3.setTextColor(ThemeManagerKt.getTheme().getTextSubtle());
        Intrinsics.checkNotNull(textView3);
        SetTextSizeSpKt.setTextSizeSp(textView3, 14.0f);
        DiscordFont discordFont2 = DiscordFont.PrimaryMedium;
        DiscordFontUtilsKt.setDiscordFont(textView3, discordFont2);
        TextView textView4 = guildProfileInviteViewBindingInflate.itemInviteTotalMemberText;
        textView4.setTextColor(ThemeManagerKt.getTheme().getTextSubtle());
        Intrinsics.checkNotNull(textView4);
        SetTextSizeSpKt.setTextSizeSp(textView4, 14.0f);
        DiscordFontUtilsKt.setDiscordFont(textView4, discordFont2);
        TextView textView5 = guildProfileInviteViewBindingInflate.establishedText;
        textView5.setTextColor(ThemeManagerKt.getTheme().getTextMuted());
        Intrinsics.checkNotNull(textView5);
        SetTextSizeSpKt.setTextSizeSp(textView5, 14.0f);
        DiscordFontUtilsKt.setDiscordFont(textView5, discordFont2);
        TextView textView6 = guildProfileInviteViewBindingInflate.bodyText;
        textView6.setTextColor(ThemeManagerKt.getTheme().getTextSubtle());
        Intrinsics.checkNotNull(textView6);
        SetTextSizeSpKt.setTextSizeSp(textView6, 14.0f);
        DiscordFontUtilsKt.setDiscordFont(textView6, discordFont2);
        DCDButton dCDButton = guildProfileInviteViewBindingInflate.acceptButton;
        dCDButton.setMaxLines(1);
        dCDButton.ellipsize(TextUtils.TruncateAt.END);
        dCDButton.setTextSizeSp(14.0f);
        dCDButton.setDiscordFont(discordFont);
        dCDButton.setCornerRadius(SizeUtilsKt.getDpToPx(20));
        dCDButton.setTextColor(Integer.valueOf(ThemeManagerKt.getTheme().getWhite()));
        FrameLayout frameLayout = guildProfileInviteViewBindingInflate.avatarContainer;
        frameLayout.setBackgroundColor(ThemeManagerKt.getTheme().getBackgroundSurfaceHigh());
        Intrinsics.checkNotNull(frameLayout);
        ViewClippingUtilsKt.clipToRoundedRectangle(frameLayout, SizeUtilsKt.getDpToPx(16));
        View overlayGradient = guildProfileInviteViewBindingInflate.overlayGradient;
        Intrinsics.checkNotNullExpressionValue(overlayGradient, "overlayGradient");
        ViewBackgroundUtilsKt.setBackgroundRectangle$default(overlayGradient, new int[]{ColorUtilsKt.argbWithAdjustedAlpha(ThemeManagerKt.getTheme().getBackgroundSurfaceHigh(), 0.9f), 0}, GradientDrawable.Orientation.BOTTOM_TOP, 0.0f, 0.0f, 0.0f, 0.0f, null, 0, 252, null);
        ImageView itemInviteOnlineDot = guildProfileInviteViewBindingInflate.itemInviteOnlineDot;
        Intrinsics.checkNotNullExpressionValue(itemInviteOnlineDot, "itemInviteOnlineDot");
        ViewBackgroundUtilsKt.setBackgroundOval$default(itemInviteOnlineDot, ThemeManagerKt.getTheme().getStatusPositive(), 0, 2, null);
        ImageView itemInviteTotalMemberDot = guildProfileInviteViewBindingInflate.itemInviteTotalMemberDot;
        Intrinsics.checkNotNullExpressionValue(itemInviteTotalMemberDot, "itemInviteTotalMemberDot");
        ViewBackgroundUtilsKt.setBackgroundOval$default(itemInviteTotalMemberDot, ThemeManagerKt.getTheme().getBackgroundModMuted(), 0, 2, null);
        TextView textView7 = guildProfileInviteViewBindingInflate.rolesHeadingText;
        textView7.setTextColor(ThemeManagerKt.getTheme().getTextDefault());
        Intrinsics.checkNotNull(textView7);
        SetTextSizeSpKt.setTextSizeSp(textView7, 14.0f);
        DiscordFontUtilsKt.setDiscordFont(textView7, discordFont);
        RecyclerView recyclerView = guildProfileInviteViewBindingInflate.rolesContainer;
        recyclerView.setLayoutManager(new FlexboxLayoutManager(context));
        recyclerView.setAdapter(guildProfileInviteRoleAdapter);
        recyclerView.setItemAnimator(null);
    }
}

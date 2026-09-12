package com.discord.mobile_voice_overlay.views;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import com.discord.SetTextSizeSpKt;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.misc.utilities.activity.ActivityUtilities;
import com.discord.misc.utilities.view.ViewBackgroundUtilsKt;
import com.discord.mobile_voice_overlay.MobileVoiceOverlay;
import com.discord.mobile_voice_overlay.MobileVoiceOverlayAssets;
import com.discord.mobile_voice_overlay.MobileVoiceOverlayData;
import com.discord.mobile_voice_overlay.MobileVoiceOverlayDataUser;
import com.discord.mobile_voice_overlay.databinding.OverlayMenuBubbleBinding;
import com.discord.react_activities.ReactActivity;
import com.discord.theme.ThemeManagerKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.n0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import lo.j;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\u000bJ\u0012\u0010 \u001a\u00020\u00122\b\u0010!\u001a\u0004\u0018\u00010\"H\u0014J\b\u0010#\u001a\u00020\u0012H\u0014J\b\u0010$\u001a\u00020%H\u0016J\u0010\u0010&\u001a\u00020\u00122\u0006\u0010'\u001a\u00020(H\u0016J\u0010\u0010)\u001a\u00020\u00122\u0006\u0010*\u001a\u00020+H\u0016R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001c\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006,"}, d2 = {"Lcom/discord/mobile_voice_overlay/views/OverlayMenuBubbleDialog;", "Lcom/discord/mobile_voice_overlay/views/OverlayDialog;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "attributeSetId", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/discord/mobile_voice_overlay/databinding/OverlayMenuBubbleBinding;", "adapter", "Lcom/discord/mobile_voice_overlay/views/VoiceUserAdapter;", "onGetInvitePressed", "Lkotlin/Function0;", "", "onSwitchChannelsPressed", "onOpenDiscordPressed", "onMutePressed", "onDisconnectPressed", "onShowSelectorDialog", "getOnShowSelectorDialog", "()Lkotlin/jvm/functions/Function0;", "setOnShowSelectorDialog", "(Lkotlin/jvm/functions/Function0;)V", "linkedAnchorView", "Landroid/view/View;", "getLinkedAnchorView", "()Landroid/view/View;", "onConfigurationChanged", "newConfig", "Landroid/content/res/Configuration;", "onAttachedToWindow", "getClosingAnimator", "Landroid/animation/Animator;", "setData", "data", "Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayData;", "setAssets", "assets", "Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayAssets;", "mobile_voice_overlay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nOverlayMenuBubbleDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OverlayMenuBubbleDialog.kt\ncom/discord/mobile_voice_overlay/views/OverlayMenuBubbleDialog\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,227:1\n1#2:228\n*E\n"})
public final class OverlayMenuBubbleDialog extends OverlayDialog {

    @NotNull
    private final VoiceUserAdapter adapter;

    @NotNull
    private final OverlayMenuBubbleBinding binding;

    @NotNull
    private Function0<Unit> onDisconnectPressed;

    @NotNull
    private Function0<Unit> onGetInvitePressed;

    @NotNull
    private Function0<Unit> onMutePressed;

    @NotNull
    private Function0<Unit> onOpenDiscordPressed;

    @NotNull
    private Function0<Unit> onShowSelectorDialog;

    @NotNull
    private Function0<Unit> onSwitchChannelsPressed;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverlayMenuBubbleDialog(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        OverlayMenuBubbleBinding overlayMenuBubbleBindingInflate = OverlayMenuBubbleBinding.inflate(LayoutInflater.from(getContext()), this, true);
        Intrinsics.checkNotNullExpressionValue(overlayMenuBubbleBindingInflate, "inflate(...)");
        this.binding = overlayMenuBubbleBindingInflate;
        this.adapter = new VoiceUserAdapter();
        this.onGetInvitePressed = new com.discord.crash_reporting.d(19);
        this.onSwitchChannelsPressed = new com.discord.crash_reporting.d(20);
        this.onOpenDiscordPressed = new com.discord.crash_reporting.d(21);
        this.onMutePressed = new com.discord.crash_reporting.d(22);
        this.onDisconnectPressed = new com.discord.crash_reporting.d(23);
        this.onShowSelectorDialog = new com.discord.crash_reporting.d(24);
        final int i7 = 2;
        overlayMenuBubbleBindingInflate.overlayMenu.getBinding().overlayInviteLink.setOnClickListener(new View.OnClickListener(this) { // from class: com.discord.mobile_voice_overlay.views.a

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ OverlayMenuBubbleDialog f4512e;

            {
                this.f4512e = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i7) {
                    case 0:
                        OverlayMenuBubbleDialog._init_$lambda$9(this.f4512e, view);
                        break;
                    case 1:
                        OverlayMenuBubbleDialog._init_$lambda$10(this.f4512e, view);
                        break;
                    case 2:
                        OverlayMenuBubbleDialog._init_$lambda$6(this.f4512e, view);
                        break;
                    case 3:
                        OverlayMenuBubbleDialog._init_$lambda$7(this.f4512e, view);
                        break;
                    default:
                        OverlayMenuBubbleDialog._init_$lambda$8(this.f4512e, view);
                        break;
                }
            }
        });
        final int i10 = 3;
        overlayMenuBubbleBindingInflate.overlayMenu.getBinding().overlaySwitchChannels.setOnClickListener(new View.OnClickListener(this) { // from class: com.discord.mobile_voice_overlay.views.a

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ OverlayMenuBubbleDialog f4512e;

            {
                this.f4512e = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        OverlayMenuBubbleDialog._init_$lambda$9(this.f4512e, view);
                        break;
                    case 1:
                        OverlayMenuBubbleDialog._init_$lambda$10(this.f4512e, view);
                        break;
                    case 2:
                        OverlayMenuBubbleDialog._init_$lambda$6(this.f4512e, view);
                        break;
                    case 3:
                        OverlayMenuBubbleDialog._init_$lambda$7(this.f4512e, view);
                        break;
                    default:
                        OverlayMenuBubbleDialog._init_$lambda$8(this.f4512e, view);
                        break;
                }
            }
        });
        final int i11 = 4;
        overlayMenuBubbleBindingInflate.overlayMenu.getBinding().overlayOpenApp.setOnClickListener(new View.OnClickListener(this) { // from class: com.discord.mobile_voice_overlay.views.a

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ OverlayMenuBubbleDialog f4512e;

            {
                this.f4512e = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        OverlayMenuBubbleDialog._init_$lambda$9(this.f4512e, view);
                        break;
                    case 1:
                        OverlayMenuBubbleDialog._init_$lambda$10(this.f4512e, view);
                        break;
                    case 2:
                        OverlayMenuBubbleDialog._init_$lambda$6(this.f4512e, view);
                        break;
                    case 3:
                        OverlayMenuBubbleDialog._init_$lambda$7(this.f4512e, view);
                        break;
                    default:
                        OverlayMenuBubbleDialog._init_$lambda$8(this.f4512e, view);
                        break;
                }
            }
        });
        final int i12 = 0;
        overlayMenuBubbleBindingInflate.overlayMenu.getBinding().muteToggle.setOnClickListener(new View.OnClickListener(this) { // from class: com.discord.mobile_voice_overlay.views.a

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ OverlayMenuBubbleDialog f4512e;

            {
                this.f4512e = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        OverlayMenuBubbleDialog._init_$lambda$9(this.f4512e, view);
                        break;
                    case 1:
                        OverlayMenuBubbleDialog._init_$lambda$10(this.f4512e, view);
                        break;
                    case 2:
                        OverlayMenuBubbleDialog._init_$lambda$6(this.f4512e, view);
                        break;
                    case 3:
                        OverlayMenuBubbleDialog._init_$lambda$7(this.f4512e, view);
                        break;
                    default:
                        OverlayMenuBubbleDialog._init_$lambda$8(this.f4512e, view);
                        break;
                }
            }
        });
        final int i13 = 1;
        overlayMenuBubbleBindingInflate.overlayMenu.getBinding().disconnectBtn.setOnClickListener(new View.OnClickListener(this) { // from class: com.discord.mobile_voice_overlay.views.a

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ OverlayMenuBubbleDialog f4512e;

            {
                this.f4512e = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        OverlayMenuBubbleDialog._init_$lambda$9(this.f4512e, view);
                        break;
                    case 1:
                        OverlayMenuBubbleDialog._init_$lambda$10(this.f4512e, view);
                        break;
                    case 2:
                        OverlayMenuBubbleDialog._init_$lambda$6(this.f4512e, view);
                        break;
                    case 3:
                        OverlayMenuBubbleDialog._init_$lambda$7(this.f4512e, view);
                        break;
                    default:
                        OverlayMenuBubbleDialog._init_$lambda$8(this.f4512e, view);
                        break;
                }
            }
        });
        setClipChildren(false);
        TextView textView = overlayMenuBubbleBindingInflate.overlayMembersOverflowText;
        Intrinsics.checkNotNull(textView);
        DiscordFontUtilsKt.setDiscordFont(textView, DiscordFont.PrimaryExtraBold);
        SetTextSizeSpKt.setTextSizeSp(textView, 20.0f);
        TextView textView2 = overlayMenuBubbleBindingInflate.overlayMembersOverflowText;
        textView2.setTextColor(ThemeManagerKt.getTheme().getMobileTextHeadingPrimary());
        Intrinsics.checkNotNull(textView2);
        ViewBackgroundUtilsKt.setBackgroundOval$default(textView2, ThemeManagerKt.getTheme().getBackgroundBaseLowest(), 0, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$10(OverlayMenuBubbleDialog overlayMenuBubbleDialog, View view) {
        overlayMenuBubbleDialog.onDisconnectPressed.invoke();
        overlayMenuBubbleDialog.closeDialog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$6(OverlayMenuBubbleDialog overlayMenuBubbleDialog, View view) {
        overlayMenuBubbleDialog.onGetInvitePressed.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$7(OverlayMenuBubbleDialog overlayMenuBubbleDialog, View view) {
        overlayMenuBubbleDialog.onSwitchChannelsPressed.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$8(OverlayMenuBubbleDialog overlayMenuBubbleDialog, View view) {
        overlayMenuBubbleDialog.onOpenDiscordPressed.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$9(OverlayMenuBubbleDialog overlayMenuBubbleDialog, View view) {
        overlayMenuBubbleDialog.onMutePressed.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setData$lambda$21(OverlayMenuBubbleDialog overlayMenuBubbleDialog, MobileVoiceOverlayData mobileVoiceOverlayData) {
        MobileVoiceOverlay.Companion companion = MobileVoiceOverlay.INSTANCE;
        Context context = overlayMenuBubbleDialog.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        companion.startHeadlessTask(context, "GenerateInvite", zs.a.f(new Pair("channelId", String.valueOf(mobileVoiceOverlayData.m1030getChannelIdo4g7jtM()))));
        MobileVoiceOverlayAssets overlayAssets = overlayMenuBubbleDialog.getOverlayAssets();
        if (overlayAssets != null) {
            Toast.makeText(overlayMenuBubbleDialog.getContext(), overlayAssets.getInviteLinkCopied(), 0).show();
        }
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setData$lambda$22(OverlayMenuBubbleDialog overlayMenuBubbleDialog) {
        overlayMenuBubbleDialog.getOnDialogClosed().invoke(overlayMenuBubbleDialog);
        overlayMenuBubbleDialog.onShowSelectorDialog.invoke();
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setData$lambda$24(OverlayMenuBubbleDialog overlayMenuBubbleDialog, MobileVoiceOverlayData mobileVoiceOverlayData) {
        ActivityUtilities activityUtilities = ActivityUtilities.INSTANCE;
        Context context = overlayMenuBubbleDialog.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Intent intent = new Intent("android.intent.action.VIEW", null, overlayMenuBubbleDialog.getContext(), ReactActivity.INSTANCE.getMainActivity());
        intent.addCategory("android.intent.category.HOME");
        intent.addFlags(268435456);
        Unit unit = Unit.f14616a;
        ActivityUtilities.startActivityAsync$default(activityUtilities, context, intent, null, 4, null);
        MobileVoiceOverlay.Companion companion = MobileVoiceOverlay.INSTANCE;
        Context context2 = overlayMenuBubbleDialog.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        companion.startHeadlessTask(context2, "SelectVoiceChannel", zs.a.f(new Pair("channelId", String.valueOf(mobileVoiceOverlayData.m1030getChannelIdo4g7jtM()))));
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setData$lambda$25(OverlayMenuBubbleDialog overlayMenuBubbleDialog) {
        MobileVoiceOverlay.Companion companion = MobileVoiceOverlay.INSTANCE;
        Context context = overlayMenuBubbleDialog.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        MobileVoiceOverlay.Companion.startHeadlessTask$default(companion, context, "ToggleSelfMute", null, 4, null);
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setData$lambda$26(OverlayMenuBubbleDialog overlayMenuBubbleDialog, MobileVoiceOverlayData mobileVoiceOverlayData) {
        MobileVoiceOverlay.Companion companion = MobileVoiceOverlay.INSTANCE;
        Context context = overlayMenuBubbleDialog.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        companion.startHeadlessTask(context, "Disconnect", zs.a.f(new Pair("channelId", String.valueOf(mobileVoiceOverlayData.m1030getChannelIdo4g7jtM()))));
        return Unit.f14616a;
    }

    @Override // com.discord.mobile_voice_overlay.views.OverlayDialog
    @NotNull
    public Animator getClosingAnimator() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setStartDelay(getResources().getInteger(R.integer.config_shortAnimTime));
        Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(this.binding.overlayMenu.getContext(), com.discord.mobile_voice_overlay.R.animator.overlay_slide_down_fade_out);
        animatorLoadAnimator.setTarget(this.binding.overlayMenu);
        Unit unit = Unit.f14616a;
        Animator animatorLoadAnimator2 = AnimatorInflater.loadAnimator(getContext(), com.discord.mobile_voice_overlay.R.animator.overlay_slide_up_fade_out);
        animatorLoadAnimator2.setTarget(this.binding.overlayHeader);
        animatorSet.playTogether(animatorLoadAnimator, animatorLoadAnimator2);
        return animatorSet;
    }

    @NotNull
    public final View getLinkedAnchorView() {
        View overlayLinkedAnchorView = this.binding.overlayLinkedAnchorView;
        Intrinsics.checkNotNullExpressionValue(overlayLinkedAnchorView, "overlayLinkedAnchorView");
        return overlayLinkedAnchorView;
    }

    @NotNull
    public final Function0<Unit> getOnShowSelectorDialog() {
        return this.onShowSelectorDialog;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.binding.overlayMenu.setAlpha(0.0f);
        this.binding.overlayHeader.setAlpha(0.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(this.binding.overlayMenu.getContext(), com.discord.mobile_voice_overlay.R.animator.overlay_slide_up_fade_in);
        animatorLoadAnimator.setTarget(this.binding.overlayMenu);
        Unit unit = Unit.f14616a;
        Animator animatorLoadAnimator2 = AnimatorInflater.loadAnimator(getContext(), com.discord.mobile_voice_overlay.R.animator.overlay_slide_down_fade_in);
        animatorLoadAnimator2.setTarget(this.binding.overlayHeader);
        animatorSet.playTogether(animatorLoadAnimator, animatorLoadAnimator2);
        animatorSet.setStartDelay(getResources().getInteger(R.integer.config_shortAnimTime));
        animatorSet.start();
        this.binding.overlayMembersRecycler.setAdapter(this.adapter);
    }

    @Override // com.discord.mobile_voice_overlay.views.OverlayDialog, com.discord.mobile_voice_overlay.views.OverlayBubbleWrap, android.view.View
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        getOnDialogClosed().invoke(this);
    }

    @Override // com.discord.mobile_voice_overlay.views.OverlayView
    public void setAssets(@NotNull MobileVoiceOverlayAssets assets) {
        Intrinsics.checkNotNullParameter(assets, "assets");
        super.setAssets(assets);
        this.binding.overlayMenu.setAssets(assets);
    }

    @Override // com.discord.mobile_voice_overlay.views.OverlayView
    public void setData(@NotNull final MobileVoiceOverlayData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        List<MobileVoiceOverlayDataUser> users = data.getUsers();
        this.adapter.setData(users.size() < 2 ? n0.f14659d : CollectionsKt.c0(users, j.i(1, users.size())));
        TextView textView = this.binding.overlayMembersOverflowText;
        textView.setVisibility(data.getExtraUsers() == 0 ? 8 : 0);
        textView.setText(data.getExtraUsers() == 0 ? null : kk.b.h(data.getExtraUsers(), "+"));
        this.binding.overlayMenu.setData(data);
        final int i7 = 0;
        this.onGetInvitePressed = new Function0(this) { // from class: com.discord.mobile_voice_overlay.views.b

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ OverlayMenuBubbleDialog f4514e;

            {
                this.f4514e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        return OverlayMenuBubbleDialog.setData$lambda$21(this.f4514e, data);
                    case 1:
                        return OverlayMenuBubbleDialog.setData$lambda$24(this.f4514e, data);
                    default:
                        return OverlayMenuBubbleDialog.setData$lambda$26(this.f4514e, data);
                }
            }
        };
        this.onSwitchChannelsPressed = new Function0(this) { // from class: com.discord.mobile_voice_overlay.views.c

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ OverlayMenuBubbleDialog f4517e;

            {
                this.f4517e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        return OverlayMenuBubbleDialog.setData$lambda$22(this.f4517e);
                    default:
                        return OverlayMenuBubbleDialog.setData$lambda$25(this.f4517e);
                }
            }
        };
        final int i10 = 1;
        this.onOpenDiscordPressed = new Function0(this) { // from class: com.discord.mobile_voice_overlay.views.b

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ OverlayMenuBubbleDialog f4514e;

            {
                this.f4514e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return OverlayMenuBubbleDialog.setData$lambda$21(this.f4514e, data);
                    case 1:
                        return OverlayMenuBubbleDialog.setData$lambda$24(this.f4514e, data);
                    default:
                        return OverlayMenuBubbleDialog.setData$lambda$26(this.f4514e, data);
                }
            }
        };
        this.onMutePressed = new Function0(this) { // from class: com.discord.mobile_voice_overlay.views.c

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ OverlayMenuBubbleDialog f4517e;

            {
                this.f4517e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return OverlayMenuBubbleDialog.setData$lambda$22(this.f4517e);
                    default:
                        return OverlayMenuBubbleDialog.setData$lambda$25(this.f4517e);
                }
            }
        };
        final int i11 = 2;
        this.onDisconnectPressed = new Function0(this) { // from class: com.discord.mobile_voice_overlay.views.b

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ OverlayMenuBubbleDialog f4514e;

            {
                this.f4514e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        return OverlayMenuBubbleDialog.setData$lambda$21(this.f4514e, data);
                    case 1:
                        return OverlayMenuBubbleDialog.setData$lambda$24(this.f4514e, data);
                    default:
                        return OverlayMenuBubbleDialog.setData$lambda$26(this.f4514e, data);
                }
            }
        };
    }

    public final void setOnShowSelectorDialog(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.onShowSelectorDialog = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverlayMenuBubbleDialog(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        OverlayMenuBubbleBinding overlayMenuBubbleBindingInflate = OverlayMenuBubbleBinding.inflate(LayoutInflater.from(getContext()), this, true);
        Intrinsics.checkNotNullExpressionValue(overlayMenuBubbleBindingInflate, "inflate(...)");
        this.binding = overlayMenuBubbleBindingInflate;
        this.adapter = new VoiceUserAdapter();
        this.onGetInvitePressed = new com.discord.crash_reporting.d(19);
        this.onSwitchChannelsPressed = new com.discord.crash_reporting.d(20);
        this.onOpenDiscordPressed = new com.discord.crash_reporting.d(21);
        this.onMutePressed = new com.discord.crash_reporting.d(22);
        this.onDisconnectPressed = new com.discord.crash_reporting.d(23);
        this.onShowSelectorDialog = new com.discord.crash_reporting.d(24);
        final int i7 = 2;
        overlayMenuBubbleBindingInflate.overlayMenu.getBinding().overlayInviteLink.setOnClickListener(new View.OnClickListener(this) { // from class: com.discord.mobile_voice_overlay.views.a

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ OverlayMenuBubbleDialog f4512e;

            {
                this.f4512e = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i7) {
                    case 0:
                        OverlayMenuBubbleDialog._init_$lambda$9(this.f4512e, view);
                        break;
                    case 1:
                        OverlayMenuBubbleDialog._init_$lambda$10(this.f4512e, view);
                        break;
                    case 2:
                        OverlayMenuBubbleDialog._init_$lambda$6(this.f4512e, view);
                        break;
                    case 3:
                        OverlayMenuBubbleDialog._init_$lambda$7(this.f4512e, view);
                        break;
                    default:
                        OverlayMenuBubbleDialog._init_$lambda$8(this.f4512e, view);
                        break;
                }
            }
        });
        final int i10 = 3;
        overlayMenuBubbleBindingInflate.overlayMenu.getBinding().overlaySwitchChannels.setOnClickListener(new View.OnClickListener(this) { // from class: com.discord.mobile_voice_overlay.views.a

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ OverlayMenuBubbleDialog f4512e;

            {
                this.f4512e = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        OverlayMenuBubbleDialog._init_$lambda$9(this.f4512e, view);
                        break;
                    case 1:
                        OverlayMenuBubbleDialog._init_$lambda$10(this.f4512e, view);
                        break;
                    case 2:
                        OverlayMenuBubbleDialog._init_$lambda$6(this.f4512e, view);
                        break;
                    case 3:
                        OverlayMenuBubbleDialog._init_$lambda$7(this.f4512e, view);
                        break;
                    default:
                        OverlayMenuBubbleDialog._init_$lambda$8(this.f4512e, view);
                        break;
                }
            }
        });
        final int i11 = 4;
        overlayMenuBubbleBindingInflate.overlayMenu.getBinding().overlayOpenApp.setOnClickListener(new View.OnClickListener(this) { // from class: com.discord.mobile_voice_overlay.views.a

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ OverlayMenuBubbleDialog f4512e;

            {
                this.f4512e = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        OverlayMenuBubbleDialog._init_$lambda$9(this.f4512e, view);
                        break;
                    case 1:
                        OverlayMenuBubbleDialog._init_$lambda$10(this.f4512e, view);
                        break;
                    case 2:
                        OverlayMenuBubbleDialog._init_$lambda$6(this.f4512e, view);
                        break;
                    case 3:
                        OverlayMenuBubbleDialog._init_$lambda$7(this.f4512e, view);
                        break;
                    default:
                        OverlayMenuBubbleDialog._init_$lambda$8(this.f4512e, view);
                        break;
                }
            }
        });
        final int i12 = 0;
        overlayMenuBubbleBindingInflate.overlayMenu.getBinding().muteToggle.setOnClickListener(new View.OnClickListener(this) { // from class: com.discord.mobile_voice_overlay.views.a

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ OverlayMenuBubbleDialog f4512e;

            {
                this.f4512e = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        OverlayMenuBubbleDialog._init_$lambda$9(this.f4512e, view);
                        break;
                    case 1:
                        OverlayMenuBubbleDialog._init_$lambda$10(this.f4512e, view);
                        break;
                    case 2:
                        OverlayMenuBubbleDialog._init_$lambda$6(this.f4512e, view);
                        break;
                    case 3:
                        OverlayMenuBubbleDialog._init_$lambda$7(this.f4512e, view);
                        break;
                    default:
                        OverlayMenuBubbleDialog._init_$lambda$8(this.f4512e, view);
                        break;
                }
            }
        });
        final int i13 = 1;
        overlayMenuBubbleBindingInflate.overlayMenu.getBinding().disconnectBtn.setOnClickListener(new View.OnClickListener(this) { // from class: com.discord.mobile_voice_overlay.views.a

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ OverlayMenuBubbleDialog f4512e;

            {
                this.f4512e = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        OverlayMenuBubbleDialog._init_$lambda$9(this.f4512e, view);
                        break;
                    case 1:
                        OverlayMenuBubbleDialog._init_$lambda$10(this.f4512e, view);
                        break;
                    case 2:
                        OverlayMenuBubbleDialog._init_$lambda$6(this.f4512e, view);
                        break;
                    case 3:
                        OverlayMenuBubbleDialog._init_$lambda$7(this.f4512e, view);
                        break;
                    default:
                        OverlayMenuBubbleDialog._init_$lambda$8(this.f4512e, view);
                        break;
                }
            }
        });
        setClipChildren(false);
        TextView textView = overlayMenuBubbleBindingInflate.overlayMembersOverflowText;
        Intrinsics.checkNotNull(textView);
        DiscordFontUtilsKt.setDiscordFont(textView, DiscordFont.PrimaryExtraBold);
        SetTextSizeSpKt.setTextSizeSp(textView, 20.0f);
        TextView textView2 = overlayMenuBubbleBindingInflate.overlayMembersOverflowText;
        textView2.setTextColor(ThemeManagerKt.getTheme().getMobileTextHeadingPrimary());
        Intrinsics.checkNotNull(textView2);
        ViewBackgroundUtilsKt.setBackgroundOval$default(textView2, ThemeManagerKt.getTheme().getBackgroundBaseLowest(), 0, 2, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverlayMenuBubbleDialog(@NotNull Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        OverlayMenuBubbleBinding overlayMenuBubbleBindingInflate = OverlayMenuBubbleBinding.inflate(LayoutInflater.from(getContext()), this, true);
        Intrinsics.checkNotNullExpressionValue(overlayMenuBubbleBindingInflate, "inflate(...)");
        this.binding = overlayMenuBubbleBindingInflate;
        this.adapter = new VoiceUserAdapter();
        this.onGetInvitePressed = new com.discord.crash_reporting.d(19);
        this.onSwitchChannelsPressed = new com.discord.crash_reporting.d(20);
        this.onOpenDiscordPressed = new com.discord.crash_reporting.d(21);
        this.onMutePressed = new com.discord.crash_reporting.d(22);
        this.onDisconnectPressed = new com.discord.crash_reporting.d(23);
        this.onShowSelectorDialog = new com.discord.crash_reporting.d(24);
        final int i10 = 2;
        overlayMenuBubbleBindingInflate.overlayMenu.getBinding().overlayInviteLink.setOnClickListener(new View.OnClickListener(this) { // from class: com.discord.mobile_voice_overlay.views.a

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ OverlayMenuBubbleDialog f4512e;

            {
                this.f4512e = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        OverlayMenuBubbleDialog._init_$lambda$9(this.f4512e, view);
                        break;
                    case 1:
                        OverlayMenuBubbleDialog._init_$lambda$10(this.f4512e, view);
                        break;
                    case 2:
                        OverlayMenuBubbleDialog._init_$lambda$6(this.f4512e, view);
                        break;
                    case 3:
                        OverlayMenuBubbleDialog._init_$lambda$7(this.f4512e, view);
                        break;
                    default:
                        OverlayMenuBubbleDialog._init_$lambda$8(this.f4512e, view);
                        break;
                }
            }
        });
        final int i11 = 3;
        overlayMenuBubbleBindingInflate.overlayMenu.getBinding().overlaySwitchChannels.setOnClickListener(new View.OnClickListener(this) { // from class: com.discord.mobile_voice_overlay.views.a

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ OverlayMenuBubbleDialog f4512e;

            {
                this.f4512e = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        OverlayMenuBubbleDialog._init_$lambda$9(this.f4512e, view);
                        break;
                    case 1:
                        OverlayMenuBubbleDialog._init_$lambda$10(this.f4512e, view);
                        break;
                    case 2:
                        OverlayMenuBubbleDialog._init_$lambda$6(this.f4512e, view);
                        break;
                    case 3:
                        OverlayMenuBubbleDialog._init_$lambda$7(this.f4512e, view);
                        break;
                    default:
                        OverlayMenuBubbleDialog._init_$lambda$8(this.f4512e, view);
                        break;
                }
            }
        });
        final int i12 = 4;
        overlayMenuBubbleBindingInflate.overlayMenu.getBinding().overlayOpenApp.setOnClickListener(new View.OnClickListener(this) { // from class: com.discord.mobile_voice_overlay.views.a

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ OverlayMenuBubbleDialog f4512e;

            {
                this.f4512e = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        OverlayMenuBubbleDialog._init_$lambda$9(this.f4512e, view);
                        break;
                    case 1:
                        OverlayMenuBubbleDialog._init_$lambda$10(this.f4512e, view);
                        break;
                    case 2:
                        OverlayMenuBubbleDialog._init_$lambda$6(this.f4512e, view);
                        break;
                    case 3:
                        OverlayMenuBubbleDialog._init_$lambda$7(this.f4512e, view);
                        break;
                    default:
                        OverlayMenuBubbleDialog._init_$lambda$8(this.f4512e, view);
                        break;
                }
            }
        });
        final int i13 = 0;
        overlayMenuBubbleBindingInflate.overlayMenu.getBinding().muteToggle.setOnClickListener(new View.OnClickListener(this) { // from class: com.discord.mobile_voice_overlay.views.a

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ OverlayMenuBubbleDialog f4512e;

            {
                this.f4512e = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        OverlayMenuBubbleDialog._init_$lambda$9(this.f4512e, view);
                        break;
                    case 1:
                        OverlayMenuBubbleDialog._init_$lambda$10(this.f4512e, view);
                        break;
                    case 2:
                        OverlayMenuBubbleDialog._init_$lambda$6(this.f4512e, view);
                        break;
                    case 3:
                        OverlayMenuBubbleDialog._init_$lambda$7(this.f4512e, view);
                        break;
                    default:
                        OverlayMenuBubbleDialog._init_$lambda$8(this.f4512e, view);
                        break;
                }
            }
        });
        final int i14 = 1;
        overlayMenuBubbleBindingInflate.overlayMenu.getBinding().disconnectBtn.setOnClickListener(new View.OnClickListener(this) { // from class: com.discord.mobile_voice_overlay.views.a

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ OverlayMenuBubbleDialog f4512e;

            {
                this.f4512e = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        OverlayMenuBubbleDialog._init_$lambda$9(this.f4512e, view);
                        break;
                    case 1:
                        OverlayMenuBubbleDialog._init_$lambda$10(this.f4512e, view);
                        break;
                    case 2:
                        OverlayMenuBubbleDialog._init_$lambda$6(this.f4512e, view);
                        break;
                    case 3:
                        OverlayMenuBubbleDialog._init_$lambda$7(this.f4512e, view);
                        break;
                    default:
                        OverlayMenuBubbleDialog._init_$lambda$8(this.f4512e, view);
                        break;
                }
            }
        });
        setClipChildren(false);
        TextView textView = overlayMenuBubbleBindingInflate.overlayMembersOverflowText;
        Intrinsics.checkNotNull(textView);
        DiscordFontUtilsKt.setDiscordFont(textView, DiscordFont.PrimaryExtraBold);
        SetTextSizeSpKt.setTextSizeSp(textView, 20.0f);
        TextView textView2 = overlayMenuBubbleBindingInflate.overlayMembersOverflowText;
        textView2.setTextColor(ThemeManagerKt.getTheme().getMobileTextHeadingPrimary());
        Intrinsics.checkNotNull(textView2);
        ViewBackgroundUtilsKt.setBackgroundOval$default(textView2, ThemeManagerKt.getTheme().getBackgroundBaseLowest(), 0, 2, null);
    }
}

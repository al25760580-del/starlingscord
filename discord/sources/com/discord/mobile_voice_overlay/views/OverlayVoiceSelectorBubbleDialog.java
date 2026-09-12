package com.discord.mobile_voice_overlay.views;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Configuration;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.discord.device.views.DiscordRecyclerView;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.misc.utilities.view.ViewBackgroundUtilsKt;
import com.discord.mobile_voice_overlay.MobileVoiceOverlayAssets;
import com.discord.mobile_voice_overlay.MobileVoiceOverlayData;
import com.discord.mobile_voice_overlay.R;
import com.discord.mobile_voice_overlay.databinding.OverlayVoiceChannelSelectorBinding;
import com.discord.mobile_voice_overlay.utils.WindowUtils;
import com.discord.primitives.ChannelId;
import com.discord.react_asset_fetcher.ReactAsset;
import com.discord.react_asset_fetcher.ReactAssetUtilsKt;
import com.discord.theme.ThemeManagerKt;
import com.discord.theme.utils.ColorUtilsKt;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u000f\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u000eJ\u0019\u0010\u0014\u001a\u00020\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0016\u0010\u000eJ\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!R\u0016\u0010#\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R.\u0010+\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\f0)8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R.\u00102\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\f0)8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010,\u001a\u0004\b3\u0010.\"\u0004\b4\u00100¨\u00065"}, d2 = {"Lcom/discord/mobile_voice_overlay/views/OverlayVoiceSelectorBubbleDialog;", "Lcom/discord/mobile_voice_overlay/views/OverlayDialog;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "attributeSetId", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "onViewBound", "()V", "bindData", "()Lkotlin/Unit;", "bindAssets", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "onAttachedToWindow", "Landroid/animation/Animator;", "getClosingAnimator", "()Landroid/animation/Animator;", "Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayData;", "data", "setData", "(Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayData;)V", "Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayAssets;", "assets", "setAssets", "(Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayAssets;)V", "Lcom/discord/mobile_voice_overlay/databinding/OverlayVoiceChannelSelectorBinding;", "binding", "Lcom/discord/mobile_voice_overlay/databinding/OverlayVoiceChannelSelectorBinding;", "Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayData;", "Lcom/discord/mobile_voice_overlay/views/ResultAdapter;", "adapter", "Lcom/discord/mobile_voice_overlay/views/ResultAdapter;", "Lkotlin/Function1;", "", "onTextChanged", "Lkotlin/jvm/functions/Function1;", "getOnTextChanged", "()Lkotlin/jvm/functions/Function1;", "setOnTextChanged", "(Lkotlin/jvm/functions/Function1;)V", "Lcom/discord/primitives/ChannelId;", "onChannelSelected", "getOnChannelSelected", "setOnChannelSelected", "mobile_voice_overlay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nOverlayVoiceSelectorBubbleDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OverlayVoiceSelectorBubbleDialog.kt\ncom/discord/mobile_voice_overlay/views/OverlayVoiceSelectorBubbleDialog\n+ 2 TextView.kt\nandroidx/core/widget/TextViewKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,203:1\n39#2:204\n55#2,12:205\n84#2,3:217\n257#3,2:220\n257#3,2:222\n*S KotlinDebug\n*F\n+ 1 OverlayVoiceSelectorBubbleDialog.kt\ncom/discord/mobile_voice_overlay/views/OverlayVoiceSelectorBubbleDialog\n*L\n60#1:204\n60#1:205,12\n60#1:217,3\n121#1:220,2\n122#1:222,2\n*E\n"})
public final class OverlayVoiceSelectorBubbleDialog extends OverlayDialog {

    @NotNull
    private final ResultAdapter adapter;

    @NotNull
    private OverlayVoiceChannelSelectorBinding binding;
    private MobileVoiceOverlayData data;

    @NotNull
    private Function1<? super ChannelId, Unit> onChannelSelected;

    @NotNull
    private Function1<? super String, Unit> onTextChanged;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverlayVoiceSelectorBubbleDialog(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        OverlayVoiceChannelSelectorBinding overlayVoiceChannelSelectorBindingInflate = OverlayVoiceChannelSelectorBinding.inflate(LayoutInflater.from(getContext()), this, true);
        Intrinsics.checkNotNullExpressionValue(overlayVoiceChannelSelectorBindingInflate, "inflate(...)");
        this.binding = overlayVoiceChannelSelectorBindingInflate;
        this.adapter = new ResultAdapter(new Function1() { // from class: com.discord.mobile_voice_overlay.views.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OverlayVoiceSelectorBubbleDialog.adapter$lambda$0(this.f4518d, (ChannelId) obj);
            }
        });
        WindowUtils.INSTANCE.removeFlag(getWindowLayoutParams(), 8);
        this.onTextChanged = new com.discord.emoji.a(16);
        this.onChannelSelected = new com.discord.emoji.a(17);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit adapter$lambda$0(OverlayVoiceSelectorBubbleDialog overlayVoiceSelectorBubbleDialog, ChannelId channelId) {
        overlayVoiceSelectorBubbleDialog.onChannelSelected.invoke(channelId);
        return Unit.f14616a;
    }

    private final void bindAssets() {
        MobileVoiceOverlayAssets overlayAssets = getOverlayAssets();
        if (overlayAssets != null) {
            this.binding.channelSelect.setText(overlayAssets.getChannelSelect());
            this.binding.emptyResults.setText(overlayAssets.getNoResults());
            this.binding.overlayChannelSearch.setHint(overlayAssets.getSearchChannels());
            this.binding.close.setContentDescription(overlayAssets.getCloseWindow());
            SimpleDraweeView close = this.binding.close;
            Intrinsics.checkNotNullExpressionValue(close, "close");
            ColorUtilsKt.setTintColor(close, Integer.valueOf(ThemeManagerKt.getTheme().getInteractiveTextDefault()));
            SimpleDraweeView close2 = this.binding.close;
            Intrinsics.checkNotNullExpressionValue(close2, "close");
            ReactAssetUtilsKt.setReactAsset(close2, ReactAsset.XSmallIcon);
        }
    }

    private final Unit bindData() {
        MobileVoiceOverlayData mobileVoiceOverlayData = this.data;
        if (mobileVoiceOverlayData == null) {
            return null;
        }
        boolean zIsEmpty = mobileVoiceOverlayData.getChannelSelectorResults().isEmpty();
        TextView emptyResults = this.binding.emptyResults;
        Intrinsics.checkNotNullExpressionValue(emptyResults, "emptyResults");
        emptyResults.setVisibility(zIsEmpty ? 0 : 8);
        DiscordRecyclerView resultsRv = this.binding.resultsRv;
        Intrinsics.checkNotNullExpressionValue(resultsRv, "resultsRv");
        resultsRv.setVisibility(zIsEmpty ? 8 : 0);
        if (!zIsEmpty) {
            this.adapter.setResults(mobileVoiceOverlayData.getChannelSelectorResults());
        }
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onChannelSelected$lambda$2(ChannelId channelId) {
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onTextChanged$lambda$1(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f14616a;
    }

    private final void onViewBound() {
        this.binding.close.setOnClickListener(new e(2, this));
        EditText overlayChannelSearch = this.binding.overlayChannelSearch;
        Intrinsics.checkNotNullExpressionValue(overlayChannelSearch, "overlayChannelSearch");
        overlayChannelSearch.addTextChangedListener(new TextWatcher() { // from class: com.discord.mobile_voice_overlay.views.OverlayVoiceSelectorBubbleDialog$onViewBound$$inlined$doOnTextChanged$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable s2) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence text, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence text, int start, int before, int count) {
                String string;
                Function1<String, Unit> onTextChanged = this.this$0.getOnTextChanged();
                if (text == null || (string = text.toString()) == null) {
                    string = "";
                }
                onTextChanged.invoke(string);
            }
        });
        TextView channelSelect = this.binding.channelSelect;
        Intrinsics.checkNotNullExpressionValue(channelSelect, "channelSelect");
        DiscordFontUtilsKt.setDiscordFont(channelSelect, DiscordFont.PrimarySemibold);
        TextView textView = this.binding.emptyResults;
        Intrinsics.checkNotNull(textView);
        DiscordFont discordFont = DiscordFont.PrimaryMedium;
        DiscordFontUtilsKt.setDiscordFont(textView, discordFont);
        textView.setVisibility(8);
        EditText overlayChannelSearch2 = this.binding.overlayChannelSearch;
        Intrinsics.checkNotNullExpressionValue(overlayChannelSearch2, "overlayChannelSearch");
        DiscordFontUtilsKt.setDiscordFont(overlayChannelSearch2, discordFont);
        LinearLayout menuContainer = this.binding.menuContainer;
        Intrinsics.checkNotNullExpressionValue(menuContainer, "menuContainer");
        ViewBackgroundUtilsKt.setBackgroundRectangle$default(menuContainer, ThemeManagerKt.getTheme().getBackgroundBaseLowest(), 4, null, 0, 12, null);
        this.binding.dialogCard.setCardBackgroundColor(ThemeManagerKt.getTheme().getBackgroundBaseLower());
        this.binding.channelSelect.setTextColor(ThemeManagerKt.getTheme().getTextDefault());
        this.binding.emptyResults.setTextColor(ThemeManagerKt.getTheme().getTextDefault());
        EditText editText = this.binding.overlayChannelSearch;
        Intrinsics.checkNotNull(editText);
        ViewBackgroundUtilsKt.setBackgroundRectangle$default(editText, ThemeManagerKt.getTheme().getBackgroundModMuted(), 8, null, 0, 12, null);
        editText.setHintTextColor(ThemeManagerKt.getTheme().getTextSubtle());
        editText.setTextColor(ThemeManagerKt.getTheme().getMobileTextHeadingPrimary());
        this.binding.resultsRv.setAdapter(this.adapter);
        bindAssets();
        bindData();
    }

    @Override // com.discord.mobile_voice_overlay.views.OverlayDialog
    @NotNull
    public Animator getClosingAnimator() {
        Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(getContext(), R.animator.overlay_slide_down_fade_out);
        animatorLoadAnimator.setTarget(this.binding.dialogCard);
        Intrinsics.checkNotNullExpressionValue(animatorLoadAnimator, "apply(...)");
        return animatorLoadAnimator;
    }

    @NotNull
    public final Function1<ChannelId, Unit> getOnChannelSelected() {
        return this.onChannelSelected;
    }

    @NotNull
    public final Function1<String, Unit> getOnTextChanged() {
        return this.onTextChanged;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        onViewBound();
        Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(getContext(), R.animator.overlay_slide_up_fade_in);
        animatorLoadAnimator.setTarget(this.binding.dialogCard);
        animatorLoadAnimator.start();
    }

    @Override // com.discord.mobile_voice_overlay.views.OverlayDialog, com.discord.mobile_voice_overlay.views.OverlayBubbleWrap, android.view.View
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        removeAllViewsInLayout();
        OverlayVoiceChannelSelectorBinding overlayVoiceChannelSelectorBindingInflate = OverlayVoiceChannelSelectorBinding.inflate(LayoutInflater.from(getContext()), this, true);
        Intrinsics.checkNotNullExpressionValue(overlayVoiceChannelSelectorBindingInflate, "inflate(...)");
        this.binding = overlayVoiceChannelSelectorBindingInflate;
        onViewBound();
    }

    @Override // com.discord.mobile_voice_overlay.views.OverlayView
    public void setAssets(@NotNull MobileVoiceOverlayAssets assets) {
        Intrinsics.checkNotNullParameter(assets, "assets");
        super.setAssets(assets);
        bindAssets();
    }

    @Override // com.discord.mobile_voice_overlay.views.OverlayView
    public void setData(@NotNull MobileVoiceOverlayData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.data = data;
        bindData();
    }

    public final void setOnChannelSelected(@NotNull Function1<? super ChannelId, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.onChannelSelected = function1;
    }

    public final void setOnTextChanged(@NotNull Function1<? super String, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.onTextChanged = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverlayVoiceSelectorBubbleDialog(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        OverlayVoiceChannelSelectorBinding overlayVoiceChannelSelectorBindingInflate = OverlayVoiceChannelSelectorBinding.inflate(LayoutInflater.from(getContext()), this, true);
        Intrinsics.checkNotNullExpressionValue(overlayVoiceChannelSelectorBindingInflate, "inflate(...)");
        this.binding = overlayVoiceChannelSelectorBindingInflate;
        this.adapter = new ResultAdapter(new Function1() { // from class: com.discord.mobile_voice_overlay.views.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OverlayVoiceSelectorBubbleDialog.adapter$lambda$0(this.f4518d, (ChannelId) obj);
            }
        });
        WindowUtils.INSTANCE.removeFlag(getWindowLayoutParams(), 8);
        this.onTextChanged = new com.discord.emoji.a(16);
        this.onChannelSelected = new com.discord.emoji.a(17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverlayVoiceSelectorBubbleDialog(@NotNull Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        OverlayVoiceChannelSelectorBinding overlayVoiceChannelSelectorBindingInflate = OverlayVoiceChannelSelectorBinding.inflate(LayoutInflater.from(getContext()), this, true);
        Intrinsics.checkNotNullExpressionValue(overlayVoiceChannelSelectorBindingInflate, "inflate(...)");
        this.binding = overlayVoiceChannelSelectorBindingInflate;
        this.adapter = new ResultAdapter(new Function1() { // from class: com.discord.mobile_voice_overlay.views.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OverlayVoiceSelectorBubbleDialog.adapter$lambda$0(this.f4518d, (ChannelId) obj);
            }
        });
        WindowUtils.INSTANCE.removeFlag(getWindowLayoutParams(), 8);
        this.onTextChanged = new com.discord.emoji.a(16);
        this.onChannelSelected = new com.discord.emoji.a(17);
    }
}

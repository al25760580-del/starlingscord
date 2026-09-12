package com.discord.chat.presentation.message.view.botuikit.components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.r0;
import c9.a;
import com.discord.chat.bridge.botuikit.ActionComponentState;
import com.discord.chat.bridge.botuikit.ComponentEmoji;
import com.discord.chat.bridge.botuikit.SearchableSelectItem;
import com.discord.chat.bridge.botuikit.SelectComponent;
import com.discord.chat.bridge.botuikit.SelectItem;
import com.discord.chat.bridge.botuikit.SelectOptionType;
import com.discord.chat.bridge.botuikit.StringSelectItem;
import com.discord.chat.databinding.MessageComponentSelectPillViewBinding;
import com.discord.chat.databinding.MessageComponentSelectViewBinding;
import com.discord.chat.presentation.list.f;
import com.discord.chat.presentation.message.t;
import com.discord.chat.presentation.message.view.botuikit.ComponentContext;
import com.discord.chat.presentation.message.view.botuikit.ComponentProvider;
import com.discord.chat.presentation.message.view.botuikit.ComponentView;
import com.discord.chat.presentation.message.view.botuikit.ComponentViewKt;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.image.fresco.DiskCachePolicyKt;
import com.discord.image.fresco.postprocessors.PostProcessor;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.misc.utilities.view.ViewBackgroundUtilsKt;
import com.discord.misc.utilities.view.ViewGroupUtilsKt;
import com.discord.progress_dots.ProgressDots;
import com.discord.react.utilities.ReactSelfMeasurer;
import com.discord.react.utilities.ReactSelfMeasuringView;
import com.discord.react_asset_fetcher.ReactAsset;
import com.discord.react_asset_fetcher.ReactAssetUtilsKt;
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt;
import com.discord.ripple.RippleUtilsKt;
import com.discord.theme.ThemeManagerKt;
import com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder;
import com.facebook.drawee.drawable.o;
import com.facebook.drawee.generic.GenericDraweeHierarchyBuilder;
import com.facebook.drawee.span.DraweeSpanStringBuilder;
import com.facebook.drawee.span.SimpleDraweeSpanTextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.request.BasePostprocessor;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.facebook.react.common.assets.ReactFontManager;
import com.facebook.react.uimanager.ViewProps;
import com.google.android.flexbox.FlexboxLayout;
import com.google.android.material.textview.MaterialTextView;
import f9.c;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import rn.l;
import rn.n;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 =2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u0004:\u0001=B'\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\"\u001a\u00020#H\u0016J\u0018\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\n2\u0006\u0010&\u001a\u00020\nH\u0014J \u0010'\u001a\u00020#2\u0006\u0010(\u001a\u00020\u00032\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0016J\u0016\u0010'\u001a\u00020#2\u0006\u0010(\u001a\u00020\u00032\u0006\u0010+\u001a\u00020,J\u0010\u0010-\u001a\u00020#2\u0006\u0010+\u001a\u00020,H\u0002J\u000e\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00030/H\u0016J/\u00100\u001a\u00020#2\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u00010\n2\u0006\u00106\u001a\u00020\u001dH\u0002¢\u0006\u0002\u00107J\u001a\u00108\u001a\u00020#*\u0002092\f\u0010:\u001a\b\u0012\u0004\u0012\u00020<0;H\u0002R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\u00020\u001fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u0006>"}, d2 = {"Lcom/discord/chat/presentation/message/view/botuikit/components/SelectComponentView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/discord/chat/presentation/message/view/botuikit/ComponentView;", "Lcom/discord/chat/bridge/botuikit/SelectComponent;", "Lcom/discord/react/utilities/ReactSelfMeasuringView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/discord/chat/databinding/MessageComponentSelectViewBinding;", "getBinding", "()Lcom/discord/chat/databinding/MessageComponentSelectViewBinding;", "progressDots", "Lcom/discord/progress_dots/ProgressDots;", "getProgressDots", "()Lcom/discord/progress_dots/ProgressDots;", "progressDots$delegate", "Lkotlin/Lazy;", "postProcessor", "Lcom/facebook/imagepipeline/request/BasePostprocessor;", "getPostProcessor", "()Lcom/facebook/imagepipeline/request/BasePostprocessor;", "postProcessor$delegate", "currentIsLoading", "", "reactSelfMeasurer", "Lcom/discord/react/utilities/ReactSelfMeasurer;", "getReactSelfMeasurer", "()Lcom/discord/react/utilities/ReactSelfMeasurer;", "requestLayout", "", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "configure", "component", "componentProvider", "Lcom/discord/chat/presentation/message/view/botuikit/ComponentProvider;", "componentContext", "Lcom/discord/chat/presentation/message/view/botuikit/ComponentContext;", "configureWidth", "getComponentType", "Lkotlin/reflect/KClass;", "setImage", "view", "Lcom/facebook/drawee/span/SimpleDraweeSpanTextView;", "imageUrl", "", ViewProps.COLOR, "asCircle", "(Lcom/facebook/drawee/span/SimpleDraweeSpanTextView;Ljava/lang/String;Ljava/lang/Integer;Z)V", "setSelectedOptions", "Lcom/google/android/flexbox/FlexboxLayout;", "selectedItems", "", "Lcom/discord/chat/bridge/botuikit/SelectItem;", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSelectComponentView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectComponentView.kt\ncom/discord/chat/presentation/message/view/botuikit/components/SelectComponentView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 Uri.kt\nandroidx/core/net/UriKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,283:1\n176#2,2:284\n257#2,2:286\n257#2,2:288\n257#2,2:290\n257#2,2:292\n257#2,2:294\n257#2,2:296\n257#2,2:298\n257#2,2:300\n257#2,2:302\n257#2,2:304\n278#2,2:306\n257#2,2:308\n29#3:310\n1878#4,3:311\n*S KotlinDebug\n*F\n+ 1 SelectComponentView.kt\ncom/discord/chat/presentation/message/view/botuikit/components/SelectComponentView\n*L\n73#1:284,2\n119#1:286,2\n120#1:288,2\n141#1:290,2\n143#1:292,2\n150#1:294,2\n151#1:296,2\n152#1:298,2\n157#1:300,2\n158#1:302,2\n159#1:304,2\n167#1:306,2\n170#1:308,2\n222#1:310\n278#1:311,3\n*E\n"})
public final class SelectComponentView extends ConstraintLayout implements ComponentView<SelectComponent>, ReactSelfMeasuringView {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final MessageComponentSelectViewBinding binding;
    private boolean currentIsLoading;

    /* JADX INFO: renamed from: postProcessor$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy postProcessor;

    /* JADX INFO: renamed from: progressDots$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy progressDots;

    @NotNull
    private final ReactSelfMeasurer reactSelfMeasurer;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/discord/chat/presentation/message/view/botuikit/components/SelectComponentView$Companion;", "", "<init>", "()V", "inflateComponent", "Lcom/discord/chat/presentation/message/view/botuikit/components/SelectComponentView;", "context", "Landroid/content/Context;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final SelectComponentView inflateComponent(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new SelectComponentView(context, null, 0, 6, null);
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SelectComponentView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void configure$lambda$3(ComponentContext componentContext, SelectComponent selectComponent, View view) {
        componentContext.getComponentActionEventHandlers().getOnTapSelectActionComponent().invoke(selectComponent.getId());
    }

    private final void configureWidth(ComponentContext componentContext) {
        if (componentContext.isInModal() || !componentContext.getWidthInfo().isLargeWidthRenderingMode()) {
            setMaxWidth(Integer.MAX_VALUE);
            setMinWidth(0);
            setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        } else if (!componentContext.isInContainerComponent()) {
            setMaxWidth(SizeUtilsKt.getDpToPx(ReactFontManager.TypefaceStyle.NORMAL));
            setMinWidth(SizeUtilsKt.getDpToPx(ReactFontManager.TypefaceStyle.NORMAL));
            setLayoutParams(new LinearLayout.LayoutParams(SizeUtilsKt.getDpToPx(ReactFontManager.TypefaceStyle.NORMAL), -2));
        } else {
            setMaxWidth(Integer.MAX_VALUE);
            setMinWidth(SizeUtilsKt.getDpToPx(ReactFontManager.TypefaceStyle.NORMAL));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.weight = 1.0f;
            setLayoutParams(layoutParams);
        }
    }

    private final BasePostprocessor getPostProcessor() {
        return (BasePostprocessor) this.postProcessor.getValue();
    }

    private final ProgressDots getProgressDots() {
        return (ProgressDots) this.progressDots.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BasePostprocessor postProcessor_delegate$lambda$1() {
        return PostProcessor.Circle.INSTANCE.create();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProgressDots progressDots_delegate$lambda$0(SelectComponentView selectComponentView) {
        View viewInflate = selectComponentView.binding.loadingDots.inflate();
        Intrinsics.checkNotNull(viewInflate, "null cannot be cast to non-null type com.discord.progress_dots.ProgressDots");
        return (ProgressDots) viewInflate;
    }

    private final void setImage(SimpleDraweeSpanTextView view, String imageUrl, Integer color, boolean asCircle) {
        DraweeSpanStringBuilder draweeSpanStringBuilder = new DraweeSpanStringBuilder();
        int dpToPx = SizeUtilsKt.getDpToPx(20);
        draweeSpanStringBuilder.append((char) 8203);
        Uri uri = Uri.parse(imageUrl);
        ImageRequestBuilder imageRequestBuilderD = ImageRequestBuilder.d(uri);
        Intrinsics.checkNotNullExpressionValue(imageRequestBuilderD, "newBuilderWithSource(...)");
        ImageRequestBuilder imageRequestBuilderApplyDiscordDiskCachePolicy = DiskCachePolicyKt.applyDiscordDiskCachePolicy(imageRequestBuilderD, uri);
        imageRequestBuilderApplyDiscordDiskCachePolicy.f5129d = new ResizeOptions(dpToPx, dpToPx);
        imageRequestBuilderApplyDiscordDiskCachePolicy.f5127b = ImageRequest.RequestLevel.FULL_FETCH;
        if (asCircle) {
            imageRequestBuilderApplyDiscordDiskCachePolicy.f5135l = getPostProcessor();
        }
        PipelineDraweeControllerBuilder pipelineDraweeControllerBuilderA = a.f3531a.get();
        pipelineDraweeControllerBuilderA.f4633b = imageRequestBuilderApplyDiscordDiskCachePolicy.a();
        c cVarA = pipelineDraweeControllerBuilderA.a();
        Intrinsics.checkNotNullExpressionValue(cVarA, "build(...)");
        GenericDraweeHierarchyBuilder genericDraweeHierarchyBuilder = new GenericDraweeHierarchyBuilder(getContext().getResources());
        genericDraweeHierarchyBuilder.f4714l = o.f4692f;
        Intrinsics.checkNotNullExpressionValue(genericDraweeHierarchyBuilder, "setActualImageScaleType(...)");
        if (color != null) {
            genericDraweeHierarchyBuilder.f4715m = new PorterDuffColorFilter(color.intValue(), PorterDuff.Mode.SRC_IN);
        }
        getContext();
        draweeSpanStringBuilder.c(genericDraweeHierarchyBuilder.a(), cVarA, 0, dpToPx, dpToPx, 1);
        view.setDraweeSpanStringBuilder(draweeSpanStringBuilder);
    }

    private final void setSelectedOptions(FlexboxLayout flexboxLayout, List<? extends SelectItem> list) {
        ViewGroupUtilsKt.setUpLayoutForList(flexboxLayout, list.size(), new r0(14, LayoutInflater.from(flexboxLayout.getContext())));
        int i7 = 0;
        for (Object obj : list) {
            int i10 = i7 + 1;
            if (i7 < 0) {
                d0.k();
                throw null;
            }
            SelectItem selectItem = (SelectItem) obj;
            View childAt = flexboxLayout.getChildAt(i7);
            TextView textView = childAt instanceof TextView ? (TextView) childAt : null;
            if (textView != null) {
                textView.setText(selectItem.getLabel());
            }
            i7 = i10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View setSelectedOptions$lambda$5(LayoutInflater layoutInflater) {
        MaterialTextView root = MessageComponentSelectPillViewBinding.inflate(layoutInflater).getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        DiscordFontUtilsKt.setDiscordFont(root, DiscordFont.PrimaryMedium);
        ViewBackgroundUtilsKt.setBackgroundRectangle$default(root, ThemeManagerKt.getTheme().getMobileLegacyButtonSecondaryBackgroundDefault(), SizeUtilsKt.getDpToPx(4), null, 0, 12, null);
        root.setTextColor(ThemeManagerKt.getTheme().getTextDefault());
        return root;
    }

    @NotNull
    public final MessageComponentSelectViewBinding getBinding() {
        return this.binding;
    }

    @Override // com.discord.chat.presentation.message.view.botuikit.ComponentView
    @NotNull
    public KClass getComponentType() {
        return Reflection.getOrCreateKotlinClass(SelectComponent.class);
    }

    @Override // com.discord.react.utilities.ReactSelfMeasuringView
    @NotNull
    public ReactSelfMeasurer getReactSelfMeasurer() {
        return this.reactSelfMeasurer;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, getReactSelfMeasurer().measureHeightSpec(heightMeasureSpec));
        getReactSelfMeasurer().publishHeight(getMeasuredHeight());
    }

    @Override // com.discord.chat.presentation.message.view.botuikit.ComponentView
    public void onRecycle(@NotNull ComponentProvider componentProvider) {
        ComponentView.DefaultImpls.onRecycle(this, componentProvider);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View, android.view.ViewParent
    public void requestLayout() {
        super.requestLayout();
        ReactSelfMeasurer reactSelfMeasurer = getReactSelfMeasurer();
        if (reactSelfMeasurer != null) {
            reactSelfMeasurer.onRequestLayout();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SelectComponentView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.discord.chat.presentation.message.view.botuikit.ComponentView
    public void configure(@NotNull SelectComponent component, @NotNull ComponentProvider componentProvider, @NotNull ComponentContext componentContext) {
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(componentProvider, "componentProvider");
        Intrinsics.checkNotNullParameter(componentContext, "componentContext");
        configure(component, componentContext);
    }

    public /* synthetic */ SelectComponentView(Context context, AttributeSet attributeSet, int i7, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet, (i10 & 4) != 0 ? 0 : i7);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x010f  */
    public final void configure(@NotNull SelectComponent component, @NotNull ComponentContext componentContext) {
        ComponentEmoji iconEmoji;
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(componentContext, "componentContext");
        String placeholder = component.getPlaceholder();
        configureWidth(componentContext);
        View root = this.binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        RippleUtilsKt.addRipple(root, true, SizeUtilsKt.getDpToPx(4));
        View root2 = this.binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root2, "getRoot(...)");
        ViewBackgroundUtilsKt.setBackgroundRectangle(root2, ThemeManagerKt.getTheme().getBackgroundSurfaceHigh(), SizeUtilsKt.getDpToPx(4), Integer.valueOf(ThemeManagerKt.getTheme().getBackgroundBaseLowest()), SizeUtilsKt.getDpToPx(1));
        MaterialTextView selectComponentSelectionText = this.binding.selectComponentSelectionText;
        Intrinsics.checkNotNullExpressionValue(selectComponentSelectionText, "selectComponentSelectionText");
        DiscordFontUtilsKt.setDiscordFont(selectComponentSelectionText, DiscordFont.PrimaryMedium);
        SimpleDraweeView selectComponentChevron = this.binding.selectComponentChevron;
        Intrinsics.checkNotNullExpressionValue(selectComponentChevron, "selectComponentChevron");
        ReactAssetUtilsKt.setReactAsset(selectComponentChevron, ReactAsset.ChevronSmallRightIcon);
        List<SelectItem> selectedItems = component.getSelectedItems();
        boolean z5 = false;
        if (!selectedItems.isEmpty()) {
            if (component.getMaxValues() == 1) {
                MaterialTextView selectComponentSelectionText2 = this.binding.selectComponentSelectionText;
                Intrinsics.checkNotNullExpressionValue(selectComponentSelectionText2, "selectComponentSelectionText");
                selectComponentSelectionText2.setVisibility(0);
                FlexboxLayout selectComponentSelectionsRoot = this.binding.selectComponentSelectionsRoot;
                Intrinsics.checkNotNullExpressionValue(selectComponentSelectionsRoot, "selectComponentSelectionsRoot");
                selectComponentSelectionsRoot.setVisibility(8);
                this.binding.selectComponentSelectionText.setTextColor(ThemeManagerKt.getTheme().getTextDefault());
                SelectItem selectItem = (SelectItem) CollectionsKt.firstOrNull(selectedItems);
                if (selectItem != null) {
                    this.binding.selectComponentSelectionText.setText(selectItem.getLabel());
                    if (selectItem instanceof StringSelectItem) {
                        iconEmoji = ((StringSelectItem) selectItem).getEmoji();
                    } else {
                        if (!(selectItem instanceof SearchableSelectItem)) {
                            throw new n();
                        }
                        iconEmoji = ((SearchableSelectItem) selectItem).getIconEmoji();
                    }
                    if (iconEmoji != null) {
                        SimpleDraweeSpanTextView selectComponentSelectionIcon = this.binding.selectComponentSelectionIcon;
                        Intrinsics.checkNotNullExpressionValue(selectComponentSelectionIcon, "selectComponentSelectionIcon");
                        ComponentViewKt.setEmojiOrHide(selectComponentSelectionIcon, iconEmoji);
                    } else if (selectItem instanceof SearchableSelectItem) {
                        SearchableSelectItem searchableSelectItem = (SearchableSelectItem) selectItem;
                        if (searchableSelectItem.getIconSrc() != null) {
                            SimpleDraweeSpanTextView selectComponentSelectionIcon2 = this.binding.selectComponentSelectionIcon;
                            Intrinsics.checkNotNullExpressionValue(selectComponentSelectionIcon2, "selectComponentSelectionIcon");
                            setImage(selectComponentSelectionIcon2, searchableSelectItem.getIconSrc(), searchableSelectItem.getIconColor(), searchableSelectItem.getType() == SelectOptionType.USER);
                            SimpleDraweeSpanTextView selectComponentSelectionIcon3 = this.binding.selectComponentSelectionIcon;
                            Intrinsics.checkNotNullExpressionValue(selectComponentSelectionIcon3, "selectComponentSelectionIcon");
                            selectComponentSelectionIcon3.setVisibility(0);
                        } else {
                            SimpleDraweeSpanTextView selectComponentSelectionIcon4 = this.binding.selectComponentSelectionIcon;
                            Intrinsics.checkNotNullExpressionValue(selectComponentSelectionIcon4, "selectComponentSelectionIcon");
                            selectComponentSelectionIcon4.setVisibility(8);
                        }
                    } else {
                        SimpleDraweeSpanTextView selectComponentSelectionIcon5 = this.binding.selectComponentSelectionIcon;
                        Intrinsics.checkNotNullExpressionValue(selectComponentSelectionIcon5, "selectComponentSelectionIcon");
                        selectComponentSelectionIcon5.setVisibility(8);
                    }
                }
            } else {
                FlexboxLayout selectComponentSelectionsRoot2 = this.binding.selectComponentSelectionsRoot;
                Intrinsics.checkNotNullExpressionValue(selectComponentSelectionsRoot2, "selectComponentSelectionsRoot");
                MaterialTextView selectComponentSelectionText3 = this.binding.selectComponentSelectionText;
                Intrinsics.checkNotNullExpressionValue(selectComponentSelectionText3, "selectComponentSelectionText");
                selectComponentSelectionText3.setVisibility(8);
                SimpleDraweeSpanTextView selectComponentSelectionIcon6 = this.binding.selectComponentSelectionIcon;
                Intrinsics.checkNotNullExpressionValue(selectComponentSelectionIcon6, "selectComponentSelectionIcon");
                selectComponentSelectionIcon6.setVisibility(8);
                selectComponentSelectionsRoot2.setVisibility(0);
                setSelectedOptions(selectComponentSelectionsRoot2, selectedItems);
            }
        } else {
            MaterialTextView selectComponentSelectionText4 = this.binding.selectComponentSelectionText;
            Intrinsics.checkNotNullExpressionValue(selectComponentSelectionText4, "selectComponentSelectionText");
            selectComponentSelectionText4.setVisibility(0);
            SimpleDraweeSpanTextView selectComponentSelectionIcon7 = this.binding.selectComponentSelectionIcon;
            Intrinsics.checkNotNullExpressionValue(selectComponentSelectionIcon7, "selectComponentSelectionIcon");
            selectComponentSelectionIcon7.setVisibility(8);
            FlexboxLayout selectComponentSelectionsRoot3 = this.binding.selectComponentSelectionsRoot;
            Intrinsics.checkNotNullExpressionValue(selectComponentSelectionsRoot3, "selectComponentSelectionsRoot");
            selectComponentSelectionsRoot3.setVisibility(8);
            this.binding.selectComponentSelectionText.setTextColor(ThemeManagerKt.getTheme().getTextDefault());
            this.binding.selectComponentSelectionText.setText(placeholder);
        }
        boolean z6 = component.getState() == ActionComponentState.DISABLED || component.getDisabled();
        boolean z7 = component.getState() == ActionComponentState.LOADING;
        SimpleDraweeView selectComponentChevron2 = this.binding.selectComponentChevron;
        Intrinsics.checkNotNullExpressionValue(selectComponentChevron2, "selectComponentChevron");
        selectComponentChevron2.setVisibility(z7 ? 4 : 0);
        if (z7 != this.currentIsLoading) {
            getProgressDots().setVisibility(z7 ? 0 : 8);
        }
        this.currentIsLoading = z7;
        this.binding.getRoot().setAlpha(z6 ? 0.3f : 1.0f);
        View root3 = this.binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root3, "getRoot(...)");
        NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(root3, false, new t(7, componentContext, component), 1, null);
        View root4 = this.binding.getRoot();
        if (!z7 && !z6) {
            z5 = true;
        }
        root4.setClickable(z5);
        this.binding.getRoot().setEnabled(!z6);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectComponentView(@NotNull Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        MessageComponentSelectViewBinding messageComponentSelectViewBindingInflate = MessageComponentSelectViewBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(messageComponentSelectViewBindingInflate, "inflate(...)");
        this.binding = messageComponentSelectViewBindingInflate;
        this.progressDots = l.b(new r0(15, this));
        this.postProcessor = l.b(new f(20));
        this.reactSelfMeasurer = new ReactSelfMeasurer(this);
        setMinHeight(SizeUtilsKt.getDpToPx(40));
        int dpToPx = SizeUtilsKt.getDpToPx(8);
        setPadding(dpToPx, dpToPx, dpToPx, dpToPx);
    }
}

package com.discord.chat.presentation.message.view.botuikit.components;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.discord.chat.bridge.botuikit.ActionRowComponent;
import com.discord.chat.bridge.botuikit.Component;
import com.discord.chat.databinding.MessageComponentActionRowViewBinding;
import com.discord.chat.presentation.message.view.botuikit.ComponentContext;
import com.discord.chat.presentation.message.view.botuikit.ComponentProvider;
import com.discord.chat.presentation.message.view.botuikit.ComponentView;
import com.discord.chat.presentation.message.view.botuikit.MessageComponentsViewKt;
import com.discord.react_asset_fetcher.ReactAsset;
import com.discord.react_asset_fetcher.ReactAssetUtilsKt;
import com.discord.theme.ThemeManagerKt;
import com.discord.theme.utils.ColorUtilsKt;
import com.facebook.drawee.view.SimpleDraweeView;
import com.google.android.flexbox.FlexboxLayout;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.d0;
import kotlin.collections.e0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001a2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u001aB'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u0015H\u0016J \u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0019H\u0016R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/discord/chat/presentation/message/view/botuikit/components/ActionRowComponentView;", "Landroid/widget/LinearLayout;", "Lcom/discord/chat/presentation/message/view/botuikit/ComponentView;", "Lcom/discord/chat/bridge/botuikit/ActionRowComponent;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/discord/chat/databinding/MessageComponentActionRowViewBinding;", "getBinding", "()Lcom/discord/chat/databinding/MessageComponentActionRowViewBinding;", "onRecycle", "", "componentProvider", "Lcom/discord/chat/presentation/message/view/botuikit/ComponentProvider;", "getComponentType", "Lkotlin/reflect/KClass;", "configure", "component", "componentContext", "Lcom/discord/chat/presentation/message/view/botuikit/ComponentContext;", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nActionRowComponentView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActionRowComponentView.kt\ncom/discord/chat/presentation/message/view/botuikit/components/ActionRowComponentView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,82:1\n1573#2:83\n1604#2,4:84\n257#3,2:88\n257#3,2:90\n*S KotlinDebug\n*F\n+ 1 ActionRowComponentView.kt\ncom/discord/chat/presentation/message/view/botuikit/components/ActionRowComponentView\n*L\n51#1:83\n51#1:84,4\n61#1:88,2\n63#1:90,2\n*E\n"})
public final class ActionRowComponentView extends LinearLayout implements ComponentView<ActionRowComponent> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final MessageComponentActionRowViewBinding binding;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lcom/discord/chat/presentation/message/view/botuikit/components/ActionRowComponentView$Companion;", "", "<init>", "()V", "inflateComponent", "Lcom/discord/chat/presentation/message/view/botuikit/ComponentView;", "Lcom/discord/chat/bridge/botuikit/ActionRowComponent;", "context", "Landroid/content/Context;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ComponentView<ActionRowComponent> inflateComponent(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new ActionRowComponentView(context, null, 0, 6, null);
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ActionRowComponentView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @NotNull
    public final MessageComponentActionRowViewBinding getBinding() {
        return this.binding;
    }

    @Override // com.discord.chat.presentation.message.view.botuikit.ComponentView
    @NotNull
    public KClass getComponentType() {
        return Reflection.getOrCreateKotlinClass(ActionRowComponent.class);
    }

    @Override // com.discord.chat.presentation.message.view.botuikit.ComponentView
    public void onRecycle(@NotNull ComponentProvider componentProvider) {
        Intrinsics.checkNotNullParameter(componentProvider, "componentProvider");
        FlexboxLayout actionRowComponentViewGroup = this.binding.actionRowComponentViewGroup;
        Intrinsics.checkNotNullExpressionValue(actionRowComponentViewGroup, "actionRowComponentViewGroup");
        MessageComponentsViewKt.recycleChildComponents(actionRowComponentViewGroup, componentProvider);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ActionRowComponentView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.discord.chat.presentation.message.view.botuikit.ComponentView
    public void configure(@NotNull ActionRowComponent component, @NotNull ComponentProvider componentProvider, @NotNull ComponentContext componentContext) {
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(componentProvider, "componentProvider");
        Intrinsics.checkNotNullParameter(componentContext, "componentContext");
        List<Component> components = component.getComponents();
        ArrayList arrayList = new ArrayList(e0.l(components, 10));
        int i7 = 0;
        for (Object obj : components) {
            int i10 = i7 + 1;
            if (i7 < 0) {
                d0.k();
                throw null;
            }
            FlexboxLayout actionRowComponentViewGroup = this.binding.actionRowComponentViewGroup;
            Intrinsics.checkNotNullExpressionValue(actionRowComponentViewGroup, "actionRowComponentViewGroup");
            arrayList.add(componentProvider.getConfiguredComponentView((Component) obj, componentContext, actionRowComponentViewGroup, i7));
            i7 = i10;
        }
        ArrayList arrayListI = CollectionsKt.I(arrayList);
        FlexboxLayout actionRowComponentViewGroup2 = this.binding.actionRowComponentViewGroup;
        Intrinsics.checkNotNullExpressionValue(actionRowComponentViewGroup2, "actionRowComponentViewGroup");
        MessageComponentsViewKt.replaceViews$default(actionRowComponentViewGroup2, arrayListI, componentProvider, 0, 0, 12, null);
        FlexboxLayout actionRowComponentViewGroup3 = this.binding.actionRowComponentViewGroup;
        Intrinsics.checkNotNullExpressionValue(actionRowComponentViewGroup3, "actionRowComponentViewGroup");
        actionRowComponentViewGroup3.setVisibility(!arrayListI.isEmpty() ? 0 : 8);
        ConstraintLayout root = this.binding.actionRowComponentViewGroupErrorRow.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        root.setVisibility(component.getErrorText() == null ? 8 : 0);
        String errorText = component.getErrorText();
        if (errorText != null) {
            SimpleDraweeView viewInteractionFailedLabelIcon = this.binding.actionRowComponentViewGroupErrorRow.viewInteractionFailedLabelIcon;
            Intrinsics.checkNotNullExpressionValue(viewInteractionFailedLabelIcon, "viewInteractionFailedLabelIcon");
            ReactAssetUtilsKt.setReactAsset(viewInteractionFailedLabelIcon, ReactAsset.CircleErrorIcon);
            SimpleDraweeView viewInteractionFailedLabelIcon2 = this.binding.actionRowComponentViewGroupErrorRow.viewInteractionFailedLabelIcon;
            Intrinsics.checkNotNullExpressionValue(viewInteractionFailedLabelIcon2, "viewInteractionFailedLabelIcon");
            ColorUtilsKt.setTintColor(viewInteractionFailedLabelIcon2, Integer.valueOf(ThemeManagerKt.getTheme().getIconFeedbackCritical()));
            this.binding.actionRowComponentViewGroupErrorRow.viewInteractionFailedLabelMessage.setText(errorText);
            this.binding.actionRowComponentViewGroupErrorRow.viewInteractionFailedLabelMessage.setTextColor(ThemeManagerKt.getTheme().getIconFeedbackCritical());
        }
    }

    public /* synthetic */ ActionRowComponentView(Context context, AttributeSet attributeSet, int i7, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet, (i10 & 4) != 0 ? 0 : i7);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActionRowComponentView(@NotNull Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        MessageComponentActionRowViewBinding messageComponentActionRowViewBindingInflate = MessageComponentActionRowViewBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(messageComponentActionRowViewBindingInflate, "inflate(...)");
        this.binding = messageComponentActionRowViewBindingInflate;
        setOrientation(1);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
    }
}

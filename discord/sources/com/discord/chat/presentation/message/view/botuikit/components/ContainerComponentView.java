package com.discord.chat.presentation.message.view.botuikit.components;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import c6.a;
import com.discord.chat.R;
import com.discord.chat.bridge.botuikit.Component;
import com.discord.chat.bridge.botuikit.ContainerComponent;
import com.discord.chat.bridge.spoiler.SpoilerAttributes;
import com.discord.chat.databinding.MessageComponentContainerViewBinding;
import com.discord.chat.presentation.message.view.SpoilerView;
import com.discord.chat.presentation.message.view.botuikit.ComponentContext;
import com.discord.chat.presentation.message.view.botuikit.ComponentProvider;
import com.discord.chat.presentation.message.view.botuikit.ComponentView;
import com.discord.chat.presentation.message.view.botuikit.MessageComponentsViewKt;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.misc.utilities.view.ViewClippingUtilsKt;
import com.discord.theme.ThemeManagerKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.d0;
import kotlin.collections.e0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import s0.g;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u001bB'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u0015H\u0016J \u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0018\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0019H\u0002R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/discord/chat/presentation/message/view/botuikit/components/ContainerComponentView;", "Landroid/widget/FrameLayout;", "Lcom/discord/chat/presentation/message/view/botuikit/ComponentView;", "Lcom/discord/chat/bridge/botuikit/ContainerComponent;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/discord/chat/databinding/MessageComponentContainerViewBinding;", "getBinding", "()Lcom/discord/chat/databinding/MessageComponentContainerViewBinding;", "componentProvider", "Lcom/discord/chat/presentation/message/view/botuikit/ComponentProvider;", "onRecycle", "", "getComponentType", "Lkotlin/reflect/KClass;", "configure", "component", "componentContext", "Lcom/discord/chat/presentation/message/view/botuikit/ComponentContext;", "configureSpoiler", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nContainerComponentView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContainerComponentView.kt\ncom/discord/chat/presentation/message/view/botuikit/components/ContainerComponentView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,123:1\n257#2,2:124\n257#2,2:126\n255#2:133\n1573#3:128\n1604#3,4:129\n*S KotlinDebug\n*F\n+ 1 ContainerComponentView.kt\ncom/discord/chat/presentation/message/view/botuikit/components/ContainerComponentView\n*L\n65#1:124,2\n67#1:126,2\n107#1:133\n76#1:128\n76#1:129,4\n*E\n"})
public final class ContainerComponentView extends FrameLayout implements ComponentView<ContainerComponent> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final MessageComponentContainerViewBinding binding;
    private ComponentProvider componentProvider;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/discord/chat/presentation/message/view/botuikit/components/ContainerComponentView$Companion;", "", "<init>", "()V", "inflateComponent", "Lcom/discord/chat/presentation/message/view/botuikit/components/ContainerComponentView;", "context", "Landroid/content/Context;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ContainerComponentView inflateComponent(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new ContainerComponentView(context, null, 0, 6, null);
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ContainerComponentView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void configureSpoiler(ContainerComponent component, ComponentContext componentContext) {
        SpoilerAttributes spoilerAttributesForGenericMedia = SpoilerAttributes.INSTANCE.forGenericMedia(component, componentContext.getContainerId(), g.e("ContainerComponent(", component.getId(), ")"), "content", null);
        this.binding.spoiler.configure(spoilerAttributesForGenericMedia != null ? SpoilerAttributes.configure$default(spoilerAttributesForGenericMedia, new a(7, componentContext, this), null, 2, null) : null, this);
        if (component.isSpoiler()) {
            SpoilerView spoiler = this.binding.spoiler;
            Intrinsics.checkNotNullExpressionValue(spoiler, "spoiler");
            if (spoiler.getVisibility() == 0) {
                setContentDescription(component.getSpoilerDescription());
                this.binding.childrenViews.setImportantForAccessibility(4);
                return;
            }
        }
        setContentDescription(null);
        this.binding.childrenViews.setImportantForAccessibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit configureSpoiler$lambda$2(ComponentContext componentContext, ContainerComponentView containerComponentView) {
        componentContext.getGeneralEventHandlers().getOnTapSpoiler().invoke();
        containerComponentView.binding.childrenViews.setImportantForAccessibility(0);
        return Unit.f14616a;
    }

    @NotNull
    public final MessageComponentContainerViewBinding getBinding() {
        return this.binding;
    }

    @Override // com.discord.chat.presentation.message.view.botuikit.ComponentView
    @NotNull
    public KClass getComponentType() {
        return Reflection.getOrCreateKotlinClass(ContainerComponent.class);
    }

    @Override // com.discord.chat.presentation.message.view.botuikit.ComponentView
    public void onRecycle(@NotNull ComponentProvider componentProvider) {
        Intrinsics.checkNotNullParameter(componentProvider, "componentProvider");
        LinearLayout childrenViews = this.binding.childrenViews;
        Intrinsics.checkNotNullExpressionValue(childrenViews, "childrenViews");
        MessageComponentsViewKt.recycleChildComponents(childrenViews, componentProvider);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ContainerComponentView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.discord.chat.presentation.message.view.botuikit.ComponentView
    public void configure(@NotNull ContainerComponent component, @NotNull ComponentProvider componentProvider, @NotNull ComponentContext componentContext) {
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(componentProvider, "componentProvider");
        Intrinsics.checkNotNullParameter(componentContext, "componentContext");
        this.componentProvider = componentProvider;
        GradientDrawable gradientDrawable = new GradientDrawable();
        int i7 = 0;
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(getContext().getResources().getDimensionPixelSize(R.dimen.message_media_non_mosaic_radius));
        Integer themedBackgroundColor = component.getThemedBackgroundColor();
        gradientDrawable.setColor(themedBackgroundColor != null ? themedBackgroundColor.intValue() : ThemeManagerKt.getTheme().getEmbedBackground());
        gradientDrawable.setStroke(SizeUtilsKt.getDpToPx(1), ThemeManagerKt.getTheme().getBorderSubtle());
        setBackground(gradientDrawable);
        if (component.getAccentColor() != null) {
            this.binding.accentBorder.setBackgroundColor(component.getAccentColor().intValue());
            View accentBorder = this.binding.accentBorder;
            Intrinsics.checkNotNullExpressionValue(accentBorder, "accentBorder");
            accentBorder.setVisibility(0);
        } else {
            View accentBorder2 = this.binding.accentBorder;
            Intrinsics.checkNotNullExpressionValue(accentBorder2, "accentBorder");
            accentBorder2.setVisibility(8);
        }
        ComponentContext componentContextReduceAvailableWidth = ComponentContext.copy$default(componentContext, null, null, null, null, null, null, null, null, false, false, true, false, 3071, null).reduceAvailableWidth(this.binding.childrenViews.getPaddingRight() + this.binding.childrenViews.getPaddingLeft());
        List<Component> components = component.getComponents();
        ArrayList arrayList = new ArrayList(e0.l(components, 10));
        for (Object obj : components) {
            int i10 = i7 + 1;
            if (i7 < 0) {
                d0.k();
                throw null;
            }
            arrayList.add(componentProvider.getConfiguredComponentView((Component) obj, componentContextReduceAvailableWidth, this, i7));
            i7 = i10;
        }
        ArrayList arrayListI = CollectionsKt.I(arrayList);
        LinearLayout childrenViews = this.binding.childrenViews;
        Intrinsics.checkNotNullExpressionValue(childrenViews, "childrenViews");
        MessageComponentsViewKt.replaceViews$default(childrenViews, arrayListI, componentProvider, SizeUtilsKt.getDpToPx(8), 0, 8, null);
        configureSpoiler(component, componentContext);
    }

    public /* synthetic */ ContainerComponentView(Context context, AttributeSet attributeSet, int i7, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet, (i10 & 4) != 0 ? 0 : i7);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContainerComponentView(@NotNull Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        MessageComponentContainerViewBinding messageComponentContainerViewBindingInflate = MessageComponentContainerViewBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(messageComponentContainerViewBindingInflate, "inflate(...)");
        this.binding = messageComponentContainerViewBindingInflate;
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        ViewClippingUtilsKt.clipToRoundedRectangle(this, context.getResources().getDimensionPixelSize(R.dimen.message_media_non_mosaic_radius));
    }
}

package com.discord.chat.presentation.message.view.botuikit;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.discord.chat.bridge.botuikit.Component;
import com.discord.misc.utilities.size.SizeUtilsKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.d0;
import kotlin.collections.e0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0007H\u0014J&\u0010\u0014\u001a\u00020\u00112\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\n\u001a\u00020\u000bR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/discord/chat/presentation/message/view/botuikit/MessageComponentsView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "componentContext", "Lcom/discord/chat/presentation/message/view/botuikit/ComponentContext;", "getComponentContext", "()Lcom/discord/chat/presentation/message/view/botuikit/ComponentContext;", "setComponentContext", "(Lcom/discord/chat/presentation/message/view/botuikit/ComponentContext;)V", "onMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "setComponents", "components", "", "Lcom/discord/chat/bridge/botuikit/Component;", "componentProvider", "Lcom/discord/chat/presentation/message/view/botuikit/ComponentProvider;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMessageComponentsView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MessageComponentsView.kt\ncom/discord/chat/presentation/message/view/botuikit/MessageComponentsView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,131:1\n1573#2:132\n1604#2,4:133\n*S KotlinDebug\n*F\n+ 1 MessageComponentsView.kt\ncom/discord/chat/presentation/message/view/botuikit/MessageComponentsView\n*L\n58#1:132\n58#1:133,4\n*E\n"})
public final class MessageComponentsView extends LinearLayout {
    private ComponentContext componentContext;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MessageComponentsView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final ComponentContext getComponentContext() {
        return this.componentContext;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        ComponentContext componentContext = this.componentContext;
        if (componentContext == null) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        } else if (componentContext.getWidthInfo().getShouldRestrictTopLevelWidth()) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(componentContext.getWidthInfo().getTopLevelMaxWidth(), Integer.MIN_VALUE), heightMeasureSpec);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public final void setComponentContext(ComponentContext componentContext) {
        this.componentContext = componentContext;
    }

    public final void setComponents(@NotNull List<? extends Component> components, ComponentProvider componentProvider, @NotNull ComponentContext componentContext) {
        Intrinsics.checkNotNullParameter(components, "components");
        Intrinsics.checkNotNullParameter(componentContext, "componentContext");
        this.componentContext = componentContext;
        ArrayList arrayList = new ArrayList(e0.l(components, 10));
        int i7 = 0;
        for (Object obj : components) {
            int i10 = i7 + 1;
            ComponentView configuredComponentView = null;
            if (i7 < 0) {
                d0.k();
                throw null;
            }
            Component component = (Component) obj;
            if (componentProvider != null) {
                configuredComponentView = componentProvider.getConfiguredComponentView(component, componentContext, this, i7);
            }
            arrayList.add(configuredComponentView);
            i7 = i10;
        }
        MessageComponentsViewKt.replaceViews$default(this, CollectionsKt.I(arrayList), componentProvider, SizeUtilsKt.getDpToPx(8), 0, 8, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MessageComponentsView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ MessageComponentsView(Context context, AttributeSet attributeSet, int i7, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet, (i10 & 4) != 0 ? 0 : i7);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageComponentsView(@NotNull Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        setOrientation(1);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
    }
}

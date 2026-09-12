package com.discord.chat.presentation.message.view.botuikit;

import android.content.Context;
import android.view.KeyEvent;
import android.view.ViewGroup;
import com.discord.chat.bridge.botuikit.Component;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u000e\u001a\u00020\u000f2\u000e\u0010\u0010\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00120\u0011J=\u0010\u0013\u001a\n\u0012\u0004\u0012\u0002H\u0014\u0018\u00010\u0011\"\b\b\u0000\u0010\u0014*\u00020\u00122\u0006\u0010\u0015\u001a\u0002H\u00142\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b¢\u0006\u0002\u0010\u001cR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001d"}, d2 = {"Lcom/discord/chat/presentation/message/view/botuikit/ComponentProvider;", "", "context", "Landroid/content/Context;", "preInflateRecycledViews", "", "<init>", "(Landroid/content/Context;Z)V", "getContext", "()Landroid/content/Context;", "inflater", "Lcom/discord/chat/presentation/message/view/botuikit/ComponentInflater;", "getInflater", "()Lcom/discord/chat/presentation/message/view/botuikit/ComponentInflater;", "recycleComponentView", "", "componentView", "Lcom/discord/chat/presentation/message/view/botuikit/ComponentView;", "Lcom/discord/chat/bridge/botuikit/Component;", "getConfiguredComponentView", "T", "component", "componentContext", "Lcom/discord/chat/presentation/message/view/botuikit/ComponentContext;", "root", "Landroid/view/ViewGroup;", "childIndex", "", "(Lcom/discord/chat/bridge/botuikit/Component;Lcom/discord/chat/presentation/message/view/botuikit/ComponentContext;Landroid/view/ViewGroup;I)Lcom/discord/chat/presentation/message/view/botuikit/ComponentView;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ComponentProvider {

    @NotNull
    private final Context context;

    @NotNull
    private final ComponentInflater inflater;

    public ComponentProvider(@NotNull Context context, boolean z5) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.inflater = new ComponentInflater(context, z5);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0033  */
    public final <T extends Component> ComponentView<T> getConfiguredComponentView(@NotNull T component, @NotNull ComponentContext componentContext, @NotNull ViewGroup root, int childIndex) {
        ComponentView<T> component2;
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(componentContext, "componentContext");
        Intrinsics.checkNotNullParameter(root, "root");
        KeyEvent.Callback childAt = root.getChildAt(childIndex);
        ComponentView<T> componentView = childAt instanceof ComponentView ? (ComponentView) childAt : null;
        if (componentView == null) {
            component2 = this.inflater.getComponent(component, root);
        } else {
            component2 = Intrinsics.areEqual(componentView.getComponentType(), Reflection.getOrCreateKotlinClass(component.getClass())) ? componentView : null;
            if (component2 == null) {
                component2 = this.inflater.getComponent(component, root);
            }
        }
        if (component2 != null) {
            component2.configure(component, this, componentContext);
        }
        return component2;
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @NotNull
    public final ComponentInflater getInflater() {
        return this.inflater;
    }

    public final void recycleComponentView(@NotNull ComponentView<? extends Component> componentView) {
        Intrinsics.checkNotNullParameter(componentView, "componentView");
        componentView.onRecycle(this);
        this.inflater.recycleComponent(componentView);
    }
}

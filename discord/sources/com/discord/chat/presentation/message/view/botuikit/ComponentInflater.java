package com.discord.chat.presentation.message.view.botuikit;

import android.content.Context;
import android.view.ViewGroup;
import com.discord.chat.bridge.botuikit.ActionRowComponent;
import com.discord.chat.bridge.botuikit.ButtonComponent;
import com.discord.chat.bridge.botuikit.CheckpointCardComponent;
import com.discord.chat.bridge.botuikit.CheckpointVersion;
import com.discord.chat.bridge.botuikit.Component;
import com.discord.chat.bridge.botuikit.ContainerComponent;
import com.discord.chat.bridge.botuikit.ContentInventoryEntryComponent;
import com.discord.chat.bridge.botuikit.FileDisplayComponent;
import com.discord.chat.bridge.botuikit.MediaGalleryDisplayComponent;
import com.discord.chat.bridge.botuikit.SectionComponent;
import com.discord.chat.bridge.botuikit.SelectComponent;
import com.discord.chat.bridge.botuikit.SeparatorDisplayComponent;
import com.discord.chat.bridge.botuikit.TextDisplayComponent;
import com.discord.chat.bridge.botuikit.ThumbnailDisplayComponent;
import com.discord.chat.presentation.message.view.botuikit.components.ActionRowComponentView;
import com.discord.chat.presentation.message.view.botuikit.components.ButtonComponentView;
import com.discord.chat.presentation.message.view.botuikit.components.CheckpointCardV2025ComponentView;
import com.discord.chat.presentation.message.view.botuikit.components.ContainerComponentView;
import com.discord.chat.presentation.message.view.botuikit.components.ContentInventoryComponentView;
import com.discord.chat.presentation.message.view.botuikit.components.FileDisplayComponentView;
import com.discord.chat.presentation.message.view.botuikit.components.SectionComponentView;
import com.discord.chat.presentation.message.view.botuikit.components.SelectComponentView;
import com.discord.chat.presentation.message.view.botuikit.components.SeparatorDisplayComponentView;
import com.discord.chat.presentation.message.view.botuikit.components.TextDisplayComponentView;
import com.discord.chat.presentation.message.view.botuikit.components.ThumbnailDisplayComponentView;
import com.discord.chat.presentation.message.view.botuikit.components.UnknownComponentView;
import com.discord.chat.presentation.message.view.botuikit.components.media_gallery.MediaGalleryDisplayComponentView;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.i0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J-\u0010\u0010\u001a\n\u0012\u0004\u0012\u0002H\u0011\u0018\u00010\u000e\"\b\b\u0000\u0010\u0011*\u00020\u000f2\u0006\u0010\u0012\u001a\u0002H\u00112\u0006\u0010\u0013\u001a\u00020\u0014¢\u0006\u0002\u0010\u0015J\u001e\u0010\u0016\u001a\u00020\u0017\"\b\b\u0000\u0010\u0011*\u00020\u000f2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00110\u000eJ/\u0010\u0019\u001a\n\u0012\u0004\u0012\u0002H\u0011\u0018\u00010\u000e\"\b\b\u0000\u0010\u0011*\u00020\u000f2\u0006\u0010\u0012\u001a\u0002H\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0002¢\u0006\u0002\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR(\u0010\n\u001a\u001c\u0012\u0004\u0012\u00020\f\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000f0\u000e0\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/discord/chat/presentation/message/view/botuikit/ComponentInflater;", "", "context", "Landroid/content/Context;", "preInflateRecycledViews", "", "<init>", "(Landroid/content/Context;Z)V", "getContext", "()Landroid/content/Context;", "viewCache", "", "", "", "Lcom/discord/chat/presentation/message/view/botuikit/ComponentView;", "Lcom/discord/chat/bridge/botuikit/Component;", "getComponent", "T", "component", "root", "Landroid/view/ViewGroup;", "(Lcom/discord/chat/bridge/botuikit/Component;Landroid/view/ViewGroup;)Lcom/discord/chat/presentation/message/view/botuikit/ComponentView;", "recycleComponent", "", "componentView", "inflateComponent", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nComponentInflater.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComponentInflater.kt\ncom/discord/chat/presentation/message/view/botuikit/ComponentInflater\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,101:1\n384#2,7:102\n384#2,7:109\n384#2,7:116\n*S KotlinDebug\n*F\n+ 1 ComponentInflater.kt\ncom/discord/chat/presentation/message/view/botuikit/ComponentInflater\n*L\n49#1:102,7\n58#1:109,7\n74#1:116,7\n*E\n"})
public final class ComponentInflater {

    @NotNull
    private final Context context;

    @NotNull
    private final Map<String, List<ComponentView<? extends Component>>> viewCache;

    public ComponentInflater(@NotNull Context context, boolean z5) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.viewCache = new LinkedHashMap();
        if (z5) {
            for (int i7 = 0; i7 < 20; i7++) {
                Map<String, List<ComponentView<? extends Component>>> map = this.viewCache;
                List<ComponentView<? extends Component>> arrayList = map.get("ButtonComponent");
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    map.put("ButtonComponent", arrayList);
                }
                arrayList.add(ButtonComponentView.INSTANCE.inflateComponent(this.context));
            }
            for (int i10 = 0; i10 < 10; i10++) {
                Map<String, List<ComponentView<? extends Component>>> map2 = this.viewCache;
                List<ComponentView<? extends Component>> arrayList2 = map2.get("ActionRowComponent");
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>();
                    map2.put("ActionRowComponent", arrayList2);
                }
                arrayList2.add(ActionRowComponentView.INSTANCE.inflateComponent(this.context));
            }
        }
    }

    private final <T extends Component> ComponentView<T> inflateComponent(T component, ViewGroup root) {
        ComponentView<ActionRowComponent> componentViewInflateComponent;
        if (component instanceof ActionRowComponent) {
            componentViewInflateComponent = ActionRowComponentView.INSTANCE.inflateComponent(this.context);
        } else if (component instanceof ButtonComponent) {
            componentViewInflateComponent = ButtonComponentView.INSTANCE.inflateComponent(this.context);
        } else if (component instanceof SelectComponent) {
            componentViewInflateComponent = SelectComponentView.INSTANCE.inflateComponent(this.context);
        } else if (component instanceof SectionComponent) {
            componentViewInflateComponent = SectionComponentView.INSTANCE.inflateComponent(this.context);
        } else if (component instanceof TextDisplayComponent) {
            componentViewInflateComponent = TextDisplayComponentView.INSTANCE.inflateComponent(this.context);
        } else if (component instanceof ThumbnailDisplayComponent) {
            componentViewInflateComponent = ThumbnailDisplayComponentView.INSTANCE.inflateComponent(this.context);
        } else if (component instanceof MediaGalleryDisplayComponent) {
            componentViewInflateComponent = MediaGalleryDisplayComponentView.INSTANCE.inflateComponent(this.context);
        } else if (component instanceof FileDisplayComponent) {
            componentViewInflateComponent = FileDisplayComponentView.INSTANCE.inflateComponent(this.context);
        } else if (component instanceof SeparatorDisplayComponent) {
            componentViewInflateComponent = SeparatorDisplayComponentView.INSTANCE.inflateComponent(this.context);
        } else if (component instanceof ContentInventoryEntryComponent) {
            componentViewInflateComponent = ContentInventoryComponentView.INSTANCE.inflateComponent(this.context, root);
        } else if (component instanceof ContainerComponent) {
            componentViewInflateComponent = ContainerComponentView.INSTANCE.inflateComponent(this.context);
        } else if (component instanceof CheckpointCardComponent) {
            componentViewInflateComponent = ((CheckpointCardComponent) component).getCheckpointData().getVersion() == CheckpointVersion.V2025.getValue() ? CheckpointCardV2025ComponentView.INSTANCE.inflateComponent(this.context, root) : null;
        } else {
            componentViewInflateComponent = UnknownComponentView.INSTANCE.inflateComponent(this.context);
        }
        if (componentViewInflateComponent != null) {
            return componentViewInflateComponent;
        }
        return null;
    }

    public final <T extends Component> ComponentView<T> getComponent(@NotNull T component, @NotNull ViewGroup root) {
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(root, "root");
        List<ComponentView<? extends Component>> list = this.viewCache.get(component.getClass().getSimpleName());
        ComponentView<T> componentView = list != null ? (ComponentView) i0.t(list) : null;
        ComponentView<T> componentView2 = componentView != null ? componentView : null;
        return componentView2 == null ? inflateComponent(component, root) : componentView2;
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    public final <T extends Component> void recycleComponent(@NotNull ComponentView<T> componentView) {
        Intrinsics.checkNotNullParameter(componentView, "componentView");
        String simpleName = componentView.getComponentType().getSimpleName();
        if (simpleName == null) {
            return;
        }
        Map<String, List<ComponentView<? extends Component>>> map = this.viewCache;
        List<ComponentView<? extends Component>> arrayList = map.get(simpleName);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            map.put(simpleName, arrayList);
        }
        arrayList.add(componentView);
    }
}

package com.discord.chat.presentation.message.view.botuikit.components.media_gallery;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.chat.bridge.botuikit.MediaGalleryDisplayComponent;
import com.discord.chat.bridge.botuikit.MediaGalleryItem;
import com.discord.chat.bridge.botuikit.MediaGalleryItemType;
import com.discord.chat.presentation.message.view.MediaImageView;
import com.discord.chat.presentation.message.view.MediaVideoView;
import com.discord.chat.presentation.message.view.MediaVisualPlaceholderView;
import com.discord.chat.presentation.message.view.botuikit.ComponentContext;
import com.discord.chat.presentation.message.view.botuikit.components.media_gallery.MediaGalleryDisplayComponentAdapter;
import com.discord.chat.presentation.message.view.g;
import com.discord.chat.presentation.message.viewholder.MessagePartViewHolder;
import com.discord.chat.presentation.message.viewholder.mosaicitem.attachments.MosaicItemMessageAttachmentImageViewHolder;
import com.discord.chat.presentation.message.viewholder.mosaicitem.attachments.MosaicItemMessageAttachmentVideoViewHolder;
import com.discord.chat.presentation.message.viewholder.mosaicitem.attachments.MosaicItemVisualPlaceholderViewHolder;
import com.discord.misc.utilities.chat_view_types.ChatViewRecyclerTypes;
import com.facebook.react.modules.dialog.AlertFragment;
import com.facebook.react.uimanager.ViewProps;
import e6.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rn.n;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u001e\n\u0002\u0010!\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u008b\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u001e\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0005\u0012\u001a\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\n\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\f\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\b0\f\u0012\u0016\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\b0\fj\u0002`\u0011¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\"\u0010#J\u001f\u0010%\u001a\u00020\b2\u0006\u0010$\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u001dH\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u001dH\u0016¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010)R,\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010*R(\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010+R \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010,R \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\b0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010,R$\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\b0\fj\u0002`\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010,R\"\u0010\u0015\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R$\u0010\u0016\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R$\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u001d\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00070<8\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@¨\u0006A"}, d2 = {"Lcom/discord/chat/presentation/message/view/botuikit/components/media_gallery/MediaGalleryDisplayComponentAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;", "Landroid/content/Context;", "context", "Lkotlin/Function3;", "Lcom/discord/chat/bridge/botuikit/MediaGalleryDisplayComponent;", "Lcom/discord/chat/bridge/botuikit/MediaGalleryItem;", "", "onItemClicked", "Lkotlin/Function2;", "onItemLongClicked", "Lkotlin/Function1;", "onItemSpoilerClicked", "", "onItemObscureToggle", "", "Lcom/discord/chat/presentation/events/MessageTapShowAltText;", "onAltText", "<init>", "(Landroid/content/Context;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "containerId", "component", "Lcom/discord/chat/presentation/message/view/botuikit/ComponentContext;", "componentContext", "setMediaItems", "(Ljava/lang/String;Lcom/discord/chat/bridge/botuikit/MediaGalleryDisplayComponent;Lcom/discord/chat/presentation/message/view/botuikit/ComponentContext;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;", ViewProps.POSITION, "getItemViewType", "(I)I", "holder", "onBindViewHolder", "(Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;I)V", "getItemCount", "()I", "Landroid/content/Context;", "Lkotlin/jvm/functions/Function3;", "Lkotlin/jvm/functions/Function2;", "Lkotlin/jvm/functions/Function1;", "Ljava/lang/String;", "getContainerId", "()Ljava/lang/String;", "setContainerId", "(Ljava/lang/String;)V", "Lcom/discord/chat/bridge/botuikit/MediaGalleryDisplayComponent;", "getComponent", "()Lcom/discord/chat/bridge/botuikit/MediaGalleryDisplayComponent;", "setComponent", "(Lcom/discord/chat/bridge/botuikit/MediaGalleryDisplayComponent;)V", "Lcom/discord/chat/presentation/message/view/botuikit/ComponentContext;", "getComponentContext", "()Lcom/discord/chat/presentation/message/view/botuikit/ComponentContext;", "setComponentContext", "(Lcom/discord/chat/presentation/message/view/botuikit/ComponentContext;)V", "", AlertFragment.ARG_ITEMS, "Ljava/util/List;", "getItems", "()Ljava/util/List;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MediaGalleryDisplayComponentAdapter extends RecyclerView.Adapter {
    private MediaGalleryDisplayComponent component;
    private ComponentContext componentContext;

    @NotNull
    private String containerId;

    @NotNull
    private final Context context;

    @NotNull
    private final List<MediaGalleryItem> items;

    @NotNull
    private final Function1<String, Unit> onAltText;

    @NotNull
    private final Function3 onItemClicked;
    private final Function2<MediaGalleryDisplayComponent, MediaGalleryItem, Unit> onItemLongClicked;

    @NotNull
    private final Function1<Boolean, Unit> onItemObscureToggle;

    @NotNull
    private final Function1<MediaGalleryItem, Unit> onItemSpoilerClicked;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MediaGalleryItemType.values().length];
            try {
                iArr[MediaGalleryItemType.IMAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MediaGalleryItemType.VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MediaGalleryItemType.VISUAL_PLACEHOLDER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MediaGalleryItemType.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MediaGalleryDisplayComponentAdapter(@NotNull Context context, @NotNull Function3 onItemClicked, Function2<? super MediaGalleryDisplayComponent, ? super MediaGalleryItem, Unit> function2, @NotNull Function1<? super MediaGalleryItem, Unit> onItemSpoilerClicked, @NotNull Function1<? super Boolean, Unit> onItemObscureToggle, @NotNull Function1<? super String, Unit> onAltText) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(onItemClicked, "onItemClicked");
        Intrinsics.checkNotNullParameter(onItemSpoilerClicked, "onItemSpoilerClicked");
        Intrinsics.checkNotNullParameter(onItemObscureToggle, "onItemObscureToggle");
        Intrinsics.checkNotNullParameter(onAltText, "onAltText");
        this.context = context;
        this.onItemClicked = onItemClicked;
        this.onItemLongClicked = function2;
        this.onItemSpoilerClicked = onItemSpoilerClicked;
        this.onItemObscureToggle = onItemObscureToggle;
        this.onAltText = onAltText;
        this.containerId = "";
        this.items = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$0(MediaGalleryDisplayComponentAdapter mediaGalleryDisplayComponentAdapter, MediaGalleryDisplayComponent mediaGalleryDisplayComponent, MediaGalleryItem mediaGalleryItem, MessagePartViewHolder messagePartViewHolder, View view) {
        mediaGalleryDisplayComponentAdapter.onItemClicked.invoke(mediaGalleryDisplayComponent, mediaGalleryItem, messagePartViewHolder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onBindViewHolder$lambda$1(MediaGalleryDisplayComponentAdapter mediaGalleryDisplayComponentAdapter, MediaGalleryDisplayComponent mediaGalleryDisplayComponent, MediaGalleryItem mediaGalleryItem, View view) {
        Function2<MediaGalleryDisplayComponent, MediaGalleryItem, Unit> function2 = mediaGalleryDisplayComponentAdapter.onItemLongClicked;
        if (function2 == null) {
            return false;
        }
        function2.invoke(mediaGalleryDisplayComponent, mediaGalleryItem);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindViewHolder$lambda$2(MediaGalleryDisplayComponentAdapter mediaGalleryDisplayComponentAdapter, MediaGalleryItem mediaGalleryItem) {
        mediaGalleryDisplayComponentAdapter.onItemSpoilerClicked.invoke(mediaGalleryItem);
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindViewHolder$lambda$3(MediaGalleryDisplayComponentAdapter mediaGalleryDisplayComponentAdapter, boolean z5) {
        mediaGalleryDisplayComponentAdapter.onItemObscureToggle.invoke(Boolean.valueOf(z5));
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindViewHolder$lambda$4(MediaGalleryDisplayComponentAdapter mediaGalleryDisplayComponentAdapter, MediaGalleryItem mediaGalleryItem, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Function1<String, Unit> function1 = mediaGalleryDisplayComponentAdapter.onAltText;
        String description = mediaGalleryItem.getDescription();
        if (description == null) {
            description = "";
        }
        function1.invoke(description);
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$5(MediaGalleryDisplayComponentAdapter mediaGalleryDisplayComponentAdapter, MediaGalleryDisplayComponent mediaGalleryDisplayComponent, MediaGalleryItem mediaGalleryItem, MessagePartViewHolder messagePartViewHolder, View view) {
        mediaGalleryDisplayComponentAdapter.onItemClicked.invoke(mediaGalleryDisplayComponent, mediaGalleryItem, messagePartViewHolder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onBindViewHolder$lambda$6(MediaGalleryDisplayComponentAdapter mediaGalleryDisplayComponentAdapter, MediaGalleryDisplayComponent mediaGalleryDisplayComponent, MediaGalleryItem mediaGalleryItem, View view) {
        Function2<MediaGalleryDisplayComponent, MediaGalleryItem, Unit> function2 = mediaGalleryDisplayComponentAdapter.onItemLongClicked;
        if (function2 == null) {
            return false;
        }
        function2.invoke(mediaGalleryDisplayComponent, mediaGalleryItem);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindViewHolder$lambda$7(MediaGalleryDisplayComponentAdapter mediaGalleryDisplayComponentAdapter, MediaGalleryItem mediaGalleryItem) {
        mediaGalleryDisplayComponentAdapter.onItemSpoilerClicked.invoke(mediaGalleryItem);
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindViewHolder$lambda$8(MediaGalleryDisplayComponentAdapter mediaGalleryDisplayComponentAdapter, boolean z5) {
        mediaGalleryDisplayComponentAdapter.onItemObscureToggle.invoke(Boolean.valueOf(z5));
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindViewHolder$lambda$9(MediaGalleryDisplayComponentAdapter mediaGalleryDisplayComponentAdapter, MediaGalleryItem mediaGalleryItem, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Function1<String, Unit> function1 = mediaGalleryDisplayComponentAdapter.onAltText;
        String description = mediaGalleryItem.getDescription();
        if (description == null) {
            description = "";
        }
        function1.invoke(description);
        return Unit.f14616a;
    }

    public final MediaGalleryDisplayComponent getComponent() {
        return this.component;
    }

    public final ComponentContext getComponentContext() {
        return this.componentContext;
    }

    @NotNull
    public final String getContainerId() {
        return this.containerId;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.items.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        int i7 = WhenMappings.$EnumSwitchMapping$0[this.items.get(position).getMediaType().ordinal()];
        if (i7 == 1) {
            return 49;
        }
        if (i7 == 2) {
            return 50;
        }
        if (i7 == 3) {
            return 51;
        }
        if (i7 != 4) {
            throw new n();
        }
        throw new IllegalArgumentException("Unknown bot component media type: " + this.items.get(position).getMediaType());
    }

    @NotNull
    public final List<MediaGalleryItem> getItems() {
        return this.items;
    }

    public final void setComponent(MediaGalleryDisplayComponent mediaGalleryDisplayComponent) {
        this.component = mediaGalleryDisplayComponent;
    }

    public final void setComponentContext(ComponentContext componentContext) {
        this.componentContext = componentContext;
    }

    public final void setContainerId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.containerId = str;
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void setMediaItems(@NotNull String containerId, @NotNull MediaGalleryDisplayComponent component, @NotNull ComponentContext componentContext) {
        Intrinsics.checkNotNullParameter(containerId, "containerId");
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(componentContext, "componentContext");
        this.containerId = containerId;
        this.component = component;
        this.componentContext = componentContext;
        this.items.clear();
        this.items.addAll(component.getItems());
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull MessagePartViewHolder holder, int position) {
        ComponentContext componentContext;
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (holder instanceof MosaicItemMessageAttachmentImageViewHolder) {
            final MediaGalleryItem mediaGalleryItem = this.items.get(position);
            MediaGalleryDisplayComponent mediaGalleryDisplayComponent = this.component;
            if (mediaGalleryDisplayComponent == null || (componentContext = this.componentContext) == null) {
                return;
            }
            MosaicItemMessageAttachmentImageViewHolder mosaicItemMessageAttachmentImageViewHolder = (MosaicItemMessageAttachmentImageViewHolder) holder;
            final int i7 = 0;
            mosaicItemMessageAttachmentImageViewHolder.bindGalleryItem(this.containerId, mediaGalleryDisplayComponent.getId(), mediaGalleryItem, getItemCount() == 1, new g(2, this, mediaGalleryDisplayComponent, mediaGalleryItem, mosaicItemMessageAttachmentImageViewHolder), new a(this, mediaGalleryDisplayComponent, mediaGalleryItem, i7), new Function0(this) { // from class: e6.b

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ MediaGalleryDisplayComponentAdapter f8093e;

                {
                    this.f8093e = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i7) {
                        case 0:
                            return MediaGalleryDisplayComponentAdapter.onBindViewHolder$lambda$2(this.f8093e, mediaGalleryItem);
                        default:
                            return MediaGalleryDisplayComponentAdapter.onBindViewHolder$lambda$7(this.f8093e, mediaGalleryItem);
                    }
                }
            }, new Function1(this) { // from class: e6.c

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ MediaGalleryDisplayComponentAdapter f8096e;

                {
                    this.f8096e = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i10 = i7;
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    switch (i10) {
                        case 0:
                            return MediaGalleryDisplayComponentAdapter.onBindViewHolder$lambda$3(this.f8096e, zBooleanValue);
                        default:
                            return MediaGalleryDisplayComponentAdapter.onBindViewHolder$lambda$8(this.f8096e, zBooleanValue);
                    }
                }
            }, new Function1(this) { // from class: e6.d

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ MediaGalleryDisplayComponentAdapter f8098e;

                {
                    this.f8098e = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    switch (i7) {
                        case 0:
                            return MediaGalleryDisplayComponentAdapter.onBindViewHolder$lambda$4(this.f8098e, mediaGalleryItem, (String) obj);
                        default:
                            return MediaGalleryDisplayComponentAdapter.onBindViewHolder$lambda$9(this.f8098e, mediaGalleryItem, (String) obj);
                    }
                }
            }, componentContext.getShouldAutoPlayGif());
            return;
        }
        if (!(holder instanceof MosaicItemMessageAttachmentVideoViewHolder)) {
            if (holder instanceof MosaicItemVisualPlaceholderViewHolder) {
                ((MosaicItemVisualPlaceholderViewHolder) holder).bindGalleryItem(this.items.get(position), getItemCount() == 1);
                return;
            } else {
                throw new IllegalStateException(("Invalid accessory holder type: " + holder).toString());
            }
        }
        final MediaGalleryItem mediaGalleryItem2 = this.items.get(position);
        MediaGalleryDisplayComponent mediaGalleryDisplayComponent2 = this.component;
        if (mediaGalleryDisplayComponent2 == null) {
            return;
        }
        MosaicItemMessageAttachmentVideoViewHolder mosaicItemMessageAttachmentVideoViewHolder = (MosaicItemMessageAttachmentVideoViewHolder) holder;
        final int i10 = 1;
        mosaicItemMessageAttachmentVideoViewHolder.bindGalleryItem(this.containerId, mediaGalleryDisplayComponent2.getId(), mediaGalleryItem2, getItemCount() == 1, new g(3, this, mediaGalleryDisplayComponent2, mediaGalleryItem2, mosaicItemMessageAttachmentVideoViewHolder), new a(this, mediaGalleryDisplayComponent2, mediaGalleryItem2, i10), new Function0(this) { // from class: e6.b

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ MediaGalleryDisplayComponentAdapter f8093e;

            {
                this.f8093e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return MediaGalleryDisplayComponentAdapter.onBindViewHolder$lambda$2(this.f8093e, mediaGalleryItem2);
                    default:
                        return MediaGalleryDisplayComponentAdapter.onBindViewHolder$lambda$7(this.f8093e, mediaGalleryItem2);
                }
            }
        }, new Function1(this) { // from class: e6.c

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ MediaGalleryDisplayComponentAdapter f8096e;

            {
                this.f8096e = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i11 = i10;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                switch (i11) {
                    case 0:
                        return MediaGalleryDisplayComponentAdapter.onBindViewHolder$lambda$3(this.f8096e, zBooleanValue);
                    default:
                        return MediaGalleryDisplayComponentAdapter.onBindViewHolder$lambda$8(this.f8096e, zBooleanValue);
                }
            }
        }, new Function1(this) { // from class: e6.d

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ MediaGalleryDisplayComponentAdapter f8098e;

            {
                this.f8098e = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i10) {
                    case 0:
                        return MediaGalleryDisplayComponentAdapter.onBindViewHolder$lambda$4(this.f8098e, mediaGalleryItem2, (String) obj);
                    default:
                        return MediaGalleryDisplayComponentAdapter.onBindViewHolder$lambda$9(this.f8098e, mediaGalleryItem2, (String) obj);
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public MessagePartViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        int i7 = 2;
        AttributeSet attributeSet = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        switch (viewType) {
            case ChatViewRecyclerTypes.MEDIA_ATTACHMENT_MOSAIC_IMAGE /* 49 */:
                return new MosaicItemMessageAttachmentImageViewHolder(new MediaImageView(this.context, objArr2 == true ? 1 : 0, i7, objArr == true ? 1 : 0));
            case 50:
                return new MosaicItemMessageAttachmentVideoViewHolder(new MediaVideoView(this.context, attributeSet, i7, objArr3 == true ? 1 : 0));
            case ChatViewRecyclerTypes.MEDIA_ATTACHMENT_MOSAIC_VISUAL_PLACEHOLDER /* 51 */:
                return new MosaicItemVisualPlaceholderViewHolder(new MediaVisualPlaceholderView(this.context, null, 2, null));
            default:
                throw new IllegalStateException(("Invalid accessory type: " + viewType).toString());
        }
    }
}

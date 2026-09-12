package com.discord.chat.presentation.message.view.botuikit.components.media_gallery;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import ar.j;
import com.discord.chat.R;
import com.discord.chat.bridge.botuikit.MediaGalleryDisplayComponent;
import com.discord.chat.bridge.botuikit.MediaGalleryItem;
import com.discord.chat.databinding.MessageComponentMediaGalleryDisplayViewBinding;
import com.discord.chat.input.views.a;
import com.discord.chat.presentation.list.AccessoriesViewPool;
import com.discord.chat.presentation.list.SharedRecycledViewPools;
import com.discord.chat.presentation.message.view.botuikit.ComponentContext;
import com.discord.chat.presentation.message.view.botuikit.ComponentProvider;
import com.discord.chat.presentation.message.view.botuikit.ComponentView;
import com.discord.chat.presentation.message.view.botuikit.MediaItemEventHandlers;
import com.discord.chat.presentation.message.view.botuikit.components.media_gallery.MediaGalleryDisplayComponentView;
import com.discord.chat.presentation.message.view.mosaic_recycler.MosaicLayoutManager;
import com.discord.chat.presentation.message.viewholder.MessagePartViewHolder;
import com.discord.misc.utilities.view.ViewClippingUtilsKt;
import com.discord.native_experiments.ChatMosaicSharedPoolExperimentConfig;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 !2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001!B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u0019H\u0016J \u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0016R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/discord/chat/presentation/message/view/botuikit/components/media_gallery/MediaGalleryDisplayComponentView;", "Landroid/widget/LinearLayout;", "Lcom/discord/chat/presentation/message/view/botuikit/ComponentView;", "Lcom/discord/chat/bridge/botuikit/MediaGalleryDisplayComponent;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/discord/chat/databinding/MessageComponentMediaGalleryDisplayViewBinding;", "getBinding", "()Lcom/discord/chat/databinding/MessageComponentMediaGalleryDisplayViewBinding;", "mosaicLayoutManager", "Lcom/discord/chat/presentation/message/view/mosaic_recycler/MosaicLayoutManager;", "getMosaicLayoutManager", "()Lcom/discord/chat/presentation/message/view/mosaic_recycler/MosaicLayoutManager;", "mediaGalleryAdapter", "Lcom/discord/chat/presentation/message/view/botuikit/components/media_gallery/MediaGalleryDisplayComponentAdapter;", "eventHandler", "Lcom/discord/chat/presentation/message/view/botuikit/MediaItemEventHandlers;", "getComponentType", "Lkotlin/reflect/KClass;", "configure", "", "component", "componentProvider", "Lcom/discord/chat/presentation/message/view/botuikit/ComponentProvider;", "componentContext", "Lcom/discord/chat/presentation/message/view/botuikit/ComponentContext;", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MediaGalleryDisplayComponentView extends LinearLayout implements ComponentView<MediaGalleryDisplayComponent> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final MessageComponentMediaGalleryDisplayViewBinding binding;
    private MediaItemEventHandlers eventHandler;

    @NotNull
    private final MediaGalleryDisplayComponentAdapter mediaGalleryAdapter;

    @NotNull
    private final MosaicLayoutManager mosaicLayoutManager;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/discord/chat/presentation/message/view/botuikit/components/media_gallery/MediaGalleryDisplayComponentView$Companion;", "", "<init>", "()V", "inflateComponent", "Lcom/discord/chat/presentation/message/view/botuikit/components/media_gallery/MediaGalleryDisplayComponentView;", "context", "Landroid/content/Context;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final MediaGalleryDisplayComponentView inflateComponent(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new MediaGalleryDisplayComponentView(context, null, 0, 6, null);
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MediaGalleryDisplayComponentView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$0(MediaGalleryDisplayComponentView mediaGalleryDisplayComponentView, MediaGalleryDisplayComponent component, MediaGalleryItem item, MessagePartViewHolder viewHolder) {
        Function4 onMediaItemClicked;
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        MediaItemEventHandlers mediaItemEventHandlers = mediaGalleryDisplayComponentView.eventHandler;
        if (mediaItemEventHandlers != null && (onMediaItemClicked = mediaItemEventHandlers.getOnMediaItemClicked()) != null) {
            View itemView = viewHolder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            onMediaItemClicked.invoke(itemView, component.getId(), Integer.valueOf(component.getItems().indexOf(item)), item.getPortalId());
        }
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$1(MediaGalleryDisplayComponentView mediaGalleryDisplayComponentView, MediaGalleryDisplayComponent component, MediaGalleryItem item) {
        Function2<String, Integer, Unit> onMediaItemLongClicked;
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(item, "item");
        MediaItemEventHandlers mediaItemEventHandlers = mediaGalleryDisplayComponentView.eventHandler;
        if (mediaItemEventHandlers != null && (onMediaItemLongClicked = mediaItemEventHandlers.getOnMediaItemLongClicked()) != null) {
            onMediaItemLongClicked.invoke(component.getId(), Integer.valueOf(component.getItems().indexOf(item)));
        }
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$2(MediaGalleryDisplayComponentView mediaGalleryDisplayComponentView, MediaGalleryItem mediaGalleryItem) {
        Function0<Unit> onMediaItemSpoilerClicked;
        Intrinsics.checkNotNullParameter(mediaGalleryItem, "<unused var>");
        MediaItemEventHandlers mediaItemEventHandlers = mediaGalleryDisplayComponentView.eventHandler;
        if (mediaItemEventHandlers != null && (onMediaItemSpoilerClicked = mediaItemEventHandlers.getOnMediaItemSpoilerClicked()) != null) {
            onMediaItemSpoilerClicked.invoke();
        }
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$3(MediaGalleryDisplayComponentView mediaGalleryDisplayComponentView, boolean z5) {
        Function1<Boolean, Unit> onMediaItemObscureToggle;
        MediaItemEventHandlers mediaItemEventHandlers = mediaGalleryDisplayComponentView.eventHandler;
        if (mediaItemEventHandlers != null && (onMediaItemObscureToggle = mediaItemEventHandlers.getOnMediaItemObscureToggle()) != null) {
            onMediaItemObscureToggle.invoke(Boolean.valueOf(z5));
        }
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$4(MediaGalleryDisplayComponentView mediaGalleryDisplayComponentView, String altText) {
        Function1<String, Unit> onMediaItemAltTextButtonClicked;
        Intrinsics.checkNotNullParameter(altText, "altText");
        MediaItemEventHandlers mediaItemEventHandlers = mediaGalleryDisplayComponentView.eventHandler;
        if (mediaItemEventHandlers != null && (onMediaItemAltTextButtonClicked = mediaItemEventHandlers.getOnMediaItemAltTextButtonClicked()) != null) {
            onMediaItemAltTextButtonClicked.invoke(altText);
        }
        return Unit.f14616a;
    }

    @NotNull
    public final MessageComponentMediaGalleryDisplayViewBinding getBinding() {
        return this.binding;
    }

    @Override // com.discord.chat.presentation.message.view.botuikit.ComponentView
    @NotNull
    public KClass getComponentType() {
        return Reflection.getOrCreateKotlinClass(MediaGalleryDisplayComponent.class);
    }

    @NotNull
    public final MosaicLayoutManager getMosaicLayoutManager() {
        return this.mosaicLayoutManager;
    }

    @Override // com.discord.chat.presentation.message.view.botuikit.ComponentView
    public void onRecycle(@NotNull ComponentProvider componentProvider) {
        ComponentView.DefaultImpls.onRecycle(this, componentProvider);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MediaGalleryDisplayComponentView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.discord.chat.presentation.message.view.botuikit.ComponentView
    public void configure(@NotNull MediaGalleryDisplayComponent component, @NotNull ComponentProvider componentProvider, @NotNull ComponentContext componentContext) {
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(componentProvider, "componentProvider");
        Intrinsics.checkNotNullParameter(componentContext, "componentContext");
        this.eventHandler = componentContext.getMediaItemEventHandlers();
        RecyclerView.LayoutManager layoutManager = this.binding.mosaic.getLayoutManager();
        Intrinsics.checkNotNull(layoutManager, "null cannot be cast to non-null type com.discord.chat.presentation.message.view.mosaic_recycler.MosaicLayoutManager");
        ((MosaicLayoutManager) layoutManager).setAvailableWidth(componentContext.getWidthInfo().getAvailableWidth());
        this.mediaGalleryAdapter.setMediaItems(componentContext.getContainerId(), component, componentContext);
    }

    public /* synthetic */ MediaGalleryDisplayComponentView(Context context, AttributeSet attributeSet, int i7, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet, (i10 & 4) != 0 ? 0 : i7);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaGalleryDisplayComponentView(@NotNull Context context, AttributeSet attributeSet, int i7) {
        AccessoriesViewPool accessoriesViewPool;
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        MessageComponentMediaGalleryDisplayViewBinding messageComponentMediaGalleryDisplayViewBindingInflate = MessageComponentMediaGalleryDisplayViewBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(messageComponentMediaGalleryDisplayViewBindingInflate, "inflate(...)");
        this.binding = messageComponentMediaGalleryDisplayViewBindingInflate;
        MosaicLayoutManager mosaicLayoutManager = new MosaicLayoutManager(context);
        this.mosaicLayoutManager = mosaicLayoutManager;
        j jVar = new j(2, this);
        a aVar = new a(7, this);
        final int i10 = 0;
        Function1 function1 = new Function1(this) { // from class: e6.e

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ MediaGalleryDisplayComponentView f8101e;

            {
                this.f8101e = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i10) {
                    case 0:
                        return MediaGalleryDisplayComponentView._init_$lambda$2(this.f8101e, (MediaGalleryItem) obj);
                    case 1:
                        return MediaGalleryDisplayComponentView._init_$lambda$3(this.f8101e, ((Boolean) obj).booleanValue());
                    default:
                        return MediaGalleryDisplayComponentView._init_$lambda$4(this.f8101e, (String) obj);
                }
            }
        };
        final int i11 = 1;
        Function1 function2 = new Function1(this) { // from class: e6.e

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ MediaGalleryDisplayComponentView f8101e;

            {
                this.f8101e = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i11) {
                    case 0:
                        return MediaGalleryDisplayComponentView._init_$lambda$2(this.f8101e, (MediaGalleryItem) obj);
                    case 1:
                        return MediaGalleryDisplayComponentView._init_$lambda$3(this.f8101e, ((Boolean) obj).booleanValue());
                    default:
                        return MediaGalleryDisplayComponentView._init_$lambda$4(this.f8101e, (String) obj);
                }
            }
        };
        final int i12 = 2;
        MediaGalleryDisplayComponentAdapter mediaGalleryDisplayComponentAdapter = new MediaGalleryDisplayComponentAdapter(context, jVar, aVar, function1, function2, new Function1(this) { // from class: e6.e

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ MediaGalleryDisplayComponentView f8101e;

            {
                this.f8101e = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i12) {
                    case 0:
                        return MediaGalleryDisplayComponentView._init_$lambda$2(this.f8101e, (MediaGalleryItem) obj);
                    case 1:
                        return MediaGalleryDisplayComponentView._init_$lambda$3(this.f8101e, ((Boolean) obj).booleanValue());
                    default:
                        return MediaGalleryDisplayComponentView._init_$lambda$4(this.f8101e, (String) obj);
                }
            }
        });
        this.mediaGalleryAdapter = mediaGalleryDisplayComponentAdapter;
        RecyclerView recyclerView = messageComponentMediaGalleryDisplayViewBindingInflate.mosaic;
        recyclerView.setItemAnimator(null);
        Intrinsics.checkNotNull(recyclerView);
        ViewClippingUtilsKt.clipToRoundedRectangle(recyclerView, context.getResources().getDimensionPixelSize(R.dimen.message_media_radius));
        recyclerView.setLayoutManager(mosaicLayoutManager);
        recyclerView.setAdapter(mediaGalleryDisplayComponentAdapter);
        if (ChatMosaicSharedPoolExperimentConfig.INSTANCE.useSharedPoolForNestedMosaic()) {
            accessoriesViewPool = SharedRecycledViewPools.INSTANCE.getAccessoriesViewPool();
        } else {
            accessoriesViewPool = new AccessoriesViewPool();
        }
        recyclerView.setRecycledViewPool(accessoriesViewPool);
    }
}

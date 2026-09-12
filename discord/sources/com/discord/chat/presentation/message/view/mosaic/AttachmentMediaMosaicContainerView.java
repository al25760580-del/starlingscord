package com.discord.chat.presentation.message.view.mosaic;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.chat.R;
import com.discord.chat.databinding.AttachmentMediaMosaicContainerViewBinding;
import com.discord.chat.input.views.a;
import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.chat.presentation.list.AccessoriesViewPool;
import com.discord.chat.presentation.list.SharedRecycledViewPools;
import com.discord.chat.presentation.message.messagepart.ImageAttachmentMessageAccessory;
import com.discord.chat.presentation.message.messagepart.MessageAttachmentAccessory;
import com.discord.chat.presentation.message.messagepart.MessageMargins;
import com.discord.chat.presentation.message.messagepart.VideoAttachmentMessageAccessory;
import com.discord.chat.presentation.message.view.mosaic.AttachmentMediaMosaicContainerView;
import com.discord.chat.presentation.message.view.mosaic_recycler.AttachmentMediaMosaicAdapter;
import com.discord.chat.presentation.message.view.mosaic_recycler.MosaicLayoutManager;
import com.discord.chat.presentation.message.viewholder.MessagePartViewHolder;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.misc.utilities.view.ViewClippingUtilsKt;
import com.discord.native_experiments.ChatMosaicSharedPoolExperimentConfig;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u009b\u0001\u0010!\u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u001e\u0010\u0017\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u00132\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00182\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00160\u001a2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00160\u00182\u0006\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u001c¢\u0006\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R0\u0010\u0017\u001a\u001c\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010,R$\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010-R\u001e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010.R$\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010-¨\u0006/"}, d2 = {"Lcom/discord/chat/presentation/message/view/mosaic/AttachmentMediaMosaicContainerView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lcom/discord/chat/presentation/message/messagepart/MessageAttachmentAccessory;", "item", "", "getAttachmentIndex", "(Lcom/discord/chat/presentation/message/messagepart/MessageAttachmentAccessory;)I", "Lcom/discord/chat/presentation/message/messagepart/MessageMargins;", "margins", "", "attachments", "Lcom/discord/chat/presentation/events/ChatEventHandler;", "eventHandler", "Lkotlin/Function3;", "Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;", "Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;", "", "onAttachmentClicked", "Lkotlin/Function1;", "onAttachmentLongClicked", "Lkotlin/Function0;", "onAttachmentSpoilerClicked", "", "onAttachmentObscureToggle", "isForwardedContent", "constrainedWidth", "shouldAutoPlayGif", "setAttachments", "(Lcom/discord/chat/presentation/message/messagepart/MessageMargins;Ljava/util/List;Lcom/discord/chat/presentation/events/ChatEventHandler;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;ZIZ)V", "Lcom/discord/chat/databinding/AttachmentMediaMosaicContainerViewBinding;", "binding", "Lcom/discord/chat/databinding/AttachmentMediaMosaicContainerViewBinding;", "Lcom/discord/chat/presentation/message/view/mosaic_recycler/MosaicLayoutManager;", "mosaicLayoutManager", "Lcom/discord/chat/presentation/message/view/mosaic_recycler/MosaicLayoutManager;", "Lcom/discord/chat/presentation/message/view/mosaic_recycler/AttachmentMediaMosaicAdapter;", "attachmentAdapter", "Lcom/discord/chat/presentation/message/view/mosaic_recycler/AttachmentMediaMosaicAdapter;", "Lkotlin/jvm/functions/Function3;", "Lkotlin/jvm/functions/Function1;", "Lkotlin/jvm/functions/Function0;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AttachmentMediaMosaicContainerView extends ConstraintLayout {

    @NotNull
    private final AttachmentMediaMosaicAdapter attachmentAdapter;

    @NotNull
    private final AttachmentMediaMosaicContainerViewBinding binding;

    @NotNull
    private final MosaicLayoutManager mosaicLayoutManager;
    private Function3 onAttachmentClicked;
    private Function1<? super Integer, Unit> onAttachmentLongClicked;
    private Function1<? super Boolean, Unit> onAttachmentObscureToggle;
    private Function0<Unit> onAttachmentSpoilerClicked;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AttachmentMediaMosaicContainerView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit attachmentAdapter$lambda$0(AttachmentMediaMosaicContainerView attachmentMediaMosaicContainerView, MessageAttachmentAccessory item, MessagePartViewHolder viewHolder) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Function3 function3 = attachmentMediaMosaicContainerView.onAttachmentClicked;
        if (function3 != null) {
            function3.invoke(Integer.valueOf(attachmentMediaMosaicContainerView.getAttachmentIndex(item)), item, viewHolder);
        }
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit attachmentAdapter$lambda$1(AttachmentMediaMosaicContainerView attachmentMediaMosaicContainerView, MessageAttachmentAccessory item) {
        Intrinsics.checkNotNullParameter(item, "item");
        Function1<? super Integer, Unit> function1 = attachmentMediaMosaicContainerView.onAttachmentLongClicked;
        if (function1 != null) {
            function1.invoke(Integer.valueOf(attachmentMediaMosaicContainerView.getAttachmentIndex(item)));
        }
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit attachmentAdapter$lambda$2(AttachmentMediaMosaicContainerView attachmentMediaMosaicContainerView, MessageAttachmentAccessory messageAttachmentAccessory) {
        Intrinsics.checkNotNullParameter(messageAttachmentAccessory, "<unused var>");
        Function0<Unit> function0 = attachmentMediaMosaicContainerView.onAttachmentSpoilerClicked;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit attachmentAdapter$lambda$3(AttachmentMediaMosaicContainerView attachmentMediaMosaicContainerView, boolean z5) {
        Function1<? super Boolean, Unit> function1 = attachmentMediaMosaicContainerView.onAttachmentObscureToggle;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(z5));
        }
        return Unit.f14616a;
    }

    private final int getAttachmentIndex(MessageAttachmentAccessory item) {
        if (item instanceof ImageAttachmentMessageAccessory) {
            return ((ImageAttachmentMessageAccessory) item).getAttachmentIndex();
        }
        if (item instanceof VideoAttachmentMessageAccessory) {
            return ((VideoAttachmentMessageAccessory) item).getIndex();
        }
        throw new IllegalStateException(("Invalid accessory type: " + item).toString());
    }

    public final void setAttachments(@NotNull MessageMargins margins, @NotNull List<? extends MessageAttachmentAccessory> attachments, @NotNull ChatEventHandler eventHandler, @NotNull Function3 onAttachmentClicked, Function1<? super Integer, Unit> onAttachmentLongClicked, @NotNull Function0<Unit> onAttachmentSpoilerClicked, @NotNull Function1<? super Boolean, Unit> onAttachmentObscureToggle, boolean isForwardedContent, int constrainedWidth, boolean shouldAutoPlayGif) {
        Intrinsics.checkNotNullParameter(margins, "margins");
        Intrinsics.checkNotNullParameter(attachments, "attachments");
        Intrinsics.checkNotNullParameter(eventHandler, "eventHandler");
        Intrinsics.checkNotNullParameter(onAttachmentClicked, "onAttachmentClicked");
        Intrinsics.checkNotNullParameter(onAttachmentSpoilerClicked, "onAttachmentSpoilerClicked");
        Intrinsics.checkNotNullParameter(onAttachmentObscureToggle, "onAttachmentObscureToggle");
        RecyclerView.LayoutManager layoutManager = this.binding.mosaic.getLayoutManager();
        Intrinsics.checkNotNull(layoutManager, "null cannot be cast to non-null type com.discord.chat.presentation.message.view.mosaic_recycler.MosaicLayoutManager");
        ((MosaicLayoutManager) layoutManager).setAvailableWidth(Math.min(MessageMargins.INSTANCE.getWidth(margins, constrainedWidth, isForwardedContent), SizeUtilsKt.getDpToPx(550)));
        this.onAttachmentClicked = onAttachmentClicked;
        this.onAttachmentLongClicked = onAttachmentLongClicked;
        this.onAttachmentSpoilerClicked = onAttachmentSpoilerClicked;
        this.onAttachmentObscureToggle = onAttachmentObscureToggle;
        this.attachmentAdapter.setChatEventHandler(eventHandler);
        this.attachmentAdapter.setMediaItems(attachments, shouldAutoPlayGif);
    }

    public /* synthetic */ AttachmentMediaMosaicContainerView(Context context, AttributeSet attributeSet, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i7 & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AttachmentMediaMosaicContainerView(@NotNull Context context, AttributeSet attributeSet) {
        AccessoriesViewPool accessoriesViewPool;
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        AttachmentMediaMosaicContainerViewBinding attachmentMediaMosaicContainerViewBindingInflate = AttachmentMediaMosaicContainerViewBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(attachmentMediaMosaicContainerViewBindingInflate, "inflate(...)");
        this.binding = attachmentMediaMosaicContainerViewBindingInflate;
        MosaicLayoutManager mosaicLayoutManager = new MosaicLayoutManager(context);
        this.mosaicLayoutManager = mosaicLayoutManager;
        a aVar = new a(9, this);
        final int i7 = 0;
        Function1 function1 = new Function1(this) { // from class: j6.a

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ AttachmentMediaMosaicContainerView f13665e;

            {
                this.f13665e = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i7) {
                    case 0:
                        return AttachmentMediaMosaicContainerView.attachmentAdapter$lambda$1(this.f13665e, (MessageAttachmentAccessory) obj);
                    case 1:
                        return AttachmentMediaMosaicContainerView.attachmentAdapter$lambda$2(this.f13665e, (MessageAttachmentAccessory) obj);
                    default:
                        return AttachmentMediaMosaicContainerView.attachmentAdapter$lambda$3(this.f13665e, ((Boolean) obj).booleanValue());
                }
            }
        };
        final int i10 = 1;
        Function1 function2 = new Function1(this) { // from class: j6.a

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ AttachmentMediaMosaicContainerView f13665e;

            {
                this.f13665e = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i10) {
                    case 0:
                        return AttachmentMediaMosaicContainerView.attachmentAdapter$lambda$1(this.f13665e, (MessageAttachmentAccessory) obj);
                    case 1:
                        return AttachmentMediaMosaicContainerView.attachmentAdapter$lambda$2(this.f13665e, (MessageAttachmentAccessory) obj);
                    default:
                        return AttachmentMediaMosaicContainerView.attachmentAdapter$lambda$3(this.f13665e, ((Boolean) obj).booleanValue());
                }
            }
        };
        final int i11 = 2;
        AttachmentMediaMosaicAdapter attachmentMediaMosaicAdapter = new AttachmentMediaMosaicAdapter(context, aVar, function1, function2, new Function1(this) { // from class: j6.a

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ AttachmentMediaMosaicContainerView f13665e;

            {
                this.f13665e = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i11) {
                    case 0:
                        return AttachmentMediaMosaicContainerView.attachmentAdapter$lambda$1(this.f13665e, (MessageAttachmentAccessory) obj);
                    case 1:
                        return AttachmentMediaMosaicContainerView.attachmentAdapter$lambda$2(this.f13665e, (MessageAttachmentAccessory) obj);
                    default:
                        return AttachmentMediaMosaicContainerView.attachmentAdapter$lambda$3(this.f13665e, ((Boolean) obj).booleanValue());
                }
            }
        });
        this.attachmentAdapter = attachmentMediaMosaicAdapter;
        RecyclerView recyclerView = attachmentMediaMosaicContainerViewBindingInflate.mosaic;
        recyclerView.setItemAnimator(null);
        Intrinsics.checkNotNull(recyclerView);
        ViewClippingUtilsKt.clipToRoundedRectangle(recyclerView, context.getResources().getDimensionPixelSize(R.dimen.message_media_radius));
        if (ChatMosaicSharedPoolExperimentConfig.INSTANCE.useSharedPoolForNestedMosaic()) {
            accessoriesViewPool = SharedRecycledViewPools.INSTANCE.getAccessoriesViewPool();
        } else {
            accessoriesViewPool = new AccessoriesViewPool();
        }
        recyclerView.setRecycledViewPool(accessoriesViewPool);
        recyclerView.setLayoutManager(mosaicLayoutManager);
        recyclerView.setAdapter(attachmentMediaMosaicAdapter);
    }
}

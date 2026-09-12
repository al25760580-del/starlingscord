package com.discord.chat.presentation.message.view.botuikit;

import a3.e;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.chat.presentation.list.a;
import com.discord.chat.presentation.message.messagepart.MessageMargins;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0013¢\u0006\u0004\b\u0017\u0010\u0018J\u000e\u0010+\u001a\u00020\u00002\u0006\u0010,\u001a\u00020-J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0005HÆ\u0003J\t\u00100\u001a\u00020\u0007HÆ\u0003J\t\u00101\u001a\u00020\tHÆ\u0003J\t\u00102\u001a\u00020\u000bHÆ\u0003J\t\u00103\u001a\u00020\rHÆ\u0003J\t\u00104\u001a\u00020\u000fHÆ\u0003J\t\u00105\u001a\u00020\u0011HÆ\u0003J\t\u00106\u001a\u00020\u0013HÆ\u0003J\t\u00107\u001a\u00020\u0013HÆ\u0003J\t\u00108\u001a\u00020\u0013HÆ\u0003J\t\u00109\u001a\u00020\u0013HÆ\u0003J\u0081\u0001\u0010:\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0013HÆ\u0001J\u0013\u0010;\u001a\u00020\u00132\b\u0010<\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010=\u001a\u00020-HÖ\u0001J\t\u0010>\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010\u0014\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010*R\u0011\u0010\u0015\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010*R\u0011\u0010\u0016\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010*¨\u0006?"}, d2 = {"Lcom/discord/chat/presentation/message/view/botuikit/ComponentContext;", "", "margins", "Lcom/discord/chat/presentation/message/messagepart/MessageMargins;", "containerId", "", "generalEventHandlers", "Lcom/discord/chat/presentation/message/view/botuikit/GeneralEventHandlers;", "markdownTextRenderOptions", "Lcom/discord/chat/presentation/message/view/botuikit/MarkdownTextRenderOptions;", "markdownTextRenderEventHandlers", "Lcom/discord/chat/presentation/message/view/botuikit/MarkdownTextRenderEventHandlers;", "mediaItemEventHandlers", "Lcom/discord/chat/presentation/message/view/botuikit/MediaItemEventHandlers;", "componentActionEventHandlers", "Lcom/discord/chat/presentation/message/view/botuikit/ComponentActionEventHandlers;", "widthInfo", "Lcom/discord/chat/presentation/message/view/botuikit/WidthInfo;", "shouldAutoPlayGif", "", "isForwardedContent", "isInContainerComponent", "isInModal", "<init>", "(Lcom/discord/chat/presentation/message/messagepart/MessageMargins;Ljava/lang/String;Lcom/discord/chat/presentation/message/view/botuikit/GeneralEventHandlers;Lcom/discord/chat/presentation/message/view/botuikit/MarkdownTextRenderOptions;Lcom/discord/chat/presentation/message/view/botuikit/MarkdownTextRenderEventHandlers;Lcom/discord/chat/presentation/message/view/botuikit/MediaItemEventHandlers;Lcom/discord/chat/presentation/message/view/botuikit/ComponentActionEventHandlers;Lcom/discord/chat/presentation/message/view/botuikit/WidthInfo;ZZZZ)V", "getMargins", "()Lcom/discord/chat/presentation/message/messagepart/MessageMargins;", "getContainerId", "()Ljava/lang/String;", "getGeneralEventHandlers", "()Lcom/discord/chat/presentation/message/view/botuikit/GeneralEventHandlers;", "getMarkdownTextRenderOptions", "()Lcom/discord/chat/presentation/message/view/botuikit/MarkdownTextRenderOptions;", "getMarkdownTextRenderEventHandlers", "()Lcom/discord/chat/presentation/message/view/botuikit/MarkdownTextRenderEventHandlers;", "getMediaItemEventHandlers", "()Lcom/discord/chat/presentation/message/view/botuikit/MediaItemEventHandlers;", "getComponentActionEventHandlers", "()Lcom/discord/chat/presentation/message/view/botuikit/ComponentActionEventHandlers;", "getWidthInfo", "()Lcom/discord/chat/presentation/message/view/botuikit/WidthInfo;", "getShouldAutoPlayGif", "()Z", "reduceAvailableWidth", "widthReduction", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", "other", "hashCode", "toString", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ComponentContext {

    @NotNull
    private final ComponentActionEventHandlers componentActionEventHandlers;

    @NotNull
    private final String containerId;

    @NotNull
    private final GeneralEventHandlers generalEventHandlers;
    private final boolean isForwardedContent;
    private final boolean isInContainerComponent;
    private final boolean isInModal;

    @NotNull
    private final MessageMargins margins;

    @NotNull
    private final MarkdownTextRenderEventHandlers markdownTextRenderEventHandlers;

    @NotNull
    private final MarkdownTextRenderOptions markdownTextRenderOptions;

    @NotNull
    private final MediaItemEventHandlers mediaItemEventHandlers;
    private final boolean shouldAutoPlayGif;

    @NotNull
    private final WidthInfo widthInfo;

    public ComponentContext(@NotNull MessageMargins margins, @NotNull String containerId, @NotNull GeneralEventHandlers generalEventHandlers, @NotNull MarkdownTextRenderOptions markdownTextRenderOptions, @NotNull MarkdownTextRenderEventHandlers markdownTextRenderEventHandlers, @NotNull MediaItemEventHandlers mediaItemEventHandlers, @NotNull ComponentActionEventHandlers componentActionEventHandlers, @NotNull WidthInfo widthInfo, boolean z5, boolean z6, boolean z7, boolean z10) {
        Intrinsics.checkNotNullParameter(margins, "margins");
        Intrinsics.checkNotNullParameter(containerId, "containerId");
        Intrinsics.checkNotNullParameter(generalEventHandlers, "generalEventHandlers");
        Intrinsics.checkNotNullParameter(markdownTextRenderOptions, "markdownTextRenderOptions");
        Intrinsics.checkNotNullParameter(markdownTextRenderEventHandlers, "markdownTextRenderEventHandlers");
        Intrinsics.checkNotNullParameter(mediaItemEventHandlers, "mediaItemEventHandlers");
        Intrinsics.checkNotNullParameter(componentActionEventHandlers, "componentActionEventHandlers");
        Intrinsics.checkNotNullParameter(widthInfo, "widthInfo");
        this.margins = margins;
        this.containerId = containerId;
        this.generalEventHandlers = generalEventHandlers;
        this.markdownTextRenderOptions = markdownTextRenderOptions;
        this.markdownTextRenderEventHandlers = markdownTextRenderEventHandlers;
        this.mediaItemEventHandlers = mediaItemEventHandlers;
        this.componentActionEventHandlers = componentActionEventHandlers;
        this.widthInfo = widthInfo;
        this.shouldAutoPlayGif = z5;
        this.isForwardedContent = z6;
        this.isInContainerComponent = z7;
        this.isInModal = z10;
    }

    public static /* synthetic */ ComponentContext copy$default(ComponentContext componentContext, MessageMargins messageMargins, String str, GeneralEventHandlers generalEventHandlers, MarkdownTextRenderOptions markdownTextRenderOptions, MarkdownTextRenderEventHandlers markdownTextRenderEventHandlers, MediaItemEventHandlers mediaItemEventHandlers, ComponentActionEventHandlers componentActionEventHandlers, WidthInfo widthInfo, boolean z5, boolean z6, boolean z7, boolean z10, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            messageMargins = componentContext.margins;
        }
        if ((i7 & 2) != 0) {
            str = componentContext.containerId;
        }
        if ((i7 & 4) != 0) {
            generalEventHandlers = componentContext.generalEventHandlers;
        }
        if ((i7 & 8) != 0) {
            markdownTextRenderOptions = componentContext.markdownTextRenderOptions;
        }
        if ((i7 & 16) != 0) {
            markdownTextRenderEventHandlers = componentContext.markdownTextRenderEventHandlers;
        }
        if ((i7 & 32) != 0) {
            mediaItemEventHandlers = componentContext.mediaItemEventHandlers;
        }
        if ((i7 & 64) != 0) {
            componentActionEventHandlers = componentContext.componentActionEventHandlers;
        }
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0) {
            widthInfo = componentContext.widthInfo;
        }
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0) {
            z5 = componentContext.shouldAutoPlayGif;
        }
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0) {
            z6 = componentContext.isForwardedContent;
        }
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0) {
            z7 = componentContext.isInContainerComponent;
        }
        if ((i7 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0) {
            z10 = componentContext.isInModal;
        }
        boolean z11 = z7;
        boolean z12 = z10;
        boolean z13 = z5;
        boolean z14 = z6;
        ComponentActionEventHandlers componentActionEventHandlers2 = componentActionEventHandlers;
        WidthInfo widthInfo2 = widthInfo;
        MarkdownTextRenderEventHandlers markdownTextRenderEventHandlers2 = markdownTextRenderEventHandlers;
        MediaItemEventHandlers mediaItemEventHandlers2 = mediaItemEventHandlers;
        return componentContext.copy(messageMargins, str, generalEventHandlers, markdownTextRenderOptions, markdownTextRenderEventHandlers2, mediaItemEventHandlers2, componentActionEventHandlers2, widthInfo2, z13, z14, z11, z12);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final MessageMargins getMargins() {
        return this.margins;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final boolean getIsForwardedContent() {
        return this.isForwardedContent;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final boolean getIsInContainerComponent() {
        return this.isInContainerComponent;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final boolean getIsInModal() {
        return this.isInModal;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getContainerId() {
        return this.containerId;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final GeneralEventHandlers getGeneralEventHandlers() {
        return this.generalEventHandlers;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final MarkdownTextRenderOptions getMarkdownTextRenderOptions() {
        return this.markdownTextRenderOptions;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final MarkdownTextRenderEventHandlers getMarkdownTextRenderEventHandlers() {
        return this.markdownTextRenderEventHandlers;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final MediaItemEventHandlers getMediaItemEventHandlers() {
        return this.mediaItemEventHandlers;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final ComponentActionEventHandlers getComponentActionEventHandlers() {
        return this.componentActionEventHandlers;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final WidthInfo getWidthInfo() {
        return this.widthInfo;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getShouldAutoPlayGif() {
        return this.shouldAutoPlayGif;
    }

    @NotNull
    public final ComponentContext copy(@NotNull MessageMargins margins, @NotNull String containerId, @NotNull GeneralEventHandlers generalEventHandlers, @NotNull MarkdownTextRenderOptions markdownTextRenderOptions, @NotNull MarkdownTextRenderEventHandlers markdownTextRenderEventHandlers, @NotNull MediaItemEventHandlers mediaItemEventHandlers, @NotNull ComponentActionEventHandlers componentActionEventHandlers, @NotNull WidthInfo widthInfo, boolean shouldAutoPlayGif, boolean isForwardedContent, boolean isInContainerComponent, boolean isInModal) {
        Intrinsics.checkNotNullParameter(margins, "margins");
        Intrinsics.checkNotNullParameter(containerId, "containerId");
        Intrinsics.checkNotNullParameter(generalEventHandlers, "generalEventHandlers");
        Intrinsics.checkNotNullParameter(markdownTextRenderOptions, "markdownTextRenderOptions");
        Intrinsics.checkNotNullParameter(markdownTextRenderEventHandlers, "markdownTextRenderEventHandlers");
        Intrinsics.checkNotNullParameter(mediaItemEventHandlers, "mediaItemEventHandlers");
        Intrinsics.checkNotNullParameter(componentActionEventHandlers, "componentActionEventHandlers");
        Intrinsics.checkNotNullParameter(widthInfo, "widthInfo");
        return new ComponentContext(margins, containerId, generalEventHandlers, markdownTextRenderOptions, markdownTextRenderEventHandlers, mediaItemEventHandlers, componentActionEventHandlers, widthInfo, shouldAutoPlayGif, isForwardedContent, isInContainerComponent, isInModal);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ComponentContext)) {
            return false;
        }
        ComponentContext componentContext = (ComponentContext) other;
        return Intrinsics.areEqual(this.margins, componentContext.margins) && Intrinsics.areEqual(this.containerId, componentContext.containerId) && Intrinsics.areEqual(this.generalEventHandlers, componentContext.generalEventHandlers) && Intrinsics.areEqual(this.markdownTextRenderOptions, componentContext.markdownTextRenderOptions) && Intrinsics.areEqual(this.markdownTextRenderEventHandlers, componentContext.markdownTextRenderEventHandlers) && Intrinsics.areEqual(this.mediaItemEventHandlers, componentContext.mediaItemEventHandlers) && Intrinsics.areEqual(this.componentActionEventHandlers, componentContext.componentActionEventHandlers) && Intrinsics.areEqual(this.widthInfo, componentContext.widthInfo) && this.shouldAutoPlayGif == componentContext.shouldAutoPlayGif && this.isForwardedContent == componentContext.isForwardedContent && this.isInContainerComponent == componentContext.isInContainerComponent && this.isInModal == componentContext.isInModal;
    }

    @NotNull
    public final ComponentActionEventHandlers getComponentActionEventHandlers() {
        return this.componentActionEventHandlers;
    }

    @NotNull
    public final String getContainerId() {
        return this.containerId;
    }

    @NotNull
    public final GeneralEventHandlers getGeneralEventHandlers() {
        return this.generalEventHandlers;
    }

    @NotNull
    public final MessageMargins getMargins() {
        return this.margins;
    }

    @NotNull
    public final MarkdownTextRenderEventHandlers getMarkdownTextRenderEventHandlers() {
        return this.markdownTextRenderEventHandlers;
    }

    @NotNull
    public final MarkdownTextRenderOptions getMarkdownTextRenderOptions() {
        return this.markdownTextRenderOptions;
    }

    @NotNull
    public final MediaItemEventHandlers getMediaItemEventHandlers() {
        return this.mediaItemEventHandlers;
    }

    public final boolean getShouldAutoPlayGif() {
        return this.shouldAutoPlayGif;
    }

    @NotNull
    public final WidthInfo getWidthInfo() {
        return this.widthInfo;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isInModal) + a.g(a.g(a.g((this.widthInfo.hashCode() + ((this.componentActionEventHandlers.hashCode() + ((this.mediaItemEventHandlers.hashCode() + ((this.markdownTextRenderEventHandlers.hashCode() + ((this.markdownTextRenderOptions.hashCode() + ((this.generalEventHandlers.hashCode() + e.d(this.margins.hashCode() * 31, 31, this.containerId)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31, this.shouldAutoPlayGif), 31, this.isForwardedContent), 31, this.isInContainerComponent);
    }

    public final boolean isForwardedContent() {
        return this.isForwardedContent;
    }

    public final boolean isInContainerComponent() {
        return this.isInContainerComponent;
    }

    public final boolean isInModal() {
        return this.isInModal;
    }

    @NotNull
    public final ComponentContext reduceAvailableWidth(int widthReduction) {
        WidthInfo widthInfo = this.widthInfo;
        return copy$default(this, null, null, null, null, null, null, null, WidthInfo.copy$default(widthInfo, 0, 0, widthInfo.getWidthReductions$chat_release() + widthReduction, 3, null), false, false, false, false, 3967, null);
    }

    @NotNull
    public String toString() {
        MessageMargins messageMargins = this.margins;
        String str = this.containerId;
        GeneralEventHandlers generalEventHandlers = this.generalEventHandlers;
        MarkdownTextRenderOptions markdownTextRenderOptions = this.markdownTextRenderOptions;
        MarkdownTextRenderEventHandlers markdownTextRenderEventHandlers = this.markdownTextRenderEventHandlers;
        MediaItemEventHandlers mediaItemEventHandlers = this.mediaItemEventHandlers;
        ComponentActionEventHandlers componentActionEventHandlers = this.componentActionEventHandlers;
        WidthInfo widthInfo = this.widthInfo;
        boolean z5 = this.shouldAutoPlayGif;
        boolean z6 = this.isForwardedContent;
        boolean z7 = this.isInContainerComponent;
        boolean z10 = this.isInModal;
        StringBuilder sb2 = new StringBuilder("ComponentContext(margins=");
        sb2.append(messageMargins);
        sb2.append(", containerId=");
        sb2.append(str);
        sb2.append(", generalEventHandlers=");
        sb2.append(generalEventHandlers);
        sb2.append(", markdownTextRenderOptions=");
        sb2.append(markdownTextRenderOptions);
        sb2.append(", markdownTextRenderEventHandlers=");
        sb2.append(markdownTextRenderEventHandlers);
        sb2.append(", mediaItemEventHandlers=");
        sb2.append(mediaItemEventHandlers);
        sb2.append(", componentActionEventHandlers=");
        sb2.append(componentActionEventHandlers);
        sb2.append(", widthInfo=");
        sb2.append(widthInfo);
        sb2.append(", shouldAutoPlayGif=");
        e.B(sb2, z5, ", isForwardedContent=", z6, ", isInContainerComponent=");
        sb2.append(z7);
        sb2.append(", isInModal=");
        sb2.append(z10);
        sb2.append(")");
        return sb2.toString();
    }
}

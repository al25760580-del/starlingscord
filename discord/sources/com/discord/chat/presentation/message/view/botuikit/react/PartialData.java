package com.discord.chat.presentation.message.view.botuikit.react;

import com.discord.chat.bridge.botuikit.TextDisplayComponent;
import com.discord.chat.presentation.message.view.botuikit.MarkdownTextRenderOptions;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, d2 = {"Lcom/discord/chat/presentation/message/view/botuikit/react/PartialData;", "", "component", "Lcom/discord/chat/bridge/botuikit/TextDisplayComponent;", "markdownTextRenderOptions", "Lcom/discord/chat/presentation/message/view/botuikit/MarkdownTextRenderOptions;", "<init>", "(Lcom/discord/chat/bridge/botuikit/TextDisplayComponent;Lcom/discord/chat/presentation/message/view/botuikit/MarkdownTextRenderOptions;)V", "getComponent", "()Lcom/discord/chat/bridge/botuikit/TextDisplayComponent;", "setComponent", "(Lcom/discord/chat/bridge/botuikit/TextDisplayComponent;)V", "getMarkdownTextRenderOptions", "()Lcom/discord/chat/presentation/message/view/botuikit/MarkdownTextRenderOptions;", "setMarkdownTextRenderOptions", "(Lcom/discord/chat/presentation/message/view/botuikit/MarkdownTextRenderOptions;)V", "toData", "Lcom/discord/chat/presentation/message/view/botuikit/react/Data;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class PartialData {
    private TextDisplayComponent component;
    private MarkdownTextRenderOptions markdownTextRenderOptions;

    /* JADX WARN: Multi-variable type inference failed */
    public PartialData() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ PartialData copy$default(PartialData partialData, TextDisplayComponent textDisplayComponent, MarkdownTextRenderOptions markdownTextRenderOptions, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            textDisplayComponent = partialData.component;
        }
        if ((i7 & 2) != 0) {
            markdownTextRenderOptions = partialData.markdownTextRenderOptions;
        }
        return partialData.copy(textDisplayComponent, markdownTextRenderOptions);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final TextDisplayComponent getComponent() {
        return this.component;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final MarkdownTextRenderOptions getMarkdownTextRenderOptions() {
        return this.markdownTextRenderOptions;
    }

    @NotNull
    public final PartialData copy(TextDisplayComponent component, MarkdownTextRenderOptions markdownTextRenderOptions) {
        return new PartialData(component, markdownTextRenderOptions);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PartialData)) {
            return false;
        }
        PartialData partialData = (PartialData) other;
        return Intrinsics.areEqual(this.component, partialData.component) && Intrinsics.areEqual(this.markdownTextRenderOptions, partialData.markdownTextRenderOptions);
    }

    public final TextDisplayComponent getComponent() {
        return this.component;
    }

    public final MarkdownTextRenderOptions getMarkdownTextRenderOptions() {
        return this.markdownTextRenderOptions;
    }

    public int hashCode() {
        TextDisplayComponent textDisplayComponent = this.component;
        int iHashCode = (textDisplayComponent == null ? 0 : textDisplayComponent.hashCode()) * 31;
        MarkdownTextRenderOptions markdownTextRenderOptions = this.markdownTextRenderOptions;
        return iHashCode + (markdownTextRenderOptions != null ? markdownTextRenderOptions.hashCode() : 0);
    }

    public final void setComponent(TextDisplayComponent textDisplayComponent) {
        this.component = textDisplayComponent;
    }

    public final void setMarkdownTextRenderOptions(MarkdownTextRenderOptions markdownTextRenderOptions) {
        this.markdownTextRenderOptions = markdownTextRenderOptions;
    }

    public final Data toData() {
        TextDisplayComponent textDisplayComponent = this.component;
        MarkdownTextRenderOptions markdownTextRenderOptions = this.markdownTextRenderOptions;
        if (textDisplayComponent == null || markdownTextRenderOptions == null) {
            return null;
        }
        return new Data(textDisplayComponent, markdownTextRenderOptions);
    }

    @NotNull
    public String toString() {
        return "PartialData(component=" + this.component + ", markdownTextRenderOptions=" + this.markdownTextRenderOptions + ")";
    }

    public PartialData(TextDisplayComponent textDisplayComponent, MarkdownTextRenderOptions markdownTextRenderOptions) {
        this.component = textDisplayComponent;
        this.markdownTextRenderOptions = markdownTextRenderOptions;
    }

    public /* synthetic */ PartialData(TextDisplayComponent textDisplayComponent, MarkdownTextRenderOptions markdownTextRenderOptions, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : textDisplayComponent, (i7 & 2) != 0 ? null : markdownTextRenderOptions);
    }
}

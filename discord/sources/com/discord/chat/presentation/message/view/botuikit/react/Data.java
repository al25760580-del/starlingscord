package com.discord.chat.presentation.message.view.botuikit.react;

import com.discord.chat.bridge.botuikit.TextDisplayComponent;
import com.discord.chat.presentation.message.view.botuikit.MarkdownTextRenderOptions;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/discord/chat/presentation/message/view/botuikit/react/Data;", "", "component", "Lcom/discord/chat/bridge/botuikit/TextDisplayComponent;", "markdownTextRenderOptions", "Lcom/discord/chat/presentation/message/view/botuikit/MarkdownTextRenderOptions;", "<init>", "(Lcom/discord/chat/bridge/botuikit/TextDisplayComponent;Lcom/discord/chat/presentation/message/view/botuikit/MarkdownTextRenderOptions;)V", "getComponent", "()Lcom/discord/chat/bridge/botuikit/TextDisplayComponent;", "getMarkdownTextRenderOptions", "()Lcom/discord/chat/presentation/message/view/botuikit/MarkdownTextRenderOptions;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class Data {

    @NotNull
    private final TextDisplayComponent component;

    @NotNull
    private final MarkdownTextRenderOptions markdownTextRenderOptions;

    public Data(@NotNull TextDisplayComponent component, @NotNull MarkdownTextRenderOptions markdownTextRenderOptions) {
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(markdownTextRenderOptions, "markdownTextRenderOptions");
        this.component = component;
        this.markdownTextRenderOptions = markdownTextRenderOptions;
    }

    public static /* synthetic */ Data copy$default(Data data, TextDisplayComponent textDisplayComponent, MarkdownTextRenderOptions markdownTextRenderOptions, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            textDisplayComponent = data.component;
        }
        if ((i7 & 2) != 0) {
            markdownTextRenderOptions = data.markdownTextRenderOptions;
        }
        return data.copy(textDisplayComponent, markdownTextRenderOptions);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final TextDisplayComponent getComponent() {
        return this.component;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final MarkdownTextRenderOptions getMarkdownTextRenderOptions() {
        return this.markdownTextRenderOptions;
    }

    @NotNull
    public final Data copy(@NotNull TextDisplayComponent component, @NotNull MarkdownTextRenderOptions markdownTextRenderOptions) {
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(markdownTextRenderOptions, "markdownTextRenderOptions");
        return new Data(component, markdownTextRenderOptions);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Data)) {
            return false;
        }
        Data data = (Data) other;
        return Intrinsics.areEqual(this.component, data.component) && Intrinsics.areEqual(this.markdownTextRenderOptions, data.markdownTextRenderOptions);
    }

    @NotNull
    public final TextDisplayComponent getComponent() {
        return this.component;
    }

    @NotNull
    public final MarkdownTextRenderOptions getMarkdownTextRenderOptions() {
        return this.markdownTextRenderOptions;
    }

    public int hashCode() {
        return this.markdownTextRenderOptions.hashCode() + (this.component.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "Data(component=" + this.component + ", markdownTextRenderOptions=" + this.markdownTextRenderOptions + ")";
    }
}

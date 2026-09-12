package com.discord.chat.presentation.message.view.botuikit;

import a3.e;
import com.discord.chat.presentation.list.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u001d"}, d2 = {"Lcom/discord/chat/presentation/message/view/botuikit/MarkdownTextRenderOptions;", "", "containerId", "", "shouldAnimateEmoji", "", "shouldShowLinkDecorations", "shouldShowRoleDot", "shouldShowRoleOnName", "<init>", "(Ljava/lang/String;ZZZZ)V", "getContainerId", "()Ljava/lang/String;", "getShouldAnimateEmoji", "()Z", "getShouldShowLinkDecorations", "getShouldShowRoleDot", "getShouldShowRoleOnName", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class MarkdownTextRenderOptions {

    @NotNull
    private final String containerId;
    private final boolean shouldAnimateEmoji;
    private final boolean shouldShowLinkDecorations;
    private final boolean shouldShowRoleDot;
    private final boolean shouldShowRoleOnName;

    public MarkdownTextRenderOptions(@NotNull String containerId, boolean z5, boolean z6, boolean z7, boolean z10) {
        Intrinsics.checkNotNullParameter(containerId, "containerId");
        this.containerId = containerId;
        this.shouldAnimateEmoji = z5;
        this.shouldShowLinkDecorations = z6;
        this.shouldShowRoleDot = z7;
        this.shouldShowRoleOnName = z10;
    }

    public static /* synthetic */ MarkdownTextRenderOptions copy$default(MarkdownTextRenderOptions markdownTextRenderOptions, String str, boolean z5, boolean z6, boolean z7, boolean z10, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = markdownTextRenderOptions.containerId;
        }
        if ((i7 & 2) != 0) {
            z5 = markdownTextRenderOptions.shouldAnimateEmoji;
        }
        if ((i7 & 4) != 0) {
            z6 = markdownTextRenderOptions.shouldShowLinkDecorations;
        }
        if ((i7 & 8) != 0) {
            z7 = markdownTextRenderOptions.shouldShowRoleDot;
        }
        if ((i7 & 16) != 0) {
            z10 = markdownTextRenderOptions.shouldShowRoleOnName;
        }
        boolean z11 = z10;
        boolean z12 = z6;
        return markdownTextRenderOptions.copy(str, z5, z12, z7, z11);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getContainerId() {
        return this.containerId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getShouldAnimateEmoji() {
        return this.shouldAnimateEmoji;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getShouldShowLinkDecorations() {
        return this.shouldShowLinkDecorations;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getShouldShowRoleDot() {
        return this.shouldShowRoleDot;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getShouldShowRoleOnName() {
        return this.shouldShowRoleOnName;
    }

    @NotNull
    public final MarkdownTextRenderOptions copy(@NotNull String containerId, boolean shouldAnimateEmoji, boolean shouldShowLinkDecorations, boolean shouldShowRoleDot, boolean shouldShowRoleOnName) {
        Intrinsics.checkNotNullParameter(containerId, "containerId");
        return new MarkdownTextRenderOptions(containerId, shouldAnimateEmoji, shouldShowLinkDecorations, shouldShowRoleDot, shouldShowRoleOnName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarkdownTextRenderOptions)) {
            return false;
        }
        MarkdownTextRenderOptions markdownTextRenderOptions = (MarkdownTextRenderOptions) other;
        return Intrinsics.areEqual(this.containerId, markdownTextRenderOptions.containerId) && this.shouldAnimateEmoji == markdownTextRenderOptions.shouldAnimateEmoji && this.shouldShowLinkDecorations == markdownTextRenderOptions.shouldShowLinkDecorations && this.shouldShowRoleDot == markdownTextRenderOptions.shouldShowRoleDot && this.shouldShowRoleOnName == markdownTextRenderOptions.shouldShowRoleOnName;
    }

    @NotNull
    public final String getContainerId() {
        return this.containerId;
    }

    public final boolean getShouldAnimateEmoji() {
        return this.shouldAnimateEmoji;
    }

    public final boolean getShouldShowLinkDecorations() {
        return this.shouldShowLinkDecorations;
    }

    public final boolean getShouldShowRoleDot() {
        return this.shouldShowRoleDot;
    }

    public final boolean getShouldShowRoleOnName() {
        return this.shouldShowRoleOnName;
    }

    public int hashCode() {
        return Boolean.hashCode(this.shouldShowRoleOnName) + a.g(a.g(a.g(this.containerId.hashCode() * 31, 31, this.shouldAnimateEmoji), 31, this.shouldShowLinkDecorations), 31, this.shouldShowRoleDot);
    }

    @NotNull
    public String toString() {
        String str = this.containerId;
        boolean z5 = this.shouldAnimateEmoji;
        boolean z6 = this.shouldShowLinkDecorations;
        boolean z7 = this.shouldShowRoleDot;
        boolean z10 = this.shouldShowRoleOnName;
        StringBuilder sb2 = new StringBuilder("MarkdownTextRenderOptions(containerId=");
        sb2.append(str);
        sb2.append(", shouldAnimateEmoji=");
        sb2.append(z5);
        sb2.append(", shouldShowLinkDecorations=");
        e.B(sb2, z6, ", shouldShowRoleDot=", z7, ", shouldShowRoleOnName=");
        return a.m(sb2, z10, ")");
    }
}

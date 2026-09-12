package com.discord.chat.bridge.contentnode;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/discord/chat/bridge/contentnode/ErrorContentNode;", "Lcom/discord/chat/bridge/contentnode/ContentNode;", "throwable", "", "<init>", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ErrorContentNode extends ContentNode {

    @NotNull
    private final Throwable throwable;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ErrorContentNode(@NotNull Throwable throwable) {
        super(null);
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        this.throwable = throwable;
    }

    public static /* synthetic */ ErrorContentNode copy$default(ErrorContentNode errorContentNode, Throwable th2, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            th2 = errorContentNode.throwable;
        }
        return errorContentNode.copy(th2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Throwable getThrowable() {
        return this.throwable;
    }

    @NotNull
    public final ErrorContentNode copy(@NotNull Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        return new ErrorContentNode(throwable);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ErrorContentNode) && Intrinsics.areEqual(this.throwable, ((ErrorContentNode) other).throwable);
    }

    @NotNull
    public final Throwable getThrowable() {
        return this.throwable;
    }

    public int hashCode() {
        return this.throwable.hashCode();
    }

    @NotNull
    public String toString() {
        return "ErrorContentNode(throwable=" + this.throwable + ")";
    }
}

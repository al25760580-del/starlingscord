package com.discord.chat.presentation.message.view;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/discord/chat/presentation/message/view/UploadContext;", "", "uploaderId", "", "uploadItemId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getUploaderId", "()Ljava/lang/String;", "getUploadItemId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class UploadContext {

    @NotNull
    private final String uploadItemId;

    @NotNull
    private final String uploaderId;

    public UploadContext(@NotNull String uploaderId, @NotNull String uploadItemId) {
        Intrinsics.checkNotNullParameter(uploaderId, "uploaderId");
        Intrinsics.checkNotNullParameter(uploadItemId, "uploadItemId");
        this.uploaderId = uploaderId;
        this.uploadItemId = uploadItemId;
    }

    public static /* synthetic */ UploadContext copy$default(UploadContext uploadContext, String str, String str2, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = uploadContext.uploaderId;
        }
        if ((i7 & 2) != 0) {
            str2 = uploadContext.uploadItemId;
        }
        return uploadContext.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUploaderId() {
        return this.uploaderId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUploadItemId() {
        return this.uploadItemId;
    }

    @NotNull
    public final UploadContext copy(@NotNull String uploaderId, @NotNull String uploadItemId) {
        Intrinsics.checkNotNullParameter(uploaderId, "uploaderId");
        Intrinsics.checkNotNullParameter(uploadItemId, "uploadItemId");
        return new UploadContext(uploaderId, uploadItemId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UploadContext)) {
            return false;
        }
        UploadContext uploadContext = (UploadContext) other;
        return Intrinsics.areEqual(this.uploaderId, uploadContext.uploaderId) && Intrinsics.areEqual(this.uploadItemId, uploadContext.uploadItemId);
    }

    @NotNull
    public final String getUploadItemId() {
        return this.uploadItemId;
    }

    @NotNull
    public final String getUploaderId() {
        return this.uploaderId;
    }

    public int hashCode() {
        return this.uploadItemId.hashCode() + (this.uploaderId.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return s0.g.f("UploadContext(uploaderId=", this.uploaderId, ", uploadItemId=", this.uploadItemId, ")");
    }
}

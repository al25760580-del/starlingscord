package com.discord.tti_manager;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\fJ0\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000e\u0010\f¨\u0006\u001a"}, d2 = {"Lcom/discord/tti_manager/ArtProfileFileMetadata;", "", "status", "", "sizeBytes", "", "lastModifiedMs", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;)V", "getStatus", "()Ljava/lang/String;", "getSizeBytes", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getLastModifiedMs", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;)Lcom/discord/tti_manager/ArtProfileFileMetadata;", "equals", "", "other", "hashCode", "", "toString", "tti_manager_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ArtProfileFileMetadata {
    private final Long lastModifiedMs;
    private final Long sizeBytes;

    @NotNull
    private final String status;

    public ArtProfileFileMetadata(@NotNull String status, Long l6, Long l7) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.status = status;
        this.sizeBytes = l6;
        this.lastModifiedMs = l7;
    }

    public static /* synthetic */ ArtProfileFileMetadata copy$default(ArtProfileFileMetadata artProfileFileMetadata, String str, Long l6, Long l7, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = artProfileFileMetadata.status;
        }
        if ((i7 & 2) != 0) {
            l6 = artProfileFileMetadata.sizeBytes;
        }
        if ((i7 & 4) != 0) {
            l7 = artProfileFileMetadata.lastModifiedMs;
        }
        return artProfileFileMetadata.copy(str, l6, l7);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getSizeBytes() {
        return this.sizeBytes;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getLastModifiedMs() {
        return this.lastModifiedMs;
    }

    @NotNull
    public final ArtProfileFileMetadata copy(@NotNull String status, Long sizeBytes, Long lastModifiedMs) {
        Intrinsics.checkNotNullParameter(status, "status");
        return new ArtProfileFileMetadata(status, sizeBytes, lastModifiedMs);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ArtProfileFileMetadata)) {
            return false;
        }
        ArtProfileFileMetadata artProfileFileMetadata = (ArtProfileFileMetadata) other;
        return Intrinsics.areEqual(this.status, artProfileFileMetadata.status) && Intrinsics.areEqual(this.sizeBytes, artProfileFileMetadata.sizeBytes) && Intrinsics.areEqual(this.lastModifiedMs, artProfileFileMetadata.lastModifiedMs);
    }

    public final Long getLastModifiedMs() {
        return this.lastModifiedMs;
    }

    public final Long getSizeBytes() {
        return this.sizeBytes;
    }

    @NotNull
    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        int iHashCode = this.status.hashCode() * 31;
        Long l6 = this.sizeBytes;
        int iHashCode2 = (iHashCode + (l6 == null ? 0 : l6.hashCode())) * 31;
        Long l7 = this.lastModifiedMs;
        return iHashCode2 + (l7 != null ? l7.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ArtProfileFileMetadata(status=" + this.status + ", sizeBytes=" + this.sizeBytes + ", lastModifiedMs=" + this.lastModifiedMs + ")";
    }
}

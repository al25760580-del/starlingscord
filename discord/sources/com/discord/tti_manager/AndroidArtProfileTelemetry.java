package com.discord.tti_manager;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import kk.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\u0014\u001a\u00020\u0015J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001a\u001a\u00020\tHÆ\u0003J;\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\t2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\""}, d2 = {"Lcom/discord/tti_manager/AndroidArtProfileTelemetry;", "", "packageUpdateAgeMs", "", "launchIndexSincePackageUpdate", "referenceProfile", "Lcom/discord/tti_manager/ArtProfileFileMetadata;", "currentProfile", "changedSincePreviousObservation", "", "<init>", "(JJLcom/discord/tti_manager/ArtProfileFileMetadata;Lcom/discord/tti_manager/ArtProfileFileMetadata;Z)V", "getPackageUpdateAgeMs", "()J", "getLaunchIndexSincePackageUpdate", "getReferenceProfile", "()Lcom/discord/tti_manager/ArtProfileFileMetadata;", "getCurrentProfile", "getChangedSincePreviousObservation", "()Z", "toWritableMap", "Lcom/facebook/react/bridge/WritableMap;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "", "tti_manager_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class AndroidArtProfileTelemetry {
    private final boolean changedSincePreviousObservation;

    @NotNull
    private final ArtProfileFileMetadata currentProfile;
    private final long launchIndexSincePackageUpdate;
    private final long packageUpdateAgeMs;

    @NotNull
    private final ArtProfileFileMetadata referenceProfile;

    public AndroidArtProfileTelemetry(long j, long j5, @NotNull ArtProfileFileMetadata referenceProfile, @NotNull ArtProfileFileMetadata currentProfile, boolean z5) {
        Intrinsics.checkNotNullParameter(referenceProfile, "referenceProfile");
        Intrinsics.checkNotNullParameter(currentProfile, "currentProfile");
        this.packageUpdateAgeMs = j;
        this.launchIndexSincePackageUpdate = j5;
        this.referenceProfile = referenceProfile;
        this.currentProfile = currentProfile;
        this.changedSincePreviousObservation = z5;
    }

    public static /* synthetic */ AndroidArtProfileTelemetry copy$default(AndroidArtProfileTelemetry androidArtProfileTelemetry, long j, long j5, ArtProfileFileMetadata artProfileFileMetadata, ArtProfileFileMetadata artProfileFileMetadata2, boolean z5, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            j = androidArtProfileTelemetry.packageUpdateAgeMs;
        }
        long j7 = j;
        if ((i7 & 2) != 0) {
            j5 = androidArtProfileTelemetry.launchIndexSincePackageUpdate;
        }
        long j10 = j5;
        if ((i7 & 4) != 0) {
            artProfileFileMetadata = androidArtProfileTelemetry.referenceProfile;
        }
        ArtProfileFileMetadata artProfileFileMetadata3 = artProfileFileMetadata;
        if ((i7 & 8) != 0) {
            artProfileFileMetadata2 = androidArtProfileTelemetry.currentProfile;
        }
        ArtProfileFileMetadata artProfileFileMetadata4 = artProfileFileMetadata2;
        if ((i7 & 16) != 0) {
            z5 = androidArtProfileTelemetry.changedSincePreviousObservation;
        }
        return androidArtProfileTelemetry.copy(j7, j10, artProfileFileMetadata3, artProfileFileMetadata4, z5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getPackageUpdateAgeMs() {
        return this.packageUpdateAgeMs;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getLaunchIndexSincePackageUpdate() {
        return this.launchIndexSincePackageUpdate;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ArtProfileFileMetadata getReferenceProfile() {
        return this.referenceProfile;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final ArtProfileFileMetadata getCurrentProfile() {
        return this.currentProfile;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getChangedSincePreviousObservation() {
        return this.changedSincePreviousObservation;
    }

    @NotNull
    public final AndroidArtProfileTelemetry copy(long packageUpdateAgeMs, long launchIndexSincePackageUpdate, @NotNull ArtProfileFileMetadata referenceProfile, @NotNull ArtProfileFileMetadata currentProfile, boolean changedSincePreviousObservation) {
        Intrinsics.checkNotNullParameter(referenceProfile, "referenceProfile");
        Intrinsics.checkNotNullParameter(currentProfile, "currentProfile");
        return new AndroidArtProfileTelemetry(packageUpdateAgeMs, launchIndexSincePackageUpdate, referenceProfile, currentProfile, changedSincePreviousObservation);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AndroidArtProfileTelemetry)) {
            return false;
        }
        AndroidArtProfileTelemetry androidArtProfileTelemetry = (AndroidArtProfileTelemetry) other;
        return this.packageUpdateAgeMs == androidArtProfileTelemetry.packageUpdateAgeMs && this.launchIndexSincePackageUpdate == androidArtProfileTelemetry.launchIndexSincePackageUpdate && Intrinsics.areEqual(this.referenceProfile, androidArtProfileTelemetry.referenceProfile) && Intrinsics.areEqual(this.currentProfile, androidArtProfileTelemetry.currentProfile) && this.changedSincePreviousObservation == androidArtProfileTelemetry.changedSincePreviousObservation;
    }

    public final boolean getChangedSincePreviousObservation() {
        return this.changedSincePreviousObservation;
    }

    @NotNull
    public final ArtProfileFileMetadata getCurrentProfile() {
        return this.currentProfile;
    }

    public final long getLaunchIndexSincePackageUpdate() {
        return this.launchIndexSincePackageUpdate;
    }

    public final long getPackageUpdateAgeMs() {
        return this.packageUpdateAgeMs;
    }

    @NotNull
    public final ArtProfileFileMetadata getReferenceProfile() {
        return this.referenceProfile;
    }

    public int hashCode() {
        return Boolean.hashCode(this.changedSincePreviousObservation) + ((this.currentProfile.hashCode() + ((this.referenceProfile.hashCode() + com.discord.chat.presentation.list.a.h(this.launchIndexSincePackageUpdate, Long.hashCode(this.packageUpdateAgeMs) * 31, 31)) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        long j = this.packageUpdateAgeMs;
        long j5 = this.launchIndexSincePackageUpdate;
        ArtProfileFileMetadata artProfileFileMetadata = this.referenceProfile;
        ArtProfileFileMetadata artProfileFileMetadata2 = this.currentProfile;
        boolean z5 = this.changedSincePreviousObservation;
        StringBuilder sbM = b.m(j, "AndroidArtProfileTelemetry(packageUpdateAgeMs=", ", launchIndexSincePackageUpdate=");
        sbM.append(j5);
        sbM.append(", referenceProfile=");
        sbM.append(artProfileFileMetadata);
        sbM.append(", currentProfile=");
        sbM.append(artProfileFileMetadata2);
        sbM.append(", changedSincePreviousObservation=");
        sbM.append(z5);
        sbM.append(")");
        return sbM.toString();
    }

    @NotNull
    public final WritableMap toWritableMap() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putLong("packageUpdateAgeMs", this.packageUpdateAgeMs);
        writableMapCreateMap.putLong("launchIndexSincePackageUpdate", this.launchIndexSincePackageUpdate);
        writableMapCreateMap.putString("referenceProfileMetadataStatus", this.referenceProfile.getStatus());
        ArtProfileTelemetryKt.putNullableLong(writableMapCreateMap, "referenceProfileSizeBytes", this.referenceProfile.getSizeBytes());
        ArtProfileTelemetryKt.putNullableLong(writableMapCreateMap, "referenceProfileLastModifiedMs", this.referenceProfile.getLastModifiedMs());
        writableMapCreateMap.putString("currentProfileMetadataStatus", this.currentProfile.getStatus());
        ArtProfileTelemetryKt.putNullableLong(writableMapCreateMap, "currentProfileSizeBytes", this.currentProfile.getSizeBytes());
        ArtProfileTelemetryKt.putNullableLong(writableMapCreateMap, "currentProfileLastModifiedMs", this.currentProfile.getLastModifiedMs());
        writableMapCreateMap.putBoolean("changedSincePreviousObservation", this.changedSincePreviousObservation);
        return writableMapCreateMap;
    }
}

package com.discord.chat.bridge.forwarding;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kr.f;
import or.e1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@f
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002!\"B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\u000bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J%\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0001¢\u0006\u0002\b R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006#"}, d2 = {"Lcom/discord/chat/bridge/forwarding/ForwardInfo;", "", "snapshotIndex", "", "footerInfo", "Lcom/discord/chat/bridge/forwarding/ForwardFooterInfo;", "<init>", "(ILcom/discord/chat/bridge/forwarding/ForwardFooterInfo;)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IILcom/discord/chat/bridge/forwarding/ForwardFooterInfo;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getSnapshotIndex", "()I", "getFooterInfo", "()Lcom/discord/chat/bridge/forwarding/ForwardFooterInfo;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$chat_release", "$serializer", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ForwardInfo {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final ForwardFooterInfo footerInfo;
    private final int snapshotIndex;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/chat/bridge/forwarding/ForwardInfo$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/forwarding/ForwardInfo;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return ForwardInfo$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ForwardInfo(int i7, int i10, ForwardFooterInfo forwardFooterInfo, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i7 & 1)) {
            e1.l(i7, 1, ForwardInfo$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.snapshotIndex = i10;
        if ((i7 & 2) == 0) {
            this.footerInfo = null;
        } else {
            this.footerInfo = forwardFooterInfo;
        }
    }

    public static /* synthetic */ ForwardInfo copy$default(ForwardInfo forwardInfo, int i7, ForwardFooterInfo forwardFooterInfo, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i7 = forwardInfo.snapshotIndex;
        }
        if ((i10 & 2) != 0) {
            forwardFooterInfo = forwardInfo.footerInfo;
        }
        return forwardInfo.copy(i7, forwardFooterInfo);
    }

    public static final /* synthetic */ void write$Self$chat_release(ForwardInfo self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.l(0, self.snapshotIndex, serialDesc);
        if (!output.u(serialDesc, 1) && self.footerInfo == null) {
            return;
        }
        output.r(serialDesc, 1, ForwardFooterInfo$$serializer.INSTANCE, self.footerInfo);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getSnapshotIndex() {
        return this.snapshotIndex;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ForwardFooterInfo getFooterInfo() {
        return this.footerInfo;
    }

    @NotNull
    public final ForwardInfo copy(int snapshotIndex, ForwardFooterInfo footerInfo) {
        return new ForwardInfo(snapshotIndex, footerInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ForwardInfo)) {
            return false;
        }
        ForwardInfo forwardInfo = (ForwardInfo) other;
        return this.snapshotIndex == forwardInfo.snapshotIndex && Intrinsics.areEqual(this.footerInfo, forwardInfo.footerInfo);
    }

    public final ForwardFooterInfo getFooterInfo() {
        return this.footerInfo;
    }

    public final int getSnapshotIndex() {
        return this.snapshotIndex;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.snapshotIndex) * 31;
        ForwardFooterInfo forwardFooterInfo = this.footerInfo;
        return iHashCode + (forwardFooterInfo == null ? 0 : forwardFooterInfo.hashCode());
    }

    @NotNull
    public String toString() {
        return "ForwardInfo(snapshotIndex=" + this.snapshotIndex + ", footerInfo=" + this.footerInfo + ")";
    }

    public ForwardInfo(int i7, ForwardFooterInfo forwardFooterInfo) {
        this.snapshotIndex = i7;
        this.footerInfo = forwardFooterInfo;
    }

    public /* synthetic */ ForwardInfo(int i7, ForwardFooterInfo forwardFooterInfo, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i7, (i10 & 2) != 0 ? null : forwardFooterInfo);
    }
}

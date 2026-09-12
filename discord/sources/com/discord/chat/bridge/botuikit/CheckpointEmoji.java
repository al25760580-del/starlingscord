package com.discord.chat.bridge.botuikit;

import a3.e;
import com.discord.chat.presentation.list.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kr.f;
import or.e1;
import or.r0;
import or.s1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@f
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002&'B'\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0007\u0010\rJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J0\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\nHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001J%\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00002\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0001¢\u0006\u0002\b%R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012¨\u0006("}, d2 = {"Lcom/discord/chat/bridge/botuikit/CheckpointEmoji;", "", "emojiId", "", "emojiName", "", "emojiSurrogateName", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/Long;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getEmojiId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getEmojiName", "()Ljava/lang/String;", "getEmojiSurrogateName", "component1", "component2", "component3", "copy", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;)Lcom/discord/chat/bridge/botuikit/CheckpointEmoji;", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$chat_release", "$serializer", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class CheckpointEmoji {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final Long emojiId;

    @NotNull
    private final String emojiName;
    private final String emojiSurrogateName;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/chat/bridge/botuikit/CheckpointEmoji$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/botuikit/CheckpointEmoji;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return CheckpointEmoji$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ CheckpointEmoji(int i7, Long l6, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (2 != (i7 & 2)) {
            e1.l(i7, 2, CheckpointEmoji$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i7 & 1) == 0) {
            this.emojiId = null;
        } else {
            this.emojiId = l6;
        }
        this.emojiName = str;
        if ((i7 & 4) == 0) {
            this.emojiSurrogateName = null;
        } else {
            this.emojiSurrogateName = str2;
        }
    }

    public static /* synthetic */ CheckpointEmoji copy$default(CheckpointEmoji checkpointEmoji, Long l6, String str, String str2, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            l6 = checkpointEmoji.emojiId;
        }
        if ((i7 & 2) != 0) {
            str = checkpointEmoji.emojiName;
        }
        if ((i7 & 4) != 0) {
            str2 = checkpointEmoji.emojiSurrogateName;
        }
        return checkpointEmoji.copy(l6, str, str2);
    }

    public static final /* synthetic */ void write$Self$chat_release(CheckpointEmoji self, CompositeEncoder output, SerialDescriptor serialDesc) {
        if (output.u(serialDesc, 0) || self.emojiId != null) {
            output.r(serialDesc, 0, r0.f17595a, self.emojiId);
        }
        output.q(serialDesc, 1, self.emojiName);
        if (!output.u(serialDesc, 2) && self.emojiSurrogateName == null) {
            return;
        }
        output.r(serialDesc, 2, s1.f17602a, self.emojiSurrogateName);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Long getEmojiId() {
        return this.emojiId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getEmojiName() {
        return this.emojiName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getEmojiSurrogateName() {
        return this.emojiSurrogateName;
    }

    @NotNull
    public final CheckpointEmoji copy(Long emojiId, @NotNull String emojiName, String emojiSurrogateName) {
        Intrinsics.checkNotNullParameter(emojiName, "emojiName");
        return new CheckpointEmoji(emojiId, emojiName, emojiSurrogateName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CheckpointEmoji)) {
            return false;
        }
        CheckpointEmoji checkpointEmoji = (CheckpointEmoji) other;
        return Intrinsics.areEqual(this.emojiId, checkpointEmoji.emojiId) && Intrinsics.areEqual(this.emojiName, checkpointEmoji.emojiName) && Intrinsics.areEqual(this.emojiSurrogateName, checkpointEmoji.emojiSurrogateName);
    }

    public final Long getEmojiId() {
        return this.emojiId;
    }

    @NotNull
    public final String getEmojiName() {
        return this.emojiName;
    }

    public final String getEmojiSurrogateName() {
        return this.emojiSurrogateName;
    }

    public int hashCode() {
        Long l6 = this.emojiId;
        int iD = e.d((l6 == null ? 0 : l6.hashCode()) * 31, 31, this.emojiName);
        String str = this.emojiSurrogateName;
        return iD + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Long l6 = this.emojiId;
        String str = this.emojiName;
        String str2 = this.emojiSurrogateName;
        StringBuilder sb2 = new StringBuilder("CheckpointEmoji(emojiId=");
        sb2.append(l6);
        sb2.append(", emojiName=");
        sb2.append(str);
        sb2.append(", emojiSurrogateName=");
        return a.k(sb2, str2, ")");
    }

    public CheckpointEmoji(Long l6, @NotNull String emojiName, String str) {
        Intrinsics.checkNotNullParameter(emojiName, "emojiName");
        this.emojiId = l6;
        this.emojiName = emojiName;
        this.emojiSurrogateName = str;
    }

    public /* synthetic */ CheckpointEmoji(Long l6, String str, String str2, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : l6, str, (i7 & 4) != 0 ? null : str2);
    }
}

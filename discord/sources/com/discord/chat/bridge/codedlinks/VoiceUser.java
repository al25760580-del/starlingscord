package com.discord.chat.bridge.codedlinks;

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
import or.m0;
import or.s1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@f
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002+,B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bBK\b\u0010\u0012\u0006\u0010\f\u001a\u00020\t\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u000fJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0016JD\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020\u00072\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\tHÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001J%\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u00002\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)H\u0001¢\u0006\u0002\b*R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0014R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016¨\u0006-"}, d2 = {"Lcom/discord/chat/bridge/codedlinks/VoiceUser;", "", "userId", "", "displayName", "avatarUrl", "isStreaming", "", "fontId", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Integer;)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Integer;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getUserId", "()Ljava/lang/String;", "getDisplayName", "getAvatarUrl", "()Z", "getFontId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Integer;)Lcom/discord/chat/bridge/codedlinks/VoiceUser;", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$chat_release", "$serializer", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class VoiceUser {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final String avatarUrl;

    @NotNull
    private final String displayName;
    private final Integer fontId;
    private final boolean isStreaming;

    @NotNull
    private final String userId;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/chat/bridge/codedlinks/VoiceUser$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/codedlinks/VoiceUser;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return VoiceUser$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ VoiceUser(int i7, String str, String str2, String str3, boolean z5, Integer num, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i7 & 3)) {
            e1.l(i7, 3, VoiceUser$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.userId = str;
        this.displayName = str2;
        if ((i7 & 4) == 0) {
            this.avatarUrl = null;
        } else {
            this.avatarUrl = str3;
        }
        if ((i7 & 8) == 0) {
            this.isStreaming = false;
        } else {
            this.isStreaming = z5;
        }
        if ((i7 & 16) == 0) {
            this.fontId = null;
        } else {
            this.fontId = num;
        }
    }

    public static /* synthetic */ VoiceUser copy$default(VoiceUser voiceUser, String str, String str2, String str3, boolean z5, Integer num, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = voiceUser.userId;
        }
        if ((i7 & 2) != 0) {
            str2 = voiceUser.displayName;
        }
        if ((i7 & 4) != 0) {
            str3 = voiceUser.avatarUrl;
        }
        if ((i7 & 8) != 0) {
            z5 = voiceUser.isStreaming;
        }
        if ((i7 & 16) != 0) {
            num = voiceUser.fontId;
        }
        Integer num2 = num;
        String str4 = str3;
        return voiceUser.copy(str, str2, str4, z5, num2);
    }

    public static final /* synthetic */ void write$Self$chat_release(VoiceUser self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.userId);
        output.q(serialDesc, 1, self.displayName);
        if (output.u(serialDesc, 2) || self.avatarUrl != null) {
            output.r(serialDesc, 2, s1.f17602a, self.avatarUrl);
        }
        if (output.u(serialDesc, 3) || self.isStreaming) {
            output.p(serialDesc, 3, self.isStreaming);
        }
        if (!output.u(serialDesc, 4) && self.fontId == null) {
            return;
        }
        output.r(serialDesc, 4, m0.f17573a, self.fontId);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIsStreaming() {
        return this.isStreaming;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getFontId() {
        return this.fontId;
    }

    @NotNull
    public final VoiceUser copy(@NotNull String userId, @NotNull String displayName, String avatarUrl, boolean isStreaming, Integer fontId) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        return new VoiceUser(userId, displayName, avatarUrl, isStreaming, fontId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VoiceUser)) {
            return false;
        }
        VoiceUser voiceUser = (VoiceUser) other;
        return Intrinsics.areEqual(this.userId, voiceUser.userId) && Intrinsics.areEqual(this.displayName, voiceUser.displayName) && Intrinsics.areEqual(this.avatarUrl, voiceUser.avatarUrl) && this.isStreaming == voiceUser.isStreaming && Intrinsics.areEqual(this.fontId, voiceUser.fontId);
    }

    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    @NotNull
    public final String getDisplayName() {
        return this.displayName;
    }

    public final Integer getFontId() {
        return this.fontId;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int iD = e.d(this.userId.hashCode() * 31, 31, this.displayName);
        String str = this.avatarUrl;
        int iG = a.g((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.isStreaming);
        Integer num = this.fontId;
        return iG + (num != null ? num.hashCode() : 0);
    }

    public final boolean isStreaming() {
        return this.isStreaming;
    }

    @NotNull
    public String toString() {
        String str = this.userId;
        String str2 = this.displayName;
        String str3 = this.avatarUrl;
        boolean z5 = this.isStreaming;
        Integer num = this.fontId;
        StringBuilder sbU = e.u("VoiceUser(userId=", str, ", displayName=", str2, ", avatarUrl=");
        sbU.append(str3);
        sbU.append(", isStreaming=");
        sbU.append(z5);
        sbU.append(", fontId=");
        sbU.append(num);
        sbU.append(")");
        return sbU.toString();
    }

    public VoiceUser(@NotNull String userId, @NotNull String displayName, String str, boolean z5, Integer num) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        this.userId = userId;
        this.displayName = displayName;
        this.avatarUrl = str;
        this.isStreaming = z5;
        this.fontId = num;
    }

    public /* synthetic */ VoiceUser(String str, String str2, String str3, boolean z5, Integer num, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i7 & 4) != 0 ? null : str3, (i7 & 8) != 0 ? false : z5, (i7 & 16) != 0 ? null : num);
    }
}

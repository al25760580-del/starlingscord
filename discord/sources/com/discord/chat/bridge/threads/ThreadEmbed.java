package com.discord.chat.bridge.threads;

import a3.e;
import com.facebook.react.modules.dialog.AlertFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kr.f;
import or.e1;
import or.g;
import or.s1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@f
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000201BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fBW\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u000b\u0010\u0011J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0017J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\nHÆ\u0003JR\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010#J\u0013\u0010$\u001a\u00020\u00072\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\u000eHÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001J%\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u00002\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.H\u0001¢\u0006\u0002\b/R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u00062"}, d2 = {"Lcom/discord/chat/bridge/threads/ThreadEmbed;", "", AlertFragment.ARG_TITLE, "", "messageCountLabel", "messagePreviewString", "archived", "", "archivedIconUrl", "referencedMessage", "Lcom/discord/chat/bridge/threads/ThreadEmbedMessage;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lcom/discord/chat/bridge/threads/ThreadEmbedMessage;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lcom/discord/chat/bridge/threads/ThreadEmbedMessage;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getTitle", "()Ljava/lang/String;", "getMessageCountLabel", "getMessagePreviewString", "getArchived", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getArchivedIconUrl", "getReferencedMessage", "()Lcom/discord/chat/bridge/threads/ThreadEmbedMessage;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lcom/discord/chat/bridge/threads/ThreadEmbedMessage;)Lcom/discord/chat/bridge/threads/ThreadEmbed;", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$chat_release", "$serializer", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ThreadEmbed {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final Boolean archived;
    private final String archivedIconUrl;

    @NotNull
    private final String messageCountLabel;
    private final String messagePreviewString;
    private final ThreadEmbedMessage referencedMessage;

    @NotNull
    private final String title;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/chat/bridge/threads/ThreadEmbed$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/threads/ThreadEmbed;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return ThreadEmbed$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ThreadEmbed(int i7, String str, String str2, String str3, Boolean bool, String str4, ThreadEmbedMessage threadEmbedMessage, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i7 & 3)) {
            e1.l(i7, 3, ThreadEmbed$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.title = str;
        this.messageCountLabel = str2;
        if ((i7 & 4) == 0) {
            this.messagePreviewString = null;
        } else {
            this.messagePreviewString = str3;
        }
        if ((i7 & 8) == 0) {
            this.archived = null;
        } else {
            this.archived = bool;
        }
        if ((i7 & 16) == 0) {
            this.archivedIconUrl = null;
        } else {
            this.archivedIconUrl = str4;
        }
        if ((i7 & 32) == 0) {
            this.referencedMessage = null;
        } else {
            this.referencedMessage = threadEmbedMessage;
        }
    }

    public static /* synthetic */ ThreadEmbed copy$default(ThreadEmbed threadEmbed, String str, String str2, String str3, Boolean bool, String str4, ThreadEmbedMessage threadEmbedMessage, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = threadEmbed.title;
        }
        if ((i7 & 2) != 0) {
            str2 = threadEmbed.messageCountLabel;
        }
        if ((i7 & 4) != 0) {
            str3 = threadEmbed.messagePreviewString;
        }
        if ((i7 & 8) != 0) {
            bool = threadEmbed.archived;
        }
        if ((i7 & 16) != 0) {
            str4 = threadEmbed.archivedIconUrl;
        }
        if ((i7 & 32) != 0) {
            threadEmbedMessage = threadEmbed.referencedMessage;
        }
        String str5 = str4;
        ThreadEmbedMessage threadEmbedMessage2 = threadEmbedMessage;
        return threadEmbed.copy(str, str2, str3, bool, str5, threadEmbedMessage2);
    }

    public static final /* synthetic */ void write$Self$chat_release(ThreadEmbed self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.title);
        output.q(serialDesc, 1, self.messageCountLabel);
        if (output.u(serialDesc, 2) || self.messagePreviewString != null) {
            output.r(serialDesc, 2, s1.f17602a, self.messagePreviewString);
        }
        if (output.u(serialDesc, 3) || self.archived != null) {
            output.r(serialDesc, 3, g.f17537a, self.archived);
        }
        if (output.u(serialDesc, 4) || self.archivedIconUrl != null) {
            output.r(serialDesc, 4, s1.f17602a, self.archivedIconUrl);
        }
        if (!output.u(serialDesc, 5) && self.referencedMessage == null) {
            return;
        }
        output.r(serialDesc, 5, ThreadEmbedMessage$$serializer.INSTANCE, self.referencedMessage);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMessageCountLabel() {
        return this.messageCountLabel;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMessagePreviewString() {
        return this.messagePreviewString;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getArchived() {
        return this.archived;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getArchivedIconUrl() {
        return this.archivedIconUrl;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final ThreadEmbedMessage getReferencedMessage() {
        return this.referencedMessage;
    }

    @NotNull
    public final ThreadEmbed copy(@NotNull String title, @NotNull String messageCountLabel, String messagePreviewString, Boolean archived, String archivedIconUrl, ThreadEmbedMessage referencedMessage) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(messageCountLabel, "messageCountLabel");
        return new ThreadEmbed(title, messageCountLabel, messagePreviewString, archived, archivedIconUrl, referencedMessage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ThreadEmbed)) {
            return false;
        }
        ThreadEmbed threadEmbed = (ThreadEmbed) other;
        return Intrinsics.areEqual(this.title, threadEmbed.title) && Intrinsics.areEqual(this.messageCountLabel, threadEmbed.messageCountLabel) && Intrinsics.areEqual(this.messagePreviewString, threadEmbed.messagePreviewString) && Intrinsics.areEqual(this.archived, threadEmbed.archived) && Intrinsics.areEqual(this.archivedIconUrl, threadEmbed.archivedIconUrl) && Intrinsics.areEqual(this.referencedMessage, threadEmbed.referencedMessage);
    }

    public final Boolean getArchived() {
        return this.archived;
    }

    public final String getArchivedIconUrl() {
        return this.archivedIconUrl;
    }

    @NotNull
    public final String getMessageCountLabel() {
        return this.messageCountLabel;
    }

    public final String getMessagePreviewString() {
        return this.messagePreviewString;
    }

    public final ThreadEmbedMessage getReferencedMessage() {
        return this.referencedMessage;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iD = e.d(this.title.hashCode() * 31, 31, this.messageCountLabel);
        String str = this.messagePreviewString;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.archived;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.archivedIconUrl;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ThreadEmbedMessage threadEmbedMessage = this.referencedMessage;
        return iHashCode3 + (threadEmbedMessage != null ? threadEmbedMessage.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.title;
        String str2 = this.messageCountLabel;
        String str3 = this.messagePreviewString;
        Boolean bool = this.archived;
        String str4 = this.archivedIconUrl;
        ThreadEmbedMessage threadEmbedMessage = this.referencedMessage;
        StringBuilder sbU = e.u("ThreadEmbed(title=", str, ", messageCountLabel=", str2, ", messagePreviewString=");
        sbU.append(str3);
        sbU.append(", archived=");
        sbU.append(bool);
        sbU.append(", archivedIconUrl=");
        sbU.append(str4);
        sbU.append(", referencedMessage=");
        sbU.append(threadEmbedMessage);
        sbU.append(")");
        return sbU.toString();
    }

    public ThreadEmbed(@NotNull String title, @NotNull String messageCountLabel, String str, Boolean bool, String str2, ThreadEmbedMessage threadEmbedMessage) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(messageCountLabel, "messageCountLabel");
        this.title = title;
        this.messageCountLabel = messageCountLabel;
        this.messagePreviewString = str;
        this.archived = bool;
        this.archivedIconUrl = str2;
        this.referencedMessage = threadEmbedMessage;
    }

    public /* synthetic */ ThreadEmbed(String str, String str2, String str3, Boolean bool, String str4, ThreadEmbedMessage threadEmbedMessage, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i7 & 4) != 0 ? null : str3, (i7 & 8) != 0 ? null : bool, (i7 & 16) != 0 ? null : str4, (i7 & 32) != 0 ? null : threadEmbedMessage);
    }
}

package com.discord.chat.bridge.polls;

import a3.e;
import com.discord.chat.presentation.list.a;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@f
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 ;2\u00020\u0001:\u0002:;B]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003¢\u0006\u0004\b\u000f\u0010\u0010Bq\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\n\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000f\u0010\u0014J\u0006\u0010\"\u001a\u00020\u0007J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0007HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\nHÆ\u0003J\u0010\u0010(\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001eJ\u0010\u0010)\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001eJ\u0010\u0010*\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001eJ\t\u0010+\u001a\u00020\u0003HÆ\u0003Jn\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010-J\u0013\u0010.\u001a\u00020\u00072\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00100\u001a\u00020\nHÖ\u0001J\t\u00101\u001a\u00020\u0003HÖ\u0001J%\u00102\u001a\u0002032\u0006\u00104\u001a\u00020\u00002\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u000208H\u0001¢\u0006\u0002\b9R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u000b\u0010\u001eR\u0015\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\f\u0010\u001eR\u0015\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b \u0010\u001eR\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0016¨\u0006<"}, d2 = {"Lcom/discord/chat/bridge/polls/PollAnswer;", "", "answerId", "", "pollMedia", "Lcom/discord/chat/bridge/polls/PollMedia;", "didSelfVote", "", "votes", "votesPercentage", "", "isSelected", "isVictor", "shouldAnimateTransition", "style", "<init>", "(Ljava/lang/String;Lcom/discord/chat/bridge/polls/PollMedia;ZLjava/lang/String;ILjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/discord/chat/bridge/polls/PollMedia;ZLjava/lang/String;ILjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getAnswerId", "()Ljava/lang/String;", "getPollMedia", "()Lcom/discord/chat/bridge/polls/PollMedia;", "getDidSelfVote", "()Z", "getVotes", "getVotesPercentage", "()I", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getShouldAnimateTransition", "getStyle", "hasImage", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Lcom/discord/chat/bridge/polls/PollMedia;ZLjava/lang/String;ILjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/discord/chat/bridge/polls/PollAnswer;", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$chat_release", "$serializer", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class PollAnswer {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String answerId;
    private final boolean didSelfVote;
    private final Boolean isSelected;
    private final Boolean isVictor;

    @NotNull
    private final PollMedia pollMedia;
    private final Boolean shouldAnimateTransition;

    @NotNull
    private final String style;

    @NotNull
    private final String votes;
    private final int votesPercentage;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/chat/bridge/polls/PollAnswer$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/polls/PollAnswer;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return PollAnswer$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ PollAnswer(int i7, String str, PollMedia pollMedia, boolean z5, String str2, int i10, Boolean bool, Boolean bool2, Boolean bool3, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i7 & 31)) {
            e1.l(i7, 31, PollAnswer$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.answerId = str;
        this.pollMedia = pollMedia;
        this.didSelfVote = z5;
        this.votes = str2;
        this.votesPercentage = i10;
        if ((i7 & 32) == 0) {
            this.isSelected = null;
        } else {
            this.isSelected = bool;
        }
        if ((i7 & 64) == 0) {
            this.isVictor = null;
        } else {
            this.isVictor = bool2;
        }
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 0) {
            this.shouldAnimateTransition = null;
        } else {
            this.shouldAnimateTransition = bool3;
        }
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) == 0) {
            this.style = "normal";
        } else {
            this.style = str3;
        }
    }

    public static /* synthetic */ PollAnswer copy$default(PollAnswer pollAnswer, String str, PollMedia pollMedia, boolean z5, String str2, int i7, Boolean bool, Boolean bool2, Boolean bool3, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = pollAnswer.answerId;
        }
        if ((i10 & 2) != 0) {
            pollMedia = pollAnswer.pollMedia;
        }
        if ((i10 & 4) != 0) {
            z5 = pollAnswer.didSelfVote;
        }
        if ((i10 & 8) != 0) {
            str2 = pollAnswer.votes;
        }
        if ((i10 & 16) != 0) {
            i7 = pollAnswer.votesPercentage;
        }
        if ((i10 & 32) != 0) {
            bool = pollAnswer.isSelected;
        }
        if ((i10 & 64) != 0) {
            bool2 = pollAnswer.isVictor;
        }
        if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0) {
            bool3 = pollAnswer.shouldAnimateTransition;
        }
        if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0) {
            str3 = pollAnswer.style;
        }
        Boolean bool4 = bool3;
        String str4 = str3;
        Boolean bool5 = bool;
        Boolean bool6 = bool2;
        int i11 = i7;
        boolean z6 = z5;
        return pollAnswer.copy(str, pollMedia, z6, str2, i11, bool5, bool6, bool4, str4);
    }

    public static final /* synthetic */ void write$Self$chat_release(PollAnswer self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.answerId);
        output.g(serialDesc, 1, PollMedia$$serializer.INSTANCE, self.pollMedia);
        output.p(serialDesc, 2, self.didSelfVote);
        output.q(serialDesc, 3, self.votes);
        output.l(4, self.votesPercentage, serialDesc);
        if (output.u(serialDesc, 5) || self.isSelected != null) {
            output.r(serialDesc, 5, g.f17537a, self.isSelected);
        }
        if (output.u(serialDesc, 6) || self.isVictor != null) {
            output.r(serialDesc, 6, g.f17537a, self.isVictor);
        }
        if (output.u(serialDesc, 7) || self.shouldAnimateTransition != null) {
            output.r(serialDesc, 7, g.f17537a, self.shouldAnimateTransition);
        }
        if (!output.u(serialDesc, 8) && Intrinsics.areEqual(self.style, "normal")) {
            return;
        }
        output.q(serialDesc, 8, self.style);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAnswerId() {
        return this.answerId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final PollMedia getPollMedia() {
        return this.pollMedia;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getDidSelfVote() {
        return this.didSelfVote;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getVotes() {
        return this.votes;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getVotesPercentage() {
        return this.votesPercentage;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Boolean getIsSelected() {
        return this.isSelected;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Boolean getIsVictor() {
        return this.isVictor;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Boolean getShouldAnimateTransition() {
        return this.shouldAnimateTransition;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getStyle() {
        return this.style;
    }

    @NotNull
    public final PollAnswer copy(@NotNull String answerId, @NotNull PollMedia pollMedia, boolean didSelfVote, @NotNull String votes, int votesPercentage, Boolean isSelected, Boolean isVictor, Boolean shouldAnimateTransition, @NotNull String style) {
        Intrinsics.checkNotNullParameter(answerId, "answerId");
        Intrinsics.checkNotNullParameter(pollMedia, "pollMedia");
        Intrinsics.checkNotNullParameter(votes, "votes");
        Intrinsics.checkNotNullParameter(style, "style");
        return new PollAnswer(answerId, pollMedia, didSelfVote, votes, votesPercentage, isSelected, isVictor, shouldAnimateTransition, style);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PollAnswer)) {
            return false;
        }
        PollAnswer pollAnswer = (PollAnswer) other;
        return Intrinsics.areEqual(this.answerId, pollAnswer.answerId) && Intrinsics.areEqual(this.pollMedia, pollAnswer.pollMedia) && this.didSelfVote == pollAnswer.didSelfVote && Intrinsics.areEqual(this.votes, pollAnswer.votes) && this.votesPercentage == pollAnswer.votesPercentage && Intrinsics.areEqual(this.isSelected, pollAnswer.isSelected) && Intrinsics.areEqual(this.isVictor, pollAnswer.isVictor) && Intrinsics.areEqual(this.shouldAnimateTransition, pollAnswer.shouldAnimateTransition) && Intrinsics.areEqual(this.style, pollAnswer.style);
    }

    @NotNull
    public final String getAnswerId() {
        return this.answerId;
    }

    public final boolean getDidSelfVote() {
        return this.didSelfVote;
    }

    @NotNull
    public final PollMedia getPollMedia() {
        return this.pollMedia;
    }

    public final Boolean getShouldAnimateTransition() {
        return this.shouldAnimateTransition;
    }

    @NotNull
    public final String getStyle() {
        return this.style;
    }

    @NotNull
    public final String getVotes() {
        return this.votes;
    }

    public final int getVotesPercentage() {
        return this.votesPercentage;
    }

    public final boolean hasImage() {
        return (this.pollMedia.getEmoji() == null && this.pollMedia.getAttachmentIds().isEmpty() && this.pollMedia.getStickerId() == null) ? false : true;
    }

    public int hashCode() {
        int iU = a.u(this.votesPercentage, e.d(a.g((this.pollMedia.hashCode() + (this.answerId.hashCode() * 31)) * 31, 31, this.didSelfVote), 31, this.votes), 31);
        Boolean bool = this.isSelected;
        int iHashCode = (iU + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isVictor;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.shouldAnimateTransition;
        return this.style.hashCode() + ((iHashCode2 + (bool3 != null ? bool3.hashCode() : 0)) * 31);
    }

    public final Boolean isSelected() {
        return this.isSelected;
    }

    public final Boolean isVictor() {
        return this.isVictor;
    }

    @NotNull
    public String toString() {
        String str = this.answerId;
        PollMedia pollMedia = this.pollMedia;
        boolean z5 = this.didSelfVote;
        String str2 = this.votes;
        int i7 = this.votesPercentage;
        Boolean bool = this.isSelected;
        Boolean bool2 = this.isVictor;
        Boolean bool3 = this.shouldAnimateTransition;
        String str3 = this.style;
        StringBuilder sb2 = new StringBuilder("PollAnswer(answerId=");
        sb2.append(str);
        sb2.append(", pollMedia=");
        sb2.append(pollMedia);
        sb2.append(", didSelfVote=");
        sb2.append(z5);
        sb2.append(", votes=");
        sb2.append(str2);
        sb2.append(", votesPercentage=");
        sb2.append(i7);
        sb2.append(", isSelected=");
        sb2.append(bool);
        sb2.append(", isVictor=");
        sb2.append(bool2);
        sb2.append(", shouldAnimateTransition=");
        sb2.append(bool3);
        sb2.append(", style=");
        return a.k(sb2, str3, ")");
    }

    public PollAnswer(@NotNull String answerId, @NotNull PollMedia pollMedia, boolean z5, @NotNull String votes, int i7, Boolean bool, Boolean bool2, Boolean bool3, @NotNull String style) {
        Intrinsics.checkNotNullParameter(answerId, "answerId");
        Intrinsics.checkNotNullParameter(pollMedia, "pollMedia");
        Intrinsics.checkNotNullParameter(votes, "votes");
        Intrinsics.checkNotNullParameter(style, "style");
        this.answerId = answerId;
        this.pollMedia = pollMedia;
        this.didSelfVote = z5;
        this.votes = votes;
        this.votesPercentage = i7;
        this.isSelected = bool;
        this.isVictor = bool2;
        this.shouldAnimateTransition = bool3;
        this.style = style;
    }

    public /* synthetic */ PollAnswer(String str, PollMedia pollMedia, boolean z5, String str2, int i7, Boolean bool, Boolean bool2, Boolean bool3, String str3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, pollMedia, z5, str2, i7, (i10 & 32) != 0 ? null : bool, (i10 & 64) != 0 ? null : bool2, (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? null : bool3, (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? "normal" : str3);
    }
}

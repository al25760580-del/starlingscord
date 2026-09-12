package com.discord.chat.bridge.polls;

import a3.e;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kr.f;
import o5.a;
import or.d;
import or.e1;
import or.s1;
import org.jetbrains.annotations.NotNull;
import org.webrtc.PeerConnection;
import rn.l;
import rn.m;

/* JADX INFO: loaded from: classes.dex */
@f
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b0\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 Z2\u00020\u0001:\u0002YZB±\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0015\u001a\u00020\f\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u001c\u0010\u001dBÁ\u0001\b\u0010\u0012\u0006\u0010\u001e\u001a\u00020\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0010\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\f\u0012\b\u0010 \u001a\u0004\u0018\u00010!¢\u0006\u0004\b\u001c\u0010\"J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\t\u0010<\u001a\u00020\u0005HÆ\u0003J\u000f\u0010=\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u0010>\u001a\u00020\nHÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u0010@\u001a\u00020\u000eHÆ\u0003J\t\u0010A\u001a\u00020\u0010HÆ\u0003J\t\u0010B\u001a\u00020\u0010HÆ\u0003J\t\u0010C\u001a\u00020\u0010HÆ\u0003J\t\u0010D\u001a\u00020\u0010HÆ\u0003J\t\u0010E\u001a\u00020\u0010HÆ\u0003J\t\u0010F\u001a\u00020\fHÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\fHÆ\u0003JÅ\u0001\u0010L\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u00102\b\b\u0002\u0010\u0015\u001a\u00020\f2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u0010M\u001a\u00020\u00102\b\u0010N\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010O\u001a\u00020\u001fHÖ\u0001J\t\u0010P\u001a\u00020\fHÖ\u0001J%\u0010Q\u001a\u00020R2\u0006\u0010S\u001a\u00020\u00002\u0006\u0010T\u001a\u00020U2\u0006\u0010V\u001a\u00020WH\u0001¢\u0006\u0002\bXR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0011\u0010\u0011\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b1\u00100R\u0011\u0010\u0012\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b2\u00100R\u0011\u0010\u0013\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b3\u00100R\u0011\u0010\u0014\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u00100R\u0011\u0010\u0015\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b4\u0010,R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b5\u0010,R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\b\n\u0000\u001a\u0004\b8\u00107R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0018¢\u0006\b\n\u0000\u001a\u0004\b9\u00107R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b:\u0010,¨\u0006["}, d2 = {"Lcom/discord/chat/bridge/polls/PollData;", "", "resources", "Lcom/discord/chat/bridge/polls/PollResources;", "question", "Lcom/discord/chat/bridge/polls/PollMedia;", "answers", "", "Lcom/discord/chat/bridge/polls/PollAnswer;", "answersInteraction", "Lcom/discord/chat/bridge/polls/PollChatAnswerInteractionType;", "answerTapAccessibilityLabel", "", "layoutType", "Lcom/discord/chat/bridge/polls/PollLayoutType;", "canSelectMultipleAnswers", "", "canTapAnswers", "canShowVoteCounts", "hasVoted", "isExpired", "containerStyle", "myAvatarUrl", "secondaryAction", "Lcom/discord/chat/bridge/polls/PollAction;", "primaryAction", "tertiaryAction", "promptLabel", "<init>", "(Lcom/discord/chat/bridge/polls/PollResources;Lcom/discord/chat/bridge/polls/PollMedia;Ljava/util/List;Lcom/discord/chat/bridge/polls/PollChatAnswerInteractionType;Ljava/lang/String;Lcom/discord/chat/bridge/polls/PollLayoutType;ZZZZZLjava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/polls/PollAction;Lcom/discord/chat/bridge/polls/PollAction;Lcom/discord/chat/bridge/polls/PollAction;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/discord/chat/bridge/polls/PollResources;Lcom/discord/chat/bridge/polls/PollMedia;Ljava/util/List;Lcom/discord/chat/bridge/polls/PollChatAnswerInteractionType;Ljava/lang/String;Lcom/discord/chat/bridge/polls/PollLayoutType;ZZZZZLjava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/polls/PollAction;Lcom/discord/chat/bridge/polls/PollAction;Lcom/discord/chat/bridge/polls/PollAction;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getResources", "()Lcom/discord/chat/bridge/polls/PollResources;", "getQuestion", "()Lcom/discord/chat/bridge/polls/PollMedia;", "getAnswers", "()Ljava/util/List;", "getAnswersInteraction", "()Lcom/discord/chat/bridge/polls/PollChatAnswerInteractionType;", "getAnswerTapAccessibilityLabel", "()Ljava/lang/String;", "getLayoutType", "()Lcom/discord/chat/bridge/polls/PollLayoutType;", "getCanSelectMultipleAnswers", "()Z", "getCanTapAnswers", "getCanShowVoteCounts", "getHasVoted", "getContainerStyle", "getMyAvatarUrl", "getSecondaryAction", "()Lcom/discord/chat/bridge/polls/PollAction;", "getPrimaryAction", "getTertiaryAction", "getPromptLabel", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "copy", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$chat_release", "$serializer", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class PollData {
    private final String answerTapAccessibilityLabel;

    @NotNull
    private final List<PollAnswer> answers;

    @NotNull
    private final PollChatAnswerInteractionType answersInteraction;
    private final boolean canSelectMultipleAnswers;
    private final boolean canShowVoteCounts;
    private final boolean canTapAnswers;

    @NotNull
    private final String containerStyle;
    private final boolean hasVoted;
    private final boolean isExpired;

    @NotNull
    private final PollLayoutType layoutType;
    private final String myAvatarUrl;
    private final PollAction primaryAction;
    private final String promptLabel;

    @NotNull
    private final PollMedia question;

    @NotNull
    private final PollResources resources;
    private final PollAction secondaryAction;
    private final PollAction tertiaryAction;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy[] $childSerializers = {null, null, l.a(m.f19486e, new a(17)), null, null, null, null, null, null, null, null, null, null, null, null, null, null};

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/chat/bridge/polls/PollData$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/polls/PollData;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return PollData$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ PollData(int i7, PollResources pollResources, PollMedia pollMedia, List list, PollChatAnswerInteractionType pollChatAnswerInteractionType, String str, PollLayoutType pollLayoutType, boolean z5, boolean z6, boolean z7, boolean z10, boolean z11, String str2, String str3, PollAction pollAction, PollAction pollAction2, PollAction pollAction3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (1967 != (i7 & 1967)) {
            e1.l(i7, 1967, PollData$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.resources = pollResources;
        this.question = pollMedia;
        this.answers = list;
        this.answersInteraction = pollChatAnswerInteractionType;
        if ((i7 & 16) == 0) {
            this.answerTapAccessibilityLabel = null;
        } else {
            this.answerTapAccessibilityLabel = str;
        }
        this.layoutType = pollLayoutType;
        if ((i7 & 64) == 0) {
            this.canSelectMultipleAnswers = false;
        } else {
            this.canSelectMultipleAnswers = z5;
        }
        this.canTapAnswers = z6;
        this.canShowVoteCounts = z7;
        this.hasVoted = z10;
        this.isExpired = z11;
        this.containerStyle = (i7 & RecyclerView.ItemAnimator.FLAG_MOVED) == 0 ? "normal" : str2;
        if ((i7 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) == 0) {
            this.myAvatarUrl = null;
        } else {
            this.myAvatarUrl = str3;
        }
        if ((i7 & 8192) == 0) {
            this.secondaryAction = null;
        } else {
            this.secondaryAction = pollAction;
        }
        if ((i7 & 16384) == 0) {
            this.primaryAction = null;
        } else {
            this.primaryAction = pollAction2;
        }
        if ((32768 & i7) == 0) {
            this.tertiaryAction = null;
        } else {
            this.tertiaryAction = pollAction3;
        }
        if ((i7 & 65536) == 0) {
            this.promptLabel = null;
        } else {
            this.promptLabel = str4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new d(PollAnswer$$serializer.INSTANCE, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PollData copy$default(PollData pollData, PollResources pollResources, PollMedia pollMedia, List list, PollChatAnswerInteractionType pollChatAnswerInteractionType, String str, PollLayoutType pollLayoutType, boolean z5, boolean z6, boolean z7, boolean z10, boolean z11, String str2, String str3, PollAction pollAction, PollAction pollAction2, PollAction pollAction3, String str4, int i7, Object obj) {
        String str5;
        PollAction pollAction4;
        PollResources pollResources2 = (i7 & 1) != 0 ? pollData.resources : pollResources;
        PollMedia pollMedia2 = (i7 & 2) != 0 ? pollData.question : pollMedia;
        List list2 = (i7 & 4) != 0 ? pollData.answers : list;
        PollChatAnswerInteractionType pollChatAnswerInteractionType2 = (i7 & 8) != 0 ? pollData.answersInteraction : pollChatAnswerInteractionType;
        String str6 = (i7 & 16) != 0 ? pollData.answerTapAccessibilityLabel : str;
        PollLayoutType pollLayoutType2 = (i7 & 32) != 0 ? pollData.layoutType : pollLayoutType;
        boolean z12 = (i7 & 64) != 0 ? pollData.canSelectMultipleAnswers : z5;
        boolean z13 = (i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? pollData.canTapAnswers : z6;
        boolean z14 = (i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? pollData.canShowVoteCounts : z7;
        boolean z15 = (i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? pollData.hasVoted : z10;
        boolean z16 = (i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? pollData.isExpired : z11;
        String str7 = (i7 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? pollData.containerStyle : str2;
        String str8 = (i7 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? pollData.myAvatarUrl : str3;
        PollAction pollAction5 = (i7 & 8192) != 0 ? pollData.secondaryAction : pollAction;
        PollResources pollResources3 = pollResources2;
        PollAction pollAction6 = (i7 & 16384) != 0 ? pollData.primaryAction : pollAction2;
        PollAction pollAction7 = (i7 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? pollData.tertiaryAction : pollAction3;
        if ((i7 & 65536) != 0) {
            pollAction4 = pollAction7;
            str5 = pollData.promptLabel;
        } else {
            str5 = str4;
            pollAction4 = pollAction7;
        }
        return pollData.copy(pollResources3, pollMedia2, list2, pollChatAnswerInteractionType2, str6, pollLayoutType2, z12, z13, z14, z15, z16, str7, str8, pollAction5, pollAction6, pollAction4, str5);
    }

    public static final /* synthetic */ void write$Self$chat_release(PollData self, CompositeEncoder output, SerialDescriptor serialDesc) {
        Lazy[] lazyArr = $childSerializers;
        output.g(serialDesc, 0, PollResources$$serializer.INSTANCE, self.resources);
        output.g(serialDesc, 1, PollMedia$$serializer.INSTANCE, self.question);
        output.g(serialDesc, 2, (KSerializer) lazyArr[2].getValue(), self.answers);
        output.g(serialDesc, 3, PollChatAnswerInteractionType.Serializer.INSTANCE, self.answersInteraction);
        if (output.u(serialDesc, 4) || self.answerTapAccessibilityLabel != null) {
            output.r(serialDesc, 4, s1.f17602a, self.answerTapAccessibilityLabel);
        }
        output.g(serialDesc, 5, PollLayoutType.Serializer.INSTANCE, self.layoutType);
        if (output.u(serialDesc, 6) || self.canSelectMultipleAnswers) {
            output.p(serialDesc, 6, self.canSelectMultipleAnswers);
        }
        output.p(serialDesc, 7, self.canTapAnswers);
        output.p(serialDesc, 8, self.canShowVoteCounts);
        output.p(serialDesc, 9, self.hasVoted);
        output.p(serialDesc, 10, self.isExpired);
        if (output.u(serialDesc, 11) || !Intrinsics.areEqual(self.containerStyle, "normal")) {
            output.q(serialDesc, 11, self.containerStyle);
        }
        if (output.u(serialDesc, 12) || self.myAvatarUrl != null) {
            output.r(serialDesc, 12, s1.f17602a, self.myAvatarUrl);
        }
        if (output.u(serialDesc, 13) || self.secondaryAction != null) {
            output.r(serialDesc, 13, PollAction$$serializer.INSTANCE, self.secondaryAction);
        }
        if (output.u(serialDesc, 14) || self.primaryAction != null) {
            output.r(serialDesc, 14, PollAction$$serializer.INSTANCE, self.primaryAction);
        }
        if (output.u(serialDesc, 15) || self.tertiaryAction != null) {
            output.r(serialDesc, 15, PollAction$$serializer.INSTANCE, self.tertiaryAction);
        }
        if (!output.u(serialDesc, 16) && self.promptLabel == null) {
            return;
        }
        output.r(serialDesc, 16, s1.f17602a, self.promptLabel);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final PollResources getResources() {
        return this.resources;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final boolean getHasVoted() {
        return this.hasVoted;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final boolean getIsExpired() {
        return this.isExpired;
    }

    @NotNull
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getContainerStyle() {
        return this.containerStyle;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getMyAvatarUrl() {
        return this.myAvatarUrl;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final PollAction getSecondaryAction() {
        return this.secondaryAction;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final PollAction getPrimaryAction() {
        return this.primaryAction;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final PollAction getTertiaryAction() {
        return this.tertiaryAction;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getPromptLabel() {
        return this.promptLabel;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final PollMedia getQuestion() {
        return this.question;
    }

    @NotNull
    public final List<PollAnswer> component3() {
        return this.answers;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final PollChatAnswerInteractionType getAnswersInteraction() {
        return this.answersInteraction;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getAnswerTapAccessibilityLabel() {
        return this.answerTapAccessibilityLabel;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final PollLayoutType getLayoutType() {
        return this.layoutType;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getCanSelectMultipleAnswers() {
        return this.canSelectMultipleAnswers;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getCanTapAnswers() {
        return this.canTapAnswers;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getCanShowVoteCounts() {
        return this.canShowVoteCounts;
    }

    @NotNull
    public final PollData copy(@NotNull PollResources resources, @NotNull PollMedia question, @NotNull List<PollAnswer> answers, @NotNull PollChatAnswerInteractionType answersInteraction, String answerTapAccessibilityLabel, @NotNull PollLayoutType layoutType, boolean canSelectMultipleAnswers, boolean canTapAnswers, boolean canShowVoteCounts, boolean hasVoted, boolean isExpired, @NotNull String containerStyle, String myAvatarUrl, PollAction secondaryAction, PollAction primaryAction, PollAction tertiaryAction, String promptLabel) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(question, "question");
        Intrinsics.checkNotNullParameter(answers, "answers");
        Intrinsics.checkNotNullParameter(answersInteraction, "answersInteraction");
        Intrinsics.checkNotNullParameter(layoutType, "layoutType");
        Intrinsics.checkNotNullParameter(containerStyle, "containerStyle");
        return new PollData(resources, question, answers, answersInteraction, answerTapAccessibilityLabel, layoutType, canSelectMultipleAnswers, canTapAnswers, canShowVoteCounts, hasVoted, isExpired, containerStyle, myAvatarUrl, secondaryAction, primaryAction, tertiaryAction, promptLabel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PollData)) {
            return false;
        }
        PollData pollData = (PollData) other;
        return Intrinsics.areEqual(this.resources, pollData.resources) && Intrinsics.areEqual(this.question, pollData.question) && Intrinsics.areEqual(this.answers, pollData.answers) && this.answersInteraction == pollData.answersInteraction && Intrinsics.areEqual(this.answerTapAccessibilityLabel, pollData.answerTapAccessibilityLabel) && this.layoutType == pollData.layoutType && this.canSelectMultipleAnswers == pollData.canSelectMultipleAnswers && this.canTapAnswers == pollData.canTapAnswers && this.canShowVoteCounts == pollData.canShowVoteCounts && this.hasVoted == pollData.hasVoted && this.isExpired == pollData.isExpired && Intrinsics.areEqual(this.containerStyle, pollData.containerStyle) && Intrinsics.areEqual(this.myAvatarUrl, pollData.myAvatarUrl) && Intrinsics.areEqual(this.secondaryAction, pollData.secondaryAction) && Intrinsics.areEqual(this.primaryAction, pollData.primaryAction) && Intrinsics.areEqual(this.tertiaryAction, pollData.tertiaryAction) && Intrinsics.areEqual(this.promptLabel, pollData.promptLabel);
    }

    public final String getAnswerTapAccessibilityLabel() {
        return this.answerTapAccessibilityLabel;
    }

    @NotNull
    public final List<PollAnswer> getAnswers() {
        return this.answers;
    }

    @NotNull
    public final PollChatAnswerInteractionType getAnswersInteraction() {
        return this.answersInteraction;
    }

    public final boolean getCanSelectMultipleAnswers() {
        return this.canSelectMultipleAnswers;
    }

    public final boolean getCanShowVoteCounts() {
        return this.canShowVoteCounts;
    }

    public final boolean getCanTapAnswers() {
        return this.canTapAnswers;
    }

    @NotNull
    public final String getContainerStyle() {
        return this.containerStyle;
    }

    public final boolean getHasVoted() {
        return this.hasVoted;
    }

    @NotNull
    public final PollLayoutType getLayoutType() {
        return this.layoutType;
    }

    public final String getMyAvatarUrl() {
        return this.myAvatarUrl;
    }

    public final PollAction getPrimaryAction() {
        return this.primaryAction;
    }

    public final String getPromptLabel() {
        return this.promptLabel;
    }

    @NotNull
    public final PollMedia getQuestion() {
        return this.question;
    }

    @NotNull
    public final PollResources getResources() {
        return this.resources;
    }

    public final PollAction getSecondaryAction() {
        return this.secondaryAction;
    }

    public final PollAction getTertiaryAction() {
        return this.tertiaryAction;
    }

    public int hashCode() {
        int iHashCode = (this.answersInteraction.hashCode() + e.f(this.answers, (this.question.hashCode() + (this.resources.hashCode() * 31)) * 31, 31)) * 31;
        String str = this.answerTapAccessibilityLabel;
        int iD = e.d(com.discord.chat.presentation.list.a.g(com.discord.chat.presentation.list.a.g(com.discord.chat.presentation.list.a.g(com.discord.chat.presentation.list.a.g(com.discord.chat.presentation.list.a.g((this.layoutType.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.canSelectMultipleAnswers), 31, this.canTapAnswers), 31, this.canShowVoteCounts), 31, this.hasVoted), 31, this.isExpired), 31, this.containerStyle);
        String str2 = this.myAvatarUrl;
        int iHashCode2 = (iD + (str2 == null ? 0 : str2.hashCode())) * 31;
        PollAction pollAction = this.secondaryAction;
        int iHashCode3 = (iHashCode2 + (pollAction == null ? 0 : pollAction.hashCode())) * 31;
        PollAction pollAction2 = this.primaryAction;
        int iHashCode4 = (iHashCode3 + (pollAction2 == null ? 0 : pollAction2.hashCode())) * 31;
        PollAction pollAction3 = this.tertiaryAction;
        int iHashCode5 = (iHashCode4 + (pollAction3 == null ? 0 : pollAction3.hashCode())) * 31;
        String str3 = this.promptLabel;
        return iHashCode5 + (str3 != null ? str3.hashCode() : 0);
    }

    public final boolean isExpired() {
        return this.isExpired;
    }

    @NotNull
    public String toString() {
        PollResources pollResources = this.resources;
        PollMedia pollMedia = this.question;
        List<PollAnswer> list = this.answers;
        PollChatAnswerInteractionType pollChatAnswerInteractionType = this.answersInteraction;
        String str = this.answerTapAccessibilityLabel;
        PollLayoutType pollLayoutType = this.layoutType;
        boolean z5 = this.canSelectMultipleAnswers;
        boolean z6 = this.canTapAnswers;
        boolean z7 = this.canShowVoteCounts;
        boolean z10 = this.hasVoted;
        boolean z11 = this.isExpired;
        String str2 = this.containerStyle;
        String str3 = this.myAvatarUrl;
        PollAction pollAction = this.secondaryAction;
        PollAction pollAction2 = this.primaryAction;
        PollAction pollAction3 = this.tertiaryAction;
        String str4 = this.promptLabel;
        StringBuilder sb2 = new StringBuilder("PollData(resources=");
        sb2.append(pollResources);
        sb2.append(", question=");
        sb2.append(pollMedia);
        sb2.append(", answers=");
        sb2.append(list);
        sb2.append(", answersInteraction=");
        sb2.append(pollChatAnswerInteractionType);
        sb2.append(", answerTapAccessibilityLabel=");
        sb2.append(str);
        sb2.append(", layoutType=");
        sb2.append(pollLayoutType);
        sb2.append(", canSelectMultipleAnswers=");
        e.B(sb2, z5, ", canTapAnswers=", z6, ", canShowVoteCounts=");
        e.B(sb2, z7, ", hasVoted=", z10, ", isExpired=");
        sb2.append(z11);
        sb2.append(", containerStyle=");
        sb2.append(str2);
        sb2.append(", myAvatarUrl=");
        sb2.append(str3);
        sb2.append(", secondaryAction=");
        sb2.append(pollAction);
        sb2.append(", primaryAction=");
        sb2.append(pollAction2);
        sb2.append(", tertiaryAction=");
        sb2.append(pollAction3);
        sb2.append(", promptLabel=");
        return com.discord.chat.presentation.list.a.k(sb2, str4, ")");
    }

    public PollData(@NotNull PollResources resources, @NotNull PollMedia question, @NotNull List<PollAnswer> answers, @NotNull PollChatAnswerInteractionType answersInteraction, String str, @NotNull PollLayoutType layoutType, boolean z5, boolean z6, boolean z7, boolean z10, boolean z11, @NotNull String containerStyle, String str2, PollAction pollAction, PollAction pollAction2, PollAction pollAction3, String str3) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(question, "question");
        Intrinsics.checkNotNullParameter(answers, "answers");
        Intrinsics.checkNotNullParameter(answersInteraction, "answersInteraction");
        Intrinsics.checkNotNullParameter(layoutType, "layoutType");
        Intrinsics.checkNotNullParameter(containerStyle, "containerStyle");
        this.resources = resources;
        this.question = question;
        this.answers = answers;
        this.answersInteraction = answersInteraction;
        this.answerTapAccessibilityLabel = str;
        this.layoutType = layoutType;
        this.canSelectMultipleAnswers = z5;
        this.canTapAnswers = z6;
        this.canShowVoteCounts = z7;
        this.hasVoted = z10;
        this.isExpired = z11;
        this.containerStyle = containerStyle;
        this.myAvatarUrl = str2;
        this.secondaryAction = pollAction;
        this.primaryAction = pollAction2;
        this.tertiaryAction = pollAction3;
        this.promptLabel = str3;
    }

    public /* synthetic */ PollData(PollResources pollResources, PollMedia pollMedia, List list, PollChatAnswerInteractionType pollChatAnswerInteractionType, String str, PollLayoutType pollLayoutType, boolean z5, boolean z6, boolean z7, boolean z10, boolean z11, String str2, String str3, PollAction pollAction, PollAction pollAction2, PollAction pollAction3, String str4, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(pollResources, pollMedia, list, pollChatAnswerInteractionType, (i7 & 16) != 0 ? null : str, pollLayoutType, (i7 & 64) != 0 ? false : z5, z6, z7, z10, z11, (i7 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? "normal" : str2, (i7 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : str3, (i7 & 8192) != 0 ? null : pollAction, (i7 & 16384) != 0 ? null : pollAction2, (32768 & i7) != 0 ? null : pollAction3, (i7 & 65536) != 0 ? null : str4);
    }
}

package com.discord.chat.bridge.row;

import androidx.recyclerview.widget.RecyclerView;
import com.discord.chat.bridge.BackgroundHighlight;
import com.discord.chat.bridge.BackgroundHighlight$$serializer;
import com.discord.chat.bridge.ChangeType;
import com.discord.chat.bridge.MessageBase;
import com.discord.chat.bridge.SwipeActionsType;
import com.discord.chat.bridge.reaction.ReactionsTheme;
import com.discord.chat.bridge.reaction.ReactionsTheme$$serializer;
import com.discord.chat.bridge.truncation.Truncation;
import com.discord.chat.bridge.truncation.Truncation$$serializer;
import com.discord.chat.presentation.root.MessageContextType;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
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
import or.e1;
import or.g;
import or.m0;
import or.s1;
import org.jetbrains.annotations.NotNull;
import rn.l;
import rn.m;

/* JADX INFO: loaded from: classes.dex */
@f
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b1\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \\2\u00020\u0001:\u0002[\\B\u009f\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u001a\u0010\u001bB£\u0001\b\u0010\u0012\u0006\u0010\u001c\u001a\u00020\u0003\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b\u001a\u0010\u001fJ\t\u0010>\u001a\u00020\u0003HÆ\u0003J\t\u0010?\u001a\u00020\u0005HÆ\u0003J\u0010\u0010@\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010%J\t\u0010A\u001a\u00020\tHÆ\u0003J\u0010\u0010B\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010%J\u000b\u0010C\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\t\u0010E\u001a\u00020\u0007HÆ\u0003J\u0010\u0010F\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u00103J\u000b\u0010G\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\t\u0010I\u001a\u00020\u0016HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\fHÆ\u0003J¬\u0001\u0010L\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010MJ\u0013\u0010N\u001a\u00020\u00072\b\u0010O\u001a\u0004\u0018\u00010PHÖ\u0003J\t\u0010Q\u001a\u00020\u0003HÖ\u0001J\t\u0010R\u001a\u00020\fHÖ\u0001J%\u0010S\u001a\u00020T2\u0006\u0010U\u001a\u00020\u00002\u0006\u0010V\u001a\u00020W2\u0006\u0010X\u001a\u00020YH\u0001¢\u0006\u0002\bZR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010&\u001a\u0004\b$\u0010%R\u001c\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010&\u001a\u0004\b+\u0010%R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0011\u0010\u000f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u00104\u001a\u0004\b2\u00103R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b=\u0010-¨\u0006]"}, d2 = {"Lcom/discord/chat/bridge/row/MessageRow;", "Lcom/discord/chat/bridge/row/Row;", "index", "", "changeType", "Lcom/discord/chat/bridge/ChangeType;", "jumped", "", "message", "Lcom/discord/chat/bridge/MessageBase;", "canAddNewReactions", "addNewReactionAccessibilityLabel", "", "reactionsTheme", "Lcom/discord/chat/bridge/reaction/ReactionsTheme;", "renderContentOnly", "reactTag", "truncation", "Lcom/discord/chat/bridge/truncation/Truncation;", "backgroundHighlight", "Lcom/discord/chat/bridge/BackgroundHighlight;", "swipeActions", "Lcom/discord/chat/bridge/SwipeActionsType;", "contextType", "Lcom/discord/chat/presentation/root/MessageContextType;", "forcedTheme", "<init>", "(ILcom/discord/chat/bridge/ChangeType;Ljava/lang/Boolean;Lcom/discord/chat/bridge/MessageBase;Ljava/lang/Boolean;Ljava/lang/String;Lcom/discord/chat/bridge/reaction/ReactionsTheme;ZLjava/lang/Integer;Lcom/discord/chat/bridge/truncation/Truncation;Lcom/discord/chat/bridge/BackgroundHighlight;Lcom/discord/chat/bridge/SwipeActionsType;Lcom/discord/chat/presentation/root/MessageContextType;Ljava/lang/String;)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IILcom/discord/chat/bridge/ChangeType;Ljava/lang/Boolean;Lcom/discord/chat/bridge/MessageBase;Ljava/lang/Boolean;Ljava/lang/String;Lcom/discord/chat/bridge/reaction/ReactionsTheme;ZLjava/lang/Integer;Lcom/discord/chat/bridge/truncation/Truncation;Lcom/discord/chat/bridge/BackgroundHighlight;Lcom/discord/chat/bridge/SwipeActionsType;Lcom/discord/chat/presentation/root/MessageContextType;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getIndex", "()I", "getChangeType", "()Lcom/discord/chat/bridge/ChangeType;", "getJumped", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getMessage$annotations", "()V", "getMessage", "()Lcom/discord/chat/bridge/MessageBase;", "getCanAddNewReactions", "getAddNewReactionAccessibilityLabel", "()Ljava/lang/String;", "getReactionsTheme", "()Lcom/discord/chat/bridge/reaction/ReactionsTheme;", "getRenderContentOnly", "()Z", "getReactTag", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTruncation", "()Lcom/discord/chat/bridge/truncation/Truncation;", "getBackgroundHighlight", "()Lcom/discord/chat/bridge/BackgroundHighlight;", "getSwipeActions", "()Lcom/discord/chat/bridge/SwipeActionsType;", "getContextType", "()Lcom/discord/chat/presentation/root/MessageContextType;", "getForcedTheme", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "(ILcom/discord/chat/bridge/ChangeType;Ljava/lang/Boolean;Lcom/discord/chat/bridge/MessageBase;Ljava/lang/Boolean;Ljava/lang/String;Lcom/discord/chat/bridge/reaction/ReactionsTheme;ZLjava/lang/Integer;Lcom/discord/chat/bridge/truncation/Truncation;Lcom/discord/chat/bridge/BackgroundHighlight;Lcom/discord/chat/bridge/SwipeActionsType;Lcom/discord/chat/presentation/root/MessageContextType;Ljava/lang/String;)Lcom/discord/chat/bridge/row/MessageRow;", "equals", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$chat_release", "$serializer", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class MessageRow extends Row {
    private final String addNewReactionAccessibilityLabel;
    private final BackgroundHighlight backgroundHighlight;
    private final Boolean canAddNewReactions;

    @NotNull
    private final ChangeType changeType;
    private final MessageContextType contextType;
    private final String forcedTheme;
    private final int index;
    private final Boolean jumped;

    @NotNull
    private final MessageBase message;
    private final Integer reactTag;
    private final ReactionsTheme reactionsTheme;
    private final boolean renderContentOnly;

    @NotNull
    private final SwipeActionsType swipeActions;
    private final Truncation truncation;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, l.a(m.f19486e, new a(24)), null};

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/chat/bridge/row/MessageRow$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/row/MessageRow;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return MessageRow$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ MessageRow(int i7, int i10, ChangeType changeType, Boolean bool, MessageBase messageBase, Boolean bool2, String str, ReactionsTheme reactionsTheme, boolean z5, Integer num, Truncation truncation, BackgroundHighlight backgroundHighlight, SwipeActionsType swipeActionsType, MessageContextType messageContextType, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        DefaultConstructorMarker defaultConstructorMarker = null;
        if (11 != (i7 & 11)) {
            e1.l(i7, 11, MessageRow$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        super(defaultConstructorMarker);
        this.index = i10;
        this.changeType = changeType;
        if ((i7 & 4) == 0) {
            this.jumped = null;
        } else {
            this.jumped = bool;
        }
        this.message = messageBase;
        if ((i7 & 16) == 0) {
            this.canAddNewReactions = null;
        } else {
            this.canAddNewReactions = bool2;
        }
        if ((i7 & 32) == 0) {
            this.addNewReactionAccessibilityLabel = null;
        } else {
            this.addNewReactionAccessibilityLabel = str;
        }
        if ((i7 & 64) == 0) {
            this.reactionsTheme = null;
        } else {
            this.reactionsTheme = reactionsTheme;
        }
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 0) {
            this.renderContentOnly = false;
        } else {
            this.renderContentOnly = z5;
        }
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) == 0) {
            this.reactTag = null;
        } else {
            this.reactTag = num;
        }
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) == 0) {
            this.truncation = null;
        } else {
            this.truncation = truncation;
        }
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) == 0) {
            this.backgroundHighlight = null;
        } else {
            this.backgroundHighlight = backgroundHighlight;
        }
        this.swipeActions = (i7 & RecyclerView.ItemAnimator.FLAG_MOVED) == 0 ? SwipeActionsType.NONE : swipeActionsType;
        if ((i7 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) == 0) {
            this.contextType = null;
        } else {
            this.contextType = messageContextType;
        }
        if ((i7 & 8192) == 0) {
            this.forcedTheme = null;
        } else {
            this.forcedTheme = str2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return MessageContextType.INSTANCE.serializer();
    }

    @f(with = MessageSerializer.class)
    public static /* synthetic */ void getMessage$annotations() {
    }

    public static final /* synthetic */ void write$Self$chat_release(MessageRow self, CompositeEncoder output, SerialDescriptor serialDesc) {
        Lazy[] lazyArr = $childSerializers;
        output.l(0, self.getIndex(), serialDesc);
        output.g(serialDesc, 1, ChangeType.Serializer.INSTANCE, self.getChangeType());
        if (output.u(serialDesc, 2) || self.jumped != null) {
            output.r(serialDesc, 2, g.f17537a, self.jumped);
        }
        output.g(serialDesc, 3, MessageSerializer.INSTANCE, self.message);
        if (output.u(serialDesc, 4) || self.canAddNewReactions != null) {
            output.r(serialDesc, 4, g.f17537a, self.canAddNewReactions);
        }
        if (output.u(serialDesc, 5) || self.addNewReactionAccessibilityLabel != null) {
            output.r(serialDesc, 5, s1.f17602a, self.addNewReactionAccessibilityLabel);
        }
        if (output.u(serialDesc, 6) || self.reactionsTheme != null) {
            output.r(serialDesc, 6, ReactionsTheme$$serializer.INSTANCE, self.reactionsTheme);
        }
        if (output.u(serialDesc, 7) || self.renderContentOnly) {
            output.p(serialDesc, 7, self.renderContentOnly);
        }
        if (output.u(serialDesc, 8) || self.reactTag != null) {
            output.r(serialDesc, 8, m0.f17573a, self.reactTag);
        }
        if (output.u(serialDesc, 9) || self.truncation != null) {
            output.r(serialDesc, 9, Truncation$$serializer.INSTANCE, self.truncation);
        }
        if (output.u(serialDesc, 10) || self.backgroundHighlight != null) {
            output.r(serialDesc, 10, BackgroundHighlight$$serializer.INSTANCE, self.backgroundHighlight);
        }
        if (output.u(serialDesc, 11) || self.swipeActions != SwipeActionsType.NONE) {
            output.g(serialDesc, 11, SwipeActionsType.Serializer.INSTANCE, self.swipeActions);
        }
        if (output.u(serialDesc, 12) || self.contextType != null) {
            output.r(serialDesc, 12, (KSerializer) lazyArr[12].getValue(), self.contextType);
        }
        if (!output.u(serialDesc, 13) && self.forcedTheme == null) {
            return;
        }
        output.r(serialDesc, 13, s1.f17602a, self.forcedTheme);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Truncation getTruncation() {
        return this.truncation;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final BackgroundHighlight getBackgroundHighlight() {
        return this.backgroundHighlight;
    }

    @NotNull
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final SwipeActionsType getSwipeActions() {
        return this.swipeActions;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final MessageContextType getContextType() {
        return this.contextType;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getForcedTheme() {
        return this.forcedTheme;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ChangeType getChangeType() {
        return this.changeType;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getJumped() {
        return this.jumped;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final MessageBase getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getCanAddNewReactions() {
        return this.canAddNewReactions;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getAddNewReactionAccessibilityLabel() {
        return this.addNewReactionAccessibilityLabel;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final ReactionsTheme getReactionsTheme() {
        return this.reactionsTheme;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getRenderContentOnly() {
        return this.renderContentOnly;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Integer getReactTag() {
        return this.reactTag;
    }

    @NotNull
    public final MessageRow copy(int index, @NotNull ChangeType changeType, Boolean jumped, @NotNull MessageBase message, Boolean canAddNewReactions, String addNewReactionAccessibilityLabel, ReactionsTheme reactionsTheme, boolean renderContentOnly, Integer reactTag, Truncation truncation, BackgroundHighlight backgroundHighlight, @NotNull SwipeActionsType swipeActions, MessageContextType contextType, String forcedTheme) {
        Intrinsics.checkNotNullParameter(changeType, "changeType");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(swipeActions, "swipeActions");
        return new MessageRow(index, changeType, jumped, message, canAddNewReactions, addNewReactionAccessibilityLabel, reactionsTheme, renderContentOnly, reactTag, truncation, backgroundHighlight, swipeActions, contextType, forcedTheme);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessageRow)) {
            return false;
        }
        MessageRow messageRow = (MessageRow) other;
        return this.index == messageRow.index && this.changeType == messageRow.changeType && Intrinsics.areEqual(this.jumped, messageRow.jumped) && Intrinsics.areEqual(this.message, messageRow.message) && Intrinsics.areEqual(this.canAddNewReactions, messageRow.canAddNewReactions) && Intrinsics.areEqual(this.addNewReactionAccessibilityLabel, messageRow.addNewReactionAccessibilityLabel) && Intrinsics.areEqual(this.reactionsTheme, messageRow.reactionsTheme) && this.renderContentOnly == messageRow.renderContentOnly && Intrinsics.areEqual(this.reactTag, messageRow.reactTag) && Intrinsics.areEqual(this.truncation, messageRow.truncation) && Intrinsics.areEqual(this.backgroundHighlight, messageRow.backgroundHighlight) && this.swipeActions == messageRow.swipeActions && this.contextType == messageRow.contextType && Intrinsics.areEqual(this.forcedTheme, messageRow.forcedTheme);
    }

    public final String getAddNewReactionAccessibilityLabel() {
        return this.addNewReactionAccessibilityLabel;
    }

    public final BackgroundHighlight getBackgroundHighlight() {
        return this.backgroundHighlight;
    }

    public final Boolean getCanAddNewReactions() {
        return this.canAddNewReactions;
    }

    @Override // com.discord.chat.bridge.row.Row
    @NotNull
    public ChangeType getChangeType() {
        return this.changeType;
    }

    public final MessageContextType getContextType() {
        return this.contextType;
    }

    public final String getForcedTheme() {
        return this.forcedTheme;
    }

    @Override // com.discord.chat.bridge.row.Row
    public int getIndex() {
        return this.index;
    }

    public final Boolean getJumped() {
        return this.jumped;
    }

    @NotNull
    public final MessageBase getMessage() {
        return this.message;
    }

    public final Integer getReactTag() {
        return this.reactTag;
    }

    public final ReactionsTheme getReactionsTheme() {
        return this.reactionsTheme;
    }

    public final boolean getRenderContentOnly() {
        return this.renderContentOnly;
    }

    @NotNull
    public final SwipeActionsType getSwipeActions() {
        return this.swipeActions;
    }

    public final Truncation getTruncation() {
        return this.truncation;
    }

    public int hashCode() {
        int iHashCode = (this.changeType.hashCode() + (Integer.hashCode(this.index) * 31)) * 31;
        Boolean bool = this.jumped;
        int iHashCode2 = (this.message.hashCode() + ((iHashCode + (bool == null ? 0 : bool.hashCode())) * 31)) * 31;
        Boolean bool2 = this.canAddNewReactions;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str = this.addNewReactionAccessibilityLabel;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        ReactionsTheme reactionsTheme = this.reactionsTheme;
        int iG = com.discord.chat.presentation.list.a.g((iHashCode4 + (reactionsTheme == null ? 0 : reactionsTheme.hashCode())) * 31, 31, this.renderContentOnly);
        Integer num = this.reactTag;
        int iHashCode5 = (iG + (num == null ? 0 : num.hashCode())) * 31;
        Truncation truncation = this.truncation;
        int iHashCode6 = (iHashCode5 + (truncation == null ? 0 : truncation.hashCode())) * 31;
        BackgroundHighlight backgroundHighlight = this.backgroundHighlight;
        int iHashCode7 = (this.swipeActions.hashCode() + ((iHashCode6 + (backgroundHighlight == null ? 0 : backgroundHighlight.hashCode())) * 31)) * 31;
        MessageContextType messageContextType = this.contextType;
        int iHashCode8 = (iHashCode7 + (messageContextType == null ? 0 : messageContextType.hashCode())) * 31;
        String str2 = this.forcedTheme;
        return iHashCode8 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "MessageRow(index=" + this.index + ", changeType=" + this.changeType + ", jumped=" + this.jumped + ", message=" + this.message + ", canAddNewReactions=" + this.canAddNewReactions + ", addNewReactionAccessibilityLabel=" + this.addNewReactionAccessibilityLabel + ", reactionsTheme=" + this.reactionsTheme + ", renderContentOnly=" + this.renderContentOnly + ", reactTag=" + this.reactTag + ", truncation=" + this.truncation + ", backgroundHighlight=" + this.backgroundHighlight + ", swipeActions=" + this.swipeActions + ", contextType=" + this.contextType + ", forcedTheme=" + this.forcedTheme + ")";
    }

    public /* synthetic */ MessageRow(int i7, ChangeType changeType, Boolean bool, MessageBase messageBase, Boolean bool2, String str, ReactionsTheme reactionsTheme, boolean z5, Integer num, Truncation truncation, BackgroundHighlight backgroundHighlight, SwipeActionsType swipeActionsType, MessageContextType messageContextType, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i7, changeType, (i10 & 4) != 0 ? null : bool, messageBase, (i10 & 16) != 0 ? null : bool2, (i10 & 32) != 0 ? null : str, (i10 & 64) != 0 ? null : reactionsTheme, (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? false : z5, (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? null : num, (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? null : truncation, (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? null : backgroundHighlight, (i10 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? SwipeActionsType.NONE : swipeActionsType, (i10 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : messageContextType, (i10 & 8192) != 0 ? null : str2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageRow(int i7, @NotNull ChangeType changeType, Boolean bool, @NotNull MessageBase message, Boolean bool2, String str, ReactionsTheme reactionsTheme, boolean z5, Integer num, Truncation truncation, BackgroundHighlight backgroundHighlight, @NotNull SwipeActionsType swipeActions, MessageContextType messageContextType, String str2) {
        super(null);
        Intrinsics.checkNotNullParameter(changeType, "changeType");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(swipeActions, "swipeActions");
        this.index = i7;
        this.changeType = changeType;
        this.jumped = bool;
        this.message = message;
        this.canAddNewReactions = bool2;
        this.addNewReactionAccessibilityLabel = str;
        this.reactionsTheme = reactionsTheme;
        this.renderContentOnly = z5;
        this.reactTag = num;
        this.truncation = truncation;
        this.backgroundHighlight = backgroundHighlight;
        this.swipeActions = swipeActions;
        this.contextType = messageContextType;
        this.forcedTheme = str2;
    }
}

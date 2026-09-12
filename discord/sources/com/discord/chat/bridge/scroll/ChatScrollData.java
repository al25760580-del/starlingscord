package com.discord.chat.bridge.scroll;

import a3.e;
import com.discord.chat.presentation.list.a;
import com.facebook.react.uimanager.ViewProps;
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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@f
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u0002./B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\u000bBG\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u000fJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0018JB\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010 J\u0013\u0010!\u001a\u00020\u00072\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\u0005HÖ\u0001J\t\u0010$\u001a\u00020%HÖ\u0001J%\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u00002\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0001¢\u0006\u0002\b-R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018¨\u00060"}, d2 = {"Lcom/discord/chat/bridge/scroll/ChatScrollData;", "", "type", "Lcom/discord/chat/bridge/scroll/ChatScrollType;", "index", "", "animate", "", "highlight", ViewProps.POSITION, "<init>", "(Lcom/discord/chat/bridge/scroll/ChatScrollType;IZZLjava/lang/Integer;)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/discord/chat/bridge/scroll/ChatScrollType;IZZLjava/lang/Integer;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getType", "()Lcom/discord/chat/bridge/scroll/ChatScrollType;", "getIndex", "()I", "getAnimate", "()Z", "getHighlight", "getPosition", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "copy", "(Lcom/discord/chat/bridge/scroll/ChatScrollType;IZZLjava/lang/Integer;)Lcom/discord/chat/bridge/scroll/ChatScrollData;", "equals", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$chat_release", "$serializer", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ChatScrollData {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final boolean animate;
    private final boolean highlight;
    private final int index;
    private final Integer position;

    @NotNull
    private final ChatScrollType type;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/chat/bridge/scroll/ChatScrollData$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/scroll/ChatScrollData;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return ChatScrollData$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ChatScrollData(int i7, ChatScrollType chatScrollType, int i10, boolean z5, boolean z6, Integer num, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i7 & 3)) {
            e1.l(i7, 3, ChatScrollData$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.type = chatScrollType;
        this.index = i10;
        if ((i7 & 4) == 0) {
            this.animate = false;
        } else {
            this.animate = z5;
        }
        if ((i7 & 8) == 0) {
            this.highlight = false;
        } else {
            this.highlight = z6;
        }
        if ((i7 & 16) == 0) {
            this.position = null;
        } else {
            this.position = num;
        }
    }

    public static /* synthetic */ ChatScrollData copy$default(ChatScrollData chatScrollData, ChatScrollType chatScrollType, int i7, boolean z5, boolean z6, Integer num, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            chatScrollType = chatScrollData.type;
        }
        if ((i10 & 2) != 0) {
            i7 = chatScrollData.index;
        }
        if ((i10 & 4) != 0) {
            z5 = chatScrollData.animate;
        }
        if ((i10 & 8) != 0) {
            z6 = chatScrollData.highlight;
        }
        if ((i10 & 16) != 0) {
            num = chatScrollData.position;
        }
        Integer num2 = num;
        boolean z7 = z5;
        return chatScrollData.copy(chatScrollType, i7, z7, z6, num2);
    }

    public static final /* synthetic */ void write$Self$chat_release(ChatScrollData self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.g(serialDesc, 0, ChatScrollType.Serializer.INSTANCE, self.type);
        output.l(1, self.index, serialDesc);
        if (output.u(serialDesc, 2) || self.animate) {
            output.p(serialDesc, 2, self.animate);
        }
        if (output.u(serialDesc, 3) || self.highlight) {
            output.p(serialDesc, 3, self.highlight);
        }
        if (!output.u(serialDesc, 4) && self.position == null) {
            return;
        }
        output.r(serialDesc, 4, m0.f17573a, self.position);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ChatScrollType getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getAnimate() {
        return this.animate;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getHighlight() {
        return this.highlight;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getPosition() {
        return this.position;
    }

    @NotNull
    public final ChatScrollData copy(@NotNull ChatScrollType type, int index, boolean animate, boolean highlight, Integer position) {
        Intrinsics.checkNotNullParameter(type, "type");
        return new ChatScrollData(type, index, animate, highlight, position);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatScrollData)) {
            return false;
        }
        ChatScrollData chatScrollData = (ChatScrollData) other;
        return this.type == chatScrollData.type && this.index == chatScrollData.index && this.animate == chatScrollData.animate && this.highlight == chatScrollData.highlight && Intrinsics.areEqual(this.position, chatScrollData.position);
    }

    public final boolean getAnimate() {
        return this.animate;
    }

    public final boolean getHighlight() {
        return this.highlight;
    }

    public final int getIndex() {
        return this.index;
    }

    public final Integer getPosition() {
        return this.position;
    }

    @NotNull
    public final ChatScrollType getType() {
        return this.type;
    }

    public int hashCode() {
        int iG = a.g(a.g(a.u(this.index, this.type.hashCode() * 31, 31), 31, this.animate), 31, this.highlight);
        Integer num = this.position;
        return iG + (num == null ? 0 : num.hashCode());
    }

    @NotNull
    public String toString() {
        ChatScrollType chatScrollType = this.type;
        int i7 = this.index;
        boolean z5 = this.animate;
        boolean z6 = this.highlight;
        Integer num = this.position;
        StringBuilder sb2 = new StringBuilder("ChatScrollData(type=");
        sb2.append(chatScrollType);
        sb2.append(", index=");
        sb2.append(i7);
        sb2.append(", animate=");
        e.B(sb2, z5, ", highlight=", z6, ", position=");
        sb2.append(num);
        sb2.append(")");
        return sb2.toString();
    }

    public ChatScrollData(@NotNull ChatScrollType type, int i7, boolean z5, boolean z6, Integer num) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.type = type;
        this.index = i7;
        this.animate = z5;
        this.highlight = z6;
        this.position = num;
    }

    public /* synthetic */ ChatScrollData(ChatScrollType chatScrollType, int i7, boolean z5, boolean z6, Integer num, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(chatScrollType, i7, (i10 & 4) != 0 ? false : z5, (i10 & 8) != 0 ? false : z6, (i10 & 16) != 0 ? null : num);
    }
}

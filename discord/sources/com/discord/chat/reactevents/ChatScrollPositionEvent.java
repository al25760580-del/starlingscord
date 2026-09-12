package com.discord.chat.reactevents;

import a3.e;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.chat.presentation.list.a;
import com.discord.reactevents.ReactEvent;
import com.facebook.react.bridge.WritableMap;
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
import or.w;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@f
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 @2\u00020\u0001:\u0002?@Bk\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0011\u0010\u0012B\u007f\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u000b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0011\u0010\u0016J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u000bHÆ\u0003J\u0010\u0010+\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010\u001eJ\t\u0010,\u001a\u00020\u000bHÆ\u0003J\u0010\u0010-\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010\u001eJ\t\u0010.\u001a\u00020\u000bHÆ\u0003J\u008a\u0001\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000bHÆ\u0001¢\u0006\u0002\u00100J\u0013\u00101\u001a\u00020\u00032\b\u00102\u001a\u0004\u0018\u000103HÖ\u0003J\t\u00104\u001a\u00020\u000bHÖ\u0001J\t\u00105\u001a\u000206HÖ\u0001J%\u00107\u001a\u0002082\u0006\u00109\u001a\u00020\u00002\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=H\u0001¢\u0006\u0002\b>R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0017R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0017R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0015\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u000e\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001cR\u0015\u0010\u000f\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b!\u0010\u001eR\u0011\u0010\u0010\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001c¨\u0006A"}, d2 = {"Lcom/discord/chat/reactevents/ChatScrollPositionEvent;", "Lcom/discord/reactevents/ReactEvent;", "isAtBottom", "", "isNearBottom", "isNearTop", "dragging", "decelerating", "shouldShowJumpToPresent", "isFirstMessageVisible", "firstVisibleMessageIndex", "", "firstVisibleMessagePercentVisible", "", "lastVisibleMessageIndex", "lastVisibleMessagePercentVisible", "changesetUpdateId", "<init>", "(ZZZZZZZILjava/lang/Double;ILjava/lang/Double;I)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IZZZZZZZILjava/lang/Double;ILjava/lang/Double;ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "()Z", "getDragging", "getDecelerating", "getShouldShowJumpToPresent", "getFirstVisibleMessageIndex", "()I", "getFirstVisibleMessagePercentVisible", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getLastVisibleMessageIndex", "getLastVisibleMessagePercentVisible", "getChangesetUpdateId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(ZZZZZZZILjava/lang/Double;ILjava/lang/Double;I)Lcom/discord/chat/reactevents/ChatScrollPositionEvent;", "equals", "other", "", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$chat_release", "$serializer", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ChatScrollPositionEvent implements ReactEvent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int changesetUpdateId;
    private final boolean decelerating;
    private final boolean dragging;
    private final int firstVisibleMessageIndex;
    private final Double firstVisibleMessagePercentVisible;
    private final boolean isAtBottom;
    private final boolean isFirstMessageVisible;
    private final boolean isNearBottom;
    private final boolean isNearTop;
    private final int lastVisibleMessageIndex;
    private final Double lastVisibleMessagePercentVisible;
    private final boolean shouldShowJumpToPresent;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/chat/reactevents/ChatScrollPositionEvent$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/reactevents/ChatScrollPositionEvent;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return ChatScrollPositionEvent$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ChatScrollPositionEvent(int i7, boolean z5, boolean z6, boolean z7, boolean z10, boolean z11, boolean z12, boolean z13, int i10, Double d6, int i11, Double d7, int i12, SerializationConstructorMarker serializationConstructorMarker) {
        if (4095 != (i7 & 4095)) {
            e1.l(i7, 4095, ChatScrollPositionEvent$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.isAtBottom = z5;
        this.isNearBottom = z6;
        this.isNearTop = z7;
        this.dragging = z10;
        this.decelerating = z11;
        this.shouldShowJumpToPresent = z12;
        this.isFirstMessageVisible = z13;
        this.firstVisibleMessageIndex = i10;
        this.firstVisibleMessagePercentVisible = d6;
        this.lastVisibleMessageIndex = i11;
        this.lastVisibleMessagePercentVisible = d7;
        this.changesetUpdateId = i12;
    }

    public static /* synthetic */ ChatScrollPositionEvent copy$default(ChatScrollPositionEvent chatScrollPositionEvent, boolean z5, boolean z6, boolean z7, boolean z10, boolean z11, boolean z12, boolean z13, int i7, Double d6, int i10, Double d7, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            z5 = chatScrollPositionEvent.isAtBottom;
        }
        if ((i12 & 2) != 0) {
            z6 = chatScrollPositionEvent.isNearBottom;
        }
        if ((i12 & 4) != 0) {
            z7 = chatScrollPositionEvent.isNearTop;
        }
        if ((i12 & 8) != 0) {
            z10 = chatScrollPositionEvent.dragging;
        }
        if ((i12 & 16) != 0) {
            z11 = chatScrollPositionEvent.decelerating;
        }
        if ((i12 & 32) != 0) {
            z12 = chatScrollPositionEvent.shouldShowJumpToPresent;
        }
        if ((i12 & 64) != 0) {
            z13 = chatScrollPositionEvent.isFirstMessageVisible;
        }
        if ((i12 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0) {
            i7 = chatScrollPositionEvent.firstVisibleMessageIndex;
        }
        if ((i12 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0) {
            d6 = chatScrollPositionEvent.firstVisibleMessagePercentVisible;
        }
        if ((i12 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0) {
            i10 = chatScrollPositionEvent.lastVisibleMessageIndex;
        }
        if ((i12 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0) {
            d7 = chatScrollPositionEvent.lastVisibleMessagePercentVisible;
        }
        if ((i12 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0) {
            i11 = chatScrollPositionEvent.changesetUpdateId;
        }
        Double d8 = d7;
        int i13 = i11;
        Double d9 = d6;
        int i14 = i10;
        boolean z14 = z13;
        int i15 = i7;
        boolean z15 = z11;
        boolean z16 = z12;
        return chatScrollPositionEvent.copy(z5, z6, z7, z10, z15, z16, z14, i15, d9, i14, d8, i13);
    }

    public static final /* synthetic */ void write$Self$chat_release(ChatScrollPositionEvent self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.p(serialDesc, 0, self.isAtBottom);
        output.p(serialDesc, 1, self.isNearBottom);
        output.p(serialDesc, 2, self.isNearTop);
        output.p(serialDesc, 3, self.dragging);
        output.p(serialDesc, 4, self.decelerating);
        output.p(serialDesc, 5, self.shouldShowJumpToPresent);
        output.p(serialDesc, 6, self.isFirstMessageVisible);
        output.l(7, self.firstVisibleMessageIndex, serialDesc);
        w wVar = w.f17621a;
        output.r(serialDesc, 8, wVar, self.firstVisibleMessagePercentVisible);
        output.l(9, self.lastVisibleMessageIndex, serialDesc);
        output.r(serialDesc, 10, wVar, self.lastVisibleMessagePercentVisible);
        output.l(11, self.changesetUpdateId, serialDesc);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsAtBottom() {
        return this.isAtBottom;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getLastVisibleMessageIndex() {
        return this.lastVisibleMessageIndex;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Double getLastVisibleMessagePercentVisible() {
        return this.lastVisibleMessagePercentVisible;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final int getChangesetUpdateId() {
        return this.changesetUpdateId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsNearBottom() {
        return this.isNearBottom;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsNearTop() {
        return this.isNearTop;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getDragging() {
        return this.dragging;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getDecelerating() {
        return this.decelerating;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getShouldShowJumpToPresent() {
        return this.shouldShowJumpToPresent;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getIsFirstMessageVisible() {
        return this.isFirstMessageVisible;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getFirstVisibleMessageIndex() {
        return this.firstVisibleMessageIndex;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Double getFirstVisibleMessagePercentVisible() {
        return this.firstVisibleMessagePercentVisible;
    }

    @NotNull
    public final ChatScrollPositionEvent copy(boolean isAtBottom, boolean isNearBottom, boolean isNearTop, boolean dragging, boolean decelerating, boolean shouldShowJumpToPresent, boolean isFirstMessageVisible, int firstVisibleMessageIndex, Double firstVisibleMessagePercentVisible, int lastVisibleMessageIndex, Double lastVisibleMessagePercentVisible, int changesetUpdateId) {
        return new ChatScrollPositionEvent(isAtBottom, isNearBottom, isNearTop, dragging, decelerating, shouldShowJumpToPresent, isFirstMessageVisible, firstVisibleMessageIndex, firstVisibleMessagePercentVisible, lastVisibleMessageIndex, lastVisibleMessagePercentVisible, changesetUpdateId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatScrollPositionEvent)) {
            return false;
        }
        ChatScrollPositionEvent chatScrollPositionEvent = (ChatScrollPositionEvent) other;
        return this.isAtBottom == chatScrollPositionEvent.isAtBottom && this.isNearBottom == chatScrollPositionEvent.isNearBottom && this.isNearTop == chatScrollPositionEvent.isNearTop && this.dragging == chatScrollPositionEvent.dragging && this.decelerating == chatScrollPositionEvent.decelerating && this.shouldShowJumpToPresent == chatScrollPositionEvent.shouldShowJumpToPresent && this.isFirstMessageVisible == chatScrollPositionEvent.isFirstMessageVisible && this.firstVisibleMessageIndex == chatScrollPositionEvent.firstVisibleMessageIndex && Intrinsics.areEqual((Object) this.firstVisibleMessagePercentVisible, (Object) chatScrollPositionEvent.firstVisibleMessagePercentVisible) && this.lastVisibleMessageIndex == chatScrollPositionEvent.lastVisibleMessageIndex && Intrinsics.areEqual((Object) this.lastVisibleMessagePercentVisible, (Object) chatScrollPositionEvent.lastVisibleMessagePercentVisible) && this.changesetUpdateId == chatScrollPositionEvent.changesetUpdateId;
    }

    public final int getChangesetUpdateId() {
        return this.changesetUpdateId;
    }

    public final boolean getDecelerating() {
        return this.decelerating;
    }

    public final boolean getDragging() {
        return this.dragging;
    }

    public final int getFirstVisibleMessageIndex() {
        return this.firstVisibleMessageIndex;
    }

    public final Double getFirstVisibleMessagePercentVisible() {
        return this.firstVisibleMessagePercentVisible;
    }

    public final int getLastVisibleMessageIndex() {
        return this.lastVisibleMessageIndex;
    }

    public final Double getLastVisibleMessagePercentVisible() {
        return this.lastVisibleMessagePercentVisible;
    }

    public final boolean getShouldShowJumpToPresent() {
        return this.shouldShowJumpToPresent;
    }

    public int hashCode() {
        int iU = a.u(this.firstVisibleMessageIndex, a.g(a.g(a.g(a.g(a.g(a.g(Boolean.hashCode(this.isAtBottom) * 31, 31, this.isNearBottom), 31, this.isNearTop), 31, this.dragging), 31, this.decelerating), 31, this.shouldShowJumpToPresent), 31, this.isFirstMessageVisible), 31);
        Double d6 = this.firstVisibleMessagePercentVisible;
        int iU2 = a.u(this.lastVisibleMessageIndex, (iU + (d6 == null ? 0 : d6.hashCode())) * 31, 31);
        Double d7 = this.lastVisibleMessagePercentVisible;
        return Integer.hashCode(this.changesetUpdateId) + ((iU2 + (d7 != null ? d7.hashCode() : 0)) * 31);
    }

    public final boolean isAtBottom() {
        return this.isAtBottom;
    }

    public final boolean isFirstMessageVisible() {
        return this.isFirstMessageVisible;
    }

    public final boolean isNearBottom() {
        return this.isNearBottom;
    }

    public final boolean isNearTop() {
        return this.isNearTop;
    }

    @Override // com.discord.reactevents.ReactEvent
    @NotNull
    /* JADX INFO: renamed from: serialize */
    public WritableMap getData() {
        return ReactEvent.DefaultImpls.serialize(this);
    }

    @NotNull
    public String toString() {
        boolean z5 = this.isAtBottom;
        boolean z6 = this.isNearBottom;
        boolean z7 = this.isNearTop;
        boolean z10 = this.dragging;
        boolean z11 = this.decelerating;
        boolean z12 = this.shouldShowJumpToPresent;
        boolean z13 = this.isFirstMessageVisible;
        int i7 = this.firstVisibleMessageIndex;
        Double d6 = this.firstVisibleMessagePercentVisible;
        int i10 = this.lastVisibleMessageIndex;
        Double d7 = this.lastVisibleMessagePercentVisible;
        int i11 = this.changesetUpdateId;
        StringBuilder sb2 = new StringBuilder("ChatScrollPositionEvent(isAtBottom=");
        sb2.append(z5);
        sb2.append(", isNearBottom=");
        sb2.append(z6);
        sb2.append(", isNearTop=");
        e.B(sb2, z7, ", dragging=", z10, ", decelerating=");
        e.B(sb2, z11, ", shouldShowJumpToPresent=", z12, ", isFirstMessageVisible=");
        sb2.append(z13);
        sb2.append(", firstVisibleMessageIndex=");
        sb2.append(i7);
        sb2.append(", firstVisibleMessagePercentVisible=");
        sb2.append(d6);
        sb2.append(", lastVisibleMessageIndex=");
        sb2.append(i10);
        sb2.append(", lastVisibleMessagePercentVisible=");
        sb2.append(d7);
        sb2.append(", changesetUpdateId=");
        sb2.append(i11);
        sb2.append(")");
        return sb2.toString();
    }

    public ChatScrollPositionEvent(boolean z5, boolean z6, boolean z7, boolean z10, boolean z11, boolean z12, boolean z13, int i7, Double d6, int i10, Double d7, int i11) {
        this.isAtBottom = z5;
        this.isNearBottom = z6;
        this.isNearTop = z7;
        this.dragging = z10;
        this.decelerating = z11;
        this.shouldShowJumpToPresent = z12;
        this.isFirstMessageVisible = z13;
        this.firstVisibleMessageIndex = i7;
        this.firstVisibleMessagePercentVisible = d6;
        this.lastVisibleMessageIndex = i10;
        this.lastVisibleMessagePercentVisible = d7;
        this.changesetUpdateId = i11;
    }
}

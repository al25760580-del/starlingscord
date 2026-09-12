package com.discord.chat.reactevents;

import com.discord.chat.presentation.list.a;
import com.discord.reactevents.ReactEvent;
import com.facebook.react.bridge.WritableMap;
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
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 +2\u00020\u0001:\u0002*+B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tB?\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\rJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0011J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0011J:\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001J%\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00002\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(H\u0001¢\u0006\u0002\b)R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0014\u0010\u0011¨\u0006,"}, d2 = {"Lcom/discord/chat/reactevents/FirstLayoutData;", "Lcom/discord/reactevents/ReactEvent;", "firstVisibleMessageIndex", "", "firstVisibleMessagePercentVisible", "", "lastVisibleMessageIndex", "lastVisibleMessagePercentVisible", "<init>", "(ILjava/lang/Double;ILjava/lang/Double;)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IILjava/lang/Double;ILjava/lang/Double;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getFirstVisibleMessageIndex", "()I", "getFirstVisibleMessagePercentVisible", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getLastVisibleMessageIndex", "getLastVisibleMessagePercentVisible", "component1", "component2", "component3", "component4", "copy", "(ILjava/lang/Double;ILjava/lang/Double;)Lcom/discord/chat/reactevents/FirstLayoutData;", "equals", "", "other", "", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$chat_release", "$serializer", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class FirstLayoutData implements ReactEvent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int firstVisibleMessageIndex;
    private final Double firstVisibleMessagePercentVisible;
    private final int lastVisibleMessageIndex;
    private final Double lastVisibleMessagePercentVisible;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/chat/reactevents/FirstLayoutData$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/reactevents/FirstLayoutData;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return FirstLayoutData$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ FirstLayoutData(int i7, int i10, Double d6, int i11, Double d7, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i7 & 15)) {
            e1.l(i7, 15, FirstLayoutData$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.firstVisibleMessageIndex = i10;
        this.firstVisibleMessagePercentVisible = d6;
        this.lastVisibleMessageIndex = i11;
        this.lastVisibleMessagePercentVisible = d7;
    }

    public static /* synthetic */ FirstLayoutData copy$default(FirstLayoutData firstLayoutData, int i7, Double d6, int i10, Double d7, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i7 = firstLayoutData.firstVisibleMessageIndex;
        }
        if ((i11 & 2) != 0) {
            d6 = firstLayoutData.firstVisibleMessagePercentVisible;
        }
        if ((i11 & 4) != 0) {
            i10 = firstLayoutData.lastVisibleMessageIndex;
        }
        if ((i11 & 8) != 0) {
            d7 = firstLayoutData.lastVisibleMessagePercentVisible;
        }
        return firstLayoutData.copy(i7, d6, i10, d7);
    }

    public static final /* synthetic */ void write$Self$chat_release(FirstLayoutData self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.l(0, self.firstVisibleMessageIndex, serialDesc);
        w wVar = w.f17621a;
        output.r(serialDesc, 1, wVar, self.firstVisibleMessagePercentVisible);
        output.l(2, self.lastVisibleMessageIndex, serialDesc);
        output.r(serialDesc, 3, wVar, self.lastVisibleMessagePercentVisible);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getFirstVisibleMessageIndex() {
        return this.firstVisibleMessageIndex;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Double getFirstVisibleMessagePercentVisible() {
        return this.firstVisibleMessagePercentVisible;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getLastVisibleMessageIndex() {
        return this.lastVisibleMessageIndex;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Double getLastVisibleMessagePercentVisible() {
        return this.lastVisibleMessagePercentVisible;
    }

    @NotNull
    public final FirstLayoutData copy(int firstVisibleMessageIndex, Double firstVisibleMessagePercentVisible, int lastVisibleMessageIndex, Double lastVisibleMessagePercentVisible) {
        return new FirstLayoutData(firstVisibleMessageIndex, firstVisibleMessagePercentVisible, lastVisibleMessageIndex, lastVisibleMessagePercentVisible);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FirstLayoutData)) {
            return false;
        }
        FirstLayoutData firstLayoutData = (FirstLayoutData) other;
        return this.firstVisibleMessageIndex == firstLayoutData.firstVisibleMessageIndex && Intrinsics.areEqual((Object) this.firstVisibleMessagePercentVisible, (Object) firstLayoutData.firstVisibleMessagePercentVisible) && this.lastVisibleMessageIndex == firstLayoutData.lastVisibleMessageIndex && Intrinsics.areEqual((Object) this.lastVisibleMessagePercentVisible, (Object) firstLayoutData.lastVisibleMessagePercentVisible);
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

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.firstVisibleMessageIndex) * 31;
        Double d6 = this.firstVisibleMessagePercentVisible;
        int iU = a.u(this.lastVisibleMessageIndex, (iHashCode + (d6 == null ? 0 : d6.hashCode())) * 31, 31);
        Double d7 = this.lastVisibleMessagePercentVisible;
        return iU + (d7 != null ? d7.hashCode() : 0);
    }

    @Override // com.discord.reactevents.ReactEvent
    @NotNull
    /* JADX INFO: renamed from: serialize */
    public WritableMap getData() {
        return ReactEvent.DefaultImpls.serialize(this);
    }

    @NotNull
    public String toString() {
        return "FirstLayoutData(firstVisibleMessageIndex=" + this.firstVisibleMessageIndex + ", firstVisibleMessagePercentVisible=" + this.firstVisibleMessagePercentVisible + ", lastVisibleMessageIndex=" + this.lastVisibleMessageIndex + ", lastVisibleMessagePercentVisible=" + this.lastVisibleMessagePercentVisible + ")";
    }

    public FirstLayoutData(int i7, Double d6, int i10, Double d7) {
        this.firstVisibleMessageIndex = i7;
        this.firstVisibleMessagePercentVisible = d6;
        this.lastVisibleMessageIndex = i10;
        this.lastVisibleMessagePercentVisible = d7;
    }
}

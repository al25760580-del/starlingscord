package com.discord.chat.bridge.row;

import a3.e;
import com.discord.chat.bridge.ChangeType;
import com.discord.chat.bridge.summaries.Summary;
import com.discord.chat.bridge.summaries.Summary$$serializer;
import com.discord.chat.presentation.list.a;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
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
import or.g;
import or.m0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@f
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 ?2\u00020\u0001:\u0002>?B_\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011Bq\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0010\u0010\u0015J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\t\u0010(\u001a\u00020\u0007HÆ\u0003J\t\u0010)\u001a\u00020\u0007HÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\u0010\u0010+\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001fJ\u0010\u0010,\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\"J\u0010\u0010-\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\"J\u000b\u0010.\u001a\u0004\u0018\u00010\u000fHÆ\u0003Jp\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0002\u00100J\u0013\u00101\u001a\u00020\f2\b\u00102\u001a\u0004\u0018\u000103HÖ\u0003J\t\u00104\u001a\u00020\u0005HÖ\u0001J\t\u00105\u001a\u00020\u0007HÖ\u0001J%\u00106\u001a\u0002072\u0006\u00108\u001a\u00020\u00002\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020<H\u0001¢\u0006\u0002\b=R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010#\u001a\u0004\b!\u0010\"R\u0015\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010#\u001a\u0004\b\r\u0010\"R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%¨\u0006@"}, d2 = {"Lcom/discord/chat/bridge/row/SeparatorRow;", "Lcom/discord/chat/bridge/row/Row;", "changeType", "Lcom/discord/chat/bridge/ChangeType;", "index", "", "text", "", StackTraceHelper.ID_KEY, ViewProps.COLOR, ViewProps.BORDER_COLOR, "scrollTo", "", "isBeforeContent", "summary", "Lcom/discord/chat/bridge/summaries/Summary;", "<init>", "(Lcom/discord/chat/bridge/ChangeType;ILjava/lang/String;Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/discord/chat/bridge/summaries/Summary;)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/discord/chat/bridge/ChangeType;ILjava/lang/String;Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/discord/chat/bridge/summaries/Summary;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getChangeType", "()Lcom/discord/chat/bridge/ChangeType;", "getIndex", "()I", "getText", "()Ljava/lang/String;", "getId", "getColor", "getBorderColor", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getScrollTo", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getSummary", "()Lcom/discord/chat/bridge/summaries/Summary;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Lcom/discord/chat/bridge/ChangeType;ILjava/lang/String;Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/discord/chat/bridge/summaries/Summary;)Lcom/discord/chat/bridge/row/SeparatorRow;", "equals", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$chat_release", "$serializer", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class SeparatorRow extends Row {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final Integer borderColor;

    @NotNull
    private final ChangeType changeType;
    private final int color;

    @NotNull
    private final String id;
    private final int index;
    private final Boolean isBeforeContent;
    private final Boolean scrollTo;
    private final Summary summary;

    @NotNull
    private final String text;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/chat/bridge/row/SeparatorRow$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/row/SeparatorRow;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return SeparatorRow$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SeparatorRow(int i7, ChangeType changeType, int i10, String str, String str2, int i11, Integer num, Boolean bool, Boolean bool2, Summary summary, SerializationConstructorMarker serializationConstructorMarker) {
        DefaultConstructorMarker defaultConstructorMarker = null;
        if (31 != (i7 & 31)) {
            e1.l(i7, 31, SeparatorRow$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        super(defaultConstructorMarker);
        this.changeType = changeType;
        this.index = i10;
        this.text = str;
        this.id = str2;
        this.color = i11;
        if ((i7 & 32) == 0) {
            this.borderColor = null;
        } else {
            this.borderColor = num;
        }
        if ((i7 & 64) == 0) {
            this.scrollTo = null;
        } else {
            this.scrollTo = bool;
        }
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 0) {
            this.isBeforeContent = null;
        } else {
            this.isBeforeContent = bool2;
        }
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) == 0) {
            this.summary = null;
        } else {
            this.summary = summary;
        }
    }

    public static /* synthetic */ SeparatorRow copy$default(SeparatorRow separatorRow, ChangeType changeType, int i7, String str, String str2, int i10, Integer num, Boolean bool, Boolean bool2, Summary summary, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            changeType = separatorRow.changeType;
        }
        if ((i11 & 2) != 0) {
            i7 = separatorRow.index;
        }
        if ((i11 & 4) != 0) {
            str = separatorRow.text;
        }
        if ((i11 & 8) != 0) {
            str2 = separatorRow.id;
        }
        if ((i11 & 16) != 0) {
            i10 = separatorRow.color;
        }
        if ((i11 & 32) != 0) {
            num = separatorRow.borderColor;
        }
        if ((i11 & 64) != 0) {
            bool = separatorRow.scrollTo;
        }
        if ((i11 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0) {
            bool2 = separatorRow.isBeforeContent;
        }
        if ((i11 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0) {
            summary = separatorRow.summary;
        }
        Boolean bool3 = bool2;
        Summary summary2 = summary;
        Integer num2 = num;
        Boolean bool4 = bool;
        int i12 = i10;
        String str3 = str;
        return separatorRow.copy(changeType, i7, str3, str2, i12, num2, bool4, bool3, summary2);
    }

    public static final /* synthetic */ void write$Self$chat_release(SeparatorRow self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.g(serialDesc, 0, ChangeType.Serializer.INSTANCE, self.getChangeType());
        output.l(1, self.getIndex(), serialDesc);
        output.q(serialDesc, 2, self.text);
        output.q(serialDesc, 3, self.id);
        output.l(4, self.color, serialDesc);
        if (output.u(serialDesc, 5) || self.borderColor != null) {
            output.r(serialDesc, 5, m0.f17573a, self.borderColor);
        }
        if (output.u(serialDesc, 6) || self.scrollTo != null) {
            output.r(serialDesc, 6, g.f17537a, self.scrollTo);
        }
        if (output.u(serialDesc, 7) || self.isBeforeContent != null) {
            output.r(serialDesc, 7, g.f17537a, self.isBeforeContent);
        }
        if (!output.u(serialDesc, 8) && self.summary == null) {
            return;
        }
        output.r(serialDesc, 8, Summary$$serializer.INSTANCE, self.summary);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ChangeType getChangeType() {
        return this.changeType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getColor() {
        return this.color;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getBorderColor() {
        return this.borderColor;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Boolean getScrollTo() {
        return this.scrollTo;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Boolean getIsBeforeContent() {
        return this.isBeforeContent;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Summary getSummary() {
        return this.summary;
    }

    @NotNull
    public final SeparatorRow copy(@NotNull ChangeType changeType, int index, @NotNull String text, @NotNull String id2, int color, Integer borderColor, Boolean scrollTo, Boolean isBeforeContent, Summary summary) {
        Intrinsics.checkNotNullParameter(changeType, "changeType");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(id2, "id");
        return new SeparatorRow(changeType, index, text, id2, color, borderColor, scrollTo, isBeforeContent, summary);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SeparatorRow)) {
            return false;
        }
        SeparatorRow separatorRow = (SeparatorRow) other;
        return this.changeType == separatorRow.changeType && this.index == separatorRow.index && Intrinsics.areEqual(this.text, separatorRow.text) && Intrinsics.areEqual(this.id, separatorRow.id) && this.color == separatorRow.color && Intrinsics.areEqual(this.borderColor, separatorRow.borderColor) && Intrinsics.areEqual(this.scrollTo, separatorRow.scrollTo) && Intrinsics.areEqual(this.isBeforeContent, separatorRow.isBeforeContent) && Intrinsics.areEqual(this.summary, separatorRow.summary);
    }

    public final Integer getBorderColor() {
        return this.borderColor;
    }

    @Override // com.discord.chat.bridge.row.Row
    @NotNull
    public ChangeType getChangeType() {
        return this.changeType;
    }

    public final int getColor() {
        return this.color;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @Override // com.discord.chat.bridge.row.Row
    public int getIndex() {
        return this.index;
    }

    public final Boolean getScrollTo() {
        return this.scrollTo;
    }

    public final Summary getSummary() {
        return this.summary;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int iU = a.u(this.color, e.d(e.d(a.u(this.index, this.changeType.hashCode() * 31, 31), 31, this.text), 31, this.id), 31);
        Integer num = this.borderColor;
        int iHashCode = (iU + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.scrollTo;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isBeforeContent;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Summary summary = this.summary;
        return iHashCode3 + (summary != null ? summary.hashCode() : 0);
    }

    public final Boolean isBeforeContent() {
        return this.isBeforeContent;
    }

    @NotNull
    public String toString() {
        ChangeType changeType = this.changeType;
        int i7 = this.index;
        String str = this.text;
        String str2 = this.id;
        int i10 = this.color;
        Integer num = this.borderColor;
        Boolean bool = this.scrollTo;
        Boolean bool2 = this.isBeforeContent;
        Summary summary = this.summary;
        StringBuilder sb2 = new StringBuilder("SeparatorRow(changeType=");
        sb2.append(changeType);
        sb2.append(", index=");
        sb2.append(i7);
        sb2.append(", text=");
        e.A(sb2, str, ", id=", str2, ", color=");
        sb2.append(i10);
        sb2.append(", borderColor=");
        sb2.append(num);
        sb2.append(", scrollTo=");
        sb2.append(bool);
        sb2.append(", isBeforeContent=");
        sb2.append(bool2);
        sb2.append(", summary=");
        sb2.append(summary);
        sb2.append(")");
        return sb2.toString();
    }

    public /* synthetic */ SeparatorRow(ChangeType changeType, int i7, String str, String str2, int i10, Integer num, Boolean bool, Boolean bool2, Summary summary, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(changeType, i7, str, str2, i10, (i11 & 32) != 0 ? null : num, (i11 & 64) != 0 ? null : bool, (i11 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? null : bool2, (i11 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? null : summary);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SeparatorRow(@NotNull ChangeType changeType, int i7, @NotNull String text, @NotNull String id2, int i10, Integer num, Boolean bool, Boolean bool2, Summary summary) {
        super(null);
        Intrinsics.checkNotNullParameter(changeType, "changeType");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(id2, "id");
        this.changeType = changeType;
        this.index = i7;
        this.text = text;
        this.id = id2;
        this.color = i10;
        this.borderColor = num;
        this.scrollTo = bool;
        this.isBeforeContent = bool2;
        this.summary = summary;
    }
}

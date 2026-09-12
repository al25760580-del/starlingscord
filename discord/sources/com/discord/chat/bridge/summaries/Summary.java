package com.discord.chat.bridge.summaries;

import a3.e;
import com.discord.primitives.ChannelId;
import com.discord.primitives.ChannelId$$serializer;
import com.discord.primitives.MessageId;
import com.discord.primitives.MessageId$$serializer;
import com.discord.primitives.UserId;
import com.discord.primitives.UserId$$serializer;
import com.facebook.react.devsupport.StackTraceHelper;
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
import org.jetbrains.annotations.NotNull;
import rn.l;
import rn.m;

/* JADX INFO: loaded from: classes.dex */
@f
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 @2\u00020\u0001:\u0002?@BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011Bo\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\r\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0010\u0010\u0015J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\u000f\u0010'\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u0010\u0010(\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b)\u0010\u0017J\u0010\u0010*\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b+\u0010\u0017J\t\u0010,\u001a\u00020\rHÆ\u0003J\u0010\u0010-\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b.\u0010\"Jf\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fHÆ\u0001¢\u0006\u0004\b0\u00101J\u0013\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00105\u001a\u00020\rHÖ\u0001J\t\u00106\u001a\u00020\u0003HÖ\u0001J%\u00107\u001a\u0002082\u0006\u00109\u001a\u00020\u00002\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=H\u0001¢\u0006\u0002\b>R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\t\u001a\u00020\n¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001c\u0010\u0017R\u0013\u0010\u000b\u001a\u00020\n¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001e\u0010\u0017R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u000e\u001a\u00020\u000f¢\u0006\n\n\u0002\u0010#\u001a\u0004\b!\u0010\"¨\u0006A"}, d2 = {"Lcom/discord/chat/bridge/summaries/Summary;", "", StackTraceHelper.ID_KEY, "", "topic", "summShort", "people", "", "Lcom/discord/primitives/UserId;", "startId", "Lcom/discord/primitives/MessageId;", "endId", "count", "", "channelId", "Lcom/discord/primitives/ChannelId;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;IJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ILcom/discord/primitives/ChannelId;Lkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getId", "()Ljava/lang/String;", "getTopic", "getSummShort", "getPeople", "()Ljava/util/List;", "getStartId-3Eiw7ao", "Ljava/lang/String;", "getEndId-3Eiw7ao", "getCount", "()I", "getChannelId-o4g7jtM", "()J", "J", "component1", "component2", "component3", "component4", "component5", "component5-3Eiw7ao", "component6", "component6-3Eiw7ao", "component7", "component8", "component8-o4g7jtM", "copy", "copy-H5KhIT0", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;IJ)Lcom/discord/chat/bridge/summaries/Summary;", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$chat_release", "$serializer", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class Summary {
    private final long channelId;
    private final int count;

    @NotNull
    private final String endId;

    @NotNull
    private final String id;

    @NotNull
    private final List<UserId> people;

    @NotNull
    private final String startId;

    @NotNull
    private final String summShort;

    @NotNull
    private final String topic;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy[] $childSerializers = {null, null, null, l.a(m.f19486e, new a(27)), null, null, null, null};

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/chat/bridge/summaries/Summary$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/summaries/Summary;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return Summary$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ Summary(int i7, String str, String str2, String str3, List list, String str4, String str5, int i10, ChannelId channelId, SerializationConstructorMarker serializationConstructorMarker, DefaultConstructorMarker defaultConstructorMarker) {
        this(i7, str, str2, str3, list, str4, str5, i10, channelId, serializationConstructorMarker);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new d(UserId$$serializer.INSTANCE, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: copy-H5KhIT0$default, reason: not valid java name */
    public static /* synthetic */ Summary m454copyH5KhIT0$default(Summary summary, String str, String str2, String str3, List list, String str4, String str5, int i7, long j, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = summary.id;
        }
        if ((i10 & 2) != 0) {
            str2 = summary.topic;
        }
        if ((i10 & 4) != 0) {
            str3 = summary.summShort;
        }
        if ((i10 & 8) != 0) {
            list = summary.people;
        }
        if ((i10 & 16) != 0) {
            str4 = summary.startId;
        }
        if ((i10 & 32) != 0) {
            str5 = summary.endId;
        }
        if ((i10 & 64) != 0) {
            i7 = summary.count;
        }
        if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0) {
            j = summary.channelId;
        }
        long j5 = j;
        String str6 = str5;
        int i11 = i7;
        String str7 = str4;
        String str8 = str3;
        return summary.m458copyH5KhIT0(str, str2, str8, list, str7, str6, i11, j5);
    }

    public static final /* synthetic */ void write$Self$chat_release(Summary self, CompositeEncoder output, SerialDescriptor serialDesc) {
        Lazy[] lazyArr = $childSerializers;
        output.q(serialDesc, 0, self.id);
        output.q(serialDesc, 1, self.topic);
        output.q(serialDesc, 2, self.summShort);
        output.g(serialDesc, 3, (KSerializer) lazyArr[3].getValue(), self.people);
        MessageId$$serializer messageId$$serializer = MessageId$$serializer.INSTANCE;
        output.g(serialDesc, 4, messageId$$serializer, MessageId.m1156boximpl(self.startId));
        output.g(serialDesc, 5, messageId$$serializer, MessageId.m1156boximpl(self.endId));
        output.l(6, self.count, serialDesc);
        output.g(serialDesc, 7, ChannelId$$serializer.INSTANCE, ChannelId.m1130boximpl(self.channelId));
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTopic() {
        return this.topic;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSummShort() {
        return this.summShort;
    }

    @NotNull
    public final List<UserId> component4() {
        return this.people;
    }

    @NotNull
    /* JADX INFO: renamed from: component5-3Eiw7ao, reason: not valid java name and from getter */
    public final String getStartId() {
        return this.startId;
    }

    @NotNull
    /* JADX INFO: renamed from: component6-3Eiw7ao, reason: not valid java name and from getter */
    public final String getEndId() {
        return this.endId;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getCount() {
        return this.count;
    }

    /* JADX INFO: renamed from: component8-o4g7jtM, reason: not valid java name and from getter */
    public final long getChannelId() {
        return this.channelId;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-H5KhIT0, reason: not valid java name */
    public final Summary m458copyH5KhIT0(@NotNull String id2, @NotNull String topic, @NotNull String summShort, @NotNull List<UserId> people, @NotNull String startId, @NotNull String endId, int count, long channelId) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(topic, "topic");
        Intrinsics.checkNotNullParameter(summShort, "summShort");
        Intrinsics.checkNotNullParameter(people, "people");
        Intrinsics.checkNotNullParameter(startId, "startId");
        Intrinsics.checkNotNullParameter(endId, "endId");
        return new Summary(id2, topic, summShort, people, startId, endId, count, channelId, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Summary)) {
            return false;
        }
        Summary summary = (Summary) other;
        return Intrinsics.areEqual(this.id, summary.id) && Intrinsics.areEqual(this.topic, summary.topic) && Intrinsics.areEqual(this.summShort, summary.summShort) && Intrinsics.areEqual(this.people, summary.people) && MessageId.m1160equalsimpl0(this.startId, summary.startId) && MessageId.m1160equalsimpl0(this.endId, summary.endId) && this.count == summary.count && ChannelId.m1134equalsimpl0(this.channelId, summary.channelId);
    }

    /* JADX INFO: renamed from: getChannelId-o4g7jtM, reason: not valid java name */
    public final long m459getChannelIdo4g7jtM() {
        return this.channelId;
    }

    public final int getCount() {
        return this.count;
    }

    @NotNull
    /* JADX INFO: renamed from: getEndId-3Eiw7ao, reason: not valid java name */
    public final String m460getEndId3Eiw7ao() {
        return this.endId;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final List<UserId> getPeople() {
        return this.people;
    }

    @NotNull
    /* JADX INFO: renamed from: getStartId-3Eiw7ao, reason: not valid java name */
    public final String m461getStartId3Eiw7ao() {
        return this.startId;
    }

    @NotNull
    public final String getSummShort() {
        return this.summShort;
    }

    @NotNull
    public final String getTopic() {
        return this.topic;
    }

    public int hashCode() {
        return ChannelId.m1135hashCodeimpl(this.channelId) + com.discord.chat.presentation.list.a.u(this.count, (MessageId.m1161hashCodeimpl(this.endId) + ((MessageId.m1161hashCodeimpl(this.startId) + e.f(this.people, e.d(e.d(this.id.hashCode() * 31, 31, this.topic), 31, this.summShort), 31)) * 31)) * 31, 31);
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.topic;
        String str3 = this.summShort;
        List<UserId> list = this.people;
        String strM1163toStringimpl = MessageId.m1163toStringimpl(this.startId);
        String strM1163toStringimpl2 = MessageId.m1163toStringimpl(this.endId);
        int i7 = this.count;
        String strM1137toStringimpl = ChannelId.m1137toStringimpl(this.channelId);
        StringBuilder sbU = e.u("Summary(id=", str, ", topic=", str2, ", summShort=");
        sbU.append(str3);
        sbU.append(", people=");
        sbU.append(list);
        sbU.append(", startId=");
        e.A(sbU, strM1163toStringimpl, ", endId=", strM1163toStringimpl2, ", count=");
        sbU.append(i7);
        sbU.append(", channelId=");
        sbU.append(strM1137toStringimpl);
        sbU.append(")");
        return sbU.toString();
    }

    public /* synthetic */ Summary(String str, String str2, String str3, List list, String str4, String str5, int i7, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, list, str4, str5, i7, j);
    }

    private /* synthetic */ Summary(int i7, String str, String str2, String str3, List list, String str4, String str5, int i10, ChannelId channelId, SerializationConstructorMarker serializationConstructorMarker) {
        if (255 != (i7 & 255)) {
            e1.l(i7, 255, Summary$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = str;
        this.topic = str2;
        this.summShort = str3;
        this.people = list;
        this.startId = str4;
        this.endId = str5;
        this.count = i10;
        this.channelId = channelId.m1139unboximpl();
    }

    private Summary(String id2, String topic, String summShort, List<UserId> people, String startId, String endId, int i7, long j) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(topic, "topic");
        Intrinsics.checkNotNullParameter(summShort, "summShort");
        Intrinsics.checkNotNullParameter(people, "people");
        Intrinsics.checkNotNullParameter(startId, "startId");
        Intrinsics.checkNotNullParameter(endId, "endId");
        this.id = id2;
        this.topic = topic;
        this.summShort = summShort;
        this.people = people;
        this.startId = startId;
        this.endId = endId;
        this.count = i7;
        this.channelId = j;
    }
}

package com.discord.notifications.api;

import a3.e;
import com.discord.chat.presentation.list.a;
import com.discord.primitives.ChannelId;
import com.discord.primitives.ChannelId$$serializer;
import com.discord.primitives.MessageId;
import com.discord.primitives.MessageId$$serializer;
import com.discord.sticker.sticker_types.c;
import com.facebook.react.devsupport.StackTraceHelper;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.collections.n0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonObject;
import kr.f;
import or.d;
import or.e1;
import org.jetbrains.annotations.NotNull;
import pr.q;
import rn.l;
import rn.m;

/* JADX INFO: loaded from: classes.dex */
@f
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 <2\u00020\u0001:\u0002;<B?\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fBY\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u000b\u0010\u0011J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0004HÆ\u0003J\u0010\u0010&\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b'\u0010\u001dJ\u0010\u0010(\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b)\u0010!JN\u0010*\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b+\u0010,J\u0013\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00100\u001a\u00020\u000eHÖ\u0001J\t\u00101\u001a\u000202HÖ\u0001J%\u00103\u001a\u0002042\u0006\u00105\u001a\u00020\u00002\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u000209H\u0001¢\u0006\u0002\b:R\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\"\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u001c\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u001aR\u001e\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\u001e\u0012\u0004\b\u001b\u0010\u0013\u001a\u0004\b\u001c\u0010\u001dR\u001e\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\"\u0012\u0004\b\u001f\u0010\u0013\u001a\u0004\b \u0010!¨\u0006="}, d2 = {"Lcom/discord/notifications/api/KvMessageEntry;", "", "members", "", "Lkotlinx/serialization/json/JsonObject;", "users", "message", StackTraceHelper.ID_KEY, "Lcom/discord/primitives/MessageId;", "channelId", "Lcom/discord/primitives/ChannelId;", "<init>", "(Ljava/util/List;Ljava/util/List;Lkotlinx/serialization/json/JsonObject;Ljava/lang/String;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/List;Ljava/util/List;Lkotlinx/serialization/json/JsonObject;Ljava/lang/String;Lcom/discord/primitives/ChannelId;Lkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getMembers$annotations", "()V", "getMembers", "()Ljava/util/List;", "getUsers$annotations", "getUsers", "getMessage$annotations", "getMessage", "()Lkotlinx/serialization/json/JsonObject;", "getId-3Eiw7ao$annotations", "getId-3Eiw7ao", "()Ljava/lang/String;", "Ljava/lang/String;", "getChannelId-o4g7jtM$annotations", "getChannelId-o4g7jtM", "()J", "J", "component1", "component2", "component3", "component4", "component4-3Eiw7ao", "component5", "component5-o4g7jtM", "copy", "copy-kA7ecXY", "(Ljava/util/List;Ljava/util/List;Lkotlinx/serialization/json/JsonObject;Ljava/lang/String;J)Lcom/discord/notifications/api/KvMessageEntry;", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$notification_api_release", "$serializer", "Companion", "notification_api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class KvMessageEntry {

    @NotNull
    private static final Lazy[] $childSerializers;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final long channelId;

    @NotNull
    private final String id;

    @NotNull
    private final List<JsonObject> members;

    @NotNull
    private final JsonObject message;

    @NotNull
    private final List<JsonObject> users;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/notifications/api/KvMessageEntry$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/notifications/api/KvMessageEntry;", "notification_api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return KvMessageEntry$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        m mVar = m.f19486e;
        $childSerializers = new Lazy[]{l.a(mVar, new c(19)), l.a(mVar, new c(20)), null, null, null};
    }

    public /* synthetic */ KvMessageEntry(int i7, List list, List list2, JsonObject jsonObject, String str, ChannelId channelId, SerializationConstructorMarker serializationConstructorMarker, DefaultConstructorMarker defaultConstructorMarker) {
        this(i7, list, list2, jsonObject, str, channelId, serializationConstructorMarker);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new d(q.f18539a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new d(q.f18539a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: copy-kA7ecXY$default, reason: not valid java name */
    public static /* synthetic */ KvMessageEntry m1065copykA7ecXY$default(KvMessageEntry kvMessageEntry, List list, List list2, JsonObject jsonObject, String str, long j, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            list = kvMessageEntry.members;
        }
        if ((i7 & 2) != 0) {
            list2 = kvMessageEntry.users;
        }
        if ((i7 & 4) != 0) {
            jsonObject = kvMessageEntry.message;
        }
        if ((i7 & 8) != 0) {
            str = kvMessageEntry.id;
        }
        if ((i7 & 16) != 0) {
            j = kvMessageEntry.channelId;
        }
        long j5 = j;
        return kvMessageEntry.m1070copykA7ecXY(list, list2, jsonObject, str, j5);
    }

    /* JADX INFO: renamed from: getChannelId-o4g7jtM$annotations, reason: not valid java name */
    public static /* synthetic */ void m1066getChannelIdo4g7jtM$annotations() {
    }

    /* JADX INFO: renamed from: getId-3Eiw7ao$annotations, reason: not valid java name */
    public static /* synthetic */ void m1067getId3Eiw7ao$annotations() {
    }

    public static /* synthetic */ void getMembers$annotations() {
    }

    public static /* synthetic */ void getMessage$annotations() {
    }

    public static /* synthetic */ void getUsers$annotations() {
    }

    public static final /* synthetic */ void write$Self$notification_api_release(KvMessageEntry self, CompositeEncoder output, SerialDescriptor serialDesc) {
        Lazy[] lazyArr = $childSerializers;
        output.g(serialDesc, 0, (KSerializer) lazyArr[0].getValue(), self.members);
        output.g(serialDesc, 1, (KSerializer) lazyArr[1].getValue(), self.users);
        output.g(serialDesc, 2, q.f18539a, self.message);
        output.g(serialDesc, 3, MessageId$$serializer.INSTANCE, MessageId.m1156boximpl(self.id));
        output.g(serialDesc, 4, ChannelId$$serializer.INSTANCE, ChannelId.m1130boximpl(self.channelId));
    }

    @NotNull
    public final List<JsonObject> component1() {
        return this.members;
    }

    @NotNull
    public final List<JsonObject> component2() {
        return this.users;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final JsonObject getMessage() {
        return this.message;
    }

    @NotNull
    /* JADX INFO: renamed from: component4-3Eiw7ao, reason: not valid java name and from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component5-o4g7jtM, reason: not valid java name and from getter */
    public final long getChannelId() {
        return this.channelId;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-kA7ecXY, reason: not valid java name */
    public final KvMessageEntry m1070copykA7ecXY(@NotNull List<JsonObject> members, @NotNull List<JsonObject> users, @NotNull JsonObject message, @NotNull String id2, long channelId) {
        Intrinsics.checkNotNullParameter(members, "members");
        Intrinsics.checkNotNullParameter(users, "users");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(id2, "id");
        return new KvMessageEntry(members, users, message, id2, channelId, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KvMessageEntry)) {
            return false;
        }
        KvMessageEntry kvMessageEntry = (KvMessageEntry) other;
        return Intrinsics.areEqual(this.members, kvMessageEntry.members) && Intrinsics.areEqual(this.users, kvMessageEntry.users) && Intrinsics.areEqual(this.message, kvMessageEntry.message) && MessageId.m1160equalsimpl0(this.id, kvMessageEntry.id) && ChannelId.m1134equalsimpl0(this.channelId, kvMessageEntry.channelId);
    }

    /* JADX INFO: renamed from: getChannelId-o4g7jtM, reason: not valid java name */
    public final long m1071getChannelIdo4g7jtM() {
        return this.channelId;
    }

    @NotNull
    /* JADX INFO: renamed from: getId-3Eiw7ao, reason: not valid java name */
    public final String m1072getId3Eiw7ao() {
        return this.id;
    }

    @NotNull
    public final List<JsonObject> getMembers() {
        return this.members;
    }

    @NotNull
    public final JsonObject getMessage() {
        return this.message;
    }

    @NotNull
    public final List<JsonObject> getUsers() {
        return this.users;
    }

    public int hashCode() {
        return ChannelId.m1135hashCodeimpl(this.channelId) + ((MessageId.m1161hashCodeimpl(this.id) + ((this.message.f14766d.hashCode() + e.f(this.users, this.members.hashCode() * 31, 31)) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        List<JsonObject> list = this.members;
        List<JsonObject> list2 = this.users;
        JsonObject jsonObject = this.message;
        String strM1163toStringimpl = MessageId.m1163toStringimpl(this.id);
        String strM1137toStringimpl = ChannelId.m1137toStringimpl(this.channelId);
        StringBuilder sb2 = new StringBuilder("KvMessageEntry(members=");
        sb2.append(list);
        sb2.append(", users=");
        sb2.append(list2);
        sb2.append(", message=");
        sb2.append(jsonObject);
        sb2.append(", id=");
        sb2.append(strM1163toStringimpl);
        sb2.append(", channelId=");
        return a.k(sb2, strM1137toStringimpl, ")");
    }

    public /* synthetic */ KvMessageEntry(List list, List list2, JsonObject jsonObject, String str, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2, jsonObject, str, j);
    }

    private KvMessageEntry(int i7, List list, List list2, JsonObject jsonObject, String str, ChannelId channelId, SerializationConstructorMarker serializationConstructorMarker) {
        if (28 != (i7 & 28)) {
            e1.l(i7, 28, KvMessageEntry$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.members = (i7 & 1) == 0 ? n0.f14659d : list;
        if ((i7 & 2) == 0) {
            this.users = n0.f14659d;
        } else {
            this.users = list2;
        }
        this.message = jsonObject;
        this.id = str;
        this.channelId = channelId.m1139unboximpl();
    }

    private KvMessageEntry(List<JsonObject> members, List<JsonObject> users, JsonObject message, String id2, long j) {
        Intrinsics.checkNotNullParameter(members, "members");
        Intrinsics.checkNotNullParameter(users, "users");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(id2, "id");
        this.members = members;
        this.users = users;
        this.message = message;
        this.id = id2;
        this.channelId = j;
    }

    public KvMessageEntry(List list, List list2, JsonObject jsonObject, String str, long j, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? n0.f14659d : list, (i7 & 2) != 0 ? n0.f14659d : list2, jsonObject, str, j, null);
    }
}

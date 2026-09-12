package com.discord.notifications.api;

import a3.e;
import com.discord.notifications.renderer.NotificationRenderer;
import com.discord.primitives.ApplicationId;
import com.discord.primitives.ChannelId;
import com.discord.primitives.ChannelId$$serializer;
import com.discord.primitives.GuildId;
import com.discord.primitives.MessageId;
import com.discord.primitives.MessageId$$serializer;
import com.discord.primitives.UserId;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import f6.a;
import java.util.List;
import java.util.Map;
import kk.b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.n0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kr.f;
import ls.d;
import or.e1;
import or.m0;
import or.s1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@f
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 @2\u00020\u0001:\u0002@AB[\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000f\u0010\u0010Bk\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u000b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000f\u0010\u0014J\u0010\u0010&\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b'\u0010\u0016J\u0010\u0010(\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b)\u0010\u001bJ\t\u0010*\u001a\u00020\u0007HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0010\u0010,\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010!J\u0010\u0010-\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010!J\u000b\u0010.\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\tHÆ\u0003Jj\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b1\u00102J\u0013\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00106\u001a\u00020\u000bHÖ\u0001J\t\u00107\u001a\u00020\tHÖ\u0001J%\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020\u00002\u0006\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020>H\u0001¢\u0006\u0002\b?R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\u001c\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b \u0010!R\u0015\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b#\u0010!R\u0013\u0010\r\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0016R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0016¨\u0006B"}, d2 = {"Lcom/discord/notifications/api/DirectReplyMessage;", "", StackTraceHelper.ID_KEY, "Lcom/discord/primitives/MessageId;", "channelId", "Lcom/discord/primitives/ChannelId;", "author", "Lcom/discord/notifications/api/DirectReplyUser;", "content", "", "type", "", "channelType", NotificationRenderer.CHANNEL_NAME, "guildName", "<init>", "(Ljava/lang/String;JLcom/discord/notifications/api/DirectReplyUser;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/discord/primitives/ChannelId;Lcom/discord/notifications/api/DirectReplyUser;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getId-3Eiw7ao", "()Ljava/lang/String;", "Ljava/lang/String;", "getChannelId-o4g7jtM$annotations", "()V", "getChannelId-o4g7jtM", "()J", "J", "getAuthor", "()Lcom/discord/notifications/api/DirectReplyUser;", "getContent", "getType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getChannelType", "getChannelName", "getGuildName", "component1", "component1-3Eiw7ao", "component2", "component2-o4g7jtM", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "copy-_6Dih7Q", "(Ljava/lang/String;JLcom/discord/notifications/api/DirectReplyUser;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lcom/discord/notifications/api/DirectReplyMessage;", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$notification_api_release", "Companion", "$serializer", "notification_api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class DirectReplyMessage {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Json json = d.e(new a(7));

    @NotNull
    private final DirectReplyUser author;
    private final long channelId;
    private final String channelName;
    private final Integer channelType;
    private final String content;
    private final String guildName;

    @NotNull
    private final String id;
    private final Integer type;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/discord/notifications/api/DirectReplyMessage$Companion;", "", "<init>", "()V", "json", "Lkotlinx/serialization/json/Json;", "toNotificationData", "Lcom/discord/notifications/api/NotificationData;", "data", "", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/notifications/api/DirectReplyMessage;", "notification_api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nDirectReplyMessage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DirectReplyMessage.kt\ncom/discord/notifications/api/DirectReplyMessage$Companion\n+ 2 Json.kt\nkotlinx/serialization/json/Json\n*L\n1#1,57:1\n147#2:58\n*S KotlinDebug\n*F\n+ 1 DirectReplyMessage.kt\ncom/discord/notifications/api/DirectReplyMessage$Companion\n*L\n26#1:58\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return DirectReplyMessage$$serializer.INSTANCE;
        }

        @NotNull
        public final NotificationData toNotificationData(@NotNull String data) {
            Intrinsics.checkNotNullParameter(data, "data");
            Json json = DirectReplyMessage.json;
            json.getClass();
            DirectReplyMessage directReplyMessage = (DirectReplyMessage) json.b(DirectReplyMessage.INSTANCE.serializer(), data);
            String strM1060getId3Eiw7ao = directReplyMessage.m1060getId3Eiw7ao();
            Integer type = directReplyMessage.getType();
            String content = directReplyMessage.getContent();
            long jM1059getChannelIdo4g7jtM = directReplyMessage.m1059getChannelIdo4g7jtM();
            Integer channelType = directReplyMessage.getChannelType();
            n0 n0Var = n0.f14659d;
            long jM1064getIdre6GcUE = directReplyMessage.getAuthor().m1064getIdre6GcUE();
            String username = directReplyMessage.getAuthor().getUsername();
            if (username == null) {
                username = "";
            }
            String str = username;
            String discriminator = directReplyMessage.getAuthor().getDiscriminator();
            return new NotificationData(NotificationData.TYPE_MESSAGE_CREATE, strM1060getId3Eiw7ao, (Integer) null, (String) null, type, content, (Long) null, channelType, directReplyMessage.getChannelName(), ChannelId.m1130boximpl(jM1059getChannelIdo4g7jtM), (String) null, (String) null, (ChannelId) null, (Integer) null, (String) null, (List) n0Var, UserId.m1208boximpl(jM1064getIdre6GcUE), str, (String) null, discriminator != null ? StringsKt.toIntOrNull(discriminator) : null, directReplyMessage.getAuthor().getAvatar(), (String) null, (String) null, (Integer) null, (GuildId) null, directReplyMessage.getGuildName(), (String) null, (String) null, (Integer) null, (String) null, (ApplicationId) null, (String) null, (String) null, (NotificationMessage) null, (String) null, true, true, (UserId) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, (String) null, (String) null, (Integer) null, (Integer) null, (Integer) null, (String) null, false, (Map) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, (String) null, 0L, false, -35357620, -25, 1, (DefaultConstructorMarker) null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ DirectReplyMessage(int i7, String str, ChannelId channelId, DirectReplyUser directReplyUser, String str2, Integer num, Integer num2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker, DefaultConstructorMarker defaultConstructorMarker) {
        this(i7, str, channelId, directReplyUser, str2, num, num2, str3, str4, serializationConstructorMarker);
    }

    /* JADX INFO: renamed from: copy-_6Dih7Q$default, reason: not valid java name */
    public static /* synthetic */ DirectReplyMessage m1054copy_6Dih7Q$default(DirectReplyMessage directReplyMessage, String str, long j, DirectReplyUser directReplyUser, String str2, Integer num, Integer num2, String str3, String str4, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = directReplyMessage.id;
        }
        if ((i7 & 2) != 0) {
            j = directReplyMessage.channelId;
        }
        if ((i7 & 4) != 0) {
            directReplyUser = directReplyMessage.author;
        }
        if ((i7 & 8) != 0) {
            str2 = directReplyMessage.content;
        }
        if ((i7 & 16) != 0) {
            num = directReplyMessage.type;
        }
        if ((i7 & 32) != 0) {
            num2 = directReplyMessage.channelType;
        }
        if ((i7 & 64) != 0) {
            str3 = directReplyMessage.channelName;
        }
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0) {
            str4 = directReplyMessage.guildName;
        }
        String str5 = str3;
        String str6 = str4;
        return directReplyMessage.m1058copy_6Dih7Q(str, j, directReplyUser, str2, num, num2, str5, str6);
    }

    /* JADX INFO: renamed from: getChannelId-o4g7jtM$annotations, reason: not valid java name */
    public static /* synthetic */ void m1055getChannelIdo4g7jtM$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit json$lambda$0(JsonBuilder Json) {
        Intrinsics.checkNotNullParameter(Json, "$this$Json");
        Json.f14765b = true;
        return Unit.f14616a;
    }

    public static final /* synthetic */ void write$Self$notification_api_release(DirectReplyMessage self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.g(serialDesc, 0, MessageId$$serializer.INSTANCE, MessageId.m1156boximpl(self.id));
        output.g(serialDesc, 1, ChannelId$$serializer.INSTANCE, ChannelId.m1130boximpl(self.channelId));
        output.g(serialDesc, 2, DirectReplyUser$$serializer.INSTANCE, self.author);
        if (output.u(serialDesc, 3) || self.content != null) {
            output.r(serialDesc, 3, s1.f17602a, self.content);
        }
        if (output.u(serialDesc, 4) || self.type != null) {
            output.r(serialDesc, 4, m0.f17573a, self.type);
        }
        if (output.u(serialDesc, 5) || self.channelType != null) {
            output.r(serialDesc, 5, m0.f17573a, self.channelType);
        }
        if (output.u(serialDesc, 6) || self.channelName != null) {
            output.r(serialDesc, 6, s1.f17602a, self.channelName);
        }
        if (!output.u(serialDesc, 7) && self.guildName == null) {
            return;
        }
        output.r(serialDesc, 7, s1.f17602a, self.guildName);
    }

    @NotNull
    /* JADX INFO: renamed from: component1-3Eiw7ao, reason: not valid java name and from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2-o4g7jtM, reason: not valid java name and from getter */
    public final long getChannelId() {
        return this.channelId;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final DirectReplyUser getAuthor() {
        return this.author;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getChannelType() {
        return this.channelType;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getChannelName() {
        return this.channelName;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getGuildName() {
        return this.guildName;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-_6Dih7Q, reason: not valid java name */
    public final DirectReplyMessage m1058copy_6Dih7Q(@NotNull String id2, long channelId, @NotNull DirectReplyUser author, String content, Integer type, Integer channelType, String channelName, String guildName) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(author, "author");
        return new DirectReplyMessage(id2, channelId, author, content, type, channelType, channelName, guildName, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DirectReplyMessage)) {
            return false;
        }
        DirectReplyMessage directReplyMessage = (DirectReplyMessage) other;
        return MessageId.m1160equalsimpl0(this.id, directReplyMessage.id) && ChannelId.m1134equalsimpl0(this.channelId, directReplyMessage.channelId) && Intrinsics.areEqual(this.author, directReplyMessage.author) && Intrinsics.areEqual(this.content, directReplyMessage.content) && Intrinsics.areEqual(this.type, directReplyMessage.type) && Intrinsics.areEqual(this.channelType, directReplyMessage.channelType) && Intrinsics.areEqual(this.channelName, directReplyMessage.channelName) && Intrinsics.areEqual(this.guildName, directReplyMessage.guildName);
    }

    @NotNull
    public final DirectReplyUser getAuthor() {
        return this.author;
    }

    /* JADX INFO: renamed from: getChannelId-o4g7jtM, reason: not valid java name */
    public final long m1059getChannelIdo4g7jtM() {
        return this.channelId;
    }

    public final String getChannelName() {
        return this.channelName;
    }

    public final Integer getChannelType() {
        return this.channelType;
    }

    public final String getContent() {
        return this.content;
    }

    public final String getGuildName() {
        return this.guildName;
    }

    @NotNull
    /* JADX INFO: renamed from: getId-3Eiw7ao, reason: not valid java name */
    public final String m1060getId3Eiw7ao() {
        return this.id;
    }

    public final Integer getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = (this.author.hashCode() + b.d(this.channelId, MessageId.m1161hashCodeimpl(this.id) * 31, 31)) * 31;
        String str = this.content;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.type;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.channelType;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.channelName;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.guildName;
        return iHashCode5 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String strM1163toStringimpl = MessageId.m1163toStringimpl(this.id);
        String strM1137toStringimpl = ChannelId.m1137toStringimpl(this.channelId);
        DirectReplyUser directReplyUser = this.author;
        String str = this.content;
        Integer num = this.type;
        Integer num2 = this.channelType;
        String str2 = this.channelName;
        String str3 = this.guildName;
        StringBuilder sbU = e.u("DirectReplyMessage(id=", strM1163toStringimpl, ", channelId=", strM1137toStringimpl, ", author=");
        sbU.append(directReplyUser);
        sbU.append(", content=");
        sbU.append(str);
        sbU.append(", type=");
        b.s(sbU, num, ", channelType=", num2, ", channelName=");
        return com.discord.chat.presentation.list.a.l(sbU, str2, ", guildName=", str3, ")");
    }

    public /* synthetic */ DirectReplyMessage(String str, long j, DirectReplyUser directReplyUser, String str2, Integer num, Integer num2, String str3, String str4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, directReplyUser, str2, num, num2, str3, str4);
    }

    private /* synthetic */ DirectReplyMessage(int i7, String str, ChannelId channelId, DirectReplyUser directReplyUser, String str2, Integer num, Integer num2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i7 & 7)) {
            e1.l(i7, 7, DirectReplyMessage$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = str;
        this.channelId = channelId.m1139unboximpl();
        this.author = directReplyUser;
        if ((i7 & 8) == 0) {
            this.content = null;
        } else {
            this.content = str2;
        }
        if ((i7 & 16) == 0) {
            this.type = null;
        } else {
            this.type = num;
        }
        if ((i7 & 32) == 0) {
            this.channelType = null;
        } else {
            this.channelType = num2;
        }
        if ((i7 & 64) == 0) {
            this.channelName = null;
        } else {
            this.channelName = str3;
        }
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 0) {
            this.guildName = null;
        } else {
            this.guildName = str4;
        }
    }

    private DirectReplyMessage(String id2, long j, DirectReplyUser author, String str, Integer num, Integer num2, String str2, String str3) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(author, "author");
        this.id = id2;
        this.channelId = j;
        this.author = author;
        this.content = str;
        this.type = num;
        this.channelType = num2;
        this.channelName = str2;
        this.guildName = str3;
    }

    public /* synthetic */ DirectReplyMessage(String str, long j, DirectReplyUser directReplyUser, String str2, Integer num, Integer num2, String str3, String str4, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, directReplyUser, (i7 & 8) != 0 ? null : str2, (i7 & 16) != 0 ? null : num, (i7 & 32) != 0 ? null : num2, (i7 & 64) != 0 ? null : str3, (i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? null : str4, null);
    }
}

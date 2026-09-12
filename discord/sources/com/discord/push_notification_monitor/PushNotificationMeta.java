package com.discord.push_notification_monitor;

import a3.e;
import com.discord.chat.presentation.list.a;
import com.facebook.react.modules.dialog.AlertFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kr.f;
import or.e1;
import or.s1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@f
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 22\u00020\u0001:\u000212BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\f\u0010\rB]\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\f\u0010\u0012J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0003JU\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010%\u001a\u00020\u00052\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020\u000fHÖ\u0001J\t\u0010(\u001a\u00020\u0007HÖ\u0001J%\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u00002\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/H\u0001¢\u0006\u0002\b0R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018¨\u00063"}, d2 = {"Lcom/discord/push_notification_monitor/PushNotificationMeta;", "", "receivedTimestamp", "", "silent", "", "type", "", AlertFragment.ARG_TITLE, "content", "channelId", "messageId", "<init>", "(JZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IJZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getReceivedTimestamp", "()J", "getSilent", "()Z", "getType", "()Ljava/lang/String;", "getTitle", "getContent", "getChannelId", "getMessageId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$push_notification_monitor_release", "$serializer", "Companion", "push_notification_monitor_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class PushNotificationMeta {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final String channelId;
    private final String content;
    private final String messageId;
    private final long receivedTimestamp;
    private final boolean silent;

    @NotNull
    private final String title;

    @NotNull
    private final String type;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/push_notification_monitor/PushNotificationMeta$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/push_notification_monitor/PushNotificationMeta;", "push_notification_monitor_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return PushNotificationMeta$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ PushNotificationMeta(int i7, long j, boolean z5, String str, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i7 & 31)) {
            e1.l(i7, 31, PushNotificationMeta$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.receivedTimestamp = j;
        this.silent = z5;
        this.type = str;
        this.title = str2;
        this.content = str3;
        if ((i7 & 32) == 0) {
            this.channelId = null;
        } else {
            this.channelId = str4;
        }
        if ((i7 & 64) == 0) {
            this.messageId = null;
        } else {
            this.messageId = str5;
        }
    }

    public static /* synthetic */ PushNotificationMeta copy$default(PushNotificationMeta pushNotificationMeta, long j, boolean z5, String str, String str2, String str3, String str4, String str5, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            j = pushNotificationMeta.receivedTimestamp;
        }
        long j5 = j;
        if ((i7 & 2) != 0) {
            z5 = pushNotificationMeta.silent;
        }
        boolean z6 = z5;
        if ((i7 & 4) != 0) {
            str = pushNotificationMeta.type;
        }
        String str6 = str;
        if ((i7 & 8) != 0) {
            str2 = pushNotificationMeta.title;
        }
        String str7 = str2;
        if ((i7 & 16) != 0) {
            str3 = pushNotificationMeta.content;
        }
        return pushNotificationMeta.copy(j5, z6, str6, str7, str3, (i7 & 32) != 0 ? pushNotificationMeta.channelId : str4, (i7 & 64) != 0 ? pushNotificationMeta.messageId : str5);
    }

    public static final /* synthetic */ void write$Self$push_notification_monitor_release(PushNotificationMeta self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.C(serialDesc, 0, self.receivedTimestamp);
        output.p(serialDesc, 1, self.silent);
        output.q(serialDesc, 2, self.type);
        output.q(serialDesc, 3, self.title);
        s1 s1Var = s1.f17602a;
        output.r(serialDesc, 4, s1Var, self.content);
        if (output.u(serialDesc, 5) || self.channelId != null) {
            output.r(serialDesc, 5, s1Var, self.channelId);
        }
        if (!output.u(serialDesc, 6) && self.messageId == null) {
            return;
        }
        output.r(serialDesc, 6, s1Var, self.messageId);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getReceivedTimestamp() {
        return this.receivedTimestamp;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getSilent() {
        return this.silent;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getChannelId() {
        return this.channelId;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getMessageId() {
        return this.messageId;
    }

    @NotNull
    public final PushNotificationMeta copy(long receivedTimestamp, boolean silent, @NotNull String type, @NotNull String title, String content, String channelId, String messageId) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(title, "title");
        return new PushNotificationMeta(receivedTimestamp, silent, type, title, content, channelId, messageId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PushNotificationMeta)) {
            return false;
        }
        PushNotificationMeta pushNotificationMeta = (PushNotificationMeta) other;
        return this.receivedTimestamp == pushNotificationMeta.receivedTimestamp && this.silent == pushNotificationMeta.silent && Intrinsics.areEqual(this.type, pushNotificationMeta.type) && Intrinsics.areEqual(this.title, pushNotificationMeta.title) && Intrinsics.areEqual(this.content, pushNotificationMeta.content) && Intrinsics.areEqual(this.channelId, pushNotificationMeta.channelId) && Intrinsics.areEqual(this.messageId, pushNotificationMeta.messageId);
    }

    public final String getChannelId() {
        return this.channelId;
    }

    public final String getContent() {
        return this.content;
    }

    public final String getMessageId() {
        return this.messageId;
    }

    public final long getReceivedTimestamp() {
        return this.receivedTimestamp;
    }

    public final boolean getSilent() {
        return this.silent;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int iD = e.d(e.d(a.g(Long.hashCode(this.receivedTimestamp) * 31, 31, this.silent), 31, this.type), 31, this.title);
        String str = this.content;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.channelId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.messageId;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j = this.receivedTimestamp;
        boolean z5 = this.silent;
        String str = this.type;
        String str2 = this.title;
        String str3 = this.content;
        String str4 = this.channelId;
        String str5 = this.messageId;
        StringBuilder sb2 = new StringBuilder("PushNotificationMeta(receivedTimestamp=");
        sb2.append(j);
        sb2.append(", silent=");
        sb2.append(z5);
        e.A(sb2, ", type=", str, ", title=", str2);
        e.A(sb2, ", content=", str3, ", channelId=", str4);
        return e.o(sb2, ", messageId=", str5, ")");
    }

    public PushNotificationMeta(long j, boolean z5, @NotNull String type, @NotNull String title, String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(title, "title");
        this.receivedTimestamp = j;
        this.silent = z5;
        this.type = type;
        this.title = title;
        this.content = str;
        this.channelId = str2;
        this.messageId = str3;
    }

    public /* synthetic */ PushNotificationMeta(long j, boolean z5, String str, String str2, String str3, String str4, String str5, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, z5, str, str2, str3, (i7 & 32) != 0 ? null : str4, (i7 & 64) != 0 ? null : str5);
    }
}

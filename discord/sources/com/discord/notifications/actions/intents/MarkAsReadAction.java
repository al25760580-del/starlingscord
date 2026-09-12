package com.discord.notifications.actions.intents;

import a3.e;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.discord.chat.presentation.list.a;
import com.discord.primitives.ChannelId;
import com.discord.primitives.MessageId;
import com.discord.react.headless_tasks.api.HeadlessTasks;
import kk.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0015\u001a\u00020\u0005HÂ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0007HÂ\u0003¢\u0006\u0004\b\u0019\u0010\u000bJ.\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0006\u0010\u001d\u001a\u00020\u001eJ\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020\u001eHÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001J\u0016\u0010%\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u001eR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0010\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\fR\u0010\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\r¨\u0006)"}, d2 = {"Lcom/discord/notifications/actions/intents/MarkAsReadAction;", "Lcom/discord/notifications/actions/intents/NotificationAction;", "tag", "", "channelId", "Lcom/discord/primitives/ChannelId;", "messageId", "Lcom/discord/primitives/MessageId;", "<init>", "(Ljava/lang/String;JLjava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getTag", "()Ljava/lang/String;", "J", "Ljava/lang/String;", "onNotificationAction", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "component1", "component2", "component2-o4g7jtM", "()J", "component3", "component3-3Eiw7ao", "copy", "copy-SHRpUJI", "(Ljava/lang/String;JLjava/lang/String;)Lcom/discord/notifications/actions/intents/MarkAsReadAction;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "dest", "Landroid/os/Parcel;", "flags", "notification_actions_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class MarkAsReadAction implements NotificationAction {

    @NotNull
    public static final Parcelable.Creator<MarkAsReadAction> CREATOR = new Creator();
    private final long channelId;

    @NotNull
    private final String messageId;

    @NotNull
    private final String tag;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<MarkAsReadAction> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MarkAsReadAction createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MarkAsReadAction(parcel.readString(), ((ChannelId) parcel.readParcelable(MarkAsReadAction.class.getClassLoader())).m1139unboximpl(), ((MessageId) parcel.readParcelable(MarkAsReadAction.class.getClassLoader())).m1165unboximpl(), null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MarkAsReadAction[] newArray(int i7) {
            return new MarkAsReadAction[i7];
        }
    }

    public /* synthetic */ MarkAsReadAction(String str, long j, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, str2);
    }

    /* JADX INFO: renamed from: component2-o4g7jtM, reason: not valid java name and from getter */
    private final long getChannelId() {
        return this.channelId;
    }

    /* JADX INFO: renamed from: component3-3Eiw7ao, reason: not valid java name and from getter */
    private final String getMessageId() {
        return this.messageId;
    }

    /* JADX INFO: renamed from: copy-SHRpUJI$default, reason: not valid java name */
    public static /* synthetic */ MarkAsReadAction m1052copySHRpUJI$default(MarkAsReadAction markAsReadAction, String str, long j, String str2, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = markAsReadAction.tag;
        }
        if ((i7 & 2) != 0) {
            j = markAsReadAction.channelId;
        }
        if ((i7 & 4) != 0) {
            str2 = markAsReadAction.messageId;
        }
        return markAsReadAction.m1053copySHRpUJI(str, j, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTag() {
        return this.tag;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-SHRpUJI, reason: not valid java name */
    public final MarkAsReadAction m1053copySHRpUJI(@NotNull String tag, long channelId, @NotNull String messageId) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        return new MarkAsReadAction(tag, channelId, messageId, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarkAsReadAction)) {
            return false;
        }
        MarkAsReadAction markAsReadAction = (MarkAsReadAction) other;
        return Intrinsics.areEqual(this.tag, markAsReadAction.tag) && ChannelId.m1134equalsimpl0(this.channelId, markAsReadAction.channelId) && MessageId.m1160equalsimpl0(this.messageId, markAsReadAction.messageId);
    }

    @Override // com.discord.notifications.actions.intents.NotificationAction
    public int getPendingIntentRequestCode() {
        return NotificationAction.DefaultImpls.getPendingIntentRequestCode(this);
    }

    @Override // com.discord.notifications.actions.intents.NotificationAction
    @NotNull
    public String getTag() {
        return this.tag;
    }

    public int hashCode() {
        return MessageId.m1161hashCodeimpl(this.messageId) + b.d(this.channelId, this.tag.hashCode() * 31, 31);
    }

    @Override // com.discord.notifications.actions.intents.NotificationAction
    public void onNotificationAction(@NotNull Context context, @NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        HeadlessTasks.Companion companion = HeadlessTasks.INSTANCE;
        Bundle bundle = new Bundle();
        bundle.putString("channelId", ChannelId.m1137toStringimpl(this.channelId));
        bundle.putString("messageId", MessageId.m1163toStringimpl(this.messageId));
        HeadlessTasks.Companion.startHeadlessTask$default(companion, context, "MarkAsRead", 0L, false, bundle, true, 12, null);
    }

    @Override // com.discord.notifications.actions.intents.NotificationAction
    public void onNotificationActionComplete(@NotNull Context context) {
        NotificationAction.DefaultImpls.onNotificationActionComplete(this, context);
    }

    @Override // com.discord.notifications.actions.intents.NotificationAction
    @NotNull
    public PendingIntent toPendingIntent(@NotNull Context context, int i7, boolean z5) {
        return NotificationAction.DefaultImpls.toPendingIntent(this, context, i7, z5);
    }

    @NotNull
    public String toString() {
        String str = this.tag;
        String strM1137toStringimpl = ChannelId.m1137toStringimpl(this.channelId);
        return a.k(e.u("MarkAsReadAction(tag=", str, ", channelId=", strM1137toStringimpl, ", messageId="), MessageId.m1163toStringimpl(this.messageId), ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.tag);
        dest.writeParcelable(ChannelId.m1130boximpl(this.channelId), flags);
        dest.writeParcelable(MessageId.m1156boximpl(this.messageId), flags);
    }

    private MarkAsReadAction(String tag, long j, String messageId) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        this.tag = tag;
        this.channelId = j;
        this.messageId = messageId;
    }
}

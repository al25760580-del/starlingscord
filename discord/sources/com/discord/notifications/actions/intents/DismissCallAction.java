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
import com.discord.primitives.GuildId;
import com.discord.primitives.UserId;
import com.discord.react.headless_tasks.api.HeadlessTasks;
import kk.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0018\u001a\u00020\u0005HÂ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u001b\u001a\u00020\u0007HÂ\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\tHÂ\u0003¢\u0006\u0002\b\u001dJ\u0010\u0010\u001e\u001a\u00020\u000bHÂ\u0003¢\u0006\u0004\b\u001f\u0010\u001aJD\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0006\u0010#\u001a\u00020$J\u0013\u0010%\u001a\u00020\u00072\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020$HÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001J\u0016\u0010*\u001a\u00020\u00122\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020$R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0010R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0010¨\u0006."}, d2 = {"Lcom/discord/notifications/actions/intents/DismissCallAction;", "Lcom/discord/notifications/actions/intents/NotificationAction;", "tag", "", "channelId", "Lcom/discord/primitives/ChannelId;", "isFullscreenCallUI", "", "guildId", "Lcom/discord/primitives/GuildId;", "userId", "Lcom/discord/primitives/UserId;", "<init>", "(Ljava/lang/String;JZLcom/discord/primitives/GuildId;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getTag", "()Ljava/lang/String;", "J", "onNotificationAction", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "component1", "component2", "component2-o4g7jtM", "()J", "component3", "component4", "component4-qOKuAAo", "component5", "component5-re6GcUE", "copy", "copy-ZtnKfUs", "(Ljava/lang/String;JZLcom/discord/primitives/GuildId;J)Lcom/discord/notifications/actions/intents/DismissCallAction;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "dest", "Landroid/os/Parcel;", "flags", "notification_actions_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class DismissCallAction implements NotificationAction {

    @NotNull
    public static final Parcelable.Creator<DismissCallAction> CREATOR = new Creator();
    private final long channelId;
    private final GuildId guildId;
    private final boolean isFullscreenCallUI;

    @NotNull
    private final String tag;
    private final long userId;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DismissCallAction> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DismissCallAction createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DismissCallAction(parcel.readString(), ((ChannelId) parcel.readParcelable(DismissCallAction.class.getClassLoader())).m1139unboximpl(), parcel.readInt() != 0, (GuildId) parcel.readParcelable(DismissCallAction.class.getClassLoader()), ((UserId) parcel.readParcelable(DismissCallAction.class.getClassLoader())).m1217unboximpl(), null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DismissCallAction[] newArray(int i7) {
            return new DismissCallAction[i7];
        }
    }

    public /* synthetic */ DismissCallAction(String str, long j, boolean z5, GuildId guildId, long j5, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, z5, guildId, j5);
    }

    /* JADX INFO: renamed from: component2-o4g7jtM, reason: not valid java name and from getter */
    private final long getChannelId() {
        return this.channelId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    private final boolean getIsFullscreenCallUI() {
        return this.isFullscreenCallUI;
    }

    /* JADX INFO: renamed from: component4-qOKuAAo, reason: not valid java name and from getter */
    private final GuildId getGuildId() {
        return this.guildId;
    }

    /* JADX INFO: renamed from: component5-re6GcUE, reason: not valid java name and from getter */
    private final long getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: copy-ZtnKfUs$default, reason: not valid java name */
    public static /* synthetic */ DismissCallAction m1048copyZtnKfUs$default(DismissCallAction dismissCallAction, String str, long j, boolean z5, GuildId guildId, long j5, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = dismissCallAction.tag;
        }
        if ((i7 & 2) != 0) {
            j = dismissCallAction.channelId;
        }
        if ((i7 & 4) != 0) {
            z5 = dismissCallAction.isFullscreenCallUI;
        }
        if ((i7 & 8) != 0) {
            guildId = dismissCallAction.guildId;
        }
        if ((i7 & 16) != 0) {
            j5 = dismissCallAction.userId;
        }
        return dismissCallAction.m1049copyZtnKfUs(str, j, z5, guildId, j5);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTag() {
        return this.tag;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-ZtnKfUs, reason: not valid java name */
    public final DismissCallAction m1049copyZtnKfUs(@NotNull String tag, long channelId, boolean isFullscreenCallUI, GuildId guildId, long userId) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        return new DismissCallAction(tag, channelId, isFullscreenCallUI, guildId, userId, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DismissCallAction)) {
            return false;
        }
        DismissCallAction dismissCallAction = (DismissCallAction) other;
        return Intrinsics.areEqual(this.tag, dismissCallAction.tag) && ChannelId.m1134equalsimpl0(this.channelId, dismissCallAction.channelId) && this.isFullscreenCallUI == dismissCallAction.isFullscreenCallUI && Intrinsics.areEqual(this.guildId, dismissCallAction.guildId) && UserId.m1212equalsimpl0(this.userId, dismissCallAction.userId);
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
        int iG = a.g(b.d(this.channelId, this.tag.hashCode() * 31, 31), 31, this.isFullscreenCallUI);
        GuildId guildId = this.guildId;
        return UserId.m1213hashCodeimpl(this.userId) + ((iG + (guildId == null ? 0 : GuildId.m1148hashCodeimpl(guildId.m1152unboximpl()))) * 31);
    }

    @Override // com.discord.notifications.actions.intents.NotificationAction
    public void onNotificationAction(@NotNull Context context, @NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        HeadlessTasks.Companion companion = HeadlessTasks.INSTANCE;
        Bundle bundle = new Bundle();
        bundle.putString("channelId", String.valueOf(this.channelId));
        bundle.putBoolean("isFullscreenCallUI", this.isFullscreenCallUI);
        GuildId guildId = this.guildId;
        bundle.putString("guildId", String.valueOf(guildId != null ? Long.valueOf(guildId.m1152unboximpl()) : null));
        bundle.putString("userId", String.valueOf(this.userId));
        HeadlessTasks.Companion.startHeadlessTask$default(companion, context, "DismissCallAction", 0L, false, bundle, true, 12, null);
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
        boolean z5 = this.isFullscreenCallUI;
        GuildId guildId = this.guildId;
        String strM1215toStringimpl = UserId.m1215toStringimpl(this.userId);
        StringBuilder sbU = e.u("DismissCallAction(tag=", str, ", channelId=", strM1137toStringimpl, ", isFullscreenCallUI=");
        sbU.append(z5);
        sbU.append(", guildId=");
        sbU.append(guildId);
        sbU.append(", userId=");
        return a.k(sbU, strM1215toStringimpl, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.tag);
        dest.writeParcelable(ChannelId.m1130boximpl(this.channelId), flags);
        dest.writeInt(this.isFullscreenCallUI ? 1 : 0);
        dest.writeParcelable(this.guildId, flags);
        dest.writeParcelable(UserId.m1208boximpl(this.userId), flags);
    }

    private DismissCallAction(String tag, long j, boolean z5, GuildId guildId, long j5) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        this.tag = tag;
        this.channelId = j;
        this.isFullscreenCallUI = z5;
        this.guildId = guildId;
        this.userId = j5;
    }
}

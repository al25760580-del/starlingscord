package com.discord.notifications.actions.intents;

import a3.e;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.discord.chat.presentation.list.a;
import com.discord.notifications.renderer.NotificationRenderer;
import com.discord.primitives.ChannelId;
import com.discord.react.headless_tasks.api.HeadlessTasks;
import java.util.HashSet;
import kk.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0001-B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0018\u001a\u00020\u0005HÂ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\bHÂ\u0003¢\u0006\u0002\u0010\u001dJ\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÂ\u0003JH\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b \u0010!J\u0006\u0010\"\u001a\u00020\bJ\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&HÖ\u0003J\t\u0010'\u001a\u00020\bHÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001J\u0016\u0010)\u001a\u00020\u00112\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0010\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000eR\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000fR\u0010\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lcom/discord/notifications/actions/intents/DirectReplyAction;", "Lcom/discord/notifications/actions/intents/NotificationAction;", "tag", "", "channelId", "Lcom/discord/primitives/ChannelId;", NotificationRenderer.CHANNEL_NAME, "channelType", "", "guildName", "<init>", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getTag", "()Ljava/lang/String;", "J", "Ljava/lang/Integer;", "onNotificationAction", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "onNotificationActionComplete", "component1", "component2", "component2-o4g7jtM", "()J", "component3", "component4", "()Ljava/lang/Integer;", "component5", "copy", "copy-H-xa5aA", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lcom/discord/notifications/actions/intents/DirectReplyAction;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "dest", "Landroid/os/Parcel;", "flags", "Companion", "notification_actions_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDirectReplyAction.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DirectReplyAction.kt\ncom/discord/notifications/actions/intents/DirectReplyAction\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,57:1\n1#2:58\n*E\n"})
public final /* data */ class DirectReplyAction implements NotificationAction {

    @NotNull
    private static final String KEY_REMOTE_INPUT = "remote_input_key";
    private final long channelId;
    private final String channelName;
    private final Integer channelType;
    private final String guildName;

    @NotNull
    private final String tag;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<DirectReplyAction> CREATOR = new Creator();

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005J\u0012\u0010\t\u001a\u0004\u0018\u00010\u00052\u0006\u0010\n\u001a\u00020\u000bH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/discord/notifications/actions/intents/DirectReplyAction$Companion;", "", "<init>", "()V", "KEY_REMOTE_INPUT", "", "toRemoteInput", "Landroidx/core/app/RemoteInput;", "label", "getReplyText", "intent", "Landroid/content/Intent;", "notification_actions_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nDirectReplyAction.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DirectReplyAction.kt\ncom/discord/notifications/actions/intents/DirectReplyAction$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,57:1\n1#2:58\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String getReplyText(Intent intent) {
            CharSequence charSequence;
            Bundle resultsFromIntent = RemoteInput.getResultsFromIntent(intent);
            if (resultsFromIntent != null && (charSequence = resultsFromIntent.getCharSequence(DirectReplyAction.KEY_REMOTE_INPUT)) != null) {
                if (StringsKt.K(charSequence)) {
                    charSequence = null;
                }
                if (charSequence != null) {
                    return charSequence.toString();
                }
            }
            return null;
        }

        @NotNull
        public final androidx.core.app.RemoteInput toRemoteInput(@NotNull String label) {
            Intrinsics.checkNotNullParameter(label, "label");
            androidx.core.app.RemoteInput remoteInput = new androidx.core.app.RemoteInput(DirectReplyAction.KEY_REMOTE_INPUT, label, null, true, 0, new Bundle(), new HashSet());
            Intrinsics.checkNotNullExpressionValue(remoteInput, "build(...)");
            return remoteInput;
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DirectReplyAction> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DirectReplyAction createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DirectReplyAction(parcel.readString(), ((ChannelId) parcel.readParcelable(DirectReplyAction.class.getClassLoader())).m1139unboximpl(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DirectReplyAction[] newArray(int i7) {
            return new DirectReplyAction[i7];
        }
    }

    public /* synthetic */ DirectReplyAction(String str, long j, String str2, Integer num, String str3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, str2, num, str3);
    }

    /* JADX INFO: renamed from: component2-o4g7jtM, reason: not valid java name and from getter */
    private final long getChannelId() {
        return this.channelId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    private final String getChannelName() {
        return this.channelName;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    private final Integer getChannelType() {
        return this.channelType;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    private final String getGuildName() {
        return this.guildName;
    }

    /* JADX INFO: renamed from: copy-H-xa5aA$default, reason: not valid java name */
    public static /* synthetic */ DirectReplyAction m1043copyHxa5aA$default(DirectReplyAction directReplyAction, String str, long j, String str2, Integer num, String str3, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = directReplyAction.tag;
        }
        if ((i7 & 2) != 0) {
            j = directReplyAction.channelId;
        }
        if ((i7 & 4) != 0) {
            str2 = directReplyAction.channelName;
        }
        if ((i7 & 8) != 0) {
            num = directReplyAction.channelType;
        }
        if ((i7 & 16) != 0) {
            str3 = directReplyAction.guildName;
        }
        String str4 = str3;
        String str5 = str2;
        return directReplyAction.m1044copyHxa5aA(str, j, str5, num, str4);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTag() {
        return this.tag;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-H-xa5aA, reason: not valid java name */
    public final DirectReplyAction m1044copyHxa5aA(@NotNull String tag, long channelId, String channelName, Integer channelType, String guildName) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        return new DirectReplyAction(tag, channelId, channelName, channelType, guildName, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DirectReplyAction)) {
            return false;
        }
        DirectReplyAction directReplyAction = (DirectReplyAction) other;
        return Intrinsics.areEqual(this.tag, directReplyAction.tag) && ChannelId.m1134equalsimpl0(this.channelId, directReplyAction.channelId) && Intrinsics.areEqual(this.channelName, directReplyAction.channelName) && Intrinsics.areEqual(this.channelType, directReplyAction.channelType) && Intrinsics.areEqual(this.guildName, directReplyAction.guildName);
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
        int iD = b.d(this.channelId, this.tag.hashCode() * 31, 31);
        String str = this.channelName;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.channelType;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.guildName;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.discord.notifications.actions.intents.NotificationAction
    public void onNotificationAction(@NotNull Context context, @NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        String replyText = INSTANCE.getReplyText(intent);
        HeadlessTasks.Companion companion = HeadlessTasks.INSTANCE;
        Bundle bundle = new Bundle();
        bundle.putString("channelId", String.valueOf(this.channelId));
        bundle.putString(NotificationRenderer.CHANNEL_NAME, this.channelName);
        bundle.putString("channelReplyText", replyText);
        Integer num = this.channelType;
        if (num != null) {
            bundle.putInt("channelType", num.intValue());
        }
        bundle.putString("guildName", this.guildName);
        HeadlessTasks.Companion.startHeadlessTask$default(companion, context, "DirectReply", 0L, false, bundle, true, 12, null);
    }

    @Override // com.discord.notifications.actions.intents.NotificationAction
    public void onNotificationActionComplete(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
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
        String str2 = this.channelName;
        Integer num = this.channelType;
        String str3 = this.guildName;
        StringBuilder sbU = e.u("DirectReplyAction(tag=", str, ", channelId=", strM1137toStringimpl, ", channelName=");
        a.r(num, str2, ", channelType=", ", guildName=", sbU);
        return a.k(sbU, str3, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.tag);
        dest.writeParcelable(ChannelId.m1130boximpl(this.channelId), flags);
        dest.writeString(this.channelName);
        Integer num = this.channelType;
        if (num == null) {
            iIntValue = 0;
        } else {
            dest.writeInt(1);
            iIntValue = num.intValue();
        }
        dest.writeInt(iIntValue);
        dest.writeString(this.guildName);
    }

    private DirectReplyAction(String tag, long j, String str, Integer num, String str2) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        this.tag = tag;
        this.channelId = j;
        this.channelName = str;
        this.channelType = num;
        this.guildName = str2;
    }
}

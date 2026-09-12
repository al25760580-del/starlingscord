package com.discord.notifications.actions.intents;

import a3.e;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.discord.react.headless_tasks.api.HeadlessTasks;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0015J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u0017\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0006HÆ\u0003J5\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0006HÆ\u0001J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0013\u0010\u001c\u001a\u00020\u00152\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u001bHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\u0016\u0010!\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u001bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u001f\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006%"}, d2 = {"Lcom/discord/notifications/actions/intents/GenericAction;", "Lcom/discord/notifications/actions/intents/NotificationAction;", "tag", "", "taskName", "data", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getTag", "()Ljava/lang/String;", "getTaskName", "getData", "()Ljava/util/Map;", "onNotificationAction", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "taskInvokingFromBroadcastReceiver", "", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "dest", "Landroid/os/Parcel;", "flags", "notification_actions_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nGenericAction.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GenericAction.kt\ncom/discord/notifications/actions/intents/GenericAction\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,34:1\n216#2,2:35\n*S KotlinDebug\n*F\n+ 1 GenericAction.kt\ncom/discord/notifications/actions/intents/GenericAction\n*L\n27#1:35,2\n*E\n"})
public final /* data */ class GenericAction implements NotificationAction {

    @NotNull
    public static final Parcelable.Creator<GenericAction> CREATOR = new Creator();

    @NotNull
    private final Map<String, String> data;

    @NotNull
    private final String tag;

    @NotNull
    private final String taskName;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<GenericAction> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GenericAction createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i7 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i7);
            for (int i10 = 0; i10 != i7; i10++) {
                linkedHashMap.put(parcel.readString(), parcel.readString());
            }
            return new GenericAction(string, string2, linkedHashMap);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GenericAction[] newArray(int i7) {
            return new GenericAction[i7];
        }
    }

    public GenericAction(@NotNull String tag, @NotNull String taskName, @NotNull Map<String, String> data) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(taskName, "taskName");
        Intrinsics.checkNotNullParameter(data, "data");
        this.tag = tag;
        this.taskName = taskName;
        this.data = data;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GenericAction copy$default(GenericAction genericAction, String str, String str2, Map map, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = genericAction.tag;
        }
        if ((i7 & 2) != 0) {
            str2 = genericAction.taskName;
        }
        if ((i7 & 4) != 0) {
            map = genericAction.data;
        }
        return genericAction.copy(str, str2, map);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTag() {
        return this.tag;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTaskName() {
        return this.taskName;
    }

    @NotNull
    public final Map<String, String> component3() {
        return this.data;
    }

    @NotNull
    public final GenericAction copy(@NotNull String tag, @NotNull String taskName, @NotNull Map<String, String> data) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(taskName, "taskName");
        Intrinsics.checkNotNullParameter(data, "data");
        return new GenericAction(tag, taskName, data);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GenericAction)) {
            return false;
        }
        GenericAction genericAction = (GenericAction) other;
        return Intrinsics.areEqual(this.tag, genericAction.tag) && Intrinsics.areEqual(this.taskName, genericAction.taskName) && Intrinsics.areEqual(this.data, genericAction.data);
    }

    @NotNull
    public final Map<String, String> getData() {
        return this.data;
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

    @NotNull
    public final String getTaskName() {
        return this.taskName;
    }

    public int hashCode() {
        return this.data.hashCode() + e.d(this.tag.hashCode() * 31, 31, this.taskName);
    }

    @Override // com.discord.notifications.actions.intents.NotificationAction
    public void onNotificationAction(@NotNull Context context, @NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        onNotificationAction(context, true);
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
        String str2 = this.taskName;
        Map<String, String> map = this.data;
        StringBuilder sbU = e.u("GenericAction(tag=", str, ", taskName=", str2, ", data=");
        sbU.append(map);
        sbU.append(")");
        return sbU.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.tag);
        dest.writeString(this.taskName);
        Map<String, String> map = this.data;
        dest.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            dest.writeString(entry.getKey());
            dest.writeString(entry.getValue());
        }
    }

    public final void onNotificationAction(@NotNull Context context, boolean taskInvokingFromBroadcastReceiver) {
        Intrinsics.checkNotNullParameter(context, "context");
        HeadlessTasks.Companion companion = HeadlessTasks.INSTANCE;
        String str = this.taskName;
        Bundle bundle = new Bundle();
        for (Map.Entry<String, String> entry : this.data.entrySet()) {
            bundle.putString(entry.getKey(), entry.getValue());
        }
        HeadlessTasks.Companion.startHeadlessTask$default(companion, context, str, 0L, false, bundle, taskInvokingFromBroadcastReceiver, 12, null);
    }
}

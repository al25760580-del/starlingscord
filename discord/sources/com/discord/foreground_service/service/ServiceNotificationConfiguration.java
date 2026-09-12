package com.discord.foreground_service.service;

import a3.e;
import com.facebook.imagepipeline.nativecode.b;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.modules.dialog.AlertFragment;
import com.facebook.react.uimanager.ViewProps;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\t\b\u0080\b\u0018\u0000 22\u00020\u0001:\u000523456BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0006HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000f\u0010'\u001a\b\u0012\u0004\u0012\u00020\b0\nHÆ\u0003J\t\u0010(\u001a\u00020\fHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u0010\u0010*\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010!Jl\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0002\u0010,J\u0013\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00100\u001a\u00020\u0010HÖ\u0001J\t\u00101\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b \u0010!¨\u00067"}, d2 = {"Lcom/discord/foreground_service/service/ServiceNotificationConfiguration;", "", AlertFragment.ARG_TITLE, "", "content", "priority", "Lcom/discord/foreground_service/service/ServiceNotificationConfiguration$Priority;", "contentAction", "Lcom/discord/foreground_service/service/ServiceNotificationConfiguration$Action;", "auxiliaryActions", "", "type", "Lcom/discord/foreground_service/service/ServiceNotificationConfiguration$Type;", "icon", "Lcom/discord/foreground_service/service/ServiceNotificationConfiguration$Icon;", ViewProps.COLOR, "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/discord/foreground_service/service/ServiceNotificationConfiguration$Priority;Lcom/discord/foreground_service/service/ServiceNotificationConfiguration$Action;Ljava/util/List;Lcom/discord/foreground_service/service/ServiceNotificationConfiguration$Type;Lcom/discord/foreground_service/service/ServiceNotificationConfiguration$Icon;Ljava/lang/Integer;)V", "getTitle", "()Ljava/lang/String;", "getContent", "getPriority", "()Lcom/discord/foreground_service/service/ServiceNotificationConfiguration$Priority;", "getContentAction", "()Lcom/discord/foreground_service/service/ServiceNotificationConfiguration$Action;", "getAuxiliaryActions", "()Ljava/util/List;", "getType", "()Lcom/discord/foreground_service/service/ServiceNotificationConfiguration$Type;", "getIcon", "()Lcom/discord/foreground_service/service/ServiceNotificationConfiguration$Icon;", "getColor", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/discord/foreground_service/service/ServiceNotificationConfiguration$Priority;Lcom/discord/foreground_service/service/ServiceNotificationConfiguration$Action;Ljava/util/List;Lcom/discord/foreground_service/service/ServiceNotificationConfiguration$Type;Lcom/discord/foreground_service/service/ServiceNotificationConfiguration$Icon;Ljava/lang/Integer;)Lcom/discord/foreground_service/service/ServiceNotificationConfiguration;", "equals", "", "other", "hashCode", "toString", "Companion", "Action", "Priority", "Type", "Icon", "foreground_service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ServiceNotificationConfiguration {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final List<Action> auxiliaryActions;
    private final Integer color;
    private final String content;
    private final Action contentAction;
    private final Icon icon;

    @NotNull
    private final Priority priority;

    @NotNull
    private final String title;

    @NotNull
    private final Type type;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003J?\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/discord/foreground_service/service/ServiceNotificationConfiguration$Action;", "", "tag", "", "taskName", AlertFragment.ARG_TITLE, "data", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getTag", "()Ljava/lang/String;", "getTaskName", "getTitle", "getData", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "foreground_service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Action {

        @NotNull
        private final Map<String, String> data;

        @NotNull
        private final String tag;

        @NotNull
        private final String taskName;
        private final String title;

        public Action(@NotNull String tag, @NotNull String taskName, String str, @NotNull Map<String, String> data) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(taskName, "taskName");
            Intrinsics.checkNotNullParameter(data, "data");
            this.tag = tag;
            this.taskName = taskName;
            this.title = str;
            this.data = data;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Action copy$default(Action action, String str, String str2, String str3, Map map, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                str = action.tag;
            }
            if ((i7 & 2) != 0) {
                str2 = action.taskName;
            }
            if ((i7 & 4) != 0) {
                str3 = action.title;
            }
            if ((i7 & 8) != 0) {
                map = action.data;
            }
            return action.copy(str, str2, str3, map);
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

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        public final Map<String, String> component4() {
            return this.data;
        }

        @NotNull
        public final Action copy(@NotNull String tag, @NotNull String taskName, String title, @NotNull Map<String, String> data) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(taskName, "taskName");
            Intrinsics.checkNotNullParameter(data, "data");
            return new Action(tag, taskName, title, data);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Action)) {
                return false;
            }
            Action action = (Action) other;
            return Intrinsics.areEqual(this.tag, action.tag) && Intrinsics.areEqual(this.taskName, action.taskName) && Intrinsics.areEqual(this.title, action.title) && Intrinsics.areEqual(this.data, action.data);
        }

        @NotNull
        public final Map<String, String> getData() {
            return this.data;
        }

        @NotNull
        public final String getTag() {
            return this.tag;
        }

        @NotNull
        public final String getTaskName() {
            return this.taskName;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int iD = e.d(this.tag.hashCode() * 31, 31, this.taskName);
            String str = this.title;
            return this.data.hashCode() + ((iD + (str == null ? 0 : str.hashCode())) * 31);
        }

        @NotNull
        public String toString() {
            String str = this.tag;
            String str2 = this.taskName;
            String str3 = this.title;
            Map<String, String> map = this.data;
            StringBuilder sbU = e.u("Action(tag=", str, ", taskName=", str2, ", title=");
            sbU.append(str3);
            sbU.append(", data=");
            sbU.append(map);
            sbU.append(")");
            return sbU.toString();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/discord/foreground_service/service/ServiceNotificationConfiguration$Companion;", "", "<init>", "()V", "foreground_service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/discord/foreground_service/service/ServiceNotificationConfiguration$Icon;", "", "<init>", "(Ljava/lang/String;I)V", "DEFAULT", "DEAFENED", "IDLE", "MUTED", "SPEAKING", "foreground_service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum Icon {
        DEFAULT,
        DEAFENED,
        IDLE,
        MUTED,
        SPEAKING;

        private static final /* synthetic */ EnumEntries $ENTRIES = b.l(values());

        @NotNull
        public static EnumEntries getEntries() {
            return $ENTRIES;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/discord/foreground_service/service/ServiceNotificationConfiguration$Priority;", "", "<init>", "(Ljava/lang/String;I)V", "HIGH", "MEDIUM", "LOW", "foreground_service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum Priority {
        HIGH,
        MEDIUM,
        LOW;

        private static final /* synthetic */ EnumEntries $ENTRIES = b.l(values());

        @NotNull
        public static EnumEntries getEntries() {
            return $ENTRIES;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/discord/foreground_service/service/ServiceNotificationConfiguration$Type;", "", "<init>", "(Ljava/lang/String;I)V", "FILE_UPLOAD", "VOICE_CALL", "SCREEN_SHARE", "foreground_service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum Type {
        FILE_UPLOAD,
        VOICE_CALL,
        SCREEN_SHARE;

        private static final /* synthetic */ EnumEntries $ENTRIES = b.l(values());

        @NotNull
        public static EnumEntries getEntries() {
            return $ENTRIES;
        }
    }

    public ServiceNotificationConfiguration(@NotNull String title, String str, @NotNull Priority priority, Action action, @NotNull List<Action> auxiliaryActions, @NotNull Type type, Icon icon, Integer num) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(priority, "priority");
        Intrinsics.checkNotNullParameter(auxiliaryActions, "auxiliaryActions");
        Intrinsics.checkNotNullParameter(type, "type");
        this.title = title;
        this.content = str;
        this.priority = priority;
        this.contentAction = action;
        this.auxiliaryActions = auxiliaryActions;
        this.type = type;
        this.icon = icon;
        this.color = num;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ServiceNotificationConfiguration copy$default(ServiceNotificationConfiguration serviceNotificationConfiguration, String str, String str2, Priority priority, Action action, List list, Type type, Icon icon, Integer num, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = serviceNotificationConfiguration.title;
        }
        if ((i7 & 2) != 0) {
            str2 = serviceNotificationConfiguration.content;
        }
        if ((i7 & 4) != 0) {
            priority = serviceNotificationConfiguration.priority;
        }
        if ((i7 & 8) != 0) {
            action = serviceNotificationConfiguration.contentAction;
        }
        if ((i7 & 16) != 0) {
            list = serviceNotificationConfiguration.auxiliaryActions;
        }
        if ((i7 & 32) != 0) {
            type = serviceNotificationConfiguration.type;
        }
        if ((i7 & 64) != 0) {
            icon = serviceNotificationConfiguration.icon;
        }
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0) {
            num = serviceNotificationConfiguration.color;
        }
        Icon icon2 = icon;
        Integer num2 = num;
        List list2 = list;
        Type type2 = type;
        return serviceNotificationConfiguration.copy(str, str2, priority, action, list2, type2, icon2, num2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Priority getPriority() {
        return this.priority;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Action getContentAction() {
        return this.contentAction;
    }

    @NotNull
    public final List<Action> component5() {
        return this.auxiliaryActions;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Type getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Icon getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Integer getColor() {
        return this.color;
    }

    @NotNull
    public final ServiceNotificationConfiguration copy(@NotNull String title, String content, @NotNull Priority priority, Action contentAction, @NotNull List<Action> auxiliaryActions, @NotNull Type type, Icon icon, Integer color) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(priority, "priority");
        Intrinsics.checkNotNullParameter(auxiliaryActions, "auxiliaryActions");
        Intrinsics.checkNotNullParameter(type, "type");
        return new ServiceNotificationConfiguration(title, content, priority, contentAction, auxiliaryActions, type, icon, color);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ServiceNotificationConfiguration)) {
            return false;
        }
        ServiceNotificationConfiguration serviceNotificationConfiguration = (ServiceNotificationConfiguration) other;
        return Intrinsics.areEqual(this.title, serviceNotificationConfiguration.title) && Intrinsics.areEqual(this.content, serviceNotificationConfiguration.content) && this.priority == serviceNotificationConfiguration.priority && Intrinsics.areEqual(this.contentAction, serviceNotificationConfiguration.contentAction) && Intrinsics.areEqual(this.auxiliaryActions, serviceNotificationConfiguration.auxiliaryActions) && this.type == serviceNotificationConfiguration.type && this.icon == serviceNotificationConfiguration.icon && Intrinsics.areEqual(this.color, serviceNotificationConfiguration.color);
    }

    @NotNull
    public final List<Action> getAuxiliaryActions() {
        return this.auxiliaryActions;
    }

    public final Integer getColor() {
        return this.color;
    }

    public final String getContent() {
        return this.content;
    }

    public final Action getContentAction() {
        return this.contentAction;
    }

    public final Icon getIcon() {
        return this.icon;
    }

    @NotNull
    public final Priority getPriority() {
        return this.priority;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final Type getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        String str = this.content;
        int iHashCode2 = (this.priority.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        Action action = this.contentAction;
        int iHashCode3 = (this.type.hashCode() + e.f(this.auxiliaryActions, (iHashCode2 + (action == null ? 0 : action.hashCode())) * 31, 31)) * 31;
        Icon icon = this.icon;
        int iHashCode4 = (iHashCode3 + (icon == null ? 0 : icon.hashCode())) * 31;
        Integer num = this.color;
        return iHashCode4 + (num != null ? num.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.title;
        String str2 = this.content;
        Priority priority = this.priority;
        Action action = this.contentAction;
        List<Action> list = this.auxiliaryActions;
        Type type = this.type;
        Icon icon = this.icon;
        Integer num = this.color;
        StringBuilder sbU = e.u("ServiceNotificationConfiguration(title=", str, ", content=", str2, ", priority=");
        sbU.append(priority);
        sbU.append(", contentAction=");
        sbU.append(action);
        sbU.append(", auxiliaryActions=");
        sbU.append(list);
        sbU.append(", type=");
        sbU.append(type);
        sbU.append(", icon=");
        sbU.append(icon);
        sbU.append(", color=");
        sbU.append(num);
        sbU.append(")");
        return sbU.toString();
    }
}

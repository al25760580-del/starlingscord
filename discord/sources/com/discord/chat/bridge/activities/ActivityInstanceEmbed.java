package com.discord.chat.bridge.activities;

import a3.e;
import com.discord.chat.bridge.codedlinks.AppMessageEmbedImpl;
import com.discord.chat.bridge.codedlinks.AppMessageEmbedImpl$$serializer;
import com.discord.primitives.ApplicationId;
import com.discord.primitives.ApplicationId$$serializer;
import i5.a;
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
import or.d;
import or.e1;
import or.s1;
import org.jetbrains.annotations.NotNull;
import rn.l;
import rn.m;

/* JADX INFO: loaded from: classes.dex */
@f
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000223B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000b\u0010\fBS\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u000b\u0010\u0011J\u0010\u0010\u001c\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0013J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\u0011\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007HÆ\u0003J\t\u0010 \u001a\u00020\tHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003JL\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b#\u0010$J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020\u000eHÖ\u0001J\t\u0010)\u001a\u00020\u0005HÖ\u0001J%\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u00002\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u000200H\u0001¢\u0006\u0002\b1R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016¨\u00064"}, d2 = {"Lcom/discord/chat/bridge/activities/ActivityInstanceEmbed;", "", "applicationId", "Lcom/discord/primitives/ApplicationId;", "instanceId", "", "participantAvatarUris", "", "appMessageEmbedModel", "Lcom/discord/chat/bridge/codedlinks/AppMessageEmbedImpl;", "participantsDescription", "<init>", "(JLjava/lang/String;Ljava/util/List;Lcom/discord/chat/bridge/codedlinks/AppMessageEmbedImpl;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/discord/primitives/ApplicationId;Ljava/lang/String;Ljava/util/List;Lcom/discord/chat/bridge/codedlinks/AppMessageEmbedImpl;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getApplicationId-VavddsQ", "()J", "J", "getInstanceId", "()Ljava/lang/String;", "getParticipantAvatarUris", "()Ljava/util/List;", "getAppMessageEmbedModel", "()Lcom/discord/chat/bridge/codedlinks/AppMessageEmbedImpl;", "getParticipantsDescription", "component1", "component1-VavddsQ", "component2", "component3", "component4", "component5", "copy", "copy-Nxq1Yvc", "(JLjava/lang/String;Ljava/util/List;Lcom/discord/chat/bridge/codedlinks/AppMessageEmbedImpl;Ljava/lang/String;)Lcom/discord/chat/bridge/activities/ActivityInstanceEmbed;", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$chat_release", "$serializer", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ActivityInstanceEmbed {

    @NotNull
    private final AppMessageEmbedImpl appMessageEmbedModel;
    private final long applicationId;

    @NotNull
    private final String instanceId;
    private final List<String> participantAvatarUris;
    private final String participantsDescription;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy[] $childSerializers = {null, null, l.a(m.f19486e, new a(14)), null, null};

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/chat/bridge/activities/ActivityInstanceEmbed$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/activities/ActivityInstanceEmbed;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return ActivityInstanceEmbed$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ActivityInstanceEmbed(int i7, ApplicationId applicationId, String str, List list, AppMessageEmbedImpl appMessageEmbedImpl, String str2, SerializationConstructorMarker serializationConstructorMarker, DefaultConstructorMarker defaultConstructorMarker) {
        this(i7, applicationId, str, list, appMessageEmbedImpl, str2, serializationConstructorMarker);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new d(s1.f17602a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: copy-Nxq1Yvc$default, reason: not valid java name */
    public static /* synthetic */ ActivityInstanceEmbed m269copyNxq1Yvc$default(ActivityInstanceEmbed activityInstanceEmbed, long j, String str, List list, AppMessageEmbedImpl appMessageEmbedImpl, String str2, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            j = activityInstanceEmbed.applicationId;
        }
        long j5 = j;
        if ((i7 & 2) != 0) {
            str = activityInstanceEmbed.instanceId;
        }
        String str3 = str;
        if ((i7 & 4) != 0) {
            list = activityInstanceEmbed.participantAvatarUris;
        }
        List list2 = list;
        if ((i7 & 8) != 0) {
            appMessageEmbedImpl = activityInstanceEmbed.appMessageEmbedModel;
        }
        AppMessageEmbedImpl appMessageEmbedImpl2 = appMessageEmbedImpl;
        if ((i7 & 16) != 0) {
            str2 = activityInstanceEmbed.participantsDescription;
        }
        return activityInstanceEmbed.m271copyNxq1Yvc(j5, str3, list2, appMessageEmbedImpl2, str2);
    }

    public static final /* synthetic */ void write$Self$chat_release(ActivityInstanceEmbed self, CompositeEncoder output, SerialDescriptor serialDesc) {
        Lazy[] lazyArr = $childSerializers;
        output.g(serialDesc, 0, ApplicationId$$serializer.INSTANCE, ApplicationId.m1117boximpl(self.applicationId));
        output.q(serialDesc, 1, self.instanceId);
        if (output.u(serialDesc, 2) || self.participantAvatarUris != null) {
            output.r(serialDesc, 2, (KSerializer) lazyArr[2].getValue(), self.participantAvatarUris);
        }
        output.g(serialDesc, 3, AppMessageEmbedImpl$$serializer.INSTANCE, self.appMessageEmbedModel);
        if (!output.u(serialDesc, 4) && self.participantsDescription == null) {
            return;
        }
        output.r(serialDesc, 4, s1.f17602a, self.participantsDescription);
    }

    /* JADX INFO: renamed from: component1-VavddsQ, reason: not valid java name and from getter */
    public final long getApplicationId() {
        return this.applicationId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getInstanceId() {
        return this.instanceId;
    }

    public final List<String> component3() {
        return this.participantAvatarUris;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final AppMessageEmbedImpl getAppMessageEmbedModel() {
        return this.appMessageEmbedModel;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getParticipantsDescription() {
        return this.participantsDescription;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-Nxq1Yvc, reason: not valid java name */
    public final ActivityInstanceEmbed m271copyNxq1Yvc(long applicationId, @NotNull String instanceId, List<String> participantAvatarUris, @NotNull AppMessageEmbedImpl appMessageEmbedModel, String participantsDescription) {
        Intrinsics.checkNotNullParameter(instanceId, "instanceId");
        Intrinsics.checkNotNullParameter(appMessageEmbedModel, "appMessageEmbedModel");
        return new ActivityInstanceEmbed(applicationId, instanceId, participantAvatarUris, appMessageEmbedModel, participantsDescription, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActivityInstanceEmbed)) {
            return false;
        }
        ActivityInstanceEmbed activityInstanceEmbed = (ActivityInstanceEmbed) other;
        return ApplicationId.m1121equalsimpl0(this.applicationId, activityInstanceEmbed.applicationId) && Intrinsics.areEqual(this.instanceId, activityInstanceEmbed.instanceId) && Intrinsics.areEqual(this.participantAvatarUris, activityInstanceEmbed.participantAvatarUris) && Intrinsics.areEqual(this.appMessageEmbedModel, activityInstanceEmbed.appMessageEmbedModel) && Intrinsics.areEqual(this.participantsDescription, activityInstanceEmbed.participantsDescription);
    }

    @NotNull
    public final AppMessageEmbedImpl getAppMessageEmbedModel() {
        return this.appMessageEmbedModel;
    }

    /* JADX INFO: renamed from: getApplicationId-VavddsQ, reason: not valid java name */
    public final long m272getApplicationIdVavddsQ() {
        return this.applicationId;
    }

    @NotNull
    public final String getInstanceId() {
        return this.instanceId;
    }

    public final List<String> getParticipantAvatarUris() {
        return this.participantAvatarUris;
    }

    public final String getParticipantsDescription() {
        return this.participantsDescription;
    }

    public int hashCode() {
        int iD = e.d(ApplicationId.m1122hashCodeimpl(this.applicationId) * 31, 31, this.instanceId);
        List<String> list = this.participantAvatarUris;
        int iHashCode = (this.appMessageEmbedModel.hashCode() + ((iD + (list == null ? 0 : list.hashCode())) * 31)) * 31;
        String str = this.participantsDescription;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String strM1124toStringimpl = ApplicationId.m1124toStringimpl(this.applicationId);
        String str = this.instanceId;
        List<String> list = this.participantAvatarUris;
        AppMessageEmbedImpl appMessageEmbedImpl = this.appMessageEmbedModel;
        String str2 = this.participantsDescription;
        StringBuilder sbU = e.u("ActivityInstanceEmbed(applicationId=", strM1124toStringimpl, ", instanceId=", str, ", participantAvatarUris=");
        sbU.append(list);
        sbU.append(", appMessageEmbedModel=");
        sbU.append(appMessageEmbedImpl);
        sbU.append(", participantsDescription=");
        return com.discord.chat.presentation.list.a.k(sbU, str2, ")");
    }

    public /* synthetic */ ActivityInstanceEmbed(long j, String str, List list, AppMessageEmbedImpl appMessageEmbedImpl, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, str, list, appMessageEmbedImpl, str2);
    }

    private /* synthetic */ ActivityInstanceEmbed(int i7, ApplicationId applicationId, String str, List list, AppMessageEmbedImpl appMessageEmbedImpl, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (11 != (i7 & 11)) {
            e1.l(i7, 11, ActivityInstanceEmbed$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.applicationId = applicationId.m1126unboximpl();
        this.instanceId = str;
        if ((i7 & 4) == 0) {
            this.participantAvatarUris = null;
        } else {
            this.participantAvatarUris = list;
        }
        this.appMessageEmbedModel = appMessageEmbedImpl;
        if ((i7 & 16) == 0) {
            this.participantsDescription = null;
        } else {
            this.participantsDescription = str2;
        }
    }

    private ActivityInstanceEmbed(long j, String instanceId, List<String> list, AppMessageEmbedImpl appMessageEmbedModel, String str) {
        Intrinsics.checkNotNullParameter(instanceId, "instanceId");
        Intrinsics.checkNotNullParameter(appMessageEmbedModel, "appMessageEmbedModel");
        this.applicationId = j;
        this.instanceId = instanceId;
        this.participantAvatarUris = list;
        this.appMessageEmbedModel = appMessageEmbedModel;
        this.participantsDescription = str;
    }

    public /* synthetic */ ActivityInstanceEmbed(long j, String str, List list, AppMessageEmbedImpl appMessageEmbedImpl, String str2, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, str, (i7 & 4) != 0 ? null : list, appMessageEmbedImpl, (i7 & 16) != 0 ? null : str2, null);
    }
}

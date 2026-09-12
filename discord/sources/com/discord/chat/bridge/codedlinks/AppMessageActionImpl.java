package com.discord.chat.bridge.codedlinks;

import a3.e;
import com.facebook.react.devsupport.StackTraceHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kr.f;
import or.e1;
import or.g;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@f
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002&'B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0007\u0010\rJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0012J.\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\nHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J%\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00002\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0001¢\u0006\u0002\b%R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012¨\u0006("}, d2 = {"Lcom/discord/chat/bridge/codedlinks/AppMessageActionImpl;", "Lcom/discord/chat/bridge/codedlinks/AppMessageEmbedAction;", StackTraceHelper.ID_KEY, "", "label", "disabled", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getId", "()Ljava/lang/String;", "getLabel", "getDisabled", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/discord/chat/bridge/codedlinks/AppMessageActionImpl;", "equals", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$chat_release", "$serializer", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class AppMessageActionImpl implements AppMessageEmbedAction {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final Boolean disabled;

    @NotNull
    private final String id;

    @NotNull
    private final String label;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/chat/bridge/codedlinks/AppMessageActionImpl$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/codedlinks/AppMessageActionImpl;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return AppMessageActionImpl$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ AppMessageActionImpl(int i7, String str, String str2, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i7 & 3)) {
            e1.l(i7, 3, AppMessageActionImpl$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = str;
        this.label = str2;
        if ((i7 & 4) == 0) {
            this.disabled = null;
        } else {
            this.disabled = bool;
        }
    }

    public static /* synthetic */ AppMessageActionImpl copy$default(AppMessageActionImpl appMessageActionImpl, String str, String str2, Boolean bool, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = appMessageActionImpl.id;
        }
        if ((i7 & 2) != 0) {
            str2 = appMessageActionImpl.label;
        }
        if ((i7 & 4) != 0) {
            bool = appMessageActionImpl.disabled;
        }
        return appMessageActionImpl.copy(str, str2, bool);
    }

    public static final /* synthetic */ void write$Self$chat_release(AppMessageActionImpl self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.getId());
        output.q(serialDesc, 1, self.getLabel());
        if (!output.u(serialDesc, 2) && self.getDisabled() == null) {
            return;
        }
        output.r(serialDesc, 2, g.f17537a, self.getDisabled());
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getDisabled() {
        return this.disabled;
    }

    @NotNull
    public final AppMessageActionImpl copy(@NotNull String id2, @NotNull String label, Boolean disabled) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(label, "label");
        return new AppMessageActionImpl(id2, label, disabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppMessageActionImpl)) {
            return false;
        }
        AppMessageActionImpl appMessageActionImpl = (AppMessageActionImpl) other;
        return Intrinsics.areEqual(this.id, appMessageActionImpl.id) && Intrinsics.areEqual(this.label, appMessageActionImpl.label) && Intrinsics.areEqual(this.disabled, appMessageActionImpl.disabled);
    }

    @Override // com.discord.chat.bridge.codedlinks.AppMessageEmbedAction
    public Boolean getDisabled() {
        return this.disabled;
    }

    @Override // com.discord.chat.bridge.codedlinks.AppMessageEmbedAction
    @NotNull
    public String getId() {
        return this.id;
    }

    @Override // com.discord.chat.bridge.codedlinks.AppMessageEmbedAction
    @NotNull
    public String getLabel() {
        return this.label;
    }

    public int hashCode() {
        int iD = e.d(this.id.hashCode() * 31, 31, this.label);
        Boolean bool = this.disabled;
        return iD + (bool == null ? 0 : bool.hashCode());
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.label;
        Boolean bool = this.disabled;
        StringBuilder sbU = e.u("AppMessageActionImpl(id=", str, ", label=", str2, ", disabled=");
        sbU.append(bool);
        sbU.append(")");
        return sbU.toString();
    }

    public AppMessageActionImpl(@NotNull String id2, @NotNull String label, Boolean bool) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(label, "label");
        this.id = id2;
        this.label = label;
        this.disabled = bool;
    }

    public /* synthetic */ AppMessageActionImpl(String str, String str2, Boolean bool, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i7 & 4) != 0 ? null : bool);
    }
}

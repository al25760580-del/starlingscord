package com.discord.chat.bridge.polls;

import com.facebook.react.uimanager.ViewProps;
import kk.b;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kr.f;
import o5.a;
import or.e1;
import or.s1;
import org.jetbrains.annotations.NotNull;
import rn.l;
import rn.m;

/* JADX INFO: loaded from: classes.dex */
@f
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 02\u00020\u0001:\u0002/0BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fBU\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u000b\u0010\u0011J\u0006\u0010\u001b\u001a\u00020\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003JK\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010#\u001a\u00020\u00072\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\u000eHÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001J%\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u00002\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-H\u0001¢\u0006\u0002\b.R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013¨\u00061"}, d2 = {"Lcom/discord/chat/bridge/polls/PollAction;", "", "label", "", "presentation", "Lcom/discord/chat/bridge/polls/PollActionPresentation;", ViewProps.ENABLED, "", "type", "secondaryLabel", ViewProps.ACCESSIBILITY_HINT, "<init>", "(Ljava/lang/String;Lcom/discord/chat/bridge/polls/PollActionPresentation;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/discord/chat/bridge/polls/PollActionPresentation;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getLabel", "()Ljava/lang/String;", "getPresentation", "()Lcom/discord/chat/bridge/polls/PollActionPresentation;", "getEnabled", "()Z", "getType", "getSecondaryLabel", "getAccessibilityHint", "getFullTextLabel", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$chat_release", "$serializer", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class PollAction {
    private final String accessibilityHint;
    private final boolean enabled;

    @NotNull
    private final String label;

    @NotNull
    private final PollActionPresentation presentation;
    private final String secondaryLabel;
    private final String type;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy[] $childSerializers = {null, l.a(m.f19486e, new a(15)), null, null, null, null};

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/chat/bridge/polls/PollAction$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/polls/PollAction;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return PollAction$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ PollAction(int i7, String str, PollActionPresentation pollActionPresentation, boolean z5, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i7 & 7)) {
            e1.l(i7, 7, PollAction$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.label = str;
        this.presentation = pollActionPresentation;
        this.enabled = z5;
        if ((i7 & 8) == 0) {
            this.type = null;
        } else {
            this.type = str2;
        }
        if ((i7 & 16) == 0) {
            this.secondaryLabel = null;
        } else {
            this.secondaryLabel = str3;
        }
        if ((i7 & 32) == 0) {
            this.accessibilityHint = null;
        } else {
            this.accessibilityHint = str4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return PollActionPresentation.INSTANCE.serializer();
    }

    public static /* synthetic */ PollAction copy$default(PollAction pollAction, String str, PollActionPresentation pollActionPresentation, boolean z5, String str2, String str3, String str4, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = pollAction.label;
        }
        if ((i7 & 2) != 0) {
            pollActionPresentation = pollAction.presentation;
        }
        if ((i7 & 4) != 0) {
            z5 = pollAction.enabled;
        }
        if ((i7 & 8) != 0) {
            str2 = pollAction.type;
        }
        if ((i7 & 16) != 0) {
            str3 = pollAction.secondaryLabel;
        }
        if ((i7 & 32) != 0) {
            str4 = pollAction.accessibilityHint;
        }
        String str5 = str3;
        String str6 = str4;
        return pollAction.copy(str, pollActionPresentation, z5, str2, str5, str6);
    }

    public static final /* synthetic */ void write$Self$chat_release(PollAction self, CompositeEncoder output, SerialDescriptor serialDesc) {
        Lazy[] lazyArr = $childSerializers;
        output.q(serialDesc, 0, self.label);
        output.g(serialDesc, 1, (KSerializer) lazyArr[1].getValue(), self.presentation);
        output.p(serialDesc, 2, self.enabled);
        if (output.u(serialDesc, 3) || self.type != null) {
            output.r(serialDesc, 3, s1.f17602a, self.type);
        }
        if (output.u(serialDesc, 4) || self.secondaryLabel != null) {
            output.r(serialDesc, 4, s1.f17602a, self.secondaryLabel);
        }
        if (!output.u(serialDesc, 5) && self.accessibilityHint == null) {
            return;
        }
        output.r(serialDesc, 5, s1.f17602a, self.accessibilityHint);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final PollActionPresentation getPresentation() {
        return this.presentation;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSecondaryLabel() {
        return this.secondaryLabel;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getAccessibilityHint() {
        return this.accessibilityHint;
    }

    @NotNull
    public final PollAction copy(@NotNull String label, @NotNull PollActionPresentation presentation, boolean enabled, String type, String secondaryLabel, String accessibilityHint) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(presentation, "presentation");
        return new PollAction(label, presentation, enabled, type, secondaryLabel, accessibilityHint);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PollAction)) {
            return false;
        }
        PollAction pollAction = (PollAction) other;
        return Intrinsics.areEqual(this.label, pollAction.label) && this.presentation == pollAction.presentation && this.enabled == pollAction.enabled && Intrinsics.areEqual(this.type, pollAction.type) && Intrinsics.areEqual(this.secondaryLabel, pollAction.secondaryLabel) && Intrinsics.areEqual(this.accessibilityHint, pollAction.accessibilityHint);
    }

    public final String getAccessibilityHint() {
        return this.accessibilityHint;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    @NotNull
    public final String getFullTextLabel() {
        String str = this.secondaryLabel;
        return str == null ? this.label : b.k(this.label, "  •  ", str);
    }

    @NotNull
    public final String getLabel() {
        return this.label;
    }

    @NotNull
    public final PollActionPresentation getPresentation() {
        return this.presentation;
    }

    public final String getSecondaryLabel() {
        return this.secondaryLabel;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int iG = com.discord.chat.presentation.list.a.g((this.presentation.hashCode() + (this.label.hashCode() * 31)) * 31, 31, this.enabled);
        String str = this.type;
        int iHashCode = (iG + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.secondaryLabel;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.accessibilityHint;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.label;
        PollActionPresentation pollActionPresentation = this.presentation;
        boolean z5 = this.enabled;
        String str2 = this.type;
        String str3 = this.secondaryLabel;
        String str4 = this.accessibilityHint;
        StringBuilder sb2 = new StringBuilder("PollAction(label=");
        sb2.append(str);
        sb2.append(", presentation=");
        sb2.append(pollActionPresentation);
        sb2.append(", enabled=");
        sb2.append(z5);
        sb2.append(", type=");
        sb2.append(str2);
        sb2.append(", secondaryLabel=");
        return com.discord.chat.presentation.list.a.l(sb2, str3, ", accessibilityHint=", str4, ")");
    }

    public PollAction(@NotNull String label, @NotNull PollActionPresentation presentation, boolean z5, String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(presentation, "presentation");
        this.label = label;
        this.presentation = presentation;
        this.enabled = z5;
        this.type = str;
        this.secondaryLabel = str2;
        this.accessibilityHint = str3;
    }

    public /* synthetic */ PollAction(String str, PollActionPresentation pollActionPresentation, boolean z5, String str2, String str3, String str4, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, pollActionPresentation, z5, (i7 & 8) != 0 ? null : str2, (i7 & 16) != 0 ? null : str3, (i7 & 32) != 0 ? null : str4);
    }
}

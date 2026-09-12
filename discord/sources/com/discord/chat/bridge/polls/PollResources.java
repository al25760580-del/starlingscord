package com.discord.chat.bridge.polls;

import a3.e;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.collections.w0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kr.f;
import o5.a;
import or.e1;
import or.h0;
import or.s1;
import org.jetbrains.annotations.NotNull;
import rn.l;
import rn.m;

/* JADX INFO: loaded from: classes.dex */
@f
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002()B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tBE\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\b\u0010\u000eJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J3\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u000bHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J%\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00002\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0001¢\u0006\u0002\b'R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006*"}, d2 = {"Lcom/discord/chat/bridge/polls/PollResources;", "", "selectedIcon", "", "checkmarkIcon", "styles", "", "Lcom/discord/chat/bridge/polls/PollStyleSet;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getSelectedIcon", "()Ljava/lang/String;", "getCheckmarkIcon", "getStyles", "()Ljava/util/Map;", "defaultStyle", "getDefaultStyle", "()Lcom/discord/chat/bridge/polls/PollStyleSet;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$chat_release", "$serializer", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class PollResources {

    @NotNull
    private final String checkmarkIcon;

    @NotNull
    private final String selectedIcon;

    @NotNull
    private final Map<String, PollStyleSet> styles;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy[] $childSerializers = {null, null, l.a(m.f19486e, new a(19))};

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/chat/bridge/polls/PollResources$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/polls/PollResources;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return PollResources$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ PollResources(int i7, String str, String str2, Map map, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i7 & 3)) {
            e1.l(i7, 3, PollResources$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.selectedIcon = str;
        this.checkmarkIcon = str2;
        if ((i7 & 4) == 0) {
            this.styles = w0.d();
        } else {
            this.styles = map;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new h0(s1.f17602a, PollStyleSet$$serializer.INSTANCE, 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PollResources copy$default(PollResources pollResources, String str, String str2, Map map, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = pollResources.selectedIcon;
        }
        if ((i7 & 2) != 0) {
            str2 = pollResources.checkmarkIcon;
        }
        if ((i7 & 4) != 0) {
            map = pollResources.styles;
        }
        return pollResources.copy(str, str2, map);
    }

    public static final /* synthetic */ void write$Self$chat_release(PollResources self, CompositeEncoder output, SerialDescriptor serialDesc) {
        Lazy[] lazyArr = $childSerializers;
        output.q(serialDesc, 0, self.selectedIcon);
        output.q(serialDesc, 1, self.checkmarkIcon);
        if (!output.u(serialDesc, 2) && Intrinsics.areEqual(self.styles, w0.d())) {
            return;
        }
        output.g(serialDesc, 2, (KSerializer) lazyArr[2].getValue(), self.styles);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSelectedIcon() {
        return this.selectedIcon;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCheckmarkIcon() {
        return this.checkmarkIcon;
    }

    @NotNull
    public final Map<String, PollStyleSet> component3() {
        return this.styles;
    }

    @NotNull
    public final PollResources copy(@NotNull String selectedIcon, @NotNull String checkmarkIcon, @NotNull Map<String, PollStyleSet> styles) {
        Intrinsics.checkNotNullParameter(selectedIcon, "selectedIcon");
        Intrinsics.checkNotNullParameter(checkmarkIcon, "checkmarkIcon");
        Intrinsics.checkNotNullParameter(styles, "styles");
        return new PollResources(selectedIcon, checkmarkIcon, styles);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PollResources)) {
            return false;
        }
        PollResources pollResources = (PollResources) other;
        return Intrinsics.areEqual(this.selectedIcon, pollResources.selectedIcon) && Intrinsics.areEqual(this.checkmarkIcon, pollResources.checkmarkIcon) && Intrinsics.areEqual(this.styles, pollResources.styles);
    }

    @NotNull
    public final String getCheckmarkIcon() {
        return this.checkmarkIcon;
    }

    @NotNull
    public final PollStyleSet getDefaultStyle() {
        PollStyleSet pollStyleSet = this.styles.get("normal");
        return pollStyleSet == null ? PollStyleSet.INSTANCE.getDEFAULT() : pollStyleSet;
    }

    @NotNull
    public final String getSelectedIcon() {
        return this.selectedIcon;
    }

    @NotNull
    public final Map<String, PollStyleSet> getStyles() {
        return this.styles;
    }

    public int hashCode() {
        return this.styles.hashCode() + e.d(this.selectedIcon.hashCode() * 31, 31, this.checkmarkIcon);
    }

    @NotNull
    public String toString() {
        String str = this.selectedIcon;
        String str2 = this.checkmarkIcon;
        Map<String, PollStyleSet> map = this.styles;
        StringBuilder sbU = e.u("PollResources(selectedIcon=", str, ", checkmarkIcon=", str2, ", styles=");
        sbU.append(map);
        sbU.append(")");
        return sbU.toString();
    }

    public PollResources(@NotNull String selectedIcon, @NotNull String checkmarkIcon, @NotNull Map<String, PollStyleSet> styles) {
        Intrinsics.checkNotNullParameter(selectedIcon, "selectedIcon");
        Intrinsics.checkNotNullParameter(checkmarkIcon, "checkmarkIcon");
        Intrinsics.checkNotNullParameter(styles, "styles");
        this.selectedIcon = selectedIcon;
        this.checkmarkIcon = checkmarkIcon;
        this.styles = styles;
    }

    public /* synthetic */ PollResources(String str, String str2, Map map, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i7 & 4) != 0 ? w0.d() : map);
    }
}

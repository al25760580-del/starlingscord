package com.discord.chat.reactevents;

import com.discord.reactevents.ReactEvent;
import com.facebook.react.bridge.WritableMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kr.f;
import or.e1;
import org.jetbrains.annotations.NotNull;
import s0.g;

/* JADX INFO: loaded from: classes.dex */
@f
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0002 !B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0005\u0010\u000bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\bHÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J%\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0001¢\u0006\u0002\b\u001fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\""}, d2 = {"Lcom/discord/chat/reactevents/TapSafetySystemNotificationCta;", "Lcom/discord/reactevents/ReactEvent;", "ctaType", "", "ctaKey", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getCtaType", "()Ljava/lang/String;", "getCtaKey", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$chat_release", "$serializer", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class TapSafetySystemNotificationCta implements ReactEvent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String ctaKey;

    @NotNull
    private final String ctaType;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/chat/reactevents/TapSafetySystemNotificationCta$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/reactevents/TapSafetySystemNotificationCta;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return TapSafetySystemNotificationCta$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ TapSafetySystemNotificationCta(int i7, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i7 & 3)) {
            e1.l(i7, 3, TapSafetySystemNotificationCta$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.ctaType = str;
        this.ctaKey = str2;
    }

    public static /* synthetic */ TapSafetySystemNotificationCta copy$default(TapSafetySystemNotificationCta tapSafetySystemNotificationCta, String str, String str2, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = tapSafetySystemNotificationCta.ctaType;
        }
        if ((i7 & 2) != 0) {
            str2 = tapSafetySystemNotificationCta.ctaKey;
        }
        return tapSafetySystemNotificationCta.copy(str, str2);
    }

    public static final /* synthetic */ void write$Self$chat_release(TapSafetySystemNotificationCta self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.ctaType);
        output.q(serialDesc, 1, self.ctaKey);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCtaType() {
        return this.ctaType;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCtaKey() {
        return this.ctaKey;
    }

    @NotNull
    public final TapSafetySystemNotificationCta copy(@NotNull String ctaType, @NotNull String ctaKey) {
        Intrinsics.checkNotNullParameter(ctaType, "ctaType");
        Intrinsics.checkNotNullParameter(ctaKey, "ctaKey");
        return new TapSafetySystemNotificationCta(ctaType, ctaKey);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TapSafetySystemNotificationCta)) {
            return false;
        }
        TapSafetySystemNotificationCta tapSafetySystemNotificationCta = (TapSafetySystemNotificationCta) other;
        return Intrinsics.areEqual(this.ctaType, tapSafetySystemNotificationCta.ctaType) && Intrinsics.areEqual(this.ctaKey, tapSafetySystemNotificationCta.ctaKey);
    }

    @NotNull
    public final String getCtaKey() {
        return this.ctaKey;
    }

    @NotNull
    public final String getCtaType() {
        return this.ctaType;
    }

    public int hashCode() {
        return this.ctaKey.hashCode() + (this.ctaType.hashCode() * 31);
    }

    @Override // com.discord.reactevents.ReactEvent
    @NotNull
    /* JADX INFO: renamed from: serialize */
    public WritableMap getData() {
        return ReactEvent.DefaultImpls.serialize(this);
    }

    @NotNull
    public String toString() {
        return g.f("TapSafetySystemNotificationCta(ctaType=", this.ctaType, ", ctaKey=", this.ctaKey, ")");
    }

    public TapSafetySystemNotificationCta(@NotNull String ctaType, @NotNull String ctaKey) {
        Intrinsics.checkNotNullParameter(ctaType, "ctaType");
        Intrinsics.checkNotNullParameter(ctaKey, "ctaKey");
        this.ctaType = ctaType;
        this.ctaKey = ctaKey;
    }
}

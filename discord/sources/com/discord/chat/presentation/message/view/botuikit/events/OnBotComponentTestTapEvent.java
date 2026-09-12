package com.discord.chat.presentation.message.view.botuikit.events;

import com.discord.reactevents.ReactEvent;
import com.facebook.react.bridge.WritableMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kr.f;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@f
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001d\u001eB\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B#\b\u0010\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0004\u0010\nJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J%\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0001¢\u0006\u0002\b\u001cR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001f"}, d2 = {"Lcom/discord/chat/presentation/message/view/botuikit/events/OnBotComponentTestTapEvent;", "Lcom/discord/reactevents/ReactEvent;", "dummy", "", "<init>", "(Z)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getDummy", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$chat_release", "$serializer", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class OnBotComponentTestTapEvent implements ReactEvent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final boolean dummy;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/chat/presentation/message/view/botuikit/events/OnBotComponentTestTapEvent$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/presentation/message/view/botuikit/events/OnBotComponentTestTapEvent;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return OnBotComponentTestTapEvent$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public OnBotComponentTestTapEvent() {
        this(false, 1, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ OnBotComponentTestTapEvent copy$default(OnBotComponentTestTapEvent onBotComponentTestTapEvent, boolean z5, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            z5 = onBotComponentTestTapEvent.dummy;
        }
        return onBotComponentTestTapEvent.copy(z5);
    }

    public static final /* synthetic */ void write$Self$chat_release(OnBotComponentTestTapEvent self, CompositeEncoder output, SerialDescriptor serialDesc) {
        if (!output.u(serialDesc, 0) && self.dummy) {
            return;
        }
        output.p(serialDesc, 0, self.dummy);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getDummy() {
        return this.dummy;
    }

    @NotNull
    public final OnBotComponentTestTapEvent copy(boolean dummy) {
        return new OnBotComponentTestTapEvent(dummy);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof OnBotComponentTestTapEvent) && this.dummy == ((OnBotComponentTestTapEvent) other).dummy;
    }

    public final boolean getDummy() {
        return this.dummy;
    }

    public int hashCode() {
        return Boolean.hashCode(this.dummy);
    }

    @Override // com.discord.reactevents.ReactEvent
    @NotNull
    public WritableMap serialize() {
        return ReactEvent.DefaultImpls.serialize(this);
    }

    @NotNull
    public String toString() {
        return "OnBotComponentTestTapEvent(dummy=" + this.dummy + ")";
    }

    public /* synthetic */ OnBotComponentTestTapEvent(int i7, boolean z5, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i7 & 1) == 0) {
            this.dummy = true;
        } else {
            this.dummy = z5;
        }
    }

    public OnBotComponentTestTapEvent(boolean z5) {
        this.dummy = z5;
    }

    public /* synthetic */ OnBotComponentTestTapEvent(boolean z5, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? true : z5);
    }
}

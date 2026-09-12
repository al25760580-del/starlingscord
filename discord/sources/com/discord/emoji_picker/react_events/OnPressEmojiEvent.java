package com.discord.emoji_picker.react_events;

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
import or.s1;
import org.jetbrains.annotations.NotNull;
import s0.g;

/* JADX INFO: loaded from: classes.dex */
@f
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 !2\u00020\u0001:\u0002 !B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0005\u0010\u000bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\bHÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J%\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0001¢\u0006\u0002\b\u001fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\""}, d2 = {"Lcom/discord/emoji_picker/react_events/OnPressEmojiEvent;", "Lcom/discord/reactevents/ReactEvent;", "emojiName", "", "emojiId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getEmojiName", "()Ljava/lang/String;", "getEmojiId", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$emoji_picker_release", "$serializer", "Companion", "emoji_picker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class OnPressEmojiEvent implements ReactEvent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final String emojiId;

    @NotNull
    private final String emojiName;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/emoji_picker/react_events/OnPressEmojiEvent$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/emoji_picker/react_events/OnPressEmojiEvent;", "emoji_picker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return OnPressEmojiEvent$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ OnPressEmojiEvent(int i7, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i7 & 1)) {
            e1.l(i7, 1, OnPressEmojiEvent$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.emojiName = str;
        if ((i7 & 2) == 0) {
            this.emojiId = null;
        } else {
            this.emojiId = str2;
        }
    }

    public static /* synthetic */ OnPressEmojiEvent copy$default(OnPressEmojiEvent onPressEmojiEvent, String str, String str2, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = onPressEmojiEvent.emojiName;
        }
        if ((i7 & 2) != 0) {
            str2 = onPressEmojiEvent.emojiId;
        }
        return onPressEmojiEvent.copy(str, str2);
    }

    public static final /* synthetic */ void write$Self$emoji_picker_release(OnPressEmojiEvent self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.emojiName);
        if (!output.u(serialDesc, 1) && self.emojiId == null) {
            return;
        }
        output.r(serialDesc, 1, s1.f17602a, self.emojiId);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEmojiName() {
        return this.emojiName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getEmojiId() {
        return this.emojiId;
    }

    @NotNull
    public final OnPressEmojiEvent copy(@NotNull String emojiName, String emojiId) {
        Intrinsics.checkNotNullParameter(emojiName, "emojiName");
        return new OnPressEmojiEvent(emojiName, emojiId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OnPressEmojiEvent)) {
            return false;
        }
        OnPressEmojiEvent onPressEmojiEvent = (OnPressEmojiEvent) other;
        return Intrinsics.areEqual(this.emojiName, onPressEmojiEvent.emojiName) && Intrinsics.areEqual(this.emojiId, onPressEmojiEvent.emojiId);
    }

    public final String getEmojiId() {
        return this.emojiId;
    }

    @NotNull
    public final String getEmojiName() {
        return this.emojiName;
    }

    public int hashCode() {
        int iHashCode = this.emojiName.hashCode() * 31;
        String str = this.emojiId;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // com.discord.reactevents.ReactEvent
    @NotNull
    /* JADX INFO: renamed from: serialize */
    public WritableMap getData() {
        return ReactEvent.DefaultImpls.serialize(this);
    }

    @NotNull
    public String toString() {
        return g.f("OnPressEmojiEvent(emojiName=", this.emojiName, ", emojiId=", this.emojiId, ")");
    }

    public OnPressEmojiEvent(@NotNull String emojiName, String str) {
        Intrinsics.checkNotNullParameter(emojiName, "emojiName");
        this.emojiName = emojiName;
        this.emojiId = str;
    }

    public /* synthetic */ OnPressEmojiEvent(String str, String str2, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i7 & 2) != 0 ? null : str2);
    }
}

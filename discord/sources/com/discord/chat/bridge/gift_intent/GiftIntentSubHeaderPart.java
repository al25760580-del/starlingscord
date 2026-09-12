package com.discord.chat.bridge.gift_intent;

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

/* JADX INFO: loaded from: classes.dex */
@f
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0002 !B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0006\u0010\fJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\tHÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J%\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0001¢\u0006\u0002\b\u001fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\""}, d2 = {"Lcom/discord/chat/bridge/gift_intent/GiftIntentSubHeaderPart;", "", "text", "", "bold", "", "<init>", "(Ljava/lang/String;Z)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getText", "()Ljava/lang/String;", "getBold", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$chat_release", "$serializer", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class GiftIntentSubHeaderPart {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final boolean bold;

    @NotNull
    private final String text;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/chat/bridge/gift_intent/GiftIntentSubHeaderPart$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/gift_intent/GiftIntentSubHeaderPart;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return GiftIntentSubHeaderPart$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ GiftIntentSubHeaderPart(int i7, String str, boolean z5, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i7 & 1)) {
            e1.l(i7, 1, GiftIntentSubHeaderPart$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.text = str;
        if ((i7 & 2) == 0) {
            this.bold = false;
        } else {
            this.bold = z5;
        }
    }

    public static /* synthetic */ GiftIntentSubHeaderPart copy$default(GiftIntentSubHeaderPart giftIntentSubHeaderPart, String str, boolean z5, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = giftIntentSubHeaderPart.text;
        }
        if ((i7 & 2) != 0) {
            z5 = giftIntentSubHeaderPart.bold;
        }
        return giftIntentSubHeaderPart.copy(str, z5);
    }

    public static final /* synthetic */ void write$Self$chat_release(GiftIntentSubHeaderPart self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.text);
        if (output.u(serialDesc, 1) || self.bold) {
            output.p(serialDesc, 1, self.bold);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getBold() {
        return this.bold;
    }

    @NotNull
    public final GiftIntentSubHeaderPart copy(@NotNull String text, boolean bold) {
        Intrinsics.checkNotNullParameter(text, "text");
        return new GiftIntentSubHeaderPart(text, bold);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GiftIntentSubHeaderPart)) {
            return false;
        }
        GiftIntentSubHeaderPart giftIntentSubHeaderPart = (GiftIntentSubHeaderPart) other;
        return Intrinsics.areEqual(this.text, giftIntentSubHeaderPart.text) && this.bold == giftIntentSubHeaderPart.bold;
    }

    public final boolean getBold() {
        return this.bold;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return Boolean.hashCode(this.bold) + (this.text.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "GiftIntentSubHeaderPart(text=" + this.text + ", bold=" + this.bold + ")";
    }

    public GiftIntentSubHeaderPart(@NotNull String text, boolean z5) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.text = text;
        this.bold = z5;
    }

    public /* synthetic */ GiftIntentSubHeaderPart(String str, boolean z5, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i7 & 2) != 0 ? false : z5);
    }
}

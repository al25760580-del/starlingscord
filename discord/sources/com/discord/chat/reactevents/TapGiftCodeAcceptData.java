package com.discord.chat.reactevents;

import com.discord.primitives.MessageId;
import com.discord.primitives.MessageId$$serializer;
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
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002%&B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0006\u0010\fJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000eJ&\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\tHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J%\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00002\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0001¢\u0006\u0002\b$R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000f\u0010\u000e¨\u0006'"}, d2 = {"Lcom/discord/chat/reactevents/TapGiftCodeAcceptData;", "Lcom/discord/reactevents/ReactEvent;", "giftCode", "", "messageId", "Lcom/discord/primitives/MessageId;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getGiftCode", "()Ljava/lang/String;", "getMessageId-N_6c4I0", "Ljava/lang/String;", "component1", "component2", "component2-N_6c4I0", "copy", "copy-NU4t8f8", "(Ljava/lang/String;Ljava/lang/String;)Lcom/discord/chat/reactevents/TapGiftCodeAcceptData;", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$chat_release", "$serializer", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class TapGiftCodeAcceptData implements ReactEvent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String giftCode;
    private final String messageId;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/chat/reactevents/TapGiftCodeAcceptData$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/reactevents/TapGiftCodeAcceptData;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return TapGiftCodeAcceptData$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ TapGiftCodeAcceptData(int i7, String str, String str2, SerializationConstructorMarker serializationConstructorMarker, DefaultConstructorMarker defaultConstructorMarker) {
        this(i7, str, str2, serializationConstructorMarker);
    }

    /* JADX INFO: renamed from: copy-NU4t8f8$default, reason: not valid java name */
    public static /* synthetic */ TapGiftCodeAcceptData m867copyNU4t8f8$default(TapGiftCodeAcceptData tapGiftCodeAcceptData, String str, String str2, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = tapGiftCodeAcceptData.giftCode;
        }
        if ((i7 & 2) != 0) {
            str2 = tapGiftCodeAcceptData.messageId;
        }
        return tapGiftCodeAcceptData.m869copyNU4t8f8(str, str2);
    }

    public static final /* synthetic */ void write$Self$chat_release(TapGiftCodeAcceptData self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.giftCode);
        MessageId$$serializer messageId$$serializer = MessageId$$serializer.INSTANCE;
        String str = self.messageId;
        output.r(serialDesc, 1, messageId$$serializer, str != null ? MessageId.m1156boximpl(str) : null);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getGiftCode() {
        return this.giftCode;
    }

    /* JADX INFO: renamed from: component2-N_6c4I0, reason: not valid java name and from getter */
    public final String getMessageId() {
        return this.messageId;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-NU4t8f8, reason: not valid java name */
    public final TapGiftCodeAcceptData m869copyNU4t8f8(@NotNull String giftCode, String messageId) {
        Intrinsics.checkNotNullParameter(giftCode, "giftCode");
        return new TapGiftCodeAcceptData(giftCode, messageId, null);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0021  */
    public boolean equals(Object other) {
        boolean zM1160equalsimpl0;
        if (this == other) {
            return true;
        }
        if (!(other instanceof TapGiftCodeAcceptData)) {
            return false;
        }
        TapGiftCodeAcceptData tapGiftCodeAcceptData = (TapGiftCodeAcceptData) other;
        if (!Intrinsics.areEqual(this.giftCode, tapGiftCodeAcceptData.giftCode)) {
            return false;
        }
        String str = this.messageId;
        String str2 = tapGiftCodeAcceptData.messageId;
        if (str == null) {
            if (str2 == null) {
                zM1160equalsimpl0 = true;
            } else {
                zM1160equalsimpl0 = false;
            }
        } else if (str2 == null) {
            zM1160equalsimpl0 = false;
        } else {
            zM1160equalsimpl0 = MessageId.m1160equalsimpl0(str, str2);
        }
        return zM1160equalsimpl0;
    }

    @NotNull
    public final String getGiftCode() {
        return this.giftCode;
    }

    /* JADX INFO: renamed from: getMessageId-N_6c4I0, reason: not valid java name */
    public final String m870getMessageIdN_6c4I0() {
        return this.messageId;
    }

    public int hashCode() {
        int iHashCode = this.giftCode.hashCode() * 31;
        String str = this.messageId;
        return iHashCode + (str == null ? 0 : MessageId.m1161hashCodeimpl(str));
    }

    @Override // com.discord.reactevents.ReactEvent
    @NotNull
    /* JADX INFO: renamed from: serialize */
    public WritableMap getData() {
        return ReactEvent.DefaultImpls.serialize(this);
    }

    @NotNull
    public String toString() {
        String str = this.giftCode;
        String str2 = this.messageId;
        return g.f("TapGiftCodeAcceptData(giftCode=", str, ", messageId=", str2 == null ? "null" : MessageId.m1163toStringimpl(str2), ")");
    }

    public /* synthetic */ TapGiftCodeAcceptData(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2);
    }

    private /* synthetic */ TapGiftCodeAcceptData(int i7, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i7 & 3)) {
            e1.l(i7, 3, TapGiftCodeAcceptData$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.giftCode = str;
        this.messageId = str2;
    }

    private TapGiftCodeAcceptData(String giftCode, String str) {
        Intrinsics.checkNotNullParameter(giftCode, "giftCode");
        this.giftCode = giftCode;
        this.messageId = str;
    }
}

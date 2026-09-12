package com.discord.chat.bridge.embed;

import a3.e;
import com.discord.chat.bridge.structurabletext.StructurableText;
import com.discord.chat.bridge.structurabletext.StructurableTextSerializer;
import com.facebook.react.devsupport.StackTraceHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kr.f;
import or.s1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@f
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002'(B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\b\u0010\u000eJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003J9\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u000bHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J%\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0001¢\u0006\u0002\b&R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013¨\u0006)"}, d2 = {"Lcom/discord/chat/bridge/embed/EmbedField;", "", "rawName", "", "rawValue", StackTraceHelper.NAME_KEY, "Lcom/discord/chat/bridge/structurabletext/StructurableText;", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/structurabletext/StructurableText;Lcom/discord/chat/bridge/structurabletext/StructurableText;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/structurabletext/StructurableText;Lcom/discord/chat/bridge/structurabletext/StructurableText;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getRawName", "()Ljava/lang/String;", "getRawValue", "getName", "()Lcom/discord/chat/bridge/structurabletext/StructurableText;", "getValue", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$chat_release", "$serializer", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class EmbedField {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final StructurableText name;
    private final String rawName;
    private final String rawValue;
    private final StructurableText value;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/chat/bridge/embed/EmbedField$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/embed/EmbedField;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return EmbedField$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public EmbedField() {
        this((String) null, (String) null, (StructurableText) null, (StructurableText) null, 15, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ EmbedField copy$default(EmbedField embedField, String str, String str2, StructurableText structurableText, StructurableText structurableText2, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = embedField.rawName;
        }
        if ((i7 & 2) != 0) {
            str2 = embedField.rawValue;
        }
        if ((i7 & 4) != 0) {
            structurableText = embedField.name;
        }
        if ((i7 & 8) != 0) {
            structurableText2 = embedField.value;
        }
        return embedField.copy(str, str2, structurableText, structurableText2);
    }

    public static final /* synthetic */ void write$Self$chat_release(EmbedField self, CompositeEncoder output, SerialDescriptor serialDesc) {
        if (output.u(serialDesc, 0) || self.rawName != null) {
            output.r(serialDesc, 0, s1.f17602a, self.rawName);
        }
        if (output.u(serialDesc, 1) || self.rawValue != null) {
            output.r(serialDesc, 1, s1.f17602a, self.rawValue);
        }
        if (output.u(serialDesc, 2) || self.name != null) {
            output.r(serialDesc, 2, StructurableTextSerializer.INSTANCE, self.name);
        }
        if (!output.u(serialDesc, 3) && self.value == null) {
            return;
        }
        output.r(serialDesc, 3, StructurableTextSerializer.INSTANCE, self.value);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRawName() {
        return this.rawName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRawValue() {
        return this.rawValue;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final StructurableText getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final StructurableText getValue() {
        return this.value;
    }

    @NotNull
    public final EmbedField copy(String rawName, String rawValue, StructurableText name, StructurableText value) {
        return new EmbedField(rawName, rawValue, name, value);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EmbedField)) {
            return false;
        }
        EmbedField embedField = (EmbedField) other;
        return Intrinsics.areEqual(this.rawName, embedField.rawName) && Intrinsics.areEqual(this.rawValue, embedField.rawValue) && Intrinsics.areEqual(this.name, embedField.name) && Intrinsics.areEqual(this.value, embedField.value);
    }

    public final StructurableText getName() {
        return this.name;
    }

    public final String getRawName() {
        return this.rawName;
    }

    public final String getRawValue() {
        return this.rawValue;
    }

    public final StructurableText getValue() {
        return this.value;
    }

    public int hashCode() {
        String str = this.rawName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.rawValue;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        StructurableText structurableText = this.name;
        int iHashCode3 = (iHashCode2 + (structurableText == null ? 0 : structurableText.hashCode())) * 31;
        StructurableText structurableText2 = this.value;
        return iHashCode3 + (structurableText2 != null ? structurableText2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.rawName;
        String str2 = this.rawValue;
        StructurableText structurableText = this.name;
        StructurableText structurableText2 = this.value;
        StringBuilder sbU = e.u("EmbedField(rawName=", str, ", rawValue=", str2, ", name=");
        sbU.append(structurableText);
        sbU.append(", value=");
        sbU.append(structurableText2);
        sbU.append(")");
        return sbU.toString();
    }

    public /* synthetic */ EmbedField(int i7, String str, String str2, StructurableText structurableText, StructurableText structurableText2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i7 & 1) == 0) {
            this.rawName = null;
        } else {
            this.rawName = str;
        }
        if ((i7 & 2) == 0) {
            this.rawValue = null;
        } else {
            this.rawValue = str2;
        }
        if ((i7 & 4) == 0) {
            this.name = null;
        } else {
            this.name = structurableText;
        }
        if ((i7 & 8) == 0) {
            this.value = null;
        } else {
            this.value = structurableText2;
        }
    }

    public EmbedField(String str, String str2, StructurableText structurableText, StructurableText structurableText2) {
        this.rawName = str;
        this.rawValue = str2;
        this.name = structurableText;
        this.value = structurableText2;
    }

    public /* synthetic */ EmbedField(String str, String str2, StructurableText structurableText, StructurableText structurableText2, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? null : str2, (i7 & 4) != 0 ? null : structurableText, (i7 & 8) != 0 ? null : structurableText2);
    }
}

package com.discord.chat.bridge.ephemeral;

import a3.e;
import com.discord.chat.bridge.structurabletext.StructurableText;
import com.discord.chat.bridge.structurabletext.StructurableTextSerializer;
import com.discord.chat.presentation.list.a;
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
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002$%B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0007\u0010\rJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J'\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\nHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001J%\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0001¢\u0006\u0002\b#R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011¨\u0006&"}, d2 = {"Lcom/discord/chat/bridge/ephemeral/EphemeralIndication;", "", "content", "Lcom/discord/chat/bridge/structurabletext/StructurableText;", "helpArticleLink", "", "helpButtonAccessibilityLabel", "<init>", "(Lcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getContent", "()Lcom/discord/chat/bridge/structurabletext/StructurableText;", "getHelpArticleLink", "()Ljava/lang/String;", "getHelpButtonAccessibilityLabel", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$chat_release", "$serializer", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class EphemeralIndication {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final StructurableText content;

    @NotNull
    private final String helpArticleLink;

    @NotNull
    private final String helpButtonAccessibilityLabel;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/chat/bridge/ephemeral/EphemeralIndication$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/ephemeral/EphemeralIndication;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return EphemeralIndication$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ EphemeralIndication(int i7, StructurableText structurableText, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i7 & 7)) {
            e1.l(i7, 7, EphemeralIndication$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.content = structurableText;
        this.helpArticleLink = str;
        this.helpButtonAccessibilityLabel = str2;
    }

    public static /* synthetic */ EphemeralIndication copy$default(EphemeralIndication ephemeralIndication, StructurableText structurableText, String str, String str2, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            structurableText = ephemeralIndication.content;
        }
        if ((i7 & 2) != 0) {
            str = ephemeralIndication.helpArticleLink;
        }
        if ((i7 & 4) != 0) {
            str2 = ephemeralIndication.helpButtonAccessibilityLabel;
        }
        return ephemeralIndication.copy(structurableText, str, str2);
    }

    public static final /* synthetic */ void write$Self$chat_release(EphemeralIndication self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.g(serialDesc, 0, StructurableTextSerializer.INSTANCE, self.content);
        output.q(serialDesc, 1, self.helpArticleLink);
        output.q(serialDesc, 2, self.helpButtonAccessibilityLabel);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final StructurableText getContent() {
        return this.content;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getHelpArticleLink() {
        return this.helpArticleLink;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getHelpButtonAccessibilityLabel() {
        return this.helpButtonAccessibilityLabel;
    }

    @NotNull
    public final EphemeralIndication copy(@NotNull StructurableText content, @NotNull String helpArticleLink, @NotNull String helpButtonAccessibilityLabel) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(helpArticleLink, "helpArticleLink");
        Intrinsics.checkNotNullParameter(helpButtonAccessibilityLabel, "helpButtonAccessibilityLabel");
        return new EphemeralIndication(content, helpArticleLink, helpButtonAccessibilityLabel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EphemeralIndication)) {
            return false;
        }
        EphemeralIndication ephemeralIndication = (EphemeralIndication) other;
        return Intrinsics.areEqual(this.content, ephemeralIndication.content) && Intrinsics.areEqual(this.helpArticleLink, ephemeralIndication.helpArticleLink) && Intrinsics.areEqual(this.helpButtonAccessibilityLabel, ephemeralIndication.helpButtonAccessibilityLabel);
    }

    @NotNull
    public final StructurableText getContent() {
        return this.content;
    }

    @NotNull
    public final String getHelpArticleLink() {
        return this.helpArticleLink;
    }

    @NotNull
    public final String getHelpButtonAccessibilityLabel() {
        return this.helpButtonAccessibilityLabel;
    }

    public int hashCode() {
        return this.helpButtonAccessibilityLabel.hashCode() + e.d(this.content.hashCode() * 31, 31, this.helpArticleLink);
    }

    @NotNull
    public String toString() {
        StructurableText structurableText = this.content;
        String str = this.helpArticleLink;
        String str2 = this.helpButtonAccessibilityLabel;
        StringBuilder sb2 = new StringBuilder("EphemeralIndication(content=");
        sb2.append(structurableText);
        sb2.append(", helpArticleLink=");
        sb2.append(str);
        sb2.append(", helpButtonAccessibilityLabel=");
        return a.k(sb2, str2, ")");
    }

    public EphemeralIndication(@NotNull StructurableText content, @NotNull String helpArticleLink, @NotNull String helpButtonAccessibilityLabel) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(helpArticleLink, "helpArticleLink");
        Intrinsics.checkNotNullParameter(helpButtonAccessibilityLabel, "helpButtonAccessibilityLabel");
        this.content = content;
        this.helpArticleLink = helpArticleLink;
        this.helpButtonAccessibilityLabel = helpButtonAccessibilityLabel;
    }
}

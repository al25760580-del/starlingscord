package com.discord.chat.bridge.contentnode;

import a3.e;
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
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002$%B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bB7\b\u0010\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0007\u0010\rJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J'\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\nHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J%\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0001¢\u0006\u0002\b#R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006&"}, d2 = {"Lcom/discord/chat/bridge/contentnode/UnicodeEmojiContentNode;", "Lcom/discord/chat/bridge/contentnode/EmojiContentNode;", "content", "", "surrogate", "jumboable", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getContent", "()Ljava/lang/String;", "getSurrogate", "getJumboable", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$chat_release", "$serializer", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class UnicodeEmojiContentNode extends EmojiContentNode {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String content;
    private final boolean jumboable;

    @NotNull
    private final String surrogate;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/chat/bridge/contentnode/UnicodeEmojiContentNode$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/contentnode/UnicodeEmojiContentNode;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return UnicodeEmojiContentNode$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UnicodeEmojiContentNode(int i7, String str, String str2, boolean z5, SerializationConstructorMarker serializationConstructorMarker) {
        super(i7, serializationConstructorMarker);
        if (3 != (i7 & 3)) {
            e1.l(i7, 3, UnicodeEmojiContentNode$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.content = str;
        this.surrogate = str2;
        if ((i7 & 4) == 0) {
            this.jumboable = false;
        } else {
            this.jumboable = z5;
        }
    }

    public static /* synthetic */ UnicodeEmojiContentNode copy$default(UnicodeEmojiContentNode unicodeEmojiContentNode, String str, String str2, boolean z5, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = unicodeEmojiContentNode.content;
        }
        if ((i7 & 2) != 0) {
            str2 = unicodeEmojiContentNode.surrogate;
        }
        if ((i7 & 4) != 0) {
            z5 = unicodeEmojiContentNode.jumboable;
        }
        return unicodeEmojiContentNode.copy(str, str2, z5);
    }

    public static final /* synthetic */ void write$Self$chat_release(UnicodeEmojiContentNode self, CompositeEncoder output, SerialDescriptor serialDesc) {
        EmojiContentNode.write$Self(self, output, serialDesc);
        output.q(serialDesc, 0, self.content);
        output.q(serialDesc, 1, self.surrogate);
        if (output.u(serialDesc, 2) || self.getJumboable()) {
            output.p(serialDesc, 2, self.getJumboable());
        }
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSurrogate() {
        return this.surrogate;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getJumboable() {
        return this.jumboable;
    }

    @NotNull
    public final UnicodeEmojiContentNode copy(@NotNull String content, @NotNull String surrogate, boolean jumboable) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(surrogate, "surrogate");
        return new UnicodeEmojiContentNode(content, surrogate, jumboable);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UnicodeEmojiContentNode)) {
            return false;
        }
        UnicodeEmojiContentNode unicodeEmojiContentNode = (UnicodeEmojiContentNode) other;
        return Intrinsics.areEqual(this.content, unicodeEmojiContentNode.content) && Intrinsics.areEqual(this.surrogate, unicodeEmojiContentNode.surrogate) && this.jumboable == unicodeEmojiContentNode.jumboable;
    }

    @NotNull
    public final String getContent() {
        return this.content;
    }

    @Override // com.discord.chat.presentation.textutils.Jumboable
    public boolean getJumboable() {
        return this.jumboable;
    }

    @NotNull
    public final String getSurrogate() {
        return this.surrogate;
    }

    public int hashCode() {
        return Boolean.hashCode(this.jumboable) + e.d(this.content.hashCode() * 31, 31, this.surrogate);
    }

    @NotNull
    public String toString() {
        String str = this.content;
        String str2 = this.surrogate;
        return com.discord.chat.presentation.list.a.m(e.u("UnicodeEmojiContentNode(content=", str, ", surrogate=", str2, ", jumboable="), this.jumboable, ")");
    }

    public /* synthetic */ UnicodeEmojiContentNode(String str, String str2, boolean z5, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i7 & 4) != 0 ? false : z5);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnicodeEmojiContentNode(@NotNull String content, @NotNull String surrogate, boolean z5) {
        super(null);
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(surrogate, "surrogate");
        this.content = content;
        this.surrogate = surrogate;
        this.jumboable = z5;
    }
}

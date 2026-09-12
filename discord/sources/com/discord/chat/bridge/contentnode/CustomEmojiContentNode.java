package com.discord.chat.bridge.contentnode;

import a3.e;
import com.facebook.react.devsupport.StackTraceHelper;
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
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002,-B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bBI\b\u0010\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\n\u0010\u0010J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\tHÆ\u0003J;\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001f\u001a\u00020\t2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\rHÖ\u0001J\t\u0010#\u001a\u00020\u0005HÖ\u0001J%\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00002\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0001¢\u0006\u0002\b+R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006."}, d2 = {"Lcom/discord/chat/bridge/contentnode/CustomEmojiContentNode;", "Lcom/discord/chat/bridge/contentnode/EmojiContentNode;", StackTraceHelper.ID_KEY, "", "alt", "", "src", "frozenSrc", "jumboable", "", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getId", "()J", "getAlt", "()Ljava/lang/String;", "getSrc", "getFrozenSrc", "getJumboable", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$chat_release", "$serializer", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class CustomEmojiContentNode extends EmojiContentNode {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String alt;

    @NotNull
    private final String frozenSrc;
    private final long id;
    private final boolean jumboable;

    @NotNull
    private final String src;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/chat/bridge/contentnode/CustomEmojiContentNode$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/contentnode/CustomEmojiContentNode;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return CustomEmojiContentNode$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CustomEmojiContentNode(int i7, long j, String str, String str2, String str3, boolean z5, SerializationConstructorMarker serializationConstructorMarker) {
        super(i7, serializationConstructorMarker);
        if (15 != (i7 & 15)) {
            e1.l(i7, 15, CustomEmojiContentNode$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = j;
        this.alt = str;
        this.src = str2;
        this.frozenSrc = str3;
        if ((i7 & 16) == 0) {
            this.jumboable = false;
        } else {
            this.jumboable = z5;
        }
    }

    public static /* synthetic */ CustomEmojiContentNode copy$default(CustomEmojiContentNode customEmojiContentNode, long j, String str, String str2, String str3, boolean z5, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            j = customEmojiContentNode.id;
        }
        long j5 = j;
        if ((i7 & 2) != 0) {
            str = customEmojiContentNode.alt;
        }
        String str4 = str;
        if ((i7 & 4) != 0) {
            str2 = customEmojiContentNode.src;
        }
        String str5 = str2;
        if ((i7 & 8) != 0) {
            str3 = customEmojiContentNode.frozenSrc;
        }
        String str6 = str3;
        if ((i7 & 16) != 0) {
            z5 = customEmojiContentNode.jumboable;
        }
        return customEmojiContentNode.copy(j5, str4, str5, str6, z5);
    }

    public static final /* synthetic */ void write$Self$chat_release(CustomEmojiContentNode self, CompositeEncoder output, SerialDescriptor serialDesc) {
        EmojiContentNode.write$Self(self, output, serialDesc);
        output.C(serialDesc, 0, self.id);
        output.q(serialDesc, 1, self.alt);
        output.q(serialDesc, 2, self.src);
        output.q(serialDesc, 3, self.frozenSrc);
        if (output.u(serialDesc, 4) || self.getJumboable()) {
            output.p(serialDesc, 4, self.getJumboable());
        }
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAlt() {
        return this.alt;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSrc() {
        return this.src;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getFrozenSrc() {
        return this.frozenSrc;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getJumboable() {
        return this.jumboable;
    }

    @NotNull
    public final CustomEmojiContentNode copy(long id2, @NotNull String alt, @NotNull String src, @NotNull String frozenSrc, boolean jumboable) {
        Intrinsics.checkNotNullParameter(alt, "alt");
        Intrinsics.checkNotNullParameter(src, "src");
        Intrinsics.checkNotNullParameter(frozenSrc, "frozenSrc");
        return new CustomEmojiContentNode(id2, alt, src, frozenSrc, jumboable);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CustomEmojiContentNode)) {
            return false;
        }
        CustomEmojiContentNode customEmojiContentNode = (CustomEmojiContentNode) other;
        return this.id == customEmojiContentNode.id && Intrinsics.areEqual(this.alt, customEmojiContentNode.alt) && Intrinsics.areEqual(this.src, customEmojiContentNode.src) && Intrinsics.areEqual(this.frozenSrc, customEmojiContentNode.frozenSrc) && this.jumboable == customEmojiContentNode.jumboable;
    }

    @NotNull
    public final String getAlt() {
        return this.alt;
    }

    @NotNull
    public final String getFrozenSrc() {
        return this.frozenSrc;
    }

    public final long getId() {
        return this.id;
    }

    @Override // com.discord.chat.presentation.textutils.Jumboable
    public boolean getJumboable() {
        return this.jumboable;
    }

    @NotNull
    public final String getSrc() {
        return this.src;
    }

    public int hashCode() {
        return Boolean.hashCode(this.jumboable) + e.d(e.d(e.d(Long.hashCode(this.id) * 31, 31, this.alt), 31, this.src), 31, this.frozenSrc);
    }

    @NotNull
    public String toString() {
        long j = this.id;
        String str = this.alt;
        String str2 = this.src;
        String str3 = this.frozenSrc;
        boolean z5 = this.jumboable;
        StringBuilder sb2 = new StringBuilder("CustomEmojiContentNode(id=");
        sb2.append(j);
        sb2.append(", alt=");
        sb2.append(str);
        e.A(sb2, ", src=", str2, ", frozenSrc=", str3);
        sb2.append(", jumboable=");
        sb2.append(z5);
        sb2.append(")");
        return sb2.toString();
    }

    public /* synthetic */ CustomEmojiContentNode(long j, String str, String str2, String str3, boolean z5, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, str, str2, str3, (i7 & 16) != 0 ? false : z5);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomEmojiContentNode(long j, @NotNull String alt, @NotNull String src, @NotNull String frozenSrc, boolean z5) {
        super(null);
        Intrinsics.checkNotNullParameter(alt, "alt");
        Intrinsics.checkNotNullParameter(src, "src");
        Intrinsics.checkNotNullParameter(frozenSrc, "frozenSrc");
        this.id = j;
        this.alt = alt;
        this.src = src;
        this.frozenSrc = frozenSrc;
        this.jumboable = z5;
    }
}

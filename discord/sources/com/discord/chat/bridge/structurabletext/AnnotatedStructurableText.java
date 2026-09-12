package com.discord.chat.bridge.structurabletext;

import com.discord.chat.bridge.contentnode.ContentNode;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kr.f;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@f(with = AnnotatedStructurableTextSerializer.class)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/discord/chat/bridge/structurabletext/AnnotatedStructurableText;", "Lcom/discord/chat/bridge/structurabletext/StructurableText;", "content", "", "Lcom/discord/chat/bridge/contentnode/ContentNode;", "<init>", "(Ljava/util/List;)V", "getContent", "()Ljava/util/List;", "hasContent", "", "getHasContent", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class AnnotatedStructurableText extends StructurableText {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final List<ContentNode> content;
    private final boolean hasContent;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/chat/bridge/structurabletext/AnnotatedStructurableText$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/structurabletext/AnnotatedStructurableText;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return AnnotatedStructurableTextSerializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AnnotatedStructurableText(@NotNull List<? extends ContentNode> content) {
        super(null);
        Intrinsics.checkNotNullParameter(content, "content");
        this.content = content;
        this.hasContent = !content.isEmpty();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AnnotatedStructurableText copy$default(AnnotatedStructurableText annotatedStructurableText, List list, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            list = annotatedStructurableText.content;
        }
        return annotatedStructurableText.copy(list);
    }

    @NotNull
    public final List<ContentNode> component1() {
        return this.content;
    }

    @NotNull
    public final AnnotatedStructurableText copy(@NotNull List<? extends ContentNode> content) {
        Intrinsics.checkNotNullParameter(content, "content");
        return new AnnotatedStructurableText(content);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AnnotatedStructurableText) && Intrinsics.areEqual(this.content, ((AnnotatedStructurableText) other).content);
    }

    @NotNull
    public final List<ContentNode> getContent() {
        return this.content;
    }

    @Override // com.discord.chat.bridge.structurabletext.StructurableText
    public boolean getHasContent() {
        return this.hasContent;
    }

    public int hashCode() {
        return this.content.hashCode();
    }

    @NotNull
    public String toString() {
        return "AnnotatedStructurableText(content=" + this.content + ")";
    }
}

package com.discord.chat.bridge.botuikit;

import a3.e;
import com.discord.chat.bridge.structurabletext.StructurableText;
import com.discord.chat.bridge.structurabletext.StructurableTextSerializer;
import com.discord.chat.presentation.list.a;
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
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002&'B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tB7\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\rJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J'\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001J%\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00002\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0001¢\u0006\u0002\b%R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006("}, d2 = {"Lcom/discord/chat/bridge/botuikit/TextDisplayComponent;", "Lcom/discord/chat/bridge/botuikit/Component;", "type", "", StackTraceHelper.ID_KEY, "", "content", "Lcom/discord/chat/bridge/structurabletext/StructurableText;", "<init>", "(ILjava/lang/String;Lcom/discord/chat/bridge/structurabletext/StructurableText;)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IILjava/lang/String;Lcom/discord/chat/bridge/structurabletext/StructurableText;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getType", "()I", "getId", "()Ljava/lang/String;", "getContent", "()Lcom/discord/chat/bridge/structurabletext/StructurableText;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$chat_release", "$serializer", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class TextDisplayComponent extends Component {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final StructurableText content;

    @NotNull
    private final String id;
    private final int type;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/chat/bridge/botuikit/TextDisplayComponent$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/botuikit/TextDisplayComponent;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return TextDisplayComponent$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TextDisplayComponent(int i7, int i10, String str, StructurableText structurableText, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if (7 != (i7 & 7)) {
            e1.l(i7, 7, TextDisplayComponent$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.type = i10;
        this.id = str;
        this.content = structurableText;
    }

    public static /* synthetic */ TextDisplayComponent copy$default(TextDisplayComponent textDisplayComponent, int i7, String str, StructurableText structurableText, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i7 = textDisplayComponent.type;
        }
        if ((i10 & 2) != 0) {
            str = textDisplayComponent.id;
        }
        if ((i10 & 4) != 0) {
            structurableText = textDisplayComponent.content;
        }
        return textDisplayComponent.copy(i7, str, structurableText);
    }

    public static final /* synthetic */ void write$Self$chat_release(TextDisplayComponent self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.l(0, self.getType(), serialDesc);
        output.q(serialDesc, 1, self.getId());
        output.g(serialDesc, 2, StructurableTextSerializer.INSTANCE, self.content);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getType() {
        return this.type;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final StructurableText getContent() {
        return this.content;
    }

    @NotNull
    public final TextDisplayComponent copy(int type, @NotNull String id2, @NotNull StructurableText content) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(content, "content");
        return new TextDisplayComponent(type, id2, content);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextDisplayComponent)) {
            return false;
        }
        TextDisplayComponent textDisplayComponent = (TextDisplayComponent) other;
        return this.type == textDisplayComponent.type && Intrinsics.areEqual(this.id, textDisplayComponent.id) && Intrinsics.areEqual(this.content, textDisplayComponent.content);
    }

    @NotNull
    public final StructurableText getContent() {
        return this.content;
    }

    @Override // com.discord.chat.bridge.botuikit.Component
    @NotNull
    public String getId() {
        return this.id;
    }

    @Override // com.discord.chat.bridge.botuikit.Component
    public int getType() {
        return this.type;
    }

    public int hashCode() {
        return this.content.hashCode() + e.d(Integer.hashCode(this.type) * 31, 31, this.id);
    }

    @NotNull
    public String toString() {
        int i7 = this.type;
        String str = this.id;
        StructurableText structurableText = this.content;
        StringBuilder sbO = a.o("TextDisplayComponent(type=", ", id=", str, i7, ", content=");
        sbO.append(structurableText);
        sbO.append(")");
        return sbO.toString();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextDisplayComponent(int i7, @NotNull String id2, @NotNull StructurableText content) {
        super(null);
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(content, "content");
        this.type = i7;
        this.id = id2;
        this.content = content;
    }
}

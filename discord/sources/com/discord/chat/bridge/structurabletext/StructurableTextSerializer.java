package com.discord.chat.bridge.structurabletext;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonPrimitive;
import kotlinx.serialization.json.a;
import org.jetbrains.annotations.NotNull;
import pr.f;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/discord/chat/bridge/structurabletext/StructurableTextSerializer;", "Lpr/f;", "Lcom/discord/chat/bridge/structurabletext/StructurableText;", "<init>", "()V", "Lkotlinx/serialization/json/JsonElement;", "element", "Lkotlinx/serialization/DeserializationStrategy;", "selectDeserializer", "(Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/DeserializationStrategy;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class StructurableTextSerializer extends f {

    @NotNull
    public static final StructurableTextSerializer INSTANCE = new StructurableTextSerializer();

    private StructurableTextSerializer() {
        super(Reflection.getOrCreateKotlinClass(StructurableText.class));
    }

    @Override // pr.f
    @NotNull
    public DeserializationStrategy selectDeserializer(@NotNull JsonElement element) {
        Intrinsics.checkNotNullParameter(element, "element");
        if (element instanceof JsonPrimitive) {
            return PrimitiveStructurableTextSerializer.INSTANCE;
        }
        if (element instanceof a) {
            return AnnotatedStructurableTextSerializer.INSTANCE;
        }
        throw new IllegalArgumentException("unable to find serializer for json: " + element);
    }
}

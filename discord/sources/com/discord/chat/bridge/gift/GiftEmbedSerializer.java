package com.discord.chat.bridge.gift;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.NotNull;
import pr.f;
import pr.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/discord/chat/bridge/gift/GiftEmbedSerializer;", "Lpr/f;", "Lcom/discord/chat/bridge/gift/GiftEmbed;", "<init>", "()V", "Lkotlinx/serialization/json/JsonElement;", "element", "Lkotlinx/serialization/DeserializationStrategy;", "selectDeserializer", "(Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/DeserializationStrategy;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class GiftEmbedSerializer extends f {

    @NotNull
    public static final GiftEmbedSerializer INSTANCE = new GiftEmbedSerializer();

    private GiftEmbedSerializer() {
        super(Reflection.getOrCreateKotlinClass(GiftEmbed.class));
    }

    @Override // pr.f
    @NotNull
    public DeserializationStrategy selectDeserializer(@NotNull JsonElement element) {
        Intrinsics.checkNotNullParameter(element, "element");
        JsonObject jsonObjectJ = h.j(element);
        if (GiftEmbedKt.hasPrimitives(jsonObjectJ, "resolvingGradientStart", "resolvingGradientEnd")) {
            return GiftEmbed.Resolving.INSTANCE.serializer();
        }
        return GiftEmbedKt.hasPrimitive(jsonObjectJ, "giftCode") ? GiftEmbed.Resolved.Valid.INSTANCE.serializer() : GiftEmbed.Resolved.Invalid.INSTANCE.serializer();
    }
}

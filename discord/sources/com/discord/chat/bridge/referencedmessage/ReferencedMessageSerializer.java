package com.discord.chat.bridge.referencedmessage;

import a3.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.json.JsonElement;
import org.jetbrains.annotations.NotNull;
import pr.f;
import pr.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/discord/chat/bridge/referencedmessage/ReferencedMessageSerializer;", "Lpr/f;", "Lcom/discord/chat/bridge/referencedmessage/ReferencedMessage;", "<init>", "()V", "Lkotlinx/serialization/json/JsonElement;", "element", "Lkotlinx/serialization/DeserializationStrategy;", "selectDeserializer", "(Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/DeserializationStrategy;", "", "STATE_LOADED", "Ljava/lang/String;", "STATE_SYSTEM", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReferencedMessageSerializer extends f {

    @NotNull
    public static final ReferencedMessageSerializer INSTANCE = new ReferencedMessageSerializer();

    @NotNull
    private static final String STATE_LOADED = "0";

    @NotNull
    private static final String STATE_SYSTEM = "1";

    private ReferencedMessageSerializer() {
        super(Reflection.getOrCreateKotlinClass(ReferencedMessage.class));
    }

    @Override // pr.f
    @NotNull
    public DeserializationStrategy selectDeserializer(@NotNull JsonElement element) {
        Intrinsics.checkNotNullParameter(element, "element");
        JsonElement jsonElement = (JsonElement) h.j(element).get("state");
        String strA = jsonElement != null ? h.k(jsonElement).a() : null;
        if (Intrinsics.areEqual(strA, STATE_LOADED)) {
            return LoadedReferencedMessage.INSTANCE.serializer();
        }
        if (Intrinsics.areEqual(strA, STATE_SYSTEM)) {
            return SystemReferencedMessage.INSTANCE.serializer();
        }
        throw new IllegalArgumentException(e.l("unsupported state json: ", strA));
    }
}

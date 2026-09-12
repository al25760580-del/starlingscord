package com.discord.chat.bridge.botuikit;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import m3.m;
import mr.e;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\t\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\u000bH&¢\u0006\u0002\u0010\fJ\u0017\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u000fJ\u0015\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00020\u0016H\u0016¢\u0006\u0002\u0010\u0017J\u001d\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u000e\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001cR\u0012\u0010\u0005\u001a\u00020\u0006X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0010\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001d"}, d2 = {"Lcom/discord/chat/bridge/botuikit/ComponentUnionSerializer;", "T", "Lkotlinx/serialization/KSerializer;", "<init>", "()V", "unionName", "", "getUnionName", "()Ljava/lang/String;", "toValue", "component", "Lcom/discord/chat/bridge/botuikit/Component;", "(Lcom/discord/chat/bridge/botuikit/Component;)Ljava/lang/Object;", "fromValue", "value", "(Ljava/lang/Object;)Lcom/discord/chat/bridge/botuikit/Component;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class ComponentUnionSerializer<T> implements KSerializer {
    @Override // kotlinx.serialization.DeserializationStrategy
    public T deserialize(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return toValue((Component) Component.INSTANCE.serializer().deserialize(decoder));
    }

    public abstract Component fromValue(T value);

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public SerialDescriptor getDescriptor() {
        return m.a(getUnionName(), e.j);
    }

    @NotNull
    public abstract String getUnionName();

    @Override // kotlinx.serialization.KSerializer
    public void serialize(@NotNull Encoder encoder, T value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Component componentFromValue = fromValue(value);
        if (componentFromValue == null) {
            return;
        }
        Component.INSTANCE.serializer().serialize(encoder, componentFromValue);
    }

    public abstract T toValue(@NotNull Component component);
}

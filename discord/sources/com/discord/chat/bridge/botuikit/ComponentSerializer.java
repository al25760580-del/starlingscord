package com.discord.chat.bridge.botuikit;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.json.JsonElement;
import org.jetbrains.annotations.NotNull;
import pr.f;
import pr.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u0012\u0004\b\u0011\u0010\u0004¨\u0006\u0012"}, d2 = {"Lcom/discord/chat/bridge/botuikit/ComponentSerializer;", "Lpr/f;", "Lcom/discord/chat/bridge/botuikit/Component;", "<init>", "()V", "Lkotlinx/serialization/json/JsonElement;", "element", "Lkotlinx/serialization/DeserializationStrategy;", "selectDeserializer", "(Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/DeserializationStrategy;", "", "", "knownTypes", "Ljava/util/List;", "Lkotlinx/serialization/SealedClassSerializer;", "componentClassSerializer", "Lkotlinx/serialization/SealedClassSerializer;", "getComponentClassSerializer$annotations", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nComponentSerializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComponentSerializer.kt\ncom/discord/chat/bridge/botuikit/ComponentSerializer\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,136:1\n11228#2:137\n11563#2,3:138\n*S KotlinDebug\n*F\n+ 1 ComponentSerializer.kt\ncom/discord/chat/bridge/botuikit/ComponentSerializer\n*L\n21#1:137\n21#1:138,3\n*E\n"})
public final class ComponentSerializer extends f {

    @NotNull
    public static final ComponentSerializer INSTANCE = new ComponentSerializer();

    @NotNull
    private static final SealedClassSerializer componentClassSerializer;

    @NotNull
    private static final List<Integer> knownTypes;

    static {
        ComponentType[] componentTypeArrValues = ComponentType.values();
        ArrayList arrayList = new ArrayList(componentTypeArrValues.length);
        for (ComponentType componentType : componentTypeArrValues) {
            arrayList.add(Integer.valueOf(componentType.getSerialNumber()));
        }
        knownTypes = arrayList;
        componentClassSerializer = new SealedClassSerializer("Component", Reflection.getOrCreateKotlinClass(Component.class), new KClass[]{Reflection.getOrCreateKotlinClass(UnknownComponent.class), Reflection.getOrCreateKotlinClass(ActionRowComponent.class), Reflection.getOrCreateKotlinClass(ButtonComponent.class), Reflection.getOrCreateKotlinClass(StringSelectComponent.class), Reflection.getOrCreateKotlinClass(UserSelectComponent.class), Reflection.getOrCreateKotlinClass(RoleSelectComponent.class), Reflection.getOrCreateKotlinClass(MentionableSelectComponent.class), Reflection.getOrCreateKotlinClass(ChannelSelectComponent.class), Reflection.getOrCreateKotlinClass(SectionComponent.class), Reflection.getOrCreateKotlinClass(TextDisplayComponent.class), Reflection.getOrCreateKotlinClass(ThumbnailDisplayComponent.class), Reflection.getOrCreateKotlinClass(MediaGalleryDisplayComponent.class), Reflection.getOrCreateKotlinClass(FileDisplayComponent.class), Reflection.getOrCreateKotlinClass(SeparatorDisplayComponent.class), Reflection.getOrCreateKotlinClass(ContentInventoryEntryComponent.class), Reflection.getOrCreateKotlinClass(ContainerComponent.class), Reflection.getOrCreateKotlinClass(CheckpointCardComponent.class)}, new KSerializer[]{UnknownComponent.INSTANCE.serializer(), ActionRowComponent.INSTANCE.serializer(), ButtonComponent.INSTANCE.serializer(), StringSelectComponent.INSTANCE.serializer(), UserSelectComponent.INSTANCE.serializer(), RoleSelectComponent.INSTANCE.serializer(), MentionableSelectComponent.INSTANCE.serializer(), ChannelSelectComponent.INSTANCE.serializer(), SectionComponent.INSTANCE.serializer(), TextDisplayComponent.INSTANCE.serializer(), ThumbnailDisplayComponent.INSTANCE.serializer(), MediaGalleryDisplayComponent.INSTANCE.serializer(), FileDisplayComponent.INSTANCE.serializer(), SeparatorDisplayComponent.INSTANCE.serializer(), ContentInventoryEntryComponent.INSTANCE.serializer(), ContainerComponent.INSTANCE.serializer(), CheckpointCardComponent.INSTANCE.serializer()});
    }

    private ComponentSerializer() {
        super(Reflection.getOrCreateKotlinClass(Component.class));
    }

    private static /* synthetic */ void getComponentClassSerializer$annotations() {
    }

    @Override // pr.f
    @NotNull
    public DeserializationStrategy selectDeserializer(@NotNull JsonElement element) {
        Intrinsics.checkNotNullParameter(element, "element");
        List<Integer> list = knownTypes;
        JsonElement jsonElement = (JsonElement) h.j(element).get("type");
        return CollectionsKt.E(list, jsonElement != null ? Integer.valueOf(h.g(h.k(jsonElement))) : null) ? componentClassSerializer : UnknownComponent.INSTANCE.serializer();
    }
}

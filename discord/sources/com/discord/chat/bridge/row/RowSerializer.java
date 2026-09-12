package com.discord.chat.bridge.row;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.NotNull;
import pr.f;
import pr.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u000e\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\fR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u0012\u0004\b\u0012\u0010\u0004¨\u0006\u0013"}, d2 = {"Lcom/discord/chat/bridge/row/RowSerializer;", "Lpr/f;", "Lcom/discord/chat/bridge/row/Row;", "<init>", "()V", "Lkotlinx/serialization/json/JsonElement;", "element", "Lkotlinx/serialization/DeserializationStrategy;", "selectDeserializer", "(Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/DeserializationStrategy;", "", "CHANGE_TYPE_DELETE", "Ljava/lang/String;", "ROW_TYPE_IGNORED_GROUP", "ROW_TYPE_SUSPENDED_USER_GROUP", "Lkotlinx/serialization/SealedClassSerializer;", "rowSealedClassSerializer", "Lkotlinx/serialization/SealedClassSerializer;", "getRowSealedClassSerializer$annotations", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RowSerializer extends f {

    @NotNull
    private static final String CHANGE_TYPE_DELETE = "3";

    @NotNull
    private static final String ROW_TYPE_IGNORED_GROUP = "6";

    @NotNull
    private static final String ROW_TYPE_SUSPENDED_USER_GROUP = "7";

    @NotNull
    public static final RowSerializer INSTANCE = new RowSerializer();

    @NotNull
    private static final SealedClassSerializer rowSealedClassSerializer = new SealedClassSerializer("Row", Reflection.getOrCreateKotlinClass(Row.class), new KClass[]{Reflection.getOrCreateKotlinClass(LoadingRow.class), Reflection.getOrCreateKotlinClass(MessageRow.class), Reflection.getOrCreateKotlinClass(SeparatorRow.class), Reflection.getOrCreateKotlinClass(BlockedGroupRow.class)}, new KSerializer[]{LoadingRow.INSTANCE.serializer(), MessageRow.INSTANCE.serializer(), SeparatorRow.INSTANCE.serializer(), BlockedGroupRow.INSTANCE.serializer()});

    private RowSerializer() {
        super(Reflection.getOrCreateKotlinClass(Row.class));
    }

    private static /* synthetic */ void getRowSealedClassSerializer$annotations() {
    }

    @Override // pr.f
    @NotNull
    public DeserializationStrategy selectDeserializer(@NotNull JsonElement element) {
        Intrinsics.checkNotNullParameter(element, "element");
        JsonObject jsonObjectJ = h.j(element);
        if (jsonObjectJ.containsKey("type")) {
            JsonElement jsonElement = (JsonElement) jsonObjectJ.get("type");
            String strA = jsonElement != null ? h.k(jsonElement).a() : null;
            return (Intrinsics.areEqual(strA, ROW_TYPE_IGNORED_GROUP) || Intrinsics.areEqual(strA, ROW_TYPE_SUSPENDED_USER_GROUP)) ? BlockedGroupRow.INSTANCE.serializer() : rowSealedClassSerializer;
        }
        JsonElement jsonElement2 = (JsonElement) jsonObjectJ.get("changeType");
        if (Intrinsics.areEqual(jsonElement2 != null ? h.k(jsonElement2).a() : null, CHANGE_TYPE_DELETE)) {
            return DeleteRow.INSTANCE.serializer();
        }
        throw new IllegalArgumentException("unsupported row json: " + element);
    }
}

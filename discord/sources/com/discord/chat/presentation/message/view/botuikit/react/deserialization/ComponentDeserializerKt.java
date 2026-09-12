package com.discord.chat.presentation.message.view.botuikit.react.deserialization;

import a3.e;
import com.discord.chat.bridge.botuikit.Component;
import com.discord.chat.bridge.botuikit.ComponentSerializer;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import f6.a;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import ls.d;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\"\u0010\u0004\u001a\u0002H\u0005\"\n\b\u0000\u0010\u0005\u0018\u0001*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0080\b¢\u0006\u0002\u0010\t\"\u0011\u0010\u0000\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u0006\n"}, d2 = {"json", "Lkotlinx/serialization/json/Json;", "getJson", "()Lkotlinx/serialization/json/Json;", "deserializeComponentModel", "T", "Lcom/discord/chat/bridge/botuikit/Component;", "model", "Lcom/facebook/react/bridge/ReadableMap;", "(Lcom/facebook/react/bridge/ReadableMap;)Lcom/discord/chat/bridge/botuikit/Component;", "chat_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ComponentDeserializerKt {

    @NotNull
    private static final Json json = d.e(new a(9));

    public static final /* synthetic */ <T extends Component> T deserializeComponentModel(ReadableMap model) {
        Object type;
        Intrinsics.checkNotNullParameter(model, "model");
        try {
            Json json2 = getJson();
            ComponentSerializer componentSerializer = ComponentSerializer.INSTANCE;
            String string = new JSONObject(model.toHashMap()).toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            T t5 = (T) json2.b(componentSerializer, string);
            Intrinsics.reifiedOperationMarker(3, "T");
            if (t5 != null) {
                return t5;
            }
            Intrinsics.reifiedOperationMarker(4, "T");
            throw new IllegalStateException(("Expected " + Reflection.getOrCreateKotlinClass(Component.class).getSimpleName() + " but got " + Reflection.getOrCreateKotlinClass(t5.getClass()).getSimpleName()).toString());
        } catch (Exception e10) {
            ArrayList arrayList = new ArrayList();
            ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = model.keySetIterator();
            while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
                arrayList.add(readableMapKeySetIteratorKeySetIterator.nextKey());
            }
            boolean zHasKey = model.hasKey("type");
            Intrinsics.reifiedOperationMarker(4, "T");
            String simpleName = Reflection.getOrCreateKotlinClass(Component.class).getSimpleName();
            String message = e10.getMessage();
            if (zHasKey && model.getType("type") == ReadableType.Number) {
                type = Integer.valueOf(model.getInt("type"));
            } else {
                type = zHasKey ? model.getType("type") : "undefined";
            }
            StringBuilder sbU = e.u("Error while deserializing ", simpleName, ": ", message, ".\nReceived map keys: ");
            sbU.append(arrayList);
            sbU.append(", type: ");
            sbU.append(type);
            throw new IllegalStateException(sbU.toString().toString());
        }
    }

    @NotNull
    public static final Json getJson() {
        return json;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit json$lambda$0(JsonBuilder Json) {
        Intrinsics.checkNotNullParameter(Json, "$this$Json");
        Json.f14765b = true;
        return Unit.f14616a;
    }
}

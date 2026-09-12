package com.discord.react.utilities;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MagicApiIntrinsics;
import kotlinx.serialization.DeserializationStrategy;
import ls.d;
import rr.b;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a1\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001*\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00010\u0005H\u0086\b\u001a*\u0010\u0006\u001a\u0002H\u0002\"\u0006\b\u0000\u0010\u0002\u0018\u0001*\u00020\u00072\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005H\u0086\b¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"decodeToList", "", "T", "Lcom/facebook/react/bridge/ReadableArray;", "deserializer", "Lkotlinx/serialization/DeserializationStrategy;", "decode", "Lcom/facebook/react/bridge/ReadableMap;", "(Lcom/facebook/react/bridge/ReadableMap;Lkotlinx/serialization/DeserializationStrategy;)Ljava/lang/Object;", "react_utilities_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class SerdeKt {
    public static final /* synthetic */ <T> T decode(ReadableMap readableMap, DeserializationStrategy deserializer) {
        Intrinsics.checkNotNullParameter(readableMap, "<this>");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return (T) new ReadableMapDecoder(readableMap).decodeSerializableValue(deserializer);
    }

    public static Object decode$default(ReadableMap readableMap, DeserializationStrategy deserializer, int i7, Object obj) {
        if ((i7 & 1) == 0) {
            Intrinsics.checkNotNullParameter(readableMap, "<this>");
            Intrinsics.checkNotNullParameter(deserializer, "deserializer");
            return new ReadableMapDecoder(readableMap).decodeSerializableValue(deserializer);
        }
        Intrinsics.reifiedOperationMarker(6, "T");
        MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.simple");
        Intrinsics.checkNotNullParameter(null, "type");
        d.F(b.f19552a, null);
        throw null;
    }

    public static final /* synthetic */ <T> List<T> decodeToList(ReadableArray readableArray, DeserializationStrategy deserializer) {
        Intrinsics.checkNotNullParameter(readableArray, "<this>");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return (List) new ReadableArrayDecoder(readableArray, false, 2, null).decodeSerializableValue(deserializer);
    }

    public static List decodeToList$default(ReadableArray readableArray, DeserializationStrategy deserializer, int i7, Object obj) {
        if ((i7 & 1) == 0) {
            Intrinsics.checkNotNullParameter(readableArray, "<this>");
            Intrinsics.checkNotNullParameter(deserializer, "deserializer");
            return (List) new ReadableArrayDecoder(readableArray, false, 2, null).decodeSerializableValue(deserializer);
        }
        Intrinsics.reifiedOperationMarker(6, "T");
        MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.simple");
        Intrinsics.checkNotNullParameter(null, "type");
        d.F(b.f19552a, null);
        throw null;
    }
}

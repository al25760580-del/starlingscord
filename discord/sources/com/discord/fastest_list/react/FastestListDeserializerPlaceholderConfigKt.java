package com.discord.fastest_list.react;

import com.discord.fastest_list.android.placeholder.FastestListPlaceholderConfig;
import com.discord.fastest_list.android.placeholder.FastestListPlaceholderType;
import com.discord.react.utilities.NativeMapExtensionsKt;
import com.facebook.react.bridge.ReadableMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0080\u0002¨\u0006\u0005"}, d2 = {"invoke", "Lcom/discord/fastest_list/android/placeholder/FastestListPlaceholderConfig;", "Lcom/discord/fastest_list/android/placeholder/FastestListPlaceholderConfig$Companion;", "value", "Lcom/facebook/react/bridge/ReadableMap;", "fastest_list_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class FastestListDeserializerPlaceholderConfigKt {
    @NotNull
    public static final FastestListPlaceholderConfig invoke(@NotNull FastestListPlaceholderConfig.Companion companion, @NotNull ReadableMap value) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        FastestListPlaceholderType.Companion companion2 = FastestListPlaceholderType.INSTANCE;
        return new FastestListPlaceholderConfig(FastestListDeserializerPlaceholderTypeKt.invoke(companion2, NativeMapExtensionsKt.getNonNullMap(value, "listFooter")), FastestListDeserializerPlaceholderTypeKt.invoke(companion2, NativeMapExtensionsKt.getNonNullMap(value, "listHeader")), FastestListDeserializerPlaceholderTypeKt.invoke(companion2, NativeMapExtensionsKt.getNonNullMap(value, "sectionFooter")), FastestListDeserializerPlaceholderTypeKt.invoke(companion2, NativeMapExtensionsKt.getNonNullMap(value, "sectionHeader")), FastestListDeserializerPlaceholderTypeKt.invoke(companion2, NativeMapExtensionsKt.getNonNullMap(value, "sectionItem")), FastestListDeserializerPlaceholderTypeKt.invoke(companion2, NativeMapExtensionsKt.getNonNullMap(value, "sectionItemAtFront")), FastestListDeserializerPlaceholderTypeKt.invoke(companion2, NativeMapExtensionsKt.getNonNullMap(value, "sectionItemAtRear")), FastestListDeserializerPlaceholderTypeKt.invoke(companion2, NativeMapExtensionsKt.getNonNullMap(value, "sectionItemSingleton")));
    }
}

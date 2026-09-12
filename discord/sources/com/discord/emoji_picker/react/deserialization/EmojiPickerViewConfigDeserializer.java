package com.discord.emoji_picker.react.deserialization;

import com.discord.emoji_picker.EmojiPickerView;
import com.discord.react.utilities.NativeMapExtensionsKt;
import com.facebook.react.bridge.ReadableMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u0005*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lcom/discord/emoji_picker/react/deserialization/EmojiPickerViewConfigDeserializer;", "", "<init>", "()V", "deserialize", "Lcom/discord/emoji_picker/EmojiPickerView$Config;", "Lcom/discord/emoji_picker/EmojiPickerView$Config$Companion;", "map", "Lcom/facebook/react/bridge/ReadableMap;", "emoji_picker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class EmojiPickerViewConfigDeserializer {

    @NotNull
    public static final EmojiPickerViewConfigDeserializer INSTANCE = new EmojiPickerViewConfigDeserializer();

    private EmojiPickerViewConfigDeserializer() {
    }

    @NotNull
    public final EmojiPickerView.Config deserialize(@NotNull EmojiPickerView.Config.Companion companion, @NotNull ReadableMap map) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        Intrinsics.checkNotNullParameter(map, "map");
        return new EmojiPickerView.Config(NativeMapExtensionsKt.getBoolean(map, "animateEmoji", true), NativeMapExtensionsKt.getBoolean$default(map, "scrollFastOptimizationEnabled", false, 2, null), NativeMapExtensionsKt.getInt(map, "scrollFastVelocity", Integer.MAX_VALUE), NativeMapExtensionsKt.getBoolean$default(map, "disableAnimationsOnScroll", false, 2, null));
    }
}

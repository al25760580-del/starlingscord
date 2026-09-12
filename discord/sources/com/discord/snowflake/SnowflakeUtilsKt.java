package com.discord.snowflake;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toTimestamp", "", "Lcom/discord/snowflake/SnowflakePrimitive;", "snowflake_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class SnowflakeUtilsKt {
    public static final long toTimestamp(@NotNull SnowflakePrimitive snowflakePrimitive) {
        Intrinsics.checkNotNullParameter(snowflakePrimitive, "<this>");
        return SnowflakeUtils.INSTANCE.toTimestamp(snowflakePrimitive);
    }
}

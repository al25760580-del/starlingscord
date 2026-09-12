package com.discord.snowflake;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nJ\u0012\u0010\u000b\u001a\u00060\u0005j\u0002`\f2\u0006\u0010\r\u001a\u00020\u0005J\u0011\u0010\u000e\u001a\u0004\u0018\u00010\u0005*\u00020\u000f¢\u0006\u0002\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\nH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/discord/snowflake/SnowflakeUtils;", "", "<init>", "()V", "DISCORD_EPOCH", "", "SNOWFLAKE_TIMESTAMP_SHIFT", "", "toTimestamp", "snowflake", "Lcom/discord/snowflake/SnowflakePrimitive;", "fromTimestamp", "Lcom/discord/snowflake/Snowflake;", "timestamp", "toSnowflake", "", "(Ljava/lang/String;)Ljava/lang/Long;", "toTimestampPart", "snowflakeId", "snowflake_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSnowflakeUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnowflakeUtils.kt\ncom/discord/snowflake/SnowflakeUtils\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,41:1\n1#2:42\n*E\n"})
public final class SnowflakeUtils {
    private static final long DISCORD_EPOCH = 1420070400000L;

    @NotNull
    public static final SnowflakeUtils INSTANCE = new SnowflakeUtils();
    private static final int SNOWFLAKE_TIMESTAMP_SHIFT = 22;

    private SnowflakeUtils() {
    }

    private final long toTimestampPart(SnowflakePrimitive snowflakeId) {
        return snowflakeId.getSnowflake() >>> 22;
    }

    public final long fromTimestamp(long timestamp) {
        return (timestamp - DISCORD_EPOCH) << 22;
    }

    public final Long toSnowflake(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Long lA0 = StringsKt.a0(str);
        if (lA0 == null || lA0.longValue() <= DISCORD_EPOCH) {
            return null;
        }
        return lA0;
    }

    public final long toTimestamp(@NotNull SnowflakePrimitive snowflake) {
        Intrinsics.checkNotNullParameter(snowflake, "snowflake");
        return toTimestampPart(snowflake) + DISCORD_EPOCH;
    }
}

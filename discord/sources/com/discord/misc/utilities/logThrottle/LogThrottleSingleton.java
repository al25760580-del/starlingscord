package com.discord.misc.utilities.logThrottle;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\tJ\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u0006J\u0006\u0010\u0013\u001a\u00020\u0012R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/discord/misc/utilities/logThrottle/LogThrottleSingleton;", "", "<init>", "()V", "messageTimestamps", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Ljava/util/concurrent/atomic/AtomicLong;", "RATE_LIMIT_ONE_SECOND", "", "RATE_LIMIT_ONE_MINUTE", "RATE_LIMIT_FIVE_MINUTES", "RATE_LIMIT_ONE_HOUR", "shouldThrottle", "", "messageKey", "rateLimitMs", "clearThrottle", "", "clearAll", "misc_utilities_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLogThrottleSingleton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LogThrottleSingleton.kt\ncom/discord/misc/utilities/logThrottle/LogThrottleSingleton\n+ 2 MapsJVM.kt\nkotlin/collections/MapsKt__MapsJVMKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,37:1\n72#2,2:38\n1#3:40\n*S KotlinDebug\n*F\n+ 1 LogThrottleSingleton.kt\ncom/discord/misc/utilities/logThrottle/LogThrottleSingleton\n*L\n19#1:38,2\n19#1:40\n*E\n"})
public final class LogThrottleSingleton {
    public static final long RATE_LIMIT_FIVE_MINUTES = 300000;
    public static final long RATE_LIMIT_ONE_HOUR = 3600000;
    public static final long RATE_LIMIT_ONE_MINUTE = 60000;
    public static final long RATE_LIMIT_ONE_SECOND = 1000;

    @NotNull
    public static final LogThrottleSingleton INSTANCE = new LogThrottleSingleton();

    @NotNull
    private static final ConcurrentHashMap<String, AtomicLong> messageTimestamps = new ConcurrentHashMap<>();

    private LogThrottleSingleton() {
    }

    public final void clearAll() {
        messageTimestamps.clear();
    }

    public final void clearThrottle(@NotNull String messageKey) {
        Intrinsics.checkNotNullParameter(messageKey, "messageKey");
        messageTimestamps.remove(messageKey);
    }

    public final boolean shouldThrottle(@NotNull String messageKey, long rateLimitMs) {
        AtomicLong atomicLongPutIfAbsent;
        Intrinsics.checkNotNullParameter(messageKey, "messageKey");
        long jCurrentTimeMillis = System.currentTimeMillis();
        ConcurrentHashMap<String, AtomicLong> concurrentHashMap = messageTimestamps;
        AtomicLong atomicLong = concurrentHashMap.get(messageKey);
        if (atomicLong == null && (atomicLongPutIfAbsent = concurrentHashMap.putIfAbsent(messageKey, (atomicLong = new AtomicLong(0L)))) != null) {
            atomicLong = atomicLongPutIfAbsent;
        }
        AtomicLong atomicLong2 = atomicLong;
        long j = atomicLong2.get();
        if (rateLimitMs + j > jCurrentTimeMillis) {
            return true;
        }
        return !atomicLong2.compareAndSet(j, jCurrentTimeMillis);
    }
}

package u8;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public interface a {
    @n8.c
    default long now() {
        return TimeUnit.NANOSECONDS.toMillis(nowNanos());
    }

    @n8.c
    long nowNanos();
}

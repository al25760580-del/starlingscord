package io.sentry.profilemeasurements;

import com.facebook.imagepipeline.nativecode.c;
import io.sentry.ILogger;
import io.sentry.y1;
import io.sentry.y2;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements y1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ConcurrentHashMap f12896d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public double f12897e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f12898i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public double f12899v;

    public b(Long l6, Number number, long j) {
        this.f12898i = l6.toString();
        this.f12899v = number.doubleValue();
        this.f12897e = j / 1.0E9d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return c.r(this.f12896d, bVar.f12896d) && this.f12898i.equals(bVar.f12898i) && this.f12899v == bVar.f12899v && this.f12897e == bVar.f12897e;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f12896d, this.f12898i, Double.valueOf(this.f12899v)});
    }

    @Override // io.sentry.y1
    public final void serialize(y2 y2Var, ILogger iLogger) {
        y2Var.q();
        y2Var.v("value").r(iLogger, Double.valueOf(this.f12899v));
        y2Var.v("elapsed_since_start_ns").r(iLogger, this.f12898i);
        y2Var.v("timestamp").r(iLogger, BigDecimal.valueOf(this.f12897e).setScale(6, RoundingMode.DOWN));
        ConcurrentHashMap concurrentHashMap = this.f12896d;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                com.discord.chat.presentation.list.a.s(this.f12896d, str, y2Var, str, iLogger);
            }
        }
        y2Var.l();
    }
}

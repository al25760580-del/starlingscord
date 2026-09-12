package io.sentry;

import java.util.Date;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class h6 implements y1 {
    public Long E;
    public Double F;
    public final String G;
    public String H;
    public final String I;
    public final String J;
    public String K;
    public final io.sentry.util.a L = new io.sentry.util.a();
    public ConcurrentHashMap M;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Date f12716d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Date f12717e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AtomicInteger f12718i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f12719v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f12720w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Boolean f12721x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public g6 f12722y;

    public h6(g6 g6Var, Date date, Date date2, int i7, String str, String str2, Boolean bool, Long l6, Double d6, String str3, String str4, String str5, String str6, String str7) {
        this.f12722y = g6Var;
        this.f12716d = date;
        this.f12717e = date2;
        this.f12718i = new AtomicInteger(i7);
        this.f12719v = str;
        this.f12720w = str2;
        this.f12721x = bool;
        this.E = l6;
        this.F = d6;
        this.G = str3;
        this.H = str4;
        this.I = str5;
        this.J = str6;
        this.K = str7;
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final h6 clone() {
        return new h6(this.f12722y, this.f12716d, this.f12717e, this.f12718i.get(), this.f12719v, this.f12720w, this.f12721x, this.E, this.F, this.G, this.H, this.I, this.J, this.K);
    }

    public final void b(Date date) {
        r rVarA = this.L.a();
        try {
            this.f12721x = null;
            if (this.f12722y == g6.Ok) {
                this.f12722y = g6.Exited;
            }
            if (date != null) {
                this.f12717e = date;
            } else {
                this.f12717e = io.sentry.config.a.y();
            }
            Date date2 = this.f12717e;
            if (date2 != null) {
                this.F = Double.valueOf(Math.abs(date2.getTime() - this.f12716d.getTime()) / 1000.0d);
                long time = this.f12717e.getTime();
                if (time < 0) {
                    time = Math.abs(time);
                }
                this.E = Long.valueOf(time);
            }
            rVarA.close();
        } catch (Throwable th2) {
            try {
                rVarA.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final Date c() {
        Date date = this.f12716d;
        if (date == null) {
            return null;
        }
        return (Date) date.clone();
    }

    public final boolean d(g6 g6Var, String str, boolean z5, String str2) {
        boolean z6;
        r rVarA = this.L.a();
        boolean z7 = true;
        if (g6Var != null) {
            try {
                this.f12722y = g6Var;
                z6 = true;
            } catch (Throwable th2) {
                try {
                    rVarA.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } else {
            z6 = false;
        }
        if (str != null) {
            this.H = str;
            z6 = true;
        }
        if (z5) {
            this.f12718i.addAndGet(1);
            z6 = true;
        }
        if (str2 != null) {
            this.K = str2;
        } else {
            z7 = z6;
        }
        if (z7) {
            this.f12721x = null;
            Date dateY = io.sentry.config.a.y();
            this.f12717e = dateY;
            if (dateY != null) {
                long time = dateY.getTime();
                if (time < 0) {
                    time = Math.abs(time);
                }
                this.E = Long.valueOf(time);
            }
        }
        rVarA.close();
        return z7;
    }

    @Override // io.sentry.y1
    public final void serialize(y2 y2Var, ILogger iLogger) {
        y2Var.q();
        String str = this.f12720w;
        if (str != null) {
            y2Var.v("sid").f(str);
        }
        String str2 = this.f12719v;
        if (str2 != null) {
            y2Var.v("did").f(str2);
        }
        if (this.f12721x != null) {
            y2Var.v("init").t(this.f12721x);
        }
        y2Var.v("started").r(iLogger, this.f12716d);
        y2Var.v("status").r(iLogger, this.f12722y.name().toLowerCase(Locale.ROOT));
        if (this.E != null) {
            y2Var.v("seq").o(this.E);
        }
        y2Var.v("errors").c(this.f12718i.intValue());
        if (this.F != null) {
            y2Var.v("duration").o(this.F);
        }
        if (this.f12717e != null) {
            y2Var.v("timestamp").r(iLogger, this.f12717e);
        }
        if (this.K != null) {
            y2Var.v("abnormal_mechanism").r(iLogger, this.K);
        }
        y2Var.v("attrs");
        y2Var.q();
        y2Var.v("release").r(iLogger, this.J);
        String str3 = this.I;
        if (str3 != null) {
            y2Var.v("environment").r(iLogger, str3);
        }
        String str4 = this.G;
        if (str4 != null) {
            y2Var.v("ip_address").r(iLogger, str4);
        }
        if (this.H != null) {
            y2Var.v("user_agent").r(iLogger, this.H);
        }
        y2Var.l();
        ConcurrentHashMap concurrentHashMap = this.M;
        if (concurrentHashMap != null) {
            for (String str5 : concurrentHashMap.keySet()) {
                com.discord.chat.presentation.list.a.s(this.M, str5, y2Var, str5, iLogger);
            }
        }
        y2Var.l();
    }
}

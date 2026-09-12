package io.sentry;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class SentryEvent extends f4 implements y1 {
    public Date M;
    public io.sentry.protocol.n N;
    public String O;
    public f6 P;
    public f6 Q;
    public SentryLevel R;
    public String S;
    public List T;
    public ConcurrentHashMap U;
    public AbstractMap V;

    public SentryEvent(Throwable th2) {
        this();
        this.G = th2;
    }

    public final ArrayList d() {
        f6 f6Var = this.Q;
        if (f6Var == null) {
            return null;
        }
        return f6Var.f12677a;
    }

    public final io.sentry.protocol.u e() {
        Boolean bool;
        f6 f6Var = this.Q;
        if (f6Var == null) {
            return null;
        }
        for (io.sentry.protocol.u uVar : f6Var.f12677a) {
            io.sentry.protocol.m mVar = uVar.f13053x;
            if (mVar != null && (bool = mVar.f12998v) != null && !bool.booleanValue()) {
                return uVar;
            }
        }
        return null;
    }

    public final boolean f() {
        f6 f6Var = this.Q;
        return (f6Var == null || f6Var.f12677a.isEmpty()) ? false : true;
    }

    @Override // io.sentry.y1
    public final void serialize(y2 y2Var, ILogger iLogger) {
        y2Var.q();
        y2Var.v("timestamp").r(iLogger, this.M);
        if (this.N != null) {
            y2Var.v("message").r(iLogger, this.N);
        }
        if (this.O != null) {
            y2Var.v("logger").f(this.O);
        }
        f6 f6Var = this.P;
        if (f6Var != null && !f6Var.f12677a.isEmpty()) {
            y2Var.v("threads");
            y2Var.q();
            y2Var.v("values").r(iLogger, this.P.f12677a);
            y2Var.l();
        }
        f6 f6Var2 = this.Q;
        if (f6Var2 != null && !f6Var2.f12677a.isEmpty()) {
            y2Var.v("exception");
            y2Var.q();
            y2Var.v("values").r(iLogger, this.Q.f12677a);
            y2Var.l();
        }
        if (this.R != null) {
            y2Var.v("level").r(iLogger, this.R);
        }
        if (this.S != null) {
            y2Var.v("transaction").f(this.S);
        }
        if (this.T != null) {
            y2Var.v("fingerprint").r(iLogger, this.T);
        }
        if (this.V != null) {
            y2Var.v("modules").r(iLogger, this.V);
        }
        ls.d.D(this, y2Var, iLogger);
        ConcurrentHashMap concurrentHashMap = this.U;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                com.discord.chat.presentation.list.a.s(this.U, str, y2Var, str, iLogger);
            }
        }
        y2Var.l();
    }

    public SentryEvent() {
        io.sentry.protocol.v vVar = new io.sentry.protocol.v();
        Date dateY = io.sentry.config.a.y();
        super(vVar);
        this.M = dateY;
    }
}

package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.x4;
import io.sentry.y1;
import io.sentry.y2;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class SentryStackFrame implements y1 {
    public Integer E;
    public String F;
    public String G;
    public Boolean H;
    public String I;
    public Boolean J;
    public String K;
    public String L;
    public String M;
    public String N;
    public String O;
    public String P;
    public ConcurrentHashMap Q;
    public String R;
    public x4 S;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f12900d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f12901e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Map f12902i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f12903v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f12904w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f12905x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Integer f12906y;

    public final boolean equals(Object obj) {
        if (obj == null || SentryStackFrame.class != obj.getClass()) {
            return false;
        }
        SentryStackFrame sentryStackFrame = (SentryStackFrame) obj;
        return Objects.equals(this.f12900d, sentryStackFrame.f12900d) && Objects.equals(this.f12901e, sentryStackFrame.f12901e) && Objects.equals(this.f12902i, sentryStackFrame.f12902i) && Objects.equals(this.f12903v, sentryStackFrame.f12903v) && Objects.equals(this.f12904w, sentryStackFrame.f12904w) && Objects.equals(this.f12905x, sentryStackFrame.f12905x) && Objects.equals(this.f12906y, sentryStackFrame.f12906y) && Objects.equals(this.E, sentryStackFrame.E) && Objects.equals(this.F, sentryStackFrame.F) && Objects.equals(this.G, sentryStackFrame.G) && Objects.equals(this.H, sentryStackFrame.H) && Objects.equals(this.I, sentryStackFrame.I) && Objects.equals(this.J, sentryStackFrame.J) && Objects.equals(this.K, sentryStackFrame.K) && Objects.equals(this.L, sentryStackFrame.L) && Objects.equals(this.M, sentryStackFrame.M) && Objects.equals(this.N, sentryStackFrame.N) && Objects.equals(this.O, sentryStackFrame.O) && Objects.equals(this.P, sentryStackFrame.P) && Objects.equals(this.Q, sentryStackFrame.Q) && Objects.equals(this.R, sentryStackFrame.R) && Objects.equals(this.S, sentryStackFrame.S);
    }

    public final int hashCode() {
        return Objects.hash(this.f12900d, this.f12901e, this.f12902i, null, this.f12903v, this.f12904w, this.f12905x, this.f12906y, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, this.R, this.S);
    }

    @Override // io.sentry.y1
    public final void serialize(y2 y2Var, ILogger iLogger) {
        y2Var.q();
        if (this.f12903v != null) {
            y2Var.v("filename").f(this.f12903v);
        }
        if (this.f12904w != null) {
            y2Var.v("function").f(this.f12904w);
        }
        if (this.f12905x != null) {
            y2Var.v("module").f(this.f12905x);
        }
        if (this.f12906y != null) {
            y2Var.v("lineno").o(this.f12906y);
        }
        if (this.E != null) {
            y2Var.v("colno").o(this.E);
        }
        if (this.F != null) {
            y2Var.v("abs_path").f(this.F);
        }
        if (this.G != null) {
            y2Var.v("context_line").f(this.G);
        }
        if (this.H != null) {
            y2Var.v("in_app").t(this.H);
        }
        if (this.I != null) {
            y2Var.v("package").f(this.I);
        }
        if (this.J != null) {
            y2Var.v("native").t(this.J);
        }
        if (this.K != null) {
            y2Var.v("platform").f(this.K);
        }
        if (this.L != null) {
            y2Var.v("image_addr").f(this.L);
        }
        if (this.M != null) {
            y2Var.v("symbol_addr").f(this.M);
        }
        if (this.N != null) {
            y2Var.v("instruction_addr").f(this.N);
        }
        if (this.O != null) {
            y2Var.v("addr_mode").f(this.O);
        }
        if (this.R != null) {
            y2Var.v("raw_function").f(this.R);
        }
        if (this.P != null) {
            y2Var.v("symbol").f(this.P);
        }
        if (this.S != null) {
            y2Var.v("lock").r(iLogger, this.S);
        }
        List list = this.f12900d;
        if (list != null && !list.isEmpty()) {
            y2Var.v("pre_context").r(iLogger, this.f12900d);
        }
        List list2 = this.f12901e;
        if (list2 != null && !list2.isEmpty()) {
            y2Var.v("post_context").r(iLogger, this.f12901e);
        }
        Map map = this.f12902i;
        if (map != null && !map.isEmpty()) {
            y2Var.v("vars").r(iLogger, this.f12902i);
        }
        ConcurrentHashMap concurrentHashMap = this.Q;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                com.discord.chat.presentation.list.a.s(this.Q, str, y2Var, str, iLogger);
            }
        }
        y2Var.l();
    }
}

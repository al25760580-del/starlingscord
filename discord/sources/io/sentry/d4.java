package io.sentry;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class d4 implements y1 {
    public int E;
    public boolean F;
    public boolean G;
    public boolean H;
    public f3 I;
    public ConcurrentHashMap J;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f12619d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Double f12620e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f12621i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Double f12622v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f12623w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f12624x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f12625y;

    public d4(w5 w5Var, e9.b bVar) {
        this.f12621i = ((Boolean) bVar.f8109d).booleanValue();
        this.f12622v = (Double) bVar.f8110e;
        this.f12619d = ((Boolean) bVar.f8112v).booleanValue();
        this.f12620e = (Double) bVar.f8113w;
        p6 internalTracesSampler = w5Var.getInternalTracesSampler();
        double dC = io.sentry.util.j.a().c();
        Double profileSessionSampleRate = internalTracesSampler.f12892a.getProfileSessionSampleRate();
        this.F = profileSessionSampleRate != null && profileSessionSampleRate.doubleValue() >= dC;
        this.f12623w = w5Var.getProfilingTracesDirPath();
        this.f12624x = w5Var.isProfilingEnabled();
        this.f12625y = w5Var.isContinuousProfilingEnabled();
        this.I = w5Var.getProfileLifecycle();
        this.E = w5Var.getProfilingTracesHz();
        this.G = w5Var.isEnableAppStartProfiling();
        this.H = w5Var.isStartProfilerOnAppStart();
    }

    @Override // io.sentry.y1
    public final void serialize(y2 y2Var, ILogger iLogger) {
        y2Var.q();
        y2Var.v("profile_sampled").r(iLogger, Boolean.valueOf(this.f12619d));
        y2Var.v("profile_sample_rate").r(iLogger, this.f12620e);
        y2Var.v("continuous_profile_sampled").r(iLogger, Boolean.valueOf(this.F));
        y2Var.v("trace_sampled").r(iLogger, Boolean.valueOf(this.f12621i));
        y2Var.v("trace_sample_rate").r(iLogger, this.f12622v);
        y2Var.v("profiling_traces_dir_path").r(iLogger, this.f12623w);
        y2Var.v("is_profiling_enabled").r(iLogger, Boolean.valueOf(this.f12624x));
        y2Var.v("is_continuous_profiling_enabled").r(iLogger, Boolean.valueOf(this.f12625y));
        y2Var.v("profile_lifecycle").r(iLogger, this.I.name());
        y2Var.v("profiling_traces_hz").r(iLogger, Integer.valueOf(this.E));
        y2Var.v("is_enable_app_start_profiling").r(iLogger, Boolean.valueOf(this.G));
        y2Var.v("is_start_profiler_on_app_start").r(iLogger, Boolean.valueOf(this.H));
        ConcurrentHashMap concurrentHashMap = this.J;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                com.discord.chat.presentation.list.a.s(this.J, str, y2Var, str, iLogger);
            }
        }
        y2Var.l();
    }
}

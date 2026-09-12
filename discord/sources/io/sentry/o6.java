package io.sentry;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class o6 implements y1 {
    public final String E;
    public final String F;
    public final io.sentry.protocol.v G;
    public ConcurrentHashMap H;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final io.sentry.protocol.v f12853d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f12854e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f12855i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f12856v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f12857w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final String f12858x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final String f12859y;

    public o6(io.sentry.protocol.v vVar, String str, String str2, String str3, String str4, String str5, String str6, String str7, io.sentry.protocol.v vVar2, String str8) {
        this.f12853d = vVar;
        this.f12854e = str;
        this.f12855i = str2;
        this.f12856v = str3;
        this.f12857w = str4;
        this.f12858x = str5;
        this.f12859y = str6;
        this.F = str7;
        this.G = vVar2;
        this.E = str8;
    }

    @Override // io.sentry.y1
    public final void serialize(y2 y2Var, ILogger iLogger) {
        y2Var.q();
        y2Var.v("trace_id").r(iLogger, this.f12853d);
        y2Var.v("public_key").f(this.f12854e);
        String str = this.f12855i;
        if (str != null) {
            y2Var.v("release").f(str);
        }
        String str2 = this.f12856v;
        if (str2 != null) {
            y2Var.v("environment").f(str2);
        }
        String str3 = this.f12857w;
        if (str3 != null) {
            y2Var.v("user_id").f(str3);
        }
        String str4 = this.f12858x;
        if (str4 != null) {
            y2Var.v("transaction").f(str4);
        }
        String str5 = this.f12859y;
        if (str5 != null) {
            y2Var.v("sample_rate").f(str5);
        }
        String str6 = this.E;
        if (str6 != null) {
            y2Var.v("sample_rand").f(str6);
        }
        String str7 = this.F;
        if (str7 != null) {
            y2Var.v("sampled").f(str7);
        }
        io.sentry.protocol.v vVar = this.G;
        if (vVar != null) {
            y2Var.v("replay_id").r(iLogger, vVar);
        }
        ConcurrentHashMap concurrentHashMap = this.H;
        if (concurrentHashMap != null) {
            for (String str8 : concurrentHashMap.keySet()) {
                com.discord.chat.presentation.list.a.s(this.H, str8, y2Var, str8, iLogger);
            }
        }
        y2Var.l();
    }
}

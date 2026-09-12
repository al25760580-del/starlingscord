package io.sentry;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class g3 implements y1 {
    public String E;
    public String F;
    public boolean G;
    public String H;
    public String J;
    public String K;
    public String L;
    public final ArrayList M;
    public String N;
    public String O;
    public String P;
    public String Q;
    public String R;
    public String S;
    public String T;
    public String U;
    public String V;
    public Date W;
    public final Map X;
    public ConcurrentHashMap Z;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final File f12687d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Callable f12688e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f12689i;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f12691w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f12692x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f12693y;
    public List I = new ArrayList();
    public String Y = null;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f12690v = Locale.getDefault().toString();

    public g3(File file, Date date, ArrayList arrayList, String str, String str2, String str3, String str4, int i7, String str5, Callable callable, String str6, String str7, String str8, Boolean bool, String str9, String str10, String str11, String str12, String str13, Map map) {
        this.f12687d = file;
        this.W = date;
        this.H = str5;
        this.f12688e = callable;
        this.f12689i = i7;
        this.f12691w = str6 == null ? "" : str6;
        this.f12692x = str7 == null ? "" : str7;
        this.F = str8 != null ? str8 : "";
        this.G = bool != null ? bool.booleanValue() : false;
        this.J = str9 != null ? str9 : "0";
        this.f12693y = "";
        this.E = "android";
        this.K = "android";
        this.L = str10 != null ? str10 : "";
        this.M = arrayList;
        this.N = str.isEmpty() ? "unknown" : str;
        this.O = str4;
        this.P = "";
        this.Q = str11 != null ? str11 : "";
        this.R = str2;
        this.S = str3;
        this.T = ls.l.r();
        this.U = str12 != null ? str12 : "production";
        this.V = str13;
        if (!str13.equals("normal") && !this.V.equals("timeout") && !this.V.equals("backgrounded")) {
            this.V = "normal";
        }
        this.X = map;
    }

    @Override // io.sentry.y1
    public final void serialize(y2 y2Var, ILogger iLogger) {
        y2Var.q();
        y2Var.v("android_api_level").r(iLogger, Integer.valueOf(this.f12689i));
        y2Var.v("device_locale").r(iLogger, this.f12690v);
        y2Var.v("device_manufacturer").f(this.f12691w);
        y2Var.v("device_model").f(this.f12692x);
        y2Var.v("device_os_build_number").f(this.f12693y);
        y2Var.v("device_os_name").f(this.E);
        y2Var.v("device_os_version").f(this.F);
        y2Var.v("device_is_emulator").j(this.G);
        y2Var.v("architecture").r(iLogger, this.H);
        y2Var.v("device_cpu_frequencies").r(iLogger, this.I);
        y2Var.v("device_physical_memory_bytes").f(this.J);
        y2Var.v("platform").f(this.K);
        y2Var.v("build_id").f(this.L);
        y2Var.v("transaction_name").f(this.N);
        y2Var.v("duration_ns").f(this.O);
        y2Var.v("version_name").f(this.Q);
        y2Var.v("version_code").f(this.P);
        ArrayList arrayList = this.M;
        if (!arrayList.isEmpty()) {
            y2Var.v("transactions").r(iLogger, arrayList);
        }
        y2Var.v("transaction_id").f(this.R);
        y2Var.v("trace_id").f(this.S);
        y2Var.v("profile_id").f(this.T);
        y2Var.v("environment").f(this.U);
        y2Var.v("truncation_reason").f(this.V);
        if (this.Y != null) {
            y2Var.v("sampled_profile").f(this.Y);
        }
        String strI = y2Var.i();
        y2Var.m("");
        y2Var.v("measurements").r(iLogger, this.X);
        y2Var.m(strI);
        y2Var.v("timestamp").r(iLogger, this.W);
        ConcurrentHashMap concurrentHashMap = this.Z;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                com.discord.chat.presentation.list.a.s(this.Z, str, y2Var, str, iLogger);
            }
        }
        y2Var.l();
    }
}

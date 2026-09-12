package io.sentry;

import java.util.HashMap;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class q4 implements y1 {
    public final String E;
    public HashMap F;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f13081d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Integer f13082e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f13083i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f13084v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final w4 f13085w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f13086x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Callable f13087y;

    public q4(w4 w4Var, int i7, String str, String str2, String str3, String str4, Integer num) {
        this.f13085w = w4Var;
        this.f13081d = str;
        this.f13086x = i7;
        this.f13083i = str2;
        this.f13087y = null;
        this.E = str3;
        this.f13084v = str4;
        this.f13082e = num;
    }

    public final int a() {
        Callable callable = this.f13087y;
        if (callable == null) {
            return this.f13086x;
        }
        try {
            return ((Integer) callable.call()).intValue();
        } catch (Throwable unused) {
            return -1;
        }
    }

    @Override // io.sentry.y1
    public final void serialize(y2 y2Var, ILogger iLogger) {
        y2Var.q();
        String str = this.f13081d;
        if (str != null) {
            y2Var.v("content_type").f(str);
        }
        String str2 = this.f13083i;
        if (str2 != null) {
            y2Var.v("filename").f(str2);
        }
        y2Var.v("type").r(iLogger, this.f13085w);
        String str3 = this.E;
        if (str3 != null) {
            y2Var.v("attachment_type").f(str3);
        }
        String str4 = this.f13084v;
        if (str4 != null) {
            y2Var.v("platform").f(str4);
        }
        Integer num = this.f13082e;
        if (num != null) {
            y2Var.v("item_count").o(num);
        }
        y2Var.v("length").c(a());
        HashMap map = this.F;
        if (map != null) {
            for (String str5 : map.keySet()) {
                Object obj = this.F.get(str5);
                y2Var.v(str5);
                y2Var.r(iLogger, obj);
            }
        }
        y2Var.l();
    }

    public q4(w4 w4Var, Callable callable, String str, String str2, String str3) {
        this(w4Var, callable, str, str2, str3, (String) null, (Integer) null);
    }

    public q4(w4 w4Var, Callable callable, String str, String str2, String str3, String str4, Integer num) {
        com.facebook.imagepipeline.nativecode.c.H(w4Var, "type is required");
        this.f13085w = w4Var;
        this.f13081d = str;
        this.f13086x = -1;
        this.f13083i = str2;
        this.f13087y = callable;
        this.E = str3;
        this.f13084v = str4;
        this.f13082e = num;
    }
}

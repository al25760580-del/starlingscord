package io.sentry.android.core.performance;

import android.os.Looper;
import io.sentry.ISpan;
import io.sentry.j4;
import io.sentry.k1;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public j4 f12368b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public j4 f12369c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ISpan f12370d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ISpan f12371e = null;

    public b(String str) {
        this.f12367a = str;
    }

    public static ISpan a(ISpan iSpan, String str, j4 j4Var) {
        ISpan iSpanC = iSpan.c(str, j4Var, k1.SENTRY);
        iSpanC.h(Long.valueOf(Looper.getMainLooper().getThread().getId()), "thread.id");
        iSpanC.h("main", "thread.name");
        Boolean bool = Boolean.TRUE;
        iSpanC.h(bool, "ui.contributes_to_ttid");
        iSpanC.h(bool, "ui.contributes_to_ttfd");
        return iSpanC;
    }
}

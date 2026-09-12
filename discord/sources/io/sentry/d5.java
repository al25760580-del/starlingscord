package io.sentry;

import com.facebook.react.modules.dialog.AlertFragment;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class d5 implements y1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f12626d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public HashMap f12627e;

    public d5(List list) {
        this.f12626d = list;
    }

    @Override // io.sentry.y1
    public final void serialize(y2 y2Var, ILogger iLogger) {
        y2Var.q();
        y2Var.v(AlertFragment.ARG_ITEMS).r(iLogger, this.f12626d);
        HashMap map = this.f12627e;
        if (map != null) {
            for (String str : map.keySet()) {
                y2Var.v(str).r(iLogger, this.f12627e.get(str));
            }
        }
        y2Var.l();
    }
}

package io.sentry;

import com.facebook.react.modules.dialog.AlertFragment;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class z4 implements y1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f13306d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public HashMap f13307e;

    public z4(List list) {
        this.f13306d = list;
    }

    @Override // io.sentry.y1
    public final void serialize(y2 y2Var, ILogger iLogger) {
        y2Var.q();
        y2Var.v(AlertFragment.ARG_ITEMS).r(iLogger, this.f13306d);
        HashMap map = this.f13307e;
        if (map != null) {
            for (String str : map.keySet()) {
                y2Var.v(str).r(iLogger, this.f13307e.get(str));
            }
        }
        y2Var.l();
    }
}

package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.w5;
import io.sentry.y1;
import io.sentry.y2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements y1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public s f12932d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f12933e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public HashMap f12934i;

    public static d a(d dVar, w5 w5Var) {
        ArrayList arrayList = new ArrayList();
        if (w5Var.getProguardUuid() != null) {
            DebugImage debugImage = new DebugImage();
            debugImage.setType(DebugImage.PROGUARD);
            debugImage.setUuid(w5Var.getProguardUuid());
            arrayList.add(debugImage);
        }
        for (String str : w5Var.getBundleIds()) {
            DebugImage debugImage2 = new DebugImage();
            debugImage2.setType(DebugImage.JVM);
            debugImage2.setDebugId(str);
            arrayList.add(debugImage2);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        if (dVar == null) {
            dVar = new d();
        }
        List list = dVar.f12933e;
        if (list == null) {
            dVar.f12933e = new ArrayList(arrayList);
            return dVar;
        }
        list.addAll(arrayList);
        return dVar;
    }

    @Override // io.sentry.y1
    public final void serialize(y2 y2Var, ILogger iLogger) {
        y2Var.q();
        if (this.f12932d != null) {
            y2Var.v("sdk_info").r(iLogger, this.f12932d);
        }
        if (this.f12933e != null) {
            y2Var.v("images").r(iLogger, this.f12933e);
        }
        HashMap map = this.f12934i;
        if (map != null) {
            for (String str : map.keySet()) {
                y2Var.v(str).r(iLogger, this.f12934i.get(str));
            }
        }
        y2Var.l();
    }
}

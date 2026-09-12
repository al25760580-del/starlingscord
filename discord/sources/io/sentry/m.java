package io.sentry;

import io.sentry.android.core.SentryAndroidOptions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class m implements b0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f12811d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f12812e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final w5 f12813i;

    public m(w5 w5Var) {
        this.f12811d = 1;
        this.f12812e = Collections.synchronizedMap(new WeakHashMap());
        this.f12813i = w5Var;
    }

    @Override // io.sentry.b0
    public final SentryEvent f(SentryEvent sentryEvent, Hint hint) {
        io.sentry.protocol.u uVarE;
        String str;
        Long l6;
        switch (this.f12811d) {
            case 0:
                if (!s6.class.isInstance(hint.b("sentry:typeCheckHint")) || (uVarE = sentryEvent.e()) == null || (str = uVarE.f13048d) == null || (l6 = uVarE.f13051v) == null) {
                    return sentryEvent;
                }
                Map map = this.f12812e;
                Long l7 = (Long) map.get(str);
                if (l7 == null || l7.equals(l6)) {
                    map.put(str, l6);
                    return sentryEvent;
                }
                this.f12813i.getLogger().q(SentryLevel.INFO, "Event %s has been dropped due to multi-threaded deduplication", sentryEvent.f12670d);
                hint.d(io.sentry.hints.e.MULTITHREADED_DEDUPLICATION, "sentry:eventDropReason");
                return null;
            default:
                w5 w5Var = this.f12813i;
                if (!w5Var.isEnableDeduplication()) {
                    w5Var.getLogger().q(SentryLevel.DEBUG, "Event deduplication is disabled.", new Object[0]);
                    return sentryEvent;
                }
                Throwable thA = sentryEvent.a();
                if (thA == null) {
                    return sentryEvent;
                }
                Map map2 = this.f12812e;
                if (!map2.containsKey(thA)) {
                    ArrayList arrayList = new ArrayList();
                    for (Throwable cause = thA; cause.getCause() != null; cause = cause.getCause()) {
                        arrayList.add(cause.getCause());
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (map2.containsKey(it.next())) {
                        }
                    }
                    map2.put(thA, null);
                    return sentryEvent;
                }
                w5Var.getLogger().q(SentryLevel.DEBUG, "Duplicate Exception detected. Event %s will be discarded.", sentryEvent.f12670d);
                return null;
        }
    }

    public m(SentryAndroidOptions sentryAndroidOptions) {
        this.f12811d = 0;
        this.f12812e = Collections.synchronizedMap(new HashMap());
        this.f12813i = sentryAndroidOptions;
    }
}

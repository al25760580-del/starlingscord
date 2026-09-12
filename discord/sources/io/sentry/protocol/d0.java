package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.e6;
import io.sentry.f4;
import io.sentry.i6;
import io.sentry.j6;
import io.sentry.y1;
import io.sentry.y2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class d0 extends f4 implements y1 {
    public String M;
    public Double N;
    public Double O;
    public final ArrayList P;
    public final HashMap Q;
    public f0 R;
    public ConcurrentHashMap S;

    public d0(ArrayList arrayList, HashMap map, f0 f0Var) {
        Double dValueOf = Double.valueOf(0.0d);
        ArrayList arrayList2 = new ArrayList();
        this.P = arrayList2;
        HashMap map2 = new HashMap();
        this.Q = map2;
        this.M = "";
        this.N = dValueOf;
        this.O = null;
        arrayList2.addAll(arrayList);
        map2.putAll(map);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.Q.putAll(((y) it.next()).I);
        }
        this.R = f0Var;
    }

    @Override // io.sentry.y1
    public final void serialize(y2 y2Var, ILogger iLogger) {
        y2Var.q();
        if (this.M != null) {
            y2Var.v("transaction").f(this.M);
        }
        y2Var.v("start_timestamp").r(iLogger, io.sentry.config.a.o(this.N));
        if (this.O != null) {
            y2Var.v("timestamp").r(iLogger, io.sentry.config.a.o(this.O));
        }
        ArrayList arrayList = this.P;
        if (!arrayList.isEmpty()) {
            y2Var.v("spans").r(iLogger, arrayList);
        }
        y2Var.v("type").f("transaction");
        HashMap map = this.Q;
        if (!map.isEmpty()) {
            y2Var.v("measurements").r(iLogger, map);
        }
        y2Var.v("transaction_info").r(iLogger, this.R);
        ls.d.D(this, y2Var, iLogger);
        ConcurrentHashMap concurrentHashMap = this.S;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                com.discord.chat.presentation.list.a.s(this.S, str, y2Var, str, iLogger);
            }
        }
        y2Var.l();
    }

    public d0(e6 e6Var) {
        super(e6Var.f12642a);
        this.P = new ArrayList();
        this.Q = new HashMap();
        i6 i6Var = e6Var.f12643b;
        this.N = Double.valueOf(i6Var.f12744a.d() / 1.0E9d);
        this.O = Double.valueOf(i6Var.f12744a.c(i6Var.f12745b) / 1.0E9d);
        this.M = e6Var.f12646e;
        for (i6 i6Var2 : e6Var.f12644c) {
            if (Boolean.TRUE.equals(i6Var2.t())) {
                this.P.add(new y(i6Var2));
            }
        }
        c cVar = this.f12671e;
        cVar.l(e6Var.f12655p);
        j6 j6Var = i6Var.f12746c;
        ConcurrentHashMap concurrentHashMap = i6Var.j;
        j6 j6Var2 = new j6(j6Var.f12782d, j6Var.f12783e, j6Var.f12784i, j6Var.f12786w, j6Var.f12787x, j6Var.f12785v, j6Var.f12788y, j6Var.F);
        for (Map.Entry entry : j6Var.E.entrySet()) {
            c((String) entry.getKey(), (String) entry.getValue());
        }
        if (concurrentHashMap != null) {
            for (Map.Entry entry2 : concurrentHashMap.entrySet()) {
                String str = (String) entry2.getKey();
                Object value = entry2.getValue();
                if (str != null) {
                    if (value == null) {
                        j6Var2.G.remove(str);
                    } else {
                        j6Var2.G.put(str, value);
                    }
                }
            }
        }
        j6Var.K.h();
        cVar.w(j6Var2);
        this.R = new f0(e6Var.f12653n.apiName());
    }
}

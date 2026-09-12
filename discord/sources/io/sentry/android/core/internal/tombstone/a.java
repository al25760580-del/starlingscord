package io.sentry.android.core.internal.tombstone;

import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import hj.o0;
import hj.r;
import hj.s0;
import hj.t;
import hj.v;
import io.sentry.SentryEvent;
import io.sentry.SentryLevel;
import io.sentry.f6;
import io.sentry.protocol.a0;
import io.sentry.protocol.c0;
import io.sentry.protocol.u;
import io.sentry.protocol.z;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements Closeable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f12264d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f12265e;

    public a(HttpURLConnection httpURLConnection) {
        this.f12265e = httpURLConnection;
    }

    public String c() {
        HttpURLConnection httpURLConnection = (HttpURLConnection) this.f12265e;
        boolean z5 = false;
        try {
            if (httpURLConnection.getResponseCode() / 100 == 2) {
                z5 = true;
            }
        } catch (IOException unused) {
        }
        if (z5) {
            return null;
        }
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Unable to fetch ");
            sb2.append(httpURLConnection.getURL());
            sb2.append(". Failed with ");
            sb2.append(httpURLConnection.getResponseCode());
            sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
            StringBuilder sb3 = new StringBuilder();
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line != null) {
                        sb3.append(line);
                        sb3.append('\n');
                    } else {
                        try {
                            break;
                        } catch (Exception unused2) {
                        }
                    }
                } catch (Throwable th2) {
                    try {
                        bufferedReader.close();
                    } catch (Exception unused3) {
                    }
                    throw th2;
                }
            }
            bufferedReader.close();
            sb2.append(sb3.toString());
            return sb2.toString();
        } catch (IOException e10) {
            x4.c.c("get error failed ", e10);
            return e10.getMessage();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f12264d) {
            case 0:
                ((InputStream) this.f12265e).close();
                break;
            default:
                ((HttpURLConnection) this.f12265e).disconnect();
                break;
        }
    }

    public SentryEvent f() throws v {
        hj.j iVar;
        InputStream inputStream = (InputStream) this.f12265e;
        o oVar = o.f12274h;
        if (inputStream == null) {
            byte[] bArr = t.f10907b;
            int length = bArr.length;
            iVar = new hj.h(bArr, 0, length, false);
            try {
                iVar.e(length);
            } catch (v e10) {
                throw new IllegalArgumentException(e10);
            }
        } else {
            iVar = new hj.i(inputStream);
        }
        r rVarG = r.g(oVar, iVar, hj.l.a());
        if (!r.d(rVarG, true)) {
            throw new v(new s0().getMessage());
        }
        o oVar2 = (o) rVarG;
        SentryEvent sentryEvent = new SentryEvent();
        sentryEvent.R = SentryLevel.FATAL;
        sentryEvent.E = "native";
        io.sentry.protocol.n nVar = new io.sentry.protocol.n();
        k kVar = k.f12266e;
        o0 o0Var = oVar2.f12276e;
        StringBuilder sb2 = new StringBuilder();
        Iterator it = o0Var.iterator();
        if (it.hasNext()) {
            while (true) {
                sb2.append((CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                }
                sb2.append((CharSequence) " ");
            }
        }
        String string = sb2.toString();
        Locale locale = Locale.ROOT;
        nVar.f13002d = s0.g.e("Fatal exit pid = 0 (", string, ")");
        sentryEvent.N = nVar;
        ArrayList arrayList = new ArrayList();
        Iterator it2 = oVar2.f12278g.iterator();
        if (it2.hasNext()) {
            throw s0.g.a(it2);
        }
        io.sentry.protocol.d dVar = new io.sentry.protocol.d();
        dVar.f12933e = new ArrayList(arrayList);
        sentryEvent.K = dVar;
        u uVar = new u();
        uVar.f13051v = Long.valueOf(0);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList2.add(uVar);
        sentryEvent.Q = new f6(arrayList2);
        ArrayList arrayListD = sentryEvent.d();
        Objects.requireNonNull(arrayListD);
        u uVar2 = (u) arrayListD.get(0);
        ArrayList arrayList3 = new ArrayList();
        for (Map.Entry entry : Collections.unmodifiableMap(oVar2.f12277f).entrySet()) {
            l lVar = (l) entry.getValue();
            c0 c0Var = new c0();
            c0Var.f12925d = Long.valueOf(((Integer) entry.getKey()).intValue());
            lVar.getClass();
            c0Var.f12927i = "";
            ArrayList arrayList4 = new ArrayList();
            Iterator it3 = lVar.f12271f.iterator();
            if (it3.hasNext()) {
                throw s0.g.a(it3);
            }
            a0 a0Var = new a0();
            a0Var.f12914d = arrayList4;
            a0Var.f12917v = z.NONE;
            HashMap map = new HashMap();
            Iterator it4 = lVar.f12270e.iterator();
            if (it4.hasNext()) {
                throw s0.g.a(it4);
            }
            a0Var.f12915e = map;
            c0Var.F = a0Var;
            c0Var.f12929w = Boolean.TRUE;
            uVar2.f13052w = a0Var;
            arrayList3.add(c0Var);
        }
        sentryEvent.P = new f6(arrayList3);
        return sentryEvent;
    }

    public a(InputStream inputStream) {
        HashMap map = new HashMap();
        this.f12265e = inputStream;
        map.put("SIGILL", "IllegalInstruction");
        map.put("SIGTRAP", "Trap");
        map.put("SIGABRT", "Abort");
        map.put("SIGBUS", "BusError");
        map.put("SIGFPE", "FloatingPointException");
        map.put("SIGSEGV", "Segfault");
    }
}

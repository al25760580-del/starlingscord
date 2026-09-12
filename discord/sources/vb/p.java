package vb;

import android.content.Context;
import com.google.firebase.messaging.r;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import sh.u1;

/* JADX INFO: loaded from: classes3.dex */
public final class p {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile j f21546e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ec.a f21547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ec.a f21548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ac.d f21549c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final bc.k f21550d;

    public p(ec.a aVar, ec.a aVar2, ac.d dVar, bc.k kVar, r rVar) {
        this.f21547a = aVar;
        this.f21548b = aVar2;
        this.f21549c = dVar;
        this.f21550d = kVar;
        ((Executor) rVar.f6610d).execute(new am.c(3, rVar));
    }

    public static p a() {
        j jVar = f21546e;
        if (jVar != null) {
            return (p) jVar.f21538y.get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void b(Context context) {
        if (f21546e == null) {
            synchronized (p.class) {
                try {
                    if (f21546e == null) {
                        u1 u1Var = new u1();
                        context.getClass();
                        u1Var.f20202a = context;
                        f21546e = u1Var.a();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final o c(k kVar) {
        byte[] bytes;
        Set setUnmodifiableSet = kVar != null ? Collections.unmodifiableSet(tb.a.f20672d) : Collections.singleton(new sb.c("proto"));
        n8.f fVarA = i.a();
        kVar.getClass();
        fVarA.f16510e = "cct";
        tb.a aVar = (tb.a) kVar;
        String str = aVar.f20675a;
        String str2 = aVar.f20676b;
        if (str2 == null && str == null) {
            bytes = null;
        } else {
            if (str2 == null) {
                str2 = "";
            }
            bytes = a3.e.m("1$", str, "\\", str2).getBytes(Charset.forName("UTF-8"));
        }
        fVarA.f16512v = bytes;
        return new o(setUnmodifiableSet, fVarA.J(), this);
    }
}

package gc;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.tasks.Task;
import io.sentry.SentryLevel;
import io.sentry.g2;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Properties;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements mq.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f9561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f9562b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f9563c;

    public b(String str, g2 g2Var, boolean z5) {
        this.f9561a = str;
        this.f9563c = g2Var;
        this.f9562b = z5;
    }

    @Override // mq.c
    public boolean a(lq.q0 c8, lq.q0 c10) {
        boolean z5 = this.f9562b;
        vo.b bVar = (vo.b) this.f9561a;
        vo.b bVar2 = (vo.b) this.f9563c;
        Intrinsics.checkNotNullParameter(c8, "c1");
        Intrinsics.checkNotNullParameter(c10, "c2");
        if (Intrinsics.areEqual(c8, c10)) {
            return true;
        }
        vo.i iVarG = c8.g();
        vo.i iVarG2 = c10.g();
        if (!(iVarG instanceof vo.r0) || !(iVarG2 instanceof vo.r0)) {
            return false;
        }
        xp.b bVar3 = new xp.b(bVar, bVar2);
        return xp.c.f22998a.d((vo.r0) iVarG, (vo.r0) iVarG2, z5, bVar3);
    }

    public e[] b(Handler handler, w wVar, w wVar2, w wVar3, w wVar4) {
        ArrayList arrayList = new ArrayList();
        Context context = (Context) this.f9561a;
        boolean z5 = this.f9562b;
        o9.d dVar = (o9.d) this.f9563c;
        arrayList.add(new ke.i(context, dVar, z5, handler, wVar));
        e4.i iVar = new e4.i((Context) this.f9561a);
        if (((e4.m) iVar.f7982v) == null) {
            iVar.f7982v = new e4.m(new ic.n[0]);
        }
        arrayList.add(new ic.m0((Context) this.f9561a, dVar, this.f9562b, handler, wVar2, new ic.j0(iVar)));
        arrayList.add(new vd.k(wVar3, handler.getLooper()));
        arrayList.add(new cd.e(wVar4, handler.getLooper()));
        arrayList.add(new le.b());
        return (e[]) arrayList.toArray(new e[0]);
    }

    public Properties c() {
        g2 g2Var = (g2) this.f9563c;
        String str = (String) this.f9561a;
        try {
            File file = new File(str.trim());
            if (!file.isFile() || !file.canRead()) {
                if (file.isFile()) {
                    if (!file.canRead()) {
                        g2Var.q(SentryLevel.ERROR, "Failed to load Sentry configuration since it is not readable: %s", str);
                    }
                } else if (this.f9562b) {
                    g2Var.q(SentryLevel.ERROR, "Failed to load Sentry configuration since it is not a file or does not exist: %s", str);
                    return null;
                }
                return null;
            }
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            try {
                Properties properties = new Properties();
                properties.load(bufferedInputStream);
                bufferedInputStream.close();
                return properties;
            } catch (Throwable th2) {
                try {
                    bufferedInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (Throwable th4) {
            g2Var.e(SentryLevel.ERROR, th4, "Failed to load Sentry configuration from file: %s", str);
            return null;
        }
    }

    public void d() {
        a aVar = (a) this.f9563c;
        Context context = (Context) this.f9561a;
        if (this.f9562b) {
            context.unregisterReceiver(aVar);
            this.f9562b = false;
        }
    }

    public void e(ig.k kVar) {
        synchronized (this.f9561a) {
            try {
                if (((ArrayDeque) this.f9563c) == null) {
                    this.f9563c = new ArrayDeque();
                }
                ((ArrayDeque) this.f9563c).add(kVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void f(Task task) {
        ig.k kVar;
        synchronized (this.f9561a) {
            if (((ArrayDeque) this.f9563c) != null && !this.f9562b) {
                this.f9562b = true;
                while (true) {
                    synchronized (this.f9561a) {
                        try {
                            kVar = (ig.k) ((ArrayDeque) this.f9563c).poll();
                            if (kVar == null) {
                                this.f9562b = false;
                                return;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    kVar.a(task);
                }
            }
        }
    }

    public b(Context context) {
        this.f9561a = context;
        o9.d dVar = new o9.d(1);
        dVar.f17185e = 0;
        this.f9563c = dVar;
    }
}

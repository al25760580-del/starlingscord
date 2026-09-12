package gs;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f10239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fs.b f10240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final es.g f10241c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ConcurrentLinkedQueue f10242d;

    public m(fs.c taskRunner) {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        this.f10239a = timeUnit.toNanos(5L);
        this.f10240b = taskRunner.e();
        this.f10241c = new es.g(this, Intrinsics.stringPlus(ds.b.f7821g, " ConnectionPool"), 2);
        this.f10242d = new ConcurrentLinkedQueue();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0030 A[Catch: all -> 0x002e, TryCatch #0 {all -> 0x002e, blocks: (B:9:0x0026, B:18:0x0036, B:16:0x0030, B:21:0x003a), top: B:27:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x003a A[SYNTHETIC] */
    public final boolean a(cs.a address, i call, ArrayList arrayList, boolean z5) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(call, "call");
        Iterator it = this.f10242d.iterator();
        while (true) {
            if (!it.hasNext()) {
                return false;
            }
            l connection = (l) it.next();
            Intrinsics.checkNotNullExpressionValue(connection, "connection");
            synchronized (connection) {
                if (z5) {
                    try {
                        if (connection.f10230g != null) {
                            if (connection.h(address, arrayList)) {
                                call.b(connection);
                                return true;
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                } else if (connection.h(address, arrayList)) {
                    call.b(connection);
                    return true;
                }
                Unit unit = Unit.f14616a;
            }
        }
    }

    public final int b(l lVar, long j) {
        byte[] bArr = ds.b.f7815a;
        ArrayList arrayList = lVar.f10237p;
        int i7 = 0;
        while (i7 < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i7);
            if (reference.get() != null) {
                i7++;
            } else {
                String str = "A connection to " + lVar.f10225b.f7498a.f7404h + " was leaked. Did you forget to close a response body?";
                ls.n nVar = ls.n.f15297a;
                ls.n.f15297a.j(((g) reference).f10210a, str);
                arrayList.remove(i7);
                lVar.j = true;
                if (arrayList.isEmpty()) {
                    lVar.f10238q = j - this.f10239a;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }
}

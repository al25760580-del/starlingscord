package a3;

import androidx.work.impl.WorkDatabase;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import rn.u;
import vo.n0;

/* JADX INFO: loaded from: classes.dex */
public abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f116a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f117b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f118c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f119d;

    public r(rp.f fVar, pf.b bVar, n0 n0Var) {
        this.f117b = fVar;
        this.f118c = bVar;
        this.f119d = n0Var;
    }

    public h3.j a() {
        ((WorkDatabase) this.f117b).a();
        return ((AtomicBoolean) this.f118c).compareAndSet(false, true) ? (h3.j) ((u) this.f119d).getValue() : b();
    }

    public h3.j b() {
        String sql = c();
        WorkDatabase workDatabase = (WorkDatabase) this.f117b;
        workDatabase.getClass();
        Intrinsics.checkNotNullParameter(sql, "sql");
        workDatabase.a();
        workDatabase.b();
        return workDatabase.h().C().g(sql);
    }

    public abstract String c();

    public abstract up.c d();

    public void e(h3.j statement) {
        Intrinsics.checkNotNullParameter(statement, "statement");
        if (statement == ((h3.j) ((u) this.f119d).getValue())) {
            ((AtomicBoolean) this.f118c).set(false);
        }
    }

    public String toString() {
        switch (this.f116a) {
            case 1:
                return getClass().getSimpleName() + ": " + d();
            default:
                return super.toString();
        }
    }

    public r(WorkDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        this.f117b = database;
        this.f118c = new AtomicBoolean(false);
        this.f119d = rn.l.b(new q(0, this));
    }
}

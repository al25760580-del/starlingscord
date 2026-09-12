package cc;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements d, dc.c, c {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final sb.c f3577x = new sb.c("proto");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j f3578d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ec.a f3579e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ec.a f3580i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final a f3581v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Provider f3582w;

    public h(ec.a aVar, ec.a aVar2, a aVar3, j jVar, Provider provider) {
        this.f3578d = jVar;
        this.f3579e = aVar;
        this.f3580i = aVar2;
        this.f3581v = aVar3;
        this.f3582w = provider;
    }

    public static Long f(SQLiteDatabase sQLiteDatabase, vb.i iVar) {
        StringBuilder sb2 = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(iVar.f21529a, String.valueOf(fc.a.a(iVar.f21531c))));
        byte[] bArr = iVar.f21530b;
        if (bArr != null) {
            sb2.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(bArr, 0));
        } else {
            sb2.append(" and extras is null");
        }
        Cursor cursorQuery = sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb2.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null);
        try {
            return !cursorQuery.moveToNext() ? null : Long.valueOf(cursorQuery.getLong(0));
        } finally {
            cursorQuery.close();
        }
    }

    public static String q(Iterable iterable) {
        StringBuilder sb2 = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb2.append(((b) it.next()).f3570a);
            if (it.hasNext()) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        return sb2.toString();
    }

    public static Object u(Cursor cursor, f fVar) {
        try {
            return fVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public final SQLiteDatabase c() {
        j jVar = this.f3578d;
        Objects.requireNonNull(jVar);
        ec.a aVar = this.f3580i;
        long jB = aVar.b();
        while (true) {
            try {
                return jVar.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e10) {
                if (aVar.b() >= ((long) this.f3581v.f3567c) + jB) {
                    throw new dc.a("Timed out while trying to open db.", e10);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f3578d.close();
    }

    public final Object g(f fVar) {
        SQLiteDatabase sQLiteDatabaseC = c();
        sQLiteDatabaseC.beginTransaction();
        try {
            Object objApply = fVar.apply(sQLiteDatabaseC);
            sQLiteDatabaseC.setTransactionSuccessful();
            return objApply;
        } finally {
            sQLiteDatabaseC.endTransaction();
        }
    }

    public final ArrayList i(SQLiteDatabase sQLiteDatabase, vb.i iVar, int i7) {
        ArrayList arrayList = new ArrayList();
        Long lF = f(sQLiteDatabase, iVar);
        if (lF == null) {
            return arrayList;
        }
        u(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{lF.toString()}, null, null, null, String.valueOf(i7)), new ac.b(this, (Object) arrayList, iVar, 2));
        return arrayList;
    }

    public final void l(long j, yb.c cVar, String str) {
        g(new bc.j(j, str, cVar));
    }

    public final Object n(dc.b bVar) {
        SQLiteDatabase sQLiteDatabaseC = c();
        ec.a aVar = this.f3580i;
        long jB = aVar.b();
        while (true) {
            try {
                sQLiteDatabaseC.beginTransaction();
                try {
                    Object objExecute = bVar.execute();
                    sQLiteDatabaseC.setTransactionSuccessful();
                    return objExecute;
                } finally {
                    sQLiteDatabaseC.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e10) {
                if (aVar.b() >= ((long) this.f3581v.f3567c) + jB) {
                    throw new dc.a("Timed out while trying to acquire the lock.", e10);
                }
                SystemClock.sleep(50L);
            }
        }
    }
}

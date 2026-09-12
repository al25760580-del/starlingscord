package bc;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.facebook.react.runtime.q;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h implements dc.b, ni.f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3110d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f3111e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f3112i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f3113v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f3114w;

    public /* synthetic */ h(k kVar, Iterable iterable, vb.i iVar, long j) {
        this.f3110d = 0;
        this.f3112i = kVar;
        this.f3113v = iterable;
        this.f3114w = iVar;
        this.f3111e = j;
    }

    @Override // ni.f
    public ScheduledFuture a(u4.b bVar) {
        switch (this.f3110d) {
            case 1:
                ni.e eVar = (ni.e) this.f3112i;
                Runnable runnable = (Runnable) this.f3113v;
                return eVar.f16944e.schedule(new ni.d(eVar, runnable, bVar, 1), this.f3111e, (TimeUnit) this.f3114w);
            default:
                ni.e eVar2 = (ni.e) this.f3112i;
                Callable callable = (Callable) this.f3113v;
                return eVar2.f16944e.schedule(new q(eVar2, callable, bVar, 2), this.f3111e, (TimeUnit) this.f3114w);
        }
    }

    @Override // dc.b
    public Object execute() {
        k kVar = (k) this.f3112i;
        Iterable iterable = (Iterable) this.f3113v;
        vb.i iVar = (vb.i) this.f3114w;
        cc.h hVar = (cc.h) ((cc.d) kVar.f3124v);
        hVar.getClass();
        if (iterable.iterator().hasNext()) {
            String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + cc.h.q(iterable);
            SQLiteDatabase sQLiteDatabaseC = hVar.c();
            sQLiteDatabaseC.beginTransaction();
            try {
                sQLiteDatabaseC.compileStatement(str).execute();
                Cursor cursorRawQuery = sQLiteDatabaseC.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                while (cursorRawQuery.moveToNext()) {
                    try {
                        hVar.l(cursorRawQuery.getInt(0), yb.c.MAX_RETRIES_REACHED, cursorRawQuery.getString(1));
                    } catch (Throwable th2) {
                        cursorRawQuery.close();
                        throw th2;
                    }
                }
                cursorRawQuery.close();
                sQLiteDatabaseC.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                sQLiteDatabaseC.setTransactionSuccessful();
                sQLiteDatabaseC.endTransaction();
            } catch (Throwable th3) {
                sQLiteDatabaseC.endTransaction();
                throw th3;
            }
        }
        hVar.g(new cc.e(((ec.a) kVar.E).b() + this.f3111e, iVar));
        return null;
    }

    public /* synthetic */ h(ni.e eVar, Object obj, long j, TimeUnit timeUnit, int i7) {
        this.f3110d = i7;
        this.f3112i = eVar;
        this.f3113v = obj;
        this.f3111e = j;
        this.f3114w = timeUnit;
    }
}

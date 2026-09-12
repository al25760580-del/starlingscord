package bc;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j implements dc.b, cc.f, je.j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f3118d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f3119e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f3120i;

    public /* synthetic */ j(long j, Object obj, Object obj2) {
        this.f3119e = obj;
        this.f3120i = obj2;
        this.f3118d = j;
    }

    @Override // cc.f
    public Object apply(Object obj) {
        String str = (String) this.f3119e;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        int i7 = ((yb.c) this.f3120i).f23227d;
        Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i7)});
        try {
            boolean z5 = cursorRawQuery.getCount() > 0;
            cursorRawQuery.close();
            long j = this.f3118d;
            if (z5) {
                sQLiteDatabase.execSQL(a3.e.h(j, "UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + ", " WHERE log_source = ? AND reason = ?"), new String[]{str, Integer.toString(i7)});
                return null;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(i7));
            contentValues.put("events_dropped_count", Long.valueOf(j));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
            return null;
        } catch (Throwable th2) {
            cursorRawQuery.close();
            throw th2;
        }
    }

    @Override // dc.b
    public Object execute() {
        k kVar = (k) this.f3119e;
        vb.i iVar = (vb.i) this.f3120i;
        cc.d dVar = (cc.d) kVar.f3124v;
        long jB = ((ec.a) kVar.E).b() + this.f3118d;
        cc.h hVar = (cc.h) dVar;
        hVar.getClass();
        hVar.g(new cc.e(jB, iVar));
        return null;
    }

    @Override // je.j
    public void invoke(Object obj) {
        ((hc.b) obj).onRenderedFirstFrame((AnalyticsListener$EventTime) this.f3119e, this.f3120i, this.f3118d);
    }
}

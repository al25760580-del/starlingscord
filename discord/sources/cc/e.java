package cc;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e implements f, je.j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f3573d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f3574e;

    public /* synthetic */ e(long j, vb.i iVar) {
        this.f3573d = j;
        this.f3574e = iVar;
    }

    @Override // cc.f
    public Object apply(Object obj) {
        vb.i iVar = (vb.i) this.f3574e;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.f3573d));
        String str = iVar.f21529a;
        sb.d dVar = iVar.f21531c;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(fc.a.a(dVar))}) < 1) {
            contentValues.put("backend_name", str);
            contentValues.put("priority", Integer.valueOf(fc.a.a(dVar)));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    @Override // je.j
    public void invoke(Object obj) {
        ((hc.b) obj).onAudioPositionAdvancing((AnalyticsListener$EventTime) this.f3574e, this.f3573d);
    }

    public /* synthetic */ e(AnalyticsListener$EventTime analyticsListener$EventTime, long j) {
        this.f3574e = analyticsListener$EventTime;
        this.f3573d = j;
    }
}

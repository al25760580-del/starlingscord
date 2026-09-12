package com.google.android.gms.internal.gtm;

import af.w;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import ff.b;
import ff.d;
import java.io.Closeable;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import pe.i;

/* JADX INFO: loaded from: classes3.dex */
final class zzce extends zzbs implements Closeable {
    private static final String zza = "CREATE TABLE IF NOT EXISTS hits2 ( 'hit_id' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, 'hit_time' INTEGER NOT NULL, 'hit_url' TEXT NOT NULL, 'hit_string' TEXT NOT NULL, 'hit_app_id' INTEGER);";
    private static final String zzb = "SELECT MAX(hit_time) FROM hits2 WHERE 1;";
    private final zzcd zzc;
    private final zzfo zzd;
    private final zzfo zze;

    public zzce(zzbv zzbvVar) {
        super(zzbvVar);
        this.zzd = new zzfo(zzC());
        this.zze = new zzfo(zzC());
        this.zzc = new zzcd(this, zzbvVar.zza(), zzae());
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0029  */
    private final long zzad(String str, String[] strArr, long j) {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = zzf().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    cursorRawQuery.close();
                    return 0L;
                }
                long j5 = cursorRawQuery.getLong(0);
                cursorRawQuery.close();
                return j5;
            } catch (SQLiteException e10) {
                zzL("Database error", str, e10);
                throw e10;
            }
        } catch (Throwable th2) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th2;
        }
        if (cursorRawQuery != null) {
            cursorRawQuery.close();
        }
        throw th2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String zzae() {
        zzw();
        zzw();
        return "google_analytics_v4.db";
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            this.zzc.close();
        } catch (SQLiteException e10) {
            zzK("Sql error closing database", e10);
        } catch (IllegalStateException e11) {
            zzK("Error closing database", e11);
        }
    }

    public final void zzZ(List<Long> list) {
        w.g(list);
        i.a();
        zzW();
        if (list.isEmpty()) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("hit_id in (");
        for (int i7 = 0; i7 < list.size(); i7++) {
            Long l6 = list.get(i7);
            if (l6 == null || l6.longValue() == 0) {
                throw new SQLiteException("Invalid hit id");
            }
            if (i7 > 0) {
                sb2.append(",");
            }
            sb2.append(l6);
        }
        sb2.append(")");
        String string = sb2.toString();
        try {
            SQLiteDatabase sQLiteDatabaseZzf = zzf();
            zzP("Deleting dispatched hits. count", Integer.valueOf(list.size()));
            int iDelete = sQLiteDatabaseZzf.delete("hits2", string, null);
            if (iDelete != list.size()) {
                zzU("Deleted fewer hits then expected", Integer.valueOf(list.size()), Integer.valueOf(iDelete), string);
            }
        } catch (SQLiteException e10) {
            zzK("Error deleting hits", e10);
            throw e10;
        }
    }

    public final int zza() {
        i.a();
        zzW();
        if (!this.zzd.zzc(86400000L)) {
            return 0;
        }
        this.zzd.zzb();
        zzO("Deleting stale hits (if any)");
        SQLiteDatabase sQLiteDatabaseZzf = zzf();
        ((b) zzC()).getClass();
        int iDelete = sQLiteDatabaseZzf.delete("hits2", "hit_time < ?", new String[]{Long.toString(System.currentTimeMillis() - 2592000000L)});
        zzP("Deleted stale hits, count", Integer.valueOf(iDelete));
        return iDelete;
    }

    public final void zzaa() {
        zzW();
        zzf().endTransaction();
    }

    public final void zzab() {
        zzW();
        zzf().setTransactionSuccessful();
    }

    public final boolean zzac() {
        return zzb() == 0;
    }

    public final long zzb() {
        i.a();
        zzW();
        Cursor cursor = null;
        try {
            try {
                Cursor cursorRawQuery = zzf().rawQuery("SELECT COUNT(*) FROM hits2", null);
                if (!cursorRawQuery.moveToFirst()) {
                    throw new SQLiteException("Database returned empty set");
                }
                long j = cursorRawQuery.getLong(0);
                cursorRawQuery.close();
                return j;
            } catch (SQLiteException e10) {
                zzL("Database error", "SELECT COUNT(*) FROM hits2", e10);
                throw e10;
            }
        } catch (Throwable th2) {
            if (0 != 0) {
                cursor.close();
            }
            throw th2;
        }
    }

    public final long zzc() {
        i.a();
        zzW();
        return zzad(zzb, null, 0L);
    }

    @Override // com.google.android.gms.internal.gtm.zzbs
    public final void zzd() {
    }

    @VisibleForTesting
    public final SQLiteDatabase zzf() {
        try {
            return this.zzc.getWritableDatabase();
        } catch (SQLiteException e10) {
            zzS("Error opening database", e10);
            throw e10;
        }
    }

    public final List<zzex> zzj(long j) throws Throwable {
        w.b(j >= 0);
        i.a();
        zzW();
        Cursor cursor = null;
        try {
            try {
                Cursor cursorQuery = zzf().query("hits2", new String[]{"hit_id", "hit_time", "hit_string", "hit_url", "hit_app_id"}, null, null, null, null, "hit_id ASC", Long.toString(j));
                try {
                    ArrayList arrayList = new ArrayList();
                    if (cursorQuery.moveToFirst()) {
                        do {
                            long j5 = cursorQuery.getLong(0);
                            long j7 = cursorQuery.getLong(1);
                            String string = cursorQuery.getString(2);
                            String string2 = cursorQuery.getString(3);
                            arrayList.add(new zzex(this, zzk(string), j7, TextUtils.isEmpty(string2) || !string2.startsWith("http:"), j5, cursorQuery.getInt(4), null));
                        } while (cursorQuery.moveToNext());
                    }
                    cursorQuery.close();
                    return arrayList;
                } catch (SQLiteException e10) {
                    e = e10;
                    zzK("Error loading hits from the database", e);
                    throw e;
                } catch (Throwable th2) {
                    th = th2;
                    cursor = cursorQuery;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (SQLiteException e11) {
            e = e11;
        }
    }

    @VisibleForTesting
    public final Map<String, String> zzk(String str) {
        if (TextUtils.isEmpty(str)) {
            return new HashMap(0);
        }
        try {
            if (!str.startsWith("?")) {
                str = str.length() != 0 ? "?".concat(str) : new String("?");
            }
            return d.a(new URI(str));
        } catch (URISyntaxException e10) {
            zzK("Error parsing hit parameters", e10);
            return new HashMap(0);
        }
    }

    public final void zzm() {
        zzW();
        zzf().beginTransaction();
    }

    public final void zzn(long j) {
        i.a();
        zzW();
        ArrayList arrayList = new ArrayList(1);
        Long lValueOf = Long.valueOf(j);
        arrayList.add(lValueOf);
        zzP("Deleting hit, id", lValueOf);
        zzZ(arrayList);
    }
}

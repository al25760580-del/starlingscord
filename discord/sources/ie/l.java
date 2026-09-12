package ie;

import ag.a1;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.SparseArray;
import com.facebook.react.devsupport.StackTraceHelper;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import je.e0;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements m {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String[] f11749e = {StackTraceHelper.ID_KEY, "key", "metadata"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kc.a f11750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseArray f11751b = new SparseArray();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f11752c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f11753d;

    public l(kc.a aVar) {
        this.f11750a = aVar;
    }

    @Override // ie.m
    public final void a(HashMap map) throws a1 {
        try {
            SQLiteDatabase writableDatabase = this.f11750a.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                j(writableDatabase);
                Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    i(writableDatabase, (k) it.next());
                }
                writableDatabase.setTransactionSuccessful();
                this.f11751b.clear();
            } finally {
                writableDatabase.endTransaction();
            }
        } catch (SQLException e10) {
            throw new a1(e10);
        }
    }

    @Override // ie.m
    public final void b(k kVar, boolean z5) {
        int i7 = kVar.f11744a;
        SparseArray sparseArray = this.f11751b;
        if (z5) {
            sparseArray.delete(i7);
        } else {
            sparseArray.put(i7, null);
        }
    }

    @Override // ie.m
    public final void c(k kVar) {
        this.f11751b.put(kVar.f11744a, kVar);
    }

    @Override // ie.m
    public final boolean d() throws a1 {
        try {
            SQLiteDatabase readableDatabase = this.f11750a.getReadableDatabase();
            String str = this.f11752c;
            str.getClass();
            return kc.b.a(readableDatabase, 1, str) != -1;
        } catch (SQLException e10) {
            throw new a1(e10);
        }
    }

    @Override // ie.m
    public final void e(HashMap map) throws a1 {
        SparseArray sparseArray = this.f11751b;
        if (sparseArray.size() == 0) {
            return;
        }
        try {
            SQLiteDatabase writableDatabase = this.f11750a.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            for (int i7 = 0; i7 < sparseArray.size(); i7++) {
                try {
                    k kVar = (k) sparseArray.valueAt(i7);
                    if (kVar == null) {
                        int iKeyAt = sparseArray.keyAt(i7);
                        String str = this.f11753d;
                        str.getClass();
                        writableDatabase.delete(str, "id = ?", new String[]{Integer.toString(iKeyAt)});
                    } else {
                        i(writableDatabase, kVar);
                    }
                } catch (Throwable th2) {
                    writableDatabase.endTransaction();
                    throw th2;
                }
            }
            writableDatabase.setTransactionSuccessful();
            sparseArray.clear();
            writableDatabase.endTransaction();
        } catch (SQLException e10) {
            throw new a1(e10);
        }
    }

    @Override // ie.m
    public final void f(long j) {
        String hexString = Long.toHexString(j);
        this.f11752c = hexString;
        this.f11753d = a3.e.l("ExoPlayerCacheIndex", hexString);
    }

    @Override // ie.m
    public final void g(HashMap map, SparseArray sparseArray) throws a1 {
        kc.a aVar = this.f11750a;
        je.b.k(this.f11751b.size() == 0);
        try {
            SQLiteDatabase readableDatabase = aVar.getReadableDatabase();
            String str = this.f11752c;
            str.getClass();
            if (kc.b.a(readableDatabase, 1, str) != 1) {
                SQLiteDatabase writableDatabase = aVar.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    j(writableDatabase);
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                } catch (Throwable th2) {
                    writableDatabase.endTransaction();
                    throw th2;
                }
            }
            SQLiteDatabase readableDatabase2 = aVar.getReadableDatabase();
            String str2 = this.f11753d;
            str2.getClass();
            Cursor cursorQuery = readableDatabase2.query(str2, f11749e, null, null, null, null, null);
            while (cursorQuery.moveToNext()) {
                try {
                    int i7 = cursorQuery.getInt(0);
                    String string = cursorQuery.getString(1);
                    string.getClass();
                    map.put(string, new k(i7, string, af.c.b(new DataInputStream(new ByteArrayInputStream(cursorQuery.getBlob(2))))));
                    sparseArray.put(i7, string);
                } catch (Throwable th3) {
                    if (cursorQuery == null) {
                        throw th3;
                    }
                    try {
                        cursorQuery.close();
                        throw th3;
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                        throw th3;
                    }
                }
            }
            cursorQuery.close();
        } catch (SQLiteException e10) {
            map.clear();
            sparseArray.clear();
            throw new a1(e10);
        }
    }

    @Override // ie.m
    public final void h() throws a1 {
        kc.a aVar = this.f11750a;
        String str = this.f11752c;
        str.getClass();
        try {
            String strConcat = "ExoPlayerCacheIndex".concat(str);
            SQLiteDatabase writableDatabase = aVar.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                int i7 = kc.b.f14315a;
                try {
                    int i10 = e0.f13788a;
                    if (DatabaseUtils.queryNumEntries(writableDatabase, "sqlite_master", "tbl_name = ?", new String[]{"ExoPlayerVersions"}) > 0) {
                        writableDatabase.delete("ExoPlayerVersions", "feature = ? AND instance_uid = ?", new String[]{Integer.toString(1), str});
                    }
                    writableDatabase.execSQL("DROP TABLE IF EXISTS " + strConcat);
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                } catch (SQLException e10) {
                    throw new a1(e10);
                }
            } catch (Throwable th2) {
                writableDatabase.endTransaction();
                throw th2;
            }
        } catch (SQLException e11) {
            throw new a1(e11);
        }
    }

    public final void i(SQLiteDatabase sQLiteDatabase, k kVar) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        af.c.f(kVar.f11748e, new DataOutputStream(byteArrayOutputStream));
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        ContentValues contentValues = new ContentValues();
        contentValues.put(StackTraceHelper.ID_KEY, Integer.valueOf(kVar.f11744a));
        contentValues.put("key", kVar.f11745b);
        contentValues.put("metadata", byteArray);
        String str = this.f11753d;
        str.getClass();
        sQLiteDatabase.replaceOrThrow(str, null, contentValues);
    }

    public final void j(SQLiteDatabase sQLiteDatabase) throws a1 {
        String str = this.f11752c;
        str.getClass();
        kc.b.b(sQLiteDatabase, 1, str);
        String str2 = this.f11753d;
        str2.getClass();
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ".concat(str2));
        sQLiteDatabase.execSQL("CREATE TABLE " + this.f11753d + " (id INTEGER PRIMARY KEY NOT NULL,key TEXT NOT NULL,metadata BLOB NOT NULL)");
    }
}

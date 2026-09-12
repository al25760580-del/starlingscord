package ie;

import ag.a1;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import com.facebook.react.devsupport.StackTraceHelper;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f11732c = {StackTraceHelper.NAME_KEY, "length", "last_touch_timestamp"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f11733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Serializable f11734b;

    public g() {
        this.f11733a = new HashMap();
        this.f11734b = new ArrayList();
    }

    public void a(Object obj, String str) {
        HashMap map = (HashMap) this.f11733a;
        obj.getClass();
        map.put(str, obj);
        ((ArrayList) this.f11734b).remove(str);
    }

    public HashMap b() throws a1 {
        try {
            ((String) this.f11734b).getClass();
            Cursor cursorQuery = ((kc.a) this.f11733a).getReadableDatabase().query((String) this.f11734b, f11732c, null, null, null, null, null);
            try {
                HashMap map = new HashMap(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    String string = cursorQuery.getString(0);
                    string.getClass();
                    map.put(string, new f(cursorQuery.getLong(1), cursorQuery.getLong(2)));
                }
                cursorQuery.close();
                return map;
            } catch (Throwable th2) {
                if (cursorQuery == null) {
                    throw th2;
                }
                try {
                    cursorQuery.close();
                    throw th2;
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                    throw th2;
                }
            }
        } catch (SQLException e10) {
            throw new a1(e10);
        }
    }

    public void c(long j) throws a1 {
        kc.a aVar = (kc.a) this.f11733a;
        try {
            String hexString = Long.toHexString(j);
            this.f11734b = "ExoPlayerCacheFileMetadata" + hexString;
            if (kc.b.a(aVar.getReadableDatabase(), 2, hexString) != 1) {
                SQLiteDatabase writableDatabase = aVar.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    kc.b.b(writableDatabase, 2, hexString);
                    writableDatabase.execSQL("DROP TABLE IF EXISTS " + ((String) this.f11734b));
                    writableDatabase.execSQL("CREATE TABLE " + ((String) this.f11734b) + " (name TEXT PRIMARY KEY NOT NULL,length INTEGER NOT NULL,last_touch_timestamp INTEGER NOT NULL)");
                    writableDatabase.setTransactionSuccessful();
                } finally {
                    writableDatabase.endTransaction();
                }
            }
        } catch (SQLException e10) {
            throw new a1(e10);
        }
    }

    public void d(Set set) throws a1 {
        ((String) this.f11734b).getClass();
        try {
            SQLiteDatabase writableDatabase = ((kc.a) this.f11733a).getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    writableDatabase.delete((String) this.f11734b, "name = ?", new String[]{(String) it.next()});
                }
                writableDatabase.setTransactionSuccessful();
            } finally {
                writableDatabase.endTransaction();
            }
        } catch (SQLException e10) {
            throw new a1(e10);
        }
    }

    public void e(long j, long j5, String str) throws a1 {
        ((String) this.f11734b).getClass();
        try {
            SQLiteDatabase writableDatabase = ((kc.a) this.f11733a).getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put(StackTraceHelper.NAME_KEY, str);
            contentValues.put("length", Long.valueOf(j));
            contentValues.put("last_touch_timestamp", Long.valueOf(j5));
            writableDatabase.replaceOrThrow((String) this.f11734b, null, contentValues);
        } catch (SQLException e10) {
            throw new a1(e10);
        }
    }

    public g(kc.a aVar) {
        this.f11733a = aVar;
    }
}

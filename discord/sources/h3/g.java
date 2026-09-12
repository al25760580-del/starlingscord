package h3;

import a5.l0;
import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.util.Pair;
import ga.l;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class g extends SQLiteOpenHelper {
    public static final /* synthetic */ int E = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f10309d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l f10310e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final a1.d f10311i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f10312v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f10313w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final i3.a f10314x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f10315y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context, String str, final l dbRef, final a1.d callback, boolean z5) {
        String string;
        super(context, str, null, callback.f17e, new DatabaseErrorHandler() { // from class: h3.d
            @Override // android.database.DatabaseErrorHandler
            public final void onCorruption(SQLiteDatabase dbObj) {
                a1.d callback2 = callback;
                Intrinsics.checkNotNullParameter(callback2, "$callback");
                l dbRef2 = dbRef;
                Intrinsics.checkNotNullParameter(dbRef2, "$dbRef");
                int i7 = g.E;
                Intrinsics.checkNotNullExpressionValue(dbObj, "dbObj");
                c db = l0.D(dbRef2, dbObj);
                callback2.getClass();
                Intrinsics.checkNotNullParameter(db, "db");
                Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + db + ".path");
                SQLiteDatabase sQLiteDatabase = db.f10297d;
                if (!sQLiteDatabase.isOpen()) {
                    String path = sQLiteDatabase.getPath();
                    if (path != null) {
                        a1.d.e(path);
                        return;
                    }
                    return;
                }
                List list = null;
                try {
                    try {
                        list = db.f10298e;
                    } finally {
                        if (list != null) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                Object obj = ((Pair) it.next()).second;
                                Intrinsics.checkNotNullExpressionValue(obj, "p.second");
                                a1.d.e((String) obj);
                            }
                        } else {
                            String path2 = sQLiteDatabase.getPath();
                            if (path2 != null) {
                                a1.d.e(path2);
                            }
                        }
                    }
                } catch (SQLiteException unused) {
                }
                try {
                    db.close();
                } catch (IOException unused2) {
                }
                if (list != null) {
                    return;
                }
            }
        });
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dbRef, "dbRef");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f10309d = context;
        this.f10310e = dbRef;
        this.f10311i = callback;
        this.f10312v = z5;
        if (str == null) {
            string = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string, "randomUUID().toString()");
        } else {
            string = str;
        }
        File cacheDir = context.getCacheDir();
        Intrinsics.checkNotNullExpressionValue(cacheDir, "context.cacheDir");
        this.f10314x = new i3.a(string, cacheDir, false);
    }

    public final c c(boolean z5) {
        i3.a aVar = this.f10314x;
        try {
            aVar.a((this.f10315y || getDatabaseName() == null) ? false : true);
            this.f10313w = false;
            SQLiteDatabase sQLiteDatabaseI = i(z5);
            if (!this.f10313w) {
                return f(sQLiteDatabaseI);
            }
            close();
            return c(z5);
        } finally {
            aVar.b();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final void close() {
        i3.a aVar = this.f10314x;
        try {
            aVar.a(aVar.f11384a);
            super.close();
            this.f10310e.f9547e = null;
            this.f10315y = false;
        } finally {
            aVar.b();
        }
    }

    public final c f(SQLiteDatabase sqLiteDatabase) {
        Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
        return l0.D(this.f10310e, sqLiteDatabase);
    }

    public final SQLiteDatabase g(boolean z5) {
        if (z5) {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            Intrinsics.checkNotNullExpressionValue(writableDatabase, "{\n                super.…eDatabase()\n            }");
            return writableDatabase;
        }
        SQLiteDatabase readableDatabase = getReadableDatabase();
        Intrinsics.checkNotNullExpressionValue(readableDatabase, "{\n                super.…eDatabase()\n            }");
        return readableDatabase;
    }

    public final SQLiteDatabase i(boolean z5) throws Throwable {
        File parentFile;
        String databaseName = getDatabaseName();
        Context context = this.f10309d;
        if (databaseName != null && (parentFile = context.getDatabasePath(databaseName).getParentFile()) != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                Log.w("SupportSQLite", "Invalid database parent file, not a directory: " + parentFile);
            }
        }
        try {
            return g(z5);
        } catch (Throwable unused) {
            super.close();
            try {
                Thread.sleep(500L);
            } catch (InterruptedException unused2) {
            }
            try {
                return g(z5);
            } catch (Throwable th2) {
                super.close();
                if (th2 instanceof e) {
                    e eVar = th2;
                    int iOrdinal = eVar.f10301d.ordinal();
                    Throwable th3 = eVar.f10302e;
                    if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3 || !(th3 instanceof SQLiteException)) {
                        throw th3;
                    }
                } else if (!(th2 instanceof SQLiteException) || databaseName == null || !this.f10312v) {
                    throw th2;
                }
                context.deleteDatabase(databaseName);
                try {
                    return g(z5);
                } catch (e e10) {
                    throw e10.f10302e;
                }
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase db) {
        Intrinsics.checkNotNullParameter(db, "db");
        try {
            a1.d dVar = this.f10311i;
            c db2 = f(db);
            dVar.getClass();
            Intrinsics.checkNotNullParameter(db2, "db");
            Intrinsics.checkNotNullParameter(db2, "db");
        } catch (Throwable th2) {
            throw new e(f.f10303d, th2);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sqLiteDatabase) {
        Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
        try {
            this.f10311i.u(f(sqLiteDatabase));
        } catch (Throwable th2) {
            throw new e(f.f10304e, th2);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase db, int i7, int i10) {
        Intrinsics.checkNotNullParameter(db, "db");
        this.f10313w = true;
        try {
            a1.d dVar = this.f10311i;
            c db2 = f(db);
            dVar.getClass();
            Intrinsics.checkNotNullParameter(db2, "db");
            dVar.w(db2, i7, i10);
        } catch (Throwable th2) {
            throw new e(f.f10306v, th2);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase db) {
        Intrinsics.checkNotNullParameter(db, "db");
        if (!this.f10313w) {
            try {
                this.f10311i.v(f(db));
            } catch (Throwable th2) {
                throw new e(f.f10307w, th2);
            }
        }
        this.f10315y = true;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sqLiteDatabase, int i7, int i10) {
        Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
        this.f10313w = true;
        try {
            this.f10311i.w(f(sqLiteDatabase), i7, i10);
        } catch (Throwable th2) {
            throw new e(f.f10305i, th2);
        }
    }
}

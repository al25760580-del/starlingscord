package h3;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import java.io.Closeable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Closeable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String[] f10295i = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String[] f10296v = new String[0];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SQLiteDatabase f10297d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f10298e;

    public c(SQLiteDatabase delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f10297d = delegate;
        this.f10298e = delegate.getAttachedDbs();
    }

    public final void B() {
        this.f10297d.setTransactionSuccessful();
    }

    public final void c() {
        this.f10297d.beginTransaction();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f10297d.close();
    }

    public final void f() {
        this.f10297d.beginTransactionNonExclusive();
    }

    public final j g(String sql) {
        Intrinsics.checkNotNullParameter(sql, "sql");
        SQLiteStatement sQLiteStatementCompileStatement = this.f10297d.compileStatement(sql);
        Intrinsics.checkNotNullExpressionValue(sQLiteStatementCompileStatement, "delegate.compileStatement(sql)");
        return new j(sQLiteStatementCompileStatement);
    }

    public final void i() {
        this.f10297d.endTransaction();
    }

    public final void l(String sql) {
        Intrinsics.checkNotNullParameter(sql, "sql");
        this.f10297d.execSQL(sql);
    }

    public final void n(Object[] bindArgs) {
        Intrinsics.checkNotNullParameter("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", "sql");
        Intrinsics.checkNotNullParameter(bindArgs, "bindArgs");
        this.f10297d.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", bindArgs);
    }

    public final boolean q() {
        return this.f10297d.inTransaction();
    }

    public final boolean u() {
        SQLiteDatabase sQLiteDatabase = this.f10297d;
        Intrinsics.checkNotNullParameter(sQLiteDatabase, "sQLiteDatabase");
        return sQLiteDatabase.isWriteAheadLoggingEnabled();
    }

    public final Cursor y(g3.f query) {
        Intrinsics.checkNotNullParameter(query, "query");
        final b bVar = new b(query);
        Cursor cursorRawQueryWithFactory = this.f10297d.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: h3.a
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                b tmp0 = bVar;
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                return (Cursor) tmp0.invoke(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, query.c(), f10296v, null);
        Intrinsics.checkNotNullExpressionValue(cursorRawQueryWithFactory, "delegate.rawQueryWithFac…EMPTY_STRING_ARRAY, null)");
        return cursorRawQueryWithFactory;
    }

    public final Cursor z(String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        return y(new g3.a(query, 0));
    }
}

package h3;

import android.database.sqlite.SQLiteProgram;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public class i implements g3.e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SQLiteProgram f10323d;

    public i(SQLiteProgram delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f10323d = delegate;
    }

    @Override // g3.e
    public final void F(byte[] value, int i7) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f10323d.bindBlob(i7, value);
    }

    @Override // g3.e
    public final void R(int i7) {
        this.f10323d.bindNull(i7);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f10323d.close();
    }

    @Override // g3.e
    public final void o(int i7, String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f10323d.bindString(i7, value);
    }

    @Override // g3.e
    public final void s(int i7, double d6) {
        this.f10323d.bindDouble(i7, d6);
    }

    @Override // g3.e
    public final void x(int i7, long j) {
        this.f10323d.bindLong(i7, j);
    }
}

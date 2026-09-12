package h3;

import android.database.sqlite.SQLiteStatement;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class j extends i implements g3.e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SQLiteStatement f10324e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(SQLiteStatement delegate) {
        super(delegate);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f10324e = delegate;
    }

    public final int c() {
        return this.f10324e.executeUpdateDelete();
    }
}

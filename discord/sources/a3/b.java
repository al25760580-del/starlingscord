package a3;

import android.content.Context;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f54a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f55b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g3.c f56c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final fj.c f57d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f58e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f59f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m f60g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Executor f61h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Executor f62i;
    public final boolean j;
    public final boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Set f63l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List f64m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final List f65n;

    public b(Context context, String str, g3.c sqliteOpenHelperFactory, fj.c migrationContainer, List list, boolean z5, m journalMode, Executor queryExecutor, Executor transactionExecutor, boolean z6, boolean z7, Set set, List typeConverters, List autoMigrationSpecs) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sqliteOpenHelperFactory, "sqliteOpenHelperFactory");
        Intrinsics.checkNotNullParameter(migrationContainer, "migrationContainer");
        Intrinsics.checkNotNullParameter(journalMode, "journalMode");
        Intrinsics.checkNotNullParameter(queryExecutor, "queryExecutor");
        Intrinsics.checkNotNullParameter(transactionExecutor, "transactionExecutor");
        Intrinsics.checkNotNullParameter(typeConverters, "typeConverters");
        Intrinsics.checkNotNullParameter(autoMigrationSpecs, "autoMigrationSpecs");
        this.f54a = context;
        this.f55b = str;
        this.f56c = sqliteOpenHelperFactory;
        this.f57d = migrationContainer;
        this.f58e = list;
        this.f59f = z5;
        this.f60g = journalMode;
        this.f61h = queryExecutor;
        this.f62i = transactionExecutor;
        this.j = z6;
        this.k = z7;
        this.f63l = set;
        this.f64m = typeConverters;
        this.f65n = autoMigrationSpecs;
    }
}

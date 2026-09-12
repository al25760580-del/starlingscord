package a3;

import android.database.sqlite.SQLiteException;
import android.util.Log;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Unit;
import kotlin.collections.w0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String[] f73m = {"UPDATE", "DELETE", "INSERT"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WorkDatabase_Impl f74a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f75b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f76c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String[] f77d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f78e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f79f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile h3.j f80g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final f f81h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p.f f82i;
    public final Object j;
    public final Object k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final h f83l;

    public i(WorkDatabase_Impl database, HashMap shadowTablesMap, HashMap viewTables, String... tableNames) {
        Intrinsics.checkNotNullParameter(database, "database");
        Intrinsics.checkNotNullParameter(shadowTablesMap, "shadowTablesMap");
        Intrinsics.checkNotNullParameter(viewTables, "viewTables");
        Intrinsics.checkNotNullParameter(tableNames, "tableNames");
        this.f74a = database;
        this.f75b = shadowTablesMap;
        this.f78e = new AtomicBoolean(false);
        int length = tableNames.length;
        f fVar = new f();
        fVar.f68b = new long[length];
        fVar.f69c = new boolean[length];
        fVar.f70d = new int[length];
        this.f81h = fVar;
        Intrinsics.checkNotNullParameter(database, "database");
        Intrinsics.checkNotNullExpressionValue(Collections.newSetFromMap(new IdentityHashMap()), "newSetFromMap(IdentityHashMap())");
        this.f82i = new p.f();
        this.j = new Object();
        this.k = new Object();
        this.f76c = new LinkedHashMap();
        int length2 = tableNames.length;
        String[] strArr = new String[length2];
        for (int i7 = 0; i7 < length2; i7++) {
            String str = tableNames[i7];
            Locale locale = Locale.US;
            String strP = e.p(locale, "US", str, locale, "this as java.lang.String).toLowerCase(locale)");
            this.f76c.put(strP, Integer.valueOf(i7));
            String str2 = (String) this.f75b.get(tableNames[i7]);
            String strP2 = str2 != null ? e.p(locale, "US", str2, locale, "this as java.lang.String).toLowerCase(locale)") : null;
            if (strP2 != null) {
                strP = strP2;
            }
            strArr[i7] = strP;
        }
        this.f77d = strArr;
        for (Map.Entry entry : this.f75b.entrySet()) {
            String str3 = (String) entry.getValue();
            Locale locale2 = Locale.US;
            String strP3 = e.p(locale2, "US", str3, locale2, "this as java.lang.String).toLowerCase(locale)");
            if (this.f76c.containsKey(strP3)) {
                String strP4 = e.p(locale2, "US", (String) entry.getKey(), locale2, "this as java.lang.String).toLowerCase(locale)");
                LinkedHashMap linkedHashMap = this.f76c;
                linkedHashMap.put(strP4, w0.e(linkedHashMap, strP3));
            }
        }
        this.f83l = new h(0, this);
    }

    public final boolean a() {
        h3.c cVar = this.f74a.f2818a;
        if (!Intrinsics.areEqual(cVar != null ? Boolean.valueOf(cVar.f10297d.isOpen()) : null, Boolean.TRUE)) {
            return false;
        }
        if (!this.f79f) {
            this.f74a.h().C();
        }
        if (this.f79f) {
            return true;
        }
        Log.e("ROOM", "database is not initialized even though it is open");
        return false;
    }

    public final void b(h3.c cVar, int i7) {
        cVar.l("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i7 + ", 0)");
        String str = this.f77d[i7];
        for (int i10 = 0; i10 < 3; i10++) {
            String str2 = f73m[i10];
            String str3 = "CREATE TEMP TRIGGER IF NOT EXISTS " + a.a.o(str, str2) + " AFTER " + str2 + " ON `" + str + "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = " + i7 + " AND invalidated = 0; END";
            Intrinsics.checkNotNullExpressionValue(str3, "StringBuilder().apply(builderAction).toString()");
            cVar.l(str3);
        }
    }

    public final void c(h3.c database) {
        Intrinsics.checkNotNullParameter(database, "database");
        if (database.q()) {
            return;
        }
        try {
            ReentrantReadWriteLock.ReadLock lock = this.f74a.f2825h.readLock();
            Intrinsics.checkNotNullExpressionValue(lock, "readWriteLock.readLock()");
            lock.lock();
            try {
                synchronized (this.j) {
                    try {
                        int[] iArrJ = this.f81h.j();
                        if (iArrJ != null) {
                            Intrinsics.checkNotNullParameter(database, "database");
                            if (database.u()) {
                                database.f();
                            } else {
                                database.c();
                            }
                            try {
                                int length = iArrJ.length;
                                int i7 = 0;
                                int i10 = 0;
                                while (i7 < length) {
                                    int i11 = iArrJ[i7];
                                    int i12 = i10 + 1;
                                    if (i11 == 1) {
                                        b(database, i10);
                                    } else if (i11 == 2) {
                                        String str = this.f77d[i10];
                                        String[] strArr = f73m;
                                        for (int i13 = 0; i13 < 3; i13++) {
                                            String str2 = "DROP TRIGGER IF EXISTS " + a.a.o(str, strArr[i13]);
                                            Intrinsics.checkNotNullExpressionValue(str2, "StringBuilder().apply(builderAction).toString()");
                                            database.l(str2);
                                        }
                                    }
                                    i7++;
                                    i10 = i12;
                                }
                                database.B();
                                database.i();
                                Unit unit = Unit.f14616a;
                            } catch (Throwable th2) {
                                database.i();
                                throw th2;
                            }
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                lock.unlock();
            } catch (Throwable th4) {
                lock.unlock();
                throw th4;
            }
        } catch (SQLiteException e10) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e10);
        } catch (IllegalStateException e11) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e11);
        }
    }
}

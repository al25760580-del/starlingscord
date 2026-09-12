package a3;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class o implements g3.f, g3.e {
    public static final TreeMap F = new TreeMap();
    public int E;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f107d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile String f108e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long[] f109i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final double[] f110v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String[] f111w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final byte[][] f112x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int[] f113y;

    public o(int i7) {
        this.f107d = i7;
        int i10 = i7 + 1;
        this.f113y = new int[i10];
        this.f109i = new long[i10];
        this.f110v = new double[i10];
        this.f111w = new String[i10];
        this.f112x = new byte[i10][];
    }

    public static final o g(int i7, String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        TreeMap treeMap = F;
        synchronized (treeMap) {
            Map.Entry entryCeilingEntry = treeMap.ceilingEntry(Integer.valueOf(i7));
            if (entryCeilingEntry == null) {
                Unit unit = Unit.f14616a;
                o oVar = new o(i7);
                Intrinsics.checkNotNullParameter(query, "query");
                oVar.f108e = query;
                oVar.E = i7;
                return oVar;
            }
            treeMap.remove(entryCeilingEntry.getKey());
            o sqliteQuery = (o) entryCeilingEntry.getValue();
            sqliteQuery.getClass();
            Intrinsics.checkNotNullParameter(query, "query");
            sqliteQuery.f108e = query;
            sqliteQuery.E = i7;
            Intrinsics.checkNotNullExpressionValue(sqliteQuery, "sqliteQuery");
            return sqliteQuery;
        }
    }

    @Override // g3.e
    public final void F(byte[] value, int i7) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f113y[i7] = 5;
        this.f112x[i7] = value;
    }

    @Override // g3.e
    public final void R(int i7) {
        this.f113y[i7] = 1;
    }

    @Override // g3.f
    public final String c() {
        String str = this.f108e;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // g3.f
    public final void f(g3.e statement) {
        Intrinsics.checkNotNullParameter(statement, "statement");
        int i7 = this.E;
        if (1 > i7) {
            return;
        }
        int i10 = 1;
        while (true) {
            int i11 = this.f113y[i10];
            if (i11 == 1) {
                statement.R(i10);
            } else if (i11 == 2) {
                statement.x(i10, this.f109i[i10]);
            } else if (i11 == 3) {
                statement.s(i10, this.f110v[i10]);
            } else if (i11 == 4) {
                String str = this.f111w[i10];
                if (str == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                statement.o(i10, str);
            } else if (i11 == 5) {
                byte[] bArr = this.f112x[i10];
                if (bArr == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                statement.F(bArr, i10);
            }
            if (i10 == i7) {
                return;
            } else {
                i10++;
            }
        }
    }

    public final void i() {
        TreeMap treeMap = F;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f107d), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator it = treeMap.descendingKeySet().iterator();
                Intrinsics.checkNotNullExpressionValue(it, "queryPool.descendingKeySet().iterator()");
                while (true) {
                    int i7 = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i7;
                }
            }
            Unit unit = Unit.f14616a;
        }
    }

    @Override // g3.e
    public final void o(int i7, String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f113y[i7] = 4;
        this.f111w[i7] = value;
    }

    @Override // g3.e
    public final void s(int i7, double d6) {
        this.f113y[i7] = 3;
        this.f110v[i7] = d6;
    }

    @Override // g3.e
    public final void x(int i7, long j) {
        this.f113y[i7] = 2;
        this.f109i[i7] = j;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}

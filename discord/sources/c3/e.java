package c3;

import android.database.Cursor;
import com.facebook.react.devsupport.StackTraceHelper;
import java.io.IOException;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.d1;
import kotlin.collections.w0;
import kotlin.jvm.internal.Intrinsics;
import sn.i;
import sn.n;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f3443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f3444c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set f3445d;

    public e(String name, Map columns, AbstractSet foreignKeys, AbstractSet abstractSet) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(columns, "columns");
        Intrinsics.checkNotNullParameter(foreignKeys, "foreignKeys");
        this.f3442a = name;
        this.f3443b = columns;
        this.f3444c = foreignKeys;
        this.f3445d = abstractSet;
    }

    public static final e a(h3.c database, String tableName) throws IOException {
        Map mapB;
        Intrinsics.checkNotNullParameter(database, "database");
        Intrinsics.checkNotNullParameter(tableName, "tableName");
        Intrinsics.checkNotNullParameter(database, "database");
        Intrinsics.checkNotNullParameter(tableName, "tableName");
        Cursor cursorZ = database.z("PRAGMA table_info(`" + tableName + "`)");
        try {
            if (cursorZ.getColumnCount() <= 0) {
                mapB = w0.d();
                cursorZ.close();
            } else {
                int columnIndex = cursorZ.getColumnIndex(StackTraceHelper.NAME_KEY);
                int columnIndex2 = cursorZ.getColumnIndex("type");
                int columnIndex3 = cursorZ.getColumnIndex("notnull");
                int columnIndex4 = cursorZ.getColumnIndex("pk");
                int columnIndex5 = cursorZ.getColumnIndex("dflt_value");
                i builder = new i();
                while (cursorZ.moveToNext()) {
                    String name = cursorZ.getString(columnIndex);
                    String type = cursorZ.getString(columnIndex2);
                    boolean z5 = cursorZ.getInt(columnIndex3) != 0;
                    int i7 = cursorZ.getInt(columnIndex4);
                    String string = cursorZ.getString(columnIndex5);
                    Intrinsics.checkNotNullExpressionValue(name, "name");
                    Intrinsics.checkNotNullExpressionValue(type, "type");
                    builder.put(name, new a(name, type, string, i7, 2, z5));
                }
                Intrinsics.checkNotNullParameter(builder, "builder");
                mapB = builder.b();
                cursorZ.close();
            }
            Cursor cursorZ2 = database.z("PRAGMA foreign_key_list(`" + tableName + "`)");
            try {
                int columnIndex6 = cursorZ2.getColumnIndex(StackTraceHelper.ID_KEY);
                int columnIndex7 = cursorZ2.getColumnIndex("seq");
                int columnIndex8 = cursorZ2.getColumnIndex("table");
                int columnIndex9 = cursorZ2.getColumnIndex("on_delete");
                int columnIndex10 = cursorZ2.getColumnIndex("on_update");
                List listD = c9.a.D(cursorZ2);
                cursorZ2.moveToPosition(-1);
                n nVar = new n();
                while (cursorZ2.moveToNext()) {
                    if (cursorZ2.getInt(columnIndex7) == 0) {
                        int i10 = cursorZ2.getInt(columnIndex6);
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        int i11 = columnIndex6;
                        ArrayList<c> arrayList3 = new ArrayList();
                        for (Object obj : listD) {
                            int i12 = columnIndex7;
                            List list = listD;
                            if (((c) obj).f3434d == i10) {
                                arrayList3.add(obj);
                            }
                            columnIndex7 = i12;
                            listD = list;
                        }
                        int i13 = columnIndex7;
                        List list2 = listD;
                        for (c cVar : arrayList3) {
                            arrayList.add(cVar.f3436i);
                            arrayList2.add(cVar.f3437v);
                        }
                        String string2 = cursorZ2.getString(columnIndex8);
                        Intrinsics.checkNotNullExpressionValue(string2, "cursor.getString(tableColumnIndex)");
                        String string3 = cursorZ2.getString(columnIndex9);
                        Intrinsics.checkNotNullExpressionValue(string3, "cursor.getString(onDeleteColumnIndex)");
                        String string4 = cursorZ2.getString(columnIndex10);
                        Intrinsics.checkNotNullExpressionValue(string4, "cursor.getString(onUpdateColumnIndex)");
                        nVar.add(new b(arrayList, arrayList2, string2, string3, string4));
                        columnIndex6 = i11;
                        columnIndex7 = i13;
                        listD = list2;
                    }
                }
                n nVarA = d1.a(nVar);
                cursorZ2.close();
                Cursor cursorZ3 = database.z("PRAGMA index_list(`" + tableName + "`)");
                try {
                    int columnIndex11 = cursorZ3.getColumnIndex(StackTraceHelper.NAME_KEY);
                    int columnIndex12 = cursorZ3.getColumnIndex("origin");
                    int columnIndex13 = cursorZ3.getColumnIndex("unique");
                    n nVarA2 = null;
                    if (columnIndex11 == -1 || columnIndex12 == -1 || columnIndex13 == -1) {
                        cursorZ3.close();
                    } else {
                        n nVar2 = new n();
                        while (cursorZ3.moveToNext()) {
                            if (Intrinsics.areEqual("c", cursorZ3.getString(columnIndex12))) {
                                String name2 = cursorZ3.getString(columnIndex11);
                                boolean z6 = cursorZ3.getInt(columnIndex13) == 1;
                                Intrinsics.checkNotNullExpressionValue(name2, "name");
                                d dVarE = c9.a.E(database, name2, z6);
                                if (dVarE == null) {
                                    cursorZ3.close();
                                } else {
                                    nVar2.add(dVarE);
                                }
                            }
                        }
                        nVarA2 = d1.a(nVar2);
                        cursorZ3.close();
                    }
                    return new e(tableName, mapB, nVarA, nVarA2);
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        ls.d.k(cursorZ3, th2);
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                try {
                    throw th4;
                } catch (Throwable th5) {
                    ls.d.k(cursorZ2, th4);
                    throw th5;
                }
            }
        } catch (Throwable th6) {
            try {
                throw th6;
            } catch (Throwable th7) {
                ls.d.k(cursorZ, th6);
                throw th7;
            }
        }
    }

    public final boolean equals(Object obj) {
        Set set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (!Intrinsics.areEqual(this.f3442a, eVar.f3442a) || !Intrinsics.areEqual(this.f3443b, eVar.f3443b) || !Intrinsics.areEqual(this.f3444c, eVar.f3444c)) {
            return false;
        }
        Set set2 = this.f3445d;
        if (set2 == null || (set = eVar.f3445d) == null) {
            return true;
        }
        return Intrinsics.areEqual(set2, set);
    }

    public final int hashCode() {
        return this.f3444c.hashCode() + ((this.f3443b.hashCode() + (this.f3442a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "TableInfo{name='" + this.f3442a + "', columns=" + this.f3443b + ", foreignKeys=" + this.f3444c + ", indices=" + this.f3445d + '}';
    }
}

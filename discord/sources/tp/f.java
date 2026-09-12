package tp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.collections.d0;
import kotlin.collections.e0;
import kotlin.collections.p0;
import kotlin.collections.r0;
import kotlin.collections.v0;
import kotlin.collections.x;
import kotlin.jvm.internal.Intrinsics;
import rn.n;
import sp.h;
import sp.i;
import sp.j;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements rp.f {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final List f20876v;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String[] f20877d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Set f20878e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f20879i;

    static {
        String strO = CollectionsKt.O(d0.g('k', 'o', 't', 'l', 'i', 'n'), "", null, null, null, 62);
        List listG = d0.g(kk.b.j(strO, "/Any"), kk.b.j(strO, "/Nothing"), kk.b.j(strO, "/Unit"), kk.b.j(strO, "/Throwable"), kk.b.j(strO, "/Number"), kk.b.j(strO, "/Byte"), kk.b.j(strO, "/Double"), kk.b.j(strO, "/Float"), kk.b.j(strO, "/Int"), kk.b.j(strO, "/Long"), kk.b.j(strO, "/Short"), kk.b.j(strO, "/Boolean"), kk.b.j(strO, "/Char"), kk.b.j(strO, "/CharSequence"), kk.b.j(strO, "/String"), kk.b.j(strO, "/Comparable"), kk.b.j(strO, "/Enum"), kk.b.j(strO, "/Array"), kk.b.j(strO, "/ByteArray"), kk.b.j(strO, "/DoubleArray"), kk.b.j(strO, "/FloatArray"), kk.b.j(strO, "/IntArray"), kk.b.j(strO, "/LongArray"), kk.b.j(strO, "/ShortArray"), kk.b.j(strO, "/BooleanArray"), kk.b.j(strO, "/CharArray"), kk.b.j(strO, "/Cloneable"), kk.b.j(strO, "/Annotation"), kk.b.j(strO, "/collections/Iterable"), kk.b.j(strO, "/collections/MutableIterable"), kk.b.j(strO, "/collections/Collection"), kk.b.j(strO, "/collections/MutableCollection"), kk.b.j(strO, "/collections/List"), kk.b.j(strO, "/collections/MutableList"), kk.b.j(strO, "/collections/Set"), kk.b.j(strO, "/collections/MutableSet"), kk.b.j(strO, "/collections/Map"), kk.b.j(strO, "/collections/MutableMap"), kk.b.j(strO, "/collections/Map.Entry"), kk.b.j(strO, "/collections/MutableMap.MutableEntry"), kk.b.j(strO, "/collections/Iterator"), kk.b.j(strO, "/collections/MutableIterator"), kk.b.j(strO, "/collections/ListIterator"), kk.b.j(strO, "/collections/MutableListIterator"));
        f20876v = listG;
        x xVarM0 = CollectionsKt.m0(listG);
        int iA = v0.a(e0.l(xVarM0, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        Iterator it = xVarM0.iterator();
        while (true) {
            r0 r0Var = (r0) it;
            if (!r0Var.f14666e.hasNext()) {
                return;
            }
            IndexedValue indexedValue = (IndexedValue) r0Var.next();
            linkedHashMap.put((String) indexedValue.f14623b, Integer.valueOf(indexedValue.f14622a));
        }
    }

    public f(j types, String[] strings) {
        Set localNameIndices;
        Intrinsics.checkNotNullParameter(types, "types");
        Intrinsics.checkNotNullParameter(strings, "strings");
        List list = types.f20479i;
        if (list.isEmpty()) {
            localNameIndices = p0.f14661d;
        } else {
            Intrinsics.checkNotNull(list);
            localNameIndices = CollectionsKt.l0(list);
        }
        List<i> list2 = types.f20478e;
        Intrinsics.checkNotNullExpressionValue(list2, "getRecordList(...)");
        Intrinsics.checkNotNullParameter(list2, "<this>");
        ArrayList records = new ArrayList();
        records.ensureCapacity(list2.size());
        for (i iVar : list2) {
            int i7 = iVar.f20471i;
            for (int i10 = 0; i10 < i7; i10++) {
                records.add(iVar);
            }
        }
        records.trimToSize();
        Intrinsics.checkNotNullParameter(strings, "strings");
        Intrinsics.checkNotNullParameter(localNameIndices, "localNameIndices");
        Intrinsics.checkNotNullParameter(records, "records");
        this.f20877d = strings;
        this.f20878e = localNameIndices;
        this.f20879i = records;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003f  */
    @Override // rp.f
    public final String getString(int i7) {
        String strM;
        i iVar = (i) this.f20879i.get(i7);
        int i10 = iVar.f20470e;
        if ((i10 & 4) == 4) {
            Object obj = iVar.f20473w;
            if (obj instanceof String) {
                strM = (String) obj;
            } else {
                vp.d dVar = (vp.d) obj;
                String strS = dVar.s();
                if (dVar.j()) {
                    iVar.f20473w = strS;
                }
                strM = strS;
            }
        } else if ((i10 & 2) == 2) {
            List list = f20876v;
            int size = list.size();
            int i11 = iVar.f20472v;
            if (i11 < 0 || i11 >= size) {
                strM = this.f20877d[i7];
            } else {
                strM = (String) list.get(i11);
            }
        } else {
            strM = this.f20877d[i7];
        }
        if (iVar.f20475y.size() >= 2) {
            List list2 = iVar.f20475y;
            Intrinsics.checkNotNull(list2);
            Integer num = (Integer) list2.get(0);
            Integer num2 = (Integer) list2.get(1);
            if (num.intValue() >= 0 && num.intValue() <= num2.intValue() && num2.intValue() <= strM.length()) {
                Intrinsics.checkNotNull(strM);
                Intrinsics.checkNotNull(num);
                int iIntValue = num.intValue();
                Intrinsics.checkNotNull(num2);
                strM = strM.substring(iIntValue, num2.intValue());
                Intrinsics.checkNotNullExpressionValue(strM, "substring(...)");
            }
        }
        if (iVar.F.size() >= 2) {
            List list3 = iVar.F;
            Intrinsics.checkNotNull(list3);
            Integer num3 = (Integer) list3.get(0);
            Integer num4 = (Integer) list3.get(1);
            Intrinsics.checkNotNull(strM);
            strM = kotlin.text.x.m(strM, (char) num3.intValue(), (char) num4.intValue());
        }
        h hVar = iVar.f20474x;
        if (hVar == null) {
            hVar = h.NONE;
        }
        int iOrdinal = hVar.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                Intrinsics.checkNotNull(strM);
                strM = kotlin.text.x.m(strM, '$', '.');
            } else {
                if (iOrdinal != 2) {
                    throw new n();
                }
                if (strM.length() >= 2) {
                    Intrinsics.checkNotNull(strM);
                    strM = strM.substring(1, strM.length() - 1);
                    Intrinsics.checkNotNullExpressionValue(strM, "substring(...)");
                }
                Intrinsics.checkNotNull(strM);
                strM = kotlin.text.x.m(strM, '$', '.');
            }
        }
        Intrinsics.checkNotNull(strM);
        return strM;
    }

    @Override // rp.f
    public final String k(int i7) {
        return getString(i7);
    }

    @Override // rp.f
    public final boolean v(int i7) {
        return this.f20878e.contains(Integer.valueOf(i7));
    }
}

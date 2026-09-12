package mp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.collections.IndexedValue;
import kotlin.collections.e0;
import kotlin.collections.r0;
import kotlin.collections.v0;
import kotlin.collections.x;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f16003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Pair f16004c;

    public p(e4.r rVar, String functionName, String str) {
        Intrinsics.checkNotNullParameter(functionName, "functionName");
        this.f16002a = str;
        this.f16003b = new ArrayList();
        this.f16004c = new Pair("V", null);
    }

    public final void a(String type, d... qualifiers) {
        s sVar;
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(qualifiers, "qualifiers");
        if (qualifiers.length == 0) {
            sVar = null;
        } else {
            Intrinsics.checkNotNullParameter(qualifiers, "<this>");
            x xVar = new x(new i6.a(4, qualifiers));
            int iA = v0.a(e0.l(xVar, 10));
            if (iA < 16) {
                iA = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
            Iterator it = xVar.iterator();
            while (true) {
                r0 r0Var = (r0) it;
                if (!r0Var.f14666e.hasNext()) {
                    break;
                }
                IndexedValue indexedValue = (IndexedValue) r0Var.next();
                linkedHashMap.put(Integer.valueOf(indexedValue.f14622a), (d) indexedValue.f14623b);
            }
            sVar = new s(linkedHashMap);
        }
        this.f16003b.add(new Pair(type, sVar));
    }

    public final void b(cq.c type) {
        Intrinsics.checkNotNullParameter(type, "type");
        String strC = type.c();
        Intrinsics.checkNotNullExpressionValue(strC, "getDesc(...)");
        this.f16004c = new Pair(strC, null);
    }

    public final void c(String type, d... qualifiers) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(qualifiers, "qualifiers");
        Intrinsics.checkNotNullParameter(qualifiers, "<this>");
        x xVar = new x(new i6.a(4, qualifiers));
        int iA = v0.a(e0.l(xVar, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        Iterator it = xVar.iterator();
        while (true) {
            r0 r0Var = (r0) it;
            if (!r0Var.f14666e.hasNext()) {
                this.f16004c = new Pair(type, new s(linkedHashMap));
                return;
            } else {
                IndexedValue indexedValue = (IndexedValue) r0Var.next();
                linkedHashMap.put(Integer.valueOf(indexedValue.f14622a), (d) indexedValue.f14623b);
            }
        }
    }
}

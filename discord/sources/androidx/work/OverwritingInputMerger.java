package androidx.work;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import v3.f;
import v3.g;
import v3.i;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/work/OverwritingInputMerger;", "Lv3/i;", "<init>", "()V", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class OverwritingInputMerger extends i {
    @Override // v3.i
    public final g a(ArrayList inputs) throws Throwable {
        Intrinsics.checkNotNullParameter(inputs, "inputs");
        f fVar = new f();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = inputs.iterator();
        while (it.hasNext()) {
            Map mapUnmodifiableMap = Collections.unmodifiableMap(((g) it.next()).f21405a);
            Intrinsics.checkNotNullExpressionValue(mapUnmodifiableMap, "input.keyValueMap");
            linkedHashMap.putAll(mapUnmodifiableMap);
        }
        fVar.b(linkedHashMap);
        g gVar = new g(fVar.f21402a);
        g.b(gVar);
        Intrinsics.checkNotNullExpressionValue(gVar, "output.build()");
        return gVar;
    }
}

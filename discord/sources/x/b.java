package x;

import kotlin.jvm.internal.Intrinsics;
import u.h;
import u.y;

/* JADX INFO: loaded from: classes.dex */
public final class b extends w.b implements u.e {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final b f22490v;

    static {
        Intrinsics.checkNotNull(w.e.f21968b, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.ValueHolder<kotlin.Any?>>");
        w.e eVar = w.e.f21968b;
        f22490v = new b();
    }

    @Override // w.b, kotlin.collections.l, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (!(obj instanceof y)) {
            return false;
        }
        super.containsKey((y) obj);
        return false;
    }

    @Override // kotlin.collections.l, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof h) {
            return super.containsValue((h) obj);
        }
        return false;
    }

    public final Object f(y yVar) {
        Intrinsics.checkNotNull(yVar, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        get(yVar);
        return yVar.f20906a.f20886a.getValue();
    }

    @Override // w.b, kotlin.collections.l, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (!(obj instanceof y)) {
            return null;
        }
        super.get((y) obj);
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof y) ? obj2 : (h) super.getOrDefault((y) obj, (h) obj2);
    }
}

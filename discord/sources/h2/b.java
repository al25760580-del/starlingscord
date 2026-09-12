package h2;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f10288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f10289b;

    public b(LinkedHashMap preferencesMap, boolean z5) {
        Intrinsics.checkNotNullParameter(preferencesMap, "preferencesMap");
        this.f10288a = preferencesMap;
        this.f10289b = new AtomicBoolean(z5);
    }

    public final void a(c key, Object obj) {
        Intrinsics.checkNotNullParameter(key, "key");
        AtomicBoolean atomicBoolean = this.f10289b;
        if (atomicBoolean.get()) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
        }
        LinkedHashMap linkedHashMap = this.f10288a;
        if (obj == null) {
            Intrinsics.checkNotNullParameter(key, "key");
            if (atomicBoolean.get()) {
                throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
            }
            linkedHashMap.remove(key);
            return;
        }
        if (!(obj instanceof Set)) {
            linkedHashMap.put(key, obj);
            return;
        }
        Set setUnmodifiableSet = Collections.unmodifiableSet(CollectionsKt.l0((Iterable) obj));
        Intrinsics.checkNotNullExpressionValue(setUnmodifiableSet, "unmodifiableSet(value.toSet())");
        linkedHashMap.put(key, setUnmodifiableSet);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        return Intrinsics.areEqual(this.f10288a, ((b) obj).f10288a);
    }

    public final int hashCode() {
        return this.f10288a.hashCode();
    }

    public final String toString() {
        return CollectionsKt.O(this.f10288a.entrySet(), ",\n", "{\n", "\n}", a.f10287d, 24);
    }

    public /* synthetic */ b(boolean z5) {
        this(new LinkedHashMap(), z5);
    }
}

package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.j;
import d3.d;
import e3.a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class SavedStateRegistry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f2735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d3.a f2736b;

    public SavedStateRegistry(a impl) {
        Intrinsics.checkNotNullParameter(impl, "impl");
        this.f2735a = impl;
    }

    public final Bundle a(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(key, "key");
        a aVar = this.f2735a;
        if (!aVar.f7960g) {
            throw new IllegalStateException("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
        }
        Bundle source = aVar.f7959f;
        if (source == null) {
            return null;
        }
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(key, "key");
        Bundle bundleW = source.containsKey(key) ? c9.a.w(key, source) : null;
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(key, "key");
        source.remove(key);
        Intrinsics.checkNotNullParameter(source, "source");
        if (source.isEmpty()) {
            aVar.f7959f = null;
        }
        return bundleW;
    }

    public final d b() {
        d dVar;
        Intrinsics.checkNotNullParameter("androidx.lifecycle.internal.SavedStateHandlesProvider", "key");
        a aVar = this.f2735a;
        Intrinsics.checkNotNullParameter("androidx.lifecycle.internal.SavedStateHandlesProvider", "key");
        synchronized (aVar.f7956c) {
            Iterator it = aVar.f7957d.entrySet().iterator();
            do {
                dVar = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                d dVar2 = (d) entry.getValue();
                if (Intrinsics.areEqual(str, "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                    dVar = dVar2;
                }
            } while (dVar == null);
        }
        return dVar;
    }

    public final void c(String key, d provider) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(provider, "provider");
        a aVar = this.f2735a;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(provider, "provider");
        synchronized (aVar.f7956c) {
            if (aVar.f7957d.containsKey(key)) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
            aVar.f7957d.put(key, provider);
            Unit unit = Unit.f14616a;
        }
    }

    public final void d() {
        Intrinsics.checkNotNullParameter(j.class, "clazz");
        if (!this.f2735a.f7961h) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        d3.a aVar = this.f2736b;
        if (aVar == null) {
            aVar = new d3.a(this);
        }
        this.f2736b = aVar;
        try {
            j.class.getDeclaredConstructor(null);
            d3.a aVar2 = this.f2736b;
            if (aVar2 != null) {
                String className = j.class.getName();
                Intrinsics.checkNotNullExpressionValue(className, "getName(...)");
                Intrinsics.checkNotNullParameter(className, "className");
                ((LinkedHashSet) aVar2.f7580b).add(className);
            }
        } catch (NoSuchMethodException e10) {
            throw new IllegalArgumentException("Class " + j.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e10);
        }
    }
}

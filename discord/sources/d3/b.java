package d3;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.c1;
import androidx.lifecycle.j;
import androidx.lifecycle.k;
import androidx.lifecycle.n;
import androidx.lifecycle.s0;
import androidx.lifecycle.t;
import androidx.lifecycle.y0;
import androidx.savedstate.SavedStateRegistry;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.events.EventDispatcher;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import s0.g;
import tm.h;

/* JADX INFO: loaded from: classes.dex */
public final class b implements t {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7581d = 3;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f7582e;

    public b(Lifecycle screenLifecycle, h appearanceEventEmitter) {
        Intrinsics.checkNotNullParameter(screenLifecycle, "screenLifecycle");
        Intrinsics.checkNotNullParameter(appearanceEventEmitter, "appearanceEventEmitter");
        this.f7582e = appearanceEventEmitter;
        screenLifecycle.a(this);
    }

    @Override // androidx.lifecycle.t
    public final void c(LifecycleOwner source, n event) {
        switch (this.f7581d) {
            case 0:
                e owner = (e) this.f7582e;
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(event, "event");
                if (event != n.ON_CREATE) {
                    throw new AssertionError("Next event must be ON_CREATE");
                }
                source.getLifecycle().c(this);
                Bundle source2 = owner.getSavedStateRegistry().a("androidx.savedstate.Restarter");
                if (source2 == null) {
                    return;
                }
                Intrinsics.checkNotNullParameter(source2, "source");
                Intrinsics.checkNotNullParameter("classes_to_restore", "key");
                ArrayList<String> stringArrayList = source2.getStringArrayList("classes_to_restore");
                if (stringArrayList == null) {
                    throw new IllegalStateException("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                }
                for (String str : stringArrayList) {
                    try {
                        Class<? extends U> clsAsSubclass = Class.forName(str, false, b.class.getClassLoader()).asSubclass(c.class);
                        Intrinsics.checkNotNull(clsAsSubclass);
                        try {
                            Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                            declaredConstructor.setAccessible(true);
                            try {
                                Object objNewInstance = declaredConstructor.newInstance(null);
                                Intrinsics.checkNotNull(objNewInstance);
                                ((j) ((c) objNewInstance)).getClass();
                                Intrinsics.checkNotNullParameter(owner, "owner");
                                if (!(owner instanceof c1)) {
                                    throw new IllegalStateException(("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: " + owner).toString());
                                }
                                ViewModelStore viewModelStore = ((c1) owner).getViewModelStore();
                                SavedStateRegistry savedStateRegistry = owner.getSavedStateRegistry();
                                viewModelStore.getClass();
                                LinkedHashMap linkedHashMap = viewModelStore.f2325a;
                                for (String key : new HashSet(linkedHashMap.keySet())) {
                                    Intrinsics.checkNotNullParameter(key, "key");
                                    y0 y0Var = (y0) linkedHashMap.get(key);
                                    if (y0Var != null) {
                                        k.a(y0Var, savedStateRegistry, owner.getLifecycle());
                                    }
                                }
                                if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                                    savedStateRegistry.d();
                                }
                            } catch (Exception e10) {
                                throw new RuntimeException(a3.e.l("Failed to instantiate ", str), e10);
                            }
                        } catch (NoSuchMethodException e11) {
                            throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e11);
                        }
                    } catch (ClassNotFoundException e12) {
                        throw new RuntimeException(g.e("Class ", str, " wasn't found"), e12);
                    }
                }
                return;
            case 1:
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(event, "event");
                new HashMap();
                androidx.lifecycle.h[] hVarArr = (androidx.lifecycle.h[]) this.f7582e;
                if (hVarArr.length > 0) {
                    androidx.lifecycle.h hVar = hVarArr[0];
                    throw null;
                }
                if (hVarArr.length <= 0) {
                    return;
                }
                androidx.lifecycle.h hVar2 = hVarArr[0];
                throw null;
            case 2:
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(event, "event");
                if (event != n.ON_CREATE) {
                    throw new IllegalStateException(("Next event must be ON_CREATE, it was " + event).toString());
                }
                source.getLifecycle().c(this);
                ((s0) this.f7582e).b();
                return;
            case 3:
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(event, "event");
                ComponentActivity componentActivity = (ComponentActivity) this.f7582e;
                ComponentActivity.access$ensureViewModelStore(componentActivity);
                componentActivity.getLifecycle().c(this);
                return;
            default:
                h hVar3 = (h) this.f7582e;
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(event, "event");
                switch (tm.g.f20846a[event.ordinal()]) {
                    case 1:
                        ((EventDispatcher) hVar3.f14232c).dispatchEvent(new um.a(UIManagerHelper.getSurfaceId((ReactContext) hVar3.f14231b), hVar3.f14230a, 3));
                        return;
                    case 2:
                        ((EventDispatcher) hVar3.f14232c).dispatchEvent(new um.a(UIManagerHelper.getSurfaceId((ReactContext) hVar3.f14231b), hVar3.f14230a, 0));
                        return;
                    case 3:
                        ((EventDispatcher) hVar3.f14232c).dispatchEvent(new um.a(UIManagerHelper.getSurfaceId((ReactContext) hVar3.f14231b), hVar3.f14230a, 4));
                        return;
                    case 4:
                        ((EventDispatcher) hVar3.f14232c).dispatchEvent(new um.a(UIManagerHelper.getSurfaceId((ReactContext) hVar3.f14231b), hVar3.f14230a, 1));
                        return;
                    case 5:
                        source.getLifecycle().c(this);
                        return;
                    case 6:
                    case 7:
                        return;
                    default:
                        throw new rn.n();
                }
        }
    }

    public b(androidx.lifecycle.h[] generatedAdapters) {
        Intrinsics.checkNotNullParameter(generatedAdapters, "generatedAdapters");
        this.f7582e = generatedAdapters;
    }

    public b(e owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.f7582e = owner;
    }

    public b(s0 provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.f7582e = provider;
    }

    public b(ComponentActivity componentActivity) {
        this.f7582e = componentActivity;
    }
}

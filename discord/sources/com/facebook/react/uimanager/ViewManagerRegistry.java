package com.facebook.react.uimanager;

import am.c;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import com.facebook.react.bridge.UiThreadUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.e0;
import kotlin.collections.v0;
import kotlin.collections.w0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import rn.d;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B'\b\u0016\u0012\u001c\u0010\u0006\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0006\b\u0000\u0012\u00020\t\u0012\u0006\b\u0000\u0012\u00020\t0\b0\u0007¢\u0006\u0004\b\u0004\u0010\nB'\b\u0016\u0012\u001c\u0010\u000b\u001a\u0018\u0012\u0004\u0012\u00020\r\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\b\u0018\u00010\f¢\u0006\u0004\b\u0004\u0010\u000eJ\u0016\u0010\u0011\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\b2\u0006\u0010\u0012\u001a\u00020\rJ\u001a\u0010\u0013\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\b2\u0006\u0010\u0012\u001a\u00020\rH\u0002J\u001a\u0010\u0014\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\b2\u0006\u0010\u0012\u001a\u00020\rH\u0001J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018J\u0006\u0010\u0019\u001a\u00020\u0016J\u0010\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u0018H\u0016J\u0010\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u0016H\u0017R\"\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\r\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\b0\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/facebook/react/uimanager/ViewManagerRegistry;", "Landroid/content/ComponentCallbacks2;", "viewManagerResolver", "Lcom/facebook/react/uimanager/ViewManagerResolver;", "<init>", "(Lcom/facebook/react/uimanager/ViewManagerResolver;)V", "viewManagerList", "", "Lcom/facebook/react/uimanager/ViewManager;", "", "(Ljava/util/List;)V", "viewManagerMap", "", "", "(Ljava/util/Map;)V", "viewManagersMap", "", "get", "className", "getViewManagerFromResolver", "getViewManagerIfExists", "onSurfaceStopped", "", "surfaceId", "", "invalidate", "onTrimMemory", "level", "onConfigurationChanged", "newConfig", "Landroid/content/res/Configuration;", "onLowMemory", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nViewManagerRegistry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewManagerRegistry.kt\ncom/facebook/react/uimanager/ViewManagerRegistry\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,163:1\n1208#2,2:164\n1236#2,4:166\n1#3:170\n*S KotlinDebug\n*F\n+ 1 ViewManagerRegistry.kt\ncom/facebook/react/uimanager/ViewManagerRegistry\n*L\n29#1:164,2\n29#1:166,4\n*E\n"})
public final class ViewManagerRegistry implements ComponentCallbacks2 {
    private final ViewManagerResolver viewManagerResolver;

    @NotNull
    private final Map<String, ViewManager<?, ?>> viewManagersMap;

    public ViewManagerRegistry(@NotNull ViewManagerResolver viewManagerResolver) {
        Intrinsics.checkNotNullParameter(viewManagerResolver, "viewManagerResolver");
        this.viewManagersMap = new LinkedHashMap();
        this.viewManagerResolver = viewManagerResolver;
    }

    private final ViewManager<?, ?> getViewManagerFromResolver(String className) {
        ViewManagerResolver viewManagerResolver = this.viewManagerResolver;
        ViewManager<?, ?> viewManager = viewManagerResolver != null ? viewManagerResolver.getViewManager(className) : null;
        if (viewManager != null) {
            this.viewManagersMap.put(className, viewManager);
        }
        return viewManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invalidate$lambda$9(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((ViewManager) it.next()).invalidate();
        }
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onSurfaceStopped$lambda$6(List list, int i7) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((ViewManager) it.next()).onSurfaceStopped(i7);
        }
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onTrimMemory$lambda$12(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((ViewManager) it.next()).trimMemory();
        }
        return Unit.f14616a;
    }

    @NotNull
    public final synchronized ViewManager<?, ?> get(@NotNull String className) {
        try {
            Intrinsics.checkNotNullParameter(className, "className");
            ViewManager<?, ?> viewManager = this.viewManagersMap.get(className);
            if (viewManager != null) {
                return viewManager;
            }
            String str = "RCT" + className;
            ViewManager<?, ?> viewManager2 = this.viewManagersMap.get(str);
            if (viewManager2 != null) {
                return viewManager2;
            }
            if (this.viewManagerResolver == null) {
                throw new IllegalViewOperationException("No ViewManager found for class " + className);
            }
            ViewManager<?, ?> viewManagerFromResolver = getViewManagerFromResolver(className);
            if (viewManagerFromResolver != null) {
                return viewManagerFromResolver;
            }
            ViewManager<?, ?> viewManagerFromResolver2 = getViewManagerFromResolver(str);
            if (viewManagerFromResolver2 != null) {
                return viewManagerFromResolver2;
            }
            throw new IllegalViewOperationException("Can't find ViewManager '" + className + "' nor '" + str + "' in ViewManagerRegistry, existing names are: " + this.viewManagerResolver.getViewManagerNames());
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized ViewManager<?, ?> getViewManagerIfExists(@NotNull String className) {
        Intrinsics.checkNotNullParameter(className, "className");
        ViewManager<?, ?> viewManager = this.viewManagersMap.get(className);
        if (viewManager != null) {
            return viewManager;
        }
        return this.viewManagerResolver != null ? getViewManagerFromResolver(className) : null;
    }

    public final void invalidate() {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList(this.viewManagersMap.values());
        }
        a aVar = new a(0, arrayList);
        if (UiThreadUtil.isOnUiThread()) {
            aVar.invoke();
        } else {
            UiThreadUtil.runOnUiThread(new c(25, aVar));
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
    }

    @Override // android.content.ComponentCallbacks
    @d
    public void onLowMemory() {
        onTrimMemory(40);
    }

    public final void onSurfaceStopped(final int surfaceId) {
        final ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList(this.viewManagersMap.values());
        }
        Function0 function0 = new Function0() { // from class: com.facebook.react.uimanager.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ViewManagerRegistry.onSurfaceStopped$lambda$6(arrayList, surfaceId);
            }
        };
        if (UiThreadUtil.isOnUiThread()) {
            function0.invoke();
        } else {
            UiThreadUtil.runOnUiThread(new c(27, function0));
        }
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int level) {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList(this.viewManagersMap.values());
        }
        a aVar = new a(1, arrayList);
        if (UiThreadUtil.isOnUiThread()) {
            aVar.invoke();
        } else {
            UiThreadUtil.runOnUiThread(new c(26, aVar));
        }
    }

    public ViewManagerRegistry(@NotNull List<? extends ViewManager> viewManagerList) {
        Intrinsics.checkNotNullParameter(viewManagerList, "viewManagerList");
        int iA = v0.a(e0.l(viewManagerList, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA < 16 ? 16 : iA);
        for (Object obj : viewManagerList) {
            linkedHashMap.put(((ViewManager) obj).getName(), obj);
        }
        this.viewManagersMap = w0.n(linkedHashMap);
        this.viewManagerResolver = null;
    }

    public ViewManagerRegistry(Map<String, ? extends ViewManager<?, ?>> map) {
        this.viewManagersMap = map != null ? w0.n(map) : new LinkedHashMap();
        this.viewManagerResolver = null;
    }
}

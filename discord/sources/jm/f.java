package jm;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.views.swiperefresh.ReactSwipeRefreshLayout;
import com.facebook.react.views.view.ReactViewGroup;
import com.swmansion.gesturehandler.react.RNGestureHandlerModule;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.collections.n0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends ReactViewGroup {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f13945d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f13946e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public LinkedHashSet f13947i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public LinkedHashSet f13948v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public LinkedHashSet f13949w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public LinkedHashMap f13950x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f13951y;

    public static /* synthetic */ void d(f fVar, List list) throws Exception {
        fVar.c(list, fVar.getId(), 5, fVar.f13948v);
    }

    private final ThemedReactContext getReactContext() {
        Context context = getContext();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext");
        return (ThemedReactContext) context;
    }

    @Override // android.view.ViewGroup
    public final void addView(View child, int i7, ViewGroup.LayoutParams layoutParams) throws Exception {
        Intrinsics.checkNotNullParameter(child, "child");
        super.addView(child, i7, layoutParams);
        if (!this.f13947i.isEmpty()) {
            getChildCount();
        }
        i(child);
    }

    public final void c(List list, int i7, int i10, Set set) throws Exception {
        im.f fVar;
        RNGestureHandlerModule.Companion.getClass();
        k kVar = (k) RNGestureHandlerModule.registries.get(Integer.valueOf(this.f13951y));
        if (kVar == null) {
            throw new Exception("Tried to access a non-existent registry");
        }
        LinkedHashSet linkedHashSetK0 = CollectionsKt.k0(set);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            linkedHashSetK0.remove(Integer.valueOf(iIntValue));
            if (!set.contains(Integer.valueOf(iIntValue))) {
                com.discord.chat.presentation.message.view.voicemessages.d block = new com.discord.chat.presentation.message.view.voicemessages.d(this, i10, i7, 2);
                Intrinsics.checkNotNullParameter(this, "owner");
                Intrinsics.checkNotNullParameter(block, "block");
                synchronized (kVar) {
                    try {
                        LinkedHashMap linkedHashMap = kVar.f13959d;
                        Integer numValueOf = Integer.valueOf(iIntValue);
                        Object linkedHashMap2 = linkedHashMap.get(numValueOf);
                        if (linkedHashMap2 == null) {
                            linkedHashMap2 = new LinkedHashMap();
                            linkedHashMap.put(numValueOf, linkedHashMap2);
                        }
                        ((Map) linkedHashMap2).put(this, block);
                        fVar = (im.f) kVar.f13956a.get(iIntValue);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (fVar != null) {
                    block.invoke(fVar);
                }
                set.add(Integer.valueOf(iIntValue));
            }
        }
        Iterator it2 = linkedHashSetK0.iterator();
        while (it2.hasNext()) {
            int iIntValue2 = ((Number) it2.next()).intValue();
            kVar.b(this, iIntValue2);
            if (this.f13949w.contains(Integer.valueOf(iIntValue2))) {
                kVar.c(this, iIntValue2);
                this.f13949w.remove(Integer.valueOf(iIntValue2));
            }
            set.remove(Integer.valueOf(iIntValue2));
            this.f13947i.remove(Integer.valueOf(iIntValue2));
        }
    }

    public final void e(List list) throws Exception {
        LinkedHashSet linkedHashSet = this.f13949w;
        LinkedHashMap linkedHashMap = this.f13950x;
        LinkedHashSet linkedHashSetK0 = CollectionsKt.k0(linkedHashMap.keySet());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            linkedHashSetK0.remove(Integer.valueOf(((e) it.next()).f13944b));
        }
        RNGestureHandlerModule.Companion.getClass();
        k kVar = (k) RNGestureHandlerModule.registries.get(Integer.valueOf(this.f13951y));
        if (kVar == null) {
            throw new Exception("Tried to access a non-existent registry");
        }
        Iterator it2 = linkedHashSetK0.iterator();
        while (it2.hasNext()) {
            int iIntValue = ((Number) it2.next()).intValue();
            Object obj = linkedHashMap.get(Integer.valueOf(iIntValue));
            Intrinsics.checkNotNull(obj);
            Iterator it3 = ((Set) obj).iterator();
            while (it3.hasNext()) {
                int iIntValue2 = ((Number) it3.next()).intValue();
                kVar.b(this, iIntValue2);
                if (linkedHashSet.contains(Integer.valueOf(iIntValue2))) {
                    kVar.c(this, iIntValue2);
                    linkedHashSet.remove(Integer.valueOf(iIntValue2));
                }
            }
            linkedHashMap.remove(Integer.valueOf(iIntValue));
        }
        Iterator it4 = list.iterator();
        while (it4.hasNext()) {
            e eVar = (e) it4.next();
            int i7 = eVar.f13944b;
            if (!linkedHashMap.containsKey(Integer.valueOf(i7))) {
                linkedHashMap.put(Integer.valueOf(i7), new LinkedHashSet());
            }
            List list2 = eVar.f13943a;
            Object obj2 = linkedHashMap.get(Integer.valueOf(i7));
            Intrinsics.checkNotNull(obj2);
            c(list2, i7, 6, (Set) obj2);
        }
    }

    public final void f() {
        RNGestureHandlerModule.Companion.getClass();
        k kVar = (k) RNGestureHandlerModule.registries.get(Integer.valueOf(this.f13951y));
        if (kVar != null) {
            synchronized (kVar) {
                Intrinsics.checkNotNullParameter(this, "owner");
                Iterator it = kVar.f13959d.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    ((Map) entry.getValue()).remove(this);
                    if (((Map) entry.getValue()).isEmpty()) {
                        it.remove();
                    }
                }
            }
            Iterator it2 = this.f13949w.iterator();
            while (it2.hasNext()) {
                kVar.c(this, ((Number) it2.next()).intValue());
            }
        }
        this.f13949w.clear();
        this.f13950x.clear();
        this.f13948v.clear();
        this.f13947i.clear();
    }

    public final void g(Event event) {
        Intrinsics.checkNotNullParameter(event, "event");
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(getReactContext(), getId());
        if (eventDispatcherForReactTag != null) {
            eventDispatcherForReactTag.dispatchEvent(event);
        }
    }

    public final void h(im.f handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(this, "viewGroup");
        n nVar = null;
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof n) {
                nVar = (n) parent;
            }
        }
        if (nVar != null) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            m mVar = nVar.f13972v;
            if (mVar != null) {
                Intrinsics.checkNotNullParameter(handler, "handler");
                im.g gVar = mVar.f13962c;
                if (gVar != null) {
                    gVar.g(handler, null);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0052  */
    /* JADX WARN: Code duplicated, block: B:23:0x005f  */
    public final void i(View view) throws Exception {
        int id2;
        c cVar;
        LinkedHashSet linkedHashSet = this.f13947i;
        if (linkedHashSet.isEmpty()) {
            return;
        }
        getChildCount();
        RNGestureHandlerModule.Companion.getClass();
        k kVar = (k) RNGestureHandlerModule.registries.get(Integer.valueOf(this.f13951y));
        if (kVar == null) {
            throw new Exception("Tried to access a non-existent registry");
        }
        if (view instanceof ReactSwipeRefreshLayout) {
            id2 = ((ReactSwipeRefreshLayout) view).getChildAt(0).getId();
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() != 0) {
                if (viewGroup.getChildCount() != 0) {
                    View childAt = viewGroup.getChildAt(0);
                    if (childAt instanceof c) {
                        cVar = (c) childAt;
                    } else {
                        cVar = null;
                    }
                } else {
                    cVar = null;
                }
                id2 = cVar != null ? cVar.getId() : viewGroup.getId();
            } else {
                id2 = view.getId();
            }
        } else {
            id2 = view.getId();
        }
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            if (kVar.f(iIntValue) != null) {
                kVar.a(iIntValue, id2, 5, this);
                this.f13949w.add(Integer.valueOf(iIntValue));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() throws Exception {
        super.onAttachedToWindow();
        if (this.f13951y != -1) {
            d(this, this.f13945d);
            e(this.f13946e);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        f();
        super.onDetachedFromWindow();
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i7) {
        LinkedHashSet linkedHashSet = this.f13949w;
        RNGestureHandlerModule.Companion.getClass();
        k kVar = (k) RNGestureHandlerModule.registries.get(Integer.valueOf(this.f13951y));
        if (kVar != null) {
            Iterator it = this.f13947i.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Number) it.next()).intValue();
                if (linkedHashSet.contains(Integer.valueOf(iIntValue))) {
                    kVar.c(this, iIntValue);
                    linkedHashSet.remove(Integer.valueOf(iIntValue));
                }
            }
        }
        super.removeViewAt(i7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.collections.n0] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList] */
    public final void setHandlerTags(ReadableArray readableArray) throws Exception {
        ?? arrayList;
        ArrayList<Object> arrayList2;
        if (readableArray == null || (arrayList2 = readableArray.toArrayList()) == null) {
            arrayList = n0.f14659d;
        } else {
            arrayList = new ArrayList(e0.l(arrayList2, 10));
            for (Object obj : arrayList2) {
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Double");
                arrayList.add(Integer.valueOf((int) ((Double) obj).doubleValue()));
            }
        }
        this.f13945d = arrayList;
        if (this.f13951y != -1) {
            d(this, arrayList);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.List] */
    public final void setModuleId(int i7) throws Exception {
        if (this.f13951y == i7) {
            return;
        }
        this.f13951y = i7;
        d(this, this.f13945d);
        e(this.f13946e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v3, types: [kotlin.collections.n0] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.util.ArrayList] */
    public final void setVirtualChildren(ReadableArray readableArray) throws Exception {
        ?? arrayList;
        e eVar;
        List listI = null;
        if (readableArray != null) {
            int size = readableArray.size();
            ArrayList arrayList2 = new ArrayList(size);
            for (int i7 = 0; i7 < size; i7++) {
                ReadableMap map = readableArray.getMap(i7);
                if (map == null) {
                    eVar = null;
                } else {
                    ReadableArray array = map.getArray("handlerTags");
                    if (array != null) {
                        int size2 = array.size();
                        arrayList = new ArrayList(size2);
                        for (int i10 = 0; i10 < size2; i10++) {
                            arrayList.add(Integer.valueOf(array.getInt(i10)));
                        }
                    } else {
                        arrayList = 0;
                    }
                    if (arrayList == 0) {
                        arrayList = n0.f14659d;
                    }
                    eVar = new e(map.getInt("viewTag"), arrayList);
                }
                arrayList2.add(eVar);
            }
            listI = CollectionsKt.I(arrayList2);
        }
        if (listI == null) {
            listI = n0.f14659d;
        }
        this.f13946e = listI;
        if (this.f13951y != -1) {
            e(listI);
        }
    }
}

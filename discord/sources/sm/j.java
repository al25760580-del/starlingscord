package sm;

import ag.t;
import android.util.Log;
import android.view.ViewGroup;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UIManagerListener;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.collections.j0;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends ViewGroup implements UIManagerListener, h, i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f20292d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g f20293e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final e4.e f20294i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(ThemedReactContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.f20292d = new ArrayList();
        g gVar = new g(reactContext, new WeakReference(this));
        this.f20293e = gVar;
        this.f20294i = new e4.e(22, (byte) 0);
        addView(gVar);
        UIManager uIManager = UIManagerHelper.getUIManager(reactContext, 2);
        if (uIManager == null) {
            throw new IllegalStateException("[RNScreens] UIManager must not be null.");
        }
        uIManager.addUIManagerEventListener(this);
    }

    public final void a(tm.f stackScreen) {
        if (stackScreen.getActivityMode() == tm.d.f20835e && !stackScreen.f20841i) {
            e4.e eVar = this.f20294i;
            eVar.getClass();
            Intrinsics.checkNotNullParameter(stackScreen, "stackScreen");
            ((ArrayList) eVar.f7972i).add(new d(stackScreen));
            return;
        }
        Log.d("StackHost", "Ignoring pop operation of " + stackScreen.getScreenKey() + ", already not attached or natively dismissed");
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public final void didDispatchMountItems(UIManager uiManager) {
        Intrinsics.checkNotNullParameter(uiManager, "uiManager");
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public final void didMountItems(UIManager uiManager) {
        Intrinsics.checkNotNullParameter(uiManager, "uiManager");
        e4.e eVar = this.f20294i;
        ArrayList<d> arrayList = (ArrayList) eVar.f7972i;
        g container = this.f20293e;
        Intrinsics.checkNotNullParameter(container, "container");
        ArrayList renderedScreens = this.f20292d;
        Intrinsics.checkNotNullParameter(renderedScreens, "renderedScreens");
        ArrayList<e> arrayList2 = (ArrayList) eVar.f7971e;
        if (arrayList2.isEmpty() && arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList3 = new ArrayList(e0.l(arrayList, 10));
        for (d dVar : arrayList) {
            arrayList3.add(new Pair(Integer.valueOf(renderedScreens.indexOf(dVar.f20285h)), dVar));
        }
        Iterator it = j0.x(CollectionsKt.e0(arrayList3, new t(10))).iterator();
        while (true) {
            ListIterator listIterator = ((z0) it).f14674d;
            if (!listIterator.hasPrevious()) {
                break;
            }
            tm.f stackScreen = ((d) ((Pair) listIterator.previous()).f14613e).f20285h;
            container.getClass();
            Intrinsics.checkNotNullParameter(stackScreen, "stackScreen");
            container.a0.add(new d(stackScreen));
        }
        ArrayList arrayList4 = new ArrayList(e0.l(arrayList2, 10));
        for (e eVar2 : arrayList2) {
            arrayList4.add(new Pair(Integer.valueOf(renderedScreens.indexOf(eVar2.f20286h)), eVar2));
        }
        Iterator it2 = CollectionsKt.e0(arrayList4, new t(11)).iterator();
        while (it2.hasNext()) {
            tm.f stackScreen2 = ((e) ((Pair) it2.next()).f14613e).f20286h;
            container.getClass();
            Intrinsics.checkNotNullParameter(stackScreen2, "stackScreen");
            container.f20289b0.add(new e(stackScreen2));
        }
        container.u();
        arrayList.clear();
        arrayList2.clear();
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public final void didScheduleMountItems(UIManager uiManager) {
        Intrinsics.checkNotNullParameter(uiManager, "uiManager");
    }

    @NotNull
    public final ArrayList<tm.f> getRenderedScreens$react_native_screens_release() {
        return this.f20292d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        String message = "StackHost [" + getId() + "] attached to window";
        Intrinsics.checkNotNullParameter("StackHost", "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i7, int i10, int i11, int i12) {
        this.f20293e.layout(i7, i10, i11, i12);
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        this.f20293e.measure(i7, i10);
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public final void willDispatchViewUpdates(UIManager uiManager) {
        Intrinsics.checkNotNullParameter(uiManager, "uiManager");
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public final void willMountItems(UIManager uiManager) {
        Intrinsics.checkNotNullParameter(uiManager, "uiManager");
    }
}

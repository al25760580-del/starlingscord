package com.facebook.react.views.scroll;

import android.graphics.Rect;
import android.view.ViewGroup;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlags;
import com.facebook.react.views.virtual.VirtualViewMode;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.f1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import o8.a;
import org.jetbrains.annotations.NotNull;
import rn.n;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0012\u0010\u001d\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0014J\u0010\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0010\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u0010 \u001a\u00020\u001aH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\tX\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0010\"\u0004\b\u0018\u0010\u0012¨\u0006!"}, d2 = {"Lcom/facebook/react/views/scroll/VirtualViewContainerStateExperimental;", "Lcom/facebook/react/views/scroll/VirtualViewContainerState;", "scrollView", "Landroid/view/ViewGroup;", "<init>", "(Landroid/view/ViewGroup;)V", "horizontal", "", "virtualViews", "Lcom/facebook/react/views/scroll/IntervalTree;", "getVirtualViews", "()Lcom/facebook/react/views/scroll/IntervalTree;", "PV", "", "", "getPV", "()Ljava/util/Set;", "setPV", "(Ljava/util/Set;)V", "P", "getP", "setP", "V", "getV", "setV", "onChange", "", "virtualView", "Lcom/facebook/react/views/scroll/VirtualView;", "updateModes", "remove", "updateMode", "updateModesAll", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nVirtualViewContainerStateExperimental.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VirtualViewContainerStateExperimental.kt\ncom/facebook/react/views/scroll/VirtualViewContainerStateExperimental\n+ 2 VirtualViewContainerStateExperimental.kt\ncom/facebook/react/views/scroll/VirtualViewContainerStateExperimentalKt\n*L\n1#1,513:1\n509#2,4:514\n509#2,4:518\n509#2,4:522\n509#2,4:526\n509#2,4:530\n*S KotlinDebug\n*F\n+ 1 VirtualViewContainerStateExperimental.kt\ncom/facebook/react/views/scroll/VirtualViewContainerStateExperimental\n*L\n36#1:514,4\n38#1:518,4\n113#1:522,4\n119#1:526,4\n129#1:530,4\n*E\n"})
public final class VirtualViewContainerStateExperimental extends VirtualViewContainerState {

    @NotNull
    private Set<String> P;

    @NotNull
    private Set<String> PV;

    @NotNull
    private Set<String> V;
    private final boolean horizontal;

    @NotNull
    private final IntervalTree virtualViews;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VirtualViewMode.values().length];
            try {
                iArr[VirtualViewMode.Visible.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VirtualViewMode.Prerender.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VirtualViewMode.Hidden.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VirtualViewContainerStateExperimental(@NotNull ViewGroup scrollView) {
        super(scrollView);
        Intrinsics.checkNotNullParameter(scrollView, "scrollView");
        boolean z5 = false;
        if (!(scrollView instanceof ReactScrollView) && (scrollView instanceof ReactHorizontalScrollView)) {
            z5 = true;
        }
        this.horizontal = z5;
        this.virtualViews = new IntervalTree(z5);
        this.PV = new LinkedHashSet();
        this.P = new LinkedHashSet();
        this.V = new LinkedHashSet();
    }

    private final void updateMode(VirtualView virtualView) {
        Rect containerRelativeRect = virtualView.getContainerRelativeRect();
        VirtualViewMode virtualViewMode = VirtualViewMode.Hidden;
        Rect emptyRect = getEmptyRect();
        if (VirtualViewContainerKt.rectsOverlap(containerRelativeRect, getVisibleRect())) {
            emptyRect = getVisibleRect();
            virtualViewMode = VirtualViewMode.Visible;
        } else if (VirtualViewContainerKt.rectsOverlap(containerRelativeRect, getPrerenderRect())) {
            virtualViewMode = VirtualViewMode.Prerender;
            emptyRect = getPrerenderRect();
        }
        virtualView.onModeChange(virtualViewMode, emptyRect);
        int i7 = WhenMappings.$EnumSwitchMapping$0[virtualViewMode.ordinal()];
        if (i7 == 1) {
            this.PV.add(virtualView.getVirtualViewID());
            this.P.remove(virtualView.getVirtualViewID());
            this.V.add(virtualView.getVirtualViewID());
        } else if (i7 == 2) {
            this.PV.add(virtualView.getVirtualViewID());
            this.P.add(virtualView.getVirtualViewID());
            this.V.remove(virtualView.getVirtualViewID());
        } else {
            if (i7 != 3) {
                throw new n();
            }
            this.PV.remove(virtualView.getVirtualViewID());
            this.P.remove(virtualView.getVirtualViewID());
            this.V.remove(virtualView.getVirtualViewID());
        }
    }

    private final void updateModesAll() {
        Set<String> setQuery = getVirtualViews().query(getVisibleRect());
        Set<String> setQuery2 = getVirtualViews().query(getPrerenderRect());
        if (VirtualViewContainerKt.getIS_DEBUG_BUILD() && ReactNativeFeatureFlags.enableVirtualViewDebugFeatures()) {
            a.b("VirtualViewContainerStateExperimental:updateModes", "V: " + this.V + ", P: " + this.P + ", PV: " + this.PV);
        }
        Set setC = f1.c(setQuery2, setQuery);
        if (VirtualViewContainerKt.getIS_DEBUG_BUILD() && ReactNativeFeatureFlags.enableVirtualViewDebugFeatures()) {
            a.b("VirtualViewContainerStateExperimental:updateModes", "V': " + setQuery + ", P': " + setC + ", PV': " + setQuery2);
        }
        Set setC2 = f1.c(setQuery, this.V);
        Set setC3 = f1.c(setC, this.P);
        Set<String> set = setQuery2;
        Set setC4 = f1.c(this.PV, set);
        if (VirtualViewContainerKt.getIS_DEBUG_BUILD() && ReactNativeFeatureFlags.enableVirtualViewDebugFeatures()) {
            a.b("VirtualViewContainerStateExperimental:updateModes", "toV: " + setC2 + ", toP: " + setC3 + ", toH: " + setC4);
        }
        Iterator it = setC2.iterator();
        while (it.hasNext()) {
            VirtualView virtualView = getVirtualViews().getVirtualView((String) it.next());
            if (virtualView != null) {
                virtualView.onModeChange(VirtualViewMode.Visible, getVisibleRect());
            }
        }
        Iterator it2 = setC3.iterator();
        while (it2.hasNext()) {
            VirtualView virtualView2 = getVirtualViews().getVirtualView((String) it2.next());
            if (virtualView2 != null) {
                virtualView2.onModeChange(VirtualViewMode.Prerender, getPrerenderRect());
            }
        }
        Iterator it3 = setC4.iterator();
        while (it3.hasNext()) {
            VirtualView virtualView3 = getVirtualViews().getVirtualView((String) it3.next());
            if (virtualView3 != null) {
                virtualView3.onModeChange(VirtualViewMode.Hidden, getEmptyRect());
            }
        }
        this.V = setQuery;
        this.P = CollectionsKt.k0(setC);
        this.PV = CollectionsKt.k0(set);
    }

    @NotNull
    public final Set<String> getP() {
        return this.P;
    }

    @NotNull
    public final Set<String> getPV() {
        return this.PV;
    }

    @NotNull
    public final Set<String> getV() {
        return this.V;
    }

    @Override // com.facebook.react.views.scroll.VirtualViewContainerState
    public void onChange(@NotNull VirtualView virtualView) {
        Intrinsics.checkNotNullParameter(virtualView, "virtualView");
        if (getVirtualViews().add(virtualView)) {
            if (VirtualViewContainerKt.getIS_DEBUG_BUILD() && ReactNativeFeatureFlags.enableVirtualViewDebugFeatures()) {
                a.b("VirtualViewContainerStateExperimental:add", "virtualViewID=" + virtualView.getVirtualViewID());
            }
        } else if (VirtualViewContainerKt.getIS_DEBUG_BUILD() && ReactNativeFeatureFlags.enableVirtualViewDebugFeatures()) {
            a.b("VirtualViewContainerStateExperimental:update", "virtualViewID=" + virtualView.getVirtualViewID());
        }
        updateModes(virtualView);
    }

    @Override // com.facebook.react.views.scroll.VirtualViewContainerState
    public void remove(@NotNull VirtualView virtualView) {
        Intrinsics.checkNotNullParameter(virtualView, "virtualView");
        super.remove(virtualView);
        this.PV.remove(virtualView.getVirtualViewID());
        this.P.remove(virtualView.getVirtualViewID());
        this.V.remove(virtualView.getVirtualViewID());
    }

    public final void setP(@NotNull Set<String> set) {
        Intrinsics.checkNotNullParameter(set, "<set-?>");
        this.P = set;
    }

    public final void setPV(@NotNull Set<String> set) {
        Intrinsics.checkNotNullParameter(set, "<set-?>");
        this.PV = set;
    }

    public final void setV(@NotNull Set<String> set) {
        Intrinsics.checkNotNullParameter(set, "<set-?>");
        this.V = set;
    }

    @Override // com.facebook.react.views.scroll.VirtualViewContainerState
    public void updateModes(VirtualView virtualView) {
        updateRects();
        if (virtualView != null) {
            updateMode(virtualView);
        } else {
            updateModesAll();
        }
    }

    @Override // com.facebook.react.views.scroll.VirtualViewContainerState
    @NotNull
    public IntervalTree getVirtualViews() {
        return this.virtualViews;
    }
}

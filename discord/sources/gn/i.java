package gn;

import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.StateWrapper;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.views.view.ReactViewGroup;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends ReactViewGroup implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public n f10143d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a f10144e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public k f10145i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public View f10146v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public StateWrapper f10147w;

    public final void c() {
        a aVar = this.f10144e;
        if (aVar != null) {
            k kVar = this.f10145i;
            if (kVar == null) {
                j jVar = j.f10149e;
                kVar = new k(jVar, jVar, jVar, jVar);
            }
            StateWrapper stateWrapper = getStateWrapper();
            if (stateWrapper != null) {
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putMap("insets", xr.m.o(aVar));
                stateWrapper.updateState(writableMapCreateMap);
            } else {
                l lVar = new l(aVar, this.f10143d, kVar);
                Intrinsics.checkNotNullParameter(this, "view");
                UIManagerModule uIManagerModule = (UIManagerModule) UIManagerHelper.getReactContext(this).getNativeModule(UIManagerModule.class);
                if (uIManagerModule != null) {
                    uIManagerModule.setViewLocalData(getId(), lVar);
                }
            }
        }
    }

    public final StateWrapper getStateWrapper() {
        return this.f10147w;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        View view;
        a aVarC;
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        while (true) {
            if (parent == 0) {
                view = this;
                break;
            } else {
                if (parent instanceof e) {
                    view = (View) parent;
                    break;
                }
                parent = parent.getParent();
            }
        }
        this.f10146v = view;
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnPreDrawListener(this);
        }
        View view2 = this.f10146v;
        if (view2 == null || (aVarC = z0.d.c(view2)) == null || Intrinsics.areEqual(this.f10144e, aVarC)) {
            return;
        }
        this.f10144e = aVarC;
        c();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ViewTreeObserver viewTreeObserver;
        super.onDetachedFromWindow();
        View view = this.f10146v;
        if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnPreDrawListener(this);
        }
        this.f10146v = null;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        a aVarC;
        View view = this.f10146v;
        boolean z5 = false;
        if (view != null && (aVarC = z0.d.c(view)) != null && !Intrinsics.areEqual(this.f10144e, aVarC)) {
            this.f10144e = aVarC;
            c();
            z5 = true;
        }
        if (z5) {
            requestLayout();
        }
        return !z5;
    }

    public final void setEdges(@NotNull k edges) {
        Intrinsics.checkNotNullParameter(edges, "edges");
        this.f10145i = edges;
        c();
    }

    public final void setMode(@NotNull n mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f10143d = mode;
        c();
    }

    public final void setStateWrapper(StateWrapper stateWrapper) {
        this.f10147w = stateWrapper;
    }
}
